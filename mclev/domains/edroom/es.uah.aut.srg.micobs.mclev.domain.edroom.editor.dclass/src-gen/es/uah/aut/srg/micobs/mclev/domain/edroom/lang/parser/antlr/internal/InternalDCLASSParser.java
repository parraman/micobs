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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.parser.antlr.internal;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;

import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services.DCLASSGrammarAccess;
@SuppressWarnings("all")
public class InternalDCLASSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'dataclass'", "'inherits'", "','", "'{'", "'version'", "':='", "'}'", "'union'", "'enum'", "'='", "'['", "']'", "'TEDROOMBool'", "'TEDROOMByte'", "'TEDROOMDouble'", "'TEDROOMFloat'", "'TEDROOMInt16'", "'TEDROOMInt32'", "'TEDROOMInt64'", "'TEDROOMInt8'", "'TEDROOMUInt16'", "'TEDROOMUInt32'", "'TEDROOMUInt64'", "'TEDROOMUInt8'", "'TEDROOMWord16'", "'TEDROOMWord32'", "'TEDROOMWord64'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators

        public InternalDCLASSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDCLASSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalDCLASSParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g"; }

    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private DCLASSGrammarAccess grammarAccess;

        public InternalDCLASSParser(TokenStream input, DCLASSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EDROOMDCLASSPackageFile";
       	}

       	@Override
       	protected DCLASSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}

    // $ANTLR start "entryRuleEDROOMDCLASSPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:75:1: entryRuleEDROOMDCLASSPackageFile returns [EObject current=null] : iv_ruleEDROOMDCLASSPackageFile= ruleEDROOMDCLASSPackageFile EOF ;
    public final EObject entryRuleEDROOMDCLASSPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDCLASSPackageFile = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:76:2: (iv_ruleEDROOMDCLASSPackageFile= ruleEDROOMDCLASSPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:77:2: iv_ruleEDROOMDCLASSPackageFile= ruleEDROOMDCLASSPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDCLASSPackageFileRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDCLASSPackageFile_in_entryRuleEDROOMDCLASSPackageFile81);
            iv_ruleEDROOMDCLASSPackageFile=ruleEDROOMDCLASSPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDCLASSPackageFile;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDCLASSPackageFile91); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDCLASSPackageFile"

    // $ANTLR start "ruleEDROOMDCLASSPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:84:1: ruleEDROOMDCLASSPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMDCLASSPackageElement ) ) ) ;
    public final EObject ruleEDROOMDCLASSPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:87:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMDCLASSPackageElement ) ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMDCLASSPackageElement ) ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:88:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMDCLASSPackageElement ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:88:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMDCLASSPackageElement ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEDROOMDCLASSPackageFile128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEDROOMDCLASSPackageFileAccess().getPackageKeyword_0());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:92:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:93:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:93:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:94:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDCLASSPackageFileRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDCLASSPackageFileAccess().getPackageEDROOMPackageCrossReference_1_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleEDROOMDCLASSPackageFile155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDCLASSPackageFile167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEDROOMDCLASSPackageFileAccess().getSemicolonKeyword_2());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:114:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }

                switch (alt1) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:114:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEDROOMDCLASSPackageFile180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEDROOMDCLASSPackageFileAccess().getImportKeyword_3_0());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:118:1: ( ( ruleQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:119:1: ( ruleQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:119:1: ( ruleQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:120:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      		  /* */

            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEDROOMDCLASSPackageFileRule());
            	      	        }

            	    }
            	    if ( state.backtracking==0 ) {

            	      	        newCompositeNode(grammarAccess.getEDROOMDCLASSPackageFileAccess().getImportsEDROOMPackageCrossReference_3_1_0());

            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleEDROOMDCLASSPackageFile207);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        afterParserOrEnumRuleCall();

            	    }

            	    }

            	    }

            	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDCLASSPackageFile219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getEDROOMDCLASSPackageFileAccess().getSemicolonKeyword_3_2());

            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:140:3: ( (lv_element_6_0= ruleEDROOMDCLASSPackageElement ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:141:1: (lv_element_6_0= ruleEDROOMDCLASSPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:141:1: (lv_element_6_0= ruleEDROOMDCLASSPackageElement )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:142:3: lv_element_6_0= ruleEDROOMDCLASSPackageElement
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDCLASSPackageFileAccess().getElementEDROOMDCLASSPackageElementParserRuleCall_4_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDCLASSPackageElement_in_ruleEDROOMDCLASSPackageFile242);
            lv_element_6_0=ruleEDROOMDCLASSPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDCLASSPackageFileRule());
              	        }
                     		set(
                     			current,
                     			"element",
                      		lv_element_6_0,
                      		"EDROOMDCLASSPackageElement");
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
    // $ANTLR end "ruleEDROOMDCLASSPackageFile"

    // $ANTLR start "entryRuleEInt"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:166:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:167:2: (iv_ruleEInt= ruleEInt EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:168:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt279);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText();
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt290); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"

    // $ANTLR start "ruleEInt"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:175:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:178:28: (this_INT_0= RULE_INT )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:179:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);

            }
            if ( state.backtracking==0 ) {

                  newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());

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
    // $ANTLR end "ruleEInt"

    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:194:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:195:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:196:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName374);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText();
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName385); if (state.failed) return current;

            }

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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:203:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:206:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:207:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:207:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:207:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);

            }
            if ( state.backtracking==0 ) {

                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:214:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }

                switch (alt2) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:215:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQualifiedName444); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());

            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName459); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:235:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:236:2: (iv_ruleVersion= ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:237:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion507);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText();
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion518); if (state.failed) return current;

            }

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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:244:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:247:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:248:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:248:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:248:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:248:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
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
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:248:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);

                    }
                    if ( state.backtracking==0 ) {

                          newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:256:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:256:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:256:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:256:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:256:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion587); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);

                            }
                            if ( state.backtracking==0 ) {

                                  newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());

                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion609); if (state.failed) return current;
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

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:270:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }

                switch (alt7) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:271:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVersion630); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:276:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
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
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:276:6: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion646); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_4);

            	            }
            	            if ( state.backtracking==0 ) {

            	                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());

            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:284:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:284:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:284:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:284:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:284:12: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion674); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      		current.merge(this_INT_5);

            	                    }
            	                    if ( state.backtracking==0 ) {

            	                          newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());

            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion696); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:306:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:307:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:308:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedNameRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName746);
            iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedName.getText();
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedName757); if (state.failed) return current;

            }

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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:315:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:318:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:319:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:319:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:320:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleVersionedQualifiedName804);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);

            }
            if ( state.backtracking==0 ) {

                      afterParserOrEnumRuleCall();

            }
            kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVersionedQualifiedName822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());

            }
            if ( state.backtracking==0 ) {

                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleVersionedQualifiedName844);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Version_2);

            }
            if ( state.backtracking==0 ) {

                      afterParserOrEnumRuleCall();

            }
            kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleVersionedQualifiedName862); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:361:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:362:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:363:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName903);
            iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedReferenceName.getText();
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName914); if (state.failed) return current;

            }

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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:370:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:373:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:374:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:374:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:374:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:374:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
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
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:375:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleVersionedQualifiedReferenceName962);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VersionedQualifiedName_0);

                    }
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();

                    }
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVersionedQualifiedReferenceName980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());

                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);

            }
            if ( state.backtracking==0 ) {

                  newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:398:1: (kw= '::' this_ID_4= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }

                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:399:2: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVersionedQualifiedReferenceName1016); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());

            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName1031); if (state.failed) return current;
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

    // $ANTLR start "entryRuleEDROOMDCLASSPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:419:1: entryRuleEDROOMDCLASSPackageElement returns [EObject current=null] : iv_ruleEDROOMDCLASSPackageElement= ruleEDROOMDCLASSPackageElement EOF ;
    public final EObject entryRuleEDROOMDCLASSPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDCLASSPackageElement = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:420:2: (iv_ruleEDROOMDCLASSPackageElement= ruleEDROOMDCLASSPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:421:2: iv_ruleEDROOMDCLASSPackageElement= ruleEDROOMDCLASSPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDCLASSPackageElementRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDCLASSPackageElement_in_entryRuleEDROOMDCLASSPackageElement1078);
            iv_ruleEDROOMDCLASSPackageElement=ruleEDROOMDCLASSPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDCLASSPackageElement;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDCLASSPackageElement1088); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDCLASSPackageElement"

    // $ANTLR start "ruleEDROOMDCLASSPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:428:1: ruleEDROOMDCLASSPackageElement returns [EObject current=null] : this_EDROOMDataClass_0= ruleEDROOMDataClass ;
    public final EObject ruleEDROOMDCLASSPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_EDROOMDataClass_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:431:28: (this_EDROOMDataClass_0= ruleEDROOMDataClass )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:433:2: this_EDROOMDataClass_0= ruleEDROOMDataClass
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      newCompositeNode(grammarAccess.getEDROOMDCLASSPackageElementAccess().getEDROOMDataClassParserRuleCall());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataClass_in_ruleEDROOMDCLASSPackageElement1137);
            this_EDROOMDataClass_0=ruleEDROOMDataClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_EDROOMDataClass_0;
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
    // $ANTLR end "ruleEDROOMDCLASSPackageElement"

    // $ANTLR start "entryRuleEDROOMDataClass"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:452:1: entryRuleEDROOMDataClass returns [EObject current=null] : iv_ruleEDROOMDataClass= ruleEDROOMDataClass EOF ;
    public final EObject entryRuleEDROOMDataClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataClass = null;


        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5()
        		);

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:458:2: (iv_ruleEDROOMDataClass= ruleEDROOMDataClass EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:459:2: iv_ruleEDROOMDataClass= ruleEDROOMDataClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataClassRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataClass_in_entryRuleEDROOMDataClass1177);
            iv_ruleEDROOMDataClass=ruleEDROOMDataClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataClass;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataClass1187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEDROOMDataClass"

    // $ANTLR start "ruleEDROOMDataClass"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:469:1: ruleEDROOMDataClass returns [EObject current=null] : ( () otherlv_1= 'dataclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';' ) ;
    public final EObject ruleEDROOMDataClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_version_11_0 = null;

        EObject lv_definitions_13_0 = null;

        EObject lv_fields_14_0 = null;

         enterRule();
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5()
        		);

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:475:28: ( ( () otherlv_1= 'dataclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:476:1: ( () otherlv_1= 'dataclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:476:1: ( () otherlv_1= 'dataclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:476:2: () otherlv_1= 'dataclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:476:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:477:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataClassAccess().getEDROOMDataClassAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEDROOMDataClass1240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataClassAccess().getDataclassKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:489:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:490:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:490:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:491:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataClass1257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataClassAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataClassRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:507:2: (otherlv_3= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:507:4: otherlv_3= 'inherits' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEDROOMDataClass1275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataClassAccess().getInheritsKeyword_3_0());

                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:511:1: ( ( ruleVersionedQualifiedName ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:512:1: ( ruleVersionedQualifiedName )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:512:1: ( ruleVersionedQualifiedName )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:513:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      		  /* */

                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEDROOMDataClassRule());
                      	        }

                    }
                    if ( state.backtracking==0 ) {

                      	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getInheritsEDROOMDataClassCrossReference_3_1_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMDataClass1302);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        afterParserOrEnumRuleCall();

                    }

                    }

                    }

                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:529:2: (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }

                        switch (alt10) {
                    	case 1 :
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:529:4: otherlv_5= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEDROOMDataClass1315); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEDROOMDataClassAccess().getCommaKeyword_3_2_0());

                    	    }
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:533:1: ( ( ruleVersionedQualifiedName ) )
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:534:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:534:1: ( ruleVersionedQualifiedName )
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:535:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      		  /* */

                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEDROOMDataClassRule());
                    	      	        }

                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getInheritsEDROOMDataClassCrossReference_3_2_1_0());

                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMDataClass1342);
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

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDROOMDataClass1358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEDROOMDataClassAccess().getLeftCurlyBracketKeyword_4());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:555:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:557:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:557:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:558:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5());
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:561:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?)
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:562:3: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+ {...}?
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:562:3: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=3;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:564:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:564:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:565:5: {...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMDataClass", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:565:112: ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:566:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 0);
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:569:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:569:7: {...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMDataClass", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:569:16: (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:569:18: otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEDROOMDataClass1416); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getEDROOMDataClassAccess().getVersionKeyword_5_0_0());

            	    }
            	    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEDROOMDataClass1428); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getEDROOMDataClassAccess().getColonEqualsSignKeyword_5_0_1());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:577:1: ( (lv_version_11_0= ruleVersion ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:578:1: (lv_version_11_0= ruleVersion )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:578:1: (lv_version_11_0= ruleVersion )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:579:3: lv_version_11_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getVersionVersionParserRuleCall_5_0_2_0());

            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleEDROOMDataClass1449);
            	    lv_version_11_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEDROOMDataClassRule());
            	      	        }
            	             		set(
            	             			current,
            	             			"version",
            	              		lv_version_11_0,
            	              		"Version");
            	      	        afterParserOrEnumRuleCall();

            	    }

            	    }

            	    }

            	    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataClass1461); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getEDROOMDataClassAccess().getSemicolonKeyword_5_0_3());

            	    }

            	    }

            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5());

            	    }

            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:606:4: ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:606:4: ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:607:5: {...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMDataClass", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:607:112: ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:608:6: ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1);
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:6: ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        alt13 = dfa13.predict(input);
            	        switch (alt13) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:7: {...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleEDROOMDataClass", "true");
            	    	    }
            	    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:16: ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) )
            	    	    int alt12=2;
            	    	    switch ( input.LA(1) ) {
            	    	    case 25:
            	    	        {
            	    	        int LA12_1 = input.LA(2);

            	    	        if ( (LA12_1==RULE_ID) ) {
            	    	            int LA12_4 = input.LA(3);

            	    	            if ( (LA12_4==RULE_ID||(LA12_4>=14 && LA12_4<=15)||LA12_4==17) ) {
            	    	                alt12=2;
            	    	            }
            	    	            else if ( (LA12_4==21) ) {
            	    	                alt12=1;
            	    	            }
            	    	            else {
            	    	                if (state.backtracking>0) {state.failed=true; return current;}
            	    	                NoViableAltException nvae =
            	    	                    new NoViableAltException("", 12, 4, input);

            	    	                throw nvae;
            	    	            }
            	    	        }
            	    	        else {
            	    	            if (state.backtracking>0) {state.failed=true; return current;}
            	    	            NoViableAltException nvae =
            	    	                new NoViableAltException("", 12, 1, input);

            	    	            throw nvae;
            	    	        }
            	    	        }
            	    	        break;
            	    	    case 26:
            	    	        {
            	    	        int LA12_2 = input.LA(2);

            	    	        if ( (LA12_2==RULE_ID) ) {
            	    	            int LA12_5 = input.LA(3);

            	    	            if ( (LA12_5==RULE_ID||(LA12_5>=14 && LA12_5<=15)||LA12_5==17) ) {
            	    	                alt12=2;
            	    	            }
            	    	            else if ( (LA12_5==21) ) {
            	    	                alt12=1;
            	    	            }
            	    	            else {
            	    	                if (state.backtracking>0) {state.failed=true; return current;}
            	    	                NoViableAltException nvae =
            	    	                    new NoViableAltException("", 12, 5, input);

            	    	                throw nvae;
            	    	            }
            	    	        }
            	    	        else {
            	    	            if (state.backtracking>0) {state.failed=true; return current;}
            	    	            NoViableAltException nvae =
            	    	                new NoViableAltException("", 12, 2, input);

            	    	            throw nvae;
            	    	        }
            	    	        }
            	    	        break;
            	    	    case RULE_ID:
            	    	    case 30:
            	    	    case 31:
            	    	    case 32:
            	    	    case 33:
            	    	    case 34:
            	    	    case 35:
            	    	    case 36:
            	    	    case 37:
            	    	    case 38:
            	    	    case 39:
            	    	    case 40:
            	    	    case 41:
            	    	    case 42:
            	    	    case 43:
            	    	    case 44:
            	    	        {
            	    	        alt12=2;
            	    	        }
            	    	        break;
            	    	    default:
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 12, 0, input);

            	    	        throw nvae;
            	    	    }

            	    	    switch (alt12) {
            	    	        case 1 :
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:17: ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) )
            	    	            {
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:17: ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) )
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:612:1: (lv_definitions_13_0= ruleEDROOMDataDefinition )
            	    	            {
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:612:1: (lv_definitions_13_0= ruleEDROOMDataDefinition )
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:613:3: lv_definitions_13_0= ruleEDROOMDataDefinition
            	    	            {
            	    	            if ( state.backtracking==0 ) {

            	    	              	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getDefinitionsEDROOMDataDefinitionParserRuleCall_5_1_0_0());

            	    	            }
            	    	            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinition_in_ruleEDROOMDataClass1538);
            	    	            lv_definitions_13_0=ruleEDROOMDataDefinition();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              	        if (current==null) {
            	    	              	            current = createModelElementForParent(grammarAccess.getEDROOMDataClassRule());
            	    	              	        }
            	    	                     		add(
            	    	                     			current,
            	    	                     			"definitions",
            	    	                      		lv_definitions_13_0,
            	    	                      		"EDROOMDataDefinition");
            	    	              	        afterParserOrEnumRuleCall();

            	    	            }

            	    	            }

            	    	            }

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:630:6: ( (lv_fields_14_0= ruleEDROOMDataField ) )
            	    	            {
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:630:6: ( (lv_fields_14_0= ruleEDROOMDataField ) )
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:631:1: (lv_fields_14_0= ruleEDROOMDataField )
            	    	            {
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:631:1: (lv_fields_14_0= ruleEDROOMDataField )
            	    	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:632:3: lv_fields_14_0= ruleEDROOMDataField
            	    	            {
            	    	            if ( state.backtracking==0 ) {

            	    	              	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getFieldsEDROOMDataFieldParserRuleCall_5_1_1_0());

            	    	            }
            	    	            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataField_in_ruleEDROOMDataClass1565);
            	    	            lv_fields_14_0=ruleEDROOMDataField();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              	        if (current==null) {
            	    	              	            current = createModelElementForParent(grammarAccess.getEDROOMDataClassRule());
            	    	              	        }
            	    	                     		add(
            	    	                     			current,
            	    	                     			"fields",
            	    	                      		lv_fields_14_0,
            	    	                      		"EDROOMDataField");
            	    	              	        afterParserOrEnumRuleCall();

            	    	            }

            	    	            }

            	    	            }

            	    	            }
            	    	            break;

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5());

            	    }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleEDROOMDataClass", "getUnorderedGroupHelper().canLeave(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5())");
            }

            }

            }

            getUnorderedGroupHelper().leave(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5());

            }

            otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDROOMDataClass1625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getEDROOMDataClassAccess().getRightCurlyBracketKeyword_6());

            }
            otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataClass1637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getEDROOMDataClassAccess().getSemicolonKeyword_7());

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
    // $ANTLR end "ruleEDROOMDataClass"

    // $ANTLR start "entryRuleEDROOMDataDefinition"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:682:1: entryRuleEDROOMDataDefinition returns [EObject current=null] : iv_ruleEDROOMDataDefinition= ruleEDROOMDataDefinition EOF ;
    public final EObject entryRuleEDROOMDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinition = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:683:2: (iv_ruleEDROOMDataDefinition= ruleEDROOMDataDefinition EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:684:2: iv_ruleEDROOMDataDefinition= ruleEDROOMDataDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinition_in_entryRuleEDROOMDataDefinition1677);
            iv_ruleEDROOMDataDefinition=ruleEDROOMDataDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinition;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinition1687); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinition"

    // $ANTLR start "ruleEDROOMDataDefinition"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:691:1: ruleEDROOMDataDefinition returns [EObject current=null] : (this_EDROOMDataDefinitionUnion_0= ruleEDROOMDataDefinitionUnion | this_EDROOMDataDefinitionEnum_1= ruleEDROOMDataDefinitionEnum ) ;
    public final EObject ruleEDROOMDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_EDROOMDataDefinitionUnion_0 = null;

        EObject this_EDROOMDataDefinitionEnum_1 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:694:28: ( (this_EDROOMDataDefinitionUnion_0= ruleEDROOMDataDefinitionUnion | this_EDROOMDataDefinitionEnum_1= ruleEDROOMDataDefinitionEnum ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:695:1: (this_EDROOMDataDefinitionUnion_0= ruleEDROOMDataDefinitionUnion | this_EDROOMDataDefinitionEnum_1= ruleEDROOMDataDefinitionEnum )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:695:1: (this_EDROOMDataDefinitionUnion_0= ruleEDROOMDataDefinitionUnion | this_EDROOMDataDefinitionEnum_1= ruleEDROOMDataDefinitionEnum )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:696:2: this_EDROOMDataDefinitionUnion_0= ruleEDROOMDataDefinitionUnion
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionAccess().getEDROOMDataDefinitionUnionParserRuleCall_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnion_in_ruleEDROOMDataDefinition1737);
                    this_EDROOMDataDefinitionUnion_0=ruleEDROOMDataDefinitionUnion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionUnion_0;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:709:2: this_EDROOMDataDefinitionEnum_1= ruleEDROOMDataDefinitionEnum
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionAccess().getEDROOMDataDefinitionEnumParserRuleCall_1());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionEnum_in_ruleEDROOMDataDefinition1767);
                    this_EDROOMDataDefinitionEnum_1=ruleEDROOMDataDefinitionEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionEnum_1;
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
    // $ANTLR end "ruleEDROOMDataDefinition"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnion"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:728:1: entryRuleEDROOMDataDefinitionUnion returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnion= ruleEDROOMDataDefinitionUnion EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnion = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:729:2: (iv_ruleEDROOMDataDefinitionUnion= ruleEDROOMDataDefinitionUnion EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:730:2: iv_ruleEDROOMDataDefinitionUnion= ruleEDROOMDataDefinitionUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnion_in_entryRuleEDROOMDataDefinitionUnion1802);
            iv_ruleEDROOMDataDefinitionUnion=ruleEDROOMDataDefinitionUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnion;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnion1812); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnion"

    // $ANTLR start "ruleEDROOMDataDefinitionUnion"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:737:1: ruleEDROOMDataDefinitionUnion returns [EObject current=null] : ( () otherlv_1= 'union' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_5_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_6_0= ruleEDROOMDataDefinitionUnionElement ) )* otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_6_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:740:28: ( ( () otherlv_1= 'union' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_5_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_6_0= ruleEDROOMDataDefinitionUnionElement ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:741:1: ( () otherlv_1= 'union' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_5_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_6_0= ruleEDROOMDataDefinitionUnionElement ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:741:1: ( () otherlv_1= 'union' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_5_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_6_0= ruleEDROOMDataDefinitionUnionElement ) )* otherlv_7= '}' otherlv_8= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:741:2: () otherlv_1= 'union' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_5_0= ruleEDROOMDataDefinitionUnionElement ) ) ( (lv_elements_6_0= ruleEDROOMDataDefinitionUnionElement ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:741:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:742:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionUnionAccess().getEDROOMDataDefinitionUnionAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDROOMDataDefinitionUnion1861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataDefinitionUnionAccess().getUnionKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:754:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:755:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:755:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:756:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnion1878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataDefinitionUnionAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDROOMDataDefinitionUnion1895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataDefinitionUnionAccess().getLeftCurlyBracketKeyword_3());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:776:1: ( (lv_elements_4_0= ruleEDROOMDataDefinitionUnionElement ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:777:1: (lv_elements_4_0= ruleEDROOMDataDefinitionUnionElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:777:1: (lv_elements_4_0= ruleEDROOMDataDefinitionUnionElement )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:778:3: lv_elements_4_0= ruleEDROOMDataDefinitionUnionElement
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsEDROOMDataDefinitionUnionElementParserRuleCall_4_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElement_in_ruleEDROOMDataDefinitionUnion1916);
            lv_elements_4_0=ruleEDROOMDataDefinitionUnionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionUnionRule());
              	        }
                     		add(
                     			current,
                     			"elements",
                      		lv_elements_4_0,
                      		"EDROOMDataDefinitionUnionElement");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:794:2: ( (lv_elements_5_0= ruleEDROOMDataDefinitionUnionElement ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:795:1: (lv_elements_5_0= ruleEDROOMDataDefinitionUnionElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:795:1: (lv_elements_5_0= ruleEDROOMDataDefinitionUnionElement )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:796:3: lv_elements_5_0= ruleEDROOMDataDefinitionUnionElement
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsEDROOMDataDefinitionUnionElementParserRuleCall_5_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElement_in_ruleEDROOMDataDefinitionUnion1937);
            lv_elements_5_0=ruleEDROOMDataDefinitionUnionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionUnionRule());
              	        }
                     		add(
                     			current,
                     			"elements",
                      		lv_elements_5_0,
                      		"EDROOMDataDefinitionUnionElement");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:812:2: ( (lv_elements_6_0= ruleEDROOMDataDefinitionUnionElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==25||(LA16_0>=30 && LA16_0<=44)) ) {
                    alt16=1;
                }

                switch (alt16) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:813:1: (lv_elements_6_0= ruleEDROOMDataDefinitionUnionElement )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:813:1: (lv_elements_6_0= ruleEDROOMDataDefinitionUnionElement )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:814:3: lv_elements_6_0= ruleEDROOMDataDefinitionUnionElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsEDROOMDataDefinitionUnionElementParserRuleCall_6_0());

            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElement_in_ruleEDROOMDataDefinitionUnion1958);
            	    lv_elements_6_0=ruleEDROOMDataDefinitionUnionElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionUnionRule());
            	      	        }
            	             		add(
            	             			current,
            	             			"elements",
            	              		lv_elements_6_0,
            	              		"EDROOMDataDefinitionUnionElement");
            	      	        afterParserOrEnumRuleCall();

            	    }

            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDROOMDataDefinitionUnion1971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEDROOMDataDefinitionUnionAccess().getRightCurlyBracketKeyword_7());

            }
            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionUnion1983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEDROOMDataDefinitionUnionAccess().getSemicolonKeyword_8());

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
    // $ANTLR end "ruleEDROOMDataDefinitionUnion"

    // $ANTLR start "entryRuleEDROOMDataDefinitionEnum"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:846:1: entryRuleEDROOMDataDefinitionEnum returns [EObject current=null] : iv_ruleEDROOMDataDefinitionEnum= ruleEDROOMDataDefinitionEnum EOF ;
    public final EObject entryRuleEDROOMDataDefinitionEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionEnum = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:847:2: (iv_ruleEDROOMDataDefinitionEnum= ruleEDROOMDataDefinitionEnum EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:848:2: iv_ruleEDROOMDataDefinitionEnum= ruleEDROOMDataDefinitionEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionEnumRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionEnum_in_entryRuleEDROOMDataDefinitionEnum2019);
            iv_ruleEDROOMDataDefinitionEnum=ruleEDROOMDataDefinitionEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionEnum;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionEnum2029); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionEnum"

    // $ANTLR start "ruleEDROOMDataDefinitionEnum"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:855:1: ruleEDROOMDataDefinitionEnum returns [EObject current=null] : ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionEnumElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement ) ) )* otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:858:28: ( ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionEnumElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement ) ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:859:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionEnumElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement ) ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:859:1: ( () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionEnumElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement ) ) )* otherlv_7= '}' otherlv_8= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:859:2: () otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEDROOMDataDefinitionEnumElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement ) ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:859:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:860:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionEnumAccess().getEDROOMDataDefinitionEnumAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDROOMDataDefinitionEnum2078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataDefinitionEnumAccess().getEnumKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:872:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:873:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:873:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:874:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionEnum2095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataDefinitionEnumAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionEnumRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDROOMDataDefinitionEnum2112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataDefinitionEnumAccess().getLeftCurlyBracketKeyword_3());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:894:1: ( (lv_elements_4_0= ruleEDROOMDataDefinitionEnumElement ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:895:1: (lv_elements_4_0= ruleEDROOMDataDefinitionEnumElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:895:1: (lv_elements_4_0= ruleEDROOMDataDefinitionEnumElement )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:896:3: lv_elements_4_0= ruleEDROOMDataDefinitionEnumElement
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionEnumAccess().getElementsEDROOMDataDefinitionEnumElementParserRuleCall_4_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionEnumElement_in_ruleEDROOMDataDefinitionEnum2133);
            lv_elements_4_0=ruleEDROOMDataDefinitionEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionEnumRule());
              	        }
                     		add(
                     			current,
                     			"elements",
                      		lv_elements_4_0,
                      		"EDROOMDataDefinitionEnumElement");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:912:2: (otherlv_5= ',' ( (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }

                switch (alt17) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:912:4: otherlv_5= ',' ( (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEDROOMDataDefinitionEnum2146); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getEDROOMDataDefinitionEnumAccess().getCommaKeyword_5_0());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:916:1: ( (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:917:1: (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:917:1: (lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:918:3: lv_elements_6_0= ruleEDROOMDataDefinitionEnumElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionEnumAccess().getElementsEDROOMDataDefinitionEnumElementParserRuleCall_5_1_0());

            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionEnumElement_in_ruleEDROOMDataDefinitionEnum2167);
            	    lv_elements_6_0=ruleEDROOMDataDefinitionEnumElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionEnumRule());
            	      	        }
            	             		add(
            	             			current,
            	             			"elements",
            	              		lv_elements_6_0,
            	              		"EDROOMDataDefinitionEnumElement");
            	      	        afterParserOrEnumRuleCall();

            	    }

            	    }

            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDROOMDataDefinitionEnum2181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEDROOMDataDefinitionEnumAccess().getRightCurlyBracketKeyword_6());

            }
            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionEnum2193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEDROOMDataDefinitionEnumAccess().getSemicolonKeyword_7());

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
    // $ANTLR end "ruleEDROOMDataDefinitionEnum"

    // $ANTLR start "entryRuleEDROOMDataDefinitionEnumElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:950:1: entryRuleEDROOMDataDefinitionEnumElement returns [EObject current=null] : iv_ruleEDROOMDataDefinitionEnumElement= ruleEDROOMDataDefinitionEnumElement EOF ;
    public final EObject entryRuleEDROOMDataDefinitionEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionEnumElement = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:951:2: (iv_ruleEDROOMDataDefinitionEnumElement= ruleEDROOMDataDefinitionEnumElement EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:952:2: iv_ruleEDROOMDataDefinitionEnumElement= ruleEDROOMDataDefinitionEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionEnumElementRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionEnumElement_in_entryRuleEDROOMDataDefinitionEnumElement2229);
            iv_ruleEDROOMDataDefinitionEnumElement=ruleEDROOMDataDefinitionEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionEnumElement;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionEnumElement2239); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionEnumElement"

    // $ANTLR start "ruleEDROOMDataDefinitionEnumElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:959:1: ruleEDROOMDataDefinitionEnumElement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) )? ) ;
    public final EObject ruleEDROOMDataDefinitionEnumElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:962:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) )? ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:963:1: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:963:1: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:963:2: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) )?
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:963:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:964:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getEDROOMDataDefinitionEnumElementAction_0(),
                          current);

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:972:2: ( (lv_name_1_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:973:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:973:1: (lv_name_1_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:974:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionEnumElement2293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getNameIDTerminalRuleCall_1_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionEnumElementRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_1_0,
                      		"ID");

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:990:2: (otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:990:4: otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEDROOMDataDefinitionEnumElement2311); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getEqualsSignKeyword_2_0());

                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:994:1: ( (lv_value_3_0= ruleEInt ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:995:1: (lv_value_3_0= ruleEInt )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:995:1: (lv_value_3_0= ruleEInt )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:996:3: lv_value_3_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getValueEIntParserRuleCall_2_1_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionEnumElement2332);
                    lv_value_3_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionEnumElementRule());
                      	        }
                             		set(
                             			current,
                             			"value",
                              		lv_value_3_0,
                              		"EInt");
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
    // $ANTLR end "ruleEDROOMDataDefinitionEnumElement"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnionElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1020:1: entryRuleEDROOMDataDefinitionUnionElement returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnionElement= ruleEDROOMDataDefinitionUnionElement EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnionElement = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1021:2: (iv_ruleEDROOMDataDefinitionUnionElement= ruleEDROOMDataDefinitionUnionElement EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1022:2: iv_ruleEDROOMDataDefinitionUnionElement= ruleEDROOMDataDefinitionUnionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElement_in_entryRuleEDROOMDataDefinitionUnionElement2370);
            iv_ruleEDROOMDataDefinitionUnionElement=ruleEDROOMDataDefinitionUnionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnionElement;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElement2380); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnionElement"

    // $ANTLR start "ruleEDROOMDataDefinitionUnionElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1029:1: ruleEDROOMDataDefinitionUnionElement returns [EObject current=null] : (this_EDROOMDataDefinitionUnionElementBasic_0= ruleEDROOMDataDefinitionUnionElementBasic | this_EDROOMDataDefinitionUnionElementBasicArray_1= ruleEDROOMDataDefinitionUnionElementBasicArray | this_EDROOMDataDefinitionUnionElementClass_2= ruleEDROOMDataDefinitionUnionElementClass | this_EDROOMDataDefinitionUnionElementClassArray_3= ruleEDROOMDataDefinitionUnionElementClassArray | this_EDROOMDataDefinitionUnionElementUnion_4= ruleEDROOMDataDefinitionUnionElementUnion | this_EDROOMDataDefinitionUnionElementUnionArray_5= ruleEDROOMDataDefinitionUnionElementUnionArray | this_EDROOMDataDefinitionUnionElementEnum_6= ruleEDROOMDataDefinitionUnionElementEnum | this_EDROOMDataDefinitionUnionElementEnumArray_7= ruleEDROOMDataDefinitionUnionElementEnumArray ) ;
    public final EObject ruleEDROOMDataDefinitionUnionElement() throws RecognitionException {
        EObject current = null;

        EObject this_EDROOMDataDefinitionUnionElementBasic_0 = null;

        EObject this_EDROOMDataDefinitionUnionElementBasicArray_1 = null;

        EObject this_EDROOMDataDefinitionUnionElementClass_2 = null;

        EObject this_EDROOMDataDefinitionUnionElementClassArray_3 = null;

        EObject this_EDROOMDataDefinitionUnionElementUnion_4 = null;

        EObject this_EDROOMDataDefinitionUnionElementUnionArray_5 = null;

        EObject this_EDROOMDataDefinitionUnionElementEnum_6 = null;

        EObject this_EDROOMDataDefinitionUnionElementEnumArray_7 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1032:28: ( (this_EDROOMDataDefinitionUnionElementBasic_0= ruleEDROOMDataDefinitionUnionElementBasic | this_EDROOMDataDefinitionUnionElementBasicArray_1= ruleEDROOMDataDefinitionUnionElementBasicArray | this_EDROOMDataDefinitionUnionElementClass_2= ruleEDROOMDataDefinitionUnionElementClass | this_EDROOMDataDefinitionUnionElementClassArray_3= ruleEDROOMDataDefinitionUnionElementClassArray | this_EDROOMDataDefinitionUnionElementUnion_4= ruleEDROOMDataDefinitionUnionElementUnion | this_EDROOMDataDefinitionUnionElementUnionArray_5= ruleEDROOMDataDefinitionUnionElementUnionArray | this_EDROOMDataDefinitionUnionElementEnum_6= ruleEDROOMDataDefinitionUnionElementEnum | this_EDROOMDataDefinitionUnionElementEnumArray_7= ruleEDROOMDataDefinitionUnionElementEnumArray ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1033:1: (this_EDROOMDataDefinitionUnionElementBasic_0= ruleEDROOMDataDefinitionUnionElementBasic | this_EDROOMDataDefinitionUnionElementBasicArray_1= ruleEDROOMDataDefinitionUnionElementBasicArray | this_EDROOMDataDefinitionUnionElementClass_2= ruleEDROOMDataDefinitionUnionElementClass | this_EDROOMDataDefinitionUnionElementClassArray_3= ruleEDROOMDataDefinitionUnionElementClassArray | this_EDROOMDataDefinitionUnionElementUnion_4= ruleEDROOMDataDefinitionUnionElementUnion | this_EDROOMDataDefinitionUnionElementUnionArray_5= ruleEDROOMDataDefinitionUnionElementUnionArray | this_EDROOMDataDefinitionUnionElementEnum_6= ruleEDROOMDataDefinitionUnionElementEnum | this_EDROOMDataDefinitionUnionElementEnumArray_7= ruleEDROOMDataDefinitionUnionElementEnumArray )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1033:1: (this_EDROOMDataDefinitionUnionElementBasic_0= ruleEDROOMDataDefinitionUnionElementBasic | this_EDROOMDataDefinitionUnionElementBasicArray_1= ruleEDROOMDataDefinitionUnionElementBasicArray | this_EDROOMDataDefinitionUnionElementClass_2= ruleEDROOMDataDefinitionUnionElementClass | this_EDROOMDataDefinitionUnionElementClassArray_3= ruleEDROOMDataDefinitionUnionElementClassArray | this_EDROOMDataDefinitionUnionElementUnion_4= ruleEDROOMDataDefinitionUnionElementUnion | this_EDROOMDataDefinitionUnionElementUnionArray_5= ruleEDROOMDataDefinitionUnionElementUnionArray | this_EDROOMDataDefinitionUnionElementEnum_6= ruleEDROOMDataDefinitionUnionElementEnum | this_EDROOMDataDefinitionUnionElementEnumArray_7= ruleEDROOMDataDefinitionUnionElementEnumArray )
            int alt19=8;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1034:2: this_EDROOMDataDefinitionUnionElementBasic_0= ruleEDROOMDataDefinitionUnionElementBasic
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementBasicParserRuleCall_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementBasic_in_ruleEDROOMDataDefinitionUnionElement2430);
                    this_EDROOMDataDefinitionUnionElementBasic_0=ruleEDROOMDataDefinitionUnionElementBasic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionUnionElementBasic_0;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1047:2: this_EDROOMDataDefinitionUnionElementBasicArray_1= ruleEDROOMDataDefinitionUnionElementBasicArray
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementBasicArrayParserRuleCall_1());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementBasicArray_in_ruleEDROOMDataDefinitionUnionElement2460);
                    this_EDROOMDataDefinitionUnionElementBasicArray_1=ruleEDROOMDataDefinitionUnionElementBasicArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionUnionElementBasicArray_1;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1060:2: this_EDROOMDataDefinitionUnionElementClass_2= ruleEDROOMDataDefinitionUnionElementClass
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementClassParserRuleCall_2());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementClass_in_ruleEDROOMDataDefinitionUnionElement2490);
                    this_EDROOMDataDefinitionUnionElementClass_2=ruleEDROOMDataDefinitionUnionElementClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionUnionElementClass_2;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 4 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1073:2: this_EDROOMDataDefinitionUnionElementClassArray_3= ruleEDROOMDataDefinitionUnionElementClassArray
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementClassArrayParserRuleCall_3());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementClassArray_in_ruleEDROOMDataDefinitionUnionElement2520);
                    this_EDROOMDataDefinitionUnionElementClassArray_3=ruleEDROOMDataDefinitionUnionElementClassArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionUnionElementClassArray_3;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 5 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1086:2: this_EDROOMDataDefinitionUnionElementUnion_4= ruleEDROOMDataDefinitionUnionElementUnion
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementUnionParserRuleCall_4());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementUnion_in_ruleEDROOMDataDefinitionUnionElement2550);
                    this_EDROOMDataDefinitionUnionElementUnion_4=ruleEDROOMDataDefinitionUnionElementUnion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionUnionElementUnion_4;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 6 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1099:2: this_EDROOMDataDefinitionUnionElementUnionArray_5= ruleEDROOMDataDefinitionUnionElementUnionArray
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementUnionArrayParserRuleCall_5());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementUnionArray_in_ruleEDROOMDataDefinitionUnionElement2580);
                    this_EDROOMDataDefinitionUnionElementUnionArray_5=ruleEDROOMDataDefinitionUnionElementUnionArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionUnionElementUnionArray_5;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 7 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1112:2: this_EDROOMDataDefinitionUnionElementEnum_6= ruleEDROOMDataDefinitionUnionElementEnum
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementEnumParserRuleCall_6());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementEnum_in_ruleEDROOMDataDefinitionUnionElement2610);
                    this_EDROOMDataDefinitionUnionElementEnum_6=ruleEDROOMDataDefinitionUnionElementEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionUnionElementEnum_6;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 8 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1125:2: this_EDROOMDataDefinitionUnionElementEnumArray_7= ruleEDROOMDataDefinitionUnionElementEnumArray
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementEnumArrayParserRuleCall_7());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementEnumArray_in_ruleEDROOMDataDefinitionUnionElement2640);
                    this_EDROOMDataDefinitionUnionElementEnumArray_7=ruleEDROOMDataDefinitionUnionElementEnumArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataDefinitionUnionElementEnumArray_7;
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
    // $ANTLR end "ruleEDROOMDataDefinitionUnionElement"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnionElementBasic"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1144:1: entryRuleEDROOMDataDefinitionUnionElementBasic returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnionElementBasic= ruleEDROOMDataDefinitionUnionElementBasic EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnionElementBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnionElementBasic = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1145:2: (iv_ruleEDROOMDataDefinitionUnionElementBasic= ruleEDROOMDataDefinitionUnionElementBasic EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1146:2: iv_ruleEDROOMDataDefinitionUnionElementBasic= ruleEDROOMDataDefinitionUnionElementBasic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementBasicRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementBasic_in_entryRuleEDROOMDataDefinitionUnionElementBasic2675);
            iv_ruleEDROOMDataDefinitionUnionElementBasic=ruleEDROOMDataDefinitionUnionElementBasic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnionElementBasic;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementBasic2685); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnionElementBasic"

    // $ANTLR start "ruleEDROOMDataDefinitionUnionElementBasic"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1153:1: ruleEDROOMDataDefinitionUnionElementBasic returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionUnionElementBasic() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1156:28: ( ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1157:1: ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1157:1: ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1157:2: () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1157:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1158:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getEDROOMDataDefinitionUnionElementBasicAction_0(),
                          current);

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1166:2: ( (lv_type_1_0= ruleEDROOMBasicType ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1167:1: (lv_type_1_0= ruleEDROOMBasicType )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1167:1: (lv_type_1_0= ruleEDROOMBasicType )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1168:3: lv_type_1_0= ruleEDROOMBasicType
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMBasicType_in_ruleEDROOMDataDefinitionUnionElementBasic2743);
            lv_type_1_0=ruleEDROOMBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionUnionElementBasicRule());
              	        }
                     		set(
                     			current,
                     			"type",
                      		lv_type_1_0,
                      		"EDROOMBasicType");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1184:2: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1185:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1185:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1186:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementBasic2760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementBasicRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementBasic2777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getSemicolonKeyword_3());

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
    // $ANTLR end "ruleEDROOMDataDefinitionUnionElementBasic"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnionElementBasicArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1214:1: entryRuleEDROOMDataDefinitionUnionElementBasicArray returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnionElementBasicArray= ruleEDROOMDataDefinitionUnionElementBasicArray EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnionElementBasicArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnionElementBasicArray = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1215:2: (iv_ruleEDROOMDataDefinitionUnionElementBasicArray= ruleEDROOMDataDefinitionUnionElementBasicArray EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1216:2: iv_ruleEDROOMDataDefinitionUnionElementBasicArray= ruleEDROOMDataDefinitionUnionElementBasicArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementBasicArray_in_entryRuleEDROOMDataDefinitionUnionElementBasicArray2813);
            iv_ruleEDROOMDataDefinitionUnionElementBasicArray=ruleEDROOMDataDefinitionUnionElementBasicArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnionElementBasicArray;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementBasicArray2823); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnionElementBasicArray"

    // $ANTLR start "ruleEDROOMDataDefinitionUnionElementBasicArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1223:1: ruleEDROOMDataDefinitionUnionElementBasicArray returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionUnionElementBasicArray() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_elements_4_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1226:28: ( ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1227:1: ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1227:1: ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1227:2: () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1227:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1228:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getEDROOMDataDefinitionUnionElementBasicArrayAction_0(),
                          current);

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1236:2: ( (lv_type_1_0= ruleEDROOMBasicType ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1237:1: (lv_type_1_0= ruleEDROOMBasicType )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1237:1: (lv_type_1_0= ruleEDROOMBasicType )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1238:3: lv_type_1_0= ruleEDROOMBasicType
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMBasicType_in_ruleEDROOMDataDefinitionUnionElementBasicArray2881);
            lv_type_1_0=ruleEDROOMBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayRule());
              	        }
                     		set(
                     			current,
                     			"type",
                      		lv_type_1_0,
                      		"EDROOMBasicType");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1254:2: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1255:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1255:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1256:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementBasicArray2898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDROOMDataDefinitionUnionElementBasicArray2915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getLeftSquareBracketKeyword_3());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1276:1: ( (lv_elements_4_0= ruleEInt ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1277:1: (lv_elements_4_0= ruleEInt )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1277:1: (lv_elements_4_0= ruleEInt )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1278:3: lv_elements_4_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getElementsEIntParserRuleCall_4_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionUnionElementBasicArray2936);
            lv_elements_4_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayRule());
              	        }
                     		set(
                     			current,
                     			"elements",
                      		lv_elements_4_0,
                      		"EInt");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDROOMDataDefinitionUnionElementBasicArray2948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getRightSquareBracketKeyword_5());

            }
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementBasicArray2960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getSemicolonKeyword_6());

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
    // $ANTLR end "ruleEDROOMDataDefinitionUnionElementBasicArray"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnionElementClass"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1310:1: entryRuleEDROOMDataDefinitionUnionElementClass returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnionElementClass= ruleEDROOMDataDefinitionUnionElementClass EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnionElementClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnionElementClass = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1311:2: (iv_ruleEDROOMDataDefinitionUnionElementClass= ruleEDROOMDataDefinitionUnionElementClass EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1312:2: iv_ruleEDROOMDataDefinitionUnionElementClass= ruleEDROOMDataDefinitionUnionElementClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementClassRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementClass_in_entryRuleEDROOMDataDefinitionUnionElementClass2996);
            iv_ruleEDROOMDataDefinitionUnionElementClass=ruleEDROOMDataDefinitionUnionElementClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnionElementClass;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementClass3006); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnionElementClass"

    // $ANTLR start "ruleEDROOMDataDefinitionUnionElementClass"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1319:1: ruleEDROOMDataDefinitionUnionElementClass returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionUnionElementClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1322:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1323:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1323:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1323:2: () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1323:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1324:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getEDROOMDataDefinitionUnionElementClassAction_0(),
                          current);

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1332:2: ( (otherlv_1= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1333:1: (otherlv_1= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1333:1: (otherlv_1= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1334:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementClassRule());
              	        }

            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementClass3067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getTypeEDROOMDataClassCrossReference_1_0());

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1348:2: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1349:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1349:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1350:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementClass3084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementClassRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementClass3101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getSemicolonKeyword_3());

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
    // $ANTLR end "ruleEDROOMDataDefinitionUnionElementClass"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnionElementClassArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1378:1: entryRuleEDROOMDataDefinitionUnionElementClassArray returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnionElementClassArray= ruleEDROOMDataDefinitionUnionElementClassArray EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnionElementClassArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnionElementClassArray = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1379:2: (iv_ruleEDROOMDataDefinitionUnionElementClassArray= ruleEDROOMDataDefinitionUnionElementClassArray EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1380:2: iv_ruleEDROOMDataDefinitionUnionElementClassArray= ruleEDROOMDataDefinitionUnionElementClassArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementClassArray_in_entryRuleEDROOMDataDefinitionUnionElementClassArray3137);
            iv_ruleEDROOMDataDefinitionUnionElementClassArray=ruleEDROOMDataDefinitionUnionElementClassArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnionElementClassArray;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementClassArray3147); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnionElementClassArray"

    // $ANTLR start "ruleEDROOMDataDefinitionUnionElementClassArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1387:1: ruleEDROOMDataDefinitionUnionElementClassArray returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionUnionElementClassArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_elements_4_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1390:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1391:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1391:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1391:2: () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1391:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1392:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getEDROOMDataDefinitionUnionElementClassArrayAction_0(),
                          current);

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1400:2: ( (otherlv_1= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1401:1: (otherlv_1= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1401:1: (otherlv_1= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1402:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayRule());
              	        }

            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementClassArray3208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getTypeEDROOMDataClassCrossReference_1_0());

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1416:2: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1417:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1417:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1418:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementClassArray3225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDROOMDataDefinitionUnionElementClassArray3242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getLeftSquareBracketKeyword_3());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1438:1: ( (lv_elements_4_0= ruleEInt ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1439:1: (lv_elements_4_0= ruleEInt )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1439:1: (lv_elements_4_0= ruleEInt )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1440:3: lv_elements_4_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getElementsEIntParserRuleCall_4_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionUnionElementClassArray3263);
            lv_elements_4_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayRule());
              	        }
                     		set(
                     			current,
                     			"elements",
                      		lv_elements_4_0,
                      		"EInt");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDROOMDataDefinitionUnionElementClassArray3275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getRightSquareBracketKeyword_5());

            }
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementClassArray3287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getSemicolonKeyword_6());

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
    // $ANTLR end "ruleEDROOMDataDefinitionUnionElementClassArray"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnionElementUnion"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1472:1: entryRuleEDROOMDataDefinitionUnionElementUnion returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnionElementUnion= ruleEDROOMDataDefinitionUnionElementUnion EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnionElementUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnionElementUnion = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1473:2: (iv_ruleEDROOMDataDefinitionUnionElementUnion= ruleEDROOMDataDefinitionUnionElementUnion EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1474:2: iv_ruleEDROOMDataDefinitionUnionElementUnion= ruleEDROOMDataDefinitionUnionElementUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementUnionRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementUnion_in_entryRuleEDROOMDataDefinitionUnionElementUnion3323);
            iv_ruleEDROOMDataDefinitionUnionElementUnion=ruleEDROOMDataDefinitionUnionElementUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnionElementUnion;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementUnion3333); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnionElementUnion"

    // $ANTLR start "ruleEDROOMDataDefinitionUnionElementUnion"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1481:1: ruleEDROOMDataDefinitionUnionElementUnion returns [EObject current=null] : ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionUnionElementUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1484:28: ( ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1485:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1485:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1485:2: () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1485:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1486:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getEDROOMDataDefinitionUnionElementUnionAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDROOMDataDefinitionUnionElementUnion3382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getUnionKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1498:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1499:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1499:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1500:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementUnionRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataDefinitionUnionElementUnion3409);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1516:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1517:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1517:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1518:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementUnion3426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getNameIDTerminalRuleCall_3_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementUnionRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_3_0,
                      		"ID");

            }

            }

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementUnion3443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getSemicolonKeyword_4());

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
    // $ANTLR end "ruleEDROOMDataDefinitionUnionElementUnion"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnionElementUnionArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1546:1: entryRuleEDROOMDataDefinitionUnionElementUnionArray returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnionElementUnionArray= ruleEDROOMDataDefinitionUnionElementUnionArray EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnionElementUnionArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnionElementUnionArray = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1547:2: (iv_ruleEDROOMDataDefinitionUnionElementUnionArray= ruleEDROOMDataDefinitionUnionElementUnionArray EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1548:2: iv_ruleEDROOMDataDefinitionUnionElementUnionArray= ruleEDROOMDataDefinitionUnionElementUnionArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementUnionArray_in_entryRuleEDROOMDataDefinitionUnionElementUnionArray3479);
            iv_ruleEDROOMDataDefinitionUnionElementUnionArray=ruleEDROOMDataDefinitionUnionElementUnionArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnionElementUnionArray;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementUnionArray3489); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnionElementUnionArray"

    // $ANTLR start "ruleEDROOMDataDefinitionUnionElementUnionArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1555:1: ruleEDROOMDataDefinitionUnionElementUnionArray returns [EObject current=null] : ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionUnionElementUnionArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_elements_5_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1558:28: ( ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1559:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1559:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1559:2: () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1559:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1560:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getEDROOMDataDefinitionUnionElementUnionArrayAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDROOMDataDefinitionUnionElementUnionArray3538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getUnionKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1572:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1573:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1573:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1574:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataDefinitionUnionElementUnionArray3565);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1590:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1591:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1591:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1592:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementUnionArray3582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getNameIDTerminalRuleCall_3_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_3_0,
                      		"ID");

            }

            }

            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDROOMDataDefinitionUnionElementUnionArray3599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getLeftSquareBracketKeyword_4());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1612:1: ( (lv_elements_5_0= ruleEInt ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1613:1: (lv_elements_5_0= ruleEInt )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1613:1: (lv_elements_5_0= ruleEInt )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1614:3: lv_elements_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getElementsEIntParserRuleCall_5_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionUnionElementUnionArray3620);
            lv_elements_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayRule());
              	        }
                     		set(
                     			current,
                     			"elements",
                      		lv_elements_5_0,
                      		"EInt");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDROOMDataDefinitionUnionElementUnionArray3632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getRightSquareBracketKeyword_6());

            }
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementUnionArray3644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getSemicolonKeyword_7());

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
    // $ANTLR end "ruleEDROOMDataDefinitionUnionElementUnionArray"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnionElementEnum"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1646:1: entryRuleEDROOMDataDefinitionUnionElementEnum returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnionElementEnum= ruleEDROOMDataDefinitionUnionElementEnum EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnionElementEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnionElementEnum = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1647:2: (iv_ruleEDROOMDataDefinitionUnionElementEnum= ruleEDROOMDataDefinitionUnionElementEnum EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1648:2: iv_ruleEDROOMDataDefinitionUnionElementEnum= ruleEDROOMDataDefinitionUnionElementEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementEnumRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementEnum_in_entryRuleEDROOMDataDefinitionUnionElementEnum3680);
            iv_ruleEDROOMDataDefinitionUnionElementEnum=ruleEDROOMDataDefinitionUnionElementEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnionElementEnum;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementEnum3690); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnionElementEnum"

    // $ANTLR start "ruleEDROOMDataDefinitionUnionElementEnum"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1655:1: ruleEDROOMDataDefinitionUnionElementEnum returns [EObject current=null] : ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionUnionElementEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1658:28: ( ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1659:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1659:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1659:2: () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1659:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1660:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getEDROOMDataDefinitionUnionElementEnumAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDROOMDataDefinitionUnionElementEnum3739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getUnionKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1672:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1673:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1673:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1674:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementEnumRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataDefinitionUnionElementEnum3766);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1690:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1691:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1691:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1692:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementEnum3783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getNameIDTerminalRuleCall_3_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementEnumRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_3_0,
                      		"ID");

            }

            }

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementEnum3800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getSemicolonKeyword_4());

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
    // $ANTLR end "ruleEDROOMDataDefinitionUnionElementEnum"

    // $ANTLR start "entryRuleEDROOMDataDefinitionUnionElementEnumArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1720:1: entryRuleEDROOMDataDefinitionUnionElementEnumArray returns [EObject current=null] : iv_ruleEDROOMDataDefinitionUnionElementEnumArray= ruleEDROOMDataDefinitionUnionElementEnumArray EOF ;
    public final EObject entryRuleEDROOMDataDefinitionUnionElementEnumArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataDefinitionUnionElementEnumArray = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1721:2: (iv_ruleEDROOMDataDefinitionUnionElementEnumArray= ruleEDROOMDataDefinitionUnionElementEnumArray EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1722:2: iv_ruleEDROOMDataDefinitionUnionElementEnumArray= ruleEDROOMDataDefinitionUnionElementEnumArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementEnumArray_in_entryRuleEDROOMDataDefinitionUnionElementEnumArray3836);
            iv_ruleEDROOMDataDefinitionUnionElementEnumArray=ruleEDROOMDataDefinitionUnionElementEnumArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataDefinitionUnionElementEnumArray;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementEnumArray3846); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataDefinitionUnionElementEnumArray"

    // $ANTLR start "ruleEDROOMDataDefinitionUnionElementEnumArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1729:1: ruleEDROOMDataDefinitionUnionElementEnumArray returns [EObject current=null] : ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' ) ;
    public final EObject ruleEDROOMDataDefinitionUnionElementEnumArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_elements_5_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1732:28: ( ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1733:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1733:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1733:2: () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1733:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1734:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getEDROOMDataDefinitionUnionElementEnumArrayAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDROOMDataDefinitionUnionElementEnumArray3895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getUnionKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1746:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1747:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1747:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1748:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataDefinitionUnionElementEnumArray3922);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1764:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1765:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1765:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1766:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementEnumArray3939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getNameIDTerminalRuleCall_3_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_3_0,
                      		"ID");

            }

            }

            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDROOMDataDefinitionUnionElementEnumArray3956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getLeftSquareBracketKeyword_4());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1786:1: ( (lv_elements_5_0= ruleEInt ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1787:1: (lv_elements_5_0= ruleEInt )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1787:1: (lv_elements_5_0= ruleEInt )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1788:3: lv_elements_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getElementsEIntParserRuleCall_5_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionUnionElementEnumArray3977);
            lv_elements_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayRule());
              	        }
                     		set(
                     			current,
                     			"elements",
                      		lv_elements_5_0,
                      		"EInt");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDROOMDataDefinitionUnionElementEnumArray3989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getRightSquareBracketKeyword_6());

            }
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementEnumArray4001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getSemicolonKeyword_7());

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
    // $ANTLR end "ruleEDROOMDataDefinitionUnionElementEnumArray"

    // $ANTLR start "entryRuleEDROOMDataField"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1820:1: entryRuleEDROOMDataField returns [EObject current=null] : iv_ruleEDROOMDataField= ruleEDROOMDataField EOF ;
    public final EObject entryRuleEDROOMDataField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataField = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1821:2: (iv_ruleEDROOMDataField= ruleEDROOMDataField EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1822:2: iv_ruleEDROOMDataField= ruleEDROOMDataField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataFieldRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataField_in_entryRuleEDROOMDataField4037);
            iv_ruleEDROOMDataField=ruleEDROOMDataField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataField;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataField4047); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataField"

    // $ANTLR start "ruleEDROOMDataField"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1829:1: ruleEDROOMDataField returns [EObject current=null] : (this_EDROOMDataFieldBasic_0= ruleEDROOMDataFieldBasic | this_EDROOMDataFieldBasicArray_1= ruleEDROOMDataFieldBasicArray | this_EDROOMDataFieldClass_2= ruleEDROOMDataFieldClass | this_EDROOMDataFieldClassArray_3= ruleEDROOMDataFieldClassArray | this_EDROOMDataFieldUnion_4= ruleEDROOMDataFieldUnion | this_EDROOMDataFieldUnionArray_5= ruleEDROOMDataFieldUnionArray | this_EDROOMDataFieldEnum_6= ruleEDROOMDataFieldEnum | this_EDROOMDataFieldEnumArray_7= ruleEDROOMDataFieldEnumArray ) ;
    public final EObject ruleEDROOMDataField() throws RecognitionException {
        EObject current = null;

        EObject this_EDROOMDataFieldBasic_0 = null;

        EObject this_EDROOMDataFieldBasicArray_1 = null;

        EObject this_EDROOMDataFieldClass_2 = null;

        EObject this_EDROOMDataFieldClassArray_3 = null;

        EObject this_EDROOMDataFieldUnion_4 = null;

        EObject this_EDROOMDataFieldUnionArray_5 = null;

        EObject this_EDROOMDataFieldEnum_6 = null;

        EObject this_EDROOMDataFieldEnumArray_7 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1832:28: ( (this_EDROOMDataFieldBasic_0= ruleEDROOMDataFieldBasic | this_EDROOMDataFieldBasicArray_1= ruleEDROOMDataFieldBasicArray | this_EDROOMDataFieldClass_2= ruleEDROOMDataFieldClass | this_EDROOMDataFieldClassArray_3= ruleEDROOMDataFieldClassArray | this_EDROOMDataFieldUnion_4= ruleEDROOMDataFieldUnion | this_EDROOMDataFieldUnionArray_5= ruleEDROOMDataFieldUnionArray | this_EDROOMDataFieldEnum_6= ruleEDROOMDataFieldEnum | this_EDROOMDataFieldEnumArray_7= ruleEDROOMDataFieldEnumArray ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1833:1: (this_EDROOMDataFieldBasic_0= ruleEDROOMDataFieldBasic | this_EDROOMDataFieldBasicArray_1= ruleEDROOMDataFieldBasicArray | this_EDROOMDataFieldClass_2= ruleEDROOMDataFieldClass | this_EDROOMDataFieldClassArray_3= ruleEDROOMDataFieldClassArray | this_EDROOMDataFieldUnion_4= ruleEDROOMDataFieldUnion | this_EDROOMDataFieldUnionArray_5= ruleEDROOMDataFieldUnionArray | this_EDROOMDataFieldEnum_6= ruleEDROOMDataFieldEnum | this_EDROOMDataFieldEnumArray_7= ruleEDROOMDataFieldEnumArray )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1833:1: (this_EDROOMDataFieldBasic_0= ruleEDROOMDataFieldBasic | this_EDROOMDataFieldBasicArray_1= ruleEDROOMDataFieldBasicArray | this_EDROOMDataFieldClass_2= ruleEDROOMDataFieldClass | this_EDROOMDataFieldClassArray_3= ruleEDROOMDataFieldClassArray | this_EDROOMDataFieldUnion_4= ruleEDROOMDataFieldUnion | this_EDROOMDataFieldUnionArray_5= ruleEDROOMDataFieldUnionArray | this_EDROOMDataFieldEnum_6= ruleEDROOMDataFieldEnum | this_EDROOMDataFieldEnumArray_7= ruleEDROOMDataFieldEnumArray )
            int alt20=8;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1834:2: this_EDROOMDataFieldBasic_0= ruleEDROOMDataFieldBasic
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldBasicParserRuleCall_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldBasic_in_ruleEDROOMDataField4097);
                    this_EDROOMDataFieldBasic_0=ruleEDROOMDataFieldBasic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataFieldBasic_0;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1847:2: this_EDROOMDataFieldBasicArray_1= ruleEDROOMDataFieldBasicArray
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldBasicArrayParserRuleCall_1());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldBasicArray_in_ruleEDROOMDataField4127);
                    this_EDROOMDataFieldBasicArray_1=ruleEDROOMDataFieldBasicArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataFieldBasicArray_1;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1860:2: this_EDROOMDataFieldClass_2= ruleEDROOMDataFieldClass
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldClassParserRuleCall_2());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldClass_in_ruleEDROOMDataField4157);
                    this_EDROOMDataFieldClass_2=ruleEDROOMDataFieldClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataFieldClass_2;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 4 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1873:2: this_EDROOMDataFieldClassArray_3= ruleEDROOMDataFieldClassArray
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldClassArrayParserRuleCall_3());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldClassArray_in_ruleEDROOMDataField4187);
                    this_EDROOMDataFieldClassArray_3=ruleEDROOMDataFieldClassArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataFieldClassArray_3;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 5 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1886:2: this_EDROOMDataFieldUnion_4= ruleEDROOMDataFieldUnion
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldUnionParserRuleCall_4());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldUnion_in_ruleEDROOMDataField4217);
                    this_EDROOMDataFieldUnion_4=ruleEDROOMDataFieldUnion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataFieldUnion_4;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 6 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1899:2: this_EDROOMDataFieldUnionArray_5= ruleEDROOMDataFieldUnionArray
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldUnionArrayParserRuleCall_5());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldUnionArray_in_ruleEDROOMDataField4247);
                    this_EDROOMDataFieldUnionArray_5=ruleEDROOMDataFieldUnionArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataFieldUnionArray_5;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 7 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1912:2: this_EDROOMDataFieldEnum_6= ruleEDROOMDataFieldEnum
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldEnumParserRuleCall_6());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldEnum_in_ruleEDROOMDataField4277);
                    this_EDROOMDataFieldEnum_6=ruleEDROOMDataFieldEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataFieldEnum_6;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 8 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1925:2: this_EDROOMDataFieldEnumArray_7= ruleEDROOMDataFieldEnumArray
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldEnumArrayParserRuleCall_7());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldEnumArray_in_ruleEDROOMDataField4307);
                    this_EDROOMDataFieldEnumArray_7=ruleEDROOMDataFieldEnumArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMDataFieldEnumArray_7;
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
    // $ANTLR end "ruleEDROOMDataField"

    // $ANTLR start "entryRuleEDROOMDataFieldBasic"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1944:1: entryRuleEDROOMDataFieldBasic returns [EObject current=null] : iv_ruleEDROOMDataFieldBasic= ruleEDROOMDataFieldBasic EOF ;
    public final EObject entryRuleEDROOMDataFieldBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataFieldBasic = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1945:2: (iv_ruleEDROOMDataFieldBasic= ruleEDROOMDataFieldBasic EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1946:2: iv_ruleEDROOMDataFieldBasic= ruleEDROOMDataFieldBasic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataFieldBasicRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldBasic_in_entryRuleEDROOMDataFieldBasic4342);
            iv_ruleEDROOMDataFieldBasic=ruleEDROOMDataFieldBasic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataFieldBasic;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataFieldBasic4352); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataFieldBasic"

    // $ANTLR start "ruleEDROOMDataFieldBasic"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1953:1: ruleEDROOMDataFieldBasic returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleEDROOMDataFieldBasic() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1956:28: ( ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1957:1: ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1957:1: ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1957:2: () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1957:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1958:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataFieldBasicAccess().getEDROOMDataFieldBasicAction_0(),
                          current);

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1966:2: ( (lv_type_1_0= ruleEDROOMBasicType ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1967:1: (lv_type_1_0= ruleEDROOMBasicType )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1967:1: (lv_type_1_0= ruleEDROOMBasicType )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1968:3: lv_type_1_0= ruleEDROOMBasicType
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldBasicAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMBasicType_in_ruleEDROOMDataFieldBasic4410);
            lv_type_1_0=ruleEDROOMBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataFieldBasicRule());
              	        }
                     		set(
                     			current,
                     			"type",
                      		lv_type_1_0,
                      		"EDROOMBasicType");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1984:2: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1985:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1985:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1986:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataFieldBasic4427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataFieldBasicAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldBasicRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataFieldBasic4444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataFieldBasicAccess().getSemicolonKeyword_3());

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
    // $ANTLR end "ruleEDROOMDataFieldBasic"

    // $ANTLR start "entryRuleEDROOMDataFieldBasicArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2014:1: entryRuleEDROOMDataFieldBasicArray returns [EObject current=null] : iv_ruleEDROOMDataFieldBasicArray= ruleEDROOMDataFieldBasicArray EOF ;
    public final EObject entryRuleEDROOMDataFieldBasicArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataFieldBasicArray = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2015:2: (iv_ruleEDROOMDataFieldBasicArray= ruleEDROOMDataFieldBasicArray EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2016:2: iv_ruleEDROOMDataFieldBasicArray= ruleEDROOMDataFieldBasicArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataFieldBasicArrayRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldBasicArray_in_entryRuleEDROOMDataFieldBasicArray4480);
            iv_ruleEDROOMDataFieldBasicArray=ruleEDROOMDataFieldBasicArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataFieldBasicArray;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataFieldBasicArray4490); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataFieldBasicArray"

    // $ANTLR start "ruleEDROOMDataFieldBasicArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2023:1: ruleEDROOMDataFieldBasicArray returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' ) ;
    public final EObject ruleEDROOMDataFieldBasicArray() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_elements_4_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2026:28: ( ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2027:1: ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2027:1: ( () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2027:2: () ( (lv_type_1_0= ruleEDROOMBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2027:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2028:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataFieldBasicArrayAccess().getEDROOMDataFieldBasicArrayAction_0(),
                          current);

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2036:2: ( (lv_type_1_0= ruleEDROOMBasicType ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2037:1: (lv_type_1_0= ruleEDROOMBasicType )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2037:1: (lv_type_1_0= ruleEDROOMBasicType )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2038:3: lv_type_1_0= ruleEDROOMBasicType
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldBasicArrayAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMBasicType_in_ruleEDROOMDataFieldBasicArray4548);
            lv_type_1_0=ruleEDROOMBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataFieldBasicArrayRule());
              	        }
                     		set(
                     			current,
                     			"type",
                      		lv_type_1_0,
                      		"EDROOMBasicType");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2054:2: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2055:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2055:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2056:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataFieldBasicArray4565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataFieldBasicArrayAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldBasicArrayRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDROOMDataFieldBasicArray4582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataFieldBasicArrayAccess().getLeftSquareBracketKeyword_3());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2076:1: ( (lv_elements_4_0= ruleEInt ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2077:1: (lv_elements_4_0= ruleEInt )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2077:1: (lv_elements_4_0= ruleEInt )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2078:3: lv_elements_4_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldBasicArrayAccess().getElementsEIntParserRuleCall_4_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDROOMDataFieldBasicArray4603);
            lv_elements_4_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataFieldBasicArrayRule());
              	        }
                     		set(
                     			current,
                     			"elements",
                      		lv_elements_4_0,
                      		"EInt");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDROOMDataFieldBasicArray4615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEDROOMDataFieldBasicArrayAccess().getRightSquareBracketKeyword_5());

            }
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataFieldBasicArray4627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMDataFieldBasicArrayAccess().getSemicolonKeyword_6());

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
    // $ANTLR end "ruleEDROOMDataFieldBasicArray"

    // $ANTLR start "entryRuleEDROOMDataFieldClass"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2110:1: entryRuleEDROOMDataFieldClass returns [EObject current=null] : iv_ruleEDROOMDataFieldClass= ruleEDROOMDataFieldClass EOF ;
    public final EObject entryRuleEDROOMDataFieldClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataFieldClass = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2111:2: (iv_ruleEDROOMDataFieldClass= ruleEDROOMDataFieldClass EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2112:2: iv_ruleEDROOMDataFieldClass= ruleEDROOMDataFieldClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataFieldClassRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldClass_in_entryRuleEDROOMDataFieldClass4663);
            iv_ruleEDROOMDataFieldClass=ruleEDROOMDataFieldClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataFieldClass;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataFieldClass4673); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataFieldClass"

    // $ANTLR start "ruleEDROOMDataFieldClass"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2119:1: ruleEDROOMDataFieldClass returns [EObject current=null] : ( () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleEDROOMDataFieldClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2122:28: ( ( () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2123:1: ( () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2123:1: ( () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2123:2: () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2123:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2124:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataFieldClassAccess().getEDROOMDataFieldClassAction_0(),
                          current);

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2132:2: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2133:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2133:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2134:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldClassRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldClassAccess().getTypeEDROOMDataClassCrossReference_1_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMDataFieldClass4737);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2150:2: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2151:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2151:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2152:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataFieldClass4754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataFieldClassAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldClassRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataFieldClass4771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataFieldClassAccess().getSemicolonKeyword_3());

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
    // $ANTLR end "ruleEDROOMDataFieldClass"

    // $ANTLR start "entryRuleEDROOMDataFieldClassArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2180:1: entryRuleEDROOMDataFieldClassArray returns [EObject current=null] : iv_ruleEDROOMDataFieldClassArray= ruleEDROOMDataFieldClassArray EOF ;
    public final EObject entryRuleEDROOMDataFieldClassArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataFieldClassArray = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2181:2: (iv_ruleEDROOMDataFieldClassArray= ruleEDROOMDataFieldClassArray EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2182:2: iv_ruleEDROOMDataFieldClassArray= ruleEDROOMDataFieldClassArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataFieldClassArrayRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldClassArray_in_entryRuleEDROOMDataFieldClassArray4807);
            iv_ruleEDROOMDataFieldClassArray=ruleEDROOMDataFieldClassArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataFieldClassArray;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataFieldClassArray4817); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataFieldClassArray"

    // $ANTLR start "ruleEDROOMDataFieldClassArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2189:1: ruleEDROOMDataFieldClassArray returns [EObject current=null] : ( () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' ) ;
    public final EObject ruleEDROOMDataFieldClassArray() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_elements_4_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2192:28: ( ( () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2193:1: ( () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2193:1: ( () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2193:2: () ( ( ruleVersionedQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= ']' otherlv_6= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2193:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2194:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataFieldClassArrayAccess().getEDROOMDataFieldClassArrayAction_0(),
                          current);

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2202:2: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2203:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2203:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2204:3: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldClassArrayRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldClassArrayAccess().getTypeEDROOMDataClassCrossReference_1_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMDataFieldClassArray4881);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2220:2: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2221:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2221:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2222:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataFieldClassArray4898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMDataFieldClassArrayAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldClassArrayRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDROOMDataFieldClassArray4915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMDataFieldClassArrayAccess().getLeftSquareBracketKeyword_3());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2242:1: ( (lv_elements_4_0= ruleEInt ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2243:1: (lv_elements_4_0= ruleEInt )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2243:1: (lv_elements_4_0= ruleEInt )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2244:3: lv_elements_4_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldClassArrayAccess().getElementsEIntParserRuleCall_4_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDROOMDataFieldClassArray4936);
            lv_elements_4_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataFieldClassArrayRule());
              	        }
                     		set(
                     			current,
                     			"elements",
                      		lv_elements_4_0,
                      		"EInt");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDROOMDataFieldClassArray4948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEDROOMDataFieldClassArrayAccess().getRightSquareBracketKeyword_5());

            }
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataFieldClassArray4960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMDataFieldClassArrayAccess().getSemicolonKeyword_6());

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
    // $ANTLR end "ruleEDROOMDataFieldClassArray"

    // $ANTLR start "entryRuleEDROOMDataFieldUnion"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2276:1: entryRuleEDROOMDataFieldUnion returns [EObject current=null] : iv_ruleEDROOMDataFieldUnion= ruleEDROOMDataFieldUnion EOF ;
    public final EObject entryRuleEDROOMDataFieldUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataFieldUnion = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2277:2: (iv_ruleEDROOMDataFieldUnion= ruleEDROOMDataFieldUnion EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2278:2: iv_ruleEDROOMDataFieldUnion= ruleEDROOMDataFieldUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataFieldUnionRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldUnion_in_entryRuleEDROOMDataFieldUnion4996);
            iv_ruleEDROOMDataFieldUnion=ruleEDROOMDataFieldUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataFieldUnion;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataFieldUnion5006); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataFieldUnion"

    // $ANTLR start "ruleEDROOMDataFieldUnion"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2285:1: ruleEDROOMDataFieldUnion returns [EObject current=null] : ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleEDROOMDataFieldUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2288:28: ( ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2289:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2289:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2289:2: () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2289:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2290:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataFieldUnionAccess().getEDROOMDataFieldUnionAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDROOMDataFieldUnion5055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataFieldUnionAccess().getUnionKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2302:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2303:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2303:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2304:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldUnionRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldUnionAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataFieldUnion5082);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2320:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2321:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2321:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2322:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataFieldUnion5099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getEDROOMDataFieldUnionAccess().getNameIDTerminalRuleCall_3_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldUnionRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_3_0,
                      		"ID");

            }

            }

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataFieldUnion5116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEDROOMDataFieldUnionAccess().getSemicolonKeyword_4());

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
    // $ANTLR end "ruleEDROOMDataFieldUnion"

    // $ANTLR start "entryRuleEDROOMDataFieldUnionArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2350:1: entryRuleEDROOMDataFieldUnionArray returns [EObject current=null] : iv_ruleEDROOMDataFieldUnionArray= ruleEDROOMDataFieldUnionArray EOF ;
    public final EObject entryRuleEDROOMDataFieldUnionArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataFieldUnionArray = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2351:2: (iv_ruleEDROOMDataFieldUnionArray= ruleEDROOMDataFieldUnionArray EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2352:2: iv_ruleEDROOMDataFieldUnionArray= ruleEDROOMDataFieldUnionArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataFieldUnionArrayRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldUnionArray_in_entryRuleEDROOMDataFieldUnionArray5152);
            iv_ruleEDROOMDataFieldUnionArray=ruleEDROOMDataFieldUnionArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataFieldUnionArray;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataFieldUnionArray5162); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataFieldUnionArray"

    // $ANTLR start "ruleEDROOMDataFieldUnionArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2359:1: ruleEDROOMDataFieldUnionArray returns [EObject current=null] : ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' ) ;
    public final EObject ruleEDROOMDataFieldUnionArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_elements_5_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2362:28: ( ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2363:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2363:1: ( () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2363:2: () otherlv_1= 'union' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2363:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2364:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataFieldUnionArrayAccess().getEDROOMDataFieldUnionArrayAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDROOMDataFieldUnionArray5211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataFieldUnionArrayAccess().getUnionKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2376:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2377:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2377:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2378:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldUnionArrayRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldUnionArrayAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataFieldUnionArray5238);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2394:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2395:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2395:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2396:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataFieldUnionArray5255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getEDROOMDataFieldUnionArrayAccess().getNameIDTerminalRuleCall_3_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldUnionArrayRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_3_0,
                      		"ID");

            }

            }

            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDROOMDataFieldUnionArray5272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEDROOMDataFieldUnionArrayAccess().getLeftSquareBracketKeyword_4());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2416:1: ( (lv_elements_5_0= ruleEInt ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2417:1: (lv_elements_5_0= ruleEInt )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2417:1: (lv_elements_5_0= ruleEInt )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2418:3: lv_elements_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldUnionArrayAccess().getElementsEIntParserRuleCall_5_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDROOMDataFieldUnionArray5293);
            lv_elements_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataFieldUnionArrayRule());
              	        }
                     		set(
                     			current,
                     			"elements",
                      		lv_elements_5_0,
                      		"EInt");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDROOMDataFieldUnionArray5305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMDataFieldUnionArrayAccess().getRightSquareBracketKeyword_6());

            }
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataFieldUnionArray5317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEDROOMDataFieldUnionArrayAccess().getSemicolonKeyword_7());

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
    // $ANTLR end "ruleEDROOMDataFieldUnionArray"

    // $ANTLR start "entryRuleEDROOMDataFieldEnum"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2450:1: entryRuleEDROOMDataFieldEnum returns [EObject current=null] : iv_ruleEDROOMDataFieldEnum= ruleEDROOMDataFieldEnum EOF ;
    public final EObject entryRuleEDROOMDataFieldEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataFieldEnum = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2451:2: (iv_ruleEDROOMDataFieldEnum= ruleEDROOMDataFieldEnum EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2452:2: iv_ruleEDROOMDataFieldEnum= ruleEDROOMDataFieldEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataFieldEnumRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldEnum_in_entryRuleEDROOMDataFieldEnum5353);
            iv_ruleEDROOMDataFieldEnum=ruleEDROOMDataFieldEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataFieldEnum;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataFieldEnum5363); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataFieldEnum"

    // $ANTLR start "ruleEDROOMDataFieldEnum"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2459:1: ruleEDROOMDataFieldEnum returns [EObject current=null] : ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleEDROOMDataFieldEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2462:28: ( ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2463:1: ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2463:1: ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2463:2: () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2463:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2464:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataFieldEnumAccess().getEDROOMDataFieldEnumAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDROOMDataFieldEnum5412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataFieldEnumAccess().getEnumKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2476:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2477:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2477:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2478:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldEnumRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldEnumAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataFieldEnum5439);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2494:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2495:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2495:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2496:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataFieldEnum5456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getEDROOMDataFieldEnumAccess().getNameIDTerminalRuleCall_3_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldEnumRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_3_0,
                      		"ID");

            }

            }

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataFieldEnum5473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEDROOMDataFieldEnumAccess().getSemicolonKeyword_4());

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
    // $ANTLR end "ruleEDROOMDataFieldEnum"

    // $ANTLR start "entryRuleEDROOMDataFieldEnumArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2524:1: entryRuleEDROOMDataFieldEnumArray returns [EObject current=null] : iv_ruleEDROOMDataFieldEnumArray= ruleEDROOMDataFieldEnumArray EOF ;
    public final EObject entryRuleEDROOMDataFieldEnumArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMDataFieldEnumArray = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2525:2: (iv_ruleEDROOMDataFieldEnumArray= ruleEDROOMDataFieldEnumArray EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2526:2: iv_ruleEDROOMDataFieldEnumArray= ruleEDROOMDataFieldEnumArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMDataFieldEnumArrayRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataFieldEnumArray_in_entryRuleEDROOMDataFieldEnumArray5509);
            iv_ruleEDROOMDataFieldEnumArray=ruleEDROOMDataFieldEnumArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMDataFieldEnumArray;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMDataFieldEnumArray5519); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMDataFieldEnumArray"

    // $ANTLR start "ruleEDROOMDataFieldEnumArray"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2533:1: ruleEDROOMDataFieldEnumArray returns [EObject current=null] : ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' ) ;
    public final EObject ruleEDROOMDataFieldEnumArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_elements_5_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2536:28: ( ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2537:1: ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2537:1: ( () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2537:2: () otherlv_1= 'enum' ( ( ruleVersionedQualifiedReferenceName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_elements_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2537:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2538:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMDataFieldEnumArrayAccess().getEDROOMDataFieldEnumArrayAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDROOMDataFieldEnumArray5568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMDataFieldEnumArrayAccess().getEnumKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2550:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2551:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2551:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2552:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldEnumArrayRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldEnumArrayAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataFieldEnumArray5595);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2568:2: ( (lv_name_3_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2569:1: (lv_name_3_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2569:1: (lv_name_3_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2570:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMDataFieldEnumArray5612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getEDROOMDataFieldEnumArrayAccess().getNameIDTerminalRuleCall_3_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMDataFieldEnumArrayRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_3_0,
                      		"ID");

            }

            }

            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDROOMDataFieldEnumArray5629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEDROOMDataFieldEnumArrayAccess().getLeftSquareBracketKeyword_4());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2590:1: ( (lv_elements_5_0= ruleEInt ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2591:1: (lv_elements_5_0= ruleEInt )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2591:1: (lv_elements_5_0= ruleEInt )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2592:3: lv_elements_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMDataFieldEnumArrayAccess().getElementsEIntParserRuleCall_5_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDROOMDataFieldEnumArray5650);
            lv_elements_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMDataFieldEnumArrayRule());
              	        }
                     		set(
                     			current,
                     			"elements",
                      		lv_elements_5_0,
                      		"EInt");
              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDROOMDataFieldEnumArray5662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMDataFieldEnumArrayAccess().getRightSquareBracketKeyword_6());

            }
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMDataFieldEnumArray5674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEDROOMDataFieldEnumArrayAccess().getSemicolonKeyword_7());

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
    // $ANTLR end "ruleEDROOMDataFieldEnumArray"

    // $ANTLR start "ruleEDROOMBasicType"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2624:1: ruleEDROOMBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEDROOMBool' ) | (enumLiteral_1= 'TEDROOMByte' ) | (enumLiteral_2= 'TEDROOMDouble' ) | (enumLiteral_3= 'TEDROOMFloat' ) | (enumLiteral_4= 'TEDROOMInt16' ) | (enumLiteral_5= 'TEDROOMInt32' ) | (enumLiteral_6= 'TEDROOMInt64' ) | (enumLiteral_7= 'TEDROOMInt8' ) | (enumLiteral_8= 'TEDROOMUInt16' ) | (enumLiteral_9= 'TEDROOMUInt32' ) | (enumLiteral_10= 'TEDROOMUInt64' ) | (enumLiteral_11= 'TEDROOMUInt8' ) | (enumLiteral_12= 'TEDROOMWord16' ) | (enumLiteral_13= 'TEDROOMWord32' ) | (enumLiteral_14= 'TEDROOMWord64' ) ) ;
    public final Enumerator ruleEDROOMBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;

         enterRule();
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2626:28: ( ( (enumLiteral_0= 'TEDROOMBool' ) | (enumLiteral_1= 'TEDROOMByte' ) | (enumLiteral_2= 'TEDROOMDouble' ) | (enumLiteral_3= 'TEDROOMFloat' ) | (enumLiteral_4= 'TEDROOMInt16' ) | (enumLiteral_5= 'TEDROOMInt32' ) | (enumLiteral_6= 'TEDROOMInt64' ) | (enumLiteral_7= 'TEDROOMInt8' ) | (enumLiteral_8= 'TEDROOMUInt16' ) | (enumLiteral_9= 'TEDROOMUInt32' ) | (enumLiteral_10= 'TEDROOMUInt64' ) | (enumLiteral_11= 'TEDROOMUInt8' ) | (enumLiteral_12= 'TEDROOMWord16' ) | (enumLiteral_13= 'TEDROOMWord32' ) | (enumLiteral_14= 'TEDROOMWord64' ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2627:1: ( (enumLiteral_0= 'TEDROOMBool' ) | (enumLiteral_1= 'TEDROOMByte' ) | (enumLiteral_2= 'TEDROOMDouble' ) | (enumLiteral_3= 'TEDROOMFloat' ) | (enumLiteral_4= 'TEDROOMInt16' ) | (enumLiteral_5= 'TEDROOMInt32' ) | (enumLiteral_6= 'TEDROOMInt64' ) | (enumLiteral_7= 'TEDROOMInt8' ) | (enumLiteral_8= 'TEDROOMUInt16' ) | (enumLiteral_9= 'TEDROOMUInt32' ) | (enumLiteral_10= 'TEDROOMUInt64' ) | (enumLiteral_11= 'TEDROOMUInt8' ) | (enumLiteral_12= 'TEDROOMWord16' ) | (enumLiteral_13= 'TEDROOMWord32' ) | (enumLiteral_14= 'TEDROOMWord64' ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2627:1: ( (enumLiteral_0= 'TEDROOMBool' ) | (enumLiteral_1= 'TEDROOMByte' ) | (enumLiteral_2= 'TEDROOMDouble' ) | (enumLiteral_3= 'TEDROOMFloat' ) | (enumLiteral_4= 'TEDROOMInt16' ) | (enumLiteral_5= 'TEDROOMInt32' ) | (enumLiteral_6= 'TEDROOMInt64' ) | (enumLiteral_7= 'TEDROOMInt8' ) | (enumLiteral_8= 'TEDROOMUInt16' ) | (enumLiteral_9= 'TEDROOMUInt32' ) | (enumLiteral_10= 'TEDROOMUInt64' ) | (enumLiteral_11= 'TEDROOMUInt8' ) | (enumLiteral_12= 'TEDROOMWord16' ) | (enumLiteral_13= 'TEDROOMWord32' ) | (enumLiteral_14= 'TEDROOMWord64' ) )
            int alt21=15;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            case 33:
                {
                alt21=4;
                }
                break;
            case 34:
                {
                alt21=5;
                }
                break;
            case 35:
                {
                alt21=6;
                }
                break;
            case 36:
                {
                alt21=7;
                }
                break;
            case 37:
                {
                alt21=8;
                }
                break;
            case 38:
                {
                alt21=9;
                }
                break;
            case 39:
                {
                alt21=10;
                }
                break;
            case 40:
                {
                alt21=11;
                }
                break;
            case 41:
                {
                alt21=12;
                }
                break;
            case 42:
                {
                alt21=13;
                }
                break;
            case 43:
                {
                alt21=14;
                }
                break;
            case 44:
                {
                alt21=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2627:2: (enumLiteral_0= 'TEDROOMBool' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2627:2: (enumLiteral_0= 'TEDROOMBool' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2627:4: enumLiteral_0= 'TEDROOMBool'
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEDROOMBasicType5724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMBoolEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMBoolEnumLiteralDeclaration_0());

                    }

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2633:6: (enumLiteral_1= 'TEDROOMByte' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2633:6: (enumLiteral_1= 'TEDROOMByte' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2633:8: enumLiteral_1= 'TEDROOMByte'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEDROOMBasicType5741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMByteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMByteEnumLiteralDeclaration_1());

                    }

                    }

                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2639:6: (enumLiteral_2= 'TEDROOMDouble' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2639:6: (enumLiteral_2= 'TEDROOMDouble' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2639:8: enumLiteral_2= 'TEDROOMDouble'
                    {
                    enumLiteral_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDROOMBasicType5758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMDoubleEnumLiteralDeclaration_2());

                    }

                    }

                    }
                    break;
                case 4 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2645:6: (enumLiteral_3= 'TEDROOMFloat' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2645:6: (enumLiteral_3= 'TEDROOMFloat' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2645:8: enumLiteral_3= 'TEDROOMFloat'
                    {
                    enumLiteral_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEDROOMBasicType5775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMFloatEnumLiteralDeclaration_3());

                    }

                    }

                    }
                    break;
                case 5 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2651:6: (enumLiteral_4= 'TEDROOMInt16' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2651:6: (enumLiteral_4= 'TEDROOMInt16' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2651:8: enumLiteral_4= 'TEDROOMInt16'
                    {
                    enumLiteral_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDROOMBasicType5792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMInt16EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMInt16EnumLiteralDeclaration_4());

                    }

                    }

                    }
                    break;
                case 6 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2657:6: (enumLiteral_5= 'TEDROOMInt32' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2657:6: (enumLiteral_5= 'TEDROOMInt32' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2657:8: enumLiteral_5= 'TEDROOMInt32'
                    {
                    enumLiteral_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEDROOMBasicType5809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMInt32EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMInt32EnumLiteralDeclaration_5());

                    }

                    }

                    }
                    break;
                case 7 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2663:6: (enumLiteral_6= 'TEDROOMInt64' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2663:6: (enumLiteral_6= 'TEDROOMInt64' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2663:8: enumLiteral_6= 'TEDROOMInt64'
                    {
                    enumLiteral_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEDROOMBasicType5826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMInt64EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMInt64EnumLiteralDeclaration_6());

                    }

                    }

                    }
                    break;
                case 8 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2669:6: (enumLiteral_7= 'TEDROOMInt8' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2669:6: (enumLiteral_7= 'TEDROOMInt8' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2669:8: enumLiteral_7= 'TEDROOMInt8'
                    {
                    enumLiteral_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEDROOMBasicType5843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMInt8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMInt8EnumLiteralDeclaration_7());

                    }

                    }

                    }
                    break;
                case 9 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2675:6: (enumLiteral_8= 'TEDROOMUInt16' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2675:6: (enumLiteral_8= 'TEDROOMUInt16' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2675:8: enumLiteral_8= 'TEDROOMUInt16'
                    {
                    enumLiteral_8=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEDROOMBasicType5860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMUInt16EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMUInt16EnumLiteralDeclaration_8());

                    }

                    }

                    }
                    break;
                case 10 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2681:6: (enumLiteral_9= 'TEDROOMUInt32' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2681:6: (enumLiteral_9= 'TEDROOMUInt32' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2681:8: enumLiteral_9= 'TEDROOMUInt32'
                    {
                    enumLiteral_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEDROOMBasicType5877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMUInt32EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMUInt32EnumLiteralDeclaration_9());

                    }

                    }

                    }
                    break;
                case 11 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2687:6: (enumLiteral_10= 'TEDROOMUInt64' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2687:6: (enumLiteral_10= 'TEDROOMUInt64' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2687:8: enumLiteral_10= 'TEDROOMUInt64'
                    {
                    enumLiteral_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEDROOMBasicType5894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMUInt64EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMUInt64EnumLiteralDeclaration_10());

                    }

                    }

                    }
                    break;
                case 12 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2693:6: (enumLiteral_11= 'TEDROOMUInt8' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2693:6: (enumLiteral_11= 'TEDROOMUInt8' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2693:8: enumLiteral_11= 'TEDROOMUInt8'
                    {
                    enumLiteral_11=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEDROOMBasicType5911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMUInt8EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMUInt8EnumLiteralDeclaration_11());

                    }

                    }

                    }
                    break;
                case 13 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2699:6: (enumLiteral_12= 'TEDROOMWord16' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2699:6: (enumLiteral_12= 'TEDROOMWord16' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2699:8: enumLiteral_12= 'TEDROOMWord16'
                    {
                    enumLiteral_12=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEDROOMBasicType5928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMWord16EnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMWord16EnumLiteralDeclaration_12());

                    }

                    }

                    }
                    break;
                case 14 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2705:6: (enumLiteral_13= 'TEDROOMWord32' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2705:6: (enumLiteral_13= 'TEDROOMWord32' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2705:8: enumLiteral_13= 'TEDROOMWord32'
                    {
                    enumLiteral_13=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEDROOMBasicType5945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMWord32EnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMWord32EnumLiteralDeclaration_13());

                    }

                    }

                    }
                    break;
                case 15 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2711:6: (enumLiteral_14= 'TEDROOMWord64' )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2711:6: (enumLiteral_14= 'TEDROOMWord64' )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:2711:8: enumLiteral_14= 'TEDROOMWord64'
                    {
                    enumLiteral_14=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEDROOMBasicType5962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMWord64EnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getEDROOMBasicTypeAccess().getTEDROOMWord64EnumLiteralDeclaration_14());

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
    // $ANTLR end "ruleEDROOMBasicType"

    // $ANTLR start synpred12_InternalDCLASS
    public final void synpred12_InternalDCLASS_fragment() throws RecognitionException {
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_version_11_0 = null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:564:4: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:564:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:564:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:565:5: {...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalDCLASS", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:565:112: ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:566:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 0);
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:569:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:569:7: {...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalDCLASS", "true");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:569:16: (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:569:18: otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';'
        {
        otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred12_InternalDCLASS1416); if (state.failed) return ;
        otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred12_InternalDCLASS1428); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:577:1: ( (lv_version_11_0= ruleVersion ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:578:1: (lv_version_11_0= ruleVersion )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:578:1: (lv_version_11_0= ruleVersion )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:579:3: lv_version_11_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getVersionVersionParserRuleCall_5_0_2_0());

        }
        pushFollow(FollowSets000.FOLLOW_ruleVersion_in_synpred12_InternalDCLASS1449);
        lv_version_11_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }

        }

        otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred12_InternalDCLASS1461); if (state.failed) return ;

        }

        }

        }

        }

        }
    }
    // $ANTLR end synpred12_InternalDCLASS

    // $ANTLR start synpred14_InternalDCLASS
    public final void synpred14_InternalDCLASS_fragment() throws RecognitionException {
        EObject lv_definitions_13_0 = null;

        EObject lv_fields_14_0 = null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:7: ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:7: {...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred14_InternalDCLASS", "true");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:16: ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) )
        int alt25=2;
        switch ( input.LA(1) ) {
        case 25:
            {
            int LA25_1 = input.LA(2);

            if ( (LA25_1==RULE_ID) ) {
                int LA25_4 = input.LA(3);

                if ( (LA25_4==RULE_ID||(LA25_4>=14 && LA25_4<=15)||LA25_4==17) ) {
                    alt25=2;
                }
                else if ( (LA25_4==21) ) {
                    alt25=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 1, input);

                throw nvae;
            }
            }
            break;
        case 26:
            {
            int LA25_2 = input.LA(2);

            if ( (LA25_2==RULE_ID) ) {
                int LA25_5 = input.LA(3);

                if ( (LA25_5==RULE_ID||(LA25_5>=14 && LA25_5<=15)||LA25_5==17) ) {
                    alt25=2;
                }
                else if ( (LA25_5==21) ) {
                    alt25=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 2, input);

                throw nvae;
            }
            }
            break;
        case RULE_ID:
        case 30:
        case 31:
        case 32:
        case 33:
        case 34:
        case 35:
        case 36:
        case 37:
        case 38:
        case 39:
        case 40:
        case 41:
        case 42:
        case 43:
        case 44:
            {
            alt25=2;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 25, 0, input);

            throw nvae;
        }

        switch (alt25) {
            case 1 :
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:17: ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) )
                {
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:17: ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) )
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:612:1: (lv_definitions_13_0= ruleEDROOMDataDefinition )
                {
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:612:1: (lv_definitions_13_0= ruleEDROOMDataDefinition )
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:613:3: lv_definitions_13_0= ruleEDROOMDataDefinition
                {
                if ( state.backtracking==0 ) {

                  	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getDefinitionsEDROOMDataDefinitionParserRuleCall_5_1_0_0());

                }
                pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinition_in_synpred14_InternalDCLASS1538);
                lv_definitions_13_0=ruleEDROOMDataDefinition();

                state._fsp--;
                if (state.failed) return ;

                }

                }

                }
                break;
            case 2 :
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:630:6: ( (lv_fields_14_0= ruleEDROOMDataField ) )
                {
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:630:6: ( (lv_fields_14_0= ruleEDROOMDataField ) )
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:631:1: (lv_fields_14_0= ruleEDROOMDataField )
                {
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:631:1: (lv_fields_14_0= ruleEDROOMDataField )
                // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:632:3: lv_fields_14_0= ruleEDROOMDataField
                {
                if ( state.backtracking==0 ) {

                  	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getFieldsEDROOMDataFieldParserRuleCall_5_1_1_0());

                }
                pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataField_in_synpred14_InternalDCLASS1565);
                lv_fields_14_0=ruleEDROOMDataField();

                state._fsp--;
                if (state.failed) return ;

                }

                }

                }
                break;

        }

        }
    }
    // $ANTLR end synpred14_InternalDCLASS

    // $ANTLR start synpred15_InternalDCLASS
    public final void synpred15_InternalDCLASS_fragment() throws RecognitionException {
        EObject lv_definitions_13_0 = null;

        EObject lv_fields_14_0 = null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:606:4: ( ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:606:4: ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:606:4: ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:607:5: {...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalDCLASS", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:607:112: ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:608:6: ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1);
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:6: ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+
        int cnt27=0;
        loop27:
        do {
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:7: {...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred15_InternalDCLASS", "true");
        	    }
        	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:16: ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) )
        	    int alt26=2;
        	    switch ( input.LA(1) ) {
        	    case 25:
        	        {
        	        int LA26_1 = input.LA(2);

        	        if ( (LA26_1==RULE_ID) ) {
        	            int LA26_4 = input.LA(3);

        	            if ( (LA26_4==RULE_ID||(LA26_4>=14 && LA26_4<=15)||LA26_4==17) ) {
        	                alt26=2;
        	            }
        	            else if ( (LA26_4==21) ) {
        	                alt26=1;
        	            }
        	            else {
        	                if (state.backtracking>0) {state.failed=true; return ;}
        	                NoViableAltException nvae =
        	                    new NoViableAltException("", 26, 4, input);

        	                throw nvae;
        	            }
        	        }
        	        else {
        	            if (state.backtracking>0) {state.failed=true; return ;}
        	            NoViableAltException nvae =
        	                new NoViableAltException("", 26, 1, input);

        	            throw nvae;
        	        }
        	        }
        	        break;
        	    case 26:
        	        {
        	        int LA26_2 = input.LA(2);

        	        if ( (LA26_2==RULE_ID) ) {
        	            int LA26_5 = input.LA(3);

        	            if ( (LA26_5==RULE_ID||(LA26_5>=14 && LA26_5<=15)||LA26_5==17) ) {
        	                alt26=2;
        	            }
        	            else if ( (LA26_5==21) ) {
        	                alt26=1;
        	            }
        	            else {
        	                if (state.backtracking>0) {state.failed=true; return ;}
        	                NoViableAltException nvae =
        	                    new NoViableAltException("", 26, 5, input);

        	                throw nvae;
        	            }
        	        }
        	        else {
        	            if (state.backtracking>0) {state.failed=true; return ;}
        	            NoViableAltException nvae =
        	                new NoViableAltException("", 26, 2, input);

        	            throw nvae;
        	        }
        	        }
        	        break;
        	    case RULE_ID:
        	    case 30:
        	    case 31:
        	    case 32:
        	    case 33:
        	    case 34:
        	    case 35:
        	    case 36:
        	    case 37:
        	    case 38:
        	    case 39:
        	    case 40:
        	    case 41:
        	    case 42:
        	    case 43:
        	    case 44:
        	        {
        	        alt26=2;
        	        }
        	        break;
        	    default:
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        NoViableAltException nvae =
        	            new NoViableAltException("", 26, 0, input);

        	        throw nvae;
        	    }

        	    switch (alt26) {
        	        case 1 :
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:17: ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) )
        	            {
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:611:17: ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) )
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:612:1: (lv_definitions_13_0= ruleEDROOMDataDefinition )
        	            {
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:612:1: (lv_definitions_13_0= ruleEDROOMDataDefinition )
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:613:3: lv_definitions_13_0= ruleEDROOMDataDefinition
        	            {
        	            if ( state.backtracking==0 ) {

        	              	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getDefinitionsEDROOMDataDefinitionParserRuleCall_5_1_0_0());

        	            }
        	            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinition_in_synpred15_InternalDCLASS1538);
        	            lv_definitions_13_0=ruleEDROOMDataDefinition();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }

        	            }

        	            }
        	            break;
        	        case 2 :
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:630:6: ( (lv_fields_14_0= ruleEDROOMDataField ) )
        	            {
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:630:6: ( (lv_fields_14_0= ruleEDROOMDataField ) )
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:631:1: (lv_fields_14_0= ruleEDROOMDataField )
        	            {
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:631:1: (lv_fields_14_0= ruleEDROOMDataField )
        	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:632:3: lv_fields_14_0= ruleEDROOMDataField
        	            {
        	            if ( state.backtracking==0 ) {

        	              	        newCompositeNode(grammarAccess.getEDROOMDataClassAccess().getFieldsEDROOMDataFieldParserRuleCall_5_1_1_0());

        	            }
        	            pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataField_in_synpred15_InternalDCLASS1565);
        	            lv_fields_14_0=ruleEDROOMDataField();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }

        	            }

        	            }
        	            break;

        	    }

        	    }
        	    break;

        	default :
        	    if ( cnt27 >= 1 ) break loop27;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(27, input);
                    throw eee;
            }
            cnt27++;
        } while (true);

        }

        }

        }
    }
    // $ANTLR end synpred15_InternalDCLASS

    // $ANTLR start synpred24_InternalDCLASS
    public final void synpred24_InternalDCLASS_fragment() throws RecognitionException {
        EObject this_EDROOMDataDefinitionUnionElementUnion_4 = null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1086:2: (this_EDROOMDataDefinitionUnionElementUnion_4= ruleEDROOMDataDefinitionUnionElementUnion )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1086:2: this_EDROOMDataDefinitionUnionElementUnion_4= ruleEDROOMDataDefinitionUnionElementUnion
        {
        if ( state.backtracking==0 ) {

          	  /* */

        }
        pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementUnion_in_synpred24_InternalDCLASS2550);
        this_EDROOMDataDefinitionUnionElementUnion_4=ruleEDROOMDataDefinitionUnionElementUnion();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalDCLASS

    // $ANTLR start synpred25_InternalDCLASS
    public final void synpred25_InternalDCLASS_fragment() throws RecognitionException {
        EObject this_EDROOMDataDefinitionUnionElementUnionArray_5 = null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1099:2: (this_EDROOMDataDefinitionUnionElementUnionArray_5= ruleEDROOMDataDefinitionUnionElementUnionArray )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1099:2: this_EDROOMDataDefinitionUnionElementUnionArray_5= ruleEDROOMDataDefinitionUnionElementUnionArray
        {
        if ( state.backtracking==0 ) {

          	  /* */

        }
        pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementUnionArray_in_synpred25_InternalDCLASS2580);
        this_EDROOMDataDefinitionUnionElementUnionArray_5=ruleEDROOMDataDefinitionUnionElementUnionArray();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalDCLASS

    // $ANTLR start synpred26_InternalDCLASS
    public final void synpred26_InternalDCLASS_fragment() throws RecognitionException {
        EObject this_EDROOMDataDefinitionUnionElementEnum_6 = null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1112:2: (this_EDROOMDataDefinitionUnionElementEnum_6= ruleEDROOMDataDefinitionUnionElementEnum )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.dclass/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalDCLASS.g:1112:2: this_EDROOMDataDefinitionUnionElementEnum_6= ruleEDROOMDataDefinitionUnionElementEnum
        {
        if ( state.backtracking==0 ) {

          	  /* */

        }
        pushFollow(FollowSets000.FOLLOW_ruleEDROOMDataDefinitionUnionElementEnum_in_synpred26_InternalDCLASS2610);
        this_EDROOMDataDefinitionUnionElementEnum_6=ruleEDROOMDataDefinitionUnionElementEnum();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalDCLASS

    // Delegated rules

    public final boolean synpred14_InternalDCLASS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDCLASS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalDCLASS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalDCLASS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDCLASS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDCLASS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalDCLASS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalDCLASS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalDCLASS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalDCLASS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalDCLASS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalDCLASS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }

    protected DFA14 dfa14 = new DFA14(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA14_eotS =
        "\25\uffff";
    static final String DFA14_eofS =
        "\25\uffff";
    static final String DFA14_minS =
        "\1\5\24\uffff";
    static final String DFA14_maxS =
        "\1\54\24\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\3\1\1\22\2";
    static final String DFA14_specialS =
        "\1\0\24\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\24\20\uffff\1\2\1\uffff\1\1\1\3\1\4\3\uffff\1\5\1\6\1\7\1"+
            "\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()+ loopback of 562:3: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA14_0 = input.LA(1);


                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==24) ) {s = 1;}

                        else if ( LA14_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( LA14_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( LA14_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 4;}

                        else if ( LA14_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 5;}

                        else if ( LA14_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 6;}

                        else if ( LA14_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 7;}

                        else if ( LA14_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 8;}

                        else if ( LA14_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 9;}

                        else if ( LA14_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 10;}

                        else if ( LA14_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 11;}

                        else if ( LA14_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 12;}

                        else if ( LA14_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 13;}

                        else if ( LA14_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 14;}

                        else if ( LA14_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 15;}

                        else if ( LA14_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 16;}

                        else if ( LA14_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 17;}

                        else if ( LA14_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 18;}

                        else if ( LA14_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 19;}

                        else if ( LA14_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), 1) ) {s = 20;}


                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\25\uffff";
    static final String DFA13_eofS =
        "\25\uffff";
    static final String DFA13_minS =
        "\1\5\1\uffff\22\0\1\uffff";
    static final String DFA13_maxS =
        "\1\54\1\uffff\22\0\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\22\uffff\1\1";
    static final String DFA13_specialS =
        "\2\uffff\1\6\1\1\1\10\1\5\1\4\1\11\1\21\1\15\1\13\1\2\1\7\1\12\1"+
        "\17\1\0\1\3\1\14\1\20\1\16\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\23\20\uffff\1\1\1\uffff\1\1\1\2\1\3\3\uffff\1\4\1\5\1\6\1"+
            "\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()+ loopback of 611:6: ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA13_15 = input.LA(1);


                        int index13_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA13_3 = input.LA(1);


                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA13_11 = input.LA(1);


                        int index13_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 :
                        int LA13_16 = input.LA(1);


                        int index13_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 :
                        int LA13_6 = input.LA(1);


                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 :
                        int LA13_5 = input.LA(1);


                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 :
                        int LA13_2 = input.LA(1);


                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 :
                        int LA13_12 = input.LA(1);


                        int index13_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 :
                        int LA13_4 = input.LA(1);


                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 9 :
                        int LA13_7 = input.LA(1);


                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 10 :
                        int LA13_13 = input.LA(1);


                        int index13_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 :
                        int LA13_10 = input.LA(1);


                        int index13_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_10);
                        if ( s>=0 ) return s;
                        break;
                    case 12 :
                        int LA13_17 = input.LA(1);


                        int index13_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_17);
                        if ( s>=0 ) return s;
                        break;
                    case 13 :
                        int LA13_9 = input.LA(1);


                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 14 :
                        int LA13_19 = input.LA(1);


                        int index13_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_19);
                        if ( s>=0 ) return s;
                        break;
                    case 15 :
                        int LA13_14 = input.LA(1);


                        int index13_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_14);
                        if ( s>=0 ) return s;
                        break;
                    case 16 :
                        int LA13_18 = input.LA(1);


                        int index13_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 :
                        int LA13_8 = input.LA(1);


                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_InternalDCLASS()&&(true))) ) {s = 20;}

                        else if ( (true) ) {s = 1;}


                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\60\uffff";
    static final String DFA19_eofS =
        "\60\uffff";
    static final String DFA19_minS =
        "\22\5\2\14\1\5\4\uffff\1\5\1\4\1\5\1\14\1\16\1\5\1\16\1\5\1\0\2"+
        "\4\1\21\2\uffff\1\35\1\5\1\16\1\5\1\14\1\5\1\0\2\uffff";
    static final String DFA19_maxS =
        "\1\54\21\5\2\34\1\21\4\uffff\3\5\1\34\1\17\2\20\1\21\1\0\1\4\1\5"+
        "\1\21\2\uffff\1\35\2\20\1\5\1\14\1\21\1\0\2\uffff";
    static final String DFA19_acceptS =
        "\25\uffff\1\1\1\2\1\4\1\3\14\uffff\1\5\1\7\7\uffff\1\6\1\10";
    static final String DFA19_specialS =
        "\41\uffff\1\1\13\uffff\1\0\2\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\20\23\uffff\1\21\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25\17\uffff\1\26",
            "\1\30\17\uffff\1\27",
            "\1\34\10\uffff\1\31\1\32\1\uffff\1\33",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\36\1\37",
            "\1\40",
            "\1\41\17\uffff\1\42",
            "\1\31\1\32",
            "\1\37\10\uffff\1\43\1\uffff\1\44",
            "\1\43\1\uffff\1\44",
            "\1\34\13\uffff\1\33",
            "\1\uffff",
            "\1\47",
            "\1\50\1\51",
            "\1\52",
            "",
            "",
            "\1\53",
            "\1\51\10\uffff\1\43\1\uffff\1\44",
            "\1\43\1\uffff\1\44",
            "\1\54",
            "\1\55",
            "\1\34\13\uffff\1\33",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1033:1: (this_EDROOMDataDefinitionUnionElementBasic_0= ruleEDROOMDataDefinitionUnionElementBasic | this_EDROOMDataDefinitionUnionElementBasicArray_1= ruleEDROOMDataDefinitionUnionElementBasicArray | this_EDROOMDataDefinitionUnionElementClass_2= ruleEDROOMDataDefinitionUnionElementClass | this_EDROOMDataDefinitionUnionElementClassArray_3= ruleEDROOMDataDefinitionUnionElementClassArray | this_EDROOMDataDefinitionUnionElementUnion_4= ruleEDROOMDataDefinitionUnionElementUnion | this_EDROOMDataDefinitionUnionElementUnionArray_5= ruleEDROOMDataDefinitionUnionElementUnionArray | this_EDROOMDataDefinitionUnionElementEnum_6= ruleEDROOMDataDefinitionUnionElementEnum | this_EDROOMDataDefinitionUnionElementEnumArray_7= ruleEDROOMDataDefinitionUnionElementEnumArray )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA19_45 = input.LA(1);


                        int index19_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalDCLASS()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}


                        input.seek(index19_45);
                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA19_33 = input.LA(1);


                        int index19_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalDCLASS()) ) {s = 37;}

                        else if ( (synpred26_InternalDCLASS()) ) {s = 38;}


                        input.seek(index19_33);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\104\uffff";
    static final String DFA20_eofS =
        "\104\uffff";
    static final String DFA20_minS =
        "\20\5\1\16\2\5\1\14\1\5\1\4\2\5\2\uffff\1\16\1\5\1\16\1\5\1\4\1"+
        "\5\1\14\1\5\1\4\1\5\1\14\1\4\1\5\1\16\1\5\1\16\1\5\2\uffff\1\16"+
        "\1\5\1\16\1\5\2\uffff\1\5\1\16\1\14\1\4\1\21\1\4\1\21\2\uffff\1"+
        "\5\1\16\2\5\1\16\3\5";
    static final String DFA20_maxS =
        "\1\54\17\5\1\17\2\5\1\34\2\5\2\21\2\uffff\1\17\2\20\3\5\1\34\3\5"+
        "\1\34\2\5\1\17\2\20\1\21\2\uffff\1\17\2\20\1\21\2\uffff\2\20\1\34"+
        "\1\5\1\21\1\5\1\21\2\uffff\2\20\1\5\2\20\1\5\2\21";
    static final String DFA20_acceptS =
        "\30\uffff\1\2\1\1\21\uffff\1\5\1\6\4\uffff\1\10\1\7\7\uffff\1\4"+
        "\1\3\10\uffff";
    static final String DFA20_specialS =
        "\104\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\20\23\uffff\1\21\1\22\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\24\1\25",
            "\1\26",
            "\1\27",
            "\1\31\17\uffff\1\30",
            "\1\32",
            "\1\33\1\34",
            "\1\40\10\uffff\1\35\1\36\1\uffff\1\37",
            "\1\44\10\uffff\1\41\1\42\1\uffff\1\43",
            "",
            "",
            "\1\24\1\25",
            "\1\34\10\uffff\1\45\1\uffff\1\46",
            "\1\45\1\uffff\1\46",
            "\1\47",
            "\1\50\1\51",
            "\1\52",
            "\1\53\17\uffff\1\54",
            "\1\55",
            "\1\56\1\57",
            "\1\60",
            "\1\62\17\uffff\1\61",
            "\1\63\1\64",
            "\1\65",
            "\1\35\1\36",
            "\1\51\10\uffff\1\66\1\uffff\1\67",
            "\1\66\1\uffff\1\67",
            "\1\40\13\uffff\1\37",
            "",
            "",
            "\1\41\1\42",
            "\1\57\10\uffff\1\70\1\uffff\1\71",
            "\1\70\1\uffff\1\71",
            "\1\44\13\uffff\1\43",
            "",
            "",
            "\1\64\10\uffff\1\45\1\uffff\1\46",
            "\1\45\1\uffff\1\46",
            "\1\73\17\uffff\1\72",
            "\1\74\1\75",
            "\1\76",
            "\1\77\1\100",
            "\1\101",
            "",
            "",
            "\1\75\10\uffff\1\66\1\uffff\1\67",
            "\1\66\1\uffff\1\67",
            "\1\102",
            "\1\100\10\uffff\1\70\1\uffff\1\71",
            "\1\70\1\uffff\1\71",
            "\1\103",
            "\1\40\13\uffff\1\37",
            "\1\44\13\uffff\1\43"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1833:1: (this_EDROOMDataFieldBasic_0= ruleEDROOMDataFieldBasic | this_EDROOMDataFieldBasicArray_1= ruleEDROOMDataFieldBasicArray | this_EDROOMDataFieldClass_2= ruleEDROOMDataFieldClass | this_EDROOMDataFieldClassArray_3= ruleEDROOMDataFieldClassArray | this_EDROOMDataFieldUnion_4= ruleEDROOMDataFieldUnion | this_EDROOMDataFieldUnionArray_5= ruleEDROOMDataFieldUnionArray | this_EDROOMDataFieldEnum_6= ruleEDROOMDataFieldEnum | this_EDROOMDataFieldEnumArray_7= ruleEDROOMDataFieldEnumArray )";
        }
    }
    static final String DFA27_eotS =
        "\24\uffff";
    static final String DFA27_eofS =
        "\1\1\23\uffff";
    static final String DFA27_minS =
        "\1\5\23\uffff";
    static final String DFA27_maxS =
        "\1\54\23\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\22\1";
    static final String DFA27_specialS =
        "\1\0\23\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\23\23\uffff\1\2\1\3\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()+ loopback of 611:6: ({...}? => ( ( (lv_definitions_13_0= ruleEDROOMDataDefinition ) ) | ( (lv_fields_14_0= ruleEDROOMDataField ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA27_0 = input.LA(1);


                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==EOF) ) {s = 1;}

                        else if ( (LA27_0==25) && ((true))) {s = 2;}

                        else if ( (LA27_0==26) && ((true))) {s = 3;}

                        else if ( (LA27_0==30) && ((true))) {s = 4;}

                        else if ( (LA27_0==31) && ((true))) {s = 5;}

                        else if ( (LA27_0==32) && ((true))) {s = 6;}

                        else if ( (LA27_0==33) && ((true))) {s = 7;}

                        else if ( (LA27_0==34) && ((true))) {s = 8;}

                        else if ( (LA27_0==35) && ((true))) {s = 9;}

                        else if ( (LA27_0==36) && ((true))) {s = 10;}

                        else if ( (LA27_0==37) && ((true))) {s = 11;}

                        else if ( (LA27_0==38) && ((true))) {s = 12;}

                        else if ( (LA27_0==39) && ((true))) {s = 13;}

                        else if ( (LA27_0==40) && ((true))) {s = 14;}

                        else if ( (LA27_0==41) && ((true))) {s = 15;}

                        else if ( (LA27_0==42) && ((true))) {s = 16;}

                        else if ( (LA27_0==43) && ((true))) {s = 17;}

                        else if ( (LA27_0==44) && ((true))) {s = 18;}

                        else if ( (LA27_0==RULE_ID) && ((true))) {s = 19;}


                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }



    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEDROOMDCLASSPackageFile_in_entryRuleEDROOMDCLASSPackageFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDCLASSPackageFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEDROOMDCLASSPackageFile128 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEDROOMDCLASSPackageFile155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDCLASSPackageFile167 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleEDROOMDCLASSPackageFile180 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEDROOMDCLASSPackageFile207 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDCLASSPackageFile219 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_ruleEDROOMDCLASSPackageElement_in_ruleEDROOMDCLASSPackageFile242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName374 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName425 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleQualifiedName444 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName459 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion559 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion587 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion609 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleVersion630 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion646 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion674 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion696 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName746 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVersionedQualifiedName804 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleVersionedQualifiedName822 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleVersionedQualifiedName844 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleVersionedQualifiedName862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleVersionedQualifiedReferenceName962 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleVersionedQualifiedReferenceName980 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName997 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleVersionedQualifiedReferenceName1016 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName1031 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleEDROOMDCLASSPackageElement_in_entryRuleEDROOMDCLASSPackageElement1078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDCLASSPackageElement1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataClass_in_ruleEDROOMDCLASSPackageElement1137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataClass_in_entryRuleEDROOMDataClass1177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataClass1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEDROOMDataClass1240 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataClass1257 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleEDROOMDataClass1275 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMDataClass1302 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleEDROOMDataClass1315 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMDataClass1342 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleEDROOMDataClass1358 = new BitSet(new long[]{0x00001FFFC6400020L});
        public static final BitSet FOLLOW_22_in_ruleEDROOMDataClass1416 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEDROOMDataClass1428 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleEDROOMDataClass1449 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataClass1461 = new BitSet(new long[]{0x00001FFFC7400020L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinition_in_ruleEDROOMDataClass1538 = new BitSet(new long[]{0x00001FFFC7400020L});
        public static final BitSet FOLLOW_ruleEDROOMDataField_in_ruleEDROOMDataClass1565 = new BitSet(new long[]{0x00001FFFC7400020L});
        public static final BitSet FOLLOW_24_in_ruleEDROOMDataClass1625 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataClass1637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinition_in_entryRuleEDROOMDataDefinition1677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinition1687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnion_in_ruleEDROOMDataDefinition1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionEnum_in_ruleEDROOMDataDefinition1767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnion_in_entryRuleEDROOMDataDefinitionUnion1802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnion1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEDROOMDataDefinitionUnion1861 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnion1878 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEDROOMDataDefinitionUnion1895 = new BitSet(new long[]{0x00001FFFC2000020L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElement_in_ruleEDROOMDataDefinitionUnion1916 = new BitSet(new long[]{0x00001FFFC2000020L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElement_in_ruleEDROOMDataDefinitionUnion1937 = new BitSet(new long[]{0x00001FFFC3000020L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElement_in_ruleEDROOMDataDefinitionUnion1958 = new BitSet(new long[]{0x00001FFFC3000020L});
        public static final BitSet FOLLOW_24_in_ruleEDROOMDataDefinitionUnion1971 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionUnion1983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionEnum_in_entryRuleEDROOMDataDefinitionEnum2019 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionEnum2029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEDROOMDataDefinitionEnum2078 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionEnum2095 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEDROOMDataDefinitionEnum2112 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionEnumElement_in_ruleEDROOMDataDefinitionEnum2133 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_20_in_ruleEDROOMDataDefinitionEnum2146 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionEnumElement_in_ruleEDROOMDataDefinitionEnum2167 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_24_in_ruleEDROOMDataDefinitionEnum2181 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionEnum2193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionEnumElement_in_entryRuleEDROOMDataDefinitionEnumElement2229 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionEnumElement2239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionEnumElement2293 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleEDROOMDataDefinitionEnumElement2311 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionEnumElement2332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElement_in_entryRuleEDROOMDataDefinitionUnionElement2370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElement2380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementBasic_in_ruleEDROOMDataDefinitionUnionElement2430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementBasicArray_in_ruleEDROOMDataDefinitionUnionElement2460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementClass_in_ruleEDROOMDataDefinitionUnionElement2490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementClassArray_in_ruleEDROOMDataDefinitionUnionElement2520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementUnion_in_ruleEDROOMDataDefinitionUnionElement2550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementUnionArray_in_ruleEDROOMDataDefinitionUnionElement2580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementEnum_in_ruleEDROOMDataDefinitionUnionElement2610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementEnumArray_in_ruleEDROOMDataDefinitionUnionElement2640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementBasic_in_entryRuleEDROOMDataDefinitionUnionElementBasic2675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementBasic2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMBasicType_in_ruleEDROOMDataDefinitionUnionElementBasic2743 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementBasic2760 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementBasic2777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementBasicArray_in_entryRuleEDROOMDataDefinitionUnionElementBasicArray2813 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementBasicArray2823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMBasicType_in_ruleEDROOMDataDefinitionUnionElementBasicArray2881 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementBasicArray2898 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEDROOMDataDefinitionUnionElementBasicArray2915 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionUnionElementBasicArray2936 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEDROOMDataDefinitionUnionElementBasicArray2948 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementBasicArray2960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementClass_in_entryRuleEDROOMDataDefinitionUnionElementClass2996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementClass3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementClass3067 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementClass3084 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementClass3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementClassArray_in_entryRuleEDROOMDataDefinitionUnionElementClassArray3137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementClassArray3147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementClassArray3208 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementClassArray3225 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEDROOMDataDefinitionUnionElementClassArray3242 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionUnionElementClassArray3263 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEDROOMDataDefinitionUnionElementClassArray3275 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementClassArray3287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementUnion_in_entryRuleEDROOMDataDefinitionUnionElementUnion3323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementUnion3333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEDROOMDataDefinitionUnionElementUnion3382 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataDefinitionUnionElementUnion3409 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementUnion3426 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementUnion3443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementUnionArray_in_entryRuleEDROOMDataDefinitionUnionElementUnionArray3479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementUnionArray3489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEDROOMDataDefinitionUnionElementUnionArray3538 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataDefinitionUnionElementUnionArray3565 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementUnionArray3582 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEDROOMDataDefinitionUnionElementUnionArray3599 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionUnionElementUnionArray3620 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEDROOMDataDefinitionUnionElementUnionArray3632 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementUnionArray3644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementEnum_in_entryRuleEDROOMDataDefinitionUnionElementEnum3680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementEnum3690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEDROOMDataDefinitionUnionElementEnum3739 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataDefinitionUnionElementEnum3766 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementEnum3783 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementEnum3800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementEnumArray_in_entryRuleEDROOMDataDefinitionUnionElementEnumArray3836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataDefinitionUnionElementEnumArray3846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEDROOMDataDefinitionUnionElementEnumArray3895 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataDefinitionUnionElementEnumArray3922 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataDefinitionUnionElementEnumArray3939 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEDROOMDataDefinitionUnionElementEnumArray3956 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDROOMDataDefinitionUnionElementEnumArray3977 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEDROOMDataDefinitionUnionElementEnumArray3989 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataDefinitionUnionElementEnumArray4001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataField_in_entryRuleEDROOMDataField4037 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataField4047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldBasic_in_ruleEDROOMDataField4097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldBasicArray_in_ruleEDROOMDataField4127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldClass_in_ruleEDROOMDataField4157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldClassArray_in_ruleEDROOMDataField4187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldUnion_in_ruleEDROOMDataField4217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldUnionArray_in_ruleEDROOMDataField4247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldEnum_in_ruleEDROOMDataField4277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldEnumArray_in_ruleEDROOMDataField4307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldBasic_in_entryRuleEDROOMDataFieldBasic4342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataFieldBasic4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMBasicType_in_ruleEDROOMDataFieldBasic4410 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataFieldBasic4427 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataFieldBasic4444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldBasicArray_in_entryRuleEDROOMDataFieldBasicArray4480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataFieldBasicArray4490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMBasicType_in_ruleEDROOMDataFieldBasicArray4548 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataFieldBasicArray4565 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEDROOMDataFieldBasicArray4582 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDROOMDataFieldBasicArray4603 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEDROOMDataFieldBasicArray4615 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataFieldBasicArray4627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldClass_in_entryRuleEDROOMDataFieldClass4663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataFieldClass4673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMDataFieldClass4737 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataFieldClass4754 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataFieldClass4771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldClassArray_in_entryRuleEDROOMDataFieldClassArray4807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataFieldClassArray4817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMDataFieldClassArray4881 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataFieldClassArray4898 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEDROOMDataFieldClassArray4915 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDROOMDataFieldClassArray4936 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEDROOMDataFieldClassArray4948 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataFieldClassArray4960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldUnion_in_entryRuleEDROOMDataFieldUnion4996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataFieldUnion5006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEDROOMDataFieldUnion5055 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataFieldUnion5082 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataFieldUnion5099 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataFieldUnion5116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldUnionArray_in_entryRuleEDROOMDataFieldUnionArray5152 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataFieldUnionArray5162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEDROOMDataFieldUnionArray5211 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataFieldUnionArray5238 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataFieldUnionArray5255 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEDROOMDataFieldUnionArray5272 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDROOMDataFieldUnionArray5293 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEDROOMDataFieldUnionArray5305 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataFieldUnionArray5317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldEnum_in_entryRuleEDROOMDataFieldEnum5353 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataFieldEnum5363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEDROOMDataFieldEnum5412 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataFieldEnum5439 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataFieldEnum5456 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataFieldEnum5473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataFieldEnumArray_in_entryRuleEDROOMDataFieldEnumArray5509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMDataFieldEnumArray5519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEDROOMDataFieldEnumArray5568 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMDataFieldEnumArray5595 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMDataFieldEnumArray5612 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEDROOMDataFieldEnumArray5629 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDROOMDataFieldEnumArray5650 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEDROOMDataFieldEnumArray5662 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMDataFieldEnumArray5674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEDROOMBasicType5724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEDROOMBasicType5741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEDROOMBasicType5758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEDROOMBasicType5775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEDROOMBasicType5792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEDROOMBasicType5809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEDROOMBasicType5826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEDROOMBasicType5843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEDROOMBasicType5860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEDROOMBasicType5877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEDROOMBasicType5894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEDROOMBasicType5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEDROOMBasicType5928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEDROOMBasicType5945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEDROOMBasicType5962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_synpred12_InternalDCLASS1416 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_synpred12_InternalDCLASS1428 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_synpred12_InternalDCLASS1449 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_synpred12_InternalDCLASS1461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinition_in_synpred14_InternalDCLASS1538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataField_in_synpred14_InternalDCLASS1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinition_in_synpred15_InternalDCLASS1538 = new BitSet(new long[]{0x00001FFFC6400022L});
        public static final BitSet FOLLOW_ruleEDROOMDataField_in_synpred15_InternalDCLASS1565 = new BitSet(new long[]{0x00001FFFC6400022L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementUnion_in_synpred24_InternalDCLASS2550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementUnionArray_in_synpred25_InternalDCLASS2580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMDataDefinitionUnionElementEnum_in_synpred26_InternalDCLASS2610 = new BitSet(new long[]{0x0000000000000002L});
    }

}
