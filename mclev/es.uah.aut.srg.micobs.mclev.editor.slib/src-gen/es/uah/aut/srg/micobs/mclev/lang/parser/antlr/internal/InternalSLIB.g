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
import es.uah.aut.srg.micobs.mclev.lang.services.SLIBGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private SLIBGrammarAccess grammarAccess;
 	
    public InternalSLIBParser(TokenStream input, SLIBGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MMCLEVSLIBPackageFile";	
   	}
   	
   	@Override
   	protected SLIBGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMMCLEVSLIBPackageFile
entryRuleMMCLEVSLIBPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVSLIBPackageFileRule()); }
	 iv_ruleMMCLEVSLIBPackageFile=ruleMMCLEVSLIBPackageFile 
	 { $current=$iv_ruleMMCLEVSLIBPackageFile.current; } 
	 EOF 
;

// Rule MMCLEVSLIBPackageFile
ruleMMCLEVSLIBPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVSLIBPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMCLEVSLIBPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVSLIBPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMCLEVSLIBPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVSLIBPackageFileAccess().getElementMMCLEVSLIBPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMMCLEVSLIBPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCLEVSLIBPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MMCLEVSLIBPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMMCLEVSLIBPackageElement
entryRuleMMCLEVSLIBPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVSLIBPackageElementRule()); }
	 iv_ruleMMCLEVSLIBPackageElement=ruleMMCLEVSLIBPackageElement 
	 { $current=$iv_ruleMMCLEVSLIBPackageElement.current; } 
	 EOF 
;

// Rule MMCLEVSLIBPackageElement
ruleMMCLEVSLIBPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMCLEVSLIBPackageElementAccess().getMDriverServiceLibraryParserRuleCall_0()); 
    }
    this_MDriverServiceLibrary_0=ruleMDriverServiceLibrary
    { 
        $current = $this_MDriverServiceLibrary_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMCLEVSLIBPackageElementAccess().getMServiceLibraryParserRuleCall_1()); 
    }
    this_MServiceLibrary_1=ruleMServiceLibrary
    { 
        $current = $this_MServiceLibrary_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMCLEVSLIBPackageElementAccess().getMAbstractServiceLibraryParserRuleCall_2()); 
    }
    this_MAbstractServiceLibrary_2=ruleMAbstractServiceLibrary
    { 
        $current = $this_MAbstractServiceLibrary_2.current; 
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





// Entry rule entryRuleMAbstractServiceLibrary
entryRuleMAbstractServiceLibrary returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMAbstractServiceLibraryRule()); }
	 iv_ruleMAbstractServiceLibrary=ruleMAbstractServiceLibrary 
	 { $current=$iv_ruleMAbstractServiceLibrary.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MAbstractServiceLibrary
ruleMAbstractServiceLibrary returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='abstract' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMAbstractServiceLibraryAccess().getAbstractKeyword_0());
    }
	otherlv_1='service' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMAbstractServiceLibraryAccess().getServiceKeyword_1());
    }
	otherlv_2='library' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMAbstractServiceLibraryAccess().getLibraryKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMAbstractServiceLibraryAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractServiceLibraryRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMAbstractServiceLibraryAccess().getInheritsKeyword_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMAbstractServiceLibraryAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_5());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 0);
	 				}
					({true}?=>(	otherlv_10='version' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMAbstractServiceLibraryAccess().getVersionKeyword_6_0_0());
    }
	otherlv_11=':=' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMAbstractServiceLibraryAccess().getColonEqualsSignKeyword_6_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0()); 
	    }
		lv_version_12_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractServiceLibraryRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_12_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 1);
	 				}
					({true}?=>(	otherlv_14='attributes' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMAbstractServiceLibraryAccess().getAttributesKeyword_6_1_0());
    }
	otherlv_15='{' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_6_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesMParameterWithoutSLSPParserRuleCall_6_1_2_0()); 
	    }
		lv_attributes_16_0=ruleMParameterWithoutSLSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractServiceLibraryRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_16_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterWithoutSLSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_6_1_3());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 2);
	 				}
					({true}?=>(	otherlv_19='provided' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMAbstractServiceLibraryAccess().getProvidedKeyword_6_2_0());
    }
	otherlv_20='sais' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMAbstractServiceLibraryAccess().getSaisKeyword_6_2_1());
    }
	otherlv_21='{' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_6_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_6_2_3_0()); 
	    }
		lv_provides_22_0=ruleMServiceLibraryProvidedSAI		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractServiceLibraryRule());
	        }
       		add(
       			$current, 
       			"provides",
        		lv_provides_22_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MServiceLibraryProvidedSAI");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_23='}' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_6_2_4());
    }
	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6());
	}

)	otherlv_25='}' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_26=';' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_8());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMServiceLibraryProvidedSAI
entryRuleMServiceLibraryProvidedSAI returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMServiceLibraryProvidedSAIRule()); }
	 iv_ruleMServiceLibraryProvidedSAI=ruleMServiceLibraryProvidedSAI 
	 { $current=$iv_ruleMServiceLibraryProvidedSAI.current; } 
	 EOF 
