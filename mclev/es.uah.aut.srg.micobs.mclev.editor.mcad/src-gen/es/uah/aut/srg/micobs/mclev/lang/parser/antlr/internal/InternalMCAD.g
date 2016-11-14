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
grammar InternalMCAD;

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
import es.uah.aut.srg.micobs.mclev.lang.services.MCADGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private MCADGrammarAccess grammarAccess;
 	
    public InternalMCADParser(TokenStream input, MCADGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MMCLEVMCADPackageFile";	
   	}
   	
   	@Override
   	protected MCADGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMMCLEVMCADPackageFile
entryRuleMMCLEVMCADPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVMCADPackageFileRule()); }
	 iv_ruleMMCLEVMCADPackageFile=ruleMMCLEVMCADPackageFile 
	 { $current=$iv_ruleMMCLEVMCADPackageFile.current; } 
	 EOF 
;

// Rule MMCLEVMCADPackageFile
ruleMMCLEVMCADPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVMCADPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMCLEVMCADPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVMCADPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVMCADPackageFileAccess().getElementMMCLEVMCADPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMMCLEVMCADPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCLEVMCADPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MMCLEVMCADPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMMCLEVMCADPackageElement
entryRuleMMCLEVMCADPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVMCADPackageElementRule()); }
	 iv_ruleMMCLEVMCADPackageElement=ruleMMCLEVMCADPackageElement 
	 { $current=$iv_ruleMMCLEVMCADPackageElement.current; } 
	 EOF 
;

// Rule MMCLEVMCADPackageElement
ruleMMCLEVMCADPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMCLEVMCADPackageElementAccess().getMMCADeploymentParserRuleCall()); 
    }
    this_MMCADeployment_0=ruleMMCADeployment
    { 
        $current = $this_MMCADeployment_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleMMCADeployment
entryRuleMMCADeployment returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMMCADeploymentRule()); }
	 iv_ruleMMCADeployment=ruleMMCADeployment 
	 { $current=$iv_ruleMMCADeployment.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MMCADeployment
ruleMMCADeployment returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='deployment' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_0());
    }
	otherlv_1='project' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMMCADeploymentAccess().getProjectKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCADeploymentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getDomainMDomainCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMMCADeploymentAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCADeploymentRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='version' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMMCADeploymentAccess().getVersionKeyword_5_0_0());
    }
	otherlv_7=':=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMMCADeploymentAccess().getColonEqualsSignKeyword_5_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
	    }
		lv_version_8_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_8_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_10='attribute' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMMCADeploymentAccess().getAttributeKeyword_5_1_0());
    }
	otherlv_11='values' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMMCADeploymentAccess().getValuesKeyword_5_1_1());
    }
	otherlv_12='{' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); 
	    }
		lv_attributeValueAssignments_13_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_13_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_14='}' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_1_4());
    }
	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_16='deployment' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_2_0());
    }
	otherlv_17='platforms' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMMCADeploymentAccess().getPlatformsKeyword_5_2_1());
    }
	otherlv_18='{' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsMDeploymentPlatformParserRuleCall_5_2_3_0()); 
	    }
		lv_deploymentPlatforms_19_0=ruleMDeploymentPlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
	        }
       		add(
       			$current, 
       			"deploymentPlatforms",
        		lv_deploymentPlatforms_19_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeploymentPlatform");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_20='}' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_2_4());
    }
	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_22='deployment' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_3_0());
    }
	otherlv_23='alternatives' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMMCADeploymentAccess().getAlternativesKeyword_5_3_1());
    }
	otherlv_24='{' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_3_3_0()); 
	    }
		lv_deploymentAlternatives_25_0=ruleMDeploymentAlternative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
	        }
       		add(
       			$current, 
       			"deploymentAlternatives",
        		lv_deploymentAlternatives_25_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeploymentAlternative");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_26='}' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_3_4());
    }
	otherlv_27=';' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_28='components' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMMCADeploymentAccess().getComponentsKeyword_5_4_0());
    }
	otherlv_29='{' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getComponentsMComponentInstanceParserRuleCall_5_4_2_0()); 
	    }
		lv_components_30_0=ruleMComponentInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
	        }
       		add(
       			$current, 
       			"components",
        		lv_components_30_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MComponentInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_31='}' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_4_3());
    }
	otherlv_32=';' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_4_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_33='connections' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMMCADeploymentAccess().getConnectionsKeyword_5_5_0());
    }
	otherlv_34='{' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getConnectionsMConnectionParserRuleCall_5_5_2_0()); 
	    }
		lv_connections_35_0=ruleMConnection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
	        }
       		add(
       			$current, 
       			"connections",
        		lv_connections_35_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MConnection");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_36='}' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_5_3());
    }
	otherlv_37=';' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_5_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_38='libraries' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMMCADeploymentAccess().getLibrariesKeyword_5_6_0());
    }
	otherlv_39='{' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_6_2_0()); 
	    }
		lv_libraries_40_0=ruleMServiceLibraryInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
	        }
       		add(
       			$current, 
       			"libraries",
        		lv_libraries_40_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MServiceLibraryInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_41='}' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_6_3());
    }
	otherlv_42=';' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_6_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	}

)	otherlv_43='}' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_44=';' 
    {
    	newLeafNode(otherlv_44, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMConnection
entryRuleMConnection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMConnectionRule()); }
	 iv_ruleMConnection=ruleMConnection 
	 { $current=$iv_ruleMConnection.current; } 
	 EOF 
