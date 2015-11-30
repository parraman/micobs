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
package es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import es.uah.aut.srg.micobs.mclev.lang.services.IMAPGrammarAccess;
@SuppressWarnings("all")
public class InternalIMAPParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'mapping'", "'{'", "'}'", "'version'", "':='", "'interfaces'", "','"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
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


        public InternalIMAPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIMAPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIMAPParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g"; }


     
     	private IMAPGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IMAPGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMMCLEVIMAPPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:61:1: entryRuleMMCLEVIMAPPackageFile : ruleMMCLEVIMAPPackageFile EOF ;
    public final void entryRuleMMCLEVIMAPPackageFile() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:62:1: ( ruleMMCLEVIMAPPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:63:1: ruleMMCLEVIMAPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIMAPPackageFile_in_entryRuleMMCLEVIMAPPackageFile67);
            ruleMMCLEVIMAPPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMCLEVIMAPPackageFile74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMCLEVIMAPPackageFile"


    // $ANTLR start "ruleMMCLEVIMAPPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:70:1: ruleMMCLEVIMAPPackageFile : ( ( rule__MMCLEVIMAPPackageFile__Group__0 ) ) ;
    public final void ruleMMCLEVIMAPPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:74:2: ( ( ( rule__MMCLEVIMAPPackageFile__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:75:1: ( ( rule__MMCLEVIMAPPackageFile__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:75:1: ( ( rule__MMCLEVIMAPPackageFile__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:76:1: ( rule__MMCLEVIMAPPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:77:1: ( rule__MMCLEVIMAPPackageFile__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:77:2: rule__MMCLEVIMAPPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__0_in_ruleMMCLEVIMAPPackageFile100);
            rule__MMCLEVIMAPPackageFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getGroup()); 
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
    // $ANTLR end "ruleMMCLEVIMAPPackageFile"


    // $ANTLR start "entryRuleMMCLEVIMAPPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:89:1: entryRuleMMCLEVIMAPPackageElement : ruleMMCLEVIMAPPackageElement EOF ;
    public final void entryRuleMMCLEVIMAPPackageElement() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:90:1: ( ruleMMCLEVIMAPPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:91:1: ruleMMCLEVIMAPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIMAPPackageElement_in_entryRuleMMCLEVIMAPPackageElement127);
            ruleMMCLEVIMAPPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMCLEVIMAPPackageElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMCLEVIMAPPackageElement"


    // $ANTLR start "ruleMMCLEVIMAPPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:98:1: ruleMMCLEVIMAPPackageElement : ( ruleMInterfaceMapping ) ;
    public final void ruleMMCLEVIMAPPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:102:2: ( ( ruleMInterfaceMapping ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:103:1: ( ruleMInterfaceMapping )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:103:1: ( ruleMInterfaceMapping )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:104:1: ruleMInterfaceMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageElementAccess().getMInterfaceMappingParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInterfaceMapping_in_ruleMMCLEVIMAPPackageElement160);
            ruleMInterfaceMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageElementAccess().getMInterfaceMappingParserRuleCall()); 
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
    // $ANTLR end "ruleMMCLEVIMAPPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:118:1: ( ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:119:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName186);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName193); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:133:1: ( rule__QualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:133:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName219);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:145:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:146:1: ( ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:147:1: ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion246);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion253); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:154:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:158:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:159:1: ( ( rule__Version__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:159:1: ( ( rule__Version__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:160:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:161:1: ( rule__Version__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:161:2: rule__Version__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0_in_ruleVersion279);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:173:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:174:1: ( ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:175:1: ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName306);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedName313); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:182:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:186:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:188:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:189:1: ( rule__VersionedQualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:189:2: rule__VersionedQualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__0_in_ruleVersionedQualifiedName339);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:201:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:202:1: ( ruleVersionedQualifiedReferenceName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:203:1: ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName366);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName373); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:210:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:214:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:215:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:215:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:216:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:217:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:217:2: rule__VersionedQualifiedReferenceName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__0_in_ruleVersionedQualifiedReferenceName399);
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


    // $ANTLR start "entryRuleMInterfaceMapping"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:229:1: entryRuleMInterfaceMapping : ruleMInterfaceMapping EOF ;
    public final void entryRuleMInterfaceMapping() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:230:1: ( ruleMInterfaceMapping EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:231:1: ruleMInterfaceMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInterfaceMapping_in_entryRuleMInterfaceMapping426);
            ruleMInterfaceMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMInterfaceMapping433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMInterfaceMapping"


    // $ANTLR start "ruleMInterfaceMapping"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:238:1: ruleMInterfaceMapping : ( ( rule__MInterfaceMapping__Group__0 ) ) ;
    public final void ruleMInterfaceMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:242:2: ( ( ( rule__MInterfaceMapping__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:243:1: ( ( rule__MInterfaceMapping__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:243:1: ( ( rule__MInterfaceMapping__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:244:1: ( rule__MInterfaceMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:245:1: ( rule__MInterfaceMapping__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:245:2: rule__MInterfaceMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__0_in_ruleMInterfaceMapping459);
            rule__MInterfaceMapping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getGroup()); 
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
    // $ANTLR end "ruleMInterfaceMapping"


    // $ANTLR start "rule__Version__Alternatives_0"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:257:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:261:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:262:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:262:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:263:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Alternatives_0495); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:268:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:268:6: ( ( rule__Version__Group_0_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:269:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:270:1: ( rule__Version__Group_0_1__0 )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:270:2: rule__Version__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0512);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:279:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:283:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==12||LA2_1==14||LA2_1==16) ) {
                    alt2=1;
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:284:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:284:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:285:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1545); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:290:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:290:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:291:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:292:1: ( rule__Version__Group_1_1_1__0 )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:292:2: rule__Version__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1562);
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


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:303:1: rule__MMCLEVIMAPPackageFile__Group__0 : rule__MMCLEVIMAPPackageFile__Group__0__Impl rule__MMCLEVIMAPPackageFile__Group__1 ;
    public final void rule__MMCLEVIMAPPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:307:1: ( rule__MMCLEVIMAPPackageFile__Group__0__Impl rule__MMCLEVIMAPPackageFile__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:308:2: rule__MMCLEVIMAPPackageFile__Group__0__Impl rule__MMCLEVIMAPPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__0__Impl_in_rule__MMCLEVIMAPPackageFile__Group__0593);
            rule__MMCLEVIMAPPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__1_in_rule__MMCLEVIMAPPackageFile__Group__0596);
            rule__MMCLEVIMAPPackageFile__Group__1();

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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__0"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:315:1: rule__MMCLEVIMAPPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__MMCLEVIMAPPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:319:1: ( ( 'package' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:320:1: ( 'package' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:320:1: ( 'package' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:321:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageKeyword_0()); 
            }
            match(input,11,FollowSets000.FOLLOW_11_in_rule__MMCLEVIMAPPackageFile__Group__0__Impl624); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__0__Impl"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:334:1: rule__MMCLEVIMAPPackageFile__Group__1 : rule__MMCLEVIMAPPackageFile__Group__1__Impl rule__MMCLEVIMAPPackageFile__Group__2 ;
    public final void rule__MMCLEVIMAPPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:338:1: ( rule__MMCLEVIMAPPackageFile__Group__1__Impl rule__MMCLEVIMAPPackageFile__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:339:2: rule__MMCLEVIMAPPackageFile__Group__1__Impl rule__MMCLEVIMAPPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__1__Impl_in_rule__MMCLEVIMAPPackageFile__Group__1655);
            rule__MMCLEVIMAPPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__2_in_rule__MMCLEVIMAPPackageFile__Group__1658);
            rule__MMCLEVIMAPPackageFile__Group__2();

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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__1"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:346:1: rule__MMCLEVIMAPPackageFile__Group__1__Impl : ( ( rule__MMCLEVIMAPPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__MMCLEVIMAPPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:350:1: ( ( ( rule__MMCLEVIMAPPackageFile__PackageAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:351:1: ( ( rule__MMCLEVIMAPPackageFile__PackageAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:351:1: ( ( rule__MMCLEVIMAPPackageFile__PackageAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:352:1: ( rule__MMCLEVIMAPPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:353:1: ( rule__MMCLEVIMAPPackageFile__PackageAssignment_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:353:2: rule__MMCLEVIMAPPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__PackageAssignment_1_in_rule__MMCLEVIMAPPackageFile__Group__1__Impl685);
            rule__MMCLEVIMAPPackageFile__PackageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageAssignment_1()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__1__Impl"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:363:1: rule__MMCLEVIMAPPackageFile__Group__2 : rule__MMCLEVIMAPPackageFile__Group__2__Impl rule__MMCLEVIMAPPackageFile__Group__3 ;
    public final void rule__MMCLEVIMAPPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:367:1: ( rule__MMCLEVIMAPPackageFile__Group__2__Impl rule__MMCLEVIMAPPackageFile__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:368:2: rule__MMCLEVIMAPPackageFile__Group__2__Impl rule__MMCLEVIMAPPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__2__Impl_in_rule__MMCLEVIMAPPackageFile__Group__2715);
            rule__MMCLEVIMAPPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__3_in_rule__MMCLEVIMAPPackageFile__Group__2718);
            rule__MMCLEVIMAPPackageFile__Group__3();

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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__2"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:375:1: rule__MMCLEVIMAPPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__MMCLEVIMAPPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:379:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:380:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:380:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:381:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getSemicolonKeyword_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MMCLEVIMAPPackageFile__Group__2__Impl746); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__2__Impl"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:394:1: rule__MMCLEVIMAPPackageFile__Group__3 : rule__MMCLEVIMAPPackageFile__Group__3__Impl rule__MMCLEVIMAPPackageFile__Group__4 ;
    public final void rule__MMCLEVIMAPPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:398:1: ( rule__MMCLEVIMAPPackageFile__Group__3__Impl rule__MMCLEVIMAPPackageFile__Group__4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:399:2: rule__MMCLEVIMAPPackageFile__Group__3__Impl rule__MMCLEVIMAPPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__3__Impl_in_rule__MMCLEVIMAPPackageFile__Group__3777);
            rule__MMCLEVIMAPPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__4_in_rule__MMCLEVIMAPPackageFile__Group__3780);
            rule__MMCLEVIMAPPackageFile__Group__4();

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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__3"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:406:1: rule__MMCLEVIMAPPackageFile__Group__3__Impl : ( ( rule__MMCLEVIMAPPackageFile__Group_3__0 )* ) ;
    public final void rule__MMCLEVIMAPPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:410:1: ( ( ( rule__MMCLEVIMAPPackageFile__Group_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:411:1: ( ( rule__MMCLEVIMAPPackageFile__Group_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:411:1: ( ( rule__MMCLEVIMAPPackageFile__Group_3__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:412:1: ( rule__MMCLEVIMAPPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getGroup_3()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:413:1: ( rule__MMCLEVIMAPPackageFile__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:413:2: rule__MMCLEVIMAPPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__0_in_rule__MMCLEVIMAPPackageFile__Group__3__Impl807);
            	    rule__MMCLEVIMAPPackageFile__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getGroup_3()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__3__Impl"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__4"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:423:1: rule__MMCLEVIMAPPackageFile__Group__4 : rule__MMCLEVIMAPPackageFile__Group__4__Impl ;
    public final void rule__MMCLEVIMAPPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:427:1: ( rule__MMCLEVIMAPPackageFile__Group__4__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:428:2: rule__MMCLEVIMAPPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group__4__Impl_in_rule__MMCLEVIMAPPackageFile__Group__4838);
            rule__MMCLEVIMAPPackageFile__Group__4__Impl();

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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__4"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:434:1: rule__MMCLEVIMAPPackageFile__Group__4__Impl : ( ( rule__MMCLEVIMAPPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__MMCLEVIMAPPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:438:1: ( ( ( rule__MMCLEVIMAPPackageFile__ElementAssignment_4 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:439:1: ( ( rule__MMCLEVIMAPPackageFile__ElementAssignment_4 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:439:1: ( ( rule__MMCLEVIMAPPackageFile__ElementAssignment_4 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:440:1: ( rule__MMCLEVIMAPPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getElementAssignment_4()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:441:1: ( rule__MMCLEVIMAPPackageFile__ElementAssignment_4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:441:2: rule__MMCLEVIMAPPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__ElementAssignment_4_in_rule__MMCLEVIMAPPackageFile__Group__4__Impl865);
            rule__MMCLEVIMAPPackageFile__ElementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getElementAssignment_4()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group__4__Impl"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group_3__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:461:1: rule__MMCLEVIMAPPackageFile__Group_3__0 : rule__MMCLEVIMAPPackageFile__Group_3__0__Impl rule__MMCLEVIMAPPackageFile__Group_3__1 ;
    public final void rule__MMCLEVIMAPPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:465:1: ( rule__MMCLEVIMAPPackageFile__Group_3__0__Impl rule__MMCLEVIMAPPackageFile__Group_3__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:466:2: rule__MMCLEVIMAPPackageFile__Group_3__0__Impl rule__MMCLEVIMAPPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__0__Impl_in_rule__MMCLEVIMAPPackageFile__Group_3__0905);
            rule__MMCLEVIMAPPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__1_in_rule__MMCLEVIMAPPackageFile__Group_3__0908);
            rule__MMCLEVIMAPPackageFile__Group_3__1();

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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group_3__0"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:473:1: rule__MMCLEVIMAPPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__MMCLEVIMAPPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:477:1: ( ( 'import' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:478:1: ( 'import' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:478:1: ( 'import' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:479:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportKeyword_3_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MMCLEVIMAPPackageFile__Group_3__0__Impl936); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportKeyword_3_0()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group_3__0__Impl"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group_3__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:492:1: rule__MMCLEVIMAPPackageFile__Group_3__1 : rule__MMCLEVIMAPPackageFile__Group_3__1__Impl rule__MMCLEVIMAPPackageFile__Group_3__2 ;
    public final void rule__MMCLEVIMAPPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:496:1: ( rule__MMCLEVIMAPPackageFile__Group_3__1__Impl rule__MMCLEVIMAPPackageFile__Group_3__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:497:2: rule__MMCLEVIMAPPackageFile__Group_3__1__Impl rule__MMCLEVIMAPPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__1__Impl_in_rule__MMCLEVIMAPPackageFile__Group_3__1967);
            rule__MMCLEVIMAPPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__2_in_rule__MMCLEVIMAPPackageFile__Group_3__1970);
            rule__MMCLEVIMAPPackageFile__Group_3__2();

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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group_3__1"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:504:1: rule__MMCLEVIMAPPackageFile__Group_3__1__Impl : ( ( rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__MMCLEVIMAPPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:508:1: ( ( ( rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:509:1: ( ( rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:509:1: ( ( rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:510:1: ( rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsAssignment_3_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:511:1: ( rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:511:2: rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1_in_rule__MMCLEVIMAPPackageFile__Group_3__1__Impl997);
            rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsAssignment_3_1()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group_3__1__Impl"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group_3__2"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:521:1: rule__MMCLEVIMAPPackageFile__Group_3__2 : rule__MMCLEVIMAPPackageFile__Group_3__2__Impl ;
    public final void rule__MMCLEVIMAPPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:525:1: ( rule__MMCLEVIMAPPackageFile__Group_3__2__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:526:2: rule__MMCLEVIMAPPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__2__Impl_in_rule__MMCLEVIMAPPackageFile__Group_3__21027);
            rule__MMCLEVIMAPPackageFile__Group_3__2__Impl();

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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group_3__2"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__Group_3__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:532:1: rule__MMCLEVIMAPPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MMCLEVIMAPPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:536:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:537:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:537:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:538:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MMCLEVIMAPPackageFile__Group_3__2__Impl1055); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getSemicolonKeyword_3_2()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:557:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:561:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:562:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01092);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01095);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:569:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:573:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:574:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:574:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:575:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1122); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:586:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:590:1: ( rule__QualifiedName__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:591:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11151);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:597:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:601:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:602:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:602:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:603:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:604:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:604:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1178);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:618:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:622:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:623:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01213);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01216);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:630:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:634:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:635:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:635:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:636:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1244); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:649:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:653:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:654:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11275);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:660:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:664:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:665:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:665:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:666:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1302); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:681:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:685:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:686:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__01335);
            rule__Version__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1_in_rule__Version__Group__01338);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:693:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:697:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:698:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:698:1: ( ( rule__Version__Alternatives_0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:699:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:700:1: ( rule__Version__Alternatives_0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:700:2: rule__Version__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Alternatives_0_in_rule__Version__Group__0__Impl1365);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:710:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:714:1: ( rule__Version__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:715:2: rule__Version__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__11395);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:721:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:725:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:726:1: ( ( rule__Version__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:726:1: ( ( rule__Version__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:727:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:728:1: ( rule__Version__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:728:2: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl1422);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:742:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:746:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:747:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__0__Impl_in_rule__Version__Group_0_1__01457);
            rule__Version__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__1_in_rule__Version__Group_0_1__01460);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:754:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:758:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:759:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:759:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:760:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:761:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:761:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Group_0_1__0__Impl1488); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:771:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:775:1: ( rule__Version__Group_0_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:776:2: rule__Version__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__1__Impl_in_rule__Version__Group_0_1__11519);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:782:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:786:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:787:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:787:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:788:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Version__Group_0_1__1__Impl1546); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:803:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:807:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:808:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__01579);
            rule__Version__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__01582);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:815:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:819:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:820:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:820:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:821:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Version__Group_1__0__Impl1610); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:834:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:838:1: ( rule__Version__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:839:2: rule__Version__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__11641);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:845:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:849:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:850:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:850:1: ( ( rule__Version__Alternatives_1_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:851:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:852:1: ( rule__Version__Alternatives_1_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:852:2: rule__Version__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Alternatives_1_1_in_rule__Version__Group_1__1__Impl1668);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:866:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:870:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:871:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__01702);
            rule__Version__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__01705);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:878:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:882:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:883:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:883:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:884:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:885:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:885:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__0__Impl1733); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:895:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:899:1: ( rule__Version__Group_1_1_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:900:2: rule__Version__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__11764);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:906:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:910:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:911:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:911:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:912:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Version__Group_1_1_1__1__Impl1791); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:927:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:931:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:932:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__0__Impl_in_rule__VersionedQualifiedName__Group__01824);
            rule__VersionedQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__1_in_rule__VersionedQualifiedName__Group__01827);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:939:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:943:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:944:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:944:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:945:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__VersionedQualifiedName__Group__0__Impl1854);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:956:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:960:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:961:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__1__Impl_in_rule__VersionedQualifiedName__Group__11883);
            rule__VersionedQualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__2_in_rule__VersionedQualifiedName__Group__11886);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:968:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:972:1: ( ( '(' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:973:1: ( '(' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:973:1: ( '(' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:974:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__VersionedQualifiedName__Group__1__Impl1914); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:987:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:991:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:992:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__2__Impl_in_rule__VersionedQualifiedName__Group__21945);
            rule__VersionedQualifiedName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__3_in_rule__VersionedQualifiedName__Group__21948);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:999:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1003:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1004:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1004:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1005:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__VersionedQualifiedName__Group__2__Impl1975);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1016:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1020:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1021:2: rule__VersionedQualifiedName__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__3__Impl_in_rule__VersionedQualifiedName__Group__32004);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1027:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1031:1: ( ( ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1032:1: ( ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1032:1: ( ')' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1033:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__VersionedQualifiedName__Group__3__Impl2032); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1054:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1058:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1059:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__0__Impl_in_rule__VersionedQualifiedReferenceName__Group__02071);
            rule__VersionedQualifiedReferenceName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__1_in_rule__VersionedQualifiedReferenceName__Group__02074);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1066:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1070:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1071:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1071:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1072:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1073:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1073:2: rule__VersionedQualifiedReferenceName__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__0_in_rule__VersionedQualifiedReferenceName__Group__0__Impl2101);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1083:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1087:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1088:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__1__Impl_in_rule__VersionedQualifiedReferenceName__Group__12132);
            rule__VersionedQualifiedReferenceName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__2_in_rule__VersionedQualifiedReferenceName__Group__12135);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1095:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1099:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1100:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1100:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1101:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VersionedQualifiedReferenceName__Group__1__Impl2162); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1112:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1116:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1117:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group__2__Impl_in_rule__VersionedQualifiedReferenceName__Group__22191);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1123:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1127:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1128:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1128:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1129:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1130:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1130:2: rule__VersionedQualifiedReferenceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__0_in_rule__VersionedQualifiedReferenceName__Group__2__Impl2218);
            	    rule__VersionedQualifiedReferenceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1146:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1150:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1151:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__0__Impl_in_rule__VersionedQualifiedReferenceName__Group_0__02255);
            rule__VersionedQualifiedReferenceName__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__1_in_rule__VersionedQualifiedReferenceName__Group_0__02258);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1158:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1162:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1163:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1163:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1164:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__VersionedQualifiedReferenceName__Group_0__0__Impl2285);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1175:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1179:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1180:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__1__Impl_in_rule__VersionedQualifiedReferenceName__Group_0__12314);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1186:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1190:1: ( ( '::' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1191:1: ( '::' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1191:1: ( '::' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1192:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__VersionedQualifiedReferenceName__Group_0__1__Impl2342); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1209:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1213:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1214:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__0__Impl_in_rule__VersionedQualifiedReferenceName__Group_2__02377);
            rule__VersionedQualifiedReferenceName__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__1_in_rule__VersionedQualifiedReferenceName__Group_2__02380);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1221:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1225:1: ( ( '::' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1226:1: ( '::' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1226:1: ( '::' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1227:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__VersionedQualifiedReferenceName__Group_2__0__Impl2408); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1240:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1244:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1245:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__1__Impl_in_rule__VersionedQualifiedReferenceName__Group_2__12439);
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
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1251:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1255:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1256:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1256:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1257:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VersionedQualifiedReferenceName__Group_2__1__Impl2466); if (state.failed) return ;
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


    // $ANTLR start "rule__MInterfaceMapping__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1272:1: rule__MInterfaceMapping__Group__0 : rule__MInterfaceMapping__Group__0__Impl rule__MInterfaceMapping__Group__1 ;
    public final void rule__MInterfaceMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1276:1: ( rule__MInterfaceMapping__Group__0__Impl rule__MInterfaceMapping__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1277:2: rule__MInterfaceMapping__Group__0__Impl rule__MInterfaceMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__0__Impl_in_rule__MInterfaceMapping__Group__02499);
            rule__MInterfaceMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__1_in_rule__MInterfaceMapping__Group__02502);
            rule__MInterfaceMapping__Group__1();

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
    // $ANTLR end "rule__MInterfaceMapping__Group__0"


    // $ANTLR start "rule__MInterfaceMapping__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1284:1: rule__MInterfaceMapping__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__MInterfaceMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1288:1: ( ( 'mapping' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1289:1: ( 'mapping' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1289:1: ( 'mapping' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1290:1: 'mapping'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getMappingKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MInterfaceMapping__Group__0__Impl2530); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getMappingKeyword_0()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group__0__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1303:1: rule__MInterfaceMapping__Group__1 : rule__MInterfaceMapping__Group__1__Impl rule__MInterfaceMapping__Group__2 ;
    public final void rule__MInterfaceMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1307:1: ( rule__MInterfaceMapping__Group__1__Impl rule__MInterfaceMapping__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1308:2: rule__MInterfaceMapping__Group__1__Impl rule__MInterfaceMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__1__Impl_in_rule__MInterfaceMapping__Group__12561);
            rule__MInterfaceMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__2_in_rule__MInterfaceMapping__Group__12564);
            rule__MInterfaceMapping__Group__2();

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
    // $ANTLR end "rule__MInterfaceMapping__Group__1"


    // $ANTLR start "rule__MInterfaceMapping__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1315:1: rule__MInterfaceMapping__Group__1__Impl : ( ( rule__MInterfaceMapping__DomainAssignment_1 ) ) ;
    public final void rule__MInterfaceMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1319:1: ( ( ( rule__MInterfaceMapping__DomainAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1320:1: ( ( rule__MInterfaceMapping__DomainAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1320:1: ( ( rule__MInterfaceMapping__DomainAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1321:1: ( rule__MInterfaceMapping__DomainAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getDomainAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1322:1: ( rule__MInterfaceMapping__DomainAssignment_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1322:2: rule__MInterfaceMapping__DomainAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__DomainAssignment_1_in_rule__MInterfaceMapping__Group__1__Impl2591);
            rule__MInterfaceMapping__DomainAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getDomainAssignment_1()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group__1__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1332:1: rule__MInterfaceMapping__Group__2 : rule__MInterfaceMapping__Group__2__Impl rule__MInterfaceMapping__Group__3 ;
    public final void rule__MInterfaceMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1336:1: ( rule__MInterfaceMapping__Group__2__Impl rule__MInterfaceMapping__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1337:2: rule__MInterfaceMapping__Group__2__Impl rule__MInterfaceMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__2__Impl_in_rule__MInterfaceMapping__Group__22621);
            rule__MInterfaceMapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__3_in_rule__MInterfaceMapping__Group__22624);
            rule__MInterfaceMapping__Group__3();

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
    // $ANTLR end "rule__MInterfaceMapping__Group__2"


    // $ANTLR start "rule__MInterfaceMapping__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1344:1: rule__MInterfaceMapping__Group__2__Impl : ( '::' ) ;
    public final void rule__MInterfaceMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1348:1: ( ( '::' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1349:1: ( '::' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1349:1: ( '::' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1350:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getColonColonKeyword_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MInterfaceMapping__Group__2__Impl2652); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getColonColonKeyword_2()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group__2__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1363:1: rule__MInterfaceMapping__Group__3 : rule__MInterfaceMapping__Group__3__Impl rule__MInterfaceMapping__Group__4 ;
    public final void rule__MInterfaceMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1367:1: ( rule__MInterfaceMapping__Group__3__Impl rule__MInterfaceMapping__Group__4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1368:2: rule__MInterfaceMapping__Group__3__Impl rule__MInterfaceMapping__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__3__Impl_in_rule__MInterfaceMapping__Group__32683);
            rule__MInterfaceMapping__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__4_in_rule__MInterfaceMapping__Group__32686);
            rule__MInterfaceMapping__Group__4();

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
    // $ANTLR end "rule__MInterfaceMapping__Group__3"


    // $ANTLR start "rule__MInterfaceMapping__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1375:1: rule__MInterfaceMapping__Group__3__Impl : ( ( rule__MInterfaceMapping__TypeAssignment_3 ) ) ;
    public final void rule__MInterfaceMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1379:1: ( ( ( rule__MInterfaceMapping__TypeAssignment_3 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1380:1: ( ( rule__MInterfaceMapping__TypeAssignment_3 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1380:1: ( ( rule__MInterfaceMapping__TypeAssignment_3 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1381:1: ( rule__MInterfaceMapping__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getTypeAssignment_3()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1382:1: ( rule__MInterfaceMapping__TypeAssignment_3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1382:2: rule__MInterfaceMapping__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__TypeAssignment_3_in_rule__MInterfaceMapping__Group__3__Impl2713);
            rule__MInterfaceMapping__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group__3__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group__4"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1392:1: rule__MInterfaceMapping__Group__4 : rule__MInterfaceMapping__Group__4__Impl rule__MInterfaceMapping__Group__5 ;
    public final void rule__MInterfaceMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1396:1: ( rule__MInterfaceMapping__Group__4__Impl rule__MInterfaceMapping__Group__5 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1397:2: rule__MInterfaceMapping__Group__4__Impl rule__MInterfaceMapping__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__4__Impl_in_rule__MInterfaceMapping__Group__42743);
            rule__MInterfaceMapping__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__5_in_rule__MInterfaceMapping__Group__42746);
            rule__MInterfaceMapping__Group__5();

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
    // $ANTLR end "rule__MInterfaceMapping__Group__4"


    // $ANTLR start "rule__MInterfaceMapping__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1404:1: rule__MInterfaceMapping__Group__4__Impl : ( ( rule__MInterfaceMapping__NameAssignment_4 ) ) ;
    public final void rule__MInterfaceMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1408:1: ( ( ( rule__MInterfaceMapping__NameAssignment_4 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1409:1: ( ( rule__MInterfaceMapping__NameAssignment_4 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1409:1: ( ( rule__MInterfaceMapping__NameAssignment_4 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1410:1: ( rule__MInterfaceMapping__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getNameAssignment_4()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1411:1: ( rule__MInterfaceMapping__NameAssignment_4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1411:2: rule__MInterfaceMapping__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__NameAssignment_4_in_rule__MInterfaceMapping__Group__4__Impl2773);
            rule__MInterfaceMapping__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getNameAssignment_4()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group__4__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group__5"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1421:1: rule__MInterfaceMapping__Group__5 : rule__MInterfaceMapping__Group__5__Impl rule__MInterfaceMapping__Group__6 ;
    public final void rule__MInterfaceMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1425:1: ( rule__MInterfaceMapping__Group__5__Impl rule__MInterfaceMapping__Group__6 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1426:2: rule__MInterfaceMapping__Group__5__Impl rule__MInterfaceMapping__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__5__Impl_in_rule__MInterfaceMapping__Group__52803);
            rule__MInterfaceMapping__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__6_in_rule__MInterfaceMapping__Group__52806);
            rule__MInterfaceMapping__Group__6();

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
    // $ANTLR end "rule__MInterfaceMapping__Group__5"


    // $ANTLR start "rule__MInterfaceMapping__Group__5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1433:1: rule__MInterfaceMapping__Group__5__Impl : ( '{' ) ;
    public final void rule__MInterfaceMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1437:1: ( ( '{' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1438:1: ( '{' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1438:1: ( '{' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1439:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MInterfaceMapping__Group__5__Impl2834); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group__5__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group__6"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1452:1: rule__MInterfaceMapping__Group__6 : rule__MInterfaceMapping__Group__6__Impl rule__MInterfaceMapping__Group__7 ;
    public final void rule__MInterfaceMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1456:1: ( rule__MInterfaceMapping__Group__6__Impl rule__MInterfaceMapping__Group__7 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1457:2: rule__MInterfaceMapping__Group__6__Impl rule__MInterfaceMapping__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__6__Impl_in_rule__MInterfaceMapping__Group__62865);
            rule__MInterfaceMapping__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__7_in_rule__MInterfaceMapping__Group__62868);
            rule__MInterfaceMapping__Group__7();

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
    // $ANTLR end "rule__MInterfaceMapping__Group__6"


    // $ANTLR start "rule__MInterfaceMapping__Group__6__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1464:1: rule__MInterfaceMapping__Group__6__Impl : ( ( rule__MInterfaceMapping__UnorderedGroup_6 ) ) ;
    public final void rule__MInterfaceMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1468:1: ( ( ( rule__MInterfaceMapping__UnorderedGroup_6 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1469:1: ( ( rule__MInterfaceMapping__UnorderedGroup_6 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1469:1: ( ( rule__MInterfaceMapping__UnorderedGroup_6 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1470:1: ( rule__MInterfaceMapping__UnorderedGroup_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1471:1: ( rule__MInterfaceMapping__UnorderedGroup_6 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1471:2: rule__MInterfaceMapping__UnorderedGroup_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6_in_rule__MInterfaceMapping__Group__6__Impl2895);
            rule__MInterfaceMapping__UnorderedGroup_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group__6__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group__7"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1481:1: rule__MInterfaceMapping__Group__7 : rule__MInterfaceMapping__Group__7__Impl rule__MInterfaceMapping__Group__8 ;
    public final void rule__MInterfaceMapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1485:1: ( rule__MInterfaceMapping__Group__7__Impl rule__MInterfaceMapping__Group__8 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1486:2: rule__MInterfaceMapping__Group__7__Impl rule__MInterfaceMapping__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__7__Impl_in_rule__MInterfaceMapping__Group__72925);
            rule__MInterfaceMapping__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__8_in_rule__MInterfaceMapping__Group__72928);
            rule__MInterfaceMapping__Group__8();

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
    // $ANTLR end "rule__MInterfaceMapping__Group__7"


    // $ANTLR start "rule__MInterfaceMapping__Group__7__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1493:1: rule__MInterfaceMapping__Group__7__Impl : ( '}' ) ;
    public final void rule__MInterfaceMapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1497:1: ( ( '}' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1498:1: ( '}' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1498:1: ( '}' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1499:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MInterfaceMapping__Group__7__Impl2956); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group__7__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group__8"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1512:1: rule__MInterfaceMapping__Group__8 : rule__MInterfaceMapping__Group__8__Impl ;
    public final void rule__MInterfaceMapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1516:1: ( rule__MInterfaceMapping__Group__8__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1517:2: rule__MInterfaceMapping__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group__8__Impl_in_rule__MInterfaceMapping__Group__82987);
            rule__MInterfaceMapping__Group__8__Impl();

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
    // $ANTLR end "rule__MInterfaceMapping__Group__8"


    // $ANTLR start "rule__MInterfaceMapping__Group__8__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1523:1: rule__MInterfaceMapping__Group__8__Impl : ( ';' ) ;
    public final void rule__MInterfaceMapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1527:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1528:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1528:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1529:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_8()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MInterfaceMapping__Group__8__Impl3015); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_8()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group__8__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_0__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1560:1: rule__MInterfaceMapping__Group_6_0__0 : rule__MInterfaceMapping__Group_6_0__0__Impl rule__MInterfaceMapping__Group_6_0__1 ;
    public final void rule__MInterfaceMapping__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1564:1: ( rule__MInterfaceMapping__Group_6_0__0__Impl rule__MInterfaceMapping__Group_6_0__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1565:2: rule__MInterfaceMapping__Group_6_0__0__Impl rule__MInterfaceMapping__Group_6_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_0__0__Impl_in_rule__MInterfaceMapping__Group_6_0__03064);
            rule__MInterfaceMapping__Group_6_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_0__1_in_rule__MInterfaceMapping__Group_6_0__03067);
            rule__MInterfaceMapping__Group_6_0__1();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_0__0"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_0__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1572:1: rule__MInterfaceMapping__Group_6_0__0__Impl : ( 'version' ) ;
    public final void rule__MInterfaceMapping__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1576:1: ( ( 'version' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1577:1: ( 'version' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1577:1: ( 'version' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1578:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getVersionKeyword_6_0_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MInterfaceMapping__Group_6_0__0__Impl3095); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getVersionKeyword_6_0_0()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_0__0__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_0__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1591:1: rule__MInterfaceMapping__Group_6_0__1 : rule__MInterfaceMapping__Group_6_0__1__Impl rule__MInterfaceMapping__Group_6_0__2 ;
    public final void rule__MInterfaceMapping__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1595:1: ( rule__MInterfaceMapping__Group_6_0__1__Impl rule__MInterfaceMapping__Group_6_0__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1596:2: rule__MInterfaceMapping__Group_6_0__1__Impl rule__MInterfaceMapping__Group_6_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_0__1__Impl_in_rule__MInterfaceMapping__Group_6_0__13126);
            rule__MInterfaceMapping__Group_6_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_0__2_in_rule__MInterfaceMapping__Group_6_0__13129);
            rule__MInterfaceMapping__Group_6_0__2();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_0__1"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_0__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1603:1: rule__MInterfaceMapping__Group_6_0__1__Impl : ( ':=' ) ;
    public final void rule__MInterfaceMapping__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1607:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1608:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1608:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1609:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getColonEqualsSignKeyword_6_0_1()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MInterfaceMapping__Group_6_0__1__Impl3157); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getColonEqualsSignKeyword_6_0_1()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_0__1__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_0__2"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1622:1: rule__MInterfaceMapping__Group_6_0__2 : rule__MInterfaceMapping__Group_6_0__2__Impl rule__MInterfaceMapping__Group_6_0__3 ;
    public final void rule__MInterfaceMapping__Group_6_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1626:1: ( rule__MInterfaceMapping__Group_6_0__2__Impl rule__MInterfaceMapping__Group_6_0__3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1627:2: rule__MInterfaceMapping__Group_6_0__2__Impl rule__MInterfaceMapping__Group_6_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_0__2__Impl_in_rule__MInterfaceMapping__Group_6_0__23188);
            rule__MInterfaceMapping__Group_6_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_0__3_in_rule__MInterfaceMapping__Group_6_0__23191);
            rule__MInterfaceMapping__Group_6_0__3();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_0__2"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_0__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1634:1: rule__MInterfaceMapping__Group_6_0__2__Impl : ( ( rule__MInterfaceMapping__VersionAssignment_6_0_2 ) ) ;
    public final void rule__MInterfaceMapping__Group_6_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1638:1: ( ( ( rule__MInterfaceMapping__VersionAssignment_6_0_2 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1639:1: ( ( rule__MInterfaceMapping__VersionAssignment_6_0_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1639:1: ( ( rule__MInterfaceMapping__VersionAssignment_6_0_2 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1640:1: ( rule__MInterfaceMapping__VersionAssignment_6_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getVersionAssignment_6_0_2()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1641:1: ( rule__MInterfaceMapping__VersionAssignment_6_0_2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1641:2: rule__MInterfaceMapping__VersionAssignment_6_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__VersionAssignment_6_0_2_in_rule__MInterfaceMapping__Group_6_0__2__Impl3218);
            rule__MInterfaceMapping__VersionAssignment_6_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getVersionAssignment_6_0_2()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_0__2__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_0__3"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1651:1: rule__MInterfaceMapping__Group_6_0__3 : rule__MInterfaceMapping__Group_6_0__3__Impl ;
    public final void rule__MInterfaceMapping__Group_6_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1655:1: ( rule__MInterfaceMapping__Group_6_0__3__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1656:2: rule__MInterfaceMapping__Group_6_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_0__3__Impl_in_rule__MInterfaceMapping__Group_6_0__33248);
            rule__MInterfaceMapping__Group_6_0__3__Impl();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_0__3"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_0__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1662:1: rule__MInterfaceMapping__Group_6_0__3__Impl : ( ';' ) ;
    public final void rule__MInterfaceMapping__Group_6_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1666:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1667:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1667:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1668:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_6_0_3()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MInterfaceMapping__Group_6_0__3__Impl3276); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_6_0_3()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_0__3__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1689:1: rule__MInterfaceMapping__Group_6_1__0 : rule__MInterfaceMapping__Group_6_1__0__Impl rule__MInterfaceMapping__Group_6_1__1 ;
    public final void rule__MInterfaceMapping__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1693:1: ( rule__MInterfaceMapping__Group_6_1__0__Impl rule__MInterfaceMapping__Group_6_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1694:2: rule__MInterfaceMapping__Group_6_1__0__Impl rule__MInterfaceMapping__Group_6_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__0__Impl_in_rule__MInterfaceMapping__Group_6_1__03315);
            rule__MInterfaceMapping__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__1_in_rule__MInterfaceMapping__Group_6_1__03318);
            rule__MInterfaceMapping__Group_6_1__1();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__0"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1701:1: rule__MInterfaceMapping__Group_6_1__0__Impl : ( 'interfaces' ) ;
    public final void rule__MInterfaceMapping__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1705:1: ( ( 'interfaces' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1706:1: ( 'interfaces' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1706:1: ( 'interfaces' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1707:1: 'interfaces'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getInterfacesKeyword_6_1_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MInterfaceMapping__Group_6_1__0__Impl3346); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getInterfacesKeyword_6_1_0()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__0__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1720:1: rule__MInterfaceMapping__Group_6_1__1 : rule__MInterfaceMapping__Group_6_1__1__Impl rule__MInterfaceMapping__Group_6_1__2 ;
    public final void rule__MInterfaceMapping__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1724:1: ( rule__MInterfaceMapping__Group_6_1__1__Impl rule__MInterfaceMapping__Group_6_1__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1725:2: rule__MInterfaceMapping__Group_6_1__1__Impl rule__MInterfaceMapping__Group_6_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__1__Impl_in_rule__MInterfaceMapping__Group_6_1__13377);
            rule__MInterfaceMapping__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__2_in_rule__MInterfaceMapping__Group_6_1__13380);
            rule__MInterfaceMapping__Group_6_1__2();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__1"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1732:1: rule__MInterfaceMapping__Group_6_1__1__Impl : ( ':=' ) ;
    public final void rule__MInterfaceMapping__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1736:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1737:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1737:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1738:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getColonEqualsSignKeyword_6_1_1()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MInterfaceMapping__Group_6_1__1__Impl3408); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getColonEqualsSignKeyword_6_1_1()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__1__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__2"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1751:1: rule__MInterfaceMapping__Group_6_1__2 : rule__MInterfaceMapping__Group_6_1__2__Impl rule__MInterfaceMapping__Group_6_1__3 ;
    public final void rule__MInterfaceMapping__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1755:1: ( rule__MInterfaceMapping__Group_6_1__2__Impl rule__MInterfaceMapping__Group_6_1__3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1756:2: rule__MInterfaceMapping__Group_6_1__2__Impl rule__MInterfaceMapping__Group_6_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__2__Impl_in_rule__MInterfaceMapping__Group_6_1__23439);
            rule__MInterfaceMapping__Group_6_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__3_in_rule__MInterfaceMapping__Group_6_1__23442);
            rule__MInterfaceMapping__Group_6_1__3();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__2"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1763:1: rule__MInterfaceMapping__Group_6_1__2__Impl : ( ( rule__MInterfaceMapping__InterfacesAssignment_6_1_2 ) ) ;
    public final void rule__MInterfaceMapping__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1767:1: ( ( ( rule__MInterfaceMapping__InterfacesAssignment_6_1_2 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1768:1: ( ( rule__MInterfaceMapping__InterfacesAssignment_6_1_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1768:1: ( ( rule__MInterfaceMapping__InterfacesAssignment_6_1_2 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1769:1: ( rule__MInterfaceMapping__InterfacesAssignment_6_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getInterfacesAssignment_6_1_2()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1770:1: ( rule__MInterfaceMapping__InterfacesAssignment_6_1_2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1770:2: rule__MInterfaceMapping__InterfacesAssignment_6_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__InterfacesAssignment_6_1_2_in_rule__MInterfaceMapping__Group_6_1__2__Impl3469);
            rule__MInterfaceMapping__InterfacesAssignment_6_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getInterfacesAssignment_6_1_2()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__2__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__3"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1780:1: rule__MInterfaceMapping__Group_6_1__3 : rule__MInterfaceMapping__Group_6_1__3__Impl rule__MInterfaceMapping__Group_6_1__4 ;
    public final void rule__MInterfaceMapping__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1784:1: ( rule__MInterfaceMapping__Group_6_1__3__Impl rule__MInterfaceMapping__Group_6_1__4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1785:2: rule__MInterfaceMapping__Group_6_1__3__Impl rule__MInterfaceMapping__Group_6_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__3__Impl_in_rule__MInterfaceMapping__Group_6_1__33499);
            rule__MInterfaceMapping__Group_6_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__4_in_rule__MInterfaceMapping__Group_6_1__33502);
            rule__MInterfaceMapping__Group_6_1__4();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__3"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1792:1: rule__MInterfaceMapping__Group_6_1__3__Impl : ( ',' ) ;
    public final void rule__MInterfaceMapping__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1796:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1797:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1797:1: ( ',' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1798:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getCommaKeyword_6_1_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MInterfaceMapping__Group_6_1__3__Impl3530); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getCommaKeyword_6_1_3()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__3__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__4"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1811:1: rule__MInterfaceMapping__Group_6_1__4 : rule__MInterfaceMapping__Group_6_1__4__Impl rule__MInterfaceMapping__Group_6_1__5 ;
    public final void rule__MInterfaceMapping__Group_6_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1815:1: ( rule__MInterfaceMapping__Group_6_1__4__Impl rule__MInterfaceMapping__Group_6_1__5 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1816:2: rule__MInterfaceMapping__Group_6_1__4__Impl rule__MInterfaceMapping__Group_6_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__4__Impl_in_rule__MInterfaceMapping__Group_6_1__43561);
            rule__MInterfaceMapping__Group_6_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__5_in_rule__MInterfaceMapping__Group_6_1__43564);
            rule__MInterfaceMapping__Group_6_1__5();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__4"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1823:1: rule__MInterfaceMapping__Group_6_1__4__Impl : ( ( rule__MInterfaceMapping__InterfacesAssignment_6_1_4 ) ) ;
    public final void rule__MInterfaceMapping__Group_6_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1827:1: ( ( ( rule__MInterfaceMapping__InterfacesAssignment_6_1_4 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1828:1: ( ( rule__MInterfaceMapping__InterfacesAssignment_6_1_4 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1828:1: ( ( rule__MInterfaceMapping__InterfacesAssignment_6_1_4 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1829:1: ( rule__MInterfaceMapping__InterfacesAssignment_6_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getInterfacesAssignment_6_1_4()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1830:1: ( rule__MInterfaceMapping__InterfacesAssignment_6_1_4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1830:2: rule__MInterfaceMapping__InterfacesAssignment_6_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__InterfacesAssignment_6_1_4_in_rule__MInterfaceMapping__Group_6_1__4__Impl3591);
            rule__MInterfaceMapping__InterfacesAssignment_6_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getInterfacesAssignment_6_1_4()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__4__Impl"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__5"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1840:1: rule__MInterfaceMapping__Group_6_1__5 : rule__MInterfaceMapping__Group_6_1__5__Impl ;
    public final void rule__MInterfaceMapping__Group_6_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1844:1: ( rule__MInterfaceMapping__Group_6_1__5__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1845:2: rule__MInterfaceMapping__Group_6_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__5__Impl_in_rule__MInterfaceMapping__Group_6_1__53621);
            rule__MInterfaceMapping__Group_6_1__5__Impl();

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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__5"


    // $ANTLR start "rule__MInterfaceMapping__Group_6_1__5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1851:1: rule__MInterfaceMapping__Group_6_1__5__Impl : ( ';' ) ;
    public final void rule__MInterfaceMapping__Group_6_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1855:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1856:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1856:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1857:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_6_1_5()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MInterfaceMapping__Group_6_1__5__Impl3649); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_6_1_5()); 
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
    // $ANTLR end "rule__MInterfaceMapping__Group_6_1__5__Impl"


    // $ANTLR start "rule__MInterfaceMapping__UnorderedGroup_6"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1883:1: rule__MInterfaceMapping__UnorderedGroup_6 : rule__MInterfaceMapping__UnorderedGroup_6__0 {...}?;
    public final void rule__MInterfaceMapping__UnorderedGroup_6() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6());
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1888:1: ( rule__MInterfaceMapping__UnorderedGroup_6__0 {...}?)
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1889:2: rule__MInterfaceMapping__UnorderedGroup_6__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__0_in_rule__MInterfaceMapping__UnorderedGroup_63693);
            rule__MInterfaceMapping__UnorderedGroup_6__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__MInterfaceMapping__UnorderedGroup_6", "getUnorderedGroupHelper().canLeave(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInterfaceMapping__UnorderedGroup_6"


    // $ANTLR start "rule__MInterfaceMapping__UnorderedGroup_6__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1900:1: rule__MInterfaceMapping__UnorderedGroup_6__Impl : ( ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_1__0 ) ) ) ) ) ;
    public final void rule__MInterfaceMapping__UnorderedGroup_6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1905:1: ( ( ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_1__0 ) ) ) ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1906:3: ( ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_1__0 ) ) ) ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1906:3: ( ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_1__0 ) ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1908:4: ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1908:4: ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1909:5: {...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MInterfaceMapping__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0)");
                    }
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1909:114: ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1910:6: ( ( rule__MInterfaceMapping__Group_6_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1916:6: ( ( rule__MInterfaceMapping__Group_6_0__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1918:7: ( rule__MInterfaceMapping__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMInterfaceMappingAccess().getGroup_6_0()); 
                    }
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1919:7: ( rule__MInterfaceMapping__Group_6_0__0 )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1919:8: rule__MInterfaceMapping__Group_6_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_0__0_in_rule__MInterfaceMapping__UnorderedGroup_6__Impl3782);
                    rule__MInterfaceMapping__Group_6_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMInterfaceMappingAccess().getGroup_6_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1925:4: ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_1__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1925:4: ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_1__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1926:5: {...}? => ( ( ( rule__MInterfaceMapping__Group_6_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MInterfaceMapping__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1)");
                    }
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1926:114: ( ( ( rule__MInterfaceMapping__Group_6_1__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1927:6: ( ( rule__MInterfaceMapping__Group_6_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1933:6: ( ( rule__MInterfaceMapping__Group_6_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1935:7: ( rule__MInterfaceMapping__Group_6_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMInterfaceMappingAccess().getGroup_6_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1936:7: ( rule__MInterfaceMapping__Group_6_1__0 )
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1936:8: rule__MInterfaceMapping__Group_6_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_1__0_in_rule__MInterfaceMapping__UnorderedGroup_6__Impl3873);
                    rule__MInterfaceMapping__Group_6_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMInterfaceMappingAccess().getGroup_6_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInterfaceMapping__UnorderedGroup_6__Impl"


    // $ANTLR start "rule__MInterfaceMapping__UnorderedGroup_6__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1951:1: rule__MInterfaceMapping__UnorderedGroup_6__0 : rule__MInterfaceMapping__UnorderedGroup_6__Impl ( rule__MInterfaceMapping__UnorderedGroup_6__1 )? ;
    public final void rule__MInterfaceMapping__UnorderedGroup_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1955:1: ( rule__MInterfaceMapping__UnorderedGroup_6__Impl ( rule__MInterfaceMapping__UnorderedGroup_6__1 )? )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1956:2: rule__MInterfaceMapping__UnorderedGroup_6__Impl ( rule__MInterfaceMapping__UnorderedGroup_6__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__Impl_in_rule__MInterfaceMapping__UnorderedGroup_6__03932);
            rule__MInterfaceMapping__UnorderedGroup_6__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1957:2: ( rule__MInterfaceMapping__UnorderedGroup_6__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:0:0: rule__MInterfaceMapping__UnorderedGroup_6__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__1_in_rule__MInterfaceMapping__UnorderedGroup_6__03935);
                    rule__MInterfaceMapping__UnorderedGroup_6__1();

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
    // $ANTLR end "rule__MInterfaceMapping__UnorderedGroup_6__0"


    // $ANTLR start "rule__MInterfaceMapping__UnorderedGroup_6__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1964:1: rule__MInterfaceMapping__UnorderedGroup_6__1 : rule__MInterfaceMapping__UnorderedGroup_6__Impl ;
    public final void rule__MInterfaceMapping__UnorderedGroup_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1968:1: ( rule__MInterfaceMapping__UnorderedGroup_6__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1969:2: rule__MInterfaceMapping__UnorderedGroup_6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__Impl_in_rule__MInterfaceMapping__UnorderedGroup_6__13960);
            rule__MInterfaceMapping__UnorderedGroup_6__Impl();

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
    // $ANTLR end "rule__MInterfaceMapping__UnorderedGroup_6__1"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__PackageAssignment_1"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1980:1: rule__MMCLEVIMAPPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMCLEVIMAPPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1984:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1985:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1985:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1986:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1987:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1988:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MMCLEVIMAPPackageFile__PackageAssignment_13996);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__PackageAssignment_1"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1999:1: rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2003:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2004:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2004:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2005:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2006:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2007:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsMMCLEVPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_14035);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsMMCLEVPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1"


    // $ANTLR start "rule__MMCLEVIMAPPackageFile__ElementAssignment_4"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2018:1: rule__MMCLEVIMAPPackageFile__ElementAssignment_4 : ( ruleMMCLEVIMAPPackageElement ) ;
    public final void rule__MMCLEVIMAPPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2022:1: ( ( ruleMMCLEVIMAPPackageElement ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2023:1: ( ruleMMCLEVIMAPPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2023:1: ( ruleMMCLEVIMAPPackageElement )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2024:1: ruleMMCLEVIMAPPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIMAPPackageFileAccess().getElementMMCLEVIMAPPackageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIMAPPackageElement_in_rule__MMCLEVIMAPPackageFile__ElementAssignment_44070);
            ruleMMCLEVIMAPPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIMAPPackageFileAccess().getElementMMCLEVIMAPPackageElementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__MMCLEVIMAPPackageFile__ElementAssignment_4"


    // $ANTLR start "rule__MInterfaceMapping__DomainAssignment_1"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2033:1: rule__MInterfaceMapping__DomainAssignment_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MInterfaceMapping__DomainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2037:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2038:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2038:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2039:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getDomainMIODomainCrossReference_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2040:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2041:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getDomainMIODomainVersionedQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MInterfaceMapping__DomainAssignment_14105);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getDomainMIODomainVersionedQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getDomainMIODomainCrossReference_1_0()); 
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
    // $ANTLR end "rule__MInterfaceMapping__DomainAssignment_1"


    // $ANTLR start "rule__MInterfaceMapping__TypeAssignment_3"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2052:1: rule__MInterfaceMapping__TypeAssignment_3 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__MInterfaceMapping__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2056:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2057:1: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2057:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2058:1: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getTypeMExchangeModelCrossReference_3_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2059:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2060:1: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getTypeMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_rule__MInterfaceMapping__TypeAssignment_34144);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getTypeMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getTypeMExchangeModelCrossReference_3_0()); 
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
    // $ANTLR end "rule__MInterfaceMapping__TypeAssignment_3"


    // $ANTLR start "rule__MInterfaceMapping__NameAssignment_4"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2071:1: rule__MInterfaceMapping__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__MInterfaceMapping__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2075:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2076:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2076:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2077:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MInterfaceMapping__NameAssignment_44179); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getNameIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__MInterfaceMapping__NameAssignment_4"


    // $ANTLR start "rule__MInterfaceMapping__VersionAssignment_6_0_2"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2086:1: rule__MInterfaceMapping__VersionAssignment_6_0_2 : ( ruleVersion ) ;
    public final void rule__MInterfaceMapping__VersionAssignment_6_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2090:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2091:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2091:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2092:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getVersionVersionParserRuleCall_6_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__MInterfaceMapping__VersionAssignment_6_0_24210);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getVersionVersionParserRuleCall_6_0_2_0()); 
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
    // $ANTLR end "rule__MInterfaceMapping__VersionAssignment_6_0_2"


    // $ANTLR start "rule__MInterfaceMapping__InterfacesAssignment_6_1_2"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2101:1: rule__MInterfaceMapping__InterfacesAssignment_6_1_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MInterfaceMapping__InterfacesAssignment_6_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2105:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2106:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2106:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2107:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_2_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2108:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2109:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MInterfaceMapping__InterfacesAssignment_6_1_24245);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_2_0()); 
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
    // $ANTLR end "rule__MInterfaceMapping__InterfacesAssignment_6_1_2"


    // $ANTLR start "rule__MInterfaceMapping__InterfacesAssignment_6_1_4"
    // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2120:1: rule__MInterfaceMapping__InterfacesAssignment_6_1_4 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MInterfaceMapping__InterfacesAssignment_6_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2124:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2125:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2125:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2126:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_4_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2127:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:2128:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MInterfaceMapping__InterfacesAssignment_6_1_44284);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_4_0()); 
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
    // $ANTLR end "rule__MInterfaceMapping__InterfacesAssignment_6_1_4"

    // $ANTLR start synpred10_InternalIMAP
    public final void synpred10_InternalIMAP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1908:4: ( ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1908:4: ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1908:4: ({...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1909:5: {...}? => ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalIMAP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1909:114: ( ( ( rule__MInterfaceMapping__Group_6_0__0 ) ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1910:6: ( ( rule__MInterfaceMapping__Group_6_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), 0);
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1916:6: ( ( rule__MInterfaceMapping__Group_6_0__0 ) )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1918:7: ( rule__MInterfaceMapping__Group_6_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMInterfaceMappingAccess().getGroup_6_0()); 
        }
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1919:7: ( rule__MInterfaceMapping__Group_6_0__0 )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1919:8: rule__MInterfaceMapping__Group_6_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__Group_6_0__0_in_synpred10_InternalIMAP3782);
        rule__MInterfaceMapping__Group_6_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalIMAP

    // $ANTLR start synpred11_InternalIMAP
    public final void synpred11_InternalIMAP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1957:2: ( rule__MInterfaceMapping__UnorderedGroup_6__1 )
        // ../es.uah.aut.srg.micobs.mclev.editor.imap.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIMAP.g:1957:2: rule__MInterfaceMapping__UnorderedGroup_6__1
        {
        pushFollow(FollowSets000.FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__1_in_synpred11_InternalIMAP3935);
        rule__MInterfaceMapping__UnorderedGroup_6__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalIMAP

    // Delegated rules

    public final boolean synpred11_InternalIMAP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalIMAP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalIMAP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalIMAP_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleMMCLEVIMAPPackageFile_in_entryRuleMMCLEVIMAPPackageFile67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMCLEVIMAPPackageFile74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__0_in_ruleMMCLEVIMAPPackageFile100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMCLEVIMAPPackageElement_in_entryRuleMMCLEVIMAPPackageElement127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMCLEVIMAPPackageElement134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMInterfaceMapping_in_ruleMMCLEVIMAPPackageElement160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__0_in_ruleVersionedQualifiedName339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_entryRuleVersionedQualifiedReferenceName366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedReferenceName373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__0_in_ruleVersionedQualifiedReferenceName399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMInterfaceMapping_in_entryRuleMInterfaceMapping426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMInterfaceMapping433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__0_in_ruleMInterfaceMapping459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_0495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__0__Impl_in_rule__MMCLEVIMAPPackageFile__Group__0593 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__1_in_rule__MMCLEVIMAPPackageFile__Group__0596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MMCLEVIMAPPackageFile__Group__0__Impl624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__1__Impl_in_rule__MMCLEVIMAPPackageFile__Group__1655 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__2_in_rule__MMCLEVIMAPPackageFile__Group__1658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__PackageAssignment_1_in_rule__MMCLEVIMAPPackageFile__Group__1__Impl685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__2__Impl_in_rule__MMCLEVIMAPPackageFile__Group__2715 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__3_in_rule__MMCLEVIMAPPackageFile__Group__2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MMCLEVIMAPPackageFile__Group__2__Impl746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__3__Impl_in_rule__MMCLEVIMAPPackageFile__Group__3777 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__4_in_rule__MMCLEVIMAPPackageFile__Group__3780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__0_in_rule__MMCLEVIMAPPackageFile__Group__3__Impl807 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group__4__Impl_in_rule__MMCLEVIMAPPackageFile__Group__4838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__ElementAssignment_4_in_rule__MMCLEVIMAPPackageFile__Group__4__Impl865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__0__Impl_in_rule__MMCLEVIMAPPackageFile__Group_3__0905 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__1_in_rule__MMCLEVIMAPPackageFile__Group_3__0908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MMCLEVIMAPPackageFile__Group_3__0__Impl936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__1__Impl_in_rule__MMCLEVIMAPPackageFile__Group_3__1967 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__2_in_rule__MMCLEVIMAPPackageFile__Group_3__1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1_in_rule__MMCLEVIMAPPackageFile__Group_3__1__Impl997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIMAPPackageFile__Group_3__2__Impl_in_rule__MMCLEVIMAPPackageFile__Group_3__21027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MMCLEVIMAPPackageFile__Group_3__2__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01092 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1178 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01213 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__01335 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__01338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Alternatives_0_in_rule__Version__Group__0__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__11395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl1422 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0__Impl_in_rule__Version__Group_0_1__01457 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__1_in_rule__Version__Group_0_1__01460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_0_1__0__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__1__Impl_in_rule__Version__Group_0_1__11519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_0_1__1__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__01579 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__01582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Version__Group_1__0__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__11641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Alternatives_1_1_in_rule__Version__Group_1__1__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__01702 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__01705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__0__Impl1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__11764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_1_1_1__1__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__0__Impl_in_rule__VersionedQualifiedName__Group__01824 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__1_in_rule__VersionedQualifiedName__Group__01827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__VersionedQualifiedName__Group__0__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__1__Impl_in_rule__VersionedQualifiedName__Group__11883 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__2_in_rule__VersionedQualifiedName__Group__11886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__VersionedQualifiedName__Group__1__Impl1914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__2__Impl_in_rule__VersionedQualifiedName__Group__21945 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__3_in_rule__VersionedQualifiedName__Group__21948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__VersionedQualifiedName__Group__2__Impl1975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__3__Impl_in_rule__VersionedQualifiedName__Group__32004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__VersionedQualifiedName__Group__3__Impl2032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__0__Impl_in_rule__VersionedQualifiedReferenceName__Group__02071 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__1_in_rule__VersionedQualifiedReferenceName__Group__02074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__0_in_rule__VersionedQualifiedReferenceName__Group__0__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__1__Impl_in_rule__VersionedQualifiedReferenceName__Group__12132 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__2_in_rule__VersionedQualifiedReferenceName__Group__12135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VersionedQualifiedReferenceName__Group__1__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group__2__Impl_in_rule__VersionedQualifiedReferenceName__Group__22191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__0_in_rule__VersionedQualifiedReferenceName__Group__2__Impl2218 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__0__Impl_in_rule__VersionedQualifiedReferenceName__Group_0__02255 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__1_in_rule__VersionedQualifiedReferenceName__Group_0__02258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__VersionedQualifiedReferenceName__Group_0__0__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_0__1__Impl_in_rule__VersionedQualifiedReferenceName__Group_0__12314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__VersionedQualifiedReferenceName__Group_0__1__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__0__Impl_in_rule__VersionedQualifiedReferenceName__Group_2__02377 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__1_in_rule__VersionedQualifiedReferenceName__Group_2__02380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__VersionedQualifiedReferenceName__Group_2__0__Impl2408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedReferenceName__Group_2__1__Impl_in_rule__VersionedQualifiedReferenceName__Group_2__12439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VersionedQualifiedReferenceName__Group_2__1__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__0__Impl_in_rule__MInterfaceMapping__Group__02499 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__1_in_rule__MInterfaceMapping__Group__02502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MInterfaceMapping__Group__0__Impl2530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__1__Impl_in_rule__MInterfaceMapping__Group__12561 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__2_in_rule__MInterfaceMapping__Group__12564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__DomainAssignment_1_in_rule__MInterfaceMapping__Group__1__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__2__Impl_in_rule__MInterfaceMapping__Group__22621 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__3_in_rule__MInterfaceMapping__Group__22624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MInterfaceMapping__Group__2__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__3__Impl_in_rule__MInterfaceMapping__Group__32683 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__4_in_rule__MInterfaceMapping__Group__32686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__TypeAssignment_3_in_rule__MInterfaceMapping__Group__3__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__4__Impl_in_rule__MInterfaceMapping__Group__42743 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__5_in_rule__MInterfaceMapping__Group__42746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__NameAssignment_4_in_rule__MInterfaceMapping__Group__4__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__5__Impl_in_rule__MInterfaceMapping__Group__52803 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__6_in_rule__MInterfaceMapping__Group__52806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MInterfaceMapping__Group__5__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__6__Impl_in_rule__MInterfaceMapping__Group__62865 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__7_in_rule__MInterfaceMapping__Group__62868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6_in_rule__MInterfaceMapping__Group__6__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__7__Impl_in_rule__MInterfaceMapping__Group__72925 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__8_in_rule__MInterfaceMapping__Group__72928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MInterfaceMapping__Group__7__Impl2956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group__8__Impl_in_rule__MInterfaceMapping__Group__82987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MInterfaceMapping__Group__8__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_0__0__Impl_in_rule__MInterfaceMapping__Group_6_0__03064 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_0__1_in_rule__MInterfaceMapping__Group_6_0__03067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MInterfaceMapping__Group_6_0__0__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_0__1__Impl_in_rule__MInterfaceMapping__Group_6_0__13126 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_0__2_in_rule__MInterfaceMapping__Group_6_0__13129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MInterfaceMapping__Group_6_0__1__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_0__2__Impl_in_rule__MInterfaceMapping__Group_6_0__23188 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_0__3_in_rule__MInterfaceMapping__Group_6_0__23191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__VersionAssignment_6_0_2_in_rule__MInterfaceMapping__Group_6_0__2__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_0__3__Impl_in_rule__MInterfaceMapping__Group_6_0__33248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MInterfaceMapping__Group_6_0__3__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__0__Impl_in_rule__MInterfaceMapping__Group_6_1__03315 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__1_in_rule__MInterfaceMapping__Group_6_1__03318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MInterfaceMapping__Group_6_1__0__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__1__Impl_in_rule__MInterfaceMapping__Group_6_1__13377 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__2_in_rule__MInterfaceMapping__Group_6_1__13380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MInterfaceMapping__Group_6_1__1__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__2__Impl_in_rule__MInterfaceMapping__Group_6_1__23439 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__3_in_rule__MInterfaceMapping__Group_6_1__23442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__InterfacesAssignment_6_1_2_in_rule__MInterfaceMapping__Group_6_1__2__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__3__Impl_in_rule__MInterfaceMapping__Group_6_1__33499 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__4_in_rule__MInterfaceMapping__Group_6_1__33502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MInterfaceMapping__Group_6_1__3__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__4__Impl_in_rule__MInterfaceMapping__Group_6_1__43561 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__5_in_rule__MInterfaceMapping__Group_6_1__43564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__InterfacesAssignment_6_1_4_in_rule__MInterfaceMapping__Group_6_1__4__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__5__Impl_in_rule__MInterfaceMapping__Group_6_1__53621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MInterfaceMapping__Group_6_1__5__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__0_in_rule__MInterfaceMapping__UnorderedGroup_63693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_0__0_in_rule__MInterfaceMapping__UnorderedGroup_6__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_1__0_in_rule__MInterfaceMapping__UnorderedGroup_6__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__Impl_in_rule__MInterfaceMapping__UnorderedGroup_6__03932 = new BitSet(new long[]{0x0000000000A00002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__1_in_rule__MInterfaceMapping__UnorderedGroup_6__03935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__Impl_in_rule__MInterfaceMapping__UnorderedGroup_6__13960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MMCLEVIMAPPackageFile__PackageAssignment_13996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_14035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMCLEVIMAPPackageElement_in_rule__MMCLEVIMAPPackageFile__ElementAssignment_44070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MInterfaceMapping__DomainAssignment_14105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_rule__MInterfaceMapping__TypeAssignment_34144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MInterfaceMapping__NameAssignment_44179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__MInterfaceMapping__VersionAssignment_6_0_24210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MInterfaceMapping__InterfacesAssignment_6_1_24245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MInterfaceMapping__InterfacesAssignment_6_1_44284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__Group_6_0__0_in_synpred10_InternalIMAP3782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterfaceMapping__UnorderedGroup_6__1_in_synpred11_InternalIMAP3935 = new BitSet(new long[]{0x0000000000000002L});
    }


}