;

// Rule MServiceLibraryProvidedSAI
ruleMServiceLibraryProvidedSAI returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='provides' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMServiceLibraryProvidedSAIAccess().getProvidesKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryProvidedSAIRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiMSAICrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMServiceLibraryProvidedSAIAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryProvidedSAIAccess().getAttributeValueAssignmentsMSLibProvidedSAIAVAParserRuleCall_3_0()); 
	    }
		lv_attributeValueAssignments_3_0=ruleMSLibProvidedSAIAVA		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMServiceLibraryProvidedSAIRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MSLibProvidedSAIAVA");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMServiceLibraryProvidedSAIAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMServiceLibraryProvidedSAIAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMSLibProvidedSAIAVA
entryRuleMSLibProvidedSAIAVA returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSLibProvidedSAIAVARule()); }
	 iv_ruleMSLibProvidedSAIAVA=ruleMSLibProvidedSAIAVA 
	 { $current=$iv_ruleMSLibProvidedSAIAVA.current; } 
	 EOF 
;

// Rule MSLibProvidedSAIAVA
ruleMSLibProvidedSAIAVA returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMSLibProvidedSAIAVAAccess().getMSLibProvidedSAIAVAExpressionParserRuleCall_0()); 
    }
    this_MSLibProvidedSAIAVAExpression_0=ruleMSLibProvidedSAIAVAExpression
    { 
        $current = $this_MSLibProvidedSAIAVAExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMSLibProvidedSAIAVAAccess().getMSLibProvidedSAIAVASwitchParserRuleCall_1()); 
    }
    this_MSLibProvidedSAIAVASwitch_1=ruleMSLibProvidedSAIAVASwitch
    { 
        $current = $this_MSLibProvidedSAIAVASwitch_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMSLibProvidedSAIAVAExpression
entryRuleMSLibProvidedSAIAVAExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSLibProvidedSAIAVAExpressionRule()); }
	 iv_ruleMSLibProvidedSAIAVAExpression=ruleMSLibProvidedSAIAVAExpression 
	 { $current=$iv_ruleMSLibProvidedSAIAVAExpression.current; } 
	 EOF 
;

// Rule MSLibProvidedSAIAVAExpression
ruleMSLibProvidedSAIAVAExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='attribute' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSLibProvidedSAIAVAExpressionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterMParameterCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getColonEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_attributeValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSLibProvidedSAIAVAExpressionRule());
	        }
       		set(
       			$current, 
       			"attributeValue",
        		lv_attributeValue_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMSLibProvidedSAIAVASwitch
entryRuleMSLibProvidedSAIAVASwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSLibProvidedSAIAVASwitchRule()); }
	 iv_ruleMSLibProvidedSAIAVASwitch=ruleMSLibProvidedSAIAVASwitch 
	 { $current=$iv_ruleMSLibProvidedSAIAVASwitch.current; } 
	 EOF 
;

