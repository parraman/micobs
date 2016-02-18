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

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;

import es.uah.aut.srg.micobs.mclev.lang.services.IMAPGrammarAccess;
@SuppressWarnings("all")
public class InternalIMAPParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'mapping'", "'{'", "'version'", "':='", "'interfaces'", "','", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
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


        public InternalIMAPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIMAPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIMAPParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private IMAPGrammarAccess grammarAccess;
     	
        public InternalIMAPParser(TokenStream input, IMAPGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MMCLEVIMAPPackageFile";	
       	}
       	
       	@Override
       	protected IMAPGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMMCLEVIMAPPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:74:1: entryRuleMMCLEVIMAPPackageFile returns [EObject current=null] : iv_ruleMMCLEVIMAPPackageFile= ruleMMCLEVIMAPPackageFile EOF ;
    public final EObject entryRuleMMCLEVIMAPPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVIMAPPackageFile = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:75:2: (iv_ruleMMCLEVIMAPPackageFile= ruleMMCLEVIMAPPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:76:2: iv_ruleMMCLEVIMAPPackageFile= ruleMMCLEVIMAPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVIMAPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIMAPPackageFile_in_entryRuleMMCLEVIMAPPackageFile81);
            iv_ruleMMCLEVIMAPPackageFile=ruleMMCLEVIMAPPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVIMAPPackageFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMCLEVIMAPPackageFile91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMCLEVIMAPPackageFile"


    // $ANTLR start "ruleMMCLEVIMAPPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:83:1: ruleMMCLEVIMAPPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIMAPPackageElement ) ) ) ;
    public final EObject ruleMMCLEVIMAPPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:86:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIMAPPackageElement ) ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIMAPPackageElement ) ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIMAPPackageElement ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:87:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIMAPPackageElement ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMMCLEVIMAPPackageFile128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:91:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:92:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:92:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:93:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMCLEVIMAPPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMCLEVIMAPPackageFile155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMMCLEVIMAPPackageFile167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMMCLEVIMAPPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:113:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:113:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMCLEVIMAPPackageFile180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:117:1: ( ( ruleQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:118:1: ( ruleQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:118:1: ( ruleQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:119:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMCLEVIMAPPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMCLEVIMAPPackageFile207);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMMCLEVIMAPPackageFile219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMCLEVIMAPPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:139:3: ( (lv_element_6_0= ruleMMCLEVIMAPPackageElement ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:140:1: (lv_element_6_0= ruleMMCLEVIMAPPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:140:1: (lv_element_6_0= ruleMMCLEVIMAPPackageElement )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:141:3: lv_element_6_0= ruleMMCLEVIMAPPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVIMAPPackageFileAccess().getElementMMCLEVIMAPPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIMAPPackageElement_in_ruleMMCLEVIMAPPackageFile242);
            lv_element_6_0=ruleMMCLEVIMAPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMCLEVIMAPPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"MMCLEVIMAPPackageElement");
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
    // $ANTLR end "ruleMMCLEVIMAPPackageFile"


    // $ANTLR start "entryRuleMMCLEVIMAPPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:165:1: entryRuleMMCLEVIMAPPackageElement returns [EObject current=null] : iv_ruleMMCLEVIMAPPackageElement= ruleMMCLEVIMAPPackageElement EOF ;
    public final EObject entryRuleMMCLEVIMAPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVIMAPPackageElement = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:166:2: (iv_ruleMMCLEVIMAPPackageElement= ruleMMCLEVIMAPPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:167:2: iv_ruleMMCLEVIMAPPackageElement= ruleMMCLEVIMAPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVIMAPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIMAPPackageElement_in_entryRuleMMCLEVIMAPPackageElement278);
            iv_ruleMMCLEVIMAPPackageElement=ruleMMCLEVIMAPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVIMAPPackageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMCLEVIMAPPackageElement288); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMCLEVIMAPPackageElement"


    // $ANTLR start "ruleMMCLEVIMAPPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:174:1: ruleMMCLEVIMAPPackageElement returns [EObject current=null] : this_MInterfaceMapping_0= ruleMInterfaceMapping ;
    public final EObject ruleMMCLEVIMAPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MInterfaceMapping_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:177:28: (this_MInterfaceMapping_0= ruleMInterfaceMapping )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:179:2: this_MInterfaceMapping_0= ruleMInterfaceMapping
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMCLEVIMAPPackageElementAccess().getMInterfaceMappingParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInterfaceMapping_in_ruleMMCLEVIMAPPackageElement337);
            this_MInterfaceMapping_0=ruleMInterfaceMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MInterfaceMapping_0; 
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
    // $ANTLR end "ruleMMCLEVIMAPPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:198:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:199:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:200:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:207:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:210:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:211:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:218:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:219:2: kw= '.' this_ID_2= RULE_ID
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:239:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:240:2: (iv_ruleVersion= ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:241:2: iv_ruleVersion= ruleVersion EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:248:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:251:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==12||LA4_1==14||LA4_1==16) ) {
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:252:7: this_INT_0= RULE_INT
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:260:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:260:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:260:12: this_INT_1= RULE_INT
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

            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:274:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:275:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVersion628); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:280:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_INT) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (LA6_1==EOF||LA6_1==12||LA6_1==14||LA6_1==16) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_1==RULE_ID) ) {
            	            alt6=2;
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
            	            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:280:6: this_INT_4= RULE_INT
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
            	            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:288:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:288:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:288:12: this_INT_5= RULE_INT
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:310:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:311:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:312:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:319:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:322:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:324:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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


    // $ANTLR start "entryRuleVersionedQualifiedReferenceName"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:365:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:366:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:367:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:374:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:377:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:378:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:378:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:378:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:378:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=14 && LA8_1<=15)) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:379:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
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
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVersionedQualifiedReferenceName978); if (state.failed) return current;
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
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:402:1: (kw= '::' this_ID_4= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:403:2: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVersionedQualifiedReferenceName1014); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMInterfaceMapping"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:423:1: entryRuleMInterfaceMapping returns [EObject current=null] : iv_ruleMInterfaceMapping= ruleMInterfaceMapping EOF ;
    public final EObject entryRuleMInterfaceMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInterfaceMapping = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6()
        		);
        	
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:429:2: (iv_ruleMInterfaceMapping= ruleMInterfaceMapping EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:430:2: iv_ruleMInterfaceMapping= ruleMInterfaceMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInterfaceMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInterfaceMapping_in_entryRuleMInterfaceMapping1082);
            iv_ruleMInterfaceMapping=ruleMInterfaceMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInterfaceMapping; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMInterfaceMapping1092); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMInterfaceMapping"


    // $ANTLR start "ruleMInterfaceMapping"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:440:1: ruleMInterfaceMapping returns [EObject current=null] : (otherlv_0= 'mapping' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' otherlv_18= ';' ) ;
    public final EObject ruleMInterfaceMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_version_9_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6()
        		);
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:446:28: ( (otherlv_0= 'mapping' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' otherlv_18= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:447:1: (otherlv_0= 'mapping' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' otherlv_18= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:447:1: (otherlv_0= 'mapping' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' otherlv_18= ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:447:3: otherlv_0= 'mapping' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMInterfaceMapping1133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMInterfaceMappingAccess().getMappingKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:451:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:452:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:452:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:453:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInterfaceMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMInterfaceMappingAccess().getDomainMIODomainCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMInterfaceMapping1160);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMInterfaceMapping1172); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMInterfaceMappingAccess().getColonColonKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:473:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:474:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:474:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:475:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInterfaceMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMInterfaceMappingAccess().getTypeMExchangeModelCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMInterfaceMapping1199);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:491:2: ( (lv_name_4_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:492:1: (lv_name_4_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:492:1: (lv_name_4_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:493:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMInterfaceMapping1216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getMInterfaceMappingAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMInterfaceMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMInterfaceMapping1233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMInterfaceMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:513:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:515:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:515:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:516:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6());
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:519:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?)
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:520:3: ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+ {...}?
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:520:3: ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:522:4: ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:522:4: ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:523:5: {...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMInterfaceMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:523:114: ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:524:6: ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0);
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:527:6: ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:527:7: {...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMInterfaceMapping", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:527:16: (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:527:18: otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMInterfaceMapping1291); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMInterfaceMappingAccess().getVersionKeyword_6_0_0());
            	          
            	    }
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMInterfaceMapping1303); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMInterfaceMappingAccess().getColonEqualsSignKeyword_6_0_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:535:1: ( (lv_version_9_0= ruleVersion ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:536:1: (lv_version_9_0= ruleVersion )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:536:1: (lv_version_9_0= ruleVersion )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:537:3: lv_version_9_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMInterfaceMappingAccess().getVersionVersionParserRuleCall_6_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleMInterfaceMapping1324);
            	    lv_version_9_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMInterfaceMappingRule());
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

            	    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMInterfaceMapping1336); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_6_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:564:4: ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:564:4: ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:565:5: {...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMInterfaceMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:565:114: ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:566:6: ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1);
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:569:6: ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:569:7: {...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMInterfaceMapping", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:569:16: (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:569:18: otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';'
            	    {
            	    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMInterfaceMapping1404); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMInterfaceMappingAccess().getInterfacesKeyword_6_1_0());
            	          
            	    }
            	    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMInterfaceMapping1416); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMInterfaceMappingAccess().getColonEqualsSignKeyword_6_1_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:577:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:578:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:578:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:579:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMInterfaceMappingRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMInterfaceMapping1443);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMInterfaceMapping1455); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMInterfaceMappingAccess().getCommaKeyword_6_1_3());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:599:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:600:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:600:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:601:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMInterfaceMappingRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMInterfaceMapping1482);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMInterfaceMapping1494); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_6_1_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMInterfaceMapping", "getUnorderedGroupHelper().canLeave(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6());

            }

            otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMInterfaceMapping1553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getMInterfaceMappingAccess().getRightCurlyBracketKeyword_7());
                  
            }
            otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMInterfaceMapping1565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_8());
                  
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
    // $ANTLR end "ruleMInterfaceMapping"

    // $ANTLR start synpred10_InternalIMAP
    public final void synpred10_InternalIMAP_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_version_9_0 = null;


        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:522:4: ( ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:522:4: ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:522:4: ({...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:523:5: {...}? => ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalIMAP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:523:114: ( ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:524:6: ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0);
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:527:6: ({...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:527:7: {...}? => (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalIMAP", "true");
        }
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:527:16: (otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:527:18: otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';'
        {
        otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_synpred10_InternalIMAP1291); if (state.failed) return ;
        otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred10_InternalIMAP1303); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:535:1: ( (lv_version_9_0= ruleVersion ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:536:1: (lv_version_9_0= ruleVersion )
        {
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:536:1: (lv_version_9_0= ruleVersion )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:537:3: lv_version_9_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMInterfaceMappingAccess().getVersionVersionParserRuleCall_6_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersion_in_synpred10_InternalIMAP1324);
        lv_version_9_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred10_InternalIMAP1336); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalIMAP

    // $ANTLR start synpred11_InternalIMAP
    public final void synpred11_InternalIMAP_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;

        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:564:4: ( ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:564:4: ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:564:4: ({...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:565:5: {...}? => ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalIMAP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:565:114: ( ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:566:6: ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1);
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:569:6: ({...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:569:7: {...}? => (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalIMAP", "true");
        }
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:569:16: (otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:569:18: otherlv_11= 'interfaces' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ',' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';'
        {
        otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred11_InternalIMAP1404); if (state.failed) return ;
        otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred11_InternalIMAP1416); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:577:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:578:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:578:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:579:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred11_InternalIMAP1443);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred11_InternalIMAP1455); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:599:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:600:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:600:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIMAP.g:601:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred11_InternalIMAP1482);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred11_InternalIMAP1494); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalIMAP

    // Delegated rules

    public final boolean synpred11_InternalIMAP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalIMAP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalIMAP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalIMAP_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleMMCLEVIMAPPackageFile_in_entryRuleMMCLEVIMAPPackageFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMCLEVIMAPPackageFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMMCLEVIMAPPackageFile128 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMCLEVIMAPPackageFile155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMMCLEVIMAPPackageFile167 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleMMCLEVIMAPPackageFile180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMCLEVIMAPPackageFile207 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMMCLEVIMAPPackageFile219 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_ruleMMCLEVIMAPPackageElement_in_ruleMMCLEVIMAPPackageFile242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMCLEVIMAPPackageElement_in_entryRuleMMCLEVIMAPPackageElement278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMCLEVIMAPPackageElement288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMInterfaceMapping_in_ruleMMCLEVIMAPPackageElement337 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleVersionedQualifiedReferenceName960 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleVersionedQualifiedReferenceName978 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName995 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleVersionedQualifiedReferenceName1014 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName1029 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleMInterfaceMapping_in_entryRuleMInterfaceMapping1082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMInterfaceMapping1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleMInterfaceMapping1133 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMInterfaceMapping1160 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMInterfaceMapping1172 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMInterfaceMapping1199 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMInterfaceMapping1216 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMInterfaceMapping1233 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_20_in_ruleMInterfaceMapping1291 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMInterfaceMapping1303 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleMInterfaceMapping1324 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMInterfaceMapping1336 = new BitSet(new long[]{0x0000000001500000L});
        public static final BitSet FOLLOW_22_in_ruleMInterfaceMapping1404 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMInterfaceMapping1416 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMInterfaceMapping1443 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMInterfaceMapping1455 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMInterfaceMapping1482 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMInterfaceMapping1494 = new BitSet(new long[]{0x0000000001500000L});
        public static final BitSet FOLLOW_24_in_ruleMInterfaceMapping1553 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMInterfaceMapping1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_synpred10_InternalIMAP1291 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_synpred10_InternalIMAP1303 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_synpred10_InternalIMAP1324 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_synpred10_InternalIMAP1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_synpred11_InternalIMAP1404 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_synpred11_InternalIMAP1416 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred11_InternalIMAP1443 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_synpred11_InternalIMAP1455 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred11_InternalIMAP1482 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_synpred11_InternalIMAP1494 = new BitSet(new long[]{0x0000000000000002L});
    }


}