package es.uah.aut.srg.micobs.mesp.lang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.mesp.lang.services.OSSWPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalOSSWPParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'osswpackage'", "'extends'", "','", "'{'", "'version'", "':='", "'os'", "'construction tools'", "'provided osswis'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
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


        public InternalOSSWPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOSSWPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOSSWPParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private OSSWPGrammarAccess grammarAccess;
     	
        public InternalOSSWPParser(TokenStream input, OSSWPGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MMESPOSSWPPackageFile";	
       	}
       	
       	@Override
       	protected OSSWPGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMMESPOSSWPPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:74:1: entryRuleMMESPOSSWPPackageFile returns [EObject current=null] : iv_ruleMMESPOSSWPPackageFile= ruleMMESPOSSWPPackageFile EOF ;
    public final EObject entryRuleMMESPOSSWPPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPOSSWPPackageFile = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:75:2: (iv_ruleMMESPOSSWPPackageFile= ruleMMESPOSSWPPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:76:2: iv_ruleMMESPOSSWPPackageFile= ruleMMESPOSSWPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPOSSWPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPOSSWPPackageFile_in_entryRuleMMESPOSSWPPackageFile81);
            iv_ruleMMESPOSSWPPackageFile=ruleMMESPOSSWPPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPOSSWPPackageFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPOSSWPPackageFile91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPOSSWPPackageFile"


    // $ANTLR start "ruleMMESPOSSWPPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:83:1: ruleMMESPOSSWPPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) ) ) ;
    public final EObject ruleMMESPOSSWPPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:86:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:87:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMMESPOSSWPPackageFile128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:91:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:92:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:92:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:93:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPOSSWPPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMESPOSSWPPackageFile155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMMESPOSSWPPackageFile167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:113:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:113:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMMESPOSSWPPackageFile180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMESPOSSWPPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:117:1: ( ( ruleQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:118:1: ( ruleQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:118:1: ( ruleQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:119:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPOSSWPPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMMESPOSSWPPackageFile207);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMMESPOSSWPPackageFile219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:139:3: ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:140:1: (lv_element_6_0= ruleMMESPOSSWPPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:140:1: (lv_element_6_0= ruleMMESPOSSWPPackageElement )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:141:3: lv_element_6_0= ruleMMESPOSSWPPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementMMESPOSSWPPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPOSSWPPackageElement_in_ruleMMESPOSSWPPackageFile242);
            lv_element_6_0=ruleMMESPOSSWPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMESPOSSWPPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"MMESPOSSWPPackageElement");
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
    // $ANTLR end "ruleMMESPOSSWPPackageFile"


    // $ANTLR start "entryRuleMMESPOSSWPPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:165:1: entryRuleMMESPOSSWPPackageElement returns [EObject current=null] : iv_ruleMMESPOSSWPPackageElement= ruleMMESPOSSWPPackageElement EOF ;
    public final EObject entryRuleMMESPOSSWPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPOSSWPPackageElement = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:166:2: (iv_ruleMMESPOSSWPPackageElement= ruleMMESPOSSWPPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:167:2: iv_ruleMMESPOSSWPPackageElement= ruleMMESPOSSWPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPOSSWPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPOSSWPPackageElement_in_entryRuleMMESPOSSWPPackageElement278);
            iv_ruleMMESPOSSWPPackageElement=ruleMMESPOSSWPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPOSSWPPackageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPOSSWPPackageElement288); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMMESPOSSWPPackageElement"


    // $ANTLR start "ruleMMESPOSSWPPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:174:1: ruleMMESPOSSWPPackageElement returns [EObject current=null] : this_MOSSwPackage_0= ruleMOSSwPackage ;
    public final EObject ruleMMESPOSSWPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MOSSwPackage_0 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:177:28: (this_MOSSwPackage_0= ruleMOSSwPackage )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:179:2: this_MOSSwPackage_0= ruleMOSSwPackage
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMESPOSSWPPackageElementAccess().getMOSSwPackageParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMOSSwPackage_in_ruleMMESPOSSWPPackageElement337);
            this_MOSSwPackage_0=ruleMOSSwPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MOSSwPackage_0; 
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
    // $ANTLR end "ruleMMESPOSSWPPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:198:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:199:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:200:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:207:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:210:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:211:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:218:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:219:2: kw= '.' this_ID_2= RULE_ID
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:239:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:240:2: (iv_ruleVersion= ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:241:2: iv_ruleVersion= ruleVersion EOF
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:248:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:251:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:252:7: this_INT_0= RULE_INT
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:260:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:260:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:260:12: this_INT_1= RULE_INT
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

            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:274:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:275:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVersion628); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:280:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
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
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:280:6: this_INT_4= RULE_INT
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
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:288:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:288:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:288:12: this_INT_5= RULE_INT
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:310:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:311:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:312:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:319:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:322:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:324:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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


    // $ANTLR start "entryRuleMOSSwPackage"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:365:1: entryRuleMOSSwPackage returns [EObject current=null] : iv_ruleMOSSwPackage= ruleMOSSwPackage EOF ;
    public final EObject entryRuleMOSSwPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOSSwPackage = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:371:2: (iv_ruleMOSSwPackage= ruleMOSSwPackage EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:372:2: iv_ruleMOSSwPackage= ruleMOSSwPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMOSSwPackageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMOSSwPackage_in_entryRuleMOSSwPackage906);
            iv_ruleMOSSwPackage=ruleMOSSwPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMOSSwPackage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMOSSwPackage916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMOSSwPackage"


    // $ANTLR start "ruleMOSSwPackage"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:382:1: ruleMOSSwPackage returns [EObject current=null] : (otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}' otherlv_29= ';' ) ;
    public final EObject ruleMOSSwPackage() throws RecognitionException {
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
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()
        		);
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:388:28: ( (otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}' otherlv_29= ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:389:1: (otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}' otherlv_29= ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:389:1: (otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}' otherlv_29= ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:389:3: otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}' otherlv_29= ';'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMOSSwPackage957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMOSSwPackageAccess().getOsswpackageKeyword_0());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:393:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:394:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:394:1: (lv_name_1_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:395:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMOSSwPackage974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMOSSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMOSSwPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:411:2: (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:411:4: otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMOSSwPackage992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMOSSwPackageAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:415:1: ( ( ruleVersionedQualifiedName ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:416:1: ( ruleVersionedQualifiedName )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:416:1: ( ruleVersionedQualifiedName )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:417:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMOSSwPackageRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1019);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:433:2: (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:433:4: otherlv_4= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMOSSwPackage1032); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMOSSwPackageAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:437:1: ( ( ruleVersionedQualifiedName ) )
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:438:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:438:1: ( ruleVersionedQualifiedName )
                    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:439:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getMOSSwPackageRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1059);
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

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMOSSwPackage1075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMOSSwPackageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:459:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:461:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:461:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:462:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:465:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?)
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:466:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+ {...}?
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:466:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=5;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                    alt12=4;
                }


                switch (alt12) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:469:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:469:109: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:470:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:473:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:473:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:473:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:473:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMOSSwPackage1133); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMOSSwPackageAccess().getVersionKeyword_4_0_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMOSSwPackage1145); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_0_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:481:1: ( (lv_version_10_0= ruleVersion ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:482:1: (lv_version_10_0= ruleVersion )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:482:1: (lv_version_10_0= ruleVersion )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:483:3: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleMOSSwPackage1166);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMOSSwPackageRule());
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

            	    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMOSSwPackage1178); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:510:4: ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:510:4: ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:511:5: {...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:511:109: ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:512:6: ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:515:6: ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:515:7: {...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:515:16: (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:515:18: otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMOSSwPackage1246); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMOSSwPackageAccess().getOsKeyword_4_1_0());
            	          
            	    }
            	    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMOSSwPackage1258); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_1_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:523:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:524:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:524:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:525:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMOSSwPackageRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemCrossReference_4_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1285);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMOSSwPackage1297); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_1_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:552:4: ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:552:4: ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:553:5: {...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:553:109: ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:554:6: ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:557:6: ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:557:7: {...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:557:16: (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:557:18: otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';'
            	    {
            	    otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMOSSwPackage1365); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMOSSwPackageAccess().getConstructionToolsKeyword_4_2_0());
            	          
            	    }
            	    otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMOSSwPackage1377); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_2_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:565:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:566:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:566:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:567:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMOSSwPackageRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1404);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:583:2: (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==19) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:583:4: otherlv_19= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMOSSwPackage1417); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_19, grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_2_3_0());
            	    	          
            	    	    }
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:587:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:588:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:588:1: ( ruleVersionedQualifiedName )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:589:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMOSSwPackageRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1444);
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

            	    otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMOSSwPackage1458); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_2_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:616:4: ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:616:4: ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:617:5: {...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:617:109: ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:618:6: ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3);
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:621:6: ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:621:7: {...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:621:16: (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:621:18: otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';'
            	    {
            	    otherlv_22=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMOSSwPackage1526); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getMOSSwPackageAccess().getProvidedOsswisKeyword_4_3_0());
            	          
            	    }
            	    otherlv_23=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMOSSwPackage1538); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_3_1());
            	          
            	    }
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:629:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:630:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:630:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:631:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMOSSwPackageRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1565);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:647:2: (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==19) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:647:4: otherlv_25= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_25=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMOSSwPackage1578); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_25, grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_3_3_0());
            	    	          
            	    	    }
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:651:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:652:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:652:1: ( ruleVersionedQualifiedName )
            	    	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:653:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMOSSwPackageRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1605);
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
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_27=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMOSSwPackage1619); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_3_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMOSSwPackage", "getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());

            }

            otherlv_28=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMOSSwPackage1678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_28, grammarAccess.getMOSSwPackageAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_29=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMOSSwPackage1690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_29, grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMOSSwPackage"

    // $ANTLR start synpred10_InternalOSSWP
    public final void synpred10_InternalOSSWP_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:468:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:469:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:469:109: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:470:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:473:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:473:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalOSSWP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:473:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:473:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred10_InternalOSSWP1133); if (state.failed) return ;
        otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred10_InternalOSSWP1145); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:481:1: ( (lv_version_10_0= ruleVersion ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:482:1: (lv_version_10_0= ruleVersion )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:482:1: (lv_version_10_0= ruleVersion )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:483:3: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersion_in_synpred10_InternalOSSWP1166);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred10_InternalOSSWP1178); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalOSSWP

    // $ANTLR start synpred11_InternalOSSWP
    public final void synpred11_InternalOSSWP_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:510:4: ( ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:510:4: ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:510:4: ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:511:5: {...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:511:109: ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:512:6: ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:515:6: ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:515:7: {...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalOSSWP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:515:16: (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:515:18: otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred11_InternalOSSWP1246); if (state.failed) return ;
        otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred11_InternalOSSWP1258); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:523:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:524:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:524:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:525:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred11_InternalOSSWP1285);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred11_InternalOSSWP1297); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalOSSWP

    // $ANTLR start synpred13_InternalOSSWP
    public final void synpred13_InternalOSSWP_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:552:4: ( ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:552:4: ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:552:4: ({...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:553:5: {...}? => ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:553:109: ( ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:554:6: ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:557:6: ({...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:557:7: {...}? => (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:557:16: (otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:557:18: otherlv_16= 'construction tools' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';'
        {
        otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_24_in_synpred13_InternalOSSWP1365); if (state.failed) return ;
        otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred13_InternalOSSWP1377); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:565:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:566:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:566:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:567:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred13_InternalOSSWP1404);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:583:2: (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop16:
        do {
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }


            switch (alt16) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:583:4: otherlv_19= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred13_InternalOSSWP1417); if (state.failed) return ;
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:587:1: ( ( ruleVersionedQualifiedName ) )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:588:1: ( ruleVersionedQualifiedName )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:588:1: ( ruleVersionedQualifiedName )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:589:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred13_InternalOSSWP1444);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop16;
            }
        } while (true);

        otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred13_InternalOSSWP1458); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalOSSWP

    // $ANTLR start synpred15_InternalOSSWP
    public final void synpred15_InternalOSSWP_fragment() throws RecognitionException {   
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;

        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:616:4: ( ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:616:4: ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:616:4: ({...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:617:5: {...}? => ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:617:109: ( ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:618:6: ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:621:6: ({...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:621:7: {...}? => (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalOSSWP", "true");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:621:16: (otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';' )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:621:18: otherlv_22= 'provided osswis' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_27= ';'
        {
        otherlv_22=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred15_InternalOSSWP1526); if (state.failed) return ;
        otherlv_23=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred15_InternalOSSWP1538); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:629:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:630:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:630:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:631:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred15_InternalOSSWP1565);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:647:2: (otherlv_25= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop17:
        do {
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }


            switch (alt17) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:647:4: otherlv_25= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_25=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred15_InternalOSSWP1578); if (state.failed) return ;
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:651:1: ( ( ruleVersionedQualifiedName ) )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:652:1: ( ruleVersionedQualifiedName )
        	    {
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:652:1: ( ruleVersionedQualifiedName )
        	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp/src-gen/es/uah/aut/srg/micobs/mesp/lang/parser/antlr/internal/InternalOSSWP.g:653:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred15_InternalOSSWP1605);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop17;
            }
        } while (true);

        otherlv_27=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred15_InternalOSSWP1619); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalOSSWP

    // Delegated rules

    public final boolean synpred10_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalOSSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalOSSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalOSSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalOSSWP_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleMMESPOSSWPPackageFile_in_entryRuleMMESPOSSWPPackageFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPOSSWPPackageFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMMESPOSSWPPackageFile128 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMESPOSSWPPackageFile155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMMESPOSSWPPackageFile167 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_13_in_ruleMMESPOSSWPPackageFile180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMMESPOSSWPPackageFile207 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMMESPOSSWPPackageFile219 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_ruleMMESPOSSWPPackageElement_in_ruleMMESPOSSWPPackageFile242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPOSSWPPackageElement_in_entryRuleMMESPOSSWPPackageElement278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPOSSWPPackageElement288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMOSSwPackage_in_ruleMMESPOSSWPPackageElement337 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleMOSSwPackage_in_entryRuleMOSSwPackage906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMOSSwPackage916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleMOSSwPackage957 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMOSSwPackage974 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleMOSSwPackage992 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1019 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleMOSSwPackage1032 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1059 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleMOSSwPackage1075 = new BitSet(new long[]{0x0000000003A00000L});
        public static final BitSet FOLLOW_21_in_ruleMOSSwPackage1133 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMOSSwPackage1145 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleMOSSwPackage1166 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMOSSwPackage1178 = new BitSet(new long[]{0x0000000007A00000L});
        public static final BitSet FOLLOW_23_in_ruleMOSSwPackage1246 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMOSSwPackage1258 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1285 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMOSSwPackage1297 = new BitSet(new long[]{0x0000000007A00000L});
        public static final BitSet FOLLOW_24_in_ruleMOSSwPackage1365 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMOSSwPackage1377 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1404 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_19_in_ruleMOSSwPackage1417 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1444 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_ruleMOSSwPackage1458 = new BitSet(new long[]{0x0000000007A00000L});
        public static final BitSet FOLLOW_25_in_ruleMOSSwPackage1526 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMOSSwPackage1538 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1565 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_19_in_ruleMOSSwPackage1578 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleMOSSwPackage1605 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_ruleMOSSwPackage1619 = new BitSet(new long[]{0x0000000007A00000L});
        public static final BitSet FOLLOW_26_in_ruleMOSSwPackage1678 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMOSSwPackage1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_synpred10_InternalOSSWP1133 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_synpred10_InternalOSSWP1145 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_synpred10_InternalOSSWP1166 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_synpred10_InternalOSSWP1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_synpred11_InternalOSSWP1246 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_synpred11_InternalOSSWP1258 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred11_InternalOSSWP1285 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_synpred11_InternalOSSWP1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_synpred13_InternalOSSWP1365 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_synpred13_InternalOSSWP1377 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred13_InternalOSSWP1404 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_19_in_synpred13_InternalOSSWP1417 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred13_InternalOSSWP1444 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_synpred13_InternalOSSWP1458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_synpred15_InternalOSSWP1526 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_synpred15_InternalOSSWP1538 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred15_InternalOSSWP1565 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_19_in_synpred15_InternalOSSWP1578 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred15_InternalOSSWP1605 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_synpred15_InternalOSSWP1619 = new BitSet(new long[]{0x0000000000000002L});
    }


}