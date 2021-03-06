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
grammar InternalSWP;

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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.mesp.lang.services.SWPGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private SWPGrammarAccess grammarAccess;
 	
    public InternalSWPParser(TokenStream input, SWPGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MMESPSWPPackageFile";	
   	}
   	
   	@Override
   	protected SWPGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMMESPSWPPackageFile
entryRuleMMESPSWPPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPSWPPackageFileRule()); }
	 iv_ruleMMESPSWPPackageFile=ruleMMESPSWPPackageFile 
	 { $current=$iv_ruleMMESPSWPPackageFile.current; } 
	 EOF 
;

// Rule MMESPSWPPackageFile
ruleMMESPSWPPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMESPSWPPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPSWPPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMESPSWPPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMESPSWPPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPSWPPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPSWPPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPSWPPackageFileAccess().getElementMMESPSWPPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMMESPSWPPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPSWPPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MMESPSWPPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMMESPSWPPackageElement
entryRuleMMESPSWPPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPSWPPackageElementRule()); }
	 iv_ruleMMESPSWPPackageElement=ruleMMESPSWPPackageElement 
	 { $current=$iv_ruleMMESPSWPPackageElement.current; } 
	 EOF 
;

// Rule MMESPSWPPackageElement
ruleMMESPSWPPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMESPSWPPackageElementAccess().getMDriverSwPackageParserRuleCall_0()); 
    }
    this_MDriverSwPackage_0=ruleMDriverSwPackage
    { 
        $current = $this_MDriverSwPackage_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMESPSWPPackageElementAccess().getMSwPackageParserRuleCall_1()); 
    }
    this_MSwPackage_1=ruleMSwPackage
    { 
        $current = $this_MSwPackage_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMESPSWPPackageElementAccess().getMAbstractSwPackageParserRuleCall_2()); 
    }
    this_MAbstractSwPackage_2=ruleMAbstractSwPackage
    { 
        $current = $this_MAbstractSwPackage_2.current; 
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





// Entry rule entryRuleMAbstractSwPackage
entryRuleMAbstractSwPackage returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMAbstractSwPackageRule()); }
	 iv_ruleMAbstractSwPackage=ruleMAbstractSwPackage 
	 { $current=$iv_ruleMAbstractSwPackage.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MAbstractSwPackage
ruleMAbstractSwPackage returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='abstract' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMAbstractSwPackageAccess().getAbstractKeyword_0());
    }
	otherlv_1='swpackage' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMAbstractSwPackageAccess().getSwpackageKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMAbstractSwPackageAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractSwPackageRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMAbstractSwPackageAccess().getInheritsKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMAbstractSwPackageAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_9='version' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMAbstractSwPackageAccess().getVersionKeyword_5_0_0());
    }
	otherlv_10=':=' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMAbstractSwPackageAccess().getColonEqualsSignKeyword_5_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
	    }
		lv_version_11_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractSwPackageRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_11_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_12=';' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_13='configuration' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMAbstractSwPackageAccess().getConfigurationKeyword_5_1_0());
    }
	otherlv_14='parameters' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMAbstractSwPackageAccess().getParametersKeyword_5_1_1());
    }
	otherlv_15='{' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_5_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractSwPackageAccess().getParametersMParameterWithoutSWPSPParserRuleCall_5_1_3_0()); 
	    }
		lv_parameters_16_0=ruleMParameterWithoutSWPSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractSwPackageRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_16_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterWithoutSWPSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_5_1_4());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_19='provided' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMAbstractSwPackageAccess().getProvidedKeyword_5_2_0());
    }
	otherlv_20='interfaces' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMAbstractSwPackageAccess().getInterfacesKeyword_5_2_1());
    }
	otherlv_21='{' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_5_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_2_3_0()); 
	    }
		lv_provides_22_0=ruleMSwPackageProvidedInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractSwPackageRule());
	        }
       		add(
       			$current, 
       			"provides",
        		lv_provides_22_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageProvidedInterface");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_23='}' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_5_2_4());
    }
	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5());
	}

)	otherlv_25='}' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_26=';' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMSwPackageProvidedInterface
entryRuleMSwPackageProvidedInterface returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSwPackageProvidedInterfaceRule()); }
	 iv_ruleMSwPackageProvidedInterface=ruleMSwPackageProvidedInterface 
	 { $current=$iv_ruleMSwPackageProvidedInterface.current; } 
	 EOF 
;

