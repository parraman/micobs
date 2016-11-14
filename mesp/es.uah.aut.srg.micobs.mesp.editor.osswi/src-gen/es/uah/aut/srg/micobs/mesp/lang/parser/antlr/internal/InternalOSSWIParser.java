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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'osswinterface'", "'extends'", "','", "'{'", "'version'", "':='", "'osapi'", "'provided'", "'resources'", "'}'", "'quantifiable'", "'resource'", "'step'", "'to'", "'instantiable'", "'integer'", "'range'", "'enum'", "'real'", "'='", "'raw'", "'boolean'", "'string'", "'true'", "'false'", "'-'", "'e'", "']'", "'['", "'+'", "'*'", "'/'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalOSSWIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOSSWIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOSSWIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOSSWI.g"; }



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
    // InternalOSSWI.g:75:1: entryRuleMMESPOSSWIPackageFile returns [EObject current=null] : iv_ruleMMESPOSSWIPackageFile= ruleMMESPOSSWIPackageFile EOF ;
    public final EObject entryRuleMMESPOSSWIPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPOSSWIPackageFile = null;


        try {
            // InternalOSSWI.g:76:2: (iv_ruleMMESPOSSWIPackageFile= ruleMMESPOSSWIPackageFile EOF )
            // InternalOSSWI.g:77:2: iv_ruleMMESPOSSWIPackageFile= ruleMMESPOSSWIPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPOSSWIPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPOSSWIPackageFile=ruleMMESPOSSWIPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPOSSWIPackageFile; 
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
    // $ANTLR end "entryRuleMMESPOSSWIPackageFile"


    // $ANTLR start "ruleMMESPOSSWIPackageFile"
    // InternalOSSWI.g:84:1: ruleMMESPOSSWIPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) ) ) ;
    public final EObject ruleMMESPOSSWIPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:87:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) ) ) )
            // InternalOSSWI.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) ) )
            {
            // InternalOSSWI.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) ) )
            // InternalOSSWI.g:88:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageKeyword_0());
                  
            }
            // InternalOSSWI.g:92:1: ( ( ruleQualifiedName ) )
            // InternalOSSWI.g:93:1: ( ruleQualifiedName )
            {
            // InternalOSSWI.g:93:1: ( ruleQualifiedName )
            // InternalOSSWI.g:94:3: ruleQualifiedName
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

                  	newLeafNode(otherlv_2, grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // InternalOSSWI.g:114:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOSSWI.g:114:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMESPOSSWIPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // InternalOSSWI.g:118:1: ( ( ruleQualifiedName ) )
            	    // InternalOSSWI.g:119:1: ( ruleQualifiedName )
            	    {
            	    // InternalOSSWI.g:119:1: ( ruleQualifiedName )
            	    // InternalOSSWI.g:120:3: ruleQualifiedName
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

            	          	newLeafNode(otherlv_5, grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalOSSWI.g:140:3: ( (lv_element_6_0= ruleMMESPOSSWIPackageElement ) )
            // InternalOSSWI.g:141:1: (lv_element_6_0= ruleMMESPOSSWIPackageElement )
            {
            // InternalOSSWI.g:141:1: (lv_element_6_0= ruleMMESPOSSWIPackageElement )
            // InternalOSSWI.g:142:3: lv_element_6_0= ruleMMESPOSSWIPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementMMESPOSSWIPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MMESPOSSWIPackageElement");
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
    // InternalOSSWI.g:166:1: entryRuleMMESPOSSWIPackageElement returns [EObject current=null] : iv_ruleMMESPOSSWIPackageElement= ruleMMESPOSSWIPackageElement EOF ;
    public final EObject entryRuleMMESPOSSWIPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMESPOSSWIPackageElement = null;


        try {
            // InternalOSSWI.g:167:2: (iv_ruleMMESPOSSWIPackageElement= ruleMMESPOSSWIPackageElement EOF )
            // InternalOSSWI.g:168:2: iv_ruleMMESPOSSWIPackageElement= ruleMMESPOSSWIPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMESPOSSWIPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMESPOSSWIPackageElement=ruleMMESPOSSWIPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMESPOSSWIPackageElement; 
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
    // $ANTLR end "entryRuleMMESPOSSWIPackageElement"


    // $ANTLR start "ruleMMESPOSSWIPackageElement"
    // InternalOSSWI.g:175:1: ruleMMESPOSSWIPackageElement returns [EObject current=null] : this_MOSSwInterface_0= ruleMOSSwInterface ;
    public final EObject ruleMMESPOSSWIPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MOSSwInterface_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:178:28: (this_MOSSwInterface_0= ruleMOSSwInterface )
            // InternalOSSWI.g:180:2: this_MOSSwInterface_0= ruleMOSSwInterface
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMESPOSSWIPackageElementAccess().getMOSSwInterfaceParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalOSSWI.g:199:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalOSSWI.g:200:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalOSSWI.g:201:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalOSSWI.g:208:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalOSSWI.g:211:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalOSSWI.g:212:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalOSSWI.g:212:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalOSSWI.g:212:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalOSSWI.g:219:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOSSWI.g:220:2: kw= '.' this_ID_2= RULE_ID
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
    // InternalOSSWI.g:240:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalOSSWI.g:241:2: (iv_ruleVersion= ruleVersion EOF )
            // InternalOSSWI.g:242:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalOSSWI.g:249:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalOSSWI.g:252:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalOSSWI.g:253:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalOSSWI.g:253:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalOSSWI.g:253:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalOSSWI.g:253:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
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
                    // InternalOSSWI.g:253:7: this_INT_0= RULE_INT
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
                    // InternalOSSWI.g:261:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalOSSWI.g:261:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalOSSWI.g:261:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalOSSWI.g:261:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalOSSWI.g:261:12: this_INT_1= RULE_INT
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

            // InternalOSSWI.g:275:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOSSWI.g:276:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalOSSWI.g:281:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
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
            	            // InternalOSSWI.g:281:6: this_INT_4= RULE_INT
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
            	            // InternalOSSWI.g:289:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalOSSWI.g:289:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalOSSWI.g:289:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalOSSWI.g:289:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // InternalOSSWI.g:289:12: this_INT_5= RULE_INT
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
    // InternalOSSWI.g:311:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalOSSWI.g:312:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalOSSWI.g:313:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalOSSWI.g:320:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:323:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalOSSWI.g:324:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalOSSWI.g:324:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalOSSWI.g:325:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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
    // InternalOSSWI.g:366:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalOSSWI.g:367:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalOSSWI.g:368:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalOSSWI.g:375:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:378:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalOSSWI.g:379:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalOSSWI.g:379:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalOSSWI.g:379:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalOSSWI.g:379:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
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
                    // InternalOSSWI.g:380:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
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
            // InternalOSSWI.g:403:1: (kw= '::' this_ID_4= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOSSWI.g:404:2: kw= '::' this_ID_4= RULE_ID
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


    // $ANTLR start "entryRuleMOSSwInterface"
    // InternalOSSWI.g:424:1: entryRuleMOSSwInterface returns [EObject current=null] : iv_ruleMOSSwInterface= ruleMOSSwInterface EOF ;
    public final EObject entryRuleMOSSwInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOSSwInterface = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // InternalOSSWI.g:430:2: (iv_ruleMOSSwInterface= ruleMOSSwInterface EOF )
            // InternalOSSWI.g:431:2: iv_ruleMOSSwInterface= ruleMOSSwInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMOSSwInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMOSSwInterface=ruleMOSSwInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMOSSwInterface; 
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
    // $ANTLR end "entryRuleMOSSwInterface"


    // $ANTLR start "ruleMOSSwInterface"
    // InternalOSSWI.g:441:1: ruleMOSSwInterface returns [EObject current=null] : (otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';' ) ;
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
            // InternalOSSWI.g:447:28: ( (otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';' ) )
            // InternalOSSWI.g:448:1: (otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalOSSWI.g:448:1: (otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';' )
            // InternalOSSWI.g:448:3: otherlv_0= 'osswinterface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMOSSwInterfaceAccess().getOsswinterfaceKeyword_0());
                  
            }
            // InternalOSSWI.g:452:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWI.g:453:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWI.g:453:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWI.g:454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalOSSWI.g:470:2: (otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOSSWI.g:470:4: otherlv_2= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMOSSwInterfaceAccess().getExtendsKeyword_2_0());
                          
                    }
                    // InternalOSSWI.g:474:1: ( ( ruleVersionedQualifiedName ) )
                    // InternalOSSWI.g:475:1: ( ruleVersionedQualifiedName )
                    {
                    // InternalOSSWI.g:475:1: ( ruleVersionedQualifiedName )
                    // InternalOSSWI.g:476:3: ruleVersionedQualifiedName
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
                    pushFollow(FollowSets000.FOLLOW_13);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalOSSWI.g:492:2: (otherlv_4= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalOSSWI.g:492:4: otherlv_4= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMOSSwInterfaceAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // InternalOSSWI.g:496:1: ( ( ruleVersionedQualifiedName ) )
                    	    // InternalOSSWI.g:497:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // InternalOSSWI.g:497:1: ( ruleVersionedQualifiedName )
                    	    // InternalOSSWI.g:498:3: ruleVersionedQualifiedName
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

                  	newLeafNode(otherlv_6, grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalOSSWI.g:518:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) ) )
            // InternalOSSWI.g:520:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalOSSWI.g:520:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?) )
            // InternalOSSWI.g:521:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());
            // InternalOSSWI.g:524:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?)
            // InternalOSSWI.g:525:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+ {...}?
            {
            // InternalOSSWI.g:525:3: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOSSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalOSSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalOSSWI.g:528:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalOSSWI.g:528:111: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalOSSWI.g:529:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0);
            	    // InternalOSSWI.g:532:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalOSSWI.g:532:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "true");
            	    }
            	    // InternalOSSWI.g:532:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalOSSWI.g:532:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMOSSwInterfaceAccess().getVersionKeyword_4_0_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_0_1());
            	          
            	    }
            	    // InternalOSSWI.g:540:1: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalOSSWI.g:541:1: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalOSSWI.g:541:1: (lv_version_10_0= ruleVersion )
            	    // InternalOSSWI.g:542:3: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
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
            	              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
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
            	    // InternalOSSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalOSSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
            	    // InternalOSSWI.g:570:5: {...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalOSSWI.g:570:111: ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
            	    // InternalOSSWI.g:571:6: ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1);
            	    // InternalOSSWI.g:574:6: ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
            	    // InternalOSSWI.g:574:7: {...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "true");
            	    }
            	    // InternalOSSWI.g:574:16: (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
            	    // InternalOSSWI.g:574:18: otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMOSSwInterfaceAccess().getOsapiKeyword_4_1_0());
            	          
            	    }
            	    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_1_1());
            	          
            	    }
            	    // InternalOSSWI.g:582:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalOSSWI.g:583:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalOSSWI.g:583:1: ( ruleVersionedQualifiedName )
            	    // InternalOSSWI.g:584:3: ruleVersionedQualifiedName
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
            	    // InternalOSSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
            	    {
            	    // InternalOSSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
            	    // InternalOSSWI.g:612:5: {...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalOSSWI.g:612:111: ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
            	    // InternalOSSWI.g:613:6: ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2);
            	    // InternalOSSWI.g:616:6: ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) )
            	    // InternalOSSWI.g:616:7: {...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMOSSwInterface", "true");
            	    }
            	    // InternalOSSWI.g:616:16: (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' )
            	    // InternalOSSWI.g:616:18: otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';'
            	    {
            	    otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMOSSwInterfaceAccess().getProvidedKeyword_4_2_0());
            	          
            	    }
            	    otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMOSSwInterfaceAccess().getResourcesKeyword_4_2_1());
            	          
            	    }
            	    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_4_2_2());
            	          
            	    }
            	    // InternalOSSWI.g:628:1: ( (lv_providedResources_19_0= ruleMProvidedResource ) )+
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
            	    	    // InternalOSSWI.g:629:1: (lv_providedResources_19_0= ruleMProvidedResource )
            	    	    {
            	    	    // InternalOSSWI.g:629:1: (lv_providedResources_19_0= ruleMProvidedResource )
            	    	    // InternalOSSWI.g:630:3: lv_providedResources_19_0= ruleMProvidedResource
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_20);
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
            	    	              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MProvidedResource");
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

            	          	newLeafNode(otherlv_20, grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_4_2_4());
            	          
            	    }
            	    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            otherlv_22=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalOSSWI.g:688:1: entryRuleMProvidedResource returns [EObject current=null] : iv_ruleMProvidedResource= ruleMProvidedResource EOF ;
    public final EObject entryRuleMProvidedResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMProvidedResource = null;


        try {
            // InternalOSSWI.g:689:2: (iv_ruleMProvidedResource= ruleMProvidedResource EOF )
            // InternalOSSWI.g:690:2: iv_ruleMProvidedResource= ruleMProvidedResource EOF
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
    // InternalOSSWI.g:697:1: ruleMProvidedResource returns [EObject current=null] : (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource ) ;
    public final EObject ruleMProvidedResource() throws RecognitionException {
        EObject current = null;

        EObject this_MQuantifiableResource_0 = null;

        EObject this_MInstantiableResource_1 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:700:28: ( (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource ) )
            // InternalOSSWI.g:701:1: (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource )
            {
            // InternalOSSWI.g:701:1: (this_MQuantifiableResource_0= ruleMQuantifiableResource | this_MInstantiableResource_1= ruleMInstantiableResource )
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
                    // InternalOSSWI.g:702:2: this_MQuantifiableResource_0= ruleMQuantifiableResource
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
                    // InternalOSSWI.g:715:2: this_MInstantiableResource_1= ruleMInstantiableResource
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
    // InternalOSSWI.g:734:1: entryRuleMQuantifiableResource returns [EObject current=null] : iv_ruleMQuantifiableResource= ruleMQuantifiableResource EOF ;
    public final EObject entryRuleMQuantifiableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMQuantifiableResource = null;


        try {
            // InternalOSSWI.g:735:2: (iv_ruleMQuantifiableResource= ruleMQuantifiableResource EOF )
            // InternalOSSWI.g:736:2: iv_ruleMQuantifiableResource= ruleMQuantifiableResource EOF
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
    // InternalOSSWI.g:743:1: ruleMQuantifiableResource returns [EObject current=null] : (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' ) ;
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
            // InternalOSSWI.g:746:28: ( (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' ) )
            // InternalOSSWI.g:747:1: (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' )
            {
            // InternalOSSWI.g:747:1: (otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';' )
            // InternalOSSWI.g:747:3: otherlv_0= 'quantifiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'step' ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) ) otherlv_5= 'to' ( (lv_upperBound_6_0= ruleMParameterValueExpression ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMQuantifiableResourceAccess().getQuantifiableKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMQuantifiableResourceAccess().getResourceKeyword_1());
                  
            }
            // InternalOSSWI.g:755:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalOSSWI.g:756:1: (lv_name_2_0= RULE_ID )
            {
            // InternalOSSWI.g:756:1: (lv_name_2_0= RULE_ID )
            // InternalOSSWI.g:757:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMQuantifiableResourceAccess().getStepKeyword_3());
                  
            }
            // InternalOSSWI.g:777:1: ( (lv_lowerBound_4_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:778:1: (lv_lowerBound_4_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:778:1: (lv_lowerBound_4_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:779:3: lv_lowerBound_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMQuantifiableResourceAccess().getToKeyword_5());
                  
            }
            // InternalOSSWI.g:799:1: ( (lv_upperBound_6_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:800:1: (lv_upperBound_6_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:800:1: (lv_upperBound_6_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:801:3: lv_upperBound_6_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
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
    // InternalOSSWI.g:829:1: entryRuleMInstantiableResource returns [EObject current=null] : iv_ruleMInstantiableResource= ruleMInstantiableResource EOF ;
    public final EObject entryRuleMInstantiableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInstantiableResource = null;


        try {
            // InternalOSSWI.g:830:2: (iv_ruleMInstantiableResource= ruleMInstantiableResource EOF )
            // InternalOSSWI.g:831:2: iv_ruleMInstantiableResource= ruleMInstantiableResource EOF
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
    // InternalOSSWI.g:838:1: ruleMInstantiableResource returns [EObject current=null] : (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' ) ;
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
            // InternalOSSWI.g:841:28: ( (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // InternalOSSWI.g:842:1: (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalOSSWI.g:842:1: (otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';' )
            // InternalOSSWI.g:842:3: otherlv_0= 'instantiable' otherlv_1= 'resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameters_4_0= ruleMParameter ) )* otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMInstantiableResourceAccess().getInstantiableKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMInstantiableResourceAccess().getResourceKeyword_1());
                  
            }
            // InternalOSSWI.g:850:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalOSSWI.g:851:1: (lv_name_2_0= RULE_ID )
            {
            // InternalOSSWI.g:851:1: (lv_name_2_0= RULE_ID )
            // InternalOSSWI.g:852:3: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMInstantiableResourceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalOSSWI.g:872:1: ( (lv_parameters_4_0= ruleMParameter ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34||(LA15_0>=36 && LA15_0<=37)||(LA15_0>=40 && LA15_0<=41)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOSSWI.g:873:1: (lv_parameters_4_0= ruleMParameter )
            	    {
            	    // InternalOSSWI.g:873:1: (lv_parameters_4_0= ruleMParameter )
            	    // InternalOSSWI.g:874:3: lv_parameters_4_0= ruleMParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMInstantiableResourceAccess().getParametersMParameterParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
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
            	              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalOSSWI.g:906:1: entryRuleMParameter returns [EObject current=null] : iv_ruleMParameter= ruleMParameter EOF ;
    public final EObject entryRuleMParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameter = null;


        try {
            // InternalOSSWI.g:907:2: (iv_ruleMParameter= ruleMParameter EOF )
            // InternalOSSWI.g:908:2: iv_ruleMParameter= ruleMParameter EOF
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
    // InternalOSSWI.g:915:1: ruleMParameter returns [EObject current=null] : (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition ) ;
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
            // InternalOSSWI.g:918:28: ( (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition ) )
            // InternalOSSWI.g:919:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )
            {
            // InternalOSSWI.g:919:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )
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
            case 40:
                {
                alt16=3;
                }
                break;
            case 37:
                {
                alt16=4;
                }
                break;
            case 41:
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
                    // InternalOSSWI.g:920:2: this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression
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
                    // InternalOSSWI.g:933:2: this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression
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
                    // InternalOSSWI.g:946:2: this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression
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
                    // InternalOSSWI.g:959:2: this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression
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
                    // InternalOSSWI.g:972:2: this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression
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
                    // InternalOSSWI.g:985:2: this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition
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
    // InternalOSSWI.g:1004:1: entryRuleMIntegerParameterSingleExpression returns [EObject current=null] : iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF ;
    public final EObject entryRuleMIntegerParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIntegerParameterSingleExpression = null;


        try {
            // InternalOSSWI.g:1005:2: (iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF )
            // InternalOSSWI.g:1006:2: iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF
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
    // InternalOSSWI.g:1013:1: ruleMIntegerParameterSingleExpression returns [EObject current=null] : (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleMIntegerParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_defaultValue_3_0 = null;

        EObject lv_range_5_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:1016:28: ( (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';' ) )
            // InternalOSSWI.g:1017:1: (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';' )
            {
            // InternalOSSWI.g:1017:1: (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';' )
            // InternalOSSWI.g:1017:3: otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_0());
                  
            }
            // InternalOSSWI.g:1021:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWI.g:1022:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWI.g:1022:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWI.g:1023:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMIntegerParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalOSSWI.g:1043:1: ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:1044:1: (lv_defaultValue_3_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:1044:1: (lv_defaultValue_3_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:1045:3: lv_defaultValue_3_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_defaultValue_3_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMIntegerParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_3_0, 
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalOSSWI.g:1061:2: (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOSSWI.g:1061:4: otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) )
                    {
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_4_0());
                          
                    }
                    // InternalOSSWI.g:1065:1: ( (lv_range_5_0= ruleMParameterRange ) )
                    // InternalOSSWI.g:1066:1: (lv_range_5_0= ruleMParameterRange )
                    {
                    // InternalOSSWI.g:1066:1: (lv_range_5_0= ruleMParameterRange )
                    // InternalOSSWI.g:1067:3: lv_range_5_0= ruleMParameterRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_range_5_0=ruleMParameterRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMIntegerParameterSingleExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_5_0, 
                              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_5());
                  
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
    // InternalOSSWI.g:1095:1: entryRuleMEnumParameterDefinition returns [EObject current=null] : iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF ;
    public final EObject entryRuleMEnumParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterDefinition = null;


        try {
            // InternalOSSWI.g:1096:2: (iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF )
            // InternalOSSWI.g:1097:2: iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF
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
    // InternalOSSWI.g:1104:1: ruleMEnumParameterDefinition returns [EObject current=null] : ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' ) ;
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
            // InternalOSSWI.g:1107:28: ( ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // InternalOSSWI.g:1108:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalOSSWI.g:1108:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' )
            // InternalOSSWI.g:1108:2: () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // InternalOSSWI.g:1108:2: ()
            // InternalOSSWI.g:1109:2: 
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

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1());
                  
            }
            // InternalOSSWI.g:1121:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalOSSWI.g:1122:1: (lv_name_2_0= RULE_ID )
            {
            // InternalOSSWI.g:1122:1: (lv_name_2_0= RULE_ID )
            // InternalOSSWI.g:1123:3: lv_name_2_0= RULE_ID
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
            // InternalOSSWI.g:1143:1: ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) )
            // InternalOSSWI.g:1144:1: (lv_literals_4_0= ruleMEnumParameterLiteralRule )
            {
            // InternalOSSWI.g:1144:1: (lv_literals_4_0= ruleMEnumParameterLiteralRule )
            // InternalOSSWI.g:1145:3: lv_literals_4_0= ruleMEnumParameterLiteralRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_28);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MEnumParameterLiteralRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalOSSWI.g:1161:2: (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOSSWI.g:1161:4: otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // InternalOSSWI.g:1165:1: ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) )
            	    // InternalOSSWI.g:1166:1: (lv_literals_6_0= ruleMEnumParameterLiteralRule )
            	    {
            	    // InternalOSSWI.g:1166:1: (lv_literals_6_0= ruleMEnumParameterLiteralRule )
            	    // InternalOSSWI.g:1167:3: lv_literals_6_0= ruleMEnumParameterLiteralRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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
            	              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MEnumParameterLiteralRule");
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
    // InternalOSSWI.g:1199:1: entryRuleMEnumParameterSingleExpression returns [EObject current=null] : iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF ;
    public final EObject entryRuleMEnumParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterSingleExpression = null;


        try {
            // InternalOSSWI.g:1200:2: (iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF )
            // InternalOSSWI.g:1201:2: iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF
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
    // InternalOSSWI.g:1208:1: ruleMEnumParameterSingleExpression returns [EObject current=null] : (otherlv_0= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleMEnumParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_defaultValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:1211:28: ( (otherlv_0= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) )
            // InternalOSSWI.g:1212:1: (otherlv_0= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            {
            // InternalOSSWI.g:1212:1: (otherlv_0= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            // InternalOSSWI.g:1212:3: otherlv_0= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_0());
                  
            }
            // InternalOSSWI.g:1216:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalOSSWI.g:1217:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalOSSWI.g:1217:1: ( ruleVersionedQualifiedReferenceName )
            // InternalOSSWI.g:1218:3: ruleVersionedQualifiedReferenceName
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
               
              	        newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_1_0()); 
              	    
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

            // InternalOSSWI.g:1234:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalOSSWI.g:1235:1: (lv_name_2_0= RULE_ID )
            {
            // InternalOSSWI.g:1235:1: (lv_name_2_0= RULE_ID )
            // InternalOSSWI.g:1236:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMEnumParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalOSSWI.g:1256:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:1257:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:1257:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:1258:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_defaultValue_4_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMEnumParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_4_0, 
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_5());
                  
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
    // InternalOSSWI.g:1286:1: entryRuleMRealParameterSingleExpression returns [EObject current=null] : iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF ;
    public final EObject entryRuleMRealParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRealParameterSingleExpression = null;


        try {
            // InternalOSSWI.g:1287:2: (iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF )
            // InternalOSSWI.g:1288:2: iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF
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
    // InternalOSSWI.g:1295:1: ruleMRealParameterSingleExpression returns [EObject current=null] : (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleMRealParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_defaultValue_3_0 = null;

        EObject lv_range_5_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:1298:28: ( (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';' ) )
            // InternalOSSWI.g:1299:1: (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';' )
            {
            // InternalOSSWI.g:1299:1: (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';' )
            // InternalOSSWI.g:1299:3: otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_0());
                  
            }
            // InternalOSSWI.g:1303:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWI.g:1304:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWI.g:1304:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWI.g:1305:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMRealParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalOSSWI.g:1325:1: ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:1326:1: (lv_defaultValue_3_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:1326:1: (lv_defaultValue_3_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:1327:3: lv_defaultValue_3_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_defaultValue_3_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMRealParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_3_0, 
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalOSSWI.g:1343:2: (otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOSSWI.g:1343:4: otherlv_4= 'range' ( (lv_range_5_0= ruleMParameterRange ) )
                    {
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_4_0());
                          
                    }
                    // InternalOSSWI.g:1347:1: ( (lv_range_5_0= ruleMParameterRange ) )
                    // InternalOSSWI.g:1348:1: (lv_range_5_0= ruleMParameterRange )
                    {
                    // InternalOSSWI.g:1348:1: (lv_range_5_0= ruleMParameterRange )
                    // InternalOSSWI.g:1349:3: lv_range_5_0= ruleMParameterRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_range_5_0=ruleMParameterRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMRealParameterSingleExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_5_0, 
                              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_5());
                  
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
    // InternalOSSWI.g:1377:1: entryRuleMEnumParameterLiteralRule returns [EObject current=null] : iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF ;
    public final EObject entryRuleMEnumParameterLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterLiteralRule = null;


        try {
            // InternalOSSWI.g:1378:2: (iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF )
            // InternalOSSWI.g:1379:2: iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF
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
    // InternalOSSWI.g:1386:1: ruleMEnumParameterLiteralRule returns [EObject current=null] : (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral ) ;
    public final EObject ruleMEnumParameterLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject this_MEnumParameterLiteral_0 = null;

        EObject this_MEnumParamIntegerLiteral_1 = null;

        EObject this_MEnumParamRealLiteral_2 = null;

        EObject this_MEnumParamStringLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:1389:28: ( (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral ) )
            // InternalOSSWI.g:1390:1: (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral )
            {
            // InternalOSSWI.g:1390:1: (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral )
            int alt20=4;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==38) ) {
                    switch ( input.LA(3) ) {
                    case RULE_STRING:
                    case 39:
                        {
                        alt20=4;
                        }
                        break;
                    case 44:
                        {
                        int LA20_5 = input.LA(4);

                        if ( (LA20_5==RULE_INT) ) {
                            int LA20_6 = input.LA(5);

                            if ( (LA20_6==EOF||LA20_6==21||LA20_6==28) ) {
                                alt20=2;
                            }
                            else if ( (LA20_6==15) ) {
                                alt20=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        int LA20_6 = input.LA(4);

                        if ( (LA20_6==EOF||LA20_6==21||LA20_6==28) ) {
                            alt20=2;
                        }
                        else if ( (LA20_6==15) ) {
                            alt20=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HEXADECIMAL:
                        {
                        alt20=2;
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
                    // InternalOSSWI.g:1391:2: this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral
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
                    // InternalOSSWI.g:1404:2: this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral
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
                    // InternalOSSWI.g:1417:2: this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral
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
                    // InternalOSSWI.g:1430:2: this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral
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
    // InternalOSSWI.g:1449:1: entryRuleMEnumParameterLiteral returns [EObject current=null] : iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF ;
    public final EObject entryRuleMEnumParameterLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterLiteral = null;


        try {
            // InternalOSSWI.g:1450:2: (iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF )
            // InternalOSSWI.g:1451:2: iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF
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
    // InternalOSSWI.g:1458:1: ruleMEnumParameterLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMEnumParameterLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalOSSWI.g:1461:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalOSSWI.g:1462:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalOSSWI.g:1462:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalOSSWI.g:1462:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalOSSWI.g:1462:2: ()
            // InternalOSSWI.g:1463:2: 
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

            // InternalOSSWI.g:1471:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWI.g:1472:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWI.g:1472:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWI.g:1473:3: lv_name_1_0= RULE_ID
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
    // InternalOSSWI.g:1497:1: entryRuleMEnumParamIntegerLiteral returns [EObject current=null] : iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF ;
    public final EObject entryRuleMEnumParamIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamIntegerLiteral = null;


        try {
            // InternalOSSWI.g:1498:2: (iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF )
            // InternalOSSWI.g:1499:2: iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF
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
    // InternalOSSWI.g:1506:1: ruleMEnumParamIntegerLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMEnumParamIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:1509:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) ) )
            // InternalOSSWI.g:1510:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) )
            {
            // InternalOSSWI.g:1510:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) )
            // InternalOSSWI.g:1510:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) )
            {
            // InternalOSSWI.g:1510:2: ()
            // InternalOSSWI.g:1511:2: 
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

            // InternalOSSWI.g:1519:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWI.g:1520:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWI.g:1520:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWI.g:1521:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalOSSWI.g:1541:1: ( (lv_value_3_0= ruleINTEGER ) )
            // InternalOSSWI.g:1542:1: (lv_value_3_0= ruleINTEGER )
            {
            // InternalOSSWI.g:1542:1: (lv_value_3_0= ruleINTEGER )
            // InternalOSSWI.g:1543:3: lv_value_3_0= ruleINTEGER
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.INTEGER");
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
    // InternalOSSWI.g:1567:1: entryRuleMEnumParamRealLiteral returns [EObject current=null] : iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF ;
    public final EObject entryRuleMEnumParamRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamRealLiteral = null;


        try {
            // InternalOSSWI.g:1568:2: (iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF )
            // InternalOSSWI.g:1569:2: iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF
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
    // InternalOSSWI.g:1576:1: ruleMEnumParamRealLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) ) ;
    public final EObject ruleMEnumParamRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:1579:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) ) )
            // InternalOSSWI.g:1580:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) )
            {
            // InternalOSSWI.g:1580:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) )
            // InternalOSSWI.g:1580:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) )
            {
            // InternalOSSWI.g:1580:2: ()
            // InternalOSSWI.g:1581:2: 
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

            // InternalOSSWI.g:1589:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWI.g:1590:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWI.g:1590:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWI.g:1591:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalOSSWI.g:1611:1: ( (lv_value_3_0= ruleREAL ) )
            // InternalOSSWI.g:1612:1: (lv_value_3_0= ruleREAL )
            {
            // InternalOSSWI.g:1612:1: (lv_value_3_0= ruleREAL )
            // InternalOSSWI.g:1613:3: lv_value_3_0= ruleREAL
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.REAL");
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
    // InternalOSSWI.g:1637:1: entryRuleMEnumParamStringLiteral returns [EObject current=null] : iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF ;
    public final EObject entryRuleMEnumParamStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamStringLiteral = null;


        try {
            // InternalOSSWI.g:1638:2: (iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF )
            // InternalOSSWI.g:1639:2: iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF
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
    // InternalOSSWI.g:1646:1: ruleMEnumParamStringLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleMEnumParamStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isRaw_3_0=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // InternalOSSWI.g:1649:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalOSSWI.g:1650:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalOSSWI.g:1650:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalOSSWI.g:1650:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) )
            {
            // InternalOSSWI.g:1650:2: ()
            // InternalOSSWI.g:1651:2: 
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

            // InternalOSSWI.g:1659:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWI.g:1660:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWI.g:1660:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWI.g:1661:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalOSSWI.g:1681:1: ( (lv_isRaw_3_0= 'raw' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOSSWI.g:1682:1: (lv_isRaw_3_0= 'raw' )
                    {
                    // InternalOSSWI.g:1682:1: (lv_isRaw_3_0= 'raw' )
                    // InternalOSSWI.g:1683:3: lv_isRaw_3_0= 'raw'
                    {
                    lv_isRaw_3_0=(Token)match(input,39,FollowSets000.FOLLOW_33); if (state.failed) return current;
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

            // InternalOSSWI.g:1696:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalOSSWI.g:1697:1: (lv_value_4_0= RULE_STRING )
            {
            // InternalOSSWI.g:1697:1: (lv_value_4_0= RULE_STRING )
            // InternalOSSWI.g:1698:3: lv_value_4_0= RULE_STRING
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
    // InternalOSSWI.g:1722:1: entryRuleMBooleanParameterSingleExpression returns [EObject current=null] : iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF ;
    public final EObject entryRuleMBooleanParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMBooleanParameterSingleExpression = null;


        try {
            // InternalOSSWI.g:1723:2: (iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF )
            // InternalOSSWI.g:1724:2: iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF
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
    // InternalOSSWI.g:1731:1: ruleMBooleanParameterSingleExpression returns [EObject current=null] : (otherlv_0= 'boolean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleMBooleanParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_defaultValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:1734:28: ( (otherlv_0= 'boolean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) )
            // InternalOSSWI.g:1735:1: (otherlv_0= 'boolean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            {
            // InternalOSSWI.g:1735:1: (otherlv_0= 'boolean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            // InternalOSSWI.g:1735:3: otherlv_0= 'boolean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_0());
                  
            }
            // InternalOSSWI.g:1739:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWI.g:1740:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWI.g:1740:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWI.g:1741:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMBooleanParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalOSSWI.g:1761:1: ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:1762:1: (lv_defaultValue_3_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:1762:1: (lv_defaultValue_3_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:1763:3: lv_defaultValue_3_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_defaultValue_3_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMBooleanParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_3_0, 
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_4());
                  
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
    // InternalOSSWI.g:1791:1: entryRuleMStringParameterSingleExpression returns [EObject current=null] : iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF ;
    public final EObject entryRuleMStringParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMStringParameterSingleExpression = null;


        try {
            // InternalOSSWI.g:1792:2: (iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF )
            // InternalOSSWI.g:1793:2: iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF
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
    // InternalOSSWI.g:1800:1: ruleMStringParameterSingleExpression returns [EObject current=null] : (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleMStringParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_defaultValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:1803:28: ( (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) )
            // InternalOSSWI.g:1804:1: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            {
            // InternalOSSWI.g:1804:1: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            // InternalOSSWI.g:1804:3: otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_0());
                  
            }
            // InternalOSSWI.g:1808:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalOSSWI.g:1809:1: (lv_name_1_0= RULE_ID )
            {
            // InternalOSSWI.g:1809:1: (lv_name_1_0= RULE_ID )
            // InternalOSSWI.g:1810:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMStringParameterSingleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalOSSWI.g:1830:1: ( (lv_defaultValue_3_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:1831:1: (lv_defaultValue_3_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:1831:1: (lv_defaultValue_3_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:1832:3: lv_defaultValue_3_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_defaultValue_3_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMStringParameterSingleExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultValue",
                      		lv_defaultValue_3_0, 
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_4());
                  
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
    // InternalOSSWI.g:1860:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalOSSWI.g:1861:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalOSSWI.g:1862:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalOSSWI.g:1869:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalOSSWI.g:1872:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalOSSWI.g:1873:1: (kw= 'true' | kw= 'false' )
            {
            // InternalOSSWI.g:1873:1: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            else if ( (LA22_0==43) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalOSSWI.g:1874:2: kw= 'true'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalOSSWI.g:1881:2: kw= 'false'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalOSSWI.g:1894:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalOSSWI.g:1895:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalOSSWI.g:1896:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalOSSWI.g:1903:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;

         enterRule(); 
            
        try {
            // InternalOSSWI.g:1906:28: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalOSSWI.g:1907:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalOSSWI.g:1907:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||LA24_0==44) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_HEXADECIMAL) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalOSSWI.g:1907:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalOSSWI.g:1907:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalOSSWI.g:1907:3: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalOSSWI.g:1907:3: (kw= '-' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==44) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalOSSWI.g:1908:2: kw= '-'
                            {
                            kw=(Token)match(input,44,FollowSets000.FOLLOW_34); if (state.failed) return current;
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
                    // InternalOSSWI.g:1921:10: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalOSSWI.g:1936:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // InternalOSSWI.g:1937:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalOSSWI.g:1938:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalOSSWI.g:1945:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // InternalOSSWI.g:1948:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalOSSWI.g:1949:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalOSSWI.g:1949:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalOSSWI.g:1949:2: (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalOSSWI.g:1949:2: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOSSWI.g:1950:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            // InternalOSSWI.g:1955:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalOSSWI.g:1955:8: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
                  
            }
            kw=(Token)match(input,15,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
                  
            }

            }

            // InternalOSSWI.g:1975:2: (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOSSWI.g:1976:2: kw= 'e' (kw= '-' )? this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0()); 
                          
                    }
                    // InternalOSSWI.g:1981:1: (kw= '-' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==44) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalOSSWI.g:1982:2: kw= '-'
                            {
                            kw=(Token)match(input,44,FollowSets000.FOLLOW_34); if (state.failed) return current;
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
    // InternalOSSWI.g:2002:1: entryRuleMParameterValue returns [EObject current=null] : iv_ruleMParameterValue= ruleMParameterValue EOF ;
    public final EObject entryRuleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValue = null;


        try {
            // InternalOSSWI.g:2003:2: (iv_ruleMParameterValue= ruleMParameterValue EOF )
            // InternalOSSWI.g:2004:2: iv_ruleMParameterValue= ruleMParameterValue EOF
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
    // InternalOSSWI.g:2011:1: ruleMParameterValue returns [EObject current=null] : (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) ;
    public final EObject ruleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueLiteral_0 = null;

        EObject this_MParameterValueRefObject_1 = null;

        EObject this_MParameterValuePAR_2 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2014:28: ( (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) )
            // InternalOSSWI.g:2015:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            {
            // InternalOSSWI.g:2015:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEXADECIMAL:
            case 39:
            case 42:
            case 43:
            case 44:
                {
                alt28=1;
                }
                break;
            case RULE_ID:
                {
                alt28=2;
                }
                break;
            case 16:
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
                    // InternalOSSWI.g:2016:2: this_MParameterValueLiteral_0= ruleMParameterValueLiteral
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
                    // InternalOSSWI.g:2029:2: this_MParameterValueRefObject_1= ruleMParameterValueRefObject
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
                    // InternalOSSWI.g:2042:2: this_MParameterValuePAR_2= ruleMParameterValuePAR
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
    // InternalOSSWI.g:2061:1: entryRuleMParameterValueLiteral returns [EObject current=null] : iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF ;
    public final EObject entryRuleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueLiteral = null;


        try {
            // InternalOSSWI.g:2062:2: (iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF )
            // InternalOSSWI.g:2063:2: iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF
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
    // InternalOSSWI.g:2070:1: ruleMParameterValueLiteral returns [EObject current=null] : (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) ;
    public final EObject ruleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueBooleanLiteral_0 = null;

        EObject this_MParameterValueStringLiteral_1 = null;

        EObject this_MParameterValueIntegerLiteral_2 = null;

        EObject this_MParameterValueRealLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2073:28: ( (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) )
            // InternalOSSWI.g:2074:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            {
            // InternalOSSWI.g:2074:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
                {
                alt29=1;
                }
                break;
            case RULE_STRING:
            case 39:
                {
                alt29=2;
                }
                break;
            case 44:
                {
                int LA29_3 = input.LA(2);

                if ( (LA29_3==RULE_INT) ) {
                    int LA29_4 = input.LA(3);

                    if ( (LA29_4==15) ) {
                        alt29=4;
                    }
                    else if ( (LA29_4==EOF||LA29_4==13||LA29_4==17||LA29_4==21||LA29_4==32||LA29_4==35||LA29_4==44||LA29_4==46||(LA29_4>=48 && LA29_4<=50)) ) {
                        alt29=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA29_4 = input.LA(2);

                if ( (LA29_4==15) ) {
                    alt29=4;
                }
                else if ( (LA29_4==EOF||LA29_4==13||LA29_4==17||LA29_4==21||LA29_4==32||LA29_4==35||LA29_4==44||LA29_4==46||(LA29_4>=48 && LA29_4<=50)) ) {
                    alt29=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEXADECIMAL:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalOSSWI.g:2075:2: this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral
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
                    // InternalOSSWI.g:2088:2: this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral
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
                    // InternalOSSWI.g:2101:2: this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral
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
                    // InternalOSSWI.g:2114:2: this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral
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
    // InternalOSSWI.g:2133:1: entryRuleMParameterValueBooleanLiteral returns [EObject current=null] : iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF ;
    public final EObject entryRuleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueBooleanLiteral = null;


        try {
            // InternalOSSWI.g:2134:2: (iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF )
            // InternalOSSWI.g:2135:2: iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF
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
    // InternalOSSWI.g:2142:1: ruleMParameterValueBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2145:28: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // InternalOSSWI.g:2146:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // InternalOSSWI.g:2146:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // InternalOSSWI.g:2146:2: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // InternalOSSWI.g:2146:2: ()
            // InternalOSSWI.g:2147:2: 
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

            // InternalOSSWI.g:2155:2: ( (lv_value_1_0= ruleEBoolean ) )
            // InternalOSSWI.g:2156:1: (lv_value_1_0= ruleEBoolean )
            {
            // InternalOSSWI.g:2156:1: (lv_value_1_0= ruleEBoolean )
            // InternalOSSWI.g:2157:3: lv_value_1_0= ruleEBoolean
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.EBoolean");
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
    // InternalOSSWI.g:2181:1: entryRuleMParameterValueStringLiteral returns [EObject current=null] : iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF ;
    public final EObject entryRuleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueStringLiteral = null;


        try {
            // InternalOSSWI.g:2182:2: (iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF )
            // InternalOSSWI.g:2183:2: iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF
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
    // InternalOSSWI.g:2190:1: ruleMParameterValueStringLiteral returns [EObject current=null] : ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isRaw_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalOSSWI.g:2193:28: ( ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalOSSWI.g:2194:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalOSSWI.g:2194:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalOSSWI.g:2194:2: () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalOSSWI.g:2194:2: ()
            // InternalOSSWI.g:2195:2: 
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

            // InternalOSSWI.g:2203:2: ( (lv_isRaw_1_0= 'raw' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOSSWI.g:2204:1: (lv_isRaw_1_0= 'raw' )
                    {
                    // InternalOSSWI.g:2204:1: (lv_isRaw_1_0= 'raw' )
                    // InternalOSSWI.g:2205:3: lv_isRaw_1_0= 'raw'
                    {
                    lv_isRaw_1_0=(Token)match(input,39,FollowSets000.FOLLOW_33); if (state.failed) return current;
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

            // InternalOSSWI.g:2218:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalOSSWI.g:2219:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalOSSWI.g:2219:1: (lv_value_2_0= RULE_STRING )
            // InternalOSSWI.g:2220:3: lv_value_2_0= RULE_STRING
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
    // InternalOSSWI.g:2244:1: entryRuleMParameterValueIntegerLiteral returns [EObject current=null] : iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF ;
    public final EObject entryRuleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueIntegerLiteral = null;


        try {
            // InternalOSSWI.g:2245:2: (iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF )
            // InternalOSSWI.g:2246:2: iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF
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
    // InternalOSSWI.g:2253:1: ruleMParameterValueIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2256:28: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) )
            // InternalOSSWI.g:2257:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            {
            // InternalOSSWI.g:2257:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            // InternalOSSWI.g:2257:2: () ( (lv_value_1_0= ruleINTEGER ) )
            {
            // InternalOSSWI.g:2257:2: ()
            // InternalOSSWI.g:2258:2: 
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

            // InternalOSSWI.g:2266:2: ( (lv_value_1_0= ruleINTEGER ) )
            // InternalOSSWI.g:2267:1: (lv_value_1_0= ruleINTEGER )
            {
            // InternalOSSWI.g:2267:1: (lv_value_1_0= ruleINTEGER )
            // InternalOSSWI.g:2268:3: lv_value_1_0= ruleINTEGER
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.INTEGER");
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
    // InternalOSSWI.g:2292:1: entryRuleMParameterValueRealLiteral returns [EObject current=null] : iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF ;
    public final EObject entryRuleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRealLiteral = null;


        try {
            // InternalOSSWI.g:2293:2: (iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF )
            // InternalOSSWI.g:2294:2: iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF
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
    // InternalOSSWI.g:2301:1: ruleMParameterValueRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ) ;
    public final EObject ruleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2304:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ) )
            // InternalOSSWI.g:2305:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            {
            // InternalOSSWI.g:2305:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            // InternalOSSWI.g:2305:2: () ( (lv_value_1_0= ruleREAL ) )
            {
            // InternalOSSWI.g:2305:2: ()
            // InternalOSSWI.g:2306:2: 
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

            // InternalOSSWI.g:2314:2: ( (lv_value_1_0= ruleREAL ) )
            // InternalOSSWI.g:2315:1: (lv_value_1_0= ruleREAL )
            {
            // InternalOSSWI.g:2315:1: (lv_value_1_0= ruleREAL )
            // InternalOSSWI.g:2316:3: lv_value_1_0= ruleREAL
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.REAL");
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
    // InternalOSSWI.g:2340:1: entryRuleMParameterValueRefObject returns [EObject current=null] : iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF ;
    public final EObject entryRuleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRefObject = null;


        try {
            // InternalOSSWI.g:2341:2: (iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF )
            // InternalOSSWI.g:2342:2: iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF
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
    // InternalOSSWI.g:2349:1: ruleMParameterValueRefObject returns [EObject current=null] : ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) ;
    public final EObject ruleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalOSSWI.g:2352:28: ( ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) )
            // InternalOSSWI.g:2353:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            {
            // InternalOSSWI.g:2353:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalOSSWI.g:2353:2: () ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalOSSWI.g:2353:2: ()
            // InternalOSSWI.g:2354:2: 
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

            // InternalOSSWI.g:2362:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalOSSWI.g:2363:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalOSSWI.g:2363:1: ( ruleVersionedQualifiedReferenceName )
            // InternalOSSWI.g:2364:3: ruleVersionedQualifiedReferenceName
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
    // InternalOSSWI.g:2388:1: entryRuleMParameterValuePAR returns [EObject current=null] : iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF ;
    public final EObject entryRuleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValuePAR = null;


        try {
            // InternalOSSWI.g:2389:2: (iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF )
            // InternalOSSWI.g:2390:2: iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF
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
    // InternalOSSWI.g:2397:1: ruleMParameterValuePAR returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2400:28: ( (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) )
            // InternalOSSWI.g:2401:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            {
            // InternalOSSWI.g:2401:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            // InternalOSSWI.g:2401:3: otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0());
                  
            }
            // InternalOSSWI.g:2405:1: ( (lv_value_1_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:2406:1: (lv_value_1_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:2406:1: (lv_value_1_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:2407:3: lv_value_1_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
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
    // InternalOSSWI.g:2435:1: entryRuleMParameterValueExpression returns [EObject current=null] : iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF ;
    public final EObject entryRuleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueExpression = null;


        try {
            // InternalOSSWI.g:2436:2: (iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF )
            // InternalOSSWI.g:2437:2: iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF
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
    // InternalOSSWI.g:2444:1: ruleMParameterValueExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) ;
    public final EObject ruleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2447:28: ( ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) )
            // InternalOSSWI.g:2448:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            {
            // InternalOSSWI.g:2448:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            // InternalOSSWI.g:2448:2: () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            {
            // InternalOSSWI.g:2448:2: ()
            // InternalOSSWI.g:2449:2: 
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

            // InternalOSSWI.g:2457:2: ( (lv_left_1_0= ruleMParameterValueTERM ) )
            // InternalOSSWI.g:2458:1: (lv_left_1_0= ruleMParameterValueTERM )
            {
            // InternalOSSWI.g:2458:1: (lv_left_1_0= ruleMParameterValueTERM )
            // InternalOSSWI.g:2459:3: lv_left_1_0= ruleMParameterValueTERM
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_38);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueTERM");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalOSSWI.g:2475:2: ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44||LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOSSWI.g:2475:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    {
                    // InternalOSSWI.g:2475:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) )
                    // InternalOSSWI.g:2476:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    {
                    // InternalOSSWI.g:2476:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    // InternalOSSWI.g:2477:3: lv_operation_2_0= ruleMParameterValueExpressionOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
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
                              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpressionOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalOSSWI.g:2493:2: ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    // InternalOSSWI.g:2494:1: (lv_right_3_0= ruleMParameterValueExpression )
                    {
                    // InternalOSSWI.g:2494:1: (lv_right_3_0= ruleMParameterValueExpression )
                    // InternalOSSWI.g:2495:3: lv_right_3_0= ruleMParameterValueExpression
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
                              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
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
    // InternalOSSWI.g:2519:1: entryRuleMParameterValueTERM returns [EObject current=null] : iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF ;
    public final EObject entryRuleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueTERM = null;


        try {
            // InternalOSSWI.g:2520:2: (iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF )
            // InternalOSSWI.g:2521:2: iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF
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
    // InternalOSSWI.g:2528:1: ruleMParameterValueTERM returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) ;
    public final EObject ruleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2531:28: ( ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) )
            // InternalOSSWI.g:2532:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            {
            // InternalOSSWI.g:2532:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            // InternalOSSWI.g:2532:2: () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            {
            // InternalOSSWI.g:2532:2: ()
            // InternalOSSWI.g:2533:2: 
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

            // InternalOSSWI.g:2541:2: ( (lv_left_1_0= ruleMParameterValue ) )
            // InternalOSSWI.g:2542:1: (lv_left_1_0= ruleMParameterValue )
            {
            // InternalOSSWI.g:2542:1: (lv_left_1_0= ruleMParameterValue )
            // InternalOSSWI.g:2543:3: lv_left_1_0= ruleMParameterValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_39);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalOSSWI.g:2559:2: ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=49 && LA32_0<=50)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOSSWI.g:2559:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    {
                    // InternalOSSWI.g:2559:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) )
                    // InternalOSSWI.g:2560:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    {
                    // InternalOSSWI.g:2560:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    // InternalOSSWI.g:2561:3: lv_operation_2_0= ruleMParameterValueTERMOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
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
                              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueTERMOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalOSSWI.g:2577:2: ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    // InternalOSSWI.g:2578:1: (lv_right_3_0= ruleMParameterValueTERM )
                    {
                    // InternalOSSWI.g:2578:1: (lv_right_3_0= ruleMParameterValueTERM )
                    // InternalOSSWI.g:2579:3: lv_right_3_0= ruleMParameterValueTERM
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
                              		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueTERM");
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
    // InternalOSSWI.g:2603:1: entryRuleMParameterRange returns [EObject current=null] : iv_ruleMParameterRange= ruleMParameterRange EOF ;
    public final EObject entryRuleMParameterRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterRange = null;


        try {
            // InternalOSSWI.g:2604:2: (iv_ruleMParameterRange= ruleMParameterRange EOF )
            // InternalOSSWI.g:2605:2: iv_ruleMParameterRange= ruleMParameterRange EOF
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
    // InternalOSSWI.g:2612:1: ruleMParameterRange returns [EObject current=null] : (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR ) ;
    public final EObject ruleMParameterRange() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterOCR_0 = null;

        EObject this_MParameterOOR_1 = null;

        EObject this_MParameterCOR_2 = null;

        EObject this_MParameterCCR_3 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2615:28: ( (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR ) )
            // InternalOSSWI.g:2616:1: (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR )
            {
            // InternalOSSWI.g:2616:1: (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred44_InternalOSSWI()) ) {
                    alt33=1;
                }
                else if ( (synpred45_InternalOSSWI()) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==47) ) {
                int LA33_2 = input.LA(2);

                if ( (synpred46_InternalOSSWI()) ) {
                    alt33=3;
                }
                else if ( (true) ) {
                    alt33=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalOSSWI.g:2617:2: this_MParameterOCR_0= ruleMParameterOCR
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
                    // InternalOSSWI.g:2630:2: this_MParameterOOR_1= ruleMParameterOOR
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
                    // InternalOSSWI.g:2643:2: this_MParameterCOR_2= ruleMParameterCOR
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
                    // InternalOSSWI.g:2656:2: this_MParameterCCR_3= ruleMParameterCCR
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
    // InternalOSSWI.g:2675:1: entryRuleMParameterOCR returns [EObject current=null] : iv_ruleMParameterOCR= ruleMParameterOCR EOF ;
    public final EObject entryRuleMParameterOCR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterOCR = null;


        try {
            // InternalOSSWI.g:2676:2: (iv_ruleMParameterOCR= ruleMParameterOCR EOF )
            // InternalOSSWI.g:2677:2: iv_ruleMParameterOCR= ruleMParameterOCR EOF
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
    // InternalOSSWI.g:2684:1: ruleMParameterOCR returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) ;
    public final EObject ruleMParameterOCR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2687:28: ( ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) )
            // InternalOSSWI.g:2688:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            {
            // InternalOSSWI.g:2688:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            // InternalOSSWI.g:2688:2: () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']'
            {
            // InternalOSSWI.g:2688:2: ()
            // InternalOSSWI.g:2689:2: 
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

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalOSSWI.g:2701:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:2702:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:2702:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:2703:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterOCRAccess().getCommaKeyword_3());
                  
            }
            // InternalOSSWI.g:2723:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:2724:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:2724:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:2725:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_41);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalOSSWI.g:2753:1: entryRuleMParameterOOR returns [EObject current=null] : iv_ruleMParameterOOR= ruleMParameterOOR EOF ;
    public final EObject entryRuleMParameterOOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterOOR = null;


        try {
            // InternalOSSWI.g:2754:2: (iv_ruleMParameterOOR= ruleMParameterOOR EOF )
            // InternalOSSWI.g:2755:2: iv_ruleMParameterOOR= ruleMParameterOOR EOF
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
    // InternalOSSWI.g:2762:1: ruleMParameterOOR returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMParameterOOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2765:28: ( ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) )
            // InternalOSSWI.g:2766:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            {
            // InternalOSSWI.g:2766:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            // InternalOSSWI.g:2766:2: () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')'
            {
            // InternalOSSWI.g:2766:2: ()
            // InternalOSSWI.g:2767:2: 
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

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalOSSWI.g:2779:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:2780:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:2780:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:2781:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterOORAccess().getCommaKeyword_3());
                  
            }
            // InternalOSSWI.g:2801:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:2802:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:2802:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:2803:3: lv_upperValue_4_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
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
    // InternalOSSWI.g:2831:1: entryRuleMParameterCOR returns [EObject current=null] : iv_ruleMParameterCOR= ruleMParameterCOR EOF ;
    public final EObject entryRuleMParameterCOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterCOR = null;


        try {
            // InternalOSSWI.g:2832:2: (iv_ruleMParameterCOR= ruleMParameterCOR EOF )
            // InternalOSSWI.g:2833:2: iv_ruleMParameterCOR= ruleMParameterCOR EOF
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
    // InternalOSSWI.g:2840:1: ruleMParameterCOR returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMParameterCOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2843:28: ( ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) )
            // InternalOSSWI.g:2844:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            {
            // InternalOSSWI.g:2844:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            // InternalOSSWI.g:2844:2: () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')'
            {
            // InternalOSSWI.g:2844:2: ()
            // InternalOSSWI.g:2845:2: 
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

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalOSSWI.g:2857:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:2858:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:2858:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:2859:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterCORAccess().getCommaKeyword_3());
                  
            }
            // InternalOSSWI.g:2879:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:2880:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:2880:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:2881:3: lv_upperValue_4_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
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
    // InternalOSSWI.g:2909:1: entryRuleMParameterCCR returns [EObject current=null] : iv_ruleMParameterCCR= ruleMParameterCCR EOF ;
    public final EObject entryRuleMParameterCCR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterCCR = null;


        try {
            // InternalOSSWI.g:2910:2: (iv_ruleMParameterCCR= ruleMParameterCCR EOF )
            // InternalOSSWI.g:2911:2: iv_ruleMParameterCCR= ruleMParameterCCR EOF
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
    // InternalOSSWI.g:2918:1: ruleMParameterCCR returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) ;
    public final EObject ruleMParameterCCR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalOSSWI.g:2921:28: ( ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) )
            // InternalOSSWI.g:2922:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            {
            // InternalOSSWI.g:2922:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            // InternalOSSWI.g:2922:2: () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']'
            {
            // InternalOSSWI.g:2922:2: ()
            // InternalOSSWI.g:2923:2: 
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

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalOSSWI.g:2935:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:2936:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:2936:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:2937:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterCCRAccess().getCommaKeyword_3());
                  
            }
            // InternalOSSWI.g:2957:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalOSSWI.g:2958:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:2958:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalOSSWI.g:2959:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_41);
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
                      		"es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalOSSWI.g:2987:1: ruleMParameterValueExpressionOperators returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleMParameterValueExpressionOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalOSSWI.g:2989:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalOSSWI.g:2990:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalOSSWI.g:2990:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            else if ( (LA34_0==44) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalOSSWI.g:2990:2: (enumLiteral_0= '+' )
                    {
                    // InternalOSSWI.g:2990:2: (enumLiteral_0= '+' )
                    // InternalOSSWI.g:2990:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOSSWI.g:2996:6: (enumLiteral_1= '-' )
                    {
                    // InternalOSSWI.g:2996:6: (enumLiteral_1= '-' )
                    // InternalOSSWI.g:2996:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalOSSWI.g:3006:1: ruleMParameterValueTERMOperators returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMParameterValueTERMOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalOSSWI.g:3008:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalOSSWI.g:3009:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalOSSWI.g:3009:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            else if ( (LA35_0==50) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalOSSWI.g:3009:2: (enumLiteral_0= '*' )
                    {
                    // InternalOSSWI.g:3009:2: (enumLiteral_0= '*' )
                    // InternalOSSWI.g:3009:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOSSWI.g:3015:6: (enumLiteral_1= '/' )
                    {
                    // InternalOSSWI.g:3015:6: (enumLiteral_1= '/' )
                    // InternalOSSWI.g:3015:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


        // InternalOSSWI.g:527:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalOSSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalOSSWI.g:527:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalOSSWI.g:528:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalOSSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalOSSWI.g:528:111: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalOSSWI.g:529:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0);
        // InternalOSSWI.g:532:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalOSSWI.g:532:7: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalOSSWI", "true");
        }
        // InternalOSSWI.g:532:16: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalOSSWI.g:532:18: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalOSSWI.g:540:1: ( (lv_version_10_0= ruleVersion ) )
        // InternalOSSWI.g:541:1: (lv_version_10_0= ruleVersion )
        {
        // InternalOSSWI.g:541:1: (lv_version_10_0= ruleVersion )
        // InternalOSSWI.g:542:3: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
          	    
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
    // $ANTLR end synpred12_InternalOSSWI

    // $ANTLR start synpred13_InternalOSSWI
    public final void synpred13_InternalOSSWI_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;

        // InternalOSSWI.g:569:4: ( ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) ) )
        // InternalOSSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalOSSWI.g:569:4: ({...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) ) )
        // InternalOSSWI.g:570:5: {...}? => ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalOSSWI.g:570:111: ( ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) ) )
        // InternalOSSWI.g:571:6: ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1);
        // InternalOSSWI.g:574:6: ({...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ) )
        // InternalOSSWI.g:574:7: {...}? => (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWI", "true");
        }
        // InternalOSSWI.g:574:16: (otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )
        // InternalOSSWI.g:574:18: otherlv_12= 'osapi' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalOSSWI.g:582:1: ( ( ruleVersionedQualifiedName ) )
        // InternalOSSWI.g:583:1: ( ruleVersionedQualifiedName )
        {
        // InternalOSSWI.g:583:1: ( ruleVersionedQualifiedName )
        // InternalOSSWI.g:584:3: ruleVersionedQualifiedName
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
    // $ANTLR end synpred13_InternalOSSWI

    // $ANTLR start synpred15_InternalOSSWI
    public final void synpred15_InternalOSSWI_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_providedResources_19_0 = null;


        // InternalOSSWI.g:611:4: ( ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )
        // InternalOSSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
        {
        // InternalOSSWI.g:611:4: ({...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
        // InternalOSSWI.g:612:5: {...}? => ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalOSSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2)");
        }
        // InternalOSSWI.g:612:111: ( ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
        // InternalOSSWI.g:613:6: ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2);
        // InternalOSSWI.g:616:6: ({...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' ) )
        // InternalOSSWI.g:616:7: {...}? => (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalOSSWI", "true");
        }
        // InternalOSSWI.g:616:16: (otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';' )
        // InternalOSSWI.g:616:18: otherlv_16= 'provided' otherlv_17= 'resources' otherlv_18= '{' ( (lv_providedResources_19_0= ruleMProvidedResource ) )+ otherlv_20= '}' otherlv_21= ';'
        {
        otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_17); if (state.failed) return ;
        otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_19); if (state.failed) return ;
        // InternalOSSWI.g:628:1: ( (lv_providedResources_19_0= ruleMProvidedResource ) )+
        int cnt39=0;
        loop39:
        do {
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==29||LA39_0==33) ) {
                alt39=1;
            }


            switch (alt39) {
        	case 1 :
        	    // InternalOSSWI.g:629:1: (lv_providedResources_19_0= ruleMProvidedResource )
        	    {
        	    // InternalOSSWI.g:629:1: (lv_providedResources_19_0= ruleMProvidedResource )
        	    // InternalOSSWI.g:630:3: lv_providedResources_19_0= ruleMProvidedResource
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_20);
        	    lv_providedResources_19_0=ruleMProvidedResource();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt39 >= 1 ) break loop39;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(39, input);
                    throw eee;
            }
            cnt39++;
        } while (true);

        otherlv_20=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalOSSWI

    // $ANTLR start synpred44_InternalOSSWI
    public final void synpred44_InternalOSSWI_fragment() throws RecognitionException {   
        EObject this_MParameterOCR_0 = null;


        // InternalOSSWI.g:2617:2: (this_MParameterOCR_0= ruleMParameterOCR )
        // InternalOSSWI.g:2617:2: this_MParameterOCR_0= ruleMParameterOCR
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
    // $ANTLR end synpred44_InternalOSSWI

    // $ANTLR start synpred45_InternalOSSWI
    public final void synpred45_InternalOSSWI_fragment() throws RecognitionException {   
        EObject this_MParameterOOR_1 = null;


        // InternalOSSWI.g:2630:2: (this_MParameterOOR_1= ruleMParameterOOR )
        // InternalOSSWI.g:2630:2: this_MParameterOOR_1= ruleMParameterOOR
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
    // $ANTLR end synpred45_InternalOSSWI

    // $ANTLR start synpred46_InternalOSSWI
    public final void synpred46_InternalOSSWI_fragment() throws RecognitionException {   
        EObject this_MParameterCOR_2 = null;


        // InternalOSSWI.g:2643:2: (this_MParameterCOR_2= ruleMParameterCOR )
        // InternalOSSWI.g:2643:2: this_MParameterCOR_2= ruleMParameterCOR
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
    // $ANTLR end synpred46_InternalOSSWI

    // Delegated rules

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
    public final boolean synpred46_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalOSSWI_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000016800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000230000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001C80000100F0L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000033410000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800002000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000010000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010200000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001000000000A0L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001C80000000E0L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000040L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000020L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001100000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    }


}