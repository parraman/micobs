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
import es.uah.aut.srg.micobs.mesp.lang.services.PSWPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPSWPParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'pswpackage'", "'{'", "'version'", "':='", "'supported'", "'platform'", "'construction'", "'tools'", "','", "'osswpackages'", "'}'"
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


        public InternalPSWPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPSWPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPSWPParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPSWP.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private PSWPGrammarAccess grammarAccess;
     	
        public InternalPSWPParser(TokenStream input, PSWPGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MMESPPSWPPackageFile";	
       	}
       	
       	@Override
       	protected PSWPGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMMESPPSWPPackageFile"
    // InternalPSWP.g:74:1: entryRuleMMESPPSWPPackageFile returns [EObject current=null] : iv_ruleMMESPPSWPPackageFile= ruleMMESPPSWPPackageFile EOF ;
    public final EObject entryRuleMMESPPSWPPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPPSWPPackageFile = null;


        try {
            // InternalPSWP.g:75:2: (iv_ruleMMESPPSWPPackageFile= ruleMMESPPSWPPackageFile EOF )
            // InternalPSWP.g:76:2: iv_ruleMMESPPSWPPackageFile= ruleMMESPPSWPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPPSWPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPPSWPPackageFile=ruleMMESPPSWPPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPPSWPPackageFile; 
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
    // $ANTLR end "entryRuleMMESPPSWPPackageFile"


    // $ANTLR start "ruleMMESPPSWPPackageFile"
    // InternalPSWP.g:83:1: ruleMMESPPSWPPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPPSWPPackageElement ) ) ) ;
    public final EObject ruleMMESPPSWPPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // InternalPSWP.g:86:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPPSWPPackageElement ) ) ) )
            // InternalPSWP.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPPSWPPackageElement ) ) )
            {
            // InternalPSWP.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPPSWPPackageElement ) ) )
            // InternalPSWP.g:87:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPPSWPPackageElement ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPPSWPPackageFileAccess().getPackageKeyword_0());
                  
            }
            // InternalPSWP.g:91:1: ( ( ruleQualifiedName ) )
            // InternalPSWP.g:92:1: ( ruleQualifiedName )
            {
            // InternalPSWP.g:92:1: ( ruleQualifiedName )
            // InternalPSWP.g:93:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPPSWPPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
              	    
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

                  	newLeafNode(otherlv_2, grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // InternalPSWP.g:113:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPSWP.g:113:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMESPPSWPPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // InternalPSWP.g:117:1: ( ( ruleQualifiedName ) )
            	    // InternalPSWP.g:118:1: ( ruleQualifiedName )
            	    {
            	    // InternalPSWP.g:118:1: ( ruleQualifiedName )
            	    // InternalPSWP.g:119:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPPSWPPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            	      	    
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

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPSWP.g:139:3: ( (lv_element_6_0= ruleMMESPPSWPPackageElement ) )
            // InternalPSWP.g:140:1: (lv_element_6_0= ruleMMESPPSWPPackageElement )
            {
            // InternalPSWP.g:140:1: (lv_element_6_0= ruleMMESPPSWPPackageElement )
            // InternalPSWP.g:141:3: lv_element_6_0= ruleMMESPPSWPPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPPSWPPackageFileAccess().getElementMMESPPSWPPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_6_0=ruleMMESPPSWPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMESPPSWPPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"es.uah.aut.srg.micobs.mesp.lang.PSWP.MMESPPSWPPackageElement");
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
    // $ANTLR end "ruleMMESPPSWPPackageFile"


    // $ANTLR start "entryRuleMMESPPSWPPackageElement"
    // InternalPSWP.g:165:1: entryRuleMMESPPSWPPackageElement returns [EObject current=null] : iv_ruleMMESPPSWPPackageElement= ruleMMESPPSWPPackageElement EOF ;
    public final EObject entryRuleMMESPPSWPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPPSWPPackageElement = null;


        try {
            // InternalPSWP.g:166:2: (iv_ruleMMESPPSWPPackageElement= ruleMMESPPSWPPackageElement EOF )
            // InternalPSWP.g:167:2: iv_ruleMMESPPSWPPackageElement= ruleMMESPPSWPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPPSWPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPPSWPPackageElement=ruleMMESPPSWPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPPSWPPackageElement; 
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
    // $ANTLR end "entryRuleMMESPPSWPPackageElement"


    // $ANTLR start "ruleMMESPPSWPPackageElement"
    // InternalPSWP.g:174:1: ruleMMESPPSWPPackageElement returns [EObject current=null] : this_MPlatformSwPackage_0= ruleMPlatformSwPackage ;
    public final EObject ruleMMESPPSWPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MPlatformSwPackage_0 = null;


         enterRule(); 
            
        try {
            // InternalPSWP.g:177:28: (this_MPlatformSwPackage_0= ruleMPlatformSwPackage )
            // InternalPSWP.g:179:2: this_MPlatformSwPackage_0= ruleMPlatformSwPackage
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMESPPSWPPackageElementAccess().getMPlatformSwPackageParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_MPlatformSwPackage_0=ruleMPlatformSwPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MPlatformSwPackage_0; 
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
    // $ANTLR end "ruleMMESPPSWPPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPSWP.g:198:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalPSWP.g:199:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalPSWP.g:200:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalPSWP.g:207:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalPSWP.g:210:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalPSWP.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalPSWP.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalPSWP.g:211:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalPSWP.g:218:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPSWP.g:219:2: kw= '.' this_ID_2= RULE_ID
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
    // InternalPSWP.g:239:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalPSWP.g:240:2: (iv_ruleVersion= ruleVersion EOF )
            // InternalPSWP.g:241:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalPSWP.g:248:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalPSWP.g:251:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalPSWP.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalPSWP.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalPSWP.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalPSWP.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
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
                    // InternalPSWP.g:252:7: this_INT_0= RULE_INT
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
                    // InternalPSWP.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalPSWP.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalPSWP.g:260:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalPSWP.g:260:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalPSWP.g:260:12: this_INT_1= RULE_INT
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

            // InternalPSWP.g:274:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPSWP.g:275:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalPSWP.g:280:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
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
            	            // InternalPSWP.g:280:6: this_INT_4= RULE_INT
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
            	            // InternalPSWP.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalPSWP.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalPSWP.g:288:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalPSWP.g:288:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // InternalPSWP.g:288:12: this_INT_5= RULE_INT
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
    // InternalPSWP.g:310:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalPSWP.g:311:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalPSWP.g:312:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalPSWP.g:319:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // InternalPSWP.g:322:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalPSWP.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalPSWP.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalPSWP.g:324:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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


    // $ANTLR start "entryRuleMPlatformSwPackage"
    // InternalPSWP.g:367:1: entryRuleMPlatformSwPackage returns [EObject current=null] : iv_ruleMPlatformSwPackage= ruleMPlatformSwPackage EOF ;
    public final EObject entryRuleMPlatformSwPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMPlatformSwPackage = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()
        		);
        	
        try {
            // InternalPSWP.g:373:2: (iv_ruleMPlatformSwPackage= ruleMPlatformSwPackage EOF )
            // InternalPSWP.g:374:2: iv_ruleMPlatformSwPackage= ruleMPlatformSwPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMPlatformSwPackageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMPlatformSwPackage=ruleMPlatformSwPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMPlatformSwPackage; 
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
    // $ANTLR end "entryRuleMPlatformSwPackage"


    // $ANTLR start "ruleMPlatformSwPackage"
    // InternalPSWP.g:384:1: ruleMPlatformSwPackage returns [EObject current=null] : (otherlv_0= 'pswpackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' otherlv_27= ';' ) ;
    public final EObject ruleMPlatformSwPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_version_6_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()
        		);
            
        try {
            // InternalPSWP.g:390:28: ( (otherlv_0= 'pswpackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' otherlv_27= ';' ) )
            // InternalPSWP.g:391:1: (otherlv_0= 'pswpackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalPSWP.g:391:1: (otherlv_0= 'pswpackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' otherlv_27= ';' )
            // InternalPSWP.g:391:3: otherlv_0= 'pswpackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMPlatformSwPackageAccess().getPswpackageKeyword_0());
                  
            }
            // InternalPSWP.g:395:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalPSWP.g:396:1: (lv_name_1_0= RULE_ID )
            {
            // InternalPSWP.g:396:1: (lv_name_1_0= RULE_ID )
            // InternalPSWP.g:397:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMPlatformSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMPlatformSwPackageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalPSWP.g:417:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?) ) )
            // InternalPSWP.g:419:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalPSWP.g:419:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?) )
            // InternalPSWP.g:420:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
            // InternalPSWP.g:423:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?)
            // InternalPSWP.g:424:3: ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+ {...}?
            {
            // InternalPSWP.g:424:3: ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=5;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                    alt10=4;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPSWP.g:426:4: ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalPSWP.g:426:4: ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) )
            	    // InternalPSWP.g:427:5: {...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMPlatformSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalPSWP.g:427:115: ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) )
            	    // InternalPSWP.g:428:6: ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0);
            	    // InternalPSWP.g:431:6: ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) )
            	    // InternalPSWP.g:431:7: {...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMPlatformSwPackage", "true");
            	    }
            	    // InternalPSWP.g:431:16: (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' )
            	    // InternalPSWP.g:431:18: otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMPlatformSwPackageAccess().getVersionKeyword_3_0_0());
            	          
            	    }
            	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_0_1());
            	          
            	    }
            	    // InternalPSWP.g:439:1: ( (lv_version_6_0= ruleVersion ) )
            	    // InternalPSWP.g:440:1: (lv_version_6_0= ruleVersion )
            	    {
            	    // InternalPSWP.g:440:1: (lv_version_6_0= ruleVersion )
            	    // InternalPSWP.g:441:3: lv_version_6_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_version_6_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMPlatformSwPackageRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"version",
            	              		lv_version_6_0, 
            	              		"es.uah.aut.srg.micobs.mesp.lang.PSWP.Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // InternalPSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) )
            	    // InternalPSWP.g:469:5: {...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMPlatformSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalPSWP.g:469:115: ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) )
            	    // InternalPSWP.g:470:6: ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1);
            	    // InternalPSWP.g:473:6: ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) )
            	    // InternalPSWP.g:473:7: {...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMPlatformSwPackage", "true");
            	    }
            	    // InternalPSWP.g:473:16: (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' )
            	    // InternalPSWP.g:473:18: otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMPlatformSwPackageAccess().getSupportedKeyword_3_1_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMPlatformSwPackageAccess().getPlatformKeyword_3_1_1());
            	          
            	    }
            	    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_1_2());
            	          
            	    }
            	    // InternalPSWP.g:485:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalPSWP.g:486:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalPSWP.g:486:1: ( ruleVersionedQualifiedName )
            	    // InternalPSWP.g:487:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_3_0()); 
            	      	    
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

            	    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_1_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPSWP.g:514:4: ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) )
            	    {
            	    // InternalPSWP.g:514:4: ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) )
            	    // InternalPSWP.g:515:5: {...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMPlatformSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalPSWP.g:515:115: ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) )
            	    // InternalPSWP.g:516:6: ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2);
            	    // InternalPSWP.g:519:6: ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) )
            	    // InternalPSWP.g:519:7: {...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMPlatformSwPackage", "true");
            	    }
            	    // InternalPSWP.g:519:16: (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' )
            	    // InternalPSWP.g:519:18: otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';'
            	    {
            	    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMPlatformSwPackageAccess().getConstructionKeyword_3_2_0());
            	          
            	    }
            	    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMPlatformSwPackageAccess().getToolsKeyword_3_2_1());
            	          
            	    }
            	    otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_2_2());
            	          
            	    }
            	    // InternalPSWP.g:531:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalPSWP.g:532:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalPSWP.g:532:1: ( ruleVersionedQualifiedName )
            	    // InternalPSWP.g:533:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_0()); 
            	      	    
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

            	    // InternalPSWP.g:549:2: (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==25) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalPSWP.g:549:4: otherlv_17= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_17, grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_2_4_0());
            	    	          
            	    	    }
            	    	    // InternalPSWP.g:553:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalPSWP.g:554:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalPSWP.g:554:1: ( ruleVersionedQualifiedName )
            	    	    // InternalPSWP.g:555:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_4_1_0()); 
            	    	      	    
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
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPSWP.g:582:4: ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) )
            	    {
            	    // InternalPSWP.g:582:4: ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) )
            	    // InternalPSWP.g:583:5: {...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMPlatformSwPackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalPSWP.g:583:115: ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) )
            	    // InternalPSWP.g:584:6: ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3);
            	    // InternalPSWP.g:587:6: ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) )
            	    // InternalPSWP.g:587:7: {...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMPlatformSwPackage", "true");
            	    }
            	    // InternalPSWP.g:587:16: (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' )
            	    // InternalPSWP.g:587:18: otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';'
            	    {
            	    otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMPlatformSwPackageAccess().getOsswpackagesKeyword_3_3_0());
            	          
            	    }
            	    otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_3_1());
            	          
            	    }
            	    // InternalPSWP.g:595:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalPSWP.g:596:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalPSWP.g:596:1: ( ruleVersionedQualifiedName )
            	    // InternalPSWP.g:597:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0()); 
            	      	    
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

            	    // InternalPSWP.g:613:2: (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==25) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalPSWP.g:613:4: otherlv_23= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_23, grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_3_3_0());
            	    	          
            	    	    }
            	    	    // InternalPSWP.g:617:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalPSWP.g:618:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalPSWP.g:618:1: ( ruleVersionedQualifiedName )
            	    	    // InternalPSWP.g:619:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0()); 
            	    	      	    
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
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_3_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMPlatformSwPackage", "getUnorderedGroupHelper().canLeave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());

            }

            otherlv_26=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_26, grammarAccess.getMPlatformSwPackageAccess().getRightCurlyBracketKeyword_4());
                  
            }
            otherlv_27=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_27, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleMPlatformSwPackage"

    // $ANTLR start synpred8_InternalPSWP
    public final void synpred8_InternalPSWP_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_version_6_0 = null;


        // InternalPSWP.g:426:4: ( ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) ) )
        // InternalPSWP.g:426:4: ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalPSWP.g:426:4: ({...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) ) )
        // InternalPSWP.g:427:5: {...}? => ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalPSWP.g:427:115: ( ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) ) )
        // InternalPSWP.g:428:6: ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0);
        // InternalPSWP.g:431:6: ({...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' ) )
        // InternalPSWP.g:431:7: {...}? => (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalPSWP", "true");
        }
        // InternalPSWP.g:431:16: (otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';' )
        // InternalPSWP.g:431:18: otherlv_4= 'version' otherlv_5= ':=' ( (lv_version_6_0= ruleVersion ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_12); if (state.failed) return ;
        otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalPSWP.g:439:1: ( (lv_version_6_0= ruleVersion ) )
        // InternalPSWP.g:440:1: (lv_version_6_0= ruleVersion )
        {
        // InternalPSWP.g:440:1: (lv_version_6_0= ruleVersion )
        // InternalPSWP.g:441:3: lv_version_6_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_4);
        lv_version_6_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalPSWP

    // $ANTLR start synpred9_InternalPSWP
    public final void synpred9_InternalPSWP_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;

        // InternalPSWP.g:468:4: ( ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) ) )
        // InternalPSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) )
        {
        // InternalPSWP.g:468:4: ({...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) ) )
        // InternalPSWP.g:469:5: {...}? => ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalPSWP.g:469:115: ( ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) ) )
        // InternalPSWP.g:470:6: ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1);
        // InternalPSWP.g:473:6: ({...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' ) )
        // InternalPSWP.g:473:7: {...}? => (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalPSWP", "true");
        }
        // InternalPSWP.g:473:16: (otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';' )
        // InternalPSWP.g:473:18: otherlv_8= 'supported' otherlv_9= 'platform' otherlv_10= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_12= ';'
        {
        otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_14); if (state.failed) return ;
        otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_12); if (state.failed) return ;
        otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalPSWP.g:485:1: ( ( ruleVersionedQualifiedName ) )
        // InternalPSWP.g:486:1: ( ruleVersionedQualifiedName )
        {
        // InternalPSWP.g:486:1: ( ruleVersionedQualifiedName )
        // InternalPSWP.g:487:3: ruleVersionedQualifiedName
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

        otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalPSWP

    // $ANTLR start synpred11_InternalPSWP
    public final void synpred11_InternalPSWP_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;

        // InternalPSWP.g:514:4: ( ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )
        // InternalPSWP.g:514:4: ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) )
        {
        // InternalPSWP.g:514:4: ({...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) )
        // InternalPSWP.g:515:5: {...}? => ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2)");
        }
        // InternalPSWP.g:515:115: ( ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) )
        // InternalPSWP.g:516:6: ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2);
        // InternalPSWP.g:519:6: ({...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) )
        // InternalPSWP.g:519:7: {...}? => (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalPSWP", "true");
        }
        // InternalPSWP.g:519:16: (otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' )
        // InternalPSWP.g:519:18: otherlv_13= 'construction' otherlv_14= 'tools' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';'
        {
        otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_12); if (state.failed) return ;
        otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalPSWP.g:531:1: ( ( ruleVersionedQualifiedName ) )
        // InternalPSWP.g:532:1: ( ruleVersionedQualifiedName )
        {
        // InternalPSWP.g:532:1: ( ruleVersionedQualifiedName )
        // InternalPSWP.g:533:3: ruleVersionedQualifiedName
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

        // InternalPSWP.g:549:2: (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop13:
        do {
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }


            switch (alt13) {
        	case 1 :
        	    // InternalPSWP.g:549:4: otherlv_17= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalPSWP.g:553:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalPSWP.g:554:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalPSWP.g:554:1: ( ruleVersionedQualifiedName )
        	    // InternalPSWP.g:555:3: ruleVersionedQualifiedName
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
        	    break loop13;
            }
        } while (true);

        otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalPSWP

    // $ANTLR start synpred13_InternalPSWP
    public final void synpred13_InternalPSWP_fragment() throws RecognitionException {   
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;

        // InternalPSWP.g:582:4: ( ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) ) )
        // InternalPSWP.g:582:4: ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) )
        {
        // InternalPSWP.g:582:4: ({...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) ) )
        // InternalPSWP.g:583:5: {...}? => ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3)");
        }
        // InternalPSWP.g:583:115: ( ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) ) )
        // InternalPSWP.g:584:6: ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3);
        // InternalPSWP.g:587:6: ({...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' ) )
        // InternalPSWP.g:587:7: {...}? => (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalPSWP", "true");
        }
        // InternalPSWP.g:587:16: (otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';' )
        // InternalPSWP.g:587:18: otherlv_20= 'osswpackages' otherlv_21= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_25= ';'
        {
        otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_12); if (state.failed) return ;
        otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalPSWP.g:595:1: ( ( ruleVersionedQualifiedName ) )
        // InternalPSWP.g:596:1: ( ruleVersionedQualifiedName )
        {
        // InternalPSWP.g:596:1: ( ruleVersionedQualifiedName )
        // InternalPSWP.g:597:3: ruleVersionedQualifiedName
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

        // InternalPSWP.g:613:2: (otherlv_23= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop14:
        do {
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }


            switch (alt14) {
        	case 1 :
        	    // InternalPSWP.g:613:4: otherlv_23= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalPSWP.g:617:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalPSWP.g:618:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalPSWP.g:618:1: ( ruleVersionedQualifiedName )
        	    // InternalPSWP.g:619:3: ruleVersionedQualifiedName
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
        	    break loop14;
            }
        } while (true);

        otherlv_25=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalPSWP

    // Delegated rules

    public final boolean synpred13_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalPSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalPSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalPSWP_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004A80000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000CA80000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002001000L});
    }


}