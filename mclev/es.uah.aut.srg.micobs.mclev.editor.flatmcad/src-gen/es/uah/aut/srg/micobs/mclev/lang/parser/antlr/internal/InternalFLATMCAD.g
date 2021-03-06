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
grammar InternalFLATMCAD;

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
import es.uah.aut.srg.micobs.mclev.lang.services.FLATMCADGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private FLATMCADGrammarAccess grammarAccess;
 	
    public InternalFLATMCADParser(TokenStream input, FLATMCADGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MMCLEVFLATMCADPackageFile";	
   	}
   	
   	@Override
   	protected FLATMCADGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMMCLEVFLATMCADPackageFile
entryRuleMMCLEVFLATMCADPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageFileRule()); }
	 iv_ruleMMCLEVFLATMCADPackageFile=ruleMMCLEVFLATMCADPackageFile 
	 { $current=$iv_ruleMMCLEVFLATMCADPackageFile.current; } 
	 EOF 
;

// Rule MMCLEVFLATMCADPackageFile
ruleMMCLEVFLATMCADPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVFLATMCADPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVFLATMCADPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getElementMMCLEVFLATMCADPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMMCLEVFLATMCADPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCLEVFLATMCADPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MMCLEVFLATMCADPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMMCLEVFLATMCADPackageElement
entryRuleMMCLEVFLATMCADPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageElementRule()); }
	 iv_ruleMMCLEVFLATMCADPackageElement=ruleMMCLEVFLATMCADPackageElement 
	 { $current=$iv_ruleMMCLEVFLATMCADPackageElement.current; } 
	 EOF 
;

// Rule MMCLEVFLATMCADPackageElement
ruleMMCLEVFLATMCADPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageElementAccess().getMFlatMCADParserRuleCall()); 
    }
    this_MFlatMCAD_0=ruleMFlatMCAD
    { 
        $current = $this_MFlatMCAD_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleMFlatMCAD
entryRuleMFlatMCAD returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMFlatMCADRule()); }
	 iv_ruleMFlatMCAD=ruleMFlatMCAD 
	 { $current=$iv_ruleMFlatMCAD.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MFlatMCAD
ruleMFlatMCAD returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='flat' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMFlatMCADAccess().getFlatKeyword_0());
    }
	otherlv_1='mcad' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMFlatMCADAccess().getMcadKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMFlatMCADAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatMCADRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_5='version' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMFlatMCADAccess().getVersionKeyword_4_0_0());
    }
	otherlv_6=':=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatMCADAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
	    }
		lv_version_7_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatMCADRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_7_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_9='deployment' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_4_1_0());
    }
	otherlv_10='project' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMFlatMCADAccess().getProjectKeyword_4_1_1());
    }
	otherlv_11=':=' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_4_1_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatMCADRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMFlatMCADAccess().getReferencedElementMMCADeploymentCrossReference_4_1_3_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_14='deployment' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_4_2_0());
    }
	otherlv_15='targets' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMFlatMCADAccess().getTargetsKeyword_4_2_1());
    }
	otherlv_16='{' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_4_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatMCADAccess().getTargetsMFlatMCADTargetParserRuleCall_4_2_3_0()); 
	    }
		lv_targets_17_0=ruleMFlatMCADTarget		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatMCADRule());
	        }
       		add(
       			$current, 
       			"targets",
        		lv_targets_17_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatMCADTarget");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_18='}' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_4_2_4());
    }
	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());
	}

)	otherlv_20='}' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMFlatMCADTarget
entryRuleMFlatMCADTarget returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 
			grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMFlatMCADTargetRule()); }
	 iv_ruleMFlatMCADTarget=ruleMFlatMCADTarget 
	 { $current=$iv_ruleMFlatMCADTarget.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MFlatMCADTarget
ruleMFlatMCADTarget returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 
			grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='target' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMFlatMCADTargetAccess().getTargetKeyword_0());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0);
	 				}
					({true}?=>(	otherlv_2='platform' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMFlatMCADTargetAccess().getPlatformKeyword_1_0_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatMCADTargetRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0()); 
	}

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1);
	 				}
					({true}?=>(	otherlv_4='alternative' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMFlatMCADTargetAccess().getAlternativeKeyword_1_1_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatMCADTargetRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());
	}

)	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_2());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(	otherlv_8='attribute' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMFlatMCADTargetAccess().getAttributeKeyword_3_0_0());
    }
	otherlv_9='values' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMFlatMCADTargetAccess().getValuesKeyword_3_0_1());
    }
	otherlv_10='{' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_0_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0_3_0()); 
	    }
		lv_attributeValueAssignments_11_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatMCADTargetRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_11_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_0_4());
    }
	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_0_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(	otherlv_14='components' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMFlatMCADTargetAccess().getComponentsKeyword_3_1_0());
    }
	otherlv_15='{' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getComponentsMFlatComponentInstanceParserRuleCall_3_1_2_0()); 
	    }
		lv_components_16_0=ruleMFlatComponentInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatMCADTargetRule());
	        }
       		add(
       			$current, 
       			"components",
        		lv_components_16_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatComponentInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_1_3());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2);
	 				}
					({true}?=>(	otherlv_19='connections' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMFlatMCADTargetAccess().getConnectionsKeyword_3_2_0());
    }
	otherlv_20='{' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getConnectionsMFlatConnectionParserRuleCall_3_2_2_0()); 
	    }
		lv_connections_21_0=ruleMFlatConnection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatMCADTargetRule());
	        }
       		add(
       			$current, 
       			"connections",
        		lv_connections_21_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatConnection");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_22='}' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_2_3());
    }
	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3);
	 				}
					({true}?=>(	otherlv_24='libraries' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMFlatMCADTargetAccess().getLibrariesKeyword_3_3_0());
    }
	otherlv_25='{' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getLibrariesMFlatServiceLibraryInstanceParserRuleCall_3_3_2_0()); 
	    }
		lv_libraries_26_0=ruleMFlatServiceLibraryInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatMCADTargetRule());
	        }
       		add(
       			$current, 
       			"libraries",
        		lv_libraries_26_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatServiceLibraryInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_27='}' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_3_3());
    }
	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_3_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
	}

)	otherlv_29='}' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_30=';' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_5());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





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