// Rule MSLibProvidedSAIAVASwitch
ruleMSLibProvidedSAIAVASwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='attribute' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getAttributeKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSLibProvidedSAIAVASwitchRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterMParameterCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getColonEqualsSignKeyword_2());
    }
	otherlv_3='switch' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getSwitchKeyword_3());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesMSLibProvidedSAIAVASwitchCaseParserRuleCall_5_0()); 
	    }
		lv_cases_5_0=ruleMSLibProvidedSAIAVASwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSLibProvidedSAIAVASwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_5_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MSLibProvidedSAIAVASwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMSLibProvidedSAIAVASwitchCase
entryRuleMSLibProvidedSAIAVASwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSLibProvidedSAIAVASwitchCaseRule()); }
	 iv_ruleMSLibProvidedSAIAVASwitchCase=ruleMSLibProvidedSAIAVASwitchCase 
	 { $current=$iv_ruleMSLibProvidedSAIAVASwitchCase.current; } 
	 EOF 
;

// Rule MSLibProvidedSAIAVASwitchCase
ruleMSLibProvidedSAIAVASwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSLibProvidedSAIAVASwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getAttributeValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_attributeValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSLibProvidedSAIAVASwitchCaseRule());
	        }
       		set(
       			$current, 
       			"attributeValue",
        		lv_attributeValue_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMServiceLibrary
entryRuleMServiceLibrary returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMServiceLibraryRule()); }
	 iv_ruleMServiceLibrary=ruleMServiceLibrary 
	 { $current=$iv_ruleMServiceLibrary.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MServiceLibrary
ruleMServiceLibrary returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='service' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMServiceLibraryAccess().getServiceKeyword_0());
    }
	otherlv_1='library' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMServiceLibraryAccess().getLibraryKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMServiceLibraryAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMServiceLibraryAccess().getInheritsKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMServiceLibraryAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_7='extends' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMServiceLibraryAccess().getExtendsKeyword_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_9=',' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMServiceLibraryAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_5());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 0);
	 				}
					({true}?=>(	otherlv_13='version' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMServiceLibraryAccess().getVersionKeyword_6_0_0());
    }
	otherlv_14=':=' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0()); 
	    }
		lv_version_15_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMServiceLibraryRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_15_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_16=';' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 1);
	 				}
					({true}?=>(	otherlv_17='languages' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMServiceLibraryAccess().getLanguagesKeyword_6_1_0());
    }
	otherlv_18=':=' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_20=',' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMServiceLibraryAccess().getCommaKeyword_6_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_22=';' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 2);
	 				}
					({true}?=>(	otherlv_23='attributes' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMServiceLibraryAccess().getAttributesKeyword_6_2_0());
    }
	otherlv_24='{' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getAttributesMParameterParserRuleCall_6_2_2_0()); 
	    }
		lv_attributes_25_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMServiceLibraryRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_25_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_26='}' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_2_3());
    }
	otherlv_27=';' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 3);
	 				}
					({true}?=>(	otherlv_28='provided' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMServiceLibraryAccess().getProvidedKeyword_6_3_0());
    }
	otherlv_29='sais' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMServiceLibraryAccess().getSaisKeyword_6_3_1());
    }
	otherlv_30='{' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_6_3_3_0()); 
	    }
		lv_provides_31_0=ruleMServiceLibraryProvidedSAI		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMServiceLibraryRule());
	        }
       		add(
       			$current, 
       			"provides",
        		lv_provides_31_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MServiceLibraryProvidedSAI");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_32='}' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_3_4());
    }
	otherlv_33=';' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 4);
	 				}
					({true}?=>(	otherlv_34='requires' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMServiceLibraryAccess().getRequiresKeyword_6_4_0());
    }
	otherlv_35=':=' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_4_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_37=',' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMServiceLibraryAccess().getCommaKeyword_6_4_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_39=';' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_4_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 5);
	 				}
					({true}?=>(	otherlv_40='supported' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMServiceLibraryAccess().getSupportedKeyword_6_5_0());
    }
	otherlv_41='platforms' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMServiceLibraryAccess().getPlatformsKeyword_6_5_1());
    }
	otherlv_42='{' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_5_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsMServiceLibrarySupportedPlatformParserRuleCall_6_5_3_0()); 
	    }
		lv_supportedPlatforms_43_0=ruleMServiceLibrarySupportedPlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMServiceLibraryRule());
	        }
       		add(
       			$current, 
       			"supportedPlatforms",
        		lv_supportedPlatforms_43_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MServiceLibrarySupportedPlatform");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_44='}' 
    {
    	newLeafNode(otherlv_44, grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_5_4());
    }
	otherlv_45=';' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_5_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	}

)	otherlv_46='}' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_47=';' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_8());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDriverServiceLibrary
entryRuleMDriverServiceLibrary returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMDriverServiceLibraryRule()); }
	 iv_ruleMDriverServiceLibrary=ruleMDriverServiceLibrary 
	 { $current=$iv_ruleMDriverServiceLibrary.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MDriverServiceLibrary
ruleMDriverServiceLibrary returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='driver' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMDriverServiceLibraryAccess().getDriverKeyword_0());
    }
	otherlv_1='service' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMDriverServiceLibraryAccess().getServiceKeyword_1());
    }
	otherlv_2='library' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMDriverServiceLibraryAccess().getLibraryKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMDriverServiceLibraryAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverServiceLibraryRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMDriverServiceLibraryAccess().getInheritsKeyword_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_8='extends' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMDriverServiceLibraryAccess().getExtendsKeyword_5_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_5_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_12='{' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_6());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 0);
	 				}
					({true}?=>(	otherlv_14='version' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMDriverServiceLibraryAccess().getVersionKeyword_7_0_0());
    }
	otherlv_15=':=' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getVersionVersionParserRuleCall_7_0_2_0()); 
	    }
		lv_version_16_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverServiceLibraryRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_16_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 1);
	 				}
					({true}?=>(	otherlv_18='languages' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMDriverServiceLibraryAccess().getLanguagesKeyword_7_1_0());
    }
	otherlv_19=':=' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_21=',' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_7_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 2);
	 				}
					({true}?=>(	otherlv_24='attributes' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMDriverServiceLibraryAccess().getAttributesKeyword_7_2_0());
    }
	otherlv_25='{' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getAttributesMParameterParserRuleCall_7_2_2_0()); 
	    }
		lv_attributes_26_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverServiceLibraryRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_26_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_27='}' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_2_3());
    }
	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 3);
	 				}
					({true}?=>(	otherlv_29='provided' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMDriverServiceLibraryAccess().getProvidedKeyword_7_3_0());
    }
	otherlv_30='sais' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMDriverServiceLibraryAccess().getSaisKeyword_7_3_1());
    }
	otherlv_31='{' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_7_3_3_0()); 
	    }
		lv_provides_32_0=ruleMServiceLibraryProvidedSAI		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverServiceLibraryRule());
	        }
       		add(
       			$current, 
       			"provides",
        		lv_provides_32_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MServiceLibraryProvidedSAI");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_33='}' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_3_4());
    }
	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 4);
	 				}
					({true}?=>(	otherlv_35='requires' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMDriverServiceLibraryAccess().getRequiresKeyword_7_4_0());
    }
	otherlv_36=':=' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_4_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_38=',' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_7_4_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverServiceLibraryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_40=';' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_4_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 5);
	 				}
					({true}?=>(	otherlv_41='supported' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMDriverServiceLibraryAccess().getSupportedKeyword_7_5_0());
    }
	otherlv_42='platforms' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMDriverServiceLibraryAccess().getPlatformsKeyword_7_5_1());
    }
	otherlv_43='{' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_5_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsMDriverSLibSupportedPlatformParserRuleCall_7_5_3_0()); 
	    }
		lv_supportedPlatforms_44_0=ruleMDriverSLibSupportedPlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverServiceLibraryRule());
	        }
       		add(
       			$current, 
       			"supportedPlatforms",
        		lv_supportedPlatforms_44_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MDriverSLibSupportedPlatform");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_45='}' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_5_4());
    }
	otherlv_46=';' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_5_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	}

)	otherlv_47='}' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_8());
    }
	otherlv_48=';' 
    {
    	newLeafNode(otherlv_48, grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_9());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMServiceLibrarySupportedPlatform
entryRuleMServiceLibrarySupportedPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformRule()); }
	 iv_ruleMServiceLibrarySupportedPlatform=ruleMServiceLibrarySupportedPlatform 
	 { $current=$iv_ruleMServiceLibrarySupportedPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MServiceLibrarySupportedPlatform
ruleMServiceLibrarySupportedPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMServiceLibrarySupportedPlatformAction_0(),
            $current);
    }
)	otherlv_1='supported' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSupportedKeyword_1());
    }
	otherlv_2='platform' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getPlatformKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='osapi' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiKeyword_5_0_0());
    }
	otherlv_7=':=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1());
    }
