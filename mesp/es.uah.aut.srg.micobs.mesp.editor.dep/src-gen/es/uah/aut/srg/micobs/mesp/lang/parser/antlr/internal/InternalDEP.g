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
grammar InternalDEP;

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
import es.uah.aut.srg.micobs.mesp.lang.services.DEPGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private DEPGrammarAccess grammarAccess;
 	
    public InternalDEPParser(TokenStream input, DEPGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MMESPDEPPackageFile";	
   	}
   	
   	@Override
   	protected DEPGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMMESPDEPPackageFile
entryRuleMMESPDEPPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPDEPPackageFileRule()); }
	 iv_ruleMMESPDEPPackageFile=ruleMMESPDEPPackageFile 
	 { $current=$iv_ruleMMESPDEPPackageFile.current; } 
	 EOF 
;

// Rule MMESPDEPPackageFile
ruleMMESPDEPPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMESPDEPPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDEPPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDEPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMESPDEPPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDEPPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDEPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDEPPackageFileAccess().getElementMMESPDEPPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMMESPDEPPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDEPPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MMESPDEPPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMMESPDEPPackageElement
entryRuleMMESPDEPPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPDEPPackageElementRule()); }
	 iv_ruleMMESPDEPPackageElement=ruleMMESPDEPPackageElement 
	 { $current=$iv_ruleMMESPDEPPackageElement.current; } 
	 EOF 
;

// Rule MMESPDEPPackageElement
ruleMMESPDEPPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMESPDEPPackageElementAccess().getMMESPDeploymentParserRuleCall()); 
    }
    this_MMESPDeployment_0=ruleMMESPDeployment
    { 
        $current = $this_MMESPDeployment_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleMMESPDeployment
entryRuleMMESPDeployment returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMMESPDeploymentRule()); }
	 iv_ruleMMESPDeployment=ruleMMESPDeployment 
	 { $current=$iv_ruleMMESPDeployment.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MMESPDeployment
ruleMMESPDeployment returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMMESPDeploymentAccess().getMMESPDeploymentAction_0(),
            $current);
    }
)	otherlv_1='deployment' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_1());
    }
	otherlv_2='project' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMESPDeploymentAccess().getProjectKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMMESPDeploymentAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='version' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMMESPDeploymentAccess().getVersionKeyword_5_0_0());
    }
	otherlv_7=':=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
	    }
		lv_version_8_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_8_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_10='construction' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMMESPDeploymentAccess().getConstructionKeyword_5_1_0());
    }
	otherlv_11='tool' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMMESPDeploymentAccess().getToolKeyword_5_1_1());
    }
	otherlv_12=':=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_1_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getCtoolMConstructionToolCrossReference_5_1_3_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_14=';' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_15='languages' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMMESPDeploymentAccess().getLanguagesKeyword_5_2_0());
    }
	otherlv_16=':=' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_2_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_18=',' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMMESPDeploymentAccess().getCommaKeyword_5_2_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_20=';' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_21='deployment' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_3_0());
    }
	otherlv_22='platforms' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMMESPDeploymentAccess().getPlatformsKeyword_5_3_1());
    }
	otherlv_23='{' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsMMESPDeploymentPlatformParserRuleCall_5_3_3_0()); 
	    }
		lv_deploymentPlatforms_24_0=ruleMMESPDeploymentPlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
	        }
       		add(
       			$current, 
       			"deploymentPlatforms",
        		lv_deploymentPlatforms_24_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MMESPDeploymentPlatform");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_25='}' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_3_4());
    }
	otherlv_26=';' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_27='required' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMMESPDeploymentAccess().getRequiredKeyword_5_4_0());
    }
	otherlv_28='interfaces' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMMESPDeploymentAccess().getInterfacesKeyword_5_4_1());
    }
	otherlv_29='{' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_4_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_4_3_0()); 
	    }
		lv_requires_30_0=ruleMSwPackageRequiredInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
	        }
       		add(
       			$current, 
       			"requires",
        		lv_requires_30_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MSwPackageRequiredInterface");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_31='}' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_4_4());
    }
	otherlv_32=';' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_4_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_33='swpackages' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMMESPDeploymentAccess().getSwpackagesKeyword_5_5_0());
    }
	otherlv_34='{' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_5_5_2_0()); 
	    }
		lv_deployedSwPackages_35_0=ruleMMESPSwPackageDeployment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
	        }
       		add(
       			$current, 
       			"deployedSwPackages",
        		lv_deployedSwPackages_35_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MMESPSwPackageDeployment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_36='}' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_5_3());
    }
	otherlv_37=';' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_5_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_38='deployment' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_6_0());
    }
	otherlv_39='alternatives' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMMESPDeploymentAccess().getAlternativesKeyword_5_6_1());
    }
	otherlv_40='{' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_6_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_5_6_3_0()); 
	    }
		lv_deploymentAlternatives_41_0=ruleMMESPDeploymentAlternative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
	        }
       		add(
       			$current, 
       			"deploymentAlternatives",
        		lv_deploymentAlternatives_41_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MMESPDeploymentAlternative");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_42='}' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_6_4());
    }
	otherlv_43=';' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_6_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	}

)	otherlv_44='}' 
    {
    	newLeafNode(otherlv_44, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_45=';' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MResourceDemand");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueAssignment");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMQuantifiableResourceDemandAccess().getSemicolonKeyword_6());
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





