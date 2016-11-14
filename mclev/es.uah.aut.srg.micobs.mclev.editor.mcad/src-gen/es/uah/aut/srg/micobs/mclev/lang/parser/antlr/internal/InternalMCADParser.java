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
import es.uah.aut.srg.micobs.mclev.lang.services.MCADGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMCADParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'deployment'", "'project'", "'{'", "'version'", "':='", "'attribute'", "'values'", "'}'", "'platforms'", "'alternatives'", "'components'", "'connections'", "'libraries'", "'.'", "'('", "')'", "'::'", "'connection'", "'<->'", "'using'", "'mapping'", "'switch'", "'case'", "':'", "'instance'", "'library'", "'driver'", "'device'", "'mappings'", "'supported'", "'->'", "'deployed'", "'alternative'", "','", "'platform'", "'devices'", "'parameter'", "'raw'", "'true'", "'false'", "'-'", "'e'", "'+'", "'*'", "'/'"
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


        public InternalMCADParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMCADParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMCADParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMCAD.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MCADGrammarAccess grammarAccess;
     	
        public InternalMCADParser(TokenStream input, MCADGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MMCLEVMCADPackageFile";	
       	}
       	
       	@Override
       	protected MCADGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMMCLEVMCADPackageFile"
    // InternalMCAD.g:75:1: entryRuleMMCLEVMCADPackageFile returns [EObject current=null] : iv_ruleMMCLEVMCADPackageFile= ruleMMCLEVMCADPackageFile EOF ;
    public final EObject entryRuleMMCLEVMCADPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVMCADPackageFile = null;


        try {
            // InternalMCAD.g:76:2: (iv_ruleMMCLEVMCADPackageFile= ruleMMCLEVMCADPackageFile EOF )
            // InternalMCAD.g:77:2: iv_ruleMMCLEVMCADPackageFile= ruleMMCLEVMCADPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVMCADPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMCLEVMCADPackageFile=ruleMMCLEVMCADPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVMCADPackageFile; 
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
    // $ANTLR end "entryRuleMMCLEVMCADPackageFile"


    // $ANTLR start "ruleMMCLEVMCADPackageFile"
    // InternalMCAD.g:84:1: ruleMMCLEVMCADPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVMCADPackageElement ) ) ) ;
    public final EObject ruleMMCLEVMCADPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:87:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVMCADPackageElement ) ) ) )
            // InternalMCAD.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVMCADPackageElement ) ) )
            {
            // InternalMCAD.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVMCADPackageElement ) ) )
            // InternalMCAD.g:88:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleMMCLEVMCADPackageElement ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageKeyword_0());
                  
            }
            // InternalMCAD.g:92:1: ( ( ruleQualifiedName ) )
            // InternalMCAD.g:93:1: ( ruleQualifiedName )
            {
            // InternalMCAD.g:93:1: ( ruleQualifiedName )
            // InternalMCAD.g:94:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMCLEVMCADPackageFileRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
              	    
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

                  	newLeafNode(otherlv_2, grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_2());
                  
            }
            // InternalMCAD.g:114:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMCAD.g:114:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMMCLEVMCADPackageFileAccess().getImportKeyword_3_0());
            	          
            	    }
            	    // InternalMCAD.g:118:1: ( ( ruleQualifiedName ) )
            	    // InternalMCAD.g:119:1: ( ruleQualifiedName )
            	    {
            	    // InternalMCAD.g:119:1: ( ruleQualifiedName )
            	    // InternalMCAD.g:120:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMMCLEVMCADPackageFileRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            	      	    
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

            	          	newLeafNode(otherlv_5, grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_3_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMCAD.g:140:3: ( (lv_element_6_0= ruleMMCLEVMCADPackageElement ) )
            // InternalMCAD.g:141:1: (lv_element_6_0= ruleMMCLEVMCADPackageElement )
            {
            // InternalMCAD.g:141:1: (lv_element_6_0= ruleMMCLEVMCADPackageElement )
            // InternalMCAD.g:142:3: lv_element_6_0= ruleMMCLEVMCADPackageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCLEVMCADPackageFileAccess().getElementMMCLEVMCADPackageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_6_0=ruleMMCLEVMCADPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMMCLEVMCADPackageFileRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_6_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MMCLEVMCADPackageElement");
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
    // $ANTLR end "ruleMMCLEVMCADPackageFile"


    // $ANTLR start "entryRuleMMCLEVMCADPackageElement"
    // InternalMCAD.g:166:1: entryRuleMMCLEVMCADPackageElement returns [EObject current=null] : iv_ruleMMCLEVMCADPackageElement= ruleMMCLEVMCADPackageElement EOF ;
    public final EObject entryRuleMMCLEVMCADPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCLEVMCADPackageElement = null;


        try {
            // InternalMCAD.g:167:2: (iv_ruleMMCLEVMCADPackageElement= ruleMMCLEVMCADPackageElement EOF )
            // InternalMCAD.g:168:2: iv_ruleMMCLEVMCADPackageElement= ruleMMCLEVMCADPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCLEVMCADPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMCLEVMCADPackageElement=ruleMMCLEVMCADPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCLEVMCADPackageElement; 
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
    // $ANTLR end "entryRuleMMCLEVMCADPackageElement"


    // $ANTLR start "ruleMMCLEVMCADPackageElement"
    // InternalMCAD.g:175:1: ruleMMCLEVMCADPackageElement returns [EObject current=null] : this_MMCADeployment_0= ruleMMCADeployment ;
    public final EObject ruleMMCLEVMCADPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_MMCADeployment_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:178:28: (this_MMCADeployment_0= ruleMMCADeployment )
            // InternalMCAD.g:180:2: this_MMCADeployment_0= ruleMMCADeployment
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMMCLEVMCADPackageElementAccess().getMMCADeploymentParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_MMCADeployment_0=ruleMMCADeployment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MMCADeployment_0; 
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
    // $ANTLR end "ruleMMCLEVMCADPackageElement"


    // $ANTLR start "entryRuleMMCADeployment"
    // InternalMCAD.g:199:1: entryRuleMMCADeployment returns [EObject current=null] : iv_ruleMMCADeployment= ruleMMCADeployment EOF ;
    public final EObject entryRuleMMCADeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMCADeployment = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5()
        		);
        	
        try {
            // InternalMCAD.g:205:2: (iv_ruleMMCADeployment= ruleMMCADeployment EOF )
            // InternalMCAD.g:206:2: iv_ruleMMCADeployment= ruleMMCADeployment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMMCADeploymentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMMCADeployment=ruleMMCADeployment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMMCADeployment; 
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
    // $ANTLR end "entryRuleMMCADeployment"


    // $ANTLR start "ruleMMCADeployment"
    // InternalMCAD.g:216:1: ruleMMCADeployment returns [EObject current=null] : (otherlv_0= 'deployment' otherlv_1= 'project' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?) ) ) otherlv_43= '}' otherlv_44= ';' ) ;
    public final EObject ruleMMCADeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
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
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        AntlrDatatypeRuleToken lv_version_8_0 = null;

        EObject lv_attributeValueAssignments_13_0 = null;

        EObject lv_deploymentPlatforms_19_0 = null;

        EObject lv_deploymentAlternatives_25_0 = null;

        EObject lv_components_30_0 = null;

        EObject lv_connections_35_0 = null;

        EObject lv_libraries_40_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5()
        		);
            
        try {
            // InternalMCAD.g:222:28: ( (otherlv_0= 'deployment' otherlv_1= 'project' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?) ) ) otherlv_43= '}' otherlv_44= ';' ) )
            // InternalMCAD.g:223:1: (otherlv_0= 'deployment' otherlv_1= 'project' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?) ) ) otherlv_43= '}' otherlv_44= ';' )
            {
            // InternalMCAD.g:223:1: (otherlv_0= 'deployment' otherlv_1= 'project' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?) ) ) otherlv_43= '}' otherlv_44= ';' )
            // InternalMCAD.g:223:3: otherlv_0= 'deployment' otherlv_1= 'project' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?) ) ) otherlv_43= '}' otherlv_44= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMMCADeploymentAccess().getProjectKeyword_1());
                  
            }
            // InternalMCAD.g:231:1: ( ( ruleVersionedQualifiedName ) )
            // InternalMCAD.g:232:1: ( ruleVersionedQualifiedName )
            {
            // InternalMCAD.g:232:1: ( ruleVersionedQualifiedName )
            // InternalMCAD.g:233:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMMCADeploymentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getDomainMDomainCrossReference_2_0()); 
              	    
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

            // InternalMCAD.g:249:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalMCAD.g:250:1: (lv_name_3_0= RULE_ID )
            {
            // InternalMCAD.g:250:1: (lv_name_3_0= RULE_ID )
            // InternalMCAD.g:251:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMMCADeploymentAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMMCADeploymentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalMCAD.g:271:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?) ) )
            // InternalMCAD.g:273:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalMCAD.g:273:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?) )
            // InternalMCAD.g:274:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
            // InternalMCAD.g:277:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?)
            // InternalMCAD.g:278:3: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+ {...}?
            {
            // InternalMCAD.g:278:3: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=8;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalMCAD.g:280:4: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:280:4: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) )
            	    // InternalMCAD.g:281:5: {...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalMCAD.g:281:111: ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) )
            	    // InternalMCAD.g:282:6: ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0);
            	    // InternalMCAD.g:285:6: ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) )
            	    // InternalMCAD.g:285:7: {...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "true");
            	    }
            	    // InternalMCAD.g:285:16: (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' )
            	    // InternalMCAD.g:285:18: otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';'
            	    {
            	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMMCADeploymentAccess().getVersionKeyword_5_0_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMMCADeploymentAccess().getColonEqualsSignKeyword_5_0_1());
            	          
            	    }
            	    // InternalMCAD.g:293:1: ( (lv_version_8_0= ruleVersion ) )
            	    // InternalMCAD.g:294:1: (lv_version_8_0= ruleVersion )
            	    {
            	    // InternalMCAD.g:294:1: (lv_version_8_0= ruleVersion )
            	    // InternalMCAD.g:295:3: lv_version_8_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_version_8_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"version",
            	              		lv_version_8_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.Version");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMCAD.g:322:4: ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:322:4: ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) )
            	    // InternalMCAD.g:323:5: {...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalMCAD.g:323:111: ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) )
            	    // InternalMCAD.g:324:6: ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1);
            	    // InternalMCAD.g:327:6: ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) )
            	    // InternalMCAD.g:327:7: {...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "true");
            	    }
            	    // InternalMCAD.g:327:16: (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' )
            	    // InternalMCAD.g:327:18: otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';'
            	    {
            	    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMMCADeploymentAccess().getAttributeKeyword_5_1_0());
            	          
            	    }
            	    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMMCADeploymentAccess().getValuesKeyword_5_1_1());
            	          
            	    }
            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_1_2());
            	          
            	    }
            	    // InternalMCAD.g:339:1: ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==20) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMCAD.g:340:1: (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment )
            	    	    {
            	    	    // InternalMCAD.g:340:1: (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment )
            	    	    // InternalMCAD.g:341:3: lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_attributeValueAssignments_13_0=ruleMAttributeValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributeValueAssignments",
            	    	              		lv_attributeValueAssignments_13_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_1_4());
            	          
            	    }
            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_1_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMCAD.g:372:4: ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:372:4: ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
            	    // InternalMCAD.g:373:5: {...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalMCAD.g:373:111: ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
            	    // InternalMCAD.g:374:6: ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2);
            	    // InternalMCAD.g:377:6: ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) )
            	    // InternalMCAD.g:377:7: {...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "true");
            	    }
            	    // InternalMCAD.g:377:16: (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' )
            	    // InternalMCAD.g:377:18: otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';'
            	    {
            	    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_2_0());
            	          
            	    }
            	    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMMCADeploymentAccess().getPlatformsKeyword_5_2_1());
            	          
            	    }
            	    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_2_2());
            	          
            	    }
            	    // InternalMCAD.g:389:1: ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMCAD.g:390:1: (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform )
            	    	    {
            	    	    // InternalMCAD.g:390:1: (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform )
            	    	    // InternalMCAD.g:391:3: lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsMDeploymentPlatformParserRuleCall_5_2_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
            	    	    lv_deploymentPlatforms_19_0=ruleMDeploymentPlatform();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deploymentPlatforms",
            	    	              		lv_deploymentPlatforms_19_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeploymentPlatform");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_2_4());
            	          
            	    }
            	    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMCAD.g:422:4: ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:422:4: ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) )
            	    // InternalMCAD.g:423:5: {...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalMCAD.g:423:111: ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) )
            	    // InternalMCAD.g:424:6: ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3);
            	    // InternalMCAD.g:427:6: ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) )
            	    // InternalMCAD.g:427:7: {...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "true");
            	    }
            	    // InternalMCAD.g:427:16: (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' )
            	    // InternalMCAD.g:427:18: otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';'
            	    {
            	    otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_3_0());
            	          
            	    }
            	    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMMCADeploymentAccess().getAlternativesKeyword_5_3_1());
            	          
            	    }
            	    otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_24, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_3_2());
            	          
            	    }
            	    // InternalMCAD.g:439:1: ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==15) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMCAD.g:440:1: (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative )
            	    	    {
            	    	    // InternalMCAD.g:440:1: (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative )
            	    	    // InternalMCAD.g:441:3: lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_3_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
            	    	    lv_deploymentAlternatives_25_0=ruleMDeploymentAlternative();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deploymentAlternatives",
            	    	              		lv_deploymentAlternatives_25_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeploymentAlternative");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_26, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_3_4());
            	          
            	    }
            	    otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_3_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMCAD.g:472:4: ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:472:4: ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
            	    // InternalMCAD.g:473:5: {...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalMCAD.g:473:111: ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
            	    // InternalMCAD.g:474:6: ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4);
            	    // InternalMCAD.g:477:6: ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) )
            	    // InternalMCAD.g:477:7: {...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "true");
            	    }
            	    // InternalMCAD.g:477:16: (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' )
            	    // InternalMCAD.g:477:18: otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';'
            	    {
            	    otherlv_28=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_28, grammarAccess.getMMCADeploymentAccess().getComponentsKeyword_5_4_0());
            	          
            	    }
            	    otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_4_1());
            	          
            	    }
            	    // InternalMCAD.g:485:1: ( (lv_components_30_0= ruleMComponentInstance ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==39) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMCAD.g:486:1: (lv_components_30_0= ruleMComponentInstance )
            	    	    {
            	    	    // InternalMCAD.g:486:1: (lv_components_30_0= ruleMComponentInstance )
            	    	    // InternalMCAD.g:487:3: lv_components_30_0= ruleMComponentInstance
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getComponentsMComponentInstanceParserRuleCall_5_4_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_20);
            	    	    lv_components_30_0=ruleMComponentInstance();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"components",
            	    	              		lv_components_30_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MComponentInstance");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    otherlv_31=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_4_3());
            	          
            	    }
            	    otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_32, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_4_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMCAD.g:518:4: ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:518:4: ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) )
            	    // InternalMCAD.g:519:5: {...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalMCAD.g:519:111: ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) )
            	    // InternalMCAD.g:520:6: ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5);
            	    // InternalMCAD.g:523:6: ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) )
            	    // InternalMCAD.g:523:7: {...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "true");
            	    }
            	    // InternalMCAD.g:523:16: (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' )
            	    // InternalMCAD.g:523:18: otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';'
            	    {
            	    otherlv_33=(Token)match(input,26,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_33, grammarAccess.getMMCADeploymentAccess().getConnectionsKeyword_5_5_0());
            	          
            	    }
            	    otherlv_34=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_34, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_5_1());
            	          
            	    }
            	    // InternalMCAD.g:531:1: ( (lv_connections_35_0= ruleMConnection ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==32||LA6_0==36) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMCAD.g:532:1: (lv_connections_35_0= ruleMConnection )
            	    	    {
            	    	    // InternalMCAD.g:532:1: (lv_connections_35_0= ruleMConnection )
            	    	    // InternalMCAD.g:533:3: lv_connections_35_0= ruleMConnection
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getConnectionsMConnectionParserRuleCall_5_5_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_22);
            	    	    lv_connections_35_0=ruleMConnection();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"connections",
            	    	              		lv_connections_35_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MConnection");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    otherlv_36=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_36, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_5_3());
            	          
            	    }
            	    otherlv_37=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_37, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_5_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMCAD.g:564:4: ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:564:4: ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) )
            	    // InternalMCAD.g:565:5: {...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // InternalMCAD.g:565:111: ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) )
            	    // InternalMCAD.g:566:6: ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6);
            	    // InternalMCAD.g:569:6: ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) )
            	    // InternalMCAD.g:569:7: {...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMMCADeployment", "true");
            	    }
            	    // InternalMCAD.g:569:16: (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' )
            	    // InternalMCAD.g:569:18: otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';'
            	    {
            	    otherlv_38=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_38, grammarAccess.getMMCADeploymentAccess().getLibrariesKeyword_5_6_0());
            	          
            	    }
            	    otherlv_39=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_39, grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_6_1());
            	          
            	    }
            	    // InternalMCAD.g:577:1: ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>=40 && LA7_0<=41)) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMCAD.g:578:1: (lv_libraries_40_0= ruleMServiceLibraryInstance )
            	    	    {
            	    	    // InternalMCAD.g:578:1: (lv_libraries_40_0= ruleMServiceLibraryInstance )
            	    	    // InternalMCAD.g:579:3: lv_libraries_40_0= ruleMServiceLibraryInstance
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_6_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_24);
            	    	    lv_libraries_40_0=ruleMServiceLibraryInstance();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMMCADeploymentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"libraries",
            	    	              		lv_libraries_40_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MServiceLibraryInstance");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	    otherlv_41=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_41, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_6_3());
            	          
            	    }
            	    otherlv_42=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_42, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_6_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMMCADeployment", "getUnorderedGroupHelper().canLeave(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());

            }

            otherlv_43=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_43, grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_44=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_44, grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMMCADeployment"


    // $ANTLR start "entryRuleMConnection"
    // InternalMCAD.g:637:1: entryRuleMConnection returns [EObject current=null] : iv_ruleMConnection= ruleMConnection EOF ;
    public final EObject entryRuleMConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMConnection = null;


        try {
            // InternalMCAD.g:638:2: (iv_ruleMConnection= ruleMConnection EOF )
            // InternalMCAD.g:639:2: iv_ruleMConnection= ruleMConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMConnectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMConnection=ruleMConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMConnection; 
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
    // $ANTLR end "entryRuleMConnection"


    // $ANTLR start "ruleMConnection"
    // InternalMCAD.g:646:1: ruleMConnection returns [EObject current=null] : (this_MCommonConnection_0= ruleMCommonConnection | this_MConnectionSwitch_1= ruleMConnectionSwitch ) ;
    public final EObject ruleMConnection() throws RecognitionException {
        EObject current = null;

        EObject this_MCommonConnection_0 = null;

        EObject this_MConnectionSwitch_1 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:649:28: ( (this_MCommonConnection_0= ruleMCommonConnection | this_MConnectionSwitch_1= ruleMConnectionSwitch ) )
            // InternalMCAD.g:650:1: (this_MCommonConnection_0= ruleMCommonConnection | this_MConnectionSwitch_1= ruleMConnectionSwitch )
            {
            // InternalMCAD.g:650:1: (this_MCommonConnection_0= ruleMCommonConnection | this_MConnectionSwitch_1= ruleMConnectionSwitch )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==36) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMCAD.g:651:2: this_MCommonConnection_0= ruleMCommonConnection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMConnectionAccess().getMCommonConnectionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MCommonConnection_0=ruleMCommonConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MCommonConnection_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalMCAD.g:664:2: this_MConnectionSwitch_1= ruleMConnectionSwitch
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMConnectionAccess().getMConnectionSwitchParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MConnectionSwitch_1=ruleMConnectionSwitch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MConnectionSwitch_1; 
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
    // $ANTLR end "ruleMConnection"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMCAD.g:683:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMCAD.g:684:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMCAD.g:685:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalMCAD.g:692:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalMCAD.g:695:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMCAD.g:696:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMCAD.g:696:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMCAD.g:696:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalMCAD.g:703:1: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMCAD.g:704:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // InternalMCAD.g:724:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalMCAD.g:725:2: (iv_ruleVersion= ruleVersion EOF )
            // InternalMCAD.g:726:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalMCAD.g:733:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalMCAD.g:736:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalMCAD.g:737:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalMCAD.g:737:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalMCAD.g:737:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalMCAD.g:737:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||LA12_1==13||LA12_1==28||LA12_1==30) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMCAD.g:737:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalMCAD.g:745:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalMCAD.g:745:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalMCAD.g:745:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalMCAD.g:745:7: (this_INT_1= RULE_INT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_INT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMCAD.g:745:12: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
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

            // InternalMCAD.g:759:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMCAD.g:760:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // InternalMCAD.g:765:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_INT) ) {
            	        int LA14_1 = input.LA(2);

            	        if ( (LA14_1==RULE_ID) ) {
            	            alt14=2;
            	        }
            	        else if ( (LA14_1==EOF||LA14_1==13||LA14_1==28||LA14_1==30) ) {
            	            alt14=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 14, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA14_0==RULE_ID) ) {
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
            	            // InternalMCAD.g:765:6: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_4);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMCAD.g:773:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalMCAD.g:773:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalMCAD.g:773:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalMCAD.g:773:7: (this_INT_5= RULE_INT )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==RULE_INT) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // InternalMCAD.g:773:12: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
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
            	    break loop15;
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
    // InternalMCAD.g:795:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalMCAD.g:796:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalMCAD.g:797:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalMCAD.g:804:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:807:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalMCAD.g:808:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalMCAD.g:808:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalMCAD.g:809:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_26);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,29,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Version_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalMCAD.g:850:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalMCAD.g:851:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalMCAD.g:852:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalMCAD.g:859:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:862:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalMCAD.g:863:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalMCAD.g:863:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalMCAD.g:863:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalMCAD.g:863:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=28 && LA16_1<=29)) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalMCAD.g:864:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VersionedQualifiedName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // InternalMCAD.g:887:1: (kw= '::' this_ID_4= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMCAD.g:888:2: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            	          
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "entryRuleMCommonConnection"
    // InternalMCAD.g:908:1: entryRuleMCommonConnection returns [EObject current=null] : iv_ruleMCommonConnection= ruleMCommonConnection EOF ;
    public final EObject entryRuleMCommonConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCommonConnection = null;


        try {
            // InternalMCAD.g:909:2: (iv_ruleMCommonConnection= ruleMCommonConnection EOF )
            // InternalMCAD.g:910:2: iv_ruleMCommonConnection= ruleMCommonConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCommonConnectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMCommonConnection=ruleMCommonConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMCommonConnection; 
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
    // $ANTLR end "entryRuleMCommonConnection"


    // $ANTLR start "ruleMCommonConnection"
    // InternalMCAD.g:917:1: ruleMCommonConnection returns [EObject current=null] : ( () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';' ) ;
    public final EObject ruleMCommonConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_attributeValueAssignments_16_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:920:28: ( ( () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';' ) )
            // InternalMCAD.g:921:1: ( () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';' )
            {
            // InternalMCAD.g:921:1: ( () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';' )
            // InternalMCAD.g:921:2: () otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<->' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_11= '{' (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )? ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )* otherlv_17= '}' otherlv_18= ';'
            {
            // InternalMCAD.g:921:2: ()
            // InternalMCAD.g:922:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMCommonConnectionAccess().getMCommonConnectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMCommonConnectionAccess().getConnectionKeyword_1());
                  
            }
            // InternalMCAD.g:934:1: ( (otherlv_2= RULE_ID ) )
            // InternalMCAD.g:935:1: (otherlv_2= RULE_ID )
            {
            // InternalMCAD.g:935:1: (otherlv_2= RULE_ID )
            // InternalMCAD.g:936:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMCommonConnectionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getMCommonConnectionAccess().getClientInstanceMComponentInstanceCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_3());
                  
            }
            // InternalMCAD.g:954:1: ( (otherlv_4= RULE_ID ) )
            // InternalMCAD.g:955:1: (otherlv_4= RULE_ID )
            {
            // InternalMCAD.g:955:1: (otherlv_4= RULE_ID )
            // InternalMCAD.g:956:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMCommonConnectionRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getMCommonConnectionAccess().getClientPortMClientPortCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMCommonConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5());
                  
            }
            // InternalMCAD.g:974:1: ( (otherlv_6= RULE_ID ) )
            // InternalMCAD.g:975:1: (otherlv_6= RULE_ID )
            {
            // InternalMCAD.g:975:1: (otherlv_6= RULE_ID )
            // InternalMCAD.g:976:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMCommonConnectionRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getMCommonConnectionAccess().getServerInstanceMComponentInstanceCrossReference_6_0()); 
              	
            }

            }


            }

            otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_7());
                  
            }
            // InternalMCAD.g:994:1: ( (otherlv_8= RULE_ID ) )
            // InternalMCAD.g:995:1: (otherlv_8= RULE_ID )
            {
            // InternalMCAD.g:995:1: (otherlv_8= RULE_ID )
            // InternalMCAD.g:996:3: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMCommonConnectionRule());
              	        }
                      
            }
            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_8, grammarAccess.getMCommonConnectionAccess().getServerPortMServerPortCrossReference_8_0()); 
              	
            }

            }


            }

            otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMCommonConnectionAccess().getUsingKeyword_9());
                  
            }
            // InternalMCAD.g:1014:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalMCAD.g:1015:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalMCAD.g:1015:1: ( ruleVersionedQualifiedReferenceName )
            // InternalMCAD.g:1016:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMCommonConnectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMCommonConnectionAccess().getConnectorMConnectorCrossReference_10_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getMCommonConnectionAccess().getLeftCurlyBracketKeyword_11());
                  
            }
            // InternalMCAD.g:1036:1: (otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMCAD.g:1036:3: otherlv_12= 'mapping' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';'
                    {
                    otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getMCommonConnectionAccess().getMappingKeyword_12_0());
                          
                    }
                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMCommonConnectionAccess().getColonEqualsSignKeyword_12_1());
                          
                    }
                    // InternalMCAD.g:1044:1: ( ( ruleVersionedQualifiedName ) )
                    // InternalMCAD.g:1045:1: ( ruleVersionedQualifiedName )
                    {
                    // InternalMCAD.g:1045:1: ( ruleVersionedQualifiedName )
                    // InternalMCAD.g:1046:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMCommonConnectionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMCommonConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0()); 
                      	    
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

                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_12_3());
                          
                    }

                    }
                    break;

            }

            // InternalMCAD.g:1066:3: ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMCAD.g:1067:1: (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment )
            	    {
            	    // InternalMCAD.g:1067:1: (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment )
            	    // InternalMCAD.g:1068:3: lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMCommonConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_attributeValueAssignments_16_0=ruleMAttributeValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMCommonConnectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_16_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getMCommonConnectionAccess().getRightCurlyBracketKeyword_14());
                  
            }
            otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_15());
                  
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
    // $ANTLR end "ruleMCommonConnection"


    // $ANTLR start "entryRuleMConnectionSwitch"
    // InternalMCAD.g:1100:1: entryRuleMConnectionSwitch returns [EObject current=null] : iv_ruleMConnectionSwitch= ruleMConnectionSwitch EOF ;
    public final EObject entryRuleMConnectionSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMConnectionSwitch = null;


        try {
            // InternalMCAD.g:1101:2: (iv_ruleMConnectionSwitch= ruleMConnectionSwitch EOF )
            // InternalMCAD.g:1102:2: iv_ruleMConnectionSwitch= ruleMConnectionSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMConnectionSwitchRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMConnectionSwitch=ruleMConnectionSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMConnectionSwitch; 
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
    // $ANTLR end "entryRuleMConnectionSwitch"


    // $ANTLR start "ruleMConnectionSwitch"
    // InternalMCAD.g:1109:1: ruleMConnectionSwitch returns [EObject current=null] : ( () otherlv_1= 'switch' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_cases_8_0= ruleMConnectionSwitchCase ) )+ otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleMConnectionSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_cases_8_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:1112:28: ( ( () otherlv_1= 'switch' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_cases_8_0= ruleMConnectionSwitchCase ) )+ otherlv_9= '}' otherlv_10= ';' ) )
            // InternalMCAD.g:1113:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_cases_8_0= ruleMConnectionSwitchCase ) )+ otherlv_9= '}' otherlv_10= ';' )
            {
            // InternalMCAD.g:1113:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_cases_8_0= ruleMConnectionSwitchCase ) )+ otherlv_9= '}' otherlv_10= ';' )
            // InternalMCAD.g:1113:2: () otherlv_1= 'switch' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_cases_8_0= ruleMConnectionSwitchCase ) )+ otherlv_9= '}' otherlv_10= ';'
            {
            // InternalMCAD.g:1113:2: ()
            // InternalMCAD.g:1114:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMConnectionSwitchAccess().getMConnectionSwitchAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMConnectionSwitchAccess().getSwitchKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMConnectionSwitchAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalMCAD.g:1130:1: ( (otherlv_3= RULE_ID ) )
            // InternalMCAD.g:1131:1: (otherlv_3= RULE_ID )
            {
            // InternalMCAD.g:1131:1: (otherlv_3= RULE_ID )
            // InternalMCAD.g:1132:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMConnectionSwitchRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getMConnectionSwitchAccess().getClientInstanceMComponentInstanceCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMConnectionSwitchAccess().getFullStopKeyword_4());
                  
            }
            // InternalMCAD.g:1150:1: ( (otherlv_5= RULE_ID ) )
            // InternalMCAD.g:1151:1: (otherlv_5= RULE_ID )
            {
            // InternalMCAD.g:1151:1: (otherlv_5= RULE_ID )
            // InternalMCAD.g:1152:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMConnectionSwitchRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getMConnectionSwitchAccess().getClientPortMClientPortCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMConnectionSwitchAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMConnectionSwitchAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // InternalMCAD.g:1174:1: ( (lv_cases_8_0= ruleMConnectionSwitchCase ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMCAD.g:1175:1: (lv_cases_8_0= ruleMConnectionSwitchCase )
            	    {
            	    // InternalMCAD.g:1175:1: (lv_cases_8_0= ruleMConnectionSwitchCase )
            	    // InternalMCAD.g:1176:3: lv_cases_8_0= ruleMConnectionSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMConnectionSwitchAccess().getCasesMConnectionSwitchCaseParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_cases_8_0=ruleMConnectionSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMConnectionSwitchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_8_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MConnectionSwitchCase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMConnectionSwitchAccess().getRightCurlyBracketKeyword_9());
                  
            }
            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMConnectionSwitchAccess().getSemicolonKeyword_10());
                  
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
    // $ANTLR end "ruleMConnectionSwitch"


    // $ANTLR start "entryRuleMConnectionSwitchCase"
    // InternalMCAD.g:1208:1: entryRuleMConnectionSwitchCase returns [EObject current=null] : iv_ruleMConnectionSwitchCase= ruleMConnectionSwitchCase EOF ;
    public final EObject entryRuleMConnectionSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMConnectionSwitchCase = null;


        try {
            // InternalMCAD.g:1209:2: (iv_ruleMConnectionSwitchCase= ruleMConnectionSwitchCase EOF )
            // InternalMCAD.g:1210:2: iv_ruleMConnectionSwitchCase= ruleMConnectionSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMConnectionSwitchCaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMConnectionSwitchCase=ruleMConnectionSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMConnectionSwitchCase; 
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
    // $ANTLR end "entryRuleMConnectionSwitchCase"


    // $ANTLR start "ruleMConnectionSwitchCase"
    // InternalMCAD.g:1217:1: ruleMConnectionSwitchCase returns [EObject current=null] : ( () otherlv_1= 'case' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? ( (lv_attributeValueAssignments_14_0= ruleMAttributeValueAssignment ) )* otherlv_15= '}' otherlv_16= ';' ) ;
    public final EObject ruleMConnectionSwitchCase() throws RecognitionException {
        EObject current = null;

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
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_attributeValueAssignments_14_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:1220:28: ( ( () otherlv_1= 'case' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? ( (lv_attributeValueAssignments_14_0= ruleMAttributeValueAssignment ) )* otherlv_15= '}' otherlv_16= ';' ) )
            // InternalMCAD.g:1221:1: ( () otherlv_1= 'case' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? ( (lv_attributeValueAssignments_14_0= ruleMAttributeValueAssignment ) )* otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalMCAD.g:1221:1: ( () otherlv_1= 'case' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? ( (lv_attributeValueAssignments_14_0= ruleMAttributeValueAssignment ) )* otherlv_15= '}' otherlv_16= ';' )
            // InternalMCAD.g:1221:2: () otherlv_1= 'case' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'using' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= '{' (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? ( (lv_attributeValueAssignments_14_0= ruleMAttributeValueAssignment ) )* otherlv_15= '}' otherlv_16= ';'
            {
            // InternalMCAD.g:1221:2: ()
            // InternalMCAD.g:1222:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMConnectionSwitchCaseAccess().getMConnectionSwitchCaseAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMConnectionSwitchCaseAccess().getCaseKeyword_1());
                  
            }
            // InternalMCAD.g:1234:1: ( (otherlv_2= RULE_ID ) )
            // InternalMCAD.g:1235:1: (otherlv_2= RULE_ID )
            {
            // InternalMCAD.g:1235:1: (otherlv_2= RULE_ID )
            // InternalMCAD.g:1236:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeMDeploymentAlternativeCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMConnectionSwitchCaseAccess().getColonKeyword_3());
                  
            }
            // InternalMCAD.g:1254:1: ( (otherlv_4= RULE_ID ) )
            // InternalMCAD.g:1255:1: (otherlv_4= RULE_ID )
            {
            // InternalMCAD.g:1255:1: (otherlv_4= RULE_ID )
            // InternalMCAD.g:1256:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceMComponentInstanceCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMConnectionSwitchCaseAccess().getFullStopKeyword_5());
                  
            }
            // InternalMCAD.g:1274:1: ( (otherlv_6= RULE_ID ) )
            // InternalMCAD.g:1275:1: (otherlv_6= RULE_ID )
            {
            // InternalMCAD.g:1275:1: (otherlv_6= RULE_ID )
            // InternalMCAD.g:1276:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getMConnectionSwitchCaseAccess().getServerPortMServerPortCrossReference_6_0()); 
              	
            }

            }


            }

            otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMConnectionSwitchCaseAccess().getUsingKeyword_7());
                  
            }
            // InternalMCAD.g:1294:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalMCAD.g:1295:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalMCAD.g:1295:1: ( ruleVersionedQualifiedReferenceName )
            // InternalMCAD.g:1296:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorMConnectorCrossReference_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMConnectionSwitchCaseAccess().getLeftCurlyBracketKeyword_9());
                  
            }
            // InternalMCAD.g:1316:1: (otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMCAD.g:1316:3: otherlv_10= 'mapping' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,35,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getMConnectionSwitchCaseAccess().getMappingKeyword_10_0());
                          
                    }
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getMConnectionSwitchCaseAccess().getColonEqualsSignKeyword_10_1());
                          
                    }
                    // InternalMCAD.g:1324:1: ( ( ruleVersionedQualifiedName ) )
                    // InternalMCAD.g:1325:1: ( ruleVersionedQualifiedName )
                    {
                    // InternalMCAD.g:1325:1: ( ruleVersionedQualifiedName )
                    // InternalMCAD.g:1326:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMConnectionSwitchCaseRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_10_2_0()); 
                      	    
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

                    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_10_3());
                          
                    }

                    }
                    break;

            }

            // InternalMCAD.g:1346:3: ( (lv_attributeValueAssignments_14_0= ruleMAttributeValueAssignment ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMCAD.g:1347:1: (lv_attributeValueAssignments_14_0= ruleMAttributeValueAssignment )
            	    {
            	    // InternalMCAD.g:1347:1: (lv_attributeValueAssignments_14_0= ruleMAttributeValueAssignment )
            	    // InternalMCAD.g:1348:3: lv_attributeValueAssignments_14_0= ruleMAttributeValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMConnectionSwitchCaseAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_11_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_attributeValueAssignments_14_0=ruleMAttributeValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMConnectionSwitchCaseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_14_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getMConnectionSwitchCaseAccess().getRightCurlyBracketKeyword_12());
                  
            }
            otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_13());
                  
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
    // $ANTLR end "ruleMConnectionSwitchCase"


    // $ANTLR start "entryRuleMComponentInstance"
    // InternalMCAD.g:1380:1: entryRuleMComponentInstance returns [EObject current=null] : iv_ruleMComponentInstance= ruleMComponentInstance EOF ;
    public final EObject entryRuleMComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMComponentInstance = null;


        try {
            // InternalMCAD.g:1381:2: (iv_ruleMComponentInstance= ruleMComponentInstance EOF )
            // InternalMCAD.g:1382:2: iv_ruleMComponentInstance= ruleMComponentInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMComponentInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMComponentInstance=ruleMComponentInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMComponentInstance; 
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
    // $ANTLR end "entryRuleMComponentInstance"


    // $ANTLR start "ruleMComponentInstance"
    // InternalMCAD.g:1389:1: ruleMComponentInstance returns [EObject current=null] : ( () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleMComponentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_attributeValueAssignments_5_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:1392:28: ( ( () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalMCAD.g:1393:1: ( () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalMCAD.g:1393:1: ( () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalMCAD.g:1393:2: () otherlv_1= 'instance' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // InternalMCAD.g:1393:2: ()
            // InternalMCAD.g:1394:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMComponentInstanceAccess().getMComponentInstanceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMComponentInstanceAccess().getInstanceKeyword_1());
                  
            }
            // InternalMCAD.g:1406:1: ( ( ruleVersionedQualifiedName ) )
            // InternalMCAD.g:1407:1: ( ruleVersionedQualifiedName )
            {
            // InternalMCAD.g:1407:1: ( ruleVersionedQualifiedName )
            // InternalMCAD.g:1408:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMComponentInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); 
              	    
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

            // InternalMCAD.g:1424:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalMCAD.g:1425:1: (lv_name_3_0= RULE_ID )
            {
            // InternalMCAD.g:1425:1: (lv_name_3_0= RULE_ID )
            // InternalMCAD.g:1426:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMComponentInstanceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMComponentInstanceAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalMCAD.g:1446:1: ( (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMCAD.g:1447:1: (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment )
            	    {
            	    // InternalMCAD.g:1447:1: (lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment )
            	    // InternalMCAD.g:1448:3: lv_attributeValueAssignments_5_0= ruleMAttributeValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_attributeValueAssignments_5_0=ruleMAttributeValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMComponentInstanceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_5_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMComponentInstanceAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMComponentInstanceAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMComponentInstance"


    // $ANTLR start "entryRuleMServiceLibraryInstance"
    // InternalMCAD.g:1480:1: entryRuleMServiceLibraryInstance returns [EObject current=null] : iv_ruleMServiceLibraryInstance= ruleMServiceLibraryInstance EOF ;
    public final EObject entryRuleMServiceLibraryInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMServiceLibraryInstance = null;


        try {
            // InternalMCAD.g:1481:2: (iv_ruleMServiceLibraryInstance= ruleMServiceLibraryInstance EOF )
            // InternalMCAD.g:1482:2: iv_ruleMServiceLibraryInstance= ruleMServiceLibraryInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMServiceLibraryInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMServiceLibraryInstance=ruleMServiceLibraryInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMServiceLibraryInstance; 
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
    // $ANTLR end "entryRuleMServiceLibraryInstance"


    // $ANTLR start "ruleMServiceLibraryInstance"
    // InternalMCAD.g:1489:1: ruleMServiceLibraryInstance returns [EObject current=null] : (this_MRegularServiceLibraryInstance_0= ruleMRegularServiceLibraryInstance | this_MDriverSLibInstance_1= ruleMDriverSLibInstance ) ;
    public final EObject ruleMServiceLibraryInstance() throws RecognitionException {
        EObject current = null;

        EObject this_MRegularServiceLibraryInstance_0 = null;

        EObject this_MDriverSLibInstance_1 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:1492:28: ( (this_MRegularServiceLibraryInstance_0= ruleMRegularServiceLibraryInstance | this_MDriverSLibInstance_1= ruleMDriverSLibInstance ) )
            // InternalMCAD.g:1493:1: (this_MRegularServiceLibraryInstance_0= ruleMRegularServiceLibraryInstance | this_MDriverSLibInstance_1= ruleMDriverSLibInstance )
            {
            // InternalMCAD.g:1493:1: (this_MRegularServiceLibraryInstance_0= ruleMRegularServiceLibraryInstance | this_MDriverSLibInstance_1= ruleMDriverSLibInstance )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( (LA24_0==41) ) {
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
                    // InternalMCAD.g:1494:2: this_MRegularServiceLibraryInstance_0= ruleMRegularServiceLibraryInstance
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMServiceLibraryInstanceAccess().getMRegularServiceLibraryInstanceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MRegularServiceLibraryInstance_0=ruleMRegularServiceLibraryInstance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MRegularServiceLibraryInstance_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalMCAD.g:1507:2: this_MDriverSLibInstance_1= ruleMDriverSLibInstance
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMServiceLibraryInstanceAccess().getMDriverSLibInstanceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MDriverSLibInstance_1=ruleMDriverSLibInstance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MDriverSLibInstance_1; 
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
    // $ANTLR end "ruleMServiceLibraryInstance"


    // $ANTLR start "entryRuleMRegularServiceLibraryInstance"
    // InternalMCAD.g:1526:1: entryRuleMRegularServiceLibraryInstance returns [EObject current=null] : iv_ruleMRegularServiceLibraryInstance= ruleMRegularServiceLibraryInstance EOF ;
    public final EObject entryRuleMRegularServiceLibraryInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRegularServiceLibraryInstance = null;


        try {
            // InternalMCAD.g:1527:2: (iv_ruleMRegularServiceLibraryInstance= ruleMRegularServiceLibraryInstance EOF )
            // InternalMCAD.g:1528:2: iv_ruleMRegularServiceLibraryInstance= ruleMRegularServiceLibraryInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMRegularServiceLibraryInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMRegularServiceLibraryInstance=ruleMRegularServiceLibraryInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMRegularServiceLibraryInstance; 
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
    // $ANTLR end "entryRuleMRegularServiceLibraryInstance"


    // $ANTLR start "ruleMRegularServiceLibraryInstance"
    // InternalMCAD.g:1535:1: ruleMRegularServiceLibraryInstance returns [EObject current=null] : (otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleMRegularServiceLibraryInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_attributeValueAssignments_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:1538:28: ( (otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalMCAD.g:1539:1: (otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalMCAD.g:1539:1: (otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalMCAD.g:1539:3: otherlv_0= 'library' ( ( ruleVersionedQualifiedName ) ) otherlv_2= '{' ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )* otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryKeyword_0());
                  
            }
            // InternalMCAD.g:1543:1: ( ( ruleVersionedQualifiedName ) )
            // InternalMCAD.g:1544:1: ( ruleVersionedQualifiedName )
            {
            // InternalMCAD.g:1544:1: ( ruleVersionedQualifiedName )
            // InternalMCAD.g:1545:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMRegularServiceLibraryInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMRegularServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalMCAD.g:1565:1: ( (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMCAD.g:1566:1: (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment )
            	    {
            	    // InternalMCAD.g:1566:1: (lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment )
            	    // InternalMCAD.g:1567:3: lv_attributeValueAssignments_3_0= ruleMAttributeValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMRegularServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_attributeValueAssignments_3_0=ruleMAttributeValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMRegularServiceLibraryInstanceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeValueAssignments",
            	              		lv_attributeValueAssignments_3_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMRegularServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMRegularServiceLibraryInstanceAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleMRegularServiceLibraryInstance"


    // $ANTLR start "entryRuleMDriverSLibInstance"
    // InternalMCAD.g:1599:1: entryRuleMDriverSLibInstance returns [EObject current=null] : iv_ruleMDriverSLibInstance= ruleMDriverSLibInstance EOF ;
    public final EObject entryRuleMDriverSLibInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDriverSLibInstance = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // InternalMCAD.g:1605:2: (iv_ruleMDriverSLibInstance= ruleMDriverSLibInstance EOF )
            // InternalMCAD.g:1606:2: iv_ruleMDriverSLibInstance= ruleMDriverSLibInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMDriverSLibInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMDriverSLibInstance=ruleMDriverSLibInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMDriverSLibInstance; 
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
    // $ANTLR end "entryRuleMDriverSLibInstance"


    // $ANTLR start "ruleMDriverSLibInstance"
    // InternalMCAD.g:1616:1: ruleMDriverSLibInstance returns [EObject current=null] : ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' ) ;
    public final EObject ruleMDriverSLibInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_attributeValueAssignments_8_0 = null;

        EObject lv_deviceDriverMappings_14_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4()
        		);
            
        try {
            // InternalMCAD.g:1622:28: ( ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' ) )
            // InternalMCAD.g:1623:1: ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' )
            {
            // InternalMCAD.g:1623:1: ( () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';' )
            // InternalMCAD.g:1623:2: () otherlv_1= 'driver' ( ( ruleVersionedQualifiedName ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' otherlv_18= ';'
            {
            // InternalMCAD.g:1623:2: ()
            // InternalMCAD.g:1624:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMDriverSLibInstanceAccess().getMDriverSLibInstanceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMDriverSLibInstanceAccess().getDriverKeyword_1());
                  
            }
            // InternalMCAD.g:1636:1: ( ( ruleVersionedQualifiedName ) )
            // InternalMCAD.g:1637:1: ( ruleVersionedQualifiedName )
            {
            // InternalMCAD.g:1637:1: ( ruleVersionedQualifiedName )
            // InternalMCAD.g:1638:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMDriverSLibInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalMCAD.g:1658:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) ) )
            // InternalMCAD.g:1660:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) )
            {
            // InternalMCAD.g:1660:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* ) )
            // InternalMCAD.g:1661:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());
            // InternalMCAD.g:1664:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )* )
            // InternalMCAD.g:1665:3: ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )*
            {
            // InternalMCAD.g:1665:3: ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMCAD.g:1667:4: ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:1667:4: ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
            	    // InternalMCAD.g:1668:5: {...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDriverSLibInstance", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalMCAD.g:1668:116: ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
            	    // InternalMCAD.g:1669:6: ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0);
            	    // InternalMCAD.g:1672:6: ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
            	    // InternalMCAD.g:1672:7: {...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDriverSLibInstance", "true");
            	    }
            	    // InternalMCAD.g:1672:16: (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
            	    // InternalMCAD.g:1672:18: otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';'
            	    {
            	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMDriverSLibInstanceAccess().getAttributeKeyword_4_0_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMDriverSLibInstanceAccess().getValuesKeyword_4_0_1());
            	          
            	    }
            	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2());
            	          
            	    }
            	    // InternalMCAD.g:1684:1: ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+
            	    int cnt26=0;
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==20) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // InternalMCAD.g:1685:1: (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment )
            	    	    {
            	    	    // InternalMCAD.g:1685:1: (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment )
            	    	    // InternalMCAD.g:1686:3: lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_attributeValueAssignments_8_0=ruleMAttributeValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMDriverSLibInstanceRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributeValueAssignments",
            	    	              		lv_attributeValueAssignments_8_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt26 >= 1 ) break loop26;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(26, input);
            	                throw eee;
            	        }
            	        cnt26++;
            	    } while (true);

            	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4());
            	          
            	    }
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMCAD.g:1717:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:1717:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
            	    // InternalMCAD.g:1718:5: {...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDriverSLibInstance", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalMCAD.g:1718:116: ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
            	    // InternalMCAD.g:1719:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1);
            	    // InternalMCAD.g:1722:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
            	    // InternalMCAD.g:1722:7: {...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDriverSLibInstance", "true");
            	    }
            	    // InternalMCAD.g:1722:16: (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
            	    // InternalMCAD.g:1722:18: otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';'
            	    {
            	    otherlv_11=(Token)match(input,42,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMDriverSLibInstanceAccess().getDeviceKeyword_4_1_0());
            	          
            	    }
            	    otherlv_12=(Token)match(input,43,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMDriverSLibInstanceAccess().getMappingsKeyword_4_1_1());
            	          
            	    }
            	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2());
            	          
            	    }
            	    // InternalMCAD.g:1734:1: ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+
            	    int cnt27=0;
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==44) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalMCAD.g:1735:1: (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping )
            	    	    {
            	    	    // InternalMCAD.g:1735:1: (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping )
            	    	    // InternalMCAD.g:1736:3: lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsMDeviceDriverMappingParserRuleCall_4_1_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_40);
            	    	    lv_deviceDriverMappings_14_0=ruleMDeviceDriverMapping();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMDriverSLibInstanceRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deviceDriverMappings",
            	    	              		lv_deviceDriverMappings_14_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeviceDriverMapping");
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

            	    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4());
            	          
            	    }
            	    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());

            }

            otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMDriverSLibInstance"


    // $ANTLR start "entryRuleMDeviceDriverMapping"
    // InternalMCAD.g:1793:1: entryRuleMDeviceDriverMapping returns [EObject current=null] : iv_ruleMDeviceDriverMapping= ruleMDeviceDriverMapping EOF ;
    public final EObject entryRuleMDeviceDriverMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDeviceDriverMapping = null;


        try {
            // InternalMCAD.g:1794:2: (iv_ruleMDeviceDriverMapping= ruleMDeviceDriverMapping EOF )
            // InternalMCAD.g:1795:2: iv_ruleMDeviceDriverMapping= ruleMDeviceDriverMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMDeviceDriverMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMDeviceDriverMapping=ruleMDeviceDriverMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMDeviceDriverMapping; 
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
    // $ANTLR end "entryRuleMDeviceDriverMapping"


    // $ANTLR start "ruleMDeviceDriverMapping"
    // InternalMCAD.g:1802:1: ruleMDeviceDriverMapping returns [EObject current=null] : (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' ) ;
    public final EObject ruleMDeviceDriverMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalMCAD.g:1805:28: ( (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' ) )
            // InternalMCAD.g:1806:1: (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' )
            {
            // InternalMCAD.g:1806:1: (otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';' )
            // InternalMCAD.g:1806:3: otherlv_0= 'supported' otherlv_1= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_3= '->' otherlv_4= 'deployed' otherlv_5= 'device' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMDeviceDriverMappingAccess().getSupportedKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_1());
                  
            }
            // InternalMCAD.g:1814:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalMCAD.g:1815:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalMCAD.g:1815:1: ( ruleVersionedQualifiedReferenceName )
            // InternalMCAD.g:1816:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMDeviceDriverMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_42);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMDeviceDriverMappingAccess().getDeployedKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_5());
                  
            }
            // InternalMCAD.g:1844:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalMCAD.g:1845:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalMCAD.g:1845:1: ( ruleVersionedQualifiedReferenceName )
            // InternalMCAD.g:1846:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMDeviceDriverMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMDeviceDriverMappingAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMDeviceDriverMapping"


    // $ANTLR start "entryRuleMDeploymentAlternative"
    // InternalMCAD.g:1874:1: entryRuleMDeploymentAlternative returns [EObject current=null] : iv_ruleMDeploymentAlternative= ruleMDeploymentAlternative EOF ;
    public final EObject entryRuleMDeploymentAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDeploymentAlternative = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5()
        		);
        	
        try {
            // InternalMCAD.g:1880:2: (iv_ruleMDeploymentAlternative= ruleMDeploymentAlternative EOF )
            // InternalMCAD.g:1881:2: iv_ruleMDeploymentAlternative= ruleMDeploymentAlternative EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMDeploymentAlternativeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMDeploymentAlternative=ruleMDeploymentAlternative();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMDeploymentAlternative; 
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
    // $ANTLR end "entryRuleMDeploymentAlternative"


    // $ANTLR start "ruleMDeploymentAlternative"
    // InternalMCAD.g:1891:1: ruleMDeploymentAlternative returns [EObject current=null] : ( () otherlv_1= 'deployment' otherlv_2= 'alternative' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?) ) ) otherlv_40= '}' otherlv_41= ';' ) ;
    public final EObject ruleMDeploymentAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        EObject lv_attributeValueAssignments_16_0 = null;

        EObject lv_deploymentAlternatives_22_0 = null;

        EObject lv_components_27_0 = null;

        EObject lv_connections_32_0 = null;

        EObject lv_libraries_37_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5()
        		);
            
        try {
            // InternalMCAD.g:1897:28: ( ( () otherlv_1= 'deployment' otherlv_2= 'alternative' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?) ) ) otherlv_40= '}' otherlv_41= ';' ) )
            // InternalMCAD.g:1898:1: ( () otherlv_1= 'deployment' otherlv_2= 'alternative' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?) ) ) otherlv_40= '}' otherlv_41= ';' )
            {
            // InternalMCAD.g:1898:1: ( () otherlv_1= 'deployment' otherlv_2= 'alternative' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?) ) ) otherlv_40= '}' otherlv_41= ';' )
            // InternalMCAD.g:1898:2: () otherlv_1= 'deployment' otherlv_2= 'alternative' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?) ) ) otherlv_40= '}' otherlv_41= ';'
            {
            // InternalMCAD.g:1898:2: ()
            // InternalMCAD.g:1899:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMDeploymentAlternativeAccess().getMDeploymentAlternativeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMDeploymentAlternativeAccess().getAlternativeKeyword_2());
                  
            }
            // InternalMCAD.g:1915:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalMCAD.g:1916:1: (lv_name_3_0= RULE_ID )
            {
            // InternalMCAD.g:1916:1: (lv_name_3_0= RULE_ID )
            // InternalMCAD.g:1917:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMDeploymentAlternativeAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMDeploymentAlternativeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalMCAD.g:1937:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?) ) )
            // InternalMCAD.g:1939:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalMCAD.g:1939:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?) )
            // InternalMCAD.g:1940:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
            // InternalMCAD.g:1943:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?)
            // InternalMCAD.g:1944:3: ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+ {...}?
            {
            // InternalMCAD.g:1944:3: ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=7;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==15) ) {
                    int LA35_2 = input.LA(2);

                    if ( LA35_2 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2) ) {
                        alt35=3;
                    }
                    else if ( LA35_2 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0) ) {
                        alt35=1;
                    }


                }
                else if ( LA35_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1) ) {
                    alt35=2;
                }
                else if ( LA35_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3) ) {
                    alt35=4;
                }
                else if ( LA35_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4) ) {
                    alt35=5;
                }
                else if ( LA35_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5) ) {
                    alt35=6;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMCAD.g:1946:4: ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:1946:4: ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) )
            	    // InternalMCAD.g:1947:5: {...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalMCAD.g:1947:119: ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) )
            	    // InternalMCAD.g:1948:6: ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0);
            	    // InternalMCAD.g:1951:6: ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) )
            	    // InternalMCAD.g:1951:7: {...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "true");
            	    }
            	    // InternalMCAD.g:1951:16: (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' )
            	    // InternalMCAD.g:1951:18: otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_0_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMDeploymentAlternativeAccess().getPlatformsKeyword_5_0_1());
            	          
            	    }
            	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMDeploymentAlternativeAccess().getColonEqualsSignKeyword_5_0_2());
            	          
            	    }
            	    // InternalMCAD.g:1963:1: ( (otherlv_9= RULE_ID ) )
            	    // InternalMCAD.g:1964:1: (otherlv_9= RULE_ID )
            	    {
            	    // InternalMCAD.g:1964:1: (otherlv_9= RULE_ID )
            	    // InternalMCAD.g:1965:3: otherlv_9= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMDeploymentAlternativeRule());
            	      	        }
            	              
            	    }
            	    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_9, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // InternalMCAD.g:1979:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==48) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalMCAD.g:1979:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_10, grammarAccess.getMDeploymentAlternativeAccess().getCommaKeyword_5_0_4_0());
            	    	          
            	    	    }
            	    	    // InternalMCAD.g:1983:1: ( (otherlv_11= RULE_ID ) )
            	    	    // InternalMCAD.g:1984:1: (otherlv_11= RULE_ID )
            	    	    {
            	    	    // InternalMCAD.g:1984:1: (otherlv_11= RULE_ID )
            	    	    // InternalMCAD.g:1985:3: otherlv_11= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getMDeploymentAlternativeRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		newLeafNode(otherlv_11, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0()); 
            	    	      	
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_0_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMCAD.g:2010:4: ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:2010:4: ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
            	    // InternalMCAD.g:2011:5: {...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalMCAD.g:2011:119: ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
            	    // InternalMCAD.g:2012:6: ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1);
            	    // InternalMCAD.g:2015:6: ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) )
            	    // InternalMCAD.g:2015:7: {...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "true");
            	    }
            	    // InternalMCAD.g:2015:16: (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' )
            	    // InternalMCAD.g:2015:18: otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';'
            	    {
            	    otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMDeploymentAlternativeAccess().getAttributeKeyword_5_1_0());
            	          
            	    }
            	    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMDeploymentAlternativeAccess().getValuesKeyword_5_1_1());
            	          
            	    }
            	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_1_2());
            	          
            	    }
            	    // InternalMCAD.g:2027:1: ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+
            	    int cnt30=0;
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==20) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalMCAD.g:2028:1: (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment )
            	    	    {
            	    	    // InternalMCAD.g:2028:1: (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment )
            	    	    // InternalMCAD.g:2029:3: lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_attributeValueAssignments_16_0=ruleMAttributeValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributeValueAssignments",
            	    	              		lv_attributeValueAssignments_16_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MAttributeValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
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

            	    otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_1_4());
            	          
            	    }
            	    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_1_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMCAD.g:2060:4: ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:2060:4: ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) )
            	    // InternalMCAD.g:2061:5: {...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalMCAD.g:2061:119: ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) )
            	    // InternalMCAD.g:2062:6: ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2);
            	    // InternalMCAD.g:2065:6: ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) )
            	    // InternalMCAD.g:2065:7: {...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "true");
            	    }
            	    // InternalMCAD.g:2065:16: (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' )
            	    // InternalMCAD.g:2065:18: otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';'
            	    {
            	    otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_2_0());
            	          
            	    }
            	    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMDeploymentAlternativeAccess().getAlternativesKeyword_5_2_1());
            	          
            	    }
            	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_2_2());
            	          
            	    }
            	    // InternalMCAD.g:2077:1: ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+
            	    int cnt31=0;
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==15) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalMCAD.g:2078:1: (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative )
            	    	    {
            	    	    // InternalMCAD.g:2078:1: (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative )
            	    	    // InternalMCAD.g:2079:3: lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_2_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
            	    	    lv_deploymentAlternatives_22_0=ruleMDeploymentAlternative();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deploymentAlternatives",
            	    	              		lv_deploymentAlternatives_22_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeploymentAlternative");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt31 >= 1 ) break loop31;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(31, input);
            	                throw eee;
            	        }
            	        cnt31++;
            	    } while (true);

            	    otherlv_23=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_2_4());
            	          
            	    }
            	    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_24, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMCAD.g:2110:4: ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:2110:4: ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) )
            	    // InternalMCAD.g:2111:5: {...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalMCAD.g:2111:119: ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) )
            	    // InternalMCAD.g:2112:6: ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3);
            	    // InternalMCAD.g:2115:6: ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) )
            	    // InternalMCAD.g:2115:7: {...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "true");
            	    }
            	    // InternalMCAD.g:2115:16: (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' )
            	    // InternalMCAD.g:2115:18: otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';'
            	    {
            	    otherlv_25=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getMDeploymentAlternativeAccess().getComponentsKeyword_5_3_0());
            	          
            	    }
            	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_26, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_3_1());
            	          
            	    }
            	    // InternalMCAD.g:2123:1: ( (lv_components_27_0= ruleMComponentInstance ) )+
            	    int cnt32=0;
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==39) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalMCAD.g:2124:1: (lv_components_27_0= ruleMComponentInstance )
            	    	    {
            	    	    // InternalMCAD.g:2124:1: (lv_components_27_0= ruleMComponentInstance )
            	    	    // InternalMCAD.g:2125:3: lv_components_27_0= ruleMComponentInstance
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getComponentsMComponentInstanceParserRuleCall_5_3_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_20);
            	    	    lv_components_27_0=ruleMComponentInstance();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"components",
            	    	              		lv_components_27_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MComponentInstance");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt32 >= 1 ) break loop32;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(32, input);
            	                throw eee;
            	        }
            	        cnt32++;
            	    } while (true);

            	    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_28, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_3_3());
            	          
            	    }
            	    otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_3_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMCAD.g:2156:4: ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:2156:4: ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) )
            	    // InternalMCAD.g:2157:5: {...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalMCAD.g:2157:119: ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) )
            	    // InternalMCAD.g:2158:6: ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4);
            	    // InternalMCAD.g:2161:6: ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) )
            	    // InternalMCAD.g:2161:7: {...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "true");
            	    }
            	    // InternalMCAD.g:2161:16: (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' )
            	    // InternalMCAD.g:2161:18: otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';'
            	    {
            	    otherlv_30=(Token)match(input,26,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_30, grammarAccess.getMDeploymentAlternativeAccess().getConnectionsKeyword_5_4_0());
            	          
            	    }
            	    otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_4_1());
            	          
            	    }
            	    // InternalMCAD.g:2169:1: ( (lv_connections_32_0= ruleMConnection ) )+
            	    int cnt33=0;
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==32||LA33_0==36) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalMCAD.g:2170:1: (lv_connections_32_0= ruleMConnection )
            	    	    {
            	    	    // InternalMCAD.g:2170:1: (lv_connections_32_0= ruleMConnection )
            	    	    // InternalMCAD.g:2171:3: lv_connections_32_0= ruleMConnection
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsMConnectionParserRuleCall_5_4_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_22);
            	    	    lv_connections_32_0=ruleMConnection();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"connections",
            	    	              		lv_connections_32_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MConnection");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt33 >= 1 ) break loop33;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(33, input);
            	                throw eee;
            	        }
            	        cnt33++;
            	    } while (true);

            	    otherlv_33=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_33, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_4_3());
            	          
            	    }
            	    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_34, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_4_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMCAD.g:2202:4: ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:2202:4: ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) )
            	    // InternalMCAD.g:2203:5: {...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalMCAD.g:2203:119: ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) )
            	    // InternalMCAD.g:2204:6: ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5);
            	    // InternalMCAD.g:2207:6: ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) )
            	    // InternalMCAD.g:2207:7: {...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "true");
            	    }
            	    // InternalMCAD.g:2207:16: (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' )
            	    // InternalMCAD.g:2207:18: otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';'
            	    {
            	    otherlv_35=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_35, grammarAccess.getMDeploymentAlternativeAccess().getLibrariesKeyword_5_5_0());
            	          
            	    }
            	    otherlv_36=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_36, grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_5_1());
            	          
            	    }
            	    // InternalMCAD.g:2215:1: ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( ((LA34_0>=40 && LA34_0<=41)) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalMCAD.g:2216:1: (lv_libraries_37_0= ruleMServiceLibraryInstance )
            	    	    {
            	    	    // InternalMCAD.g:2216:1: (lv_libraries_37_0= ruleMServiceLibraryInstance )
            	    	    // InternalMCAD.g:2217:3: lv_libraries_37_0= ruleMServiceLibraryInstance
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_5_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_24);
            	    	    lv_libraries_37_0=ruleMServiceLibraryInstance();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMDeploymentAlternativeRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"libraries",
            	    	              		lv_libraries_37_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MServiceLibraryInstance");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt34 >= 1 ) break loop34;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);

            	    otherlv_38=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_38, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_5_3());
            	          
            	    }
            	    otherlv_39=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_39, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_5_4());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMDeploymentAlternative", "getUnorderedGroupHelper().canLeave(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());

            }

            otherlv_40=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_40, grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_41=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_41, grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleMDeploymentAlternative"


    // $ANTLR start "entryRuleMDeploymentPlatform"
    // InternalMCAD.g:2275:1: entryRuleMDeploymentPlatform returns [EObject current=null] : iv_ruleMDeploymentPlatform= ruleMDeploymentPlatform EOF ;
    public final EObject entryRuleMDeploymentPlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDeploymentPlatform = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4()
        		);
        	
        try {
            // InternalMCAD.g:2281:2: (iv_ruleMDeploymentPlatform= ruleMDeploymentPlatform EOF )
            // InternalMCAD.g:2282:2: iv_ruleMDeploymentPlatform= ruleMDeploymentPlatform EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMDeploymentPlatformRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMDeploymentPlatform=ruleMDeploymentPlatform();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMDeploymentPlatform; 
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
    // $ANTLR end "entryRuleMDeploymentPlatform"


    // $ANTLR start "ruleMDeploymentPlatform"
    // InternalMCAD.g:2292:1: ruleMDeploymentPlatform returns [EObject current=null] : (otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' otherlv_22= ';' ) ;
    public final EObject ruleMDeploymentPlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_deployedDevices_12_0 = null;

        EObject lv_parameterValueAssignments_18_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4()
        		);
            
        try {
            // InternalMCAD.g:2298:28: ( (otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' otherlv_22= ';' ) )
            // InternalMCAD.g:2299:1: (otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalMCAD.g:2299:1: (otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' otherlv_22= ';' )
            // InternalMCAD.g:2299:3: otherlv_0= 'deployment' otherlv_1= 'platform' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMDeploymentPlatformAccess().getDeploymentKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_1());
                  
            }
            // InternalMCAD.g:2307:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalMCAD.g:2308:1: (lv_name_2_0= RULE_ID )
            {
            // InternalMCAD.g:2308:1: (lv_name_2_0= RULE_ID )
            // InternalMCAD.g:2309:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMDeploymentPlatformRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalMCAD.g:2329:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // InternalMCAD.g:2331:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalMCAD.g:2331:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // InternalMCAD.g:2332:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());
            // InternalMCAD.g:2335:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?)
            // InternalMCAD.g:2336:3: ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // InternalMCAD.g:2336:3: ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=4;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2) ) {
                    alt38=3;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMCAD.g:2338:4: ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:2338:4: ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) )
            	    // InternalMCAD.g:2339:5: {...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalMCAD.g:2339:116: ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) )
            	    // InternalMCAD.g:2340:6: ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0);
            	    // InternalMCAD.g:2343:6: ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) )
            	    // InternalMCAD.g:2343:7: {...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentPlatform", "true");
            	    }
            	    // InternalMCAD.g:2343:16: (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' )
            	    // InternalMCAD.g:2343:18: otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_4_0_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1());
            	          
            	    }
            	    // InternalMCAD.g:2351:1: ( ( ruleVersionedQualifiedName ) )
            	    // InternalMCAD.g:2352:1: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalMCAD.g:2352:1: ( ruleVersionedQualifiedName )
            	    // InternalMCAD.g:2353:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMDeploymentPlatformRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0()); 
            	      	    
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

            	    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMCAD.g:2380:4: ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:2380:4: ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) )
            	    // InternalMCAD.g:2381:5: {...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalMCAD.g:2381:116: ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) )
            	    // InternalMCAD.g:2382:6: ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1);
            	    // InternalMCAD.g:2385:6: ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) )
            	    // InternalMCAD.g:2385:7: {...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentPlatform", "true");
            	    }
            	    // InternalMCAD.g:2385:16: (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' )
            	    // InternalMCAD.g:2385:18: otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';'
            	    {
            	    otherlv_9=(Token)match(input,46,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMDeploymentPlatformAccess().getDeployedKeyword_4_1_0());
            	          
            	    }
            	    otherlv_10=(Token)match(input,50,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getMDeploymentPlatformAccess().getDevicesKeyword_4_1_1());
            	          
            	    }
            	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_1_2());
            	          
            	    }
            	    // InternalMCAD.g:2397:1: ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==42) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalMCAD.g:2398:1: (lv_deployedDevices_12_0= ruleMDeployedDevice )
            	    	    {
            	    	    // InternalMCAD.g:2398:1: (lv_deployedDevices_12_0= ruleMDeployedDevice )
            	    	    // InternalMCAD.g:2399:3: lv_deployedDevices_12_0= ruleMDeployedDevice
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesMDeployedDeviceParserRuleCall_4_1_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_52);
            	    	    lv_deployedDevices_12_0=ruleMDeployedDevice();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMDeploymentPlatformRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"deployedDevices",
            	    	              		lv_deployedDevices_12_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MDeployedDevice");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt36 >= 1 ) break loop36;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);

            	    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_1_4());
            	          
            	    }
            	    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_1_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMCAD.g:2430:4: ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) )
            	    {
            	    // InternalMCAD.g:2430:4: ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) )
            	    // InternalMCAD.g:2431:5: {...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentPlatform", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalMCAD.g:2431:116: ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) )
            	    // InternalMCAD.g:2432:6: ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2);
            	    // InternalMCAD.g:2435:6: ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) )
            	    // InternalMCAD.g:2435:7: {...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMDeploymentPlatform", "true");
            	    }
            	    // InternalMCAD.g:2435:16: (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' )
            	    // InternalMCAD.g:2435:18: otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';'
            	    {
            	    otherlv_15=(Token)match(input,51,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMDeploymentPlatformAccess().getParameterKeyword_4_2_0());
            	          
            	    }
            	    otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getMDeploymentPlatformAccess().getValuesKeyword_4_2_1());
            	          
            	    }
            	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2());
            	          
            	    }
            	    // InternalMCAD.g:2447:1: ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+
            	    int cnt37=0;
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==51) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // InternalMCAD.g:2448:1: (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment )
            	    	    {
            	    	    // InternalMCAD.g:2448:1: (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment )
            	    	    // InternalMCAD.g:2449:3: lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_2_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_54);
            	    	    lv_parameterValueAssignments_18_0=ruleMParameterValueAssignment();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMDeploymentPlatformRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"parameterValueAssignments",
            	    	              		lv_parameterValueAssignments_18_0, 
            	    	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueAssignment");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt37 >= 1 ) break loop37;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(37, input);
            	                throw eee;
            	        }
            	        cnt37++;
            	    } while (true);

            	    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4());
            	          
            	    }
            	    otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_2_5());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMDeploymentPlatform", "getUnorderedGroupHelper().canLeave(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());

            }

            otherlv_21=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMDeploymentPlatform"


    // $ANTLR start "entryRuleMDeployedDevice"
    // InternalMCAD.g:2507:1: entryRuleMDeployedDevice returns [EObject current=null] : iv_ruleMDeployedDevice= ruleMDeployedDevice EOF ;
    public final EObject entryRuleMDeployedDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDeployedDevice = null;


        try {
            // InternalMCAD.g:2508:2: (iv_ruleMDeployedDevice= ruleMDeployedDevice EOF )
            // InternalMCAD.g:2509:2: iv_ruleMDeployedDevice= ruleMDeployedDevice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMDeployedDeviceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMDeployedDevice=ruleMDeployedDevice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMDeployedDevice; 
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
    // $ANTLR end "entryRuleMDeployedDevice"


    // $ANTLR start "ruleMDeployedDevice"
    // InternalMCAD.g:2516:1: ruleMDeployedDevice returns [EObject current=null] : (otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' ) ;
    public final EObject ruleMDeployedDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameterValueAssignments_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:2519:28: ( (otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // InternalMCAD.g:2520:1: (otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalMCAD.g:2520:1: (otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';' )
            // InternalMCAD.g:2520:3: otherlv_0= 'device' ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )* otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMDeployedDeviceAccess().getDeviceKeyword_0());
                  
            }
            // InternalMCAD.g:2524:1: ( ( ruleVersionedQualifiedName ) )
            // InternalMCAD.g:2525:1: ( ruleVersionedQualifiedName )
            {
            // InternalMCAD.g:2525:1: ( ruleVersionedQualifiedName )
            // InternalMCAD.g:2526:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMDeployedDeviceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); 
              	    
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

            // InternalMCAD.g:2542:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalMCAD.g:2543:1: (lv_name_2_0= RULE_ID )
            {
            // InternalMCAD.g:2543:1: (lv_name_2_0= RULE_ID )
            // InternalMCAD.g:2544:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMDeployedDeviceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMDeployedDeviceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalMCAD.g:2564:1: ( (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==51) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMCAD.g:2565:1: (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment )
            	    {
            	    // InternalMCAD.g:2565:1: (lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment )
            	    // InternalMCAD.g:2566:3: lv_parameterValueAssignments_4_0= ruleMParameterValueAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    lv_parameterValueAssignments_4_0=ruleMParameterValueAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMDeployedDeviceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameterValueAssignments",
            	              		lv_parameterValueAssignments_4_0, 
            	              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMDeployedDeviceAccess().getRightCurlyBracketKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMDeployedDeviceAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleMDeployedDevice"


    // $ANTLR start "entryRuleMAttributeValueAssignment"
    // InternalMCAD.g:2598:1: entryRuleMAttributeValueAssignment returns [EObject current=null] : iv_ruleMAttributeValueAssignment= ruleMAttributeValueAssignment EOF ;
    public final EObject entryRuleMAttributeValueAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMAttributeValueAssignment = null;


        try {
            // InternalMCAD.g:2599:2: (iv_ruleMAttributeValueAssignment= ruleMAttributeValueAssignment EOF )
            // InternalMCAD.g:2600:2: iv_ruleMAttributeValueAssignment= ruleMAttributeValueAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMAttributeValueAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMAttributeValueAssignment=ruleMAttributeValueAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMAttributeValueAssignment; 
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
    // $ANTLR end "entryRuleMAttributeValueAssignment"


    // $ANTLR start "ruleMAttributeValueAssignment"
    // InternalMCAD.g:2607:1: ruleMAttributeValueAssignment returns [EObject current=null] : (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleMAttributeValueAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:2610:28: ( (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) )
            // InternalMCAD.g:2611:1: (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            {
            // InternalMCAD.g:2611:1: (otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            // InternalMCAD.g:2611:3: otherlv_0= 'attribute' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMAttributeValueAssignmentAccess().getAttributeKeyword_0());
                  
            }
            // InternalMCAD.g:2615:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalMCAD.g:2616:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalMCAD.g:2616:1: ( ruleVersionedQualifiedReferenceName )
            // InternalMCAD.g:2617:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMAttributeValueAssignmentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMAttributeValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_9);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMAttributeValueAssignmentAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalMCAD.g:2637:1: ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) )
            // InternalMCAD.g:2638:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            {
            // InternalMCAD.g:2638:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            // InternalMCAD.g:2639:3: lv_parameterValue_3_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_parameterValue_3_0=ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMAttributeValueAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"parameterValue",
                      		lv_parameterValue_3_0, 
                      		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMAttributeValueAssignmentAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleMAttributeValueAssignment"


    // $ANTLR start "entryRuleMParameterValueAssignment"
    // InternalMCAD.g:2667:1: entryRuleMParameterValueAssignment returns [EObject current=null] : iv_ruleMParameterValueAssignment= ruleMParameterValueAssignment EOF ;
    public final EObject entryRuleMParameterValueAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueAssignment = null;


        try {
            // InternalMCAD.g:2668:2: (iv_ruleMParameterValueAssignment= ruleMParameterValueAssignment EOF )
            // InternalMCAD.g:2669:2: iv_ruleMParameterValueAssignment= ruleMParameterValueAssignment EOF
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
    // InternalMCAD.g:2676:1: ruleMParameterValueAssignment returns [EObject current=null] : (otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleMParameterValueAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:2679:28: ( (otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' ) )
            // InternalMCAD.g:2680:1: (otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            {
            // InternalMCAD.g:2680:1: (otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';' )
            // InternalMCAD.g:2680:3: otherlv_0= 'parameter' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_2= ':=' ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValueAssignmentAccess().getParameterKeyword_0());
                  
            }
            // InternalMCAD.g:2684:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalMCAD.g:2685:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalMCAD.g:2685:1: ( ruleVersionedQualifiedReferenceName )
            // InternalMCAD.g:2686:3: ruleVersionedQualifiedReferenceName
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
            pushFollow(FollowSets000.FOLLOW_9);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMParameterValueAssignmentAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalMCAD.g:2706:1: ( (lv_parameterValue_3_0= ruleMParameterValueExpression ) )
            // InternalMCAD.g:2707:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            {
            // InternalMCAD.g:2707:1: (lv_parameterValue_3_0= ruleMParameterValueExpression )
            // InternalMCAD.g:2708:3: lv_parameterValue_3_0= ruleMParameterValueExpression
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
                      		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpression");
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


    // $ANTLR start "entryRuleMParameterValue"
    // InternalMCAD.g:2736:1: entryRuleMParameterValue returns [EObject current=null] : iv_ruleMParameterValue= ruleMParameterValue EOF ;
    public final EObject entryRuleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValue = null;


        try {
            // InternalMCAD.g:2737:2: (iv_ruleMParameterValue= ruleMParameterValue EOF )
            // InternalMCAD.g:2738:2: iv_ruleMParameterValue= ruleMParameterValue EOF
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
    // InternalMCAD.g:2745:1: ruleMParameterValue returns [EObject current=null] : (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) ;
    public final EObject ruleMParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueLiteral_0 = null;

        EObject this_MParameterValueRefObject_1 = null;

        EObject this_MParameterValuePAR_2 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:2748:28: ( (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR ) )
            // InternalMCAD.g:2749:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            {
            // InternalMCAD.g:2749:1: (this_MParameterValueLiteral_0= ruleMParameterValueLiteral | this_MParameterValueRefObject_1= ruleMParameterValueRefObject | this_MParameterValuePAR_2= ruleMParameterValuePAR )
            int alt40=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_HEXADECIMAL:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt40=1;
                }
                break;
            case RULE_ID:
                {
                alt40=2;
                }
                break;
            case 29:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMCAD.g:2750:2: this_MParameterValueLiteral_0= ruleMParameterValueLiteral
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
                    // InternalMCAD.g:2763:2: this_MParameterValueRefObject_1= ruleMParameterValueRefObject
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
                    // InternalMCAD.g:2776:2: this_MParameterValuePAR_2= ruleMParameterValuePAR
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
    // InternalMCAD.g:2795:1: entryRuleMParameterValueLiteral returns [EObject current=null] : iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF ;
    public final EObject entryRuleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueLiteral = null;


        try {
            // InternalMCAD.g:2796:2: (iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF )
            // InternalMCAD.g:2797:2: iv_ruleMParameterValueLiteral= ruleMParameterValueLiteral EOF
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
    // InternalMCAD.g:2804:1: ruleMParameterValueLiteral returns [EObject current=null] : (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) ;
    public final EObject ruleMParameterValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_MParameterValueBooleanLiteral_0 = null;

        EObject this_MParameterValueStringLiteral_1 = null;

        EObject this_MParameterValueIntegerLiteral_2 = null;

        EObject this_MParameterValueRealLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:2807:28: ( (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral ) )
            // InternalMCAD.g:2808:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            {
            // InternalMCAD.g:2808:1: (this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral | this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral | this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral | this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 53:
            case 54:
                {
                alt41=1;
                }
                break;
            case RULE_STRING:
            case 52:
                {
                alt41=2;
                }
                break;
            case 55:
                {
                int LA41_3 = input.LA(2);

                if ( (LA41_3==RULE_INT) ) {
                    int LA41_4 = input.LA(3);

                    if ( (LA41_4==EOF||LA41_4==13||LA41_4==30||LA41_4==55||(LA41_4>=57 && LA41_4<=59)) ) {
                        alt41=3;
                    }
                    else if ( (LA41_4==28) ) {
                        alt41=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA41_4 = input.LA(2);

                if ( (LA41_4==EOF||LA41_4==13||LA41_4==30||LA41_4==55||(LA41_4>=57 && LA41_4<=59)) ) {
                    alt41=3;
                }
                else if ( (LA41_4==28) ) {
                    alt41=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEXADECIMAL:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMCAD.g:2809:2: this_MParameterValueBooleanLiteral_0= ruleMParameterValueBooleanLiteral
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
                    // InternalMCAD.g:2822:2: this_MParameterValueStringLiteral_1= ruleMParameterValueStringLiteral
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
                    // InternalMCAD.g:2835:2: this_MParameterValueIntegerLiteral_2= ruleMParameterValueIntegerLiteral
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
                    // InternalMCAD.g:2848:2: this_MParameterValueRealLiteral_3= ruleMParameterValueRealLiteral
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
    // InternalMCAD.g:2867:1: entryRuleMParameterValueBooleanLiteral returns [EObject current=null] : iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF ;
    public final EObject entryRuleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueBooleanLiteral = null;


        try {
            // InternalMCAD.g:2868:2: (iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF )
            // InternalMCAD.g:2869:2: iv_ruleMParameterValueBooleanLiteral= ruleMParameterValueBooleanLiteral EOF
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
    // InternalMCAD.g:2876:1: ruleMParameterValueBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleMParameterValueBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:2879:28: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // InternalMCAD.g:2880:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // InternalMCAD.g:2880:1: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // InternalMCAD.g:2880:2: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // InternalMCAD.g:2880:2: ()
            // InternalMCAD.g:2881:2: 
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

            // InternalMCAD.g:2889:2: ( (lv_value_1_0= ruleEBoolean ) )
            // InternalMCAD.g:2890:1: (lv_value_1_0= ruleEBoolean )
            {
            // InternalMCAD.g:2890:1: (lv_value_1_0= ruleEBoolean )
            // InternalMCAD.g:2891:3: lv_value_1_0= ruleEBoolean
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
                      		"es.uah.aut.srg.micobs.mclev.lang.MCAD.EBoolean");
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
    // InternalMCAD.g:2915:1: entryRuleMParameterValueStringLiteral returns [EObject current=null] : iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF ;
    public final EObject entryRuleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueStringLiteral = null;


        try {
            // InternalMCAD.g:2916:2: (iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF )
            // InternalMCAD.g:2917:2: iv_ruleMParameterValueStringLiteral= ruleMParameterValueStringLiteral EOF
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
    // InternalMCAD.g:2924:1: ruleMParameterValueStringLiteral returns [EObject current=null] : ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMParameterValueStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isRaw_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalMCAD.g:2927:28: ( ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMCAD.g:2928:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMCAD.g:2928:1: ( () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMCAD.g:2928:2: () ( (lv_isRaw_1_0= 'raw' ) )? ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalMCAD.g:2928:2: ()
            // InternalMCAD.g:2929:2: 
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

            // InternalMCAD.g:2937:2: ( (lv_isRaw_1_0= 'raw' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMCAD.g:2938:1: (lv_isRaw_1_0= 'raw' )
                    {
                    // InternalMCAD.g:2938:1: (lv_isRaw_1_0= 'raw' )
                    // InternalMCAD.g:2939:3: lv_isRaw_1_0= 'raw'
                    {
                    lv_isRaw_1_0=(Token)match(input,52,FollowSets000.FOLLOW_56); if (state.failed) return current;
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

            // InternalMCAD.g:2952:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMCAD.g:2953:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalMCAD.g:2953:1: (lv_value_2_0= RULE_STRING )
            // InternalMCAD.g:2954:3: lv_value_2_0= RULE_STRING
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
    // InternalMCAD.g:2978:1: entryRuleMParameterValueIntegerLiteral returns [EObject current=null] : iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF ;
    public final EObject entryRuleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueIntegerLiteral = null;


        try {
            // InternalMCAD.g:2979:2: (iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF )
            // InternalMCAD.g:2980:2: iv_ruleMParameterValueIntegerLiteral= ruleMParameterValueIntegerLiteral EOF
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
    // InternalMCAD.g:2987:1: ruleMParameterValueIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleINTEGER ) ) ) ;
    public final EObject ruleMParameterValueIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:2990:28: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) )
            // InternalMCAD.g:2991:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            {
            // InternalMCAD.g:2991:1: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
            // InternalMCAD.g:2991:2: () ( (lv_value_1_0= ruleINTEGER ) )
            {
            // InternalMCAD.g:2991:2: ()
            // InternalMCAD.g:2992:2: 
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

            // InternalMCAD.g:3000:2: ( (lv_value_1_0= ruleINTEGER ) )
            // InternalMCAD.g:3001:1: (lv_value_1_0= ruleINTEGER )
            {
            // InternalMCAD.g:3001:1: (lv_value_1_0= ruleINTEGER )
            // InternalMCAD.g:3002:3: lv_value_1_0= ruleINTEGER
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
                      		"es.uah.aut.srg.micobs.mclev.lang.MCAD.INTEGER");
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
    // InternalMCAD.g:3026:1: entryRuleMParameterValueRealLiteral returns [EObject current=null] : iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF ;
    public final EObject entryRuleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRealLiteral = null;


        try {
            // InternalMCAD.g:3027:2: (iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF )
            // InternalMCAD.g:3028:2: iv_ruleMParameterValueRealLiteral= ruleMParameterValueRealLiteral EOF
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
    // InternalMCAD.g:3035:1: ruleMParameterValueRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ) ;
    public final EObject ruleMParameterValueRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:3038:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ) )
            // InternalMCAD.g:3039:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            {
            // InternalMCAD.g:3039:1: ( () ( (lv_value_1_0= ruleREAL ) ) )
            // InternalMCAD.g:3039:2: () ( (lv_value_1_0= ruleREAL ) )
            {
            // InternalMCAD.g:3039:2: ()
            // InternalMCAD.g:3040:2: 
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

            // InternalMCAD.g:3048:2: ( (lv_value_1_0= ruleREAL ) )
            // InternalMCAD.g:3049:1: (lv_value_1_0= ruleREAL )
            {
            // InternalMCAD.g:3049:1: (lv_value_1_0= ruleREAL )
            // InternalMCAD.g:3050:3: lv_value_1_0= ruleREAL
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
                      		"es.uah.aut.srg.micobs.mclev.lang.MCAD.REAL");
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
    // InternalMCAD.g:3074:1: entryRuleMParameterValueRefObject returns [EObject current=null] : iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF ;
    public final EObject entryRuleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueRefObject = null;


        try {
            // InternalMCAD.g:3075:2: (iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF )
            // InternalMCAD.g:3076:2: iv_ruleMParameterValueRefObject= ruleMParameterValueRefObject EOF
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
    // InternalMCAD.g:3083:1: ruleMParameterValueRefObject returns [EObject current=null] : ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) ;
    public final EObject ruleMParameterValueRefObject() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalMCAD.g:3086:28: ( ( () ( ( ruleVersionedQualifiedReferenceName ) ) ) )
            // InternalMCAD.g:3087:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            {
            // InternalMCAD.g:3087:1: ( () ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalMCAD.g:3087:2: () ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalMCAD.g:3087:2: ()
            // InternalMCAD.g:3088:2: 
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

            // InternalMCAD.g:3096:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalMCAD.g:3097:1: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalMCAD.g:3097:1: ( ruleVersionedQualifiedReferenceName )
            // InternalMCAD.g:3098:3: ruleVersionedQualifiedReferenceName
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
    // InternalMCAD.g:3122:1: entryRuleMParameterValuePAR returns [EObject current=null] : iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF ;
    public final EObject entryRuleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValuePAR = null;


        try {
            // InternalMCAD.g:3123:2: (iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF )
            // InternalMCAD.g:3124:2: iv_ruleMParameterValuePAR= ruleMParameterValuePAR EOF
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
    // InternalMCAD.g:3131:1: ruleMParameterValuePAR returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleMParameterValuePAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:3134:28: ( (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' ) )
            // InternalMCAD.g:3135:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            {
            // InternalMCAD.g:3135:1: (otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')' )
            // InternalMCAD.g:3135:3: otherlv_0= '(' ( (lv_value_1_0= ruleMParameterValueExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0());
                  
            }
            // InternalMCAD.g:3139:1: ( (lv_value_1_0= ruleMParameterValueExpression ) )
            // InternalMCAD.g:3140:1: (lv_value_1_0= ruleMParameterValueExpression )
            {
            // InternalMCAD.g:3140:1: (lv_value_1_0= ruleMParameterValueExpression )
            // InternalMCAD.g:3141:3: lv_value_1_0= ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_27);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalMCAD.g:3169:1: entryRuleMParameterValueExpression returns [EObject current=null] : iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF ;
    public final EObject entryRuleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueExpression = null;


        try {
            // InternalMCAD.g:3170:2: (iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF )
            // InternalMCAD.g:3171:2: iv_ruleMParameterValueExpression= ruleMParameterValueExpression EOF
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
    // InternalMCAD.g:3178:1: ruleMParameterValueExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) ;
    public final EObject ruleMParameterValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:3181:28: ( ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? ) )
            // InternalMCAD.g:3182:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            {
            // InternalMCAD.g:3182:1: ( () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )? )
            // InternalMCAD.g:3182:2: () ( (lv_left_1_0= ruleMParameterValueTERM ) ) ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            {
            // InternalMCAD.g:3182:2: ()
            // InternalMCAD.g:3183:2: 
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

            // InternalMCAD.g:3191:2: ( (lv_left_1_0= ruleMParameterValueTERM ) )
            // InternalMCAD.g:3192:1: (lv_left_1_0= ruleMParameterValueTERM )
            {
            // InternalMCAD.g:3192:1: (lv_left_1_0= ruleMParameterValueTERM )
            // InternalMCAD.g:3193:3: lv_left_1_0= ruleMParameterValueTERM
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_57);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueTERM");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMCAD.g:3209:2: ( ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55||LA43_0==57) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMCAD.g:3209:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) ) ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    {
                    // InternalMCAD.g:3209:3: ( (lv_operation_2_0= ruleMParameterValueExpressionOperators ) )
                    // InternalMCAD.g:3210:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    {
                    // InternalMCAD.g:3210:1: (lv_operation_2_0= ruleMParameterValueExpressionOperators )
                    // InternalMCAD.g:3211:3: lv_operation_2_0= ruleMParameterValueExpressionOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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
                              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpressionOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMCAD.g:3227:2: ( (lv_right_3_0= ruleMParameterValueExpression ) )
                    // InternalMCAD.g:3228:1: (lv_right_3_0= ruleMParameterValueExpression )
                    {
                    // InternalMCAD.g:3228:1: (lv_right_3_0= ruleMParameterValueExpression )
                    // InternalMCAD.g:3229:3: lv_right_3_0= ruleMParameterValueExpression
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
                              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueExpression");
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
    // InternalMCAD.g:3253:1: entryRuleMParameterValueTERM returns [EObject current=null] : iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF ;
    public final EObject entryRuleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMParameterValueTERM = null;


        try {
            // InternalMCAD.g:3254:2: (iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF )
            // InternalMCAD.g:3255:2: iv_ruleMParameterValueTERM= ruleMParameterValueTERM EOF
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
    // InternalMCAD.g:3262:1: ruleMParameterValueTERM returns [EObject current=null] : ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) ;
    public final EObject ruleMParameterValueTERM() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMCAD.g:3265:28: ( ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? ) )
            // InternalMCAD.g:3266:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            {
            // InternalMCAD.g:3266:1: ( () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )? )
            // InternalMCAD.g:3266:2: () ( (lv_left_1_0= ruleMParameterValue ) ) ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            {
            // InternalMCAD.g:3266:2: ()
            // InternalMCAD.g:3267:2: 
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

            // InternalMCAD.g:3275:2: ( (lv_left_1_0= ruleMParameterValue ) )
            // InternalMCAD.g:3276:1: (lv_left_1_0= ruleMParameterValue )
            {
            // InternalMCAD.g:3276:1: (lv_left_1_0= ruleMParameterValue )
            // InternalMCAD.g:3277:3: lv_left_1_0= ruleMParameterValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_58);
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
                      		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMCAD.g:3293:2: ( ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=58 && LA44_0<=59)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMCAD.g:3293:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) ) ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    {
                    // InternalMCAD.g:3293:3: ( (lv_operation_2_0= ruleMParameterValueTERMOperators ) )
                    // InternalMCAD.g:3294:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    {
                    // InternalMCAD.g:3294:1: (lv_operation_2_0= ruleMParameterValueTERMOperators )
                    // InternalMCAD.g:3295:3: lv_operation_2_0= ruleMParameterValueTERMOperators
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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
                              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueTERMOperators");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMCAD.g:3311:2: ( (lv_right_3_0= ruleMParameterValueTERM ) )
                    // InternalMCAD.g:3312:1: (lv_right_3_0= ruleMParameterValueTERM )
                    {
                    // InternalMCAD.g:3312:1: (lv_right_3_0= ruleMParameterValueTERM )
                    // InternalMCAD.g:3313:3: lv_right_3_0= ruleMParameterValueTERM
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
                              		"es.uah.aut.srg.micobs.mclev.lang.MCAD.MParameterValueTERM");
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalMCAD.g:3337:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMCAD.g:3338:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMCAD.g:3339:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalMCAD.g:3346:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalMCAD.g:3349:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalMCAD.g:3350:1: (kw= 'true' | kw= 'false' )
            {
            // InternalMCAD.g:3350:1: (kw= 'true' | kw= 'false' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                alt45=1;
            }
            else if ( (LA45_0==54) ) {
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
                    // InternalMCAD.g:3351:2: kw= 'true'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalMCAD.g:3358:2: kw= 'false'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalMCAD.g:3371:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalMCAD.g:3372:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalMCAD.g:3373:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalMCAD.g:3380:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;

         enterRule(); 
            
        try {
            // InternalMCAD.g:3383:28: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalMCAD.g:3384:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalMCAD.g:3384:1: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT||LA47_0==55) ) {
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
                    // InternalMCAD.g:3384:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalMCAD.g:3384:2: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalMCAD.g:3384:3: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalMCAD.g:3384:3: (kw= '-' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==55) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalMCAD.g:3385:2: kw= '-'
                            {
                            kw=(Token)match(input,55,FollowSets000.FOLLOW_59); if (state.failed) return current;
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
                    // InternalMCAD.g:3398:10: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalMCAD.g:3413:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // InternalMCAD.g:3414:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalMCAD.g:3415:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalMCAD.g:3422:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // InternalMCAD.g:3425:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalMCAD.g:3426:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalMCAD.g:3426:1: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalMCAD.g:3426:2: (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalMCAD.g:3426:2: (kw= '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==55) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMCAD.g:3427:2: kw= '-'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            // InternalMCAD.g:3432:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalMCAD.g:3432:8: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
                  
            }
            kw=(Token)match(input,28,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
                  
            }

            }

            // InternalMCAD.g:3452:2: (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==56) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMCAD.g:3453:2: kw= 'e' (kw= '-' )? this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0()); 
                          
                    }
                    // InternalMCAD.g:3458:1: (kw= '-' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==55) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalMCAD.g:3459:2: kw= '-'
                            {
                            kw=(Token)match(input,55,FollowSets000.FOLLOW_59); if (state.failed) return current;
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


    // $ANTLR start "ruleMParameterValueExpressionOperators"
    // InternalMCAD.g:3479:1: ruleMParameterValueExpressionOperators returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleMParameterValueExpressionOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalMCAD.g:3481:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalMCAD.g:3482:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalMCAD.g:3482:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==57) ) {
                alt51=1;
            }
            else if ( (LA51_0==55) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalMCAD.g:3482:2: (enumLiteral_0= '+' )
                    {
                    // InternalMCAD.g:3482:2: (enumLiteral_0= '+' )
                    // InternalMCAD.g:3482:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMCAD.g:3488:6: (enumLiteral_1= '-' )
                    {
                    // InternalMCAD.g:3488:6: (enumLiteral_1= '-' )
                    // InternalMCAD.g:3488:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalMCAD.g:3498:1: ruleMParameterValueTERMOperators returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMParameterValueTERMOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalMCAD.g:3500:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalMCAD.g:3501:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalMCAD.g:3501:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==58) ) {
                alt52=1;
            }
            else if ( (LA52_0==59) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalMCAD.g:3501:2: (enumLiteral_0= '*' )
                    {
                    // InternalMCAD.g:3501:2: (enumLiteral_0= '*' )
                    // InternalMCAD.g:3501:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMCAD.g:3507:6: (enumLiteral_1= '/' )
                    {
                    // InternalMCAD.g:3507:6: (enumLiteral_1= '/' )
                    // InternalMCAD.g:3507:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalMCAD
    public final void synpred2_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_version_8_0 = null;


        // InternalMCAD.g:280:4: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) )
        // InternalMCAD.g:280:4: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) )
        {
        // InternalMCAD.g:280:4: ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) )
        // InternalMCAD.g:281:5: {...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0)");
        }
        // InternalMCAD.g:281:111: ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) )
        // InternalMCAD.g:282:6: ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0);
        // InternalMCAD.g:285:6: ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) )
        // InternalMCAD.g:285:7: {...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalMCAD", "true");
        }
        // InternalMCAD.g:285:16: (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' )
        // InternalMCAD.g:285:18: otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';'
        {
        otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalMCAD.g:293:1: ( (lv_version_8_0= ruleVersion ) )
        // InternalMCAD.g:294:1: (lv_version_8_0= ruleVersion )
        {
        // InternalMCAD.g:294:1: (lv_version_8_0= ruleVersion )
        // InternalMCAD.g:295:3: lv_version_8_0= ruleVersion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_4);
        lv_version_8_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalMCAD

    // $ANTLR start synpred4_InternalMCAD
    public final void synpred4_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_attributeValueAssignments_13_0 = null;


        // InternalMCAD.g:322:4: ( ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) )
        // InternalMCAD.g:322:4: ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) )
        {
        // InternalMCAD.g:322:4: ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) )
        // InternalMCAD.g:323:5: {...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1)");
        }
        // InternalMCAD.g:323:111: ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) )
        // InternalMCAD.g:324:6: ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1);
        // InternalMCAD.g:327:6: ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) )
        // InternalMCAD.g:327:7: {...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalMCAD", "true");
        }
        // InternalMCAD.g:327:16: (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' )
        // InternalMCAD.g:327:18: otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';'
        {
        otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return ;
        otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalMCAD.g:339:1: ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+
        int cnt53=0;
        loop53:
        do {
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==20) ) {
                alt53=1;
            }


            switch (alt53) {
        	case 1 :
        	    // InternalMCAD.g:340:1: (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment )
        	    {
        	    // InternalMCAD.g:340:1: (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment )
        	    // InternalMCAD.g:341:3: lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_14);
        	    lv_attributeValueAssignments_13_0=ruleMAttributeValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt53 >= 1 ) break loop53;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(53, input);
                    throw eee;
            }
            cnt53++;
        } while (true);

        otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalMCAD

    // $ANTLR start synpred6_InternalMCAD
    public final void synpred6_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_deploymentPlatforms_19_0 = null;


        // InternalMCAD.g:372:4: ( ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) )
        // InternalMCAD.g:372:4: ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
        {
        // InternalMCAD.g:372:4: ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) )
        // InternalMCAD.g:373:5: {...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2)");
        }
        // InternalMCAD.g:373:111: ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) )
        // InternalMCAD.g:374:6: ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2);
        // InternalMCAD.g:377:6: ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) )
        // InternalMCAD.g:377:7: {...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalMCAD", "true");
        }
        // InternalMCAD.g:377:16: (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' )
        // InternalMCAD.g:377:18: otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';'
        {
        otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return ;
        // InternalMCAD.g:389:1: ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+
        int cnt54=0;
        loop54:
        do {
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==15) ) {
                alt54=1;
            }


            switch (alt54) {
        	case 1 :
        	    // InternalMCAD.g:390:1: (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform )
        	    {
        	    // InternalMCAD.g:390:1: (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform )
        	    // InternalMCAD.g:391:3: lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsMDeploymentPlatformParserRuleCall_5_2_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_17);
        	    lv_deploymentPlatforms_19_0=ruleMDeploymentPlatform();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt54 >= 1 ) break loop54;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(54, input);
                    throw eee;
            }
            cnt54++;
        } while (true);

        otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalMCAD

    // $ANTLR start synpred8_InternalMCAD
    public final void synpred8_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_deploymentAlternatives_25_0 = null;


        // InternalMCAD.g:422:4: ( ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) )
        // InternalMCAD.g:422:4: ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) )
        {
        // InternalMCAD.g:422:4: ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) )
        // InternalMCAD.g:423:5: {...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3)");
        }
        // InternalMCAD.g:423:111: ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) )
        // InternalMCAD.g:424:6: ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3);
        // InternalMCAD.g:427:6: ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) )
        // InternalMCAD.g:427:7: {...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalMCAD", "true");
        }
        // InternalMCAD.g:427:16: (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' )
        // InternalMCAD.g:427:18: otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';'
        {
        otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return ;
        // InternalMCAD.g:439:1: ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+
        int cnt55=0;
        loop55:
        do {
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==15) ) {
                alt55=1;
            }


            switch (alt55) {
        	case 1 :
        	    // InternalMCAD.g:440:1: (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative )
        	    {
        	    // InternalMCAD.g:440:1: (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative )
        	    // InternalMCAD.g:441:3: lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_3_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_17);
        	    lv_deploymentAlternatives_25_0=ruleMDeploymentAlternative();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt55 >= 1 ) break loop55;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(55, input);
                    throw eee;
            }
            cnt55++;
        } while (true);

        otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalMCAD

    // $ANTLR start synpred10_InternalMCAD
    public final void synpred10_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_components_30_0 = null;


        // InternalMCAD.g:472:4: ( ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) )
        // InternalMCAD.g:472:4: ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
        {
        // InternalMCAD.g:472:4: ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) )
        // InternalMCAD.g:473:5: {...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4)");
        }
        // InternalMCAD.g:473:111: ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) )
        // InternalMCAD.g:474:6: ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4);
        // InternalMCAD.g:477:6: ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) )
        // InternalMCAD.g:477:7: {...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalMCAD", "true");
        }
        // InternalMCAD.g:477:16: (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' )
        // InternalMCAD.g:477:18: otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';'
        {
        otherlv_28=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return ;
        // InternalMCAD.g:485:1: ( (lv_components_30_0= ruleMComponentInstance ) )+
        int cnt56=0;
        loop56:
        do {
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==39) ) {
                alt56=1;
            }


            switch (alt56) {
        	case 1 :
        	    // InternalMCAD.g:486:1: (lv_components_30_0= ruleMComponentInstance )
        	    {
        	    // InternalMCAD.g:486:1: (lv_components_30_0= ruleMComponentInstance )
        	    // InternalMCAD.g:487:3: lv_components_30_0= ruleMComponentInstance
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getComponentsMComponentInstanceParserRuleCall_5_4_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_20);
        	    lv_components_30_0=ruleMComponentInstance();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt56 >= 1 ) break loop56;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(56, input);
                    throw eee;
            }
            cnt56++;
        } while (true);

        otherlv_31=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalMCAD

    // $ANTLR start synpred12_InternalMCAD
    public final void synpred12_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        EObject lv_connections_35_0 = null;


        // InternalMCAD.g:518:4: ( ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) )
        // InternalMCAD.g:518:4: ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) )
        {
        // InternalMCAD.g:518:4: ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) )
        // InternalMCAD.g:519:5: {...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5)");
        }
        // InternalMCAD.g:519:111: ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) )
        // InternalMCAD.g:520:6: ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5);
        // InternalMCAD.g:523:6: ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) )
        // InternalMCAD.g:523:7: {...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalMCAD", "true");
        }
        // InternalMCAD.g:523:16: (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' )
        // InternalMCAD.g:523:18: otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';'
        {
        otherlv_33=(Token)match(input,26,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_34=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return ;
        // InternalMCAD.g:531:1: ( (lv_connections_35_0= ruleMConnection ) )+
        int cnt57=0;
        loop57:
        do {
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==32||LA57_0==36) ) {
                alt57=1;
            }


            switch (alt57) {
        	case 1 :
        	    // InternalMCAD.g:532:1: (lv_connections_35_0= ruleMConnection )
        	    {
        	    // InternalMCAD.g:532:1: (lv_connections_35_0= ruleMConnection )
        	    // InternalMCAD.g:533:3: lv_connections_35_0= ruleMConnection
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getConnectionsMConnectionParserRuleCall_5_5_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_22);
        	    lv_connections_35_0=ruleMConnection();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt57 >= 1 ) break loop57;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(57, input);
                    throw eee;
            }
            cnt57++;
        } while (true);

        otherlv_36=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_37=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalMCAD

    // $ANTLR start synpred14_InternalMCAD
    public final void synpred14_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        EObject lv_libraries_40_0 = null;


        // InternalMCAD.g:564:4: ( ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )
        // InternalMCAD.g:564:4: ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) )
        {
        // InternalMCAD.g:564:4: ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) )
        // InternalMCAD.g:565:5: {...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred14_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6)");
        }
        // InternalMCAD.g:565:111: ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) )
        // InternalMCAD.g:566:6: ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6);
        // InternalMCAD.g:569:6: ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) )
        // InternalMCAD.g:569:7: {...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred14_InternalMCAD", "true");
        }
        // InternalMCAD.g:569:16: (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' )
        // InternalMCAD.g:569:18: otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';'
        {
        otherlv_38=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_39=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return ;
        // InternalMCAD.g:577:1: ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+
        int cnt58=0;
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=40 && LA58_0<=41)) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // InternalMCAD.g:578:1: (lv_libraries_40_0= ruleMServiceLibraryInstance )
        	    {
        	    // InternalMCAD.g:578:1: (lv_libraries_40_0= ruleMServiceLibraryInstance )
        	    // InternalMCAD.g:579:3: lv_libraries_40_0= ruleMServiceLibraryInstance
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMMCADeploymentAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_6_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_24);
        	    lv_libraries_40_0=ruleMServiceLibraryInstance();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt58 >= 1 ) break loop58;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(58, input);
                    throw eee;
            }
            cnt58++;
        } while (true);

        otherlv_41=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_42=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalMCAD

    // $ANTLR start synpred33_InternalMCAD
    public final void synpred33_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_attributeValueAssignments_8_0 = null;


        // InternalMCAD.g:1667:4: ( ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) ) )
        // InternalMCAD.g:1667:4: ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
        {
        // InternalMCAD.g:1667:4: ({...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) ) )
        // InternalMCAD.g:1668:5: {...}? => ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred33_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalMCAD.g:1668:116: ( ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) ) )
        // InternalMCAD.g:1669:6: ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0);
        // InternalMCAD.g:1672:6: ({...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' ) )
        // InternalMCAD.g:1672:7: {...}? => (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred33_InternalMCAD", "true");
        }
        // InternalMCAD.g:1672:16: (otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';' )
        // InternalMCAD.g:1672:18: otherlv_5= 'attribute' otherlv_6= 'values' otherlv_7= '{' ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+ otherlv_9= '}' otherlv_10= ';'
        {
        otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return ;
        otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalMCAD.g:1684:1: ( (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment ) )+
        int cnt61=0;
        loop61:
        do {
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==20) ) {
                alt61=1;
            }


            switch (alt61) {
        	case 1 :
        	    // InternalMCAD.g:1685:1: (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment )
        	    {
        	    // InternalMCAD.g:1685:1: (lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment )
        	    // InternalMCAD.g:1686:3: lv_attributeValueAssignments_8_0= ruleMAttributeValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_14);
        	    lv_attributeValueAssignments_8_0=ruleMAttributeValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt61 >= 1 ) break loop61;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(61, input);
                    throw eee;
            }
            cnt61++;
        } while (true);

        otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred33_InternalMCAD

    // $ANTLR start synpred35_InternalMCAD
    public final void synpred35_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_deviceDriverMappings_14_0 = null;


        // InternalMCAD.g:1717:4: ( ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) ) )
        // InternalMCAD.g:1717:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
        {
        // InternalMCAD.g:1717:4: ({...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) ) )
        // InternalMCAD.g:1718:5: {...}? => ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred35_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalMCAD.g:1718:116: ( ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) ) )
        // InternalMCAD.g:1719:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1);
        // InternalMCAD.g:1722:6: ({...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' ) )
        // InternalMCAD.g:1722:7: {...}? => (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred35_InternalMCAD", "true");
        }
        // InternalMCAD.g:1722:16: (otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';' )
        // InternalMCAD.g:1722:18: otherlv_11= 'device' otherlv_12= 'mappings' otherlv_13= '{' ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+ otherlv_15= '}' otherlv_16= ';'
        {
        otherlv_11=(Token)match(input,42,FollowSets000.FOLLOW_38); if (state.failed) return ;
        otherlv_12=(Token)match(input,43,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_39); if (state.failed) return ;
        // InternalMCAD.g:1734:1: ( (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping ) )+
        int cnt62=0;
        loop62:
        do {
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==44) ) {
                alt62=1;
            }


            switch (alt62) {
        	case 1 :
        	    // InternalMCAD.g:1735:1: (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping )
        	    {
        	    // InternalMCAD.g:1735:1: (lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping )
        	    // InternalMCAD.g:1736:3: lv_deviceDriverMappings_14_0= ruleMDeviceDriverMapping
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsMDeviceDriverMappingParserRuleCall_4_1_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_40);
        	    lv_deviceDriverMappings_14_0=ruleMDeviceDriverMapping();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt62 >= 1 ) break loop62;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(62, input);
                    throw eee;
            }
            cnt62++;
        } while (true);

        otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred35_InternalMCAD

    // $ANTLR start synpred37_InternalMCAD
    public final void synpred37_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

        // InternalMCAD.g:1946:4: ( ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) ) )
        // InternalMCAD.g:1946:4: ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) )
        {
        // InternalMCAD.g:1946:4: ({...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) ) )
        // InternalMCAD.g:1947:5: {...}? => ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred37_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0)");
        }
        // InternalMCAD.g:1947:119: ( ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) ) )
        // InternalMCAD.g:1948:6: ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0);
        // InternalMCAD.g:1951:6: ({...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' ) )
        // InternalMCAD.g:1951:7: {...}? => (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred37_InternalMCAD", "true");
        }
        // InternalMCAD.g:1951:16: (otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' )
        // InternalMCAD.g:1951:18: otherlv_6= 'deployment' otherlv_7= 'platforms' otherlv_8= ':=' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';'
        {
        otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15); if (state.failed) return ;
        otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalMCAD.g:1963:1: ( (otherlv_9= RULE_ID ) )
        // InternalMCAD.g:1964:1: (otherlv_9= RULE_ID )
        {
        // InternalMCAD.g:1964:1: (otherlv_9= RULE_ID )
        // InternalMCAD.g:1965:3: otherlv_9= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return ;

        }


        }

        // InternalMCAD.g:1979:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
        loop63:
        do {
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==48) ) {
                alt63=1;
            }


            switch (alt63) {
        	case 1 :
        	    // InternalMCAD.g:1979:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
        	    {
        	    otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_3); if (state.failed) return ;
        	    // InternalMCAD.g:1983:1: ( (otherlv_11= RULE_ID ) )
        	    // InternalMCAD.g:1984:1: (otherlv_11= RULE_ID )
        	    {
        	    // InternalMCAD.g:1984:1: (otherlv_11= RULE_ID )
        	    // InternalMCAD.g:1985:3: otherlv_11= RULE_ID
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop63;
            }
        } while (true);

        otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred37_InternalMCAD

    // $ANTLR start synpred39_InternalMCAD
    public final void synpred39_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_attributeValueAssignments_16_0 = null;


        // InternalMCAD.g:2010:4: ( ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) ) )
        // InternalMCAD.g:2010:4: ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
        {
        // InternalMCAD.g:2010:4: ({...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) ) )
        // InternalMCAD.g:2011:5: {...}? => ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred39_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1)");
        }
        // InternalMCAD.g:2011:119: ( ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) ) )
        // InternalMCAD.g:2012:6: ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1);
        // InternalMCAD.g:2015:6: ({...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' ) )
        // InternalMCAD.g:2015:7: {...}? => (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred39_InternalMCAD", "true");
        }
        // InternalMCAD.g:2015:16: (otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';' )
        // InternalMCAD.g:2015:18: otherlv_13= 'attribute' otherlv_14= 'values' otherlv_15= '{' ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+ otherlv_17= '}' otherlv_18= ';'
        {
        otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return ;
        otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalMCAD.g:2027:1: ( (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment ) )+
        int cnt64=0;
        loop64:
        do {
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==20) ) {
                alt64=1;
            }


            switch (alt64) {
        	case 1 :
        	    // InternalMCAD.g:2028:1: (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment )
        	    {
        	    // InternalMCAD.g:2028:1: (lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment )
        	    // InternalMCAD.g:2029:3: lv_attributeValueAssignments_16_0= ruleMAttributeValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_14);
        	    lv_attributeValueAssignments_16_0=ruleMAttributeValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt64 >= 1 ) break loop64;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(64, input);
                    throw eee;
            }
            cnt64++;
        } while (true);

        otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred39_InternalMCAD

    // $ANTLR start synpred41_InternalMCAD
    public final void synpred41_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_deploymentAlternatives_22_0 = null;


        // InternalMCAD.g:2060:4: ( ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) ) )
        // InternalMCAD.g:2060:4: ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) )
        {
        // InternalMCAD.g:2060:4: ({...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) ) )
        // InternalMCAD.g:2061:5: {...}? => ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred41_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2)");
        }
        // InternalMCAD.g:2061:119: ( ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) ) )
        // InternalMCAD.g:2062:6: ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2);
        // InternalMCAD.g:2065:6: ({...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' ) )
        // InternalMCAD.g:2065:7: {...}? => (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred41_InternalMCAD", "true");
        }
        // InternalMCAD.g:2065:16: (otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';' )
        // InternalMCAD.g:2065:18: otherlv_19= 'deployment' otherlv_20= 'alternatives' otherlv_21= '{' ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+ otherlv_23= '}' otherlv_24= ';'
        {
        otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_18); if (state.failed) return ;
        otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return ;
        // InternalMCAD.g:2077:1: ( (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative ) )+
        int cnt65=0;
        loop65:
        do {
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==15) ) {
                alt65=1;
            }


            switch (alt65) {
        	case 1 :
        	    // InternalMCAD.g:2078:1: (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative )
        	    {
        	    // InternalMCAD.g:2078:1: (lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative )
        	    // InternalMCAD.g:2079:3: lv_deploymentAlternatives_22_0= ruleMDeploymentAlternative
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_2_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_17);
        	    lv_deploymentAlternatives_22_0=ruleMDeploymentAlternative();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt65 >= 1 ) break loop65;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(65, input);
                    throw eee;
            }
            cnt65++;
        } while (true);

        otherlv_23=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred41_InternalMCAD

    // $ANTLR start synpred43_InternalMCAD
    public final void synpred43_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_components_27_0 = null;


        // InternalMCAD.g:2110:4: ( ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) ) )
        // InternalMCAD.g:2110:4: ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) )
        {
        // InternalMCAD.g:2110:4: ({...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) ) )
        // InternalMCAD.g:2111:5: {...}? => ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred43_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3)");
        }
        // InternalMCAD.g:2111:119: ( ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) ) )
        // InternalMCAD.g:2112:6: ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3);
        // InternalMCAD.g:2115:6: ({...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' ) )
        // InternalMCAD.g:2115:7: {...}? => (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred43_InternalMCAD", "true");
        }
        // InternalMCAD.g:2115:16: (otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';' )
        // InternalMCAD.g:2115:18: otherlv_25= 'components' otherlv_26= '{' ( (lv_components_27_0= ruleMComponentInstance ) )+ otherlv_28= '}' otherlv_29= ';'
        {
        otherlv_25=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return ;
        // InternalMCAD.g:2123:1: ( (lv_components_27_0= ruleMComponentInstance ) )+
        int cnt66=0;
        loop66:
        do {
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==39) ) {
                alt66=1;
            }


            switch (alt66) {
        	case 1 :
        	    // InternalMCAD.g:2124:1: (lv_components_27_0= ruleMComponentInstance )
        	    {
        	    // InternalMCAD.g:2124:1: (lv_components_27_0= ruleMComponentInstance )
        	    // InternalMCAD.g:2125:3: lv_components_27_0= ruleMComponentInstance
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getComponentsMComponentInstanceParserRuleCall_5_3_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_20);
        	    lv_components_27_0=ruleMComponentInstance();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt66 >= 1 ) break loop66;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(66, input);
                    throw eee;
            }
            cnt66++;
        } while (true);

        otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred43_InternalMCAD

    // $ANTLR start synpred45_InternalMCAD
    public final void synpred45_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        EObject lv_connections_32_0 = null;


        // InternalMCAD.g:2156:4: ( ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) ) )
        // InternalMCAD.g:2156:4: ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) )
        {
        // InternalMCAD.g:2156:4: ({...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) ) )
        // InternalMCAD.g:2157:5: {...}? => ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred45_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4)");
        }
        // InternalMCAD.g:2157:119: ( ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) ) )
        // InternalMCAD.g:2158:6: ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4);
        // InternalMCAD.g:2161:6: ({...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' ) )
        // InternalMCAD.g:2161:7: {...}? => (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred45_InternalMCAD", "true");
        }
        // InternalMCAD.g:2161:16: (otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';' )
        // InternalMCAD.g:2161:18: otherlv_30= 'connections' otherlv_31= '{' ( (lv_connections_32_0= ruleMConnection ) )+ otherlv_33= '}' otherlv_34= ';'
        {
        otherlv_30=(Token)match(input,26,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return ;
        // InternalMCAD.g:2169:1: ( (lv_connections_32_0= ruleMConnection ) )+
        int cnt67=0;
        loop67:
        do {
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==32||LA67_0==36) ) {
                alt67=1;
            }


            switch (alt67) {
        	case 1 :
        	    // InternalMCAD.g:2170:1: (lv_connections_32_0= ruleMConnection )
        	    {
        	    // InternalMCAD.g:2170:1: (lv_connections_32_0= ruleMConnection )
        	    // InternalMCAD.g:2171:3: lv_connections_32_0= ruleMConnection
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsMConnectionParserRuleCall_5_4_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_22);
        	    lv_connections_32_0=ruleMConnection();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt67 >= 1 ) break loop67;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(67, input);
                    throw eee;
            }
            cnt67++;
        } while (true);

        otherlv_33=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred45_InternalMCAD

    // $ANTLR start synpred47_InternalMCAD
    public final void synpred47_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        EObject lv_libraries_37_0 = null;


        // InternalMCAD.g:2202:4: ( ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) ) )
        // InternalMCAD.g:2202:4: ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) )
        {
        // InternalMCAD.g:2202:4: ({...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) ) )
        // InternalMCAD.g:2203:5: {...}? => ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred47_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5)");
        }
        // InternalMCAD.g:2203:119: ( ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) ) )
        // InternalMCAD.g:2204:6: ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5);
        // InternalMCAD.g:2207:6: ({...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' ) )
        // InternalMCAD.g:2207:7: {...}? => (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred47_InternalMCAD", "true");
        }
        // InternalMCAD.g:2207:16: (otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';' )
        // InternalMCAD.g:2207:18: otherlv_35= 'libraries' otherlv_36= '{' ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+ otherlv_38= '}' otherlv_39= ';'
        {
        otherlv_35=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_36=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return ;
        // InternalMCAD.g:2215:1: ( (lv_libraries_37_0= ruleMServiceLibraryInstance ) )+
        int cnt68=0;
        loop68:
        do {
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=40 && LA68_0<=41)) ) {
                alt68=1;
            }


            switch (alt68) {
        	case 1 :
        	    // InternalMCAD.g:2216:1: (lv_libraries_37_0= ruleMServiceLibraryInstance )
        	    {
        	    // InternalMCAD.g:2216:1: (lv_libraries_37_0= ruleMServiceLibraryInstance )
        	    // InternalMCAD.g:2217:3: lv_libraries_37_0= ruleMServiceLibraryInstance
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_5_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_24);
        	    lv_libraries_37_0=ruleMServiceLibraryInstance();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt68 >= 1 ) break loop68;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(68, input);
                    throw eee;
            }
            cnt68++;
        } while (true);

        otherlv_38=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_39=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred47_InternalMCAD

    // $ANTLR start synpred48_InternalMCAD
    public final void synpred48_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

        // InternalMCAD.g:2338:4: ( ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) ) )
        // InternalMCAD.g:2338:4: ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) )
        {
        // InternalMCAD.g:2338:4: ({...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) ) )
        // InternalMCAD.g:2339:5: {...}? => ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalMCAD.g:2339:116: ( ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) ) )
        // InternalMCAD.g:2340:6: ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0);
        // InternalMCAD.g:2343:6: ({...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' ) )
        // InternalMCAD.g:2343:7: {...}? => (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_InternalMCAD", "true");
        }
        // InternalMCAD.g:2343:16: (otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';' )
        // InternalMCAD.g:2343:18: otherlv_5= 'platform' otherlv_6= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_8= ';'
        {
        otherlv_5=(Token)match(input,49,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalMCAD.g:2351:1: ( ( ruleVersionedQualifiedName ) )
        // InternalMCAD.g:2352:1: ( ruleVersionedQualifiedName )
        {
        // InternalMCAD.g:2352:1: ( ruleVersionedQualifiedName )
        // InternalMCAD.g:2353:3: ruleVersionedQualifiedName
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

        otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred48_InternalMCAD

    // $ANTLR start synpred50_InternalMCAD
    public final void synpred50_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_deployedDevices_12_0 = null;


        // InternalMCAD.g:2380:4: ( ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) ) )
        // InternalMCAD.g:2380:4: ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) )
        {
        // InternalMCAD.g:2380:4: ({...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) ) )
        // InternalMCAD.g:2381:5: {...}? => ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred50_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalMCAD.g:2381:116: ( ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) ) )
        // InternalMCAD.g:2382:6: ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1);
        // InternalMCAD.g:2385:6: ({...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' ) )
        // InternalMCAD.g:2385:7: {...}? => (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred50_InternalMCAD", "true");
        }
        // InternalMCAD.g:2385:16: (otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';' )
        // InternalMCAD.g:2385:18: otherlv_9= 'deployed' otherlv_10= 'devices' otherlv_11= '{' ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+ otherlv_13= '}' otherlv_14= ';'
        {
        otherlv_9=(Token)match(input,46,FollowSets000.FOLLOW_51); if (state.failed) return ;
        otherlv_10=(Token)match(input,50,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_41); if (state.failed) return ;
        // InternalMCAD.g:2397:1: ( (lv_deployedDevices_12_0= ruleMDeployedDevice ) )+
        int cnt69=0;
        loop69:
        do {
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==42) ) {
                alt69=1;
            }


            switch (alt69) {
        	case 1 :
        	    // InternalMCAD.g:2398:1: (lv_deployedDevices_12_0= ruleMDeployedDevice )
        	    {
        	    // InternalMCAD.g:2398:1: (lv_deployedDevices_12_0= ruleMDeployedDevice )
        	    // InternalMCAD.g:2399:3: lv_deployedDevices_12_0= ruleMDeployedDevice
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesMDeployedDeviceParserRuleCall_4_1_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_deployedDevices_12_0=ruleMDeployedDevice();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt69 >= 1 ) break loop69;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(69, input);
                    throw eee;
            }
            cnt69++;
        } while (true);

        otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred50_InternalMCAD

    // $ANTLR start synpred52_InternalMCAD
    public final void synpred52_InternalMCAD_fragment() throws RecognitionException {   
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_parameterValueAssignments_18_0 = null;


        // InternalMCAD.g:2430:4: ( ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) ) )
        // InternalMCAD.g:2430:4: ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) )
        {
        // InternalMCAD.g:2430:4: ({...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) ) )
        // InternalMCAD.g:2431:5: {...}? => ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred52_InternalMCAD", "getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2)");
        }
        // InternalMCAD.g:2431:116: ( ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) ) )
        // InternalMCAD.g:2432:6: ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2);
        // InternalMCAD.g:2435:6: ({...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' ) )
        // InternalMCAD.g:2435:7: {...}? => (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred52_InternalMCAD", "true");
        }
        // InternalMCAD.g:2435:16: (otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';' )
        // InternalMCAD.g:2435:18: otherlv_15= 'parameter' otherlv_16= 'values' otherlv_17= '{' ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+ otherlv_19= '}' otherlv_20= ';'
        {
        otherlv_15=(Token)match(input,51,FollowSets000.FOLLOW_12); if (state.failed) return ;
        otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return ;
        otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_53); if (state.failed) return ;
        // InternalMCAD.g:2447:1: ( (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment ) )+
        int cnt70=0;
        loop70:
        do {
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==51) ) {
                alt70=1;
            }


            switch (alt70) {
        	case 1 :
        	    // InternalMCAD.g:2448:1: (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment )
        	    {
        	    // InternalMCAD.g:2448:1: (lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment )
        	    // InternalMCAD.g:2449:3: lv_parameterValueAssignments_18_0= ruleMParameterValueAssignment
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_2_3_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_parameterValueAssignments_18_0=ruleMParameterValueAssignment();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt70 >= 1 ) break loop70;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(70, input);
                    throw eee;
            }
            cnt70++;
        } while (true);

        otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred52_InternalMCAD

    // Delegated rules

    public final boolean synpred43_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalMCAD() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalMCAD_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\17\3\uffff\1\27\5\uffff";
    static final String dfa_3s = "\1\33\3\uffff\1\30\5\uffff";
    static final String dfa_4s = "\1\uffff\1\10\1\1\1\2\1\uffff\1\5\1\6\1\7\1\4\1\3";
    static final String dfa_5s = "\1\0\3\uffff\1\1\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\2\uffff\1\2\1\uffff\1\3\1\uffff\1\1\2\uffff\1\5\1\6\1\7",
            "",
            "",
            "",
            "\1\11\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 278:3: ( ({...}? => ( ({...}? => (otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attribute' otherlv_11= 'values' otherlv_12= '{' ( (lv_attributeValueAssignments_13_0= ruleMAttributeValueAssignment ) )+ otherlv_14= '}' otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'deployment' otherlv_17= 'platforms' otherlv_18= '{' ( (lv_deploymentPlatforms_19_0= ruleMDeploymentPlatform ) )+ otherlv_20= '}' otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deployment' otherlv_23= 'alternatives' otherlv_24= '{' ( (lv_deploymentAlternatives_25_0= ruleMDeploymentAlternative ) )+ otherlv_26= '}' otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'components' otherlv_29= '{' ( (lv_components_30_0= ruleMComponentInstance ) )+ otherlv_31= '}' otherlv_32= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'connections' otherlv_34= '{' ( (lv_connections_35_0= ruleMConnection ) )+ otherlv_36= '}' otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'libraries' otherlv_39= '{' ( (lv_libraries_40_0= ruleMServiceLibraryInstance ) )+ otherlv_41= '}' otherlv_42= ';' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                         
                        int index8_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_0==22) ) {s = 1;}

                        else if ( LA8_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( LA8_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( (LA8_0==15) ) {s = 4;}

                        else if ( LA8_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA8_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA8_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_4 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3) ) {s = 8;}

                        else if ( LA8_4 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2) ) {s = 9;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000E148000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000E548000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000400000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001100400000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000030000400000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800500000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000400000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000500000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000400000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000000E108000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000002000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000000E508000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000A400000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000A400000400000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000040000400000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000400000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00F00000200000F0L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0280000000000002L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0C00000000000002L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0080000000000020L});
    }


}