(	otherlv_8='any' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_0_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_11='os' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsKeyword_5_1_0());
    }
	otherlv_12=':=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1());
    }
(	otherlv_13='any' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_1_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_16='architecture' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureKeyword_5_2_0());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1());
    }
(	otherlv_18='any' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_2_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_20=';' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_2_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_21='compiler' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerKeyword_5_3_0());
    }
	otherlv_22=':=' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_3_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_25='microprocessor' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorKeyword_5_4_0());
    }
	otherlv_26=':=' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1());
    }
(	otherlv_27='any' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_4_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_4_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_30='board' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardKeyword_5_5_0());
    }
	otherlv_31=':=' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1());
    }
(	otherlv_32='any' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_5_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_5_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_35='attributes' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesKeyword_5_6_0());
    }
	otherlv_36='{' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLeftCurlyBracketKeyword_5_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesMParameterWithoutSLSPParserRuleCall_5_6_2_0()); 
	    }
		lv_attributes_37_0=ruleMParameterWithoutSLSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_37_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterWithoutSLSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_38='}' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRightCurlyBracketKeyword_5_6_3());
    }
	otherlv_39=';' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_6_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
					({true}?=>(	otherlv_40='languages' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesKeyword_5_7_0());
    }
	otherlv_41=':=' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_7_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_43=',' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCommaKeyword_5_7_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_45=';' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_7_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
					({true}?=>(	otherlv_46='requires' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresKeyword_5_8_0());
    }
	otherlv_47=':=' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_8_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_49=',' 
    {
    	newLeafNode(otherlv_49, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCommaKeyword_5_8_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServiceLibrarySupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_51=';' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_8_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	}

)	otherlv_52='}' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_53=';' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDriverSLibSupportedPlatform
entryRuleMDriverSLibSupportedPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformRule()); }
	 iv_ruleMDriverSLibSupportedPlatform=ruleMDriverSLibSupportedPlatform 
	 { $current=$iv_ruleMDriverSLibSupportedPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MDriverSLibSupportedPlatform
ruleMDriverSLibSupportedPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMDriverSLibSupportedPlatformAccess().getMDriverSLibSupportedPlatformAction_0(),
            $current);
    }
)	otherlv_1='supported' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedKeyword_1());
    }
	otherlv_2='platform' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMDriverSLibSupportedPlatformAccess().getPlatformKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMDriverSLibSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='osapi' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiKeyword_5_0_0());
    }
	otherlv_7=':=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1());
    }