;

// Rule MConnection
ruleMConnection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMConnectionAccess().getMCommonConnectionParserRuleCall_0()); 
    }
    this_MCommonConnection_0=ruleMCommonConnection
    { 
        $current = $this_MCommonConnection_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMConnectionAccess().getMConnectionSwitchParserRuleCall_1()); 
    }
    this_MConnectionSwitch_1=ruleMConnectionSwitch
    { 
        $current = $this_MConnectionSwitch_1.current; 
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





// Entry rule entryRuleMCommonConnection
entryRuleMCommonConnection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMCommonConnectionRule()); }
	 iv_ruleMCommonConnection=ruleMCommonConnection 
	 { $current=$iv_ruleMCommonConnection.current; } 
	 EOF 
;

// Rule MCommonConnection
ruleMCommonConnection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMCommonConnectionAccess().getMCommonConnectionAction_0(),
            $current);
    }
)	otherlv_1='connection' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMCommonConnectionAccess().getConnectionKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCommonConnectionRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getMCommonConnectionAccess().getClientInstanceMComponentInstanceCrossReference_2_0()); 
	}

)
)	otherlv_3='.' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCommonConnectionRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getMCommonConnectionAccess().getClientPortMClientPortCrossReference_4_0()); 
	}

)
)	otherlv_5='<->' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMCommonConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCommonConnectionRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getMCommonConnectionAccess().getServerInstanceMComponentInstanceCrossReference_6_0()); 
	}

)
)	otherlv_7='.' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_7());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCommonConnectionRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getMCommonConnectionAccess().getServerPortMServerPortCrossReference_8_0()); 
	}

)
)	otherlv_9='using' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMCommonConnectionAccess().getUsingKeyword_9());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCommonConnectionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMCommonConnectionAccess().getConnectorMConnectorCrossReference_10_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMCommonConnectionAccess().getLeftCurlyBracketKeyword_11());
    }
(	otherlv_12='mapping' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMCommonConnectionAccess().getMappingKeyword_12_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMCommonConnectionAccess().getColonEqualsSignKeyword_12_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCommonConnectionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMCommonConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_12_3());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getMCommonConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0()); 
	    }
		lv_attributeValueAssignments_16_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMCommonConnectionRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_16_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMCommonConnectionAccess().getRightCurlyBracketKeyword_14());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_15());
    }
)
;





// Entry rule entryRuleMConnectionSwitch
entryRuleMConnectionSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMConnectionSwitchRule()); }
	 iv_ruleMConnectionSwitch=ruleMConnectionSwitch 
	 { $current=$iv_ruleMConnectionSwitch.current; } 
	 EOF 
;

// Rule MConnectionSwitch
ruleMConnectionSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMConnectionSwitchAccess().getMConnectionSwitchAction_0(),
            $current);
    }
)	otherlv_1='switch' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMConnectionSwitchAccess().getSwitchKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMConnectionSwitchAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectionSwitchRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getMConnectionSwitchAccess().getClientInstanceMComponentInstanceCrossReference_3_0()); 
	}

)
)	otherlv_4='.' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMConnectionSwitchAccess().getFullStopKeyword_4());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectionSwitchRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getMConnectionSwitchAccess().getClientPortMClientPortCrossReference_5_0()); 
	}

)
)	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMConnectionSwitchAccess().getRightParenthesisKeyword_6());
    }
	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMConnectionSwitchAccess().getLeftCurlyBracketKeyword_7());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMConnectionSwitchAccess().getCasesMConnectionSwitchCaseParserRuleCall_8_0()); 
	    }
		lv_cases_8_0=ruleMConnectionSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMConnectionSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_8_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MConnectionSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMConnectionSwitchAccess().getRightCurlyBracketKeyword_9());
    }
	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMConnectionSwitchAccess().getSemicolonKeyword_10());
    }
)
;





