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
import es.uah.aut.srg.micobs.mesp.lang.services.SWIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSWIParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'swinterface'", "'extends'", "','", "'{'", "'version'", "':='", "'language'", "'configuration'", "'parameters'", "'}'", "'provided'", "'resources'", "'requires'", "'required'", "'osapi'", "'quantifiable'", "'resource'", "'step'", "'to'", "'instantiable'", "'const'", "'integer'", "'range'", "'enum'", "'real'", "'='", "'raw'", "'boolean'", "'string'", "'true'", "'false'", "'-'", "'e'", "']'", "'['", "'+'", "'*'", "'/'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
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


        public InternalSWIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSWIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSWIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSWI.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SWIGrammarAccess grammarAccess;
     	
        public InternalSWIParser(TokenStream input, SWIGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MMESPSWIPackageFile";	
       	}
       	
       	@Override
       	protected SWIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMMESPSWIPackageFile"
    // InternalSWI.g:75:1: entryRuleMMESPSWIPackageFile returns [EObject current=null] : iv_ruleMMESPSWIPackageFile= ruleMMESPSWIPackageFile EOF ;
    public final EObject entryRuleMMESPSWIPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPSWIPackageFile = null;


        try {
            // InternalSWI.g:76:2: (iv_ruleMMESPSWIPackageFile= ruleMMESPSWIPackageFile EOF )
            // InternalSWI.g:77:2: iv_ruleMMESPSWIPackageFile= ruleMMESPSWIPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPSWIPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPSWIPackageFile=ruleMMESPSWIPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPSWIPackageFile; 
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
    // $ANTLR end "entryRuleMMESPSWIPackageFile"


    // $ANTLR start "ruleMMESPSWIPackageFile"
    // InternalSWI.g:84:1: ruleMMESPSWIPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPSWIPackageElement ) ) ) ;
    public final EObject ruleMMESPSWIPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:87:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPSWIPackageElement ) ) ) )
            // InternalSWI.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPSWIPackageElement ) ) )
            {
            // InternalSWI.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPSWIPackageElement ) ) )
            // InternalSWI.g:88:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPSWIPackageElement ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPSWIPackageFileAccess().getPackageKeyword_0());
                  
            }
            // InternalSWI.g:92:1: ( ( ruleQualifiedName ) )
            // InternalSWI.g:93:1: ( ruleQualifiedName )
            {
            // InternalSWI.g:93:1: ( ruleQualifiedName )
            // InternalSWI.g:94:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMESPSWIPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPSWIPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
              	    
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

                  	newLeafNode(otherlv_2, grammarAccess.getMMESPSWIPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // InternalSWI.g:114:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSWI.g:114:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMESPSWIPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // InternalSWI.g:118:1: ( ( ruleQualifiedName ) )
            	    // InternalSWI.g:119:1: ( ruleQualifiedName )
            	    {
            	    // InternalSWI.g:119:1: ( ruleQualifiedName )
            	    // InternalSWI.g:120:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMESPSWIPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMESPSWIPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            	      	    
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

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPSWIPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSWI.g:140:3: ( (lv_element_6_0= ruleMMESPSWIPackageElement ) )
            // InternalSWI.g:141:1: (lv_element_6_0= ruleMMESPSWIPackageElement )
            {
            // InternalSWI.g:141:1: (lv_element_6_0= ruleMMESPSWIPackageElement )
            // InternalSWI.g:142:3: lv_element_6_0= ruleMMESPSWIPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPSWIPackageFileAccess().getElementMMESPSWIPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_6_0=ruleMMESPSWIPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMESPSWIPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MMESPSWIPackageElement");
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
    // $ANTLR end "ruleMMESPSWIPackageFile"


    // $ANTLR start "entryRuleMMESPSWIPackageElement"
    // InternalSWI.g:166:1: entryRuleMMESPSWIPackageElement returns [EObject current=null] : iv_ruleMMESPSWIPackageElement= ruleMMESPSWIPackageElement EOF ;
    public final EObject entryRuleMMESPSWIPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPSWIPackageElement = null;


        try {
            // InternalSWI.g:167:2: (iv_ruleMMESPSWIPackageElement= ruleMMESPSWIPackageElement EOF )
            // InternalSWI.g:168:2: iv_ruleMMESPSWIPackageElement= ruleMMESPSWIPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPSWIPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPSWIPackageElement=ruleMMESPSWIPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPSWIPackageElement; 
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
    // $ANTLR end "entryRuleMMESPSWIPackageElement"


    // $ANTLR start "ruleMMESPSWIPackageElement"
    // InternalSWI.g:175:1: ruleMMESPSWIPackageElement returns [EObject current=null] : this_MSwInterface_0= ruleMSwInterface ;
    public final EObject ruleMMESPSWIPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MSwInterface_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:178:28: (this_MSwInterface_0= ruleMSwInterface )
            // InternalSWI.g:180:2: this_MSwInterface_0= ruleMSwInterface
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMESPSWIPackageElementAccess().getMSwInterfaceParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_MSwInterface_0=ruleMSwInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MSwInterface_0; 
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
    // $ANTLR end "ruleMMESPSWIPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSWI.g:199:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSWI.g:200:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSWI.g:201:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSWI.g:208:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSWI.g:211:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSWI.g:212:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSWI.g:212:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSWI.g:212:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSWI.g:219:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSWI.g:220:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_3); if (state.failed) return current;
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
    // InternalSWI.g:240:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalSWI.g:241:2: (iv_ruleVersion= ruleVersion EOF )
            // InternalSWI.g:242:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalSWI.g:249:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalSWI.g:252:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalSWI.g:253:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalSWI.g:253:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalSWI.g:253:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalSWI.g:253:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
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
                    // InternalSWI.g:253:7: this_INT_0= RULE_INT
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
                    // InternalSWI.g:261:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalSWI.g:261:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalSWI.g:261:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalSWI.g:261:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSWI.g:261:12: this_INT_1= RULE_INT
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

            // InternalSWI.g:275:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSWI.g:276:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalSWI.g:281:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
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
            	            // InternalSWI.g:281:6: this_INT_4= RULE_INT
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
            	            // InternalSWI.g:289:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalSWI.g:289:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalSWI.g:289:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalSWI.g:289:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // InternalSWI.g:289:12: this_INT_5= RULE_INT
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
    // InternalSWI.g:311:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalSWI.g:312:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalSWI.g:313:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalSWI.g:320:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:323:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalSWI.g:324:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalSWI.g:324:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalSWI.g:325:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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
            kw=(Token)match(input,16,FollowSets000.FOLLOW_7); if (state.failed) return current;
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
            kw=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:366:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalSWI.g:367:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalSWI.g:368:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalSWI.g:375:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:378:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalSWI.g:379:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalSWI.g:379:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalSWI.g:379:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalSWI.g:379:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
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
                    // InternalSWI.g:380:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VersionedQualifiedName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // InternalSWI.g:403:1: (kw= '::' this_ID_4= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSWI.g:404:2: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            	          
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMSwInterface"
    // InternalSWI.g:424:1: entryRuleMSwInterface returns [EObject current=null] : iv_ruleMSwInterface= ruleMSwInterface EOF ;
    public final EObject entryRuleMSwInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMSwInterface = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // InternalSWI.g:430:2: (iv_ruleMSwInterface= ruleMSwInterface EOF )
            // InternalSWI.g:431:2: iv_ruleMSwInterface= ruleMSwInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMSwInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMSwInterface=ruleMSwInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMSwInterface; 
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
    // $ANTLR end "entryRuleMSwInterface"


    // $ANTLR start "ruleMSwInterface"
    // InternalSWI.g:441:1: ruleMSwInterface returns [EObject current=null] : (otherlv_0= 'swinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?) ) ) otherlv_39= '}' otherlv_40= ';' ) ;
    public final EObject ruleMSwInterface() throws RecognitionException {
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
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_providedResources_25_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4()
        		);
            
        try {
            // InternalSWI.g:447:28: ( (otherlv_0= 'swinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?) ) ) otherlv_39= '}' otherlv_40= ';' ) )
            // InternalSWI.g:448:1: (otherlv_0= 'swinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?) ) ) otherlv_39= '}' otherlv_40= ';' )
            {
            // InternalSWI.g:448:1: (otherlv_0= 'swinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?) ) ) otherlv_39= '}' otherlv_40= ';' )
            // InternalSWI.g:448:3: otherlv_0= 'swinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?) ) ) otherlv_39= '}' otherlv_40= ';'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMSwInterfaceAccess().getSwinterfaceKeyword_0());
                  
            }
            // InternalSWI.g:452:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSWI.g:453:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSWI.g:453:1: (lv_name_1_0= RULE_ID )
            // InternalSWI.g:454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMSwInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMSwInterfaceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSWI.g:470:2: (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSWI.g:470:4: otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMSwInterfaceAccess().getExtendsKeyword_2_0());
                          
                    }
                    // InternalSWI.g:474:1: ( ( ruleVersionedQualifiedName ) )
                    // InternalSWI.g:475:1: ( ruleVersionedQualifiedName )
                    {
                    // InternalSWI.g:475:1: ( ruleVersionedQualifiedName )
                    // InternalSWI.g:476:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMSwInterfaceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSWI.g:492:2: (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSWI.g:492:4: otherlv_4= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMSwInterfaceAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // InternalSWI.g:496:1: ( ( ruleVersionedQualifiedName ) )
                    	    // InternalSWI.g:497:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // InternalSWI.g:497:1: ( ruleVersionedQualifiedName )
                    	    // InternalSWI.g:498:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getMSwInterfaceRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
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

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMSwInterfaceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalSWI.g:518:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?) ) )
            // InternalSWI.g:520:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalSWI.g:520:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?) )
            // InternalSWI.g:521:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());
            // InternalSWI.g:524:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?)
            // InternalSWI.g:525:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+ {...}?
            {
            // InternalSWI.g:525:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=7;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
                    alt15=4;
                }
                else if ( LA15_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
                    alt15=5;
                }
                else if ( LA15_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
                    alt15=6;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalSWI.g:528:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalSWI.g:528:109: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalSWI.g:529:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0);
            	    // InternalSWI.g:532:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalSWI.g:532:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "true");
            	    }
            	    // InternalSWI.g:532:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalSWI.g:532:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMSwInterfaceAccess().getVersionKeyword_4_0_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_0_1());
            	          
            	    }
            	    // InternalSWI.g:540:1: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalSWI.g:541:1: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalSWI.g:541:1: (lv_version_10_0= ruleVersion )
            	    // InternalSWI.g:542:3: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMSwInterfaceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"version",
            	              		lv_version_10_0, 
            	              		"es.uah.aut.srg.micobs.mesp.lang.SWI.Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    // InternalSWI.g:570:5: {...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalSWI.g:570:109: ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    // InternalSWI.g:571:6: ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1);
            	    // InternalSWI.g:574:6: ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    // InternalSWI.g:574:7: {...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "true");
            	    }
            	    // InternalSWI.g:574:16: (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    // InternalSWI.g:574:18: otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMSwInterfaceAccess().getLanguageKeyword_4_1_0());
            	          
            	    }
            	    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_1_1());
            	          
            	    }
            	    // InternalSWI.g:582:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalSWI.g:583:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalSWI.g:583:1: ( ruleVersionedQualifiedName )
            	    // InternalSWI.g:584:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMSwInterfaceRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getLanguageMLanguageCrossReference_4_1_2_0()); 
            	      	    
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

            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_1_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
            	    {
            	    // InternalSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
            	    // InternalSWI.g:612:5: {...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalSWI.g:612:109: ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
            	    // InternalSWI.g:613:6: ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2);
            	    // InternalSWI.g:616:6: ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) )
            	    // InternalSWI.g:616:7: {...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "true");
            	    }
            	    // InternalSWI.g:616:16: (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' )
            	    // InternalSWI.g:616:18: otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';'
            	    {
            	    otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMSwInterfaceAccess().getConfigurationKeyword_4_2_0());
            	          
            	    }
            	    otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMSwInterfaceAccess().getParametersKeyword_4_2_1());
            	          
            	    }
            	    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMSwInterfaceAccess().getLeftCurlyBracketKeyword_4_2_2());
            	          
            	    }
            	    // InternalSWI.g:628:1: ( (lv_parameters_19_0= ruleMParameter ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( ((LA12_0>=39 && LA12_0<=40)||(LA12_0>=42 && LA12_0<=43)||(LA12_0>=46 && LA12_0<=47)) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalSWI.g:629:1: (lv_parameters_19_0= ruleMParameter )
            	    	    {
            	    	    // InternalSWI.g:629:1: (lv_parameters_19_0= ruleMParameter )
            	    	    // InternalSWI.g:630:3: lv_parameters_19_0= ruleMParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getParametersMParameterParserRuleCall_4_2_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_20);
            	    	    lv_parameters_19_0=ruleMParameter();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMSwInterfaceRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"parameters",
            	    	              		lv_parameters_19_0, 
            	    	              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameter");
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

            	    otherlv_20=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMSwInterfaceAccess().getRightCurlyBracketKeyword_4_2_4());
            	          
            	    }
            	    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSWI.g:661:4: ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) )
            	    {
            	    // InternalSWI.g:661:4: ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) )
            	    // InternalSWI.g:662:5: {...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalSWI.g:662:109: ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) )
            	    // InternalSWI.g:663:6: ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3);
            	    // InternalSWI.g:666:6: ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) )
            	    // InternalSWI.g:666:7: {...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "true");
            	    }
            	    // InternalSWI.g:666:16: (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' )
            	    // InternalSWI.g:666:18: otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';'
            	    {
            	    otherlv_22=(Token)match(input,29,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getMSwInterfaceAccess().getProvidedKeyword_4_3_0());
            	          
            	    }
            	    otherlv_23=(Token)match(input,30,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMSwInterfaceAccess().getResourcesKeyword_4_3_1());
            	          
            	    }
            	    otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_24, grammarAccess.getMSwInterfaceAccess().getLeftCurlyBracketKeyword_4_3_2());
            	          
            	    }
            	    // InternalSWI.g:678:1: ( (lv_providedResources_25_0= ruleMProvidedResource ) )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==34||LA13_0==38) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalSWI.g:679:1: (lv_providedResources_25_0= ruleMProvidedResource )
            	    	    {
            	    	    // InternalSWI.g:679:1: (lv_providedResources_25_0= ruleMProvidedResource )
            	    	    // InternalSWI.g:680:3: lv_providedResources_25_0= ruleMProvidedResource
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_3_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_23);
            	    	    lv_providedResources_25_0=ruleMProvidedResource();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMSwInterfaceRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"providedResources",
            	    	              		lv_providedResources_25_0, 
            	    	              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MProvidedResource");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
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

            	    otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_26, grammarAccess.getMSwInterfaceAccess().getRightCurlyBracketKeyword_4_3_4());
            	          
            	    }
            	    otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_3_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSWI.g:711:4: ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) )
            	    {
            	    // InternalSWI.g:711:4: ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) )
            	    // InternalSWI.g:712:5: {...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalSWI.g:712:109: ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) )
            	    // InternalSWI.g:713:6: ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4);
            	    // InternalSWI.g:716:6: ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) )
            	    // InternalSWI.g:716:7: {...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "true");
            	    }
            	    // InternalSWI.g:716:16: (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' )
            	    // InternalSWI.g:716:18: otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';'
            	    {
            	    otherlv_28=(Token)match(input,31,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_28, grammarAccess.getMSwInterfaceAccess().getRequiresKeyword_4_4_0());
            	          
            	    }
            	    otherlv_29=(Token)match(input,24,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_4_1());
            	          
            	    }
            	    // InternalSWI.g:724:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalSWI.g:725:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalSWI.g:725:1: ( ruleVersionedQualifiedName )
            	    // InternalSWI.g:726:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMSwInterfaceRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceCrossReference_4_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalSWI.g:742:2: (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==21) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalSWI.g:742:4: otherlv_31= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_31, grammarAccess.getMSwInterfaceAccess().getCommaKeyword_4_4_3_0());
            	    	          
            	    	    }
            	    	    // InternalSWI.g:746:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalSWI.g:747:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalSWI.g:747:1: ( ruleVersionedQualifiedName )
            	    	    // InternalSWI.g:748:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMSwInterfaceRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceCrossReference_4_4_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_33, grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_4_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSWI.g:775:4: ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) )
            	    {
            	    // InternalSWI.g:775:4: ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) )
            	    // InternalSWI.g:776:5: {...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalSWI.g:776:109: ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) )
            	    // InternalSWI.g:777:6: ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5);
            	    // InternalSWI.g:780:6: ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) )
            	    // InternalSWI.g:780:7: {...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMSwInterface", "true");
            	    }
            	    // InternalSWI.g:780:16: (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' )
            	    // InternalSWI.g:780:18: otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';'
            	    {
            	    otherlv_34=(Token)match(input,32,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_34, grammarAccess.getMSwInterfaceAccess().getRequiredKeyword_4_5_0());
            	          
            	    }
            	    otherlv_35=(Token)match(input,33,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_35, grammarAccess.getMSwInterfaceAccess().getOsapiKeyword_4_5_1());
            	          
            	    }
            	    otherlv_36=(Token)match(input,24,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_36, grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_5_2());
            	          
            	    }
            	    // InternalSWI.g:792:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalSWI.g:793:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalSWI.g:793:1: ( ruleVersionedQualifiedName )
            	    // InternalSWI.g:794:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMSwInterfaceRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getRequiredOSAPIMOperatingSystemAPICrossReference_4_5_3_0()); 
            	      	    
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

            	    otherlv_38=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_38, grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_5_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMSwInterface", "getUnorderedGroupHelper().canLeave(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());

            }

            otherlv_39=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_39, grammarAccess.getMSwInterfaceAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_40=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_40, grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMSwInterface"


    // $ANTLR start "entryRuleMProvidedResource"
    // InternalSWI.g:848:1: entryRuleMProvidedResource returns [EObject current=null] : iv_ruleMProvidedResource= ruleMProvidedResource EOF ;
    public final EObject entryRuleMProvidedResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMProvidedResource = null;


        try {
            // InternalSWI.g:849:2: (iv_ruleMProvidedResource= ruleMProvidedResource EOF )
            // InternalSWI.g:850:2: iv_ruleMProvidedResource= ruleMProvidedResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMProvidedResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMProvidedResource=ruleMProvidedResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMProvidedResource; 
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
    // $ANTLR end "entryRuleMProvidedResource"


    // $ANTLR start "ruleMProvidedResource"
    // InternalSWI.g:857:1: ruleMProvidedResource returns [EObject current=null] : (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource ) ;
    public final EObject ruleMProvidedResource() throws RecognitionException {
        EObject current = null;

        EObject this_MQuantifiableResource_0 = null;

        EObject this_MInstantiableResource_1 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:860:28: ( (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource ) )
            // InternalSWI.g:861:1: (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource )
            {
            // InternalSWI.g:861:1: (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSWI.g:862:2: this_MQuantifiableResource_0= ruleMQuantifiableResource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMProvidedResourceAccess().getMQuantifiableResourceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:875:2: this_MInstantiableResource_1= ruleMInstantiableResource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMProvidedResourceAccess().getMInstantiableResourceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:894:1: entryRuleMQuantifiableResource returns [EObject current=null] : iv_ruleMQuantifiableResource= ruleMQuantifiableResource EOF ;
    public final EObject entryRuleMQuantifiableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMQuantifiableResource = null;


        try {
            // InternalSWI.g:895:2: (iv_ruleMQuantifiableResource= ruleMQuantifiableResource EOF )
            // InternalSWI.g:896:2: iv_ruleMQuantifiableResource= ruleMQuantifiableResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMQuantifiableResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMQuantifiableResource=ruleMQuantifiableResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMQuantifiableResource; 
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
    // $ANTLR end "entryRuleMQuantifiableResource"


    // $ANTLR start "ruleMQuantifiableResource"
    // InternalSWI.g:903:1: ruleMQuantifiableResource returns [EObject current=null] : (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' ) ;
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
            // InternalSWI.g:906:28: ( (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' ) )
            // InternalSWI.g:907:1: (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' )
            {
            // InternalSWI.g:907:1: (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' )
            // InternalSWI.g:907:3: otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMQuantifiableResourceAccess().getQuantifiableKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMQuantifiableResourceAccess().getResourceKeyword_1());
                  
            }
            // InternalSWI.g:915:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSWI.g:916:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSWI.g:916:1: (lv_name_2_0= RULE_ID )
            // InternalSWI.g:917:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_27); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMQuantifiableResourceAccess().getStepKeyword_3());
                  
            }
            // InternalSWI.g:937:1: ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:938:1: (lv_lowerBound_4_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:938:1: (lv_lowerBound_4_0= ruleMParameterValueExpression )
            // InternalSWI.g:939:3: lv_lowerBound_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_29);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMQuantifiableResourceAccess().getToKeyword_5());
                  
            }
            // InternalSWI.g:959:1: ( (lv_upperBound_6_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:960:1: (lv_upperBound_6_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:960:1: (lv_upperBound_6_0= ruleMParameterValueExpression )
            // InternalSWI.g:961:3: lv_upperBound_6_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:989:1: entryRuleMInstantiableResource returns [EObject current=null] : iv_ruleMInstantiableResource= ruleMInstantiableResource EOF ;
    public final EObject entryRuleMInstantiableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInstantiableResource = null;


        try {
            // InternalSWI.g:990:2: (iv_ruleMInstantiableResource= ruleMInstantiableResource EOF )
            // InternalSWI.g:991:2: iv_ruleMInstantiableResource= ruleMInstantiableResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInstantiableResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMInstantiableResource=ruleMInstantiableResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInstantiableResource; 
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
    // $ANTLR end "entryRuleMInstantiableResource"


    // $ANTLR start "ruleMInstantiableResource"
    // InternalSWI.g:998:1: ruleMInstantiableResource returns [EObject current=null] : (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' ) ;
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
            // InternalSWI.g:1001:28: ( (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // InternalSWI.g:1002:1: (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalSWI.g:1002:1: (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' )
            // InternalSWI.g:1002:3: otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMInstantiableResourceAccess().getInstantiableKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMInstantiableResourceAccess().getResourceKeyword_1());
                  
            }
            // InternalSWI.g:1010:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSWI.g:1011:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSWI.g:1011:1: (lv_name_2_0= RULE_ID )
            // InternalSWI.g:1012:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMInstantiableResourceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalSWI.g:1032:1: ( (lv_parameters_4_0= ruleMParameter ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=39 && LA17_0<=40)||(LA17_0>=42 && LA17_0<=43)||(LA17_0>=46 && LA17_0<=47)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSWI.g:1033:1: (lv_parameters_4_0= ruleMParameter )
            	    {
            	    // InternalSWI.g:1033:1: (lv_parameters_4_0= ruleMParameter )
            	    // InternalSWI.g:1034:3: lv_parameters_4_0= ruleMParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMInstantiableResourceAccess().getParametersMParameterParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
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
            	              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMInstantiableResourceAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:1066:1: entryRuleMParameter returns [EObject current=null] : iv_ruleMParameter= ruleMParameter EOF ;
    public final EObject entryRuleMParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameter = null;


        try {
            // InternalSWI.g:1067:2: (iv_ruleMParameter= ruleMParameter EOF )
            // InternalSWI.g:1068:2: iv_ruleMParameter= ruleMParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameter=ruleMParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameter; 
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
    // $ANTLR end "entryRuleMParameter"


    // $ANTLR start "ruleMParameter"
    // InternalSWI.g:1075:1: ruleMParameter returns [EObject current=null] : (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition ) ;
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
            // InternalSWI.g:1078:28: ( (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition ) )
            // InternalSWI.g:1079:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )
            {
            // InternalSWI.g:1079:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )
            int alt18=6;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalSWI.g:1080:2: this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:1093:2: this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:1106:2: this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:1119:2: this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMRealParameterSingleExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:1132:2: this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMStringParameterSingleExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:1145:2: this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterAccess().getMEnumParameterDefinitionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1164:1: entryRuleMIntegerParameterSingleExpression returns [EObject current=null] : iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF ;
    public final EObject entryRuleMIntegerParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIntegerParameterSingleExpression = null;


        try {
            // InternalSWI.g:1165:2: (iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF )
            // InternalSWI.g:1166:2: iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMIntegerParameterSingleExpression=ruleMIntegerParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMIntegerParameterSingleExpression; 
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
    // $ANTLR end "entryRuleMIntegerParameterSingleExpression"


    // $ANTLR start "ruleMIntegerParameterSingleExpression"
    // InternalSWI.g:1173:1: ruleMIntegerParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleMIntegerParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_defaultValue_4_0 = null;

        EObject lv_range_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:1176:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) )
            // InternalSWI.g:1177:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            {
            // InternalSWI.g:1177:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            // InternalSWI.g:1177:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';'
            {
            // InternalSWI.g:1177:2: ( (lv_constant_0_0= 'const' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSWI.g:1178:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalSWI.g:1178:1: (lv_constant_0_0= 'const' )
                    // InternalSWI.g:1179:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,39,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_0_0, grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMIntegerParameterSingleExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "constant", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1());
                  
            }
            // InternalSWI.g:1196:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSWI.g:1197:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSWI.g:1197:1: (lv_name_2_0= RULE_ID )
            // InternalSWI.g:1198:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalSWI.g:1218:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:1219:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:1219:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // InternalSWI.g:1220:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_31);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSWI.g:1236:2: (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSWI.g:1236:4: otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) )
                    {
                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0());
                          
                    }
                    // InternalSWI.g:1240:1: ( (lv_range_6_0= ruleMParameterRange ) )
                    // InternalSWI.g:1241:1: (lv_range_6_0= ruleMParameterRange )
                    {
                    // InternalSWI.g:1241:1: (lv_range_6_0= ruleMParameterRange )
                    // InternalSWI.g:1242:3: lv_range_6_0= ruleMParameterRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
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
                              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:1270:1: entryRuleMEnumParameterDefinition returns [EObject current=null] : iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF ;
    public final EObject entryRuleMEnumParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterDefinition = null;


        try {
            // InternalSWI.g:1271:2: (iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF )
            // InternalSWI.g:1272:2: iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParameterDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMEnumParameterDefinition=ruleMEnumParameterDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParameterDefinition; 
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
    // $ANTLR end "entryRuleMEnumParameterDefinition"


    // $ANTLR start "ruleMEnumParameterDefinition"
    // InternalSWI.g:1279:1: ruleMEnumParameterDefinition returns [EObject current=null] : ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' ) ;
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
            // InternalSWI.g:1282:28: ( ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // InternalSWI.g:1283:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalSWI.g:1283:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' )
            // InternalSWI.g:1283:2: () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // InternalSWI.g:1283:2: ()
            // InternalSWI.g:1284:2: 
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

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1());
                  
            }
            // InternalSWI.g:1296:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSWI.g:1297:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSWI.g:1297:1: (lv_name_2_0= RULE_ID )
            // InternalSWI.g:1298:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalSWI.g:1318:1: ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) )
            // InternalSWI.g:1319:1: (lv_literals_4_0= ruleMEnumParameterLiteralRule )
            {
            // InternalSWI.g:1319:1: (lv_literals_4_0= ruleMEnumParameterLiteralRule )
            // InternalSWI.g:1320:3: lv_literals_4_0= ruleMEnumParameterLiteralRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_33);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MEnumParameterLiteralRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSWI.g:1336:2: (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSWI.g:1336:4: otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // InternalSWI.g:1340:1: ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) )
            	    // InternalSWI.g:1341:1: (lv_literals_6_0= ruleMEnumParameterLiteralRule )
            	    {
            	    // InternalSWI.g:1341:1: (lv_literals_6_0= ruleMEnumParameterLiteralRule )
            	    // InternalSWI.g:1342:3: lv_literals_6_0= ruleMEnumParameterLiteralRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_33);
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
            	              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MEnumParameterLiteralRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:1374:1: entryRuleMEnumParameterSingleExpression returns [EObject current=null] : iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF ;
    public final EObject entryRuleMEnumParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterSingleExpression = null;


        try {
            // InternalSWI.g:1375:2: (iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF )
            // InternalSWI.g:1376:2: iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMEnumParameterSingleExpression=ruleMEnumParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParameterSingleExpression; 
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
    // $ANTLR end "entryRuleMEnumParameterSingleExpression"


    // $ANTLR start "ruleMEnumParameterSingleExpression"
    // InternalSWI.g:1383:1: ruleMEnumParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleMEnumParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_defaultValue_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:1386:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' ) )
            // InternalSWI.g:1387:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' )
            {
            // InternalSWI.g:1387:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' )
            // InternalSWI.g:1387:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';'
            {
            // InternalSWI.g:1387:2: ( (lv_constant_0_0= 'const' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSWI.g:1388:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalSWI.g:1388:1: (lv_constant_0_0= 'const' )
                    // InternalSWI.g:1389:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,39,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_0_0, grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMEnumParameterSingleExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "constant", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1());
                  
            }
            // InternalSWI.g:1406:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalSWI.g:1407:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalSWI.g:1407:1: ( ruleVersionedQualifiedReferenceName )
            // InternalSWI.g:1408:3: ruleVersionedQualifiedReferenceName
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
            pushFollow(FollowSets000.FOLLOW_3);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSWI.g:1424:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalSWI.g:1425:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSWI.g:1425:1: (lv_name_3_0= RULE_ID )
            // InternalSWI.g:1426:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4());
                  
            }
            // InternalSWI.g:1446:1: ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:1447:1: (lv_defaultValue_5_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:1447:1: (lv_defaultValue_5_0= ruleMParameterValueExpression )
            // InternalSWI.g:1448:3: lv_defaultValue_5_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:1476:1: entryRuleMRealParameterSingleExpression returns [EObject current=null] : iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF ;
    public final EObject entryRuleMRealParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRealParameterSingleExpression = null;


        try {
            // InternalSWI.g:1477:2: (iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF )
            // InternalSWI.g:1478:2: iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMRealParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMRealParameterSingleExpression=ruleMRealParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMRealParameterSingleExpression; 
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
    // $ANTLR end "entryRuleMRealParameterSingleExpression"


    // $ANTLR start "ruleMRealParameterSingleExpression"
    // InternalSWI.g:1485:1: ruleMRealParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleMRealParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_defaultValue_4_0 = null;

        EObject lv_range_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:1488:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) )
            // InternalSWI.g:1489:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            {
            // InternalSWI.g:1489:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            // InternalSWI.g:1489:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';'
            {
            // InternalSWI.g:1489:2: ( (lv_constant_0_0= 'const' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSWI.g:1490:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalSWI.g:1490:1: (lv_constant_0_0= 'const' )
                    // InternalSWI.g:1491:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,39,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_0_0, grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMRealParameterSingleExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "constant", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1());
                  
            }
            // InternalSWI.g:1508:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSWI.g:1509:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSWI.g:1509:1: (lv_name_2_0= RULE_ID )
            // InternalSWI.g:1510:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalSWI.g:1530:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:1531:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:1531:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // InternalSWI.g:1532:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_31);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSWI.g:1548:2: (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSWI.g:1548:4: otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) )
                    {
                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0());
                          
                    }
                    // InternalSWI.g:1552:1: ( (lv_range_6_0= ruleMParameterRange ) )
                    // InternalSWI.g:1553:1: (lv_range_6_0= ruleMParameterRange )
                    {
                    // InternalSWI.g:1553:1: (lv_range_6_0= ruleMParameterRange )
                    // InternalSWI.g:1554:3: lv_range_6_0= ruleMParameterRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
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
                              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:1582:1: entryRuleMEnumParameterLiteralRule returns [EObject current=null] : iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF ;
    public final EObject entryRuleMEnumParameterLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterLiteralRule = null;


        try {
            // InternalSWI.g:1583:2: (iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF )
            // InternalSWI.g:1584:2: iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMEnumParameterLiteralRule=ruleMEnumParameterLiteralRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParameterLiteralRule; 
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
    // $ANTLR end "entryRuleMEnumParameterLiteralRule"


    // $ANTLR start "ruleMEnumParameterLiteralRule"
    // InternalSWI.g:1591:1: ruleMEnumParameterLiteralRule returns [EObject current=null] : (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral ) ;
    public final EObject ruleMEnumParameterLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject this_MEnumParameterLiteral_0 = null;

        EObject this_MEnumParamIntegerLiteral_1 = null;

        EObject this_MEnumParamRealLiteral_2 = null;

        EObject this_MEnumParamStringLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:1594:28: ( (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral ) )
            // InternalSWI.g:1595:1: (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral )
            {
            // InternalSWI.g:1595:1: (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral )
            int alt25=4;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||LA25_1==21||LA25_1==28) ) {
                    alt25=1;
                }
                else if ( (LA25_1==44) ) {
                    switch ( input.LA(3) ) {
                    case RULE_STRING:
                    case 45:
                        {
                        alt25=4;
                        }
                        break;
                    case 50:
                        {
                        int LA25_5 = input.LA(4);

                        if ( (LA25_5==RULE_INT) ) {
                            int LA25_6 = input.LA(5);

                            if ( (LA25_6==EOF||LA25_6==21||LA25_6==28) ) {
                                alt25=2;
                            }
                            else if ( (LA25_6==15) ) {
                                alt25=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        int LA25_6 = input.LA(4);

                        if ( (LA25_6==EOF||LA25_6==21||LA25_6==28) ) {
                            alt25=2;
                        }
                        else if ( (LA25_6==15) ) {
                            alt25=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HEXADECIMAL:
                        {
                        alt25=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSWI.g:1596:2: this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParameterLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:1609:2: this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamIntegerLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:1622:2: this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamRealLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:1635:2: this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1654:1: entryRuleMEnumParameterLiteral returns [EObject current=null] : iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF ;
    public final EObject entryRuleMEnumParameterLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterLiteral = null;


        try {
            // InternalSWI.g:1655:2: (iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF )
            // InternalSWI.g:1656:2: iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParameterLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMEnumParameterLiteral=ruleMEnumParameterLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParameterLiteral; 
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
    // $ANTLR end "entryRuleMEnumParameterLiteral"


    // $ANTLR start "ruleMEnumParameterLiteral"
    // InternalSWI.g:1663:1: ruleMEnumParameterLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMEnumParameterLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalSWI.g:1666:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSWI.g:1667:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSWI.g:1667:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSWI.g:1667:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSWI.g:1667:2: ()
            // InternalSWI.g:1668:2: 
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

            // InternalSWI.g:1676:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalSWI.g:1677:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSWI.g:1677:1: (lv_name_1_0= RULE_ID )
            // InternalSWI.g:1678:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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
    // InternalSWI.g:1702:1: entryRuleMEnumParamIntegerLiteral returns [EObject current=null] : iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF ;
    public final EObject entryRuleMEnumParamIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamIntegerLiteral = null;


        try {
            // InternalSWI.g:1703:2: (iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF )
            // InternalSWI.g:1704:2: iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParamIntegerLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMEnumParamIntegerLiteral=ruleMEnumParamIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParamIntegerLiteral; 
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
    // $ANTLR end "entryRuleMEnumParamIntegerLiteral"


    // $ANTLR start "ruleMEnumParamIntegerLiteral"
    // InternalSWI.g:1711:1: ruleMEnumParamIntegerLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMEnumParamIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:1714:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) ) )
            // InternalSWI.g:1715:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) )
            {
            // InternalSWI.g:1715:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) )
            // InternalSWI.g:1715:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) )
            {
            // InternalSWI.g:1715:2: ()
            // InternalSWI.g:1716:2: 
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

            // InternalSWI.g:1724:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalSWI.g:1725:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSWI.g:1725:1: (lv_name_1_0= RULE_ID )
            // InternalSWI.g:1726:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalSWI.g:1746:1: ( (lv_value_3_0= ruleINTEGER ) )
            // InternalSWI.g:1747:1: (lv_value_3_0= ruleINTEGER )
            {
            // InternalSWI.g:1747:1: (lv_value_3_0= ruleINTEGER )
            // InternalSWI.g:1748:3: lv_value_3_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.INTEGER");
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
    // InternalSWI.g:1772:1: entryRuleMEnumParamRealLiteral returns [EObject current=null] : iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF ;
    public final EObject entryRuleMEnumParamRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamRealLiteral = null;


        try {
            // InternalSWI.g:1773:2: (iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF )
            // InternalSWI.g:1774:2: iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParamRealLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMEnumParamRealLiteral=ruleMEnumParamRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParamRealLiteral; 
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
    // $ANTLR end "entryRuleMEnumParamRealLiteral"


    // $ANTLR start "ruleMEnumParamRealLiteral"
    // InternalSWI.g:1781:1: ruleMEnumParamRealLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) ) ;
    public final EObject ruleMEnumParamRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:1784:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) ) )
            // InternalSWI.g:1785:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) )
            {
            // InternalSWI.g:1785:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) )
            // InternalSWI.g:1785:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) )
            {
            // InternalSWI.g:1785:2: ()
            // InternalSWI.g:1786:2: 
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

            // InternalSWI.g:1794:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalSWI.g:1795:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSWI.g:1795:1: (lv_name_1_0= RULE_ID )
            // InternalSWI.g:1796:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalSWI.g:1816:1: ( (lv_value_3_0= ruleREAL ) )
            // InternalSWI.g:1817:1: (lv_value_3_0= ruleREAL )
            {
            // InternalSWI.g:1817:1: (lv_value_3_0= ruleREAL )
            // InternalSWI.g:1818:3: lv_value_3_0= ruleREAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.REAL");
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
    // InternalSWI.g:1842:1: entryRuleMEnumParamStringLiteral returns [EObject current=null] : iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF ;
    public final EObject entryRuleMEnumParamStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamStringLiteral = null;


        try {
            // InternalSWI.g:1843:2: (iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF )
            // InternalSWI.g:1844:2: iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMEnumParamStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMEnumParamStringLiteral=ruleMEnumParamStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMEnumParamStringLiteral; 
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
    // $ANTLR end "entryRuleMEnumParamStringLiteral"


    // $ANTLR start "ruleMEnumParamStringLiteral"
    // InternalSWI.g:1851:1: ruleMEnumParamStringLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleMEnumParamStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isRaw_3_0=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // InternalSWI.g:1854:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalSWI.g:1855:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalSWI.g:1855:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalSWI.g:1855:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) )
            {
            // InternalSWI.g:1855:2: ()
            // InternalSWI.g:1856:2: 
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

            // InternalSWI.g:1864:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalSWI.g:1865:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSWI.g:1865:1: (lv_name_1_0= RULE_ID )
            // InternalSWI.g:1866:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalSWI.g:1886:1: ( (lv_isRaw_3_0= 'raw' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSWI.g:1887:1: (lv_isRaw_3_0= 'raw' )
                    {
                    // InternalSWI.g:1887:1: (lv_isRaw_3_0= 'raw' )
                    // InternalSWI.g:1888:3: lv_isRaw_3_0= 'raw'
                    {
                    lv_isRaw_3_0=(Token)match(input,45,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isRaw_3_0, grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMEnumParamStringLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isRaw", true, "raw");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSWI.g:1901:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalSWI.g:1902:1: (lv_value_4_0= RULE_STRING )
            {
            // InternalSWI.g:1902:1: (lv_value_4_0= RULE_STRING )
            // InternalSWI.g:1903:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_4_0, grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParamStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
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
    // $ANTLR end "ruleMEnumParamStringLiteral"


    // $ANTLR start "entryRuleMBooleanParameterSingleExpression"
    // InternalSWI.g:1927:1: entryRuleMBooleanParameterSingleExpression returns [EObject current=null] : iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF ;
    public final EObject entryRuleMBooleanParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMBooleanParameterSingleExpression = null;


        try {
            // InternalSWI.g:1928:2: (iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF )
            // InternalSWI.g:1929:2: iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMBooleanParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMBooleanParameterSingleExpression=ruleMBooleanParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMBooleanParameterSingleExpression; 
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
    // $ANTLR end "entryRuleMBooleanParameterSingleExpression"


    // $ANTLR start "ruleMBooleanParameterSingleExpression"
    // InternalSWI.g:1936:1: ruleMBooleanParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleMBooleanParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_defaultValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:1939:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) )
            // InternalSWI.g:1940:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            {
            // InternalSWI.g:1940:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            // InternalSWI.g:1940:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';'
            {
            // InternalSWI.g:1940:2: ( (lv_constant_0_0= 'const' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSWI.g:1941:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalSWI.g:1941:1: (lv_constant_0_0= 'const' )
                    // InternalSWI.g:1942:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,39,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_0_0, grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMBooleanParameterSingleExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "constant", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1());
                  
            }
            // InternalSWI.g:1959:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSWI.g:1960:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSWI.g:1960:1: (lv_name_2_0= RULE_ID )
            // InternalSWI.g:1961:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalSWI.g:1981:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:1982:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:1982:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // InternalSWI.g:1983:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:2011:1: entryRuleMStringParameterSingleExpression returns [EObject current=null] : iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF ;
    public final EObject entryRuleMStringParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMStringParameterSingleExpression = null;


        try {
            // InternalSWI.g:2012:2: (iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF )
            // InternalSWI.g:2013:2: iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMStringParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMStringParameterSingleExpression=ruleMStringParameterSingleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMStringParameterSingleExpression; 
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
    // $ANTLR end "entryRuleMStringParameterSingleExpression"


    // $ANTLR start "ruleMStringParameterSingleExpression"
    // InternalSWI.g:2020:1: ruleMStringParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleMStringParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_defaultValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2023:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) )
            // InternalSWI.g:2024:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            {
            // InternalSWI.g:2024:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            // InternalSWI.g:2024:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';'
            {
            // InternalSWI.g:2024:2: ( (lv_constant_0_0= 'const' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSWI.g:2025:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalSWI.g:2025:1: (lv_constant_0_0= 'const' )
                    // InternalSWI.g:2026:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,39,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_0_0, grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMStringParameterSingleExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "constant", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1());
                  
            }
            // InternalSWI.g:2043:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSWI.g:2044:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSWI.g:2044:1: (lv_name_2_0= RULE_ID )
            // InternalSWI.g:2045:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalSWI.g:2065:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:2066:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:2066:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // InternalSWI.g:2067:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:2095:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSWI.g:2096:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSWI.g:2097:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalSWI.g:2104:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSWI.g:2107:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalSWI.g:2108:1: (kw= 'true' | kw= 'false' )
            {
            // InternalSWI.g:2108:1: (kw= 'true' | kw= 'false' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            else if ( (LA29_0==49) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSWI.g:2109:2: kw= 'true'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSWI.g:2116:2: kw= 'false'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:2129:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalSWI.g:2130:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalSWI.g:2131:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalSWI.g:2138:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;

         enterRule(); 
            
        try {
            // InternalSWI.g:2141:28: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalSWI.g:2142:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalSWI.g:2142:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||LA31_0==50) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_HEXADECIMAL) ) {
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
                    // InternalSWI.g:2142:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalSWI.g:2142:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalSWI.g:2142:3: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalSWI.g:2142:3: (kw= '-' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==50) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSWI.g:2143:2: kw= '-'
                            {
                            kw=(Token)match(input,50,FollowSets000.FOLLOW_43); if (state.failed) return current;
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
                    // InternalSWI.g:2156:10: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalSWI.g:2171:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // InternalSWI.g:2172:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalSWI.g:2173:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalSWI.g:2180:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // InternalSWI.g:2183:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalSWI.g:2184:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalSWI.g:2184:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalSWI.g:2184:2: (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalSWI.g:2184:2: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSWI.g:2185:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            // InternalSWI.g:2190:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalSWI.g:2190:8: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
                  
            }
            kw=(Token)match(input,15,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
                  
            }

            }

            // InternalSWI.g:2210:2: (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSWI.g:2211:2: kw= 'e' (kw= '-' )? this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0()); 
                          
                    }
                    // InternalSWI.g:2216:1: (kw= '-' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==50) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSWI.g:2217:2: kw= '-'
                            {
                            kw=(Token)match(input,50,FollowSets000.FOLLOW_43); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMParameterValue"
    // InternalSWI.g:2237:1: entryRuleMParameterValue returns [EObject current=null] : iv_ruleMParameterValue= ruleMParameterValue EOF ;
    public final EObject entryRuleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValue = null;


        try {
            // InternalSWI.g:2238:2: (iv_ruleMParameterValue= ruleMParameterValue EOF )
            // InternalSWI.g:2239:2: iv_ruleMParameterValue= ruleMParameterValue EOF
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
    // InternalSWI.g:2246:1: ruleMParameterValue returns [EObject current=null] : (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) ;
    public final EObject ruleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueLiteral_0 = null;

        EObject this_MParameterValueRefObject_1 = null;

        EObject this_MParameterValuePAR_2 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2249:28: ( (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) )
            // InternalSWI.g:2250:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            {
            // InternalSWI.g:2250:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            int alt35=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEXADECIMAL:
            case 45:
            case 48:
            case 49:
            case 50:
                {
                alt35=1;
                }
                break;
            case RULE_ID:
                {
                alt35=2;
                }
                break;
            case 16:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSWI.g:2251:2: this_MParameterValueLiteral_0= ruleMParameterValueLiteral
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
                    // InternalSWI.g:2264:2: this_MParameterValueRefObject_1= ruleMParameterValueRefObject
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
                    // InternalSWI.g:2277:2: this_MParameterValuePAR_2= ruleMParameterValuePAR
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
    // InternalSWI.g:2296:1: entryRuleMParameterValueLiteral returns [EObject current=null] : iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF ;
    public final EObject entryRuleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueLiteral = null;


        try {
            // InternalSWI.g:2297:2: (iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF )
            // InternalSWI.g:2298:2: iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF
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
    // InternalSWI.g:2305:1: ruleMParameterValueLiteral returns [EObject current=null] : (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) ;
    public final EObject ruleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueBooleanLiteral_0 = null;

        EObject this_MParameterValueStringLiteral_1 = null;

        EObject this_MParameterValueIntegerLiteral_2 = null;

        EObject this_MParameterValueRealLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2308:28: ( (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) )
            // InternalSWI.g:2309:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            {
            // InternalSWI.g:2309:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 48:
            case 49:
                {
                alt36=1;
                }
                break;
            case RULE_STRING:
            case 45:
                {
                alt36=2;
                }
                break;
            case 50:
                {
                int LA36_3 = input.LA(2);

                if ( (LA36_3==RULE_INT) ) {
                    int LA36_4 = input.LA(3);

                    if ( (LA36_4==EOF||LA36_4==13||LA36_4==17||LA36_4==21||LA36_4==37||LA36_4==41||LA36_4==50||LA36_4==52||(LA36_4>=54 && LA36_4<=56)) ) {
                        alt36=3;
                    }
                    else if ( (LA36_4==15) ) {
                        alt36=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA36_4 = input.LA(2);

                if ( (LA36_4==EOF||LA36_4==13||LA36_4==17||LA36_4==21||LA36_4==37||LA36_4==41||LA36_4==50||LA36_4==52||(LA36_4>=54 && LA36_4<=56)) ) {
                    alt36=3;
                }
                else if ( (LA36_4==15) ) {
                    alt36=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEXADECIMAL:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalSWI.g:2310:2: this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral
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
                    // InternalSWI.g:2323:2: this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral
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
                    // InternalSWI.g:2336:2: this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral
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
                    // InternalSWI.g:2349:2: this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral
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
    // InternalSWI.g:2368:1: entryRuleMParameterValueBooleanLiteral returns [EObject current=null] : iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF ;
    public final EObject entryRuleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueBooleanLiteral = null;


        try {
            // InternalSWI.g:2369:2: (iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF )
            // InternalSWI.g:2370:2: iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF
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
    // InternalSWI.g:2377:1: ruleMParameterValueBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2380:28: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // InternalSWI.g:2381:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // InternalSWI.g:2381:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // InternalSWI.g:2381:2: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // InternalSWI.g:2381:2: ()
            // InternalSWI.g:2382:2: 
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

            // InternalSWI.g:2390:2: ( (lv_value_1_0= ruleEBoolean ) )
            // InternalSWI.g:2391:1: (lv_value_1_0= ruleEBoolean )
            {
            // InternalSWI.g:2391:1: (lv_value_1_0= ruleEBoolean )
            // InternalSWI.g:2392:3: lv_value_1_0= ruleEBoolean
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.EBoolean");
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
    // InternalSWI.g:2416:1: entryRuleMParameterValueStringLiteral returns [EObject current=null] : iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF ;
    public final EObject entryRuleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueStringLiteral = null;


        try {
            // InternalSWI.g:2417:2: (iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF )
            // InternalSWI.g:2418:2: iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF
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
    // InternalSWI.g:2425:1: ruleMParameterValueStringLiteral returns [EObject current=null] : ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isRaw_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalSWI.g:2428:28: ( ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalSWI.g:2429:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalSWI.g:2429:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalSWI.g:2429:2: () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalSWI.g:2429:2: ()
            // InternalSWI.g:2430:2: 
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

            // InternalSWI.g:2438:2: ( (lv_isRaw_1_0= 'raw' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSWI.g:2439:1: (lv_isRaw_1_0= 'raw' )
                    {
                    // InternalSWI.g:2439:1: (lv_isRaw_1_0= 'raw' )
                    // InternalSWI.g:2440:3: lv_isRaw_1_0= 'raw'
                    {
                    lv_isRaw_1_0=(Token)match(input,45,FollowSets000.FOLLOW_40); if (state.failed) return current;
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

            // InternalSWI.g:2453:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalSWI.g:2454:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalSWI.g:2454:1: (lv_value_2_0= RULE_STRING )
            // InternalSWI.g:2455:3: lv_value_2_0= RULE_STRING
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
    // InternalSWI.g:2479:1: entryRuleMParameterValueIntegerLiteral returns [EObject current=null] : iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF ;
    public final EObject entryRuleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueIntegerLiteral = null;


        try {
            // InternalSWI.g:2480:2: (iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF )
            // InternalSWI.g:2481:2: iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF
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
    // InternalSWI.g:2488:1: ruleMParameterValueIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2491:28: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) )
            // InternalSWI.g:2492:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            {
            // InternalSWI.g:2492:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            // InternalSWI.g:2492:2: () ( (lv_value_1_0= ruleINTEGER ) )
            {
            // InternalSWI.g:2492:2: ()
            // InternalSWI.g:2493:2: 
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

            // InternalSWI.g:2501:2: ( (lv_value_1_0= ruleINTEGER ) )
            // InternalSWI.g:2502:1: (lv_value_1_0= ruleINTEGER )
            {
            // InternalSWI.g:2502:1: (lv_value_1_0= ruleINTEGER )
            // InternalSWI.g:2503:3: lv_value_1_0= ruleINTEGER
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.INTEGER");
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
    // InternalSWI.g:2527:1: entryRuleMParameterValueRealLiteral returns [EObject current=null] : iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF ;
    public final EObject entryRuleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRealLiteral = null;


        try {
            // InternalSWI.g:2528:2: (iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF )
            // InternalSWI.g:2529:2: iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF
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
    // InternalSWI.g:2536:1: ruleMParameterValueRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ) ;
    public final EObject ruleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2539:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ) )
            // InternalSWI.g:2540:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            {
            // InternalSWI.g:2540:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            // InternalSWI.g:2540:2: () ( (lv_value_1_0= ruleREAL ) )
            {
            // InternalSWI.g:2540:2: ()
            // InternalSWI.g:2541:2: 
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

            // InternalSWI.g:2549:2: ( (lv_value_1_0= ruleREAL ) )
            // InternalSWI.g:2550:1: (lv_value_1_0= ruleREAL )
            {
            // InternalSWI.g:2550:1: (lv_value_1_0= ruleREAL )
            // InternalSWI.g:2551:3: lv_value_1_0= ruleREAL
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.REAL");
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
    // InternalSWI.g:2575:1: entryRuleMParameterValueRefObject returns [EObject current=null] : iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF ;
    public final EObject entryRuleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRefObject = null;


        try {
            // InternalSWI.g:2576:2: (iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF )
            // InternalSWI.g:2577:2: iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF
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
    // InternalSWI.g:2584:1: ruleMParameterValueRefObject returns [EObject current=null] : ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) ;
    public final EObject ruleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalSWI.g:2587:28: ( ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) )
            // InternalSWI.g:2588:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            {
            // InternalSWI.g:2588:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalSWI.g:2588:2: () ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalSWI.g:2588:2: ()
            // InternalSWI.g:2589:2: 
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

            // InternalSWI.g:2597:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalSWI.g:2598:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalSWI.g:2598:1: ( ruleVersionedQualifiedReferenceName )
            // InternalSWI.g:2599:3: ruleVersionedQualifiedReferenceName
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
    // InternalSWI.g:2623:1: entryRuleMParameterValuePAR returns [EObject current=null] : iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF ;
    public final EObject entryRuleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValuePAR = null;


        try {
            // InternalSWI.g:2624:2: (iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF )
            // InternalSWI.g:2625:2: iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF
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
    // InternalSWI.g:2632:1: ruleMParameterValuePAR returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2635:28: ( (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) )
            // InternalSWI.g:2636:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            {
            // InternalSWI.g:2636:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            // InternalSWI.g:2636:3: otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0());
                  
            }
            // InternalSWI.g:2640:1: ( (lv_value_1_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:2641:1: (lv_value_1_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:2641:1: (lv_value_1_0= ruleMParameterValueExpression )
            // InternalSWI.g:2642:3: lv_value_1_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_9);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:2670:1: entryRuleMParameterValueExpression returns [EObject current=null] : iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF ;
    public final EObject entryRuleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueExpression = null;


        try {
            // InternalSWI.g:2671:2: (iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF )
            // InternalSWI.g:2672:2: iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF
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
    // InternalSWI.g:2679:1: ruleMParameterValueExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) ;
    public final EObject ruleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2682:28: ( ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) )
            // InternalSWI.g:2683:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            {
            // InternalSWI.g:2683:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            // InternalSWI.g:2683:2: () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            {
            // InternalSWI.g:2683:2: ()
            // InternalSWI.g:2684:2: 
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

            // InternalSWI.g:2692:2: ( (lv_left_1_0= ruleMParameterValueTERM ) )
            // InternalSWI.g:2693:1: (lv_left_1_0= ruleMParameterValueTERM )
            {
            // InternalSWI.g:2693:1: (lv_left_1_0= ruleMParameterValueTERM )
            // InternalSWI.g:2694:3: lv_left_1_0= ruleMParameterValueTERM
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_47);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueTERM");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSWI.g:2710:2: ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50||LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSWI.g:2710:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    {
                    // InternalSWI.g:2710:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) )
                    // InternalSWI.g:2711:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    {
                    // InternalSWI.g:2711:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    // InternalSWI.g:2712:3: lv_operation_2_0= ruleMParameterValueExpressionOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
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
                              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpressionOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSWI.g:2728:2: ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    // InternalSWI.g:2729:1: (lv_right_3_0= ruleMParameterValueExpression )
                    {
                    // InternalSWI.g:2729:1: (lv_right_3_0= ruleMParameterValueExpression )
                    // InternalSWI.g:2730:3: lv_right_3_0= ruleMParameterValueExpression
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
                              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
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
    // InternalSWI.g:2754:1: entryRuleMParameterValueTERM returns [EObject current=null] : iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF ;
    public final EObject entryRuleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueTERM = null;


        try {
            // InternalSWI.g:2755:2: (iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF )
            // InternalSWI.g:2756:2: iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF
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
    // InternalSWI.g:2763:1: ruleMParameterValueTERM returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) ;
    public final EObject ruleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2766:28: ( ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) )
            // InternalSWI.g:2767:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            {
            // InternalSWI.g:2767:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            // InternalSWI.g:2767:2: () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            {
            // InternalSWI.g:2767:2: ()
            // InternalSWI.g:2768:2: 
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

            // InternalSWI.g:2776:2: ( (lv_left_1_0= ruleMParameterValue ) )
            // InternalSWI.g:2777:1: (lv_left_1_0= ruleMParameterValue )
            {
            // InternalSWI.g:2777:1: (lv_left_1_0= ruleMParameterValue )
            // InternalSWI.g:2778:3: lv_left_1_0= ruleMParameterValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_48);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSWI.g:2794:2: ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=55 && LA39_0<=56)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSWI.g:2794:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    {
                    // InternalSWI.g:2794:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) )
                    // InternalSWI.g:2795:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    {
                    // InternalSWI.g:2795:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    // InternalSWI.g:2796:3: lv_operation_2_0= ruleMParameterValueTERMOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
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
                              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueTERMOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSWI.g:2812:2: ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    // InternalSWI.g:2813:1: (lv_right_3_0= ruleMParameterValueTERM )
                    {
                    // InternalSWI.g:2813:1: (lv_right_3_0= ruleMParameterValueTERM )
                    // InternalSWI.g:2814:3: lv_right_3_0= ruleMParameterValueTERM
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
                              		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueTERM");
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
    // InternalSWI.g:2838:1: entryRuleMParameterRange returns [EObject current=null] : iv_ruleMParameterRange= ruleMParameterRange EOF ;
    public final EObject entryRuleMParameterRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterRange = null;


        try {
            // InternalSWI.g:2839:2: (iv_ruleMParameterRange= ruleMParameterRange EOF )
            // InternalSWI.g:2840:2: iv_ruleMParameterRange= ruleMParameterRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterRange=ruleMParameterRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterRange; 
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
    // $ANTLR end "entryRuleMParameterRange"


    // $ANTLR start "ruleMParameterRange"
    // InternalSWI.g:2847:1: ruleMParameterRange returns [EObject current=null] : (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR ) ;
    public final EObject ruleMParameterRange() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterOCR_0 = null;

        EObject this_MParameterOOR_1 = null;

        EObject this_MParameterCOR_2 = null;

        EObject this_MParameterCCR_3 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2850:28: ( (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR ) )
            // InternalSWI.g:2851:1: (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR )
            {
            // InternalSWI.g:2851:1: (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR )
            int alt40=4;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==16) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred54_InternalSWI()) ) {
                    alt40=1;
                }
                else if ( (synpred55_InternalSWI()) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==53) ) {
                int LA40_2 = input.LA(2);

                if ( (synpred56_InternalSWI()) ) {
                    alt40=3;
                }
                else if ( (true) ) {
                    alt40=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSWI.g:2852:2: this_MParameterOCR_0= ruleMParameterOCR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:2865:2: this_MParameterOOR_1= ruleMParameterOOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:2878:2: this_MParameterCOR_2= ruleMParameterCOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSWI.g:2891:2: this_MParameterCCR_3= ruleMParameterCCR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterCCRParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2910:1: entryRuleMParameterOCR returns [EObject current=null] : iv_ruleMParameterOCR= ruleMParameterOCR EOF ;
    public final EObject entryRuleMParameterOCR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterOCR = null;


        try {
            // InternalSWI.g:2911:2: (iv_ruleMParameterOCR= ruleMParameterOCR EOF )
            // InternalSWI.g:2912:2: iv_ruleMParameterOCR= ruleMParameterOCR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterOCRRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterOCR=ruleMParameterOCR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterOCR; 
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
    // $ANTLR end "entryRuleMParameterOCR"


    // $ANTLR start "ruleMParameterOCR"
    // InternalSWI.g:2919:1: ruleMParameterOCR returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) ;
    public final EObject ruleMParameterOCR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:2922:28: ( ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) )
            // InternalSWI.g:2923:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            {
            // InternalSWI.g:2923:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            // InternalSWI.g:2923:2: () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']'
            {
            // InternalSWI.g:2923:2: ()
            // InternalSWI.g:2924:2: 
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

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalSWI.g:2936:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:2937:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:2937:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalSWI.g:2938:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_49);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterOCRAccess().getCommaKeyword_3());
                  
            }
            // InternalSWI.g:2958:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:2959:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:2959:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalSWI.g:2960:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_50);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:2988:1: entryRuleMParameterOOR returns [EObject current=null] : iv_ruleMParameterOOR= ruleMParameterOOR EOF ;
    public final EObject entryRuleMParameterOOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterOOR = null;


        try {
            // InternalSWI.g:2989:2: (iv_ruleMParameterOOR= ruleMParameterOOR EOF )
            // InternalSWI.g:2990:2: iv_ruleMParameterOOR= ruleMParameterOOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterOORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterOOR=ruleMParameterOOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterOOR; 
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
    // $ANTLR end "entryRuleMParameterOOR"


    // $ANTLR start "ruleMParameterOOR"
    // InternalSWI.g:2997:1: ruleMParameterOOR returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMParameterOOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:3000:28: ( ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) )
            // InternalSWI.g:3001:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            {
            // InternalSWI.g:3001:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            // InternalSWI.g:3001:2: () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')'
            {
            // InternalSWI.g:3001:2: ()
            // InternalSWI.g:3002:2: 
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

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalSWI.g:3014:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:3015:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:3015:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalSWI.g:3016:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_49);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterOORAccess().getCommaKeyword_3());
                  
            }
            // InternalSWI.g:3036:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:3037:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:3037:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalSWI.g:3038:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_9);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:3066:1: entryRuleMParameterCOR returns [EObject current=null] : iv_ruleMParameterCOR= ruleMParameterCOR EOF ;
    public final EObject entryRuleMParameterCOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterCOR = null;


        try {
            // InternalSWI.g:3067:2: (iv_ruleMParameterCOR= ruleMParameterCOR EOF )
            // InternalSWI.g:3068:2: iv_ruleMParameterCOR= ruleMParameterCOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterCORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterCOR=ruleMParameterCOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterCOR; 
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
    // $ANTLR end "entryRuleMParameterCOR"


    // $ANTLR start "ruleMParameterCOR"
    // InternalSWI.g:3075:1: ruleMParameterCOR returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMParameterCOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:3078:28: ( ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) )
            // InternalSWI.g:3079:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            {
            // InternalSWI.g:3079:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            // InternalSWI.g:3079:2: () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')'
            {
            // InternalSWI.g:3079:2: ()
            // InternalSWI.g:3080:2: 
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

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalSWI.g:3092:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:3093:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:3093:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalSWI.g:3094:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_49);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterCORAccess().getCommaKeyword_3());
                  
            }
            // InternalSWI.g:3114:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:3115:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:3115:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalSWI.g:3116:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_9);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:3144:1: entryRuleMParameterCCR returns [EObject current=null] : iv_ruleMParameterCCR= ruleMParameterCCR EOF ;
    public final EObject entryRuleMParameterCCR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterCCR = null;


        try {
            // InternalSWI.g:3145:2: (iv_ruleMParameterCCR= ruleMParameterCCR EOF )
            // InternalSWI.g:3146:2: iv_ruleMParameterCCR= ruleMParameterCCR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterCCRRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterCCR=ruleMParameterCCR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterCCR; 
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
    // $ANTLR end "entryRuleMParameterCCR"


    // $ANTLR start "ruleMParameterCCR"
    // InternalSWI.g:3153:1: ruleMParameterCCR returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) ;
    public final EObject ruleMParameterCCR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSWI.g:3156:28: ( ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) )
            // InternalSWI.g:3157:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            {
            // InternalSWI.g:3157:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            // InternalSWI.g:3157:2: () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']'
            {
            // InternalSWI.g:3157:2: ()
            // InternalSWI.g:3158:2: 
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

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalSWI.g:3170:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:3171:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:3171:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalSWI.g:3172:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_49);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterCCRAccess().getCommaKeyword_3());
                  
            }
            // InternalSWI.g:3192:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalSWI.g:3193:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalSWI.g:3193:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalSWI.g:3194:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_50);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.SWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:3222:1: ruleMParameterValueExpressionOperators returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleMParameterValueExpressionOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSWI.g:3224:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalSWI.g:3225:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalSWI.g:3225:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            else if ( (LA41_0==50) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalSWI.g:3225:2: (enumLiteral_0= '+' )
                    {
                    // InternalSWI.g:3225:2: (enumLiteral_0= '+' )
                    // InternalSWI.g:3225:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:3231:6: (enumLiteral_1= '-' )
                    {
                    // InternalSWI.g:3231:6: (enumLiteral_1= '-' )
                    // InternalSWI.g:3231:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSWI.g:3241:1: ruleMParameterValueTERMOperators returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMParameterValueTERMOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSWI.g:3243:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalSWI.g:3244:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalSWI.g:3244:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            else if ( (LA42_0==56) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalSWI.g:3244:2: (enumLiteral_0= '*' )
                    {
                    // InternalSWI.g:3244:2: (enumLiteral_0= '*' )
                    // InternalSWI.g:3244:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:3250:6: (enumLiteral_1= '/' )
                    {
                    // InternalSWI.g:3250:6: (enumLiteral_1= '/' )
                    // InternalSWI.g:3250:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred12_InternalSWI
    public final void synpred12_InternalSWI_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalSWI.g:527:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalSWI.g:528:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalSWI.g:528:109: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalSWI.g:529:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0);
        // InternalSWI.g:532:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalSWI.g:532:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalSWI", "true");
        }
        // InternalSWI.g:532:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalSWI.g:532:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalSWI.g:540:1: ( (lv_version_10_0= ruleVersion ) )
        // InternalSWI.g:541:1: (lv_version_10_0= ruleVersion )
        {
        // InternalSWI.g:541:1: (lv_version_10_0= ruleVersion )
        // InternalSWI.g:542:3: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_4);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalSWI

    // $ANTLR start synpred13_InternalSWI
    public final void synpred13_InternalSWI_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;

        // InternalSWI.g:569:4: ( ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) )
        // InternalSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        // InternalSWI.g:570:5: {...}? => ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalSWI.g:570:109: ( ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        // InternalSWI.g:571:6: ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1);
        // InternalSWI.g:574:6: ({...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        // InternalSWI.g:574:7: {...}? => (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalSWI", "true");
        }
        // InternalSWI.g:574:16: (otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        // InternalSWI.g:574:18: otherlv_12= 'language' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalSWI.g:582:1: ( ( ruleVersionedQualifiedName ) )
        // InternalSWI.g:583:1: ( ruleVersionedQualifiedName )
        {
        // InternalSWI.g:583:1: ( ruleVersionedQualifiedName )
        // InternalSWI.g:584:3: ruleVersionedQualifiedName
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

        otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalSWI

    // $ANTLR start synpred15_InternalSWI
    public final void synpred15_InternalSWI_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_parameters_19_0 = null;


        // InternalSWI.g:611:4: ( ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )
        // InternalSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
        {
        // InternalSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
        // InternalSWI.g:612:5: {...}? => ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2)");
        }
        // InternalSWI.g:612:109: ( ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
        // InternalSWI.g:613:6: ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2);
        // InternalSWI.g:616:6: ({...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' ) )
        // InternalSWI.g:616:7: {...}? => (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalSWI", "true");
        }
        // InternalSWI.g:616:16: (otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';' )
        // InternalSWI.g:616:18: otherlv_16= 'configuration' otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleMParameter ) )+ otherlv_20= '}' otherlv_21= ';'
        {
        otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_17); if (state.failed) return ;
        otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_19); if (state.failed) return ;
        // InternalSWI.g:628:1: ( (lv_parameters_19_0= ruleMParameter ) )+
        int cnt46=0;
        loop46:
        do {
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=39 && LA46_0<=40)||(LA46_0>=42 && LA46_0<=43)||(LA46_0>=46 && LA46_0<=47)) ) {
                alt46=1;
            }


            switch (alt46) {
        	case 1 :
        	    // InternalSWI.g:629:1: (lv_parameters_19_0= ruleMParameter )
        	    {
        	    // InternalSWI.g:629:1: (lv_parameters_19_0= ruleMParameter )
        	    // InternalSWI.g:630:3: lv_parameters_19_0= ruleMParameter
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getParametersMParameterParserRuleCall_4_2_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_20);
        	    lv_parameters_19_0=ruleMParameter();

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

        otherlv_20=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalSWI

    // $ANTLR start synpred17_InternalSWI
    public final void synpred17_InternalSWI_fragment() throws RecognitionException {   
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_providedResources_25_0 = null;


        // InternalSWI.g:661:4: ( ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) )
        // InternalSWI.g:661:4: ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) )
        {
        // InternalSWI.g:661:4: ({...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) )
        // InternalSWI.g:662:5: {...}? => ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred17_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3)");
        }
        // InternalSWI.g:662:109: ( ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) ) )
        // InternalSWI.g:663:6: ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3);
        // InternalSWI.g:666:6: ({...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' ) )
        // InternalSWI.g:666:7: {...}? => (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred17_InternalSWI", "true");
        }
        // InternalSWI.g:666:16: (otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';' )
        // InternalSWI.g:666:18: otherlv_22= 'provided' otherlv_23= 'resources' otherlv_24= '{' ( (lv_providedResources_25_0= ruleMProvidedResource ) )+ otherlv_26= '}' otherlv_27= ';'
        {
        otherlv_22=(Token)match(input,29,FollowSets000.FOLLOW_21); if (state.failed) return ;
        otherlv_23=(Token)match(input,30,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22); if (state.failed) return ;
        // InternalSWI.g:678:1: ( (lv_providedResources_25_0= ruleMProvidedResource ) )+
        int cnt47=0;
        loop47:
        do {
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==34||LA47_0==38) ) {
                alt47=1;
            }


            switch (alt47) {
        	case 1 :
        	    // InternalSWI.g:679:1: (lv_providedResources_25_0= ruleMProvidedResource )
        	    {
        	    // InternalSWI.g:679:1: (lv_providedResources_25_0= ruleMProvidedResource )
        	    // InternalSWI.g:680:3: lv_providedResources_25_0= ruleMProvidedResource
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_3_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_23);
        	    lv_providedResources_25_0=ruleMProvidedResource();

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

        otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalSWI

    // $ANTLR start synpred19_InternalSWI
    public final void synpred19_InternalSWI_fragment() throws RecognitionException {   
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;

        // InternalSWI.g:711:4: ( ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) ) )
        // InternalSWI.g:711:4: ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) )
        {
        // InternalSWI.g:711:4: ({...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) ) )
        // InternalSWI.g:712:5: {...}? => ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred19_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4)");
        }
        // InternalSWI.g:712:109: ( ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) ) )
        // InternalSWI.g:713:6: ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4);
        // InternalSWI.g:716:6: ({...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' ) )
        // InternalSWI.g:716:7: {...}? => (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred19_InternalSWI", "true");
        }
        // InternalSWI.g:716:16: (otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';' )
        // InternalSWI.g:716:18: otherlv_28= 'requires' otherlv_29= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_33= ';'
        {
        otherlv_28=(Token)match(input,31,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_29=(Token)match(input,24,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalSWI.g:724:1: ( ( ruleVersionedQualifiedName ) )
        // InternalSWI.g:725:1: ( ruleVersionedQualifiedName )
        {
        // InternalSWI.g:725:1: ( ruleVersionedQualifiedName )
        // InternalSWI.g:726:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_24);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSWI.g:742:2: (otherlv_31= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop48:
        do {
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==21) ) {
                alt48=1;
            }


            switch (alt48) {
        	case 1 :
        	    // InternalSWI.g:742:4: otherlv_31= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_31=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalSWI.g:746:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalSWI.g:747:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalSWI.g:747:1: ( ruleVersionedQualifiedName )
        	    // InternalSWI.g:748:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_24);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop48;
            }
        } while (true);

        otherlv_33=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred19_InternalSWI

    // $ANTLR start synpred20_InternalSWI
    public final void synpred20_InternalSWI_fragment() throws RecognitionException {   
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;

        // InternalSWI.g:775:4: ( ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) ) )
        // InternalSWI.g:775:4: ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) )
        {
        // InternalSWI.g:775:4: ({...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) ) )
        // InternalSWI.g:776:5: {...}? => ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred20_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5)");
        }
        // InternalSWI.g:776:109: ( ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) ) )
        // InternalSWI.g:777:6: ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5);
        // InternalSWI.g:780:6: ({...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' ) )
        // InternalSWI.g:780:7: {...}? => (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred20_InternalSWI", "true");
        }
        // InternalSWI.g:780:16: (otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';' )
        // InternalSWI.g:780:18: otherlv_34= 'required' otherlv_35= 'osapi' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_38= ';'
        {
        otherlv_34=(Token)match(input,32,FollowSets000.FOLLOW_25); if (state.failed) return ;
        otherlv_35=(Token)match(input,33,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_36=(Token)match(input,24,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalSWI.g:792:1: ( ( ruleVersionedQualifiedName ) )
        // InternalSWI.g:793:1: ( ruleVersionedQualifiedName )
        {
        // InternalSWI.g:793:1: ( ruleVersionedQualifiedName )
        // InternalSWI.g:794:3: ruleVersionedQualifiedName
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

        otherlv_38=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSWI

    // $ANTLR start synpred54_InternalSWI
    public final void synpred54_InternalSWI_fragment() throws RecognitionException {   
        EObject this_MParameterOCR_0 = null;


        // InternalSWI.g:2852:2: (this_MParameterOCR_0= ruleMParameterOCR )
        // InternalSWI.g:2852:2: this_MParameterOCR_0= ruleMParameterOCR
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MParameterOCR_0=ruleMParameterOCR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalSWI

    // $ANTLR start synpred55_InternalSWI
    public final void synpred55_InternalSWI_fragment() throws RecognitionException {   
        EObject this_MParameterOOR_1 = null;


        // InternalSWI.g:2865:2: (this_MParameterOOR_1= ruleMParameterOOR )
        // InternalSWI.g:2865:2: this_MParameterOOR_1= ruleMParameterOOR
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MParameterOOR_1=ruleMParameterOOR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalSWI

    // $ANTLR start synpred56_InternalSWI
    public final void synpred56_InternalSWI_fragment() throws RecognitionException {   
        EObject this_MParameterCOR_2 = null;


        // InternalSWI.g:2878:2: (this_MParameterCOR_2= ruleMParameterCOR )
        // InternalSWI.g:2878:2: this_MParameterCOR_2= ruleMParameterCOR
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MParameterCOR_2=ruleMParameterCOR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalSWI

    // Delegated rules

    public final boolean synpred56_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\47\1\50\1\uffff\1\4\4\uffff\1\4\1\uffff";
    static final String dfa_3s = "\2\57\1\uffff\1\4\4\uffff\1\26\1\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\uffff\1\3\1\4\1\5\1\2\1\uffff\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\uffff\1\3\1\5\2\uffff\1\4\1\6",
            "\1\2\1\uffff\1\7\1\5\2\uffff\1\4\1\6",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "\1\7\12\uffff\2\7\1\uffff\1\7\3\uffff\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1079:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001A6800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001B6800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000CD8000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000CD8010000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004400000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004410000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000202000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00072000000100F0L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000002000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000010000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010200000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00040000000000A0L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00072000000000E0L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000020L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0044000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0180000000000002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
    }


}