(	otherlv_8='any' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_0_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_11='os' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsKeyword_5_1_0());
    }
	otherlv_12=':=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1());
    }
(	otherlv_13='any' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_1_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_16='architecture' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureKeyword_5_2_0());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1());
    }
(	otherlv_18='any' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_2_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_20=';' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_2_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_21='compiler' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerKeyword_5_3_0());
    }
	otherlv_22=':=' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_3_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_25='microprocessor' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0());
    }
	otherlv_26=':=' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1());
    }
(	otherlv_27='any' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_4_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_4_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_30='board' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardKeyword_5_5_0());
    }
	otherlv_31=':=' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1());
    }
(	otherlv_32='any' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_5_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_5_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_35='attributes' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesKeyword_5_6_0());
    }
	otherlv_36='{' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesMParameterWithoutSLSPParserRuleCall_5_6_2_0()); 
	    }
		lv_attributes_37_0=ruleMParameterWithoutSLSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_37_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterWithoutSLSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_38='}' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_5_6_3());
    }
	otherlv_39=';' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_6_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
					({true}?=>(	otherlv_40='supported' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedKeyword_5_7_0());
    }
	otherlv_41='devices' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMDriverSLibSupportedPlatformAccess().getDevicesKeyword_5_7_1());
    }
	otherlv_42='{' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesMDriverSLibSupportedDeviceParserRuleCall_5_7_3_0()); 
	    }
		lv_supportedDevices_43_0=ruleMDriverSLibSupportedDevice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"supportedDevices",
        		lv_supportedDevices_43_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MDriverSLibSupportedDevice");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_44='}' 
    {
    	newLeafNode(otherlv_44, grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4());
    }
	otherlv_45=';' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_7_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
					({true}?=>(	otherlv_46='languages' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesKeyword_5_8_0());
    }
	otherlv_47=':=' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_8_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_49=',' 
    {
    	newLeafNode(otherlv_49, grammarAccess.getMDriverSLibSupportedPlatformAccess().getCommaKeyword_5_8_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_51=';' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_8_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 9);
	 				}
					({true}?=>(	otherlv_52='requires' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresKeyword_5_9_0());
    }
	otherlv_53=':=' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_9_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_55=',' 
    {
    	newLeafNode(otherlv_55, grammarAccess.getMDriverSLibSupportedPlatformAccess().getCommaKeyword_5_9_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_57=';' 
    {
    	newLeafNode(otherlv_57, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_9_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	}

)	otherlv_58='}' 
    {
    	newLeafNode(otherlv_58, grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_59=';' 
    {
    	newLeafNode(otherlv_59, grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDriverSLibSupportedDevice
entryRuleMDriverSLibSupportedDevice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMDriverSLibSupportedDeviceRule()); }
	 iv_ruleMDriverSLibSupportedDevice=ruleMDriverSLibSupportedDevice 
	 { $current=$iv_ruleMDriverSLibSupportedDevice.current; } 
	 EOF 
;

// Rule MDriverSLibSupportedDevice
ruleMDriverSLibSupportedDevice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='device' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedDeviceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMDriverSLibSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibSupportedDeviceRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMDriverSLibSupportedDeviceAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='required' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredKeyword_4_0());
    }
	otherlv_5=':=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMDriverSLibSupportedDeviceAccess().getColonEqualsSignKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredMParameterValueExpressionParserRuleCall_4_2_0()); 
	    }
		lv_required_6_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSLibSupportedDeviceRule());
	        }
       		set(
       			$current, 
       			"required",
        		lv_required_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMDriverSLibSupportedDeviceAccess().getSemicolonKeyword_4_3());
    }
)?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMDriverSLibSupportedDeviceAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMDriverSLibSupportedDeviceAccess().getSemicolonKeyword_6());
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
        newCompositeNode(grammarAccess.getMParameterAccess().getMBooleanParamSLSPSwitchParserRuleCall_6()); 
    }
    this_MBooleanParamSLSPSwitch_6=ruleMBooleanParamSLSPSwitch
    { 
        $current = $this_MBooleanParamSLSPSwitch_6.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMStringParamSLSPSwitchParserRuleCall_7()); 
    }
    this_MStringParamSLSPSwitch_7=ruleMStringParamSLSPSwitch
    { 
        $current = $this_MStringParamSLSPSwitch_7.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMIntegerParamSLSPSwitchParserRuleCall_8()); 
    }
    this_MIntegerParamSLSPSwitch_8=ruleMIntegerParamSLSPSwitch
    { 
        $current = $this_MIntegerParamSLSPSwitch_8.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMRealParamSLSPSwitchParserRuleCall_9()); 
    }
    this_MRealParamSLSPSwitch_9=ruleMRealParamSLSPSwitch
    { 
        $current = $this_MRealParamSLSPSwitch_9.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMEnumParamSLSPSwitchParserRuleCall_10()); 
    }
    this_MEnumParamSLSPSwitch_10=ruleMEnumParamSLSPSwitch
    { 
        $current = $this_MEnumParamSLSPSwitch_10.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMParameterWithoutSLSP
entryRuleMParameterWithoutSLSP returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterWithoutSLSPRule()); }
	 iv_ruleMParameterWithoutSLSP=ruleMParameterWithoutSLSP 
	 { $current=$iv_ruleMParameterWithoutSLSP.current; } 
	 EOF 
