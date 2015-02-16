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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDEPParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'deployment'", "'project'", "'{'", "'version'", "':='", "'construction'", "'tool'", "'languages'", "','", "'platforms'", "'}'", "'required'", "'interfaces'", "'swpackages'", "'alternatives'", "'requires'", "'instantiable'", "'resource'", "'quantifiable'", "'.'", "'('", "')'", "'::'", "'swpackage'", "'driver'", "'parameter'", "'values'", "'device'", "'mappings'", "'supported'", "'->'", "'deployed'", "'platform'", "'pswpackage'", "'devices'", "'alternative'", "'true'", "'false'", "'-'", "'e'", "'+'", "'*'", "'/'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEXADECIMAL=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalDEPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDEPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDEPParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g"; }



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



    // $ANTLR start "entryRuleMMESPDEPPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:75:1: entryRuleMMESPDEPPackageFile returns [EObject current=null] : iv_ruleMMESPDEPPackageFile= ruleMMESPDEPPackageFile EOF ;
    public final EObject entryRuleMMESPDEPPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPDEPPackageFile = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:76:2: (iv_ruleMMESPDEPPackageFile= ruleMMESPDEPPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:77:2: iv_ruleMMESPDEPPackageFile= ruleMMESPDEPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPDEPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDEPPackageFile_in_entryRuleMMESPDEPPackageFile81);
            iv_ruleMMESPDEPPackageFile=ruleMMESPDEPPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPDEPPackageFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPDEPPackageFile91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPDEPPackageFile"


    // $ANTLR start "ruleMMESPDEPPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:84:1: ruleMMESPDEPPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPDEPPackageElement ) ) ) ;
    public final EObject ruleMMESPDEPPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:87:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPDEPPackageElement ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPDEPPackageElement ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPDEPPackageElement ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:88:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPDEPPackageElement ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMMESPDEPPackageFile128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPDEPPackageFileAccess().getPackageKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:92:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:93:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:93:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:94:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPDEPPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPDEPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMESPDEPPackageFile155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDEPPackageFile167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:114:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:114:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMMESPDEPPackageFile180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMESPDEPPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:118:1: ( ( ruleQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:119:1: ( ruleQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:119:1: ( ruleQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:120:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPDEPPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPDEPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMESPDEPPackageFile207);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDEPPackageFile219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:140:3: ( (lv_element_6_0= ruleMMESPDEPPackageElement ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:141:1: (lv_element_6_0= ruleMMESPDEPPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:141:1: (lv_element_6_0= ruleMMESPDEPPackageElement )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:142:3: lv_element_6_0= ruleMMESPDEPPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPDEPPackageFileAccess().getElementMMESPDEPPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDEPPackageElement_in_ruleMMESPDEPPackageFile242);
            lv_element_6_0=ruleMMESPDEPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMESPDEPPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"MMESPDEPPackageElement");
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
    // $ANTLR end "ruleMMESPDEPPackageFile"


    // $ANTLR start "entryRuleMMESPDEPPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:166:1: entryRuleMMESPDEPPackageElement returns [EObject current=null] : iv_ruleMMESPDEPPackageElement= ruleMMESPDEPPackageElement EOF ;
    public final EObject entryRuleMMESPDEPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPDEPPackageElement = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:167:2: (iv_ruleMMESPDEPPackageElement= ruleMMESPDEPPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:168:2: iv_ruleMMESPDEPPackageElement= ruleMMESPDEPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPDEPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDEPPackageElement_in_entryRuleMMESPDEPPackageElement278);
            iv_ruleMMESPDEPPackageElement=ruleMMESPDEPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPDEPPackageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPDEPPackageElement288); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPDEPPackageElement"


    // $ANTLR start "ruleMMESPDEPPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:175:1: ruleMMESPDEPPackageElement returns [EObject current=null] : this_MMESPDeployment_0= ruleMMESPDeployment ;
    public final EObject ruleMMESPDEPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MMESPDeployment_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:178:28: (this_MMESPDeployment_0= ruleMMESPDeployment )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:180:2: this_MMESPDeployment_0= ruleMMESPDeployment
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMESPDEPPackageElementAccess().getMMESPDeploymentParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDeployment_in_ruleMMESPDEPPackageElement337);
            this_MMESPDeployment_0=ruleMMESPDeployment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MMESPDeployment_0; 
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
    // $ANTLR end "ruleMMESPDEPPackageElement"


    // $ANTLR start "entryRuleMMESPDeployment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:199:1: entryRuleMMESPDeployment returns [EObject current=null] : iv_ruleMMESPDeployment= ruleMMESPDeployment EOF ;
    public final EObject entryRuleMMESPDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPDeployment = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5()
        		);
        	
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:205:2: (iv_ruleMMESPDeployment= ruleMMESPDeployment EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:206:2: iv_ruleMMESPDeployment= ruleMMESPDeployment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPDeploymentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDeployment_in_entryRuleMMESPDeployment377);
            iv_ruleMMESPDeployment=ruleMMESPDeployment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPDeployment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPDeployment387); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPDeployment"


    // $ANTLR start "ruleMMESPDeployment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:216:1: ruleMMESPDeployment returns [EObject current=null] : ( () otherlv_1= 'deployment' otherlv_2= 'project' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?) ) ) otherlv_44= '}' otherlv_45= ';' ) ;
    public final EObject ruleMMESPDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        AntlrDatatypeRuleToken lv_version_8_0 = null;

        EObject lv_deploymentPlatforms_24_0 = null;

        EObject lv_requires_30_0 = null;

        EObject lv_deployedSwPackages_35_0 = null;

        EObject lv_deploymentAlternatives_41_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5()
        		);
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:222:28: ( ( () otherlv_1= 'deployment' otherlv_2= 'project' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?) ) ) otherlv_44= '}' otherlv_45= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:223:1: ( () otherlv_1= 'deployment' otherlv_2= 'project' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?) ) ) otherlv_44= '}' otherlv_45= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:223:1: ( () otherlv_1= 'deployment' otherlv_2= 'project' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?) ) ) otherlv_44= '}' otherlv_45= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:223:2: () otherlv_1= 'deployment' otherlv_2= 'project' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?) ) ) otherlv_44= '}' otherlv_45= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:223:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:224:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMMESPDeploymentAccess().getMMESPDeploymentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMMESPDeployment440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMMESPDeployment452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMMESPDeploymentAccess().getProjectKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:240:1: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:241:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:241:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:242:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMMESPDeployment469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMMESPDeploymentAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPDeploymentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeployment486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:262:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:264:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:264:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:265:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:268:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?)
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:269:3: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+ {...}?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:269:3: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=8;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:271:4: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:271:4: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:272:5: {...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:272:112: ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:273:6: ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:276:6: ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:276:7: {...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:276:16: (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:276:18: otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';'
            	    {
            	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMMESPDeployment544); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMMESPDeploymentAccess().getVersionKeyword_5_0_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMMESPDeployment556); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_0_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:284:1: ( (lv_version_8_0= ruleVersion ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:285:1: (lv_version_8_0= ruleVersion )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:285:1: (lv_version_8_0= ruleVersion )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:286:3: lv_version_8_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleMMESPDeployment577);
            	    lv_version_8_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"version",
            	              		lv_version_8_0, 
            	              		"Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeployment589); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:313:4: ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:313:4: ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:314:5: {...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:314:112: ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:315:6: ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:318:6: ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:318:7: {...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:318:16: (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:318:18: otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';'
            	    {
            	    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMMESPDeployment657); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMMESPDeploymentAccess().getConstructionKeyword_5_1_0());
            	          
            	    }
            	    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMMESPDeployment669); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMMESPDeploymentAccess().getToolKeyword_5_1_1());
            	          
            	    }
            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMMESPDeployment681); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_1_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:330:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:331:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:331:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:332:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPDeploymentRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getCtoolMConstructionToolCrossReference_5_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeployment708);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeployment720); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_1_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:359:4: ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:359:4: ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:360:5: {...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:360:112: ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:361:6: ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:364:6: ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:364:7: {...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:364:16: (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:364:18: otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';'
            	    {
            	    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMMESPDeployment788); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMMESPDeploymentAccess().getLanguagesKeyword_5_2_0());
            	          
            	    }
            	    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMMESPDeployment800); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_2_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:372:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:373:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:373:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:374:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPDeploymentRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeployment827);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:390:2: (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==23) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:390:4: otherlv_18= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMMESPDeployment840); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_18, grammarAccess.getMMESPDeploymentAccess().getCommaKeyword_5_2_3_0());
            	    	          
            	    	    }
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:394:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:395:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:395:1: ( ruleVersionedQualifiedName )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:396:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMMESPDeploymentRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeployment867);
            	    	    ruleVersionedQualifiedName();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeployment881); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_2_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:423:4: ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:423:4: ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:424:5: {...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:424:112: ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:425:6: ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:428:6: ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:428:7: {...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:428:16: (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:428:18: otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';'
            	    {
            	    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMMESPDeployment949); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_3_0());
            	          
            	    }
            	    otherlv_22=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMMESPDeployment961); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getMMESPDeploymentAccess().getPlatformsKeyword_5_3_1());
            	          
            	    }
            	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeployment973); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_3_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:440:1: ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:441:1: (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:441:1: (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:442:3: lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsMMESPDeploymentPlatformParserRuleCall_5_3_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeploymentPlatform_in_ruleMMESPDeployment994);
            	    	    lv_deploymentPlatforms_24_0=ruleMMESPDeploymentPlatform();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deploymentPlatforms",
            	    	              		lv_deploymentPlatforms_24_0, 
            	    	              		"MMESPDeploymentPlatform");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
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

            	    otherlv_25=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeployment1007); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_3_4());
            	          
            	    }
            	    otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeployment1019); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_26, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_3_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:473:4: ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:473:4: ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:474:5: {...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:474:112: ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:475:6: ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:478:6: ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:478:7: {...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:478:16: (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:478:18: otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';'
            	    {
            	    otherlv_27=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMMESPDeployment1087); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getMMESPDeploymentAccess().getRequiredKeyword_5_4_0());
            	          
            	    }
            	    otherlv_28=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMMESPDeployment1099); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_28, grammarAccess.getMMESPDeploymentAccess().getInterfacesKeyword_5_4_1());
            	          
            	    }
            	    otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeployment1111); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_4_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:490:1: ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==30) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:491:1: (lv_requires_30_0= ruleMSwPackageRequiredInterface )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:491:1: (lv_requires_30_0= ruleMSwPackageRequiredInterface )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:492:3: lv_requires_30_0= ruleMSwPackageRequiredInterface
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_4_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMSwPackageRequiredInterface_in_ruleMMESPDeployment1132);
            	    	    lv_requires_30_0=ruleMSwPackageRequiredInterface();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"requires",
            	    	              		lv_requires_30_0, 
            	    	              		"MSwPackageRequiredInterface");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
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

            	    otherlv_31=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeployment1145); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_4_4());
            	          
            	    }
            	    otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeployment1157); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_32, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_4_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:523:4: ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:523:4: ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:524:5: {...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:524:112: ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:525:6: ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:528:6: ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:528:7: {...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:528:16: (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:528:18: otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';'
            	    {
            	    otherlv_33=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMMESPDeployment1225); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_33, grammarAccess.getMMESPDeploymentAccess().getSwpackagesKeyword_5_5_0());
            	          
            	    }
            	    otherlv_34=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeployment1237); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_34, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_5_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:536:1: ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0>=38 && LA5_0<=39)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:537:1: (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:537:1: (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:538:3: lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_5_5_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMMESPSwPackageDeployment_in_ruleMMESPDeployment1258);
            	    	    lv_deployedSwPackages_35_0=ruleMMESPSwPackageDeployment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deployedSwPackages",
            	    	              		lv_deployedSwPackages_35_0, 
            	    	              		"MMESPSwPackageDeployment");
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

            	    otherlv_36=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeployment1271); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_36, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_5_3());
            	          
            	    }
            	    otherlv_37=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeployment1283); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_37, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_5_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:569:4: ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:569:4: ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:570:5: {...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:570:112: ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:571:6: ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:574:6: ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:574:7: {...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeployment", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:574:16: (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:574:18: otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';'
            	    {
            	    otherlv_38=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMMESPDeployment1351); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_38, grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_6_0());
            	          
            	    }
            	    otherlv_39=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMMESPDeployment1363); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_39, grammarAccess.getMMESPDeploymentAccess().getAlternativesKeyword_5_6_1());
            	          
            	    }
            	    otherlv_40=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeployment1375); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_40, grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_6_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:586:1: ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==15) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:587:1: (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:587:1: (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:588:3: lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_5_6_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeploymentAlternative_in_ruleMMESPDeployment1396);
            	    	    lv_deploymentAlternatives_41_0=ruleMMESPDeploymentAlternative();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deploymentAlternatives",
            	    	              		lv_deploymentAlternatives_41_0, 
            	    	              		"MMESPDeploymentAlternative");
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

            	    otherlv_42=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeployment1409); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_42, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_6_4());
            	          
            	    }
            	    otherlv_43=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeployment1421); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_43, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_6_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMMESPDeployment", "getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());

            }

            otherlv_44=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeployment1480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_44, grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_45=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeployment1492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_45, grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMMESPDeployment"


    // $ANTLR start "entryRuleMSwPackageRequiredInterface"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:646:1: entryRuleMSwPackageRequiredInterface returns [EObject current=null] : iv_ruleMSwPackageRequiredInterface= ruleMSwPackageRequiredInterface EOF ;
    public final EObject entryRuleMSwPackageRequiredInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMSwPackageRequiredInterface = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:647:2: (iv_ruleMSwPackageRequiredInterface= ruleMSwPackageRequiredInterface EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:648:2: iv_ruleMSwPackageRequiredInterface= ruleMSwPackageRequiredInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMSwPackageRequiredInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMSwPackageRequiredInterface_in_entryRuleMSwPackageRequiredInterface1532);
            iv_ruleMSwPackageRequiredInterface=ruleMSwPackageRequiredInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMSwPackageRequiredInterface; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMSwPackageRequiredInterface1542); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMSwPackageRequiredInterface"


    // $ANTLR start "ruleMSwPackageRequiredInterface"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:655:1: ruleMSwPackageRequiredInterface returns [EObject current=null] : (otherlv_0= 'requires' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_resourceDemands_3_0= ruleMResourceDemand ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleMSwPackageRequiredInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_resourceDemands_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:658:28: ( (otherlv_0= 'requires' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_resourceDemands_3_0= ruleMResourceDemand ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:659:1: (otherlv_0= 'requires' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_resourceDemands_3_0= ruleMResourceDemand ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:659:1: (otherlv_0= 'requires' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_resourceDemands_3_0= ruleMResourceDemand ) )* otherlv_4= '}' otherlv_5= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:659:3: otherlv_0= 'requires' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_resourceDemands_3_0= ruleMResourceDemand ) )* otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMSwPackageRequiredInterface1579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMSwPackageRequiredInterfaceAccess().getRequiresKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:663:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:664:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:664:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:665:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMSwPackageRequiredInterfaceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceMCommonPackageElementCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMSwPackageRequiredInterface1606);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMSwPackageRequiredInterface1618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMSwPackageRequiredInterfaceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:685:1: ( (lv_resourceDemands_3_0= ruleMResourceDemand ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31||LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:686:1: (lv_resourceDemands_3_0= ruleMResourceDemand )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:686:1: (lv_resourceDemands_3_0= ruleMResourceDemand )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:687:3: lv_resourceDemands_3_0= ruleMResourceDemand
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsMResourceDemandParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMResourceDemand_in_ruleMSwPackageRequiredInterface1639);
            	    lv_resourceDemands_3_0=ruleMResourceDemand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMSwPackageRequiredInterfaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"resourceDemands",
            	              		lv_resourceDemands_3_0, 
            	              		"MResourceDemand");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMSwPackageRequiredInterface1652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMSwPackageRequiredInterfaceAccess().getRightCurlyBracketKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMSwPackageRequiredInterface1664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMSwPackageRequiredInterfaceAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleMSwPackageRequiredInterface"


    // $ANTLR start "entryRuleMResourceDemand"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:719:1: entryRuleMResourceDemand returns [EObject current=null] : iv_ruleMResourceDemand= ruleMResourceDemand EOF ;
    public final EObject entryRuleMResourceDemand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMResourceDemand = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:720:2: (iv_ruleMResourceDemand= ruleMResourceDemand EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:721:2: iv_ruleMResourceDemand= ruleMResourceDemand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMResourceDemandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMResourceDemand_in_entryRuleMResourceDemand1700);
            iv_ruleMResourceDemand=ruleMResourceDemand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMResourceDemand; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMResourceDemand1710); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMResourceDemand"


    // $ANTLR start "ruleMResourceDemand"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:728:1: ruleMResourceDemand returns [EObject current=null] : (this_MQuantifiableResourceDemand_0= ruleMQuantifiableResourceDemand | this_MInstantiableResourceDemand_1= ruleMInstantiableResourceDemand ) ;
    public final EObject ruleMResourceDemand() throws RecognitionException {
        EObject current = null;

        EObject this_MQuantifiableResourceDemand_0 = null;

        EObject this_MInstantiableResourceDemand_1 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:731:28: ( (this_MQuantifiableResourceDemand_0= ruleMQuantifiableResourceDemand | this_MInstantiableResourceDemand_1= ruleMInstantiableResourceDemand ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:732:1: (this_MQuantifiableResourceDemand_0= ruleMQuantifiableResourceDemand | this_MInstantiableResourceDemand_1= ruleMInstantiableResourceDemand )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:732:1: (this_MQuantifiableResourceDemand_0= ruleMQuantifiableResourceDemand | this_MInstantiableResourceDemand_1= ruleMInstantiableResourceDemand )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:733:2: this_MQuantifiableResourceDemand_0= ruleMQuantifiableResourceDemand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMResourceDemandAccess().getMQuantifiableResourceDemandParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMQuantifiableResourceDemand_in_ruleMResourceDemand1760);
                    this_MQuantifiableResourceDemand_0=ruleMQuantifiableResourceDemand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MQuantifiableResourceDemand_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:746:2: this_MInstantiableResourceDemand_1= ruleMInstantiableResourceDemand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMResourceDemandAccess().getMInstantiableResourceDemandParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMInstantiableResourceDemand_in_ruleMResourceDemand1790);
                    this_MInstantiableResourceDemand_1=ruleMInstantiableResourceDemand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MInstantiableResourceDemand_1; 
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
    // $ANTLR end "ruleMResourceDemand"


    // $ANTLR start "entryRuleMInstantiableResourceDemand"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:765:1: entryRuleMInstantiableResourceDemand returns [EObject current=null] : iv_ruleMInstantiableResourceDemand= ruleMInstantiableResourceDemand EOF ;
    public final EObject entryRuleMInstantiableResourceDemand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInstantiableResourceDemand = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:766:2: (iv_ruleMInstantiableResourceDemand= ruleMInstantiableResourceDemand EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:767:2: iv_ruleMInstantiableResourceDemand= ruleMInstantiableResourceDemand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInstantiableResourceDemandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInstantiableResourceDemand_in_entryRuleMInstantiableResourceDemand1825);
            iv_ruleMInstantiableResourceDemand=ruleMInstantiableResourceDemand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInstantiableResourceDemand; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMInstantiableResourceDemand1835); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMInstantiableResourceDemand"


    // $ANTLR start "ruleMInstantiableResourceDemand"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:774:1: ruleMInstantiableResourceDemand returns [EObject current=null] : (otherlv_0= 'instantiable' otherlv_1= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_parameterValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleMInstantiableResourceDemand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameterValueAssignments_5_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:777:28: ( (otherlv_0= 'instantiable' otherlv_1= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_parameterValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:778:1: (otherlv_0= 'instantiable' otherlv_1= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_parameterValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:778:1: (otherlv_0= 'instantiable' otherlv_1= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_parameterValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:778:3: otherlv_0= 'instantiable' otherlv_1= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_parameterValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMInstantiableResourceDemand1872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMInstantiableResourceDemandAccess().getInstantiableKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMInstantiableResourceDemand1884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMInstantiableResourceDemandAccess().getResourceKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:786:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:787:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:787:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:788:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInstantiableResourceDemandRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMInstantiableResourceDemandAccess().getResourceMInstantiableResourceCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMInstantiableResourceDemand1911);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:804:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:805:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:805:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:806:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMInstantiableResourceDemand1928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMInstantiableResourceDemandAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMInstantiableResourceDemandRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMInstantiableResourceDemand1945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMInstantiableResourceDemandAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:826:1: ( (lv_parameterValueAssignments_5_0= ruleMParameterValueAssignment ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:827:1: (lv_parameterValueAssignments_5_0= ruleMParameterValueAssignment )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:827:1: (lv_parameterValueAssignments_5_0= ruleMParameterValueAssignment )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:828:3: lv_parameterValueAssignments_5_0= ruleMParameterValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueAssignment_in_ruleMInstantiableResourceDemand1966);
            	    lv_parameterValueAssignments_5_0=ruleMParameterValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMInstantiableResourceDemandRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameterValueAssignments",
            	              		lv_parameterValueAssignments_5_0, 
            	              		"MParameterValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMInstantiableResourceDemand1979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMInstantiableResourceDemandAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMInstantiableResourceDemand1991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMInstantiableResourceDemandAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMInstantiableResourceDemand"


    // $ANTLR start "entryRuleMQuantifiableResourceDemand"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:860:1: entryRuleMQuantifiableResourceDemand returns [EObject current=null] : iv_ruleMQuantifiableResourceDemand= ruleMQuantifiableResourceDemand EOF ;
    public final EObject entryRuleMQuantifiableResourceDemand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMQuantifiableResourceDemand = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:861:2: (iv_ruleMQuantifiableResourceDemand= ruleMQuantifiableResourceDemand EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:862:2: iv_ruleMQuantifiableResourceDemand= ruleMQuantifiableResourceDemand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMQuantifiableResourceDemandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMQuantifiableResourceDemand_in_entryRuleMQuantifiableResourceDemand2027);
            iv_ruleMQuantifiableResourceDemand=ruleMQuantifiableResourceDemand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMQuantifiableResourceDemand; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMQuantifiableResourceDemand2037); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMQuantifiableResourceDemand"


    // $ANTLR start "ruleMQuantifiableResourceDemand"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:869:1: ruleMQuantifiableResourceDemand returns [EObject current=null] : ( () otherlv_1= 'quantifiable' otherlv_2= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_4= ':=' ( (lv_resourceValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleMQuantifiableResourceDemand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_resourceValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:872:28: ( ( () otherlv_1= 'quantifiable' otherlv_2= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_4= ':=' ( (lv_resourceValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:873:1: ( () otherlv_1= 'quantifiable' otherlv_2= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_4= ':=' ( (lv_resourceValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:873:1: ( () otherlv_1= 'quantifiable' otherlv_2= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_4= ':=' ( (lv_resourceValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:873:2: () otherlv_1= 'quantifiable' otherlv_2= 'resource' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_4= ':=' ( (lv_resourceValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:873:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:874:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMQuantifiableResourceDemandAccess().getMQuantifiableResourceDemandAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMQuantifiableResourceDemand2086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMQuantifiableResourceDemandAccess().getQuantifiableKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMQuantifiableResourceDemand2098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMQuantifiableResourceDemandAccess().getResourceKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:890:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:891:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:891:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:892:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMQuantifiableResourceDemandRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceMQuantifiableResourceCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMQuantifiableResourceDemand2125);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMQuantifiableResourceDemand2137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMQuantifiableResourceDemandAccess().getColonEqualsSignKeyword_4());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:912:1: ( (lv_resourceValue_5_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:913:1: (lv_resourceValue_5_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:913:1: (lv_resourceValue_5_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:914:3: lv_resourceValue_5_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueMParameterValueExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMQuantifiableResourceDemand2158);
            lv_resourceValue_5_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMQuantifiableResourceDemandRule());
              	        }
                     		set(
                     			current, 
                     			"resourceValue",
                      		lv_resourceValue_5_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMQuantifiableResourceDemand2170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMQuantifiableResourceDemandAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMQuantifiableResourceDemand"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:942:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:943:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:944:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2207);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName2218); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:951:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:954:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:955:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:955:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:955:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName2258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:962:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:963:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleQualifiedName2277); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName2292); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:983:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:984:2: (iv_ruleVersion= ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:985:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion2340);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion2351); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:992:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:995:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:996:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:996:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:996:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:996:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||LA13_1==13||LA13_1==34||LA13_1==36) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:996:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion2392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1004:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1004:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1004:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1004:7: (this_INT_1= RULE_INT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_INT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1004:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion2420); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
                                  
                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion2442); if (state.failed) return current;
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

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1018:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1019:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleVersion2463); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1024:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==RULE_INT) ) {
            	        int LA15_1 = input.LA(2);

            	        if ( (LA15_1==RULE_ID) ) {
            	            alt15=2;
            	        }
            	        else if ( (LA15_1==EOF||LA15_1==13||LA15_1==34||LA15_1==36) ) {
            	            alt15=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 15, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA15_0==RULE_ID) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1024:6: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion2479); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_4);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1032:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1032:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1032:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1032:7: (this_INT_5= RULE_INT )?
            	            int alt14=2;
            	            int LA14_0 = input.LA(1);

            	            if ( (LA14_0==RULE_INT) ) {
            	                alt14=1;
            	            }
            	            switch (alt14) {
            	                case 1 :
            	                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1032:12: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion2507); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      		current.merge(this_INT_5);
            	                          
            	                    }
            	                    if ( state.backtracking==0 ) {
            	                       
            	                          newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            	                          
            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion2529); if (state.failed) return current;
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
            	    break loop16;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1054:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1055:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1056:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName2579);
            iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedName2590); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1063:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1066:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1067:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1067:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1068:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleVersionedQualifiedName2637);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVersionedQualifiedName2655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleVersionedQualifiedName2677);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Version_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleVersionedQualifiedName2695); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1109:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1110:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1111:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName2736);
            iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedReferenceName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName2747); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1118:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1121:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1122:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1122:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1122:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1122:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>=34 && LA17_1<=35)) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1123:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleVersionedQualifiedReferenceName2795);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VersionedQualifiedName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleVersionedQualifiedReferenceName2813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName2830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1146:1: (kw= '::' this_ID_4= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1147:2: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleVersionedQualifiedReferenceName2849); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            	          
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName2864); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "entryRuleMMESPSwPackageDeployment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1167:1: entryRuleMMESPSwPackageDeployment returns [EObject current=null] : iv_ruleMMESPSwPackageDeployment= ruleMMESPSwPackageDeployment EOF ;
    public final EObject entryRuleMMESPSwPackageDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPSwPackageDeployment = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1168:2: (iv_ruleMMESPSwPackageDeployment= ruleMMESPSwPackageDeployment EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1169:2: iv_ruleMMESPSwPackageDeployment= ruleMMESPSwPackageDeployment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPSwPackageDeploymentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPSwPackageDeployment_in_entryRuleMMESPSwPackageDeployment2911);
            iv_ruleMMESPSwPackageDeployment=ruleMMESPSwPackageDeployment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPSwPackageDeployment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPSwPackageDeployment2921); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPSwPackageDeployment"


    // $ANTLR start "ruleMMESPSwPackageDeployment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1176:1: ruleMMESPSwPackageDeployment returns [EObject current=null] : (this_MMESPRegularSwPackageDeployment_0= ruleMMESPRegularSwPackageDeployment | this_MMESPDriverSwPackageDeployment_1= ruleMMESPDriverSwPackageDeployment ) ;
    public final EObject ruleMMESPSwPackageDeployment() throws RecognitionException {
        EObject current = null;

        EObject this_MMESPRegularSwPackageDeployment_0 = null;

        EObject this_MMESPDriverSwPackageDeployment_1 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1179:28: ( (this_MMESPRegularSwPackageDeployment_0= ruleMMESPRegularSwPackageDeployment | this_MMESPDriverSwPackageDeployment_1= ruleMMESPDriverSwPackageDeployment ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1180:1: (this_MMESPRegularSwPackageDeployment_0= ruleMMESPRegularSwPackageDeployment | this_MMESPDriverSwPackageDeployment_1= ruleMMESPDriverSwPackageDeployment )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1180:1: (this_MMESPRegularSwPackageDeployment_0= ruleMMESPRegularSwPackageDeployment | this_MMESPDriverSwPackageDeployment_1= ruleMMESPDriverSwPackageDeployment )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1181:2: this_MMESPRegularSwPackageDeployment_0= ruleMMESPRegularSwPackageDeployment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPRegularSwPackageDeploymentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMMESPRegularSwPackageDeployment_in_ruleMMESPSwPackageDeployment2971);
                    this_MMESPRegularSwPackageDeployment_0=ruleMMESPRegularSwPackageDeployment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MMESPRegularSwPackageDeployment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1194:2: this_MMESPDriverSwPackageDeployment_1= ruleMMESPDriverSwPackageDeployment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMMESPDriverSwPackageDeployment_in_ruleMMESPSwPackageDeployment3001);
                    this_MMESPDriverSwPackageDeployment_1=ruleMMESPDriverSwPackageDeployment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MMESPDriverSwPackageDeployment_1; 
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
    // $ANTLR end "ruleMMESPSwPackageDeployment"


    // $ANTLR start "entryRuleMMESPRegularSwPackageDeployment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1213:1: entryRuleMMESPRegularSwPackageDeployment returns [EObject current=null] : iv_ruleMMESPRegularSwPackageDeployment= ruleMMESPRegularSwPackageDeployment EOF ;
    public final EObject entryRuleMMESPRegularSwPackageDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPRegularSwPackageDeployment = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1214:2: (iv_ruleMMESPRegularSwPackageDeployment= ruleMMESPRegularSwPackageDeployment EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1215:2: iv_ruleMMESPRegularSwPackageDeployment= ruleMMESPRegularSwPackageDeployment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPRegularSwPackageDeploymentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPRegularSwPackageDeployment_in_entryRuleMMESPRegularSwPackageDeployment3036);
            iv_ruleMMESPRegularSwPackageDeployment=ruleMMESPRegularSwPackageDeployment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPRegularSwPackageDeployment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPRegularSwPackageDeployment3046); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPRegularSwPackageDeployment"


    // $ANTLR start "ruleMMESPRegularSwPackageDeployment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1222:1: ruleMMESPRegularSwPackageDeployment returns [EObject current=null] : ( () otherlv_1= 'swpackage' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' ) ;
    public final EObject ruleMMESPRegularSwPackageDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameterValueAssignments_4_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1225:28: ( ( () otherlv_1= 'swpackage' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1226:1: ( () otherlv_1= 'swpackage' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1226:1: ( () otherlv_1= 'swpackage' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1226:2: () otherlv_1= 'swpackage' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1226:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1227:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getMMESPSwPackageDeploymentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMMESPRegularSwPackageDeployment3095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwpackageKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1239:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1240:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1240:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1241:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPRegularSwPackageDeploymentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageMSwPackageCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPRegularSwPackageDeployment3122);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPRegularSwPackageDeployment3134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1261:1: ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1262:1: (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1262:1: (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1263:3: lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueAssignment_in_ruleMMESPRegularSwPackageDeployment3155);
            	    lv_parameterValueAssignments_4_0=ruleMParameterValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMMESPRegularSwPackageDeploymentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameterValueAssignments",
            	              		lv_parameterValueAssignments_4_0, 
            	              		"MParameterValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPRegularSwPackageDeployment3168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPRegularSwPackageDeployment3180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMMESPRegularSwPackageDeployment"


    // $ANTLR start "entryRuleMMESPDriverSwPackageDeployment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1295:1: entryRuleMMESPDriverSwPackageDeployment returns [EObject current=null] : iv_ruleMMESPDriverSwPackageDeployment= ruleMMESPDriverSwPackageDeployment EOF ;
    public final EObject entryRuleMMESPDriverSwPackageDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPDriverSwPackageDeployment = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1301:2: (iv_ruleMMESPDriverSwPackageDeployment= ruleMMESPDriverSwPackageDeployment EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1302:2: iv_ruleMMESPDriverSwPackageDeployment= ruleMMESPDriverSwPackageDeployment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDriverSwPackageDeployment_in_entryRuleMMESPDriverSwPackageDeployment3222);
            iv_ruleMMESPDriverSwPackageDeployment=ruleMMESPDriverSwPackageDeployment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPDriverSwPackageDeployment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPDriverSwPackageDeployment3232); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPDriverSwPackageDeployment"


    // $ANTLR start "ruleMMESPDriverSwPackageDeployment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1312:1: ruleMMESPDriverSwPackageDeployment returns [EObject current=null] : ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' ) ;
    public final EObject ruleMMESPDriverSwPackageDeployment() throws RecognitionException {
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
        EObject lv_parameterValueAssignments_8_0 = null;

        EObject lv_deviceDriverMappings_14_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4()
        		);
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1318:28: ( ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1319:1: ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1319:1: ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1319:2: () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1319:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1320:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMMESPDriverSwPackageDeployment3285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDriverKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1332:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1333:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1333:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1334:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPDriverSwPackageDeploymentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageMDriverSwPackageCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDriverSwPackageDeployment3312);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDriverSwPackageDeployment3324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1354:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1356:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1356:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1357:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1360:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1361:3: ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )*
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1361:3: ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( LA23_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1363:4: ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1363:4: ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1364:5: {...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDriverSwPackageDeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1364:127: ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1365:6: ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1368:6: ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1368:7: {...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDriverSwPackageDeployment", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1368:16: (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1368:18: otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';'
            	    {
            	    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMMESPDriverSwPackageDeployment3382); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterKeyword_4_0_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMMESPDriverSwPackageDeployment3394); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getValuesKeyword_4_0_1());
            	          
            	    }
            	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDriverSwPackageDeployment3406); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_0_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1380:1: ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+
            	    int cnt21=0;
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==40) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1381:1: (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1381:1: (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1382:3: lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueAssignment_in_ruleMMESPDriverSwPackageDeployment3427);
            	    	    lv_parameterValueAssignments_8_0=ruleMParameterValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDriverSwPackageDeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"parameterValueAssignments",
            	    	              		lv_parameterValueAssignments_8_0, 
            	    	              		"MParameterValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt21 >= 1 ) break loop21;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(21, input);
            	                throw eee;
            	        }
            	        cnt21++;
            	    } while (true);

            	    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDriverSwPackageDeployment3440); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_0_4());
            	          
            	    }
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDriverSwPackageDeployment3452); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_0_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1413:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1413:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1414:5: {...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDriverSwPackageDeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1414:127: ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1415:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1418:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1418:7: {...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDriverSwPackageDeployment", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1418:16: (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1418:18: otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';'
            	    {
            	    otherlv_11=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMMESPDriverSwPackageDeployment3520); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceKeyword_4_1_0());
            	          
            	    }
            	    otherlv_12=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMMESPDriverSwPackageDeployment3532); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMappingsKeyword_4_1_1());
            	          
            	    }
            	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDriverSwPackageDeployment3544); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_1_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1430:1: ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+
            	    int cnt22=0;
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==44) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1431:1: (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1431:1: (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1432:3: lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsMMESPDeviceDriverMappingParserRuleCall_4_1_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeviceDriverMapping_in_ruleMMESPDriverSwPackageDeployment3565);
            	    	    lv_deviceDriverMappings_14_0=ruleMMESPDeviceDriverMapping();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDriverSwPackageDeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deviceDriverMappings",
            	    	              		lv_deviceDriverMappings_14_0, 
            	    	              		"MMESPDeviceDriverMapping");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt22 >= 1 ) break loop22;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(22, input);
            	                throw eee;
            	        }
            	        cnt22++;
            	    } while (true);

            	    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDriverSwPackageDeployment3578); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_1_4());
            	          
            	    }
            	    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDriverSwPackageDeployment3590); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_1_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());

            }

            otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDriverSwPackageDeployment3643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDriverSwPackageDeployment3655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMMESPDriverSwPackageDeployment"


    // $ANTLR start "entryRuleMMESPDeviceDriverMapping"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1489:1: entryRuleMMESPDeviceDriverMapping returns [EObject current=null] : iv_ruleMMESPDeviceDriverMapping= ruleMMESPDeviceDriverMapping EOF ;
    public final EObject entryRuleMMESPDeviceDriverMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPDeviceDriverMapping = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1490:2: (iv_ruleMMESPDeviceDriverMapping= ruleMMESPDeviceDriverMapping EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1491:2: iv_ruleMMESPDeviceDriverMapping= ruleMMESPDeviceDriverMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPDeviceDriverMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDeviceDriverMapping_in_entryRuleMMESPDeviceDriverMapping3695);
            iv_ruleMMESPDeviceDriverMapping=ruleMMESPDeviceDriverMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPDeviceDriverMapping; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPDeviceDriverMapping3705); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPDeviceDriverMapping"


    // $ANTLR start "ruleMMESPDeviceDriverMapping"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1498:1: ruleMMESPDeviceDriverMapping returns [EObject current=null] : (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' ) ;
    public final EObject ruleMMESPDeviceDriverMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1501:28: ( (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1502:1: (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1502:1: (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1502:3: otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMMESPDeviceDriverMapping3742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMMESPDeviceDriverMapping3754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1510:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1511:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1511:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1512:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPDeviceDriverMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMMESPDeviceDriverMapping3781);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMMESPDeviceDriverMapping3793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMMESPDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleMMESPDeviceDriverMapping3805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMMESPDeviceDriverMapping3817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_5());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1540:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1541:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1541:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1542:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPDeviceDriverMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceMMESPDeployedDeviceCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMMESPDeviceDriverMapping3844);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeviceDriverMapping3856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMMESPDeviceDriverMappingAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMMESPDeviceDriverMapping"


    // $ANTLR start "entryRuleMParameterValueAssignment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1570:1: entryRuleMParameterValueAssignment returns [EObject current=null] : iv_ruleMParameterValueAssignment= ruleMParameterValueAssignment EOF ;
    public final EObject entryRuleMParameterValueAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueAssignment = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1571:2: (iv_ruleMParameterValueAssignment= ruleMParameterValueAssignment EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1572:2: iv_ruleMParameterValueAssignment= ruleMParameterValueAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueAssignment_in_entryRuleMParameterValueAssignment3892);
            iv_ruleMParameterValueAssignment=ruleMParameterValueAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueAssignment3902); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMParameterValueAssignment"


    // $ANTLR start "ruleMParameterValueAssignment"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1579:1: ruleMParameterValueAssignment returns [EObject current=null] : (otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleMParameterValueAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterValue_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1582:28: ( (otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1583:1: (otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1583:1: (otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1583:3: otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMParameterValueAssignment3939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValueAssignmentAccess().getParameterKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1587:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1588:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1588:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1589:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMParameterValueAssignmentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMParameterValueAssignment3966);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMParameterValueAssignment3978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMParameterValueAssignmentAccess().getColonEqualsSignKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1609:1: ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1610:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1610:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1611:3: lv_parameterValue_3_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValueAssignment3999);
            lv_parameterValue_3_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterValueAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"parameterValue",
                      		lv_parameterValue_3_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMParameterValueAssignment4011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMParameterValueAssignmentAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleMParameterValueAssignment"


    // $ANTLR start "entryRuleMParameterValue"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1639:1: entryRuleMParameterValue returns [EObject current=null] : iv_ruleMParameterValue= ruleMParameterValue EOF ;
    public final EObject entryRuleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValue = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1640:2: (iv_ruleMParameterValue= ruleMParameterValue EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1641:2: iv_ruleMParameterValue= ruleMParameterValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValue_in_entryRuleMParameterValue4047);
            iv_ruleMParameterValue=ruleMParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValue4057); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1648:1: ruleMParameterValue returns [EObject current=null] : (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) ;
    public final EObject ruleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueLiteral_0 = null;

        EObject this_MParameterValueRefObject_1 = null;

        EObject this_MParameterValuePAR_2 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1651:28: ( (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1652:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1652:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEXADECIMAL:
            case 51:
            case 52:
            case 53:
                {
                alt24=1;
                }
                break;
            case RULE_ID:
                {
                alt24=2;
                }
                break;
            case 35:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1653:2: this_MParameterValueLiteral_0= ruleMParameterValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueLiteral_in_ruleMParameterValue4107);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1666:2: this_MParameterValueRefObject_1= ruleMParameterValueRefObject
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueRefObject_in_ruleMParameterValue4137);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1679:2: this_MParameterValuePAR_2= ruleMParameterValuePAR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValuePAR_in_ruleMParameterValue4167);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1698:1: entryRuleMParameterValueLiteral returns [EObject current=null] : iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF ;
    public final EObject entryRuleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1699:2: (iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1700:2: iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueLiteral_in_entryRuleMParameterValueLiteral4202);
            iv_ruleMParameterValueLiteral=ruleMParameterValueLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueLiteral4212); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1707:1: ruleMParameterValueLiteral returns [EObject current=null] : (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) ;
    public final EObject ruleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueBooleanLiteral_0 = null;

        EObject this_MParameterValueStringLiteral_1 = null;

        EObject this_MParameterValueIntegerLiteral_2 = null;

        EObject this_MParameterValueRealLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1710:28: ( (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1711:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1711:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 51:
            case 52:
                {
                alt25=1;
                }
                break;
            case RULE_STRING:
                {
                alt25=2;
                }
                break;
            case 53:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==RULE_INT) ) {
                    int LA25_4 = input.LA(3);

                    if ( (LA25_4==34) ) {
                        alt25=4;
                    }
                    else if ( (LA25_4==EOF||LA25_4==13||LA25_4==36||LA25_4==53||(LA25_4>=55 && LA25_4<=57)) ) {
                        alt25=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA25_4 = input.LA(2);

                if ( (LA25_4==34) ) {
                    alt25=4;
                }
                else if ( (LA25_4==EOF||LA25_4==13||LA25_4==36||LA25_4==53||(LA25_4>=55 && LA25_4<=57)) ) {
                    alt25=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEXADECIMAL:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1712:2: this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueBooleanLiteral_in_ruleMParameterValueLiteral4262);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1725:2: this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueStringLiteral_in_ruleMParameterValueLiteral4292);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1738:2: this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueIntegerLiteral_in_ruleMParameterValueLiteral4322);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1751:2: this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueRealLiteral_in_ruleMParameterValueLiteral4352);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1770:1: entryRuleMParameterValueBooleanLiteral returns [EObject current=null] : iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF ;
    public final EObject entryRuleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueBooleanLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1771:2: (iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1772:2: iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueBooleanLiteral_in_entryRuleMParameterValueBooleanLiteral4387);
            iv_ruleMParameterValueBooleanLiteral=ruleMParameterValueBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueBooleanLiteral4397); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1779:1: ruleMParameterValueBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1782:28: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1783:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1783:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1783:2: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1783:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1784:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1792:2: ( (lv_value_1_0= ruleEBoolean ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1793:1: (lv_value_1_0= ruleEBoolean )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1793:1: (lv_value_1_0= ruleEBoolean )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1794:3: lv_value_1_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleMParameterValueBooleanLiteral4455);
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
                      		"EBoolean");
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1818:1: entryRuleMParameterValueStringLiteral returns [EObject current=null] : iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF ;
    public final EObject entryRuleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueStringLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1819:2: (iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1820:2: iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueStringLiteral_in_entryRuleMParameterValueStringLiteral4491);
            iv_ruleMParameterValueStringLiteral=ruleMParameterValueStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueStringLiteral4501); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1827:1: ruleMParameterValueStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1830:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1831:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1831:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1831:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1831:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1832:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1840:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1841:1: (lv_value_1_0= RULE_STRING )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1841:1: (lv_value_1_0= RULE_STRING )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1842:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMParameterValueStringLiteral4555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMParameterValueStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1866:1: entryRuleMParameterValueIntegerLiteral returns [EObject current=null] : iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF ;
    public final EObject entryRuleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueIntegerLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1867:2: (iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1868:2: iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueIntegerLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueIntegerLiteral_in_entryRuleMParameterValueIntegerLiteral4596);
            iv_ruleMParameterValueIntegerLiteral=ruleMParameterValueIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueIntegerLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueIntegerLiteral4606); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1875:1: ruleMParameterValueIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1878:28: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1879:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1879:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1879:2: () ( (lv_value_1_0= ruleINTEGER ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1879:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1880:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1888:2: ( (lv_value_1_0= ruleINTEGER ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1889:1: (lv_value_1_0= ruleINTEGER )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1889:1: (lv_value_1_0= ruleINTEGER )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1890:3: lv_value_1_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_ruleMParameterValueIntegerLiteral4664);
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
                      		"INTEGER");
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1914:1: entryRuleMParameterValueRealLiteral returns [EObject current=null] : iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF ;
    public final EObject entryRuleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRealLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1915:2: (iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1916:2: iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueRealLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueRealLiteral_in_entryRuleMParameterValueRealLiteral4700);
            iv_ruleMParameterValueRealLiteral=ruleMParameterValueRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueRealLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueRealLiteral4710); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1923:1: ruleMParameterValueRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ) ;
    public final EObject ruleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1926:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1927:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1927:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1927:2: () ( (lv_value_1_0= ruleREAL ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1927:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1928:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1936:2: ( (lv_value_1_0= ruleREAL ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1937:1: (lv_value_1_0= ruleREAL )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1937:1: (lv_value_1_0= ruleREAL )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1938:3: lv_value_1_0= ruleREAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleREAL_in_ruleMParameterValueRealLiteral4768);
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
                      		"REAL");
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1962:1: entryRuleMParameterValueRefObject returns [EObject current=null] : iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF ;
    public final EObject entryRuleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRefObject = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1963:2: (iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1964:2: iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueRefObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueRefObject_in_entryRuleMParameterValueRefObject4804);
            iv_ruleMParameterValueRefObject=ruleMParameterValueRefObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueRefObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueRefObject4814); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1971:1: ruleMParameterValueRefObject returns [EObject current=null] : ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) ;
    public final EObject ruleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1974:28: ( ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1975:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1975:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1975:2: () ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1975:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1976:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1984:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1985:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1985:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1986:3: ruleVersionedQualifiedReferenceName
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
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMParameterValueRefObject4878);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2010:1: entryRuleMParameterValuePAR returns [EObject current=null] : iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF ;
    public final EObject entryRuleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValuePAR = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2011:2: (iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2012:2: iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValuePARRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValuePAR_in_entryRuleMParameterValuePAR4914);
            iv_ruleMParameterValuePAR=ruleMParameterValuePAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValuePAR; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValuePAR4924); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2019:1: ruleMParameterValuePAR returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2022:28: ( (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2023:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2023:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2023:3: otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMParameterValuePAR4961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2027:1: ( (lv_value_1_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2028:1: (lv_value_1_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2028:1: (lv_value_1_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2029:3: lv_value_1_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValuePAR4982);
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
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMParameterValuePAR4994); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2057:1: entryRuleMParameterValueExpression returns [EObject current=null] : iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF ;
    public final EObject entryRuleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueExpression = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2058:2: (iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2059:2: iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_entryRuleMParameterValueExpression5030);
            iv_ruleMParameterValueExpression=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueExpression5040); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2066:1: ruleMParameterValueExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) ;
    public final EObject ruleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2069:28: ( ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2070:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2070:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2070:2: () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2070:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2071:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2079:2: ( (lv_left_1_0= ruleMParameterValueTERM ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2080:1: (lv_left_1_0= ruleMParameterValueTERM )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2080:1: (lv_left_1_0= ruleMParameterValueTERM )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2081:3: lv_left_1_0= ruleMParameterValueTERM
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueTERM_in_ruleMParameterValueExpression5098);
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
                      		"MParameterValueTERM");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2097:2: ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53||LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2097:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2097:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2098:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2098:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2099:3: lv_operation_2_0= ruleMParameterValueExpressionOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpressionOperators_in_ruleMParameterValueExpression5120);
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
                              		"MParameterValueExpressionOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2115:2: ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2116:1: (lv_right_3_0= ruleMParameterValueExpression )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2116:1: (lv_right_3_0= ruleMParameterValueExpression )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2117:3: lv_right_3_0= ruleMParameterValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValueExpression5141);
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
                              		"MParameterValueExpression");
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2141:1: entryRuleMParameterValueTERM returns [EObject current=null] : iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF ;
    public final EObject entryRuleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueTERM = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2142:2: (iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2143:2: iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueTERMRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueTERM_in_entryRuleMParameterValueTERM5179);
            iv_ruleMParameterValueTERM=ruleMParameterValueTERM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueTERM; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueTERM5189); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2150:1: ruleMParameterValueTERM returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) ;
    public final EObject ruleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2153:28: ( ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2154:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2154:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2154:2: () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2154:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2155:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2163:2: ( (lv_left_1_0= ruleMParameterValue ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2164:1: (lv_left_1_0= ruleMParameterValue )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2164:1: (lv_left_1_0= ruleMParameterValue )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2165:3: lv_left_1_0= ruleMParameterValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValue_in_ruleMParameterValueTERM5247);
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
                      		"MParameterValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2181:2: ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=56 && LA27_0<=57)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2181:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2181:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2182:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2182:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2183:3: lv_operation_2_0= ruleMParameterValueTERMOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueTERMOperators_in_ruleMParameterValueTERM5269);
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
                              		"MParameterValueTERMOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2199:2: ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2200:1: (lv_right_3_0= ruleMParameterValueTERM )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2200:1: (lv_right_3_0= ruleMParameterValueTERM )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2201:3: lv_right_3_0= ruleMParameterValueTERM
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueTERM_in_ruleMParameterValueTERM5290);
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
                              		"MParameterValueTERM");
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


    // $ANTLR start "entryRuleMMESPDeploymentPlatform"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2225:1: entryRuleMMESPDeploymentPlatform returns [EObject current=null] : iv_ruleMMESPDeploymentPlatform= ruleMMESPDeploymentPlatform EOF ;
    public final EObject entryRuleMMESPDeploymentPlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPDeploymentPlatform = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2231:2: (iv_ruleMMESPDeploymentPlatform= ruleMMESPDeploymentPlatform EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2232:2: iv_ruleMMESPDeploymentPlatform= ruleMMESPDeploymentPlatform EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPDeploymentPlatformRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDeploymentPlatform_in_entryRuleMMESPDeploymentPlatform5334);
            iv_ruleMMESPDeploymentPlatform=ruleMMESPDeploymentPlatform();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPDeploymentPlatform; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPDeploymentPlatform5344); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPDeploymentPlatform"


    // $ANTLR start "ruleMMESPDeploymentPlatform"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2242:1: ruleMMESPDeploymentPlatform returns [EObject current=null] : (otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' otherlv_26= ';' ) ;
    public final EObject ruleMMESPDeploymentPlatform() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_deployedDevices_16_0 = null;

        EObject lv_parameterValueAssignments_22_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4()
        		);
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2248:28: ( (otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' otherlv_26= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2249:1: (otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' otherlv_26= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2249:1: (otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' otherlv_26= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2249:3: otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' otherlv_26= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMMESPDeploymentPlatform5385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPDeploymentPlatformAccess().getDeploymentKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMMESPDeploymentPlatform5397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2257:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2258:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2258:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2259:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMMESPDeploymentPlatform5414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMMESPDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPDeploymentPlatformRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeploymentPlatform5431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2279:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2281:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2281:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2282:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2285:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?)
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2286:3: ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+ {...}?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2286:3: ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=5;
                int LA30_0 = input.LA(1);

                if ( LA30_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2) ) {
                    alt30=3;
                }
                else if ( LA30_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3) ) {
                    alt30=4;
                }


                switch (alt30) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2288:4: ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2288:4: ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2289:5: {...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2289:120: ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2290:6: ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2293:6: ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2293:7: {...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentPlatform", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2293:16: (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2293:18: otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMMESPDeploymentPlatform5489); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_4_0_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMMESPDeploymentPlatform5501); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2301:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2302:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2302:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2303:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPDeploymentPlatformRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeploymentPlatform5528);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentPlatform5540); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2330:4: ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2330:4: ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2331:5: {...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2331:120: ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2332:6: ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2335:6: ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2335:7: {...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentPlatform", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2335:16: (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2335:18: otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMMESPDeploymentPlatform5608); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMMESPDeploymentPlatformAccess().getPswpackageKeyword_4_1_0());
            	          
            	    }
            	    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMMESPDeploymentPlatform5620); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_1_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2343:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2344:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2344:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2345:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPDeploymentPlatformRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeploymentPlatform5647);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentPlatform5659); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_1_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2372:4: ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2372:4: ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2373:5: {...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2373:120: ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2374:6: ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2377:6: ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2377:7: {...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentPlatform", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2377:16: (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2377:18: otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';'
            	    {
            	    otherlv_13=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleMMESPDeploymentPlatform5727); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedKeyword_4_2_0());
            	          
            	    }
            	    otherlv_14=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMMESPDeploymentPlatform5739); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMMESPDeploymentPlatformAccess().getDevicesKeyword_4_2_1());
            	          
            	    }
            	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeploymentPlatform5751); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2389:1: ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+
            	    int cnt28=0;
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==42) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2390:1: (lv_deployedDevices_16_0= ruleMMESPDeployedDevice )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2390:1: (lv_deployedDevices_16_0= ruleMMESPDeployedDevice )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2391:3: lv_deployedDevices_16_0= ruleMMESPDeployedDevice
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesMMESPDeployedDeviceParserRuleCall_4_2_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeployedDevice_in_ruleMMESPDeploymentPlatform5772);
            	    	    lv_deployedDevices_16_0=ruleMMESPDeployedDevice();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentPlatformRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deployedDevices",
            	    	              		lv_deployedDevices_16_0, 
            	    	              		"MMESPDeployedDevice");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt28 >= 1 ) break loop28;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(28, input);
            	                throw eee;
            	        }
            	        cnt28++;
            	    } while (true);

            	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeploymentPlatform5785); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4());
            	          
            	    }
            	    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentPlatform5797); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2422:4: ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2422:4: ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2423:5: {...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2423:120: ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2424:6: ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2427:6: ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2427:7: {...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentPlatform", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2427:16: (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2427:18: otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';'
            	    {
            	    otherlv_19=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMMESPDeploymentPlatform5865); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getMMESPDeploymentPlatformAccess().getParameterKeyword_4_3_0());
            	          
            	    }
            	    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMMESPDeploymentPlatform5877); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMMESPDeploymentPlatformAccess().getValuesKeyword_4_3_1());
            	          
            	    }
            	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeploymentPlatform5889); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_3_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2439:1: ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+
            	    int cnt29=0;
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==40) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2440:1: (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2440:1: (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2441:3: lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_3_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueAssignment_in_ruleMMESPDeploymentPlatform5910);
            	    	    lv_parameterValueAssignments_22_0=ruleMParameterValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentPlatformRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"parameterValueAssignments",
            	    	              		lv_parameterValueAssignments_22_0, 
            	    	              		"MParameterValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt29 >= 1 ) break loop29;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(29, input);
            	                throw eee;
            	        }
            	        cnt29++;
            	    } while (true);

            	    otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeploymentPlatform5923); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_3_4());
            	          
            	    }
            	    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentPlatform5935); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_24, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_3_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMMESPDeploymentPlatform", "getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());

            }

            otherlv_25=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeploymentPlatform5994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_25, grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentPlatform6006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_26, grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMMESPDeploymentPlatform"


    // $ANTLR start "entryRuleMMESPDeployedDevice"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2499:1: entryRuleMMESPDeployedDevice returns [EObject current=null] : iv_ruleMMESPDeployedDevice= ruleMMESPDeployedDevice EOF ;
    public final EObject entryRuleMMESPDeployedDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPDeployedDevice = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2500:2: (iv_ruleMMESPDeployedDevice= ruleMMESPDeployedDevice EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2501:2: iv_ruleMMESPDeployedDevice= ruleMMESPDeployedDevice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPDeployedDeviceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDeployedDevice_in_entryRuleMMESPDeployedDevice6046);
            iv_ruleMMESPDeployedDevice=ruleMMESPDeployedDevice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPDeployedDevice; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPDeployedDevice6056); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPDeployedDevice"


    // $ANTLR start "ruleMMESPDeployedDevice"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2508:1: ruleMMESPDeployedDevice returns [EObject current=null] : (otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' ) ;
    public final EObject ruleMMESPDeployedDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameterValueAssignments_4_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2511:28: ( (otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2512:1: (otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2512:1: (otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2512:3: otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMMESPDeployedDevice6093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPDeployedDeviceAccess().getDeviceKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2516:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2517:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2517:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2518:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPDeployedDeviceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeployedDevice6120);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2534:2: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2535:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2535:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2536:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMMESPDeployedDevice6137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMMESPDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPDeployedDeviceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeployedDevice6154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMMESPDeployedDeviceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2556:1: ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2557:1: (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2557:1: (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2558:3: lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueAssignment_in_ruleMMESPDeployedDevice6175);
            	    lv_parameterValueAssignments_4_0=ruleMParameterValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMMESPDeployedDeviceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameterValueAssignments",
            	              		lv_parameterValueAssignments_4_0, 
            	              		"MParameterValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeployedDevice6188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMMESPDeployedDeviceAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeployedDevice6200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMMESPDeployedDeviceAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMMESPDeployedDevice"


    // $ANTLR start "entryRuleMMESPDeploymentAlternative"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2590:1: entryRuleMMESPDeploymentAlternative returns [EObject current=null] : iv_ruleMMESPDeploymentAlternative= ruleMMESPDeploymentAlternative EOF ;
    public final EObject entryRuleMMESPDeploymentAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPDeploymentAlternative = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2596:2: (iv_ruleMMESPDeploymentAlternative= ruleMMESPDeploymentAlternative EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2597:2: iv_ruleMMESPDeploymentAlternative= ruleMMESPDeploymentAlternative EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPDeploymentAlternative_in_entryRuleMMESPDeploymentAlternative6242);
            iv_ruleMMESPDeploymentAlternative=ruleMMESPDeploymentAlternative();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPDeploymentAlternative; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPDeploymentAlternative6252); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPDeploymentAlternative"


    // $ANTLR start "ruleMMESPDeploymentAlternative"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2607:1: ruleMMESPDeploymentAlternative returns [EObject current=null] : (otherlv_0= 'deployment' otherlv_1= 'alternative' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' otherlv_36= ';' ) ;
    public final EObject ruleMMESPDeploymentAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        EObject lv_deployedSwPackages_20_0 = null;

        EObject lv_requires_26_0 = null;

        EObject lv_deploymentAlternatives_32_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4()
        		);
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2613:28: ( (otherlv_0= 'deployment' otherlv_1= 'alternative' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' otherlv_36= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2614:1: (otherlv_0= 'deployment' otherlv_1= 'alternative' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' otherlv_36= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2614:1: (otherlv_0= 'deployment' otherlv_1= 'alternative' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' otherlv_36= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2614:3: otherlv_0= 'deployment' otherlv_1= 'alternative' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' otherlv_36= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMMESPDeploymentAlternative6293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMMESPDeploymentAlternative6305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativeKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2622:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2623:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2623:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2624:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMMESPDeploymentAlternative6322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMMESPDeploymentAlternativeAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeploymentAlternative6339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2644:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2646:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2646:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2647:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2650:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?)
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2651:3: ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+ {...}?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2651:3: ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=6;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==15) ) {
                    int LA37_2 = input.LA(2);

                    if ( LA37_2 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0) ) {
                        alt37=1;
                    }
                    else if ( LA37_2 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4) ) {
                        alt37=5;
                    }


                }
                else if ( LA37_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3) ) {
                    alt37=4;
                }


                switch (alt37) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2653:4: ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2653:4: ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2654:5: {...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2654:123: ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2655:6: ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2658:6: ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2658:7: {...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2658:16: (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2658:18: otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMMESPDeploymentAlternative6397); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_0_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMMESPDeploymentAlternative6409); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMMESPDeploymentAlternativeAccess().getPlatformsKeyword_4_0_1());
            	          
            	    }
            	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMMESPDeploymentAlternative6421); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_0_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2670:1: ( (otherlv_8= RULE_ID ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2671:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2671:1: (otherlv_8= RULE_ID )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2672:3: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
            	      	        }
            	              
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMMESPDeploymentAlternative6445); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_8, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2686:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==23) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2686:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMMESPDeploymentAlternative6458); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_9, grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_0_4_0());
            	    	          
            	    	    }
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2690:1: ( (otherlv_10= RULE_ID ) )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2691:1: (otherlv_10= RULE_ID )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2691:1: (otherlv_10= RULE_ID )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2692:3: otherlv_10= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMMESPDeploymentAlternative6482); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		newLeafNode(otherlv_10, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0()); 
            	    	      	
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentAlternative6496); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_0_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2717:4: ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2717:4: ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2718:5: {...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2718:123: ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2719:6: ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2722:6: ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2722:7: {...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2722:16: (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2722:18: otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';'
            	    {
            	    otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMMESPDeploymentAlternative6564); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesKeyword_4_1_0());
            	          
            	    }
            	    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMMESPDeploymentAlternative6576); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_1_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2730:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2731:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2731:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2732:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeploymentAlternative6603);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2748:2: (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==23) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2748:4: otherlv_15= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMMESPDeploymentAlternative6616); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_15, grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_1_3_0());
            	    	          
            	    	    }
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2752:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2753:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2753:1: ( ruleVersionedQualifiedName )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2754:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMMESPDeploymentAlternativeRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeploymentAlternative6643);
            	    	    ruleVersionedQualifiedName();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentAlternative6657); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_1_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2781:4: ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2781:4: ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2782:5: {...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2782:123: ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2783:6: ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2786:6: ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2786:7: {...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2786:16: (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2786:18: otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';'
            	    {
            	    otherlv_18=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMMESPDeploymentAlternative6725); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMMESPDeploymentAlternativeAccess().getSwpackagesKeyword_4_2_0());
            	          
            	    }
            	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeploymentAlternative6737); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_2_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2794:1: ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( ((LA34_0>=38 && LA34_0<=39)) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2795:1: (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2795:1: (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2796:3: lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_4_2_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMMESPSwPackageDeployment_in_ruleMMESPDeploymentAlternative6758);
            	    	    lv_deployedSwPackages_20_0=ruleMMESPSwPackageDeployment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentAlternativeRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deployedSwPackages",
            	    	              		lv_deployedSwPackages_20_0, 
            	    	              		"MMESPSwPackageDeployment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt34 >= 1 ) break loop34;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);

            	    otherlv_21=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeploymentAlternative6771); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_2_3());
            	          
            	    }
            	    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentAlternative6783); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_2_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2827:4: ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2827:4: ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2828:5: {...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2828:123: ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2829:6: ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2832:6: ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2832:7: {...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2832:16: (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2832:18: otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';'
            	    {
            	    otherlv_23=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMMESPDeploymentAlternative6851); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiredKeyword_4_3_0());
            	          
            	    }
            	    otherlv_24=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMMESPDeploymentAlternative6863); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_24, grammarAccess.getMMESPDeploymentAlternativeAccess().getInterfacesKeyword_4_3_1());
            	          
            	    }
            	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeploymentAlternative6875); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_3_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2844:1: ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+
            	    int cnt35=0;
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==30) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2845:1: (lv_requires_26_0= ruleMSwPackageRequiredInterface )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2845:1: (lv_requires_26_0= ruleMSwPackageRequiredInterface )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2846:3: lv_requires_26_0= ruleMSwPackageRequiredInterface
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_4_3_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMSwPackageRequiredInterface_in_ruleMMESPDeploymentAlternative6896);
            	    	    lv_requires_26_0=ruleMSwPackageRequiredInterface();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentAlternativeRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"requires",
            	    	              		lv_requires_26_0, 
            	    	              		"MSwPackageRequiredInterface");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt35 >= 1 ) break loop35;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(35, input);
            	                throw eee;
            	        }
            	        cnt35++;
            	    } while (true);

            	    otherlv_27=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeploymentAlternative6909); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_3_4());
            	          
            	    }
            	    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentAlternative6921); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_28, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_3_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2877:4: ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2877:4: ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2878:5: {...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2878:123: ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2879:6: ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2882:6: ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2882:7: {...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2882:16: (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2882:18: otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';'
            	    {
            	    otherlv_29=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMMESPDeploymentAlternative6989); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_4_0());
            	          
            	    }
            	    otherlv_30=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMMESPDeploymentAlternative7001); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_30, grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativesKeyword_4_4_1());
            	          
            	    }
            	    otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMMESPDeploymentAlternative7013); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_4_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2894:1: ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==15) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2895:1: (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2895:1: (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2896:3: lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_4_4_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeploymentAlternative_in_ruleMMESPDeploymentAlternative7034);
            	    	    lv_deploymentAlternatives_32_0=ruleMMESPDeploymentAlternative();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMESPDeploymentAlternativeRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deploymentAlternatives",
            	    	              		lv_deploymentAlternatives_32_0, 
            	    	              		"MMESPDeploymentAlternative");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt36 >= 1 ) break loop36;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);

            	    otherlv_33=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeploymentAlternative7047); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_33, grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_4_4());
            	          
            	    }
            	    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentAlternative7059); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_34, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_4_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMMESPDeploymentAlternative", "getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());

            }

            otherlv_35=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMMESPDeploymentAlternative7118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_35, grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_36=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPDeploymentAlternative7130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_36, grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMMESPDeploymentAlternative"


    // $ANTLR start "entryRuleEBoolean"
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2954:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2955:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2956:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean7171);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean7182); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2963:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2966:28: ( (kw= 'true' | kw= 'false' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2967:1: (kw= 'true' | kw= 'false' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2967:1: (kw= 'true' | kw= 'false' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            else if ( (LA38_0==52) ) {
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2968:2: kw= 'true'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEBoolean7220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2975:2: kw= 'false'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEBoolean7239); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2988:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2989:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2990:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_entryRuleINTEGER7280);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTEGER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleINTEGER7291); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2997:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3000:28: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3001:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3001:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT||LA40_0==53) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_HEXADECIMAL) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3001:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3001:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3001:3: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3001:3: (kw= '-' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==53) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3002:2: kw= '-'
                            {
                            kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleINTEGER7331); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleINTEGER7348); if (state.failed) return current;
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3015:10: this_HEXADECIMAL_2= RULE_HEXADECIMAL
                    {
                    this_HEXADECIMAL_2=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_RULE_HEXADECIMAL_in_ruleINTEGER7375); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3030:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3031:2: (iv_ruleREAL= ruleREAL EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3032:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleREAL_in_entryRuleREAL7421);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleREAL7432); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3039:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3042:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3043:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3043:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3043:2: (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3043:2: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3044:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleREAL7471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3049:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3049:8: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleREAL7489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
                  
            }
            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleREAL7507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleREAL7522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
                  
            }

            }

            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3069:2: (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==54) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3070:2: kw= 'e' (kw= '-' )? this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleREAL7542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0()); 
                          
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3075:1: (kw= '-' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==53) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3076:2: kw= '-'
                            {
                            kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleREAL7556); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleREAL7573); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3096:1: ruleMParameterValueExpressionOperators returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleMParameterValueExpressionOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3098:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3099:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3099:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            else if ( (LA44_0==53) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3099:2: (enumLiteral_0= '+' )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3099:2: (enumLiteral_0= '+' )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3099:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMParameterValueExpressionOperators7634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3105:6: (enumLiteral_1= '-' )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3105:6: (enumLiteral_1= '-' )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3105:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMParameterValueExpressionOperators7651); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3115:1: ruleMParameterValueTERMOperators returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMParameterValueTERMOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3117:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3118:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3118:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            else if ( (LA45_0==57) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3118:2: (enumLiteral_0= '*' )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3118:2: (enumLiteral_0= '*' )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3118:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMParameterValueTERMOperators7696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3124:6: (enumLiteral_1= '/' )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3124:6: (enumLiteral_1= '/' )
                    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:3124:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMParameterValueTERMOperators7713); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalDEP
    public final void synpred2_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_version_8_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:271:4: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:271:4: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:271:4: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:272:5: {...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:272:112: ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:273:6: ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:276:6: ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:276:7: {...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:276:16: (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:276:18: otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';'
        {
        otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_synpred2_InternalDEP544); if (state.failed) return ;
        otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred2_InternalDEP556); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:284:1: ( (lv_version_8_0= ruleVersion ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:285:1: (lv_version_8_0= ruleVersion )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:285:1: (lv_version_8_0= ruleVersion )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:286:3: lv_version_8_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersion_in_synpred2_InternalDEP577);
        lv_version_8_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred2_InternalDEP589); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalDEP

    // $ANTLR start synpred3_InternalDEP
    public final void synpred3_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:313:4: ( ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:313:4: ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:313:4: ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:314:5: {...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:314:112: ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:315:6: ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:318:6: ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:318:7: {...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:318:16: (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:318:18: otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';'
        {
        otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_synpred3_InternalDEP657); if (state.failed) return ;
        otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred3_InternalDEP669); if (state.failed) return ;
        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred3_InternalDEP681); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:330:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:331:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:331:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:332:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred3_InternalDEP708);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred3_InternalDEP720); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalDEP

    // $ANTLR start synpred5_InternalDEP
    public final void synpred5_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:359:4: ( ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:359:4: ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:359:4: ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:360:5: {...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:360:112: ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:361:6: ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:364:6: ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:364:7: {...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:364:16: (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:364:18: otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';'
        {
        otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred5_InternalDEP788); if (state.failed) return ;
        otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred5_InternalDEP800); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:372:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:373:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:373:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:374:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred5_InternalDEP827);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:390:2: (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop46:
        do {
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23) ) {
                alt46=1;
            }


            switch (alt46) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:390:4: otherlv_18= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred5_InternalDEP840); if (state.failed) return ;
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:394:1: ( ( ruleVersionedQualifiedName ) )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:395:1: ( ruleVersionedQualifiedName )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:395:1: ( ruleVersionedQualifiedName )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:396:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred5_InternalDEP867);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop46;
            }
        } while (true);

        otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred5_InternalDEP881); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalDEP

    // $ANTLR start synpred7_InternalDEP
    public final void synpred7_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_deploymentPlatforms_24_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:423:4: ( ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:423:4: ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:423:4: ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:424:5: {...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred7_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:424:112: ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:425:6: ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:428:6: ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:428:7: {...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred7_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:428:16: (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:428:18: otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';'
        {
        otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_synpred7_InternalDEP949); if (state.failed) return ;
        otherlv_22=(Token)match(input,24,FollowSets000.FOLLOW_24_in_synpred7_InternalDEP961); if (state.failed) return ;
        otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred7_InternalDEP973); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:440:1: ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+
        int cnt47=0;
        loop47:
        do {
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==15) ) {
                alt47=1;
            }


            switch (alt47) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:441:1: (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:441:1: (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:442:3: lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsMMESPDeploymentPlatformParserRuleCall_5_3_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeploymentPlatform_in_synpred7_InternalDEP994);
        	    lv_deploymentPlatforms_24_0=ruleMMESPDeploymentPlatform();

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

        otherlv_25=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred7_InternalDEP1007); if (state.failed) return ;
        otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred7_InternalDEP1019); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalDEP

    // $ANTLR start synpred9_InternalDEP
    public final void synpred9_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_requires_30_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:473:4: ( ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:473:4: ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:473:4: ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:474:5: {...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:474:112: ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:475:6: ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:478:6: ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:478:7: {...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:478:16: (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:478:18: otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';'
        {
        otherlv_27=(Token)match(input,26,FollowSets000.FOLLOW_26_in_synpred9_InternalDEP1087); if (state.failed) return ;
        otherlv_28=(Token)match(input,27,FollowSets000.FOLLOW_27_in_synpred9_InternalDEP1099); if (state.failed) return ;
        otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred9_InternalDEP1111); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:490:1: ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+
        int cnt48=0;
        loop48:
        do {
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==30) ) {
                alt48=1;
            }


            switch (alt48) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:491:1: (lv_requires_30_0= ruleMSwPackageRequiredInterface )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:491:1: (lv_requires_30_0= ruleMSwPackageRequiredInterface )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:492:3: lv_requires_30_0= ruleMSwPackageRequiredInterface
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_4_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMSwPackageRequiredInterface_in_synpred9_InternalDEP1132);
        	    lv_requires_30_0=ruleMSwPackageRequiredInterface();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt48 >= 1 ) break loop48;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(48, input);
                    throw eee;
            }
            cnt48++;
        } while (true);

        otherlv_31=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred9_InternalDEP1145); if (state.failed) return ;
        otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred9_InternalDEP1157); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalDEP

    // $ANTLR start synpred11_InternalDEP
    public final void synpred11_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        EObject lv_deployedSwPackages_35_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:523:4: ( ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:523:4: ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:523:4: ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:524:5: {...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:524:112: ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:525:6: ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:528:6: ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:528:7: {...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:528:16: (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:528:18: otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';'
        {
        otherlv_33=(Token)match(input,28,FollowSets000.FOLLOW_28_in_synpred11_InternalDEP1225); if (state.failed) return ;
        otherlv_34=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred11_InternalDEP1237); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:536:1: ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+
        int cnt49=0;
        loop49:
        do {
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=38 && LA49_0<=39)) ) {
                alt49=1;
            }


            switch (alt49) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:537:1: (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:537:1: (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:538:3: lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_5_5_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMMESPSwPackageDeployment_in_synpred11_InternalDEP1258);
        	    lv_deployedSwPackages_35_0=ruleMMESPSwPackageDeployment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt49 >= 1 ) break loop49;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(49, input);
                    throw eee;
            }
            cnt49++;
        } while (true);

        otherlv_36=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred11_InternalDEP1271); if (state.failed) return ;
        otherlv_37=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred11_InternalDEP1283); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalDEP

    // $ANTLR start synpred13_InternalDEP
    public final void synpred13_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        EObject lv_deploymentAlternatives_41_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:569:4: ( ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:569:4: ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:569:4: ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:570:5: {...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:570:112: ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:571:6: ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:574:6: ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:574:7: {...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:574:16: (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:574:18: otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';'
        {
        otherlv_38=(Token)match(input,15,FollowSets000.FOLLOW_15_in_synpred13_InternalDEP1351); if (state.failed) return ;
        otherlv_39=(Token)match(input,29,FollowSets000.FOLLOW_29_in_synpred13_InternalDEP1363); if (state.failed) return ;
        otherlv_40=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred13_InternalDEP1375); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:586:1: ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+
        int cnt50=0;
        loop50:
        do {
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==15) ) {
                alt50=1;
            }


            switch (alt50) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:587:1: (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:587:1: (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:588:3: lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_5_6_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeploymentAlternative_in_synpred13_InternalDEP1396);
        	    lv_deploymentAlternatives_41_0=ruleMMESPDeploymentAlternative();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt50 >= 1 ) break loop50;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(50, input);
                    throw eee;
            }
            cnt50++;
        } while (true);

        otherlv_42=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred13_InternalDEP1409); if (state.failed) return ;
        otherlv_43=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred13_InternalDEP1421); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalDEP

    // $ANTLR start synpred28_InternalDEP
    public final void synpred28_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_parameterValueAssignments_8_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1363:4: ( ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1363:4: ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1363:4: ({...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1364:5: {...}? => ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred28_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1364:127: ( ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1365:6: ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1368:6: ({...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1368:7: {...}? => (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred28_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1368:16: (otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1368:18: otherlv_5= 'parameter' otherlv_6= 'values' otherlv_7= '{' ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';'
        {
        otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_synpred28_InternalDEP3382); if (state.failed) return ;
        otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_synpred28_InternalDEP3394); if (state.failed) return ;
        otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred28_InternalDEP3406); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1380:1: ( (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment ) )+
        int cnt53=0;
        loop53:
        do {
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==40) ) {
                alt53=1;
            }


            switch (alt53) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1381:1: (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1381:1: (lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1382:3: lv_parameterValueAssignments_8_0= ruleMParameterValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueAssignment_in_synpred28_InternalDEP3427);
        	    lv_parameterValueAssignments_8_0=ruleMParameterValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt53 >= 1 ) break loop53;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(53, input);
                    throw eee;
            }
            cnt53++;
        } while (true);

        otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred28_InternalDEP3440); if (state.failed) return ;
        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred28_InternalDEP3452); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred28_InternalDEP

    // $ANTLR start synpred30_InternalDEP
    public final void synpred30_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_deviceDriverMappings_14_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1413:4: ( ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1413:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1413:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1414:5: {...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred30_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1414:127: ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1415:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1418:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1418:7: {...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred30_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1418:16: (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1418:18: otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';'
        {
        otherlv_11=(Token)match(input,42,FollowSets000.FOLLOW_42_in_synpred30_InternalDEP3520); if (state.failed) return ;
        otherlv_12=(Token)match(input,43,FollowSets000.FOLLOW_43_in_synpred30_InternalDEP3532); if (state.failed) return ;
        otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred30_InternalDEP3544); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1430:1: ( (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping ) )+
        int cnt54=0;
        loop54:
        do {
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }


            switch (alt54) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1431:1: (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1431:1: (lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:1432:3: lv_deviceDriverMappings_14_0= ruleMMESPDeviceDriverMapping
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsMMESPDeviceDriverMappingParserRuleCall_4_1_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeviceDriverMapping_in_synpred30_InternalDEP3565);
        	    lv_deviceDriverMappings_14_0=ruleMMESPDeviceDriverMapping();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt54 >= 1 ) break loop54;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(54, input);
                    throw eee;
            }
            cnt54++;
        } while (true);

        otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred30_InternalDEP3578); if (state.failed) return ;
        otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred30_InternalDEP3590); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalDEP

    // $ANTLR start synpred38_InternalDEP
    public final void synpred38_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2288:4: ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2288:4: ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2288:4: ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2289:5: {...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred38_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2289:120: ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2290:6: ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2293:6: ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2293:7: {...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred38_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2293:16: (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2293:18: otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';'
        {
        otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_synpred38_InternalDEP5489); if (state.failed) return ;
        otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred38_InternalDEP5501); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2301:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2302:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2302:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2303:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred38_InternalDEP5528);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred38_InternalDEP5540); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred38_InternalDEP

    // $ANTLR start synpred39_InternalDEP
    public final void synpred39_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2330:4: ( ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2330:4: ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2330:4: ({...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2331:5: {...}? => ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred39_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2331:120: ( ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2332:6: ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2335:6: ({...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2335:7: {...}? => (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred39_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2335:16: (otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2335:18: otherlv_9= 'pswpackage' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';'
        {
        otherlv_9=(Token)match(input,48,FollowSets000.FOLLOW_48_in_synpred39_InternalDEP5608); if (state.failed) return ;
        otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred39_InternalDEP5620); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2343:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2344:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2344:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2345:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred39_InternalDEP5647);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred39_InternalDEP5659); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred39_InternalDEP

    // $ANTLR start synpred41_InternalDEP
    public final void synpred41_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_deployedDevices_16_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2372:4: ( ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2372:4: ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2372:4: ({...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2373:5: {...}? => ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred41_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2373:120: ( ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2374:6: ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2377:6: ({...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2377:7: {...}? => (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred41_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2377:16: (otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2377:18: otherlv_13= 'deployed' otherlv_14= 'devices' otherlv_15= '{' ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+ otherlv_17= '}' otherlv_18= ';'
        {
        otherlv_13=(Token)match(input,46,FollowSets000.FOLLOW_46_in_synpred41_InternalDEP5727); if (state.failed) return ;
        otherlv_14=(Token)match(input,49,FollowSets000.FOLLOW_49_in_synpred41_InternalDEP5739); if (state.failed) return ;
        otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred41_InternalDEP5751); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2389:1: ( (lv_deployedDevices_16_0= ruleMMESPDeployedDevice ) )+
        int cnt55=0;
        loop55:
        do {
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==42) ) {
                alt55=1;
            }


            switch (alt55) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2390:1: (lv_deployedDevices_16_0= ruleMMESPDeployedDevice )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2390:1: (lv_deployedDevices_16_0= ruleMMESPDeployedDevice )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2391:3: lv_deployedDevices_16_0= ruleMMESPDeployedDevice
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesMMESPDeployedDeviceParserRuleCall_4_2_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeployedDevice_in_synpred41_InternalDEP5772);
        	    lv_deployedDevices_16_0=ruleMMESPDeployedDevice();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt55 >= 1 ) break loop55;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(55, input);
                    throw eee;
            }
            cnt55++;
        } while (true);

        otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred41_InternalDEP5785); if (state.failed) return ;
        otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred41_InternalDEP5797); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred41_InternalDEP

    // $ANTLR start synpred43_InternalDEP
    public final void synpred43_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_parameterValueAssignments_22_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2422:4: ( ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2422:4: ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2422:4: ({...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2423:5: {...}? => ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred43_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2423:120: ( ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2424:6: ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2427:6: ({...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2427:7: {...}? => (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred43_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2427:16: (otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2427:18: otherlv_19= 'parameter' otherlv_20= 'values' otherlv_21= '{' ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+ otherlv_23= '}' otherlv_24= ';'
        {
        otherlv_19=(Token)match(input,40,FollowSets000.FOLLOW_40_in_synpred43_InternalDEP5865); if (state.failed) return ;
        otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_synpred43_InternalDEP5877); if (state.failed) return ;
        otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred43_InternalDEP5889); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2439:1: ( (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment ) )+
        int cnt56=0;
        loop56:
        do {
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==40) ) {
                alt56=1;
            }


            switch (alt56) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2440:1: (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2440:1: (lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2441:3: lv_parameterValueAssignments_22_0= ruleMParameterValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_3_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueAssignment_in_synpred43_InternalDEP5910);
        	    lv_parameterValueAssignments_22_0=ruleMParameterValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt56 >= 1 ) break loop56;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(56, input);
                    throw eee;
            }
            cnt56++;
        } while (true);

        otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred43_InternalDEP5923); if (state.failed) return ;
        otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred43_InternalDEP5935); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred43_InternalDEP

    // $ANTLR start synpred46_InternalDEP
    public final void synpred46_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2653:4: ( ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2653:4: ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2653:4: ({...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2654:5: {...}? => ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred46_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2654:123: ( ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2655:6: ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2658:6: ({...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2658:7: {...}? => (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred46_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2658:16: (otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2658:18: otherlv_5= 'deployment' otherlv_6= 'platforms' otherlv_7= ':=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';'
        {
        otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_synpred46_InternalDEP6397); if (state.failed) return ;
        otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_synpred46_InternalDEP6409); if (state.failed) return ;
        otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred46_InternalDEP6421); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2670:1: ( (otherlv_8= RULE_ID ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2671:1: (otherlv_8= RULE_ID )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2671:1: (otherlv_8= RULE_ID )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2672:3: otherlv_8= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred46_InternalDEP6445); if (state.failed) return ;

        }


        }

        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2686:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
        loop57:
        do {
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==23) ) {
                alt57=1;
            }


            switch (alt57) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2686:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
        	    {
        	    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred46_InternalDEP6458); if (state.failed) return ;
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2690:1: ( (otherlv_10= RULE_ID ) )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2691:1: (otherlv_10= RULE_ID )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2691:1: (otherlv_10= RULE_ID )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2692:3: otherlv_10= RULE_ID
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred46_InternalDEP6482); if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop57;
            }
        } while (true);

        otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred46_InternalDEP6496); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred46_InternalDEP

    // $ANTLR start synpred48_InternalDEP
    public final void synpred48_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2717:4: ( ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2717:4: ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2717:4: ({...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2718:5: {...}? => ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2718:123: ( ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2719:6: ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2722:6: ({...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2722:7: {...}? => (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2722:16: (otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2722:18: otherlv_12= 'languages' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_17= ';'
        {
        otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred48_InternalDEP6564); if (state.failed) return ;
        otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred48_InternalDEP6576); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2730:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2731:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2731:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2732:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred48_InternalDEP6603);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2748:2: (otherlv_15= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==23) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2748:4: otherlv_15= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred48_InternalDEP6616); if (state.failed) return ;
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2752:1: ( ( ruleVersionedQualifiedName ) )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2753:1: ( ruleVersionedQualifiedName )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2753:1: ( ruleVersionedQualifiedName )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2754:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred48_InternalDEP6643);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop58;
            }
        } while (true);

        otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred48_InternalDEP6657); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred48_InternalDEP

    // $ANTLR start synpred50_InternalDEP
    public final void synpred50_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_deployedSwPackages_20_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2781:4: ( ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2781:4: ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2781:4: ({...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2782:5: {...}? => ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred50_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2782:123: ( ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2783:6: ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2786:6: ({...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2786:7: {...}? => (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred50_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2786:16: (otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2786:18: otherlv_18= 'swpackages' otherlv_19= '{' ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+ otherlv_21= '}' otherlv_22= ';'
        {
        otherlv_18=(Token)match(input,28,FollowSets000.FOLLOW_28_in_synpred50_InternalDEP6725); if (state.failed) return ;
        otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred50_InternalDEP6737); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2794:1: ( (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment ) )+
        int cnt59=0;
        loop59:
        do {
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=38 && LA59_0<=39)) ) {
                alt59=1;
            }


            switch (alt59) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2795:1: (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2795:1: (lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2796:3: lv_deployedSwPackages_20_0= ruleMMESPSwPackageDeployment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_4_2_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMMESPSwPackageDeployment_in_synpred50_InternalDEP6758);
        	    lv_deployedSwPackages_20_0=ruleMMESPSwPackageDeployment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt59 >= 1 ) break loop59;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(59, input);
                    throw eee;
            }
            cnt59++;
        } while (true);

        otherlv_21=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred50_InternalDEP6771); if (state.failed) return ;
        otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred50_InternalDEP6783); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred50_InternalDEP

    // $ANTLR start synpred52_InternalDEP
    public final void synpred52_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_requires_26_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2827:4: ( ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2827:4: ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2827:4: ({...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2828:5: {...}? => ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred52_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2828:123: ( ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2829:6: ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2832:6: ({...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2832:7: {...}? => (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred52_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2832:16: (otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2832:18: otherlv_23= 'required' otherlv_24= 'interfaces' otherlv_25= '{' ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+ otherlv_27= '}' otherlv_28= ';'
        {
        otherlv_23=(Token)match(input,26,FollowSets000.FOLLOW_26_in_synpred52_InternalDEP6851); if (state.failed) return ;
        otherlv_24=(Token)match(input,27,FollowSets000.FOLLOW_27_in_synpred52_InternalDEP6863); if (state.failed) return ;
        otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred52_InternalDEP6875); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2844:1: ( (lv_requires_26_0= ruleMSwPackageRequiredInterface ) )+
        int cnt60=0;
        loop60:
        do {
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==30) ) {
                alt60=1;
            }


            switch (alt60) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2845:1: (lv_requires_26_0= ruleMSwPackageRequiredInterface )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2845:1: (lv_requires_26_0= ruleMSwPackageRequiredInterface )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2846:3: lv_requires_26_0= ruleMSwPackageRequiredInterface
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_4_3_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMSwPackageRequiredInterface_in_synpred52_InternalDEP6896);
        	    lv_requires_26_0=ruleMSwPackageRequiredInterface();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt60 >= 1 ) break loop60;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(60, input);
                    throw eee;
            }
            cnt60++;
        } while (true);

        otherlv_27=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred52_InternalDEP6909); if (state.failed) return ;
        otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred52_InternalDEP6921); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred52_InternalDEP

    // $ANTLR start synpred54_InternalDEP
    public final void synpred54_InternalDEP_fragment() throws RecognitionException {   
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        EObject lv_deploymentAlternatives_32_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2877:4: ( ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2877:4: ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2877:4: ({...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2878:5: {...}? => ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred54_InternalDEP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2878:123: ( ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2879:6: ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4);
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2882:6: ({...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2882:7: {...}? => (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred54_InternalDEP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2882:16: (otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2882:18: otherlv_29= 'deployment' otherlv_30= 'alternatives' otherlv_31= '{' ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+ otherlv_33= '}' otherlv_34= ';'
        {
        otherlv_29=(Token)match(input,15,FollowSets000.FOLLOW_15_in_synpred54_InternalDEP6989); if (state.failed) return ;
        otherlv_30=(Token)match(input,29,FollowSets000.FOLLOW_29_in_synpred54_InternalDEP7001); if (state.failed) return ;
        otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred54_InternalDEP7013); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2894:1: ( (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative ) )+
        int cnt61=0;
        loop61:
        do {
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==15) ) {
                alt61=1;
            }


            switch (alt61) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2895:1: (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2895:1: (lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.dep/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalDEP.g:2896:3: lv_deploymentAlternatives_32_0= ruleMMESPDeploymentAlternative
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_4_4_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMMESPDeploymentAlternative_in_synpred54_InternalDEP7034);
        	    lv_deploymentAlternatives_32_0=ruleMMESPDeploymentAlternative();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt61 >= 1 ) break loop61;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(61, input);
                    throw eee;
            }
            cnt61++;
        } while (true);

        otherlv_33=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred54_InternalDEP7047); if (state.failed) return ;
        otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred54_InternalDEP7059); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred54_InternalDEP

    // Delegated rules

    public final boolean synpred43_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDEP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDEP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\17\4\uffff\1\30\4\uffff";
    static final String DFA7_maxS =
        "\1\34\4\uffff\1\35\4\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\10\1\1\1\2\1\3\1\uffff\1\5\1\6\1\4\1\7";
    static final String DFA7_specialS =
        "\1\0\4\uffff\1\1\4\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\5\2\uffff\1\2\1\uffff\1\3\1\uffff\1\4\2\uffff\1\1\1\6\1\uffff"+
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10\4\uffff\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()+ loopback of 269:3: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'construction' otherlv_11= 'tool' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'languages' otherlv_16= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_18= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'deployment' otherlv_22= 'platforms' otherlv_23= '{' ( (lv_deploymentPlatforms_24_0= ruleMMESPDeploymentPlatform ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'required' otherlv_28= 'interfaces' otherlv_29= '{' ( (lv_requires_30_0= ruleMSwPackageRequiredInterface ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'swpackages' otherlv_34= '{' ( (lv_deployedSwPackages_35_0= ruleMMESPSwPackageDeployment ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deployment' otherlv_39= 'alternatives' otherlv_40= '{' ( (lv_deploymentAlternatives_41_0= ruleMMESPDeploymentAlternative ) )+ otherlv_42= '}' otherlv_43= ';' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_0==25) ) {s = 1;}

                        else if ( LA7_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( LA7_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( LA7_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2) ) {s = 4;}

                        else if ( (LA7_0==15) ) {s = 5;}

                        else if ( LA7_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA7_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA7_5 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3) ) {s = 8;}

                        else if ( LA7_5 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6) ) {s = 9;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMMESPDEPPackageFile_in_entryRuleMMESPDEPPackageFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPDEPPackageFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleMMESPDEPPackageFile128 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMESPDEPPackageFile155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDEPPackageFile167 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleMMESPDEPPackageFile180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMESPDEPPackageFile207 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDEPPackageFile219 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_ruleMMESPDEPPackageElement_in_ruleMMESPDEPPackageFile242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPDEPPackageElement_in_entryRuleMMESPDEPPackageElement278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPDEPPackageElement288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPDeployment_in_ruleMMESPDEPPackageElement337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPDeployment_in_entryRuleMMESPDeployment377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPDeployment387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleMMESPDeployment440 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMMESPDeployment452 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMMESPDeployment469 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeployment486 = new BitSet(new long[]{0x0000000014548000L});
        public static final BitSet FOLLOW_18_in_ruleMMESPDeployment544 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMMESPDeployment556 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleMMESPDeployment577 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeployment589 = new BitSet(new long[]{0x0000000016548000L});
        public static final BitSet FOLLOW_20_in_ruleMMESPDeployment657 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMMESPDeployment669 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMMESPDeployment681 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeployment708 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeployment720 = new BitSet(new long[]{0x0000000016548000L});
        public static final BitSet FOLLOW_22_in_ruleMMESPDeployment788 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMMESPDeployment800 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeployment827 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_23_in_ruleMMESPDeployment840 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeployment867 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeployment881 = new BitSet(new long[]{0x0000000016548000L});
        public static final BitSet FOLLOW_15_in_ruleMMESPDeployment949 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMMESPDeployment961 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeployment973 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleMMESPDeploymentPlatform_in_ruleMMESPDeployment994 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeployment1007 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeployment1019 = new BitSet(new long[]{0x0000000016548000L});
        public static final BitSet FOLLOW_26_in_ruleMMESPDeployment1087 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMMESPDeployment1099 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeployment1111 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleMSwPackageRequiredInterface_in_ruleMMESPDeployment1132 = new BitSet(new long[]{0x0000000042000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeployment1145 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeployment1157 = new BitSet(new long[]{0x0000000016548000L});
        public static final BitSet FOLLOW_28_in_ruleMMESPDeployment1225 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeployment1237 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_ruleMMESPSwPackageDeployment_in_ruleMMESPDeployment1258 = new BitSet(new long[]{0x000000C002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeployment1271 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeployment1283 = new BitSet(new long[]{0x0000000016548000L});
        public static final BitSet FOLLOW_15_in_ruleMMESPDeployment1351 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMMESPDeployment1363 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeployment1375 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleMMESPDeploymentAlternative_in_ruleMMESPDeployment1396 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeployment1409 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeployment1421 = new BitSet(new long[]{0x0000000016548000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeployment1480 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeployment1492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMSwPackageRequiredInterface_in_entryRuleMSwPackageRequiredInterface1532 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMSwPackageRequiredInterface1542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleMSwPackageRequiredInterface1579 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMSwPackageRequiredInterface1606 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMSwPackageRequiredInterface1618 = new BitSet(new long[]{0x0000000282000000L});
        public static final BitSet FOLLOW_ruleMResourceDemand_in_ruleMSwPackageRequiredInterface1639 = new BitSet(new long[]{0x0000000282000000L});
        public static final BitSet FOLLOW_25_in_ruleMSwPackageRequiredInterface1652 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMSwPackageRequiredInterface1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMResourceDemand_in_entryRuleMResourceDemand1700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMResourceDemand1710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMQuantifiableResourceDemand_in_ruleMResourceDemand1760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMInstantiableResourceDemand_in_ruleMResourceDemand1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMInstantiableResourceDemand_in_entryRuleMInstantiableResourceDemand1825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMInstantiableResourceDemand1835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleMInstantiableResourceDemand1872 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMInstantiableResourceDemand1884 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMInstantiableResourceDemand1911 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMInstantiableResourceDemand1928 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMInstantiableResourceDemand1945 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_ruleMParameterValueAssignment_in_ruleMInstantiableResourceDemand1966 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_25_in_ruleMInstantiableResourceDemand1979 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMInstantiableResourceDemand1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMQuantifiableResourceDemand_in_entryRuleMQuantifiableResourceDemand2027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMQuantifiableResourceDemand2037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleMQuantifiableResourceDemand2086 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMQuantifiableResourceDemand2098 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMQuantifiableResourceDemand2125 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMQuantifiableResourceDemand2137 = new BitSet(new long[]{0x00380008000000F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMQuantifiableResourceDemand2158 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMQuantifiableResourceDemand2170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2258 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleQualifiedName2277 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2292 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2340 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2392 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2420 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion2442 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleVersion2463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2479 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2507 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion2529 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName2579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName2590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVersionedQualifiedName2637 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleVersionedQualifiedName2655 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleVersionedQualifiedName2677 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleVersionedQualifiedName2695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName2736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleVersionedQualifiedReferenceName2795 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleVersionedQualifiedReferenceName2813 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName2830 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_37_in_ruleVersionedQualifiedReferenceName2849 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName2864 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleMMESPSwPackageDeployment_in_entryRuleMMESPSwPackageDeployment2911 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPSwPackageDeployment2921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPRegularSwPackageDeployment_in_ruleMMESPSwPackageDeployment2971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPDriverSwPackageDeployment_in_ruleMMESPSwPackageDeployment3001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPRegularSwPackageDeployment_in_entryRuleMMESPRegularSwPackageDeployment3036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPRegularSwPackageDeployment3046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMMESPRegularSwPackageDeployment3095 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPRegularSwPackageDeployment3122 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPRegularSwPackageDeployment3134 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_ruleMParameterValueAssignment_in_ruleMMESPRegularSwPackageDeployment3155 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPRegularSwPackageDeployment3168 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPRegularSwPackageDeployment3180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPDriverSwPackageDeployment_in_entryRuleMMESPDriverSwPackageDeployment3222 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPDriverSwPackageDeployment3232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMMESPDriverSwPackageDeployment3285 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDriverSwPackageDeployment3312 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDriverSwPackageDeployment3324 = new BitSet(new long[]{0x0000050002000000L});
        public static final BitSet FOLLOW_40_in_ruleMMESPDriverSwPackageDeployment3382 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleMMESPDriverSwPackageDeployment3394 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDriverSwPackageDeployment3406 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleMParameterValueAssignment_in_ruleMMESPDriverSwPackageDeployment3427 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDriverSwPackageDeployment3440 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDriverSwPackageDeployment3452 = new BitSet(new long[]{0x0000050002000000L});
        public static final BitSet FOLLOW_42_in_ruleMMESPDriverSwPackageDeployment3520 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleMMESPDriverSwPackageDeployment3532 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDriverSwPackageDeployment3544 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleMMESPDeviceDriverMapping_in_ruleMMESPDriverSwPackageDeployment3565 = new BitSet(new long[]{0x0000100002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDriverSwPackageDeployment3578 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDriverSwPackageDeployment3590 = new BitSet(new long[]{0x0000050002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDriverSwPackageDeployment3643 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDriverSwPackageDeployment3655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPDeviceDriverMapping_in_entryRuleMMESPDeviceDriverMapping3695 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPDeviceDriverMapping3705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleMMESPDeviceDriverMapping3742 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleMMESPDeviceDriverMapping3754 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMMESPDeviceDriverMapping3781 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleMMESPDeviceDriverMapping3793 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleMMESPDeviceDriverMapping3805 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleMMESPDeviceDriverMapping3817 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMMESPDeviceDriverMapping3844 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeviceDriverMapping3856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueAssignment_in_entryRuleMParameterValueAssignment3892 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueAssignment3902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleMParameterValueAssignment3939 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMParameterValueAssignment3966 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMParameterValueAssignment3978 = new BitSet(new long[]{0x00380008000000F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValueAssignment3999 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMParameterValueAssignment4011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValue_in_entryRuleMParameterValue4047 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValue4057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueLiteral_in_ruleMParameterValue4107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueRefObject_in_ruleMParameterValue4137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValuePAR_in_ruleMParameterValue4167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueLiteral_in_entryRuleMParameterValueLiteral4202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueLiteral4212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueBooleanLiteral_in_ruleMParameterValueLiteral4262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueStringLiteral_in_ruleMParameterValueLiteral4292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueIntegerLiteral_in_ruleMParameterValueLiteral4322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueRealLiteral_in_ruleMParameterValueLiteral4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueBooleanLiteral_in_entryRuleMParameterValueBooleanLiteral4387 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueBooleanLiteral4397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleMParameterValueBooleanLiteral4455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueStringLiteral_in_entryRuleMParameterValueStringLiteral4491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueStringLiteral4501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMParameterValueStringLiteral4555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueIntegerLiteral_in_entryRuleMParameterValueIntegerLiteral4596 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueIntegerLiteral4606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTEGER_in_ruleMParameterValueIntegerLiteral4664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueRealLiteral_in_entryRuleMParameterValueRealLiteral4700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueRealLiteral4710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleREAL_in_ruleMParameterValueRealLiteral4768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueRefObject_in_entryRuleMParameterValueRefObject4804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueRefObject4814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMParameterValueRefObject4878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValuePAR_in_entryRuleMParameterValuePAR4914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValuePAR4924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleMParameterValuePAR4961 = new BitSet(new long[]{0x00380008000000F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValuePAR4982 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMParameterValuePAR4994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_entryRuleMParameterValueExpression5030 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueExpression5040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueTERM_in_ruleMParameterValueExpression5098 = new BitSet(new long[]{0x00A0000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueExpressionOperators_in_ruleMParameterValueExpression5120 = new BitSet(new long[]{0x00380008000000F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValueExpression5141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueTERM_in_entryRuleMParameterValueTERM5179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueTERM5189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValue_in_ruleMParameterValueTERM5247 = new BitSet(new long[]{0x0300000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueTERMOperators_in_ruleMParameterValueTERM5269 = new BitSet(new long[]{0x00380008000000F0L});
        public static final BitSet FOLLOW_ruleMParameterValueTERM_in_ruleMParameterValueTERM5290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPDeploymentPlatform_in_entryRuleMMESPDeploymentPlatform5334 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPDeploymentPlatform5344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleMMESPDeploymentPlatform5385 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleMMESPDeploymentPlatform5397 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMMESPDeploymentPlatform5414 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeploymentPlatform5431 = new BitSet(new long[]{0x0001C10000000000L});
        public static final BitSet FOLLOW_47_in_ruleMMESPDeploymentPlatform5489 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMMESPDeploymentPlatform5501 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeploymentPlatform5528 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentPlatform5540 = new BitSet(new long[]{0x0001C10002000000L});
        public static final BitSet FOLLOW_48_in_ruleMMESPDeploymentPlatform5608 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMMESPDeploymentPlatform5620 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeploymentPlatform5647 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentPlatform5659 = new BitSet(new long[]{0x0001C10002000000L});
        public static final BitSet FOLLOW_46_in_ruleMMESPDeploymentPlatform5727 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleMMESPDeploymentPlatform5739 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeploymentPlatform5751 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleMMESPDeployedDevice_in_ruleMMESPDeploymentPlatform5772 = new BitSet(new long[]{0x0000040002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeploymentPlatform5785 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentPlatform5797 = new BitSet(new long[]{0x0001C10002000000L});
        public static final BitSet FOLLOW_40_in_ruleMMESPDeploymentPlatform5865 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleMMESPDeploymentPlatform5877 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeploymentPlatform5889 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleMParameterValueAssignment_in_ruleMMESPDeploymentPlatform5910 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeploymentPlatform5923 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentPlatform5935 = new BitSet(new long[]{0x0001C10002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeploymentPlatform5994 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentPlatform6006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPDeployedDevice_in_entryRuleMMESPDeployedDevice6046 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPDeployedDevice6056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleMMESPDeployedDevice6093 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeployedDevice6120 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMMESPDeployedDevice6137 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeployedDevice6154 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_ruleMParameterValueAssignment_in_ruleMMESPDeployedDevice6175 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeployedDevice6188 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeployedDevice6200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPDeploymentAlternative_in_entryRuleMMESPDeploymentAlternative6242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPDeploymentAlternative6252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleMMESPDeploymentAlternative6293 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleMMESPDeploymentAlternative6305 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMMESPDeploymentAlternative6322 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeploymentAlternative6339 = new BitSet(new long[]{0x0000000014408000L});
        public static final BitSet FOLLOW_15_in_ruleMMESPDeploymentAlternative6397 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMMESPDeploymentAlternative6409 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMMESPDeploymentAlternative6421 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMMESPDeploymentAlternative6445 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_23_in_ruleMMESPDeploymentAlternative6458 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMMESPDeploymentAlternative6482 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentAlternative6496 = new BitSet(new long[]{0x0000000016408000L});
        public static final BitSet FOLLOW_22_in_ruleMMESPDeploymentAlternative6564 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMMESPDeploymentAlternative6576 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeploymentAlternative6603 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_23_in_ruleMMESPDeploymentAlternative6616 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMMESPDeploymentAlternative6643 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentAlternative6657 = new BitSet(new long[]{0x0000000016408000L});
        public static final BitSet FOLLOW_28_in_ruleMMESPDeploymentAlternative6725 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeploymentAlternative6737 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_ruleMMESPSwPackageDeployment_in_ruleMMESPDeploymentAlternative6758 = new BitSet(new long[]{0x000000C002000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeploymentAlternative6771 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentAlternative6783 = new BitSet(new long[]{0x0000000016408000L});
        public static final BitSet FOLLOW_26_in_ruleMMESPDeploymentAlternative6851 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMMESPDeploymentAlternative6863 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeploymentAlternative6875 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleMSwPackageRequiredInterface_in_ruleMMESPDeploymentAlternative6896 = new BitSet(new long[]{0x0000000042000000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeploymentAlternative6909 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentAlternative6921 = new BitSet(new long[]{0x0000000016408000L});
        public static final BitSet FOLLOW_15_in_ruleMMESPDeploymentAlternative6989 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMMESPDeploymentAlternative7001 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMMESPDeploymentAlternative7013 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleMMESPDeploymentAlternative_in_ruleMMESPDeploymentAlternative7034 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeploymentAlternative7047 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentAlternative7059 = new BitSet(new long[]{0x0000000016408000L});
        public static final BitSet FOLLOW_25_in_ruleMMESPDeploymentAlternative7118 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPDeploymentAlternative7130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean7171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean7182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEBoolean7220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEBoolean7239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTEGER_in_entryRuleINTEGER7280 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER7291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleINTEGER7331 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleINTEGER7348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HEXADECIMAL_in_ruleINTEGER7375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL7421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleREAL7432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleREAL7471 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleREAL7489 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleREAL7507 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleREAL7522 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_54_in_ruleREAL7542 = new BitSet(new long[]{0x0020000000000020L});
        public static final BitSet FOLLOW_53_in_ruleREAL7556 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleREAL7573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleMParameterValueExpressionOperators7634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleMParameterValueExpressionOperators7651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMParameterValueTERMOperators7696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMParameterValueTERMOperators7713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_synpred2_InternalDEP544 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_synpred2_InternalDEP556 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_synpred2_InternalDEP577 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred2_InternalDEP589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_synpred3_InternalDEP657 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_synpred3_InternalDEP669 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_synpred3_InternalDEP681 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred3_InternalDEP708 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred3_InternalDEP720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_synpred5_InternalDEP788 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_synpred5_InternalDEP800 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred5_InternalDEP827 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_23_in_synpred5_InternalDEP840 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred5_InternalDEP867 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_13_in_synpred5_InternalDEP881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_synpred7_InternalDEP949 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred7_InternalDEP961 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred7_InternalDEP973 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleMMESPDeploymentPlatform_in_synpred7_InternalDEP994 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_synpred7_InternalDEP1007 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred7_InternalDEP1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_synpred9_InternalDEP1087 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_synpred9_InternalDEP1099 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred9_InternalDEP1111 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleMSwPackageRequiredInterface_in_synpred9_InternalDEP1132 = new BitSet(new long[]{0x0000000042000000L});
        public static final BitSet FOLLOW_25_in_synpred9_InternalDEP1145 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred9_InternalDEP1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_synpred11_InternalDEP1225 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred11_InternalDEP1237 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_ruleMMESPSwPackageDeployment_in_synpred11_InternalDEP1258 = new BitSet(new long[]{0x000000C002000000L});
        public static final BitSet FOLLOW_25_in_synpred11_InternalDEP1271 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred11_InternalDEP1283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_synpred13_InternalDEP1351 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_synpred13_InternalDEP1363 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred13_InternalDEP1375 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleMMESPDeploymentAlternative_in_synpred13_InternalDEP1396 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_synpred13_InternalDEP1409 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred13_InternalDEP1421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_synpred28_InternalDEP3382 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_synpred28_InternalDEP3394 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred28_InternalDEP3406 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleMParameterValueAssignment_in_synpred28_InternalDEP3427 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_25_in_synpred28_InternalDEP3440 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred28_InternalDEP3452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_synpred30_InternalDEP3520 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_synpred30_InternalDEP3532 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred30_InternalDEP3544 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleMMESPDeviceDriverMapping_in_synpred30_InternalDEP3565 = new BitSet(new long[]{0x0000100002000000L});
        public static final BitSet FOLLOW_25_in_synpred30_InternalDEP3578 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred30_InternalDEP3590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_synpred38_InternalDEP5489 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_synpred38_InternalDEP5501 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred38_InternalDEP5528 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred38_InternalDEP5540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_synpred39_InternalDEP5608 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_synpred39_InternalDEP5620 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred39_InternalDEP5647 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred39_InternalDEP5659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_synpred41_InternalDEP5727 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_synpred41_InternalDEP5739 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred41_InternalDEP5751 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleMMESPDeployedDevice_in_synpred41_InternalDEP5772 = new BitSet(new long[]{0x0000040002000000L});
        public static final BitSet FOLLOW_25_in_synpred41_InternalDEP5785 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred41_InternalDEP5797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_synpred43_InternalDEP5865 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_synpred43_InternalDEP5877 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred43_InternalDEP5889 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleMParameterValueAssignment_in_synpred43_InternalDEP5910 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_25_in_synpred43_InternalDEP5923 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred43_InternalDEP5935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_synpred46_InternalDEP6397 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred46_InternalDEP6409 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_synpred46_InternalDEP6421 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred46_InternalDEP6445 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_23_in_synpred46_InternalDEP6458 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred46_InternalDEP6482 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_13_in_synpred46_InternalDEP6496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_synpred48_InternalDEP6564 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_synpred48_InternalDEP6576 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred48_InternalDEP6603 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_23_in_synpred48_InternalDEP6616 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred48_InternalDEP6643 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_13_in_synpred48_InternalDEP6657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_synpred50_InternalDEP6725 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred50_InternalDEP6737 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_ruleMMESPSwPackageDeployment_in_synpred50_InternalDEP6758 = new BitSet(new long[]{0x000000C002000000L});
        public static final BitSet FOLLOW_25_in_synpred50_InternalDEP6771 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred50_InternalDEP6783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_synpred52_InternalDEP6851 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_synpred52_InternalDEP6863 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred52_InternalDEP6875 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleMSwPackageRequiredInterface_in_synpred52_InternalDEP6896 = new BitSet(new long[]{0x0000000042000000L});
        public static final BitSet FOLLOW_25_in_synpred52_InternalDEP6909 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred52_InternalDEP6921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_synpred54_InternalDEP6989 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_synpred54_InternalDEP7001 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred54_InternalDEP7013 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleMMESPDeploymentAlternative_in_synpred54_InternalDEP7034 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_synpred54_InternalDEP7047 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred54_InternalDEP7059 = new BitSet(new long[]{0x0000000000000002L});
    }


}