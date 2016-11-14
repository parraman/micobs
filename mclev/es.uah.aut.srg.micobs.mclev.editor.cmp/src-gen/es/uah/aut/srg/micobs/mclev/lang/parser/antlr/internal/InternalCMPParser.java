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
import es.uah.aut.srg.micobs.mclev.lang.services.CMPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCMPParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'abstract'", "'component'", "'inherits'", "','", "'{'", "'version'", "':='", "'attributes'", "'}'", "'attribute'", "'values'", "'external'", "'ports'", "'languages'", "'internal'", "'requires'", "'supported'", "'platforms'", "'subcomponent'", "'instances'", "'connections'", "'singleton'", "'instance'", "'server'", "'client'", "'const'", "'integer'", "'range'", "'enum'", "'real'", "'true'", "'false'", "'-'", "'e'", "'raw'", "']'", "'['", "'='", "'boolean'", "'string'", "'connection'", "'this'", "'<->'", "'using'", "'mapping'", "'switch'", "'case'", "':'", "'platform'", "'osapi'", "'any'", "'os'", "'architecture'", "'compiler'", "'microprocessor'", "'board'", "'+'", "'*'", "'/'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_HEXADECIMAL=6;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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


        public InternalCMPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCMPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCMPParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCMP.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private CMPGrammarAccess grammarAccess;
     	
        public InternalCMPParser(TokenStream input, CMPGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MMCLEVCMPPackageFile";	
       	}
       	
       	@Override
       	protected CMPGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMMCLEVCMPPackageFile"
    // InternalCMP.g:75:1: entryRuleMMCLEVCMPPackageFile returns [EObject current=null] : iv_ruleMMCLEVCMPPackageFile= ruleMMCLEVCMPPackageFile EOF ;
    public final EObject entryRuleMMCLEVCMPPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVCMPPackageFile = null;


        try {
            // InternalCMP.g:76:2: (iv_ruleMMCLEVCMPPackageFile= ruleMMCLEVCMPPackageFile EOF )
            // InternalCMP.g:77:2: iv_ruleMMCLEVCMPPackageFile= ruleMMCLEVCMPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVCMPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMCLEVCMPPackageFile=ruleMMCLEVCMPPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVCMPPackageFile; 
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
    // $ANTLR end "entryRuleMMCLEVCMPPackageFile"


    // $ANTLR start "ruleMMCLEVCMPPackageFile"
    // InternalCMP.g:84:1: ruleMMCLEVCMPPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVCMPPackageElement ) ) ) ;
    public final EObject ruleMMCLEVCMPPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:87:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVCMPPackageElement ) ) ) )
            // InternalCMP.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVCMPPackageElement ) ) )
            {
            // InternalCMP.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVCMPPackageElement ) ) )
            // InternalCMP.g:88:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVCMPPackageElement ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageKeyword_0());
                  
            }
            // InternalCMP.g:92:1: ( ( ruleQualifiedName ) )
            // InternalCMP.g:93:1: ( ruleQualifiedName )
            {
            // InternalCMP.g:93:1: ( ruleQualifiedName )
            // InternalCMP.g:94:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMCLEVCMPPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
              	    
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

                  	newLeafNode(otherlv_2, grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // InternalCMP.g:114:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCMP.g:114:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMCLEVCMPPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // InternalCMP.g:118:1: ( ( ruleQualifiedName ) )
            	    // InternalCMP.g:119:1: ( ruleQualifiedName )
            	    {
            	    // InternalCMP.g:119:1: ( ruleQualifiedName )
            	    // InternalCMP.g:120:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMCLEVCMPPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            	      	    
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

            	          	newLeafNode(otherlv_5, grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCMP.g:140:3: ( (lv_element_6_0= ruleMMCLEVCMPPackageElement ) )
            // InternalCMP.g:141:1: (lv_element_6_0= ruleMMCLEVCMPPackageElement )
            {
            // InternalCMP.g:141:1: (lv_element_6_0= ruleMMCLEVCMPPackageElement )
            // InternalCMP.g:142:3: lv_element_6_0= ruleMMCLEVCMPPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVCMPPackageFileAccess().getElementMMCLEVCMPPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_6_0=ruleMMCLEVCMPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMCLEVCMPPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MMCLEVCMPPackageElement");
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
    // $ANTLR end "ruleMMCLEVCMPPackageFile"


    // $ANTLR start "entryRuleMMCLEVCMPPackageElement"
    // InternalCMP.g:166:1: entryRuleMMCLEVCMPPackageElement returns [EObject current=null] : iv_ruleMMCLEVCMPPackageElement= ruleMMCLEVCMPPackageElement EOF ;
    public final EObject entryRuleMMCLEVCMPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVCMPPackageElement = null;


        try {
            // InternalCMP.g:167:2: (iv_ruleMMCLEVCMPPackageElement= ruleMMCLEVCMPPackageElement EOF )
            // InternalCMP.g:168:2: iv_ruleMMCLEVCMPPackageElement= ruleMMCLEVCMPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVCMPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMCLEVCMPPackageElement=ruleMMCLEVCMPPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVCMPPackageElement; 
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
    // $ANTLR end "entryRuleMMCLEVCMPPackageElement"


    // $ANTLR start "ruleMMCLEVCMPPackageElement"
    // InternalCMP.g:175:1: ruleMMCLEVCMPPackageElement returns [EObject current=null] : (this_MAbstractComponent_0= ruleMAbstractComponent | this_MComponent_1= ruleMComponent ) ;
    public final EObject ruleMMCLEVCMPPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MAbstractComponent_0 = null;

        EObject this_MComponent_1 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:178:28: ( (this_MAbstractComponent_0= ruleMAbstractComponent | this_MComponent_1= ruleMComponent ) )
            // InternalCMP.g:179:1: (this_MAbstractComponent_0= ruleMAbstractComponent | this_MComponent_1= ruleMComponent )
            {
            // InternalCMP.g:179:1: (this_MAbstractComponent_0= ruleMAbstractComponent | this_MComponent_1= ruleMComponent )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCMP.g:180:2: this_MAbstractComponent_0= ruleMAbstractComponent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMMCLEVCMPPackageElementAccess().getMAbstractComponentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MAbstractComponent_0=ruleMAbstractComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MAbstractComponent_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCMP.g:193:2: this_MComponent_1= ruleMComponent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMMCLEVCMPPackageElementAccess().getMComponentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MComponent_1=ruleMComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MComponent_1; 
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
    // $ANTLR end "ruleMMCLEVCMPPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCMP.g:212:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCMP.g:213:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCMP.g:214:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalCMP.g:221:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalCMP.g:224:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCMP.g:225:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCMP.g:225:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCMP.g:225:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalCMP.g:232:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCMP.g:233:2: kw= '.' this_ID_2= RULE_ID
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
            	    break loop3;
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
    // InternalCMP.g:253:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalCMP.g:254:2: (iv_ruleVersion= ruleVersion EOF )
            // InternalCMP.g:255:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalCMP.g:262:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalCMP.g:265:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalCMP.g:266:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalCMP.g:266:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalCMP.g:266:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalCMP.g:266:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==13||LA5_1==15||LA5_1==17) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCMP.g:266:7: this_INT_0= RULE_INT
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
                    // InternalCMP.g:274:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalCMP.g:274:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalCMP.g:274:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalCMP.g:274:7: (this_INT_1= RULE_INT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_INT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalCMP.g:274:12: this_INT_1= RULE_INT
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

            // InternalCMP.g:288:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCMP.g:289:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalCMP.g:294:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_INT) ) {
            	        int LA7_1 = input.LA(2);

            	        if ( (LA7_1==EOF||LA7_1==13||LA7_1==15||LA7_1==17) ) {
            	            alt7=1;
            	        }
            	        else if ( (LA7_1==RULE_ID) ) {
            	            alt7=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 7, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA7_0==RULE_ID) ) {
            	        alt7=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalCMP.g:294:6: this_INT_4= RULE_INT
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
            	            // InternalCMP.g:302:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalCMP.g:302:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalCMP.g:302:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalCMP.g:302:7: (this_INT_5= RULE_INT )?
            	            int alt6=2;
            	            int LA6_0 = input.LA(1);

            	            if ( (LA6_0==RULE_INT) ) {
            	                alt6=1;
            	            }
            	            switch (alt6) {
            	                case 1 :
            	                    // InternalCMP.g:302:12: this_INT_5= RULE_INT
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
            	    break loop8;
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
    // InternalCMP.g:324:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalCMP.g:325:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalCMP.g:326:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalCMP.g:333:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:336:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalCMP.g:337:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalCMP.g:337:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalCMP.g:338:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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
    // InternalCMP.g:379:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalCMP.g:380:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalCMP.g:381:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalCMP.g:388:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:391:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalCMP.g:392:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalCMP.g:392:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalCMP.g:392:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalCMP.g:392:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==15) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==RULE_ID) ) {
                        int LA9_5 = input.LA(4);

                        if ( ((LA9_5>=15 && LA9_5<=16)) ) {
                            alt9=1;
                        }
                    }
                }
                else if ( (LA9_1==16) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalCMP.g:393:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
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
            // InternalCMP.g:416:1: (kw= '::' this_ID_4= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCMP.g:417:2: kw= '::' this_ID_4= RULE_ID
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
            	    break loop10;
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


    // $ANTLR start "entryRuleMPort"
    // InternalCMP.g:437:1: entryRuleMPort returns [EObject current=null] : iv_ruleMPort= ruleMPort EOF ;
    public final EObject entryRuleMPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMPort = null;


        try {
            // InternalCMP.g:438:2: (iv_ruleMPort= ruleMPort EOF )
            // InternalCMP.g:439:2: iv_ruleMPort= ruleMPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMPort=ruleMPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMPort; 
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
    // $ANTLR end "entryRuleMPort"


    // $ANTLR start "ruleMPort"
    // InternalCMP.g:446:1: ruleMPort returns [EObject current=null] : (this_MServerPort_0= ruleMServerPort | this_MClientPort_1= ruleMClientPort ) ;
    public final EObject ruleMPort() throws RecognitionException {
        EObject current = null;

        EObject this_MServerPort_0 = null;

        EObject this_MClientPort_1 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:449:28: ( (this_MServerPort_0= ruleMServerPort | this_MClientPort_1= ruleMClientPort ) )
            // InternalCMP.g:450:1: (this_MServerPort_0= ruleMServerPort | this_MClientPort_1= ruleMClientPort )
            {
            // InternalCMP.g:450:1: (this_MServerPort_0= ruleMServerPort | this_MClientPort_1= ruleMClientPort )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            else if ( (LA11_0==43) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCMP.g:451:2: this_MServerPort_0= ruleMServerPort
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMPortAccess().getMServerPortParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MServerPort_0=ruleMServerPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MServerPort_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCMP.g:464:2: this_MClientPort_1= ruleMClientPort
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMPortAccess().getMClientPortParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MClientPort_1=ruleMClientPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MClientPort_1; 
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
    // $ANTLR end "ruleMPort"


    // $ANTLR start "entryRuleMInternalConnection"
    // InternalCMP.g:483:1: entryRuleMInternalConnection returns [EObject current=null] : iv_ruleMInternalConnection= ruleMInternalConnection EOF ;
    public final EObject entryRuleMInternalConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInternalConnection = null;


        try {
            // InternalCMP.g:484:2: (iv_ruleMInternalConnection= ruleMInternalConnection EOF )
            // InternalCMP.g:485:2: iv_ruleMInternalConnection= ruleMInternalConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInternalConnectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMInternalConnection=ruleMInternalConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInternalConnection; 
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
    // $ANTLR end "entryRuleMInternalConnection"


    // $ANTLR start "ruleMInternalConnection"
    // InternalCMP.g:492:1: ruleMInternalConnection returns [EObject current=null] : (this_MInternalComponentConnection_0= ruleMInternalComponentConnection | this_MInternalComponentPlatformSwitch_1= ruleMInternalComponentPlatformSwitch ) ;
    public final EObject ruleMInternalConnection() throws RecognitionException {
        EObject current = null;

        EObject this_MInternalComponentConnection_0 = null;

        EObject this_MInternalComponentPlatformSwitch_1 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:495:28: ( (this_MInternalComponentConnection_0= ruleMInternalComponentConnection | this_MInternalComponentPlatformSwitch_1= ruleMInternalComponentPlatformSwitch ) )
            // InternalCMP.g:496:1: (this_MInternalComponentConnection_0= ruleMInternalComponentConnection | this_MInternalComponentPlatformSwitch_1= ruleMInternalComponentPlatformSwitch )
            {
            // InternalCMP.g:496:1: (this_MInternalComponentConnection_0= ruleMInternalComponentConnection | this_MInternalComponentPlatformSwitch_1= ruleMInternalComponentPlatformSwitch )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalCMP.g:497:2: this_MInternalComponentConnection_0= ruleMInternalComponentConnection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMInternalConnectionAccess().getMInternalComponentConnectionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MInternalComponentConnection_0=ruleMInternalComponentConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MInternalComponentConnection_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCMP.g:510:2: this_MInternalComponentPlatformSwitch_1= ruleMInternalComponentPlatformSwitch
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMInternalConnectionAccess().getMInternalComponentPlatformSwitchParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MInternalComponentPlatformSwitch_1=ruleMInternalComponentPlatformSwitch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MInternalComponentPlatformSwitch_1; 
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
    // $ANTLR end "ruleMInternalConnection"


    // $ANTLR start "entryRuleMAbstractComponent"
    // InternalCMP.g:529:1: entryRuleMAbstractComponent returns [EObject current=null] : iv_ruleMAbstractComponent= ruleMAbstractComponent EOF ;
    public final EObject entryRuleMAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMAbstractComponent = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8()
        		);
        	
        try {
            // InternalCMP.g:535:2: (iv_ruleMAbstractComponent= ruleMAbstractComponent EOF )
            // InternalCMP.g:536:2: iv_ruleMAbstractComponent= ruleMAbstractComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMAbstractComponentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMAbstractComponent=ruleMAbstractComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMAbstractComponent; 
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
    // $ANTLR end "entryRuleMAbstractComponent"


    // $ANTLR start "ruleMAbstractComponent"
    // InternalCMP.g:546:1: ruleMAbstractComponent returns [EObject current=null] : (otherlv_0= 'abstract' otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleMAbstractComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_version_14_0 = null;

        EObject lv_attributes_18_0 = null;

        EObject lv_attributeValueAssignments_24_0 = null;

        EObject lv_externalPorts_30_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8()
        		);
            
        try {
            // InternalCMP.g:552:28: ( (otherlv_0= 'abstract' otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalCMP.g:553:1: (otherlv_0= 'abstract' otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalCMP.g:553:1: (otherlv_0= 'abstract' otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalCMP.g:553:3: otherlv_0= 'abstract' otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMAbstractComponentAccess().getAbstractKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMAbstractComponentAccess().getComponentKeyword_1());
                  
            }
            // InternalCMP.g:561:1: ( ( ruleVersionedQualifiedName ) )
            // InternalCMP.g:562:1: ( ruleVersionedQualifiedName )
            {
            // InternalCMP.g:562:1: ( ruleVersionedQualifiedName )
            // InternalCMP.g:563:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMAbstractComponentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getDomainMDomainCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMAbstractComponentAccess().getColonColonKeyword_3());
                  
            }
            // InternalCMP.g:583:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalCMP.g:584:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalCMP.g:584:1: ( ruleVersionedQualifiedReferenceName )
            // InternalCMP.g:585:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMAbstractComponentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getTypeMComponentTypeCrossReference_4_0()); 
              	    
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

            // InternalCMP.g:601:2: ( (lv_name_5_0= RULE_ID ) )
            // InternalCMP.g:602:1: (lv_name_5_0= RULE_ID )
            {
            // InternalCMP.g:602:1: (lv_name_5_0= RULE_ID )
            // InternalCMP.g:603:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getMAbstractComponentAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMAbstractComponentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalCMP.g:619:2: (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCMP.g:619:4: otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMAbstractComponentAccess().getInheritsKeyword_6_0());
                          
                    }
                    // InternalCMP.g:623:1: ( ( ruleVersionedQualifiedName ) )
                    // InternalCMP.g:624:1: ( ruleVersionedQualifiedName )
                    {
                    // InternalCMP.g:624:1: ( ruleVersionedQualifiedName )
                    // InternalCMP.g:625:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMAbstractComponentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCMP.g:641:2: (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==22) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCMP.g:641:4: otherlv_8= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getMAbstractComponentAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // InternalCMP.g:645:1: ( ( ruleVersionedQualifiedName ) )
                    	    // InternalCMP.g:646:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // InternalCMP.g:646:1: ( ruleVersionedQualifiedName )
                    	    // InternalCMP.g:647:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getMAbstractComponentRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // InternalCMP.g:667:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) ) )
            // InternalCMP.g:669:1: ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalCMP.g:669:1: ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?) )
            // InternalCMP.g:670:2: ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
            // InternalCMP.g:673:2: ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?)
            // InternalCMP.g:674:3: ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+ {...}?
            {
            // InternalCMP.g:674:3: ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=5;
                int LA18_0 = input.LA(1);

                if ( LA18_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3) ) {
                    alt18=4;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCMP.g:676:4: ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:676:4: ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) )
            	    // InternalCMP.g:677:5: {...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMAbstractComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalCMP.g:677:115: ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) )
            	    // InternalCMP.g:678:6: ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0);
            	    // InternalCMP.g:681:6: ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) )
            	    // InternalCMP.g:681:7: {...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMAbstractComponent", "true");
            	    }
            	    // InternalCMP.g:681:16: (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' )
            	    // InternalCMP.g:681:18: otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMAbstractComponentAccess().getVersionKeyword_8_0_0());
            	          
            	    }
            	    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMAbstractComponentAccess().getColonEqualsSignKeyword_8_0_1());
            	          
            	    }
            	    // InternalCMP.g:689:1: ( (lv_version_14_0= ruleVersion ) )
            	    // InternalCMP.g:690:1: (lv_version_14_0= ruleVersion )
            	    {
            	    // InternalCMP.g:690:1: (lv_version_14_0= ruleVersion )
            	    // InternalCMP.g:691:3: lv_version_14_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_version_14_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMAbstractComponentRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"version",
            	              		lv_version_14_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCMP.g:718:4: ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:718:4: ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) )
            	    // InternalCMP.g:719:5: {...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMAbstractComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalCMP.g:719:115: ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) )
            	    // InternalCMP.g:720:6: ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1);
            	    // InternalCMP.g:723:6: ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) )
            	    // InternalCMP.g:723:7: {...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMAbstractComponent", "true");
            	    }
            	    // InternalCMP.g:723:16: (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' )
            	    // InternalCMP.g:723:18: otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';'
            	    {
            	    otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMAbstractComponentAccess().getAttributesKeyword_8_1_0());
            	          
            	    }
            	    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_1_1());
            	          
            	    }
            	    // InternalCMP.g:731:1: ( (lv_attributes_18_0= ruleMParameter ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( ((LA15_0>=44 && LA15_0<=45)||(LA15_0>=47 && LA15_0<=48)||(LA15_0>=57 && LA15_0<=58)) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalCMP.g:732:1: (lv_attributes_18_0= ruleMParameter )
            	    	    {
            	    	    // InternalCMP.g:732:1: (lv_attributes_18_0= ruleMParameter )
            	    	    // InternalCMP.g:733:3: lv_attributes_18_0= ruleMParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getAttributesMParameterParserRuleCall_8_1_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_20);
            	    	    lv_attributes_18_0=ruleMParameter();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMAbstractComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributes",
            	    	              		lv_attributes_18_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameter");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
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

            	    otherlv_19=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_1_3());
            	          
            	    }
            	    otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_1_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCMP.g:764:4: ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:764:4: ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) )
            	    // InternalCMP.g:765:5: {...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMAbstractComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // InternalCMP.g:765:115: ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) )
            	    // InternalCMP.g:766:6: ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2);
            	    // InternalCMP.g:769:6: ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) )
            	    // InternalCMP.g:769:7: {...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMAbstractComponent", "true");
            	    }
            	    // InternalCMP.g:769:16: (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' )
            	    // InternalCMP.g:769:18: otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';'
            	    {
            	    otherlv_21=(Token)match(input,28,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMAbstractComponentAccess().getAttributeKeyword_8_2_0());
            	          
            	    }
            	    otherlv_22=(Token)match(input,29,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getMAbstractComponentAccess().getValuesKeyword_8_2_1());
            	          
            	    }
            	    otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_2_2());
            	          
            	    }
            	    // InternalCMP.g:781:1: ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==28) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalCMP.g:782:1: (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment )
            	    	    {
            	    	    // InternalCMP.g:782:1: (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment )
            	    	    // InternalCMP.g:783:3: lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_2_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_22);
            	    	    lv_attributeValueAssignments_24_0=ruleMParameterValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMAbstractComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributeValueAssignments",
            	    	              		lv_attributeValueAssignments_24_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_2_4());
            	          
            	    }
            	    otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_26, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCMP.g:814:4: ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:814:4: ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
            	    // InternalCMP.g:815:5: {...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMAbstractComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3)");
            	    }
            	    // InternalCMP.g:815:115: ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
            	    // InternalCMP.g:816:6: ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3);
            	    // InternalCMP.g:819:6: ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) )
            	    // InternalCMP.g:819:7: {...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMAbstractComponent", "true");
            	    }
            	    // InternalCMP.g:819:16: (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' )
            	    // InternalCMP.g:819:18: otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';'
            	    {
            	    otherlv_27=(Token)match(input,30,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getMAbstractComponentAccess().getExternalKeyword_8_3_0());
            	          
            	    }
            	    otherlv_28=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_28, grammarAccess.getMAbstractComponentAccess().getPortsKeyword_8_3_1());
            	          
            	    }
            	    otherlv_29=(Token)match(input,23,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_3_2());
            	          
            	    }
            	    // InternalCMP.g:831:1: ( (lv_externalPorts_30_0= ruleMPort ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( ((LA17_0>=42 && LA17_0<=43)) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalCMP.g:832:1: (lv_externalPorts_30_0= ruleMPort )
            	    	    {
            	    	    // InternalCMP.g:832:1: (lv_externalPorts_30_0= ruleMPort )
            	    	    // InternalCMP.g:833:3: lv_externalPorts_30_0= ruleMPort
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getExternalPortsMPortParserRuleCall_8_3_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_25);
            	    	    lv_externalPorts_30_0=ruleMPort();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMAbstractComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"externalPorts",
            	    	              		lv_externalPorts_30_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MPort");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    otherlv_31=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_3_4());
            	          
            	    }
            	    otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_32, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_3_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMAbstractComponent", "getUnorderedGroupHelper().canLeave(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());

            }

            otherlv_33=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_33, grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_9());
                  
            }
            otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_34, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_10());
                  
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
    // $ANTLR end "ruleMAbstractComponent"


    // $ANTLR start "entryRuleMComponent"
    // InternalCMP.g:891:1: entryRuleMComponent returns [EObject current=null] : iv_ruleMComponent= ruleMComponent EOF ;
    public final EObject entryRuleMComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMComponent = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMComponentAccess().getUnorderedGroup_8()
        		);
        	
        try {
            // InternalCMP.g:897:2: (iv_ruleMComponent= ruleMComponent EOF )
            // InternalCMP.g:898:2: iv_ruleMComponent= ruleMComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMComponentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMComponent=ruleMComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMComponent; 
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
    // $ANTLR end "entryRuleMComponent"


    // $ANTLR start "ruleMComponent"
    // InternalCMP.g:908:1: ruleMComponent returns [EObject current=null] : ( () otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?) ) ) otherlv_68= '}' otherlv_69= ';' ) ;
    public final EObject ruleMComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
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
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        AntlrDatatypeRuleToken lv_version_14_0 = null;

        EObject lv_attributes_24_0 = null;

        EObject lv_attributeValueAssignments_30_0 = null;

        EObject lv_externalPorts_36_0 = null;

        EObject lv_internalPorts_42_0 = null;

        EObject lv_supportedPlatforms_54_0 = null;

        EObject lv_internalComponents_60_0 = null;

        EObject lv_connections_65_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMComponentAccess().getUnorderedGroup_8()
        		);
            
        try {
            // InternalCMP.g:914:28: ( ( () otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?) ) ) otherlv_68= '}' otherlv_69= ';' ) )
            // InternalCMP.g:915:1: ( () otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?) ) ) otherlv_68= '}' otherlv_69= ';' )
            {
            // InternalCMP.g:915:1: ( () otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?) ) ) otherlv_68= '}' otherlv_69= ';' )
            // InternalCMP.g:915:2: () otherlv_1= 'component' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '::' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_10= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?) ) ) otherlv_68= '}' otherlv_69= ';'
            {
            // InternalCMP.g:915:2: ()
            // InternalCMP.g:916:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMComponentAccess().getMComponentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMComponentAccess().getComponentKeyword_1());
                  
            }
            // InternalCMP.g:928:1: ( ( ruleVersionedQualifiedName ) )
            // InternalCMP.g:929:1: ( ruleVersionedQualifiedName )
            {
            // InternalCMP.g:929:1: ( ruleVersionedQualifiedName )
            // InternalCMP.g:930:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMComponentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMComponentAccess().getDomainMDomainCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMComponentAccess().getColonColonKeyword_3());
                  
            }
            // InternalCMP.g:950:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalCMP.g:951:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalCMP.g:951:1: ( ruleVersionedQualifiedReferenceName )
            // InternalCMP.g:952:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMComponentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMComponentAccess().getTypeMComponentTypeCrossReference_4_0()); 
              	    
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

            // InternalCMP.g:968:2: ( (lv_name_5_0= RULE_ID ) )
            // InternalCMP.g:969:1: (lv_name_5_0= RULE_ID )
            {
            // InternalCMP.g:969:1: (lv_name_5_0= RULE_ID )
            // InternalCMP.g:970:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getMComponentAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMComponentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalCMP.g:986:2: (otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCMP.g:986:4: otherlv_6= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMComponentAccess().getInheritsKeyword_6_0());
                          
                    }
                    // InternalCMP.g:990:1: ( ( ruleVersionedQualifiedName ) )
                    // InternalCMP.g:991:1: ( ruleVersionedQualifiedName )
                    {
                    // InternalCMP.g:991:1: ( ruleVersionedQualifiedName )
                    // InternalCMP.g:992:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMComponentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCMP.g:1008:2: (otherlv_8= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==22) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCMP.g:1008:4: otherlv_8= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getMComponentAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // InternalCMP.g:1012:1: ( ( ruleVersionedQualifiedName ) )
                    	    // InternalCMP.g:1013:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // InternalCMP.g:1013:1: ( ruleVersionedQualifiedName )
                    	    // InternalCMP.g:1014:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getMComponentRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // InternalCMP.g:1034:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?) ) )
            // InternalCMP.g:1036:1: ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalCMP.g:1036:1: ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?) )
            // InternalCMP.g:1037:2: ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
            // InternalCMP.g:1040:2: ( ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?)
            // InternalCMP.g:1041:3: ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+ {...}?
            {
            // InternalCMP.g:1041:3: ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=11;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // InternalCMP.g:1043:4: ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1043:4: ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) )
            	    // InternalCMP.g:1044:5: {...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalCMP.g:1044:107: ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) )
            	    // InternalCMP.g:1045:6: ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0);
            	    // InternalCMP.g:1048:6: ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) )
            	    // InternalCMP.g:1048:7: {...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1048:16: (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' )
            	    // InternalCMP.g:1048:18: otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMComponentAccess().getVersionKeyword_8_0_0());
            	          
            	    }
            	    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_0_1());
            	          
            	    }
            	    // InternalCMP.g:1056:1: ( (lv_version_14_0= ruleVersion ) )
            	    // InternalCMP.g:1057:1: (lv_version_14_0= ruleVersion )
            	    {
            	    // InternalCMP.g:1057:1: (lv_version_14_0= ruleVersion )
            	    // InternalCMP.g:1058:3: lv_version_14_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_version_14_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMComponentRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"version",
            	              		lv_version_14_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCMP.g:1085:4: ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1085:4: ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) )
            	    // InternalCMP.g:1086:5: {...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalCMP.g:1086:107: ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) )
            	    // InternalCMP.g:1087:6: ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1);
            	    // InternalCMP.g:1090:6: ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) )
            	    // InternalCMP.g:1090:7: {...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1090:16: (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' )
            	    // InternalCMP.g:1090:18: otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';'
            	    {
            	    otherlv_16=(Token)match(input,32,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMComponentAccess().getLanguagesKeyword_8_1_0());
            	          
            	    }
            	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_1_1());
            	          
            	    }
            	    // InternalCMP.g:1098:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalCMP.g:1099:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalCMP.g:1099:1: ( ruleVersionedQualifiedName )
            	    // InternalCMP.g:1100:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMComponentRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalCMP.g:1116:2: (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==22) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalCMP.g:1116:4: otherlv_19= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_19, grammarAccess.getMComponentAccess().getCommaKeyword_8_1_3_0());
            	    	          
            	    	    }
            	    	    // InternalCMP.g:1120:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalCMP.g:1121:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalCMP.g:1121:1: ( ruleVersionedQualifiedName )
            	    	    // InternalCMP.g:1122:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMComponentRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_28);
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
            	    	    break loop21;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_1_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCMP.g:1149:4: ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1149:4: ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) )
            	    // InternalCMP.g:1150:5: {...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // InternalCMP.g:1150:107: ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) )
            	    // InternalCMP.g:1151:6: ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2);
            	    // InternalCMP.g:1154:6: ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) )
            	    // InternalCMP.g:1154:7: {...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1154:16: (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' )
            	    // InternalCMP.g:1154:18: otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';'
            	    {
            	    otherlv_22=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getMComponentAccess().getAttributesKeyword_8_2_0());
            	          
            	    }
            	    otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_2_1());
            	          
            	    }
            	    // InternalCMP.g:1162:1: ( (lv_attributes_24_0= ruleMParameter ) )+
            	    int cnt22=0;
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( ((LA22_0>=44 && LA22_0<=45)||(LA22_0>=47 && LA22_0<=48)||(LA22_0>=57 && LA22_0<=58)) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalCMP.g:1163:1: (lv_attributes_24_0= ruleMParameter )
            	    	    {
            	    	    // InternalCMP.g:1163:1: (lv_attributes_24_0= ruleMParameter )
            	    	    // InternalCMP.g:1164:3: lv_attributes_24_0= ruleMParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getAttributesMParameterParserRuleCall_8_2_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_20);
            	    	    lv_attributes_24_0=ruleMParameter();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributes",
            	    	              		lv_attributes_24_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameter");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt22 >= 1 ) break loop22;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(22, input);
            	                throw eee;
            	        }
            	        cnt22++;
            	    } while (true);

            	    otherlv_25=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_2_3());
            	          
            	    }
            	    otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_26, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_2_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCMP.g:1195:4: ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1195:4: ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) )
            	    // InternalCMP.g:1196:5: {...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3)");
            	    }
            	    // InternalCMP.g:1196:107: ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) )
            	    // InternalCMP.g:1197:6: ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3);
            	    // InternalCMP.g:1200:6: ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) )
            	    // InternalCMP.g:1200:7: {...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1200:16: (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' )
            	    // InternalCMP.g:1200:18: otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';'
            	    {
            	    otherlv_27=(Token)match(input,28,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getMComponentAccess().getAttributeKeyword_8_3_0());
            	          
            	    }
            	    otherlv_28=(Token)match(input,29,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_28, grammarAccess.getMComponentAccess().getValuesKeyword_8_3_1());
            	          
            	    }
            	    otherlv_29=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_3_2());
            	          
            	    }
            	    // InternalCMP.g:1212:1: ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==28) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalCMP.g:1213:1: (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment )
            	    	    {
            	    	    // InternalCMP.g:1213:1: (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment )
            	    	    // InternalCMP.g:1214:3: lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_3_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_22);
            	    	    lv_attributeValueAssignments_30_0=ruleMParameterValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributeValueAssignments",
            	    	              		lv_attributeValueAssignments_30_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);

            	    otherlv_31=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_3_4());
            	          
            	    }
            	    otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_32, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_3_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCMP.g:1245:4: ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1245:4: ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) )
            	    // InternalCMP.g:1246:5: {...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4)");
            	    }
            	    // InternalCMP.g:1246:107: ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) )
            	    // InternalCMP.g:1247:6: ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4);
            	    // InternalCMP.g:1250:6: ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) )
            	    // InternalCMP.g:1250:7: {...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1250:16: (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' )
            	    // InternalCMP.g:1250:18: otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';'
            	    {
            	    otherlv_33=(Token)match(input,30,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_33, grammarAccess.getMComponentAccess().getExternalKeyword_8_4_0());
            	          
            	    }
            	    otherlv_34=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_34, grammarAccess.getMComponentAccess().getPortsKeyword_8_4_1());
            	          
            	    }
            	    otherlv_35=(Token)match(input,23,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_35, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_4_2());
            	          
            	    }
            	    // InternalCMP.g:1262:1: ( (lv_externalPorts_36_0= ruleMPort ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( ((LA24_0>=42 && LA24_0<=43)) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalCMP.g:1263:1: (lv_externalPorts_36_0= ruleMPort )
            	    	    {
            	    	    // InternalCMP.g:1263:1: (lv_externalPorts_36_0= ruleMPort )
            	    	    // InternalCMP.g:1264:3: lv_externalPorts_36_0= ruleMPort
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getExternalPortsMPortParserRuleCall_8_4_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_25);
            	    	    lv_externalPorts_36_0=ruleMPort();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"externalPorts",
            	    	              		lv_externalPorts_36_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MPort");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt24 >= 1 ) break loop24;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(24, input);
            	                throw eee;
            	        }
            	        cnt24++;
            	    } while (true);

            	    otherlv_37=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_37, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_4_4());
            	          
            	    }
            	    otherlv_38=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_38, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_4_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalCMP.g:1295:4: ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1295:4: ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) )
            	    // InternalCMP.g:1296:5: {...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5)");
            	    }
            	    // InternalCMP.g:1296:107: ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) )
            	    // InternalCMP.g:1297:6: ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5);
            	    // InternalCMP.g:1300:6: ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) )
            	    // InternalCMP.g:1300:7: {...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1300:16: (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' )
            	    // InternalCMP.g:1300:18: otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';'
            	    {
            	    otherlv_39=(Token)match(input,33,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_39, grammarAccess.getMComponentAccess().getInternalKeyword_8_5_0());
            	          
            	    }
            	    otherlv_40=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_40, grammarAccess.getMComponentAccess().getPortsKeyword_8_5_1());
            	          
            	    }
            	    otherlv_41=(Token)match(input,23,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_41, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_5_2());
            	          
            	    }
            	    // InternalCMP.g:1312:1: ( (lv_internalPorts_42_0= ruleMPort ) )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( ((LA25_0>=42 && LA25_0<=43)) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalCMP.g:1313:1: (lv_internalPorts_42_0= ruleMPort )
            	    	    {
            	    	    // InternalCMP.g:1313:1: (lv_internalPorts_42_0= ruleMPort )
            	    	    // InternalCMP.g:1314:3: lv_internalPorts_42_0= ruleMPort
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getInternalPortsMPortParserRuleCall_8_5_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_25);
            	    	    lv_internalPorts_42_0=ruleMPort();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"internalPorts",
            	    	              		lv_internalPorts_42_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MPort");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt25 >= 1 ) break loop25;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(25, input);
            	                throw eee;
            	        }
            	        cnt25++;
            	    } while (true);

            	    otherlv_43=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_43, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_5_4());
            	          
            	    }
            	    otherlv_44=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_44, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_5_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalCMP.g:1345:4: ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1345:4: ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) )
            	    // InternalCMP.g:1346:5: {...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6)");
            	    }
            	    // InternalCMP.g:1346:107: ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) )
            	    // InternalCMP.g:1347:6: ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6);
            	    // InternalCMP.g:1350:6: ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) )
            	    // InternalCMP.g:1350:7: {...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1350:16: (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' )
            	    // InternalCMP.g:1350:18: otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';'
            	    {
            	    otherlv_45=(Token)match(input,34,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_45, grammarAccess.getMComponentAccess().getRequiresKeyword_8_6_0());
            	          
            	    }
            	    otherlv_46=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_46, grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_6_1());
            	          
            	    }
            	    // InternalCMP.g:1358:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalCMP.g:1359:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalCMP.g:1359:1: ( ruleVersionedQualifiedName )
            	    // InternalCMP.g:1360:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMComponentRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalCMP.g:1376:2: (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==22) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // InternalCMP.g:1376:4: otherlv_48= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_48=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_48, grammarAccess.getMComponentAccess().getCommaKeyword_8_6_3_0());
            	    	          
            	    	    }
            	    	    // InternalCMP.g:1380:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalCMP.g:1381:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalCMP.g:1381:1: ( ruleVersionedQualifiedName )
            	    	    // InternalCMP.g:1382:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMComponentRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_28);
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
            	    	    break loop26;
            	        }
            	    } while (true);

            	    otherlv_50=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_50, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_6_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalCMP.g:1409:4: ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1409:4: ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) )
            	    // InternalCMP.g:1410:5: {...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7)");
            	    }
            	    // InternalCMP.g:1410:107: ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) )
            	    // InternalCMP.g:1411:6: ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7);
            	    // InternalCMP.g:1414:6: ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) )
            	    // InternalCMP.g:1414:7: {...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1414:16: (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' )
            	    // InternalCMP.g:1414:18: otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';'
            	    {
            	    otherlv_51=(Token)match(input,35,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_51, grammarAccess.getMComponentAccess().getSupportedKeyword_8_7_0());
            	          
            	    }
            	    otherlv_52=(Token)match(input,36,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_52, grammarAccess.getMComponentAccess().getPlatformsKeyword_8_7_1());
            	          
            	    }
            	    otherlv_53=(Token)match(input,23,FollowSets000.FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_53, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_7_2());
            	          
            	    }
            	    // InternalCMP.g:1426:1: ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+
            	    int cnt27=0;
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==35) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalCMP.g:1427:1: (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform )
            	    	    {
            	    	    // InternalCMP.g:1427:1: (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform )
            	    	    // InternalCMP.g:1428:3: lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getSupportedPlatformsComponentSupportedPlatformParserRuleCall_8_7_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_31);
            	    	    lv_supportedPlatforms_54_0=ruleComponentSupportedPlatform();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"supportedPlatforms",
            	    	              		lv_supportedPlatforms_54_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.ComponentSupportedPlatform");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt27 >= 1 ) break loop27;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(27, input);
            	                throw eee;
            	        }
            	        cnt27++;
            	    } while (true);

            	    otherlv_55=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_55, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_7_4());
            	          
            	    }
            	    otherlv_56=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_56, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_7_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalCMP.g:1459:4: ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1459:4: ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) )
            	    // InternalCMP.g:1460:5: {...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8)");
            	    }
            	    // InternalCMP.g:1460:107: ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) )
            	    // InternalCMP.g:1461:6: ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8);
            	    // InternalCMP.g:1464:6: ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) )
            	    // InternalCMP.g:1464:7: {...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1464:16: (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' )
            	    // InternalCMP.g:1464:18: otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';'
            	    {
            	    otherlv_57=(Token)match(input,37,FollowSets000.FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_57, grammarAccess.getMComponentAccess().getSubcomponentKeyword_8_8_0());
            	          
            	    }
            	    otherlv_58=(Token)match(input,38,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_58, grammarAccess.getMComponentAccess().getInstancesKeyword_8_8_1());
            	          
            	    }
            	    otherlv_59=(Token)match(input,23,FollowSets000.FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_59, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_8_2());
            	          
            	    }
            	    // InternalCMP.g:1476:1: ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+
            	    int cnt28=0;
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( ((LA28_0>=40 && LA28_0<=41)) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalCMP.g:1477:1: (lv_internalComponents_60_0= ruleMInternalComponentInstance )
            	    	    {
            	    	    // InternalCMP.g:1477:1: (lv_internalComponents_60_0= ruleMInternalComponentInstance )
            	    	    // InternalCMP.g:1478:3: lv_internalComponents_60_0= ruleMInternalComponentInstance
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_8_8_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_34);
            	    	    lv_internalComponents_60_0=ruleMInternalComponentInstance();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"internalComponents",
            	    	              		lv_internalComponents_60_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentInstance");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt28 >= 1 ) break loop28;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(28, input);
            	                throw eee;
            	        }
            	        cnt28++;
            	    } while (true);

            	    otherlv_61=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_61, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_8_4());
            	          
            	    }
            	    otherlv_62=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_62, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_8_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalCMP.g:1509:4: ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:1509:4: ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) )
            	    // InternalCMP.g:1510:5: {...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9)");
            	    }
            	    // InternalCMP.g:1510:107: ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) )
            	    // InternalCMP.g:1511:6: ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9);
            	    // InternalCMP.g:1514:6: ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) )
            	    // InternalCMP.g:1514:7: {...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMComponent", "true");
            	    }
            	    // InternalCMP.g:1514:16: (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' )
            	    // InternalCMP.g:1514:18: otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';'
            	    {
            	    otherlv_63=(Token)match(input,39,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_63, grammarAccess.getMComponentAccess().getConnectionsKeyword_8_9_0());
            	          
            	    }
            	    otherlv_64=(Token)match(input,23,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_64, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_9_1());
            	          
            	    }
            	    // InternalCMP.g:1522:1: ( (lv_connections_65_0= ruleMInternalConnection ) )+
            	    int cnt29=0;
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==59) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalCMP.g:1523:1: (lv_connections_65_0= ruleMInternalConnection )
            	    	    {
            	    	    // InternalCMP.g:1523:1: (lv_connections_65_0= ruleMInternalConnection )
            	    	    // InternalCMP.g:1524:3: lv_connections_65_0= ruleMInternalConnection
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMComponentAccess().getConnectionsMInternalConnectionParserRuleCall_8_9_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_36);
            	    	    lv_connections_65_0=ruleMInternalConnection();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMComponentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"connections",
            	    	              		lv_connections_65_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalConnection");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt29 >= 1 ) break loop29;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(29, input);
            	                throw eee;
            	        }
            	        cnt29++;
            	    } while (true);

            	    otherlv_66=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_66, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_9_3());
            	          
            	    }
            	    otherlv_67=(Token)match(input,13,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_67, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_9_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMComponentAccess().getUnorderedGroup_8()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMComponent", "getUnorderedGroupHelper().canLeave(grammarAccess.getMComponentAccess().getUnorderedGroup_8())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMComponentAccess().getUnorderedGroup_8());

            }

            otherlv_68=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_68, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_9());
                  
            }
            otherlv_69=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_69, grammarAccess.getMComponentAccess().getSemicolonKeyword_10());
                  
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
    // $ANTLR end "ruleMComponent"


    // $ANTLR start "entryRuleMInternalComponentInstance"
    // InternalCMP.g:1582:1: entryRuleMInternalComponentInstance returns [EObject current=null] : iv_ruleMInternalComponentInstance= ruleMInternalComponentInstance EOF ;
    public final EObject entryRuleMInternalComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInternalComponentInstance = null;


        try {
            // InternalCMP.g:1583:2: (iv_ruleMInternalComponentInstance= ruleMInternalComponentInstance EOF )
            // InternalCMP.g:1584:2: iv_ruleMInternalComponentInstance= ruleMInternalComponentInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInternalComponentInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMInternalComponentInstance=ruleMInternalComponentInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInternalComponentInstance; 
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
    // $ANTLR end "entryRuleMInternalComponentInstance"


    // $ANTLR start "ruleMInternalComponentInstance"
    // InternalCMP.g:1591:1: ruleMInternalComponentInstance returns [EObject current=null] : ( ( (lv_isSingleton_0_0= 'singleton' ) )? otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleMInternalComponentInstance() throws RecognitionException {
        EObject current = null;

        Token lv_isSingleton_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_attributeValueAssignments_5_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:1594:28: ( ( ( (lv_isSingleton_0_0= 'singleton' ) )? otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCMP.g:1595:1: ( ( (lv_isSingleton_0_0= 'singleton' ) )? otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCMP.g:1595:1: ( ( (lv_isSingleton_0_0= 'singleton' ) )? otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalCMP.g:1595:2: ( (lv_isSingleton_0_0= 'singleton' ) )? otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMParameterValueAssignment ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // InternalCMP.g:1595:2: ( (lv_isSingleton_0_0= 'singleton' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCMP.g:1596:1: (lv_isSingleton_0_0= 'singleton' )
                    {
                    // InternalCMP.g:1596:1: (lv_isSingleton_0_0= 'singleton' )
                    // InternalCMP.g:1597:3: lv_isSingleton_0_0= 'singleton'
                    {
                    lv_isSingleton_0_0=(Token)match(input,40,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isSingleton_0_0, grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonSingletonKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMInternalComponentInstanceRule());
                      	        }
                             		setWithLastConsumed(current, "isSingleton", true, "singleton");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMInternalComponentInstanceAccess().getInstanceKeyword_1());
                  
            }
            // InternalCMP.g:1614:1: ( ( ruleVersionedQualifiedName ) )
            // InternalCMP.g:1615:1: ( ruleVersionedQualifiedName )
            {
            // InternalCMP.g:1615:1: ( ruleVersionedQualifiedName )
            // InternalCMP.g:1616:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInternalComponentInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMInternalComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_3);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCMP.g:1632:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalCMP.g:1633:1: (lv_name_3_0= RULE_ID )
            {
            // InternalCMP.g:1633:1: (lv_name_3_0= RULE_ID )
            // InternalCMP.g:1634:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMInternalComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMInternalComponentInstanceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMInternalComponentInstanceAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalCMP.g:1654:1: ( (lv_attributeValueAssignments_5_0= ruleMParameterValueAssignment ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==28) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCMP.g:1655:1: (lv_attributeValueAssignments_5_0= ruleMParameterValueAssignment )
            	    {
            	    // InternalCMP.g:1655:1: (lv_attributeValueAssignments_5_0= ruleMParameterValueAssignment )
            	    // InternalCMP.g:1656:3: lv_attributeValueAssignments_5_0= ruleMParameterValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMInternalComponentInstanceAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_attributeValueAssignments_5_0=ruleMParameterValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMInternalComponentInstanceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_5_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMInternalComponentInstanceAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMInternalComponentInstanceAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMInternalComponentInstance"


    // $ANTLR start "entryRuleMServerPort"
    // InternalCMP.g:1688:1: entryRuleMServerPort returns [EObject current=null] : iv_ruleMServerPort= ruleMServerPort EOF ;
    public final EObject entryRuleMServerPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMServerPort = null;


        try {
            // InternalCMP.g:1689:2: (iv_ruleMServerPort= ruleMServerPort EOF )
            // InternalCMP.g:1690:2: iv_ruleMServerPort= ruleMServerPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMServerPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMServerPort=ruleMServerPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMServerPort; 
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
    // $ANTLR end "entryRuleMServerPort"


    // $ANTLR start "ruleMServerPort"
    // InternalCMP.g:1697:1: ruleMServerPort returns [EObject current=null] : ( () otherlv_1= 'server' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleMServerPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_attributeValueAssignments_6_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:1700:28: ( ( () otherlv_1= 'server' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // InternalCMP.g:1701:1: ( () otherlv_1= 'server' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalCMP.g:1701:1: ( () otherlv_1= 'server' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';' )
            // InternalCMP.g:1701:2: () otherlv_1= 'server' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // InternalCMP.g:1701:2: ()
            // InternalCMP.g:1702:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMServerPortAccess().getMServerPortAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMServerPortAccess().getServerKeyword_1());
                  
            }
            // InternalCMP.g:1714:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalCMP.g:1715:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalCMP.g:1715:1: ( ruleVersionedQualifiedReferenceName )
            // InternalCMP.g:1716:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMServerPortRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMServerPortAccess().getTypeMPortTypeCrossReference_2_0()); 
              	    
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

            // InternalCMP.g:1732:2: ( ( ruleVersionedQualifiedName ) )
            // InternalCMP.g:1733:1: ( ruleVersionedQualifiedName )
            {
            // InternalCMP.g:1733:1: ( ruleVersionedQualifiedName )
            // InternalCMP.g:1734:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMServerPortRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMServerPortAccess().getInterfaceMInterfaceCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_3);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCMP.g:1750:2: ( (lv_name_4_0= RULE_ID ) )
            // InternalCMP.g:1751:1: (lv_name_4_0= RULE_ID )
            {
            // InternalCMP.g:1751:1: (lv_name_4_0= RULE_ID )
            // InternalCMP.g:1752:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getMServerPortAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMServerPortRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMServerPortAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // InternalCMP.g:1772:1: ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCMP.g:1773:1: (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment )
            	    {
            	    // InternalCMP.g:1773:1: (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment )
            	    // InternalCMP.g:1774:3: lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMServerPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_attributeValueAssignments_6_0=ruleMParameterValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMServerPortRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_6_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMServerPortAccess().getRightCurlyBracketKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMServerPortAccess().getSemicolonKeyword_8());
                  
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
    // $ANTLR end "ruleMServerPort"


    // $ANTLR start "entryRuleMClientPort"
    // InternalCMP.g:1806:1: entryRuleMClientPort returns [EObject current=null] : iv_ruleMClientPort= ruleMClientPort EOF ;
    public final EObject entryRuleMClientPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMClientPort = null;


        try {
            // InternalCMP.g:1807:2: (iv_ruleMClientPort= ruleMClientPort EOF )
            // InternalCMP.g:1808:2: iv_ruleMClientPort= ruleMClientPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMClientPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMClientPort=ruleMClientPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMClientPort; 
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
    // $ANTLR end "entryRuleMClientPort"


    // $ANTLR start "ruleMClientPort"
    // InternalCMP.g:1815:1: ruleMClientPort returns [EObject current=null] : ( () otherlv_1= 'client' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleMClientPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_attributeValueAssignments_6_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:1818:28: ( ( () otherlv_1= 'client' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // InternalCMP.g:1819:1: ( () otherlv_1= 'client' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalCMP.g:1819:1: ( () otherlv_1= 'client' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';' )
            // InternalCMP.g:1819:2: () otherlv_1= 'client' ( ( ruleVersionedQualifiedReferenceName ) ) ( ( ruleVersionedQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // InternalCMP.g:1819:2: ()
            // InternalCMP.g:1820:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMClientPortAccess().getMClientPortAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMClientPortAccess().getClientKeyword_1());
                  
            }
            // InternalCMP.g:1832:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalCMP.g:1833:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalCMP.g:1833:1: ( ruleVersionedQualifiedReferenceName )
            // InternalCMP.g:1834:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMClientPortRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMClientPortAccess().getTypeMPortTypeCrossReference_2_0()); 
              	    
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

            // InternalCMP.g:1850:2: ( ( ruleVersionedQualifiedName ) )
            // InternalCMP.g:1851:1: ( ruleVersionedQualifiedName )
            {
            // InternalCMP.g:1851:1: ( ruleVersionedQualifiedName )
            // InternalCMP.g:1852:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMClientPortRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMClientPortAccess().getInterfaceMInterfaceCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_3);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCMP.g:1868:2: ( (lv_name_4_0= RULE_ID ) )
            // InternalCMP.g:1869:1: (lv_name_4_0= RULE_ID )
            {
            // InternalCMP.g:1869:1: (lv_name_4_0= RULE_ID )
            // InternalCMP.g:1870:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getMClientPortAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMClientPortRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMClientPortAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // InternalCMP.g:1890:1: ( (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCMP.g:1891:1: (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment )
            	    {
            	    // InternalCMP.g:1891:1: (lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment )
            	    // InternalCMP.g:1892:3: lv_attributeValueAssignments_6_0= ruleMParameterValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMClientPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_attributeValueAssignments_6_0=ruleMParameterValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMClientPortRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_6_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMClientPortAccess().getRightCurlyBracketKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMClientPortAccess().getSemicolonKeyword_8());
                  
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
    // $ANTLR end "ruleMClientPort"


    // $ANTLR start "entryRuleMParameterValueAssignment"
    // InternalCMP.g:1924:1: entryRuleMParameterValueAssignment returns [EObject current=null] : iv_ruleMParameterValueAssignment= ruleMParameterValueAssignment EOF ;
    public final EObject entryRuleMParameterValueAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueAssignment = null;


        try {
            // InternalCMP.g:1925:2: (iv_ruleMParameterValueAssignment= ruleMParameterValueAssignment EOF )
            // InternalCMP.g:1926:2: iv_ruleMParameterValueAssignment= ruleMParameterValueAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMParameterValueAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMParameterValueAssignment=ruleMParameterValueAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMParameterValueAssignment; 
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
    // $ANTLR end "entryRuleMParameterValueAssignment"


    // $ANTLR start "ruleMParameterValueAssignment"
    // InternalCMP.g:1933:1: ruleMParameterValueAssignment returns [EObject current=null] : (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleMParameterValueAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:1936:28: ( (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) )
            // InternalCMP.g:1937:1: (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            {
            // InternalCMP.g:1937:1: (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            // InternalCMP.g:1937:3: otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValueAssignmentAccess().getAttributeKeyword_0());
                  
            }
            // InternalCMP.g:1941:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalCMP.g:1942:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalCMP.g:1942:1: ( ruleVersionedQualifiedReferenceName )
            // InternalCMP.g:1943:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMParameterValueAssignmentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMParameterValueAssignmentAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalCMP.g:1963:1: ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:1964:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:1964:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            // InternalCMP.g:1965:3: lv_parameterValue_3_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_parameterValue_3_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMParameterValueAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"parameterValue",
                      		lv_parameterValue_3_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMParameterValueAssignmentAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleMParameterValueAssignment"


    // $ANTLR start "entryRuleMParameter"
    // InternalCMP.g:1993:1: entryRuleMParameter returns [EObject current=null] : iv_ruleMParameter= ruleMParameter EOF ;
    public final EObject entryRuleMParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameter = null;


        try {
            // InternalCMP.g:1994:2: (iv_ruleMParameter= ruleMParameter EOF )
            // InternalCMP.g:1995:2: iv_ruleMParameter= ruleMParameter EOF
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
    // InternalCMP.g:2002:1: ruleMParameter returns [EObject current=null] : (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition ) ;
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
            // InternalCMP.g:2005:28: ( (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition ) )
            // InternalCMP.g:2006:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )
            {
            // InternalCMP.g:2006:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )
            int alt35=6;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalCMP.g:2007:2: this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression
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
                    // InternalCMP.g:2020:2: this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression
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
                    // InternalCMP.g:2033:2: this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression
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
                    // InternalCMP.g:2046:2: this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression
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
                    // InternalCMP.g:2059:2: this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression
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
                    // InternalCMP.g:2072:2: this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition
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
    // InternalCMP.g:2091:1: entryRuleMIntegerParameterSingleExpression returns [EObject current=null] : iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF ;
    public final EObject entryRuleMIntegerParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIntegerParameterSingleExpression = null;


        try {
            // InternalCMP.g:2092:2: (iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF )
            // InternalCMP.g:2093:2: iv_ruleMIntegerParameterSingleExpression= ruleMIntegerParameterSingleExpression EOF
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
    // InternalCMP.g:2100:1: ruleMIntegerParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) ;
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
            // InternalCMP.g:2103:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) )
            // InternalCMP.g:2104:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            {
            // InternalCMP.g:2104:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            // InternalCMP.g:2104:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'integer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';'
            {
            // InternalCMP.g:2104:2: ( (lv_constant_0_0= 'const' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCMP.g:2105:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalCMP.g:2105:1: (lv_constant_0_0= 'const' )
                    // InternalCMP.g:2106:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,44,FollowSets000.FOLLOW_39); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1());
                  
            }
            // InternalCMP.g:2123:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMP.g:2124:1: (lv_name_2_0= RULE_ID )
            {
            // InternalCMP.g:2124:1: (lv_name_2_0= RULE_ID )
            // InternalCMP.g:2125:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalCMP.g:2145:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:2146:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:2146:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // InternalCMP.g:2147:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCMP.g:2163:2: (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCMP.g:2163:4: otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) )
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0());
                          
                    }
                    // InternalCMP.g:2167:1: ( (lv_range_6_0= ruleMParameterRange ) )
                    // InternalCMP.g:2168:1: (lv_range_6_0= ruleMParameterRange )
                    {
                    // InternalCMP.g:2168:1: (lv_range_6_0= ruleMParameterRange )
                    // InternalCMP.g:2169:3: lv_range_6_0= ruleMParameterRange
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
                              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterRange");
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
    // InternalCMP.g:2197:1: entryRuleMEnumParameterDefinition returns [EObject current=null] : iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF ;
    public final EObject entryRuleMEnumParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterDefinition = null;


        try {
            // InternalCMP.g:2198:2: (iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF )
            // InternalCMP.g:2199:2: iv_ruleMEnumParameterDefinition= ruleMEnumParameterDefinition EOF
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
    // InternalCMP.g:2206:1: ruleMEnumParameterDefinition returns [EObject current=null] : ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' ) ;
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
            // InternalCMP.g:2209:28: ( ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // InternalCMP.g:2210:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalCMP.g:2210:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';' )
            // InternalCMP.g:2210:2: () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // InternalCMP.g:2210:2: ()
            // InternalCMP.g:2211:2: 
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

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1());
                  
            }
            // InternalCMP.g:2223:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMP.g:2224:1: (lv_name_2_0= RULE_ID )
            {
            // InternalCMP.g:2224:1: (lv_name_2_0= RULE_ID )
            // InternalCMP.g:2225:3: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalCMP.g:2245:1: ( (lv_literals_4_0= ruleMEnumParameterLiteralRule ) )
            // InternalCMP.g:2246:1: (lv_literals_4_0= ruleMEnumParameterLiteralRule )
            {
            // InternalCMP.g:2246:1: (lv_literals_4_0= ruleMEnumParameterLiteralRule )
            // InternalCMP.g:2247:3: lv_literals_4_0= ruleMEnumParameterLiteralRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_42);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParameterLiteralRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCMP.g:2263:2: (otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==22) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCMP.g:2263:4: otherlv_5= ',' ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // InternalCMP.g:2267:1: ( (lv_literals_6_0= ruleMEnumParameterLiteralRule ) )
            	    // InternalCMP.g:2268:1: (lv_literals_6_0= ruleMEnumParameterLiteralRule )
            	    {
            	    // InternalCMP.g:2268:1: (lv_literals_6_0= ruleMEnumParameterLiteralRule )
            	    // InternalCMP.g:2269:3: lv_literals_6_0= ruleMEnumParameterLiteralRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_42);
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
            	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParameterLiteralRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
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
    // InternalCMP.g:2301:1: entryRuleMEnumParameterSingleExpression returns [EObject current=null] : iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF ;
    public final EObject entryRuleMEnumParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterSingleExpression = null;


        try {
            // InternalCMP.g:2302:2: (iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF )
            // InternalCMP.g:2303:2: iv_ruleMEnumParameterSingleExpression= ruleMEnumParameterSingleExpression EOF
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
    // InternalCMP.g:2310:1: ruleMEnumParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' ) ;
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
            // InternalCMP.g:2313:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' ) )
            // InternalCMP.g:2314:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' )
            {
            // InternalCMP.g:2314:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';' )
            // InternalCMP.g:2314:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':=' ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) ) otherlv_6= ';'
            {
            // InternalCMP.g:2314:2: ( (lv_constant_0_0= 'const' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCMP.g:2315:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalCMP.g:2315:1: (lv_constant_0_0= 'const' )
                    // InternalCMP.g:2316:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,44,FollowSets000.FOLLOW_43); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1());
                  
            }
            // InternalCMP.g:2333:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalCMP.g:2334:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalCMP.g:2334:1: ( ruleVersionedQualifiedReferenceName )
            // InternalCMP.g:2335:3: ruleVersionedQualifiedReferenceName
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

            // InternalCMP.g:2351:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalCMP.g:2352:1: (lv_name_3_0= RULE_ID )
            {
            // InternalCMP.g:2352:1: (lv_name_3_0= RULE_ID )
            // InternalCMP.g:2353:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4());
                  
            }
            // InternalCMP.g:2373:1: ( (lv_defaultValue_5_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:2374:1: (lv_defaultValue_5_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:2374:1: (lv_defaultValue_5_0= ruleMParameterValueExpression )
            // InternalCMP.g:2375:3: lv_defaultValue_5_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
    // InternalCMP.g:2403:1: entryRuleMRealParameterSingleExpression returns [EObject current=null] : iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF ;
    public final EObject entryRuleMRealParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRealParameterSingleExpression = null;


        try {
            // InternalCMP.g:2404:2: (iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF )
            // InternalCMP.g:2405:2: iv_ruleMRealParameterSingleExpression= ruleMRealParameterSingleExpression EOF
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
    // InternalCMP.g:2412:1: ruleMRealParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) ;
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
            // InternalCMP.g:2415:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' ) )
            // InternalCMP.g:2416:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            {
            // InternalCMP.g:2416:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';' )
            // InternalCMP.g:2416:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'real' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )? otherlv_7= ';'
            {
            // InternalCMP.g:2416:2: ( (lv_constant_0_0= 'const' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCMP.g:2417:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalCMP.g:2417:1: (lv_constant_0_0= 'const' )
                    // InternalCMP.g:2418:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,44,FollowSets000.FOLLOW_44); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1());
                  
            }
            // InternalCMP.g:2435:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMP.g:2436:1: (lv_name_2_0= RULE_ID )
            {
            // InternalCMP.g:2436:1: (lv_name_2_0= RULE_ID )
            // InternalCMP.g:2437:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalCMP.g:2457:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:2458:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:2458:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // InternalCMP.g:2459:3: lv_defaultValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCMP.g:2475:2: (otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCMP.g:2475:4: otherlv_5= 'range' ( (lv_range_6_0= ruleMParameterRange ) )
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0());
                          
                    }
                    // InternalCMP.g:2479:1: ( (lv_range_6_0= ruleMParameterRange ) )
                    // InternalCMP.g:2480:1: (lv_range_6_0= ruleMParameterRange )
                    {
                    // InternalCMP.g:2480:1: (lv_range_6_0= ruleMParameterRange )
                    // InternalCMP.g:2481:3: lv_range_6_0= ruleMParameterRange
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
                              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterRange");
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
    // InternalCMP.g:2509:1: entryRuleMEnumParameterLiteralRule returns [EObject current=null] : iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF ;
    public final EObject entryRuleMEnumParameterLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterLiteralRule = null;


        try {
            // InternalCMP.g:2510:2: (iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF )
            // InternalCMP.g:2511:2: iv_ruleMEnumParameterLiteralRule= ruleMEnumParameterLiteralRule EOF
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
    // InternalCMP.g:2518:1: ruleMEnumParameterLiteralRule returns [EObject current=null] : (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral ) ;
    public final EObject ruleMEnumParameterLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject this_MEnumParameterLiteral_0 = null;

        EObject this_MEnumParamIntegerLiteral_1 = null;

        EObject this_MEnumParamRealLiteral_2 = null;

        EObject this_MEnumParamStringLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:2521:28: ( (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral ) )
            // InternalCMP.g:2522:1: (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral )
            {
            // InternalCMP.g:2522:1: (this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral | this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral | this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral | this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral )
            int alt42=4;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==EOF||LA42_1==22||LA42_1==27) ) {
                    alt42=1;
                }
                else if ( (LA42_1==56) ) {
                    switch ( input.LA(3) ) {
                    case 51:
                        {
                        int LA42_4 = input.LA(4);

                        if ( (LA42_4==RULE_INT) ) {
                            int LA42_5 = input.LA(5);

                            if ( (LA42_5==15) ) {
                                alt42=3;
                            }
                            else if ( (LA42_5==EOF||LA42_5==22||LA42_5==27) ) {
                                alt42=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 42, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        int LA42_5 = input.LA(4);

                        if ( (LA42_5==15) ) {
                            alt42=3;
                        }
                        else if ( (LA42_5==EOF||LA42_5==22||LA42_5==27) ) {
                            alt42=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HEXADECIMAL:
                        {
                        alt42=2;
                        }
                        break;
                    case RULE_STRING:
                    case 53:
                        {
                        alt42=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalCMP.g:2523:2: this_MEnumParameterLiteral_0= ruleMEnumParameterLiteral
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
                    // InternalCMP.g:2536:2: this_MEnumParamIntegerLiteral_1= ruleMEnumParamIntegerLiteral
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
                    // InternalCMP.g:2549:2: this_MEnumParamRealLiteral_2= ruleMEnumParamRealLiteral
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
                    // InternalCMP.g:2562:2: this_MEnumParamStringLiteral_3= ruleMEnumParamStringLiteral
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


    // $ANTLR start "entryRuleMParameterValue"
    // InternalCMP.g:2581:1: entryRuleMParameterValue returns [EObject current=null] : iv_ruleMParameterValue= ruleMParameterValue EOF ;
    public final EObject entryRuleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValue = null;


        try {
            // InternalCMP.g:2582:2: (iv_ruleMParameterValue= ruleMParameterValue EOF )
            // InternalCMP.g:2583:2: iv_ruleMParameterValue= ruleMParameterValue EOF
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
    // InternalCMP.g:2590:1: ruleMParameterValue returns [EObject current=null] : (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) ;
    public final EObject ruleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueLiteral_0 = null;

        EObject this_MParameterValueRefObject_1 = null;

        EObject this_MParameterValuePAR_2 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:2593:28: ( (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) )
            // InternalCMP.g:2594:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            {
            // InternalCMP.g:2594:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_HEXADECIMAL:
            case RULE_STRING:
            case 49:
            case 50:
            case 51:
            case 53:
                {
                alt43=1;
                }
                break;
            case RULE_ID:
                {
                alt43=2;
                }
                break;
            case 16:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalCMP.g:2595:2: this_MParameterValueLiteral_0= ruleMParameterValueLiteral
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
                    // InternalCMP.g:2608:2: this_MParameterValueRefObject_1= ruleMParameterValueRefObject
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
                    // InternalCMP.g:2621:2: this_MParameterValuePAR_2= ruleMParameterValuePAR
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
    // InternalCMP.g:2640:1: entryRuleMParameterValueLiteral returns [EObject current=null] : iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF ;
    public final EObject entryRuleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueLiteral = null;


        try {
            // InternalCMP.g:2641:2: (iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF )
            // InternalCMP.g:2642:2: iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF
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
    // InternalCMP.g:2649:1: ruleMParameterValueLiteral returns [EObject current=null] : (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) ;
    public final EObject ruleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueBooleanLiteral_0 = null;

        EObject this_MParameterValueStringLiteral_1 = null;

        EObject this_MParameterValueIntegerLiteral_2 = null;

        EObject this_MParameterValueRealLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:2652:28: ( (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) )
            // InternalCMP.g:2653:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            {
            // InternalCMP.g:2653:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
                {
                alt44=1;
                }
                break;
            case RULE_STRING:
            case 53:
                {
                alt44=2;
                }
                break;
            case 51:
                {
                int LA44_3 = input.LA(2);

                if ( (LA44_3==RULE_INT) ) {
                    int LA44_4 = input.LA(3);

                    if ( (LA44_4==EOF||LA44_4==13||LA44_4==17||LA44_4==22||LA44_4==46||LA44_4==51||LA44_4==54||(LA44_4>=75 && LA44_4<=77)) ) {
                        alt44=3;
                    }
                    else if ( (LA44_4==15) ) {
                        alt44=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA44_4 = input.LA(2);

                if ( (LA44_4==EOF||LA44_4==13||LA44_4==17||LA44_4==22||LA44_4==46||LA44_4==51||LA44_4==54||(LA44_4>=75 && LA44_4<=77)) ) {
                    alt44=3;
                }
                else if ( (LA44_4==15) ) {
                    alt44=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEXADECIMAL:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalCMP.g:2654:2: this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral
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
                    // InternalCMP.g:2667:2: this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral
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
                    // InternalCMP.g:2680:2: this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral
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
                    // InternalCMP.g:2693:2: this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalCMP.g:2712:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalCMP.g:2713:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalCMP.g:2714:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalCMP.g:2721:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalCMP.g:2724:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalCMP.g:2725:1: (kw= 'true' | kw= 'false' )
            {
            // InternalCMP.g:2725:1: (kw= 'true' | kw= 'false' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            else if ( (LA45_0==50) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalCMP.g:2726:2: kw= 'true'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCMP.g:2733:2: kw= 'false'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCMP.g:2746:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalCMP.g:2747:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalCMP.g:2748:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalCMP.g:2755:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;

         enterRule(); 
            
        try {
            // InternalCMP.g:2758:28: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalCMP.g:2759:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalCMP.g:2759:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT||LA47_0==51) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_HEXADECIMAL) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalCMP.g:2759:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalCMP.g:2759:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalCMP.g:2759:3: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalCMP.g:2759:3: (kw= '-' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==51) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalCMP.g:2760:2: kw= '-'
                            {
                            kw=(Token)match(input,51,FollowSets000.FOLLOW_45); if (state.failed) return current;
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
                    // InternalCMP.g:2773:10: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalCMP.g:2788:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // InternalCMP.g:2789:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalCMP.g:2790:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalCMP.g:2797:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // InternalCMP.g:2800:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalCMP.g:2801:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalCMP.g:2801:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalCMP.g:2801:2: (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalCMP.g:2801:2: (kw= '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCMP.g:2802:2: kw= '-'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            // InternalCMP.g:2807:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalCMP.g:2807:8: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
                  
            }
            kw=(Token)match(input,15,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
                  
            }

            }

            // InternalCMP.g:2827:2: (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==52) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCMP.g:2828:2: kw= 'e' (kw= '-' )? this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0()); 
                          
                    }
                    // InternalCMP.g:2833:1: (kw= '-' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==51) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalCMP.g:2834:2: kw= '-'
                            {
                            kw=(Token)match(input,51,FollowSets000.FOLLOW_45); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMParameterValueBooleanLiteral"
    // InternalCMP.g:2854:1: entryRuleMParameterValueBooleanLiteral returns [EObject current=null] : iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF ;
    public final EObject entryRuleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueBooleanLiteral = null;


        try {
            // InternalCMP.g:2855:2: (iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF )
            // InternalCMP.g:2856:2: iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF
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
    // InternalCMP.g:2863:1: ruleMParameterValueBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:2866:28: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // InternalCMP.g:2867:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // InternalCMP.g:2867:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // InternalCMP.g:2867:2: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // InternalCMP.g:2867:2: ()
            // InternalCMP.g:2868:2: 
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

            // InternalCMP.g:2876:2: ( (lv_value_1_0= ruleEBoolean ) )
            // InternalCMP.g:2877:1: (lv_value_1_0= ruleEBoolean )
            {
            // InternalCMP.g:2877:1: (lv_value_1_0= ruleEBoolean )
            // InternalCMP.g:2878:3: lv_value_1_0= ruleEBoolean
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.EBoolean");
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
    // InternalCMP.g:2902:1: entryRuleMParameterValueStringLiteral returns [EObject current=null] : iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF ;
    public final EObject entryRuleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueStringLiteral = null;


        try {
            // InternalCMP.g:2903:2: (iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF )
            // InternalCMP.g:2904:2: iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF
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
    // InternalCMP.g:2911:1: ruleMParameterValueStringLiteral returns [EObject current=null] : ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isRaw_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalCMP.g:2914:28: ( ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCMP.g:2915:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCMP.g:2915:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCMP.g:2915:2: () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCMP.g:2915:2: ()
            // InternalCMP.g:2916:2: 
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

            // InternalCMP.g:2924:2: ( (lv_isRaw_1_0= 'raw' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCMP.g:2925:1: (lv_isRaw_1_0= 'raw' )
                    {
                    // InternalCMP.g:2925:1: (lv_isRaw_1_0= 'raw' )
                    // InternalCMP.g:2926:3: lv_isRaw_1_0= 'raw'
                    {
                    lv_isRaw_1_0=(Token)match(input,53,FollowSets000.FOLLOW_49); if (state.failed) return current;
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

            // InternalCMP.g:2939:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCMP.g:2940:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalCMP.g:2940:1: (lv_value_2_0= RULE_STRING )
            // InternalCMP.g:2941:3: lv_value_2_0= RULE_STRING
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
    // InternalCMP.g:2965:1: entryRuleMParameterValueIntegerLiteral returns [EObject current=null] : iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF ;
    public final EObject entryRuleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueIntegerLiteral = null;


        try {
            // InternalCMP.g:2966:2: (iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF )
            // InternalCMP.g:2967:2: iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF
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
    // InternalCMP.g:2974:1: ruleMParameterValueIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:2977:28: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) )
            // InternalCMP.g:2978:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            {
            // InternalCMP.g:2978:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            // InternalCMP.g:2978:2: () ( (lv_value_1_0= ruleINTEGER ) )
            {
            // InternalCMP.g:2978:2: ()
            // InternalCMP.g:2979:2: 
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

            // InternalCMP.g:2987:2: ( (lv_value_1_0= ruleINTEGER ) )
            // InternalCMP.g:2988:1: (lv_value_1_0= ruleINTEGER )
            {
            // InternalCMP.g:2988:1: (lv_value_1_0= ruleINTEGER )
            // InternalCMP.g:2989:3: lv_value_1_0= ruleINTEGER
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.INTEGER");
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
    // InternalCMP.g:3013:1: entryRuleMParameterValueRealLiteral returns [EObject current=null] : iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF ;
    public final EObject entryRuleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRealLiteral = null;


        try {
            // InternalCMP.g:3014:2: (iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF )
            // InternalCMP.g:3015:2: iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF
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
    // InternalCMP.g:3022:1: ruleMParameterValueRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ) ;
    public final EObject ruleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3025:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ) )
            // InternalCMP.g:3026:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            {
            // InternalCMP.g:3026:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            // InternalCMP.g:3026:2: () ( (lv_value_1_0= ruleREAL ) )
            {
            // InternalCMP.g:3026:2: ()
            // InternalCMP.g:3027:2: 
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

            // InternalCMP.g:3035:2: ( (lv_value_1_0= ruleREAL ) )
            // InternalCMP.g:3036:1: (lv_value_1_0= ruleREAL )
            {
            // InternalCMP.g:3036:1: (lv_value_1_0= ruleREAL )
            // InternalCMP.g:3037:3: lv_value_1_0= ruleREAL
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.REAL");
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
    // InternalCMP.g:3061:1: entryRuleMParameterValueRefObject returns [EObject current=null] : iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF ;
    public final EObject entryRuleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRefObject = null;


        try {
            // InternalCMP.g:3062:2: (iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF )
            // InternalCMP.g:3063:2: iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF
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
    // InternalCMP.g:3070:1: ruleMParameterValueRefObject returns [EObject current=null] : ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) ;
    public final EObject ruleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalCMP.g:3073:28: ( ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) )
            // InternalCMP.g:3074:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            {
            // InternalCMP.g:3074:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalCMP.g:3074:2: () ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalCMP.g:3074:2: ()
            // InternalCMP.g:3075:2: 
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

            // InternalCMP.g:3083:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalCMP.g:3084:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalCMP.g:3084:1: ( ruleVersionedQualifiedReferenceName )
            // InternalCMP.g:3085:3: ruleVersionedQualifiedReferenceName
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
    // InternalCMP.g:3109:1: entryRuleMParameterValuePAR returns [EObject current=null] : iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF ;
    public final EObject entryRuleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValuePAR = null;


        try {
            // InternalCMP.g:3110:2: (iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF )
            // InternalCMP.g:3111:2: iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF
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
    // InternalCMP.g:3118:1: ruleMParameterValuePAR returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3121:28: ( (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) )
            // InternalCMP.g:3122:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            {
            // InternalCMP.g:3122:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            // InternalCMP.g:3122:3: otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0());
                  
            }
            // InternalCMP.g:3126:1: ( (lv_value_1_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:3127:1: (lv_value_1_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:3127:1: (lv_value_1_0= ruleMParameterValueExpression )
            // InternalCMP.g:3128:3: lv_value_1_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
    // InternalCMP.g:3156:1: entryRuleMParameterValueExpression returns [EObject current=null] : iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF ;
    public final EObject entryRuleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueExpression = null;


        try {
            // InternalCMP.g:3157:2: (iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF )
            // InternalCMP.g:3158:2: iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF
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
    // InternalCMP.g:3165:1: ruleMParameterValueExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) ;
    public final EObject ruleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3168:28: ( ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) )
            // InternalCMP.g:3169:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            {
            // InternalCMP.g:3169:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            // InternalCMP.g:3169:2: () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            {
            // InternalCMP.g:3169:2: ()
            // InternalCMP.g:3170:2: 
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

            // InternalCMP.g:3178:2: ( (lv_left_1_0= ruleMParameterValueTERM ) )
            // InternalCMP.g:3179:1: (lv_left_1_0= ruleMParameterValueTERM )
            {
            // InternalCMP.g:3179:1: (lv_left_1_0= ruleMParameterValueTERM )
            // InternalCMP.g:3180:3: lv_left_1_0= ruleMParameterValueTERM
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_50);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueTERM");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCMP.g:3196:2: ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==51||LA52_0==75) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCMP.g:3196:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    {
                    // InternalCMP.g:3196:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) )
                    // InternalCMP.g:3197:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    {
                    // InternalCMP.g:3197:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    // InternalCMP.g:3198:3: lv_operation_2_0= ruleMParameterValueExpressionOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
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
                              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpressionOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCMP.g:3214:2: ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    // InternalCMP.g:3215:1: (lv_right_3_0= ruleMParameterValueExpression )
                    {
                    // InternalCMP.g:3215:1: (lv_right_3_0= ruleMParameterValueExpression )
                    // InternalCMP.g:3216:3: lv_right_3_0= ruleMParameterValueExpression
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
                              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
    // InternalCMP.g:3240:1: entryRuleMParameterValueTERM returns [EObject current=null] : iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF ;
    public final EObject entryRuleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueTERM = null;


        try {
            // InternalCMP.g:3241:2: (iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF )
            // InternalCMP.g:3242:2: iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF
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
    // InternalCMP.g:3249:1: ruleMParameterValueTERM returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) ;
    public final EObject ruleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3252:28: ( ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) )
            // InternalCMP.g:3253:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            {
            // InternalCMP.g:3253:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            // InternalCMP.g:3253:2: () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            {
            // InternalCMP.g:3253:2: ()
            // InternalCMP.g:3254:2: 
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

            // InternalCMP.g:3262:2: ( (lv_left_1_0= ruleMParameterValue ) )
            // InternalCMP.g:3263:1: (lv_left_1_0= ruleMParameterValue )
            {
            // InternalCMP.g:3263:1: (lv_left_1_0= ruleMParameterValue )
            // InternalCMP.g:3264:3: lv_left_1_0= ruleMParameterValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_51);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalCMP.g:3280:2: ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=76 && LA53_0<=77)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCMP.g:3280:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    {
                    // InternalCMP.g:3280:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) )
                    // InternalCMP.g:3281:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    {
                    // InternalCMP.g:3281:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    // InternalCMP.g:3282:3: lv_operation_2_0= ruleMParameterValueTERMOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
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
                              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueTERMOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalCMP.g:3298:2: ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    // InternalCMP.g:3299:1: (lv_right_3_0= ruleMParameterValueTERM )
                    {
                    // InternalCMP.g:3299:1: (lv_right_3_0= ruleMParameterValueTERM )
                    // InternalCMP.g:3300:3: lv_right_3_0= ruleMParameterValueTERM
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
                              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueTERM");
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
    // InternalCMP.g:3324:1: entryRuleMParameterRange returns [EObject current=null] : iv_ruleMParameterRange= ruleMParameterRange EOF ;
    public final EObject entryRuleMParameterRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterRange = null;


        try {
            // InternalCMP.g:3325:2: (iv_ruleMParameterRange= ruleMParameterRange EOF )
            // InternalCMP.g:3326:2: iv_ruleMParameterRange= ruleMParameterRange EOF
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
    // InternalCMP.g:3333:1: ruleMParameterRange returns [EObject current=null] : (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR ) ;
    public final EObject ruleMParameterRange() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterOCR_0 = null;

        EObject this_MParameterOOR_1 = null;

        EObject this_MParameterCOR_2 = null;

        EObject this_MParameterCCR_3 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3336:28: ( (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR ) )
            // InternalCMP.g:3337:1: (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR )
            {
            // InternalCMP.g:3337:1: (this_MParameterOCR_0= ruleMParameterOCR | this_MParameterOOR_1= ruleMParameterOOR | this_MParameterCOR_2= ruleMParameterCOR | this_MParameterCCR_3= ruleMParameterCCR )
            int alt54=4;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==16) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred75_InternalCMP()) ) {
                    alt54=1;
                }
                else if ( (synpred76_InternalCMP()) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==55) ) {
                int LA54_2 = input.LA(2);

                if ( (synpred77_InternalCMP()) ) {
                    alt54=3;
                }
                else if ( (true) ) {
                    alt54=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalCMP.g:3338:2: this_MParameterOCR_0= ruleMParameterOCR
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
                    // InternalCMP.g:3351:2: this_MParameterOOR_1= ruleMParameterOOR
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
                    // InternalCMP.g:3364:2: this_MParameterCOR_2= ruleMParameterCOR
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
                    // InternalCMP.g:3377:2: this_MParameterCCR_3= ruleMParameterCCR
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
    // InternalCMP.g:3396:1: entryRuleMParameterOCR returns [EObject current=null] : iv_ruleMParameterOCR= ruleMParameterOCR EOF ;
    public final EObject entryRuleMParameterOCR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterOCR = null;


        try {
            // InternalCMP.g:3397:2: (iv_ruleMParameterOCR= ruleMParameterOCR EOF )
            // InternalCMP.g:3398:2: iv_ruleMParameterOCR= ruleMParameterOCR EOF
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
    // InternalCMP.g:3405:1: ruleMParameterOCR returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) ;
    public final EObject ruleMParameterOCR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3408:28: ( ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) )
            // InternalCMP.g:3409:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            {
            // InternalCMP.g:3409:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            // InternalCMP.g:3409:2: () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']'
            {
            // InternalCMP.g:3409:2: ()
            // InternalCMP.g:3410:2: 
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

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalCMP.g:3422:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:3423:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:3423:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalCMP.g:3424:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_52);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterOCRAccess().getCommaKeyword_3());
                  
            }
            // InternalCMP.g:3444:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:3445:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:3445:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalCMP.g:3446:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_53);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCMP.g:3474:1: entryRuleMParameterOOR returns [EObject current=null] : iv_ruleMParameterOOR= ruleMParameterOOR EOF ;
    public final EObject entryRuleMParameterOOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterOOR = null;


        try {
            // InternalCMP.g:3475:2: (iv_ruleMParameterOOR= ruleMParameterOOR EOF )
            // InternalCMP.g:3476:2: iv_ruleMParameterOOR= ruleMParameterOOR EOF
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
    // InternalCMP.g:3483:1: ruleMParameterOOR returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMParameterOOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3486:28: ( ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) )
            // InternalCMP.g:3487:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            {
            // InternalCMP.g:3487:1: ( () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            // InternalCMP.g:3487:2: () otherlv_1= '(' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')'
            {
            // InternalCMP.g:3487:2: ()
            // InternalCMP.g:3488:2: 
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

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalCMP.g:3500:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:3501:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:3501:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalCMP.g:3502:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_52);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterOORAccess().getCommaKeyword_3());
                  
            }
            // InternalCMP.g:3522:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:3523:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:3523:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalCMP.g:3524:3: lv_upperValue_4_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
    // InternalCMP.g:3552:1: entryRuleMParameterCOR returns [EObject current=null] : iv_ruleMParameterCOR= ruleMParameterCOR EOF ;
    public final EObject entryRuleMParameterCOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterCOR = null;


        try {
            // InternalCMP.g:3553:2: (iv_ruleMParameterCOR= ruleMParameterCOR EOF )
            // InternalCMP.g:3554:2: iv_ruleMParameterCOR= ruleMParameterCOR EOF
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
    // InternalCMP.g:3561:1: ruleMParameterCOR returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMParameterCOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3564:28: ( ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' ) )
            // InternalCMP.g:3565:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            {
            // InternalCMP.g:3565:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')' )
            // InternalCMP.g:3565:2: () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ')'
            {
            // InternalCMP.g:3565:2: ()
            // InternalCMP.g:3566:2: 
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

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalCMP.g:3578:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:3579:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:3579:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalCMP.g:3580:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_52);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterCORAccess().getCommaKeyword_3());
                  
            }
            // InternalCMP.g:3600:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:3601:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:3601:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalCMP.g:3602:3: lv_upperValue_4_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
    // InternalCMP.g:3630:1: entryRuleMParameterCCR returns [EObject current=null] : iv_ruleMParameterCCR= ruleMParameterCCR EOF ;
    public final EObject entryRuleMParameterCCR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterCCR = null;


        try {
            // InternalCMP.g:3631:2: (iv_ruleMParameterCCR= ruleMParameterCCR EOF )
            // InternalCMP.g:3632:2: iv_ruleMParameterCCR= ruleMParameterCCR EOF
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
    // InternalCMP.g:3639:1: ruleMParameterCCR returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) ;
    public final EObject ruleMParameterCCR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lowerValue_2_0 = null;

        EObject lv_upperValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3642:28: ( ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' ) )
            // InternalCMP.g:3643:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            {
            // InternalCMP.g:3643:1: ( () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']' )
            // InternalCMP.g:3643:2: () otherlv_1= '[' ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) ) otherlv_3= ',' ( (lv_upperValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ']'
            {
            // InternalCMP.g:3643:2: ()
            // InternalCMP.g:3644:2: 
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

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalCMP.g:3656:1: ( (lv_lowerValue_2_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:3657:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:3657:1: (lv_lowerValue_2_0= ruleMParameterValueExpression )
            // InternalCMP.g:3658:3: lv_lowerValue_2_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_52);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMParameterCCRAccess().getCommaKeyword_3());
                  
            }
            // InternalCMP.g:3678:1: ( (lv_upperValue_4_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:3679:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:3679:1: (lv_upperValue_4_0= ruleMParameterValueExpression )
            // InternalCMP.g:3680:3: lv_upperValue_4_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_53);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMEnumParameterLiteral"
    // InternalCMP.g:3708:1: entryRuleMEnumParameterLiteral returns [EObject current=null] : iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF ;
    public final EObject entryRuleMEnumParameterLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParameterLiteral = null;


        try {
            // InternalCMP.g:3709:2: (iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF )
            // InternalCMP.g:3710:2: iv_ruleMEnumParameterLiteral= ruleMEnumParameterLiteral EOF
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
    // InternalCMP.g:3717:1: ruleMEnumParameterLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMEnumParameterLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalCMP.g:3720:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCMP.g:3721:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCMP.g:3721:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCMP.g:3721:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalCMP.g:3721:2: ()
            // InternalCMP.g:3722:2: 
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

            // InternalCMP.g:3730:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMP.g:3731:1: (lv_name_1_0= RULE_ID )
            {
            // InternalCMP.g:3731:1: (lv_name_1_0= RULE_ID )
            // InternalCMP.g:3732:3: lv_name_1_0= RULE_ID
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
    // InternalCMP.g:3756:1: entryRuleMEnumParamIntegerLiteral returns [EObject current=null] : iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF ;
    public final EObject entryRuleMEnumParamIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamIntegerLiteral = null;


        try {
            // InternalCMP.g:3757:2: (iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF )
            // InternalCMP.g:3758:2: iv_ruleMEnumParamIntegerLiteral= ruleMEnumParamIntegerLiteral EOF
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
    // InternalCMP.g:3765:1: ruleMEnumParamIntegerLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMEnumParamIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3768:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) ) )
            // InternalCMP.g:3769:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) )
            {
            // InternalCMP.g:3769:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) ) )
            // InternalCMP.g:3769:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleINTEGER ) )
            {
            // InternalCMP.g:3769:2: ()
            // InternalCMP.g:3770:2: 
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

            // InternalCMP.g:3778:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMP.g:3779:1: (lv_name_1_0= RULE_ID )
            {
            // InternalCMP.g:3779:1: (lv_name_1_0= RULE_ID )
            // InternalCMP.g:3780:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalCMP.g:3800:1: ( (lv_value_3_0= ruleINTEGER ) )
            // InternalCMP.g:3801:1: (lv_value_3_0= ruleINTEGER )
            {
            // InternalCMP.g:3801:1: (lv_value_3_0= ruleINTEGER )
            // InternalCMP.g:3802:3: lv_value_3_0= ruleINTEGER
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.INTEGER");
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
    // InternalCMP.g:3826:1: entryRuleMEnumParamRealLiteral returns [EObject current=null] : iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF ;
    public final EObject entryRuleMEnumParamRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamRealLiteral = null;


        try {
            // InternalCMP.g:3827:2: (iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF )
            // InternalCMP.g:3828:2: iv_ruleMEnumParamRealLiteral= ruleMEnumParamRealLiteral EOF
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
    // InternalCMP.g:3835:1: ruleMEnumParamRealLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) ) ;
    public final EObject ruleMEnumParamRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:3838:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) ) )
            // InternalCMP.g:3839:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) )
            {
            // InternalCMP.g:3839:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) ) )
            // InternalCMP.g:3839:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleREAL ) )
            {
            // InternalCMP.g:3839:2: ()
            // InternalCMP.g:3840:2: 
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

            // InternalCMP.g:3848:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMP.g:3849:1: (lv_name_1_0= RULE_ID )
            {
            // InternalCMP.g:3849:1: (lv_name_1_0= RULE_ID )
            // InternalCMP.g:3850:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalCMP.g:3870:1: ( (lv_value_3_0= ruleREAL ) )
            // InternalCMP.g:3871:1: (lv_value_3_0= ruleREAL )
            {
            // InternalCMP.g:3871:1: (lv_value_3_0= ruleREAL )
            // InternalCMP.g:3872:3: lv_value_3_0= ruleREAL
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.REAL");
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
    // InternalCMP.g:3896:1: entryRuleMEnumParamStringLiteral returns [EObject current=null] : iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF ;
    public final EObject entryRuleMEnumParamStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEnumParamStringLiteral = null;


        try {
            // InternalCMP.g:3897:2: (iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF )
            // InternalCMP.g:3898:2: iv_ruleMEnumParamStringLiteral= ruleMEnumParamStringLiteral EOF
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
    // InternalCMP.g:3905:1: ruleMEnumParamStringLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleMEnumParamStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isRaw_3_0=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // InternalCMP.g:3908:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalCMP.g:3909:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalCMP.g:3909:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalCMP.g:3909:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_isRaw_3_0= 'raw' ) )? ( (lv_value_4_0= RULE_STRING ) )
            {
            // InternalCMP.g:3909:2: ()
            // InternalCMP.g:3910:2: 
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

            // InternalCMP.g:3918:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMP.g:3919:1: (lv_name_1_0= RULE_ID )
            {
            // InternalCMP.g:3919:1: (lv_name_1_0= RULE_ID )
            // InternalCMP.g:3920:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalCMP.g:3940:1: ( (lv_isRaw_3_0= 'raw' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==53) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCMP.g:3941:1: (lv_isRaw_3_0= 'raw' )
                    {
                    // InternalCMP.g:3941:1: (lv_isRaw_3_0= 'raw' )
                    // InternalCMP.g:3942:3: lv_isRaw_3_0= 'raw'
                    {
                    lv_isRaw_3_0=(Token)match(input,53,FollowSets000.FOLLOW_49); if (state.failed) return current;
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

            // InternalCMP.g:3955:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalCMP.g:3956:1: (lv_value_4_0= RULE_STRING )
            {
            // InternalCMP.g:3956:1: (lv_value_4_0= RULE_STRING )
            // InternalCMP.g:3957:3: lv_value_4_0= RULE_STRING
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
    // InternalCMP.g:3981:1: entryRuleMBooleanParameterSingleExpression returns [EObject current=null] : iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF ;
    public final EObject entryRuleMBooleanParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMBooleanParameterSingleExpression = null;


        try {
            // InternalCMP.g:3982:2: (iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF )
            // InternalCMP.g:3983:2: iv_ruleMBooleanParameterSingleExpression= ruleMBooleanParameterSingleExpression EOF
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
    // InternalCMP.g:3990:1: ruleMBooleanParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) ;
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
            // InternalCMP.g:3993:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) )
            // InternalCMP.g:3994:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            {
            // InternalCMP.g:3994:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            // InternalCMP.g:3994:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'boolean' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';'
            {
            // InternalCMP.g:3994:2: ( (lv_constant_0_0= 'const' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==44) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCMP.g:3995:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalCMP.g:3995:1: (lv_constant_0_0= 'const' )
                    // InternalCMP.g:3996:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,44,FollowSets000.FOLLOW_58); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1());
                  
            }
            // InternalCMP.g:4013:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMP.g:4014:1: (lv_name_2_0= RULE_ID )
            {
            // InternalCMP.g:4014:1: (lv_name_2_0= RULE_ID )
            // InternalCMP.g:4015:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalCMP.g:4035:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:4036:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:4036:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // InternalCMP.g:4037:3: lv_defaultValue_4_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
    // InternalCMP.g:4065:1: entryRuleMStringParameterSingleExpression returns [EObject current=null] : iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF ;
    public final EObject entryRuleMStringParameterSingleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMStringParameterSingleExpression = null;


        try {
            // InternalCMP.g:4066:2: (iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF )
            // InternalCMP.g:4067:2: iv_ruleMStringParameterSingleExpression= ruleMStringParameterSingleExpression EOF
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
    // InternalCMP.g:4074:1: ruleMStringParameterSingleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) ;
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
            // InternalCMP.g:4077:28: ( ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' ) )
            // InternalCMP.g:4078:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            {
            // InternalCMP.g:4078:1: ( ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';' )
            // InternalCMP.g:4078:2: ( (lv_constant_0_0= 'const' ) )? otherlv_1= 'string' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) ) otherlv_5= ';'
            {
            // InternalCMP.g:4078:2: ( (lv_constant_0_0= 'const' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCMP.g:4079:1: (lv_constant_0_0= 'const' )
                    {
                    // InternalCMP.g:4079:1: (lv_constant_0_0= 'const' )
                    // InternalCMP.g:4080:3: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,44,FollowSets000.FOLLOW_59); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1());
                  
            }
            // InternalCMP.g:4097:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMP.g:4098:1: (lv_name_2_0= RULE_ID )
            {
            // InternalCMP.g:4098:1: (lv_name_2_0= RULE_ID )
            // InternalCMP.g:4099:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalCMP.g:4119:1: ( (lv_defaultValue_4_0= ruleMParameterValueExpression ) )
            // InternalCMP.g:4120:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            {
            // InternalCMP.g:4120:1: (lv_defaultValue_4_0= ruleMParameterValueExpression )
            // InternalCMP.g:4121:3: lv_defaultValue_4_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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


    // $ANTLR start "entryRuleMInternalComponentConnection"
    // InternalCMP.g:4149:1: entryRuleMInternalComponentConnection returns [EObject current=null] : iv_ruleMInternalComponentConnection= ruleMInternalComponentConnection EOF ;
    public final EObject entryRuleMInternalComponentConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInternalComponentConnection = null;


        try {
            // InternalCMP.g:4150:2: (iv_ruleMInternalComponentConnection= ruleMInternalComponentConnection EOF )
            // InternalCMP.g:4151:2: iv_ruleMInternalComponentConnection= ruleMInternalComponentConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInternalComponentConnectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMInternalComponentConnection=ruleMInternalComponentConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInternalComponentConnection; 
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
    // $ANTLR end "entryRuleMInternalComponentConnection"


    // $ANTLR start "ruleMInternalComponentConnection"
    // InternalCMP.g:4158:1: ruleMInternalComponentConnection returns [EObject current=null] : ( () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' (otherlv_7= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= '{' (otherlv_14= 'mapping' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? (otherlv_18= 'attribute' ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) ) )* otherlv_20= '}' )? otherlv_21= ';' ) ;
    public final EObject ruleMInternalComponentConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_attributeValueAssignments_19_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:4161:28: ( ( () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' (otherlv_7= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= '{' (otherlv_14= 'mapping' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? (otherlv_18= 'attribute' ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) ) )* otherlv_20= '}' )? otherlv_21= ';' ) )
            // InternalCMP.g:4162:1: ( () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' (otherlv_7= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= '{' (otherlv_14= 'mapping' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? (otherlv_18= 'attribute' ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) ) )* otherlv_20= '}' )? otherlv_21= ';' )
            {
            // InternalCMP.g:4162:1: ( () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' (otherlv_7= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= '{' (otherlv_14= 'mapping' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? (otherlv_18= 'attribute' ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) ) )* otherlv_20= '}' )? otherlv_21= ';' )
            // InternalCMP.g:4162:2: () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' (otherlv_7= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= '{' (otherlv_14= 'mapping' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? (otherlv_18= 'attribute' ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) ) )* otherlv_20= '}' )? otherlv_21= ';'
            {
            // InternalCMP.g:4162:2: ()
            // InternalCMP.g:4163:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMInternalComponentConnectionAccess().getMInternalComponentConnectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMInternalComponentConnectionAccess().getConnectionKeyword_1());
                  
            }
            // InternalCMP.g:4175:1: (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==60) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ID) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalCMP.g:4175:3: otherlv_2= 'this'
                    {
                    otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCMP.g:4180:6: ( ( ruleVersionedQualifiedReferenceName ) )
                    {
                    // InternalCMP.g:4180:6: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalCMP.g:4181:1: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalCMP.g:4181:1: ( ruleVersionedQualifiedReferenceName )
                    // InternalCMP.g:4182:3: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    ruleVersionedQualifiedReferenceName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_3());
                  
            }
            // InternalCMP.g:4202:1: ( (otherlv_5= RULE_ID ) )
            // InternalCMP.g:4203:1: (otherlv_5= RULE_ID )
            {
            // InternalCMP.g:4203:1: (otherlv_5= RULE_ID )
            // InternalCMP.g:4204:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getMInternalComponentConnectionAccess().getClientPortMClientPortCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,61,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMInternalComponentConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5());
                  
            }
            // InternalCMP.g:4222:1: (otherlv_7= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalCMP.g:4222:3: otherlv_7= 'this'
                    {
                    otherlv_7=(Token)match(input,60,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_6_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCMP.g:4227:6: ( ( ruleVersionedQualifiedReferenceName ) )
                    {
                    // InternalCMP.g:4227:6: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalCMP.g:4228:1: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalCMP.g:4228:1: ( ruleVersionedQualifiedReferenceName )
                    // InternalCMP.g:4229:3: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceMInternalComponentInstanceCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    ruleVersionedQualifiedReferenceName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_7());
                  
            }
            // InternalCMP.g:4249:1: ( (otherlv_10= RULE_ID ) )
            // InternalCMP.g:4250:1: (otherlv_10= RULE_ID )
            {
            // InternalCMP.g:4250:1: (otherlv_10= RULE_ID )
            // InternalCMP.g:4251:3: otherlv_10= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
              	        }
                      
            }
            otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_10, grammarAccess.getMInternalComponentConnectionAccess().getServerPortMServerPortCrossReference_8_0()); 
              	
            }

            }


            }

            // InternalCMP.g:4265:2: (otherlv_11= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= '{' (otherlv_14= 'mapping' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? (otherlv_18= 'attribute' ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) ) )* otherlv_20= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==62) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCMP.g:4265:4: otherlv_11= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= '{' (otherlv_14= 'mapping' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? (otherlv_18= 'attribute' ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) ) )* otherlv_20= '}'
                    {
                    otherlv_11=(Token)match(input,62,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getMInternalComponentConnectionAccess().getUsingKeyword_9_0());
                          
                    }
                    // InternalCMP.g:4269:1: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalCMP.g:4270:1: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalCMP.g:4270:1: ( ruleVersionedQualifiedReferenceName )
                    // InternalCMP.g:4271:3: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getConnectorMConnectorCrossReference_9_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    ruleVersionedQualifiedReferenceName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMInternalComponentConnectionAccess().getLeftCurlyBracketKeyword_9_2());
                          
                    }
                    // InternalCMP.g:4291:1: (otherlv_14= 'mapping' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==63) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalCMP.g:4291:3: otherlv_14= 'mapping' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';'
                            {
                            otherlv_14=(Token)match(input,63,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getMInternalComponentConnectionAccess().getMappingKeyword_9_3_0());
                                  
                            }
                            otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_15, grammarAccess.getMInternalComponentConnectionAccess().getColonEqualsSignKeyword_9_3_1());
                                  
                            }
                            // InternalCMP.g:4299:1: ( ( ruleVersionedQualifiedName ) )
                            // InternalCMP.g:4300:1: ( ruleVersionedQualifiedName )
                            {
                            // InternalCMP.g:4300:1: ( ruleVersionedQualifiedName )
                            // InternalCMP.g:4301:3: ruleVersionedQualifiedName
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_9_3_2_0()); 
                              	    
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

                            otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_9_3_3());
                                  
                            }

                            }
                            break;

                    }

                    // InternalCMP.g:4321:3: (otherlv_18= 'attribute' ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==28) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalCMP.g:4321:5: otherlv_18= 'attribute' ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) )
                    	    {
                    	    otherlv_18=(Token)match(input,28,FollowSets000.FOLLOW_64); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getMInternalComponentConnectionAccess().getAttributeKeyword_9_4_0());
                    	          
                    	    }
                    	    // InternalCMP.g:4325:1: ( (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment ) )
                    	    // InternalCMP.g:4326:1: (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment )
                    	    {
                    	    // InternalCMP.g:4326:1: (lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment )
                    	    // InternalCMP.g:4327:3: lv_attributeValueAssignments_19_0= ruleMParameterValueAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_9_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_attributeValueAssignments_19_0=ruleMParameterValueAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMInternalComponentConnectionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributeValueAssignments",
                    	              		lv_attributeValueAssignments_19_0, 
                    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getMInternalComponentConnectionAccess().getRightCurlyBracketKeyword_9_5());
                          
                    }

                    }
                    break;

            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_10());
                  
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
    // $ANTLR end "ruleMInternalComponentConnection"


    // $ANTLR start "entryRuleMInternalComponentPlatformSwitch"
    // InternalCMP.g:4359:1: entryRuleMInternalComponentPlatformSwitch returns [EObject current=null] : iv_ruleMInternalComponentPlatformSwitch= ruleMInternalComponentPlatformSwitch EOF ;
    public final EObject entryRuleMInternalComponentPlatformSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInternalComponentPlatformSwitch = null;


        try {
            // InternalCMP.g:4360:2: (iv_ruleMInternalComponentPlatformSwitch= ruleMInternalComponentPlatformSwitch EOF )
            // InternalCMP.g:4361:2: iv_ruleMInternalComponentPlatformSwitch= ruleMInternalComponentPlatformSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMInternalComponentPlatformSwitch=ruleMInternalComponentPlatformSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInternalComponentPlatformSwitch; 
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
    // $ANTLR end "entryRuleMInternalComponentPlatformSwitch"


    // $ANTLR start "ruleMInternalComponentPlatformSwitch"
    // InternalCMP.g:4368:1: ruleMInternalComponentPlatformSwitch returns [EObject current=null] : ( () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' otherlv_7= 'switch' otherlv_8= '{' ( (lv_cases_9_0= ruleMInternalComponentPlatformSwitchCase ) )+ otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleMInternalComponentPlatformSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_cases_9_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:4371:28: ( ( () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' otherlv_7= 'switch' otherlv_8= '{' ( (lv_cases_9_0= ruleMInternalComponentPlatformSwitchCase ) )+ otherlv_10= '}' otherlv_11= ';' ) )
            // InternalCMP.g:4372:1: ( () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' otherlv_7= 'switch' otherlv_8= '{' ( (lv_cases_9_0= ruleMInternalComponentPlatformSwitchCase ) )+ otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalCMP.g:4372:1: ( () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' otherlv_7= 'switch' otherlv_8= '{' ( (lv_cases_9_0= ruleMInternalComponentPlatformSwitchCase ) )+ otherlv_10= '}' otherlv_11= ';' )
            // InternalCMP.g:4372:2: () otherlv_1= 'connection' (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '<->' otherlv_7= 'switch' otherlv_8= '{' ( (lv_cases_9_0= ruleMInternalComponentPlatformSwitchCase ) )+ otherlv_10= '}' otherlv_11= ';'
            {
            // InternalCMP.g:4372:2: ()
            // InternalCMP.g:4373:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMInternalComponentPlatformSwitchAccess().getMInternalComponentPlatformSwitchAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMInternalComponentPlatformSwitchAccess().getConnectionKeyword_1());
                  
            }
            // InternalCMP.g:4385:1: (otherlv_2= 'this' | ( ( ruleVersionedQualifiedReferenceName ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==60) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalCMP.g:4385:3: otherlv_2= 'this'
                    {
                    otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMInternalComponentPlatformSwitchAccess().getThisKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCMP.g:4390:6: ( ( ruleVersionedQualifiedReferenceName ) )
                    {
                    // InternalCMP.g:4390:6: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalCMP.g:4391:1: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalCMP.g:4391:1: ( ruleVersionedQualifiedReferenceName )
                    // InternalCMP.g:4392:3: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    ruleVersionedQualifiedReferenceName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMInternalComponentPlatformSwitchAccess().getFullStopKeyword_3());
                  
            }
            // InternalCMP.g:4412:1: ( (otherlv_5= RULE_ID ) )
            // InternalCMP.g:4413:1: (otherlv_5= RULE_ID )
            {
            // InternalCMP.g:4413:1: (otherlv_5= RULE_ID )
            // InternalCMP.g:4414:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortMClientPortCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,61,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMInternalComponentPlatformSwitchAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,64,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMInternalComponentPlatformSwitchAccess().getSwitchKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMInternalComponentPlatformSwitchAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // InternalCMP.g:4440:1: ( (lv_cases_9_0= ruleMInternalComponentPlatformSwitchCase ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==65) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalCMP.g:4441:1: (lv_cases_9_0= ruleMInternalComponentPlatformSwitchCase )
            	    {
            	    // InternalCMP.g:4441:1: (lv_cases_9_0= ruleMInternalComponentPlatformSwitchCase )
            	    // InternalCMP.g:4442:3: lv_cases_9_0= ruleMInternalComponentPlatformSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesMInternalComponentPlatformSwitchCaseParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_67);
            	    lv_cases_9_0=ruleMInternalComponentPlatformSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMInternalComponentPlatformSwitchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_9_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentPlatformSwitchCase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMInternalComponentPlatformSwitchAccess().getRightCurlyBracketKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getMInternalComponentPlatformSwitchAccess().getSemicolonKeyword_10());
                  
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
    // $ANTLR end "ruleMInternalComponentPlatformSwitch"


    // $ANTLR start "entryRuleMInternalComponentPlatformSwitchCase"
    // InternalCMP.g:4474:1: entryRuleMInternalComponentPlatformSwitchCase returns [EObject current=null] : iv_ruleMInternalComponentPlatformSwitchCase= ruleMInternalComponentPlatformSwitchCase EOF ;
    public final EObject entryRuleMInternalComponentPlatformSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMInternalComponentPlatformSwitchCase = null;


        try {
            // InternalCMP.g:4475:2: (iv_ruleMInternalComponentPlatformSwitchCase= ruleMInternalComponentPlatformSwitchCase EOF )
            // InternalCMP.g:4476:2: iv_ruleMInternalComponentPlatformSwitchCase= ruleMInternalComponentPlatformSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchCaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMInternalComponentPlatformSwitchCase=ruleMInternalComponentPlatformSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMInternalComponentPlatformSwitchCase; 
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
    // $ANTLR end "entryRuleMInternalComponentPlatformSwitchCase"


    // $ANTLR start "ruleMInternalComponentPlatformSwitchCase"
    // InternalCMP.g:4483:1: ruleMInternalComponentPlatformSwitchCase returns [EObject current=null] : (otherlv_0= 'case' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'this' | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'attribute' ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) ) )* otherlv_16= '}' )? otherlv_17= ';' ) ;
    public final EObject ruleMInternalComponentPlatformSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_attributeValueAssignments_15_0 = null;


         enterRule(); 
            
        try {
            // InternalCMP.g:4486:28: ( (otherlv_0= 'case' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'this' | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'attribute' ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) ) )* otherlv_16= '}' )? otherlv_17= ';' ) )
            // InternalCMP.g:4487:1: (otherlv_0= 'case' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'this' | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'attribute' ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) ) )* otherlv_16= '}' )? otherlv_17= ';' )
            {
            // InternalCMP.g:4487:1: (otherlv_0= 'case' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'this' | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'attribute' ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) ) )* otherlv_16= '}' )? otherlv_17= ';' )
            // InternalCMP.g:4487:3: otherlv_0= 'case' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'this' | ( (otherlv_4= RULE_ID ) ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'attribute' ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) ) )* otherlv_16= '}' )? otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getCaseKeyword_0());
                  
            }
            // InternalCMP.g:4491:1: ( (otherlv_1= RULE_ID ) )
            // InternalCMP.g:4492:1: (otherlv_1= RULE_ID )
            {
            // InternalCMP.g:4492:1: (otherlv_1= RULE_ID )
            // InternalCMP.g:4493:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformMComponentSupportedPlatformCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,66,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonKeyword_2());
                  
            }
            // InternalCMP.g:4511:1: (otherlv_3= 'this' | ( (otherlv_4= RULE_ID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==60) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalCMP.g:4511:3: otherlv_3= 'this'
                    {
                    otherlv_3=(Token)match(input,60,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getThisKeyword_3_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalCMP.g:4516:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalCMP.g:4516:6: ( (otherlv_4= RULE_ID ) )
                    // InternalCMP.g:4517:1: (otherlv_4= RULE_ID )
                    {
                    // InternalCMP.g:4517:1: (otherlv_4= RULE_ID )
                    // InternalCMP.g:4518:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceMInternalComponentInstanceCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getFullStopKeyword_4());
                  
            }
            // InternalCMP.g:4536:1: ( (otherlv_6= RULE_ID ) )
            // InternalCMP.g:4537:1: (otherlv_6= RULE_ID )
            {
            // InternalCMP.g:4537:1: (otherlv_6= RULE_ID )
            // InternalCMP.g:4538:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortMServerPortCrossReference_5_0()); 
              	
            }

            }


            }

            // InternalCMP.g:4552:2: (otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'attribute' ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) ) )* otherlv_16= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==62) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCMP.g:4552:4: otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'attribute' ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) ) )* otherlv_16= '}'
                    {
                    otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getUsingKeyword_6_0());
                          
                    }
                    // InternalCMP.g:4556:1: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalCMP.g:4557:1: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalCMP.g:4557:1: ( ruleVersionedQualifiedReferenceName )
                    // InternalCMP.g:4558:3: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorMConnectorCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    ruleVersionedQualifiedReferenceName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getLeftCurlyBracketKeyword_6_2());
                          
                    }
                    // InternalCMP.g:4578:1: (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==63) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalCMP.g:4578:3: otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';'
                            {
                            otherlv_10=(Token)match(input,63,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getMappingKeyword_6_3_0());
                                  
                            }
                            otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonEqualsSignKeyword_6_3_1());
                                  
                            }
                            // InternalCMP.g:4586:1: ( ( ruleVersionedQualifiedName ) )
                            // InternalCMP.g:4587:1: ( ruleVersionedQualifiedName )
                            {
                            // InternalCMP.g:4587:1: ( ruleVersionedQualifiedName )
                            // InternalCMP.g:4588:3: ruleVersionedQualifiedName
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_6_3_2_0()); 
                              	    
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

                            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_6_3_3());
                                  
                            }

                            }
                            break;

                    }

                    // InternalCMP.g:4608:3: (otherlv_14= 'attribute' ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==28) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalCMP.g:4608:5: otherlv_14= 'attribute' ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) )
                    	    {
                    	    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_64); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeKeyword_6_4_0());
                    	          
                    	    }
                    	    // InternalCMP.g:4612:1: ( (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment ) )
                    	    // InternalCMP.g:4613:1: (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment )
                    	    {
                    	    // InternalCMP.g:4613:1: (lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment )
                    	    // InternalCMP.g:4614:3: lv_attributeValueAssignments_15_0= ruleMParameterValueAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_attributeValueAssignments_15_0=ruleMParameterValueAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributeValueAssignments",
                    	              		lv_attributeValueAssignments_15_0, 
                    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getRightCurlyBracketKeyword_6_5());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMInternalComponentPlatformSwitchCase"


    // $ANTLR start "entryRuleComponentSupportedPlatform"
    // InternalCMP.g:4646:1: entryRuleComponentSupportedPlatform returns [EObject current=null] : iv_ruleComponentSupportedPlatform= ruleComponentSupportedPlatform EOF ;
    public final EObject entryRuleComponentSupportedPlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSupportedPlatform = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5()
        		);
        	
        try {
            // InternalCMP.g:4652:2: (iv_ruleComponentSupportedPlatform= ruleComponentSupportedPlatform EOF )
            // InternalCMP.g:4653:2: iv_ruleComponentSupportedPlatform= ruleComponentSupportedPlatform EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentSupportedPlatformRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComponentSupportedPlatform=ruleComponentSupportedPlatform();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentSupportedPlatform; 
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
    // $ANTLR end "entryRuleComponentSupportedPlatform"


    // $ANTLR start "ruleComponentSupportedPlatform"
    // InternalCMP.g:4663:1: ruleComponentSupportedPlatform returns [EObject current=null] : ( () otherlv_1= 'supported' otherlv_2= 'platform' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?) ) ) otherlv_69= '}' otherlv_70= ';' ) ;
    public final EObject ruleComponentSupportedPlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
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
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        EObject lv_attributeValueAssignments_44_0 = null;

        EObject lv_attributes_49_0 = null;

        EObject lv_internalComponents_61_0 = null;

        EObject lv_connections_66_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5()
        		);
            
        try {
            // InternalCMP.g:4669:28: ( ( () otherlv_1= 'supported' otherlv_2= 'platform' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?) ) ) otherlv_69= '}' otherlv_70= ';' ) )
            // InternalCMP.g:4670:1: ( () otherlv_1= 'supported' otherlv_2= 'platform' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?) ) ) otherlv_69= '}' otherlv_70= ';' )
            {
            // InternalCMP.g:4670:1: ( () otherlv_1= 'supported' otherlv_2= 'platform' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?) ) ) otherlv_69= '}' otherlv_70= ';' )
            // InternalCMP.g:4670:2: () otherlv_1= 'supported' otherlv_2= 'platform' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?) ) ) otherlv_69= '}' otherlv_70= ';'
            {
            // InternalCMP.g:4670:2: ()
            // InternalCMP.g:4671:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getComponentSupportedPlatformAccess().getMComponentSupportedPlatformAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComponentSupportedPlatformAccess().getSupportedKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComponentSupportedPlatformAccess().getPlatformKeyword_2());
                  
            }
            // InternalCMP.g:4687:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalCMP.g:4688:1: (lv_name_3_0= RULE_ID )
            {
            // InternalCMP.g:4688:1: (lv_name_3_0= RULE_ID )
            // InternalCMP.g:4689:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getComponentSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalCMP.g:4709:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?) ) )
            // InternalCMP.g:4711:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalCMP.g:4711:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?) )
            // InternalCMP.g:4712:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
            // InternalCMP.g:4715:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?)
            // InternalCMP.g:4716:3: ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+ {...}?
            {
            // InternalCMP.g:4716:3: ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=13;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // InternalCMP.g:4718:4: ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:4718:4: ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) )
            	    // InternalCMP.g:4719:5: {...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalCMP.g:4719:123: ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) )
            	    // InternalCMP.g:4720:6: ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0);
            	    // InternalCMP.g:4723:6: ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) )
            	    // InternalCMP.g:4723:7: {...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:4723:16: (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' )
            	    // InternalCMP.g:4723:18: otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';'
            	    {
            	    otherlv_6=(Token)match(input,68,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getComponentSupportedPlatformAccess().getOsapiKeyword_5_0_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1());
            	          
            	    }
            	    // InternalCMP.g:4731:1: (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) )
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==69) ) {
            	        alt69=1;
            	    }
            	    else if ( (LA69_0==RULE_ID) ) {
            	        alt69=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 69, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // InternalCMP.g:4731:3: otherlv_8= 'any'
            	            {
            	            otherlv_8=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_0_2_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMP.g:4736:6: ( ( ruleVersionedQualifiedName ) )
            	            {
            	            // InternalCMP.g:4736:6: ( ( ruleVersionedQualifiedName ) )
            	            // InternalCMP.g:4737:1: ( ruleVersionedQualifiedName )
            	            {
            	            // InternalCMP.g:4737:1: ( ruleVersionedQualifiedName )
            	            // InternalCMP.g:4738:3: ruleVersionedQualifiedName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              		  /* */ 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              			if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	              	        }
            	                      
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); 
            	              	    
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


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCMP.g:4765:4: ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:4765:4: ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) )
            	    // InternalCMP.g:4766:5: {...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalCMP.g:4766:123: ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) )
            	    // InternalCMP.g:4767:6: ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1);
            	    // InternalCMP.g:4770:6: ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) )
            	    // InternalCMP.g:4770:7: {...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:4770:16: (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' )
            	    // InternalCMP.g:4770:18: otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';'
            	    {
            	    otherlv_11=(Token)match(input,70,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getComponentSupportedPlatformAccess().getOsKeyword_5_1_0());
            	          
            	    }
            	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1());
            	          
            	    }
            	    // InternalCMP.g:4778:1: (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) )
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==69) ) {
            	        alt70=1;
            	    }
            	    else if ( (LA70_0==RULE_ID) ) {
            	        alt70=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 70, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalCMP.g:4778:3: otherlv_13= 'any'
            	            {
            	            otherlv_13=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_13, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_1_2_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMP.g:4783:6: ( ( ruleVersionedQualifiedName ) )
            	            {
            	            // InternalCMP.g:4783:6: ( ( ruleVersionedQualifiedName ) )
            	            // InternalCMP.g:4784:1: ( ruleVersionedQualifiedName )
            	            {
            	            // InternalCMP.g:4784:1: ( ruleVersionedQualifiedName )
            	            // InternalCMP.g:4785:3: ruleVersionedQualifiedName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              		  /* */ 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              			if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	              	        }
            	                      
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); 
            	              	    
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


            	            }
            	            break;

            	    }

            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_1_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCMP.g:4812:4: ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:4812:4: ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) )
            	    // InternalCMP.g:4813:5: {...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalCMP.g:4813:123: ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) )
            	    // InternalCMP.g:4814:6: ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2);
            	    // InternalCMP.g:4817:6: ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) )
            	    // InternalCMP.g:4817:7: {...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:4817:16: (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' )
            	    // InternalCMP.g:4817:18: otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';'
            	    {
            	    otherlv_16=(Token)match(input,71,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getComponentSupportedPlatformAccess().getArchitectureKeyword_5_2_0());
            	          
            	    }
            	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1());
            	          
            	    }
            	    // InternalCMP.g:4825:1: (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==69) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==RULE_ID) ) {
            	        alt71=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 71, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // InternalCMP.g:4825:3: otherlv_18= 'any'
            	            {
            	            otherlv_18=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_18, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_2_2_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMP.g:4830:6: ( ( ruleVersionedQualifiedName ) )
            	            {
            	            // InternalCMP.g:4830:6: ( ( ruleVersionedQualifiedName ) )
            	            // InternalCMP.g:4831:1: ( ruleVersionedQualifiedName )
            	            {
            	            // InternalCMP.g:4831:1: ( ruleVersionedQualifiedName )
            	            // InternalCMP.g:4832:3: ruleVersionedQualifiedName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              		  /* */ 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              			if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	              	        }
            	                      
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); 
            	              	    
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


            	            }
            	            break;

            	    }

            	    otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_2_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCMP.g:4859:4: ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:4859:4: ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) )
            	    // InternalCMP.g:4860:5: {...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalCMP.g:4860:123: ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) )
            	    // InternalCMP.g:4861:6: ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3);
            	    // InternalCMP.g:4864:6: ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) )
            	    // InternalCMP.g:4864:7: {...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:4864:16: (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' )
            	    // InternalCMP.g:4864:18: otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';'
            	    {
            	    otherlv_21=(Token)match(input,72,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getComponentSupportedPlatformAccess().getCompilerKeyword_5_3_0());
            	          
            	    }
            	    otherlv_22=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1());
            	          
            	    }
            	    // InternalCMP.g:4872:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalCMP.g:4873:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalCMP.g:4873:1: ( ruleVersionedQualifiedName )
            	    // InternalCMP.g:4874:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); 
            	      	    
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

            	    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_24, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_3_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCMP.g:4901:4: ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:4901:4: ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) )
            	    // InternalCMP.g:4902:5: {...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalCMP.g:4902:123: ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) )
            	    // InternalCMP.g:4903:6: ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4);
            	    // InternalCMP.g:4906:6: ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) )
            	    // InternalCMP.g:4906:7: {...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:4906:16: (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' )
            	    // InternalCMP.g:4906:18: otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';'
            	    {
            	    otherlv_25=(Token)match(input,73,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0());
            	          
            	    }
            	    otherlv_26=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_26, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1());
            	          
            	    }
            	    // InternalCMP.g:4914:1: (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) )
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==69) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==RULE_ID) ) {
            	        alt72=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 72, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalCMP.g:4914:3: otherlv_27= 'any'
            	            {
            	            otherlv_27=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_27, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_4_2_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMP.g:4919:6: ( ( ruleVersionedQualifiedName ) )
            	            {
            	            // InternalCMP.g:4919:6: ( ( ruleVersionedQualifiedName ) )
            	            // InternalCMP.g:4920:1: ( ruleVersionedQualifiedName )
            	            {
            	            // InternalCMP.g:4920:1: ( ruleVersionedQualifiedName )
            	            // InternalCMP.g:4921:3: ruleVersionedQualifiedName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              		  /* */ 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              			if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	              	        }
            	                      
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); 
            	              	    
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


            	            }
            	            break;

            	    }

            	    otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_4_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalCMP.g:4948:4: ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:4948:4: ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) )
            	    // InternalCMP.g:4949:5: {...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalCMP.g:4949:123: ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) )
            	    // InternalCMP.g:4950:6: ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5);
            	    // InternalCMP.g:4953:6: ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) )
            	    // InternalCMP.g:4953:7: {...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:4953:16: (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' )
            	    // InternalCMP.g:4953:18: otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';'
            	    {
            	    otherlv_30=(Token)match(input,74,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_30, grammarAccess.getComponentSupportedPlatformAccess().getBoardKeyword_5_5_0());
            	          
            	    }
            	    otherlv_31=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1());
            	          
            	    }
            	    // InternalCMP.g:4961:1: (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) )
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==69) ) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==RULE_ID) ) {
            	        alt73=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 73, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalCMP.g:4961:3: otherlv_32= 'any'
            	            {
            	            otherlv_32=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_32, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_5_2_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMP.g:4966:6: ( ( ruleVersionedQualifiedName ) )
            	            {
            	            // InternalCMP.g:4966:6: ( ( ruleVersionedQualifiedName ) )
            	            // InternalCMP.g:4967:1: ( ruleVersionedQualifiedName )
            	            {
            	            // InternalCMP.g:4967:1: ( ruleVersionedQualifiedName )
            	            // InternalCMP.g:4968:3: ruleVersionedQualifiedName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              		  /* */ 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              			if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	              	        }
            	                      
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); 
            	              	    
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


            	            }
            	            break;

            	    }

            	    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_34, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_5_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalCMP.g:4995:4: ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:4995:4: ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) )
            	    // InternalCMP.g:4996:5: {...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // InternalCMP.g:4996:123: ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) )
            	    // InternalCMP.g:4997:6: ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6);
            	    // InternalCMP.g:5000:6: ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) )
            	    // InternalCMP.g:5000:7: {...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:5000:16: (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' )
            	    // InternalCMP.g:5000:18: otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';'
            	    {
            	    otherlv_35=(Token)match(input,34,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_35, grammarAccess.getComponentSupportedPlatformAccess().getRequiresKeyword_5_6_0());
            	          
            	    }
            	    otherlv_36=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_36, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1());
            	          
            	    }
            	    // InternalCMP.g:5008:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalCMP.g:5009:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalCMP.g:5009:1: ( ruleVersionedQualifiedName )
            	    // InternalCMP.g:5010:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalCMP.g:5026:2: (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==22) ) {
            	            alt74=1;
            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // InternalCMP.g:5026:4: otherlv_38= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_38=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_38, grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_6_3_0());
            	    	          
            	    	    }
            	    	    // InternalCMP.g:5030:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalCMP.g:5031:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalCMP.g:5031:1: ( ruleVersionedQualifiedName )
            	    	    // InternalCMP.g:5032:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_28);
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
            	    	    break loop74;
            	        }
            	    } while (true);

            	    otherlv_40=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_40, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_6_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalCMP.g:5059:4: ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:5059:4: ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) )
            	    // InternalCMP.g:5060:5: {...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7)");
            	    }
            	    // InternalCMP.g:5060:123: ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) )
            	    // InternalCMP.g:5061:6: ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7);
            	    // InternalCMP.g:5064:6: ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) )
            	    // InternalCMP.g:5064:7: {...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:5064:16: (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' )
            	    // InternalCMP.g:5064:18: otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';'
            	    {
            	    otherlv_41=(Token)match(input,28,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_41, grammarAccess.getComponentSupportedPlatformAccess().getAttributeKeyword_5_7_0());
            	          
            	    }
            	    otherlv_42=(Token)match(input,29,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_42, grammarAccess.getComponentSupportedPlatformAccess().getValuesKeyword_5_7_1());
            	          
            	    }
            	    otherlv_43=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_43, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2());
            	          
            	    }
            	    // InternalCMP.g:5076:1: ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )*
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==28) ) {
            	            alt75=1;
            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // InternalCMP.g:5077:1: (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment )
            	    	    {
            	    	    // InternalCMP.g:5077:1: (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment )
            	    	    // InternalCMP.g:5078:3: lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_7_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_22);
            	    	    lv_attributeValueAssignments_44_0=ruleMParameterValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getComponentSupportedPlatformRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributeValueAssignments",
            	    	              		lv_attributeValueAssignments_44_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop75;
            	        }
            	    } while (true);

            	    otherlv_45=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_45, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4());
            	          
            	    }
            	    otherlv_46=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_46, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_7_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalCMP.g:5109:4: ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:5109:4: ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) )
            	    // InternalCMP.g:5110:5: {...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8)");
            	    }
            	    // InternalCMP.g:5110:123: ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) )
            	    // InternalCMP.g:5111:6: ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8);
            	    // InternalCMP.g:5114:6: ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) )
            	    // InternalCMP.g:5114:7: {...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:5114:16: (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' )
            	    // InternalCMP.g:5114:18: otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';'
            	    {
            	    otherlv_47=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_47, grammarAccess.getComponentSupportedPlatformAccess().getAttributesKeyword_5_8_0());
            	          
            	    }
            	    otherlv_48=(Token)match(input,23,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_48, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_1());
            	          
            	    }
            	    // InternalCMP.g:5122:1: ( (lv_attributes_49_0= ruleMParameter ) )+
            	    int cnt76=0;
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( ((LA76_0>=44 && LA76_0<=45)||(LA76_0>=47 && LA76_0<=48)||(LA76_0>=57 && LA76_0<=58)) ) {
            	            alt76=1;
            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // InternalCMP.g:5123:1: (lv_attributes_49_0= ruleMParameter )
            	    	    {
            	    	    // InternalCMP.g:5123:1: (lv_attributes_49_0= ruleMParameter )
            	    	    // InternalCMP.g:5124:3: lv_attributes_49_0= ruleMParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getAttributesMParameterParserRuleCall_5_8_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_20);
            	    	    lv_attributes_49_0=ruleMParameter();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getComponentSupportedPlatformRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributes",
            	    	              		lv_attributes_49_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameter");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt76 >= 1 ) break loop76;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(76, input);
            	                throw eee;
            	        }
            	        cnt76++;
            	    } while (true);

            	    otherlv_50=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_50, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_3());
            	          
            	    }
            	    otherlv_51=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_51, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_8_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalCMP.g:5155:4: ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:5155:4: ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) )
            	    // InternalCMP.g:5156:5: {...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9)");
            	    }
            	    // InternalCMP.g:5156:123: ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) )
            	    // InternalCMP.g:5157:6: ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9);
            	    // InternalCMP.g:5160:6: ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) )
            	    // InternalCMP.g:5160:7: {...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:5160:16: (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' )
            	    // InternalCMP.g:5160:18: otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';'
            	    {
            	    otherlv_52=(Token)match(input,32,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_52, grammarAccess.getComponentSupportedPlatformAccess().getLanguagesKeyword_5_9_0());
            	          
            	    }
            	    otherlv_53=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_53, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_9_1());
            	          
            	    }
            	    // InternalCMP.g:5168:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalCMP.g:5169:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalCMP.g:5169:1: ( ruleVersionedQualifiedName )
            	    // InternalCMP.g:5170:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalCMP.g:5186:2: (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==22) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalCMP.g:5186:4: otherlv_55= ',' ( ( ruleVersionedQualifiedName ) )
            	    	    {
            	    	    otherlv_55=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_55, grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_9_3_0());
            	    	          
            	    	    }
            	    	    // InternalCMP.g:5190:1: ( ( ruleVersionedQualifiedName ) )
            	    	    // InternalCMP.g:5191:1: ( ruleVersionedQualifiedName )
            	    	    {
            	    	    // InternalCMP.g:5191:1: ( ruleVersionedQualifiedName )
            	    	    // InternalCMP.g:5192:3: ruleVersionedQualifiedName
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_28);
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
            	    	    break loop77;
            	        }
            	    } while (true);

            	    otherlv_57=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_57, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_9_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalCMP.g:5219:4: ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:5219:4: ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) )
            	    // InternalCMP.g:5220:5: {...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10)");
            	    }
            	    // InternalCMP.g:5220:124: ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) )
            	    // InternalCMP.g:5221:6: ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10);
            	    // InternalCMP.g:5224:6: ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) )
            	    // InternalCMP.g:5224:7: {...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:5224:16: (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' )
            	    // InternalCMP.g:5224:18: otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';'
            	    {
            	    otherlv_58=(Token)match(input,37,FollowSets000.FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_58, grammarAccess.getComponentSupportedPlatformAccess().getSubcomponentKeyword_5_10_0());
            	          
            	    }
            	    otherlv_59=(Token)match(input,38,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_59, grammarAccess.getComponentSupportedPlatformAccess().getInstancesKeyword_5_10_1());
            	          
            	    }
            	    otherlv_60=(Token)match(input,23,FollowSets000.FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_60, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_10_2());
            	          
            	    }
            	    // InternalCMP.g:5236:1: ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+
            	    int cnt78=0;
            	    loop78:
            	    do {
            	        int alt78=2;
            	        int LA78_0 = input.LA(1);

            	        if ( ((LA78_0>=40 && LA78_0<=41)) ) {
            	            alt78=1;
            	        }


            	        switch (alt78) {
            	    	case 1 :
            	    	    // InternalCMP.g:5237:1: (lv_internalComponents_61_0= ruleMInternalComponentInstance )
            	    	    {
            	    	    // InternalCMP.g:5237:1: (lv_internalComponents_61_0= ruleMInternalComponentInstance )
            	    	    // InternalCMP.g:5238:3: lv_internalComponents_61_0= ruleMInternalComponentInstance
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_5_10_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_34);
            	    	    lv_internalComponents_61_0=ruleMInternalComponentInstance();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getComponentSupportedPlatformRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"internalComponents",
            	    	              		lv_internalComponents_61_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentInstance");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt78 >= 1 ) break loop78;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(78, input);
            	                throw eee;
            	        }
            	        cnt78++;
            	    } while (true);

            	    otherlv_62=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_62, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_10_4());
            	          
            	    }
            	    otherlv_63=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_63, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_10_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalCMP.g:5269:4: ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) )
            	    {
            	    // InternalCMP.g:5269:4: ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) )
            	    // InternalCMP.g:5270:5: {...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11)");
            	    }
            	    // InternalCMP.g:5270:124: ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) )
            	    // InternalCMP.g:5271:6: ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11);
            	    // InternalCMP.g:5274:6: ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) )
            	    // InternalCMP.g:5274:7: {...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "true");
            	    }
            	    // InternalCMP.g:5274:16: (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' )
            	    // InternalCMP.g:5274:18: otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';'
            	    {
            	    otherlv_64=(Token)match(input,39,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_64, grammarAccess.getComponentSupportedPlatformAccess().getConnectionsKeyword_5_11_0());
            	          
            	    }
            	    otherlv_65=(Token)match(input,23,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_65, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_11_1());
            	          
            	    }
            	    // InternalCMP.g:5282:1: ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+
            	    int cnt79=0;
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==59) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // InternalCMP.g:5283:1: (lv_connections_66_0= ruleMInternalComponentConnection )
            	    	    {
            	    	    // InternalCMP.g:5283:1: (lv_connections_66_0= ruleMInternalComponentConnection )
            	    	    // InternalCMP.g:5284:3: lv_connections_66_0= ruleMInternalComponentConnection
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsMInternalComponentConnectionParserRuleCall_5_11_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_36);
            	    	    lv_connections_66_0=ruleMInternalComponentConnection();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getComponentSupportedPlatformRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"connections",
            	    	              		lv_connections_66_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentConnection");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt79 >= 1 ) break loop79;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(79, input);
            	                throw eee;
            	        }
            	        cnt79++;
            	    } while (true);

            	    otherlv_67=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_67, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_11_3());
            	          
            	    }
            	    otherlv_68=(Token)match(input,13,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_68, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_11_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleComponentSupportedPlatform", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());

            }

            otherlv_69=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_69, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_70=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_70, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleComponentSupportedPlatform"


    // $ANTLR start "ruleMParameterValueExpressionOperators"
    // InternalCMP.g:5342:1: ruleMParameterValueExpressionOperators returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleMParameterValueExpressionOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalCMP.g:5344:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalCMP.g:5345:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalCMP.g:5345:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==75) ) {
                alt81=1;
            }
            else if ( (LA81_0==51) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalCMP.g:5345:2: (enumLiteral_0= '+' )
                    {
                    // InternalCMP.g:5345:2: (enumLiteral_0= '+' )
                    // InternalCMP.g:5345:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCMP.g:5351:6: (enumLiteral_1= '-' )
                    {
                    // InternalCMP.g:5351:6: (enumLiteral_1= '-' )
                    // InternalCMP.g:5351:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCMP.g:5361:1: ruleMParameterValueTERMOperators returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMParameterValueTERMOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalCMP.g:5363:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalCMP.g:5364:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalCMP.g:5364:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==76) ) {
                alt82=1;
            }
            else if ( (LA82_0==77) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalCMP.g:5364:2: (enumLiteral_0= '*' )
                    {
                    // InternalCMP.g:5364:2: (enumLiteral_0= '*' )
                    // InternalCMP.g:5364:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCMP.g:5370:6: (enumLiteral_1= '/' )
                    {
                    // InternalCMP.g:5370:6: (enumLiteral_1= '/' )
                    // InternalCMP.g:5370:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred15_InternalCMP
    public final void synpred15_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_version_14_0 = null;


        // InternalCMP.g:676:4: ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) )
        // InternalCMP.g:676:4: ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalCMP.g:676:4: ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) )
        // InternalCMP.g:677:5: {...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0)");
        }
        // InternalCMP.g:677:115: ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) )
        // InternalCMP.g:678:6: ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0);
        // InternalCMP.g:681:6: ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) )
        // InternalCMP.g:681:7: {...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalCMP", "true");
        }
        // InternalCMP.g:681:16: (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' )
        // InternalCMP.g:681:18: otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalCMP.g:689:1: ( (lv_version_14_0= ruleVersion ) )
        // InternalCMP.g:690:1: (lv_version_14_0= ruleVersion )
        {
        // InternalCMP.g:690:1: (lv_version_14_0= ruleVersion )
        // InternalCMP.g:691:3: lv_version_14_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_4);
        lv_version_14_0=ruleVersion();

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
    // $ANTLR end synpred15_InternalCMP

    // $ANTLR start synpred17_InternalCMP
    public final void synpred17_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_attributes_18_0 = null;


        // InternalCMP.g:718:4: ( ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )
        // InternalCMP.g:718:4: ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) )
        {
        // InternalCMP.g:718:4: ({...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) )
        // InternalCMP.g:719:5: {...}? => ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred17_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1)");
        }
        // InternalCMP.g:719:115: ( ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) ) )
        // InternalCMP.g:720:6: ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1);
        // InternalCMP.g:723:6: ({...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' ) )
        // InternalCMP.g:723:7: {...}? => (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred17_InternalCMP", "true");
        }
        // InternalCMP.g:723:16: (otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';' )
        // InternalCMP.g:723:18: otherlv_16= 'attributes' otherlv_17= '{' ( (lv_attributes_18_0= ruleMParameter ) )+ otherlv_19= '}' otherlv_20= ';'
        {
        otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_19); if (state.failed) return ;
        // InternalCMP.g:731:1: ( (lv_attributes_18_0= ruleMParameter ) )+
        int cnt86=0;
        loop86:
        do {
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=44 && LA86_0<=45)||(LA86_0>=47 && LA86_0<=48)||(LA86_0>=57 && LA86_0<=58)) ) {
                alt86=1;
            }


            switch (alt86) {
        	case 1 :
        	    // InternalCMP.g:732:1: (lv_attributes_18_0= ruleMParameter )
        	    {
        	    // InternalCMP.g:732:1: (lv_attributes_18_0= ruleMParameter )
        	    // InternalCMP.g:733:3: lv_attributes_18_0= ruleMParameter
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getAttributesMParameterParserRuleCall_8_1_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_20);
        	    lv_attributes_18_0=ruleMParameter();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt86 >= 1 ) break loop86;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(86, input);
                    throw eee;
            }
            cnt86++;
        } while (true);

        otherlv_19=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalCMP

    // $ANTLR start synpred19_InternalCMP
    public final void synpred19_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_attributeValueAssignments_24_0 = null;


        // InternalCMP.g:764:4: ( ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) ) )
        // InternalCMP.g:764:4: ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) )
        {
        // InternalCMP.g:764:4: ({...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) ) )
        // InternalCMP.g:765:5: {...}? => ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred19_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2)");
        }
        // InternalCMP.g:765:115: ( ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) ) )
        // InternalCMP.g:766:6: ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2);
        // InternalCMP.g:769:6: ({...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' ) )
        // InternalCMP.g:769:7: {...}? => (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred19_InternalCMP", "true");
        }
        // InternalCMP.g:769:16: (otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';' )
        // InternalCMP.g:769:18: otherlv_21= 'attribute' otherlv_22= 'values' otherlv_23= '{' ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )* otherlv_25= '}' otherlv_26= ';'
        {
        otherlv_21=(Token)match(input,28,FollowSets000.FOLLOW_21); if (state.failed) return ;
        otherlv_22=(Token)match(input,29,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return ;
        // InternalCMP.g:781:1: ( (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment ) )*
        loop87:
        do {
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==28) ) {
                alt87=1;
            }


            switch (alt87) {
        	case 1 :
        	    // InternalCMP.g:782:1: (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment )
        	    {
        	    // InternalCMP.g:782:1: (lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment )
        	    // InternalCMP.g:783:3: lv_attributeValueAssignments_24_0= ruleMParameterValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_2_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_22);
        	    lv_attributeValueAssignments_24_0=ruleMParameterValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop87;
            }
        } while (true);

        otherlv_25=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred19_InternalCMP

    // $ANTLR start synpred21_InternalCMP
    public final void synpred21_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_externalPorts_30_0 = null;


        // InternalCMP.g:814:4: ( ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )
        // InternalCMP.g:814:4: ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
        {
        // InternalCMP.g:814:4: ({...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
        // InternalCMP.g:815:5: {...}? => ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred21_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3)");
        }
        // InternalCMP.g:815:115: ( ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
        // InternalCMP.g:816:6: ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3);
        // InternalCMP.g:819:6: ({...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' ) )
        // InternalCMP.g:819:7: {...}? => (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred21_InternalCMP", "true");
        }
        // InternalCMP.g:819:16: (otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';' )
        // InternalCMP.g:819:18: otherlv_27= 'external' otherlv_28= 'ports' otherlv_29= '{' ( (lv_externalPorts_30_0= ruleMPort ) )+ otherlv_31= '}' otherlv_32= ';'
        {
        otherlv_27=(Token)match(input,30,FollowSets000.FOLLOW_23); if (state.failed) return ;
        otherlv_28=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_29=(Token)match(input,23,FollowSets000.FOLLOW_24); if (state.failed) return ;
        // InternalCMP.g:831:1: ( (lv_externalPorts_30_0= ruleMPort ) )+
        int cnt88=0;
        loop88:
        do {
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=42 && LA88_0<=43)) ) {
                alt88=1;
            }


            switch (alt88) {
        	case 1 :
        	    // InternalCMP.g:832:1: (lv_externalPorts_30_0= ruleMPort )
        	    {
        	    // InternalCMP.g:832:1: (lv_externalPorts_30_0= ruleMPort )
        	    // InternalCMP.g:833:3: lv_externalPorts_30_0= ruleMPort
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getExternalPortsMPortParserRuleCall_8_3_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_25);
        	    lv_externalPorts_30_0=ruleMPort();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt88 >= 1 ) break loop88;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(88, input);
                    throw eee;
            }
            cnt88++;
        } while (true);

        otherlv_31=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalCMP

    // $ANTLR start synpred24_InternalCMP
    public final void synpred24_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_version_14_0 = null;


        // InternalCMP.g:1043:4: ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) )
        // InternalCMP.g:1043:4: ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalCMP.g:1043:4: ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) )
        // InternalCMP.g:1044:5: {...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred24_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0)");
        }
        // InternalCMP.g:1044:107: ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) )
        // InternalCMP.g:1045:6: ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0);
        // InternalCMP.g:1048:6: ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) )
        // InternalCMP.g:1048:7: {...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred24_InternalCMP", "true");
        }
        // InternalCMP.g:1048:16: (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' )
        // InternalCMP.g:1048:18: otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalCMP.g:1056:1: ( (lv_version_14_0= ruleVersion ) )
        // InternalCMP.g:1057:1: (lv_version_14_0= ruleVersion )
        {
        // InternalCMP.g:1057:1: (lv_version_14_0= ruleVersion )
        // InternalCMP.g:1058:3: lv_version_14_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_4);
        lv_version_14_0=ruleVersion();

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
    // $ANTLR end synpred24_InternalCMP

    // $ANTLR start synpred26_InternalCMP
    public final void synpred26_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;

        // InternalCMP.g:1085:4: ( ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) )
        // InternalCMP.g:1085:4: ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) )
        {
        // InternalCMP.g:1085:4: ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) )
        // InternalCMP.g:1086:5: {...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred26_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1)");
        }
        // InternalCMP.g:1086:107: ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) )
        // InternalCMP.g:1087:6: ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1);
        // InternalCMP.g:1090:6: ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) )
        // InternalCMP.g:1090:7: {...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred26_InternalCMP", "true");
        }
        // InternalCMP.g:1090:16: (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' )
        // InternalCMP.g:1090:18: otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';'
        {
        otherlv_16=(Token)match(input,32,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalCMP.g:1098:1: ( ( ruleVersionedQualifiedName ) )
        // InternalCMP.g:1099:1: ( ruleVersionedQualifiedName )
        {
        // InternalCMP.g:1099:1: ( ruleVersionedQualifiedName )
        // InternalCMP.g:1100:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_28);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCMP.g:1116:2: (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop90:
        do {
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==22) ) {
                alt90=1;
            }


            switch (alt90) {
        	case 1 :
        	    // InternalCMP.g:1116:4: otherlv_19= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalCMP.g:1120:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalCMP.g:1121:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalCMP.g:1121:1: ( ruleVersionedQualifiedName )
        	    // InternalCMP.g:1122:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_28);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop90;
            }
        } while (true);

        otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred26_InternalCMP

    // $ANTLR start synpred28_InternalCMP
    public final void synpred28_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_attributes_24_0 = null;


        // InternalCMP.g:1149:4: ( ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) )
        // InternalCMP.g:1149:4: ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) )
        {
        // InternalCMP.g:1149:4: ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) )
        // InternalCMP.g:1150:5: {...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred28_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2)");
        }
        // InternalCMP.g:1150:107: ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) )
        // InternalCMP.g:1151:6: ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2);
        // InternalCMP.g:1154:6: ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) )
        // InternalCMP.g:1154:7: {...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred28_InternalCMP", "true");
        }
        // InternalCMP.g:1154:16: (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' )
        // InternalCMP.g:1154:18: otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';'
        {
        otherlv_22=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_19); if (state.failed) return ;
        // InternalCMP.g:1162:1: ( (lv_attributes_24_0= ruleMParameter ) )+
        int cnt91=0;
        loop91:
        do {
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=44 && LA91_0<=45)||(LA91_0>=47 && LA91_0<=48)||(LA91_0>=57 && LA91_0<=58)) ) {
                alt91=1;
            }


            switch (alt91) {
        	case 1 :
        	    // InternalCMP.g:1163:1: (lv_attributes_24_0= ruleMParameter )
        	    {
        	    // InternalCMP.g:1163:1: (lv_attributes_24_0= ruleMParameter )
        	    // InternalCMP.g:1164:3: lv_attributes_24_0= ruleMParameter
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMComponentAccess().getAttributesMParameterParserRuleCall_8_2_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_20);
        	    lv_attributes_24_0=ruleMParameter();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt91 >= 1 ) break loop91;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(91, input);
                    throw eee;
            }
            cnt91++;
        } while (true);

        otherlv_25=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred28_InternalCMP

    // $ANTLR start synpred30_InternalCMP
    public final void synpred30_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_attributeValueAssignments_30_0 = null;


        // InternalCMP.g:1195:4: ( ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) )
        // InternalCMP.g:1195:4: ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) )
        {
        // InternalCMP.g:1195:4: ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) )
        // InternalCMP.g:1196:5: {...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred30_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3)");
        }
        // InternalCMP.g:1196:107: ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) )
        // InternalCMP.g:1197:6: ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3);
        // InternalCMP.g:1200:6: ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) )
        // InternalCMP.g:1200:7: {...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred30_InternalCMP", "true");
        }
        // InternalCMP.g:1200:16: (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' )
        // InternalCMP.g:1200:18: otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';'
        {
        otherlv_27=(Token)match(input,28,FollowSets000.FOLLOW_21); if (state.failed) return ;
        otherlv_28=(Token)match(input,29,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_29=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return ;
        // InternalCMP.g:1212:1: ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )*
        loop92:
        do {
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==28) ) {
                alt92=1;
            }


            switch (alt92) {
        	case 1 :
        	    // InternalCMP.g:1213:1: (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment )
        	    {
        	    // InternalCMP.g:1213:1: (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment )
        	    // InternalCMP.g:1214:3: lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_3_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_22);
        	    lv_attributeValueAssignments_30_0=ruleMParameterValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop92;
            }
        } while (true);

        otherlv_31=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalCMP

    // $ANTLR start synpred32_InternalCMP
    public final void synpred32_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        EObject lv_externalPorts_36_0 = null;


        // InternalCMP.g:1245:4: ( ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) )
        // InternalCMP.g:1245:4: ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) )
        {
        // InternalCMP.g:1245:4: ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) )
        // InternalCMP.g:1246:5: {...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred32_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4)");
        }
        // InternalCMP.g:1246:107: ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) )
        // InternalCMP.g:1247:6: ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4);
        // InternalCMP.g:1250:6: ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) )
        // InternalCMP.g:1250:7: {...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred32_InternalCMP", "true");
        }
        // InternalCMP.g:1250:16: (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' )
        // InternalCMP.g:1250:18: otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';'
        {
        otherlv_33=(Token)match(input,30,FollowSets000.FOLLOW_23); if (state.failed) return ;
        otherlv_34=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_35=(Token)match(input,23,FollowSets000.FOLLOW_24); if (state.failed) return ;
        // InternalCMP.g:1262:1: ( (lv_externalPorts_36_0= ruleMPort ) )+
        int cnt93=0;
        loop93:
        do {
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=42 && LA93_0<=43)) ) {
                alt93=1;
            }


            switch (alt93) {
        	case 1 :
        	    // InternalCMP.g:1263:1: (lv_externalPorts_36_0= ruleMPort )
        	    {
        	    // InternalCMP.g:1263:1: (lv_externalPorts_36_0= ruleMPort )
        	    // InternalCMP.g:1264:3: lv_externalPorts_36_0= ruleMPort
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMComponentAccess().getExternalPortsMPortParserRuleCall_8_4_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_25);
        	    lv_externalPorts_36_0=ruleMPort();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt93 >= 1 ) break loop93;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(93, input);
                    throw eee;
            }
            cnt93++;
        } while (true);

        otherlv_37=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_38=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred32_InternalCMP

    // $ANTLR start synpred34_InternalCMP
    public final void synpred34_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        EObject lv_internalPorts_42_0 = null;


        // InternalCMP.g:1295:4: ( ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) )
        // InternalCMP.g:1295:4: ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) )
        {
        // InternalCMP.g:1295:4: ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) )
        // InternalCMP.g:1296:5: {...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred34_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5)");
        }
        // InternalCMP.g:1296:107: ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) )
        // InternalCMP.g:1297:6: ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5);
        // InternalCMP.g:1300:6: ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) )
        // InternalCMP.g:1300:7: {...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred34_InternalCMP", "true");
        }
        // InternalCMP.g:1300:16: (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' )
        // InternalCMP.g:1300:18: otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';'
        {
        otherlv_39=(Token)match(input,33,FollowSets000.FOLLOW_23); if (state.failed) return ;
        otherlv_40=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_41=(Token)match(input,23,FollowSets000.FOLLOW_24); if (state.failed) return ;
        // InternalCMP.g:1312:1: ( (lv_internalPorts_42_0= ruleMPort ) )+
        int cnt94=0;
        loop94:
        do {
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=42 && LA94_0<=43)) ) {
                alt94=1;
            }


            switch (alt94) {
        	case 1 :
        	    // InternalCMP.g:1313:1: (lv_internalPorts_42_0= ruleMPort )
        	    {
        	    // InternalCMP.g:1313:1: (lv_internalPorts_42_0= ruleMPort )
        	    // InternalCMP.g:1314:3: lv_internalPorts_42_0= ruleMPort
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMComponentAccess().getInternalPortsMPortParserRuleCall_8_5_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_25);
        	    lv_internalPorts_42_0=ruleMPort();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt94 >= 1 ) break loop94;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(94, input);
                    throw eee;
            }
            cnt94++;
        } while (true);

        otherlv_43=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_44=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred34_InternalCMP

    // $ANTLR start synpred36_InternalCMP
    public final void synpred36_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;

        // InternalCMP.g:1345:4: ( ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) )
        // InternalCMP.g:1345:4: ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) )
        {
        // InternalCMP.g:1345:4: ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) )
        // InternalCMP.g:1346:5: {...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred36_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6)");
        }
        // InternalCMP.g:1346:107: ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) )
        // InternalCMP.g:1347:6: ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6);
        // InternalCMP.g:1350:6: ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) )
        // InternalCMP.g:1350:7: {...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred36_InternalCMP", "true");
        }
        // InternalCMP.g:1350:16: (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' )
        // InternalCMP.g:1350:18: otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';'
        {
        otherlv_45=(Token)match(input,34,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_46=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalCMP.g:1358:1: ( ( ruleVersionedQualifiedName ) )
        // InternalCMP.g:1359:1: ( ruleVersionedQualifiedName )
        {
        // InternalCMP.g:1359:1: ( ruleVersionedQualifiedName )
        // InternalCMP.g:1360:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_28);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCMP.g:1376:2: (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop95:
        do {
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==22) ) {
                alt95=1;
            }


            switch (alt95) {
        	case 1 :
        	    // InternalCMP.g:1376:4: otherlv_48= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_48=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalCMP.g:1380:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalCMP.g:1381:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalCMP.g:1381:1: ( ruleVersionedQualifiedName )
        	    // InternalCMP.g:1382:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_28);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop95;
            }
        } while (true);

        otherlv_50=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred36_InternalCMP

    // $ANTLR start synpred38_InternalCMP
    public final void synpred38_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        EObject lv_supportedPlatforms_54_0 = null;


        // InternalCMP.g:1409:4: ( ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) )
        // InternalCMP.g:1409:4: ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) )
        {
        // InternalCMP.g:1409:4: ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) )
        // InternalCMP.g:1410:5: {...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred38_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7)");
        }
        // InternalCMP.g:1410:107: ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) )
        // InternalCMP.g:1411:6: ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7);
        // InternalCMP.g:1414:6: ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) )
        // InternalCMP.g:1414:7: {...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred38_InternalCMP", "true");
        }
        // InternalCMP.g:1414:16: (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' )
        // InternalCMP.g:1414:18: otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';'
        {
        otherlv_51=(Token)match(input,35,FollowSets000.FOLLOW_29); if (state.failed) return ;
        otherlv_52=(Token)match(input,36,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_53=(Token)match(input,23,FollowSets000.FOLLOW_30); if (state.failed) return ;
        // InternalCMP.g:1426:1: ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+
        int cnt96=0;
        loop96:
        do {
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==35) ) {
                alt96=1;
            }


            switch (alt96) {
        	case 1 :
        	    // InternalCMP.g:1427:1: (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform )
        	    {
        	    // InternalCMP.g:1427:1: (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform )
        	    // InternalCMP.g:1428:3: lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMComponentAccess().getSupportedPlatformsComponentSupportedPlatformParserRuleCall_8_7_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_31);
        	    lv_supportedPlatforms_54_0=ruleComponentSupportedPlatform();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt96 >= 1 ) break loop96;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(96, input);
                    throw eee;
            }
            cnt96++;
        } while (true);

        otherlv_55=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_56=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred38_InternalCMP

    // $ANTLR start synpred40_InternalCMP
    public final void synpred40_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        EObject lv_internalComponents_60_0 = null;


        // InternalCMP.g:1459:4: ( ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) )
        // InternalCMP.g:1459:4: ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) )
        {
        // InternalCMP.g:1459:4: ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) )
        // InternalCMP.g:1460:5: {...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred40_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8)");
        }
        // InternalCMP.g:1460:107: ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) )
        // InternalCMP.g:1461:6: ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8);
        // InternalCMP.g:1464:6: ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) )
        // InternalCMP.g:1464:7: {...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred40_InternalCMP", "true");
        }
        // InternalCMP.g:1464:16: (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' )
        // InternalCMP.g:1464:18: otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';'
        {
        otherlv_57=(Token)match(input,37,FollowSets000.FOLLOW_32); if (state.failed) return ;
        otherlv_58=(Token)match(input,38,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_59=(Token)match(input,23,FollowSets000.FOLLOW_33); if (state.failed) return ;
        // InternalCMP.g:1476:1: ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+
        int cnt97=0;
        loop97:
        do {
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=40 && LA97_0<=41)) ) {
                alt97=1;
            }


            switch (alt97) {
        	case 1 :
        	    // InternalCMP.g:1477:1: (lv_internalComponents_60_0= ruleMInternalComponentInstance )
        	    {
        	    // InternalCMP.g:1477:1: (lv_internalComponents_60_0= ruleMInternalComponentInstance )
        	    // InternalCMP.g:1478:3: lv_internalComponents_60_0= ruleMInternalComponentInstance
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMComponentAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_8_8_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_34);
        	    lv_internalComponents_60_0=ruleMInternalComponentInstance();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt97 >= 1 ) break loop97;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(97, input);
                    throw eee;
            }
            cnt97++;
        } while (true);

        otherlv_61=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_62=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred40_InternalCMP

    // $ANTLR start synpred42_InternalCMP
    public final void synpred42_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        EObject lv_connections_65_0 = null;


        // InternalCMP.g:1509:4: ( ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )
        // InternalCMP.g:1509:4: ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) )
        {
        // InternalCMP.g:1509:4: ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) )
        // InternalCMP.g:1510:5: {...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred42_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9)");
        }
        // InternalCMP.g:1510:107: ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) )
        // InternalCMP.g:1511:6: ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9);
        // InternalCMP.g:1514:6: ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) )
        // InternalCMP.g:1514:7: {...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred42_InternalCMP", "true");
        }
        // InternalCMP.g:1514:16: (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' )
        // InternalCMP.g:1514:18: otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';'
        {
        otherlv_63=(Token)match(input,39,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_64=(Token)match(input,23,FollowSets000.FOLLOW_35); if (state.failed) return ;
        // InternalCMP.g:1522:1: ( (lv_connections_65_0= ruleMInternalConnection ) )+
        int cnt98=0;
        loop98:
        do {
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==59) ) {
                alt98=1;
            }


            switch (alt98) {
        	case 1 :
        	    // InternalCMP.g:1523:1: (lv_connections_65_0= ruleMInternalConnection )
        	    {
        	    // InternalCMP.g:1523:1: (lv_connections_65_0= ruleMInternalConnection )
        	    // InternalCMP.g:1524:3: lv_connections_65_0= ruleMInternalConnection
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMComponentAccess().getConnectionsMInternalConnectionParserRuleCall_8_9_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_36);
        	    lv_connections_65_0=ruleMInternalConnection();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt98 >= 1 ) break loop98;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(98, input);
                    throw eee;
            }
            cnt98++;
        } while (true);

        otherlv_66=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_67=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred42_InternalCMP

    // $ANTLR start synpred75_InternalCMP
    public final void synpred75_InternalCMP_fragment() throws RecognitionException {   
        EObject this_MParameterOCR_0 = null;


        // InternalCMP.g:3338:2: (this_MParameterOCR_0= ruleMParameterOCR )
        // InternalCMP.g:3338:2: this_MParameterOCR_0= ruleMParameterOCR
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
    // $ANTLR end synpred75_InternalCMP

    // $ANTLR start synpred76_InternalCMP
    public final void synpred76_InternalCMP_fragment() throws RecognitionException {   
        EObject this_MParameterOOR_1 = null;


        // InternalCMP.g:3351:2: (this_MParameterOOR_1= ruleMParameterOOR )
        // InternalCMP.g:3351:2: this_MParameterOOR_1= ruleMParameterOOR
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
    // $ANTLR end synpred76_InternalCMP

    // $ANTLR start synpred77_InternalCMP
    public final void synpred77_InternalCMP_fragment() throws RecognitionException {   
        EObject this_MParameterCOR_2 = null;


        // InternalCMP.g:3364:2: (this_MParameterCOR_2= ruleMParameterCOR )
        // InternalCMP.g:3364:2: this_MParameterCOR_2= ruleMParameterCOR
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
    // $ANTLR end synpred77_InternalCMP

    // $ANTLR start synpred93_InternalCMP
    public final void synpred93_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;

        // InternalCMP.g:4718:4: ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) )
        // InternalCMP.g:4718:4: ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) )
        {
        // InternalCMP.g:4718:4: ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) )
        // InternalCMP.g:4719:5: {...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred93_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0)");
        }
        // InternalCMP.g:4719:123: ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) )
        // InternalCMP.g:4720:6: ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0);
        // InternalCMP.g:4723:6: ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) )
        // InternalCMP.g:4723:7: {...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred93_InternalCMP", "true");
        }
        // InternalCMP.g:4723:16: (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' )
        // InternalCMP.g:4723:18: otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';'
        {
        otherlv_6=(Token)match(input,68,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return ;
        // InternalCMP.g:4731:1: (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) )
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==69) ) {
            alt105=1;
        }
        else if ( (LA105_0==RULE_ID) ) {
            alt105=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 105, 0, input);

            throw nvae;
        }
        switch (alt105) {
            case 1 :
                // InternalCMP.g:4731:3: otherlv_8= 'any'
                {
                otherlv_8=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalCMP.g:4736:6: ( ( ruleVersionedQualifiedName ) )
                {
                // InternalCMP.g:4736:6: ( ( ruleVersionedQualifiedName ) )
                // InternalCMP.g:4737:1: ( ruleVersionedQualifiedName )
                {
                // InternalCMP.g:4737:1: ( ruleVersionedQualifiedName )
                // InternalCMP.g:4738:3: ruleVersionedQualifiedName
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


                }
                break;

        }

        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred93_InternalCMP

    // $ANTLR start synpred95_InternalCMP
    public final void synpred95_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;

        // InternalCMP.g:4765:4: ( ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) )
        // InternalCMP.g:4765:4: ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalCMP.g:4765:4: ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) )
        // InternalCMP.g:4766:5: {...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred95_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1)");
        }
        // InternalCMP.g:4766:123: ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) )
        // InternalCMP.g:4767:6: ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1);
        // InternalCMP.g:4770:6: ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) )
        // InternalCMP.g:4770:7: {...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred95_InternalCMP", "true");
        }
        // InternalCMP.g:4770:16: (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' )
        // InternalCMP.g:4770:18: otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';'
        {
        otherlv_11=(Token)match(input,70,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return ;
        // InternalCMP.g:4778:1: (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) )
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==69) ) {
            alt106=1;
        }
        else if ( (LA106_0==RULE_ID) ) {
            alt106=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 106, 0, input);

            throw nvae;
        }
        switch (alt106) {
            case 1 :
                // InternalCMP.g:4778:3: otherlv_13= 'any'
                {
                otherlv_13=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalCMP.g:4783:6: ( ( ruleVersionedQualifiedName ) )
                {
                // InternalCMP.g:4783:6: ( ( ruleVersionedQualifiedName ) )
                // InternalCMP.g:4784:1: ( ruleVersionedQualifiedName )
                {
                // InternalCMP.g:4784:1: ( ruleVersionedQualifiedName )
                // InternalCMP.g:4785:3: ruleVersionedQualifiedName
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


                }
                break;

        }

        otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred95_InternalCMP

    // $ANTLR start synpred97_InternalCMP
    public final void synpred97_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;

        // InternalCMP.g:4812:4: ( ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) )
        // InternalCMP.g:4812:4: ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) )
        {
        // InternalCMP.g:4812:4: ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) )
        // InternalCMP.g:4813:5: {...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred97_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2)");
        }
        // InternalCMP.g:4813:123: ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) )
        // InternalCMP.g:4814:6: ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2);
        // InternalCMP.g:4817:6: ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) )
        // InternalCMP.g:4817:7: {...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred97_InternalCMP", "true");
        }
        // InternalCMP.g:4817:16: (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' )
        // InternalCMP.g:4817:18: otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';'
        {
        otherlv_16=(Token)match(input,71,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return ;
        // InternalCMP.g:4825:1: (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) )
        int alt107=2;
        int LA107_0 = input.LA(1);

        if ( (LA107_0==69) ) {
            alt107=1;
        }
        else if ( (LA107_0==RULE_ID) ) {
            alt107=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 107, 0, input);

            throw nvae;
        }
        switch (alt107) {
            case 1 :
                // InternalCMP.g:4825:3: otherlv_18= 'any'
                {
                otherlv_18=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalCMP.g:4830:6: ( ( ruleVersionedQualifiedName ) )
                {
                // InternalCMP.g:4830:6: ( ( ruleVersionedQualifiedName ) )
                // InternalCMP.g:4831:1: ( ruleVersionedQualifiedName )
                {
                // InternalCMP.g:4831:1: ( ruleVersionedQualifiedName )
                // InternalCMP.g:4832:3: ruleVersionedQualifiedName
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


                }
                break;

        }

        otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred97_InternalCMP

    // $ANTLR start synpred98_InternalCMP
    public final void synpred98_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;

        // InternalCMP.g:4859:4: ( ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) )
        // InternalCMP.g:4859:4: ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) )
        {
        // InternalCMP.g:4859:4: ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) )
        // InternalCMP.g:4860:5: {...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred98_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3)");
        }
        // InternalCMP.g:4860:123: ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) )
        // InternalCMP.g:4861:6: ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3);
        // InternalCMP.g:4864:6: ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) )
        // InternalCMP.g:4864:7: {...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred98_InternalCMP", "true");
        }
        // InternalCMP.g:4864:16: (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' )
        // InternalCMP.g:4864:18: otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';'
        {
        otherlv_21=(Token)match(input,72,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_22=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalCMP.g:4872:1: ( ( ruleVersionedQualifiedName ) )
        // InternalCMP.g:4873:1: ( ruleVersionedQualifiedName )
        {
        // InternalCMP.g:4873:1: ( ruleVersionedQualifiedName )
        // InternalCMP.g:4874:3: ruleVersionedQualifiedName
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

        otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred98_InternalCMP

    // $ANTLR start synpred100_InternalCMP
    public final void synpred100_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;

        // InternalCMP.g:4901:4: ( ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) )
        // InternalCMP.g:4901:4: ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) )
        {
        // InternalCMP.g:4901:4: ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) )
        // InternalCMP.g:4902:5: {...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred100_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4)");
        }
        // InternalCMP.g:4902:123: ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) )
        // InternalCMP.g:4903:6: ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4);
        // InternalCMP.g:4906:6: ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) )
        // InternalCMP.g:4906:7: {...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred100_InternalCMP", "true");
        }
        // InternalCMP.g:4906:16: (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' )
        // InternalCMP.g:4906:18: otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';'
        {
        otherlv_25=(Token)match(input,73,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_26=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return ;
        // InternalCMP.g:4914:1: (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) )
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( (LA108_0==69) ) {
            alt108=1;
        }
        else if ( (LA108_0==RULE_ID) ) {
            alt108=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 108, 0, input);

            throw nvae;
        }
        switch (alt108) {
            case 1 :
                // InternalCMP.g:4914:3: otherlv_27= 'any'
                {
                otherlv_27=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalCMP.g:4919:6: ( ( ruleVersionedQualifiedName ) )
                {
                // InternalCMP.g:4919:6: ( ( ruleVersionedQualifiedName ) )
                // InternalCMP.g:4920:1: ( ruleVersionedQualifiedName )
                {
                // InternalCMP.g:4920:1: ( ruleVersionedQualifiedName )
                // InternalCMP.g:4921:3: ruleVersionedQualifiedName
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


                }
                break;

        }

        otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred100_InternalCMP

    // $ANTLR start synpred102_InternalCMP
    public final void synpred102_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;

        // InternalCMP.g:4948:4: ( ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) )
        // InternalCMP.g:4948:4: ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) )
        {
        // InternalCMP.g:4948:4: ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) )
        // InternalCMP.g:4949:5: {...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred102_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5)");
        }
        // InternalCMP.g:4949:123: ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) )
        // InternalCMP.g:4950:6: ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5);
        // InternalCMP.g:4953:6: ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) )
        // InternalCMP.g:4953:7: {...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred102_InternalCMP", "true");
        }
        // InternalCMP.g:4953:16: (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' )
        // InternalCMP.g:4953:18: otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';'
        {
        otherlv_30=(Token)match(input,74,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_31=(Token)match(input,25,FollowSets000.FOLLOW_71); if (state.failed) return ;
        // InternalCMP.g:4961:1: (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) )
        int alt109=2;
        int LA109_0 = input.LA(1);

        if ( (LA109_0==69) ) {
            alt109=1;
        }
        else if ( (LA109_0==RULE_ID) ) {
            alt109=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 109, 0, input);

            throw nvae;
        }
        switch (alt109) {
            case 1 :
                // InternalCMP.g:4961:3: otherlv_32= 'any'
                {
                otherlv_32=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalCMP.g:4966:6: ( ( ruleVersionedQualifiedName ) )
                {
                // InternalCMP.g:4966:6: ( ( ruleVersionedQualifiedName ) )
                // InternalCMP.g:4967:1: ( ruleVersionedQualifiedName )
                {
                // InternalCMP.g:4967:1: ( ruleVersionedQualifiedName )
                // InternalCMP.g:4968:3: ruleVersionedQualifiedName
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


                }
                break;

        }

        otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred102_InternalCMP

    // $ANTLR start synpred104_InternalCMP
    public final void synpred104_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;

        // InternalCMP.g:4995:4: ( ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) )
        // InternalCMP.g:4995:4: ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) )
        {
        // InternalCMP.g:4995:4: ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) )
        // InternalCMP.g:4996:5: {...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred104_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6)");
        }
        // InternalCMP.g:4996:123: ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) )
        // InternalCMP.g:4997:6: ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6);
        // InternalCMP.g:5000:6: ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) )
        // InternalCMP.g:5000:7: {...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred104_InternalCMP", "true");
        }
        // InternalCMP.g:5000:16: (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' )
        // InternalCMP.g:5000:18: otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';'
        {
        otherlv_35=(Token)match(input,34,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_36=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalCMP.g:5008:1: ( ( ruleVersionedQualifiedName ) )
        // InternalCMP.g:5009:1: ( ruleVersionedQualifiedName )
        {
        // InternalCMP.g:5009:1: ( ruleVersionedQualifiedName )
        // InternalCMP.g:5010:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_28);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCMP.g:5026:2: (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop110:
        do {
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==22) ) {
                alt110=1;
            }


            switch (alt110) {
        	case 1 :
        	    // InternalCMP.g:5026:4: otherlv_38= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_38=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalCMP.g:5030:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalCMP.g:5031:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalCMP.g:5031:1: ( ruleVersionedQualifiedName )
        	    // InternalCMP.g:5032:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_28);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop110;
            }
        } while (true);

        otherlv_40=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred104_InternalCMP

    // $ANTLR start synpred106_InternalCMP
    public final void synpred106_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        EObject lv_attributeValueAssignments_44_0 = null;


        // InternalCMP.g:5059:4: ( ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) )
        // InternalCMP.g:5059:4: ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) )
        {
        // InternalCMP.g:5059:4: ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) )
        // InternalCMP.g:5060:5: {...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred106_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7)");
        }
        // InternalCMP.g:5060:123: ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) )
        // InternalCMP.g:5061:6: ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7);
        // InternalCMP.g:5064:6: ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) )
        // InternalCMP.g:5064:7: {...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred106_InternalCMP", "true");
        }
        // InternalCMP.g:5064:16: (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' )
        // InternalCMP.g:5064:18: otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';'
        {
        otherlv_41=(Token)match(input,28,FollowSets000.FOLLOW_21); if (state.failed) return ;
        otherlv_42=(Token)match(input,29,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_43=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return ;
        // InternalCMP.g:5076:1: ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )*
        loop111:
        do {
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==28) ) {
                alt111=1;
            }


            switch (alt111) {
        	case 1 :
        	    // InternalCMP.g:5077:1: (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment )
        	    {
        	    // InternalCMP.g:5077:1: (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment )
        	    // InternalCMP.g:5078:3: lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_7_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_22);
        	    lv_attributeValueAssignments_44_0=ruleMParameterValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop111;
            }
        } while (true);

        otherlv_45=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_46=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred106_InternalCMP

    // $ANTLR start synpred108_InternalCMP
    public final void synpred108_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        EObject lv_attributes_49_0 = null;


        // InternalCMP.g:5109:4: ( ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) )
        // InternalCMP.g:5109:4: ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) )
        {
        // InternalCMP.g:5109:4: ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) )
        // InternalCMP.g:5110:5: {...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred108_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8)");
        }
        // InternalCMP.g:5110:123: ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) )
        // InternalCMP.g:5111:6: ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8);
        // InternalCMP.g:5114:6: ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) )
        // InternalCMP.g:5114:7: {...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred108_InternalCMP", "true");
        }
        // InternalCMP.g:5114:16: (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' )
        // InternalCMP.g:5114:18: otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';'
        {
        otherlv_47=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_48=(Token)match(input,23,FollowSets000.FOLLOW_19); if (state.failed) return ;
        // InternalCMP.g:5122:1: ( (lv_attributes_49_0= ruleMParameter ) )+
        int cnt112=0;
        loop112:
        do {
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=44 && LA112_0<=45)||(LA112_0>=47 && LA112_0<=48)||(LA112_0>=57 && LA112_0<=58)) ) {
                alt112=1;
            }


            switch (alt112) {
        	case 1 :
        	    // InternalCMP.g:5123:1: (lv_attributes_49_0= ruleMParameter )
        	    {
        	    // InternalCMP.g:5123:1: (lv_attributes_49_0= ruleMParameter )
        	    // InternalCMP.g:5124:3: lv_attributes_49_0= ruleMParameter
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getAttributesMParameterParserRuleCall_5_8_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_20);
        	    lv_attributes_49_0=ruleMParameter();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt112 >= 1 ) break loop112;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(112, input);
                    throw eee;
            }
            cnt112++;
        } while (true);

        otherlv_50=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_51=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred108_InternalCMP

    // $ANTLR start synpred110_InternalCMP
    public final void synpred110_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;

        // InternalCMP.g:5155:4: ( ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) )
        // InternalCMP.g:5155:4: ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) )
        {
        // InternalCMP.g:5155:4: ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) )
        // InternalCMP.g:5156:5: {...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred110_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9)");
        }
        // InternalCMP.g:5156:123: ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) )
        // InternalCMP.g:5157:6: ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9);
        // InternalCMP.g:5160:6: ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) )
        // InternalCMP.g:5160:7: {...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred110_InternalCMP", "true");
        }
        // InternalCMP.g:5160:16: (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' )
        // InternalCMP.g:5160:18: otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';'
        {
        otherlv_52=(Token)match(input,32,FollowSets000.FOLLOW_16); if (state.failed) return ;
        otherlv_53=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalCMP.g:5168:1: ( ( ruleVersionedQualifiedName ) )
        // InternalCMP.g:5169:1: ( ruleVersionedQualifiedName )
        {
        // InternalCMP.g:5169:1: ( ruleVersionedQualifiedName )
        // InternalCMP.g:5170:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_28);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCMP.g:5186:2: (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )*
        loop113:
        do {
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==22) ) {
                alt113=1;
            }


            switch (alt113) {
        	case 1 :
        	    // InternalCMP.g:5186:4: otherlv_55= ',' ( ( ruleVersionedQualifiedName ) )
        	    {
        	    otherlv_55=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalCMP.g:5190:1: ( ( ruleVersionedQualifiedName ) )
        	    // InternalCMP.g:5191:1: ( ruleVersionedQualifiedName )
        	    {
        	    // InternalCMP.g:5191:1: ( ruleVersionedQualifiedName )
        	    // InternalCMP.g:5192:3: ruleVersionedQualifiedName
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    pushFollow(FollowSets000.FOLLOW_28);
        	    ruleVersionedQualifiedName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop113;
            }
        } while (true);

        otherlv_57=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred110_InternalCMP

    // $ANTLR start synpred112_InternalCMP
    public final void synpred112_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        EObject lv_internalComponents_61_0 = null;


        // InternalCMP.g:5219:4: ( ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) )
        // InternalCMP.g:5219:4: ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) )
        {
        // InternalCMP.g:5219:4: ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) )
        // InternalCMP.g:5220:5: {...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred112_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10)");
        }
        // InternalCMP.g:5220:124: ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) )
        // InternalCMP.g:5221:6: ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10);
        // InternalCMP.g:5224:6: ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) )
        // InternalCMP.g:5224:7: {...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred112_InternalCMP", "true");
        }
        // InternalCMP.g:5224:16: (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' )
        // InternalCMP.g:5224:18: otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';'
        {
        otherlv_58=(Token)match(input,37,FollowSets000.FOLLOW_32); if (state.failed) return ;
        otherlv_59=(Token)match(input,38,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_60=(Token)match(input,23,FollowSets000.FOLLOW_33); if (state.failed) return ;
        // InternalCMP.g:5236:1: ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+
        int cnt114=0;
        loop114:
        do {
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=40 && LA114_0<=41)) ) {
                alt114=1;
            }


            switch (alt114) {
        	case 1 :
        	    // InternalCMP.g:5237:1: (lv_internalComponents_61_0= ruleMInternalComponentInstance )
        	    {
        	    // InternalCMP.g:5237:1: (lv_internalComponents_61_0= ruleMInternalComponentInstance )
        	    // InternalCMP.g:5238:3: lv_internalComponents_61_0= ruleMInternalComponentInstance
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_5_10_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_34);
        	    lv_internalComponents_61_0=ruleMInternalComponentInstance();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt114 >= 1 ) break loop114;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(114, input);
                    throw eee;
            }
            cnt114++;
        } while (true);

        otherlv_62=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_63=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred112_InternalCMP

    // $ANTLR start synpred114_InternalCMP
    public final void synpred114_InternalCMP_fragment() throws RecognitionException {   
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        EObject lv_connections_66_0 = null;


        // InternalCMP.g:5269:4: ( ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )
        // InternalCMP.g:5269:4: ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) )
        {
        // InternalCMP.g:5269:4: ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) )
        // InternalCMP.g:5270:5: {...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred114_InternalCMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11)");
        }
        // InternalCMP.g:5270:124: ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) )
        // InternalCMP.g:5271:6: ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11);
        // InternalCMP.g:5274:6: ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) )
        // InternalCMP.g:5274:7: {...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred114_InternalCMP", "true");
        }
        // InternalCMP.g:5274:16: (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' )
        // InternalCMP.g:5274:18: otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';'
        {
        otherlv_64=(Token)match(input,39,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_65=(Token)match(input,23,FollowSets000.FOLLOW_35); if (state.failed) return ;
        // InternalCMP.g:5282:1: ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+
        int cnt115=0;
        loop115:
        do {
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==59) ) {
                alt115=1;
            }


            switch (alt115) {
        	case 1 :
        	    // InternalCMP.g:5283:1: (lv_connections_66_0= ruleMInternalComponentConnection )
        	    {
        	    // InternalCMP.g:5283:1: (lv_connections_66_0= ruleMInternalComponentConnection )
        	    // InternalCMP.g:5284:3: lv_connections_66_0= ruleMInternalComponentConnection
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsMInternalComponentConnectionParserRuleCall_5_11_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_36);
        	    lv_connections_66_0=ruleMInternalComponentConnection();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt115 >= 1 ) break loop115;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(115, input);
                    throw eee;
            }
            cnt115++;
        } while (true);

        otherlv_67=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_68=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred114_InternalCMP

    // Delegated rules

    public final boolean synpred30_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalCMP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalCMP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA80 dfa80 = new DFA80(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\73\1\4\2\17\4\4\1\75\2\17\1\4\1\17\3\4\1\22\2\uffff\1\17\1\4\1\17\1\4\1\17";
    static final String dfa_3s = "\1\73\1\74\1\17\1\22\3\4\1\5\1\75\1\22\1\75\2\21\1\100\1\4\1\5\1\22\2\uffff\1\20\2\21\1\4\1\22";
    static final String dfa_4s = "\21\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\3\67\uffff\1\2",
            "\1\4",
            "\1\6\1\7\1\uffff\1\5",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\14\1\13",
            "\1\15",
            "\1\4\2\uffff\1\5",
            "\1\16\1\7\54\uffff\1\15",
            "\1\14\12\uffff\1\17\1\uffff\1\20",
            "\1\17\1\uffff\1\20",
            "\1\21\67\uffff\1\21\3\uffff\1\22",
            "\1\23",
            "\1\25\1\24",
            "\1\26",
            "",
            "",
            "\1\16\1\7",
            "\1\25\12\uffff\1\17\1\uffff\1\20",
            "\1\17\1\uffff\1\20",
            "\1\27",
            "\1\4\2\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "496:1: (this_MInternalComponentConnection_0= ruleMInternalComponentConnection | this_MInternalComponentPlatformSwitch_1= ruleMInternalComponentPlatformSwitch )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\30\13\uffff";
    static final String dfa_9s = "\1\47\13\uffff";
    static final String dfa_10s = "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_11s = "\1\0\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\uffff\1\4\1\1\1\5\1\uffff\1\6\1\uffff\1\3\1\7\1\10\1\11\1\uffff\1\12\1\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 1041:3: ( ({...}? => ( ({...}? => (otherlv_12= 'version' otherlv_13= ':=' ( (lv_version_14_0= ruleVersion ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'languages' otherlv_17= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_19= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleMParameter ) )+ otherlv_25= '}' otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'attribute' otherlv_28= 'values' otherlv_29= '{' ( (lv_attributeValueAssignments_30_0= ruleMParameterValueAssignment ) )* otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'external' otherlv_34= 'ports' otherlv_35= '{' ( (lv_externalPorts_36_0= ruleMPort ) )+ otherlv_37= '}' otherlv_38= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'internal' otherlv_40= 'ports' otherlv_41= '{' ( (lv_internalPorts_42_0= ruleMPort ) )+ otherlv_43= '}' otherlv_44= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'requires' otherlv_46= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_48= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_50= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'supported' otherlv_52= 'platforms' otherlv_53= '{' ( (lv_supportedPlatforms_54_0= ruleComponentSupportedPlatform ) )+ otherlv_55= '}' otherlv_56= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'subcomponent' otherlv_58= 'instances' otherlv_59= '{' ( (lv_internalComponents_60_0= ruleMInternalComponentInstance ) )+ otherlv_61= '}' otherlv_62= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= 'connections' otherlv_64= '{' ( (lv_connections_65_0= ruleMInternalConnection ) )+ otherlv_66= '}' otherlv_67= ';' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==27) ) {s = 1;}

                        else if ( LA30_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0) ) {s = 2;}

                        else if ( LA30_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1) ) {s = 3;}

                        else if ( LA30_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2) ) {s = 4;}

                        else if ( LA30_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3) ) {s = 5;}

                        else if ( LA30_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4) ) {s = 6;}

                        else if ( LA30_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5) ) {s = 7;}

                        else if ( LA30_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6) ) {s = 8;}

                        else if ( LA30_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7) ) {s = 9;}

                        else if ( LA30_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8) ) {s = 10;}

                        else if ( LA30_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9) ) {s = 11;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\12\uffff";
    static final String dfa_14s = "\1\54\1\55\1\uffff\1\4\4\uffff\1\4\1\uffff";
    static final String dfa_15s = "\2\72\1\uffff\1\4\4\uffff\1\27\1\uffff";
    static final String dfa_16s = "\2\uffff\1\1\1\uffff\1\3\1\4\1\5\1\2\1\uffff\1\6";
    static final String dfa_17s = "\12\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\1\2\1\uffff\1\3\1\5\10\uffff\1\4\1\6",
            "\1\2\1\uffff\1\7\1\5\10\uffff\1\4\1\6",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "\1\7\12\uffff\2\7\1\uffff\1\7\4\uffff\1\11",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2006:1: (this_MIntegerParameterSingleExpression_0= ruleMIntegerParameterSingleExpression | this_MEnumParameterSingleExpression_1= ruleMEnumParameterSingleExpression | this_MBooleanParameterSingleExpression_2= ruleMBooleanParameterSingleExpression | this_MRealParameterSingleExpression_3= ruleMRealParameterSingleExpression | this_MStringParameterSingleExpression_4= ruleMStringParameterSingleExpression | this_MEnumParameterDefinition_5= ruleMEnumParameterDefinition )";
        }
    }
    static final String dfa_19s = "\16\uffff";
    static final String dfa_20s = "\1\32\15\uffff";
    static final String dfa_21s = "\1\112\15\uffff";
    static final String dfa_22s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_23s = "\1\0\15\uffff}>";
    static final String[] dfa_24s = {
            "\1\12\1\1\1\11\3\uffff\1\13\1\uffff\1\10\2\uffff\1\14\1\uffff\1\15\34\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()+ loopback of 4716:3: ( ({...}? => ( ({...}? => (otherlv_6= 'osapi' otherlv_7= ':=' (otherlv_8= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'os' otherlv_12= ':=' (otherlv_13= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'architecture' otherlv_17= ':=' (otherlv_18= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'compiler' otherlv_22= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'microprocessor' otherlv_26= ':=' (otherlv_27= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'board' otherlv_31= ':=' (otherlv_32= 'any' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'requires' otherlv_36= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_38= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'attribute' otherlv_42= 'values' otherlv_43= '{' ( (lv_attributeValueAssignments_44_0= ruleMParameterValueAssignment ) )* otherlv_45= '}' otherlv_46= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'attributes' otherlv_48= '{' ( (lv_attributes_49_0= ruleMParameter ) )+ otherlv_50= '}' otherlv_51= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'languages' otherlv_53= ':=' ( ( ruleVersionedQualifiedName ) ) (otherlv_55= ',' ( ( ruleVersionedQualifiedName ) ) )* otherlv_57= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= 'subcomponent' otherlv_59= 'instances' otherlv_60= '{' ( (lv_internalComponents_61_0= ruleMInternalComponentInstance ) )+ otherlv_62= '}' otherlv_63= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_64= 'connections' otherlv_65= '{' ( (lv_connections_66_0= ruleMInternalComponentConnection ) )+ otherlv_67= '}' otherlv_68= ';' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_0 = input.LA(1);

                         
                        int index80_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA80_0==27) ) {s = 1;}

                        else if ( LA80_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( LA80_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( LA80_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2) ) {s = 4;}

                        else if ( LA80_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3) ) {s = 5;}

                        else if ( LA80_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA80_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA80_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA80_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( LA80_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8) ) {s = 10;}

                        else if ( LA80_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9) ) {s = 11;}

                        else if ( LA80_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10) ) {s = 12;}

                        else if ( LA80_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11) ) {s = 13;}

                         
                        input.seek(index80_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000055000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000005D000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0601B00000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0601B00008000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000C0008000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000AF55000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000AF5D000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000808000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000030008000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000008000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x002E0000000100F0L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000002000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000010000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000020L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000800L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000000060L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x002E0000000000E0L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0020000000000080L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000000000010L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000000000002000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000018000000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x000000A514000000L,0x00000000000007D0L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000020L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x000000A51C000000L,0x00000000000007D0L});
    }


}