;

// Rule MParameterWithoutSLSP
ruleMParameterWithoutSLSP returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterWithoutSLSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSLSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSLSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSLSPAccess().getMRealParameterSingleExpressionParserRuleCall_3()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSLSPAccess().getMStringParameterSingleExpressionParserRuleCall_4()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSLSPAccess().getMEnumParameterDefinitionParserRuleCall_5()); 
    }
    this_MEnumParameterDefinition_5=ruleMEnumParameterDefinition
    { 
        $current = $this_MEnumParameterDefinition_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMBooleanParamSLSPSwitch
entryRuleMBooleanParamSLSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMBooleanParamSLSPSwitchRule()); }
	 iv_ruleMBooleanParamSLSPSwitch=ruleMBooleanParamSLSPSwitch 
	 { $current=$iv_ruleMBooleanParamSLSPSwitch.current; } 
	 EOF 
;

// Rule MBooleanParamSLSPSwitch
ruleMBooleanParamSLSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParamSLSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='boolean' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMBooleanParamSLSPSwitchAccess().getBooleanKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMBooleanParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParamSLSPSwitchRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMBooleanParamSLSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMBooleanParamSLSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMBooleanParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesMBooleanParamSLSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMBooleanParamSLSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBooleanParamSLSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MBooleanParamSLSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMBooleanParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMBooleanParamSLSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMBooleanParamSLSPSwitchCase
entryRuleMBooleanParamSLSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMBooleanParamSLSPSwitchCaseRule()); }
	 iv_ruleMBooleanParamSLSPSwitchCase=ruleMBooleanParamSLSPSwitchCase 
	 { $current=$iv_ruleMBooleanParamSLSPSwitchCase.current; } 
	 EOF 
