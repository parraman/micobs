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
import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services.PROTGrammarAccess;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPROTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'protocol'", "'extends'", "','", "'{'", "'version'", "':='", "'interface'", "'input'", "'messages'", "'}'", "'output'", "'send'", "'invoke'", "'replies'", "'reply'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
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

        public InternalPROTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPROTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalPROTParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g"; }

    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private PROTGrammarAccess grammarAccess;

        public InternalPROTParser(TokenStream input, PROTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EDROOMPROTPackageFile";
       	}

       	@Override
       	protected PROTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}

    // $ANTLR start "entryRuleEDROOMPROTPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:74:1: entryRuleEDROOMPROTPackageFile returns [EObject current=null] : iv_ruleEDROOMPROTPackageFile= ruleEDROOMPROTPackageFile EOF ;
    public final EObject entryRuleEDROOMPROTPackageFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMPROTPackageFile = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:75:2: (iv_ruleEDROOMPROTPackageFile= ruleEDROOMPROTPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:76:2: iv_ruleEDROOMPROTPackageFile= ruleEDROOMPROTPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMPROTPackageFileRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMPROTPackageFile_in_entryRuleEDROOMPROTPackageFile81);
            iv_ruleEDROOMPROTPackageFile=ruleEDROOMPROTPackageFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMPROTPackageFile;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMPROTPackageFile91); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMPROTPackageFile"

    // $ANTLR start "ruleEDROOMPROTPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:83:1: ruleEDROOMPROTPackageFile returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMPROTPackageElement ) ) ) ;
    public final EObject ruleEDROOMPROTPackageFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_6_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:86:28: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMPROTPackageElement ) ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMPROTPackageElement ) ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:87:1: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMPROTPackageElement ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:87:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )* ( (lv_element_6_0= ruleEDROOMPROTPackageElement ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEDROOMPROTPackageFile128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEDROOMPROTPackageFileAccess().getPackageKeyword_0());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:91:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:92:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:92:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:93:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMPROTPackageFileRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageEDROOMPackageCrossReference_1_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleEDROOMPROTPackageFile155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMPROTPackageFile167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_2());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:113:1: (otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }

                switch (alt1) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:113:3: otherlv_3= 'import' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEDROOMPROTPackageFile180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEDROOMPROTPackageFileAccess().getImportKeyword_3_0());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:117:1: ( ( ruleQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:118:1: ( ruleQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:118:1: ( ruleQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:119:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      		  /* */

            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEDROOMPROTPackageFileRule());
            	      	        }

            	    }
            	    if ( state.backtracking==0 ) {

            	      	        newCompositeNode(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0());

            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleEDROOMPROTPackageFile207);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        afterParserOrEnumRuleCall();

            	    }

            	    }

            	    }

            	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMPROTPackageFile219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_3_2());

            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:139:3: ( (lv_element_6_0= ruleEDROOMPROTPackageElement ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:140:1: (lv_element_6_0= ruleEDROOMPROTPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:140:1: (lv_element_6_0= ruleEDROOMPROTPackageElement )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:141:3: lv_element_6_0= ruleEDROOMPROTPackageElement
            {
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMPROTPackageFileAccess().getElementEDROOMPROTPackageElementParserRuleCall_4_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMPROTPackageElement_in_ruleEDROOMPROTPackageFile242);
            lv_element_6_0=ruleEDROOMPROTPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEDROOMPROTPackageFileRule());
              	        }
                     		set(
                     			current,
                     			"element",
                      		lv_element_6_0,
                      		"EDROOMPROTPackageElement");
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
    // $ANTLR end "ruleEDROOMPROTPackageFile"

    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:165:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:166:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:167:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName279);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText();
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName290); if (state.failed) return current;

            }

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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:174:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:177:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:178:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:178:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:178:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);

            }
            if ( state.backtracking==0 ) {

                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:185:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }

                switch (alt2) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:186:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQualifiedName349); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());

            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName364); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:206:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:207:2: (iv_ruleVersion= ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:208:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion412);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText();
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion423); if (state.failed) return current;

            }

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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:215:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:218:28: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:219:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:219:1: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:219:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:219:2: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
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
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:219:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);

                    }
                    if ( state.backtracking==0 ) {

                          newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:227:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:227:6: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:227:7: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:227:7: (this_INT_1= RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:227:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion492); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);

                            }
                            if ( state.backtracking==0 ) {

                                  newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());

                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion514); if (state.failed) return current;
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

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:241:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }

                switch (alt7) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:242:2: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVersion535); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:247:1: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
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
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:247:6: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion551); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_4);

            	            }
            	            if ( state.backtracking==0 ) {

            	                  newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());

            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:255:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:255:6: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:255:7: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:255:7: (this_INT_5= RULE_INT )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==RULE_INT) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:255:12: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion579); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      		current.merge(this_INT_5);

            	                    }
            	                    if ( state.backtracking==0 ) {

            	                          newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());

            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion601); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:277:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:278:2: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:279:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedNameRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName651);
            iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedName.getText();
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedName662); if (state.failed) return current;

            }

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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:286:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:289:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:290:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:290:1: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:291:5: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleVersionedQualifiedName709);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);

            }
            if ( state.backtracking==0 ) {

                      afterParserOrEnumRuleCall();

            }
            kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVersionedQualifiedName727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());

            }
            if ( state.backtracking==0 ) {

                      newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleVersionedQualifiedName749);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Version_2);

            }
            if ( state.backtracking==0 ) {

                      afterParserOrEnumRuleCall();

            }
            kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleVersionedQualifiedName767); if (state.failed) return current;
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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:332:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:333:2: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:334:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName808);
            iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedReferenceName.getText();
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName819); if (state.failed) return current;

            }

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
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:341:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:344:28: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:345:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:345:1: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:345:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:345:2: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
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
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:346:5: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleVersionedQualifiedReferenceName867);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VersionedQualifiedName_0);

                    }
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();

                    }
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVersionedQualifiedReferenceName885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());

                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);

            }
            if ( state.backtracking==0 ) {

                  newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:369:1: (kw= '::' this_ID_4= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }

                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:370:2: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVersionedQualifiedReferenceName921); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());

            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName936); if (state.failed) return current;
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

    // $ANTLR start "entryRuleEDROOMPROTPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:390:1: entryRuleEDROOMPROTPackageElement returns [EObject current=null] : iv_ruleEDROOMPROTPackageElement= ruleEDROOMPROTPackageElement EOF ;
    public final EObject entryRuleEDROOMPROTPackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMPROTPackageElement = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:391:2: (iv_ruleEDROOMPROTPackageElement= ruleEDROOMPROTPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:392:2: iv_ruleEDROOMPROTPackageElement= ruleEDROOMPROTPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMPROTPackageElementRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMPROTPackageElement_in_entryRuleEDROOMPROTPackageElement983);
            iv_ruleEDROOMPROTPackageElement=ruleEDROOMPROTPackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMPROTPackageElement;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMPROTPackageElement993); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMPROTPackageElement"

    // $ANTLR start "ruleEDROOMPROTPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:399:1: ruleEDROOMPROTPackageElement returns [EObject current=null] : this_EDROOMProtocol_0= ruleEDROOMProtocol ;
    public final EObject ruleEDROOMPROTPackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_EDROOMProtocol_0 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:402:28: (this_EDROOMProtocol_0= ruleEDROOMProtocol )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:404:2: this_EDROOMProtocol_0= ruleEDROOMProtocol
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      newCompositeNode(grammarAccess.getEDROOMPROTPackageElementAccess().getEDROOMProtocolParserRuleCall());

            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMProtocol_in_ruleEDROOMPROTPackageElement1042);
            this_EDROOMProtocol_0=ruleEDROOMProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_EDROOMProtocol_0;
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
    // $ANTLR end "ruleEDROOMPROTPackageElement"

    // $ANTLR start "entryRuleEDROOMProtocol"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:423:1: entryRuleEDROOMProtocol returns [EObject current=null] : iv_ruleEDROOMProtocol= ruleEDROOMProtocol EOF ;
    public final EObject entryRuleEDROOMProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMProtocol = null;


        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5()
        		);

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:429:2: (iv_ruleEDROOMProtocol= ruleEDROOMProtocol EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:430:2: iv_ruleEDROOMProtocol= ruleEDROOMProtocol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMProtocolRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMProtocol_in_entryRuleEDROOMProtocol1082);
            iv_ruleEDROOMProtocol=ruleEDROOMProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMProtocol;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMProtocol1092); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEDROOMProtocol"

    // $ANTLR start "ruleEDROOMProtocol"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:440:1: ruleEDROOMProtocol returns [EObject current=null] : ( () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) otherlv_29= '}' otherlv_30= ';' ) ;
    public final EObject ruleEDROOMProtocol() throws RecognitionException {
        EObject current = null;

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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_version_11_0 = null;

        EObject lv_inputMessages_20_0 = null;

        EObject lv_outputMessages_26_0 = null;

         enterRule();
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5()
        		);

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:446:28: ( ( () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) otherlv_29= '}' otherlv_30= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:447:1: ( () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) otherlv_29= '}' otherlv_30= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:447:1: ( () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) otherlv_29= '}' otherlv_30= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:447:2: () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )? otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) otherlv_29= '}' otherlv_30= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:447:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:448:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMProtocolAccess().getEDROOMProtocolAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEDROOMProtocol1145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMProtocolAccess().getProtocolKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:460:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:461:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:461:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:462:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMProtocol1162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMProtocolAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMProtocolRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:478:2: (otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:478:4: otherlv_3= 'extends' ( ( ruleVersionedQualifiedName ) ) (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEDROOMProtocol1180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEDROOMProtocolAccess().getExtendsKeyword_3_0());

                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:482:1: ( ( ruleVersionedQualifiedName ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:483:1: ( ruleVersionedQualifiedName )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:483:1: ( ruleVersionedQualifiedName )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:484:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      		  /* */

                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEDROOMProtocolRule());
                      	        }

                    }
                    if ( state.backtracking==0 ) {

                      	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_1_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMProtocol1207);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        afterParserOrEnumRuleCall();

                    }

                    }

                    }

                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:500:2: (otherlv_5= ',' ( ( ruleVersionedQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }

                        switch (alt10) {
                    	case 1 :
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:500:4: otherlv_5= ',' ( ( ruleVersionedQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEDROOMProtocol1220); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEDROOMProtocolAccess().getCommaKeyword_3_2_0());

                    	    }
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:504:1: ( ( ruleVersionedQualifiedName ) )
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:505:1: ( ruleVersionedQualifiedName )
                    	    {
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:505:1: ( ruleVersionedQualifiedName )
                    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:506:3: ruleVersionedQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      		  /* */

                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEDROOMProtocolRule());
                    	      	        }

                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_2_1_0());

                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMProtocol1247);
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

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDROOMProtocol1263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_4());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:526:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:528:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:528:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:529:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:532:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?)
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:533:3: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+ {...}?
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:533:3: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=5;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3) ) {
                    alt14=4;
                }

                switch (alt14) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:535:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:535:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:536:5: {...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:536:111: ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:537:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0);
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:540:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:540:7: {...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMProtocol", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:540:16: (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:540:18: otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEDROOMProtocol1321); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getEDROOMProtocolAccess().getVersionKeyword_5_0_0());

            	    }
            	    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEDROOMProtocol1333); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_0_1());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:548:1: ( (lv_version_11_0= ruleVersion ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:549:1: (lv_version_11_0= ruleVersion )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:549:1: (lv_version_11_0= ruleVersion )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:550:3: lv_version_11_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getVersionVersionParserRuleCall_5_0_2_0());

            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleEDROOMProtocol1354);
            	    lv_version_11_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEDROOMProtocolRule());
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

            	    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMProtocol1366); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_0_3());

            	    }

            	    }

            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());

            	    }

            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:577:4: ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:577:4: ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:578:5: {...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:578:111: ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:579:6: ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1);
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:582:6: ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:582:7: {...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMProtocol", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:582:16: (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:582:18: otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';'
            	    {
            	    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDROOMProtocol1434); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getEDROOMProtocolAccess().getInterfaceKeyword_5_1_0());

            	    }
            	    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEDROOMProtocol1446); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_1_1());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:590:1: ( ( ruleVersionedQualifiedName ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:591:1: ( ruleVersionedQualifiedName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:591:1: ( ruleVersionedQualifiedName )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:592:3: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      		  /* */

            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEDROOMProtocolRule());
            	      	        }

            	    }
            	    if ( state.backtracking==0 ) {

            	      	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getReferencedElementMInterfaceCrossReference_5_1_2_0());

            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMProtocol1473);
            	    ruleVersionedQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        afterParserOrEnumRuleCall();

            	    }

            	    }

            	    }

            	    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMProtocol1485); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_1_3());

            	    }

            	    }

            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());

            	    }

            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:619:4: ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:619:4: ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:620:5: {...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:620:111: ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:621:6: ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2);
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:624:6: ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:624:7: {...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMProtocol", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:624:16: (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:624:18: otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';'
            	    {
            	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDROOMProtocol1553); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getEDROOMProtocolAccess().getInputKeyword_5_2_0());

            	    }
            	    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDROOMProtocol1565); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_18, grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_2_1());

            	    }
            	    otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDROOMProtocol1577); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_2_2());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:636:1: ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( ((LA12_0>=29 && LA12_0<=30)||LA12_0==32) ) {
            	            alt12=1;
            	        }

            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:637:1: (lv_inputMessages_20_0= ruleEDROOMMessage )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:637:1: (lv_inputMessages_20_0= ruleEDROOMMessage )
            	    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:638:3: lv_inputMessages_20_0= ruleEDROOMMessage
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getInputMessagesEDROOMMessageParserRuleCall_5_2_3_0());

            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleEDROOMMessage_in_ruleEDROOMProtocol1598);
            	    	    lv_inputMessages_20_0=ruleEDROOMMessage();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getEDROOMProtocolRule());
            	    	      	        }
            	    	             		add(
            	    	             			current,
            	    	             			"inputMessages",
            	    	              		lv_inputMessages_20_0,
            	    	              		"EDROOMMessage");
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

            	    otherlv_21=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEDROOMProtocol1611); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_2_4());

            	    }
            	    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMProtocol1623); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_2_5());

            	    }

            	    }

            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());

            	    }

            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:669:4: ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:669:4: ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:670:5: {...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:670:111: ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:671:6: ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3);
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:674:6: ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:674:7: {...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEDROOMProtocol", "true");
            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:674:16: (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:674:18: otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';'
            	    {
            	    otherlv_23=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDROOMProtocol1691); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getEDROOMProtocolAccess().getOutputKeyword_5_3_0());

            	    }
            	    otherlv_24=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDROOMProtocol1703); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_24, grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_3_1());

            	    }
            	    otherlv_25=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEDROOMProtocol1715); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_3_2());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:686:1: ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( ((LA13_0>=29 && LA13_0<=30)||LA13_0==32) ) {
            	            alt13=1;
            	        }

            	        switch (alt13) {
            	    	case 1 :
            	    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:687:1: (lv_outputMessages_26_0= ruleEDROOMMessage )
            	    	    {
            	    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:687:1: (lv_outputMessages_26_0= ruleEDROOMMessage )
            	    	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:688:3: lv_outputMessages_26_0= ruleEDROOMMessage
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesEDROOMMessageParserRuleCall_5_3_3_0());

            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleEDROOMMessage_in_ruleEDROOMProtocol1736);
            	    	    lv_outputMessages_26_0=ruleEDROOMMessage();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getEDROOMProtocolRule());
            	    	      	        }
            	    	             		add(
            	    	             			current,
            	    	             			"outputMessages",
            	    	              		lv_outputMessages_26_0,
            	    	              		"EDROOMMessage");
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

            	    otherlv_27=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEDROOMProtocol1749); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_3_4());

            	    }
            	    otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMProtocol1761); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_28, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_3_5());

            	    }

            	    }

            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleEDROOMProtocol", "getUnorderedGroupHelper().canLeave(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5())");
            }

            }

            }

            getUnorderedGroupHelper().leave(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());

            }

            otherlv_29=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEDROOMProtocol1820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_29, grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_6());

            }
            otherlv_30=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMProtocol1832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_30, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_7());

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
    // $ANTLR end "ruleEDROOMProtocol"

    // $ANTLR start "entryRuleEDROOMMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:746:1: entryRuleEDROOMMessage returns [EObject current=null] : iv_ruleEDROOMMessage= ruleEDROOMMessage EOF ;
    public final EObject entryRuleEDROOMMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMMessage = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:747:2: (iv_ruleEDROOMMessage= ruleEDROOMMessage EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:748:2: iv_ruleEDROOMMessage= ruleEDROOMMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMMessageRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMMessage_in_entryRuleEDROOMMessage1872);
            iv_ruleEDROOMMessage=ruleEDROOMMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMMessage;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMMessage1882); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMMessage"

    // $ANTLR start "ruleEDROOMMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:755:1: ruleEDROOMMessage returns [EObject current=null] : (this_EDROOMSendMessage_0= ruleEDROOMSendMessage | this_EDROOMInvokeMessage_1= ruleEDROOMInvokeMessage | this_EDROOMReplyMessage_2= ruleEDROOMReplyMessage ) ;
    public final EObject ruleEDROOMMessage() throws RecognitionException {
        EObject current = null;

        EObject this_EDROOMSendMessage_0 = null;

        EObject this_EDROOMInvokeMessage_1 = null;

        EObject this_EDROOMReplyMessage_2 = null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:758:28: ( (this_EDROOMSendMessage_0= ruleEDROOMSendMessage | this_EDROOMInvokeMessage_1= ruleEDROOMInvokeMessage | this_EDROOMReplyMessage_2= ruleEDROOMReplyMessage ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:759:1: (this_EDROOMSendMessage_0= ruleEDROOMSendMessage | this_EDROOMInvokeMessage_1= ruleEDROOMInvokeMessage | this_EDROOMReplyMessage_2= ruleEDROOMReplyMessage )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:759:1: (this_EDROOMSendMessage_0= ruleEDROOMSendMessage | this_EDROOMInvokeMessage_1= ruleEDROOMInvokeMessage | this_EDROOMReplyMessage_2= ruleEDROOMReplyMessage )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:760:2: this_EDROOMSendMessage_0= ruleEDROOMSendMessage
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMMessageAccess().getEDROOMSendMessageParserRuleCall_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMSendMessage_in_ruleEDROOMMessage1932);
                    this_EDROOMSendMessage_0=ruleEDROOMSendMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMSendMessage_0;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:773:2: this_EDROOMInvokeMessage_1= ruleEDROOMInvokeMessage
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMMessageAccess().getEDROOMInvokeMessageParserRuleCall_1());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMInvokeMessage_in_ruleEDROOMMessage1962);
                    this_EDROOMInvokeMessage_1=ruleEDROOMInvokeMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMInvokeMessage_1;
                              afterParserOrEnumRuleCall();

                    }

                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:786:2: this_EDROOMReplyMessage_2= ruleEDROOMReplyMessage
                    {
                    if ( state.backtracking==0 ) {

                      	  /* */

                    }
                    if ( state.backtracking==0 ) {

                              newCompositeNode(grammarAccess.getEDROOMMessageAccess().getEDROOMReplyMessageParserRuleCall_2());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMReplyMessage_in_ruleEDROOMMessage1992);
                    this_EDROOMReplyMessage_2=ruleEDROOMReplyMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EDROOMReplyMessage_2;
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
    // $ANTLR end "ruleEDROOMMessage"

    // $ANTLR start "entryRuleEDROOMSendMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:805:1: entryRuleEDROOMSendMessage returns [EObject current=null] : iv_ruleEDROOMSendMessage= ruleEDROOMSendMessage EOF ;
    public final EObject entryRuleEDROOMSendMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMSendMessage = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:806:2: (iv_ruleEDROOMSendMessage= ruleEDROOMSendMessage EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:807:2: iv_ruleEDROOMSendMessage= ruleEDROOMSendMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMSendMessageRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMSendMessage_in_entryRuleEDROOMSendMessage2027);
            iv_ruleEDROOMSendMessage=ruleEDROOMSendMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMSendMessage;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMSendMessage2037); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMSendMessage"

    // $ANTLR start "ruleEDROOMSendMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:814:1: ruleEDROOMSendMessage returns [EObject current=null] : ( () otherlv_1= 'send' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleEDROOMSendMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:817:28: ( ( () otherlv_1= 'send' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:818:1: ( () otherlv_1= 'send' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:818:1: ( () otherlv_1= 'send' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:818:2: () otherlv_1= 'send' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:818:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:819:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMSendMessageAccess().getEDROOMSendMessageAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDROOMSendMessage2086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMSendMessageAccess().getSendKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:831:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:832:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:832:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:833:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMSendMessage2103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMSendMessageAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMSendMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEDROOMSendMessage2120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMSendMessageAccess().getLeftParenthesisKeyword_3());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:853:1: ( ( ruleVersionedQualifiedName ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:854:1: ( ruleVersionedQualifiedName )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:854:1: ( ruleVersionedQualifiedName )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:855:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      		  /* */

                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEDROOMSendMessageRule());
                      	        }

                    }
                    if ( state.backtracking==0 ) {

                      	        newCompositeNode(grammarAccess.getEDROOMSendMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMSendMessage2147);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        afterParserOrEnumRuleCall();

                    }

                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEDROOMSendMessage2160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEDROOMSendMessageAccess().getRightParenthesisKeyword_5());

            }
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMSendMessage2172); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMSendMessageAccess().getSemicolonKeyword_6());

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
    // $ANTLR end "ruleEDROOMSendMessage"

    // $ANTLR start "entryRuleEDROOMInvokeMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:887:1: entryRuleEDROOMInvokeMessage returns [EObject current=null] : iv_ruleEDROOMInvokeMessage= ruleEDROOMInvokeMessage EOF ;
    public final EObject entryRuleEDROOMInvokeMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMInvokeMessage = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:888:2: (iv_ruleEDROOMInvokeMessage= ruleEDROOMInvokeMessage EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:889:2: iv_ruleEDROOMInvokeMessage= ruleEDROOMInvokeMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMInvokeMessageRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMInvokeMessage_in_entryRuleEDROOMInvokeMessage2208);
            iv_ruleEDROOMInvokeMessage=ruleEDROOMInvokeMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMInvokeMessage;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMInvokeMessage2218); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMInvokeMessage"

    // $ANTLR start "ruleEDROOMInvokeMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:896:1: ruleEDROOMInvokeMessage returns [EObject current=null] : ( () otherlv_1= 'invoke' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= 'replies' ( ( ruleVersionedQualifiedReferenceName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedReferenceName ) ) )* otherlv_10= ';' ) ;
    public final EObject ruleEDROOMInvokeMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:899:28: ( ( () otherlv_1= 'invoke' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= 'replies' ( ( ruleVersionedQualifiedReferenceName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedReferenceName ) ) )* otherlv_10= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:900:1: ( () otherlv_1= 'invoke' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= 'replies' ( ( ruleVersionedQualifiedReferenceName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedReferenceName ) ) )* otherlv_10= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:900:1: ( () otherlv_1= 'invoke' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= 'replies' ( ( ruleVersionedQualifiedReferenceName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedReferenceName ) ) )* otherlv_10= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:900:2: () otherlv_1= 'invoke' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= 'replies' ( ( ruleVersionedQualifiedReferenceName ) ) (otherlv_8= ',' ( ( ruleVersionedQualifiedReferenceName ) ) )* otherlv_10= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:900:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:901:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMInvokeMessageAccess().getEDROOMInvokeMessageAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEDROOMInvokeMessage2267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMInvokeMessageAccess().getInvokeKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:913:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:914:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:914:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:915:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMInvokeMessage2284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMInvokeMessageAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMInvokeMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEDROOMInvokeMessage2301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMInvokeMessageAccess().getLeftParenthesisKeyword_3());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:935:1: ( ( ruleVersionedQualifiedName ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:936:1: ( ruleVersionedQualifiedName )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:936:1: ( ruleVersionedQualifiedName )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:937:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      		  /* */

                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEDROOMInvokeMessageRule());
                      	        }

                    }
                    if ( state.backtracking==0 ) {

                      	        newCompositeNode(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMInvokeMessage2328);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        afterParserOrEnumRuleCall();

                    }

                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEDROOMInvokeMessage2341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEDROOMInvokeMessageAccess().getRightParenthesisKeyword_5());

            }
            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEDROOMInvokeMessage2353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMInvokeMessageAccess().getRepliesKeyword_6());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:961:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:962:1: ( ruleVersionedQualifiedReferenceName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:962:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:963:3: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              		  /* */

            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMInvokeMessageRule());
              	        }

            }
            if ( state.backtracking==0 ) {

              	        newCompositeNode(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_7_0());

            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMInvokeMessage2380);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        afterParserOrEnumRuleCall();

            }

            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:979:2: (otherlv_8= ',' ( ( ruleVersionedQualifiedReferenceName ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }

                switch (alt18) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:979:4: otherlv_8= ',' ( ( ruleVersionedQualifiedReferenceName ) )
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEDROOMInvokeMessage2393); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getEDROOMInvokeMessageAccess().getCommaKeyword_8_0());

            	    }
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:983:1: ( ( ruleVersionedQualifiedReferenceName ) )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:984:1: ( ruleVersionedQualifiedReferenceName )
            	    {
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:984:1: ( ruleVersionedQualifiedReferenceName )
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:985:3: ruleVersionedQualifiedReferenceName
            	    {
            	    if ( state.backtracking==0 ) {

            	      		  /* */

            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEDROOMInvokeMessageRule());
            	      	        }

            	    }
            	    if ( state.backtracking==0 ) {

            	      	        newCompositeNode(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_8_1_0());

            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMInvokeMessage2420);
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

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMInvokeMessage2434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getEDROOMInvokeMessageAccess().getSemicolonKeyword_9());

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
    // $ANTLR end "ruleEDROOMInvokeMessage"

    // $ANTLR start "entryRuleEDROOMReplyMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1013:1: entryRuleEDROOMReplyMessage returns [EObject current=null] : iv_ruleEDROOMReplyMessage= ruleEDROOMReplyMessage EOF ;
    public final EObject entryRuleEDROOMReplyMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDROOMReplyMessage = null;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1014:2: (iv_ruleEDROOMReplyMessage= ruleEDROOMReplyMessage EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1015:2: iv_ruleEDROOMReplyMessage= ruleEDROOMReplyMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDROOMReplyMessageRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMReplyMessage_in_entryRuleEDROOMReplyMessage2470);
            iv_ruleEDROOMReplyMessage=ruleEDROOMReplyMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDROOMReplyMessage;
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMReplyMessage2480); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDROOMReplyMessage"

    // $ANTLR start "ruleEDROOMReplyMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1022:1: ruleEDROOMReplyMessage returns [EObject current=null] : ( () otherlv_1= 'reply' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleEDROOMReplyMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1025:28: ( ( () otherlv_1= 'reply' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1026:1: ( () otherlv_1= 'reply' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1026:1: ( () otherlv_1= 'reply' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1026:2: () otherlv_1= 'reply' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleVersionedQualifiedName ) )? otherlv_5= ')' otherlv_6= ';'
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1026:2: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1027:2:
            {
            if ( state.backtracking==0 ) {

              	  /* */

            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEDROOMReplyMessageAccess().getEDROOMReplyMessageAction_0(),
                          current);

            }

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDROOMReplyMessage2529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEDROOMReplyMessageAccess().getReplyKeyword_1());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1039:1: ( (lv_name_2_0= RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1040:1: (lv_name_2_0= RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1040:1: (lv_name_2_0= RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1041:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEDROOMReplyMessage2546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMReplyMessageAccess().getNameIDTerminalRuleCall_2_0());

            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEDROOMReplyMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current,
                     			"name",
                      		lv_name_2_0,
                      		"ID");

            }

            }

            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEDROOMReplyMessage2563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEDROOMReplyMessageAccess().getLeftParenthesisKeyword_3());

            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1061:1: ( ( ruleVersionedQualifiedName ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1062:1: ( ruleVersionedQualifiedName )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1062:1: ( ruleVersionedQualifiedName )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:1063:3: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      		  /* */

                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEDROOMReplyMessageRule());
                      	        }

                    }
                    if ( state.backtracking==0 ) {

                      	        newCompositeNode(grammarAccess.getEDROOMReplyMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0());

                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMReplyMessage2590);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        afterParserOrEnumRuleCall();

                    }

                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEDROOMReplyMessage2603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEDROOMReplyMessageAccess().getRightParenthesisKeyword_5());

            }
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEDROOMReplyMessage2615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEDROOMReplyMessageAccess().getSemicolonKeyword_6());

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
    // $ANTLR end "ruleEDROOMReplyMessage"

    // $ANTLR start synpred12_InternalPROT
    public final void synpred12_InternalPROT_fragment() throws RecognitionException {
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_version_11_0 = null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:535:4: ( ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:535:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:535:4: ({...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:536:5: {...}? => ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalPROT", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:536:111: ( ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:537:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0);
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:540:6: ({...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:540:7: {...}? => (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalPROT", "true");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:540:16: (otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';' )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:540:18: otherlv_9= 'version' otherlv_10= ':=' ( (lv_version_11_0= ruleVersion ) ) otherlv_12= ';'
        {
        otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred12_InternalPROT1321); if (state.failed) return ;
        otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred12_InternalPROT1333); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:548:1: ( (lv_version_11_0= ruleVersion ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:549:1: (lv_version_11_0= ruleVersion )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:549:1: (lv_version_11_0= ruleVersion )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:550:3: lv_version_11_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getVersionVersionParserRuleCall_5_0_2_0());

        }
        pushFollow(FollowSets000.FOLLOW_ruleVersion_in_synpred12_InternalPROT1354);
        lv_version_11_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }

        }

        otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred12_InternalPROT1366); if (state.failed) return ;

        }

        }

        }

        }

        }
    }
    // $ANTLR end synpred12_InternalPROT

    // $ANTLR start synpred13_InternalPROT
    public final void synpred13_InternalPROT_fragment() throws RecognitionException {
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:577:4: ( ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:577:4: ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:577:4: ({...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:578:5: {...}? => ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalPROT", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:578:111: ( ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:579:6: ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1);
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:582:6: ({...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:582:7: {...}? => (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalPROT", "true");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:582:16: (otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';' )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:582:18: otherlv_13= 'interface' otherlv_14= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_16= ';'
        {
        otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_synpred13_InternalPROT1434); if (state.failed) return ;
        otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_synpred13_InternalPROT1446); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:590:1: ( ( ruleVersionedQualifiedName ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:591:1: ( ruleVersionedQualifiedName )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:591:1: ( ruleVersionedQualifiedName )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:592:3: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {

          		  /* */

        }
        pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_synpred13_InternalPROT1473);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }

        }

        otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred13_InternalPROT1485); if (state.failed) return ;

        }

        }

        }

        }

        }
    }
    // $ANTLR end synpred13_InternalPROT

    // $ANTLR start synpred15_InternalPROT
    public final void synpred15_InternalPROT_fragment() throws RecognitionException {
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_inputMessages_20_0 = null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:619:4: ( ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:619:4: ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:619:4: ({...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:620:5: {...}? => ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalPROT", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2)");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:620:111: ( ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:621:6: ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2);
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:624:6: ({...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:624:7: {...}? => (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalPROT", "true");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:624:16: (otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';' )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:624:18: otherlv_17= 'input' otherlv_18= 'messages' otherlv_19= '{' ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+ otherlv_21= '}' otherlv_22= ';'
        {
        otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_synpred15_InternalPROT1553); if (state.failed) return ;
        otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_synpred15_InternalPROT1565); if (state.failed) return ;
        otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred15_InternalPROT1577); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:636:1: ( (lv_inputMessages_20_0= ruleEDROOMMessage ) )+
        int cnt23=0;
        loop23:
        do {
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=29 && LA23_0<=30)||LA23_0==32) ) {
                alt23=1;
            }

            switch (alt23) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:637:1: (lv_inputMessages_20_0= ruleEDROOMMessage )
        	    {
        	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:637:1: (lv_inputMessages_20_0= ruleEDROOMMessage )
        	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:638:3: lv_inputMessages_20_0= ruleEDROOMMessage
        	    {
        	    if ( state.backtracking==0 ) {

        	      	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getInputMessagesEDROOMMessageParserRuleCall_5_2_3_0());

        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleEDROOMMessage_in_synpred15_InternalPROT1598);
        	    lv_inputMessages_20_0=ruleEDROOMMessage();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }

        	    }
        	    break;

        	default :
        	    if ( cnt23 >= 1 ) break loop23;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(23, input);
                    throw eee;
            }
            cnt23++;
        } while (true);

        otherlv_21=(Token)match(input,27,FollowSets000.FOLLOW_27_in_synpred15_InternalPROT1611); if (state.failed) return ;
        otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred15_InternalPROT1623); if (state.failed) return ;

        }

        }

        }

        }

        }
    }
    // $ANTLR end synpred15_InternalPROT

    // $ANTLR start synpred17_InternalPROT
    public final void synpred17_InternalPROT_fragment() throws RecognitionException {
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_outputMessages_26_0 = null;

        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:669:4: ( ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:669:4: ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:669:4: ({...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:670:5: {...}? => ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred17_InternalPROT", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3)");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:670:111: ( ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:671:6: ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3);
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:674:6: ({...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:674:7: {...}? => (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred17_InternalPROT", "true");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:674:16: (otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';' )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:674:18: otherlv_23= 'output' otherlv_24= 'messages' otherlv_25= '{' ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+ otherlv_27= '}' otherlv_28= ';'
        {
        otherlv_23=(Token)match(input,28,FollowSets000.FOLLOW_28_in_synpred17_InternalPROT1691); if (state.failed) return ;
        otherlv_24=(Token)match(input,26,FollowSets000.FOLLOW_26_in_synpred17_InternalPROT1703); if (state.failed) return ;
        otherlv_25=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred17_InternalPROT1715); if (state.failed) return ;
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:686:1: ( (lv_outputMessages_26_0= ruleEDROOMMessage ) )+
        int cnt24=0;
        loop24:
        do {
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=29 && LA24_0<=30)||LA24_0==32) ) {
                alt24=1;
            }

            switch (alt24) {
        	case 1 :
        	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:687:1: (lv_outputMessages_26_0= ruleEDROOMMessage )
        	    {
        	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:687:1: (lv_outputMessages_26_0= ruleEDROOMMessage )
        	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/parser/antlr/internal/InternalPROT.g:688:3: lv_outputMessages_26_0= ruleEDROOMMessage
        	    {
        	    if ( state.backtracking==0 ) {

        	      	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesEDROOMMessageParserRuleCall_5_3_3_0());

        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleEDROOMMessage_in_synpred17_InternalPROT1736);
        	    lv_outputMessages_26_0=ruleEDROOMMessage();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }

        	    }
        	    break;

        	default :
        	    if ( cnt24 >= 1 ) break loop24;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(24, input);
                    throw eee;
            }
            cnt24++;
        } while (true);

        otherlv_27=(Token)match(input,27,FollowSets000.FOLLOW_27_in_synpred17_InternalPROT1749); if (state.failed) return ;
        otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_synpred17_InternalPROT1761); if (state.failed) return ;

        }

        }

        }

        }

        }
    }
    // $ANTLR end synpred17_InternalPROT

    // Delegated rules

    public final boolean synpred17_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalPROT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalPROT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPROT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalPROT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleEDROOMPROTPackageFile_in_entryRuleEDROOMPROTPackageFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMPROTPackageFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEDROOMPROTPackageFile128 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEDROOMPROTPackageFile155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMPROTPackageFile167 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleEDROOMPROTPackageFile180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEDROOMPROTPackageFile207 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMPROTPackageFile219 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_ruleEDROOMPROTPackageElement_in_ruleEDROOMPROTPackageFile242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName330 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleQualifiedName349 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName364 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion412 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion464 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion492 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion514 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleVersion535 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion551 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion579 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion601 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVersionedQualifiedName709 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleVersionedQualifiedName727 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleVersionedQualifiedName749 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleVersionedQualifiedName767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleVersionedQualifiedReferenceName867 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleVersionedQualifiedReferenceName885 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName902 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleVersionedQualifiedReferenceName921 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersionedQualifiedReferenceName936 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleEDROOMPROTPackageElement_in_entryRuleEDROOMPROTPackageElement983 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMPROTPackageElement993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMProtocol_in_ruleEDROOMPROTPackageElement1042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMProtocol_in_entryRuleEDROOMProtocol1082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMProtocol1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEDROOMProtocol1145 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMProtocol1162 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleEDROOMProtocol1180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMProtocol1207 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleEDROOMProtocol1220 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMProtocol1247 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleEDROOMProtocol1263 = new BitSet(new long[]{0x0000000013400000L});
        public static final BitSet FOLLOW_22_in_ruleEDROOMProtocol1321 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEDROOMProtocol1333 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleEDROOMProtocol1354 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMProtocol1366 = new BitSet(new long[]{0x000000001B400000L});
        public static final BitSet FOLLOW_24_in_ruleEDROOMProtocol1434 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEDROOMProtocol1446 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMProtocol1473 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMProtocol1485 = new BitSet(new long[]{0x000000001B400000L});
        public static final BitSet FOLLOW_25_in_ruleEDROOMProtocol1553 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleEDROOMProtocol1565 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEDROOMProtocol1577 = new BitSet(new long[]{0x0000000160000000L});
        public static final BitSet FOLLOW_ruleEDROOMMessage_in_ruleEDROOMProtocol1598 = new BitSet(new long[]{0x0000000168000000L});
        public static final BitSet FOLLOW_27_in_ruleEDROOMProtocol1611 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMProtocol1623 = new BitSet(new long[]{0x000000001B400000L});
        public static final BitSet FOLLOW_28_in_ruleEDROOMProtocol1691 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleEDROOMProtocol1703 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEDROOMProtocol1715 = new BitSet(new long[]{0x0000000160000000L});
        public static final BitSet FOLLOW_ruleEDROOMMessage_in_ruleEDROOMProtocol1736 = new BitSet(new long[]{0x0000000168000000L});
        public static final BitSet FOLLOW_27_in_ruleEDROOMProtocol1749 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMProtocol1761 = new BitSet(new long[]{0x000000001B400000L});
        public static final BitSet FOLLOW_27_in_ruleEDROOMProtocol1820 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMProtocol1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMMessage_in_entryRuleEDROOMMessage1872 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMMessage1882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMSendMessage_in_ruleEDROOMMessage1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMInvokeMessage_in_ruleEDROOMMessage1962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMReplyMessage_in_ruleEDROOMMessage1992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMSendMessage_in_entryRuleEDROOMSendMessage2027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMSendMessage2037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEDROOMSendMessage2086 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMSendMessage2103 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEDROOMSendMessage2120 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMSendMessage2147 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEDROOMSendMessage2160 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMSendMessage2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMInvokeMessage_in_entryRuleEDROOMInvokeMessage2208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMInvokeMessage2218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEDROOMInvokeMessage2267 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMInvokeMessage2284 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEDROOMInvokeMessage2301 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMInvokeMessage2328 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEDROOMInvokeMessage2341 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleEDROOMInvokeMessage2353 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMInvokeMessage2380 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_20_in_ruleEDROOMInvokeMessage2393 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_ruleEDROOMInvokeMessage2420 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMInvokeMessage2434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMReplyMessage_in_entryRuleEDROOMReplyMessage2470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMReplyMessage2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEDROOMReplyMessage2529 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEDROOMReplyMessage2546 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEDROOMReplyMessage2563 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_ruleEDROOMReplyMessage2590 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEDROOMReplyMessage2603 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEDROOMReplyMessage2615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_synpred12_InternalPROT1321 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_synpred12_InternalPROT1333 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVersion_in_synpred12_InternalPROT1354 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_synpred12_InternalPROT1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_synpred13_InternalPROT1434 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_synpred13_InternalPROT1446 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_synpred13_InternalPROT1473 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_synpred13_InternalPROT1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_synpred15_InternalPROT1553 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_synpred15_InternalPROT1565 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_synpred15_InternalPROT1577 = new BitSet(new long[]{0x0000000160000000L});
        public static final BitSet FOLLOW_ruleEDROOMMessage_in_synpred15_InternalPROT1598 = new BitSet(new long[]{0x0000000168000000L});
        public static final BitSet FOLLOW_27_in_synpred15_InternalPROT1611 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_synpred15_InternalPROT1623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_synpred17_InternalPROT1691 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_synpred17_InternalPROT1703 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_synpred17_InternalPROT1715 = new BitSet(new long[]{0x0000000160000000L});
        public static final BitSet FOLLOW_ruleEDROOMMessage_in_synpred17_InternalPROT1736 = new BitSet(new long[]{0x0000000168000000L});
        public static final BitSet FOLLOW_27_in_synpred17_InternalPROT1749 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_synpred17_InternalPROT1761 = new BitSet(new long[]{0x0000000000000002L});
    }

}
