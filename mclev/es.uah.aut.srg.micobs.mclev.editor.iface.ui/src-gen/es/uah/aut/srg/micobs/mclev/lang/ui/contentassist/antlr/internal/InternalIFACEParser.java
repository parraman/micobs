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
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import es.uah.aut.srg.micobs.mclev.lang.services.IFACEGrammarAccess;
@SuppressWarnings("all")
public class InternalIFACEParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'interface'", "'{'", "'version'", "':='", "'}'", "'extends'", "','"
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


        public InternalIFACEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIFACEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIFACEParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g"; }


     
     	private IFACEGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IFACEGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMMCLEVIFACEPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:61:1: entryRuleMMCLEVIFACEPackageFile : ruleMMCLEVIFACEPackageFile EOF ;
    public final void entryRuleMMCLEVIFACEPackageFile() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:62:1: ( ruleMMCLEVIFACEPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:63:1: ruleMMCLEVIFACEPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIFACEPackageFile_in_entryRuleMMCLEVIFACEPackageFile67);
            ruleMMCLEVIFACEPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMCLEVIFACEPackageFile74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMCLEVIFACEPackageFile"


    // $ANTLR start "ruleMMCLEVIFACEPackageFile"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:70:1: ruleMMCLEVIFACEPackageFile : ( ( rule__MMCLEVIFACEPackageFile__Group__0 ) ) ;
    public final void ruleMMCLEVIFACEPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:74:2: ( ( ( rule__MMCLEVIFACEPackageFile__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:75:1: ( ( rule__MMCLEVIFACEPackageFile__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:75:1: ( ( rule__MMCLEVIFACEPackageFile__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:76:1: ( rule__MMCLEVIFACEPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:77:1: ( rule__MMCLEVIFACEPackageFile__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:77:2: rule__MMCLEVIFACEPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__0_in_ruleMMCLEVIFACEPackageFile100);
            rule__MMCLEVIFACEPackageFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getGroup()); 
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
    // $ANTLR end "ruleMMCLEVIFACEPackageFile"


    // $ANTLR start "entryRuleMMCLEVIFACEPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:89:1: entryRuleMMCLEVIFACEPackageElement : ruleMMCLEVIFACEPackageElement EOF ;
    public final void entryRuleMMCLEVIFACEPackageElement() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:90:1: ( ruleMMCLEVIFACEPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:91:1: ruleMMCLEVIFACEPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIFACEPackageElement_in_entryRuleMMCLEVIFACEPackageElement127);
            ruleMMCLEVIFACEPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMCLEVIFACEPackageElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMCLEVIFACEPackageElement"


    // $ANTLR start "ruleMMCLEVIFACEPackageElement"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:98:1: ruleMMCLEVIFACEPackageElement : ( ruleMInterface ) ;
    public final void ruleMMCLEVIFACEPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:102:2: ( ( ruleMInterface ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:103:1: ( ruleMInterface )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:103:1: ( ruleMInterface )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:104:1: ruleMInterface
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageElementAccess().getMInterfaceParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInterface_in_ruleMMCLEVIFACEPackageElement160);
            ruleMInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageElementAccess().getMInterfaceParserRuleCall()); 
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
    // $ANTLR end "ruleMMCLEVIFACEPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:118:1: ( ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:119:1: ruleQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:133:1: ( rule__QualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:133:2: rule__QualifiedName__Group__0
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:145:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:146:1: ( ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:147:1: ruleVersion EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:154:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:158:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:159:1: ( ( rule__Version__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:159:1: ( ( rule__Version__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:160:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:161:1: ( rule__Version__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:161:2: rule__Version__Group__0
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:173:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:174:1: ( ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:175:1: ruleVersionedQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:182:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:186:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:188:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:189:1: ( rule__VersionedQualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:189:2: rule__VersionedQualifiedName__Group__0
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:201:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:202:1: ( ruleVersionedQualifiedReferenceName EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:203:1: ruleVersionedQualifiedReferenceName EOF
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:210:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:214:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:215:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:215:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:216:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:217:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:217:2: rule__VersionedQualifiedReferenceName__Group__0
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


    // $ANTLR start "entryRuleMInterface"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:229:1: entryRuleMInterface : ruleMInterface EOF ;
    public final void entryRuleMInterface() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:230:1: ( ruleMInterface EOF )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:231:1: ruleMInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMInterface_in_entryRuleMInterface426);
            ruleMInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMInterface433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMInterface"


    // $ANTLR start "ruleMInterface"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:238:1: ruleMInterface : ( ( rule__MInterface__Group__0 ) ) ;
    public final void ruleMInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:242:2: ( ( ( rule__MInterface__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:243:1: ( ( rule__MInterface__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:243:1: ( ( rule__MInterface__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:244:1: ( rule__MInterface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:245:1: ( rule__MInterface__Group__0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:245:2: rule__MInterface__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__0_in_ruleMInterface459);
            rule__MInterface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getGroup()); 
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
    // $ANTLR end "ruleMInterface"


    // $ANTLR start "rule__Version__Alternatives_0"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:257:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:261:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:262:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:262:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:263:1: RULE_INT
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:268:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:268:6: ( ( rule__Version__Group_0_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:269:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:270:1: ( rule__Version__Group_0_1__0 )
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:270:2: rule__Version__Group_0_1__0
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:279:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:283:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:284:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:284:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:285:1: RULE_INT
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:290:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:290:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:291:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:292:1: ( rule__Version__Group_1_1_1__0 )
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:292:2: rule__Version__Group_1_1_1__0
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


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:303:1: rule__MMCLEVIFACEPackageFile__Group__0 : rule__MMCLEVIFACEPackageFile__Group__0__Impl rule__MMCLEVIFACEPackageFile__Group__1 ;
    public final void rule__MMCLEVIFACEPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:307:1: ( rule__MMCLEVIFACEPackageFile__Group__0__Impl rule__MMCLEVIFACEPackageFile__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:308:2: rule__MMCLEVIFACEPackageFile__Group__0__Impl rule__MMCLEVIFACEPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__0__Impl_in_rule__MMCLEVIFACEPackageFile__Group__0593);
            rule__MMCLEVIFACEPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__1_in_rule__MMCLEVIFACEPackageFile__Group__0596);
            rule__MMCLEVIFACEPackageFile__Group__1();

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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__0"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:315:1: rule__MMCLEVIFACEPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__MMCLEVIFACEPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:319:1: ( ( 'package' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:320:1: ( 'package' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:320:1: ( 'package' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:321:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageKeyword_0()); 
            }
            match(input,11,FollowSets000.FOLLOW_11_in_rule__MMCLEVIFACEPackageFile__Group__0__Impl624); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__0__Impl"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:334:1: rule__MMCLEVIFACEPackageFile__Group__1 : rule__MMCLEVIFACEPackageFile__Group__1__Impl rule__MMCLEVIFACEPackageFile__Group__2 ;
    public final void rule__MMCLEVIFACEPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:338:1: ( rule__MMCLEVIFACEPackageFile__Group__1__Impl rule__MMCLEVIFACEPackageFile__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:339:2: rule__MMCLEVIFACEPackageFile__Group__1__Impl rule__MMCLEVIFACEPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__1__Impl_in_rule__MMCLEVIFACEPackageFile__Group__1655);
            rule__MMCLEVIFACEPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__2_in_rule__MMCLEVIFACEPackageFile__Group__1658);
            rule__MMCLEVIFACEPackageFile__Group__2();

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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__1"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:346:1: rule__MMCLEVIFACEPackageFile__Group__1__Impl : ( ( rule__MMCLEVIFACEPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__MMCLEVIFACEPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:350:1: ( ( ( rule__MMCLEVIFACEPackageFile__PackageAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:351:1: ( ( rule__MMCLEVIFACEPackageFile__PackageAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:351:1: ( ( rule__MMCLEVIFACEPackageFile__PackageAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:352:1: ( rule__MMCLEVIFACEPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:353:1: ( rule__MMCLEVIFACEPackageFile__PackageAssignment_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:353:2: rule__MMCLEVIFACEPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__PackageAssignment_1_in_rule__MMCLEVIFACEPackageFile__Group__1__Impl685);
            rule__MMCLEVIFACEPackageFile__PackageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageAssignment_1()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__1__Impl"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:363:1: rule__MMCLEVIFACEPackageFile__Group__2 : rule__MMCLEVIFACEPackageFile__Group__2__Impl rule__MMCLEVIFACEPackageFile__Group__3 ;
    public final void rule__MMCLEVIFACEPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:367:1: ( rule__MMCLEVIFACEPackageFile__Group__2__Impl rule__MMCLEVIFACEPackageFile__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:368:2: rule__MMCLEVIFACEPackageFile__Group__2__Impl rule__MMCLEVIFACEPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__2__Impl_in_rule__MMCLEVIFACEPackageFile__Group__2715);
            rule__MMCLEVIFACEPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__3_in_rule__MMCLEVIFACEPackageFile__Group__2718);
            rule__MMCLEVIFACEPackageFile__Group__3();

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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__2"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:375:1: rule__MMCLEVIFACEPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__MMCLEVIFACEPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:379:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:380:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:380:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:381:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getSemicolonKeyword_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MMCLEVIFACEPackageFile__Group__2__Impl746); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__2__Impl"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:394:1: rule__MMCLEVIFACEPackageFile__Group__3 : rule__MMCLEVIFACEPackageFile__Group__3__Impl rule__MMCLEVIFACEPackageFile__Group__4 ;
    public final void rule__MMCLEVIFACEPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:398:1: ( rule__MMCLEVIFACEPackageFile__Group__3__Impl rule__MMCLEVIFACEPackageFile__Group__4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:399:2: rule__MMCLEVIFACEPackageFile__Group__3__Impl rule__MMCLEVIFACEPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__3__Impl_in_rule__MMCLEVIFACEPackageFile__Group__3777);
            rule__MMCLEVIFACEPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__4_in_rule__MMCLEVIFACEPackageFile__Group__3780);
            rule__MMCLEVIFACEPackageFile__Group__4();

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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__3"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:406:1: rule__MMCLEVIFACEPackageFile__Group__3__Impl : ( ( rule__MMCLEVIFACEPackageFile__Group_3__0 )* ) ;
    public final void rule__MMCLEVIFACEPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:410:1: ( ( ( rule__MMCLEVIFACEPackageFile__Group_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:411:1: ( ( rule__MMCLEVIFACEPackageFile__Group_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:411:1: ( ( rule__MMCLEVIFACEPackageFile__Group_3__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:412:1: ( rule__MMCLEVIFACEPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getGroup_3()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:413:1: ( rule__MMCLEVIFACEPackageFile__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:413:2: rule__MMCLEVIFACEPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__0_in_rule__MMCLEVIFACEPackageFile__Group__3__Impl807);
            	    rule__MMCLEVIFACEPackageFile__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getGroup_3()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__3__Impl"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__4"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:423:1: rule__MMCLEVIFACEPackageFile__Group__4 : rule__MMCLEVIFACEPackageFile__Group__4__Impl ;
    public final void rule__MMCLEVIFACEPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:427:1: ( rule__MMCLEVIFACEPackageFile__Group__4__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:428:2: rule__MMCLEVIFACEPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group__4__Impl_in_rule__MMCLEVIFACEPackageFile__Group__4838);
            rule__MMCLEVIFACEPackageFile__Group__4__Impl();

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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__4"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:434:1: rule__MMCLEVIFACEPackageFile__Group__4__Impl : ( ( rule__MMCLEVIFACEPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__MMCLEVIFACEPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:438:1: ( ( ( rule__MMCLEVIFACEPackageFile__ElementAssignment_4 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:439:1: ( ( rule__MMCLEVIFACEPackageFile__ElementAssignment_4 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:439:1: ( ( rule__MMCLEVIFACEPackageFile__ElementAssignment_4 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:440:1: ( rule__MMCLEVIFACEPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getElementAssignment_4()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:441:1: ( rule__MMCLEVIFACEPackageFile__ElementAssignment_4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:441:2: rule__MMCLEVIFACEPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__ElementAssignment_4_in_rule__MMCLEVIFACEPackageFile__Group__4__Impl865);
            rule__MMCLEVIFACEPackageFile__ElementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getElementAssignment_4()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group__4__Impl"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group_3__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:461:1: rule__MMCLEVIFACEPackageFile__Group_3__0 : rule__MMCLEVIFACEPackageFile__Group_3__0__Impl rule__MMCLEVIFACEPackageFile__Group_3__1 ;
    public final void rule__MMCLEVIFACEPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:465:1: ( rule__MMCLEVIFACEPackageFile__Group_3__0__Impl rule__MMCLEVIFACEPackageFile__Group_3__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:466:2: rule__MMCLEVIFACEPackageFile__Group_3__0__Impl rule__MMCLEVIFACEPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__0__Impl_in_rule__MMCLEVIFACEPackageFile__Group_3__0905);
            rule__MMCLEVIFACEPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__1_in_rule__MMCLEVIFACEPackageFile__Group_3__0908);
            rule__MMCLEVIFACEPackageFile__Group_3__1();

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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group_3__0"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:473:1: rule__MMCLEVIFACEPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__MMCLEVIFACEPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:477:1: ( ( 'import' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:478:1: ( 'import' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:478:1: ( 'import' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:479:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportKeyword_3_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MMCLEVIFACEPackageFile__Group_3__0__Impl936); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportKeyword_3_0()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group_3__0__Impl"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group_3__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:492:1: rule__MMCLEVIFACEPackageFile__Group_3__1 : rule__MMCLEVIFACEPackageFile__Group_3__1__Impl rule__MMCLEVIFACEPackageFile__Group_3__2 ;
    public final void rule__MMCLEVIFACEPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:496:1: ( rule__MMCLEVIFACEPackageFile__Group_3__1__Impl rule__MMCLEVIFACEPackageFile__Group_3__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:497:2: rule__MMCLEVIFACEPackageFile__Group_3__1__Impl rule__MMCLEVIFACEPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__1__Impl_in_rule__MMCLEVIFACEPackageFile__Group_3__1967);
            rule__MMCLEVIFACEPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__2_in_rule__MMCLEVIFACEPackageFile__Group_3__1970);
            rule__MMCLEVIFACEPackageFile__Group_3__2();

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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group_3__1"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:504:1: rule__MMCLEVIFACEPackageFile__Group_3__1__Impl : ( ( rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__MMCLEVIFACEPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:508:1: ( ( ( rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:509:1: ( ( rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:509:1: ( ( rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:510:1: ( rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsAssignment_3_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:511:1: ( rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:511:2: rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1_in_rule__MMCLEVIFACEPackageFile__Group_3__1__Impl997);
            rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsAssignment_3_1()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group_3__1__Impl"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group_3__2"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:521:1: rule__MMCLEVIFACEPackageFile__Group_3__2 : rule__MMCLEVIFACEPackageFile__Group_3__2__Impl ;
    public final void rule__MMCLEVIFACEPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:525:1: ( rule__MMCLEVIFACEPackageFile__Group_3__2__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:526:2: rule__MMCLEVIFACEPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__2__Impl_in_rule__MMCLEVIFACEPackageFile__Group_3__21027);
            rule__MMCLEVIFACEPackageFile__Group_3__2__Impl();

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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group_3__2"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__Group_3__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:532:1: rule__MMCLEVIFACEPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MMCLEVIFACEPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:536:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:537:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:537:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:538:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MMCLEVIFACEPackageFile__Group_3__2__Impl1055); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getSemicolonKeyword_3_2()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:557:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:561:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:562:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:569:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:573:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:574:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:574:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:575:1: RULE_ID
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:586:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:590:1: ( rule__QualifiedName__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:591:2: rule__QualifiedName__Group__1__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:597:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:601:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:602:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:602:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:603:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:604:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:604:2: rule__QualifiedName__Group_1__0
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:618:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:622:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:623:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:630:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:634:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:635:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:635:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:636:1: '.'
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:649:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:653:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:654:2: rule__QualifiedName__Group_1__1__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:660:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:664:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:665:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:665:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:666:1: RULE_ID
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:681:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:685:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:686:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:693:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:697:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:698:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:698:1: ( ( rule__Version__Alternatives_0 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:699:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:700:1: ( rule__Version__Alternatives_0 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:700:2: rule__Version__Alternatives_0
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:710:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:714:1: ( rule__Version__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:715:2: rule__Version__Group__1__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:721:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:725:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:726:1: ( ( rule__Version__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:726:1: ( ( rule__Version__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:727:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:728:1: ( rule__Version__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:728:2: rule__Version__Group_1__0
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:742:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:746:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:747:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:754:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:758:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:759:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:759:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:760:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:761:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:761:3: RULE_INT
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:771:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:775:1: ( rule__Version__Group_0_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:776:2: rule__Version__Group_0_1__1__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:782:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:786:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:787:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:787:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:788:1: RULE_ID
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:803:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:807:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:808:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:815:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:819:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:820:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:820:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:821:1: '.'
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:834:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:838:1: ( rule__Version__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:839:2: rule__Version__Group_1__1__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:845:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:849:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:850:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:850:1: ( ( rule__Version__Alternatives_1_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:851:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:852:1: ( rule__Version__Alternatives_1_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:852:2: rule__Version__Alternatives_1_1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:866:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:870:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:871:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:878:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:882:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:883:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:883:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:884:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:885:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:885:3: RULE_INT
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:895:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:899:1: ( rule__Version__Group_1_1_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:900:2: rule__Version__Group_1_1_1__1__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:906:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:910:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:911:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:911:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:912:1: RULE_ID
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:927:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:931:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:932:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:939:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:943:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:944:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:944:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:945:1: ruleQualifiedName
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:956:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:960:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:961:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:968:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:972:1: ( ( '(' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:973:1: ( '(' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:973:1: ( '(' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:974:1: '('
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:987:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:991:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:992:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:999:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1003:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1004:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1004:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1005:1: ruleVersion
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1016:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1020:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1021:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1027:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1031:1: ( ( ')' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1032:1: ( ')' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1032:1: ( ')' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1033:1: ')'
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1054:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1058:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1059:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1066:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1070:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1071:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1071:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1072:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1073:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
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
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1073:2: rule__VersionedQualifiedReferenceName__Group_0__0
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1083:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1087:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1088:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1095:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1099:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1100:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1100:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1101:1: RULE_ID
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1112:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1116:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1117:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1123:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1127:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1128:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1128:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1129:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1130:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1130:2: rule__VersionedQualifiedReferenceName__Group_2__0
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1146:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1150:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1151:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1158:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1162:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1163:1: ( ruleVersionedQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1163:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1164:1: ruleVersionedQualifiedName
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1175:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1179:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1180:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1186:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1190:1: ( ( '::' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1191:1: ( '::' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1191:1: ( '::' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1192:1: '::'
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1209:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1213:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1214:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1221:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1225:1: ( ( '::' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1226:1: ( '::' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1226:1: ( '::' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1227:1: '::'
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1240:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1244:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1245:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
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
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1251:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1255:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1256:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1256:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1257:1: RULE_ID
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


    // $ANTLR start "rule__MInterface__Group__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1272:1: rule__MInterface__Group__0 : rule__MInterface__Group__0__Impl rule__MInterface__Group__1 ;
    public final void rule__MInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1276:1: ( rule__MInterface__Group__0__Impl rule__MInterface__Group__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1277:2: rule__MInterface__Group__0__Impl rule__MInterface__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__0__Impl_in_rule__MInterface__Group__02499);
            rule__MInterface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__1_in_rule__MInterface__Group__02502);
            rule__MInterface__Group__1();

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
    // $ANTLR end "rule__MInterface__Group__0"


    // $ANTLR start "rule__MInterface__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1284:1: rule__MInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__MInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1288:1: ( ( 'interface' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1289:1: ( 'interface' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1289:1: ( 'interface' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1290:1: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getInterfaceKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MInterface__Group__0__Impl2530); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getInterfaceKeyword_0()); 
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
    // $ANTLR end "rule__MInterface__Group__0__Impl"


    // $ANTLR start "rule__MInterface__Group__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1303:1: rule__MInterface__Group__1 : rule__MInterface__Group__1__Impl rule__MInterface__Group__2 ;
    public final void rule__MInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1307:1: ( rule__MInterface__Group__1__Impl rule__MInterface__Group__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1308:2: rule__MInterface__Group__1__Impl rule__MInterface__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__1__Impl_in_rule__MInterface__Group__12561);
            rule__MInterface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__2_in_rule__MInterface__Group__12564);
            rule__MInterface__Group__2();

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
    // $ANTLR end "rule__MInterface__Group__1"


    // $ANTLR start "rule__MInterface__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1315:1: rule__MInterface__Group__1__Impl : ( ( rule__MInterface__DomainAssignment_1 ) ) ;
    public final void rule__MInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1319:1: ( ( ( rule__MInterface__DomainAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1320:1: ( ( rule__MInterface__DomainAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1320:1: ( ( rule__MInterface__DomainAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1321:1: ( rule__MInterface__DomainAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getDomainAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1322:1: ( rule__MInterface__DomainAssignment_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1322:2: rule__MInterface__DomainAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__DomainAssignment_1_in_rule__MInterface__Group__1__Impl2591);
            rule__MInterface__DomainAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getDomainAssignment_1()); 
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
    // $ANTLR end "rule__MInterface__Group__1__Impl"


    // $ANTLR start "rule__MInterface__Group__2"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1332:1: rule__MInterface__Group__2 : rule__MInterface__Group__2__Impl rule__MInterface__Group__3 ;
    public final void rule__MInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1336:1: ( rule__MInterface__Group__2__Impl rule__MInterface__Group__3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1337:2: rule__MInterface__Group__2__Impl rule__MInterface__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__2__Impl_in_rule__MInterface__Group__22621);
            rule__MInterface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__3_in_rule__MInterface__Group__22624);
            rule__MInterface__Group__3();

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
    // $ANTLR end "rule__MInterface__Group__2"


    // $ANTLR start "rule__MInterface__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1344:1: rule__MInterface__Group__2__Impl : ( '::' ) ;
    public final void rule__MInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1348:1: ( ( '::' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1349:1: ( '::' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1349:1: ( '::' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1350:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getColonColonKeyword_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MInterface__Group__2__Impl2652); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getColonColonKeyword_2()); 
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
    // $ANTLR end "rule__MInterface__Group__2__Impl"


    // $ANTLR start "rule__MInterface__Group__3"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1363:1: rule__MInterface__Group__3 : rule__MInterface__Group__3__Impl rule__MInterface__Group__4 ;
    public final void rule__MInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1367:1: ( rule__MInterface__Group__3__Impl rule__MInterface__Group__4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1368:2: rule__MInterface__Group__3__Impl rule__MInterface__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__3__Impl_in_rule__MInterface__Group__32683);
            rule__MInterface__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__4_in_rule__MInterface__Group__32686);
            rule__MInterface__Group__4();

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
    // $ANTLR end "rule__MInterface__Group__3"


    // $ANTLR start "rule__MInterface__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1375:1: rule__MInterface__Group__3__Impl : ( ( rule__MInterface__TypeAssignment_3 ) ) ;
    public final void rule__MInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1379:1: ( ( ( rule__MInterface__TypeAssignment_3 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1380:1: ( ( rule__MInterface__TypeAssignment_3 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1380:1: ( ( rule__MInterface__TypeAssignment_3 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1381:1: ( rule__MInterface__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getTypeAssignment_3()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1382:1: ( rule__MInterface__TypeAssignment_3 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1382:2: rule__MInterface__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__TypeAssignment_3_in_rule__MInterface__Group__3__Impl2713);
            rule__MInterface__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__MInterface__Group__3__Impl"


    // $ANTLR start "rule__MInterface__Group__4"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1392:1: rule__MInterface__Group__4 : rule__MInterface__Group__4__Impl rule__MInterface__Group__5 ;
    public final void rule__MInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1396:1: ( rule__MInterface__Group__4__Impl rule__MInterface__Group__5 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1397:2: rule__MInterface__Group__4__Impl rule__MInterface__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__4__Impl_in_rule__MInterface__Group__42743);
            rule__MInterface__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__5_in_rule__MInterface__Group__42746);
            rule__MInterface__Group__5();

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
    // $ANTLR end "rule__MInterface__Group__4"


    // $ANTLR start "rule__MInterface__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1404:1: rule__MInterface__Group__4__Impl : ( ( rule__MInterface__NameAssignment_4 ) ) ;
    public final void rule__MInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1408:1: ( ( ( rule__MInterface__NameAssignment_4 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1409:1: ( ( rule__MInterface__NameAssignment_4 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1409:1: ( ( rule__MInterface__NameAssignment_4 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1410:1: ( rule__MInterface__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getNameAssignment_4()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1411:1: ( rule__MInterface__NameAssignment_4 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1411:2: rule__MInterface__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__NameAssignment_4_in_rule__MInterface__Group__4__Impl2773);
            rule__MInterface__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getNameAssignment_4()); 
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
    // $ANTLR end "rule__MInterface__Group__4__Impl"


    // $ANTLR start "rule__MInterface__Group__5"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1421:1: rule__MInterface__Group__5 : rule__MInterface__Group__5__Impl rule__MInterface__Group__6 ;
    public final void rule__MInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1425:1: ( rule__MInterface__Group__5__Impl rule__MInterface__Group__6 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1426:2: rule__MInterface__Group__5__Impl rule__MInterface__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__5__Impl_in_rule__MInterface__Group__52803);
            rule__MInterface__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__6_in_rule__MInterface__Group__52806);
            rule__MInterface__Group__6();

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
    // $ANTLR end "rule__MInterface__Group__5"


    // $ANTLR start "rule__MInterface__Group__5__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1433:1: rule__MInterface__Group__5__Impl : ( ( rule__MInterface__Group_5__0 )? ) ;
    public final void rule__MInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1437:1: ( ( ( rule__MInterface__Group_5__0 )? ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1438:1: ( ( rule__MInterface__Group_5__0 )? )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1438:1: ( ( rule__MInterface__Group_5__0 )? )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1439:1: ( rule__MInterface__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getGroup_5()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1440:1: ( rule__MInterface__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1440:2: rule__MInterface__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5__0_in_rule__MInterface__Group__5__Impl2833);
                    rule__MInterface__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getGroup_5()); 
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
    // $ANTLR end "rule__MInterface__Group__5__Impl"


    // $ANTLR start "rule__MInterface__Group__6"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1450:1: rule__MInterface__Group__6 : rule__MInterface__Group__6__Impl rule__MInterface__Group__7 ;
    public final void rule__MInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1454:1: ( rule__MInterface__Group__6__Impl rule__MInterface__Group__7 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1455:2: rule__MInterface__Group__6__Impl rule__MInterface__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__6__Impl_in_rule__MInterface__Group__62864);
            rule__MInterface__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__7_in_rule__MInterface__Group__62867);
            rule__MInterface__Group__7();

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
    // $ANTLR end "rule__MInterface__Group__6"


    // $ANTLR start "rule__MInterface__Group__6__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1462:1: rule__MInterface__Group__6__Impl : ( '{' ) ;
    public final void rule__MInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1466:1: ( ( '{' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1467:1: ( '{' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1467:1: ( '{' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1468:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MInterface__Group__6__Impl2895); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getLeftCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__MInterface__Group__6__Impl"


    // $ANTLR start "rule__MInterface__Group__7"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1481:1: rule__MInterface__Group__7 : rule__MInterface__Group__7__Impl rule__MInterface__Group__8 ;
    public final void rule__MInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1485:1: ( rule__MInterface__Group__7__Impl rule__MInterface__Group__8 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1486:2: rule__MInterface__Group__7__Impl rule__MInterface__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__7__Impl_in_rule__MInterface__Group__72926);
            rule__MInterface__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__8_in_rule__MInterface__Group__72929);
            rule__MInterface__Group__8();

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
    // $ANTLR end "rule__MInterface__Group__7"


    // $ANTLR start "rule__MInterface__Group__7__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1493:1: rule__MInterface__Group__7__Impl : ( 'version' ) ;
    public final void rule__MInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1497:1: ( ( 'version' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1498:1: ( 'version' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1498:1: ( 'version' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1499:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getVersionKeyword_7()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MInterface__Group__7__Impl2957); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getVersionKeyword_7()); 
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
    // $ANTLR end "rule__MInterface__Group__7__Impl"


    // $ANTLR start "rule__MInterface__Group__8"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1512:1: rule__MInterface__Group__8 : rule__MInterface__Group__8__Impl rule__MInterface__Group__9 ;
    public final void rule__MInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1516:1: ( rule__MInterface__Group__8__Impl rule__MInterface__Group__9 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1517:2: rule__MInterface__Group__8__Impl rule__MInterface__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__8__Impl_in_rule__MInterface__Group__82988);
            rule__MInterface__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__9_in_rule__MInterface__Group__82991);
            rule__MInterface__Group__9();

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
    // $ANTLR end "rule__MInterface__Group__8"


    // $ANTLR start "rule__MInterface__Group__8__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1524:1: rule__MInterface__Group__8__Impl : ( ':=' ) ;
    public final void rule__MInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1528:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1529:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1529:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1530:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getColonEqualsSignKeyword_8()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MInterface__Group__8__Impl3019); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getColonEqualsSignKeyword_8()); 
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
    // $ANTLR end "rule__MInterface__Group__8__Impl"


    // $ANTLR start "rule__MInterface__Group__9"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1543:1: rule__MInterface__Group__9 : rule__MInterface__Group__9__Impl rule__MInterface__Group__10 ;
    public final void rule__MInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1547:1: ( rule__MInterface__Group__9__Impl rule__MInterface__Group__10 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1548:2: rule__MInterface__Group__9__Impl rule__MInterface__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__9__Impl_in_rule__MInterface__Group__93050);
            rule__MInterface__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__10_in_rule__MInterface__Group__93053);
            rule__MInterface__Group__10();

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
    // $ANTLR end "rule__MInterface__Group__9"


    // $ANTLR start "rule__MInterface__Group__9__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1555:1: rule__MInterface__Group__9__Impl : ( ( rule__MInterface__VersionAssignment_9 ) ) ;
    public final void rule__MInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1559:1: ( ( ( rule__MInterface__VersionAssignment_9 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1560:1: ( ( rule__MInterface__VersionAssignment_9 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1560:1: ( ( rule__MInterface__VersionAssignment_9 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1561:1: ( rule__MInterface__VersionAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getVersionAssignment_9()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1562:1: ( rule__MInterface__VersionAssignment_9 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1562:2: rule__MInterface__VersionAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__VersionAssignment_9_in_rule__MInterface__Group__9__Impl3080);
            rule__MInterface__VersionAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getVersionAssignment_9()); 
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
    // $ANTLR end "rule__MInterface__Group__9__Impl"


    // $ANTLR start "rule__MInterface__Group__10"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1572:1: rule__MInterface__Group__10 : rule__MInterface__Group__10__Impl rule__MInterface__Group__11 ;
    public final void rule__MInterface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1576:1: ( rule__MInterface__Group__10__Impl rule__MInterface__Group__11 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1577:2: rule__MInterface__Group__10__Impl rule__MInterface__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__10__Impl_in_rule__MInterface__Group__103110);
            rule__MInterface__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__11_in_rule__MInterface__Group__103113);
            rule__MInterface__Group__11();

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
    // $ANTLR end "rule__MInterface__Group__10"


    // $ANTLR start "rule__MInterface__Group__10__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1584:1: rule__MInterface__Group__10__Impl : ( ';' ) ;
    public final void rule__MInterface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1588:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1589:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1589:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1590:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getSemicolonKeyword_10()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MInterface__Group__10__Impl3141); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getSemicolonKeyword_10()); 
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
    // $ANTLR end "rule__MInterface__Group__10__Impl"


    // $ANTLR start "rule__MInterface__Group__11"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1603:1: rule__MInterface__Group__11 : rule__MInterface__Group__11__Impl rule__MInterface__Group__12 ;
    public final void rule__MInterface__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1607:1: ( rule__MInterface__Group__11__Impl rule__MInterface__Group__12 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1608:2: rule__MInterface__Group__11__Impl rule__MInterface__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__11__Impl_in_rule__MInterface__Group__113172);
            rule__MInterface__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__12_in_rule__MInterface__Group__113175);
            rule__MInterface__Group__12();

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
    // $ANTLR end "rule__MInterface__Group__11"


    // $ANTLR start "rule__MInterface__Group__11__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1615:1: rule__MInterface__Group__11__Impl : ( '}' ) ;
    public final void rule__MInterface__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1619:1: ( ( '}' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1620:1: ( '}' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1620:1: ( '}' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1621:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MInterface__Group__11__Impl3203); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getRightCurlyBracketKeyword_11()); 
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
    // $ANTLR end "rule__MInterface__Group__11__Impl"


    // $ANTLR start "rule__MInterface__Group__12"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1634:1: rule__MInterface__Group__12 : rule__MInterface__Group__12__Impl ;
    public final void rule__MInterface__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1638:1: ( rule__MInterface__Group__12__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1639:2: rule__MInterface__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group__12__Impl_in_rule__MInterface__Group__123234);
            rule__MInterface__Group__12__Impl();

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
    // $ANTLR end "rule__MInterface__Group__12"


    // $ANTLR start "rule__MInterface__Group__12__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1645:1: rule__MInterface__Group__12__Impl : ( ';' ) ;
    public final void rule__MInterface__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1649:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1650:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1650:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1651:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getSemicolonKeyword_12()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MInterface__Group__12__Impl3262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getSemicolonKeyword_12()); 
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
    // $ANTLR end "rule__MInterface__Group__12__Impl"


    // $ANTLR start "rule__MInterface__Group_5__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1690:1: rule__MInterface__Group_5__0 : rule__MInterface__Group_5__0__Impl rule__MInterface__Group_5__1 ;
    public final void rule__MInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1694:1: ( rule__MInterface__Group_5__0__Impl rule__MInterface__Group_5__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1695:2: rule__MInterface__Group_5__0__Impl rule__MInterface__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5__0__Impl_in_rule__MInterface__Group_5__03319);
            rule__MInterface__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5__1_in_rule__MInterface__Group_5__03322);
            rule__MInterface__Group_5__1();

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
    // $ANTLR end "rule__MInterface__Group_5__0"


    // $ANTLR start "rule__MInterface__Group_5__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1702:1: rule__MInterface__Group_5__0__Impl : ( 'extends' ) ;
    public final void rule__MInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1706:1: ( ( 'extends' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1707:1: ( 'extends' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1707:1: ( 'extends' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1708:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getExtendsKeyword_5_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MInterface__Group_5__0__Impl3350); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getExtendsKeyword_5_0()); 
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
    // $ANTLR end "rule__MInterface__Group_5__0__Impl"


    // $ANTLR start "rule__MInterface__Group_5__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1721:1: rule__MInterface__Group_5__1 : rule__MInterface__Group_5__1__Impl rule__MInterface__Group_5__2 ;
    public final void rule__MInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1725:1: ( rule__MInterface__Group_5__1__Impl rule__MInterface__Group_5__2 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1726:2: rule__MInterface__Group_5__1__Impl rule__MInterface__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5__1__Impl_in_rule__MInterface__Group_5__13381);
            rule__MInterface__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5__2_in_rule__MInterface__Group_5__13384);
            rule__MInterface__Group_5__2();

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
    // $ANTLR end "rule__MInterface__Group_5__1"


    // $ANTLR start "rule__MInterface__Group_5__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1733:1: rule__MInterface__Group_5__1__Impl : ( ( rule__MInterface__ExtendsAssignment_5_1 ) ) ;
    public final void rule__MInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1737:1: ( ( ( rule__MInterface__ExtendsAssignment_5_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1738:1: ( ( rule__MInterface__ExtendsAssignment_5_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1738:1: ( ( rule__MInterface__ExtendsAssignment_5_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1739:1: ( rule__MInterface__ExtendsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getExtendsAssignment_5_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1740:1: ( rule__MInterface__ExtendsAssignment_5_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1740:2: rule__MInterface__ExtendsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__ExtendsAssignment_5_1_in_rule__MInterface__Group_5__1__Impl3411);
            rule__MInterface__ExtendsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getExtendsAssignment_5_1()); 
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
    // $ANTLR end "rule__MInterface__Group_5__1__Impl"


    // $ANTLR start "rule__MInterface__Group_5__2"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1750:1: rule__MInterface__Group_5__2 : rule__MInterface__Group_5__2__Impl ;
    public final void rule__MInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1754:1: ( rule__MInterface__Group_5__2__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1755:2: rule__MInterface__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5__2__Impl_in_rule__MInterface__Group_5__23441);
            rule__MInterface__Group_5__2__Impl();

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
    // $ANTLR end "rule__MInterface__Group_5__2"


    // $ANTLR start "rule__MInterface__Group_5__2__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1761:1: rule__MInterface__Group_5__2__Impl : ( ( rule__MInterface__Group_5_2__0 )* ) ;
    public final void rule__MInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1765:1: ( ( ( rule__MInterface__Group_5_2__0 )* ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1766:1: ( ( rule__MInterface__Group_5_2__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1766:1: ( ( rule__MInterface__Group_5_2__0 )* )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1767:1: ( rule__MInterface__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getGroup_5_2()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1768:1: ( rule__MInterface__Group_5_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1768:2: rule__MInterface__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5_2__0_in_rule__MInterface__Group_5__2__Impl3468);
            	    rule__MInterface__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getGroup_5_2()); 
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
    // $ANTLR end "rule__MInterface__Group_5__2__Impl"


    // $ANTLR start "rule__MInterface__Group_5_2__0"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1784:1: rule__MInterface__Group_5_2__0 : rule__MInterface__Group_5_2__0__Impl rule__MInterface__Group_5_2__1 ;
    public final void rule__MInterface__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1788:1: ( rule__MInterface__Group_5_2__0__Impl rule__MInterface__Group_5_2__1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1789:2: rule__MInterface__Group_5_2__0__Impl rule__MInterface__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5_2__0__Impl_in_rule__MInterface__Group_5_2__03505);
            rule__MInterface__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5_2__1_in_rule__MInterface__Group_5_2__03508);
            rule__MInterface__Group_5_2__1();

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
    // $ANTLR end "rule__MInterface__Group_5_2__0"


    // $ANTLR start "rule__MInterface__Group_5_2__0__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1796:1: rule__MInterface__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__MInterface__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1800:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1801:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1801:1: ( ',' )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1802:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getCommaKeyword_5_2_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MInterface__Group_5_2__0__Impl3536); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getCommaKeyword_5_2_0()); 
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
    // $ANTLR end "rule__MInterface__Group_5_2__0__Impl"


    // $ANTLR start "rule__MInterface__Group_5_2__1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1815:1: rule__MInterface__Group_5_2__1 : rule__MInterface__Group_5_2__1__Impl ;
    public final void rule__MInterface__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1819:1: ( rule__MInterface__Group_5_2__1__Impl )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1820:2: rule__MInterface__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__Group_5_2__1__Impl_in_rule__MInterface__Group_5_2__13567);
            rule__MInterface__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__MInterface__Group_5_2__1"


    // $ANTLR start "rule__MInterface__Group_5_2__1__Impl"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1826:1: rule__MInterface__Group_5_2__1__Impl : ( ( rule__MInterface__ExtendsAssignment_5_2_1 ) ) ;
    public final void rule__MInterface__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1830:1: ( ( ( rule__MInterface__ExtendsAssignment_5_2_1 ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1831:1: ( ( rule__MInterface__ExtendsAssignment_5_2_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1831:1: ( ( rule__MInterface__ExtendsAssignment_5_2_1 ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1832:1: ( rule__MInterface__ExtendsAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getExtendsAssignment_5_2_1()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1833:1: ( rule__MInterface__ExtendsAssignment_5_2_1 )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1833:2: rule__MInterface__ExtendsAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MInterface__ExtendsAssignment_5_2_1_in_rule__MInterface__Group_5_2__1__Impl3594);
            rule__MInterface__ExtendsAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getExtendsAssignment_5_2_1()); 
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
    // $ANTLR end "rule__MInterface__Group_5_2__1__Impl"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__PackageAssignment_1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1848:1: rule__MMCLEVIFACEPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMCLEVIFACEPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1852:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1853:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1853:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1854:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1855:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1856:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MMCLEVIFACEPackageFile__PackageAssignment_13637);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__PackageAssignment_1"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1867:1: rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1871:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1872:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1872:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1873:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1874:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1875:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_13676);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1"


    // $ANTLR start "rule__MMCLEVIFACEPackageFile__ElementAssignment_4"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1886:1: rule__MMCLEVIFACEPackageFile__ElementAssignment_4 : ( ruleMMCLEVIFACEPackageElement ) ;
    public final void rule__MMCLEVIFACEPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1890:1: ( ( ruleMMCLEVIFACEPackageElement ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1891:1: ( ruleMMCLEVIFACEPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1891:1: ( ruleMMCLEVIFACEPackageElement )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1892:1: ruleMMCLEVIFACEPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMCLEVIFACEPackageFileAccess().getElementMMCLEVIFACEPackageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMCLEVIFACEPackageElement_in_rule__MMCLEVIFACEPackageFile__ElementAssignment_43711);
            ruleMMCLEVIFACEPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMCLEVIFACEPackageFileAccess().getElementMMCLEVIFACEPackageElementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__MMCLEVIFACEPackageFile__ElementAssignment_4"


    // $ANTLR start "rule__MInterface__DomainAssignment_1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1901:1: rule__MInterface__DomainAssignment_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MInterface__DomainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1905:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1906:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1906:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1907:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getDomainMDomainCrossReference_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1908:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1909:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getDomainMDomainVersionedQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MInterface__DomainAssignment_13746);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getDomainMDomainVersionedQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getDomainMDomainCrossReference_1_0()); 
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
    // $ANTLR end "rule__MInterface__DomainAssignment_1"


    // $ANTLR start "rule__MInterface__TypeAssignment_3"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1920:1: rule__MInterface__TypeAssignment_3 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__MInterface__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1924:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1925:1: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1925:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1926:1: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getTypeMInterfaceTypeCrossReference_3_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1927:1: ( ruleVersionedQualifiedReferenceName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1928:1: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getTypeMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedReferenceName_in_rule__MInterface__TypeAssignment_33785);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getTypeMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getTypeMInterfaceTypeCrossReference_3_0()); 
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
    // $ANTLR end "rule__MInterface__TypeAssignment_3"


    // $ANTLR start "rule__MInterface__NameAssignment_4"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1939:1: rule__MInterface__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__MInterface__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1943:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1944:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1944:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1945:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MInterface__NameAssignment_43820); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getNameIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__MInterface__NameAssignment_4"


    // $ANTLR start "rule__MInterface__ExtendsAssignment_5_1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1954:1: rule__MInterface__ExtendsAssignment_5_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MInterface__ExtendsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1958:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1959:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1959:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1960:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1961:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1962:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MInterface__ExtendsAssignment_5_13855);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_1_0()); 
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
    // $ANTLR end "rule__MInterface__ExtendsAssignment_5_1"


    // $ANTLR start "rule__MInterface__ExtendsAssignment_5_2_1"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1973:1: rule__MInterface__ExtendsAssignment_5_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MInterface__ExtendsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1977:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1978:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1978:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1979:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_2_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1980:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1981:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MInterface__ExtendsAssignment_5_2_13894);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_2_1_0()); 
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
    // $ANTLR end "rule__MInterface__ExtendsAssignment_5_2_1"


    // $ANTLR start "rule__MInterface__VersionAssignment_9"
    // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1992:1: rule__MInterface__VersionAssignment_9 : ( ruleVersion ) ;
    public final void rule__MInterface__VersionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1996:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1997:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1997:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mclev.editor.iface.ui/src-gen/es/uah/aut/srg/micobs/mclev/lang/ui/contentassist/antlr/internal/InternalIFACE.g:1998:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInterfaceAccess().getVersionVersionParserRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__MInterface__VersionAssignment_93929);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInterfaceAccess().getVersionVersionParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__MInterface__VersionAssignment_9"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMMCLEVIFACEPackageFile_in_entryRuleMMCLEVIFACEPackageFile67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMCLEVIFACEPackageFile74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__0_in_ruleMMCLEVIFACEPackageFile100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMCLEVIFACEPackageElement_in_entryRuleMMCLEVIFACEPackageElement127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMCLEVIFACEPackageElement134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMInterface_in_ruleMMCLEVIFACEPackageElement160 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleMInterface_in_entryRuleMInterface426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMInterface433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__0_in_ruleMInterface459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_0495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__0__Impl_in_rule__MMCLEVIFACEPackageFile__Group__0593 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__1_in_rule__MMCLEVIFACEPackageFile__Group__0596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MMCLEVIFACEPackageFile__Group__0__Impl624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__1__Impl_in_rule__MMCLEVIFACEPackageFile__Group__1655 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__2_in_rule__MMCLEVIFACEPackageFile__Group__1658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__PackageAssignment_1_in_rule__MMCLEVIFACEPackageFile__Group__1__Impl685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__2__Impl_in_rule__MMCLEVIFACEPackageFile__Group__2715 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__3_in_rule__MMCLEVIFACEPackageFile__Group__2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MMCLEVIFACEPackageFile__Group__2__Impl746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__3__Impl_in_rule__MMCLEVIFACEPackageFile__Group__3777 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__4_in_rule__MMCLEVIFACEPackageFile__Group__3780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__0_in_rule__MMCLEVIFACEPackageFile__Group__3__Impl807 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group__4__Impl_in_rule__MMCLEVIFACEPackageFile__Group__4838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__ElementAssignment_4_in_rule__MMCLEVIFACEPackageFile__Group__4__Impl865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__0__Impl_in_rule__MMCLEVIFACEPackageFile__Group_3__0905 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__1_in_rule__MMCLEVIFACEPackageFile__Group_3__0908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MMCLEVIFACEPackageFile__Group_3__0__Impl936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__1__Impl_in_rule__MMCLEVIFACEPackageFile__Group_3__1967 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__2_in_rule__MMCLEVIFACEPackageFile__Group_3__1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1_in_rule__MMCLEVIFACEPackageFile__Group_3__1__Impl997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMCLEVIFACEPackageFile__Group_3__2__Impl_in_rule__MMCLEVIFACEPackageFile__Group_3__21027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MMCLEVIFACEPackageFile__Group_3__2__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__MInterface__Group__0__Impl_in_rule__MInterface__Group__02499 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterface__Group__1_in_rule__MInterface__Group__02502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MInterface__Group__0__Impl2530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__1__Impl_in_rule__MInterface__Group__12561 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MInterface__Group__2_in_rule__MInterface__Group__12564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__DomainAssignment_1_in_rule__MInterface__Group__1__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__2__Impl_in_rule__MInterface__Group__22621 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterface__Group__3_in_rule__MInterface__Group__22624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MInterface__Group__2__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__3__Impl_in_rule__MInterface__Group__32683 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterface__Group__4_in_rule__MInterface__Group__32686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__TypeAssignment_3_in_rule__MInterface__Group__3__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__4__Impl_in_rule__MInterface__Group__42743 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_rule__MInterface__Group__5_in_rule__MInterface__Group__42746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__NameAssignment_4_in_rule__MInterface__Group__4__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__5__Impl_in_rule__MInterface__Group__52803 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_rule__MInterface__Group__6_in_rule__MInterface__Group__52806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5__0_in_rule__MInterface__Group__5__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__6__Impl_in_rule__MInterface__Group__62864 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MInterface__Group__7_in_rule__MInterface__Group__62867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MInterface__Group__6__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__7__Impl_in_rule__MInterface__Group__72926 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MInterface__Group__8_in_rule__MInterface__Group__72929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MInterface__Group__7__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__8__Impl_in_rule__MInterface__Group__82988 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MInterface__Group__9_in_rule__MInterface__Group__82991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MInterface__Group__8__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__9__Impl_in_rule__MInterface__Group__93050 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MInterface__Group__10_in_rule__MInterface__Group__93053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__VersionAssignment_9_in_rule__MInterface__Group__9__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__10__Impl_in_rule__MInterface__Group__103110 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MInterface__Group__11_in_rule__MInterface__Group__103113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MInterface__Group__10__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__11__Impl_in_rule__MInterface__Group__113172 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MInterface__Group__12_in_rule__MInterface__Group__113175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MInterface__Group__11__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group__12__Impl_in_rule__MInterface__Group__123234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MInterface__Group__12__Impl3262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5__0__Impl_in_rule__MInterface__Group_5__03319 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5__1_in_rule__MInterface__Group_5__03322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MInterface__Group_5__0__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5__1__Impl_in_rule__MInterface__Group_5__13381 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5__2_in_rule__MInterface__Group_5__13384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__ExtendsAssignment_5_1_in_rule__MInterface__Group_5__1__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5__2__Impl_in_rule__MInterface__Group_5__23441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5_2__0_in_rule__MInterface__Group_5__2__Impl3468 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5_2__0__Impl_in_rule__MInterface__Group_5_2__03505 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5_2__1_in_rule__MInterface__Group_5_2__03508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MInterface__Group_5_2__0__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__Group_5_2__1__Impl_in_rule__MInterface__Group_5_2__13567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MInterface__ExtendsAssignment_5_2_1_in_rule__MInterface__Group_5_2__1__Impl3594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MMCLEVIFACEPackageFile__PackageAssignment_13637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_13676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMCLEVIFACEPackageElement_in_rule__MMCLEVIFACEPackageFile__ElementAssignment_43711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MInterface__DomainAssignment_13746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedReferenceName_in_rule__MInterface__TypeAssignment_33785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MInterface__NameAssignment_43820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MInterface__ExtendsAssignment_5_13855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MInterface__ExtendsAssignment_5_2_13894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__MInterface__VersionAssignment_93929 = new BitSet(new long[]{0x0000000000000002L});
    }


}