// Entry rule entryRuleMMESPSwPackageDeployment
entryRuleMMESPSwPackageDeployment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPSwPackageDeploymentRule()); }
	 iv_ruleMMESPSwPackageDeployment=ruleMMESPSwPackageDeployment 
	 { $current=$iv_ruleMMESPSwPackageDeployment.current; } 
	 EOF 
;

// Rule MMESPSwPackageDeployment
ruleMMESPSwPackageDeployment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPRegularSwPackageDeploymentParserRuleCall_0()); 
    }
    this_MMESPRegularSwPackageDeployment_0=ruleMMESPRegularSwPackageDeployment
    { 
        $current = $this_MMESPRegularSwPackageDeployment_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentParserRuleCall_1()); 
    }
    this_MMESPDriverSwPackageDeployment_1=ruleMMESPDriverSwPackageDeployment
    { 
        $current = $this_MMESPDriverSwPackageDeployment_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMMESPRegularSwPackageDeployment
entryRuleMMESPRegularSwPackageDeployment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPRegularSwPackageDeploymentRule()); }
	 iv_ruleMMESPRegularSwPackageDeployment=ruleMMESPRegularSwPackageDeployment 
	 { $current=$iv_ruleMMESPRegularSwPackageDeployment.current; } 
	 EOF 
;

// Rule MMESPRegularSwPackageDeployment
ruleMMESPRegularSwPackageDeployment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getMMESPSwPackageDeploymentAction_0(),
            $current);
    }
)	otherlv_1='swpackage' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwpackageKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPRegularSwPackageDeploymentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageMSwPackageCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); 
	    }
		lv_parameterValueAssignments_4_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPRegularSwPackageDeploymentRule());
	        }
       		add(
       			$current, 
       			"parameterValueAssignments",
        		lv_parameterValueAssignments_4_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMMESPDriverSwPackageDeployment
entryRuleMMESPDriverSwPackageDeployment returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentRule()); }
	 iv_ruleMMESPDriverSwPackageDeployment=ruleMMESPDriverSwPackageDeployment 
	 { $current=$iv_ruleMMESPDriverSwPackageDeployment.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MMESPDriverSwPackageDeployment
ruleMMESPDriverSwPackageDeployment returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentAction_0(),
            $current);
    }
)	otherlv_1='driver' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDriverKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDriverSwPackageDeploymentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageMDriverSwPackageCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_5='parameter' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterKeyword_4_0_0());
    }
	otherlv_6='values' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getValuesKeyword_4_0_1());
    }
	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_0_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0_3_0()); 
	    }
		lv_parameterValueAssignments_8_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDriverSwPackageDeploymentRule());
	        }
       		add(
       			$current, 
       			"parameterValueAssignments",
        		lv_parameterValueAssignments_8_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_0_4());
    }
	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_0_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_11='device' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceKeyword_4_1_0());
    }
	otherlv_12='mappings' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMappingsKeyword_4_1_1());
    }
	otherlv_13='{' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsMMESPDeviceDriverMappingParserRuleCall_4_1_3_0()); 
	    }
		lv_deviceDriverMappings_14_0=ruleMMESPDeviceDriverMapping		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDriverSwPackageDeploymentRule());
	        }
       		add(
       			$current, 
       			"deviceDriverMappings",
        		lv_deviceDriverMappings_14_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MMESPDeviceDriverMapping");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_1_4());
    }
	otherlv_16=';' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());
	}

)	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMMESPDeviceDriverMapping
entryRuleMMESPDeviceDriverMapping returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPDeviceDriverMappingRule()); }
	 iv_ruleMMESPDeviceDriverMapping=ruleMMESPDeviceDriverMapping 
	 { $current=$iv_ruleMMESPDeviceDriverMapping.current; } 
	 EOF 
;