// Rule MSwPackageProvidedInterface
ruleMSwPackageProvidedInterface returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='provides' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMSwPackageProvidedInterfaceAccess().getProvidesKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageProvidedInterfaceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceMSwInterfaceCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMSwPackageProvidedInterfaceAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageProvidedInterfaceAccess().getParameterValueAssignmentsMSwPackageProvidedInterfacePVAParserRuleCall_3_0()); 
	    }
		lv_parameterValueAssignments_3_0=ruleMSwPackageProvidedInterfacePVA		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageProvidedInterfaceRule());
	        }
       		add(
       			$current, 
       			"parameterValueAssignments",
        		lv_parameterValueAssignments_3_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageProvidedInterfacePVA");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMSwPackageProvidedInterfaceAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMSwPackageProvidedInterfaceAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMSwPackageProvidedInterfacePVA
entryRuleMSwPackageProvidedInterfacePVA returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVARule()); }
	 iv_ruleMSwPackageProvidedInterfacePVA=ruleMSwPackageProvidedInterfacePVA 
	 { $current=$iv_ruleMSwPackageProvidedInterfacePVA.current; } 
	 EOF 
;

// Rule MSwPackageProvidedInterfacePVA
ruleMSwPackageProvidedInterfacePVA returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getMSwPackageProvidedInterfacePVAExpressionParserRuleCall_0()); 
    }
    this_MSwPackageProvidedInterfacePVAExpression_0=ruleMSwPackageProvidedInterfacePVAExpression
    { 
        $current = $this_MSwPackageProvidedInterfacePVAExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getMSwPackageProvidedInterfacePVASwitchParserRuleCall_1()); 
    }
    this_MSwPackageProvidedInterfacePVASwitch_1=ruleMSwPackageProvidedInterfacePVASwitch
    { 
        $current = $this_MSwPackageProvidedInterfacePVASwitch_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMSwPackageProvidedInterfacePVAExpression
entryRuleMSwPackageProvidedInterfacePVAExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionRule()); }
	 iv_ruleMSwPackageProvidedInterfacePVAExpression=ruleMSwPackageProvidedInterfacePVAExpression 
	 { $current=$iv_ruleMSwPackageProvidedInterfacePVAExpression.current; } 
	 EOF 
;

// Rule MSwPackageProvidedInterfacePVAExpression
ruleMSwPackageProvidedInterfacePVAExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='parameter' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterMParameterCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getColonEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_parameterValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionRule());
	        }
       		set(
       			$current, 
       			"parameterValue",
        		lv_parameterValue_3_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMSwPackageProvidedInterfacePVASwitch
entryRuleMSwPackageProvidedInterfacePVASwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVASwitchRule()); }
	 iv_ruleMSwPackageProvidedInterfacePVASwitch=ruleMSwPackageProvidedInterfacePVASwitch 
	 { $current=$iv_ruleMSwPackageProvidedInterfacePVASwitch.current; } 
	 EOF 
;

// Rule MSwPackageProvidedInterfacePVASwitch
ruleMSwPackageProvidedInterfacePVASwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='parameter' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageProvidedInterfacePVASwitchRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterMParameterCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getColonEqualsSignKeyword_2());
    }
	otherlv_3='switch' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getSwitchKeyword_3());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesMSwPackageProvidedInterfacePVASwitchCaseParserRuleCall_5_0()); 
	    }
		lv_cases_5_0=ruleMSwPackageProvidedInterfacePVASwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageProvidedInterfacePVASwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_5_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageProvidedInterfacePVASwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMSwPackageProvidedInterfacePVASwitchCase
entryRuleMSwPackageProvidedInterfacePVASwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseRule()); }
	 iv_ruleMSwPackageProvidedInterfacePVASwitchCase=ruleMSwPackageProvidedInterfacePVASwitchCase 
	 { $current=$iv_ruleMSwPackageProvidedInterfacePVASwitchCase.current; } 
	 EOF 
;

// Rule MSwPackageProvidedInterfacePVASwitchCase
ruleMSwPackageProvidedInterfacePVASwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_parameterValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseRule());
	        }
       		set(
       			$current, 
       			"parameterValue",
        		lv_parameterValue_3_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMSwPackageRequiredInterface
entryRuleMSwPackageRequiredInterface returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMSwPackageRequiredInterfaceRule()); }
	 iv_ruleMSwPackageRequiredInterface=ruleMSwPackageRequiredInterface 
	 { $current=$iv_ruleMSwPackageRequiredInterface.current; } 
	 EOF 
;