// Entry rule entryRuleMFlatConnection
entryRuleMFlatConnection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMFlatConnectionRule()); }
	 iv_ruleMFlatConnection=ruleMFlatConnection 
	 { $current=$iv_ruleMFlatConnection.current; } 
	 EOF 
;

// Rule MFlatConnection
ruleMFlatConnection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMFlatConnectionAccess().getMFlatConnectionAction_0(),
            $current);
    }
)	otherlv_1='connection' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMFlatConnectionAccess().getConnectionKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatConnectionRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getMFlatConnectionAccess().getClientInstanceMFlatComponentInstanceCrossReference_2_0()); 
	}

)
)	otherlv_3='.' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatConnectionRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getMFlatConnectionAccess().getClientPortMClientPortCrossReference_4_0()); 
	}

)
)	otherlv_5='<->' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMFlatConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatConnectionRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getMFlatConnectionAccess().getServerInstanceMFlatComponentInstanceCrossReference_6_0()); 
	}

)
)	otherlv_7='.' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_7());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatConnectionRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getMFlatConnectionAccess().getServerPortMServerPortCrossReference_8_0()); 
	}

)
)	otherlv_9='using' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMFlatConnectionAccess().getUsingKeyword_9());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatConnectionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMFlatConnectionAccess().getConnectorMConnectorCrossReference_10_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMFlatConnectionAccess().getLeftCurlyBracketKeyword_11());
    }
(	otherlv_12='mapping' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMFlatConnectionAccess().getMappingKeyword_12_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMFlatConnectionAccess().getColonEqualsSignKeyword_12_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatConnectionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMFlatConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_12_3());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0()); 
	    }
		lv_attributeValueAssignments_16_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatConnectionRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_16_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMFlatConnectionAccess().getRightCurlyBracketKeyword_14());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_15());
    }
)
;





// Entry rule entryRuleMFlatComponentInstance
entryRuleMFlatComponentInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMFlatComponentInstanceRule()); }
	 iv_ruleMFlatComponentInstance=ruleMFlatComponentInstance 
	 { $current=$iv_ruleMFlatComponentInstance.current; } 
	 EOF 
;

// Rule MFlatComponentInstance
ruleMFlatComponentInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMFlatComponentInstanceAccess().getMFlatComponentInstanceAction_0(),
            $current);
    }
)	otherlv_1='instance' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMFlatComponentInstanceAccess().getInstanceKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatComponentInstanceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMFlatComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMFlatComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatComponentInstanceRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMFlatComponentInstanceAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0()); 
	    }
		lv_attributeValueAssignments_5_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatComponentInstanceRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_5_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMFlatComponentInstanceAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMFlatComponentInstanceAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMFlatServiceLibraryInstance
entryRuleMFlatServiceLibraryInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMFlatServiceLibraryInstanceRule()); }
	 iv_ruleMFlatServiceLibraryInstance=ruleMFlatServiceLibraryInstance 
	 { $current=$iv_ruleMFlatServiceLibraryInstance.current; } 
	 EOF 
;

// Rule MFlatServiceLibraryInstance
ruleMFlatServiceLibraryInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMFlatServiceLibraryInstanceAccess().getMRegularFlatServiceLibraryInstanceParserRuleCall_0()); 
    }
    this_MRegularFlatServiceLibraryInstance_0=ruleMRegularFlatServiceLibraryInstance
    { 
        $current = $this_MRegularFlatServiceLibraryInstance_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMFlatServiceLibraryInstanceAccess().getMFlatDriverSLibInstanceParserRuleCall_1()); 
    }
    this_MFlatDriverSLibInstance_1=ruleMFlatDriverSLibInstance
    { 
        $current = $this_MFlatDriverSLibInstance_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMRegularFlatServiceLibraryInstance
entryRuleMRegularFlatServiceLibraryInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMRegularFlatServiceLibraryInstanceRule()); }
	 iv_ruleMRegularFlatServiceLibraryInstance=ruleMRegularFlatServiceLibraryInstance 
	 { $current=$iv_ruleMRegularFlatServiceLibraryInstance.current; } 
	 EOF 
;

// Rule MRegularFlatServiceLibraryInstance
ruleMRegularFlatServiceLibraryInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='library' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRegularFlatServiceLibraryInstanceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0()); 
	    }
		lv_attributeValueAssignments_3_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRegularFlatServiceLibraryInstanceRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMFlatDriverSLibInstance
entryRuleMFlatDriverSLibInstance returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceRule()); }
	 iv_ruleMFlatDriverSLibInstance=ruleMFlatDriverSLibInstance 
	 { $current=$iv_ruleMFlatDriverSLibInstance.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MFlatDriverSLibInstance
ruleMFlatDriverSLibInstance returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMFlatDriverSLibInstanceAccess().getMFlatDriverSLibInstanceAction_0(),
            $current);
    }
)	otherlv_1='driver' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMFlatDriverSLibInstanceAccess().getDriverKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatDriverSLibInstanceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_5='attribute' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeKeyword_4_0_0());
    }
	otherlv_6='values' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMFlatDriverSLibInstanceAccess().getValuesKeyword_4_0_1());
    }
	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); 
	    }
		lv_attributeValueAssignments_8_0=ruleMAttributeValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatDriverSLibInstanceRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_8_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4());
    }
	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_11='device' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceKeyword_4_1_0());
    }
	otherlv_12='mappings' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMFlatDriverSLibInstanceAccess().getMappingsKeyword_4_1_1());
    }
	otherlv_13='{' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsMFlatDeviceDriverMappingParserRuleCall_4_1_3_0()); 
	    }
		lv_deviceDriverMappings_14_0=ruleMFlatDeviceDriverMapping		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMFlatDriverSLibInstanceRule());
	        }
       		add(
       			$current, 
       			"deviceDriverMappings",
        		lv_deviceDriverMappings_14_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatDeviceDriverMapping");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4());
    }
	otherlv_16=';' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());
	}

)	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMFlatDeviceDriverMapping
entryRuleMFlatDeviceDriverMapping returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMFlatDeviceDriverMappingRule()); }
	 iv_ruleMFlatDeviceDriverMapping=ruleMFlatDeviceDriverMapping 
	 { $current=$iv_ruleMFlatDeviceDriverMapping.current; } 
	 EOF 
;

// Rule MFlatDeviceDriverMapping
ruleMFlatDeviceDriverMapping returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='supported' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedKeyword_0());
    }
	otherlv_1='device' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatDeviceDriverMappingRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='->' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMFlatDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
    }
	otherlv_4='deployed' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedKeyword_4());
    }
	otherlv_5='device' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_5());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMFlatDeviceDriverMappingRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMFlatDeviceDriverMappingAccess().getSemicolonKeyword_7());
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMAttributeValueAssignmentAccess().getSemicolonKeyword_4());
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.EBoolean");
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.INTEGER");
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.REAL");
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpressionOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValue");
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueTERMOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueTERM");
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