;

// Rule MBooleanParamSLSPSwitchCase
ruleMBooleanParamSLSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParamSLSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBooleanParamSLSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMStringParamSLSPSwitch
entryRuleMStringParamSLSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMStringParamSLSPSwitchRule()); }
	 iv_ruleMStringParamSLSPSwitch=ruleMStringParamSLSPSwitch 
	 { $current=$iv_ruleMStringParamSLSPSwitch.current; } 
	 EOF 
;

// Rule MStringParamSLSPSwitch
ruleMStringParamSLSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMStringParamSLSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParamSLSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='string' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMStringParamSLSPSwitchAccess().getStringKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMStringParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParamSLSPSwitchRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMStringParamSLSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMStringParamSLSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMStringParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMStringParamSLSPSwitchAccess().getCasesMStringParamSLSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMStringParamSLSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMStringParamSLSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MStringParamSLSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMStringParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMStringParamSLSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMStringParamSLSPSwitchCase
entryRuleMStringParamSLSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMStringParamSLSPSwitchCaseRule()); }
	 iv_ruleMStringParamSLSPSwitchCase=ruleMStringParamSLSPSwitchCase 
	 { $current=$iv_ruleMStringParamSLSPSwitchCase.current; } 
	 EOF 
;

// Rule MStringParamSLSPSwitchCase
ruleMStringParamSLSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMStringParamSLSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParamSLSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMStringParamSLSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMStringParamSLSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMStringParamSLSPSwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMIntegerParamSLSPSwitch
entryRuleMIntegerParamSLSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMIntegerParamSLSPSwitchRule()); }
	 iv_ruleMIntegerParamSLSPSwitch=ruleMIntegerParamSLSPSwitch 
	 { $current=$iv_ruleMIntegerParamSLSPSwitch.current; } 
	 EOF 
;

// Rule MIntegerParamSLSPSwitch
ruleMIntegerParamSLSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParamSLSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='integer' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMIntegerParamSLSPSwitchAccess().getIntegerKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMIntegerParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParamSLSPSwitchRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMIntegerParamSLSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMIntegerParamSLSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMIntegerParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesMIntegerParamSLSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMIntegerParamSLSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParamSLSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MIntegerParamSLSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMIntegerParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMIntegerParamSLSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMIntegerParamSLSPSwitchCase
entryRuleMIntegerParamSLSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMIntegerParamSLSPSwitchCaseRule()); }
	 iv_ruleMIntegerParamSLSPSwitchCase=ruleMIntegerParamSLSPSwitchCase 
	 { $current=$iv_ruleMIntegerParamSLSPSwitchCase.current; } 
	 EOF 
