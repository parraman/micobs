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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFLATMCADParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'flat'", "'mcad'", "'{'", "'version'", "':='", "'deployment'", "'project'", "'targets'", "'}'", "'target'", "'platform'", "'alternative'", "'attribute'", "'values'", "'components'", "'connections'", "'libraries'", "'.'", "'('", "')'", "'::'", "'connection'", "'<->'", "'using'", "'mapping'", "'instance'", "'library'", "'driver'", "'device'", "'mappings'", "'supported'", "'->'", "'deployed'", "'raw'", "'true'", "'false'", "'-'", "'e'", "'+'", "'*'", "'/'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_HEXADECIMAL=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFLATMCADParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFLATMCADParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFLATMCADParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFLATMCAD.g"; }



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



    // $ANTLR start "entryRuleMMCLEVFLATMCADPackageFile"
    // InternalFLATMCAD.g:75:1: entryRuleMMCLEVFLATMCADPackageFile returns [EObject current=null] : iv_ruleMMCLEVFLATMCADPackageFile= ruleMMCLEVFLATMCADPackageFile EOF ;
    public final EObject entryRuleMMCLEVFLATMCADPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVFLATMCADPackageFile = null;


        try {
            // InternalFLATMCAD.g:76:2: (iv_ruleMMCLEVFLATMCADPackageFile= ruleMMCLEVFLATMCADPackageFile EOF )
            // InternalFLATMCAD.g:77:2: iv_ruleMMCLEVFLATMCADPackageFile= ruleMMCLEVFLATMCADPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMCLEVFLATMCADPackageFile=ruleMMCLEVFLATMCADPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVFLATMCADPackageFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMMCLEVFLATMCADPackageFile"


    // $ANTLR start "ruleMMCLEVFLATMCADPackageFile"
    // InternalFLATMCAD.g:84:1: ruleMMCLEVFLATMCADPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVFLATMCADPackageElement ) ) ) ;
    public final EObject ruleMMCLEVFLATMCADPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:87:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVFLATMCADPackageElement ) ) ) )
            // InternalFLATMCAD.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVFLATMCADPackageElement ) ) )
            {
            // InternalFLATMCAD.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVFLATMCADPackageElement ) ) )
            // InternalFLATMCAD.g:88:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVFLATMCADPackageElement ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageKeyword_0());
                  
            }
            // InternalFLATMCAD.g:92:1: ( ( ruleQualifiedName ) )
            // InternalFLATMCAD.g:93:1: ( ruleQualifiedName )
            {
            // InternalFLATMCAD.g:93:1: ( ruleQualifiedName )
            // InternalFLATMCAD.g:94:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMCLEVFLATMCADPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // InternalFLATMCAD.g:114:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFLATMCAD.g:114:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // InternalFLATMCAD.g:118:1: ( ( ruleQualifiedName ) )
            	    // InternalFLATMCAD.g:119:1: ( ruleQualifiedName )
            	    {
            	    // InternalFLATMCAD.g:119:1: ( ruleQualifiedName )
            	    // InternalFLATMCAD.g:120:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMCLEVFLATMCADPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFLATMCAD.g:140:3: ( (lv_element_6_0= ruleMMCLEVFLATMCADPackageElement ) )
            // InternalFLATMCAD.g:141:1: (lv_element_6_0= ruleMMCLEVFLATMCADPackageElement )
            {
            // InternalFLATMCAD.g:141:1: (lv_element_6_0= ruleMMCLEVFLATMCADPackageElement )
            // InternalFLATMCAD.g:142:3: lv_element_6_0= ruleMMCLEVFLATMCADPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getElementMMCLEVFLATMCADPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_6_0=ruleMMCLEVFLATMCADPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMCLEVFLATMCADPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MMCLEVFLATMCADPackageElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMMCLEVFLATMCADPackageFile"


    // $ANTLR start "entryRuleMMCLEVFLATMCADPackageElement"
    // InternalFLATMCAD.g:166:1: entryRuleMMCLEVFLATMCADPackageElement returns [EObject current=null] : iv_ruleMMCLEVFLATMCADPackageElement= ruleMMCLEVFLATMCADPackageElement EOF ;
    public final EObject entryRuleMMCLEVFLATMCADPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVFLATMCADPackageElement = null;


        try {
            // InternalFLATMCAD.g:167:2: (iv_ruleMMCLEVFLATMCADPackageElement= ruleMMCLEVFLATMCADPackageElement EOF )
            // InternalFLATMCAD.g:168:2: iv_ruleMMCLEVFLATMCADPackageElement= ruleMMCLEVFLATMCADPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMCLEVFLATMCADPackageElement=ruleMMCLEVFLATMCADPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVFLATMCADPackageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMMCLEVFLATMCADPackageElement"


    // $ANTLR start "ruleMMCLEVFLATMCADPackageElement"
    // InternalFLATMCAD.g:175:1: ruleMMCLEVFLATMCADPackageElement returns [EObject current=null] : this_MFlatMCAD_0= ruleMFlatMCAD ;
    public final EObject ruleMMCLEVFLATMCADPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MFlatMCAD_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:178:28: (this_MFlatMCAD_0= ruleMFlatMCAD )
            // InternalFLATMCAD.g:180:2: this_MFlatMCAD_0= ruleMFlatMCAD
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMCLEVFLATMCADPackageElementAccess().getMFlatMCADParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_MFlatMCAD_0=ruleMFlatMCAD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MFlatMCAD_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMMCLEVFLATMCADPackageElement"


    // $ANTLR start "entryRuleMFlatMCAD"
    // InternalFLATMCAD.g:199:1: entryRuleMFlatMCAD returns [EObject current=null] : iv_ruleMFlatMCAD= ruleMFlatMCAD EOF ;
    public final EObject entryRuleMFlatMCAD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMFlatMCAD = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // InternalFLATMCAD.g:205:2: (iv_ruleMFlatMCAD= ruleMFlatMCAD EOF )
            // InternalFLATMCAD.g:206:2: iv_ruleMFlatMCAD= ruleMFlatMCAD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMFlatMCADRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMFlatMCAD=ruleMFlatMCAD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMFlatMCAD; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMFlatMCAD"


    // $ANTLR start "ruleMFlatMCAD"
    // InternalFLATMCAD.g:216:1: ruleMFlatMCAD returns [EObject current=null] : (otherlv_0= 'flat' otherlv_1= 'mcad' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';' ) ;
    public final EObject ruleMFlatMCAD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_version_7_0 = null;

        EObject lv_targets_17_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4()
        		);
            
        try {
            // InternalFLATMCAD.g:222:28: ( (otherlv_0= 'flat' otherlv_1= 'mcad' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';' ) )
            // InternalFLATMCAD.g:223:1: (otherlv_0= 'flat' otherlv_1= 'mcad' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';' )
            {
            // InternalFLATMCAD.g:223:1: (otherlv_0= 'flat' otherlv_1= 'mcad' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';' )
            // InternalFLATMCAD.g:223:3: otherlv_0= 'flat' otherlv_1= 'mcad' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMFlatMCADAccess().getFlatKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMFlatMCADAccess().getMcadKeyword_1());
                  
            }
            // InternalFLATMCAD.g:231:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalFLATMCAD.g:232:1: (lv_name_2_0= RULE_ID )
            {
            // InternalFLATMCAD.g:232:1: (lv_name_2_0= RULE_ID )
            // InternalFLATMCAD.g:233:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMFlatMCADAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatMCADRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalFLATMCAD.g:253:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?) ) )
            // InternalFLATMCAD.g:255:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalFLATMCAD.g:255:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?) )
            // InternalFLATMCAD.g:256:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());
            // InternalFLATMCAD.g:259:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?)
            // InternalFLATMCAD.g:260:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+ {...}?
            {
            // InternalFLATMCAD.g:260:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0) ) {
                    alt3=1;
                }
                else if ( (LA3_0==20) ) {
                    int LA3_3 = input.LA(2);

                    if ( LA3_3 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2) ) {
                        alt3=3;
                    }
                    else if ( LA3_3 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1) ) {
                        alt3=2;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalFLATMCAD.g:262:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:262:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) )
            	    // InternalFLATMCAD.g:263:5: {...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalFLATMCAD.g:263:106: ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) )
            	    // InternalFLATMCAD.g:264:6: ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0);
            	    // InternalFLATMCAD.g:267:6: ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) )
            	    // InternalFLATMCAD.g:267:7: {...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCAD", "true");
            	    }
            	    // InternalFLATMCAD.g:267:16: (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' )
            	    // InternalFLATMCAD.g:267:18: otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMFlatMCADAccess().getVersionKeyword_4_0_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_4_0_1());
            	          
            	    }
            	    // InternalFLATMCAD.g:275:1: ( (lv_version_7_0= ruleVersion ) )
            	    // InternalFLATMCAD.g:276:1: (lv_version_7_0= ruleVersion )
            	    {
            	    // InternalFLATMCAD.g:276:1: (lv_version_7_0= ruleVersion )
            	    // InternalFLATMCAD.g:277:3: lv_version_7_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMFlatMCADAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_version_7_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMFlatMCADRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"version",
            	              		lv_version_7_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFLATMCAD.g:304:4: ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:304:4: ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) )
            	    // InternalFLATMCAD.g:305:5: {...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalFLATMCAD.g:305:106: ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) )
            	    // InternalFLATMCAD.g:306:6: ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1);
            	    // InternalFLATMCAD.g:309:6: ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) )
            	    // InternalFLATMCAD.g:309:7: {...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCAD", "true");
            	    }
            	    // InternalFLATMCAD.g:309:16: (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )
            	    // InternalFLATMCAD.g:309:18: otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';'
            	    {
            	    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_4_1_0());
            	          
            	    }
            	    otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMFlatMCADAccess().getProjectKeyword_4_1_1());
            	          
            	    }
            	    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_4_1_2());
            	          
            	    }
            	    // InternalFLATMCAD.g:321:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalFLATMCAD.g:322:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalFLATMCAD.g:322:1: ( ruleVersionedQualifiedName )
            	    // InternalFLATMCAD.g:323:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMFlatMCADRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMFlatMCADAccess().getReferencedElementMMCADeploymentCrossReference_4_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_1_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalFLATMCAD.g:350:4: ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:350:4: ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) )
            	    // InternalFLATMCAD.g:351:5: {...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalFLATMCAD.g:351:106: ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) )
            	    // InternalFLATMCAD.g:352:6: ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2);
            	    // InternalFLATMCAD.g:355:6: ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) )
            	    // InternalFLATMCAD.g:355:7: {...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCAD", "true");
            	    }
            	    // InternalFLATMCAD.g:355:16: (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' )
            	    // InternalFLATMCAD.g:355:18: otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';'
            	    {
            	    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_4_2_0());
            	          
            	    }
            	    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMFlatMCADAccess().getTargetsKeyword_4_2_1());
            	          
            	    }
            	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_4_2_2());
            	          
            	    }
            	    // InternalFLATMCAD.g:367:1: ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==24) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalFLATMCAD.g:368:1: (lv_targets_17_0= ruleMFlatMCADTarget )
            	    	    {
            	    	    // InternalFLATMCAD.g:368:1: (lv_targets_17_0= ruleMFlatMCADTarget )
            	    	    // InternalFLATMCAD.g:369:3: lv_targets_17_0= ruleMFlatMCADTarget
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMFlatMCADAccess().getTargetsMFlatMCADTargetParserRuleCall_4_2_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_15);
            	    	    lv_targets_17_0=ruleMFlatMCADTarget();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMFlatMCADRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"targets",
            	    	              		lv_targets_17_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatMCADTarget");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_4_2_4());
            	          
            	    }
            	    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMFlatMCAD", "getUnorderedGroupHelper().canLeave(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());

            }

            otherlv_20=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMFlatMCAD"


    // $ANTLR start "entryRuleMFlatMCADTarget"
    // InternalFLATMCAD.g:427:1: entryRuleMFlatMCADTarget returns [EObject current=null] : iv_ruleMFlatMCADTarget= ruleMFlatMCADTarget EOF ;
    public final EObject entryRuleMFlatMCADTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMFlatMCADTarget = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 
        			grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3()
        		);
        	
        try {
            // InternalFLATMCAD.g:434:2: (iv_ruleMFlatMCADTarget= ruleMFlatMCADTarget EOF )
            // InternalFLATMCAD.g:435:2: iv_ruleMFlatMCADTarget= ruleMFlatMCADTarget EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMFlatMCADTargetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMFlatMCADTarget=ruleMFlatMCADTarget();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMFlatMCADTarget; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMFlatMCADTarget"


    // $ANTLR start "ruleMFlatMCADTarget"
    // InternalFLATMCAD.g:445:1: ruleMFlatMCADTarget returns [EObject current=null] : (otherlv_0= 'target' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* ) ) ) otherlv_29= '}' otherlv_30= ';' ) ;
    public final EObject ruleMFlatMCADTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_attributeValueAssignments_11_0 = null;

        EObject lv_components_16_0 = null;

        EObject lv_connections_21_0 = null;

        EObject lv_libraries_26_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 
        			grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3()
        		);
            
        try {
            // InternalFLATMCAD.g:452:28: ( (otherlv_0= 'target' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* ) ) ) otherlv_29= '}' otherlv_30= ';' ) )
            // InternalFLATMCAD.g:453:1: (otherlv_0= 'target' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* ) ) ) otherlv_29= '}' otherlv_30= ';' )
            {
            // InternalFLATMCAD.g:453:1: (otherlv_0= 'target' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* ) ) ) otherlv_29= '}' otherlv_30= ';' )
            // InternalFLATMCAD.g:453:3: otherlv_0= 'target' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* ) ) ) otherlv_29= '}' otherlv_30= ';'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMFlatMCADTargetAccess().getTargetKeyword_0());
                  
            }
            // InternalFLATMCAD.g:457:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalFLATMCAD.g:459:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalFLATMCAD.g:459:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?) )
            // InternalFLATMCAD.g:460:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());
            // InternalFLATMCAD.g:463:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?)
            // InternalFLATMCAD.g:464:3: ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+ {...}?
            {
            // InternalFLATMCAD.g:464:3: ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFLATMCAD.g:466:4: ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:466:4: ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) )
            	    // InternalFLATMCAD.g:467:5: {...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalFLATMCAD.g:467:112: ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) )
            	    // InternalFLATMCAD.g:468:6: ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0);
            	    // InternalFLATMCAD.g:471:6: ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) )
            	    // InternalFLATMCAD.g:471:7: {...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "true");
            	    }
            	    // InternalFLATMCAD.g:471:16: (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalFLATMCAD.g:471:18: otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMFlatMCADTargetAccess().getPlatformKeyword_1_0_0());
            	          
            	    }
            	    // InternalFLATMCAD.g:475:1: ( (otherlv_3= RULE_ID ) )
            	    // InternalFLATMCAD.g:476:1: (otherlv_3= RULE_ID )
            	    {
            	    // InternalFLATMCAD.g:476:1: (otherlv_3= RULE_ID )
            	    // InternalFLATMCAD.g:477:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMFlatMCADTargetRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFLATMCAD.g:498:4: ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:498:4: ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) )
            	    // InternalFLATMCAD.g:499:5: {...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalFLATMCAD.g:499:112: ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) )
            	    // InternalFLATMCAD.g:500:6: ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1);
            	    // InternalFLATMCAD.g:503:6: ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) )
            	    // InternalFLATMCAD.g:503:7: {...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "true");
            	    }
            	    // InternalFLATMCAD.g:503:16: (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) )
            	    // InternalFLATMCAD.g:503:18: otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMFlatMCADTargetAccess().getAlternativeKeyword_1_1_0());
            	          
            	    }
            	    // InternalFLATMCAD.g:507:1: ( ( ruleVersionedQualifiedReferenceName ) )
            	    // InternalFLATMCAD.g:508:1: ( ruleVersionedQualifiedReferenceName )
            	    {
            	    // InternalFLATMCAD.g:508:1: ( ruleVersionedQualifiedReferenceName )
            	    // InternalFLATMCAD.g:509:3: ruleVersionedQualifiedReferenceName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMFlatMCADTargetRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    ruleVersionedQualifiedReferenceName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "getUnorderedGroupHelper().canLeave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalFLATMCAD.g:544:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* ) ) )
            // InternalFLATMCAD.g:546:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* ) )
            {
            // InternalFLATMCAD.g:546:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* ) )
            // InternalFLATMCAD.g:547:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
            // InternalFLATMCAD.g:550:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )* )
            // InternalFLATMCAD.g:551:3: ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )*
            {
            // InternalFLATMCAD.g:551:3: ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )*
            loop9:
            do {
                int alt9=5;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3) ) {
                    alt9=4;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFLATMCAD.g:553:4: ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:553:4: ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) )
            	    // InternalFLATMCAD.g:554:5: {...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalFLATMCAD.g:554:112: ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) )
            	    // InternalFLATMCAD.g:555:6: ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0);
            	    // InternalFLATMCAD.g:558:6: ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) )
            	    // InternalFLATMCAD.g:558:7: {...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "true");
            	    }
            	    // InternalFLATMCAD.g:558:16: (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' )
            	    // InternalFLATMCAD.g:558:18: otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';'
            	    {
            	    otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMFlatMCADTargetAccess().getAttributeKeyword_3_0_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMFlatMCADTargetAccess().getValuesKeyword_3_0_1());
            	          
            	    }
            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_0_2());
            	          
            	    }
            	    // InternalFLATMCAD.g:570:1: ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==27) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalFLATMCAD.g:571:1: (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment )
            	    	    {
            	    	    // InternalFLATMCAD.g:571:1: (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment )
            	    	    // InternalFLATMCAD.g:572:3: lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_21);
            	    	    lv_attributeValueAssignments_11_0=ruleMAttributeValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMFlatMCADTargetRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributeValueAssignments",
            	    	              		lv_attributeValueAssignments_11_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_0_4());
            	          
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_0_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFLATMCAD.g:603:4: ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:603:4: ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
            	    // InternalFLATMCAD.g:604:5: {...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalFLATMCAD.g:604:112: ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
            	    // InternalFLATMCAD.g:605:6: ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1);
            	    // InternalFLATMCAD.g:608:6: ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) )
            	    // InternalFLATMCAD.g:608:7: {...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "true");
            	    }
            	    // InternalFLATMCAD.g:608:16: (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' )
            	    // InternalFLATMCAD.g:608:18: otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';'
            	    {
            	    otherlv_14=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMFlatMCADTargetAccess().getComponentsKeyword_3_1_0());
            	          
            	    }
            	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_1_1());
            	          
            	    }
            	    // InternalFLATMCAD.g:616:1: ( (lv_components_16_0= ruleMFlatComponentInstance ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==40) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalFLATMCAD.g:617:1: (lv_components_16_0= ruleMFlatComponentInstance )
            	    	    {
            	    	    // InternalFLATMCAD.g:617:1: (lv_components_16_0= ruleMFlatComponentInstance )
            	    	    // InternalFLATMCAD.g:618:3: lv_components_16_0= ruleMFlatComponentInstance
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getComponentsMFlatComponentInstanceParserRuleCall_3_1_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_23);
            	    	    lv_components_16_0=ruleMFlatComponentInstance();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMFlatMCADTargetRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"components",
            	    	              		lv_components_16_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatComponentInstance");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_1_3());
            	          
            	    }
            	    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_1_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalFLATMCAD.g:649:4: ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:649:4: ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) )
            	    // InternalFLATMCAD.g:650:5: {...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalFLATMCAD.g:650:112: ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) )
            	    // InternalFLATMCAD.g:651:6: ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2);
            	    // InternalFLATMCAD.g:654:6: ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) )
            	    // InternalFLATMCAD.g:654:7: {...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "true");
            	    }
            	    // InternalFLATMCAD.g:654:16: (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' )
            	    // InternalFLATMCAD.g:654:18: otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';'
            	    {
            	    otherlv_19=(Token)match(input,30,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getMFlatMCADTargetAccess().getConnectionsKeyword_3_2_0());
            	          
            	    }
            	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_2_1());
            	          
            	    }
            	    // InternalFLATMCAD.g:662:1: ( (lv_connections_21_0= ruleMFlatConnection ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==36) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalFLATMCAD.g:663:1: (lv_connections_21_0= ruleMFlatConnection )
            	    	    {
            	    	    // InternalFLATMCAD.g:663:1: (lv_connections_21_0= ruleMFlatConnection )
            	    	    // InternalFLATMCAD.g:664:3: lv_connections_21_0= ruleMFlatConnection
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getConnectionsMFlatConnectionParserRuleCall_3_2_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_25);
            	    	    lv_connections_21_0=ruleMFlatConnection();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMFlatMCADTargetRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"connections",
            	    	              		lv_connections_21_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatConnection");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	    otherlv_22=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_2_3());
            	          
            	    }
            	    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_2_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalFLATMCAD.g:695:4: ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:695:4: ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
            	    // InternalFLATMCAD.g:696:5: {...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalFLATMCAD.g:696:112: ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
            	    // InternalFLATMCAD.g:697:6: ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3);
            	    // InternalFLATMCAD.g:700:6: ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) )
            	    // InternalFLATMCAD.g:700:7: {...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatMCADTarget", "true");
            	    }
            	    // InternalFLATMCAD.g:700:16: (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' )
            	    // InternalFLATMCAD.g:700:18: otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';'
            	    {
            	    otherlv_24=(Token)match(input,31,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_24, grammarAccess.getMFlatMCADTargetAccess().getLibrariesKeyword_3_3_0());
            	          
            	    }
            	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_3_1());
            	          
            	    }
            	    // InternalFLATMCAD.g:708:1: ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0>=41 && LA8_0<=42)) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalFLATMCAD.g:709:1: (lv_libraries_26_0= ruleMFlatServiceLibraryInstance )
            	    	    {
            	    	    // InternalFLATMCAD.g:709:1: (lv_libraries_26_0= ruleMFlatServiceLibraryInstance )
            	    	    // InternalFLATMCAD.g:710:3: lv_libraries_26_0= ruleMFlatServiceLibraryInstance
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getLibrariesMFlatServiceLibraryInstanceParserRuleCall_3_3_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_27);
            	    	    lv_libraries_26_0=ruleMFlatServiceLibraryInstance();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMFlatMCADTargetRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"libraries",
            	    	              		lv_libraries_26_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatServiceLibraryInstance");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	    otherlv_27=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_3_3());
            	          
            	    }
            	    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_28, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_3_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());

            }

            otherlv_29=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_29, grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_4());
                  
            }
            otherlv_30=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_30, grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMFlatMCADTarget"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFLATMCAD.g:767:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFLATMCAD.g:768:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFLATMCAD.g:769:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalFLATMCAD.g:776:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:779:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFLATMCAD.g:780:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFLATMCAD.g:780:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFLATMCAD.g:780:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalFLATMCAD.g:787:1: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFLATMCAD.g:788:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // InternalFLATMCAD.g:808:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalFLATMCAD.g:809:2: (iv_ruleVersion= ruleVersion EOF )
            // InternalFLATMCAD.g:810:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalFLATMCAD.g:817:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token this_ID_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_INT_5=null;
        Token this_ID_6=null;

         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:820:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalFLATMCAD.g:821:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalFLATMCAD.g:821:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalFLATMCAD.g:821:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalFLATMCAD.g:821:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||LA12_1==13||LA12_1==32||LA12_1==34) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFLATMCAD.g:821:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalFLATMCAD.g:829:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalFLATMCAD.g:829:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalFLATMCAD.g:829:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalFLATMCAD.g:829:7: (this_INT_1= RULE_INT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_INT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFLATMCAD.g:829:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
                                  
                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
                          
                    }

                    }


                    }
                    break;

            }

            // InternalFLATMCAD.g:843:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFLATMCAD.g:844:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalFLATMCAD.g:849:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_INT) ) {
            	        int LA14_1 = input.LA(2);

            	        if ( (LA14_1==RULE_ID) ) {
            	            alt14=2;
            	        }
            	        else if ( (LA14_1==EOF||LA14_1==13||LA14_1==32||LA14_1==34) ) {
            	            alt14=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 14, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA14_0==RULE_ID) ) {
            	        alt14=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalFLATMCAD.g:849:6: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_4);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFLATMCAD.g:857:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalFLATMCAD.g:857:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalFLATMCAD.g:857:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalFLATMCAD.g:857:7: (this_INT_5= RULE_INT )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==RULE_INT) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // InternalFLATMCAD.g:857:12: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      		current.merge(this_INT_5);
            	                          
            	                    }
            	                    if ( state.backtracking==0 ) {
            	                       
            	                          newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            	                          
            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ID_6);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleVersionedQualifiedName"
    // InternalFLATMCAD.g:879:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalFLATMCAD.g:880:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalFLATMCAD.g:881:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionedQualifiedName"


    // $ANTLR start "ruleVersionedQualifiedName"
    // InternalFLATMCAD.g:888:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:891:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalFLATMCAD.g:892:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalFLATMCAD.g:892:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalFLATMCAD.g:893:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_29);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,33,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_30);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Version_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionedQualifiedName"


    // $ANTLR start "entryRuleVersionedQualifiedReferenceName"
    // InternalFLATMCAD.g:934:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalFLATMCAD.g:935:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalFLATMCAD.g:936:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedReferenceName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionedQualifiedReferenceName"


    // $ANTLR start "ruleVersionedQualifiedReferenceName"
    // InternalFLATMCAD.g:943:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:946:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalFLATMCAD.g:947:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalFLATMCAD.g:947:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalFLATMCAD.g:947:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalFLATMCAD.g:947:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=32 && LA16_1<=33)) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalFLATMCAD.g:948:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VersionedQualifiedName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // InternalFLATMCAD.g:971:1: (kw= '::' this_ID_4= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFLATMCAD.g:972:2: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            	          
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionedQualifiedReferenceName"


    // $ANTLR start "entryRuleMFlatConnection"
    // InternalFLATMCAD.g:992:1: entryRuleMFlatConnection returns [EObject current=null] : iv_ruleMFlatConnection= ruleMFlatConnection EOF ;
    public final EObject entryRuleMFlatConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMFlatConnection = null;


        try {
            // InternalFLATMCAD.g:993:2: (iv_ruleMFlatConnection= ruleMFlatConnection EOF )
            // InternalFLATMCAD.g:994:2: iv_ruleMFlatConnection= ruleMFlatConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMFlatConnectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMFlatConnection=ruleMFlatConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMFlatConnection; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMFlatConnection"


    // $ANTLR start "ruleMFlatConnection"
    // InternalFLATMCAD.g:1001:1: ruleMFlatConnection returns [EObject current=null] : ( () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';' ) ;
    public final EObject ruleMFlatConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_attributeValueAssignments_16_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1004:28: ( ( () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';' ) )
            // InternalFLATMCAD.g:1005:1: ( () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';' )
            {
            // InternalFLATMCAD.g:1005:1: ( () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';' )
            // InternalFLATMCAD.g:1005:2: () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';'
            {
            // InternalFLATMCAD.g:1005:2: ()
            // InternalFLATMCAD.g:1006:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMFlatConnectionAccess().getMFlatConnectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMFlatConnectionAccess().getConnectionKeyword_1());
                  
            }
            // InternalFLATMCAD.g:1018:1: ( (otherlv_2= RULE_ID ) )
            // InternalFLATMCAD.g:1019:1: (otherlv_2= RULE_ID )
            {
            // InternalFLATMCAD.g:1019:1: (otherlv_2= RULE_ID )
            // InternalFLATMCAD.g:1020:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatConnectionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getMFlatConnectionAccess().getClientInstanceMFlatComponentInstanceCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_3());
                  
            }
            // InternalFLATMCAD.g:1038:1: ( (otherlv_4= RULE_ID ) )
            // InternalFLATMCAD.g:1039:1: (otherlv_4= RULE_ID )
            {
            // InternalFLATMCAD.g:1039:1: (otherlv_4= RULE_ID )
            // InternalFLATMCAD.g:1040:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatConnectionRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getMFlatConnectionAccess().getClientPortMClientPortCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMFlatConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5());
                  
            }
            // InternalFLATMCAD.g:1058:1: ( (otherlv_6= RULE_ID ) )
            // InternalFLATMCAD.g:1059:1: (otherlv_6= RULE_ID )
            {
            // InternalFLATMCAD.g:1059:1: (otherlv_6= RULE_ID )
            // InternalFLATMCAD.g:1060:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatConnectionRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getMFlatConnectionAccess().getServerInstanceMFlatComponentInstanceCrossReference_6_0()); 
              	
            }

            }


            }

            otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_7());
                  
            }
            // InternalFLATMCAD.g:1078:1: ( (otherlv_8= RULE_ID ) )
            // InternalFLATMCAD.g:1079:1: (otherlv_8= RULE_ID )
            {
            // InternalFLATMCAD.g:1079:1: (otherlv_8= RULE_ID )
            // InternalFLATMCAD.g:1080:3: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatConnectionRule());
              	        }
                      
            }
            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_8, grammarAccess.getMFlatConnectionAccess().getServerPortMServerPortCrossReference_8_0()); 
              	
            }

            }


            }

            otherlv_9=(Token)match(input,38,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMFlatConnectionAccess().getUsingKeyword_9());
                  
            }
            // InternalFLATMCAD.g:1098:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFLATMCAD.g:1099:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFLATMCAD.g:1099:1: ( ruleVersionedQualifiedReferenceName )
            // InternalFLATMCAD.g:1100:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatConnectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMFlatConnectionAccess().getConnectorMConnectorCrossReference_10_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getMFlatConnectionAccess().getLeftCurlyBracketKeyword_11());
                  
            }
            // InternalFLATMCAD.g:1120:1: (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFLATMCAD.g:1120:3: otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
                    {
                    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getMFlatConnectionAccess().getMappingKeyword_12_0());
                          
                    }
                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMFlatConnectionAccess().getColonEqualsSignKeyword_12_1());
                          
                    }
                    // InternalFLATMCAD.g:1128:1: ( ( ruleVersionedQualifiedName ) )
                    // InternalFLATMCAD.g:1129:1: ( ruleVersionedQualifiedName )
                    {
                    // InternalFLATMCAD.g:1129:1: ( ruleVersionedQualifiedName )
                    // InternalFLATMCAD.g:1130:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMFlatConnectionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMFlatConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_12_3());
                          
                    }

                    }
                    break;

            }

            // InternalFLATMCAD.g:1150:3: ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFLATMCAD.g:1151:1: (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment )
            	    {
            	    // InternalFLATMCAD.g:1151:1: (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment )
            	    // InternalFLATMCAD.g:1152:3: lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMFlatConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_attributeValueAssignments_16_0=ruleMAttributeValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMFlatConnectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_16_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getMFlatConnectionAccess().getRightCurlyBracketKeyword_14());
                  
            }
            otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_15());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMFlatConnection"


    // $ANTLR start "entryRuleMFlatComponentInstance"
    // InternalFLATMCAD.g:1184:1: entryRuleMFlatComponentInstance returns [EObject current=null] : iv_ruleMFlatComponentInstance= ruleMFlatComponentInstance EOF ;
    public final EObject entryRuleMFlatComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMFlatComponentInstance = null;


        try {
            // InternalFLATMCAD.g:1185:2: (iv_ruleMFlatComponentInstance= ruleMFlatComponentInstance EOF )
            // InternalFLATMCAD.g:1186:2: iv_ruleMFlatComponentInstance= ruleMFlatComponentInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMFlatComponentInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMFlatComponentInstance=ruleMFlatComponentInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMFlatComponentInstance; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMFlatComponentInstance"


    // $ANTLR start "ruleMFlatComponentInstance"
    // InternalFLATMCAD.g:1193:1: ruleMFlatComponentInstance returns [EObject current=null] : ( () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleMFlatComponentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_attributeValueAssignments_5_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1196:28: ( ( () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFLATMCAD.g:1197:1: ( () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFLATMCAD.g:1197:1: ( () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalFLATMCAD.g:1197:2: () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // InternalFLATMCAD.g:1197:2: ()
            // InternalFLATMCAD.g:1198:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMFlatComponentInstanceAccess().getMFlatComponentInstanceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMFlatComponentInstanceAccess().getInstanceKeyword_1());
                  
            }
            // InternalFLATMCAD.g:1210:1: ( ( ruleVersionedQualifiedName ) )
            // InternalFLATMCAD.g:1211:1: ( ruleVersionedQualifiedName )
            {
            // InternalFLATMCAD.g:1211:1: ( ruleVersionedQualifiedName )
            // InternalFLATMCAD.g:1212:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatComponentInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMFlatComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_3);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalFLATMCAD.g:1228:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalFLATMCAD.g:1229:1: (lv_name_3_0= RULE_ID )
            {
            // InternalFLATMCAD.g:1229:1: (lv_name_3_0= RULE_ID )
            // InternalFLATMCAD.g:1230:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMFlatComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatComponentInstanceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMFlatComponentInstanceAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalFLATMCAD.g:1250:1: ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFLATMCAD.g:1251:1: (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment )
            	    {
            	    // InternalFLATMCAD.g:1251:1: (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment )
            	    // InternalFLATMCAD.g:1252:3: lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMFlatComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_attributeValueAssignments_5_0=ruleMAttributeValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMFlatComponentInstanceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_5_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMFlatComponentInstanceAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMFlatComponentInstanceAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMFlatComponentInstance"


    // $ANTLR start "entryRuleMFlatServiceLibraryInstance"
    // InternalFLATMCAD.g:1284:1: entryRuleMFlatServiceLibraryInstance returns [EObject current=null] : iv_ruleMFlatServiceLibraryInstance= ruleMFlatServiceLibraryInstance EOF ;
    public final EObject entryRuleMFlatServiceLibraryInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMFlatServiceLibraryInstance = null;


        try {
            // InternalFLATMCAD.g:1285:2: (iv_ruleMFlatServiceLibraryInstance= ruleMFlatServiceLibraryInstance EOF )
            // InternalFLATMCAD.g:1286:2: iv_ruleMFlatServiceLibraryInstance= ruleMFlatServiceLibraryInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMFlatServiceLibraryInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMFlatServiceLibraryInstance=ruleMFlatServiceLibraryInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMFlatServiceLibraryInstance; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMFlatServiceLibraryInstance"


    // $ANTLR start "ruleMFlatServiceLibraryInstance"
    // InternalFLATMCAD.g:1293:1: ruleMFlatServiceLibraryInstance returns [EObject current=null] : (this_MRegularFlatServiceLibraryInstance_0= ruleMRegularFlatServiceLibraryInstance | this_MFlatDriverSLibInstance_1= ruleMFlatDriverSLibInstance ) ;
    public final EObject ruleMFlatServiceLibraryInstance() throws RecognitionException {
        EObject current = null;

        EObject this_MRegularFlatServiceLibraryInstance_0 = null;

        EObject this_MFlatDriverSLibInstance_1 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1296:28: ( (this_MRegularFlatServiceLibraryInstance_0= ruleMRegularFlatServiceLibraryInstance | this_MFlatDriverSLibInstance_1= ruleMFlatDriverSLibInstance ) )
            // InternalFLATMCAD.g:1297:1: (this_MRegularFlatServiceLibraryInstance_0= ruleMRegularFlatServiceLibraryInstance | this_MFlatDriverSLibInstance_1= ruleMFlatDriverSLibInstance )
            {
            // InternalFLATMCAD.g:1297:1: (this_MRegularFlatServiceLibraryInstance_0= ruleMRegularFlatServiceLibraryInstance | this_MFlatDriverSLibInstance_1= ruleMFlatDriverSLibInstance )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            else if ( (LA21_0==42) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFLATMCAD.g:1298:2: this_MRegularFlatServiceLibraryInstance_0= ruleMRegularFlatServiceLibraryInstance
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMFlatServiceLibraryInstanceAccess().getMRegularFlatServiceLibraryInstanceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MRegularFlatServiceLibraryInstance_0=ruleMRegularFlatServiceLibraryInstance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MRegularFlatServiceLibraryInstance_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalFLATMCAD.g:1311:2: this_MFlatDriverSLibInstance_1= ruleMFlatDriverSLibInstance
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMFlatServiceLibraryInstanceAccess().getMFlatDriverSLibInstanceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MFlatDriverSLibInstance_1=ruleMFlatDriverSLibInstance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MFlatDriverSLibInstance_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMFlatServiceLibraryInstance"


    // $ANTLR start "entryRuleMRegularFlatServiceLibraryInstance"
    // InternalFLATMCAD.g:1330:1: entryRuleMRegularFlatServiceLibraryInstance returns [EObject current=null] : iv_ruleMRegularFlatServiceLibraryInstance= ruleMRegularFlatServiceLibraryInstance EOF ;
    public final EObject entryRuleMRegularFlatServiceLibraryInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRegularFlatServiceLibraryInstance = null;


        try {
            // InternalFLATMCAD.g:1331:2: (iv_ruleMRegularFlatServiceLibraryInstance= ruleMRegularFlatServiceLibraryInstance EOF )
            // InternalFLATMCAD.g:1332:2: iv_ruleMRegularFlatServiceLibraryInstance= ruleMRegularFlatServiceLibraryInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMRegularFlatServiceLibraryInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMRegularFlatServiceLibraryInstance=ruleMRegularFlatServiceLibraryInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMRegularFlatServiceLibraryInstance; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMRegularFlatServiceLibraryInstance"


    // $ANTLR start "ruleMRegularFlatServiceLibraryInstance"
    // InternalFLATMCAD.g:1339:1: ruleMRegularFlatServiceLibraryInstance returns [EObject current=null] : (otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleMRegularFlatServiceLibraryInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_attributeValueAssignments_3_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1342:28: ( (otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalFLATMCAD.g:1343:1: (otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalFLATMCAD.g:1343:1: (otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalFLATMCAD.g:1343:3: otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryKeyword_0());
                  
            }
            // InternalFLATMCAD.g:1347:1: ( ( ruleVersionedQualifiedName ) )
            // InternalFLATMCAD.g:1348:1: ( ruleVersionedQualifiedName )
            {
            // InternalFLATMCAD.g:1348:1: ( ruleVersionedQualifiedName )
            // InternalFLATMCAD.g:1349:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMRegularFlatServiceLibraryInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalFLATMCAD.g:1369:1: ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFLATMCAD.g:1370:1: (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment )
            	    {
            	    // InternalFLATMCAD.g:1370:1: (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment )
            	    // InternalFLATMCAD.g:1371:3: lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_attributeValueAssignments_3_0=ruleMAttributeValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMRegularFlatServiceLibraryInstanceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_3_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMRegularFlatServiceLibraryInstance"


    // $ANTLR start "entryRuleMFlatDriverSLibInstance"
    // InternalFLATMCAD.g:1403:1: entryRuleMFlatDriverSLibInstance returns [EObject current=null] : iv_ruleMFlatDriverSLibInstance= ruleMFlatDriverSLibInstance EOF ;
    public final EObject entryRuleMFlatDriverSLibInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMFlatDriverSLibInstance = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // InternalFLATMCAD.g:1409:2: (iv_ruleMFlatDriverSLibInstance= ruleMFlatDriverSLibInstance EOF )
            // InternalFLATMCAD.g:1410:2: iv_ruleMFlatDriverSLibInstance= ruleMFlatDriverSLibInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMFlatDriverSLibInstance=ruleMFlatDriverSLibInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMFlatDriverSLibInstance; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMFlatDriverSLibInstance"


    // $ANTLR start "ruleMFlatDriverSLibInstance"
    // InternalFLATMCAD.g:1420:1: ruleMFlatDriverSLibInstance returns [EObject current=null] : ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' ) ;
    public final EObject ruleMFlatDriverSLibInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_attributeValueAssignments_8_0 = null;

        EObject lv_deviceDriverMappings_14_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4()
        		);
            
        try {
            // InternalFLATMCAD.g:1426:28: ( ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' ) )
            // InternalFLATMCAD.g:1427:1: ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' )
            {
            // InternalFLATMCAD.g:1427:1: ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' )
            // InternalFLATMCAD.g:1427:2: () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';'
            {
            // InternalFLATMCAD.g:1427:2: ()
            // InternalFLATMCAD.g:1428:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMFlatDriverSLibInstanceAccess().getMFlatDriverSLibInstanceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMFlatDriverSLibInstanceAccess().getDriverKeyword_1());
                  
            }
            // InternalFLATMCAD.g:1440:1: ( ( ruleVersionedQualifiedName ) )
            // InternalFLATMCAD.g:1441:1: ( ruleVersionedQualifiedName )
            {
            // InternalFLATMCAD.g:1441:1: ( ruleVersionedQualifiedName )
            // InternalFLATMCAD.g:1442:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatDriverSLibInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalFLATMCAD.g:1462:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) )
            // InternalFLATMCAD.g:1464:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) )
            {
            // InternalFLATMCAD.g:1464:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) )
            // InternalFLATMCAD.g:1465:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());
            // InternalFLATMCAD.g:1468:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* )
            // InternalFLATMCAD.g:1469:3: ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )*
            {
            // InternalFLATMCAD.g:1469:3: ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFLATMCAD.g:1471:4: ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:1471:4: ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
            	    // InternalFLATMCAD.g:1472:5: {...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatDriverSLibInstance", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalFLATMCAD.g:1472:120: ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
            	    // InternalFLATMCAD.g:1473:6: ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0);
            	    // InternalFLATMCAD.g:1476:6: ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
            	    // InternalFLATMCAD.g:1476:7: {...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatDriverSLibInstance", "true");
            	    }
            	    // InternalFLATMCAD.g:1476:16: (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
            	    // InternalFLATMCAD.g:1476:18: otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';'
            	    {
            	    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeKeyword_4_0_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMFlatDriverSLibInstanceAccess().getValuesKeyword_4_0_1());
            	          
            	    }
            	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2());
            	          
            	    }
            	    // InternalFLATMCAD.g:1488:1: ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==27) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalFLATMCAD.g:1489:1: (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment )
            	    	    {
            	    	    // InternalFLATMCAD.g:1489:1: (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment )
            	    	    // InternalFLATMCAD.g:1490:3: lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_21);
            	    	    lv_attributeValueAssignments_8_0=ruleMAttributeValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMFlatDriverSLibInstanceRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributeValueAssignments",
            	    	              		lv_attributeValueAssignments_8_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt23 >= 1 ) break loop23;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(23, input);
            	                throw eee;
            	        }
            	        cnt23++;
            	    } while (true);

            	    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4());
            	          
            	    }
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFLATMCAD.g:1521:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
            	    {
            	    // InternalFLATMCAD.g:1521:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
            	    // InternalFLATMCAD.g:1522:5: {...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatDriverSLibInstance", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalFLATMCAD.g:1522:120: ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
            	    // InternalFLATMCAD.g:1523:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1);
            	    // InternalFLATMCAD.g:1526:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
            	    // InternalFLATMCAD.g:1526:7: {...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMFlatDriverSLibInstance", "true");
            	    }
            	    // InternalFLATMCAD.g:1526:16: (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
            	    // InternalFLATMCAD.g:1526:18: otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';'
            	    {
            	    otherlv_11=(Token)match(input,43,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceKeyword_4_1_0());
            	          
            	    }
            	    otherlv_12=(Token)match(input,44,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMFlatDriverSLibInstanceAccess().getMappingsKeyword_4_1_1());
            	          
            	    }
            	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2());
            	          
            	    }
            	    // InternalFLATMCAD.g:1538:1: ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==45) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalFLATMCAD.g:1539:1: (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping )
            	    	    {
            	    	    // InternalFLATMCAD.g:1539:1: (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping )
            	    	    // InternalFLATMCAD.g:1540:3: lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsMFlatDeviceDriverMappingParserRuleCall_4_1_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_40);
            	    	    lv_deviceDriverMappings_14_0=ruleMFlatDeviceDriverMapping();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMFlatDriverSLibInstanceRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deviceDriverMappings",
            	    	              		lv_deviceDriverMappings_14_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatDeviceDriverMapping");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt24 >= 1 ) break loop24;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(24, input);
            	                throw eee;
            	        }
            	        cnt24++;
            	    } while (true);

            	    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4());
            	          
            	    }
            	    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());

            }

            otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMFlatDriverSLibInstance"


    // $ANTLR start "entryRuleMFlatDeviceDriverMapping"
    // InternalFLATMCAD.g:1597:1: entryRuleMFlatDeviceDriverMapping returns [EObject current=null] : iv_ruleMFlatDeviceDriverMapping= ruleMFlatDeviceDriverMapping EOF ;
    public final EObject entryRuleMFlatDeviceDriverMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMFlatDeviceDriverMapping = null;


        try {
            // InternalFLATMCAD.g:1598:2: (iv_ruleMFlatDeviceDriverMapping= ruleMFlatDeviceDriverMapping EOF )
            // InternalFLATMCAD.g:1599:2: iv_ruleMFlatDeviceDriverMapping= ruleMFlatDeviceDriverMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMFlatDeviceDriverMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMFlatDeviceDriverMapping=ruleMFlatDeviceDriverMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMFlatDeviceDriverMapping; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMFlatDeviceDriverMapping"


    // $ANTLR start "ruleMFlatDeviceDriverMapping"
    // InternalFLATMCAD.g:1606:1: ruleMFlatDeviceDriverMapping returns [EObject current=null] : (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' ) ;
    public final EObject ruleMFlatDeviceDriverMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1609:28: ( (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' ) )
            // InternalFLATMCAD.g:1610:1: (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' )
            {
            // InternalFLATMCAD.g:1610:1: (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' )
            // InternalFLATMCAD.g:1610:3: otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_1());
                  
            }
            // InternalFLATMCAD.g:1618:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFLATMCAD.g:1619:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFLATMCAD.g:1619:1: ( ruleVersionedQualifiedReferenceName )
            // InternalFLATMCAD.g:1620:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatDeviceDriverMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_42);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMFlatDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,43,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_5());
                  
            }
            // InternalFLATMCAD.g:1648:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFLATMCAD.g:1649:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFLATMCAD.g:1649:1: ( ruleVersionedQualifiedReferenceName )
            // InternalFLATMCAD.g:1650:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMFlatDeviceDriverMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMFlatDeviceDriverMappingAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMFlatDeviceDriverMapping"


    // $ANTLR start "entryRuleMAttributeValueAssignment"
    // InternalFLATMCAD.g:1678:1: entryRuleMAttributeValueAssignment returns [EObject current=null] : iv_ruleMAttributeValueAssignment= ruleMAttributeValueAssignment EOF ;
    public final EObject entryRuleMAttributeValueAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMAttributeValueAssignment = null;


        try {
            // InternalFLATMCAD.g:1679:2: (iv_ruleMAttributeValueAssignment= ruleMAttributeValueAssignment EOF )
            // InternalFLATMCAD.g:1680:2: iv_ruleMAttributeValueAssignment= ruleMAttributeValueAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMAttributeValueAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMAttributeValueAssignment=ruleMAttributeValueAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMAttributeValueAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMAttributeValueAssignment"


    // $ANTLR start "ruleMAttributeValueAssignment"
    // InternalFLATMCAD.g:1687:1: ruleMAttributeValueAssignment returns [EObject current=null] : (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleMAttributeValueAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1690:28: ( (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) )
            // InternalFLATMCAD.g:1691:1: (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            {
            // InternalFLATMCAD.g:1691:1: (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            // InternalFLATMCAD.g:1691:3: otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMAttributeValueAssignmentAccess().getAttributeKeyword_0());
                  
            }
            // InternalFLATMCAD.g:1695:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFLATMCAD.g:1696:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFLATMCAD.g:1696:1: ( ruleVersionedQualifiedReferenceName )
            // InternalFLATMCAD.g:1697:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMAttributeValueAssignmentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMAttributeValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_9);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMAttributeValueAssignmentAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalFLATMCAD.g:1717:1: ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) )
            // InternalFLATMCAD.g:1718:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            {
            // InternalFLATMCAD.g:1718:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            // InternalFLATMCAD.g:1719:3: lv_parameterValue_3_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_parameterValue_3_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMAttributeValueAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"parameterValue",
                      		lv_parameterValue_3_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMAttributeValueAssignmentAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMAttributeValueAssignment"


    // $ANTLR start "entryRuleMParameterValue"
    // InternalFLATMCAD.g:1747:1: entryRuleMParameterValue returns [EObject current=null] : iv_ruleMParameterValue= ruleMParameterValue EOF ;
    public final EObject entryRuleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValue = null;


        try {
            // InternalFLATMCAD.g:1748:2: (iv_ruleMParameterValue= ruleMParameterValue EOF )
            // InternalFLATMCAD.g:1749:2: iv_ruleMParameterValue= ruleMParameterValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValue=ruleMParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValue"


    // $ANTLR start "ruleMParameterValue"
    // InternalFLATMCAD.g:1756:1: ruleMParameterValue returns [EObject current=null] : (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) ;
    public final EObject ruleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueLiteral_0 = null;

        EObject this_MParameterValueRefObject_1 = null;

        EObject this_MParameterValuePAR_2 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1759:28: ( (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) )
            // InternalFLATMCAD.g:1760:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            {
            // InternalFLATMCAD.g:1760:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEXADECIMAL:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                alt26=2;
                }
                break;
            case 33:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalFLATMCAD.g:1761:2: this_MParameterValueLiteral_0= ruleMParameterValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MParameterValueLiteral_0=ruleMParameterValueLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterValueLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalFLATMCAD.g:1774:2: this_MParameterValueRefObject_1= ruleMParameterValueRefObject
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MParameterValueRefObject_1=ruleMParameterValueRefObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterValueRefObject_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalFLATMCAD.g:1787:2: this_MParameterValuePAR_2= ruleMParameterValuePAR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MParameterValuePAR_2=ruleMParameterValuePAR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterValuePAR_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValue"


    // $ANTLR start "entryRuleMParameterValueLiteral"
    // InternalFLATMCAD.g:1806:1: entryRuleMParameterValueLiteral returns [EObject current=null] : iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF ;
    public final EObject entryRuleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueLiteral = null;


        try {
            // InternalFLATMCAD.g:1807:2: (iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF )
            // InternalFLATMCAD.g:1808:2: iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValueLiteral=ruleMParameterValueLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValueLiteral"


    // $ANTLR start "ruleMParameterValueLiteral"
    // InternalFLATMCAD.g:1815:1: ruleMParameterValueLiteral returns [EObject current=null] : (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) ;
    public final EObject ruleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueBooleanLiteral_0 = null;

        EObject this_MParameterValueStringLiteral_1 = null;

        EObject this_MParameterValueIntegerLiteral_2 = null;

        EObject this_MParameterValueRealLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1818:28: ( (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) )
            // InternalFLATMCAD.g:1819:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            {
            // InternalFLATMCAD.g:1819:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
                {
                alt27=1;
                }
                break;
            case RULE_STRING:
            case 48:
                {
                alt27=2;
                }
                break;
            case 51:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==RULE_INT) ) {
                    int LA27_4 = input.LA(3);

                    if ( (LA27_4==EOF||LA27_4==13||LA27_4==34||LA27_4==51||(LA27_4>=53 && LA27_4<=55)) ) {
                        alt27=3;
                    }
                    else if ( (LA27_4==32) ) {
                        alt27=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA27_4 = input.LA(2);

                if ( (LA27_4==EOF||LA27_4==13||LA27_4==34||LA27_4==51||(LA27_4>=53 && LA27_4<=55)) ) {
                    alt27=3;
                }
                else if ( (LA27_4==32) ) {
                    alt27=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEXADECIMAL:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalFLATMCAD.g:1820:2: this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MParameterValueBooleanLiteral_0=ruleMParameterValueBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterValueBooleanLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalFLATMCAD.g:1833:2: this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MParameterValueStringLiteral_1=ruleMParameterValueStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterValueStringLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalFLATMCAD.g:1846:2: this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MParameterValueIntegerLiteral_2=ruleMParameterValueIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterValueIntegerLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalFLATMCAD.g:1859:2: this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MParameterValueRealLiteral_3=ruleMParameterValueRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterValueRealLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueLiteral"


    // $ANTLR start "entryRuleMParameterValueBooleanLiteral"
    // InternalFLATMCAD.g:1878:1: entryRuleMParameterValueBooleanLiteral returns [EObject current=null] : iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF ;
    public final EObject entryRuleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueBooleanLiteral = null;


        try {
            // InternalFLATMCAD.g:1879:2: (iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF )
            // InternalFLATMCAD.g:1880:2: iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValueBooleanLiteral=ruleMParameterValueBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValueBooleanLiteral"


    // $ANTLR start "ruleMParameterValueBooleanLiteral"
    // InternalFLATMCAD.g:1887:1: ruleMParameterValueBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1890:28: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // InternalFLATMCAD.g:1891:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // InternalFLATMCAD.g:1891:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // InternalFLATMCAD.g:1891:2: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // InternalFLATMCAD.g:1891:2: ()
            // InternalFLATMCAD.g:1892:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalFLATMCAD.g:1900:2: ( (lv_value_1_0= ruleEBoolean ) )
            // InternalFLATMCAD.g:1901:1: (lv_value_1_0= ruleEBoolean )
            {
            // InternalFLATMCAD.g:1901:1: (lv_value_1_0= ruleEBoolean )
            // InternalFLATMCAD.g:1902:3: lv_value_1_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterValueBooleanLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.EBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueBooleanLiteral"


    // $ANTLR start "entryRuleMParameterValueStringLiteral"
    // InternalFLATMCAD.g:1926:1: entryRuleMParameterValueStringLiteral returns [EObject current=null] : iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF ;
    public final EObject entryRuleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueStringLiteral = null;


        try {
            // InternalFLATMCAD.g:1927:2: (iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF )
            // InternalFLATMCAD.g:1928:2: iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValueStringLiteral=ruleMParameterValueStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValueStringLiteral"


    // $ANTLR start "ruleMParameterValueStringLiteral"
    // InternalFLATMCAD.g:1935:1: ruleMParameterValueStringLiteral returns [EObject current=null] : ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isRaw_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:1938:28: ( ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalFLATMCAD.g:1939:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalFLATMCAD.g:1939:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalFLATMCAD.g:1939:2: () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalFLATMCAD.g:1939:2: ()
            // InternalFLATMCAD.g:1940:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalFLATMCAD.g:1948:2: ( (lv_isRaw_1_0= 'raw' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFLATMCAD.g:1949:1: (lv_isRaw_1_0= 'raw' )
                    {
                    // InternalFLATMCAD.g:1949:1: (lv_isRaw_1_0= 'raw' )
                    // InternalFLATMCAD.g:1950:3: lv_isRaw_1_0= 'raw'
                    {
                    lv_isRaw_1_0=(Token)match(input,48,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isRaw_1_0, grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMParameterValueStringLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isRaw", true, "raw");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalFLATMCAD.g:1963:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalFLATMCAD.g:1964:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalFLATMCAD.g:1964:1: (lv_value_2_0= RULE_STRING )
            // InternalFLATMCAD.g:1965:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMParameterValueStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueStringLiteral"


    // $ANTLR start "entryRuleMParameterValueIntegerLiteral"
    // InternalFLATMCAD.g:1989:1: entryRuleMParameterValueIntegerLiteral returns [EObject current=null] : iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF ;
    public final EObject entryRuleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueIntegerLiteral = null;


        try {
            // InternalFLATMCAD.g:1990:2: (iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF )
            // InternalFLATMCAD.g:1991:2: iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueIntegerLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValueIntegerLiteral=ruleMParameterValueIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueIntegerLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValueIntegerLiteral"


    // $ANTLR start "ruleMParameterValueIntegerLiteral"
    // InternalFLATMCAD.g:1998:1: ruleMParameterValueIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:2001:28: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) )
            // InternalFLATMCAD.g:2002:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            {
            // InternalFLATMCAD.g:2002:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            // InternalFLATMCAD.g:2002:2: () ( (lv_value_1_0= ruleINTEGER ) )
            {
            // InternalFLATMCAD.g:2002:2: ()
            // InternalFLATMCAD.g:2003:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalFLATMCAD.g:2011:2: ( (lv_value_1_0= ruleINTEGER ) )
            // InternalFLATMCAD.g:2012:1: (lv_value_1_0= ruleINTEGER )
            {
            // InternalFLATMCAD.g:2012:1: (lv_value_1_0= ruleINTEGER )
            // InternalFLATMCAD.g:2013:3: lv_value_1_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterValueIntegerLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.INTEGER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueIntegerLiteral"


    // $ANTLR start "entryRuleMParameterValueRealLiteral"
    // InternalFLATMCAD.g:2037:1: entryRuleMParameterValueRealLiteral returns [EObject current=null] : iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF ;
    public final EObject entryRuleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRealLiteral = null;


        try {
            // InternalFLATMCAD.g:2038:2: (iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF )
            // InternalFLATMCAD.g:2039:2: iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueRealLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValueRealLiteral=ruleMParameterValueRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueRealLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValueRealLiteral"


    // $ANTLR start "ruleMParameterValueRealLiteral"
    // InternalFLATMCAD.g:2046:1: ruleMParameterValueRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ) ;
    public final EObject ruleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:2049:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ) )
            // InternalFLATMCAD.g:2050:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            {
            // InternalFLATMCAD.g:2050:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            // InternalFLATMCAD.g:2050:2: () ( (lv_value_1_0= ruleREAL ) )
            {
            // InternalFLATMCAD.g:2050:2: ()
            // InternalFLATMCAD.g:2051:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalFLATMCAD.g:2059:2: ( (lv_value_1_0= ruleREAL ) )
            // InternalFLATMCAD.g:2060:1: (lv_value_1_0= ruleREAL )
            {
            // InternalFLATMCAD.g:2060:1: (lv_value_1_0= ruleREAL )
            // InternalFLATMCAD.g:2061:3: lv_value_1_0= ruleREAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterValueRealLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.REAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueRealLiteral"


    // $ANTLR start "entryRuleMParameterValueRefObject"
    // InternalFLATMCAD.g:2085:1: entryRuleMParameterValueRefObject returns [EObject current=null] : iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF ;
    public final EObject entryRuleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRefObject = null;


        try {
            // InternalFLATMCAD.g:2086:2: (iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF )
            // InternalFLATMCAD.g:2087:2: iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueRefObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValueRefObject=ruleMParameterValueRefObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueRefObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValueRefObject"


    // $ANTLR start "ruleMParameterValueRefObject"
    // InternalFLATMCAD.g:2094:1: ruleMParameterValueRefObject returns [EObject current=null] : ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) ;
    public final EObject ruleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:2097:28: ( ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) )
            // InternalFLATMCAD.g:2098:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            {
            // InternalFLATMCAD.g:2098:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalFLATMCAD.g:2098:2: () ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalFLATMCAD.g:2098:2: ()
            // InternalFLATMCAD.g:2099:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0(),
                          current);
                  
            }

            }

            // InternalFLATMCAD.g:2107:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFLATMCAD.g:2108:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFLATMCAD.g:2108:1: ( ruleVersionedQualifiedReferenceName )
            // InternalFLATMCAD.g:2109:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMParameterValueRefObjectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueRefObject"


    // $ANTLR start "entryRuleMParameterValuePAR"
    // InternalFLATMCAD.g:2133:1: entryRuleMParameterValuePAR returns [EObject current=null] : iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF ;
    public final EObject entryRuleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValuePAR = null;


        try {
            // InternalFLATMCAD.g:2134:2: (iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF )
            // InternalFLATMCAD.g:2135:2: iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValuePARRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValuePAR=ruleMParameterValuePAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValuePAR; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValuePAR"


    // $ANTLR start "ruleMParameterValuePAR"
    // InternalFLATMCAD.g:2142:1: ruleMParameterValuePAR returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:2145:28: ( (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) )
            // InternalFLATMCAD.g:2146:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            {
            // InternalFLATMCAD.g:2146:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            // InternalFLATMCAD.g:2146:3: otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0());
                  
            }
            // InternalFLATMCAD.g:2150:1: ( (lv_value_1_0= ruleMParameterValueExpression ) )
            // InternalFLATMCAD.g:2151:1: (lv_value_1_0= ruleMParameterValueExpression )
            {
            // InternalFLATMCAD.g:2151:1: (lv_value_1_0= ruleMParameterValueExpression )
            // InternalFLATMCAD.g:2152:3: lv_value_1_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_value_1_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterValuePARRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMParameterValuePARAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValuePAR"


    // $ANTLR start "entryRuleMParameterValueExpression"
    // InternalFLATMCAD.g:2180:1: entryRuleMParameterValueExpression returns [EObject current=null] : iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF ;
    public final EObject entryRuleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueExpression = null;


        try {
            // InternalFLATMCAD.g:2181:2: (iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF )
            // InternalFLATMCAD.g:2182:2: iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValueExpression=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValueExpression"


    // $ANTLR start "ruleMParameterValueExpression"
    // InternalFLATMCAD.g:2189:1: ruleMParameterValueExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) ;
    public final EObject ruleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:2192:28: ( ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) )
            // InternalFLATMCAD.g:2193:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            {
            // InternalFLATMCAD.g:2193:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            // InternalFLATMCAD.g:2193:2: () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            {
            // InternalFLATMCAD.g:2193:2: ()
            // InternalFLATMCAD.g:2194:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalFLATMCAD.g:2202:2: ( (lv_left_1_0= ruleMParameterValueTERM ) )
            // InternalFLATMCAD.g:2203:1: (lv_left_1_0= ruleMParameterValueTERM )
            {
            // InternalFLATMCAD.g:2203:1: (lv_left_1_0= ruleMParameterValueTERM )
            // InternalFLATMCAD.g:2204:3: lv_left_1_0= ruleMParameterValueTERM
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_46);
            lv_left_1_0=ruleMParameterValueTERM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterValueExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_1_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueTERM");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalFLATMCAD.g:2220:2: ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51||LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFLATMCAD.g:2220:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    {
                    // InternalFLATMCAD.g:2220:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) )
                    // InternalFLATMCAD.g:2221:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    {
                    // InternalFLATMCAD.g:2221:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    // InternalFLATMCAD.g:2222:3: lv_operation_2_0= ruleMParameterValueExpressionOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_operation_2_0=ruleMParameterValueExpressionOperators();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMParameterValueExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operation",
                              		lv_operation_2_0, 
                              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpressionOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalFLATMCAD.g:2238:2: ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    // InternalFLATMCAD.g:2239:1: (lv_right_3_0= ruleMParameterValueExpression )
                    {
                    // InternalFLATMCAD.g:2239:1: (lv_right_3_0= ruleMParameterValueExpression )
                    // InternalFLATMCAD.g:2240:3: lv_right_3_0= ruleMParameterValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleMParameterValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMParameterValueExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueExpression"


    // $ANTLR start "entryRuleMParameterValueTERM"
    // InternalFLATMCAD.g:2264:1: entryRuleMParameterValueTERM returns [EObject current=null] : iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF ;
    public final EObject entryRuleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueTERM = null;


        try {
            // InternalFLATMCAD.g:2265:2: (iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF )
            // InternalFLATMCAD.g:2266:2: iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueTERMRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValueTERM=ruleMParameterValueTERM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueTERM; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMParameterValueTERM"


    // $ANTLR start "ruleMParameterValueTERM"
    // InternalFLATMCAD.g:2273:1: ruleMParameterValueTERM returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) ;
    public final EObject ruleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:2276:28: ( ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) )
            // InternalFLATMCAD.g:2277:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            {
            // InternalFLATMCAD.g:2277:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            // InternalFLATMCAD.g:2277:2: () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            {
            // InternalFLATMCAD.g:2277:2: ()
            // InternalFLATMCAD.g:2278:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0(),
                          current);
                  
            }

            }

            // InternalFLATMCAD.g:2286:2: ( (lv_left_1_0= ruleMParameterValue ) )
            // InternalFLATMCAD.g:2287:1: (lv_left_1_0= ruleMParameterValue )
            {
            // InternalFLATMCAD.g:2287:1: (lv_left_1_0= ruleMParameterValue )
            // InternalFLATMCAD.g:2288:3: lv_left_1_0= ruleMParameterValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_left_1_0=ruleMParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterValueTERMRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_1_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalFLATMCAD.g:2304:2: ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=54 && LA30_0<=55)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalFLATMCAD.g:2304:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    {
                    // InternalFLATMCAD.g:2304:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) )
                    // InternalFLATMCAD.g:2305:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    {
                    // InternalFLATMCAD.g:2305:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    // InternalFLATMCAD.g:2306:3: lv_operation_2_0= ruleMParameterValueTERMOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_operation_2_0=ruleMParameterValueTERMOperators();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMParameterValueTERMRule());
                      	        }
                             		set(
                             			current, 
                             			"operation",
                              		lv_operation_2_0, 
                              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueTERMOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalFLATMCAD.g:2322:2: ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    // InternalFLATMCAD.g:2323:1: (lv_right_3_0= ruleMParameterValueTERM )
                    {
                    // InternalFLATMCAD.g:2323:1: (lv_right_3_0= ruleMParameterValueTERM )
                    // InternalFLATMCAD.g:2324:3: lv_right_3_0= ruleMParameterValueTERM
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleMParameterValueTERM();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMParameterValueTERMRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueTERM");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueTERM"


    // $ANTLR start "entryRuleEBoolean"
    // InternalFLATMCAD.g:2348:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalFLATMCAD.g:2349:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalFLATMCAD.g:2350:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalFLATMCAD.g:2357:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:2360:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalFLATMCAD.g:2361:1: (kw= 'true' | kw= 'false' )
            {
            // InternalFLATMCAD.g:2361:1: (kw= 'true' | kw= 'false' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            else if ( (LA31_0==50) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalFLATMCAD.g:2362:2: kw= 'true'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalFLATMCAD.g:2369:2: kw= 'false'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleINTEGER"
    // InternalFLATMCAD.g:2382:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalFLATMCAD.g:2383:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalFLATMCAD.g:2384:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTEGER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalFLATMCAD.g:2391:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;

         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:2394:28: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalFLATMCAD.g:2395:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalFLATMCAD.g:2395:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT||LA33_0==51) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_HEXADECIMAL) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalFLATMCAD.g:2395:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalFLATMCAD.g:2395:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalFLATMCAD.g:2395:3: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalFLATMCAD.g:2395:3: (kw= '-' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==51) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalFLATMCAD.g:2396:2: kw= '-'
                            {
                            kw=(Token)match(input,51,FollowSets000.FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFLATMCAD.g:2409:10: this_HEXADECIMAL_2= RULE_HEXADECIMAL
                    {
                    this_HEXADECIMAL_2=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXADECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXADECIMAL_2, grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "entryRuleREAL"
    // InternalFLATMCAD.g:2424:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // InternalFLATMCAD.g:2425:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalFLATMCAD.g:2426:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalFLATMCAD.g:2433:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // InternalFLATMCAD.g:2436:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalFLATMCAD.g:2437:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalFLATMCAD.g:2437:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalFLATMCAD.g:2437:2: (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalFLATMCAD.g:2437:2: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFLATMCAD.g:2438:2: kw= '-'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            // InternalFLATMCAD.g:2443:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalFLATMCAD.g:2443:8: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
                  
            }
            kw=(Token)match(input,32,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
                  
            }

            }

            // InternalFLATMCAD.g:2463:2: (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFLATMCAD.g:2464:2: kw= 'e' (kw= '-' )? this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0()); 
                          
                    }
                    // InternalFLATMCAD.g:2469:1: (kw= '-' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==51) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalFLATMCAD.g:2470:2: kw= '-'
                            {
                            kw=(Token)match(input,51,FollowSets000.FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_6, grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleMParameterValueExpressionOperators"
    // InternalFLATMCAD.g:2490:1: ruleMParameterValueExpressionOperators returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleMParameterValueExpressionOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalFLATMCAD.g:2492:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalFLATMCAD.g:2493:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalFLATMCAD.g:2493:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            else if ( (LA37_0==51) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalFLATMCAD.g:2493:2: (enumLiteral_0= '+' )
                    {
                    // InternalFLATMCAD.g:2493:2: (enumLiteral_0= '+' )
                    // InternalFLATMCAD.g:2493:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFLATMCAD.g:2499:6: (enumLiteral_1= '-' )
                    {
                    // InternalFLATMCAD.g:2499:6: (enumLiteral_1= '-' )
                    // InternalFLATMCAD.g:2499:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMParameterValueExpressionOperatorsAccess().getMinusEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueExpressionOperators"


    // $ANTLR start "ruleMParameterValueTERMOperators"
    // InternalFLATMCAD.g:2509:1: ruleMParameterValueTERMOperators returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMParameterValueTERMOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalFLATMCAD.g:2511:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalFLATMCAD.g:2512:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalFLATMCAD.g:2512:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            else if ( (LA38_0==55) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalFLATMCAD.g:2512:2: (enumLiteral_0= '*' )
                    {
                    // InternalFLATMCAD.g:2512:2: (enumLiteral_0= '*' )
                    // InternalFLATMCAD.g:2512:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFLATMCAD.g:2518:6: (enumLiteral_1= '/' )
                    {
                    // InternalFLATMCAD.g:2518:6: (enumLiteral_1= '/' )
                    // InternalFLATMCAD.g:2518:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueTERMOperatorsAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMParameterValueTERMOperatorsAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMParameterValueTERMOperators"

    // $ANTLR start synpred2_InternalFLATMCAD
    public final void synpred2_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_version_7_0 = null;


        // InternalFLATMCAD.g:262:4: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) ) )
        // InternalFLATMCAD.g:262:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) )
        {
        // InternalFLATMCAD.g:262:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) ) )
        // InternalFLATMCAD.g:263:5: {...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalFLATMCAD.g:263:106: ( ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) ) )
        // InternalFLATMCAD.g:264:6: ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0);
        // InternalFLATMCAD.g:267:6: ({...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' ) )
        // InternalFLATMCAD.g:267:7: {...}? => (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:267:16: (otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';' )
        // InternalFLATMCAD.g:267:18: otherlv_5= 'version' otherlv_6= ':=' ( (lv_version_7_0= ruleVersion ) ) otherlv_8= ';'
        {
        otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalFLATMCAD.g:275:1: ( (lv_version_7_0= ruleVersion ) )
        // InternalFLATMCAD.g:276:1: (lv_version_7_0= ruleVersion )
        {
        // InternalFLATMCAD.g:276:1: (lv_version_7_0= ruleVersion )
        // InternalFLATMCAD.g:277:3: lv_version_7_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMFlatMCADAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_4);
        lv_version_7_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalFLATMCAD

    // $ANTLR start synpred3_InternalFLATMCAD
    public final void synpred3_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;

        // InternalFLATMCAD.g:304:4: ( ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) ) )
        // InternalFLATMCAD.g:304:4: ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) )
        {
        // InternalFLATMCAD.g:304:4: ({...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) ) )
        // InternalFLATMCAD.g:305:5: {...}? => ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalFLATMCAD.g:305:106: ( ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) ) )
        // InternalFLATMCAD.g:306:6: ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1);
        // InternalFLATMCAD.g:309:6: ({...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' ) )
        // InternalFLATMCAD.g:309:7: {...}? => (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:309:16: (otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )
        // InternalFLATMCAD.g:309:18: otherlv_9= 'deployment' otherlv_10= 'project' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';'
        {
        otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return ;
        otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalFLATMCAD.g:321:1: ( ( ruleVersionedQualifiedName ) )
        // InternalFLATMCAD.g:322:1: ( ruleVersionedQualifiedName )
        {
        // InternalFLATMCAD.g:322:1: ( ruleVersionedQualifiedName )
        // InternalFLATMCAD.g:323:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_4);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalFLATMCAD

    // $ANTLR start synpred5_InternalFLATMCAD
    public final void synpred5_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_targets_17_0 = null;


        // InternalFLATMCAD.g:350:4: ( ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) ) )
        // InternalFLATMCAD.g:350:4: ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) )
        {
        // InternalFLATMCAD.g:350:4: ({...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) ) )
        // InternalFLATMCAD.g:351:5: {...}? => ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2)");
        }
        // InternalFLATMCAD.g:351:106: ( ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) ) )
        // InternalFLATMCAD.g:352:6: ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2);
        // InternalFLATMCAD.g:355:6: ({...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' ) )
        // InternalFLATMCAD.g:355:7: {...}? => (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:355:16: (otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';' )
        // InternalFLATMCAD.g:355:18: otherlv_14= 'deployment' otherlv_15= 'targets' otherlv_16= '{' ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+ otherlv_18= '}' otherlv_19= ';'
        {
        otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_13); if (state.failed) return ;
        otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return ;
        // InternalFLATMCAD.g:367:1: ( (lv_targets_17_0= ruleMFlatMCADTarget ) )+
        int cnt39=0;
        loop39:
        do {
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                alt39=1;
            }


            switch (alt39) {
        	case 1 :
        	    // InternalFLATMCAD.g:368:1: (lv_targets_17_0= ruleMFlatMCADTarget )
        	    {
        	    // InternalFLATMCAD.g:368:1: (lv_targets_17_0= ruleMFlatMCADTarget )
        	    // InternalFLATMCAD.g:369:3: lv_targets_17_0= ruleMFlatMCADTarget
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMFlatMCADAccess().getTargetsMFlatMCADTargetParserRuleCall_4_2_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_15);
        	    lv_targets_17_0=ruleMFlatMCADTarget();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt39 >= 1 ) break loop39;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(39, input);
                    throw eee;
            }
            cnt39++;
        } while (true);

        otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalFLATMCAD

    // $ANTLR start synpred6_InternalFLATMCAD
    public final void synpred6_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_3=null;

        // InternalFLATMCAD.g:466:4: ( ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) ) )
        // InternalFLATMCAD.g:466:4: ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) )
        {
        // InternalFLATMCAD.g:466:4: ({...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) ) )
        // InternalFLATMCAD.g:467:5: {...}? => ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0)");
        }
        // InternalFLATMCAD.g:467:112: ( ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) ) )
        // InternalFLATMCAD.g:468:6: ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0);
        // InternalFLATMCAD.g:471:6: ({...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) ) )
        // InternalFLATMCAD.g:471:7: {...}? => (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:471:16: (otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) ) )
        // InternalFLATMCAD.g:471:18: otherlv_2= 'platform' ( (otherlv_3= RULE_ID ) )
        {
        otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalFLATMCAD.g:475:1: ( (otherlv_3= RULE_ID ) )
        // InternalFLATMCAD.g:476:1: (otherlv_3= RULE_ID )
        {
        // InternalFLATMCAD.g:476:1: (otherlv_3= RULE_ID )
        // InternalFLATMCAD.g:477:3: otherlv_3= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalFLATMCAD

    // $ANTLR start synpred7_InternalFLATMCAD
    public final void synpred7_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_4=null;

        // InternalFLATMCAD.g:498:4: ( ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) ) )
        // InternalFLATMCAD.g:498:4: ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) )
        {
        // InternalFLATMCAD.g:498:4: ({...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) ) )
        // InternalFLATMCAD.g:499:5: {...}? => ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred7_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1)");
        }
        // InternalFLATMCAD.g:499:112: ( ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) ) )
        // InternalFLATMCAD.g:500:6: ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1);
        // InternalFLATMCAD.g:503:6: ({...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) ) )
        // InternalFLATMCAD.g:503:7: {...}? => (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred7_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:503:16: (otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) ) )
        // InternalFLATMCAD.g:503:18: otherlv_4= 'alternative' ( ( ruleVersionedQualifiedReferenceName ) )
        {
        otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalFLATMCAD.g:507:1: ( ( ruleVersionedQualifiedReferenceName ) )
        // InternalFLATMCAD.g:508:1: ( ruleVersionedQualifiedReferenceName )
        {
        // InternalFLATMCAD.g:508:1: ( ruleVersionedQualifiedReferenceName )
        // InternalFLATMCAD.g:509:3: ruleVersionedQualifiedReferenceName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleVersionedQualifiedReferenceName();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalFLATMCAD

    // $ANTLR start synpred9_InternalFLATMCAD
    public final void synpred9_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_attributeValueAssignments_11_0 = null;


        // InternalFLATMCAD.g:553:4: ( ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) ) )
        // InternalFLATMCAD.g:553:4: ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) )
        {
        // InternalFLATMCAD.g:553:4: ({...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) ) )
        // InternalFLATMCAD.g:554:5: {...}? => ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFLATMCAD.g:554:112: ( ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) ) )
        // InternalFLATMCAD.g:555:6: ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0);
        // InternalFLATMCAD.g:558:6: ({...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' ) )
        // InternalFLATMCAD.g:558:7: {...}? => (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:558:16: (otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';' )
        // InternalFLATMCAD.g:558:18: otherlv_8= 'attribute' otherlv_9= 'values' otherlv_10= '{' ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+ otherlv_12= '}' otherlv_13= ';'
        {
        otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_19); if (state.failed) return ;
        otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_20); if (state.failed) return ;
        // InternalFLATMCAD.g:570:1: ( (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment ) )+
        int cnt40=0;
        loop40:
        do {
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }


            switch (alt40) {
        	case 1 :
        	    // InternalFLATMCAD.g:571:1: (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment )
        	    {
        	    // InternalFLATMCAD.g:571:1: (lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment )
        	    // InternalFLATMCAD.g:572:3: lv_attributeValueAssignments_11_0= ruleMAttributeValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_21);
        	    lv_attributeValueAssignments_11_0=ruleMAttributeValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt40 >= 1 ) break loop40;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(40, input);
                    throw eee;
            }
            cnt40++;
        } while (true);

        otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalFLATMCAD

    // $ANTLR start synpred11_InternalFLATMCAD
    public final void synpred11_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_components_16_0 = null;


        // InternalFLATMCAD.g:603:4: ( ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) )
        // InternalFLATMCAD.g:603:4: ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
        {
        // InternalFLATMCAD.g:603:4: ({...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
        // InternalFLATMCAD.g:604:5: {...}? => ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalFLATMCAD.g:604:112: ( ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
        // InternalFLATMCAD.g:605:6: ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1);
        // InternalFLATMCAD.g:608:6: ({...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' ) )
        // InternalFLATMCAD.g:608:7: {...}? => (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:608:16: (otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';' )
        // InternalFLATMCAD.g:608:18: otherlv_14= 'components' otherlv_15= '{' ( (lv_components_16_0= ruleMFlatComponentInstance ) )+ otherlv_17= '}' otherlv_18= ';'
        {
        otherlv_14=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_22); if (state.failed) return ;
        // InternalFLATMCAD.g:616:1: ( (lv_components_16_0= ruleMFlatComponentInstance ) )+
        int cnt41=0;
        loop41:
        do {
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }


            switch (alt41) {
        	case 1 :
        	    // InternalFLATMCAD.g:617:1: (lv_components_16_0= ruleMFlatComponentInstance )
        	    {
        	    // InternalFLATMCAD.g:617:1: (lv_components_16_0= ruleMFlatComponentInstance )
        	    // InternalFLATMCAD.g:618:3: lv_components_16_0= ruleMFlatComponentInstance
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getComponentsMFlatComponentInstanceParserRuleCall_3_1_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_23);
        	    lv_components_16_0=ruleMFlatComponentInstance();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt41 >= 1 ) break loop41;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(41, input);
                    throw eee;
            }
            cnt41++;
        } while (true);

        otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalFLATMCAD

    // $ANTLR start synpred13_InternalFLATMCAD
    public final void synpred13_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_connections_21_0 = null;


        // InternalFLATMCAD.g:649:4: ( ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) ) )
        // InternalFLATMCAD.g:649:4: ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) )
        {
        // InternalFLATMCAD.g:649:4: ({...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) ) )
        // InternalFLATMCAD.g:650:5: {...}? => ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2)");
        }
        // InternalFLATMCAD.g:650:112: ( ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) ) )
        // InternalFLATMCAD.g:651:6: ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2);
        // InternalFLATMCAD.g:654:6: ({...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' ) )
        // InternalFLATMCAD.g:654:7: {...}? => (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:654:16: (otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';' )
        // InternalFLATMCAD.g:654:18: otherlv_19= 'connections' otherlv_20= '{' ( (lv_connections_21_0= ruleMFlatConnection ) )+ otherlv_22= '}' otherlv_23= ';'
        {
        otherlv_19=(Token)match(input,30,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_24); if (state.failed) return ;
        // InternalFLATMCAD.g:662:1: ( (lv_connections_21_0= ruleMFlatConnection ) )+
        int cnt42=0;
        loop42:
        do {
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }


            switch (alt42) {
        	case 1 :
        	    // InternalFLATMCAD.g:663:1: (lv_connections_21_0= ruleMFlatConnection )
        	    {
        	    // InternalFLATMCAD.g:663:1: (lv_connections_21_0= ruleMFlatConnection )
        	    // InternalFLATMCAD.g:664:3: lv_connections_21_0= ruleMFlatConnection
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getConnectionsMFlatConnectionParserRuleCall_3_2_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_25);
        	    lv_connections_21_0=ruleMFlatConnection();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt42 >= 1 ) break loop42;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(42, input);
                    throw eee;
            }
            cnt42++;
        } while (true);

        otherlv_22=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalFLATMCAD

    // $ANTLR start synpred15_InternalFLATMCAD
    public final void synpred15_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_libraries_26_0 = null;


        // InternalFLATMCAD.g:695:4: ( ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )
        // InternalFLATMCAD.g:695:4: ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
        {
        // InternalFLATMCAD.g:695:4: ({...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
        // InternalFLATMCAD.g:696:5: {...}? => ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3)");
        }
        // InternalFLATMCAD.g:696:112: ( ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
        // InternalFLATMCAD.g:697:6: ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3);
        // InternalFLATMCAD.g:700:6: ({...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' ) )
        // InternalFLATMCAD.g:700:7: {...}? => (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:700:16: (otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';' )
        // InternalFLATMCAD.g:700:18: otherlv_24= 'libraries' otherlv_25= '{' ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+ otherlv_27= '}' otherlv_28= ';'
        {
        otherlv_24=(Token)match(input,31,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_26); if (state.failed) return ;
        // InternalFLATMCAD.g:708:1: ( (lv_libraries_26_0= ruleMFlatServiceLibraryInstance ) )+
        int cnt43=0;
        loop43:
        do {
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=41 && LA43_0<=42)) ) {
                alt43=1;
            }


            switch (alt43) {
        	case 1 :
        	    // InternalFLATMCAD.g:709:1: (lv_libraries_26_0= ruleMFlatServiceLibraryInstance )
        	    {
        	    // InternalFLATMCAD.g:709:1: (lv_libraries_26_0= ruleMFlatServiceLibraryInstance )
        	    // InternalFLATMCAD.g:710:3: lv_libraries_26_0= ruleMFlatServiceLibraryInstance
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMFlatMCADTargetAccess().getLibrariesMFlatServiceLibraryInstanceParserRuleCall_3_3_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_27);
        	    lv_libraries_26_0=ruleMFlatServiceLibraryInstance();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt43 >= 1 ) break loop43;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(43, input);
                    throw eee;
            }
            cnt43++;
        } while (true);

        otherlv_27=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalFLATMCAD

    // $ANTLR start synpred30_InternalFLATMCAD
    public final void synpred30_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_attributeValueAssignments_8_0 = null;


        // InternalFLATMCAD.g:1471:4: ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) )
        // InternalFLATMCAD.g:1471:4: ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
        {
        // InternalFLATMCAD.g:1471:4: ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
        // InternalFLATMCAD.g:1472:5: {...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred30_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalFLATMCAD.g:1472:120: ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
        // InternalFLATMCAD.g:1473:6: ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0);
        // InternalFLATMCAD.g:1476:6: ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
        // InternalFLATMCAD.g:1476:7: {...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred30_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:1476:16: (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
        // InternalFLATMCAD.g:1476:18: otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';'
        {
        otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_19); if (state.failed) return ;
        otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_20); if (state.failed) return ;
        // InternalFLATMCAD.g:1488:1: ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+
        int cnt46=0;
        loop46:
        do {
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==27) ) {
                alt46=1;
            }


            switch (alt46) {
        	case 1 :
        	    // InternalFLATMCAD.g:1489:1: (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment )
        	    {
        	    // InternalFLATMCAD.g:1489:1: (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment )
        	    // InternalFLATMCAD.g:1490:3: lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_21);
        	    lv_attributeValueAssignments_8_0=ruleMAttributeValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt46 >= 1 ) break loop46;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(46, input);
                    throw eee;
            }
            cnt46++;
        } while (true);

        otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalFLATMCAD

    // $ANTLR start synpred32_InternalFLATMCAD
    public final void synpred32_InternalFLATMCAD_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_deviceDriverMappings_14_0 = null;


        // InternalFLATMCAD.g:1521:4: ( ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )
        // InternalFLATMCAD.g:1521:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
        {
        // InternalFLATMCAD.g:1521:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
        // InternalFLATMCAD.g:1522:5: {...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred32_InternalFLATMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalFLATMCAD.g:1522:120: ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
        // InternalFLATMCAD.g:1523:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1);
        // InternalFLATMCAD.g:1526:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
        // InternalFLATMCAD.g:1526:7: {...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred32_InternalFLATMCAD", "true");
        }
        // InternalFLATMCAD.g:1526:16: (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
        // InternalFLATMCAD.g:1526:18: otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';'
        {
        otherlv_11=(Token)match(input,43,FollowSets000.FOLLOW_38); if (state.failed) return ;
        otherlv_12=(Token)match(input,44,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_39); if (state.failed) return ;
        // InternalFLATMCAD.g:1538:1: ( (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping ) )+
        int cnt47=0;
        loop47:
        do {
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==45) ) {
                alt47=1;
            }


            switch (alt47) {
        	case 1 :
        	    // InternalFLATMCAD.g:1539:1: (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping )
        	    {
        	    // InternalFLATMCAD.g:1539:1: (lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping )
        	    // InternalFLATMCAD.g:1540:3: lv_deviceDriverMappings_14_0= ruleMFlatDeviceDriverMapping
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsMFlatDeviceDriverMappingParserRuleCall_4_1_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_40);
        	    lv_deviceDriverMappings_14_0=ruleMFlatDeviceDriverMapping();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt47 >= 1 ) break loop47;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(47, input);
                    throw eee;
            }
            cnt47++;
        } while (true);

        otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred32_InternalFLATMCAD

    // Delegated rules

    public final boolean synpred6_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalFLATMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalFLATMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000940000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006020000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000E8800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008800000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000800000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000800000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000060000800000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008008800000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080008800000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000800000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000F0002000000F0L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0028000000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00C0000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000020L});
    }


}