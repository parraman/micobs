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
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;

import es.uah.aut.srg.micobs.mclev.lang.services.IFACEGrammarAccess;
@SuppressWarnings("all")
public class InternalIFACEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'interface'", "'extends'", "','", "'{'", "'version'", "':='", "'}'"
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


        public InternalIFACEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIFACEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIFACEParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private IFACEGrammarAccess grammarAccess;
     	
        public InternalIFACEParser(TokenStream input, IFACEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MMCLEVIFACEPackageFile";	
       	}
       	
       	@Override
       	protected IFACEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMMCLEVIFACEPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:73:1: entryRuleMMCLEVIFACEPackageFile returns [EObject current=null] : iv_ruleMMCLEVIFACEPackageFile= ruleMMCLEVIFACEPackageFile EOF ;
    public final EObject entryRuleMMCLEVIFACEPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVIFACEPackageFile = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:74:2: (iv_ruleMMCLEVIFACEPackageFile= ruleMMCLEVIFACEPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:75:2: iv_ruleMMCLEVIFACEPackageFile= ruleMMCLEVIFACEPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVIFACEPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIFACEPackageFile_in_entryRuleMMCLEVIFACEPackageFile81);
            iv_ruleMMCLEVIFACEPackageFile=ruleMMCLEVIFACEPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVIFACEPackageFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMCLEVIFACEPackageFile91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMCLEVIFACEPackageFile"


    // $ANTLR start "ruleMMCLEVIFACEPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:82:1: ruleMMCLEVIFACEPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIFACEPackageElement ) ) ) ;
    public final EObject ruleMMCLEVIFACEPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:85:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIFACEPackageElement ) ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:86:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIFACEPackageElement ) ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:86:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIFACEPackageElement ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:86:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVIFACEPackageElement ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMMCLEVIFACEPackageFile128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:90:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:91:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:91:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:92:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMCLEVIFACEPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMCLEVIFACEPackageFile155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMMCLEVIFACEPackageFile167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMMCLEVIFACEPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:112:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:112:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMCLEVIFACEPackageFile180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:116:1: ( ( ruleQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:117:1: ( ruleQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:117:1: ( ruleQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:118:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMCLEVIFACEPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMCLEVIFACEPackageFile207);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMMCLEVIFACEPackageFile219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMCLEVIFACEPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:138:3: ( (lv_element_6_0= ruleMMCLEVIFACEPackageElement ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:139:1: (lv_element_6_0= ruleMMCLEVIFACEPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:139:1: (lv_element_6_0= ruleMMCLEVIFACEPackageElement )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:140:3: lv_element_6_0= ruleMMCLEVIFACEPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVIFACEPackageFileAccess().getElementMMCLEVIFACEPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIFACEPackageElement_in_ruleMMCLEVIFACEPackageFile242);
            lv_element_6_0=ruleMMCLEVIFACEPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMCLEVIFACEPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"MMCLEVIFACEPackageElement");
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
    // $ANTLR end "ruleMMCLEVIFACEPackageFile"


    // $ANTLR start "entryRuleMMCLEVIFACEPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:164:1: entryRuleMMCLEVIFACEPackageElement returns [EObject current=null] : iv_ruleMMCLEVIFACEPackageElement= ruleMMCLEVIFACEPackageElement EOF ;
    public final EObject entryRuleMMCLEVIFACEPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVIFACEPackageElement = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:165:2: (iv_ruleMMCLEVIFACEPackageElement= ruleMMCLEVIFACEPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:166:2: iv_ruleMMCLEVIFACEPackageElement= ruleMMCLEVIFACEPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVIFACEPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIFACEPackageElement_in_entryRuleMMCLEVIFACEPackageElement278);
            iv_ruleMMCLEVIFACEPackageElement=ruleMMCLEVIFACEPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVIFACEPackageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMCLEVIFACEPackageElement288); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMCLEVIFACEPackageElement"


    // $ANTLR start "ruleMMCLEVIFACEPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:173:1: ruleMMCLEVIFACEPackageElement returns [EObject current=null] : this_MInterface_0= ruleMInterface ;
    public final EObject ruleMMCLEVIFACEPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MInterface_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:176:28: (this_MInterface_0= ruleMInterface )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:178:2: this_MInterface_0= ruleMInterface
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMCLEVIFACEPackageElementAccess().getMInterfaceParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInterface_in_ruleMMCLEVIFACEPackageElement337);
            this_MInterface_0=ruleMInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MInterface_0; 
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
    // $ANTLR end "ruleMMCLEVIFACEPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:197:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:198:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:199:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:206:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:209:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:210:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:210:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:210:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:217:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:218:2: kw= '.' this_ID_2= RULE_ID
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:238:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:239:2: (iv_ruleVersion= ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:240:2: iv_ruleVersion= ruleVersion EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:247:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:250:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:251:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:251:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:251:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:251:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:251:7: this_INT_0= RULE_INT
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:259:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:259:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:259:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:259:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:259:12: this_INT_1= RULE_INT
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

            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:273:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:274:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVersion628); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:279:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
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
            	            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:279:6: this_INT_4= RULE_INT
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
            	            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:287:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:287:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:287:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:287:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:287:12: this_INT_5= RULE_INT
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:309:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:310:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:311:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:318:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:321:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:322:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:322:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:323:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:364:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:365:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:366:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:373:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:376:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:377:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:377:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:377:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:377:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:378:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
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
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:401:1: (kw= '::' this_ID_4= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:402:2: kw= '::' this_ID_4= RULE_ID
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


    // $ANTLR start "entryRuleMInterface"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:422:1: entryRuleMInterface returns [EObject current=null] : iv_ruleMInterface= ruleMInterface EOF ;
    public final EObject entryRuleMInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInterface = null;


        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:423:2: (iv_ruleMInterface= ruleMInterface EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:424:2: iv_ruleMInterface= ruleMInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInterface_in_entryRuleMInterface1076);
            iv_ruleMInterface=ruleMInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInterface; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMInterface1086); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMInterface"


    // $ANTLR start "ruleMInterface"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:431:1: ruleMInterface returns [EObject current=null] : (otherlv_0= 'interface' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_7= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_9= '{' otherlv_10= 'version' otherlv_11= ':=' ( (lv_version_12_0= ruleVersion ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleMInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_version_12_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:434:28: ( (otherlv_0= 'interface' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_7= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_9= '{' otherlv_10= 'version' otherlv_11= ':=' ( (lv_version_12_0= ruleVersion ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:435:1: (otherlv_0= 'interface' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_7= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_9= '{' otherlv_10= 'version' otherlv_11= ':=' ( (lv_version_12_0= ruleVersion ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:435:1: (otherlv_0= 'interface' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_7= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_9= '{' otherlv_10= 'version' otherlv_11= ':=' ( (lv_version_12_0= ruleVersion ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:435:3: otherlv_0= 'interface' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_7= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_9= '{' otherlv_10= 'version' otherlv_11= ':=' ( (lv_version_12_0= ruleVersion ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMInterface1123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMInterfaceAccess().getInterfaceKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:439:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:440:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:440:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:441:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInterfaceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMInterfaceAccess().getDomainMDomainCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMInterface1150);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMInterface1162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMInterfaceAccess().getColonColonKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:461:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:462:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:462:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:463:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInterfaceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMInterfaceAccess().getTypeMInterfaceTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMInterface1189);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:479:2: ( (lv_name_4_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:480:1: (lv_name_4_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:480:1: (lv_name_4_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:481:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMInterface1206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getMInterfaceAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMInterfaceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:497:2: (otherlv_5= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_7= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:497:4: otherlv_5= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_7= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMInterface1224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMInterfaceAccess().getExtendsKeyword_5_0());
                          
                    }
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:501:1: ( ( ruleVersionedQualifiedName ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:502:1: ( ruleVersionedQualifiedName )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:502:1: ( ruleVersionedQualifiedName )
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:503:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMInterfaceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMInterface1251);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:519:2: (otherlv_7= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:519:4: otherlv_7= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMInterface1264); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getMInterfaceAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:523:1: ( ( ruleVersionedQualifiedName ) )
                    	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:524:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:524:1: ( ruleVersionedQualifiedName )
                    	    // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:525:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getMInterfaceRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMInterface1291);
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

            otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMInterface1307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMInterfaceAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMInterface1319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMInterfaceAccess().getVersionKeyword_7());
                  
            }
            otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMInterface1331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getMInterfaceAccess().getColonEqualsSignKeyword_8());
                  
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:553:1: ( (lv_version_12_0= ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:554:1: (lv_version_12_0= ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:554:1: (lv_version_12_0= ruleVersion )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface/src-gen/es/uah/aut/srg/micobs/mclev/lang/parser/antlr/internal/InternalIFACE.g:555:3: lv_version_12_0= ruleVersion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMInterfaceAccess().getVersionVersionParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleMInterface1352);
            lv_version_12_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMInterfaceRule());
              	        }
                     		set(
                     			current, 
                     			"version",
                      		lv_version_12_0, 
                      		"Version");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMInterface1364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getMInterfaceAccess().getSemicolonKeyword_10());
                  
            }
            otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMInterface1376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getMInterfaceAccess().getRightCurlyBracketKeyword_11());
                  
            }
            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMInterface1388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getMInterfaceAccess().getSemicolonKeyword_12());
                  
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
    // $ANTLR end "ruleMInterface"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMMCLEVIFACEPackageFile_in_entryRuleMMCLEVIFACEPackageFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMCLEVIFACEPackageFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMMCLEVIFACEPackageFile128 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMCLEVIFACEPackageFile155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMMCLEVIFACEPackageFile167 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleMMCLEVIFACEPackageFile180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMCLEVIFACEPackageFile207 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMMCLEVIFACEPackageFile219 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_ruleMMCLEVIFACEPackageElement_in_ruleMMCLEVIFACEPackageFile242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMCLEVIFACEPackageElement_in_entryRuleMMCLEVIFACEPackageElement278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMCLEVIFACEPackageElement288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMInterface_in_ruleMMCLEVIFACEPackageElement337 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleMInterface_in_entryRuleMInterface1076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMInterface1086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleMInterface1123 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMInterface1150 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMInterface1162 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleMInterface1189 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMInterface1206 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleMInterface1224 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMInterface1251 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleMInterface1264 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMInterface1291 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleMInterface1307 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMInterface1319 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMInterface1331 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleMInterface1352 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMInterface1364 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMInterface1376 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMInterface1388 = new BitSet(new long[]{0x0000000000000002L});
    }


}