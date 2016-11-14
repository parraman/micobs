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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'osswpackage'", "'extends'", "','", "'{'", "'version'", "':='", "'os'", "'construction'", "'tools'", "'provided'", "'osswis'", "'}'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOSSWPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOSSWPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOSSWPParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOSSWP.g"; }



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
    // InternalOSSWP.g:74:1: entryRuleMMESPOSSWPPackageFile returns [EObject current=null] : iv_ruleMMESPOSSWPPackageFile= ruleMMESPOSSWPPackageFile EOF ;
    public final EObject entryRuleMMESPOSSWPPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPOSSWPPackageFile = null;


        try {
            // InternalOSSWP.g:75:2: (iv_ruleMMESPOSSWPPackageFile= ruleMMESPOSSWPPackageFile EOF )
            // InternalOSSWP.g:76:2: iv_ruleMMESPOSSWPPackageFile= ruleMMESPOSSWPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPOSSWPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPOSSWPPackageFile=ruleMMESPOSSWPPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPOSSWPPackageFile; 
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
    // $ANTLR end "entryRuleMMESPOSSWPPackageFile"


    // $ANTLR start "ruleMMESPOSSWPPackageFile"
    // InternalOSSWP.g:83:1: ruleMMESPOSSWPPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) ) ) ;
    public final EObject ruleMMESPOSSWPPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWP.g:86:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) ) ) )
            // InternalOSSWP.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) ) )
            {
            // InternalOSSWP.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) ) )
            // InternalOSSWP.g:87:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageKeyword_0());
                  
            }
            // InternalOSSWP.g:91:1: ( ( ruleQualifiedName ) )
            // InternalOSSWP.g:92:1: ( ruleQualifiedName )
            {
            // InternalOSSWP.g:92:1: ( ruleQualifiedName )
            // InternalOSSWP.g:93:3: ruleQualifiedName
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
            pushFollow(FollowSets000.FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // InternalOSSWP.g:113:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOSSWP.g:113:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMESPOSSWPPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // InternalOSSWP.g:117:1: ( ( ruleQualifiedName ) )
            	    // InternalOSSWP.g:118:1: ( ruleQualifiedName )
            	    {
            	    // InternalOSSWP.g:118:1: ( ruleQualifiedName )
            	    // InternalOSSWP.g:119:3: ruleQualifiedName
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
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalOSSWP.g:139:3: ( (lv_element_6_0= ruleMMESPOSSWPPackageElement ) )
            // InternalOSSWP.g:140:1: (lv_element_6_0= ruleMMESPOSSWPPackageElement )
            {
            // InternalOSSWP.g:140:1: (lv_element_6_0= ruleMMESPOSSWPPackageElement )
            // InternalOSSWP.g:141:3: lv_element_6_0= ruleMMESPOSSWPPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementMMESPOSSWPPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWP.MMESPOSSWPPackageElement");
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
    // InternalOSSWP.g:165:1: entryRuleMMESPOSSWPPackageElement returns [EObject current=null] : iv_ruleMMESPOSSWPPackageElement= ruleMMESPOSSWPPackageElement EOF ;
    public final EObject entryRuleMMESPOSSWPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPOSSWPPackageElement = null;


        try {
            // InternalOSSWP.g:166:2: (iv_ruleMMESPOSSWPPackageElement= ruleMMESPOSSWPPackageElement EOF )
            // InternalOSSWP.g:167:2: iv_ruleMMESPOSSWPPackageElement= ruleMMESPOSSWPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPOSSWPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPOSSWPPackageElement=ruleMMESPOSSWPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPOSSWPPackageElement; 
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
    // $ANTLR end "entryRuleMMESPOSSWPPackageElement"


    // $ANTLR start "ruleMMESPOSSWPPackageElement"
    // InternalOSSWP.g:174:1: ruleMMESPOSSWPPackageElement returns [EObject current=null] : this_MOSSwPackage_0= ruleMOSSwPackage ;
    public final EObject ruleMMESPOSSWPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MOSSwPackage_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWP.g:177:28: (this_MOSSwPackage_0= ruleMOSSwPackage )
            // InternalOSSWP.g:179:2: this_MOSSwPackage_0= ruleMOSSwPackage
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMESPOSSWPPackageElementAccess().getMOSSwPackageParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWP.g:198:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalOSSWP.g:199:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalOSSWP.g:200:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalOSSWP.g:207:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalOSSWP.g:210:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalOSSWP.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalOSSWP.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalOSSWP.g:211:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalOSSWP.g:218:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOSSWP.g:219:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
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
    // InternalOSSWP.g:239:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalOSSWP.g:240:2: (iv_ruleVersion= ruleVersion EOF )
            // InternalOSSWP.g:241:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalOSSWP.g:248:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalOSSWP.g:251:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalOSSWP.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalOSSWP.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalOSSWP.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalOSSWP.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
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
                    // InternalOSSWP.g:252:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalOSSWP.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalOSSWP.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalOSSWP.g:260:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalOSSWP.g:260:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalOSSWP.g:260:12: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
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

            // InternalOSSWP.g:274:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOSSWP.g:275:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalOSSWP.g:280:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
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
            	            // InternalOSSWP.g:280:6: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_4);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalOSSWP.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalOSSWP.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalOSSWP.g:288:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalOSSWP.g:288:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // InternalOSSWP.g:288:12: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
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
    // InternalOSSWP.g:310:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalOSSWP.g:311:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalOSSWP.g:312:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalOSSWP.g:319:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // InternalOSSWP.g:322:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalOSSWP.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalOSSWP.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalOSSWP.g:324:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Version_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalOSSWP.g:365:1: entryRuleMOSSwPackage returns [EObject current=null] : iv_ruleMOSSwPackage= ruleMOSSwPackage EOF ;
    public final EObject entryRuleMOSSwPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOSSwPackage = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // InternalOSSWP.g:371:2: (iv_ruleMOSSwPackage= ruleMOSSwPackage EOF )
            // InternalOSSWP.g:372:2: iv_ruleMOSSwPackage= ruleMOSSwPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMOSSwPackageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMOSSwPackage=ruleMOSSwPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMOSSwPackage; 
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
    // $ANTLR end "entryRuleMOSSwPackage"


    // $ANTLR start "ruleMOSSwPackage"
    // InternalOSSWP.g:382:1: ruleMOSSwPackage returns [EObject current=null] : (otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' otherlv_31= ';' ) ;
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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()
        		);
            
        try {
            // InternalOSSWP.g:388:28: ( (otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' otherlv_31= ';' ) )
            // InternalOSSWP.g:389:1: (otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' otherlv_31= ';' )
            {
            // InternalOSSWP.g:389:1: (otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' otherlv_31= ';' )
            // InternalOSSWP.g:389:3: otherlv_0= 'osswpackage' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' otherlv_31= ';'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMOSSwPackageAccess().getOsswpackageKeyword_0());
                  
            }
            // InternalOSSWP.g:393:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWP.g:394:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWP.g:394:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWP.g:395:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalOSSWP.g:411:2: (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOSSWP.g:411:4: otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMOSSwPackageAccess().getExtendsKeyword_2_0());
                          
                    }
                    // InternalOSSWP.g:415:1: ( ( ruleVersionedQualifiedName ) )
                    // InternalOSSWP.g:416:1: ( ruleVersionedQualifiedName )
                    {
                    // InternalOSSWP.g:416:1: ( ruleVersionedQualifiedName )
                    // InternalOSSWP.g:417:3: ruleVersionedQualifiedName
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
                    pushFollow(FollowSets000.FOLLOW_11);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalOSSWP.g:433:2: (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalOSSWP.g:433:4: otherlv_4= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMOSSwPackageAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // InternalOSSWP.g:437:1: ( ( ruleVersionedQualifiedName ) )
                    	    // InternalOSSWP.g:438:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // InternalOSSWP.g:438:1: ( ruleVersionedQualifiedName )
                    	    // InternalOSSWP.g:439:3: ruleVersionedQualifiedName
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
                    	    pushFollow(FollowSets000.FOLLOW_11);
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

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMOSSwPackageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalOSSWP.g:459:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?) ) )
            // InternalOSSWP.g:461:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalOSSWP.g:461:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?) )
            // InternalOSSWP.g:462:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());
            // InternalOSSWP.g:465:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?)
            // InternalOSSWP.g:466:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+ {...}?
            {
            // InternalOSSWP.g:466:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=5;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                    alt12=4;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOSSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalOSSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalOSSWP.g:469:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalOSSWP.g:469:109: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalOSSWP.g:470:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0);
            	    // InternalOSSWP.g:473:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalOSSWP.g:473:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "true");
            	    }
            	    // InternalOSSWP.g:473:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalOSSWP.g:473:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMOSSwPackageAccess().getVersionKeyword_4_0_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_0_1());
            	          
            	    }
            	    // InternalOSSWP.g:481:1: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalOSSWP.g:482:1: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalOSSWP.g:482:1: (lv_version_10_0= ruleVersion )
            	    // InternalOSSWP.g:483:3: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
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
            	              		"es.uah.aut.srg.micobs.mesp.lang.OSSWP.Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_14); if (state.failed) return current;
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
            	    // InternalOSSWP.g:510:4: ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalOSSWP.g:510:4: ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    // InternalOSSWP.g:511:5: {...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalOSSWP.g:511:109: ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    // InternalOSSWP.g:512:6: ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1);
            	    // InternalOSSWP.g:515:6: ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    // InternalOSSWP.g:515:7: {...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "true");
            	    }
            	    // InternalOSSWP.g:515:16: (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    // InternalOSSWP.g:515:18: otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMOSSwPackageAccess().getOsKeyword_4_1_0());
            	          
            	    }
            	    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_1_1());
            	          
            	    }
            	    // InternalOSSWP.g:523:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalOSSWP.g:524:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalOSSWP.g:524:1: ( ruleVersionedQualifiedName )
            	    // InternalOSSWP.g:525:3: ruleVersionedQualifiedName
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
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_14); if (state.failed) return current;
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
            	    // InternalOSSWP.g:552:4: ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) )
            	    {
            	    // InternalOSSWP.g:552:4: ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) )
            	    // InternalOSSWP.g:553:5: {...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalOSSWP.g:553:109: ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) )
            	    // InternalOSSWP.g:554:6: ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2);
            	    // InternalOSSWP.g:557:6: ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) )
            	    // InternalOSSWP.g:557:7: {...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "true");
            	    }
            	    // InternalOSSWP.g:557:16: (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' )
            	    // InternalOSSWP.g:557:18: otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';'
            	    {
            	    otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMOSSwPackageAccess().getConstructionKeyword_4_2_0());
            	          
            	    }
            	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMOSSwPackageAccess().getToolsKeyword_4_2_1());
            	          
            	    }
            	    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_2_2());
            	          
            	    }
            	    // InternalOSSWP.g:569:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalOSSWP.g:570:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalOSSWP.g:570:1: ( ruleVersionedQualifiedName )
            	    // InternalOSSWP.g:571:3: ruleVersionedQualifiedName
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
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalOSSWP.g:587:2: (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==19) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalOSSWP.g:587:4: otherlv_20= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_20, grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_2_4_0());
            	    	          
            	    	    }
            	    	    // InternalOSSWP.g:591:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalOSSWP.g:592:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalOSSWP.g:592:1: ( ruleVersionedQualifiedName )
            	    	    // InternalOSSWP.g:593:3: ruleVersionedQualifiedName
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
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_4_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_16);
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

            	    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOSSWP.g:620:4: ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) )
            	    {
            	    // InternalOSSWP.g:620:4: ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) )
            	    // InternalOSSWP.g:621:5: {...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalOSSWP.g:621:109: ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) )
            	    // InternalOSSWP.g:622:6: ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3);
            	    // InternalOSSWP.g:625:6: ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) )
            	    // InternalOSSWP.g:625:7: {...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwPackage", "true");
            	    }
            	    // InternalOSSWP.g:625:16: (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' )
            	    // InternalOSSWP.g:625:18: otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';'
            	    {
            	    otherlv_23=(Token)match(input,26,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMOSSwPackageAccess().getProvidedKeyword_4_3_0());
            	          
            	    }
            	    otherlv_24=(Token)match(input,27,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_24, grammarAccess.getMOSSwPackageAccess().getOsswisKeyword_4_3_1());
            	          
            	    }
            	    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_3_2());
            	          
            	    }
            	    // InternalOSSWP.g:637:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalOSSWP.g:638:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalOSSWP.g:638:1: ( ruleVersionedQualifiedName )
            	    // InternalOSSWP.g:639:3: ruleVersionedQualifiedName
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
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalOSSWP.g:655:2: (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==19) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalOSSWP.g:655:4: otherlv_27= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_27, grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_3_4_0());
            	    	          
            	    	    }
            	    	    // InternalOSSWP.g:659:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalOSSWP.g:660:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalOSSWP.g:660:1: ( ruleVersionedQualifiedName )
            	    	    // InternalOSSWP.g:661:3: ruleVersionedQualifiedName
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
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_16);
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

            	    otherlv_29=(Token)match(input,12,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_3_5());
            	          
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

            otherlv_30=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_30, grammarAccess.getMOSSwPackageAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_31=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_31, grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_6());
                  
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


        // InternalOSSWP.g:468:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalOSSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalOSSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalOSSWP.g:469:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalOSSWP.g:469:109: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalOSSWP.g:470:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0);
        // InternalOSSWP.g:473:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalOSSWP.g:473:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalOSSWP", "true");
        }
        // InternalOSSWP.g:473:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalOSSWP.g:473:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return ;
        otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalOSSWP.g:481:1: ( (lv_version_10_0= ruleVersion ) )
        // InternalOSSWP.g:482:1: (lv_version_10_0= ruleVersion )
        {
        // InternalOSSWP.g:482:1: (lv_version_10_0= ruleVersion )
        // InternalOSSWP.g:483:3: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_4);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

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

        // InternalOSSWP.g:510:4: ( ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) )
        // InternalOSSWP.g:510:4: ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalOSSWP.g:510:4: ({...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        // InternalOSSWP.g:511:5: {...}? => ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalOSSWP.g:511:109: ( ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        // InternalOSSWP.g:512:6: ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1);
        // InternalOSSWP.g:515:6: ({...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        // InternalOSSWP.g:515:7: {...}? => (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalOSSWP", "true");
        }
        // InternalOSSWP.g:515:16: (otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        // InternalOSSWP.g:515:18: otherlv_12= 'os' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_13); if (state.failed) return ;
        otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalOSSWP.g:523:1: ( ( ruleVersionedQualifiedName ) )
        // InternalOSSWP.g:524:1: ( ruleVersionedQualifiedName )
        {
        // InternalOSSWP.g:524:1: ( ruleVersionedQualifiedName )
        // InternalOSSWP.g:525:3: ruleVersionedQualifiedName
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

        otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;

        // InternalOSSWP.g:552:4: ( ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) ) )
        // InternalOSSWP.g:552:4: ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) )
        {
        // InternalOSSWP.g:552:4: ({...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) ) )
        // InternalOSSWP.g:553:5: {...}? => ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2)");
        }
        // InternalOSSWP.g:553:109: ( ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) ) )
        // InternalOSSWP.g:554:6: ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2);
        // InternalOSSWP.g:557:6: ({...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' ) )
        // InternalOSSWP.g:557:7: {...}? => (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWP", "true");
        }
        // InternalOSSWP.g:557:16: (otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';' )
        // InternalOSSWP.g:557:18: otherlv_16= 'construction' otherlv_17= 'tools' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_22= ';'
        {
        otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_13); if (state.failed) return ;
        otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalOSSWP.g:569:1: ( ( ruleVersionedQualifiedName ) )
        // InternalOSSWP.g:570:1: ( ruleVersionedQualifiedName )
        {
        // InternalOSSWP.g:570:1: ( ruleVersionedQualifiedName )
        // InternalOSSWP.g:571:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_16);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalOSSWP.g:587:2: (otherlv_20= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop16:
        do {
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }


            switch (alt16) {
        	case 1 :
        	    // InternalOSSWP.g:587:4: otherlv_20= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalOSSWP.g:591:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalOSSWP.g:592:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalOSSWP.g:592:1: ( ruleVersionedQualifiedName )
        	    // InternalOSSWP.g:593:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_16);
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

        otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalOSSWP

    // $ANTLR start synpred15_InternalOSSWP
    public final void synpred15_InternalOSSWP_fragment() throws RecognitionException {   
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;

        // InternalOSSWP.g:620:4: ( ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) ) )
        // InternalOSSWP.g:620:4: ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) )
        {
        // InternalOSSWP.g:620:4: ({...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) ) )
        // InternalOSSWP.g:621:5: {...}? => ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3)");
        }
        // InternalOSSWP.g:621:109: ( ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) ) )
        // InternalOSSWP.g:622:6: ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3);
        // InternalOSSWP.g:625:6: ({...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' ) )
        // InternalOSSWP.g:625:7: {...}? => (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalOSSWP", "true");
        }
        // InternalOSSWP.g:625:16: (otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';' )
        // InternalOSSWP.g:625:18: otherlv_23= 'provided' otherlv_24= 'osswis' otherlv_25= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_29= ';'
        {
        otherlv_23=(Token)match(input,26,FollowSets000.FOLLOW_17); if (state.failed) return ;
        otherlv_24=(Token)match(input,27,FollowSets000.FOLLOW_13); if (state.failed) return ;
        otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalOSSWP.g:637:1: ( ( ruleVersionedQualifiedName ) )
        // InternalOSSWP.g:638:1: ( ruleVersionedQualifiedName )
        {
        // InternalOSSWP.g:638:1: ( ruleVersionedQualifiedName )
        // InternalOSSWP.g:639:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_16);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalOSSWP.g:655:2: (otherlv_27= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop17:
        do {
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }


            switch (alt17) {
        	case 1 :
        	    // InternalOSSWP.g:655:4: otherlv_27= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalOSSWP.g:659:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalOSSWP.g:660:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalOSSWP.g:660:1: ( ruleVersionedQualifiedName )
        	    // InternalOSSWP.g:661:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_16);
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

        otherlv_29=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalOSSWP

    // Delegated rules

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000005A00000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000015A00000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    }


}