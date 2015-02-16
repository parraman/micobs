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
package es.uah.aut.srg.micobs.lang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.lang.services.LANGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLANGParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'language'", "'extends'", "','", "'{'", "'version'", "':='", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLANGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLANGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLANGParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private LANGGrammarAccess grammarAccess;
     	
        public InternalLANGParser(TokenStream input, LANGGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MSYSTEMPackageFile";	
       	}
       	
       	@Override
       	protected LANGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMSYSTEMPackageFile"
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:73:1: entryRuleMSYSTEMPackageFile returns [EObject current=null] : iv_ruleMSYSTEMPackageFile= ruleMSYSTEMPackageFile EOF ;
    public final EObject entryRuleMSYSTEMPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMSYSTEMPackageFile = null;


        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:74:2: (iv_ruleMSYSTEMPackageFile= ruleMSYSTEMPackageFile EOF )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:75:2: iv_ruleMSYSTEMPackageFile= ruleMSYSTEMPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMSYSTEMPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMSYSTEMPackageFile_in_entryRuleMSYSTEMPackageFile81);
            iv_ruleMSYSTEMPackageFile=ruleMSYSTEMPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMSYSTEMPackageFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMSYSTEMPackageFile91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMSYSTEMPackageFile"


    // $ANTLR start "ruleMSYSTEMPackageFile"
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:82:1: ruleMSYSTEMPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMSYSTEMPackageElement ) ) ) ;
    public final EObject ruleMSYSTEMPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:85:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMSYSTEMPackageElement ) ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:86:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMSYSTEMPackageElement ) ) )
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:86:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMSYSTEMPackageElement ) ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:86:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMSYSTEMPackageElement ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMSYSTEMPackageFile128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMSYSTEMPackageFileAccess().getPackageKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:90:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:91:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:91:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:92:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMSYSTEMPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMSYSTEMPackageFileAccess().getPackageMSystemPackageCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMSYSTEMPackageFile155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMSYSTEMPackageFile167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMSYSTEMPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:112:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:112:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMSYSTEMPackageFile180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMSYSTEMPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:116:1: ( ( ruleQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:117:1: ( ruleQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:117:1: ( ruleQualifiedName )
            	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:118:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMSYSTEMPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMSYSTEMPackageFileAccess().getImportsMSystemPackageCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMSYSTEMPackageFile207);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMSYSTEMPackageFile219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMSYSTEMPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:138:3: ( (lv_element_6_0= ruleMSYSTEMPackageElement ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:139:1: (lv_element_6_0= ruleMSYSTEMPackageElement )
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:139:1: (lv_element_6_0= ruleMSYSTEMPackageElement )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:140:3: lv_element_6_0= ruleMSYSTEMPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMSYSTEMPackageFileAccess().getElementMSYSTEMPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMSYSTEMPackageElement_in_ruleMSYSTEMPackageFile242);
            lv_element_6_0=ruleMSYSTEMPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMSYSTEMPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"MSYSTEMPackageElement");
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
    // $ANTLR end "ruleMSYSTEMPackageFile"


    // $ANTLR start "entryRuleMSYSTEMPackageElement"
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:164:1: entryRuleMSYSTEMPackageElement returns [EObject current=null] : iv_ruleMSYSTEMPackageElement= ruleMSYSTEMPackageElement EOF ;
    public final EObject entryRuleMSYSTEMPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMSYSTEMPackageElement = null;


        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:165:2: (iv_ruleMSYSTEMPackageElement= ruleMSYSTEMPackageElement EOF )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:166:2: iv_ruleMSYSTEMPackageElement= ruleMSYSTEMPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMSYSTEMPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMSYSTEMPackageElement_in_entryRuleMSYSTEMPackageElement278);
            iv_ruleMSYSTEMPackageElement=ruleMSYSTEMPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMSYSTEMPackageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMSYSTEMPackageElement288); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMSYSTEMPackageElement"


    // $ANTLR start "ruleMSYSTEMPackageElement"
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:173:1: ruleMSYSTEMPackageElement returns [EObject current=null] : this_MLanguage_0= ruleMLanguage ;
    public final EObject ruleMSYSTEMPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MLanguage_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:176:28: (this_MLanguage_0= ruleMLanguage )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:178:2: this_MLanguage_0= ruleMLanguage
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMSYSTEMPackageElementAccess().getMLanguageParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMLanguage_in_ruleMSYSTEMPackageElement337);
            this_MLanguage_0=ruleMLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MLanguage_0; 
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
    // $ANTLR end "ruleMSYSTEMPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:197:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:198:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:199:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:206:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:209:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:210:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:210:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:210:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:217:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:218:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQualifiedName442); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:238:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:239:2: (iv_ruleVersion= ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:240:2: iv_ruleVersion= ruleVersion EOF
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
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:247:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:250:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:251:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:251:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:251:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:251:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==12||LA4_1==14||LA4_1==16) ) {
                    alt4=1;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    alt4=2;
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
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:251:7: this_INT_0= RULE_INT
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
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:259:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:259:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:259:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:259:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:259:12: this_INT_1= RULE_INT
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

            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:273:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:274:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVersion628); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:279:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_INT) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (LA6_1==RULE_ID) ) {
            	            alt6=2;
            	        }
            	        else if ( (LA6_1==EOF||LA6_1==12||LA6_1==14||LA6_1==16) ) {
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
            	            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:279:6: this_INT_4= RULE_INT
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
            	            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:287:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:287:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:287:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:287:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:287:12: this_INT_5= RULE_INT
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
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:309:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:310:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:311:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:318:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:321:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:322:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:322:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:323:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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
            kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVersionedQualifiedName820); if (state.failed) return current;
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
            kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleVersionedQualifiedName860); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMLanguage"
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:364:1: entryRuleMLanguage returns [EObject current=null] : iv_ruleMLanguage= ruleMLanguage EOF ;
    public final EObject entryRuleMLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLanguage = null;


        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:365:2: (iv_ruleMLanguage= ruleMLanguage EOF )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:366:2: iv_ruleMLanguage= ruleMLanguage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMLanguage_in_entryRuleMLanguage900);
            iv_ruleMLanguage=ruleMLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMLanguage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMLanguage910); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMLanguage"


    // $ANTLR start "ruleMLanguage"
    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:373:1: ruleMLanguage returns [EObject current=null] : (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleMLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_version_9_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:376:28: ( (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= '}' otherlv_12= ';' ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:377:1: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= '}' otherlv_12= ';' )
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:377:1: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= '}' otherlv_12= ';' )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:377:3: otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMLanguage947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMLanguageAccess().getLanguageKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:381:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:382:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:382:1: (lv_name_1_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:383:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMLanguage964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMLanguageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:399:2: (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:399:4: otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMLanguage982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMLanguageAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:403:1: ( ( ruleVersionedQualifiedName ) )
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:404:1: ( ruleVersionedQualifiedName )
                    {
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:404:1: ( ruleVersionedQualifiedName )
                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:405:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMLanguageRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMLanguage1009);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:421:2: (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:421:4: otherlv_4= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMLanguage1022); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMLanguageAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:425:1: ( ( ruleVersionedQualifiedName ) )
                    	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:426:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:426:1: ( ruleVersionedQualifiedName )
                    	    // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:427:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getMLanguageRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMLanguage1049);
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMLanguage1065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMLanguageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMLanguage1077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMLanguageAccess().getVersionKeyword_4());
                  
            }
            otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMLanguage1089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMLanguageAccess().getColonEqualsSignKeyword_5());
                  
            }
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:455:1: ( (lv_version_9_0= ruleVersion ) )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:456:1: (lv_version_9_0= ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:456:1: (lv_version_9_0= ruleVersion )
            // ../es.uah.aut.srg.micobs.editor.lang/src-gen/es/uah/aut/srg/micobs/lang/parser/antlr/internal/InternalLANG.g:457:3: lv_version_9_0= ruleVersion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMLanguageAccess().getVersionVersionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleMLanguage1110);
            lv_version_9_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMLanguageRule());
              	        }
                     		set(
                     			current, 
                     			"version",
                      		lv_version_9_0, 
                      		"Version");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMLanguage1122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMLanguageAccess().getSemicolonKeyword_7());
                  
            }
            otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMLanguage1134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getMLanguageAccess().getRightCurlyBracketKeyword_8());
                  
            }
            otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMLanguage1146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMLanguageAccess().getSemicolonKeyword_9());
                  
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
    // $ANTLR end "ruleMLanguage"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMSYSTEMPackageFile_in_entryRuleMSYSTEMPackageFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMSYSTEMPackageFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMSYSTEMPackageFile128 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMSYSTEMPackageFile155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMSYSTEMPackageFile167 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_13_in_ruleMSYSTEMPackageFile180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMSYSTEMPackageFile207 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMSYSTEMPackageFile219 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_ruleMSYSTEMPackageElement_in_ruleMSYSTEMPackageFile242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMSYSTEMPackageElement_in_entryRuleMSYSTEMPackageElement278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMSYSTEMPackageElement288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMLanguage_in_ruleMSYSTEMPackageElement337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName423 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleQualifiedName442 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName457 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion557 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion585 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion607 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleVersion628 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion644 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion672 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion694 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVersionedQualifiedName802 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleVersionedQualifiedName820 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleVersionedQualifiedName842 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleVersionedQualifiedName860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMLanguage_in_entryRuleMLanguage900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMLanguage910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleMLanguage947 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMLanguage964 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleMLanguage982 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMLanguage1009 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleMLanguage1022 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMLanguage1049 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleMLanguage1065 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMLanguage1077 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMLanguage1089 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleMLanguage1110 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMLanguage1122 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMLanguage1134 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMLanguage1146 = new BitSet(new long[]{0x0000000000000002L});
    }


}