// Rule MSwPackageRequiredInterface
ruleMSwPackageRequiredInterface returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='requires' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMSwPackageRequiredInterfaceAccess().getRequiresKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRequiredInterfaceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceMCommonPackageElementCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMSwPackageRequiredInterfaceAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsMResourceDemandParserRuleCall_3_0()); 
	    }
		lv_resourceDemands_3_0=ruleMResourceDemand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageRequiredInterfaceRule());
	        }
       		add(
       			$current, 
       			"resourceDemands",
        		lv_resourceDemands_3_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MResourceDemand");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMSwPackageRequiredInterfaceAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMSwPackageRequiredInterfaceAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMSwPackage
entryRuleMSwPackage returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMSwPackageAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMSwPackageRule()); }
	 iv_ruleMSwPackage=ruleMSwPackage 
	 { $current=$iv_ruleMSwPackage.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MSwPackage
ruleMSwPackage returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMSwPackageAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='swpackage' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMSwPackageAccess().getSwpackageKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getMSwPackageAccess().getInheritsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMSwPackageAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_6='extends' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMSwPackageAccess().getExtendsKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMSwPackageAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_10='{' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_12='version' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMSwPackageAccess().getVersionKeyword_5_0_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
	    }
		lv_version_14_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_14_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_16='languages' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMSwPackageAccess().getLanguagesKeyword_5_1_0());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_19=',' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMSwPackageAccess().getCommaKeyword_5_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_22='construction' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMSwPackageAccess().getConstructionKeyword_5_2_0());
    }
	otherlv_23='tools' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMSwPackageAccess().getToolsKeyword_5_2_1());
    }
	otherlv_24=':=' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_2_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_26=',' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMSwPackageAccess().getCommaKeyword_5_2_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_29='configuration' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMSwPackageAccess().getConfigurationKeyword_5_3_0());
    }
	otherlv_30='parameters' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMSwPackageAccess().getParametersKeyword_5_3_1());
    }
	otherlv_31='{' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getParametersMParameterParserRuleCall_5_3_3_0()); 
	    }
		lv_parameters_32_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_32_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_33='}' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_3_4());
    }
	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_35='provided' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMSwPackageAccess().getProvidedKeyword_5_4_0());
    }
	otherlv_36='interfaces' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMSwPackageAccess().getInterfacesKeyword_5_4_1());
    }
	otherlv_37='{' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_4_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0()); 
	    }
		lv_provides_38_0=ruleMSwPackageProvidedInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageRule());
	        }
       		add(
       			$current, 
       			"provides",
        		lv_provides_38_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageProvidedInterface");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_39='}' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_4_4());
    }
	otherlv_40=';' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_4_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_41='required' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMSwPackageAccess().getRequiredKeyword_5_5_0());
    }
	otherlv_42='interfaces' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMSwPackageAccess().getInterfacesKeyword_5_5_1());
    }
	otherlv_43='{' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_5_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0()); 
	    }
		lv_requires_44_0=ruleMSwPackageRequiredInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageRule());
	        }
       		add(
       			$current, 
       			"requires",
        		lv_requires_44_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageRequiredInterface");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_45='}' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_5_4());
    }
	otherlv_46=';' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_5_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_47='supported' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMSwPackageAccess().getSupportedKeyword_5_6_0());
    }
	otherlv_48='platforms' 
    {
    	newLeafNode(otherlv_48, grammarAccess.getMSwPackageAccess().getPlatformsKeyword_5_6_1());
    }
	otherlv_49='{' 
    {
    	newLeafNode(otherlv_49, grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_6_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageAccess().getSupportedPlatformsMSwPackageSupportedPlatformParserRuleCall_5_6_3_0()); 
	    }
		lv_supportedPlatforms_50_0=ruleMSwPackageSupportedPlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageRule());
	        }
       		add(
       			$current, 
       			"supportedPlatforms",
        		lv_supportedPlatforms_50_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageSupportedPlatform");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_51='}' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_6_4());
    }
	otherlv_52=';' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_6_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	}

)	otherlv_53='}' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_54=';' 
    {
    	newLeafNode(otherlv_54, grammarAccess.getMSwPackageAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDriverSwPackage
entryRuleMDriverSwPackage returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMDriverSwPackageRule()); }
	 iv_ruleMDriverSwPackage=ruleMDriverSwPackage 
	 { $current=$iv_ruleMDriverSwPackage.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MDriverSwPackage
ruleMDriverSwPackage returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='driver' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMDriverSwPackageAccess().getDriverKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMDriverSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getMDriverSwPackageAccess().getInheritsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_6='extends' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMDriverSwPackageAccess().getExtendsKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_10='{' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_12='version' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMDriverSwPackageAccess().getVersionKeyword_5_0_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
	    }
		lv_version_14_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSwPackageRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_14_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_16='languages' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMDriverSwPackageAccess().getLanguagesKeyword_5_1_0());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_19=',' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_5_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_22='construction' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMDriverSwPackageAccess().getConstructionKeyword_5_2_0());
    }
	otherlv_23='tools' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMDriverSwPackageAccess().getToolsKeyword_5_2_1());
    }
	otherlv_24=':=' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_2_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_26=',' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_5_2_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_29='configuration' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMDriverSwPackageAccess().getConfigurationKeyword_5_3_0());
    }
	otherlv_30='parameters' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMDriverSwPackageAccess().getParametersKeyword_5_3_1());
    }
	otherlv_31='{' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getParametersMParameterParserRuleCall_5_3_3_0()); 
	    }
		lv_parameters_32_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSwPackageRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_32_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_33='}' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_3_4());
    }
	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_35='provided' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMDriverSwPackageAccess().getProvidedKeyword_5_4_0());
    }
	otherlv_36='interfaces' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMDriverSwPackageAccess().getInterfacesKeyword_5_4_1());
    }
	otherlv_37='{' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_4_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0()); 
	    }
		lv_provides_38_0=ruleMSwPackageProvidedInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSwPackageRule());
	        }
       		add(
       			$current, 
       			"provides",
        		lv_provides_38_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageProvidedInterface");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_39='}' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_4_4());
    }
	otherlv_40=';' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_4_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_41='required' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMDriverSwPackageAccess().getRequiredKeyword_5_5_0());
    }
	otherlv_42='interfaces' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMDriverSwPackageAccess().getInterfacesKeyword_5_5_1());
    }
	otherlv_43='{' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_5_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0()); 
	    }
		lv_requires_44_0=ruleMSwPackageRequiredInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSwPackageRule());
	        }
       		add(
       			$current, 
       			"requires",
        		lv_requires_44_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageRequiredInterface");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_45='}' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_5_4());
    }
	otherlv_46=';' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_5_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_47='supported' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMDriverSwPackageAccess().getSupportedKeyword_5_6_0());
    }
	otherlv_48='platforms' 
    {
    	newLeafNode(otherlv_48, grammarAccess.getMDriverSwPackageAccess().getPlatformsKeyword_5_6_1());
    }
	otherlv_49='{' 
    {
    	newLeafNode(otherlv_49, grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_6_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsMDriverSwPackageSupportedPlatformParserRuleCall_5_6_3_0()); 
	    }
		lv_supportedPlatforms_50_0=ruleMDriverSwPackageSupportedPlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSwPackageRule());
	        }
       		add(
       			$current, 
       			"supportedPlatforms",
        		lv_supportedPlatforms_50_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MDriverSwPackageSupportedPlatform");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_51='}' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_6_4());
    }
	otherlv_52=';' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_6_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	}

)	otherlv_53='}' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_54=';' 
    {
    	newLeafNode(otherlv_54, grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDriverSwPackageSupportedPlatform
entryRuleMDriverSwPackageSupportedPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformRule()); }
	 iv_ruleMDriverSwPackageSupportedPlatform=ruleMDriverSwPackageSupportedPlatform 
	 { $current=$iv_ruleMDriverSwPackageSupportedPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MDriverSwPackageSupportedPlatform
ruleMDriverSwPackageSupportedPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMDriverSwPackageSupportedPlatformAction_0(),
            $current);
    }
)	otherlv_1='supported' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedKeyword_1());
    }
	otherlv_2='platform' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getPlatformKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='osapi' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiKeyword_5_0_0());
    }
	otherlv_7=':=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1());
    }