// Rule MMESPDeviceDriverMapping
ruleMMESPDeviceDriverMapping returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='supported' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedKeyword_0());
    }
	otherlv_1='device' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeviceDriverMappingRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='->' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMESPDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
    }
	otherlv_4='deployed' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedKeyword_4());
    }
	otherlv_5='device' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_5());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeviceDriverMappingRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceMMESPDeployedDeviceCrossReference_6_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMMESPDeviceDriverMappingAccess().getSemicolonKeyword_7());
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.EBoolean");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.INTEGER");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.REAL");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueExpressionOperators");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValue");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueTERMOperators");
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
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueTERM");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleMMESPDeploymentPlatform
entryRuleMMESPDeploymentPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMMESPDeploymentPlatformRule()); }
	 iv_ruleMMESPDeploymentPlatform=ruleMMESPDeploymentPlatform 
	 { $current=$iv_ruleMMESPDeploymentPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MMESPDeploymentPlatform
ruleMMESPDeploymentPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='deployment' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMESPDeploymentPlatformAccess().getDeploymentKeyword_0());
    }
	otherlv_1='platform' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMMESPDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentPlatformRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_5='platform' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_4_0_0());
    }
	otherlv_6=':=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_9='pswpackage' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMMESPDeploymentPlatformAccess().getPswpackageKeyword_4_1_0());
    }
	otherlv_10=':=' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_12=';' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_13='deployed' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedKeyword_4_2_0());
    }
	otherlv_14='devices' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMMESPDeploymentPlatformAccess().getDevicesKeyword_4_2_1());
    }
	otherlv_15='{' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesMMESPDeployedDeviceParserRuleCall_4_2_3_0()); 
	    }
		lv_deployedDevices_16_0=ruleMMESPDeployedDevice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentPlatformRule());
	        }
       		add(
       			$current, 
       			"deployedDevices",
        		lv_deployedDevices_16_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MMESPDeployedDevice");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3);
	 				}
					({true}?=>(	otherlv_19='parameter' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMMESPDeploymentPlatformAccess().getParameterKeyword_4_3_0());
    }
	otherlv_20='values' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMMESPDeploymentPlatformAccess().getValuesKeyword_4_3_1());
    }
	otherlv_21='{' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_3_3_0()); 
	    }
		lv_parameterValueAssignments_22_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentPlatformRule());
	        }
       		add(
       			$current, 
       			"parameterValueAssignments",
        		lv_parameterValueAssignments_22_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_23='}' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_3_4());
    }
	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
	}

)	otherlv_25='}' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_26=';' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMMESPDeployedDevice
entryRuleMMESPDeployedDevice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPDeployedDeviceRule()); }
	 iv_ruleMMESPDeployedDevice=ruleMMESPDeployedDevice 
	 { $current=$iv_ruleMMESPDeployedDevice.current; } 
	 EOF 
;

// Rule MMESPDeployedDevice
ruleMMESPDeployedDevice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='device' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMESPDeployedDeviceAccess().getDeviceKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeployedDeviceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMMESPDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeployedDeviceRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMMESPDeployedDeviceAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); 
	    }
		lv_parameterValueAssignments_4_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeployedDeviceRule());
	        }
       		add(
       			$current, 
       			"parameterValueAssignments",
        		lv_parameterValueAssignments_4_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPDeployedDeviceAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMMESPDeployedDeviceAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMMESPDeploymentAlternative
entryRuleMMESPDeploymentAlternative returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeRule()); }
	 iv_ruleMMESPDeploymentAlternative=ruleMMESPDeploymentAlternative 
	 { $current=$iv_ruleMMESPDeploymentAlternative.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MMESPDeploymentAlternative
ruleMMESPDeploymentAlternative returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='deployment' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_0());
    }
	otherlv_1='alternative' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativeKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMMESPDeploymentAlternativeAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_5='deployment' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_0_0());
    }
	otherlv_6='platforms' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMMESPDeploymentAlternativeAccess().getPlatformsKeyword_4_0_1());
    }
	otherlv_7=':=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_0_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0()); 
	}

)
)(	otherlv_9=',' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_0_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0()); 
	}

)
))*	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_0_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_12='languages' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesKeyword_4_1_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_15=',' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_18='swpackages' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMMESPDeploymentAlternativeAccess().getSwpackagesKeyword_4_2_0());
    }
	otherlv_19='{' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_4_2_2_0()); 
	    }
		lv_deployedSwPackages_20_0=ruleMMESPSwPackageDeployment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentAlternativeRule());
	        }
       		add(
       			$current, 
       			"deployedSwPackages",
        		lv_deployedSwPackages_20_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MMESPSwPackageDeployment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_21='}' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_2_3());
    }
	otherlv_22=';' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3);
	 				}
					({true}?=>(	otherlv_23='required' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiredKeyword_4_3_0());
    }
	otherlv_24='interfaces' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMMESPDeploymentAlternativeAccess().getInterfacesKeyword_4_3_1());
    }
	otherlv_25='{' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_4_3_3_0()); 
	    }
		lv_requires_26_0=ruleMSwPackageRequiredInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentAlternativeRule());
	        }
       		add(
       			$current, 
       			"requires",
        		lv_requires_26_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MSwPackageRequiredInterface");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_27='}' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_3_4());
    }
	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4);
	 				}
					({true}?=>(	otherlv_29='deployment' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_4_0());
    }
	otherlv_30='alternatives' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativesKeyword_4_4_1());
    }
	otherlv_31='{' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_4_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_4_4_3_0()); 
	    }
		lv_deploymentAlternatives_32_0=ruleMMESPDeploymentAlternative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPDeploymentAlternativeRule());
	        }
       		add(
       			$current, 
       			"deploymentAlternatives",
        		lv_deploymentAlternatives_32_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.DEP.MMESPDeploymentAlternative");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_33='}' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_4_4());
    }
	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_4_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
	}

)	otherlv_35='}' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_36=';' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_6());
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


