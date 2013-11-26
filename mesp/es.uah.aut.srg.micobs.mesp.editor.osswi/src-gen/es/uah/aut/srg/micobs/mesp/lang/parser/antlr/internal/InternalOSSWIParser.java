/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
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
import es.uah.aut.srg.micobs.mesp.lang.services.OSSWIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalOSSWIParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'osswinterface'", "'extends'", "','", "'{'", "'version'", "':='", "'osapi'", "'provided'", "'resources'", "'}'", "'quantifiable'", "'resource'", "'step'", "'to'", "'instantiable'", "'integer'", "'range'", "'enum'", "'real'", "'='", "'boolean'", "'string'", "'true'", "'false'", "'-'", "'e'", "']'", "'['", "'+'", "'*'", "'/'"
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
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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


        public InternalOSSWIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOSSWIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOSSWIParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private OSSWIGrammarAccess grammarAccess;
     	
        public InternalOSSWIParser(TokenStream input, OSSWIGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MMESPOSSWIPackageFile";	
       	}
       	
       	@Override
       	protected OSSWIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMMESPOSSWIPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:75:1: entryRuleMMESPOSSWIPackageFile returns [EObject current=null] : iv_ruleMMESPOSSWIPackageFile= ruleMMESPOSSWIPackageFile EOF ;
    public final EObject entryRuleMMESPOSSWIPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPOSSWIPackageFile = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:76:2: (iv_ruleMMESPOSSWIPackageFile= ruleMMESPOSSWIPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:77:2: iv_ruleMMESPOSSWIPackageFile= ruleMMESPOSSWIPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPOSSWIPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPOSSWIPackageFile_in_entryRuleMMESPOSSWIPackageFile81);
            iv_ruleMMESPOSSWIPackageFile=ruleMMESPOSSWIPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPOSSWIPackageFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPOSSWIPackageFile91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPOSSWIPackageFile"


    // $ANTLR start "ruleMMESPOSSWIPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:84:1: ruleMMESPOSSWIPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) ) ) ;
    public final EObject ruleMMESPOSSWIPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:87:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:88:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMMESPOSSWIPackageFile128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:92:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:93:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:93:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:94:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPOSSWIPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMESPOSSWIPackageFile155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPOSSWIPackageFile167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:114:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:114:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMMESPOSSWIPackageFile180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMESPOSSWIPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:118:1: ( ( ruleQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:119:1: ( ruleQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:119:1: ( ruleQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:120:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPOSSWIPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMESPOSSWIPackageFile207);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPOSSWIPackageFile219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:140:3: ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:141:1: (lv_element_6_0= ruleMMESPOSSWIPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:141:1: (lv_element_6_0= ruleMMESPOSSWIPackageElement )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:142:3: lv_element_6_0= ruleMMESPOSSWIPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementMMESPOSSWIPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPOSSWIPackageElement_in_ruleMMESPOSSWIPackageFile242);
            lv_element_6_0=ruleMMESPOSSWIPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMESPOSSWIPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"MMESPOSSWIPackageElement");
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
    // $ANTLR end "ruleMMESPOSSWIPackageFile"


    // $ANTLR start "entryRuleMMESPOSSWIPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:166:1: entryRuleMMESPOSSWIPackageElement returns [EObject current=null] : iv_ruleMMESPOSSWIPackageElement= ruleMMESPOSSWIPackageElement EOF ;
    public final EObject entryRuleMMESPOSSWIPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPOSSWIPackageElement = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:167:2: (iv_ruleMMESPOSSWIPackageElement= ruleMMESPOSSWIPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:168:2: iv_ruleMMESPOSSWIPackageElement= ruleMMESPOSSWIPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPOSSWIPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPOSSWIPackageElement_in_entryRuleMMESPOSSWIPackageElement278);
            iv_ruleMMESPOSSWIPackageElement=ruleMMESPOSSWIPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPOSSWIPackageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPOSSWIPackageElement288); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPOSSWIPackageElement"


    // $ANTLR start "ruleMMESPOSSWIPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:175:1: ruleMMESPOSSWIPackageElement returns [EObject current=null] : this_MOSSwInterface_0= ruleMOSSwInterface ;
    public final EObject ruleMMESPOSSWIPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MOSSwInterface_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:178:28: (this_MOSSwInterface_0= ruleMOSSwInterface )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:180:2: this_MOSSwInterface_0= ruleMOSSwInterface
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMESPOSSWIPackageElementAccess().getMOSSwInterfaceParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMOSSwInterface_in_ruleMMESPOSSWIPackageElement337);
            this_MOSSwInterface_0=ruleMOSSwInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MOSSwInterface_0; 
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
    // $ANTLR end "ruleMMESPOSSWIPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:199:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:200:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:201:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName372);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName383); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:208:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:211:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:212:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:212:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:212:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:219:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:220:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQualifiedName442); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName457); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:240:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:241:2: (iv_ruleVersion= ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:242:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion505);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion516); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:249:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:252:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:253:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:253:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:253:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:253:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==13||LA4_1==15||LA4_1==17) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:253:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:261:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:261:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:261:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:261:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:261:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion585); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
                                  
                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion607); if (state.failed) return current;
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:275:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:276:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVersion628); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:281:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_INT) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (LA6_1==RULE_ID) ) {
            	            alt6=2;
            	        }
            	        else if ( (LA6_1==EOF||LA6_1==13||LA6_1==15||LA6_1==17) ) {
            	            alt6=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA6_0==RULE_ID) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:281:6: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion644); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_4);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:289:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:289:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:289:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:289:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:289:12: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion672); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      		current.merge(this_INT_5);
            	                          
            	                    }
            	                    if ( state.backtracking==0 ) {
            	                       
            	                          newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            	                          
            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion694); if (state.failed) return current;
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
            	    break loop7;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:311:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:312:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:313:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName744);
            iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedName755); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:320:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:323:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:324:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:324:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:325:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleVersionedQualifiedName802);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleVersionedQualifiedName820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleVersionedQualifiedName842);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Version_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVersionedQualifiedName860); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:366:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:367:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:368:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName901);
            iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedReferenceName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName912); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:375:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:378:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:379:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:379:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:379:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:379:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=15 && LA8_1<=16)) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:380:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleVersionedQualifiedReferenceName960);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VersionedQualifiedName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVersionedQualifiedReferenceName978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:403:1: (kw= '::' this_ID_4= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:404:2: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVersionedQualifiedReferenceName1014); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            	          
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName1029); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "entryRuleMOSSwInterface"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:424:1: entryRuleMOSSwInterface returns [EObject current=null] : iv_ruleMOSSwInterface= ruleMOSSwInterface EOF ;
    public final EObject entryRuleMOSSwInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOSSwInterface = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:430:2: (iv_ruleMOSSwInterface= ruleMOSSwInterface EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:431:2: iv_ruleMOSSwInterface= ruleMOSSwInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMOSSwInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMOSSwInterface_in_entryRuleMOSSwInterface1082);
            iv_ruleMOSSwInterface=ruleMOSSwInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMOSSwInterface; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMOSSwInterface1092); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMOSSwInterface"


    // $ANTLR start "ruleMOSSwInterface"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:441:1: ruleMOSSwInterface returns [EObject current=null] : (otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleMOSSwInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_providedResources_19_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4()
        		);
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:447:28: ( (otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:448:1: (otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:448:1: (otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:448:3: otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMOSSwInterface1133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMOSSwInterfaceAccess().getOsswinterfaceKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:452:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:453:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:453:1: (lv_name_1_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMOSSwInterface1150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMOSSwInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMOSSwInterfaceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:470:2: (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:470:4: otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMOSSwInterface1168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMOSSwInterfaceAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:474:1: ( ( ruleVersionedQualifiedName ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:475:1: ( ruleVersionedQualifiedName )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:475:1: ( ruleVersionedQualifiedName )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:476:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMOSSwInterfaceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwInterface1195);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:492:2: (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:492:4: otherlv_4= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMOSSwInterface1208); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMOSSwInterfaceAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:496:1: ( ( ruleVersionedQualifiedName ) )
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:497:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:497:1: ( ruleVersionedQualifiedName )
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:498:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getMOSSwInterfaceRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwInterface1235);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMOSSwInterface1251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:518:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:520:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:520:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:521:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:524:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?)
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:525:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:525:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:528:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:528:111: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:529:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:532:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:532:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:532:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:532:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMOSSwInterface1309); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMOSSwInterfaceAccess().getVersionKeyword_4_0_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMOSSwInterface1321); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_0_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:540:1: ( (lv_version_10_0= ruleVersion ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:541:1: (lv_version_10_0= ruleVersion )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:541:1: (lv_version_10_0= ruleVersion )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:542:3: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleMOSSwInterface1342);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMOSSwInterfaceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"version",
            	              		lv_version_10_0, 
            	              		"Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMOSSwInterface1354); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:570:5: {...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:570:111: ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:571:6: ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:574:6: ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:574:7: {...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:574:16: (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:574:18: otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMOSSwInterface1422); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMOSSwInterfaceAccess().getOsapiKeyword_4_1_0());
            	          
            	    }
            	    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMOSSwInterface1434); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_1_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:582:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:583:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:583:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:584:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMOSSwInterfaceRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementMOperatingSystemAPICrossReference_4_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwInterface1461);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMOSSwInterface1473); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_1_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:612:5: {...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:612:111: ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:613:6: ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:616:6: ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:616:7: {...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:616:16: (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:616:18: otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';'
            	    {
            	    otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMOSSwInterface1541); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMOSSwInterfaceAccess().getProvidedKeyword_4_2_0());
            	          
            	    }
            	    otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMOSSwInterface1553); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMOSSwInterfaceAccess().getResourcesKeyword_4_2_1());
            	          
            	    }
            	    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMOSSwInterface1565); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_4_2_2());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:628:1: ( (lv_providedResources_19_0= ruleMProvidedResource ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==29||LA12_0==33) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:629:1: (lv_providedResources_19_0= ruleMProvidedResource )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:629:1: (lv_providedResources_19_0= ruleMProvidedResource )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:630:3: lv_providedResources_19_0= ruleMProvidedResource
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMProvidedResource_in_ruleMOSSwInterface1586);
            	    	    lv_providedResources_19_0=ruleMProvidedResource();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMOSSwInterfaceRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"providedResources",
            	    	              		lv_providedResources_19_0, 
            	    	              		"MProvidedResource");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt12 >= 1 ) break loop12;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);

            	    otherlv_20=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMOSSwInterface1599); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_4_2_4());
            	          
            	    }
            	    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMOSSwInterface1611); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMOSSwInterface", "getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());

            }

            otherlv_22=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMOSSwInterface1670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMOSSwInterface1682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_23, grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMOSSwInterface"


    // $ANTLR start "entryRuleMProvidedResource"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:688:1: entryRuleMProvidedResource returns [EObject current=null] : iv_ruleMProvidedResource= ruleMProvidedResource EOF ;
    public final EObject entryRuleMProvidedResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMProvidedResource = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:689:2: (iv_ruleMProvidedResource= ruleMProvidedResource EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:690:2: iv_ruleMProvidedResource= ruleMProvidedResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMProvidedResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMProvidedResource_in_entryRuleMProvidedResource1722);
            iv_ruleMProvidedResource=ruleMProvidedResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMProvidedResource; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMProvidedResource1732); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMProvidedResource"


    // $ANTLR start "ruleMProvidedResource"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:697:1: ruleMProvidedResource returns [EObject current=null] : (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource ) ;
    public final EObject ruleMProvidedResource() throws RecognitionException {
        EObject current = null;

        EObject this_MQuantifiableResource_0 = null;

        EObject this_MInstantiableResource_1 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:700:28: ( (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:701:1: (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:701:1: (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:702:2: this_MQuantifiableResource_0= ruleMQuantifiableResource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMProvidedResourceAccess().getMQuantifiableResourceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMQuantifiableResource_in_ruleMProvidedResource1782);
                    this_MQuantifiableResource_0=ruleMQuantifiableResource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MQuantifiableResource_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:715:2: this_MInstantiableResource_1= ruleMInstantiableResource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMProvidedResourceAccess().getMInstantiableResourceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMInstantiableResource_in_ruleMProvidedResource1812);
                    this_MInstantiableResource_1=ruleMInstantiableResource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MInstantiableResource_1; 
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
    // $ANTLR end "ruleMProvidedResource"


    // $ANTLR start "entryRuleMQuantifiableResource"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:734:1: entryRuleMQuantifiableResource returns [EObject current=null] : iv_ruleMQuantifiableResource= ruleMQuantifiableResource EOF ;
    public final EObject entryRuleMQuantifiableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMQuantifiableResource = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:735:2: (iv_ruleMQuantifiableResource= ruleMQuantifiableResource EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:736:2: iv_ruleMQuantifiableResource= ruleMQuantifiableResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMQuantifiableResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMQuantifiableResource_in_entryRuleMQuantifiableResource1847);
            iv_ruleMQuantifiableResource=ruleMQuantifiableResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMQuantifiableResource; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMQuantifiableResource1857); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMQuantifiableResource"


    // $ANTLR start "ruleMQuantifiableResource"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:743:1: ruleMQuantifiableResource returns [EObject current=null] : (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' ) ;
    public final EObject ruleMQuantifiableResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_lowerBound_4_0 = null;

        EObject lv_upperBound_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:746:28: ( (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:747:1: (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:747:1: (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:747:3: otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMQuantifiableResource1894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMQuantifiableResourceAccess().getQuantifiableKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMQuantifiableResource1906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMQuantifiableResourceAccess().getResourceKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:755:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:756:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:756:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:757:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMQuantifiableResource1923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMQuantifiableResourceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMQuantifiableResourceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMQuantifiableResource1940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMQuantifiableResourceAccess().getStepKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:777:1: ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:778:1: (lv_lowerBound_4_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:778:1: (lv_lowerBound_4_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:779:3: lv_lowerBound_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMQuantifiableResource1961);
            lv_lowerBound_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMQuantifiableResourceRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_4_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMQuantifiableResource1973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMQuantifiableResourceAccess().getToKeyword_5());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:799:1: ( (lv_upperBound_6_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:800:1: (lv_upperBound_6_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:800:1: (lv_upperBound_6_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:801:3: lv_upperBound_6_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMQuantifiableResource1994);
            lv_upperBound_6_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMQuantifiableResourceRule());
              	        }
                     		set(
                     			current, 
                     			"upperBound",
                      		lv_upperBound_6_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMQuantifiableResource2006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMQuantifiableResourceAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMQuantifiableResource"


    // $ANTLR start "entryRuleMInstantiableResource"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:829:1: entryRuleMInstantiableResource returns [EObject current=null] : iv_ruleMInstantiableResource= ruleMInstantiableResource EOF ;
    public final EObject entryRuleMInstantiableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInstantiableResource = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:830:2: (iv_ruleMInstantiableResource= ruleMInstantiableResource EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:831:2: iv_ruleMInstantiableResource= ruleMInstantiableResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInstantiableResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInstantiableResource_in_entryRuleMInstantiableResource2042);
            iv_ruleMInstantiableResource=ruleMInstantiableResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInstantiableResource; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMInstantiableResource2052); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMInstantiableResource"


    // $ANTLR start "ruleMInstantiableResource"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:838:1: ruleMInstantiableResource returns [EObject current=null] : (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' ) ;
    public final EObject ruleMInstantiableResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:841:28: ( (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:842:1: (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:842:1: (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:842:3: otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMInstantiableResource2089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMInstantiableResourceAccess().getInstantiableKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMInstantiableResource2101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMInstantiableResourceAccess().getResourceKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:850:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:851:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:851:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:852:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMInstantiableResource2118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMInstantiableResourceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMInstantiableResourceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMInstantiableResource2135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMInstantiableResourceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:872:1: ( (lv_parameters_4_0= ruleMParameter ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34||(LA15_0>=36 && LA15_0<=37)||(LA15_0>=39 && LA15_0<=40)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:873:1: (lv_parameters_4_0= ruleMParameter )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:873:1: (lv_parameters_4_0= ruleMParameter )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:874:3: lv_parameters_4_0= ruleMParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMInstantiableResourceAccess().getParametersMParameterParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMParameter_in_ruleMInstantiableResource2156);
            	    lv_parameters_4_0=ruleMParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMInstantiableResourceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_4_0, 
            	              		"MParameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMInstantiableResource2169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMInstantiableResourceAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMInstantiableResource2181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMInstantiableResourceAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMInstantiableResource"


    // $ANTLR start "entryRuleMParameter"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:906:1: entryRuleMParameter returns [EObject current=null] : iv_ruleMParameter= ruleMParameter EOF ;
    public final EObject entryRuleMParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameter = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:907:2: (iv_ruleMParameter= ruleMParameter EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:908:2: iv_ruleMParameter= ruleMParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameter_in_entryRuleMParameter2217);
            iv_ruleMParameter=ruleMParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameter2227); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMParameter"


    // $ANTLR start "ruleMParameter"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:915:1: ruleMParameter returns [EObject current=null] : (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition ) ;
    public final EObject ruleMParameter() throws RecognitionException {
        EObject current = null;

        EObject this_MIntegerParameterSingleExpression_0 = null;

        EObject this_MEnumParameterSingleExpression_1 = null;

        EObject this_MBooleanParameterSingleExpression_2 = null;

        EObject this_MRealParameterSingleExpression_3 = null;

        EObject this_MStringParameterSingleExpression_4 = null;

        EObject this_MEnumParameterDefinition_5 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:918:28: ( (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:919:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:919:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==RULE_ID) ) {
                    int LA16_6 = input.LA(3);

                    if ( (LA16_6==RULE_ID||(LA16_6>=15 && LA16_6<=16)||LA16_6==18) ) {
                        alt16=2;
                    }
                    else if ( (LA16_6==22) ) {
                        alt16=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt16=3;
                }
                break;
            case 37:
                {
                alt16=4;
                }
                break;
            case 40:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:920:2: this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMIntegerParameterSingleExpression_in_ruleMParameter2277);
                    this_MIntegerParameterSingleExpression_0=ruleMIntegerParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MIntegerParameterSingleExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:933:2: this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMEnumParameterSingleExpression_in_ruleMParameter2307);
                    this_MEnumParameterSingleExpression_1=ruleMEnumParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MEnumParameterSingleExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:946:2: this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMBooleanParameterSingleExpression_in_ruleMParameter2337);
                    this_MBooleanParameterSingleExpression_2=ruleMBooleanParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MBooleanParameterSingleExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:959:2: this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMRealParameterSingleExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMRealParameterSingleExpression_in_ruleMParameter2367);
                    this_MRealParameterSingleExpression_3=ruleMRealParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MRealParameterSingleExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:972:2: this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMStringParameterSingleExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMStringParameterSingleExpression_in_ruleMParameter2397);
                    this_MStringParameterSingleExpression_4=ruleMStringParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MStringParameterSingleExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:985:2: this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMEnumParameterDefinitionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMEnumParameterDefinition_in_ruleMParameter2427);
                    this_MEnumParameterDefinition_5=ruleMEnumParameterDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MEnumParameterDefinition_5; 
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
    // $ANTLR end "ruleMParameter"


    // $ANTLR start "entryRuleMIntegerParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1004:1: entryRuleMIntegerParameterSingleExpression returns [EObject current=null] : iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF ;
    public final EObject entryRuleMIntegerParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIntegerParameterSingleExpression = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1005:2: (iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1006:2: iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMIntegerParameterSingleExpression_in_entryRuleMIntegerParameterSingleExpression2462);
            iv_ruleMIntegerParameterSingleExpression=ruleMIntegerParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMIntegerParameterSingleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMIntegerParameterSingleExpression2472); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMIntegerParameterSingleExpression"


    // $ANTLR start "ruleMIntegerParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1013:1: ruleMIntegerParameterSingleExpression returns [EObject current=null] : ( () otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleMIntegerParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_defaultValue_4_0 = null;

        EObject lv_range_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1016:28: ( ( () otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1017:1: ( () otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1017:1: ( () otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1017:2: () otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1017:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1018:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMIntegerParameterSingleExpressionAccess().getMIntegerParameterSingleExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMIntegerParameterSingleExpression2521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1030:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1031:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1031:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1032:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMIntegerParameterSingleExpression2538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMIntegerParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMIntegerParameterSingleExpression2555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1052:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1053:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1053:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1054:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMIntegerParameterSingleExpression2576);
            lv_defaultValue_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMIntegerParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_4_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1070:2: (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1070:4: otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) )
                    {
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMIntegerParameterSingleExpression2589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0());
                          
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1074:1: ( (lv_range_6_0= ruleMParameterRange ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1075:1: (lv_range_6_0= ruleMParameterRange )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1075:1: (lv_range_6_0= ruleMParameterRange )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1076:3: lv_range_6_0= ruleMParameterRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterRange_in_ruleMIntegerParameterSingleExpression2610);
                    lv_range_6_0=ruleMParameterRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMIntegerParameterSingleExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_6_0, 
                              		"MParameterRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMIntegerParameterSingleExpression2624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMIntegerParameterSingleExpression"


    // $ANTLR start "entryRuleMEnumParameterDefinition"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1104:1: entryRuleMEnumParameterDefinition returns [EObject current=null] : iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF ;
    public final EObject entryRuleMEnumParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterDefinition = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1105:2: (iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1106:2: iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParameterDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMEnumParameterDefinition_in_entryRuleMEnumParameterDefinition2660);
            iv_ruleMEnumParameterDefinition=ruleMEnumParameterDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParameterDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMEnumParameterDefinition2670); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMEnumParameterDefinition"


    // $ANTLR start "ruleMEnumParameterDefinition"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1113:1: ruleMEnumParameterDefinition returns [EObject current=null] : ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleMEnumParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_literals_4_0 = null;

        EObject lv_literals_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1116:28: ( ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1117:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1117:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1117:2: () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1117:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1118:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMEnumParameterDefinition2719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1130:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1131:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1131:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1132:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMEnumParameterDefinition2736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParameterDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMEnumParameterDefinition2753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1152:1: ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1153:1: (lv_literals_4_0= ruleMEnumParameterLiteralRule )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1153:1: (lv_literals_4_0= ruleMEnumParameterLiteralRule )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1154:3: lv_literals_4_0= ruleMEnumParameterLiteralRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMEnumParameterLiteralRule_in_ruleMEnumParameterDefinition2774);
            lv_literals_4_0=ruleMEnumParameterLiteralRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMEnumParameterDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"literals",
                      		lv_literals_4_0, 
                      		"MEnumParameterLiteralRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1170:2: (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1170:4: otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMEnumParameterDefinition2787); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1174:1: ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1175:1: (lv_literals_6_0= ruleMEnumParameterLiteralRule )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1175:1: (lv_literals_6_0= ruleMEnumParameterLiteralRule )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1176:3: lv_literals_6_0= ruleMEnumParameterLiteralRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMEnumParameterLiteralRule_in_ruleMEnumParameterDefinition2808);
            	    lv_literals_6_0=ruleMEnumParameterLiteralRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMEnumParameterDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"literals",
            	              		lv_literals_6_0, 
            	              		"MEnumParameterLiteralRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMEnumParameterDefinition2822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMEnumParameterDefinition2834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMEnumParameterDefinition"


    // $ANTLR start "entryRuleMEnumParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1208:1: entryRuleMEnumParameterSingleExpression returns [EObject current=null] : iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF ;
    public final EObject entryRuleMEnumParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterSingleExpression = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1209:2: (iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1210:2: iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMEnumParameterSingleExpression_in_entryRuleMEnumParameterSingleExpression2870);
            iv_ruleMEnumParameterSingleExpression=ruleMEnumParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParameterSingleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMEnumParameterSingleExpression2880); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMEnumParameterSingleExpression"


    // $ANTLR start "ruleMEnumParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1217:1: ruleMEnumParameterSingleExpression returns [EObject current=null] : ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleMEnumParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_defaultValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1220:28: ( ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1221:1: ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1221:1: ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1221:2: () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1221:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1222:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMEnumParameterSingleExpressionAccess().getMEnumParameterSingleExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMEnumParameterSingleExpression2929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1234:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1235:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1235:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1236:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParameterSingleExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMEnumParameterSingleExpression2956);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1252:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1253:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1253:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1254:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMEnumParameterSingleExpression2973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMEnumParameterSingleExpression2990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1274:1: ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1275:1: (lv_defaultValue_5_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1275:1: (lv_defaultValue_5_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1276:3: lv_defaultValue_5_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMEnumParameterSingleExpression3011);
            lv_defaultValue_5_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMEnumParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_5_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMEnumParameterSingleExpression3023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMEnumParameterSingleExpression"


    // $ANTLR start "entryRuleMRealParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1304:1: entryRuleMRealParameterSingleExpression returns [EObject current=null] : iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF ;
    public final EObject entryRuleMRealParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRealParameterSingleExpression = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1305:2: (iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1306:2: iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMRealParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMRealParameterSingleExpression_in_entryRuleMRealParameterSingleExpression3059);
            iv_ruleMRealParameterSingleExpression=ruleMRealParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMRealParameterSingleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMRealParameterSingleExpression3069); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMRealParameterSingleExpression"


    // $ANTLR start "ruleMRealParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1313:1: ruleMRealParameterSingleExpression returns [EObject current=null] : ( () otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleMRealParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_defaultValue_4_0 = null;

        EObject lv_range_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1316:28: ( ( () otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1317:1: ( () otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1317:1: ( () otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1317:2: () otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1317:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1318:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMRealParameterSingleExpressionAccess().getMRealParameterSingleExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMRealParameterSingleExpression3118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1330:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1331:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1331:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1332:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMRealParameterSingleExpression3135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMRealParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMRealParameterSingleExpression3152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1352:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1353:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1353:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1354:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMRealParameterSingleExpression3173);
            lv_defaultValue_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMRealParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_4_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1370:2: (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1370:4: otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) )
                    {
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMRealParameterSingleExpression3186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0());
                          
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1374:1: ( (lv_range_6_0= ruleMParameterRange ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1375:1: (lv_range_6_0= ruleMParameterRange )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1375:1: (lv_range_6_0= ruleMParameterRange )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1376:3: lv_range_6_0= ruleMParameterRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterRange_in_ruleMRealParameterSingleExpression3207);
                    lv_range_6_0=ruleMParameterRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMRealParameterSingleExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_6_0, 
                              		"MParameterRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMRealParameterSingleExpression3221); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMRealParameterSingleExpression"


    // $ANTLR start "entryRuleMEnumParameterLiteralRule"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1404:1: entryRuleMEnumParameterLiteralRule returns [EObject current=null] : iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF ;
    public final EObject entryRuleMEnumParameterLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterLiteralRule = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1405:2: (iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1406:2: iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMEnumParameterLiteralRule_in_entryRuleMEnumParameterLiteralRule3257);
            iv_ruleMEnumParameterLiteralRule=ruleMEnumParameterLiteralRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParameterLiteralRule; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMEnumParameterLiteralRule3267); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMEnumParameterLiteralRule"


    // $ANTLR start "ruleMEnumParameterLiteralRule"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1413:1: ruleMEnumParameterLiteralRule returns [EObject current=null] : (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral ) ;
    public final EObject ruleMEnumParameterLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject this_MEnumParameterLiteral_0 = null;

        EObject this_MEnumParamIntegerLiteral_1 = null;

        EObject this_MEnumParamRealLiteral_2 = null;

        EObject this_MEnumParamStringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1416:28: ( (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1417:1: (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1417:1: (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral )
            int alt20=4;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==38) ) {
                    switch ( input.LA(3) ) {
                    case 43:
                        {
                        int LA20_4 = input.LA(4);

                        if ( (LA20_4==RULE_INT) ) {
                            int LA20_5 = input.LA(5);

                            if ( (LA20_5==15) ) {
                                alt20=3;
                            }
                            else if ( (LA20_5==EOF||LA20_5==21||LA20_5==28) ) {
                                alt20=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        int LA20_5 = input.LA(4);

                        if ( (LA20_5==15) ) {
                            alt20=3;
                        }
                        else if ( (LA20_5==EOF||LA20_5==21||LA20_5==28) ) {
                            alt20=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HEXADECIMAL:
                        {
                        alt20=2;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }

                }
                else if ( (LA20_1==EOF||LA20_1==21||LA20_1==28) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1418:2: this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParameterLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMEnumParameterLiteral_in_ruleMEnumParameterLiteralRule3317);
                    this_MEnumParameterLiteral_0=ruleMEnumParameterLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MEnumParameterLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1431:2: this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamIntegerLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMEnumParamIntegerLiteral_in_ruleMEnumParameterLiteralRule3347);
                    this_MEnumParamIntegerLiteral_1=ruleMEnumParamIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MEnumParamIntegerLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1444:2: this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamRealLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMEnumParamRealLiteral_in_ruleMEnumParameterLiteralRule3377);
                    this_MEnumParamRealLiteral_2=ruleMEnumParamRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MEnumParamRealLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1457:2: this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMEnumParamStringLiteral_in_ruleMEnumParameterLiteralRule3407);
                    this_MEnumParamStringLiteral_3=ruleMEnumParamStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MEnumParamStringLiteral_3; 
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
    // $ANTLR end "ruleMEnumParameterLiteralRule"


    // $ANTLR start "entryRuleMEnumParameterLiteral"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1476:1: entryRuleMEnumParameterLiteral returns [EObject current=null] : iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF ;
    public final EObject entryRuleMEnumParameterLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1477:2: (iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1478:2: iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParameterLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMEnumParameterLiteral_in_entryRuleMEnumParameterLiteral3442);
            iv_ruleMEnumParameterLiteral=ruleMEnumParameterLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParameterLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMEnumParameterLiteral3452); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMEnumParameterLiteral"


    // $ANTLR start "ruleMEnumParameterLiteral"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1485:1: ruleMEnumParameterLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMEnumParameterLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1488:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1489:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1489:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1489:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1489:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1490:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0(),
                          current);
                  
            }

            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1498:2: ( (lv_name_1_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1499:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1499:1: (lv_name_1_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1500:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMEnumParameterLiteral3506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParameterLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleMEnumParameterLiteral"


    // $ANTLR start "entryRuleMEnumParamIntegerLiteral"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1524:1: entryRuleMEnumParamIntegerLiteral returns [EObject current=null] : iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF ;
    public final EObject entryRuleMEnumParamIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamIntegerLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1525:2: (iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1526:2: iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParamIntegerLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMEnumParamIntegerLiteral_in_entryRuleMEnumParamIntegerLiteral3547);
            iv_ruleMEnumParamIntegerLiteral=ruleMEnumParamIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParamIntegerLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMEnumParamIntegerLiteral3557); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMEnumParamIntegerLiteral"


    // $ANTLR start "ruleMEnumParamIntegerLiteral"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1533:1: ruleMEnumParamIntegerLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMEnumParamIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1536:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1537:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1537:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1537:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1537:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1538:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0(),
                          current);
                  
            }

            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1546:2: ( (lv_name_1_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1547:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1547:1: (lv_name_1_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1548:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMEnumParamIntegerLiteral3611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParamIntegerLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMEnumParamIntegerLiteral3628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1568:1: ( (lv_value_3_0= ruleINTEGER ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1569:1: (lv_value_3_0= ruleINTEGER )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1569:1: (lv_value_3_0= ruleINTEGER )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1570:3: lv_value_3_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_ruleMEnumParamIntegerLiteral3649);
            lv_value_3_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMEnumParamIntegerLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
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
    // $ANTLR end "ruleMEnumParamIntegerLiteral"


    // $ANTLR start "entryRuleMEnumParamRealLiteral"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1594:1: entryRuleMEnumParamRealLiteral returns [EObject current=null] : iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF ;
    public final EObject entryRuleMEnumParamRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamRealLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1595:2: (iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1596:2: iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParamRealLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMEnumParamRealLiteral_in_entryRuleMEnumParamRealLiteral3685);
            iv_ruleMEnumParamRealLiteral=ruleMEnumParamRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParamRealLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMEnumParamRealLiteral3695); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMEnumParamRealLiteral"


    // $ANTLR start "ruleMEnumParamRealLiteral"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1603:1: ruleMEnumParamRealLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) ) ;
    public final EObject ruleMEnumParamRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1606:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1607:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1607:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1607:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1607:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1608:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1616:2: ( (lv_name_1_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1617:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1617:1: (lv_name_1_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1618:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMEnumParamRealLiteral3749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParamRealLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMEnumParamRealLiteral3766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1638:1: ( (lv_value_3_0= ruleREAL ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1639:1: (lv_value_3_0= ruleREAL )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1639:1: (lv_value_3_0= ruleREAL )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1640:3: lv_value_3_0= ruleREAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleREAL_in_ruleMEnumParamRealLiteral3787);
            lv_value_3_0=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMEnumParamRealLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
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
    // $ANTLR end "ruleMEnumParamRealLiteral"


    // $ANTLR start "entryRuleMEnumParamStringLiteral"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1664:1: entryRuleMEnumParamStringLiteral returns [EObject current=null] : iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF ;
    public final EObject entryRuleMEnumParamStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamStringLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1665:2: (iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1666:2: iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParamStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMEnumParamStringLiteral_in_entryRuleMEnumParamStringLiteral3823);
            iv_ruleMEnumParamStringLiteral=ruleMEnumParamStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParamStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMEnumParamStringLiteral3833); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMEnumParamStringLiteral"


    // $ANTLR start "ruleMEnumParamStringLiteral"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1673:1: ruleMEnumParamStringLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleMEnumParamStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1676:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1677:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1677:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1677:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1677:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1678:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1686:2: ( (lv_name_1_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1687:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1687:1: (lv_name_1_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1688:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMEnumParamStringLiteral3887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParamStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMEnumParamStringLiteral3904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1708:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1709:1: (lv_value_3_0= RULE_STRING )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1709:1: (lv_value_3_0= RULE_STRING )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1710:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMEnumParamStringLiteral3921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_3_0, grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParamStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
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
    // $ANTLR end "ruleMEnumParamStringLiteral"


    // $ANTLR start "entryRuleMBooleanParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1734:1: entryRuleMBooleanParameterSingleExpression returns [EObject current=null] : iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF ;
    public final EObject entryRuleMBooleanParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMBooleanParameterSingleExpression = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1735:2: (iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1736:2: iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMBooleanParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMBooleanParameterSingleExpression_in_entryRuleMBooleanParameterSingleExpression3962);
            iv_ruleMBooleanParameterSingleExpression=ruleMBooleanParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMBooleanParameterSingleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMBooleanParameterSingleExpression3972); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMBooleanParameterSingleExpression"


    // $ANTLR start "ruleMBooleanParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1743:1: ruleMBooleanParameterSingleExpression returns [EObject current=null] : ( () otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleMBooleanParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_defaultValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1746:28: ( ( () otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1747:1: ( () otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1747:1: ( () otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1747:2: () otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1747:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1748:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMBooleanParameterSingleExpressionAccess().getMBooleanParameterSingleExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMBooleanParameterSingleExpression4021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1760:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1761:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1761:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1762:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMBooleanParameterSingleExpression4038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMBooleanParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMBooleanParameterSingleExpression4055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1782:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1783:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1783:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1784:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMBooleanParameterSingleExpression4076);
            lv_defaultValue_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMBooleanParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_4_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMBooleanParameterSingleExpression4088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleMBooleanParameterSingleExpression"


    // $ANTLR start "entryRuleMStringParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1812:1: entryRuleMStringParameterSingleExpression returns [EObject current=null] : iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF ;
    public final EObject entryRuleMStringParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMStringParameterSingleExpression = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1813:2: (iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1814:2: iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMStringParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMStringParameterSingleExpression_in_entryRuleMStringParameterSingleExpression4124);
            iv_ruleMStringParameterSingleExpression=ruleMStringParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMStringParameterSingleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMStringParameterSingleExpression4134); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMStringParameterSingleExpression"


    // $ANTLR start "ruleMStringParameterSingleExpression"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1821:1: ruleMStringParameterSingleExpression returns [EObject current=null] : ( () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleMStringParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_defaultValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1824:28: ( ( () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1825:1: ( () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1825:1: ( () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1825:2: () otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1825:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1826:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMStringParameterSingleExpressionAccess().getMStringParameterSingleExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMStringParameterSingleExpression4183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1838:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1839:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1839:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1840:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMStringParameterSingleExpression4200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMStringParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMStringParameterSingleExpression4217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1860:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1861:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1861:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1862:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMStringParameterSingleExpression4238);
            lv_defaultValue_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMStringParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_4_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMStringParameterSingleExpression4250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleMStringParameterSingleExpression"


    // $ANTLR start "entryRuleEBoolean"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1890:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1891:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1892:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean4287);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean4298); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1899:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1902:28: ( (kw= 'true' | kw= 'false' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1903:1: (kw= 'true' | kw= 'false' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1903:1: (kw= 'true' | kw= 'false' )
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1904:2: kw= 'true'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEBoolean4336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1911:2: kw= 'false'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEBoolean4355); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1924:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1925:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1926:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_entryRuleINTEGER4396);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTEGER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleINTEGER4407); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1933:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1936:28: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1937:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1937:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==43) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_HEXADECIMAL) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1937:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1937:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1937:3: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1937:3: (kw= '-' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==43) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1938:2: kw= '-'
                            {
                            kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleINTEGER4447); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleINTEGER4464); if (state.failed) return current;
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1951:10: this_HEXADECIMAL_2= RULE_HEXADECIMAL
                    {
                    this_HEXADECIMAL_2=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_RULE_HEXADECIMAL_in_ruleINTEGER4491); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1966:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1967:2: (iv_ruleREAL= ruleREAL EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1968:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleREAL_in_entryRuleREAL4537);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleREAL4548); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1975:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1978:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1979:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1979:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1979:2: (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1979:2: (kw= '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1980:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleREAL4587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1985:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:1985:8: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleREAL4605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
                  
            }
            kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleREAL4623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleREAL4638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
                  
            }

            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2005:2: (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2006:2: kw= 'e' (kw= '-' )? this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleREAL4658); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0()); 
                          
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2011:1: (kw= '-' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==43) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2012:2: kw= '-'
                            {
                            kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleREAL4672); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleREAL4689); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMParameterValue"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2032:1: entryRuleMParameterValue returns [EObject current=null] : iv_ruleMParameterValue= ruleMParameterValue EOF ;
    public final EObject entryRuleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValue = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2033:2: (iv_ruleMParameterValue= ruleMParameterValue EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2034:2: iv_ruleMParameterValue= ruleMParameterValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValue_in_entryRuleMParameterValue4736);
            iv_ruleMParameterValue=ruleMParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValue4746); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2041:1: ruleMParameterValue returns [EObject current=null] : (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) ;
    public final EObject ruleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueLiteral_0 = null;

        EObject this_MParameterValueRefObject_1 = null;

        EObject this_MParameterValuePAR_2 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2044:28: ( (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2045:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2045:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEXADECIMAL:
            case 41:
            case 42:
            case 43:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                alt27=2;
                }
                break;
            case 16:
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2046:2: this_MParameterValueLiteral_0= ruleMParameterValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueLiteral_in_ruleMParameterValue4796);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2059:2: this_MParameterValueRefObject_1= ruleMParameterValueRefObject
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueRefObject_in_ruleMParameterValue4826);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2072:2: this_MParameterValuePAR_2= ruleMParameterValuePAR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValuePAR_in_ruleMParameterValue4856);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2091:1: entryRuleMParameterValueLiteral returns [EObject current=null] : iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF ;
    public final EObject entryRuleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2092:2: (iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2093:2: iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueLiteral_in_entryRuleMParameterValueLiteral4891);
            iv_ruleMParameterValueLiteral=ruleMParameterValueLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueLiteral4901); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2100:1: ruleMParameterValueLiteral returns [EObject current=null] : (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) ;
    public final EObject ruleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueBooleanLiteral_0 = null;

        EObject this_MParameterValueStringLiteral_1 = null;

        EObject this_MParameterValueIntegerLiteral_2 = null;

        EObject this_MParameterValueRealLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2103:28: ( (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2104:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2104:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 41:
            case 42:
                {
                alt28=1;
                }
                break;
            case RULE_STRING:
                {
                alt28=2;
                }
                break;
            case 43:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==RULE_INT) ) {
                    int LA28_4 = input.LA(3);

                    if ( (LA28_4==EOF||LA28_4==13||LA28_4==17||LA28_4==21||LA28_4==32||LA28_4==35||LA28_4==43||LA28_4==45||(LA28_4>=47 && LA28_4<=49)) ) {
                        alt28=3;
                    }
                    else if ( (LA28_4==15) ) {
                        alt28=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA28_4 = input.LA(2);

                if ( (LA28_4==EOF||LA28_4==13||LA28_4==17||LA28_4==21||LA28_4==32||LA28_4==35||LA28_4==43||LA28_4==45||(LA28_4>=47 && LA28_4<=49)) ) {
                    alt28=3;
                }
                else if ( (LA28_4==15) ) {
                    alt28=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEXADECIMAL:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2105:2: this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueBooleanLiteral_in_ruleMParameterValueLiteral4951);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2118:2: this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueStringLiteral_in_ruleMParameterValueLiteral4981);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2131:2: this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueIntegerLiteral_in_ruleMParameterValueLiteral5011);
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2144:2: this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueRealLiteral_in_ruleMParameterValueLiteral5041);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2163:1: entryRuleMParameterValueBooleanLiteral returns [EObject current=null] : iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF ;
    public final EObject entryRuleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueBooleanLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2164:2: (iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2165:2: iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueBooleanLiteral_in_entryRuleMParameterValueBooleanLiteral5076);
            iv_ruleMParameterValueBooleanLiteral=ruleMParameterValueBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueBooleanLiteral5086); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2172:1: ruleMParameterValueBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2175:28: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2176:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2176:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2176:2: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2176:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2177:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2185:2: ( (lv_value_1_0= ruleEBoolean ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2186:1: (lv_value_1_0= ruleEBoolean )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2186:1: (lv_value_1_0= ruleEBoolean )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2187:3: lv_value_1_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleMParameterValueBooleanLiteral5144);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2211:1: entryRuleMParameterValueStringLiteral returns [EObject current=null] : iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF ;
    public final EObject entryRuleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueStringLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2212:2: (iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2213:2: iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueStringLiteral_in_entryRuleMParameterValueStringLiteral5180);
            iv_ruleMParameterValueStringLiteral=ruleMParameterValueStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueStringLiteral5190); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2220:1: ruleMParameterValueStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2223:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2224:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2224:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2224:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2224:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2225:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2233:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2234:1: (lv_value_1_0= RULE_STRING )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2234:1: (lv_value_1_0= RULE_STRING )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2235:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMParameterValueStringLiteral5244); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2259:1: entryRuleMParameterValueIntegerLiteral returns [EObject current=null] : iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF ;
    public final EObject entryRuleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueIntegerLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2260:2: (iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2261:2: iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueIntegerLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueIntegerLiteral_in_entryRuleMParameterValueIntegerLiteral5285);
            iv_ruleMParameterValueIntegerLiteral=ruleMParameterValueIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueIntegerLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueIntegerLiteral5295); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2268:1: ruleMParameterValueIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2271:28: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2272:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2272:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2272:2: () ( (lv_value_1_0= ruleINTEGER ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2272:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2273:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2281:2: ( (lv_value_1_0= ruleINTEGER ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2282:1: (lv_value_1_0= ruleINTEGER )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2282:1: (lv_value_1_0= ruleINTEGER )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2283:3: lv_value_1_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleINTEGER_in_ruleMParameterValueIntegerLiteral5353);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2307:1: entryRuleMParameterValueRealLiteral returns [EObject current=null] : iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF ;
    public final EObject entryRuleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRealLiteral = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2308:2: (iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2309:2: iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueRealLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueRealLiteral_in_entryRuleMParameterValueRealLiteral5389);
            iv_ruleMParameterValueRealLiteral=ruleMParameterValueRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueRealLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueRealLiteral5399); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2316:1: ruleMParameterValueRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ) ;
    public final EObject ruleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2319:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2320:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2320:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2320:2: () ( (lv_value_1_0= ruleREAL ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2320:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2321:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2329:2: ( (lv_value_1_0= ruleREAL ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2330:1: (lv_value_1_0= ruleREAL )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2330:1: (lv_value_1_0= ruleREAL )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2331:3: lv_value_1_0= ruleREAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleREAL_in_ruleMParameterValueRealLiteral5457);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2355:1: entryRuleMParameterValueRefObject returns [EObject current=null] : iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF ;
    public final EObject entryRuleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRefObject = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2356:2: (iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2357:2: iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueRefObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueRefObject_in_entryRuleMParameterValueRefObject5493);
            iv_ruleMParameterValueRefObject=ruleMParameterValueRefObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueRefObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueRefObject5503); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2364:1: ruleMParameterValueRefObject returns [EObject current=null] : ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) ;
    public final EObject ruleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2367:28: ( ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2368:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2368:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2368:2: () ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2368:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2369:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2377:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2378:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2378:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2379:3: ruleVersionedQualifiedReferenceName
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
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMParameterValueRefObject5567);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2403:1: entryRuleMParameterValuePAR returns [EObject current=null] : iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF ;
    public final EObject entryRuleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValuePAR = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2404:2: (iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2405:2: iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValuePARRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValuePAR_in_entryRuleMParameterValuePAR5603);
            iv_ruleMParameterValuePAR=ruleMParameterValuePAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValuePAR; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValuePAR5613); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2412:1: ruleMParameterValuePAR returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2415:28: ( (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2416:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2416:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2416:3: otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMParameterValuePAR5650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2420:1: ( (lv_value_1_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2421:1: (lv_value_1_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2421:1: (lv_value_1_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2422:3: lv_value_1_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValuePAR5671);
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

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMParameterValuePAR5683); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2450:1: entryRuleMParameterValueExpression returns [EObject current=null] : iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF ;
    public final EObject entryRuleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueExpression = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2451:2: (iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2452:2: iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_entryRuleMParameterValueExpression5719);
            iv_ruleMParameterValueExpression=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueExpression5729); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2459:1: ruleMParameterValueExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) ;
    public final EObject ruleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2462:28: ( ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2463:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2463:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2463:2: () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2463:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2464:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2472:2: ( (lv_left_1_0= ruleMParameterValueTERM ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2473:1: (lv_left_1_0= ruleMParameterValueTERM )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2473:1: (lv_left_1_0= ruleMParameterValueTERM )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2474:3: lv_left_1_0= ruleMParameterValueTERM
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueTERM_in_ruleMParameterValueExpression5787);
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2490:2: ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43||LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2490:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2490:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2491:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2491:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2492:3: lv_operation_2_0= ruleMParameterValueExpressionOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpressionOperators_in_ruleMParameterValueExpression5809);
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

                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2508:2: ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2509:1: (lv_right_3_0= ruleMParameterValueExpression )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2509:1: (lv_right_3_0= ruleMParameterValueExpression )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2510:3: lv_right_3_0= ruleMParameterValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValueExpression5830);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2534:1: entryRuleMParameterValueTERM returns [EObject current=null] : iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF ;
    public final EObject entryRuleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueTERM = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2535:2: (iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2536:2: iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueTERMRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueTERM_in_entryRuleMParameterValueTERM5868);
            iv_ruleMParameterValueTERM=ruleMParameterValueTERM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueTERM; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterValueTERM5878); if (state.failed) return current;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2543:1: ruleMParameterValueTERM returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) ;
    public final EObject ruleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2546:28: ( ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2547:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2547:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2547:2: () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2547:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2548:2: 
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2556:2: ( (lv_left_1_0= ruleMParameterValue ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2557:1: (lv_left_1_0= ruleMParameterValue )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2557:1: (lv_left_1_0= ruleMParameterValue )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2558:3: lv_left_1_0= ruleMParameterValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValue_in_ruleMParameterValueTERM5936);
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2574:2: ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=48 && LA30_0<=49)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2574:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2574:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2575:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2575:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2576:3: lv_operation_2_0= ruleMParameterValueTERMOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueTERMOperators_in_ruleMParameterValueTERM5958);
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

                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2592:2: ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2593:1: (lv_right_3_0= ruleMParameterValueTERM )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2593:1: (lv_right_3_0= ruleMParameterValueTERM )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2594:3: lv_right_3_0= ruleMParameterValueTERM
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterValueTERM_in_ruleMParameterValueTERM5979);
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


    // $ANTLR start "entryRuleMParameterRange"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2618:1: entryRuleMParameterRange returns [EObject current=null] : iv_ruleMParameterRange= ruleMParameterRange EOF ;
    public final EObject entryRuleMParameterRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterRange = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2619:2: (iv_ruleMParameterRange= ruleMParameterRange EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2620:2: iv_ruleMParameterRange= ruleMParameterRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterRange_in_entryRuleMParameterRange6017);
            iv_ruleMParameterRange=ruleMParameterRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterRange; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterRange6027); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMParameterRange"


    // $ANTLR start "ruleMParameterRange"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2627:1: ruleMParameterRange returns [EObject current=null] : (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR ) ;
    public final EObject ruleMParameterRange() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterOCR_0 = null;

        EObject this_MParameterOOR_1 = null;

        EObject this_MParameterCOR_2 = null;

        EObject this_MParameterCCR_3 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2630:28: ( (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2631:1: (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2631:1: (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR )
            int alt31=4;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred42_InternalOSSWI()) ) {
                    alt31=1;
                }
                else if ( (synpred43_InternalOSSWI()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA31_0==46) ) {
                int LA31_2 = input.LA(2);

                if ( (synpred44_InternalOSSWI()) ) {
                    alt31=3;
                }
                else if ( (true) ) {
                    alt31=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2632:2: this_MParameterOCR_0= ruleMParameterOCR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterOCR_in_ruleMParameterRange6077);
                    this_MParameterOCR_0=ruleMParameterOCR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterOCR_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2645:2: this_MParameterOOR_1= ruleMParameterOOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterOOR_in_ruleMParameterRange6107);
                    this_MParameterOOR_1=ruleMParameterOOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterOOR_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2658:2: this_MParameterCOR_2= ruleMParameterCOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterCOR_in_ruleMParameterRange6137);
                    this_MParameterCOR_2=ruleMParameterCOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterCOR_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2671:2: this_MParameterCCR_3= ruleMParameterCCR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterCCRParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMParameterCCR_in_ruleMParameterRange6167);
                    this_MParameterCCR_3=ruleMParameterCCR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MParameterCCR_3; 
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
    // $ANTLR end "ruleMParameterRange"


    // $ANTLR start "entryRuleMParameterOCR"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2690:1: entryRuleMParameterOCR returns [EObject current=null] : iv_ruleMParameterOCR= ruleMParameterOCR EOF ;
    public final EObject entryRuleMParameterOCR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterOCR = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2691:2: (iv_ruleMParameterOCR= ruleMParameterOCR EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2692:2: iv_ruleMParameterOCR= ruleMParameterOCR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterOCRRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterOCR_in_entryRuleMParameterOCR6202);
            iv_ruleMParameterOCR=ruleMParameterOCR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterOCR; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterOCR6212); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMParameterOCR"


    // $ANTLR start "ruleMParameterOCR"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2699:1: ruleMParameterOCR returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) ;
    public final EObject ruleMParameterOCR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2702:28: ( ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2703:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2703:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2703:2: () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2703:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2704:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMParameterOCR6261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2716:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2717:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2717:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2718:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterOCR6282);
            lv_lowerValue_2_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterOCRRule());
              	        }
                     		set(
                     			current, 
                     			"lowerValue",
                      		lv_lowerValue_2_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMParameterOCR6294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterOCRAccess().getCommaKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2738:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2739:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2739:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2740:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterOCR6315);
            lv_upperValue_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterOCRRule());
              	        }
                     		set(
                     			current, 
                     			"upperValue",
                      		lv_upperValue_4_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMParameterOCR6327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMParameterOCRAccess().getRightSquareBracketKeyword_5());
                  
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
    // $ANTLR end "ruleMParameterOCR"


    // $ANTLR start "entryRuleMParameterOOR"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2768:1: entryRuleMParameterOOR returns [EObject current=null] : iv_ruleMParameterOOR= ruleMParameterOOR EOF ;
    public final EObject entryRuleMParameterOOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterOOR = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2769:2: (iv_ruleMParameterOOR= ruleMParameterOOR EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2770:2: iv_ruleMParameterOOR= ruleMParameterOOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterOORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterOOR_in_entryRuleMParameterOOR6363);
            iv_ruleMParameterOOR=ruleMParameterOOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterOOR; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterOOR6373); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMParameterOOR"


    // $ANTLR start "ruleMParameterOOR"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2777:1: ruleMParameterOOR returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMParameterOOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2780:28: ( ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2781:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2781:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2781:2: () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2781:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2782:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterOORAccess().getMParameterOORAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMParameterOOR6422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2794:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2795:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2795:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2796:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterOOR6443);
            lv_lowerValue_2_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterOORRule());
              	        }
                     		set(
                     			current, 
                     			"lowerValue",
                      		lv_lowerValue_2_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMParameterOOR6455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterOORAccess().getCommaKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2816:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2817:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2817:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2818:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterOOR6476);
            lv_upperValue_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterOORRule());
              	        }
                     		set(
                     			current, 
                     			"upperValue",
                      		lv_upperValue_4_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMParameterOOR6488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMParameterOORAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleMParameterOOR"


    // $ANTLR start "entryRuleMParameterCOR"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2846:1: entryRuleMParameterCOR returns [EObject current=null] : iv_ruleMParameterCOR= ruleMParameterCOR EOF ;
    public final EObject entryRuleMParameterCOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterCOR = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2847:2: (iv_ruleMParameterCOR= ruleMParameterCOR EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2848:2: iv_ruleMParameterCOR= ruleMParameterCOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterCORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterCOR_in_entryRuleMParameterCOR6524);
            iv_ruleMParameterCOR=ruleMParameterCOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterCOR; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterCOR6534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMParameterCOR"


    // $ANTLR start "ruleMParameterCOR"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2855:1: ruleMParameterCOR returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMParameterCOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2858:28: ( ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2859:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2859:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2859:2: () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2859:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2860:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterCORAccess().getMParameterCORAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleMParameterCOR6583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2872:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2873:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2873:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2874:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterCOR6604);
            lv_lowerValue_2_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterCORRule());
              	        }
                     		set(
                     			current, 
                     			"lowerValue",
                      		lv_lowerValue_2_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMParameterCOR6616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterCORAccess().getCommaKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2894:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2895:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2895:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2896:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterCOR6637);
            lv_upperValue_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterCORRule());
              	        }
                     		set(
                     			current, 
                     			"upperValue",
                      		lv_upperValue_4_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMParameterCOR6649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMParameterCORAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleMParameterCOR"


    // $ANTLR start "entryRuleMParameterCCR"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2924:1: entryRuleMParameterCCR returns [EObject current=null] : iv_ruleMParameterCCR= ruleMParameterCCR EOF ;
    public final EObject entryRuleMParameterCCR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterCCR = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2925:2: (iv_ruleMParameterCCR= ruleMParameterCCR EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2926:2: iv_ruleMParameterCCR= ruleMParameterCCR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterCCRRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterCCR_in_entryRuleMParameterCCR6685);
            iv_ruleMParameterCCR=ruleMParameterCCR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterCCR; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMParameterCCR6695); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMParameterCCR"


    // $ANTLR start "ruleMParameterCCR"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2933:1: ruleMParameterCCR returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) ;
    public final EObject ruleMParameterCCR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2936:28: ( ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2937:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2937:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2937:2: () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']'
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2937:2: ()
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2938:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleMParameterCCR6744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2950:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2951:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2951:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2952:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterCCR6765);
            lv_lowerValue_2_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterCCRRule());
              	        }
                     		set(
                     			current, 
                     			"lowerValue",
                      		lv_lowerValue_2_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMParameterCCR6777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterCCRAccess().getCommaKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2972:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2973:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2973:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2974:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMParameterValueExpression_in_ruleMParameterCCR6798);
            lv_upperValue_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterCCRRule());
              	        }
                     		set(
                     			current, 
                     			"upperValue",
                      		lv_upperValue_4_0, 
                      		"MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMParameterCCR6810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5());
                  
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
    // $ANTLR end "ruleMParameterCCR"


    // $ANTLR start "ruleMParameterValueExpressionOperators"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3002:1: ruleMParameterValueExpressionOperators returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleMParameterValueExpressionOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3004:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3005:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3005:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            else if ( (LA32_0==43) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3005:2: (enumLiteral_0= '+' )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3005:2: (enumLiteral_0= '+' )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3005:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMParameterValueExpressionOperators6860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3011:6: (enumLiteral_1= '-' )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3011:6: (enumLiteral_1= '-' )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3011:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMParameterValueExpressionOperators6877); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3021:1: ruleMParameterValueTERMOperators returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMParameterValueTERMOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3023:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3024:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3024:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            else if ( (LA33_0==49) ) {
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3024:2: (enumLiteral_0= '*' )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3024:2: (enumLiteral_0= '*' )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3024:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMParameterValueTERMOperators6922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3030:6: (enumLiteral_1= '/' )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3030:6: (enumLiteral_1= '/' )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:3030:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMParameterValueTERMOperators6939); if (state.failed) return current;
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

    // $ANTLR start synpred12_InternalOSSWI
    public final void synpred12_InternalOSSWI_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:527:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:528:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalOSSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:528:111: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:529:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:532:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:532:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalOSSWI", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:532:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:532:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred12_InternalOSSWI1309); if (state.failed) return ;
        otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_synpred12_InternalOSSWI1321); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:540:1: ( (lv_version_10_0= ruleVersion ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:541:1: (lv_version_10_0= ruleVersion )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:541:1: (lv_version_10_0= ruleVersion )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:542:3: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersion_in_synpred12_InternalOSSWI1342);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred12_InternalOSSWI1354); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalOSSWI

    // $ANTLR start synpred13_InternalOSSWI
    public final void synpred13_InternalOSSWI_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:569:4: ( ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:570:5: {...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:570:111: ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:571:6: ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:574:6: ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:574:7: {...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWI", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:574:16: (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:574:18: otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred13_InternalOSSWI1422); if (state.failed) return ;
        otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_synpred13_InternalOSSWI1434); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:582:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:583:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:583:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:584:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred13_InternalOSSWI1461);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred13_InternalOSSWI1473); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalOSSWI

    // $ANTLR start synpred15_InternalOSSWI
    public final void synpred15_InternalOSSWI_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_providedResources_19_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:611:4: ( ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:612:5: {...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalOSSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:612:111: ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:613:6: ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:616:6: ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:616:7: {...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalOSSWI", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:616:16: (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:616:18: otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';'
        {
        otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_26_in_synpred15_InternalOSSWI1541); if (state.failed) return ;
        otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_27_in_synpred15_InternalOSSWI1553); if (state.failed) return ;
        otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred15_InternalOSSWI1565); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:628:1: ( (lv_providedResources_19_0= ruleMProvidedResource ) )+
        int cnt37=0;
        loop37:
        do {
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29||LA37_0==33) ) {
                alt37=1;
            }


            switch (alt37) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:629:1: (lv_providedResources_19_0= ruleMProvidedResource )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:629:1: (lv_providedResources_19_0= ruleMProvidedResource )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:630:3: lv_providedResources_19_0= ruleMProvidedResource
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleMProvidedResource_in_synpred15_InternalOSSWI1586);
        	    lv_providedResources_19_0=ruleMProvidedResource();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt37 >= 1 ) break loop37;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(37, input);
                    throw eee;
            }
            cnt37++;
        } while (true);

        otherlv_20=(Token)match(input,28,FollowSets000.FOLLOW_28_in_synpred15_InternalOSSWI1599); if (state.failed) return ;
        otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred15_InternalOSSWI1611); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalOSSWI

    // $ANTLR start synpred42_InternalOSSWI
    public final void synpred42_InternalOSSWI_fragment() throws RecognitionException {   
        EObject this_MParameterOCR_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2632:2: (this_MParameterOCR_0= ruleMParameterOCR )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2632:2: this_MParameterOCR_0= ruleMParameterOCR
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleMParameterOCR_in_synpred42_InternalOSSWI6077);
        this_MParameterOCR_0=ruleMParameterOCR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalOSSWI

    // $ANTLR start synpred43_InternalOSSWI
    public final void synpred43_InternalOSSWI_fragment() throws RecognitionException {   
        EObject this_MParameterOOR_1 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2645:2: (this_MParameterOOR_1= ruleMParameterOOR )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2645:2: this_MParameterOOR_1= ruleMParameterOOR
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleMParameterOOR_in_synpred43_InternalOSSWI6107);
        this_MParameterOOR_1=ruleMParameterOOR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalOSSWI

    // $ANTLR start synpred44_InternalOSSWI
    public final void synpred44_InternalOSSWI_fragment() throws RecognitionException {   
        EObject this_MParameterCOR_2 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2658:2: (this_MParameterCOR_2= ruleMParameterCOR )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswi/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWI.g:2658:2: this_MParameterCOR_2= ruleMParameterCOR
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleMParameterCOR_in_synpred44_InternalOSSWI6137);
        this_MParameterCOR_2=ruleMParameterCOR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalOSSWI

    // Delegated rules

    public final boolean synpred44_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalOSSWI_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleMMESPOSSWIPackageFile_in_entryRuleMMESPOSSWIPackageFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPOSSWIPackageFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleMMESPOSSWIPackageFile128 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMESPOSSWIPackageFile155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPOSSWIPackageFile167 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleMMESPOSSWIPackageFile180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMESPOSSWIPackageFile207 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPOSSWIPackageFile219 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_ruleMMESPOSSWIPackageElement_in_ruleMMESPOSSWIPackageFile242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPOSSWIPackageElement_in_entryRuleMMESPOSSWIPackageElement278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPOSSWIPackageElement288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMOSSwInterface_in_ruleMMESPOSSWIPackageElement337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName423 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleQualifiedName442 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName457 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion557 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion585 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion607 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleVersion628 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion644 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion672 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion694 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVersionedQualifiedName802 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleVersionedQualifiedName820 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleVersionedQualifiedName842 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleVersionedQualifiedName860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleVersionedQualifiedReferenceName960 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleVersionedQualifiedReferenceName978 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName995 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleVersionedQualifiedReferenceName1014 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName1029 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleMOSSwInterface_in_entryRuleMOSSwInterface1082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMOSSwInterface1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleMOSSwInterface1133 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMOSSwInterface1150 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_20_in_ruleMOSSwInterface1168 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwInterface1195 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleMOSSwInterface1208 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwInterface1235 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_ruleMOSSwInterface1251 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_23_in_ruleMOSSwInterface1309 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMOSSwInterface1321 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleMOSSwInterface1342 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMOSSwInterface1354 = new BitSet(new long[]{0x0000000016800000L});
        public static final BitSet FOLLOW_25_in_ruleMOSSwInterface1422 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMOSSwInterface1434 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwInterface1461 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMOSSwInterface1473 = new BitSet(new long[]{0x0000000016800000L});
        public static final BitSet FOLLOW_26_in_ruleMOSSwInterface1541 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMOSSwInterface1553 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMOSSwInterface1565 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_ruleMProvidedResource_in_ruleMOSSwInterface1586 = new BitSet(new long[]{0x0000000230000000L});
        public static final BitSet FOLLOW_28_in_ruleMOSSwInterface1599 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMOSSwInterface1611 = new BitSet(new long[]{0x0000000016800000L});
        public static final BitSet FOLLOW_28_in_ruleMOSSwInterface1670 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMOSSwInterface1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMProvidedResource_in_entryRuleMProvidedResource1722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMProvidedResource1732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMQuantifiableResource_in_ruleMProvidedResource1782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMInstantiableResource_in_ruleMProvidedResource1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMQuantifiableResource_in_entryRuleMQuantifiableResource1847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMQuantifiableResource1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleMQuantifiableResource1894 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMQuantifiableResource1906 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMQuantifiableResource1923 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMQuantifiableResource1940 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMQuantifiableResource1961 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMQuantifiableResource1973 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMQuantifiableResource1994 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMQuantifiableResource2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMInstantiableResource_in_entryRuleMInstantiableResource2042 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMInstantiableResource2052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleMInstantiableResource2089 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMInstantiableResource2101 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMInstantiableResource2118 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMInstantiableResource2135 = new BitSet(new long[]{0x000001B410000000L});
        public static final BitSet FOLLOW_ruleMParameter_in_ruleMInstantiableResource2156 = new BitSet(new long[]{0x000001B410000000L});
        public static final BitSet FOLLOW_28_in_ruleMInstantiableResource2169 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMInstantiableResource2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameter_in_entryRuleMParameter2217 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameter2227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMIntegerParameterSingleExpression_in_ruleMParameter2277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParameterSingleExpression_in_ruleMParameter2307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMBooleanParameterSingleExpression_in_ruleMParameter2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMRealParameterSingleExpression_in_ruleMParameter2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMStringParameterSingleExpression_in_ruleMParameter2397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParameterDefinition_in_ruleMParameter2427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMIntegerParameterSingleExpression_in_entryRuleMIntegerParameterSingleExpression2462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMIntegerParameterSingleExpression2472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleMIntegerParameterSingleExpression2521 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMIntegerParameterSingleExpression2538 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMIntegerParameterSingleExpression2555 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMIntegerParameterSingleExpression2576 = new BitSet(new long[]{0x0000000800002000L});
        public static final BitSet FOLLOW_35_in_ruleMIntegerParameterSingleExpression2589 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_ruleMParameterRange_in_ruleMIntegerParameterSingleExpression2610 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMIntegerParameterSingleExpression2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParameterDefinition_in_entryRuleMEnumParameterDefinition2660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMEnumParameterDefinition2670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleMEnumParameterDefinition2719 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMEnumParameterDefinition2736 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMEnumParameterDefinition2753 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMEnumParameterLiteralRule_in_ruleMEnumParameterDefinition2774 = new BitSet(new long[]{0x0000000010200000L});
        public static final BitSet FOLLOW_21_in_ruleMEnumParameterDefinition2787 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMEnumParameterLiteralRule_in_ruleMEnumParameterDefinition2808 = new BitSet(new long[]{0x0000000010200000L});
        public static final BitSet FOLLOW_28_in_ruleMEnumParameterDefinition2822 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMEnumParameterDefinition2834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParameterSingleExpression_in_entryRuleMEnumParameterSingleExpression2870 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMEnumParameterSingleExpression2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleMEnumParameterSingleExpression2929 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMEnumParameterSingleExpression2956 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMEnumParameterSingleExpression2973 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMEnumParameterSingleExpression2990 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMEnumParameterSingleExpression3011 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMEnumParameterSingleExpression3023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMRealParameterSingleExpression_in_entryRuleMRealParameterSingleExpression3059 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMRealParameterSingleExpression3069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleMRealParameterSingleExpression3118 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMRealParameterSingleExpression3135 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMRealParameterSingleExpression3152 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMRealParameterSingleExpression3173 = new BitSet(new long[]{0x0000000800002000L});
        public static final BitSet FOLLOW_35_in_ruleMRealParameterSingleExpression3186 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_ruleMParameterRange_in_ruleMRealParameterSingleExpression3207 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMRealParameterSingleExpression3221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParameterLiteralRule_in_entryRuleMEnumParameterLiteralRule3257 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMEnumParameterLiteralRule3267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParameterLiteral_in_ruleMEnumParameterLiteralRule3317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParamIntegerLiteral_in_ruleMEnumParameterLiteralRule3347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParamRealLiteral_in_ruleMEnumParameterLiteralRule3377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParamStringLiteral_in_ruleMEnumParameterLiteralRule3407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParameterLiteral_in_entryRuleMEnumParameterLiteral3442 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMEnumParameterLiteral3452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMEnumParameterLiteral3506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParamIntegerLiteral_in_entryRuleMEnumParamIntegerLiteral3547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMEnumParamIntegerLiteral3557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMEnumParamIntegerLiteral3611 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleMEnumParamIntegerLiteral3628 = new BitSet(new long[]{0x00000800000000A0L});
        public static final BitSet FOLLOW_ruleINTEGER_in_ruleMEnumParamIntegerLiteral3649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParamRealLiteral_in_entryRuleMEnumParamRealLiteral3685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMEnumParamRealLiteral3695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMEnumParamRealLiteral3749 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleMEnumParamRealLiteral3766 = new BitSet(new long[]{0x00000E00000000E0L});
        public static final BitSet FOLLOW_ruleREAL_in_ruleMEnumParamRealLiteral3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMEnumParamStringLiteral_in_entryRuleMEnumParamStringLiteral3823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMEnumParamStringLiteral3833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMEnumParamStringLiteral3887 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleMEnumParamStringLiteral3904 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMEnumParamStringLiteral3921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMBooleanParameterSingleExpression_in_entryRuleMBooleanParameterSingleExpression3962 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMBooleanParameterSingleExpression3972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMBooleanParameterSingleExpression4021 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMBooleanParameterSingleExpression4038 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMBooleanParameterSingleExpression4055 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMBooleanParameterSingleExpression4076 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMBooleanParameterSingleExpression4088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMStringParameterSingleExpression_in_entryRuleMStringParameterSingleExpression4124 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMStringParameterSingleExpression4134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleMStringParameterSingleExpression4183 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMStringParameterSingleExpression4200 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMStringParameterSingleExpression4217 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMStringParameterSingleExpression4238 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMStringParameterSingleExpression4250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean4287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean4298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEBoolean4336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEBoolean4355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTEGER_in_entryRuleINTEGER4396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER4407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleINTEGER4447 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleINTEGER4464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HEXADECIMAL_in_ruleINTEGER4491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL4537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleREAL4548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleREAL4587 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleREAL4605 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleREAL4623 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleREAL4638 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleREAL4658 = new BitSet(new long[]{0x0000080000000020L});
        public static final BitSet FOLLOW_43_in_ruleREAL4672 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleREAL4689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValue_in_entryRuleMParameterValue4736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValue4746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueLiteral_in_ruleMParameterValue4796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueRefObject_in_ruleMParameterValue4826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValuePAR_in_ruleMParameterValue4856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueLiteral_in_entryRuleMParameterValueLiteral4891 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueLiteral4901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueBooleanLiteral_in_ruleMParameterValueLiteral4951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueStringLiteral_in_ruleMParameterValueLiteral4981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueIntegerLiteral_in_ruleMParameterValueLiteral5011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueRealLiteral_in_ruleMParameterValueLiteral5041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueBooleanLiteral_in_entryRuleMParameterValueBooleanLiteral5076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueBooleanLiteral5086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleMParameterValueBooleanLiteral5144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueStringLiteral_in_entryRuleMParameterValueStringLiteral5180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueStringLiteral5190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMParameterValueStringLiteral5244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueIntegerLiteral_in_entryRuleMParameterValueIntegerLiteral5285 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueIntegerLiteral5295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTEGER_in_ruleMParameterValueIntegerLiteral5353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueRealLiteral_in_entryRuleMParameterValueRealLiteral5389 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueRealLiteral5399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleREAL_in_ruleMParameterValueRealLiteral5457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueRefObject_in_entryRuleMParameterValueRefObject5493 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueRefObject5503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMParameterValueRefObject5567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValuePAR_in_entryRuleMParameterValuePAR5603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValuePAR5613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleMParameterValuePAR5650 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValuePAR5671 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMParameterValuePAR5683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_entryRuleMParameterValueExpression5719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueExpression5729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueTERM_in_ruleMParameterValueExpression5787 = new BitSet(new long[]{0x0000880000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueExpressionOperators_in_ruleMParameterValueExpression5809 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterValueExpression5830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueTERM_in_entryRuleMParameterValueTERM5868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterValueTERM5878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValue_in_ruleMParameterValueTERM5936 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_ruleMParameterValueTERMOperators_in_ruleMParameterValueTERM5958 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueTERM_in_ruleMParameterValueTERM5979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterRange_in_entryRuleMParameterRange6017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterRange6027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterOCR_in_ruleMParameterRange6077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterOOR_in_ruleMParameterRange6107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterCOR_in_ruleMParameterRange6137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterCCR_in_ruleMParameterRange6167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterOCR_in_entryRuleMParameterOCR6202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterOCR6212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleMParameterOCR6261 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterOCR6282 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMParameterOCR6294 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterOCR6315 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleMParameterOCR6327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterOOR_in_entryRuleMParameterOOR6363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterOOR6373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleMParameterOOR6422 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterOOR6443 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMParameterOOR6455 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterOOR6476 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMParameterOOR6488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterCOR_in_entryRuleMParameterCOR6524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterCOR6534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleMParameterCOR6583 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterCOR6604 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMParameterCOR6616 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterCOR6637 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMParameterCOR6649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterCCR_in_entryRuleMParameterCCR6685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMParameterCCR6695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleMParameterCCR6744 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterCCR6765 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMParameterCCR6777 = new BitSet(new long[]{0x00000E00000100F0L});
        public static final BitSet FOLLOW_ruleMParameterValueExpression_in_ruleMParameterCCR6798 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleMParameterCCR6810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleMParameterValueExpressionOperators6860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleMParameterValueExpressionOperators6877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleMParameterValueTERMOperators6922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleMParameterValueTERMOperators6939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_synpred12_InternalOSSWI1309 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred12_InternalOSSWI1321 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_synpred12_InternalOSSWI1342 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred12_InternalOSSWI1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_synpred13_InternalOSSWI1422 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred13_InternalOSSWI1434 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred13_InternalOSSWI1461 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred13_InternalOSSWI1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_synpred15_InternalOSSWI1541 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_synpred15_InternalOSSWI1553 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_synpred15_InternalOSSWI1565 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_ruleMProvidedResource_in_synpred15_InternalOSSWI1586 = new BitSet(new long[]{0x0000000230000000L});
        public static final BitSet FOLLOW_28_in_synpred15_InternalOSSWI1599 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_synpred15_InternalOSSWI1611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterOCR_in_synpred42_InternalOSSWI6077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterOOR_in_synpred43_InternalOSSWI6107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMParameterCOR_in_synpred44_InternalOSSWI6137 = new BitSet(new long[]{0x0000000000000002L});
    }


}