(	otherlv_8='any' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_0_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_11='os' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsKeyword_5_1_0());
    }
	otherlv_12=':=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1());
    }
(	otherlv_13='any' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_1_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_16='architecture' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureKeyword_5_2_0());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1());
    }
(	otherlv_18='any' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_2_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_20=';' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_2_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_21='compiler' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerKeyword_5_3_0());
    }
	otherlv_22=':=' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_3_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_25='microprocessor' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0());
    }
	otherlv_26=':=' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1());
    }
(	otherlv_27='any' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_4_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_4_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_30='board' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardKeyword_5_5_0());
    }
	otherlv_31=':=' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1());
    }
(	otherlv_32='any' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_5_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_5_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_35='languages' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesKeyword_5_6_0());
    }
	otherlv_36=':=' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_38=',' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCommaKeyword_5_6_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_40=';' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_6_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
					({true}?=>(	otherlv_41='configuration' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getConfigurationKeyword_5_7_0());
    }
	otherlv_42='parameters' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersKeyword_5_7_1());
    }
	otherlv_43='{' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersMParameterParserRuleCall_5_7_3_0()); 
	    }
		lv_parameters_44_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_44_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_45='}' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4());
    }
	otherlv_46=';' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_7_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
					({true}?=>(	otherlv_47='required' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiredKeyword_5_8_0());
    }
	otherlv_48='interfaces' 
    {
    	newLeafNode(otherlv_48, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getInterfacesKeyword_5_8_1());
    }
	otherlv_49='{' 
    {
    	newLeafNode(otherlv_49, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0()); 
	    }
		lv_requires_50_0=ruleMSwPackageRequiredInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"requires",
        		lv_requires_50_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageRequiredInterface");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_51='}' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_4());
    }
	otherlv_52=';' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_8_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 9);
	 				}
					({true}?=>(	otherlv_53='supported' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedKeyword_5_9_0());
    }
	otherlv_54='devices' 
    {
    	newLeafNode(otherlv_54, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getDevicesKeyword_5_9_1());
    }
	otherlv_55='{' 
    {
    	newLeafNode(otherlv_55, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_9_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesMDriverSwPackageSupportedDeviceParserRuleCall_5_9_3_0()); 
	    }
		lv_supportedDevices_56_0=ruleMDriverSwPackageSupportedDevice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSwPackageSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"supportedDevices",
        		lv_supportedDevices_56_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MDriverSwPackageSupportedDevice");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_57='}' 
    {
    	newLeafNode(otherlv_57, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_9_4());
    }
	otherlv_58=';' 
    {
    	newLeafNode(otherlv_58, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_9_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	}

)	otherlv_59='}' 
    {
    	newLeafNode(otherlv_59, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_60=';' 
    {
    	newLeafNode(otherlv_60, grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDriverSwPackageSupportedDevice
entryRuleMDriverSwPackageSupportedDevice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMDriverSwPackageSupportedDeviceRule()); }
	 iv_ruleMDriverSwPackageSupportedDevice=ruleMDriverSwPackageSupportedDevice 
	 { $current=$iv_ruleMDriverSwPackageSupportedDevice.current; } 
	 EOF 
;

// Rule MDriverSwPackageSupportedDevice
ruleMDriverSwPackageSupportedDevice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='device' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedDeviceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSwPackageSupportedDeviceRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='required' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredKeyword_4_0());
    }
	otherlv_5=':=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getColonEqualsSignKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredMParameterValueExpressionParserRuleCall_4_2_0()); 
	    }
		lv_required_6_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSwPackageSupportedDeviceRule());
	        }
       		set(
       			$current, 
       			"required",
        		lv_required_6_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getSemicolonKeyword_4_3());
    }
)?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMSwPackageSupportedPlatform
entryRuleMSwPackageSupportedPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformRule()); }
	 iv_ruleMSwPackageSupportedPlatform=ruleMSwPackageSupportedPlatform 
	 { $current=$iv_ruleMSwPackageSupportedPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MSwPackageSupportedPlatform
ruleMSwPackageSupportedPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMSwPackageSupportedPlatformAccess().getMSwPackageSupportedPlatformAction_0(),
            $current);
    }
)	otherlv_1='supported' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMSwPackageSupportedPlatformAccess().getSupportedKeyword_1());
    }
	otherlv_2='platform' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMSwPackageSupportedPlatformAccess().getPlatformKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageSupportedPlatformRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='osapi' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiKeyword_5_0_0());
    }
	otherlv_7=':=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1());
    }