;

// Rule MIntegerParamSLSPSwitchCase
ruleMIntegerParamSLSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParamSLSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParamSLSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='range' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
	    }
		lv_range_5_0=ruleMParameterRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParamSLSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"range",
        		lv_range_5_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterRange");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMRealParamSLSPSwitch
entryRuleMRealParamSLSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMRealParamSLSPSwitchRule()); }
	 iv_ruleMRealParamSLSPSwitch=ruleMRealParamSLSPSwitch 
	 { $current=$iv_ruleMRealParamSLSPSwitch.current; } 
	 EOF 
;

// Rule MRealParamSLSPSwitch
ruleMRealParamSLSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMRealParamSLSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParamSLSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='real' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMRealParamSLSPSwitchAccess().getRealKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMRealParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParamSLSPSwitchRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMRealParamSLSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMRealParamSLSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMRealParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParamSLSPSwitchAccess().getCasesMRealParamSLSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMRealParamSLSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParamSLSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MRealParamSLSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMRealParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMRealParamSLSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMRealParamSLSPSwitchCase
entryRuleMRealParamSLSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMRealParamSLSPSwitchCaseRule()); }
	 iv_ruleMRealParamSLSPSwitchCase=ruleMRealParamSLSPSwitchCase 
	 { $current=$iv_ruleMRealParamSLSPSwitchCase.current; } 
	 EOF 
;

// Rule MRealParamSLSPSwitchCase
ruleMRealParamSLSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMRealParamSLSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParamSLSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMRealParamSLSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParamSLSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='range' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
	    }
		lv_range_5_0=ruleMParameterRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParamSLSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"range",
        		lv_range_5_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterRange");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMRealParamSLSPSwitchCaseAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMEnumParamSLSPSwitch
entryRuleMEnumParamSLSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamSLSPSwitchRule()); }
	 iv_ruleMEnumParamSLSPSwitch=ruleMEnumParamSLSPSwitch 
	 { $current=$iv_ruleMEnumParamSLSPSwitch.current; } 
	 EOF 
;

// Rule MEnumParamSLSPSwitch
ruleMEnumParamSLSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamSLSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='enum' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamSLSPSwitchRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMEnumParamSLSPSwitchAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamSLSPSwitchRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMEnumParamSLSPSwitchAccess().getColonEqualsSignKeyword_4());
    }
	otherlv_5='switch' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMEnumParamSLSPSwitchAccess().getSwitchKeyword_5());
    }
	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMEnumParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesMEnumParamSLSPSwitchCaseParserRuleCall_7_0()); 
	    }
		lv_cases_7_0=ruleMEnumParamSLSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParamSLSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_7_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MEnumParamSLSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMEnumParamSLSPSwitchAccess().getRightCurlyBracketKeyword_8());
    }
	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMEnumParamSLSPSwitchAccess().getSemicolonKeyword_9());
    }
)
;





// Entry rule entryRuleMEnumParamSLSPSwitchCase
entryRuleMEnumParamSLSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamSLSPSwitchCaseRule()); }
	 iv_ruleMEnumParamSLSPSwitchCase=ruleMEnumParamSLSPSwitchCase 
	 { $current=$iv_ruleMEnumParamSLSPSwitchCase.current; } 
	 EOF 
;

// Rule MEnumParamSLSPSwitchCase
ruleMEnumParamSLSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamSLSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParamSLSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getSemicolonKeyword_4());
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterRange");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MEnumParameterLiteralRule");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MEnumParameterLiteralRule");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterRange");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.EBoolean");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.INTEGER");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.REAL");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpressionOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValue");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueTERMOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.INTEGER");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.REAL");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.SLIB.MParameterValueExpression");
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