// Entry rule entryRuleMConnectionSwitchCase
entryRuleMConnectionSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMConnectionSwitchCaseRule()); }
	 iv_ruleMConnectionSwitchCase=ruleMConnectionSwitchCase 
	 { $current=$iv_ruleMConnectionSwitchCase.current; } 
	 EOF 
;

// Rule MConnectionSwitchCase
ruleMConnectionSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMConnectionSwitchCaseAccess().getMConnectionSwitchCaseAction_0(),
            $current);
    }
)	otherlv_1='case' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMConnectionSwitchCaseAccess().getCaseKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeMDeploymentAlternativeCrossReference_2_0()); 
	}

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMConnectionSwitchCaseAccess().getColonKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceMComponentInstanceCrossReference_4_0()); 
	}

)
)	otherlv_5='.' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMConnectionSwitchCaseAccess().getFullStopKeyword_5());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getMConnectionSwitchCaseAccess().getServerPortMServerPortCrossReference_6_0()); 
	}

)
)	otherlv_7='using' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMConnectionSwitchCaseAccess().getUsingKeyword_7());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorMConnectorCrossReference_8_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9='{' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMConnectionSwitchCaseAccess().getLeftCurlyBracketKeyword_9());
    }
(	otherlv_10='mapping' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMConnectionSwitchCaseAccess().getMappingKeyword_10_0());
    }
	otherlv_11=':=' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMConnectionSwitchCaseAccess().getColonEqualsSignKeyword_10_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_10_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_10_3());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getMConnectionSwitchCaseAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_11_0()); 
	    }
		lv_attributeValueAssignments_14_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMConnectionSwitchCaseRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_14_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMConnectionSwitchCaseAccess().getRightCurlyBracketKeyword_12());
    }
	otherlv_16=';' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_13());
    }
)
;





// Entry rule entryRuleMComponentInstance
entryRuleMComponentInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMComponentInstanceRule()); }
	 iv_ruleMComponentInstance=ruleMComponentInstance 
	 { $current=$iv_ruleMComponentInstance.current; } 
	 EOF 
;

// Rule MComponentInstance
ruleMComponentInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMComponentInstanceAccess().getMComponentInstanceAction_0(),
            $current);
    }
)	otherlv_1='instance' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMComponentInstanceAccess().getInstanceKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentInstanceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentInstanceRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMComponentInstanceAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0()); 
	    }
		lv_attributeValueAssignments_5_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMComponentInstanceRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_5_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMComponentInstanceAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMComponentInstanceAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMServiceLibraryInstance
entryRuleMServiceLibraryInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMServiceLibraryInstanceRule()); }
	 iv_ruleMServiceLibraryInstance=ruleMServiceLibraryInstance 
	 { $current=$iv_ruleMServiceLibraryInstance.current; } 
	 EOF 
;

// Rule MServiceLibraryInstance
ruleMServiceLibraryInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMServiceLibraryInstanceAccess().getMRegularServiceLibraryInstanceParserRuleCall_0()); 
    }
    this_MRegularServiceLibraryInstance_0=ruleMRegularServiceLibraryInstance
    { 
        $current = $this_MRegularServiceLibraryInstance_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMServiceLibraryInstanceAccess().getMDriverSLibInstanceParserRuleCall_1()); 
    }
    this_MDriverSLibInstance_1=ruleMDriverSLibInstance
    { 
        $current = $this_MDriverSLibInstance_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMRegularServiceLibraryInstance
entryRuleMRegularServiceLibraryInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMRegularServiceLibraryInstanceRule()); }
	 iv_ruleMRegularServiceLibraryInstance=ruleMRegularServiceLibraryInstance 
	 { $current=$iv_ruleMRegularServiceLibraryInstance.current; } 
	 EOF 
;

// Rule MRegularServiceLibraryInstance
ruleMRegularServiceLibraryInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='library' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRegularServiceLibraryInstanceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMRegularServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRegularServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0()); 
	    }
		lv_attributeValueAssignments_3_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRegularServiceLibraryInstanceRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMRegularServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMRegularServiceLibraryInstanceAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMDriverSLibInstance
entryRuleMDriverSLibInstance returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMDriverSLibInstanceRule()); }
	 iv_ruleMDriverSLibInstance=ruleMDriverSLibInstance 
	 { $current=$iv_ruleMDriverSLibInstance.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MDriverSLibInstance
ruleMDriverSLibInstance returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMDriverSLibInstanceAccess().getMDriverSLibInstanceAction_0(),
            $current);
    }
)	otherlv_1='driver' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMDriverSLibInstanceAccess().getDriverKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDriverSLibInstanceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_5='attribute' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMDriverSLibInstanceAccess().getAttributeKeyword_4_0_0());
    }
	otherlv_6='values' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMDriverSLibInstanceAccess().getValuesKeyword_4_0_1());
    }
	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); 
	    }
		lv_attributeValueAssignments_8_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSLibInstanceRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_8_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4());
    }
	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_11='device' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMDriverSLibInstanceAccess().getDeviceKeyword_4_1_0());
    }
	otherlv_12='mappings' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMDriverSLibInstanceAccess().getMappingsKeyword_4_1_1());
    }
	otherlv_13='{' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsMDeviceDriverMappingParserRuleCall_4_1_3_0()); 
	    }
		lv_deviceDriverMappings_14_0=ruleMDeviceDriverMapping		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDriverSLibInstanceRule());
	        }
       		add(
       			$current, 
       			"deviceDriverMappings",
        		lv_deviceDriverMappings_14_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeviceDriverMapping");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4());
    }
	otherlv_16=';' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());
	}

)	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDeviceDriverMapping
entryRuleMDeviceDriverMapping returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMDeviceDriverMappingRule()); }
	 iv_ruleMDeviceDriverMapping=ruleMDeviceDriverMapping 
	 { $current=$iv_ruleMDeviceDriverMapping.current; } 
	 EOF 
;

// Rule MDeviceDriverMapping
ruleMDeviceDriverMapping returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='supported' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMDeviceDriverMappingAccess().getSupportedKeyword_0());
    }
	otherlv_1='device' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeviceDriverMappingRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='->' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
    }
	otherlv_4='deployed' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMDeviceDriverMappingAccess().getDeployedKeyword_4());
    }
	otherlv_5='device' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_5());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeviceDriverMappingRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMDeviceDriverMappingAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMDeploymentAlternative
entryRuleMDeploymentAlternative returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMDeploymentAlternativeRule()); }
	 iv_ruleMDeploymentAlternative=ruleMDeploymentAlternative 
	 { $current=$iv_ruleMDeploymentAlternative.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MDeploymentAlternative
ruleMDeploymentAlternative returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMDeploymentAlternativeAccess().getMDeploymentAlternativeAction_0(),
            $current);
    }
)	otherlv_1='deployment' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_1());
    }
	otherlv_2='alternative' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMDeploymentAlternativeAccess().getAlternativeKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMDeploymentAlternativeAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeploymentAlternativeRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='deployment' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_0_0());
    }
	otherlv_7='platforms' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMDeploymentAlternativeAccess().getPlatformsKeyword_5_0_1());
    }
	otherlv_8=':=' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMDeploymentAlternativeAccess().getColonEqualsSignKeyword_5_0_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeploymentAlternativeRule());
	        }
        }
	otherlv_9=RULE_ID
	{
		newLeafNode(otherlv_9, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0()); 
	}

)
)(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMDeploymentAlternativeAccess().getCommaKeyword_5_0_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeploymentAlternativeRule());
	        }
        }
	otherlv_11=RULE_ID
	{
		newLeafNode(otherlv_11, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0()); 
	}

)
))*	otherlv_12=';' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_0_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_13='attribute' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMDeploymentAlternativeAccess().getAttributeKeyword_5_1_0());
    }
	otherlv_14='values' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMDeploymentAlternativeAccess().getValuesKeyword_5_1_1());
    }
	otherlv_15='{' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); 
	    }
		lv_attributeValueAssignments_16_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_16_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_1_4());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_19='deployment' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_2_0());
    }
	otherlv_20='alternatives' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMDeploymentAlternativeAccess().getAlternativesKeyword_5_2_1());
    }
	otherlv_21='{' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_2_3_0()); 
	    }
		lv_deploymentAlternatives_22_0=ruleMDeploymentAlternative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
	        }
       		add(
       			$current, 
       			"deploymentAlternatives",
        		lv_deploymentAlternatives_22_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeploymentAlternative");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_23='}' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_2_4());
    }
	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_25='components' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMDeploymentAlternativeAccess().getComponentsKeyword_5_3_0());
    }
	otherlv_26='{' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getComponentsMComponentInstanceParserRuleCall_5_3_2_0()); 
	    }
		lv_components_27_0=ruleMComponentInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
	        }
       		add(
       			$current, 
       			"components",
        		lv_components_27_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MComponentInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_28='}' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_3_3());
    }
	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_3_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_30='connections' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMDeploymentAlternativeAccess().getConnectionsKeyword_5_4_0());
    }
	otherlv_31='{' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsMConnectionParserRuleCall_5_4_2_0()); 
	    }
		lv_connections_32_0=ruleMConnection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
	        }
       		add(
       			$current, 
       			"connections",
        		lv_connections_32_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MConnection");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_33='}' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_4_3());
    }
	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_4_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_35='libraries' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMDeploymentAlternativeAccess().getLibrariesKeyword_5_5_0());
    }
	otherlv_36='{' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_5_2_0()); 
	    }
		lv_libraries_37_0=ruleMServiceLibraryInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
	        }
       		add(
       			$current, 
       			"libraries",
        		lv_libraries_37_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MServiceLibraryInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_38='}' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_5_3());
    }
	otherlv_39=';' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_5_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	}

)	otherlv_40='}' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_41=';' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDeploymentPlatform
entryRuleMDeploymentPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMDeploymentPlatformRule()); }
	 iv_ruleMDeploymentPlatform=ruleMDeploymentPlatform 
	 { $current=$iv_ruleMDeploymentPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MDeploymentPlatform
ruleMDeploymentPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='deployment' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMDeploymentPlatformAccess().getDeploymentKeyword_0());
    }
	otherlv_1='platform' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeploymentPlatformRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_5='platform' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_4_0_0());
    }
	otherlv_6=':=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeploymentPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_9='deployed' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMDeploymentPlatformAccess().getDeployedKeyword_4_1_0());
    }
	otherlv_10='devices' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMDeploymentPlatformAccess().getDevicesKeyword_4_1_1());
    }
	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesMDeployedDeviceParserRuleCall_4_1_3_0()); 
	    }
		lv_deployedDevices_12_0=ruleMDeployedDevice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeploymentPlatformRule());
	        }
       		add(
       			$current, 
       			"deployedDevices",
        		lv_deployedDevices_12_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeployedDevice");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_1_4());
    }
	otherlv_14=';' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_15='parameter' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMDeploymentPlatformAccess().getParameterKeyword_4_2_0());
    }
	otherlv_16='values' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMDeploymentPlatformAccess().getValuesKeyword_4_2_1());
    }
	otherlv_17='{' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_2_3_0()); 
	    }
		lv_parameterValueAssignments_18_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeploymentPlatformRule());
	        }
       		add(
       			$current, 
       			"parameterValueAssignments",
        		lv_parameterValueAssignments_18_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_19='}' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4());
    }
	otherlv_20=';' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());
	}

)	otherlv_21='}' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_22=';' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDeployedDevice
entryRuleMDeployedDevice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMDeployedDeviceRule()); }
	 iv_ruleMDeployedDevice=ruleMDeployedDevice 
	 { $current=$iv_ruleMDeployedDevice.current; } 
	 EOF 
;

// Rule MDeployedDevice
ruleMDeployedDevice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='device' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMDeployedDeviceAccess().getDeviceKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeployedDeviceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeployedDeviceRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMDeployedDeviceAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); 
	    }
		lv_parameterValueAssignments_4_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeployedDeviceRule());
	        }
       		add(
       			$current, 
       			"parameterValueAssignments",
        		lv_parameterValueAssignments_4_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMDeployedDeviceAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMDeployedDeviceAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMAttributeValueAssignment
entryRuleMAttributeValueAssignment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMAttributeValueAssignmentRule()); }
	 iv_ruleMAttributeValueAssignment=ruleMAttributeValueAssignment 
	 { $current=$iv_ruleMAttributeValueAssignment.current; } 
	 EOF 
;

// Rule MAttributeValueAssignment
ruleMAttributeValueAssignment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='attribute' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMAttributeValueAssignmentAccess().getAttributeKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAttributeValueAssignmentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAttributeValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMAttributeValueAssignmentAccess().getColonEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_parameterValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAttributeValueAssignmentRule());
	        }
       		set(
       			$current, 
       			"parameterValue",
        		lv_parameterValue_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMAttributeValueAssignmentAccess().getSemicolonKeyword_4());
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMParameterValueAssignmentAccess().getSemicolonKeyword_4());
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.EBoolean");
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.INTEGER");
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.REAL");
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpressionOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValue");
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueTERMOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueTERM");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
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