(	otherlv_8='any' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_0_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_11='os' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMSwPackageSupportedPlatformAccess().getOsKeyword_5_1_0());
    }
	otherlv_12=':=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1());
    }
(	otherlv_13='any' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_1_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_16='architecture' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureKeyword_5_2_0());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1());
    }
(	otherlv_18='any' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_2_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_20=';' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_2_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_21='compiler' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerKeyword_5_3_0());
    }
	otherlv_22=':=' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_3_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_25='microprocessor' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0());
    }
	otherlv_26=':=' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1());
    }
(	otherlv_27='any' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_4_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_4_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_30='board' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardKeyword_5_5_0());
    }
	otherlv_31=':=' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1());
    }
(	otherlv_32='any' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_5_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_5_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_35='languages' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesKeyword_5_6_0());
    }
	otherlv_36=':=' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_38=',' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMSwPackageSupportedPlatformAccess().getCommaKeyword_5_6_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_40=';' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_6_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
					({true}?=>(	otherlv_41='configuration' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMSwPackageSupportedPlatformAccess().getConfigurationKeyword_5_7_0());
    }
	otherlv_42='parameters' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersKeyword_5_7_1());
    }
	otherlv_43='{' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersMParameterWithoutSWPSPParserRuleCall_5_7_3_0()); 
	    }
		lv_parameters_44_0=ruleMParameterWithoutSWPSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_44_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterWithoutSWPSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_45='}' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4());
    }
	otherlv_46=';' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_7_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
					({true}?=>(	otherlv_47='required' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiredKeyword_5_8_0());
    }
	otherlv_48='interfaces' 
    {
    	newLeafNode(otherlv_48, grammarAccess.getMSwPackageSupportedPlatformAccess().getInterfacesKeyword_5_8_1());
    }
	otherlv_49='{' 
    {
    	newLeafNode(otherlv_49, grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0()); 
	    }
		lv_requires_50_0=ruleMSwPackageRequiredInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMSwPackageSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"requires",
        		lv_requires_50_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MSwPackageRequiredInterface");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_51='}' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_4());
    }
	otherlv_52=';' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_8_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	}

)	otherlv_53='}' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_54=';' 
    {
    	newLeafNode(otherlv_54, grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





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
(	otherlv_0='parameter' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMParameterValueAssignmentAccess().getParameterKeyword_0());
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMParameterValueAssignmentAccess().getSemicolonKeyword_4());
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





// Entry rule entryRuleMResourceDemand
entryRuleMResourceDemand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMResourceDemandRule()); }
	 iv_ruleMResourceDemand=ruleMResourceDemand 
	 { $current=$iv_ruleMResourceDemand.current; } 
	 EOF 
