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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services.PROTGrammarAccess;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPROTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'protocol'", "'{'", "'}'", "'extends'", "','", "'version'", "':='", "'interface'", "'input'", "'messages'", "'output'", "'send'", "'invoke'", "'replies'", "'reply'"
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
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g"; }


     	private PROTGrammarAccess grammarAccess;

        public void setGrammarAccess(PROTGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }

        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }

    // $ANTLR start "entryRuleEDROOMPROTPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:61:1: entryRuleEDROOMPROTPackageFile : ruleEDROOMPROTPackageFile EOF ;
    public final void entryRuleEDROOMPROTPackageFile() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:62:1: ( ruleEDROOMPROTPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:63:1: ruleEDROOMPROTPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMPROTPackageFile_in_entryRuleEDROOMPROTPackageFile67);
            ruleEDROOMPROTPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMPROTPackageFile74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDROOMPROTPackageFile"

    // $ANTLR start "ruleEDROOMPROTPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:70:1: ruleEDROOMPROTPackageFile : ( ( rule__EDROOMPROTPackageFile__Group__0 ) ) ;
    public final void ruleEDROOMPROTPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:74:2: ( ( ( rule__EDROOMPROTPackageFile__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:75:1: ( ( rule__EDROOMPROTPackageFile__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:75:1: ( ( rule__EDROOMPROTPackageFile__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:76:1: ( rule__EDROOMPROTPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getGroup());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:77:1: ( rule__EDROOMPROTPackageFile__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:77:2: rule__EDROOMPROTPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__0_in_ruleEDROOMPROTPackageFile100);
            rule__EDROOMPROTPackageFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getGroup());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDROOMPROTPackageFile"

    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:89:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:90:1: ( ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:91:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName127);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"

    // $ANTLR start "ruleQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:98:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:102:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:103:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:103:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:104:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:105:1: ( rule__QualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:105:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName160);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"

    // $ANTLR start "entryRuleVersion"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:117:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:118:1: ( ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:119:1: ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion187);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersion"

    // $ANTLR start "ruleVersion"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:126:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:130:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:131:1: ( ( rule__Version__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:131:1: ( ( rule__Version__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:132:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:133:1: ( rule__Version__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:133:2: rule__Version__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0_in_ruleVersion220);
            rule__Version__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"

    // $ANTLR start "entryRuleVersionedQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:145:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:146:1: ( ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:147:1: ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName247);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedName254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersionedQualifiedName"

    // $ANTLR start "ruleVersionedQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:154:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:158:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:159:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:159:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:160:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:161:1: ( rule__VersionedQualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:161:2: rule__VersionedQualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__0_in_ruleVersionedQualifiedName280);
            rule__VersionedQualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getGroup());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersionedQualifiedName"

    // $ANTLR start "entryRuleVersionedQualifiedReferenceName"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:173:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:174:1: ( ruleVersionedQualifiedReferenceName EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:175:1: ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName307);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersionedQualifiedReferenceName"

    // $ANTLR start "ruleVersionedQualifiedReferenceName"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:182:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:186:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:187:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:187:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:188:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:189:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:189:2: rule__VersionedQualifiedReferenceName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__0_in_ruleVersionedQualifiedReferenceName340);
            rule__VersionedQualifiedReferenceName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersionedQualifiedReferenceName"

    // $ANTLR start "entryRuleEDROOMPROTPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:201:1: entryRuleEDROOMPROTPackageElement : ruleEDROOMPROTPackageElement EOF ;
    public final void entryRuleEDROOMPROTPackageElement() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:202:1: ( ruleEDROOMPROTPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:203:1: ruleEDROOMPROTPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageElementRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMPROTPackageElement_in_entryRuleEDROOMPROTPackageElement367);
            ruleEDROOMPROTPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageElementRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMPROTPackageElement374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDROOMPROTPackageElement"

    // $ANTLR start "ruleEDROOMPROTPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:210:1: ruleEDROOMPROTPackageElement : ( ruleEDROOMProtocol ) ;
    public final void ruleEDROOMPROTPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:214:2: ( ( ruleEDROOMProtocol ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:215:1: ( ruleEDROOMProtocol )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:215:1: ( ruleEDROOMProtocol )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:216:1: ruleEDROOMProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageElementAccess().getEDROOMProtocolParserRuleCall());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMProtocol_in_ruleEDROOMPROTPackageElement400);
            ruleEDROOMProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageElementAccess().getEDROOMProtocolParserRuleCall());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDROOMPROTPackageElement"

    // $ANTLR start "entryRuleEDROOMProtocol"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:229:1: entryRuleEDROOMProtocol : ruleEDROOMProtocol EOF ;
    public final void entryRuleEDROOMProtocol() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:230:1: ( ruleEDROOMProtocol EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:231:1: ruleEDROOMProtocol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMProtocol_in_entryRuleEDROOMProtocol426);
            ruleEDROOMProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMProtocol433); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDROOMProtocol"

    // $ANTLR start "ruleEDROOMProtocol"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:238:1: ruleEDROOMProtocol : ( ( rule__EDROOMProtocol__Group__0 ) ) ;
    public final void ruleEDROOMProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:242:2: ( ( ( rule__EDROOMProtocol__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:243:1: ( ( rule__EDROOMProtocol__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:243:1: ( ( rule__EDROOMProtocol__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:244:1: ( rule__EDROOMProtocol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getGroup());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:245:1: ( rule__EDROOMProtocol__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:245:2: rule__EDROOMProtocol__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__0_in_ruleEDROOMProtocol459);
            rule__EDROOMProtocol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getGroup());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDROOMProtocol"

    // $ANTLR start "entryRuleEDROOMMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:257:1: entryRuleEDROOMMessage : ruleEDROOMMessage EOF ;
    public final void entryRuleEDROOMMessage() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:258:1: ( ruleEDROOMMessage EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:259:1: ruleEDROOMMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMMessageRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMMessage_in_entryRuleEDROOMMessage486);
            ruleEDROOMMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMMessageRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMMessage493); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDROOMMessage"

    // $ANTLR start "ruleEDROOMMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:266:1: ruleEDROOMMessage : ( ( rule__EDROOMMessage__Alternatives ) ) ;
    public final void ruleEDROOMMessage() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:270:2: ( ( ( rule__EDROOMMessage__Alternatives ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:271:1: ( ( rule__EDROOMMessage__Alternatives ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:271:1: ( ( rule__EDROOMMessage__Alternatives ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:272:1: ( rule__EDROOMMessage__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMMessageAccess().getAlternatives());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:273:1: ( rule__EDROOMMessage__Alternatives )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:273:2: rule__EDROOMMessage__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMMessage__Alternatives_in_ruleEDROOMMessage519);
            rule__EDROOMMessage__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMMessageAccess().getAlternatives());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDROOMMessage"

    // $ANTLR start "entryRuleEDROOMSendMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:285:1: entryRuleEDROOMSendMessage : ruleEDROOMSendMessage EOF ;
    public final void entryRuleEDROOMSendMessage() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:286:1: ( ruleEDROOMSendMessage EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:287:1: ruleEDROOMSendMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMSendMessage_in_entryRuleEDROOMSendMessage546);
            ruleEDROOMSendMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMSendMessage553); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDROOMSendMessage"

    // $ANTLR start "ruleEDROOMSendMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:294:1: ruleEDROOMSendMessage : ( ( rule__EDROOMSendMessage__Group__0 ) ) ;
    public final void ruleEDROOMSendMessage() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:298:2: ( ( ( rule__EDROOMSendMessage__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:299:1: ( ( rule__EDROOMSendMessage__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:299:1: ( ( rule__EDROOMSendMessage__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:300:1: ( rule__EDROOMSendMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getGroup());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:301:1: ( rule__EDROOMSendMessage__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:301:2: rule__EDROOMSendMessage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__0_in_ruleEDROOMSendMessage579);
            rule__EDROOMSendMessage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getGroup());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDROOMSendMessage"

    // $ANTLR start "entryRuleEDROOMInvokeMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:313:1: entryRuleEDROOMInvokeMessage : ruleEDROOMInvokeMessage EOF ;
    public final void entryRuleEDROOMInvokeMessage() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:314:1: ( ruleEDROOMInvokeMessage EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:315:1: ruleEDROOMInvokeMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMInvokeMessage_in_entryRuleEDROOMInvokeMessage606);
            ruleEDROOMInvokeMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMInvokeMessage613); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDROOMInvokeMessage"

    // $ANTLR start "ruleEDROOMInvokeMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:322:1: ruleEDROOMInvokeMessage : ( ( rule__EDROOMInvokeMessage__Group__0 ) ) ;
    public final void ruleEDROOMInvokeMessage() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:326:2: ( ( ( rule__EDROOMInvokeMessage__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:327:1: ( ( rule__EDROOMInvokeMessage__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:327:1: ( ( rule__EDROOMInvokeMessage__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:328:1: ( rule__EDROOMInvokeMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getGroup());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:329:1: ( rule__EDROOMInvokeMessage__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:329:2: rule__EDROOMInvokeMessage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__0_in_ruleEDROOMInvokeMessage639);
            rule__EDROOMInvokeMessage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getGroup());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDROOMInvokeMessage"

    // $ANTLR start "entryRuleEDROOMReplyMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:341:1: entryRuleEDROOMReplyMessage : ruleEDROOMReplyMessage EOF ;
    public final void entryRuleEDROOMReplyMessage() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:342:1: ( ruleEDROOMReplyMessage EOF )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:343:1: ruleEDROOMReplyMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageRule());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMReplyMessage_in_entryRuleEDROOMReplyMessage666);
            ruleEDROOMReplyMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageRule());
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDROOMReplyMessage673); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDROOMReplyMessage"

    // $ANTLR start "ruleEDROOMReplyMessage"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:350:1: ruleEDROOMReplyMessage : ( ( rule__EDROOMReplyMessage__Group__0 ) ) ;
    public final void ruleEDROOMReplyMessage() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:354:2: ( ( ( rule__EDROOMReplyMessage__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:355:1: ( ( rule__EDROOMReplyMessage__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:355:1: ( ( rule__EDROOMReplyMessage__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:356:1: ( rule__EDROOMReplyMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getGroup());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:357:1: ( rule__EDROOMReplyMessage__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:357:2: rule__EDROOMReplyMessage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__0_in_ruleEDROOMReplyMessage699);
            rule__EDROOMReplyMessage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getGroup());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDROOMReplyMessage"

    // $ANTLR start "rule__Version__Alternatives_0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:369:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:373:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==12||LA1_1==14||LA1_1==16) ) {
                    alt1=1;
                }
                else if ( (LA1_1==RULE_ID) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:374:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:374:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:375:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Alternatives_0735); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                    }

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:380:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:380:6: ( ( rule__Version__Group_0_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:381:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1());
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:382:1: ( rule__Version__Group_0_1__0 )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:382:2: rule__Version__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0752);
                    rule__Version__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getGroup_0_1());
                    }

                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Alternatives_0"

    // $ANTLR start "rule__Version__Alternatives_1_1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:391:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:395:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==12||LA2_1==14||LA2_1==16) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:396:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:396:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:397:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1785); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
                    }

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:402:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:402:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:403:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1());
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:404:1: ( rule__Version__Group_1_1_1__0 )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:404:2: rule__Version__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1802);
                    rule__Version__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getGroup_1_1_1());
                    }

                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Alternatives_1_1"

    // $ANTLR start "rule__EDROOMMessage__Alternatives"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:413:1: rule__EDROOMMessage__Alternatives : ( ( ruleEDROOMSendMessage ) | ( ruleEDROOMInvokeMessage ) | ( ruleEDROOMReplyMessage ) );
    public final void rule__EDROOMMessage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:417:1: ( ( ruleEDROOMSendMessage ) | ( ruleEDROOMInvokeMessage ) | ( ruleEDROOMReplyMessage ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:418:1: ( ruleEDROOMSendMessage )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:418:1: ( ruleEDROOMSendMessage )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:419:1: ruleEDROOMSendMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDROOMMessageAccess().getEDROOMSendMessageParserRuleCall_0());
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMSendMessage_in_rule__EDROOMMessage__Alternatives835);
                    ruleEDROOMSendMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDROOMMessageAccess().getEDROOMSendMessageParserRuleCall_0());
                    }

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:424:6: ( ruleEDROOMInvokeMessage )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:424:6: ( ruleEDROOMInvokeMessage )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:425:1: ruleEDROOMInvokeMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDROOMMessageAccess().getEDROOMInvokeMessageParserRuleCall_1());
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMInvokeMessage_in_rule__EDROOMMessage__Alternatives852);
                    ruleEDROOMInvokeMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDROOMMessageAccess().getEDROOMInvokeMessageParserRuleCall_1());
                    }

                    }

                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:430:6: ( ruleEDROOMReplyMessage )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:430:6: ( ruleEDROOMReplyMessage )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:431:1: ruleEDROOMReplyMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDROOMMessageAccess().getEDROOMReplyMessageParserRuleCall_2());
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDROOMReplyMessage_in_rule__EDROOMMessage__Alternatives869);
                    ruleEDROOMReplyMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDROOMMessageAccess().getEDROOMReplyMessageParserRuleCall_2());
                    }

                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMMessage__Alternatives"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:443:1: rule__EDROOMPROTPackageFile__Group__0 : rule__EDROOMPROTPackageFile__Group__0__Impl rule__EDROOMPROTPackageFile__Group__1 ;
    public final void rule__EDROOMPROTPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:447:1: ( rule__EDROOMPROTPackageFile__Group__0__Impl rule__EDROOMPROTPackageFile__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:448:2: rule__EDROOMPROTPackageFile__Group__0__Impl rule__EDROOMPROTPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__0__Impl_in_rule__EDROOMPROTPackageFile__Group__0899);
            rule__EDROOMPROTPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__1_in_rule__EDROOMPROTPackageFile__Group__0902);
            rule__EDROOMPROTPackageFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__0"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:455:1: rule__EDROOMPROTPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__EDROOMPROTPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:459:1: ( ( 'package' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:460:1: ( 'package' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:460:1: ( 'package' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:461:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageKeyword_0());
            }
            match(input,11,FollowSets000.FOLLOW_11_in_rule__EDROOMPROTPackageFile__Group__0__Impl930); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageKeyword_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__0__Impl"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:474:1: rule__EDROOMPROTPackageFile__Group__1 : rule__EDROOMPROTPackageFile__Group__1__Impl rule__EDROOMPROTPackageFile__Group__2 ;
    public final void rule__EDROOMPROTPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:478:1: ( rule__EDROOMPROTPackageFile__Group__1__Impl rule__EDROOMPROTPackageFile__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:479:2: rule__EDROOMPROTPackageFile__Group__1__Impl rule__EDROOMPROTPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__1__Impl_in_rule__EDROOMPROTPackageFile__Group__1961);
            rule__EDROOMPROTPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__2_in_rule__EDROOMPROTPackageFile__Group__1964);
            rule__EDROOMPROTPackageFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__1"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:486:1: rule__EDROOMPROTPackageFile__Group__1__Impl : ( ( rule__EDROOMPROTPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__EDROOMPROTPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:490:1: ( ( ( rule__EDROOMPROTPackageFile__PackageAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:491:1: ( ( rule__EDROOMPROTPackageFile__PackageAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:491:1: ( ( rule__EDROOMPROTPackageFile__PackageAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:492:1: ( rule__EDROOMPROTPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageAssignment_1());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:493:1: ( rule__EDROOMPROTPackageFile__PackageAssignment_1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:493:2: rule__EDROOMPROTPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__PackageAssignment_1_in_rule__EDROOMPROTPackageFile__Group__1__Impl991);
            rule__EDROOMPROTPackageFile__PackageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageAssignment_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__1__Impl"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:503:1: rule__EDROOMPROTPackageFile__Group__2 : rule__EDROOMPROTPackageFile__Group__2__Impl rule__EDROOMPROTPackageFile__Group__3 ;
    public final void rule__EDROOMPROTPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:507:1: ( rule__EDROOMPROTPackageFile__Group__2__Impl rule__EDROOMPROTPackageFile__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:508:2: rule__EDROOMPROTPackageFile__Group__2__Impl rule__EDROOMPROTPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__2__Impl_in_rule__EDROOMPROTPackageFile__Group__21021);
            rule__EDROOMPROTPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__3_in_rule__EDROOMPROTPackageFile__Group__21024);
            rule__EDROOMPROTPackageFile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__2"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:515:1: rule__EDROOMPROTPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__EDROOMPROTPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:519:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:520:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:520:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:521:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_2());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMPROTPackageFile__Group__2__Impl1052); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__2__Impl"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:534:1: rule__EDROOMPROTPackageFile__Group__3 : rule__EDROOMPROTPackageFile__Group__3__Impl rule__EDROOMPROTPackageFile__Group__4 ;
    public final void rule__EDROOMPROTPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:538:1: ( rule__EDROOMPROTPackageFile__Group__3__Impl rule__EDROOMPROTPackageFile__Group__4 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:539:2: rule__EDROOMPROTPackageFile__Group__3__Impl rule__EDROOMPROTPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__3__Impl_in_rule__EDROOMPROTPackageFile__Group__31083);
            rule__EDROOMPROTPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__4_in_rule__EDROOMPROTPackageFile__Group__31086);
            rule__EDROOMPROTPackageFile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__3"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:546:1: rule__EDROOMPROTPackageFile__Group__3__Impl : ( ( rule__EDROOMPROTPackageFile__Group_3__0 )* ) ;
    public final void rule__EDROOMPROTPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:550:1: ( ( ( rule__EDROOMPROTPackageFile__Group_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:551:1: ( ( rule__EDROOMPROTPackageFile__Group_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:551:1: ( ( rule__EDROOMPROTPackageFile__Group_3__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:552:1: ( rule__EDROOMPROTPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getGroup_3());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:553:1: ( rule__EDROOMPROTPackageFile__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }

                switch (alt4) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:553:2: rule__EDROOMPROTPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group_3__0_in_rule__EDROOMPROTPackageFile__Group__3__Impl1113);
            	    rule__EDROOMPROTPackageFile__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getGroup_3());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__3__Impl"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:563:1: rule__EDROOMPROTPackageFile__Group__4 : rule__EDROOMPROTPackageFile__Group__4__Impl ;
    public final void rule__EDROOMPROTPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:567:1: ( rule__EDROOMPROTPackageFile__Group__4__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:568:2: rule__EDROOMPROTPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group__4__Impl_in_rule__EDROOMPROTPackageFile__Group__41144);
            rule__EDROOMPROTPackageFile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__4"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:574:1: rule__EDROOMPROTPackageFile__Group__4__Impl : ( ( rule__EDROOMPROTPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__EDROOMPROTPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:578:1: ( ( ( rule__EDROOMPROTPackageFile__ElementAssignment_4 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:579:1: ( ( rule__EDROOMPROTPackageFile__ElementAssignment_4 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:579:1: ( ( rule__EDROOMPROTPackageFile__ElementAssignment_4 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:580:1: ( rule__EDROOMPROTPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getElementAssignment_4());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:581:1: ( rule__EDROOMPROTPackageFile__ElementAssignment_4 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:581:2: rule__EDROOMPROTPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__ElementAssignment_4_in_rule__EDROOMPROTPackageFile__Group__4__Impl1171);
            rule__EDROOMPROTPackageFile__ElementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getElementAssignment_4());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group__4__Impl"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group_3__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:601:1: rule__EDROOMPROTPackageFile__Group_3__0 : rule__EDROOMPROTPackageFile__Group_3__0__Impl rule__EDROOMPROTPackageFile__Group_3__1 ;
    public final void rule__EDROOMPROTPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:605:1: ( rule__EDROOMPROTPackageFile__Group_3__0__Impl rule__EDROOMPROTPackageFile__Group_3__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:606:2: rule__EDROOMPROTPackageFile__Group_3__0__Impl rule__EDROOMPROTPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group_3__0__Impl_in_rule__EDROOMPROTPackageFile__Group_3__01211);
            rule__EDROOMPROTPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group_3__1_in_rule__EDROOMPROTPackageFile__Group_3__01214);
            rule__EDROOMPROTPackageFile__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group_3__0"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:613:1: rule__EDROOMPROTPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__EDROOMPROTPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:617:1: ( ( 'import' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:618:1: ( 'import' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:618:1: ( 'import' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:619:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getImportKeyword_3_0());
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__EDROOMPROTPackageFile__Group_3__0__Impl1242); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getImportKeyword_3_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group_3__0__Impl"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group_3__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:632:1: rule__EDROOMPROTPackageFile__Group_3__1 : rule__EDROOMPROTPackageFile__Group_3__1__Impl rule__EDROOMPROTPackageFile__Group_3__2 ;
    public final void rule__EDROOMPROTPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:636:1: ( rule__EDROOMPROTPackageFile__Group_3__1__Impl rule__EDROOMPROTPackageFile__Group_3__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:637:2: rule__EDROOMPROTPackageFile__Group_3__1__Impl rule__EDROOMPROTPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group_3__1__Impl_in_rule__EDROOMPROTPackageFile__Group_3__11273);
            rule__EDROOMPROTPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group_3__2_in_rule__EDROOMPROTPackageFile__Group_3__11276);
            rule__EDROOMPROTPackageFile__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group_3__1"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:644:1: rule__EDROOMPROTPackageFile__Group_3__1__Impl : ( ( rule__EDROOMPROTPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__EDROOMPROTPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:648:1: ( ( ( rule__EDROOMPROTPackageFile__ImportsAssignment_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:649:1: ( ( rule__EDROOMPROTPackageFile__ImportsAssignment_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:649:1: ( ( rule__EDROOMPROTPackageFile__ImportsAssignment_3_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:650:1: ( rule__EDROOMPROTPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsAssignment_3_1());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:651:1: ( rule__EDROOMPROTPackageFile__ImportsAssignment_3_1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:651:2: rule__EDROOMPROTPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__ImportsAssignment_3_1_in_rule__EDROOMPROTPackageFile__Group_3__1__Impl1303);
            rule__EDROOMPROTPackageFile__ImportsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsAssignment_3_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group_3__1__Impl"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group_3__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:661:1: rule__EDROOMPROTPackageFile__Group_3__2 : rule__EDROOMPROTPackageFile__Group_3__2__Impl ;
    public final void rule__EDROOMPROTPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:665:1: ( rule__EDROOMPROTPackageFile__Group_3__2__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:666:2: rule__EDROOMPROTPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMPROTPackageFile__Group_3__2__Impl_in_rule__EDROOMPROTPackageFile__Group_3__21333);
            rule__EDROOMPROTPackageFile__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group_3__2"

    // $ANTLR start "rule__EDROOMPROTPackageFile__Group_3__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:672:1: rule__EDROOMPROTPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__EDROOMPROTPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:676:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:677:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:677:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:678:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_3_2());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMPROTPackageFile__Group_3__2__Impl1361); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_3_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__Group_3__2__Impl"

    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:697:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:701:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:702:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01398);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01401);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"

    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:709:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:713:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:714:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:714:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:715:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1428); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"

    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:726:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:730:1: ( rule__QualifiedName__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:731:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11457);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"

    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:737:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:741:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:742:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:742:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:743:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:744:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }

                switch (alt5) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:744:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1484);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"

    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:758:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:762:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:763:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01519);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01522);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"

    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:770:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:774:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:775:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:775:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:776:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1550); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"

    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:789:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:793:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:794:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11581);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"

    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:800:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:804:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:805:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:805:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:806:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1608); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"

    // $ANTLR start "rule__Version__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:821:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:825:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:826:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__01641);
            rule__Version__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1_in_rule__Version__Group__01644);
            rule__Version__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"

    // $ANTLR start "rule__Version__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:833:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:837:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:838:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:838:1: ( ( rule__Version__Alternatives_0 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:839:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:840:1: ( rule__Version__Alternatives_0 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:840:2: rule__Version__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Alternatives_0_in_rule__Version__Group__0__Impl1671);
            rule__Version__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getAlternatives_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"

    // $ANTLR start "rule__Version__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:850:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:854:1: ( rule__Version__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:855:2: rule__Version__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__11701);
            rule__Version__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"

    // $ANTLR start "rule__Version__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:861:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:865:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:866:1: ( ( rule__Version__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:866:1: ( ( rule__Version__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:867:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:868:1: ( rule__Version__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }

                switch (alt6) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:868:2: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl1728);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"

    // $ANTLR start "rule__Version__Group_0_1__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:882:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:886:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:887:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__0__Impl_in_rule__Version__Group_0_1__01763);
            rule__Version__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__1_in_rule__Version__Group_0_1__01766);
            rule__Version__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0_1__0"

    // $ANTLR start "rule__Version__Group_0_1__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:894:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:898:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:899:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:899:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:900:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:901:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:901:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Group_0_1__0__Impl1794); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0_1__0__Impl"

    // $ANTLR start "rule__Version__Group_0_1__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:911:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:915:1: ( rule__Version__Group_0_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:916:2: rule__Version__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__1__Impl_in_rule__Version__Group_0_1__11825);
            rule__Version__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0_1__1"

    // $ANTLR start "rule__Version__Group_0_1__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:922:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:926:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:927:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:927:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:928:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Version__Group_0_1__1__Impl1852); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0_1__1__Impl"

    // $ANTLR start "rule__Version__Group_1__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:943:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:947:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:948:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__01885);
            rule__Version__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__01888);
            rule__Version__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1__0"

    // $ANTLR start "rule__Version__Group_1__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:955:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:959:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:960:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:960:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:961:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Version__Group_1__0__Impl1916); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1__0__Impl"

    // $ANTLR start "rule__Version__Group_1__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:974:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:978:1: ( rule__Version__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:979:2: rule__Version__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__11947);
            rule__Version__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1__1"

    // $ANTLR start "rule__Version__Group_1__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:985:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:989:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:990:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:990:1: ( ( rule__Version__Alternatives_1_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:991:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:992:1: ( rule__Version__Alternatives_1_1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:992:2: rule__Version__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Alternatives_1_1_in_rule__Version__Group_1__1__Impl1974);
            rule__Version__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getAlternatives_1_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1__1__Impl"

    // $ANTLR start "rule__Version__Group_1_1_1__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1006:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1010:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1011:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__02008);
            rule__Version__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__02011);
            rule__Version__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1_1_1__0"

    // $ANTLR start "rule__Version__Group_1_1_1__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1018:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1022:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1023:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1023:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1024:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1025:1: ( RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1025:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__0__Impl2039); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1_1_1__0__Impl"

    // $ANTLR start "rule__Version__Group_1_1_1__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1035:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1039:1: ( rule__Version__Group_1_1_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1040:2: rule__Version__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__12070);
            rule__Version__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1_1_1__1"

    // $ANTLR start "rule__Version__Group_1_1_1__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1046:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1050:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1051:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1051:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1052:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Version__Group_1_1_1__1__Impl2097); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1_1_1__1__Impl"

    // $ANTLR start "rule__VersionedQualifiedName__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1067:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1071:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1072:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__0__Impl_in_rule__VersionedQualifiedName__Group__02130);
            rule__VersionedQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__1_in_rule__VersionedQualifiedName__Group__02133);
            rule__VersionedQualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__0"

    // $ANTLR start "rule__VersionedQualifiedName__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1079:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1083:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1084:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1084:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1085:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__VersionedQualifiedName__Group__0__Impl2160);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__0__Impl"

    // $ANTLR start "rule__VersionedQualifiedName__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1096:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1100:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1101:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__1__Impl_in_rule__VersionedQualifiedName__Group__12189);
            rule__VersionedQualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__2_in_rule__VersionedQualifiedName__Group__12192);
            rule__VersionedQualifiedName__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__1"

    // $ANTLR start "rule__VersionedQualifiedName__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1108:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1112:1: ( ( '(' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1113:1: ( '(' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1113:1: ( '(' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1114:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__VersionedQualifiedName__Group__1__Impl2220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__1__Impl"

    // $ANTLR start "rule__VersionedQualifiedName__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1127:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1131:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1132:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__2__Impl_in_rule__VersionedQualifiedName__Group__22251);
            rule__VersionedQualifiedName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__3_in_rule__VersionedQualifiedName__Group__22254);
            rule__VersionedQualifiedName__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__2"

    // $ANTLR start "rule__VersionedQualifiedName__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1139:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1143:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1144:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1144:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1145:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__VersionedQualifiedName__Group__2__Impl2281);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__2__Impl"

    // $ANTLR start "rule__VersionedQualifiedName__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1156:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1160:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1161:2: rule__VersionedQualifiedName__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__3__Impl_in_rule__VersionedQualifiedName__Group__32310);
            rule__VersionedQualifiedName__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__3"

    // $ANTLR start "rule__VersionedQualifiedName__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1167:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1171:1: ( ( ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1172:1: ( ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1172:1: ( ')' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1173:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3());
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__VersionedQualifiedName__Group__3__Impl2338); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__3__Impl"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1194:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1198:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1199:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__0__Impl_in_rule__VersionedQualifiedReferenceName__Group__02377);
            rule__VersionedQualifiedReferenceName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__1_in_rule__VersionedQualifiedReferenceName__Group__02380);
            rule__VersionedQualifiedReferenceName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__0"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1206:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1210:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1211:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1211:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1212:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1213:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=14 && LA9_1<=15)) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1213:2: rule__VersionedQualifiedReferenceName__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__0_in_rule__VersionedQualifiedReferenceName__Group__0__Impl2407);
                    rule__VersionedQualifiedReferenceName__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__0__Impl"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1223:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1227:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1228:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__1__Impl_in_rule__VersionedQualifiedReferenceName__Group__12438);
            rule__VersionedQualifiedReferenceName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__2_in_rule__VersionedQualifiedReferenceName__Group__12441);
            rule__VersionedQualifiedReferenceName__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__1"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1235:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1239:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1240:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1240:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1241:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VersionedQualifiedReferenceName__Group__1__Impl2468); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__1__Impl"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1252:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1256:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1257:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__2__Impl_in_rule__VersionedQualifiedReferenceName__Group__22497);
            rule__VersionedQualifiedReferenceName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__2"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1263:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1267:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1268:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1268:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1269:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1270:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }

                switch (alt10) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1270:2: rule__VersionedQualifiedReferenceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__0_in_rule__VersionedQualifiedReferenceName__Group__2__Impl2524);
            	    rule__VersionedQualifiedReferenceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__2__Impl"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1286:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1290:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1291:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__0__Impl_in_rule__VersionedQualifiedReferenceName__Group_0__02561);
            rule__VersionedQualifiedReferenceName__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__1_in_rule__VersionedQualifiedReferenceName__Group_0__02564);
            rule__VersionedQualifiedReferenceName__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__0"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1298:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1302:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1303:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1303:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1304:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__VersionedQualifiedReferenceName__Group_0__0__Impl2591);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__0__Impl"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1315:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1319:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1320:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__1__Impl_in_rule__VersionedQualifiedReferenceName__Group_0__12620);
            rule__VersionedQualifiedReferenceName__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__1"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1326:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1330:1: ( ( '::' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1331:1: ( '::' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1331:1: ( '::' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1332:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__VersionedQualifiedReferenceName__Group_0__1__Impl2648); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__1__Impl"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1349:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1353:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1354:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__0__Impl_in_rule__VersionedQualifiedReferenceName__Group_2__02683);
            rule__VersionedQualifiedReferenceName__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__1_in_rule__VersionedQualifiedReferenceName__Group_2__02686);
            rule__VersionedQualifiedReferenceName__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__0"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1361:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1365:1: ( ( '::' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1366:1: ( '::' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1366:1: ( '::' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1367:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__VersionedQualifiedReferenceName__Group_2__0__Impl2714); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__0__Impl"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1380:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1384:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1385:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__1__Impl_in_rule__VersionedQualifiedReferenceName__Group_2__12745);
            rule__VersionedQualifiedReferenceName__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__1"

    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1391:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1395:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1396:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1396:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1397:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VersionedQualifiedReferenceName__Group_2__1__Impl2772); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__1__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1412:1: rule__EDROOMProtocol__Group__0 : rule__EDROOMProtocol__Group__0__Impl rule__EDROOMProtocol__Group__1 ;
    public final void rule__EDROOMProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1416:1: ( rule__EDROOMProtocol__Group__0__Impl rule__EDROOMProtocol__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1417:2: rule__EDROOMProtocol__Group__0__Impl rule__EDROOMProtocol__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__0__Impl_in_rule__EDROOMProtocol__Group__02805);
            rule__EDROOMProtocol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__1_in_rule__EDROOMProtocol__Group__02808);
            rule__EDROOMProtocol__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__0"

    // $ANTLR start "rule__EDROOMProtocol__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1424:1: rule__EDROOMProtocol__Group__0__Impl : ( () ) ;
    public final void rule__EDROOMProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1428:1: ( ( () ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1429:1: ( () )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1429:1: ( () )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1430:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getEDROOMProtocolAction_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1431:1: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1433:1:
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getEDROOMProtocolAction_0());
            }

            }

            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__0__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1443:1: rule__EDROOMProtocol__Group__1 : rule__EDROOMProtocol__Group__1__Impl rule__EDROOMProtocol__Group__2 ;
    public final void rule__EDROOMProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1447:1: ( rule__EDROOMProtocol__Group__1__Impl rule__EDROOMProtocol__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1448:2: rule__EDROOMProtocol__Group__1__Impl rule__EDROOMProtocol__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__1__Impl_in_rule__EDROOMProtocol__Group__12866);
            rule__EDROOMProtocol__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__2_in_rule__EDROOMProtocol__Group__12869);
            rule__EDROOMProtocol__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__1"

    // $ANTLR start "rule__EDROOMProtocol__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1455:1: rule__EDROOMProtocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__EDROOMProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1459:1: ( ( 'protocol' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1460:1: ( 'protocol' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1460:1: ( 'protocol' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1461:1: 'protocol'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getProtocolKeyword_1());
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__EDROOMProtocol__Group__1__Impl2897); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getProtocolKeyword_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__1__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1474:1: rule__EDROOMProtocol__Group__2 : rule__EDROOMProtocol__Group__2__Impl rule__EDROOMProtocol__Group__3 ;
    public final void rule__EDROOMProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1478:1: ( rule__EDROOMProtocol__Group__2__Impl rule__EDROOMProtocol__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1479:2: rule__EDROOMProtocol__Group__2__Impl rule__EDROOMProtocol__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__2__Impl_in_rule__EDROOMProtocol__Group__22928);
            rule__EDROOMProtocol__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__3_in_rule__EDROOMProtocol__Group__22931);
            rule__EDROOMProtocol__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__2"

    // $ANTLR start "rule__EDROOMProtocol__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1486:1: rule__EDROOMProtocol__Group__2__Impl : ( ( rule__EDROOMProtocol__NameAssignment_2 ) ) ;
    public final void rule__EDROOMProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1490:1: ( ( ( rule__EDROOMProtocol__NameAssignment_2 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1491:1: ( ( rule__EDROOMProtocol__NameAssignment_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1491:1: ( ( rule__EDROOMProtocol__NameAssignment_2 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1492:1: ( rule__EDROOMProtocol__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getNameAssignment_2());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1493:1: ( rule__EDROOMProtocol__NameAssignment_2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1493:2: rule__EDROOMProtocol__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__NameAssignment_2_in_rule__EDROOMProtocol__Group__2__Impl2958);
            rule__EDROOMProtocol__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getNameAssignment_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__2__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1503:1: rule__EDROOMProtocol__Group__3 : rule__EDROOMProtocol__Group__3__Impl rule__EDROOMProtocol__Group__4 ;
    public final void rule__EDROOMProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1507:1: ( rule__EDROOMProtocol__Group__3__Impl rule__EDROOMProtocol__Group__4 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1508:2: rule__EDROOMProtocol__Group__3__Impl rule__EDROOMProtocol__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__3__Impl_in_rule__EDROOMProtocol__Group__32988);
            rule__EDROOMProtocol__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__4_in_rule__EDROOMProtocol__Group__32991);
            rule__EDROOMProtocol__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__3"

    // $ANTLR start "rule__EDROOMProtocol__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1515:1: rule__EDROOMProtocol__Group__3__Impl : ( ( rule__EDROOMProtocol__Group_3__0 )? ) ;
    public final void rule__EDROOMProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1519:1: ( ( ( rule__EDROOMProtocol__Group_3__0 )? ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1520:1: ( ( rule__EDROOMProtocol__Group_3__0 )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1520:1: ( ( rule__EDROOMProtocol__Group_3__0 )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1521:1: ( rule__EDROOMProtocol__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getGroup_3());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1522:1: ( rule__EDROOMProtocol__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1522:2: rule__EDROOMProtocol__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3__0_in_rule__EDROOMProtocol__Group__3__Impl3018);
                    rule__EDROOMProtocol__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getGroup_3());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__3__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group__4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1532:1: rule__EDROOMProtocol__Group__4 : rule__EDROOMProtocol__Group__4__Impl rule__EDROOMProtocol__Group__5 ;
    public final void rule__EDROOMProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1536:1: ( rule__EDROOMProtocol__Group__4__Impl rule__EDROOMProtocol__Group__5 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1537:2: rule__EDROOMProtocol__Group__4__Impl rule__EDROOMProtocol__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__4__Impl_in_rule__EDROOMProtocol__Group__43049);
            rule__EDROOMProtocol__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__5_in_rule__EDROOMProtocol__Group__43052);
            rule__EDROOMProtocol__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__4"

    // $ANTLR start "rule__EDROOMProtocol__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1544:1: rule__EDROOMProtocol__Group__4__Impl : ( '{' ) ;
    public final void rule__EDROOMProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1548:1: ( ( '{' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1549:1: ( '{' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1549:1: ( '{' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1550:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_4());
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__EDROOMProtocol__Group__4__Impl3080); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_4());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__4__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group__5"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1563:1: rule__EDROOMProtocol__Group__5 : rule__EDROOMProtocol__Group__5__Impl rule__EDROOMProtocol__Group__6 ;
    public final void rule__EDROOMProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1567:1: ( rule__EDROOMProtocol__Group__5__Impl rule__EDROOMProtocol__Group__6 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1568:2: rule__EDROOMProtocol__Group__5__Impl rule__EDROOMProtocol__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__5__Impl_in_rule__EDROOMProtocol__Group__53111);
            rule__EDROOMProtocol__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__6_in_rule__EDROOMProtocol__Group__53114);
            rule__EDROOMProtocol__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__5"

    // $ANTLR start "rule__EDROOMProtocol__Group__5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1575:1: rule__EDROOMProtocol__Group__5__Impl : ( ( rule__EDROOMProtocol__UnorderedGroup_5 ) ) ;
    public final void rule__EDROOMProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1579:1: ( ( ( rule__EDROOMProtocol__UnorderedGroup_5 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1580:1: ( ( rule__EDROOMProtocol__UnorderedGroup_5 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1580:1: ( ( rule__EDROOMProtocol__UnorderedGroup_5 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1581:1: ( rule__EDROOMProtocol__UnorderedGroup_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1582:1: ( rule__EDROOMProtocol__UnorderedGroup_5 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1582:2: rule__EDROOMProtocol__UnorderedGroup_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5_in_rule__EDROOMProtocol__Group__5__Impl3141);
            rule__EDROOMProtocol__UnorderedGroup_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__5__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group__6"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1592:1: rule__EDROOMProtocol__Group__6 : rule__EDROOMProtocol__Group__6__Impl rule__EDROOMProtocol__Group__7 ;
    public final void rule__EDROOMProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1596:1: ( rule__EDROOMProtocol__Group__6__Impl rule__EDROOMProtocol__Group__7 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1597:2: rule__EDROOMProtocol__Group__6__Impl rule__EDROOMProtocol__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__6__Impl_in_rule__EDROOMProtocol__Group__63171);
            rule__EDROOMProtocol__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__7_in_rule__EDROOMProtocol__Group__63174);
            rule__EDROOMProtocol__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__6"

    // $ANTLR start "rule__EDROOMProtocol__Group__6__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1604:1: rule__EDROOMProtocol__Group__6__Impl : ( '}' ) ;
    public final void rule__EDROOMProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1608:1: ( ( '}' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1609:1: ( '}' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1609:1: ( '}' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1610:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_6());
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__EDROOMProtocol__Group__6__Impl3202); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_6());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__6__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group__7"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1623:1: rule__EDROOMProtocol__Group__7 : rule__EDROOMProtocol__Group__7__Impl ;
    public final void rule__EDROOMProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1627:1: ( rule__EDROOMProtocol__Group__7__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1628:2: rule__EDROOMProtocol__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group__7__Impl_in_rule__EDROOMProtocol__Group__73233);
            rule__EDROOMProtocol__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__7"

    // $ANTLR start "rule__EDROOMProtocol__Group__7__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1634:1: rule__EDROOMProtocol__Group__7__Impl : ( ';' ) ;
    public final void rule__EDROOMProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1638:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1639:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1639:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1640:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_7());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMProtocol__Group__7__Impl3261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_7());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group__7__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_3__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1669:1: rule__EDROOMProtocol__Group_3__0 : rule__EDROOMProtocol__Group_3__0__Impl rule__EDROOMProtocol__Group_3__1 ;
    public final void rule__EDROOMProtocol__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1673:1: ( rule__EDROOMProtocol__Group_3__0__Impl rule__EDROOMProtocol__Group_3__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1674:2: rule__EDROOMProtocol__Group_3__0__Impl rule__EDROOMProtocol__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3__0__Impl_in_rule__EDROOMProtocol__Group_3__03308);
            rule__EDROOMProtocol__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3__1_in_rule__EDROOMProtocol__Group_3__03311);
            rule__EDROOMProtocol__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3__0"

    // $ANTLR start "rule__EDROOMProtocol__Group_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1681:1: rule__EDROOMProtocol__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EDROOMProtocol__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1685:1: ( ( 'extends' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1686:1: ( 'extends' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1686:1: ( 'extends' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1687:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getExtendsKeyword_3_0());
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__EDROOMProtocol__Group_3__0__Impl3339); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getExtendsKeyword_3_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3__0__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_3__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1700:1: rule__EDROOMProtocol__Group_3__1 : rule__EDROOMProtocol__Group_3__1__Impl rule__EDROOMProtocol__Group_3__2 ;
    public final void rule__EDROOMProtocol__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1704:1: ( rule__EDROOMProtocol__Group_3__1__Impl rule__EDROOMProtocol__Group_3__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1705:2: rule__EDROOMProtocol__Group_3__1__Impl rule__EDROOMProtocol__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3__1__Impl_in_rule__EDROOMProtocol__Group_3__13370);
            rule__EDROOMProtocol__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3__2_in_rule__EDROOMProtocol__Group_3__13373);
            rule__EDROOMProtocol__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3__1"

    // $ANTLR start "rule__EDROOMProtocol__Group_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1712:1: rule__EDROOMProtocol__Group_3__1__Impl : ( ( rule__EDROOMProtocol__ExtendsAssignment_3_1 ) ) ;
    public final void rule__EDROOMProtocol__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1716:1: ( ( ( rule__EDROOMProtocol__ExtendsAssignment_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1717:1: ( ( rule__EDROOMProtocol__ExtendsAssignment_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1717:1: ( ( rule__EDROOMProtocol__ExtendsAssignment_3_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1718:1: ( rule__EDROOMProtocol__ExtendsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getExtendsAssignment_3_1());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1719:1: ( rule__EDROOMProtocol__ExtendsAssignment_3_1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1719:2: rule__EDROOMProtocol__ExtendsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__ExtendsAssignment_3_1_in_rule__EDROOMProtocol__Group_3__1__Impl3400);
            rule__EDROOMProtocol__ExtendsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getExtendsAssignment_3_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3__1__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_3__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1729:1: rule__EDROOMProtocol__Group_3__2 : rule__EDROOMProtocol__Group_3__2__Impl ;
    public final void rule__EDROOMProtocol__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1733:1: ( rule__EDROOMProtocol__Group_3__2__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1734:2: rule__EDROOMProtocol__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3__2__Impl_in_rule__EDROOMProtocol__Group_3__23430);
            rule__EDROOMProtocol__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3__2"

    // $ANTLR start "rule__EDROOMProtocol__Group_3__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1740:1: rule__EDROOMProtocol__Group_3__2__Impl : ( ( rule__EDROOMProtocol__Group_3_2__0 )* ) ;
    public final void rule__EDROOMProtocol__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1744:1: ( ( ( rule__EDROOMProtocol__Group_3_2__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1745:1: ( ( rule__EDROOMProtocol__Group_3_2__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1745:1: ( ( rule__EDROOMProtocol__Group_3_2__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1746:1: ( rule__EDROOMProtocol__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getGroup_3_2());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1747:1: ( rule__EDROOMProtocol__Group_3_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }

                switch (alt12) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1747:2: rule__EDROOMProtocol__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3_2__0_in_rule__EDROOMProtocol__Group_3__2__Impl3457);
            	    rule__EDROOMProtocol__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getGroup_3_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3__2__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_3_2__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1763:1: rule__EDROOMProtocol__Group_3_2__0 : rule__EDROOMProtocol__Group_3_2__0__Impl rule__EDROOMProtocol__Group_3_2__1 ;
    public final void rule__EDROOMProtocol__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1767:1: ( rule__EDROOMProtocol__Group_3_2__0__Impl rule__EDROOMProtocol__Group_3_2__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1768:2: rule__EDROOMProtocol__Group_3_2__0__Impl rule__EDROOMProtocol__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3_2__0__Impl_in_rule__EDROOMProtocol__Group_3_2__03494);
            rule__EDROOMProtocol__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3_2__1_in_rule__EDROOMProtocol__Group_3_2__03497);
            rule__EDROOMProtocol__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3_2__0"

    // $ANTLR start "rule__EDROOMProtocol__Group_3_2__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1775:1: rule__EDROOMProtocol__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EDROOMProtocol__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1779:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1780:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1780:1: ( ',' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1781:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getCommaKeyword_3_2_0());
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__EDROOMProtocol__Group_3_2__0__Impl3525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getCommaKeyword_3_2_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3_2__0__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_3_2__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1794:1: rule__EDROOMProtocol__Group_3_2__1 : rule__EDROOMProtocol__Group_3_2__1__Impl ;
    public final void rule__EDROOMProtocol__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1798:1: ( rule__EDROOMProtocol__Group_3_2__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1799:2: rule__EDROOMProtocol__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_3_2__1__Impl_in_rule__EDROOMProtocol__Group_3_2__13556);
            rule__EDROOMProtocol__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3_2__1"

    // $ANTLR start "rule__EDROOMProtocol__Group_3_2__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1805:1: rule__EDROOMProtocol__Group_3_2__1__Impl : ( ( rule__EDROOMProtocol__ExtendsAssignment_3_2_1 ) ) ;
    public final void rule__EDROOMProtocol__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1809:1: ( ( ( rule__EDROOMProtocol__ExtendsAssignment_3_2_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1810:1: ( ( rule__EDROOMProtocol__ExtendsAssignment_3_2_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1810:1: ( ( rule__EDROOMProtocol__ExtendsAssignment_3_2_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1811:1: ( rule__EDROOMProtocol__ExtendsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getExtendsAssignment_3_2_1());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1812:1: ( rule__EDROOMProtocol__ExtendsAssignment_3_2_1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1812:2: rule__EDROOMProtocol__ExtendsAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__ExtendsAssignment_3_2_1_in_rule__EDROOMProtocol__Group_3_2__1__Impl3583);
            rule__EDROOMProtocol__ExtendsAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getExtendsAssignment_3_2_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_3_2__1__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_0__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1826:1: rule__EDROOMProtocol__Group_5_0__0 : rule__EDROOMProtocol__Group_5_0__0__Impl rule__EDROOMProtocol__Group_5_0__1 ;
    public final void rule__EDROOMProtocol__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1830:1: ( rule__EDROOMProtocol__Group_5_0__0__Impl rule__EDROOMProtocol__Group_5_0__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1831:2: rule__EDROOMProtocol__Group_5_0__0__Impl rule__EDROOMProtocol__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_0__0__Impl_in_rule__EDROOMProtocol__Group_5_0__03617);
            rule__EDROOMProtocol__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_0__1_in_rule__EDROOMProtocol__Group_5_0__03620);
            rule__EDROOMProtocol__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_0__0"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_0__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1838:1: rule__EDROOMProtocol__Group_5_0__0__Impl : ( 'version' ) ;
    public final void rule__EDROOMProtocol__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1842:1: ( ( 'version' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1843:1: ( 'version' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1843:1: ( 'version' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1844:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getVersionKeyword_5_0_0());
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__EDROOMProtocol__Group_5_0__0__Impl3648); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getVersionKeyword_5_0_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_0__0__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_0__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1857:1: rule__EDROOMProtocol__Group_5_0__1 : rule__EDROOMProtocol__Group_5_0__1__Impl rule__EDROOMProtocol__Group_5_0__2 ;
    public final void rule__EDROOMProtocol__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1861:1: ( rule__EDROOMProtocol__Group_5_0__1__Impl rule__EDROOMProtocol__Group_5_0__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1862:2: rule__EDROOMProtocol__Group_5_0__1__Impl rule__EDROOMProtocol__Group_5_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_0__1__Impl_in_rule__EDROOMProtocol__Group_5_0__13679);
            rule__EDROOMProtocol__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_0__2_in_rule__EDROOMProtocol__Group_5_0__13682);
            rule__EDROOMProtocol__Group_5_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_0__1"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_0__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1869:1: rule__EDROOMProtocol__Group_5_0__1__Impl : ( ':=' ) ;
    public final void rule__EDROOMProtocol__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1873:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1874:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1874:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1875:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_0_1());
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__EDROOMProtocol__Group_5_0__1__Impl3710); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_0_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_0__1__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_0__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1888:1: rule__EDROOMProtocol__Group_5_0__2 : rule__EDROOMProtocol__Group_5_0__2__Impl rule__EDROOMProtocol__Group_5_0__3 ;
    public final void rule__EDROOMProtocol__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1892:1: ( rule__EDROOMProtocol__Group_5_0__2__Impl rule__EDROOMProtocol__Group_5_0__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1893:2: rule__EDROOMProtocol__Group_5_0__2__Impl rule__EDROOMProtocol__Group_5_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_0__2__Impl_in_rule__EDROOMProtocol__Group_5_0__23741);
            rule__EDROOMProtocol__Group_5_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_0__3_in_rule__EDROOMProtocol__Group_5_0__23744);
            rule__EDROOMProtocol__Group_5_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_0__2"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_0__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1900:1: rule__EDROOMProtocol__Group_5_0__2__Impl : ( ( rule__EDROOMProtocol__VersionAssignment_5_0_2 ) ) ;
    public final void rule__EDROOMProtocol__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1904:1: ( ( ( rule__EDROOMProtocol__VersionAssignment_5_0_2 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1905:1: ( ( rule__EDROOMProtocol__VersionAssignment_5_0_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1905:1: ( ( rule__EDROOMProtocol__VersionAssignment_5_0_2 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1906:1: ( rule__EDROOMProtocol__VersionAssignment_5_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getVersionAssignment_5_0_2());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1907:1: ( rule__EDROOMProtocol__VersionAssignment_5_0_2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1907:2: rule__EDROOMProtocol__VersionAssignment_5_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__VersionAssignment_5_0_2_in_rule__EDROOMProtocol__Group_5_0__2__Impl3771);
            rule__EDROOMProtocol__VersionAssignment_5_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getVersionAssignment_5_0_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_0__2__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_0__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1917:1: rule__EDROOMProtocol__Group_5_0__3 : rule__EDROOMProtocol__Group_5_0__3__Impl ;
    public final void rule__EDROOMProtocol__Group_5_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1921:1: ( rule__EDROOMProtocol__Group_5_0__3__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1922:2: rule__EDROOMProtocol__Group_5_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_0__3__Impl_in_rule__EDROOMProtocol__Group_5_0__33801);
            rule__EDROOMProtocol__Group_5_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_0__3"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_0__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1928:1: rule__EDROOMProtocol__Group_5_0__3__Impl : ( ';' ) ;
    public final void rule__EDROOMProtocol__Group_5_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1932:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1933:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1933:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1934:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_0_3());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMProtocol__Group_5_0__3__Impl3829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_0_3());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_0__3__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_1__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1955:1: rule__EDROOMProtocol__Group_5_1__0 : rule__EDROOMProtocol__Group_5_1__0__Impl rule__EDROOMProtocol__Group_5_1__1 ;
    public final void rule__EDROOMProtocol__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1959:1: ( rule__EDROOMProtocol__Group_5_1__0__Impl rule__EDROOMProtocol__Group_5_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1960:2: rule__EDROOMProtocol__Group_5_1__0__Impl rule__EDROOMProtocol__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_1__0__Impl_in_rule__EDROOMProtocol__Group_5_1__03868);
            rule__EDROOMProtocol__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_1__1_in_rule__EDROOMProtocol__Group_5_1__03871);
            rule__EDROOMProtocol__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_1__0"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_1__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1967:1: rule__EDROOMProtocol__Group_5_1__0__Impl : ( 'interface' ) ;
    public final void rule__EDROOMProtocol__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1971:1: ( ( 'interface' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1972:1: ( 'interface' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1972:1: ( 'interface' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1973:1: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getInterfaceKeyword_5_1_0());
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__EDROOMProtocol__Group_5_1__0__Impl3899); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getInterfaceKeyword_5_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_1__0__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_1__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1986:1: rule__EDROOMProtocol__Group_5_1__1 : rule__EDROOMProtocol__Group_5_1__1__Impl rule__EDROOMProtocol__Group_5_1__2 ;
    public final void rule__EDROOMProtocol__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1990:1: ( rule__EDROOMProtocol__Group_5_1__1__Impl rule__EDROOMProtocol__Group_5_1__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1991:2: rule__EDROOMProtocol__Group_5_1__1__Impl rule__EDROOMProtocol__Group_5_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_1__1__Impl_in_rule__EDROOMProtocol__Group_5_1__13930);
            rule__EDROOMProtocol__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_1__2_in_rule__EDROOMProtocol__Group_5_1__13933);
            rule__EDROOMProtocol__Group_5_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_1__1"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_1__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:1998:1: rule__EDROOMProtocol__Group_5_1__1__Impl : ( ':=' ) ;
    public final void rule__EDROOMProtocol__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2002:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2003:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2003:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2004:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_1_1());
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__EDROOMProtocol__Group_5_1__1__Impl3961); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_1_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_1__1__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_1__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2017:1: rule__EDROOMProtocol__Group_5_1__2 : rule__EDROOMProtocol__Group_5_1__2__Impl rule__EDROOMProtocol__Group_5_1__3 ;
    public final void rule__EDROOMProtocol__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2021:1: ( rule__EDROOMProtocol__Group_5_1__2__Impl rule__EDROOMProtocol__Group_5_1__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2022:2: rule__EDROOMProtocol__Group_5_1__2__Impl rule__EDROOMProtocol__Group_5_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_1__2__Impl_in_rule__EDROOMProtocol__Group_5_1__23992);
            rule__EDROOMProtocol__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_1__3_in_rule__EDROOMProtocol__Group_5_1__23995);
            rule__EDROOMProtocol__Group_5_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_1__2"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_1__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2029:1: rule__EDROOMProtocol__Group_5_1__2__Impl : ( ( rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2 ) ) ;
    public final void rule__EDROOMProtocol__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2033:1: ( ( ( rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2034:1: ( ( rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2034:1: ( ( rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2035:1: ( rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getReferencedElementAssignment_5_1_2());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2036:1: ( rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2036:2: rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2_in_rule__EDROOMProtocol__Group_5_1__2__Impl4022);
            rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getReferencedElementAssignment_5_1_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_1__2__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_1__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2046:1: rule__EDROOMProtocol__Group_5_1__3 : rule__EDROOMProtocol__Group_5_1__3__Impl ;
    public final void rule__EDROOMProtocol__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2050:1: ( rule__EDROOMProtocol__Group_5_1__3__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2051:2: rule__EDROOMProtocol__Group_5_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_1__3__Impl_in_rule__EDROOMProtocol__Group_5_1__34052);
            rule__EDROOMProtocol__Group_5_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_1__3"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_1__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2057:1: rule__EDROOMProtocol__Group_5_1__3__Impl : ( ';' ) ;
    public final void rule__EDROOMProtocol__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2061:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2062:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2062:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2063:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_1_3());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMProtocol__Group_5_1__3__Impl4080); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_1_3());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_1__3__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2084:1: rule__EDROOMProtocol__Group_5_2__0 : rule__EDROOMProtocol__Group_5_2__0__Impl rule__EDROOMProtocol__Group_5_2__1 ;
    public final void rule__EDROOMProtocol__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2088:1: ( rule__EDROOMProtocol__Group_5_2__0__Impl rule__EDROOMProtocol__Group_5_2__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2089:2: rule__EDROOMProtocol__Group_5_2__0__Impl rule__EDROOMProtocol__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__0__Impl_in_rule__EDROOMProtocol__Group_5_2__04119);
            rule__EDROOMProtocol__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__1_in_rule__EDROOMProtocol__Group_5_2__04122);
            rule__EDROOMProtocol__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__0"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2096:1: rule__EDROOMProtocol__Group_5_2__0__Impl : ( 'input' ) ;
    public final void rule__EDROOMProtocol__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2100:1: ( ( 'input' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2101:1: ( 'input' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2101:1: ( 'input' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2102:1: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getInputKeyword_5_2_0());
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__EDROOMProtocol__Group_5_2__0__Impl4150); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getInputKeyword_5_2_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__0__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2115:1: rule__EDROOMProtocol__Group_5_2__1 : rule__EDROOMProtocol__Group_5_2__1__Impl rule__EDROOMProtocol__Group_5_2__2 ;
    public final void rule__EDROOMProtocol__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2119:1: ( rule__EDROOMProtocol__Group_5_2__1__Impl rule__EDROOMProtocol__Group_5_2__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2120:2: rule__EDROOMProtocol__Group_5_2__1__Impl rule__EDROOMProtocol__Group_5_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__1__Impl_in_rule__EDROOMProtocol__Group_5_2__14181);
            rule__EDROOMProtocol__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__2_in_rule__EDROOMProtocol__Group_5_2__14184);
            rule__EDROOMProtocol__Group_5_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__1"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2127:1: rule__EDROOMProtocol__Group_5_2__1__Impl : ( 'messages' ) ;
    public final void rule__EDROOMProtocol__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2131:1: ( ( 'messages' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2132:1: ( 'messages' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2132:1: ( 'messages' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2133:1: 'messages'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_2_1());
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__EDROOMProtocol__Group_5_2__1__Impl4212); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_2_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__1__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2146:1: rule__EDROOMProtocol__Group_5_2__2 : rule__EDROOMProtocol__Group_5_2__2__Impl rule__EDROOMProtocol__Group_5_2__3 ;
    public final void rule__EDROOMProtocol__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2150:1: ( rule__EDROOMProtocol__Group_5_2__2__Impl rule__EDROOMProtocol__Group_5_2__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2151:2: rule__EDROOMProtocol__Group_5_2__2__Impl rule__EDROOMProtocol__Group_5_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__2__Impl_in_rule__EDROOMProtocol__Group_5_2__24243);
            rule__EDROOMProtocol__Group_5_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__3_in_rule__EDROOMProtocol__Group_5_2__24246);
            rule__EDROOMProtocol__Group_5_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__2"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2158:1: rule__EDROOMProtocol__Group_5_2__2__Impl : ( '{' ) ;
    public final void rule__EDROOMProtocol__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2162:1: ( ( '{' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2163:1: ( '{' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2163:1: ( '{' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2164:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_2_2());
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__EDROOMProtocol__Group_5_2__2__Impl4274); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_2_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__2__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2177:1: rule__EDROOMProtocol__Group_5_2__3 : rule__EDROOMProtocol__Group_5_2__3__Impl rule__EDROOMProtocol__Group_5_2__4 ;
    public final void rule__EDROOMProtocol__Group_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2181:1: ( rule__EDROOMProtocol__Group_5_2__3__Impl rule__EDROOMProtocol__Group_5_2__4 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2182:2: rule__EDROOMProtocol__Group_5_2__3__Impl rule__EDROOMProtocol__Group_5_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__3__Impl_in_rule__EDROOMProtocol__Group_5_2__34305);
            rule__EDROOMProtocol__Group_5_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__4_in_rule__EDROOMProtocol__Group_5_2__34308);
            rule__EDROOMProtocol__Group_5_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__3"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2189:1: rule__EDROOMProtocol__Group_5_2__3__Impl : ( ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 ) ) ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )* ) ) ;
    public final void rule__EDROOMProtocol__Group_5_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2193:1: ( ( ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 ) ) ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )* ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2194:1: ( ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 ) ) ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )* ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2194:1: ( ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 ) ) ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2195:1: ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 ) ) ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2195:1: ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2196:1: ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getInputMessagesAssignment_5_2_3());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2197:1: ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2197:2: rule__EDROOMProtocol__InputMessagesAssignment_5_2_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__InputMessagesAssignment_5_2_3_in_rule__EDROOMProtocol__Group_5_2__3__Impl4337);
            rule__EDROOMProtocol__InputMessagesAssignment_5_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getInputMessagesAssignment_5_2_3());
            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2200:1: ( ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2201:1: ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getInputMessagesAssignment_5_2_3());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2202:1: ( rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=30)||LA13_0==32) ) {
                    alt13=1;
                }

                switch (alt13) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2202:2: rule__EDROOMProtocol__InputMessagesAssignment_5_2_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__InputMessagesAssignment_5_2_3_in_rule__EDROOMProtocol__Group_5_2__3__Impl4349);
            	    rule__EDROOMProtocol__InputMessagesAssignment_5_2_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getInputMessagesAssignment_5_2_3());
            }

            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__3__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2213:1: rule__EDROOMProtocol__Group_5_2__4 : rule__EDROOMProtocol__Group_5_2__4__Impl rule__EDROOMProtocol__Group_5_2__5 ;
    public final void rule__EDROOMProtocol__Group_5_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2217:1: ( rule__EDROOMProtocol__Group_5_2__4__Impl rule__EDROOMProtocol__Group_5_2__5 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2218:2: rule__EDROOMProtocol__Group_5_2__4__Impl rule__EDROOMProtocol__Group_5_2__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__4__Impl_in_rule__EDROOMProtocol__Group_5_2__44382);
            rule__EDROOMProtocol__Group_5_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__5_in_rule__EDROOMProtocol__Group_5_2__44385);
            rule__EDROOMProtocol__Group_5_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__4"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2225:1: rule__EDROOMProtocol__Group_5_2__4__Impl : ( '}' ) ;
    public final void rule__EDROOMProtocol__Group_5_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2229:1: ( ( '}' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2230:1: ( '}' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2230:1: ( '}' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2231:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_2_4());
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__EDROOMProtocol__Group_5_2__4__Impl4413); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_2_4());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__4__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__5"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2244:1: rule__EDROOMProtocol__Group_5_2__5 : rule__EDROOMProtocol__Group_5_2__5__Impl ;
    public final void rule__EDROOMProtocol__Group_5_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2248:1: ( rule__EDROOMProtocol__Group_5_2__5__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2249:2: rule__EDROOMProtocol__Group_5_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__5__Impl_in_rule__EDROOMProtocol__Group_5_2__54444);
            rule__EDROOMProtocol__Group_5_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__5"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_2__5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2255:1: rule__EDROOMProtocol__Group_5_2__5__Impl : ( ';' ) ;
    public final void rule__EDROOMProtocol__Group_5_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2259:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2260:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2260:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2261:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_2_5());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMProtocol__Group_5_2__5__Impl4472); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_2_5());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_2__5__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2286:1: rule__EDROOMProtocol__Group_5_3__0 : rule__EDROOMProtocol__Group_5_3__0__Impl rule__EDROOMProtocol__Group_5_3__1 ;
    public final void rule__EDROOMProtocol__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2290:1: ( rule__EDROOMProtocol__Group_5_3__0__Impl rule__EDROOMProtocol__Group_5_3__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2291:2: rule__EDROOMProtocol__Group_5_3__0__Impl rule__EDROOMProtocol__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__0__Impl_in_rule__EDROOMProtocol__Group_5_3__04515);
            rule__EDROOMProtocol__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__1_in_rule__EDROOMProtocol__Group_5_3__04518);
            rule__EDROOMProtocol__Group_5_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__0"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2298:1: rule__EDROOMProtocol__Group_5_3__0__Impl : ( 'output' ) ;
    public final void rule__EDROOMProtocol__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2302:1: ( ( 'output' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2303:1: ( 'output' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2303:1: ( 'output' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2304:1: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getOutputKeyword_5_3_0());
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__EDROOMProtocol__Group_5_3__0__Impl4546); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getOutputKeyword_5_3_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__0__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2317:1: rule__EDROOMProtocol__Group_5_3__1 : rule__EDROOMProtocol__Group_5_3__1__Impl rule__EDROOMProtocol__Group_5_3__2 ;
    public final void rule__EDROOMProtocol__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2321:1: ( rule__EDROOMProtocol__Group_5_3__1__Impl rule__EDROOMProtocol__Group_5_3__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2322:2: rule__EDROOMProtocol__Group_5_3__1__Impl rule__EDROOMProtocol__Group_5_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__1__Impl_in_rule__EDROOMProtocol__Group_5_3__14577);
            rule__EDROOMProtocol__Group_5_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__2_in_rule__EDROOMProtocol__Group_5_3__14580);
            rule__EDROOMProtocol__Group_5_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__1"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2329:1: rule__EDROOMProtocol__Group_5_3__1__Impl : ( 'messages' ) ;
    public final void rule__EDROOMProtocol__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2333:1: ( ( 'messages' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2334:1: ( 'messages' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2334:1: ( 'messages' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2335:1: 'messages'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_3_1());
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__EDROOMProtocol__Group_5_3__1__Impl4608); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_3_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__1__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2348:1: rule__EDROOMProtocol__Group_5_3__2 : rule__EDROOMProtocol__Group_5_3__2__Impl rule__EDROOMProtocol__Group_5_3__3 ;
    public final void rule__EDROOMProtocol__Group_5_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2352:1: ( rule__EDROOMProtocol__Group_5_3__2__Impl rule__EDROOMProtocol__Group_5_3__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2353:2: rule__EDROOMProtocol__Group_5_3__2__Impl rule__EDROOMProtocol__Group_5_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__2__Impl_in_rule__EDROOMProtocol__Group_5_3__24639);
            rule__EDROOMProtocol__Group_5_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__3_in_rule__EDROOMProtocol__Group_5_3__24642);
            rule__EDROOMProtocol__Group_5_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__2"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2360:1: rule__EDROOMProtocol__Group_5_3__2__Impl : ( '{' ) ;
    public final void rule__EDROOMProtocol__Group_5_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2364:1: ( ( '{' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2365:1: ( '{' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2365:1: ( '{' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2366:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_3_2());
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__EDROOMProtocol__Group_5_3__2__Impl4670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_3_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__2__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2379:1: rule__EDROOMProtocol__Group_5_3__3 : rule__EDROOMProtocol__Group_5_3__3__Impl rule__EDROOMProtocol__Group_5_3__4 ;
    public final void rule__EDROOMProtocol__Group_5_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2383:1: ( rule__EDROOMProtocol__Group_5_3__3__Impl rule__EDROOMProtocol__Group_5_3__4 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2384:2: rule__EDROOMProtocol__Group_5_3__3__Impl rule__EDROOMProtocol__Group_5_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__3__Impl_in_rule__EDROOMProtocol__Group_5_3__34701);
            rule__EDROOMProtocol__Group_5_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__4_in_rule__EDROOMProtocol__Group_5_3__34704);
            rule__EDROOMProtocol__Group_5_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__3"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2391:1: rule__EDROOMProtocol__Group_5_3__3__Impl : ( ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 ) ) ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )* ) ) ;
    public final void rule__EDROOMProtocol__Group_5_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2395:1: ( ( ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 ) ) ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )* ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2396:1: ( ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 ) ) ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )* ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2396:1: ( ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 ) ) ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2397:1: ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 ) ) ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2397:1: ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2398:1: ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesAssignment_5_3_3());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2399:1: ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2399:2: rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3_in_rule__EDROOMProtocol__Group_5_3__3__Impl4733);
            rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesAssignment_5_3_3());
            }

            }

            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2402:1: ( ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2403:1: ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesAssignment_5_3_3());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2404:1: ( rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=30)||LA14_0==32) ) {
                    alt14=1;
                }

                switch (alt14) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2404:2: rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3_in_rule__EDROOMProtocol__Group_5_3__3__Impl4745);
            	    rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesAssignment_5_3_3());
            }

            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__3__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2415:1: rule__EDROOMProtocol__Group_5_3__4 : rule__EDROOMProtocol__Group_5_3__4__Impl rule__EDROOMProtocol__Group_5_3__5 ;
    public final void rule__EDROOMProtocol__Group_5_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2419:1: ( rule__EDROOMProtocol__Group_5_3__4__Impl rule__EDROOMProtocol__Group_5_3__5 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2420:2: rule__EDROOMProtocol__Group_5_3__4__Impl rule__EDROOMProtocol__Group_5_3__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__4__Impl_in_rule__EDROOMProtocol__Group_5_3__44778);
            rule__EDROOMProtocol__Group_5_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__5_in_rule__EDROOMProtocol__Group_5_3__44781);
            rule__EDROOMProtocol__Group_5_3__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__4"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2427:1: rule__EDROOMProtocol__Group_5_3__4__Impl : ( '}' ) ;
    public final void rule__EDROOMProtocol__Group_5_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2431:1: ( ( '}' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2432:1: ( '}' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2432:1: ( '}' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2433:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_3_4());
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__EDROOMProtocol__Group_5_3__4__Impl4809); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_3_4());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__4__Impl"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__5"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2446:1: rule__EDROOMProtocol__Group_5_3__5 : rule__EDROOMProtocol__Group_5_3__5__Impl ;
    public final void rule__EDROOMProtocol__Group_5_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2450:1: ( rule__EDROOMProtocol__Group_5_3__5__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2451:2: rule__EDROOMProtocol__Group_5_3__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__5__Impl_in_rule__EDROOMProtocol__Group_5_3__54840);
            rule__EDROOMProtocol__Group_5_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__5"

    // $ANTLR start "rule__EDROOMProtocol__Group_5_3__5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2457:1: rule__EDROOMProtocol__Group_5_3__5__Impl : ( ';' ) ;
    public final void rule__EDROOMProtocol__Group_5_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2461:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2462:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2462:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2463:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_3_5());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMProtocol__Group_5_3__5__Impl4868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_3_5());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__Group_5_3__5__Impl"

    // $ANTLR start "rule__EDROOMSendMessage__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2488:1: rule__EDROOMSendMessage__Group__0 : rule__EDROOMSendMessage__Group__0__Impl rule__EDROOMSendMessage__Group__1 ;
    public final void rule__EDROOMSendMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2492:1: ( rule__EDROOMSendMessage__Group__0__Impl rule__EDROOMSendMessage__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2493:2: rule__EDROOMSendMessage__Group__0__Impl rule__EDROOMSendMessage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__0__Impl_in_rule__EDROOMSendMessage__Group__04911);
            rule__EDROOMSendMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__1_in_rule__EDROOMSendMessage__Group__04914);
            rule__EDROOMSendMessage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__0"

    // $ANTLR start "rule__EDROOMSendMessage__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2500:1: rule__EDROOMSendMessage__Group__0__Impl : ( () ) ;
    public final void rule__EDROOMSendMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2504:1: ( ( () ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2505:1: ( () )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2505:1: ( () )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2506:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getEDROOMSendMessageAction_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2507:1: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2509:1:
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getEDROOMSendMessageAction_0());
            }

            }

            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__0__Impl"

    // $ANTLR start "rule__EDROOMSendMessage__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2519:1: rule__EDROOMSendMessage__Group__1 : rule__EDROOMSendMessage__Group__1__Impl rule__EDROOMSendMessage__Group__2 ;
    public final void rule__EDROOMSendMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2523:1: ( rule__EDROOMSendMessage__Group__1__Impl rule__EDROOMSendMessage__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2524:2: rule__EDROOMSendMessage__Group__1__Impl rule__EDROOMSendMessage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__1__Impl_in_rule__EDROOMSendMessage__Group__14972);
            rule__EDROOMSendMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__2_in_rule__EDROOMSendMessage__Group__14975);
            rule__EDROOMSendMessage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__1"

    // $ANTLR start "rule__EDROOMSendMessage__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2531:1: rule__EDROOMSendMessage__Group__1__Impl : ( 'send' ) ;
    public final void rule__EDROOMSendMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2535:1: ( ( 'send' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2536:1: ( 'send' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2536:1: ( 'send' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2537:1: 'send'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getSendKeyword_1());
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EDROOMSendMessage__Group__1__Impl5003); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getSendKeyword_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__1__Impl"

    // $ANTLR start "rule__EDROOMSendMessage__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2550:1: rule__EDROOMSendMessage__Group__2 : rule__EDROOMSendMessage__Group__2__Impl rule__EDROOMSendMessage__Group__3 ;
    public final void rule__EDROOMSendMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2554:1: ( rule__EDROOMSendMessage__Group__2__Impl rule__EDROOMSendMessage__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2555:2: rule__EDROOMSendMessage__Group__2__Impl rule__EDROOMSendMessage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__2__Impl_in_rule__EDROOMSendMessage__Group__25034);
            rule__EDROOMSendMessage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__3_in_rule__EDROOMSendMessage__Group__25037);
            rule__EDROOMSendMessage__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__2"

    // $ANTLR start "rule__EDROOMSendMessage__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2562:1: rule__EDROOMSendMessage__Group__2__Impl : ( ( rule__EDROOMSendMessage__NameAssignment_2 ) ) ;
    public final void rule__EDROOMSendMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2566:1: ( ( ( rule__EDROOMSendMessage__NameAssignment_2 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2567:1: ( ( rule__EDROOMSendMessage__NameAssignment_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2567:1: ( ( rule__EDROOMSendMessage__NameAssignment_2 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2568:1: ( rule__EDROOMSendMessage__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getNameAssignment_2());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2569:1: ( rule__EDROOMSendMessage__NameAssignment_2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2569:2: rule__EDROOMSendMessage__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__NameAssignment_2_in_rule__EDROOMSendMessage__Group__2__Impl5064);
            rule__EDROOMSendMessage__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getNameAssignment_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__2__Impl"

    // $ANTLR start "rule__EDROOMSendMessage__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2579:1: rule__EDROOMSendMessage__Group__3 : rule__EDROOMSendMessage__Group__3__Impl rule__EDROOMSendMessage__Group__4 ;
    public final void rule__EDROOMSendMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2583:1: ( rule__EDROOMSendMessage__Group__3__Impl rule__EDROOMSendMessage__Group__4 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2584:2: rule__EDROOMSendMessage__Group__3__Impl rule__EDROOMSendMessage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__3__Impl_in_rule__EDROOMSendMessage__Group__35094);
            rule__EDROOMSendMessage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__4_in_rule__EDROOMSendMessage__Group__35097);
            rule__EDROOMSendMessage__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__3"

    // $ANTLR start "rule__EDROOMSendMessage__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2591:1: rule__EDROOMSendMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__EDROOMSendMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2595:1: ( ( '(' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2596:1: ( '(' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2596:1: ( '(' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2597:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getLeftParenthesisKeyword_3());
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__EDROOMSendMessage__Group__3__Impl5125); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getLeftParenthesisKeyword_3());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__3__Impl"

    // $ANTLR start "rule__EDROOMSendMessage__Group__4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2610:1: rule__EDROOMSendMessage__Group__4 : rule__EDROOMSendMessage__Group__4__Impl rule__EDROOMSendMessage__Group__5 ;
    public final void rule__EDROOMSendMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2614:1: ( rule__EDROOMSendMessage__Group__4__Impl rule__EDROOMSendMessage__Group__5 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2615:2: rule__EDROOMSendMessage__Group__4__Impl rule__EDROOMSendMessage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__4__Impl_in_rule__EDROOMSendMessage__Group__45156);
            rule__EDROOMSendMessage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__5_in_rule__EDROOMSendMessage__Group__45159);
            rule__EDROOMSendMessage__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__4"

    // $ANTLR start "rule__EDROOMSendMessage__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2622:1: rule__EDROOMSendMessage__Group__4__Impl : ( ( rule__EDROOMSendMessage__DataClassAssignment_4 )? ) ;
    public final void rule__EDROOMSendMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2626:1: ( ( ( rule__EDROOMSendMessage__DataClassAssignment_4 )? ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2627:1: ( ( rule__EDROOMSendMessage__DataClassAssignment_4 )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2627:1: ( ( rule__EDROOMSendMessage__DataClassAssignment_4 )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2628:1: ( rule__EDROOMSendMessage__DataClassAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getDataClassAssignment_4());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2629:1: ( rule__EDROOMSendMessage__DataClassAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2629:2: rule__EDROOMSendMessage__DataClassAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__DataClassAssignment_4_in_rule__EDROOMSendMessage__Group__4__Impl5186);
                    rule__EDROOMSendMessage__DataClassAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getDataClassAssignment_4());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__4__Impl"

    // $ANTLR start "rule__EDROOMSendMessage__Group__5"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2639:1: rule__EDROOMSendMessage__Group__5 : rule__EDROOMSendMessage__Group__5__Impl rule__EDROOMSendMessage__Group__6 ;
    public final void rule__EDROOMSendMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2643:1: ( rule__EDROOMSendMessage__Group__5__Impl rule__EDROOMSendMessage__Group__6 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2644:2: rule__EDROOMSendMessage__Group__5__Impl rule__EDROOMSendMessage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__5__Impl_in_rule__EDROOMSendMessage__Group__55217);
            rule__EDROOMSendMessage__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__6_in_rule__EDROOMSendMessage__Group__55220);
            rule__EDROOMSendMessage__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__5"

    // $ANTLR start "rule__EDROOMSendMessage__Group__5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2651:1: rule__EDROOMSendMessage__Group__5__Impl : ( ')' ) ;
    public final void rule__EDROOMSendMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2655:1: ( ( ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2656:1: ( ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2656:1: ( ')' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2657:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getRightParenthesisKeyword_5());
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__EDROOMSendMessage__Group__5__Impl5248); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getRightParenthesisKeyword_5());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__5__Impl"

    // $ANTLR start "rule__EDROOMSendMessage__Group__6"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2670:1: rule__EDROOMSendMessage__Group__6 : rule__EDROOMSendMessage__Group__6__Impl ;
    public final void rule__EDROOMSendMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2674:1: ( rule__EDROOMSendMessage__Group__6__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2675:2: rule__EDROOMSendMessage__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMSendMessage__Group__6__Impl_in_rule__EDROOMSendMessage__Group__65279);
            rule__EDROOMSendMessage__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__6"

    // $ANTLR start "rule__EDROOMSendMessage__Group__6__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2681:1: rule__EDROOMSendMessage__Group__6__Impl : ( ';' ) ;
    public final void rule__EDROOMSendMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2685:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2686:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2686:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2687:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getSemicolonKeyword_6());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMSendMessage__Group__6__Impl5307); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getSemicolonKeyword_6());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__Group__6__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2714:1: rule__EDROOMInvokeMessage__Group__0 : rule__EDROOMInvokeMessage__Group__0__Impl rule__EDROOMInvokeMessage__Group__1 ;
    public final void rule__EDROOMInvokeMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2718:1: ( rule__EDROOMInvokeMessage__Group__0__Impl rule__EDROOMInvokeMessage__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2719:2: rule__EDROOMInvokeMessage__Group__0__Impl rule__EDROOMInvokeMessage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__0__Impl_in_rule__EDROOMInvokeMessage__Group__05352);
            rule__EDROOMInvokeMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__1_in_rule__EDROOMInvokeMessage__Group__05355);
            rule__EDROOMInvokeMessage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__0"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2726:1: rule__EDROOMInvokeMessage__Group__0__Impl : ( () ) ;
    public final void rule__EDROOMInvokeMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2730:1: ( ( () ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2731:1: ( () )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2731:1: ( () )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2732:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getEDROOMInvokeMessageAction_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2733:1: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2735:1:
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getEDROOMInvokeMessageAction_0());
            }

            }

            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__0__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2745:1: rule__EDROOMInvokeMessage__Group__1 : rule__EDROOMInvokeMessage__Group__1__Impl rule__EDROOMInvokeMessage__Group__2 ;
    public final void rule__EDROOMInvokeMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2749:1: ( rule__EDROOMInvokeMessage__Group__1__Impl rule__EDROOMInvokeMessage__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2750:2: rule__EDROOMInvokeMessage__Group__1__Impl rule__EDROOMInvokeMessage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__1__Impl_in_rule__EDROOMInvokeMessage__Group__15413);
            rule__EDROOMInvokeMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__2_in_rule__EDROOMInvokeMessage__Group__15416);
            rule__EDROOMInvokeMessage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__1"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2757:1: rule__EDROOMInvokeMessage__Group__1__Impl : ( 'invoke' ) ;
    public final void rule__EDROOMInvokeMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2761:1: ( ( 'invoke' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2762:1: ( 'invoke' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2762:1: ( 'invoke' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2763:1: 'invoke'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getInvokeKeyword_1());
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EDROOMInvokeMessage__Group__1__Impl5444); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getInvokeKeyword_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__1__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2776:1: rule__EDROOMInvokeMessage__Group__2 : rule__EDROOMInvokeMessage__Group__2__Impl rule__EDROOMInvokeMessage__Group__3 ;
    public final void rule__EDROOMInvokeMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2780:1: ( rule__EDROOMInvokeMessage__Group__2__Impl rule__EDROOMInvokeMessage__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2781:2: rule__EDROOMInvokeMessage__Group__2__Impl rule__EDROOMInvokeMessage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__2__Impl_in_rule__EDROOMInvokeMessage__Group__25475);
            rule__EDROOMInvokeMessage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__3_in_rule__EDROOMInvokeMessage__Group__25478);
            rule__EDROOMInvokeMessage__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__2"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2788:1: rule__EDROOMInvokeMessage__Group__2__Impl : ( ( rule__EDROOMInvokeMessage__NameAssignment_2 ) ) ;
    public final void rule__EDROOMInvokeMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2792:1: ( ( ( rule__EDROOMInvokeMessage__NameAssignment_2 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2793:1: ( ( rule__EDROOMInvokeMessage__NameAssignment_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2793:1: ( ( rule__EDROOMInvokeMessage__NameAssignment_2 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2794:1: ( rule__EDROOMInvokeMessage__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getNameAssignment_2());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2795:1: ( rule__EDROOMInvokeMessage__NameAssignment_2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2795:2: rule__EDROOMInvokeMessage__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__NameAssignment_2_in_rule__EDROOMInvokeMessage__Group__2__Impl5505);
            rule__EDROOMInvokeMessage__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getNameAssignment_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__2__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2805:1: rule__EDROOMInvokeMessage__Group__3 : rule__EDROOMInvokeMessage__Group__3__Impl rule__EDROOMInvokeMessage__Group__4 ;
    public final void rule__EDROOMInvokeMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2809:1: ( rule__EDROOMInvokeMessage__Group__3__Impl rule__EDROOMInvokeMessage__Group__4 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2810:2: rule__EDROOMInvokeMessage__Group__3__Impl rule__EDROOMInvokeMessage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__3__Impl_in_rule__EDROOMInvokeMessage__Group__35535);
            rule__EDROOMInvokeMessage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__4_in_rule__EDROOMInvokeMessage__Group__35538);
            rule__EDROOMInvokeMessage__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__3"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2817:1: rule__EDROOMInvokeMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__EDROOMInvokeMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2821:1: ( ( '(' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2822:1: ( '(' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2822:1: ( '(' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2823:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getLeftParenthesisKeyword_3());
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__EDROOMInvokeMessage__Group__3__Impl5566); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getLeftParenthesisKeyword_3());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__3__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2836:1: rule__EDROOMInvokeMessage__Group__4 : rule__EDROOMInvokeMessage__Group__4__Impl rule__EDROOMInvokeMessage__Group__5 ;
    public final void rule__EDROOMInvokeMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2840:1: ( rule__EDROOMInvokeMessage__Group__4__Impl rule__EDROOMInvokeMessage__Group__5 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2841:2: rule__EDROOMInvokeMessage__Group__4__Impl rule__EDROOMInvokeMessage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__4__Impl_in_rule__EDROOMInvokeMessage__Group__45597);
            rule__EDROOMInvokeMessage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__5_in_rule__EDROOMInvokeMessage__Group__45600);
            rule__EDROOMInvokeMessage__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__4"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2848:1: rule__EDROOMInvokeMessage__Group__4__Impl : ( ( rule__EDROOMInvokeMessage__DataClassAssignment_4 )? ) ;
    public final void rule__EDROOMInvokeMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2852:1: ( ( ( rule__EDROOMInvokeMessage__DataClassAssignment_4 )? ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2853:1: ( ( rule__EDROOMInvokeMessage__DataClassAssignment_4 )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2853:1: ( ( rule__EDROOMInvokeMessage__DataClassAssignment_4 )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2854:1: ( rule__EDROOMInvokeMessage__DataClassAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassAssignment_4());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2855:1: ( rule__EDROOMInvokeMessage__DataClassAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2855:2: rule__EDROOMInvokeMessage__DataClassAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__DataClassAssignment_4_in_rule__EDROOMInvokeMessage__Group__4__Impl5627);
                    rule__EDROOMInvokeMessage__DataClassAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassAssignment_4());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__4__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__5"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2865:1: rule__EDROOMInvokeMessage__Group__5 : rule__EDROOMInvokeMessage__Group__5__Impl rule__EDROOMInvokeMessage__Group__6 ;
    public final void rule__EDROOMInvokeMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2869:1: ( rule__EDROOMInvokeMessage__Group__5__Impl rule__EDROOMInvokeMessage__Group__6 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2870:2: rule__EDROOMInvokeMessage__Group__5__Impl rule__EDROOMInvokeMessage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__5__Impl_in_rule__EDROOMInvokeMessage__Group__55658);
            rule__EDROOMInvokeMessage__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__6_in_rule__EDROOMInvokeMessage__Group__55661);
            rule__EDROOMInvokeMessage__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__5"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2877:1: rule__EDROOMInvokeMessage__Group__5__Impl : ( ')' ) ;
    public final void rule__EDROOMInvokeMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2881:1: ( ( ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2882:1: ( ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2882:1: ( ')' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2883:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getRightParenthesisKeyword_5());
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__EDROOMInvokeMessage__Group__5__Impl5689); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getRightParenthesisKeyword_5());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__5__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__6"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2896:1: rule__EDROOMInvokeMessage__Group__6 : rule__EDROOMInvokeMessage__Group__6__Impl rule__EDROOMInvokeMessage__Group__7 ;
    public final void rule__EDROOMInvokeMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2900:1: ( rule__EDROOMInvokeMessage__Group__6__Impl rule__EDROOMInvokeMessage__Group__7 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2901:2: rule__EDROOMInvokeMessage__Group__6__Impl rule__EDROOMInvokeMessage__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__6__Impl_in_rule__EDROOMInvokeMessage__Group__65720);
            rule__EDROOMInvokeMessage__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__7_in_rule__EDROOMInvokeMessage__Group__65723);
            rule__EDROOMInvokeMessage__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__6"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__6__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2908:1: rule__EDROOMInvokeMessage__Group__6__Impl : ( 'replies' ) ;
    public final void rule__EDROOMInvokeMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2912:1: ( ( 'replies' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2913:1: ( 'replies' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2913:1: ( 'replies' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2914:1: 'replies'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesKeyword_6());
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__EDROOMInvokeMessage__Group__6__Impl5751); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesKeyword_6());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__6__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__7"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2927:1: rule__EDROOMInvokeMessage__Group__7 : rule__EDROOMInvokeMessage__Group__7__Impl rule__EDROOMInvokeMessage__Group__8 ;
    public final void rule__EDROOMInvokeMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2931:1: ( rule__EDROOMInvokeMessage__Group__7__Impl rule__EDROOMInvokeMessage__Group__8 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2932:2: rule__EDROOMInvokeMessage__Group__7__Impl rule__EDROOMInvokeMessage__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__7__Impl_in_rule__EDROOMInvokeMessage__Group__75782);
            rule__EDROOMInvokeMessage__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__8_in_rule__EDROOMInvokeMessage__Group__75785);
            rule__EDROOMInvokeMessage__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__7"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__7__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2939:1: rule__EDROOMInvokeMessage__Group__7__Impl : ( ( rule__EDROOMInvokeMessage__RepliesAssignment_7 ) ) ;
    public final void rule__EDROOMInvokeMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2943:1: ( ( ( rule__EDROOMInvokeMessage__RepliesAssignment_7 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2944:1: ( ( rule__EDROOMInvokeMessage__RepliesAssignment_7 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2944:1: ( ( rule__EDROOMInvokeMessage__RepliesAssignment_7 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2945:1: ( rule__EDROOMInvokeMessage__RepliesAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesAssignment_7());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2946:1: ( rule__EDROOMInvokeMessage__RepliesAssignment_7 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2946:2: rule__EDROOMInvokeMessage__RepliesAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__RepliesAssignment_7_in_rule__EDROOMInvokeMessage__Group__7__Impl5812);
            rule__EDROOMInvokeMessage__RepliesAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesAssignment_7());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__7__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__8"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2956:1: rule__EDROOMInvokeMessage__Group__8 : rule__EDROOMInvokeMessage__Group__8__Impl rule__EDROOMInvokeMessage__Group__9 ;
    public final void rule__EDROOMInvokeMessage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2960:1: ( rule__EDROOMInvokeMessage__Group__8__Impl rule__EDROOMInvokeMessage__Group__9 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2961:2: rule__EDROOMInvokeMessage__Group__8__Impl rule__EDROOMInvokeMessage__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__8__Impl_in_rule__EDROOMInvokeMessage__Group__85842);
            rule__EDROOMInvokeMessage__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__9_in_rule__EDROOMInvokeMessage__Group__85845);
            rule__EDROOMInvokeMessage__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__8"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__8__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2968:1: rule__EDROOMInvokeMessage__Group__8__Impl : ( ( rule__EDROOMInvokeMessage__Group_8__0 )* ) ;
    public final void rule__EDROOMInvokeMessage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2972:1: ( ( ( rule__EDROOMInvokeMessage__Group_8__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2973:1: ( ( rule__EDROOMInvokeMessage__Group_8__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2973:1: ( ( rule__EDROOMInvokeMessage__Group_8__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2974:1: ( rule__EDROOMInvokeMessage__Group_8__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getGroup_8());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2975:1: ( rule__EDROOMInvokeMessage__Group_8__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }

                switch (alt17) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2975:2: rule__EDROOMInvokeMessage__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group_8__0_in_rule__EDROOMInvokeMessage__Group__8__Impl5872);
            	    rule__EDROOMInvokeMessage__Group_8__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getGroup_8());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__8__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__9"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2985:1: rule__EDROOMInvokeMessage__Group__9 : rule__EDROOMInvokeMessage__Group__9__Impl ;
    public final void rule__EDROOMInvokeMessage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2989:1: ( rule__EDROOMInvokeMessage__Group__9__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2990:2: rule__EDROOMInvokeMessage__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group__9__Impl_in_rule__EDROOMInvokeMessage__Group__95903);
            rule__EDROOMInvokeMessage__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__9"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group__9__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:2996:1: rule__EDROOMInvokeMessage__Group__9__Impl : ( ';' ) ;
    public final void rule__EDROOMInvokeMessage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3000:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3001:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3001:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3002:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getSemicolonKeyword_9());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMInvokeMessage__Group__9__Impl5931); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getSemicolonKeyword_9());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group__9__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group_8__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3035:1: rule__EDROOMInvokeMessage__Group_8__0 : rule__EDROOMInvokeMessage__Group_8__0__Impl rule__EDROOMInvokeMessage__Group_8__1 ;
    public final void rule__EDROOMInvokeMessage__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3039:1: ( rule__EDROOMInvokeMessage__Group_8__0__Impl rule__EDROOMInvokeMessage__Group_8__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3040:2: rule__EDROOMInvokeMessage__Group_8__0__Impl rule__EDROOMInvokeMessage__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group_8__0__Impl_in_rule__EDROOMInvokeMessage__Group_8__05982);
            rule__EDROOMInvokeMessage__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group_8__1_in_rule__EDROOMInvokeMessage__Group_8__05985);
            rule__EDROOMInvokeMessage__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group_8__0"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group_8__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3047:1: rule__EDROOMInvokeMessage__Group_8__0__Impl : ( ',' ) ;
    public final void rule__EDROOMInvokeMessage__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3051:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3052:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3052:1: ( ',' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3053:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getCommaKeyword_8_0());
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__EDROOMInvokeMessage__Group_8__0__Impl6013); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getCommaKeyword_8_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group_8__0__Impl"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group_8__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3066:1: rule__EDROOMInvokeMessage__Group_8__1 : rule__EDROOMInvokeMessage__Group_8__1__Impl ;
    public final void rule__EDROOMInvokeMessage__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3070:1: ( rule__EDROOMInvokeMessage__Group_8__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3071:2: rule__EDROOMInvokeMessage__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__Group_8__1__Impl_in_rule__EDROOMInvokeMessage__Group_8__16044);
            rule__EDROOMInvokeMessage__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group_8__1"

    // $ANTLR start "rule__EDROOMInvokeMessage__Group_8__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3077:1: rule__EDROOMInvokeMessage__Group_8__1__Impl : ( ( rule__EDROOMInvokeMessage__RepliesAssignment_8_1 ) ) ;
    public final void rule__EDROOMInvokeMessage__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3081:1: ( ( ( rule__EDROOMInvokeMessage__RepliesAssignment_8_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3082:1: ( ( rule__EDROOMInvokeMessage__RepliesAssignment_8_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3082:1: ( ( rule__EDROOMInvokeMessage__RepliesAssignment_8_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3083:1: ( rule__EDROOMInvokeMessage__RepliesAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesAssignment_8_1());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3084:1: ( rule__EDROOMInvokeMessage__RepliesAssignment_8_1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3084:2: rule__EDROOMInvokeMessage__RepliesAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMInvokeMessage__RepliesAssignment_8_1_in_rule__EDROOMInvokeMessage__Group_8__1__Impl6071);
            rule__EDROOMInvokeMessage__RepliesAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesAssignment_8_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__Group_8__1__Impl"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3098:1: rule__EDROOMReplyMessage__Group__0 : rule__EDROOMReplyMessage__Group__0__Impl rule__EDROOMReplyMessage__Group__1 ;
    public final void rule__EDROOMReplyMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3102:1: ( rule__EDROOMReplyMessage__Group__0__Impl rule__EDROOMReplyMessage__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3103:2: rule__EDROOMReplyMessage__Group__0__Impl rule__EDROOMReplyMessage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__0__Impl_in_rule__EDROOMReplyMessage__Group__06105);
            rule__EDROOMReplyMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__1_in_rule__EDROOMReplyMessage__Group__06108);
            rule__EDROOMReplyMessage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__0"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3110:1: rule__EDROOMReplyMessage__Group__0__Impl : ( () ) ;
    public final void rule__EDROOMReplyMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3114:1: ( ( () ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3115:1: ( () )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3115:1: ( () )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3116:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getEDROOMReplyMessageAction_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3117:1: ()
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3119:1:
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getEDROOMReplyMessageAction_0());
            }

            }

            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__0__Impl"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3129:1: rule__EDROOMReplyMessage__Group__1 : rule__EDROOMReplyMessage__Group__1__Impl rule__EDROOMReplyMessage__Group__2 ;
    public final void rule__EDROOMReplyMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3133:1: ( rule__EDROOMReplyMessage__Group__1__Impl rule__EDROOMReplyMessage__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3134:2: rule__EDROOMReplyMessage__Group__1__Impl rule__EDROOMReplyMessage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__1__Impl_in_rule__EDROOMReplyMessage__Group__16166);
            rule__EDROOMReplyMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__2_in_rule__EDROOMReplyMessage__Group__16169);
            rule__EDROOMReplyMessage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__1"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3141:1: rule__EDROOMReplyMessage__Group__1__Impl : ( 'reply' ) ;
    public final void rule__EDROOMReplyMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3145:1: ( ( 'reply' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3146:1: ( 'reply' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3146:1: ( 'reply' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3147:1: 'reply'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getReplyKeyword_1());
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__EDROOMReplyMessage__Group__1__Impl6197); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getReplyKeyword_1());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__1__Impl"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3160:1: rule__EDROOMReplyMessage__Group__2 : rule__EDROOMReplyMessage__Group__2__Impl rule__EDROOMReplyMessage__Group__3 ;
    public final void rule__EDROOMReplyMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3164:1: ( rule__EDROOMReplyMessage__Group__2__Impl rule__EDROOMReplyMessage__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3165:2: rule__EDROOMReplyMessage__Group__2__Impl rule__EDROOMReplyMessage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__2__Impl_in_rule__EDROOMReplyMessage__Group__26228);
            rule__EDROOMReplyMessage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__3_in_rule__EDROOMReplyMessage__Group__26231);
            rule__EDROOMReplyMessage__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__2"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3172:1: rule__EDROOMReplyMessage__Group__2__Impl : ( ( rule__EDROOMReplyMessage__NameAssignment_2 ) ) ;
    public final void rule__EDROOMReplyMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3176:1: ( ( ( rule__EDROOMReplyMessage__NameAssignment_2 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3177:1: ( ( rule__EDROOMReplyMessage__NameAssignment_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3177:1: ( ( rule__EDROOMReplyMessage__NameAssignment_2 ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3178:1: ( rule__EDROOMReplyMessage__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getNameAssignment_2());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3179:1: ( rule__EDROOMReplyMessage__NameAssignment_2 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3179:2: rule__EDROOMReplyMessage__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__NameAssignment_2_in_rule__EDROOMReplyMessage__Group__2__Impl6258);
            rule__EDROOMReplyMessage__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getNameAssignment_2());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__2__Impl"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3189:1: rule__EDROOMReplyMessage__Group__3 : rule__EDROOMReplyMessage__Group__3__Impl rule__EDROOMReplyMessage__Group__4 ;
    public final void rule__EDROOMReplyMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3193:1: ( rule__EDROOMReplyMessage__Group__3__Impl rule__EDROOMReplyMessage__Group__4 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3194:2: rule__EDROOMReplyMessage__Group__3__Impl rule__EDROOMReplyMessage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__3__Impl_in_rule__EDROOMReplyMessage__Group__36288);
            rule__EDROOMReplyMessage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__4_in_rule__EDROOMReplyMessage__Group__36291);
            rule__EDROOMReplyMessage__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__3"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3201:1: rule__EDROOMReplyMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__EDROOMReplyMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3205:1: ( ( '(' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3206:1: ( '(' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3206:1: ( '(' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3207:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getLeftParenthesisKeyword_3());
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__EDROOMReplyMessage__Group__3__Impl6319); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getLeftParenthesisKeyword_3());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__3__Impl"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3220:1: rule__EDROOMReplyMessage__Group__4 : rule__EDROOMReplyMessage__Group__4__Impl rule__EDROOMReplyMessage__Group__5 ;
    public final void rule__EDROOMReplyMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3224:1: ( rule__EDROOMReplyMessage__Group__4__Impl rule__EDROOMReplyMessage__Group__5 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3225:2: rule__EDROOMReplyMessage__Group__4__Impl rule__EDROOMReplyMessage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__4__Impl_in_rule__EDROOMReplyMessage__Group__46350);
            rule__EDROOMReplyMessage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__5_in_rule__EDROOMReplyMessage__Group__46353);
            rule__EDROOMReplyMessage__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__4"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3232:1: rule__EDROOMReplyMessage__Group__4__Impl : ( ( rule__EDROOMReplyMessage__DataClassAssignment_4 )? ) ;
    public final void rule__EDROOMReplyMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3236:1: ( ( ( rule__EDROOMReplyMessage__DataClassAssignment_4 )? ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3237:1: ( ( rule__EDROOMReplyMessage__DataClassAssignment_4 )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3237:1: ( ( rule__EDROOMReplyMessage__DataClassAssignment_4 )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3238:1: ( rule__EDROOMReplyMessage__DataClassAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getDataClassAssignment_4());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3239:1: ( rule__EDROOMReplyMessage__DataClassAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3239:2: rule__EDROOMReplyMessage__DataClassAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__DataClassAssignment_4_in_rule__EDROOMReplyMessage__Group__4__Impl6380);
                    rule__EDROOMReplyMessage__DataClassAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getDataClassAssignment_4());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__4__Impl"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__5"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3249:1: rule__EDROOMReplyMessage__Group__5 : rule__EDROOMReplyMessage__Group__5__Impl rule__EDROOMReplyMessage__Group__6 ;
    public final void rule__EDROOMReplyMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3253:1: ( rule__EDROOMReplyMessage__Group__5__Impl rule__EDROOMReplyMessage__Group__6 )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3254:2: rule__EDROOMReplyMessage__Group__5__Impl rule__EDROOMReplyMessage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__5__Impl_in_rule__EDROOMReplyMessage__Group__56411);
            rule__EDROOMReplyMessage__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__6_in_rule__EDROOMReplyMessage__Group__56414);
            rule__EDROOMReplyMessage__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__5"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3261:1: rule__EDROOMReplyMessage__Group__5__Impl : ( ')' ) ;
    public final void rule__EDROOMReplyMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3265:1: ( ( ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3266:1: ( ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3266:1: ( ')' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3267:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getRightParenthesisKeyword_5());
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__EDROOMReplyMessage__Group__5__Impl6442); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getRightParenthesisKeyword_5());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__5__Impl"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__6"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3280:1: rule__EDROOMReplyMessage__Group__6 : rule__EDROOMReplyMessage__Group__6__Impl ;
    public final void rule__EDROOMReplyMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3284:1: ( rule__EDROOMReplyMessage__Group__6__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3285:2: rule__EDROOMReplyMessage__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMReplyMessage__Group__6__Impl_in_rule__EDROOMReplyMessage__Group__66473);
            rule__EDROOMReplyMessage__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__6"

    // $ANTLR start "rule__EDROOMReplyMessage__Group__6__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3291:1: rule__EDROOMReplyMessage__Group__6__Impl : ( ';' ) ;
    public final void rule__EDROOMReplyMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3295:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3296:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3296:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3297:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getSemicolonKeyword_6());
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__EDROOMReplyMessage__Group__6__Impl6501); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getSemicolonKeyword_6());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__Group__6__Impl"

    // $ANTLR start "rule__EDROOMProtocol__UnorderedGroup_5"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3325:1: rule__EDROOMProtocol__UnorderedGroup_5 : rule__EDROOMProtocol__UnorderedGroup_5__0 {...}?;
    public final void rule__EDROOMProtocol__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3330:1: ( rule__EDROOMProtocol__UnorderedGroup_5__0 {...}?)
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3331:2: rule__EDROOMProtocol__UnorderedGroup_5__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__0_in_rule__EDROOMProtocol__UnorderedGroup_56547);
            rule__EDROOMProtocol__UnorderedGroup_5__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__EDROOMProtocol__UnorderedGroup_5", "getUnorderedGroupHelper().canLeave(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__UnorderedGroup_5"

    // $ANTLR start "rule__EDROOMProtocol__UnorderedGroup_5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3342:1: rule__EDROOMProtocol__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_3__0 ) ) ) ) ) ;
    public final void rule__EDROOMProtocol__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3347:1: ( ( ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_3__0 ) ) ) ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3348:3: ( ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_3__0 ) ) ) ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3348:3: ( ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_3__0 ) ) ) ) )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( LA19_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1) ) {
                alt19=2;
            }
            else if ( LA19_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2) ) {
                alt19=3;
            }
            else if ( LA19_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3) ) {
                alt19=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3350:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3350:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3351:5: {...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__EDROOMProtocol__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0)");
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3351:111: ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3352:6: ( ( rule__EDROOMProtocol__Group_5_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3358:6: ( ( rule__EDROOMProtocol__Group_5_0__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3360:7: ( rule__EDROOMProtocol__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDROOMProtocolAccess().getGroup_5_0());
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3361:7: ( rule__EDROOMProtocol__Group_5_0__0 )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3361:8: rule__EDROOMProtocol__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_0__0_in_rule__EDROOMProtocol__UnorderedGroup_5__Impl6636);
                    rule__EDROOMProtocol__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDROOMProtocolAccess().getGroup_5_0());
                    }

                    }

                    }

                    }

                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3367:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3367:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3368:5: {...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__EDROOMProtocol__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1)");
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3368:111: ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3369:6: ( ( rule__EDROOMProtocol__Group_5_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3375:6: ( ( rule__EDROOMProtocol__Group_5_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3377:7: ( rule__EDROOMProtocol__Group_5_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDROOMProtocolAccess().getGroup_5_1());
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3378:7: ( rule__EDROOMProtocol__Group_5_1__0 )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3378:8: rule__EDROOMProtocol__Group_5_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_1__0_in_rule__EDROOMProtocol__UnorderedGroup_5__Impl6727);
                    rule__EDROOMProtocol__Group_5_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDROOMProtocolAccess().getGroup_5_1());
                    }

                    }

                    }

                    }

                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3384:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3384:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3385:5: {...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__EDROOMProtocol__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2)");
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3385:111: ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3386:6: ( ( rule__EDROOMProtocol__Group_5_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3392:6: ( ( rule__EDROOMProtocol__Group_5_2__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3394:7: ( rule__EDROOMProtocol__Group_5_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDROOMProtocolAccess().getGroup_5_2());
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3395:7: ( rule__EDROOMProtocol__Group_5_2__0 )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3395:8: rule__EDROOMProtocol__Group_5_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__0_in_rule__EDROOMProtocol__UnorderedGroup_5__Impl6818);
                    rule__EDROOMProtocol__Group_5_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDROOMProtocolAccess().getGroup_5_2());
                    }

                    }

                    }

                    }

                    }
                    break;
                case 4 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3401:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_3__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3401:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_3__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3402:5: {...}? => ( ( ( rule__EDROOMProtocol__Group_5_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__EDROOMProtocol__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3)");
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3402:111: ( ( ( rule__EDROOMProtocol__Group_5_3__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3403:6: ( ( rule__EDROOMProtocol__Group_5_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3409:6: ( ( rule__EDROOMProtocol__Group_5_3__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3411:7: ( rule__EDROOMProtocol__Group_5_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDROOMProtocolAccess().getGroup_5_3());
                    }
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3412:7: ( rule__EDROOMProtocol__Group_5_3__0 )
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3412:8: rule__EDROOMProtocol__Group_5_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_3__0_in_rule__EDROOMProtocol__UnorderedGroup_5__Impl6909);
                    rule__EDROOMProtocol__Group_5_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDROOMProtocolAccess().getGroup_5_3());
                    }

                    }

                    }

                    }

                    }
                    break;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__UnorderedGroup_5__Impl"

    // $ANTLR start "rule__EDROOMProtocol__UnorderedGroup_5__0"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3427:1: rule__EDROOMProtocol__UnorderedGroup_5__0 : rule__EDROOMProtocol__UnorderedGroup_5__Impl ( rule__EDROOMProtocol__UnorderedGroup_5__1 )? ;
    public final void rule__EDROOMProtocol__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3431:1: ( rule__EDROOMProtocol__UnorderedGroup_5__Impl ( rule__EDROOMProtocol__UnorderedGroup_5__1 )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3432:2: rule__EDROOMProtocol__UnorderedGroup_5__Impl ( rule__EDROOMProtocol__UnorderedGroup_5__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__Impl_in_rule__EDROOMProtocol__UnorderedGroup_5__06968);
            rule__EDROOMProtocol__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3433:2: ( rule__EDROOMProtocol__UnorderedGroup_5__1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1) ) {
                alt20=1;
            }
            else if ( LA20_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:0:0: rule__EDROOMProtocol__UnorderedGroup_5__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__1_in_rule__EDROOMProtocol__UnorderedGroup_5__06971);
                    rule__EDROOMProtocol__UnorderedGroup_5__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__UnorderedGroup_5__0"

    // $ANTLR start "rule__EDROOMProtocol__UnorderedGroup_5__1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3440:1: rule__EDROOMProtocol__UnorderedGroup_5__1 : rule__EDROOMProtocol__UnorderedGroup_5__Impl ( rule__EDROOMProtocol__UnorderedGroup_5__2 )? ;
    public final void rule__EDROOMProtocol__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3444:1: ( rule__EDROOMProtocol__UnorderedGroup_5__Impl ( rule__EDROOMProtocol__UnorderedGroup_5__2 )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3445:2: rule__EDROOMProtocol__UnorderedGroup_5__Impl ( rule__EDROOMProtocol__UnorderedGroup_5__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__Impl_in_rule__EDROOMProtocol__UnorderedGroup_5__16996);
            rule__EDROOMProtocol__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3446:2: ( rule__EDROOMProtocol__UnorderedGroup_5__2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:0:0: rule__EDROOMProtocol__UnorderedGroup_5__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__2_in_rule__EDROOMProtocol__UnorderedGroup_5__16999);
                    rule__EDROOMProtocol__UnorderedGroup_5__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__UnorderedGroup_5__1"

    // $ANTLR start "rule__EDROOMProtocol__UnorderedGroup_5__2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3453:1: rule__EDROOMProtocol__UnorderedGroup_5__2 : rule__EDROOMProtocol__UnorderedGroup_5__Impl ( rule__EDROOMProtocol__UnorderedGroup_5__3 )? ;
    public final void rule__EDROOMProtocol__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3457:1: ( rule__EDROOMProtocol__UnorderedGroup_5__Impl ( rule__EDROOMProtocol__UnorderedGroup_5__3 )? )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3458:2: rule__EDROOMProtocol__UnorderedGroup_5__Impl ( rule__EDROOMProtocol__UnorderedGroup_5__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__Impl_in_rule__EDROOMProtocol__UnorderedGroup_5__27024);
            rule__EDROOMProtocol__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3459:2: ( rule__EDROOMProtocol__UnorderedGroup_5__3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2) ) {
                alt22=1;
            }
            else if ( LA22_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:0:0: rule__EDROOMProtocol__UnorderedGroup_5__3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__3_in_rule__EDROOMProtocol__UnorderedGroup_5__27027);
                    rule__EDROOMProtocol__UnorderedGroup_5__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__UnorderedGroup_5__2"

    // $ANTLR start "rule__EDROOMProtocol__UnorderedGroup_5__3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3466:1: rule__EDROOMProtocol__UnorderedGroup_5__3 : rule__EDROOMProtocol__UnorderedGroup_5__Impl ;
    public final void rule__EDROOMProtocol__UnorderedGroup_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3470:1: ( rule__EDROOMProtocol__UnorderedGroup_5__Impl )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3471:2: rule__EDROOMProtocol__UnorderedGroup_5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__Impl_in_rule__EDROOMProtocol__UnorderedGroup_5__37052);
            rule__EDROOMProtocol__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__UnorderedGroup_5__3"

    // $ANTLR start "rule__EDROOMPROTPackageFile__PackageAssignment_1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3486:1: rule__EDROOMPROTPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EDROOMPROTPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3490:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3491:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3491:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3492:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageEDROOMPackageCrossReference_1_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3493:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3494:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageEDROOMPackageQualifiedNameParserRuleCall_1_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__EDROOMPROTPackageFile__PackageAssignment_17092);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageEDROOMPackageQualifiedNameParserRuleCall_1_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageEDROOMPackageCrossReference_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__PackageAssignment_1"

    // $ANTLR start "rule__EDROOMPROTPackageFile__ImportsAssignment_3_1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3505:1: rule__EDROOMPROTPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EDROOMPROTPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3509:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3510:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3510:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3511:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3512:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3513:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__EDROOMPROTPackageFile__ImportsAssignment_3_17131);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__ImportsAssignment_3_1"

    // $ANTLR start "rule__EDROOMPROTPackageFile__ElementAssignment_4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3524:1: rule__EDROOMPROTPackageFile__ElementAssignment_4 : ( ruleEDROOMPROTPackageElement ) ;
    public final void rule__EDROOMPROTPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3528:1: ( ( ruleEDROOMPROTPackageElement ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3529:1: ( ruleEDROOMPROTPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3529:1: ( ruleEDROOMPROTPackageElement )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3530:1: ruleEDROOMPROTPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMPROTPackageFileAccess().getElementEDROOMPROTPackageElementParserRuleCall_4_0());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMPROTPackageElement_in_rule__EDROOMPROTPackageFile__ElementAssignment_47166);
            ruleEDROOMPROTPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMPROTPackageFileAccess().getElementEDROOMPROTPackageElementParserRuleCall_4_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMPROTPackageFile__ElementAssignment_4"

    // $ANTLR start "rule__EDROOMProtocol__NameAssignment_2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3539:1: rule__EDROOMProtocol__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EDROOMProtocol__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3543:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3544:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3544:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3545:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getNameIDTerminalRuleCall_2_0());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EDROOMProtocol__NameAssignment_27197); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getNameIDTerminalRuleCall_2_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__NameAssignment_2"

    // $ANTLR start "rule__EDROOMProtocol__ExtendsAssignment_3_1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3554:1: rule__EDROOMProtocol__ExtendsAssignment_3_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__EDROOMProtocol__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3558:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3559:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3559:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3560:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_1_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3561:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3562:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_1_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMProtocol__ExtendsAssignment_3_17232);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_1_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__ExtendsAssignment_3_1"

    // $ANTLR start "rule__EDROOMProtocol__ExtendsAssignment_3_2_1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3573:1: rule__EDROOMProtocol__ExtendsAssignment_3_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__EDROOMProtocol__ExtendsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3577:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3578:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3578:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3579:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_2_1_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3580:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3581:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_2_1_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMProtocol__ExtendsAssignment_3_2_17271);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_2_1_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_2_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__ExtendsAssignment_3_2_1"

    // $ANTLR start "rule__EDROOMProtocol__VersionAssignment_5_0_2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3592:1: rule__EDROOMProtocol__VersionAssignment_5_0_2 : ( ruleVersion ) ;
    public final void rule__EDROOMProtocol__VersionAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3596:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3597:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3597:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3598:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getVersionVersionParserRuleCall_5_0_2_0());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__EDROOMProtocol__VersionAssignment_5_0_27306);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getVersionVersionParserRuleCall_5_0_2_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__VersionAssignment_5_0_2"

    // $ANTLR start "rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3607:1: rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3611:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3612:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3612:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3613:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getReferencedElementMInterfaceCrossReference_5_1_2_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3614:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3615:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getReferencedElementMInterfaceVersionedQualifiedNameParserRuleCall_5_1_2_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMProtocol__ReferencedElementAssignment_5_1_27341);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getReferencedElementMInterfaceVersionedQualifiedNameParserRuleCall_5_1_2_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getReferencedElementMInterfaceCrossReference_5_1_2_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2"

    // $ANTLR start "rule__EDROOMProtocol__InputMessagesAssignment_5_2_3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3626:1: rule__EDROOMProtocol__InputMessagesAssignment_5_2_3 : ( ruleEDROOMMessage ) ;
    public final void rule__EDROOMProtocol__InputMessagesAssignment_5_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3630:1: ( ( ruleEDROOMMessage ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3631:1: ( ruleEDROOMMessage )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3631:1: ( ruleEDROOMMessage )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3632:1: ruleEDROOMMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getInputMessagesEDROOMMessageParserRuleCall_5_2_3_0());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMMessage_in_rule__EDROOMProtocol__InputMessagesAssignment_5_2_37376);
            ruleEDROOMMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getInputMessagesEDROOMMessageParserRuleCall_5_2_3_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__InputMessagesAssignment_5_2_3"

    // $ANTLR start "rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3641:1: rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3 : ( ruleEDROOMMessage ) ;
    public final void rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3645:1: ( ( ruleEDROOMMessage ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3646:1: ( ruleEDROOMMessage )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3646:1: ( ruleEDROOMMessage )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3647:1: ruleEDROOMMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesEDROOMMessageParserRuleCall_5_3_3_0());
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDROOMMessage_in_rule__EDROOMProtocol__OutputMessagesAssignment_5_3_37407);
            ruleEDROOMMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesEDROOMMessageParserRuleCall_5_3_3_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3"

    // $ANTLR start "rule__EDROOMSendMessage__NameAssignment_2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3656:1: rule__EDROOMSendMessage__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EDROOMSendMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3660:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3661:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3661:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3662:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getNameIDTerminalRuleCall_2_0());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EDROOMSendMessage__NameAssignment_27438); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getNameIDTerminalRuleCall_2_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__NameAssignment_2"

    // $ANTLR start "rule__EDROOMSendMessage__DataClassAssignment_4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3671:1: rule__EDROOMSendMessage__DataClassAssignment_4 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__EDROOMSendMessage__DataClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3675:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3676:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3676:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3677:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3678:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3679:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMSendMessageAccess().getDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMSendMessage__DataClassAssignment_47473);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMSendMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMSendMessage__DataClassAssignment_4"

    // $ANTLR start "rule__EDROOMInvokeMessage__NameAssignment_2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3690:1: rule__EDROOMInvokeMessage__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EDROOMInvokeMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3694:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3695:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3695:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3696:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getNameIDTerminalRuleCall_2_0());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EDROOMInvokeMessage__NameAssignment_27508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getNameIDTerminalRuleCall_2_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__NameAssignment_2"

    // $ANTLR start "rule__EDROOMInvokeMessage__DataClassAssignment_4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3705:1: rule__EDROOMInvokeMessage__DataClassAssignment_4 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__EDROOMInvokeMessage__DataClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3709:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3710:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3710:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3711:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3712:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3713:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMInvokeMessage__DataClassAssignment_47543);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__DataClassAssignment_4"

    // $ANTLR start "rule__EDROOMInvokeMessage__RepliesAssignment_7"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3724:1: rule__EDROOMInvokeMessage__RepliesAssignment_7 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__EDROOMInvokeMessage__RepliesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3728:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3729:1: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3729:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3730:1: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_7_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3731:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3732:1: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_7_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_rule__EDROOMInvokeMessage__RepliesAssignment_77582);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_7_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_7_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__RepliesAssignment_7"

    // $ANTLR start "rule__EDROOMInvokeMessage__RepliesAssignment_8_1"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3743:1: rule__EDROOMInvokeMessage__RepliesAssignment_8_1 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__EDROOMInvokeMessage__RepliesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3747:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3748:1: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3748:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3749:1: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_8_1_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3750:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3751:1: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_8_1_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_rule__EDROOMInvokeMessage__RepliesAssignment_8_17621);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_8_1_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_8_1_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMInvokeMessage__RepliesAssignment_8_1"

    // $ANTLR start "rule__EDROOMReplyMessage__NameAssignment_2"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3762:1: rule__EDROOMReplyMessage__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EDROOMReplyMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3766:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3767:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3767:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3768:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getNameIDTerminalRuleCall_2_0());
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EDROOMReplyMessage__NameAssignment_27656); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getNameIDTerminalRuleCall_2_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__NameAssignment_2"

    // $ANTLR start "rule__EDROOMReplyMessage__DataClassAssignment_4"
    // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3777:1: rule__EDROOMReplyMessage__DataClassAssignment_4 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__EDROOMReplyMessage__DataClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();

        try {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3781:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3782:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3782:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3783:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0());
            }
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3784:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3785:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDROOMReplyMessageAccess().getDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1());
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMReplyMessage__DataClassAssignment_47691);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1());
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDROOMReplyMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0());
            }

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDROOMReplyMessage__DataClassAssignment_4"

    // $ANTLR start synpred20_InternalPROT
    public final void synpred20_InternalPROT_fragment() throws RecognitionException {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3350:4: ( ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3350:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3350:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3351:5: {...}? => ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred20_InternalPROT", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3351:111: ( ( ( rule__EDROOMProtocol__Group_5_0__0 ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3352:6: ( ( rule__EDROOMProtocol__Group_5_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0);
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3358:6: ( ( rule__EDROOMProtocol__Group_5_0__0 ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3360:7: ( rule__EDROOMProtocol__Group_5_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEDROOMProtocolAccess().getGroup_5_0());
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3361:7: ( rule__EDROOMProtocol__Group_5_0__0 )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3361:8: rule__EDROOMProtocol__Group_5_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_0__0_in_synpred20_InternalPROT6636);
        rule__EDROOMProtocol__Group_5_0__0();

        state._fsp--;
        if (state.failed) return ;

        }

        }

        }

        }

        }
    }
    // $ANTLR end synpred20_InternalPROT

    // $ANTLR start synpred21_InternalPROT
    public final void synpred21_InternalPROT_fragment() throws RecognitionException {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3367:4: ( ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3367:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3367:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3368:5: {...}? => ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred21_InternalPROT", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3368:111: ( ( ( rule__EDROOMProtocol__Group_5_1__0 ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3369:6: ( ( rule__EDROOMProtocol__Group_5_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1);
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3375:6: ( ( rule__EDROOMProtocol__Group_5_1__0 ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3377:7: ( rule__EDROOMProtocol__Group_5_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEDROOMProtocolAccess().getGroup_5_1());
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3378:7: ( rule__EDROOMProtocol__Group_5_1__0 )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3378:8: rule__EDROOMProtocol__Group_5_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_1__0_in_synpred21_InternalPROT6727);
        rule__EDROOMProtocol__Group_5_1__0();

        state._fsp--;
        if (state.failed) return ;

        }

        }

        }

        }

        }
    }
    // $ANTLR end synpred21_InternalPROT

    // $ANTLR start synpred22_InternalPROT
    public final void synpred22_InternalPROT_fragment() throws RecognitionException {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3384:4: ( ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3384:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3384:4: ({...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3385:5: {...}? => ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred22_InternalPROT", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2)");
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3385:111: ( ( ( rule__EDROOMProtocol__Group_5_2__0 ) ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3386:6: ( ( rule__EDROOMProtocol__Group_5_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2);
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3392:6: ( ( rule__EDROOMProtocol__Group_5_2__0 ) )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3394:7: ( rule__EDROOMProtocol__Group_5_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEDROOMProtocolAccess().getGroup_5_2());
        }
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3395:7: ( rule__EDROOMProtocol__Group_5_2__0 )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3395:8: rule__EDROOMProtocol__Group_5_2__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__Group_5_2__0_in_synpred22_InternalPROT6818);
        rule__EDROOMProtocol__Group_5_2__0();

        state._fsp--;
        if (state.failed) return ;

        }

        }

        }

        }

        }
    }
    // $ANTLR end synpred22_InternalPROT

    // $ANTLR start synpred23_InternalPROT
    public final void synpred23_InternalPROT_fragment() throws RecognitionException {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3433:2: ( rule__EDROOMProtocol__UnorderedGroup_5__1 )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3433:2: rule__EDROOMProtocol__UnorderedGroup_5__1
        {
        pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__1_in_synpred23_InternalPROT6971);
        rule__EDROOMProtocol__UnorderedGroup_5__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalPROT

    // $ANTLR start synpred24_InternalPROT
    public final void synpred24_InternalPROT_fragment() throws RecognitionException {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3446:2: ( rule__EDROOMProtocol__UnorderedGroup_5__2 )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3446:2: rule__EDROOMProtocol__UnorderedGroup_5__2
        {
        pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__2_in_synpred24_InternalPROT6999);
        rule__EDROOMProtocol__UnorderedGroup_5__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalPROT

    // $ANTLR start synpred25_InternalPROT
    public final void synpred25_InternalPROT_fragment() throws RecognitionException {
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3459:2: ( rule__EDROOMProtocol__UnorderedGroup_5__3 )
        // ../es.uah.aut.srg.micobs.mclev.domain.edroom.editor.prot.ui/src-gen/es/uah/aut/srg/micobs/mclev/domain/edroom/lang/ui/contentassist/antlr/internal/InternalPROT.g:3459:2: rule__EDROOMProtocol__UnorderedGroup_5__3
        {
        pushFollow(FollowSets000.FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__3_in_synpred25_InternalPROT7027);
        rule__EDROOMProtocol__UnorderedGroup_5__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalPROT

    // Delegated rules

    public final boolean synpred25_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalPROT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalPROT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalPROT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalPROT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalPROT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalPROT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalPROT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleEDROOMPROTPackageFile_in_entryRuleEDROOMPROTPackageFile67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMPROTPackageFile74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__0_in_ruleEDROOMPROTPackageFile100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__0_in_ruleVersionedQualifiedName280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__0_in_ruleVersionedQualifiedReferenceName340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMPROTPackageElement_in_entryRuleEDROOMPROTPackageElement367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMPROTPackageElement374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMProtocol_in_ruleEDROOMPROTPackageElement400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMProtocol_in_entryRuleEDROOMProtocol426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMProtocol433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__0_in_ruleEDROOMProtocol459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMMessage_in_entryRuleEDROOMMessage486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMMessage493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMMessage__Alternatives_in_ruleEDROOMMessage519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMSendMessage_in_entryRuleEDROOMSendMessage546 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMSendMessage553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__0_in_ruleEDROOMSendMessage579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMInvokeMessage_in_entryRuleEDROOMInvokeMessage606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMInvokeMessage613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__0_in_ruleEDROOMInvokeMessage639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMReplyMessage_in_entryRuleEDROOMReplyMessage666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDROOMReplyMessage673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__0_in_ruleEDROOMReplyMessage699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_0735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMSendMessage_in_rule__EDROOMMessage__Alternatives835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMInvokeMessage_in_rule__EDROOMMessage__Alternatives852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMReplyMessage_in_rule__EDROOMMessage__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__0__Impl_in_rule__EDROOMPROTPackageFile__Group__0899 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__1_in_rule__EDROOMPROTPackageFile__Group__0902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDROOMPROTPackageFile__Group__0__Impl930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__1__Impl_in_rule__EDROOMPROTPackageFile__Group__1961 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__2_in_rule__EDROOMPROTPackageFile__Group__1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__PackageAssignment_1_in_rule__EDROOMPROTPackageFile__Group__1__Impl991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__2__Impl_in_rule__EDROOMPROTPackageFile__Group__21021 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__3_in_rule__EDROOMPROTPackageFile__Group__21024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMPROTPackageFile__Group__2__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__3__Impl_in_rule__EDROOMPROTPackageFile__Group__31083 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__4_in_rule__EDROOMPROTPackageFile__Group__31086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group_3__0_in_rule__EDROOMPROTPackageFile__Group__3__Impl1113 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group__4__Impl_in_rule__EDROOMPROTPackageFile__Group__41144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__ElementAssignment_4_in_rule__EDROOMPROTPackageFile__Group__4__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group_3__0__Impl_in_rule__EDROOMPROTPackageFile__Group_3__01211 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group_3__1_in_rule__EDROOMPROTPackageFile__Group_3__01214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EDROOMPROTPackageFile__Group_3__0__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group_3__1__Impl_in_rule__EDROOMPROTPackageFile__Group_3__11273 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group_3__2_in_rule__EDROOMPROTPackageFile__Group_3__11276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__ImportsAssignment_3_1_in_rule__EDROOMPROTPackageFile__Group_3__1__Impl1303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMPROTPackageFile__Group_3__2__Impl_in_rule__EDROOMPROTPackageFile__Group_3__21333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMPROTPackageFile__Group_3__2__Impl1361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01398 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1484 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01519 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__01641 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__01644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Alternatives_0_in_rule__Version__Group__0__Impl1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__11701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl1728 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0__Impl_in_rule__Version__Group_0_1__01763 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__1_in_rule__Version__Group_0_1__01766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_0_1__0__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__1__Impl_in_rule__Version__Group_0_1__11825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_0_1__1__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__01885 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__01888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Version__Group_1__0__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__11947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Alternatives_1_1_in_rule__Version__Group_1__1__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__02008 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__02011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__0__Impl2039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__12070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_1_1_1__1__Impl2097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__0__Impl_in_rule__VersionedQualifiedName__Group__02130 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__1_in_rule__VersionedQualifiedName__Group__02133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__VersionedQualifiedName__Group__0__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__1__Impl_in_rule__VersionedQualifiedName__Group__12189 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__2_in_rule__VersionedQualifiedName__Group__12192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__VersionedQualifiedName__Group__1__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__2__Impl_in_rule__VersionedQualifiedName__Group__22251 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__3_in_rule__VersionedQualifiedName__Group__22254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__VersionedQualifiedName__Group__2__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__3__Impl_in_rule__VersionedQualifiedName__Group__32310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__VersionedQualifiedName__Group__3__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__0__Impl_in_rule__VersionedQualifiedReferenceName__Group__02377 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__1_in_rule__VersionedQualifiedReferenceName__Group__02380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__0_in_rule__VersionedQualifiedReferenceName__Group__0__Impl2407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__1__Impl_in_rule__VersionedQualifiedReferenceName__Group__12438 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__2_in_rule__VersionedQualifiedReferenceName__Group__12441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VersionedQualifiedReferenceName__Group__1__Impl2468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__2__Impl_in_rule__VersionedQualifiedReferenceName__Group__22497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__0_in_rule__VersionedQualifiedReferenceName__Group__2__Impl2524 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__0__Impl_in_rule__VersionedQualifiedReferenceName__Group_0__02561 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__1_in_rule__VersionedQualifiedReferenceName__Group_0__02564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__VersionedQualifiedReferenceName__Group_0__0__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__1__Impl_in_rule__VersionedQualifiedReferenceName__Group_0__12620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__VersionedQualifiedReferenceName__Group_0__1__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__0__Impl_in_rule__VersionedQualifiedReferenceName__Group_2__02683 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__1_in_rule__VersionedQualifiedReferenceName__Group_2__02686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__VersionedQualifiedReferenceName__Group_2__0__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__1__Impl_in_rule__VersionedQualifiedReferenceName__Group_2__12745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VersionedQualifiedReferenceName__Group_2__1__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__0__Impl_in_rule__EDROOMProtocol__Group__02805 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__1_in_rule__EDROOMProtocol__Group__02808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__1__Impl_in_rule__EDROOMProtocol__Group__12866 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__2_in_rule__EDROOMProtocol__Group__12869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__EDROOMProtocol__Group__1__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__2__Impl_in_rule__EDROOMProtocol__Group__22928 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__3_in_rule__EDROOMProtocol__Group__22931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__NameAssignment_2_in_rule__EDROOMProtocol__Group__2__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__3__Impl_in_rule__EDROOMProtocol__Group__32988 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__4_in_rule__EDROOMProtocol__Group__32991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3__0_in_rule__EDROOMProtocol__Group__3__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__4__Impl_in_rule__EDROOMProtocol__Group__43049 = new BitSet(new long[]{0x0000000016800000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__5_in_rule__EDROOMProtocol__Group__43052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EDROOMProtocol__Group__4__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__5__Impl_in_rule__EDROOMProtocol__Group__53111 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__6_in_rule__EDROOMProtocol__Group__53114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5_in_rule__EDROOMProtocol__Group__5__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__6__Impl_in_rule__EDROOMProtocol__Group__63171 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__7_in_rule__EDROOMProtocol__Group__63174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EDROOMProtocol__Group__6__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group__7__Impl_in_rule__EDROOMProtocol__Group__73233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMProtocol__Group__7__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3__0__Impl_in_rule__EDROOMProtocol__Group_3__03308 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3__1_in_rule__EDROOMProtocol__Group_3__03311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EDROOMProtocol__Group_3__0__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3__1__Impl_in_rule__EDROOMProtocol__Group_3__13370 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3__2_in_rule__EDROOMProtocol__Group_3__13373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__ExtendsAssignment_3_1_in_rule__EDROOMProtocol__Group_3__1__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3__2__Impl_in_rule__EDROOMProtocol__Group_3__23430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3_2__0_in_rule__EDROOMProtocol__Group_3__2__Impl3457 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3_2__0__Impl_in_rule__EDROOMProtocol__Group_3_2__03494 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3_2__1_in_rule__EDROOMProtocol__Group_3_2__03497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EDROOMProtocol__Group_3_2__0__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_3_2__1__Impl_in_rule__EDROOMProtocol__Group_3_2__13556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__ExtendsAssignment_3_2_1_in_rule__EDROOMProtocol__Group_3_2__1__Impl3583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_0__0__Impl_in_rule__EDROOMProtocol__Group_5_0__03617 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_0__1_in_rule__EDROOMProtocol__Group_5_0__03620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EDROOMProtocol__Group_5_0__0__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_0__1__Impl_in_rule__EDROOMProtocol__Group_5_0__13679 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_0__2_in_rule__EDROOMProtocol__Group_5_0__13682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EDROOMProtocol__Group_5_0__1__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_0__2__Impl_in_rule__EDROOMProtocol__Group_5_0__23741 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_0__3_in_rule__EDROOMProtocol__Group_5_0__23744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__VersionAssignment_5_0_2_in_rule__EDROOMProtocol__Group_5_0__2__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_0__3__Impl_in_rule__EDROOMProtocol__Group_5_0__33801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMProtocol__Group_5_0__3__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_1__0__Impl_in_rule__EDROOMProtocol__Group_5_1__03868 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_1__1_in_rule__EDROOMProtocol__Group_5_1__03871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__EDROOMProtocol__Group_5_1__0__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_1__1__Impl_in_rule__EDROOMProtocol__Group_5_1__13930 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_1__2_in_rule__EDROOMProtocol__Group_5_1__13933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EDROOMProtocol__Group_5_1__1__Impl3961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_1__2__Impl_in_rule__EDROOMProtocol__Group_5_1__23992 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_1__3_in_rule__EDROOMProtocol__Group_5_1__23995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2_in_rule__EDROOMProtocol__Group_5_1__2__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_1__3__Impl_in_rule__EDROOMProtocol__Group_5_1__34052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMProtocol__Group_5_1__3__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__0__Impl_in_rule__EDROOMProtocol__Group_5_2__04119 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__1_in_rule__EDROOMProtocol__Group_5_2__04122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__EDROOMProtocol__Group_5_2__0__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__1__Impl_in_rule__EDROOMProtocol__Group_5_2__14181 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__2_in_rule__EDROOMProtocol__Group_5_2__14184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__EDROOMProtocol__Group_5_2__1__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__2__Impl_in_rule__EDROOMProtocol__Group_5_2__24243 = new BitSet(new long[]{0x0000000160000000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__3_in_rule__EDROOMProtocol__Group_5_2__24246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EDROOMProtocol__Group_5_2__2__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__3__Impl_in_rule__EDROOMProtocol__Group_5_2__34305 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__4_in_rule__EDROOMProtocol__Group_5_2__34308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__InputMessagesAssignment_5_2_3_in_rule__EDROOMProtocol__Group_5_2__3__Impl4337 = new BitSet(new long[]{0x0000000160000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__InputMessagesAssignment_5_2_3_in_rule__EDROOMProtocol__Group_5_2__3__Impl4349 = new BitSet(new long[]{0x0000000160000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__4__Impl_in_rule__EDROOMProtocol__Group_5_2__44382 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__5_in_rule__EDROOMProtocol__Group_5_2__44385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EDROOMProtocol__Group_5_2__4__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__5__Impl_in_rule__EDROOMProtocol__Group_5_2__54444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMProtocol__Group_5_2__5__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__0__Impl_in_rule__EDROOMProtocol__Group_5_3__04515 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__1_in_rule__EDROOMProtocol__Group_5_3__04518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__EDROOMProtocol__Group_5_3__0__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__1__Impl_in_rule__EDROOMProtocol__Group_5_3__14577 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__2_in_rule__EDROOMProtocol__Group_5_3__14580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__EDROOMProtocol__Group_5_3__1__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__2__Impl_in_rule__EDROOMProtocol__Group_5_3__24639 = new BitSet(new long[]{0x0000000160000000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__3_in_rule__EDROOMProtocol__Group_5_3__24642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EDROOMProtocol__Group_5_3__2__Impl4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__3__Impl_in_rule__EDROOMProtocol__Group_5_3__34701 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__4_in_rule__EDROOMProtocol__Group_5_3__34704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3_in_rule__EDROOMProtocol__Group_5_3__3__Impl4733 = new BitSet(new long[]{0x0000000160000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3_in_rule__EDROOMProtocol__Group_5_3__3__Impl4745 = new BitSet(new long[]{0x0000000160000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__4__Impl_in_rule__EDROOMProtocol__Group_5_3__44778 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__5_in_rule__EDROOMProtocol__Group_5_3__44781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EDROOMProtocol__Group_5_3__4__Impl4809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__5__Impl_in_rule__EDROOMProtocol__Group_5_3__54840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMProtocol__Group_5_3__5__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__0__Impl_in_rule__EDROOMSendMessage__Group__04911 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__1_in_rule__EDROOMSendMessage__Group__04914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__1__Impl_in_rule__EDROOMSendMessage__Group__14972 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__2_in_rule__EDROOMSendMessage__Group__14975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EDROOMSendMessage__Group__1__Impl5003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__2__Impl_in_rule__EDROOMSendMessage__Group__25034 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__3_in_rule__EDROOMSendMessage__Group__25037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__NameAssignment_2_in_rule__EDROOMSendMessage__Group__2__Impl5064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__3__Impl_in_rule__EDROOMSendMessage__Group__35094 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__4_in_rule__EDROOMSendMessage__Group__35097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EDROOMSendMessage__Group__3__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__4__Impl_in_rule__EDROOMSendMessage__Group__45156 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__5_in_rule__EDROOMSendMessage__Group__45159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__DataClassAssignment_4_in_rule__EDROOMSendMessage__Group__4__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__5__Impl_in_rule__EDROOMSendMessage__Group__55217 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__6_in_rule__EDROOMSendMessage__Group__55220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EDROOMSendMessage__Group__5__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMSendMessage__Group__6__Impl_in_rule__EDROOMSendMessage__Group__65279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMSendMessage__Group__6__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__0__Impl_in_rule__EDROOMInvokeMessage__Group__05352 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__1_in_rule__EDROOMInvokeMessage__Group__05355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__1__Impl_in_rule__EDROOMInvokeMessage__Group__15413 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__2_in_rule__EDROOMInvokeMessage__Group__15416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EDROOMInvokeMessage__Group__1__Impl5444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__2__Impl_in_rule__EDROOMInvokeMessage__Group__25475 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__3_in_rule__EDROOMInvokeMessage__Group__25478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__NameAssignment_2_in_rule__EDROOMInvokeMessage__Group__2__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__3__Impl_in_rule__EDROOMInvokeMessage__Group__35535 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__4_in_rule__EDROOMInvokeMessage__Group__35538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EDROOMInvokeMessage__Group__3__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__4__Impl_in_rule__EDROOMInvokeMessage__Group__45597 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__5_in_rule__EDROOMInvokeMessage__Group__45600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__DataClassAssignment_4_in_rule__EDROOMInvokeMessage__Group__4__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__5__Impl_in_rule__EDROOMInvokeMessage__Group__55658 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__6_in_rule__EDROOMInvokeMessage__Group__55661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EDROOMInvokeMessage__Group__5__Impl5689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__6__Impl_in_rule__EDROOMInvokeMessage__Group__65720 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__7_in_rule__EDROOMInvokeMessage__Group__65723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EDROOMInvokeMessage__Group__6__Impl5751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__7__Impl_in_rule__EDROOMInvokeMessage__Group__75782 = new BitSet(new long[]{0x0000000000401000L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__8_in_rule__EDROOMInvokeMessage__Group__75785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__RepliesAssignment_7_in_rule__EDROOMInvokeMessage__Group__7__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__8__Impl_in_rule__EDROOMInvokeMessage__Group__85842 = new BitSet(new long[]{0x0000000000401000L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__9_in_rule__EDROOMInvokeMessage__Group__85845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group_8__0_in_rule__EDROOMInvokeMessage__Group__8__Impl5872 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group__9__Impl_in_rule__EDROOMInvokeMessage__Group__95903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMInvokeMessage__Group__9__Impl5931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group_8__0__Impl_in_rule__EDROOMInvokeMessage__Group_8__05982 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group_8__1_in_rule__EDROOMInvokeMessage__Group_8__05985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EDROOMInvokeMessage__Group_8__0__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__Group_8__1__Impl_in_rule__EDROOMInvokeMessage__Group_8__16044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMInvokeMessage__RepliesAssignment_8_1_in_rule__EDROOMInvokeMessage__Group_8__1__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__0__Impl_in_rule__EDROOMReplyMessage__Group__06105 = new BitSet(new long[]{0x0000000160000000L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__1_in_rule__EDROOMReplyMessage__Group__06108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__1__Impl_in_rule__EDROOMReplyMessage__Group__16166 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__2_in_rule__EDROOMReplyMessage__Group__16169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__EDROOMReplyMessage__Group__1__Impl6197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__2__Impl_in_rule__EDROOMReplyMessage__Group__26228 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__3_in_rule__EDROOMReplyMessage__Group__26231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__NameAssignment_2_in_rule__EDROOMReplyMessage__Group__2__Impl6258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__3__Impl_in_rule__EDROOMReplyMessage__Group__36288 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__4_in_rule__EDROOMReplyMessage__Group__36291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__EDROOMReplyMessage__Group__3__Impl6319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__4__Impl_in_rule__EDROOMReplyMessage__Group__46350 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__5_in_rule__EDROOMReplyMessage__Group__46353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__DataClassAssignment_4_in_rule__EDROOMReplyMessage__Group__4__Impl6380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__5__Impl_in_rule__EDROOMReplyMessage__Group__56411 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__6_in_rule__EDROOMReplyMessage__Group__56414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EDROOMReplyMessage__Group__5__Impl6442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMReplyMessage__Group__6__Impl_in_rule__EDROOMReplyMessage__Group__66473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDROOMReplyMessage__Group__6__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__0_in_rule__EDROOMProtocol__UnorderedGroup_56547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_0__0_in_rule__EDROOMProtocol__UnorderedGroup_5__Impl6636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_1__0_in_rule__EDROOMProtocol__UnorderedGroup_5__Impl6727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__0_in_rule__EDROOMProtocol__UnorderedGroup_5__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_3__0_in_rule__EDROOMProtocol__UnorderedGroup_5__Impl6909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__Impl_in_rule__EDROOMProtocol__UnorderedGroup_5__06968 = new BitSet(new long[]{0x0000000016800002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__1_in_rule__EDROOMProtocol__UnorderedGroup_5__06971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__Impl_in_rule__EDROOMProtocol__UnorderedGroup_5__16996 = new BitSet(new long[]{0x0000000016800002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__2_in_rule__EDROOMProtocol__UnorderedGroup_5__16999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__Impl_in_rule__EDROOMProtocol__UnorderedGroup_5__27024 = new BitSet(new long[]{0x0000000016800002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__3_in_rule__EDROOMProtocol__UnorderedGroup_5__27027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__Impl_in_rule__EDROOMProtocol__UnorderedGroup_5__37052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EDROOMPROTPackageFile__PackageAssignment_17092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EDROOMPROTPackageFile__ImportsAssignment_3_17131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMPROTPackageElement_in_rule__EDROOMPROTPackageFile__ElementAssignment_47166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EDROOMProtocol__NameAssignment_27197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMProtocol__ExtendsAssignment_3_17232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMProtocol__ExtendsAssignment_3_2_17271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__EDROOMProtocol__VersionAssignment_5_0_27306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMProtocol__ReferencedElementAssignment_5_1_27341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMMessage_in_rule__EDROOMProtocol__InputMessagesAssignment_5_2_37376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDROOMMessage_in_rule__EDROOMProtocol__OutputMessagesAssignment_5_3_37407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EDROOMSendMessage__NameAssignment_27438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMSendMessage__DataClassAssignment_47473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EDROOMInvokeMessage__NameAssignment_27508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMInvokeMessage__DataClassAssignment_47543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_rule__EDROOMInvokeMessage__RepliesAssignment_77582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_rule__EDROOMInvokeMessage__RepliesAssignment_8_17621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EDROOMReplyMessage__NameAssignment_27656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__EDROOMReplyMessage__DataClassAssignment_47691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_0__0_in_synpred20_InternalPROT6636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_1__0_in_synpred21_InternalPROT6727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__Group_5_2__0_in_synpred22_InternalPROT6818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__1_in_synpred23_InternalPROT6971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__2_in_synpred24_InternalPROT6999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDROOMProtocol__UnorderedGroup_5__3_in_synpred25_InternalPROT7027 = new BitSet(new long[]{0x0000000000000002L});
    }

}
