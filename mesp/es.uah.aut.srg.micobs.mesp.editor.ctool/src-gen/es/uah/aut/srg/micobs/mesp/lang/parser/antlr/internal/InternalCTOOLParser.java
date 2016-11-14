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
import es.uah.aut.srg.micobs.mesp.lang.services.CTOOLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCTOOLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'construction'", "'tool'", "'extends'", "','", "'{'", "'version'", "':='", "'supported'", "'languages'", "'}'"
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


        public InternalCTOOLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCTOOLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCTOOLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCTOOL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private CTOOLGrammarAccess grammarAccess;
     	
        public InternalCTOOLParser(TokenStream input, CTOOLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MMESPCTOOLPackageFile";	
       	}
       	
       	@Override
       	protected CTOOLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMMESPCTOOLPackageFile"
    // InternalCTOOL.g:74:1: entryRuleMMESPCTOOLPackageFile returns [EObject current=null] : iv_ruleMMESPCTOOLPackageFile= ruleMMESPCTOOLPackageFile EOF ;
    public final EObject entryRuleMMESPCTOOLPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPCTOOLPackageFile = null;


        try {
            // InternalCTOOL.g:75:2: (iv_ruleMMESPCTOOLPackageFile= ruleMMESPCTOOLPackageFile EOF )
            // InternalCTOOL.g:76:2: iv_ruleMMESPCTOOLPackageFile= ruleMMESPCTOOLPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPCTOOLPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPCTOOLPackageFile=ruleMMESPCTOOLPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPCTOOLPackageFile; 
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
    // $ANTLR end "entryRuleMMESPCTOOLPackageFile"


    // $ANTLR start "ruleMMESPCTOOLPackageFile"
    // InternalCTOOL.g:83:1: ruleMMESPCTOOLPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPCTOOLPackageElement ) ) ) ;
    public final EObject ruleMMESPCTOOLPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // InternalCTOOL.g:86:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPCTOOLPackageElement ) ) ) )
            // InternalCTOOL.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPCTOOLPackageElement ) ) )
            {
            // InternalCTOOL.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPCTOOLPackageElement ) ) )
            // InternalCTOOL.g:87:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPCTOOLPackageElement ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageKeyword_0());
                  
            }
            // InternalCTOOL.g:91:1: ( ( ruleQualifiedName ) )
            // InternalCTOOL.g:92:1: ( ruleQualifiedName )
            {
            // InternalCTOOL.g:92:1: ( ruleQualifiedName )
            // InternalCTOOL.g:93:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPCTOOLPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
              	    
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

                  	newLeafNode(otherlv_2, grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // InternalCTOOL.g:113:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCTOOL.g:113:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMESPCTOOLPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // InternalCTOOL.g:117:1: ( ( ruleQualifiedName ) )
            	    // InternalCTOOL.g:118:1: ( ruleQualifiedName )
            	    {
            	    // InternalCTOOL.g:118:1: ( ruleQualifiedName )
            	    // InternalCTOOL.g:119:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPCTOOLPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            	      	    
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

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCTOOL.g:139:3: ( (lv_element_6_0= ruleMMESPCTOOLPackageElement ) )
            // InternalCTOOL.g:140:1: (lv_element_6_0= ruleMMESPCTOOLPackageElement )
            {
            // InternalCTOOL.g:140:1: (lv_element_6_0= ruleMMESPCTOOLPackageElement )
            // InternalCTOOL.g:141:3: lv_element_6_0= ruleMMESPCTOOLPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPCTOOLPackageFileAccess().getElementMMESPCTOOLPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_6_0=ruleMMESPCTOOLPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMESPCTOOLPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"es.uah.aut.srg.micobs.mesp.lang.CTOOL.MMESPCTOOLPackageElement");
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
    // $ANTLR end "ruleMMESPCTOOLPackageFile"


    // $ANTLR start "entryRuleMMESPCTOOLPackageElement"
    // InternalCTOOL.g:165:1: entryRuleMMESPCTOOLPackageElement returns [EObject current=null] : iv_ruleMMESPCTOOLPackageElement= ruleMMESPCTOOLPackageElement EOF ;
    public final EObject entryRuleMMESPCTOOLPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPCTOOLPackageElement = null;


        try {
            // InternalCTOOL.g:166:2: (iv_ruleMMESPCTOOLPackageElement= ruleMMESPCTOOLPackageElement EOF )
            // InternalCTOOL.g:167:2: iv_ruleMMESPCTOOLPackageElement= ruleMMESPCTOOLPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPCTOOLPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPCTOOLPackageElement=ruleMMESPCTOOLPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPCTOOLPackageElement; 
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
    // $ANTLR end "entryRuleMMESPCTOOLPackageElement"


    // $ANTLR start "ruleMMESPCTOOLPackageElement"
    // InternalCTOOL.g:174:1: ruleMMESPCTOOLPackageElement returns [EObject current=null] : this_MConstructionTool_0= ruleMConstructionTool ;
    public final EObject ruleMMESPCTOOLPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MConstructionTool_0 = null;


         enterRule(); 
            
        try {
            // InternalCTOOL.g:177:28: (this_MConstructionTool_0= ruleMConstructionTool )
            // InternalCTOOL.g:179:2: this_MConstructionTool_0= ruleMConstructionTool
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMESPCTOOLPackageElementAccess().getMConstructionToolParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_MConstructionTool_0=ruleMConstructionTool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MConstructionTool_0; 
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
    // $ANTLR end "ruleMMESPCTOOLPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCTOOL.g:198:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCTOOL.g:199:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCTOOL.g:200:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalCTOOL.g:207:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalCTOOL.g:210:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCTOOL.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCTOOL.g:211:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCTOOL.g:211:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalCTOOL.g:218:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCTOOL.g:219:2: kw= '.' this_ID_2= RULE_ID
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
    // InternalCTOOL.g:239:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalCTOOL.g:240:2: (iv_ruleVersion= ruleVersion EOF )
            // InternalCTOOL.g:241:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalCTOOL.g:248:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalCTOOL.g:251:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalCTOOL.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalCTOOL.g:252:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalCTOOL.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalCTOOL.g:252:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
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
                    // InternalCTOOL.g:252:7: this_INT_0= RULE_INT
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
                    // InternalCTOOL.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalCTOOL.g:260:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalCTOOL.g:260:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalCTOOL.g:260:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCTOOL.g:260:12: this_INT_1= RULE_INT
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

            // InternalCTOOL.g:274:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCTOOL.g:275:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalCTOOL.g:280:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
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
            	            // InternalCTOOL.g:280:6: this_INT_4= RULE_INT
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
            	            // InternalCTOOL.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalCTOOL.g:288:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalCTOOL.g:288:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalCTOOL.g:288:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // InternalCTOOL.g:288:12: this_INT_5= RULE_INT
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
    // InternalCTOOL.g:310:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalCTOOL.g:311:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalCTOOL.g:312:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalCTOOL.g:319:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // InternalCTOOL.g:322:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalCTOOL.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalCTOOL.g:323:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalCTOOL.g:324:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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


    // $ANTLR start "entryRuleMConstructionTool"
    // InternalCTOOL.g:367:1: entryRuleMConstructionTool returns [EObject current=null] : iv_ruleMConstructionTool= ruleMConstructionTool EOF ;
    public final EObject entryRuleMConstructionTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMConstructionTool = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5()
        		);
        	
        try {
            // InternalCTOOL.g:373:2: (iv_ruleMConstructionTool= ruleMConstructionTool EOF )
            // InternalCTOOL.g:374:2: iv_ruleMConstructionTool= ruleMConstructionTool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMConstructionToolRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMConstructionTool=ruleMConstructionTool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMConstructionTool; 
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
    // $ANTLR end "entryRuleMConstructionTool"


    // $ANTLR start "ruleMConstructionTool"
    // InternalCTOOL.g:384:1: ruleMConstructionTool returns [EObject current=null] : (otherlv_0= 'construction' otherlv_1= 'tool' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';' ) ;
    public final EObject ruleMConstructionTool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
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
        AntlrDatatypeRuleToken lv_version_11_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5()
        		);
            
        try {
            // InternalCTOOL.g:390:28: ( (otherlv_0= 'construction' otherlv_1= 'tool' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';' ) )
            // InternalCTOOL.g:391:1: (otherlv_0= 'construction' otherlv_1= 'tool' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';' )
            {
            // InternalCTOOL.g:391:1: (otherlv_0= 'construction' otherlv_1= 'tool' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';' )
            // InternalCTOOL.g:391:3: otherlv_0= 'construction' otherlv_1= 'tool' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMConstructionToolAccess().getConstructionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMConstructionToolAccess().getToolKeyword_1());
                  
            }
            // InternalCTOOL.g:399:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalCTOOL.g:400:1: (lv_name_2_0= RULE_ID )
            {
            // InternalCTOOL.g:400:1: (lv_name_2_0= RULE_ID )
            // InternalCTOOL.g:401:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMConstructionToolAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMConstructionToolRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalCTOOL.g:417:2: (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCTOOL.g:417:4: otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMConstructionToolAccess().getExtendsKeyword_3_0());
                          
                    }
                    // InternalCTOOL.g:421:1: ( ( ruleVersionedQualifiedName ) )
                    // InternalCTOOL.g:422:1: ( ruleVersionedQualifiedName )
                    {
                    // InternalCTOOL.g:422:1: ( ruleVersionedQualifiedName )
                    // InternalCTOOL.g:423:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMConstructionToolRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCTOOL.g:439:2: (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCTOOL.g:439:4: otherlv_5= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getMConstructionToolAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalCTOOL.g:443:1: ( ( ruleVersionedQualifiedName ) )
                    	    // InternalCTOOL.g:444:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // InternalCTOOL.g:444:1: ( ruleVersionedQualifiedName )
                    	    // InternalCTOOL.g:445:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getMConstructionToolRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
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

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMConstructionToolAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalCTOOL.g:465:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) )
            // InternalCTOOL.g:467:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalCTOOL.g:467:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) )
            // InternalCTOOL.g:468:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5());
            // InternalCTOOL.g:471:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?)
            // InternalCTOOL.g:472:3: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?
            {
            // InternalCTOOL.g:472:3: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCTOOL.g:474:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // InternalCTOOL.g:474:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
            	    // InternalCTOOL.g:475:5: {...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMConstructionTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalCTOOL.g:475:114: ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
            	    // InternalCTOOL.g:476:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 0);
            	    // InternalCTOOL.g:479:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
            	    // InternalCTOOL.g:479:7: {...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMConstructionTool", "true");
            	    }
            	    // InternalCTOOL.g:479:16: (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
            	    // InternalCTOOL.g:479:18: otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMConstructionToolAccess().getVersionKeyword_5_0_0());
            	          
            	    }
            	    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_5_0_1());
            	          
            	    }
            	    // InternalCTOOL.g:487:1: ( (lv_version_11_0= ruleVersion ) )
            	    // InternalCTOOL.g:488:1: (lv_version_11_0= ruleVersion )
            	    {
            	    // InternalCTOOL.g:488:1: (lv_version_11_0= ruleVersion )
            	    // InternalCTOOL.g:489:3: lv_version_11_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_version_11_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMConstructionToolRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"version",
            	              		lv_version_11_0, 
            	              		"es.uah.aut.srg.micobs.mesp.lang.CTOOL.Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_5_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCTOOL.g:516:4: ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) )
            	    {
            	    // InternalCTOOL.g:516:4: ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) )
            	    // InternalCTOOL.g:517:5: {...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMConstructionTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalCTOOL.g:517:114: ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) )
            	    // InternalCTOOL.g:518:6: ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 1);
            	    // InternalCTOOL.g:521:6: ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) )
            	    // InternalCTOOL.g:521:7: {...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMConstructionTool", "true");
            	    }
            	    // InternalCTOOL.g:521:16: (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' )
            	    // InternalCTOOL.g:521:18: otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';'
            	    {
            	    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMConstructionToolAccess().getSupportedKeyword_5_1_0());
            	          
            	    }
            	    otherlv_14=(Token)match(input,25,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMConstructionToolAccess().getLanguagesKeyword_5_1_1());
            	          
            	    }
            	    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_5_1_2());
            	          
            	    }
            	    // InternalCTOOL.g:533:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalCTOOL.g:534:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalCTOOL.g:534:1: ( ruleVersionedQualifiedName )
            	    // InternalCTOOL.g:535:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMConstructionToolRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalCTOOL.g:551:2: (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==20) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalCTOOL.g:551:4: otherlv_17= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_17, grammarAccess.getMConstructionToolAccess().getCommaKeyword_5_1_4_0());
            	    	          
            	    	    }
            	    	    // InternalCTOOL.g:555:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalCTOOL.g:556:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalCTOOL.g:556:1: ( ruleVersionedQualifiedName )
            	    	    // InternalCTOOL.g:557:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMConstructionToolRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_4_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
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

            	    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_5_1_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMConstructionTool", "getUnorderedGroupHelper().canLeave(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5());

            }

            otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getMConstructionToolAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMConstructionTool"

    // $ANTLR start synpred10_InternalCTOOL
    public final void synpred10_InternalCTOOL_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_version_11_0 = null;


        // InternalCTOOL.g:474:4: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) )
        // InternalCTOOL.g:474:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
        {
        // InternalCTOOL.g:474:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
        // InternalCTOOL.g:475:5: {...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalCTOOL", "getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 0)");
        }
        // InternalCTOOL.g:475:114: ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
        // InternalCTOOL.g:476:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 0);
        // InternalCTOOL.g:479:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
        // InternalCTOOL.g:479:7: {...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalCTOOL", "true");
        }
        // InternalCTOOL.g:479:16: (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
        // InternalCTOOL.g:479:18: otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';'
        {
        otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_14); if (state.failed) return ;
        otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalCTOOL.g:487:1: ( (lv_version_11_0= ruleVersion ) )
        // InternalCTOOL.g:488:1: (lv_version_11_0= ruleVersion )
        {
        // InternalCTOOL.g:488:1: (lv_version_11_0= ruleVersion )
        // InternalCTOOL.g:489:3: lv_version_11_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_4);
        lv_version_11_0=ruleVersion();

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
    // $ANTLR end synpred10_InternalCTOOL

    // $ANTLR start synpred12_InternalCTOOL
    public final void synpred12_InternalCTOOL_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;

        // InternalCTOOL.g:516:4: ( ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) ) )
        // InternalCTOOL.g:516:4: ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) )
        {
        // InternalCTOOL.g:516:4: ({...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) ) )
        // InternalCTOOL.g:517:5: {...}? => ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalCTOOL", "getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 1)");
        }
        // InternalCTOOL.g:517:114: ( ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) ) )
        // InternalCTOOL.g:518:6: ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 1);
        // InternalCTOOL.g:521:6: ({...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' ) )
        // InternalCTOOL.g:521:7: {...}? => (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalCTOOL", "true");
        }
        // InternalCTOOL.g:521:16: (otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';' )
        // InternalCTOOL.g:521:18: otherlv_13= 'supported' otherlv_14= 'languages' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_19= ';'
        {
        otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_14=(Token)match(input,25,FollowSets000.FOLLOW_14); if (state.failed) return ;
        otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalCTOOL.g:533:1: ( ( ruleVersionedQualifiedName ) )
        // InternalCTOOL.g:534:1: ( ruleVersionedQualifiedName )
        {
        // InternalCTOOL.g:534:1: ( ruleVersionedQualifiedName )
        // InternalCTOOL.g:535:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_17);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCTOOL.g:551:2: (otherlv_17= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop15:
        do {
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }


            switch (alt15) {
        	case 1 :
        	    // InternalCTOOL.g:551:4: otherlv_17= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalCTOOL.g:555:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalCTOOL.g:556:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalCTOOL.g:556:1: ( ruleVersionedQualifiedName )
        	    // InternalCTOOL.g:557:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_17);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop15;
            }
        } while (true);

        otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalCTOOL

    // Delegated rules

    public final boolean synpred10_InternalCTOOL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalCTOOL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalCTOOL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalCTOOL_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000005400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000101000L});
    }


}