;

// Rule MResourceDemand
ruleMResourceDemand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMResourceDemandAccess().getMQuantifiableResourceDemandParserRuleCall_0()); 
    }
    this_MQuantifiableResourceDemand_0=ruleMQuantifiableResourceDemand
    { 
        $current = $this_MQuantifiableResourceDemand_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMResourceDemandAccess().getMInstantiableResourceDemandParserRuleCall_1()); 
    }
    this_MInstantiableResourceDemand_1=ruleMInstantiableResourceDemand
    { 
        $current = $this_MInstantiableResourceDemand_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMInstantiableResourceDemand
entryRuleMInstantiableResourceDemand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInstantiableResourceDemandRule()); }
	 iv_ruleMInstantiableResourceDemand=ruleMInstantiableResourceDemand 
	 { $current=$iv_ruleMInstantiableResourceDemand.current; } 
	 EOF 
;

// Rule MInstantiableResourceDemand
ruleMInstantiableResourceDemand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='instantiable' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMInstantiableResourceDemandAccess().getInstantiableKeyword_0());
    }
	otherlv_1='resource' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMInstantiableResourceDemandAccess().getResourceKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInstantiableResourceDemandRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInstantiableResourceDemandAccess().getResourceMInstantiableResourceCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMInstantiableResourceDemandAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInstantiableResourceDemandRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMInstantiableResourceDemandAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0()); 
	    }
		lv_parameterValueAssignments_5_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMInstantiableResourceDemandRule());
	        }
       		add(
       			$current, 
       			"parameterValueAssignments",
        		lv_parameterValueAssignments_5_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMInstantiableResourceDemandAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMInstantiableResourceDemandAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMQuantifiableResourceDemand
entryRuleMQuantifiableResourceDemand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMQuantifiableResourceDemandRule()); }
	 iv_ruleMQuantifiableResourceDemand=ruleMQuantifiableResourceDemand 
	 { $current=$iv_ruleMQuantifiableResourceDemand.current; } 
	 EOF 
;

// Rule MQuantifiableResourceDemand
ruleMQuantifiableResourceDemand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMQuantifiableResourceDemandAccess().getMQuantifiableResourceDemandAction_0(),
            $current);
    }
)	otherlv_1='quantifiable' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMQuantifiableResourceDemandAccess().getQuantifiableKeyword_1());
    }
	otherlv_2='resource' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMQuantifiableResourceDemandAccess().getResourceKeyword_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMQuantifiableResourceDemandRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceMQuantifiableResourceCrossReference_3_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=':=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMQuantifiableResourceDemandAccess().getColonEqualsSignKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueMParameterValueExpressionParserRuleCall_5_0()); 
	    }
		lv_resourceValue_5_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMQuantifiableResourceDemandRule());
	        }
       		set(
       			$current, 
       			"resourceValue",
        		lv_resourceValue_5_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMQuantifiableResourceDemandAccess().getSemicolonKeyword_6());
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
        newCompositeNode(grammarAccess.getMParameterAccess().getMBooleanParamSWPSPSwitchParserRuleCall_6()); 
    }
    this_MBooleanParamSWPSPSwitch_6=ruleMBooleanParamSWPSPSwitch
    { 
        $current = $this_MBooleanParamSWPSPSwitch_6.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMStringParamSWPSPSwitchParserRuleCall_7()); 
    }
    this_MStringParamSWPSPSwitch_7=ruleMStringParamSWPSPSwitch
    { 
        $current = $this_MStringParamSWPSPSwitch_7.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMIntegerParamSWPSPSwitchParserRuleCall_8()); 
    }
    this_MIntegerParamSWPSPSwitch_8=ruleMIntegerParamSWPSPSwitch
    { 
        $current = $this_MIntegerParamSWPSPSwitch_8.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMRealParamSWPSPSwitchParserRuleCall_9()); 
    }
    this_MRealParamSWPSPSwitch_9=ruleMRealParamSWPSPSwitch
    { 
        $current = $this_MRealParamSWPSPSwitch_9.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMEnumParamSWPSPSwitchParserRuleCall_10()); 
    }
    this_MEnumParamSWPSPSwitch_10=ruleMEnumParamSWPSPSwitch
    { 
        $current = $this_MEnumParamSWPSPSwitch_10.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMParameterWithoutSWPSP
entryRuleMParameterWithoutSWPSP returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterWithoutSWPSPRule()); }
	 iv_ruleMParameterWithoutSWPSP=ruleMParameterWithoutSWPSP 
	 { $current=$iv_ruleMParameterWithoutSWPSP.current; } 
	 EOF 
;

// Rule MParameterWithoutSWPSP
ruleMParameterWithoutSWPSP returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterWithoutSWPSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSWPSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSWPSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSWPSPAccess().getMRealParameterSingleExpressionParserRuleCall_3()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSWPSPAccess().getMStringParameterSingleExpressionParserRuleCall_4()); 
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
        newCompositeNode(grammarAccess.getMParameterWithoutSWPSPAccess().getMEnumParameterDefinitionParserRuleCall_5()); 
    }
    this_MEnumParameterDefinition_5=ruleMEnumParameterDefinition
    { 
        $current = $this_MEnumParameterDefinition_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMBooleanParamSWPSPSwitch
entryRuleMBooleanParamSWPSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMBooleanParamSWPSPSwitchRule()); }
	 iv_ruleMBooleanParamSWPSPSwitch=ruleMBooleanParamSWPSPSwitch 
	 { $current=$iv_ruleMBooleanParamSWPSPSwitch.current; } 
	 EOF 
;

// Rule MBooleanParamSWPSPSwitch
ruleMBooleanParamSWPSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParamSWPSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='boolean' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMBooleanParamSWPSPSwitchAccess().getBooleanKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMBooleanParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParamSWPSPSwitchRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMBooleanParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMBooleanParamSWPSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMBooleanParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesMBooleanParamSWPSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMBooleanParamSWPSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBooleanParamSWPSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MBooleanParamSWPSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMBooleanParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMBooleanParamSWPSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMBooleanParamSWPSPSwitchCase
entryRuleMBooleanParamSWPSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMBooleanParamSWPSPSwitchCaseRule()); }
	 iv_ruleMBooleanParamSWPSPSwitchCase=ruleMBooleanParamSWPSPSwitchCase 
	 { $current=$iv_ruleMBooleanParamSWPSPSwitchCase.current; } 
	 EOF 
;

// Rule MBooleanParamSWPSPSwitchCase
ruleMBooleanParamSWPSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParamSWPSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBooleanParamSWPSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMStringParamSWPSPSwitch
entryRuleMStringParamSWPSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMStringParamSWPSPSwitchRule()); }
	 iv_ruleMStringParamSWPSPSwitch=ruleMStringParamSWPSPSwitch 
	 { $current=$iv_ruleMStringParamSWPSPSwitch.current; } 
	 EOF 
;

// Rule MStringParamSWPSPSwitch
ruleMStringParamSWPSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParamSWPSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='string' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMStringParamSWPSPSwitchAccess().getStringKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMStringParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParamSWPSPSwitchRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMStringParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMStringParamSWPSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMStringParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesMStringParamSWPSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMStringParamSWPSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMStringParamSWPSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MStringParamSWPSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMStringParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMStringParamSWPSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMStringParamSWPSPSwitchCase
entryRuleMStringParamSWPSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMStringParamSWPSPSwitchCaseRule()); }
	 iv_ruleMStringParamSWPSPSwitchCase=ruleMStringParamSWPSPSwitchCase 
	 { $current=$iv_ruleMStringParamSWPSPSwitchCase.current; } 
	 EOF 
;

// Rule MStringParamSWPSPSwitchCase
ruleMStringParamSWPSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParamSWPSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMStringParamSWPSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMIntegerParamSWPSPSwitch
entryRuleMIntegerParamSWPSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMIntegerParamSWPSPSwitchRule()); }
	 iv_ruleMIntegerParamSWPSPSwitch=ruleMIntegerParamSWPSPSwitch 
	 { $current=$iv_ruleMIntegerParamSWPSPSwitch.current; } 
	 EOF 
;

// Rule MIntegerParamSWPSPSwitch
ruleMIntegerParamSWPSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParamSWPSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='integer' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMIntegerParamSWPSPSwitchAccess().getIntegerKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMIntegerParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParamSWPSPSwitchRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMIntegerParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMIntegerParamSWPSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMIntegerParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesMIntegerParamSWPSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMIntegerParamSWPSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParamSWPSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MIntegerParamSWPSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMIntegerParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMIntegerParamSWPSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMIntegerParamSWPSPSwitchCase
entryRuleMIntegerParamSWPSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMIntegerParamSWPSPSwitchCaseRule()); }
	 iv_ruleMIntegerParamSWPSPSwitchCase=ruleMIntegerParamSWPSPSwitchCase 
	 { $current=$iv_ruleMIntegerParamSWPSPSwitchCase.current; } 
	 EOF 
;

// Rule MIntegerParamSWPSPSwitchCase
ruleMIntegerParamSWPSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParamSWPSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParamSWPSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='range' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
	    }
		lv_range_5_0=ruleMParameterRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParamSWPSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"range",
        		lv_range_5_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterRange");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMRealParamSWPSPSwitch
entryRuleMRealParamSWPSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMRealParamSWPSPSwitchRule()); }
	 iv_ruleMRealParamSWPSPSwitch=ruleMRealParamSWPSPSwitch 
	 { $current=$iv_ruleMRealParamSWPSPSwitch.current; } 
	 EOF 
;

// Rule MRealParamSWPSPSwitch
ruleMRealParamSWPSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParamSWPSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='real' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMRealParamSWPSPSwitchAccess().getRealKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMRealParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParamSWPSPSwitchRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMRealParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMRealParamSWPSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMRealParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesMRealParamSWPSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMRealParamSWPSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParamSWPSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MRealParamSWPSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMRealParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMRealParamSWPSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMRealParamSWPSPSwitchCase
entryRuleMRealParamSWPSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMRealParamSWPSPSwitchCaseRule()); }
	 iv_ruleMRealParamSWPSPSwitchCase=ruleMRealParamSWPSPSwitchCase 
	 { $current=$iv_ruleMRealParamSWPSPSwitchCase.current; } 
	 EOF 
;

// Rule MRealParamSWPSPSwitchCase
ruleMRealParamSWPSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParamSWPSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParamSWPSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='range' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
	    }
		lv_range_5_0=ruleMParameterRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParamSWPSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"range",
        		lv_range_5_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterRange");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMEnumParamSWPSPSwitch
entryRuleMEnumParamSWPSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamSWPSPSwitchRule()); }
	 iv_ruleMEnumParamSWPSPSwitch=ruleMEnumParamSWPSPSwitch 
	 { $current=$iv_ruleMEnumParamSWPSPSwitch.current; } 
	 EOF 
;

// Rule MEnumParamSWPSPSwitch
ruleMEnumParamSWPSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamSWPSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='enum' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamSWPSPSwitchRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMEnumParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamSWPSPSwitchRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMEnumParamSWPSPSwitchAccess().getColonEqualsSignKeyword_4());
    }
	otherlv_5='switch' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMEnumParamSWPSPSwitchAccess().getSwitchKeyword_5());
    }
	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMEnumParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesMEnumParamSWPSPSwitchCaseParserRuleCall_7_0()); 
	    }
		lv_cases_7_0=ruleMEnumParamSWPSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParamSWPSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_7_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MEnumParamSWPSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMEnumParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_8());
    }
	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMEnumParamSWPSPSwitchAccess().getSemicolonKeyword_9());
    }
)
;





// Entry rule entryRuleMEnumParamSWPSPSwitchCase
entryRuleMEnumParamSWPSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamSWPSPSwitchCaseRule()); }
	 iv_ruleMEnumParamSWPSPSwitchCase=ruleMEnumParamSWPSPSwitchCase 
	 { $current=$iv_ruleMEnumParamSWPSPSwitchCase.current; } 
	 EOF 
;

// Rule MEnumParamSWPSPSwitchCase
ruleMEnumParamSWPSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamSWPSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParamSWPSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4());
    }
)
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5());
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterRange");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MEnumParameterLiteralRule");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MEnumParameterLiteralRule");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterRange");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.EBoolean");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.INTEGER");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.REAL");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpressionOperators");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValue");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueTERMOperators");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.INTEGER");
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
        		"es.uah.aut.srg.micobs.mesp.lang.SWP.REAL");
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


