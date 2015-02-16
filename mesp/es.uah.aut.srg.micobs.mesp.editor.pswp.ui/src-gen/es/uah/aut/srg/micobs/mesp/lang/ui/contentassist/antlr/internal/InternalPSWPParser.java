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
package es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal; 

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
import es.uah.aut.srg.micobs.mesp.lang.services.PSWPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPSWPParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'pswpackage'", "'{'", "'}'", "'version'", "':='", "'supported platform'", "'construction tools'", "','", "'osswpackages'"
    };
    public static final int RULE_ID=5;
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


        public InternalPSWPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPSWPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPSWPParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g"; }


     
     	private PSWPGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PSWPGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMMESPPSWPPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:61:1: entryRuleMMESPPSWPPackageFile : ruleMMESPPSWPPackageFile EOF ;
    public final void entryRuleMMESPPSWPPackageFile() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:62:1: ( ruleMMESPPSWPPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:63:1: ruleMMESPPSWPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPPSWPPackageFile_in_entryRuleMMESPPSWPPackageFile67);
            ruleMMESPPSWPPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPPSWPPackageFile74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMESPPSWPPackageFile"


    // $ANTLR start "ruleMMESPPSWPPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:70:1: ruleMMESPPSWPPackageFile : ( ( rule__MMESPPSWPPackageFile__Group__0 ) ) ;
    public final void ruleMMESPPSWPPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:74:2: ( ( ( rule__MMESPPSWPPackageFile__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:75:1: ( ( rule__MMESPPSWPPackageFile__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:75:1: ( ( rule__MMESPPSWPPackageFile__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:76:1: ( rule__MMESPPSWPPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:77:1: ( rule__MMESPPSWPPackageFile__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:77:2: rule__MMESPPSWPPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__0_in_ruleMMESPPSWPPackageFile100);
            rule__MMESPPSWPPackageFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup()); 
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
    // $ANTLR end "ruleMMESPPSWPPackageFile"


    // $ANTLR start "entryRuleMMESPPSWPPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:89:1: entryRuleMMESPPSWPPackageElement : ruleMMESPPSWPPackageElement EOF ;
    public final void entryRuleMMESPPSWPPackageElement() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:90:1: ( ruleMMESPPSWPPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:91:1: ruleMMESPPSWPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPPSWPPackageElement_in_entryRuleMMESPPSWPPackageElement127);
            ruleMMESPPSWPPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPPSWPPackageElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMESPPSWPPackageElement"


    // $ANTLR start "ruleMMESPPSWPPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:98:1: ruleMMESPPSWPPackageElement : ( ruleMPlatformSwPackage ) ;
    public final void ruleMMESPPSWPPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:102:2: ( ( ruleMPlatformSwPackage ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:103:1: ( ruleMPlatformSwPackage )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:103:1: ( ruleMPlatformSwPackage )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:104:1: ruleMPlatformSwPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageElementAccess().getMPlatformSwPackageParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMPlatformSwPackage_in_ruleMMESPPSWPPackageElement160);
            ruleMPlatformSwPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageElementAccess().getMPlatformSwPackageParserRuleCall()); 
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
    // $ANTLR end "ruleMMESPPSWPPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:118:1: ( ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:119:1: ruleQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:133:1: ( rule__QualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:133:2: rule__QualifiedName__Group__0
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:145:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:146:1: ( ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:147:1: ruleVersion EOF
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:154:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:158:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:159:1: ( ( rule__Version__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:159:1: ( ( rule__Version__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:160:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:161:1: ( rule__Version__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:161:2: rule__Version__Group__0
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:173:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:174:1: ( ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:175:1: ruleVersionedQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:182:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:186:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:188:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:189:1: ( rule__VersionedQualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:189:2: rule__VersionedQualifiedName__Group__0
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


    // $ANTLR start "entryRuleMPlatformSwPackage"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:203:1: entryRuleMPlatformSwPackage : ruleMPlatformSwPackage EOF ;
    public final void entryRuleMPlatformSwPackage() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:204:1: ( ruleMPlatformSwPackage EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:205:1: ruleMPlatformSwPackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMPlatformSwPackage_in_entryRuleMPlatformSwPackage368);
            ruleMPlatformSwPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMPlatformSwPackage375); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMPlatformSwPackage"


    // $ANTLR start "ruleMPlatformSwPackage"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:212:1: ruleMPlatformSwPackage : ( ( rule__MPlatformSwPackage__Group__0 ) ) ;
    public final void ruleMPlatformSwPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:216:2: ( ( ( rule__MPlatformSwPackage__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:217:1: ( ( rule__MPlatformSwPackage__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:217:1: ( ( rule__MPlatformSwPackage__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:218:1: ( rule__MPlatformSwPackage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:219:1: ( rule__MPlatformSwPackage__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:219:2: rule__MPlatformSwPackage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__0_in_ruleMPlatformSwPackage401);
            rule__MPlatformSwPackage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getGroup()); 
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
    // $ANTLR end "ruleMPlatformSwPackage"


    // $ANTLR start "rule__Version__Alternatives_0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:231:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:235:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:236:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:236:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:237:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Alternatives_0437); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:242:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:242:6: ( ( rule__Version__Group_0_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:243:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:244:1: ( rule__Version__Group_0_1__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:244:2: rule__Version__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0454);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:253:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:257:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:258:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:258:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:259:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1487); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:264:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:264:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:265:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:266:1: ( rule__Version__Group_1_1_1__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:266:2: rule__Version__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1504);
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


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:277:1: rule__MMESPPSWPPackageFile__Group__0 : rule__MMESPPSWPPackageFile__Group__0__Impl rule__MMESPPSWPPackageFile__Group__1 ;
    public final void rule__MMESPPSWPPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:281:1: ( rule__MMESPPSWPPackageFile__Group__0__Impl rule__MMESPPSWPPackageFile__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:282:2: rule__MMESPPSWPPackageFile__Group__0__Impl rule__MMESPPSWPPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__0__Impl_in_rule__MMESPPSWPPackageFile__Group__0535);
            rule__MMESPPSWPPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__1_in_rule__MMESPPSWPPackageFile__Group__0538);
            rule__MMESPPSWPPackageFile__Group__1();

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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__0"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:289:1: rule__MMESPPSWPPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__MMESPPSWPPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:293:1: ( ( 'package' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:294:1: ( 'package' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:294:1: ( 'package' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:295:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageKeyword_0()); 
            }
            match(input,11,FollowSets000.FOLLOW_11_in_rule__MMESPPSWPPackageFile__Group__0__Impl566); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__0__Impl"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:308:1: rule__MMESPPSWPPackageFile__Group__1 : rule__MMESPPSWPPackageFile__Group__1__Impl rule__MMESPPSWPPackageFile__Group__2 ;
    public final void rule__MMESPPSWPPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:312:1: ( rule__MMESPPSWPPackageFile__Group__1__Impl rule__MMESPPSWPPackageFile__Group__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:313:2: rule__MMESPPSWPPackageFile__Group__1__Impl rule__MMESPPSWPPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__1__Impl_in_rule__MMESPPSWPPackageFile__Group__1597);
            rule__MMESPPSWPPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__2_in_rule__MMESPPSWPPackageFile__Group__1600);
            rule__MMESPPSWPPackageFile__Group__2();

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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__1"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:320:1: rule__MMESPPSWPPackageFile__Group__1__Impl : ( ( rule__MMESPPSWPPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__MMESPPSWPPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:324:1: ( ( ( rule__MMESPPSWPPackageFile__PackageAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:325:1: ( ( rule__MMESPPSWPPackageFile__PackageAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:325:1: ( ( rule__MMESPPSWPPackageFile__PackageAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:326:1: ( rule__MMESPPSWPPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:327:1: ( rule__MMESPPSWPPackageFile__PackageAssignment_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:327:2: rule__MMESPPSWPPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__PackageAssignment_1_in_rule__MMESPPSWPPackageFile__Group__1__Impl627);
            rule__MMESPPSWPPackageFile__PackageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageAssignment_1()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__1__Impl"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:337:1: rule__MMESPPSWPPackageFile__Group__2 : rule__MMESPPSWPPackageFile__Group__2__Impl rule__MMESPPSWPPackageFile__Group__3 ;
    public final void rule__MMESPPSWPPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:341:1: ( rule__MMESPPSWPPackageFile__Group__2__Impl rule__MMESPPSWPPackageFile__Group__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:342:2: rule__MMESPPSWPPackageFile__Group__2__Impl rule__MMESPPSWPPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__2__Impl_in_rule__MMESPPSWPPackageFile__Group__2657);
            rule__MMESPPSWPPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__3_in_rule__MMESPPSWPPackageFile__Group__2660);
            rule__MMESPPSWPPackageFile__Group__3();

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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__2"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:349:1: rule__MMESPPSWPPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__MMESPPSWPPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:353:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:354:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:354:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:355:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MMESPPSWPPackageFile__Group__2__Impl688); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__2__Impl"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:368:1: rule__MMESPPSWPPackageFile__Group__3 : rule__MMESPPSWPPackageFile__Group__3__Impl rule__MMESPPSWPPackageFile__Group__4 ;
    public final void rule__MMESPPSWPPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:372:1: ( rule__MMESPPSWPPackageFile__Group__3__Impl rule__MMESPPSWPPackageFile__Group__4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:373:2: rule__MMESPPSWPPackageFile__Group__3__Impl rule__MMESPPSWPPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__3__Impl_in_rule__MMESPPSWPPackageFile__Group__3719);
            rule__MMESPPSWPPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__4_in_rule__MMESPPSWPPackageFile__Group__3722);
            rule__MMESPPSWPPackageFile__Group__4();

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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__3"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:380:1: rule__MMESPPSWPPackageFile__Group__3__Impl : ( ( rule__MMESPPSWPPackageFile__Group_3__0 )* ) ;
    public final void rule__MMESPPSWPPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:384:1: ( ( ( rule__MMESPPSWPPackageFile__Group_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:385:1: ( ( rule__MMESPPSWPPackageFile__Group_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:385:1: ( ( rule__MMESPPSWPPackageFile__Group_3__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:386:1: ( rule__MMESPPSWPPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup_3()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:387:1: ( rule__MMESPPSWPPackageFile__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:387:2: rule__MMESPPSWPPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group_3__0_in_rule__MMESPPSWPPackageFile__Group__3__Impl749);
            	    rule__MMESPPSWPPackageFile__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup_3()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__3__Impl"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__4"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:397:1: rule__MMESPPSWPPackageFile__Group__4 : rule__MMESPPSWPPackageFile__Group__4__Impl ;
    public final void rule__MMESPPSWPPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:401:1: ( rule__MMESPPSWPPackageFile__Group__4__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:402:2: rule__MMESPPSWPPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group__4__Impl_in_rule__MMESPPSWPPackageFile__Group__4780);
            rule__MMESPPSWPPackageFile__Group__4__Impl();

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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__4"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:408:1: rule__MMESPPSWPPackageFile__Group__4__Impl : ( ( rule__MMESPPSWPPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__MMESPPSWPPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:412:1: ( ( ( rule__MMESPPSWPPackageFile__ElementAssignment_4 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:413:1: ( ( rule__MMESPPSWPPackageFile__ElementAssignment_4 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:413:1: ( ( rule__MMESPPSWPPackageFile__ElementAssignment_4 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:414:1: ( rule__MMESPPSWPPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getElementAssignment_4()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:415:1: ( rule__MMESPPSWPPackageFile__ElementAssignment_4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:415:2: rule__MMESPPSWPPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__ElementAssignment_4_in_rule__MMESPPSWPPackageFile__Group__4__Impl807);
            rule__MMESPPSWPPackageFile__ElementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getElementAssignment_4()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group__4__Impl"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group_3__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:435:1: rule__MMESPPSWPPackageFile__Group_3__0 : rule__MMESPPSWPPackageFile__Group_3__0__Impl rule__MMESPPSWPPackageFile__Group_3__1 ;
    public final void rule__MMESPPSWPPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:439:1: ( rule__MMESPPSWPPackageFile__Group_3__0__Impl rule__MMESPPSWPPackageFile__Group_3__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:440:2: rule__MMESPPSWPPackageFile__Group_3__0__Impl rule__MMESPPSWPPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group_3__0__Impl_in_rule__MMESPPSWPPackageFile__Group_3__0847);
            rule__MMESPPSWPPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group_3__1_in_rule__MMESPPSWPPackageFile__Group_3__0850);
            rule__MMESPPSWPPackageFile__Group_3__1();

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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group_3__0"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:447:1: rule__MMESPPSWPPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__MMESPPSWPPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:451:1: ( ( 'import' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:452:1: ( 'import' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:452:1: ( 'import' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:453:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportKeyword_3_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MMESPPSWPPackageFile__Group_3__0__Impl878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getImportKeyword_3_0()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group_3__0__Impl"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group_3__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:466:1: rule__MMESPPSWPPackageFile__Group_3__1 : rule__MMESPPSWPPackageFile__Group_3__1__Impl rule__MMESPPSWPPackageFile__Group_3__2 ;
    public final void rule__MMESPPSWPPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:470:1: ( rule__MMESPPSWPPackageFile__Group_3__1__Impl rule__MMESPPSWPPackageFile__Group_3__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:471:2: rule__MMESPPSWPPackageFile__Group_3__1__Impl rule__MMESPPSWPPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group_3__1__Impl_in_rule__MMESPPSWPPackageFile__Group_3__1909);
            rule__MMESPPSWPPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group_3__2_in_rule__MMESPPSWPPackageFile__Group_3__1912);
            rule__MMESPPSWPPackageFile__Group_3__2();

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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group_3__1"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:478:1: rule__MMESPPSWPPackageFile__Group_3__1__Impl : ( ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__MMESPPSWPPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:482:1: ( ( ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:483:1: ( ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:483:1: ( ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:484:1: ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsAssignment_3_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:485:1: ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:485:2: rule__MMESPPSWPPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__ImportsAssignment_3_1_in_rule__MMESPPSWPPackageFile__Group_3__1__Impl939);
            rule__MMESPPSWPPackageFile__ImportsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsAssignment_3_1()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group_3__1__Impl"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group_3__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:495:1: rule__MMESPPSWPPackageFile__Group_3__2 : rule__MMESPPSWPPackageFile__Group_3__2__Impl ;
    public final void rule__MMESPPSWPPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:499:1: ( rule__MMESPPSWPPackageFile__Group_3__2__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:500:2: rule__MMESPPSWPPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPPSWPPackageFile__Group_3__2__Impl_in_rule__MMESPPSWPPackageFile__Group_3__2969);
            rule__MMESPPSWPPackageFile__Group_3__2__Impl();

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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group_3__2"


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group_3__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:506:1: rule__MMESPPSWPPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MMESPPSWPPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:510:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:511:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:511:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:512:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MMESPPSWPPackageFile__Group_3__2__Impl997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_3_2()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:531:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:535:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:536:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01034);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01037);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:543:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:547:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:548:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:548:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:549:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1064); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:560:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:564:1: ( rule__QualifiedName__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:565:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11093);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:571:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:575:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:576:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:576:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:577:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:578:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:578:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1120);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:592:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:596:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:597:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01155);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01158);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:604:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:608:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:609:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:609:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:610:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1186); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:623:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:627:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:628:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11217);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:634:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:638:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:639:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:639:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:640:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1244); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:655:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:659:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:660:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__01277);
            rule__Version__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1_in_rule__Version__Group__01280);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:667:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:671:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:672:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:672:1: ( ( rule__Version__Alternatives_0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:673:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:674:1: ( rule__Version__Alternatives_0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:674:2: rule__Version__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Alternatives_0_in_rule__Version__Group__0__Impl1307);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:684:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:688:1: ( rule__Version__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:689:2: rule__Version__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__11337);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:695:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:699:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:700:1: ( ( rule__Version__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:700:1: ( ( rule__Version__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:701:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:702:1: ( rule__Version__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:702:2: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl1364);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:716:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:720:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:721:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__0__Impl_in_rule__Version__Group_0_1__01399);
            rule__Version__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__1_in_rule__Version__Group_0_1__01402);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:728:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:732:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:733:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:733:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:734:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:735:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:735:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Group_0_1__0__Impl1430); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:745:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:749:1: ( rule__Version__Group_0_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:750:2: rule__Version__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__1__Impl_in_rule__Version__Group_0_1__11461);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:756:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:760:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:761:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:761:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:762:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Version__Group_0_1__1__Impl1488); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:777:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:781:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:782:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__01521);
            rule__Version__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__01524);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:789:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:793:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:794:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:794:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:795:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Version__Group_1__0__Impl1552); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:808:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:812:1: ( rule__Version__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:813:2: rule__Version__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__11583);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:819:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:823:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:824:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:824:1: ( ( rule__Version__Alternatives_1_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:825:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:826:1: ( rule__Version__Alternatives_1_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:826:2: rule__Version__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Alternatives_1_1_in_rule__Version__Group_1__1__Impl1610);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:840:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:844:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:845:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__01644);
            rule__Version__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__01647);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:852:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:856:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:857:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:857:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:858:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:859:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:859:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__0__Impl1675); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:869:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:873:1: ( rule__Version__Group_1_1_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:874:2: rule__Version__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__11706);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:880:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:884:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:885:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:885:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:886:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Version__Group_1_1_1__1__Impl1733); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:901:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:905:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:906:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__0__Impl_in_rule__VersionedQualifiedName__Group__01766);
            rule__VersionedQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__1_in_rule__VersionedQualifiedName__Group__01769);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:913:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:917:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:918:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:918:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:919:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__VersionedQualifiedName__Group__0__Impl1796);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:930:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:934:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:935:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__1__Impl_in_rule__VersionedQualifiedName__Group__11825);
            rule__VersionedQualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__2_in_rule__VersionedQualifiedName__Group__11828);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:942:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:946:1: ( ( '(' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:947:1: ( '(' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:947:1: ( '(' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:948:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__VersionedQualifiedName__Group__1__Impl1856); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:961:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:965:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:966:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__2__Impl_in_rule__VersionedQualifiedName__Group__21887);
            rule__VersionedQualifiedName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__3_in_rule__VersionedQualifiedName__Group__21890);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:973:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:977:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:978:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:978:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:979:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__VersionedQualifiedName__Group__2__Impl1917);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:990:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:994:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:995:2: rule__VersionedQualifiedName__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__3__Impl_in_rule__VersionedQualifiedName__Group__31946);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1001:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1005:1: ( ( ')' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1006:1: ( ')' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1006:1: ( ')' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1007:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__VersionedQualifiedName__Group__3__Impl1974); if (state.failed) return ;
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


    // $ANTLR start "rule__MPlatformSwPackage__Group__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1031:1: rule__MPlatformSwPackage__Group__0 : rule__MPlatformSwPackage__Group__0__Impl rule__MPlatformSwPackage__Group__1 ;
    public final void rule__MPlatformSwPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1035:1: ( rule__MPlatformSwPackage__Group__0__Impl rule__MPlatformSwPackage__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1036:2: rule__MPlatformSwPackage__Group__0__Impl rule__MPlatformSwPackage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__0__Impl_in_rule__MPlatformSwPackage__Group__02016);
            rule__MPlatformSwPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__1_in_rule__MPlatformSwPackage__Group__02019);
            rule__MPlatformSwPackage__Group__1();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group__0"


    // $ANTLR start "rule__MPlatformSwPackage__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1043:1: rule__MPlatformSwPackage__Group__0__Impl : ( 'pswpackage' ) ;
    public final void rule__MPlatformSwPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1047:1: ( ( 'pswpackage' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1048:1: ( 'pswpackage' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1048:1: ( 'pswpackage' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1049:1: 'pswpackage'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getPswpackageKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MPlatformSwPackage__Group__0__Impl2047); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getPswpackageKeyword_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group__0__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1062:1: rule__MPlatformSwPackage__Group__1 : rule__MPlatformSwPackage__Group__1__Impl rule__MPlatformSwPackage__Group__2 ;
    public final void rule__MPlatformSwPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1066:1: ( rule__MPlatformSwPackage__Group__1__Impl rule__MPlatformSwPackage__Group__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1067:2: rule__MPlatformSwPackage__Group__1__Impl rule__MPlatformSwPackage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__1__Impl_in_rule__MPlatformSwPackage__Group__12078);
            rule__MPlatformSwPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__2_in_rule__MPlatformSwPackage__Group__12081);
            rule__MPlatformSwPackage__Group__2();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group__1"


    // $ANTLR start "rule__MPlatformSwPackage__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1074:1: rule__MPlatformSwPackage__Group__1__Impl : ( ( rule__MPlatformSwPackage__NameAssignment_1 ) ) ;
    public final void rule__MPlatformSwPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1078:1: ( ( ( rule__MPlatformSwPackage__NameAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1079:1: ( ( rule__MPlatformSwPackage__NameAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1079:1: ( ( rule__MPlatformSwPackage__NameAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1080:1: ( rule__MPlatformSwPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getNameAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1081:1: ( rule__MPlatformSwPackage__NameAssignment_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1081:2: rule__MPlatformSwPackage__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__NameAssignment_1_in_rule__MPlatformSwPackage__Group__1__Impl2108);
            rule__MPlatformSwPackage__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group__1__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1091:1: rule__MPlatformSwPackage__Group__2 : rule__MPlatformSwPackage__Group__2__Impl rule__MPlatformSwPackage__Group__3 ;
    public final void rule__MPlatformSwPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1095:1: ( rule__MPlatformSwPackage__Group__2__Impl rule__MPlatformSwPackage__Group__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1096:2: rule__MPlatformSwPackage__Group__2__Impl rule__MPlatformSwPackage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__2__Impl_in_rule__MPlatformSwPackage__Group__22138);
            rule__MPlatformSwPackage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__3_in_rule__MPlatformSwPackage__Group__22141);
            rule__MPlatformSwPackage__Group__3();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group__2"


    // $ANTLR start "rule__MPlatformSwPackage__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1103:1: rule__MPlatformSwPackage__Group__2__Impl : ( '{' ) ;
    public final void rule__MPlatformSwPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1107:1: ( ( '{' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1108:1: ( '{' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1108:1: ( '{' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1109:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MPlatformSwPackage__Group__2__Impl2169); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group__2__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1122:1: rule__MPlatformSwPackage__Group__3 : rule__MPlatformSwPackage__Group__3__Impl rule__MPlatformSwPackage__Group__4 ;
    public final void rule__MPlatformSwPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1126:1: ( rule__MPlatformSwPackage__Group__3__Impl rule__MPlatformSwPackage__Group__4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1127:2: rule__MPlatformSwPackage__Group__3__Impl rule__MPlatformSwPackage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__3__Impl_in_rule__MPlatformSwPackage__Group__32200);
            rule__MPlatformSwPackage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__4_in_rule__MPlatformSwPackage__Group__32203);
            rule__MPlatformSwPackage__Group__4();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group__3"


    // $ANTLR start "rule__MPlatformSwPackage__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1134:1: rule__MPlatformSwPackage__Group__3__Impl : ( ( rule__MPlatformSwPackage__UnorderedGroup_3 ) ) ;
    public final void rule__MPlatformSwPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1138:1: ( ( ( rule__MPlatformSwPackage__UnorderedGroup_3 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1139:1: ( ( rule__MPlatformSwPackage__UnorderedGroup_3 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1139:1: ( ( rule__MPlatformSwPackage__UnorderedGroup_3 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1140:1: ( rule__MPlatformSwPackage__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1141:1: ( rule__MPlatformSwPackage__UnorderedGroup_3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1141:2: rule__MPlatformSwPackage__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3_in_rule__MPlatformSwPackage__Group__3__Impl2230);
            rule__MPlatformSwPackage__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group__3__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group__4"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1151:1: rule__MPlatformSwPackage__Group__4 : rule__MPlatformSwPackage__Group__4__Impl rule__MPlatformSwPackage__Group__5 ;
    public final void rule__MPlatformSwPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1155:1: ( rule__MPlatformSwPackage__Group__4__Impl rule__MPlatformSwPackage__Group__5 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1156:2: rule__MPlatformSwPackage__Group__4__Impl rule__MPlatformSwPackage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__4__Impl_in_rule__MPlatformSwPackage__Group__42260);
            rule__MPlatformSwPackage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__5_in_rule__MPlatformSwPackage__Group__42263);
            rule__MPlatformSwPackage__Group__5();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group__4"


    // $ANTLR start "rule__MPlatformSwPackage__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1163:1: rule__MPlatformSwPackage__Group__4__Impl : ( '}' ) ;
    public final void rule__MPlatformSwPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1167:1: ( ( '}' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1168:1: ( '}' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1168:1: ( '}' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1169:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MPlatformSwPackage__Group__4__Impl2291); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group__4__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group__5"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1182:1: rule__MPlatformSwPackage__Group__5 : rule__MPlatformSwPackage__Group__5__Impl ;
    public final void rule__MPlatformSwPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1186:1: ( rule__MPlatformSwPackage__Group__5__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1187:2: rule__MPlatformSwPackage__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group__5__Impl_in_rule__MPlatformSwPackage__Group__52322);
            rule__MPlatformSwPackage__Group__5__Impl();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group__5"


    // $ANTLR start "rule__MPlatformSwPackage__Group__5__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1193:1: rule__MPlatformSwPackage__Group__5__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1197:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1198:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1198:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1199:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_5()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MPlatformSwPackage__Group__5__Impl2350); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group__5__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_0__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1224:1: rule__MPlatformSwPackage__Group_3_0__0 : rule__MPlatformSwPackage__Group_3_0__0__Impl rule__MPlatformSwPackage__Group_3_0__1 ;
    public final void rule__MPlatformSwPackage__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1228:1: ( rule__MPlatformSwPackage__Group_3_0__0__Impl rule__MPlatformSwPackage__Group_3_0__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1229:2: rule__MPlatformSwPackage__Group_3_0__0__Impl rule__MPlatformSwPackage__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_0__0__Impl_in_rule__MPlatformSwPackage__Group_3_0__02393);
            rule__MPlatformSwPackage__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_0__1_in_rule__MPlatformSwPackage__Group_3_0__02396);
            rule__MPlatformSwPackage__Group_3_0__1();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_0__0"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_0__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1236:1: rule__MPlatformSwPackage__Group_3_0__0__Impl : ( 'version' ) ;
    public final void rule__MPlatformSwPackage__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1240:1: ( ( 'version' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1241:1: ( 'version' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1241:1: ( 'version' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1242:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getVersionKeyword_3_0_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MPlatformSwPackage__Group_3_0__0__Impl2424); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getVersionKeyword_3_0_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_0__0__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_0__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1255:1: rule__MPlatformSwPackage__Group_3_0__1 : rule__MPlatformSwPackage__Group_3_0__1__Impl rule__MPlatformSwPackage__Group_3_0__2 ;
    public final void rule__MPlatformSwPackage__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1259:1: ( rule__MPlatformSwPackage__Group_3_0__1__Impl rule__MPlatformSwPackage__Group_3_0__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1260:2: rule__MPlatformSwPackage__Group_3_0__1__Impl rule__MPlatformSwPackage__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_0__1__Impl_in_rule__MPlatformSwPackage__Group_3_0__12455);
            rule__MPlatformSwPackage__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_0__2_in_rule__MPlatformSwPackage__Group_3_0__12458);
            rule__MPlatformSwPackage__Group_3_0__2();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_0__1"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_0__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1267:1: rule__MPlatformSwPackage__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__MPlatformSwPackage__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1271:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1272:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1272:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1273:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MPlatformSwPackage__Group_3_0__1__Impl2486); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_0_1()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_0__1__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_0__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1286:1: rule__MPlatformSwPackage__Group_3_0__2 : rule__MPlatformSwPackage__Group_3_0__2__Impl rule__MPlatformSwPackage__Group_3_0__3 ;
    public final void rule__MPlatformSwPackage__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1290:1: ( rule__MPlatformSwPackage__Group_3_0__2__Impl rule__MPlatformSwPackage__Group_3_0__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1291:2: rule__MPlatformSwPackage__Group_3_0__2__Impl rule__MPlatformSwPackage__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_0__2__Impl_in_rule__MPlatformSwPackage__Group_3_0__22517);
            rule__MPlatformSwPackage__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_0__3_in_rule__MPlatformSwPackage__Group_3_0__22520);
            rule__MPlatformSwPackage__Group_3_0__3();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_0__2"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_0__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1298:1: rule__MPlatformSwPackage__Group_3_0__2__Impl : ( ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1302:1: ( ( ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1303:1: ( ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1303:1: ( ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1304:1: ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getVersionAssignment_3_0_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1305:1: ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1305:2: rule__MPlatformSwPackage__VersionAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__VersionAssignment_3_0_2_in_rule__MPlatformSwPackage__Group_3_0__2__Impl2547);
            rule__MPlatformSwPackage__VersionAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getVersionAssignment_3_0_2()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_0__2__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_0__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1315:1: rule__MPlatformSwPackage__Group_3_0__3 : rule__MPlatformSwPackage__Group_3_0__3__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1319:1: ( rule__MPlatformSwPackage__Group_3_0__3__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1320:2: rule__MPlatformSwPackage__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_0__3__Impl_in_rule__MPlatformSwPackage__Group_3_0__32577);
            rule__MPlatformSwPackage__Group_3_0__3__Impl();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_0__3"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_0__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1326:1: rule__MPlatformSwPackage__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1330:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1331:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1331:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1332:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MPlatformSwPackage__Group_3_0__3__Impl2605); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_0_3()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_0__3__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1353:1: rule__MPlatformSwPackage__Group_3_1__0 : rule__MPlatformSwPackage__Group_3_1__0__Impl rule__MPlatformSwPackage__Group_3_1__1 ;
    public final void rule__MPlatformSwPackage__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1357:1: ( rule__MPlatformSwPackage__Group_3_1__0__Impl rule__MPlatformSwPackage__Group_3_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1358:2: rule__MPlatformSwPackage__Group_3_1__0__Impl rule__MPlatformSwPackage__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_1__0__Impl_in_rule__MPlatformSwPackage__Group_3_1__02644);
            rule__MPlatformSwPackage__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_1__1_in_rule__MPlatformSwPackage__Group_3_1__02647);
            rule__MPlatformSwPackage__Group_3_1__1();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__0"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1365:1: rule__MPlatformSwPackage__Group_3_1__0__Impl : ( 'supported platform' ) ;
    public final void rule__MPlatformSwPackage__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1369:1: ( ( 'supported platform' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1370:1: ( 'supported platform' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1370:1: ( 'supported platform' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1371:1: 'supported platform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSupportedPlatformKeyword_3_1_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MPlatformSwPackage__Group_3_1__0__Impl2675); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getSupportedPlatformKeyword_3_1_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__0__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1384:1: rule__MPlatformSwPackage__Group_3_1__1 : rule__MPlatformSwPackage__Group_3_1__1__Impl rule__MPlatformSwPackage__Group_3_1__2 ;
    public final void rule__MPlatformSwPackage__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1388:1: ( rule__MPlatformSwPackage__Group_3_1__1__Impl rule__MPlatformSwPackage__Group_3_1__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1389:2: rule__MPlatformSwPackage__Group_3_1__1__Impl rule__MPlatformSwPackage__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_1__1__Impl_in_rule__MPlatformSwPackage__Group_3_1__12706);
            rule__MPlatformSwPackage__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_1__2_in_rule__MPlatformSwPackage__Group_3_1__12709);
            rule__MPlatformSwPackage__Group_3_1__2();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__1"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1396:1: rule__MPlatformSwPackage__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__MPlatformSwPackage__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1400:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1401:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1401:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1402:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_1_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MPlatformSwPackage__Group_3_1__1__Impl2737); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_1_1()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__1__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1415:1: rule__MPlatformSwPackage__Group_3_1__2 : rule__MPlatformSwPackage__Group_3_1__2__Impl rule__MPlatformSwPackage__Group_3_1__3 ;
    public final void rule__MPlatformSwPackage__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1419:1: ( rule__MPlatformSwPackage__Group_3_1__2__Impl rule__MPlatformSwPackage__Group_3_1__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1420:2: rule__MPlatformSwPackage__Group_3_1__2__Impl rule__MPlatformSwPackage__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_1__2__Impl_in_rule__MPlatformSwPackage__Group_3_1__22768);
            rule__MPlatformSwPackage__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_1__3_in_rule__MPlatformSwPackage__Group_3_1__22771);
            rule__MPlatformSwPackage__Group_3_1__3();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__2"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1427:1: rule__MPlatformSwPackage__Group_3_1__2__Impl : ( ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1431:1: ( ( ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1432:1: ( ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1432:1: ( ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1433:1: ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementAssignment_3_1_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1434:1: ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1434:2: rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2_in_rule__MPlatformSwPackage__Group_3_1__2__Impl2798);
            rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementAssignment_3_1_2()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__2__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1444:1: rule__MPlatformSwPackage__Group_3_1__3 : rule__MPlatformSwPackage__Group_3_1__3__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1448:1: ( rule__MPlatformSwPackage__Group_3_1__3__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1449:2: rule__MPlatformSwPackage__Group_3_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_1__3__Impl_in_rule__MPlatformSwPackage__Group_3_1__32828);
            rule__MPlatformSwPackage__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__3"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1455:1: rule__MPlatformSwPackage__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1459:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1460:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1460:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1461:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MPlatformSwPackage__Group_3_1__3__Impl2856); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_1_3()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__3__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1482:1: rule__MPlatformSwPackage__Group_3_2__0 : rule__MPlatformSwPackage__Group_3_2__0__Impl rule__MPlatformSwPackage__Group_3_2__1 ;
    public final void rule__MPlatformSwPackage__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1486:1: ( rule__MPlatformSwPackage__Group_3_2__0__Impl rule__MPlatformSwPackage__Group_3_2__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1487:2: rule__MPlatformSwPackage__Group_3_2__0__Impl rule__MPlatformSwPackage__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__0__Impl_in_rule__MPlatformSwPackage__Group_3_2__02895);
            rule__MPlatformSwPackage__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__1_in_rule__MPlatformSwPackage__Group_3_2__02898);
            rule__MPlatformSwPackage__Group_3_2__1();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__0"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1494:1: rule__MPlatformSwPackage__Group_3_2__0__Impl : ( 'construction tools' ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1498:1: ( ( 'construction tools' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1499:1: ( 'construction tools' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1499:1: ( 'construction tools' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1500:1: 'construction tools'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getConstructionToolsKeyword_3_2_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MPlatformSwPackage__Group_3_2__0__Impl2926); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getConstructionToolsKeyword_3_2_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__0__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1513:1: rule__MPlatformSwPackage__Group_3_2__1 : rule__MPlatformSwPackage__Group_3_2__1__Impl rule__MPlatformSwPackage__Group_3_2__2 ;
    public final void rule__MPlatformSwPackage__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1517:1: ( rule__MPlatformSwPackage__Group_3_2__1__Impl rule__MPlatformSwPackage__Group_3_2__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1518:2: rule__MPlatformSwPackage__Group_3_2__1__Impl rule__MPlatformSwPackage__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__1__Impl_in_rule__MPlatformSwPackage__Group_3_2__12957);
            rule__MPlatformSwPackage__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__2_in_rule__MPlatformSwPackage__Group_3_2__12960);
            rule__MPlatformSwPackage__Group_3_2__2();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__1"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1525:1: rule__MPlatformSwPackage__Group_3_2__1__Impl : ( ':=' ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1529:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1530:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1530:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1531:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_2_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MPlatformSwPackage__Group_3_2__1__Impl2988); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_2_1()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__1__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1544:1: rule__MPlatformSwPackage__Group_3_2__2 : rule__MPlatformSwPackage__Group_3_2__2__Impl rule__MPlatformSwPackage__Group_3_2__3 ;
    public final void rule__MPlatformSwPackage__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1548:1: ( rule__MPlatformSwPackage__Group_3_2__2__Impl rule__MPlatformSwPackage__Group_3_2__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1549:2: rule__MPlatformSwPackage__Group_3_2__2__Impl rule__MPlatformSwPackage__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__2__Impl_in_rule__MPlatformSwPackage__Group_3_2__23019);
            rule__MPlatformSwPackage__Group_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__3_in_rule__MPlatformSwPackage__Group_3_2__23022);
            rule__MPlatformSwPackage__Group_3_2__3();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__2"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1556:1: rule__MPlatformSwPackage__Group_3_2__2__Impl : ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_2 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1560:1: ( ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_2 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1561:1: ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1561:1: ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_2 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1562:1: ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1563:1: ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1563:2: rule__MPlatformSwPackage__CtoolsAssignment_3_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__CtoolsAssignment_3_2_2_in_rule__MPlatformSwPackage__Group_3_2__2__Impl3049);
            rule__MPlatformSwPackage__CtoolsAssignment_3_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_2()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__2__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1573:1: rule__MPlatformSwPackage__Group_3_2__3 : rule__MPlatformSwPackage__Group_3_2__3__Impl rule__MPlatformSwPackage__Group_3_2__4 ;
    public final void rule__MPlatformSwPackage__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1577:1: ( rule__MPlatformSwPackage__Group_3_2__3__Impl rule__MPlatformSwPackage__Group_3_2__4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1578:2: rule__MPlatformSwPackage__Group_3_2__3__Impl rule__MPlatformSwPackage__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__3__Impl_in_rule__MPlatformSwPackage__Group_3_2__33079);
            rule__MPlatformSwPackage__Group_3_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__4_in_rule__MPlatformSwPackage__Group_3_2__33082);
            rule__MPlatformSwPackage__Group_3_2__4();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__3"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1585:1: rule__MPlatformSwPackage__Group_3_2__3__Impl : ( ( rule__MPlatformSwPackage__Group_3_2_3__0 )* ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1589:1: ( ( ( rule__MPlatformSwPackage__Group_3_2_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1590:1: ( ( rule__MPlatformSwPackage__Group_3_2_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1590:1: ( ( rule__MPlatformSwPackage__Group_3_2_3__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1591:1: ( rule__MPlatformSwPackage__Group_3_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2_3()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1592:1: ( rule__MPlatformSwPackage__Group_3_2_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1592:2: rule__MPlatformSwPackage__Group_3_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2_3__0_in_rule__MPlatformSwPackage__Group_3_2__3__Impl3109);
            	    rule__MPlatformSwPackage__Group_3_2_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2_3()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__3__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__4"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1602:1: rule__MPlatformSwPackage__Group_3_2__4 : rule__MPlatformSwPackage__Group_3_2__4__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1606:1: ( rule__MPlatformSwPackage__Group_3_2__4__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1607:2: rule__MPlatformSwPackage__Group_3_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__4__Impl_in_rule__MPlatformSwPackage__Group_3_2__43140);
            rule__MPlatformSwPackage__Group_3_2__4__Impl();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__4"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__4__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1613:1: rule__MPlatformSwPackage__Group_3_2__4__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1617:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1618:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1618:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1619:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_2_4()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MPlatformSwPackage__Group_3_2__4__Impl3168); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_2_4()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__4__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2_3__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1642:1: rule__MPlatformSwPackage__Group_3_2_3__0 : rule__MPlatformSwPackage__Group_3_2_3__0__Impl rule__MPlatformSwPackage__Group_3_2_3__1 ;
    public final void rule__MPlatformSwPackage__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1646:1: ( rule__MPlatformSwPackage__Group_3_2_3__0__Impl rule__MPlatformSwPackage__Group_3_2_3__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1647:2: rule__MPlatformSwPackage__Group_3_2_3__0__Impl rule__MPlatformSwPackage__Group_3_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2_3__0__Impl_in_rule__MPlatformSwPackage__Group_3_2_3__03209);
            rule__MPlatformSwPackage__Group_3_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2_3__1_in_rule__MPlatformSwPackage__Group_3_2_3__03212);
            rule__MPlatformSwPackage__Group_3_2_3__1();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2_3__0"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1654:1: rule__MPlatformSwPackage__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__MPlatformSwPackage__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1658:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1659:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1659:1: ( ',' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1660:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_2_3_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MPlatformSwPackage__Group_3_2_3__0__Impl3240); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_2_3_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2_3__0__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2_3__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1673:1: rule__MPlatformSwPackage__Group_3_2_3__1 : rule__MPlatformSwPackage__Group_3_2_3__1__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1677:1: ( rule__MPlatformSwPackage__Group_3_2_3__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1678:2: rule__MPlatformSwPackage__Group_3_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2_3__1__Impl_in_rule__MPlatformSwPackage__Group_3_2_3__13271);
            rule__MPlatformSwPackage__Group_3_2_3__1__Impl();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2_3__1"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1684:1: rule__MPlatformSwPackage__Group_3_2_3__1__Impl : ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1688:1: ( ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1689:1: ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1689:1: ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1690:1: ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_3_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1691:1: ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1691:2: rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1_in_rule__MPlatformSwPackage__Group_3_2_3__1__Impl3298);
            rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_3_1()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2_3__1__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1705:1: rule__MPlatformSwPackage__Group_3_3__0 : rule__MPlatformSwPackage__Group_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3__1 ;
    public final void rule__MPlatformSwPackage__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1709:1: ( rule__MPlatformSwPackage__Group_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1710:2: rule__MPlatformSwPackage__Group_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__0__Impl_in_rule__MPlatformSwPackage__Group_3_3__03332);
            rule__MPlatformSwPackage__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__1_in_rule__MPlatformSwPackage__Group_3_3__03335);
            rule__MPlatformSwPackage__Group_3_3__1();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__0"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1717:1: rule__MPlatformSwPackage__Group_3_3__0__Impl : ( 'osswpackages' ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1721:1: ( ( 'osswpackages' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1722:1: ( 'osswpackages' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1722:1: ( 'osswpackages' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1723:1: 'osswpackages'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsswpackagesKeyword_3_3_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MPlatformSwPackage__Group_3_3__0__Impl3363); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getOsswpackagesKeyword_3_3_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__0__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1736:1: rule__MPlatformSwPackage__Group_3_3__1 : rule__MPlatformSwPackage__Group_3_3__1__Impl rule__MPlatformSwPackage__Group_3_3__2 ;
    public final void rule__MPlatformSwPackage__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1740:1: ( rule__MPlatformSwPackage__Group_3_3__1__Impl rule__MPlatformSwPackage__Group_3_3__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1741:2: rule__MPlatformSwPackage__Group_3_3__1__Impl rule__MPlatformSwPackage__Group_3_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__1__Impl_in_rule__MPlatformSwPackage__Group_3_3__13394);
            rule__MPlatformSwPackage__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__2_in_rule__MPlatformSwPackage__Group_3_3__13397);
            rule__MPlatformSwPackage__Group_3_3__2();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__1"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1748:1: rule__MPlatformSwPackage__Group_3_3__1__Impl : ( ':=' ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1752:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1753:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1753:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1754:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_3_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MPlatformSwPackage__Group_3_3__1__Impl3425); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_3_1()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__1__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1767:1: rule__MPlatformSwPackage__Group_3_3__2 : rule__MPlatformSwPackage__Group_3_3__2__Impl rule__MPlatformSwPackage__Group_3_3__3 ;
    public final void rule__MPlatformSwPackage__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1771:1: ( rule__MPlatformSwPackage__Group_3_3__2__Impl rule__MPlatformSwPackage__Group_3_3__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1772:2: rule__MPlatformSwPackage__Group_3_3__2__Impl rule__MPlatformSwPackage__Group_3_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__2__Impl_in_rule__MPlatformSwPackage__Group_3_3__23456);
            rule__MPlatformSwPackage__Group_3_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__3_in_rule__MPlatformSwPackage__Group_3_3__23459);
            rule__MPlatformSwPackage__Group_3_3__3();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__2"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1779:1: rule__MPlatformSwPackage__Group_3_3__2__Impl : ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1783:1: ( ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1784:1: ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1784:1: ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1785:1: ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1786:1: ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1786:2: rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2_in_rule__MPlatformSwPackage__Group_3_3__2__Impl3486);
            rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_2()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__2__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1796:1: rule__MPlatformSwPackage__Group_3_3__3 : rule__MPlatformSwPackage__Group_3_3__3__Impl rule__MPlatformSwPackage__Group_3_3__4 ;
    public final void rule__MPlatformSwPackage__Group_3_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1800:1: ( rule__MPlatformSwPackage__Group_3_3__3__Impl rule__MPlatformSwPackage__Group_3_3__4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1801:2: rule__MPlatformSwPackage__Group_3_3__3__Impl rule__MPlatformSwPackage__Group_3_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__3__Impl_in_rule__MPlatformSwPackage__Group_3_3__33516);
            rule__MPlatformSwPackage__Group_3_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__4_in_rule__MPlatformSwPackage__Group_3_3__33519);
            rule__MPlatformSwPackage__Group_3_3__4();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__3"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1808:1: rule__MPlatformSwPackage__Group_3_3__3__Impl : ( ( rule__MPlatformSwPackage__Group_3_3_3__0 )* ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1812:1: ( ( ( rule__MPlatformSwPackage__Group_3_3_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1813:1: ( ( rule__MPlatformSwPackage__Group_3_3_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1813:1: ( ( rule__MPlatformSwPackage__Group_3_3_3__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1814:1: ( rule__MPlatformSwPackage__Group_3_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3_3()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1815:1: ( rule__MPlatformSwPackage__Group_3_3_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1815:2: rule__MPlatformSwPackage__Group_3_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3_3__0_in_rule__MPlatformSwPackage__Group_3_3__3__Impl3546);
            	    rule__MPlatformSwPackage__Group_3_3_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3_3()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__3__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__4"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1825:1: rule__MPlatformSwPackage__Group_3_3__4 : rule__MPlatformSwPackage__Group_3_3__4__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1829:1: ( rule__MPlatformSwPackage__Group_3_3__4__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1830:2: rule__MPlatformSwPackage__Group_3_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__4__Impl_in_rule__MPlatformSwPackage__Group_3_3__43577);
            rule__MPlatformSwPackage__Group_3_3__4__Impl();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__4"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__4__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1836:1: rule__MPlatformSwPackage__Group_3_3__4__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1840:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1841:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1841:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1842:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_3_4()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MPlatformSwPackage__Group_3_3__4__Impl3605); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_3_4()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3__4__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3_3__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1865:1: rule__MPlatformSwPackage__Group_3_3_3__0 : rule__MPlatformSwPackage__Group_3_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3_3__1 ;
    public final void rule__MPlatformSwPackage__Group_3_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1869:1: ( rule__MPlatformSwPackage__Group_3_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3_3__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1870:2: rule__MPlatformSwPackage__Group_3_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3_3__0__Impl_in_rule__MPlatformSwPackage__Group_3_3_3__03646);
            rule__MPlatformSwPackage__Group_3_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3_3__1_in_rule__MPlatformSwPackage__Group_3_3_3__03649);
            rule__MPlatformSwPackage__Group_3_3_3__1();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3_3__0"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1877:1: rule__MPlatformSwPackage__Group_3_3_3__0__Impl : ( ',' ) ;
    public final void rule__MPlatformSwPackage__Group_3_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1881:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1882:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1882:1: ( ',' )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1883:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_3_3_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MPlatformSwPackage__Group_3_3_3__0__Impl3677); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_3_3_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3_3__0__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3_3__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1896:1: rule__MPlatformSwPackage__Group_3_3_3__1 : rule__MPlatformSwPackage__Group_3_3_3__1__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1900:1: ( rule__MPlatformSwPackage__Group_3_3_3__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1901:2: rule__MPlatformSwPackage__Group_3_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3_3__1__Impl_in_rule__MPlatformSwPackage__Group_3_3_3__13708);
            rule__MPlatformSwPackage__Group_3_3_3__1__Impl();

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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3_3__1"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1907:1: rule__MPlatformSwPackage__Group_3_3_3__1__Impl : ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1911:1: ( ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1912:1: ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1912:1: ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1913:1: ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_3_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1914:1: ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1914:2: rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1_in_rule__MPlatformSwPackage__Group_3_3_3__1__Impl3735);
            rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_3_1()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_3_3__1__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__UnorderedGroup_3"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1929:1: rule__MPlatformSwPackage__UnorderedGroup_3 : rule__MPlatformSwPackage__UnorderedGroup_3__0 {...}?;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1934:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__0 {...}?)
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1935:2: rule__MPlatformSwPackage__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__0_in_rule__MPlatformSwPackage__UnorderedGroup_33770);
            rule__MPlatformSwPackage__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__MPlatformSwPackage__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__UnorderedGroup_3"


    // $ANTLR start "rule__MPlatformSwPackage__UnorderedGroup_3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1946:1: rule__MPlatformSwPackage__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1951:1: ( ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1952:3: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1952:3: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( LA10_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                alt10=2;
            }
            else if ( LA10_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                alt10=3;
            }
            else if ( LA10_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                alt10=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1954:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1954:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1955:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MPlatformSwPackage__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1955:115: ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1956:6: ( ( rule__MPlatformSwPackage__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1962:6: ( ( rule__MPlatformSwPackage__Group_3_0__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1964:7: ( rule__MPlatformSwPackage__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_0()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1965:7: ( rule__MPlatformSwPackage__Group_3_0__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1965:8: rule__MPlatformSwPackage__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_0__0_in_rule__MPlatformSwPackage__UnorderedGroup_3__Impl3859);
                    rule__MPlatformSwPackage__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1971:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1971:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1972:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MPlatformSwPackage__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1972:115: ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1973:6: ( ( rule__MPlatformSwPackage__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1979:6: ( ( rule__MPlatformSwPackage__Group_3_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1981:7: ( rule__MPlatformSwPackage__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1982:7: ( rule__MPlatformSwPackage__Group_3_1__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1982:8: rule__MPlatformSwPackage__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_1__0_in_rule__MPlatformSwPackage__UnorderedGroup_3__Impl3950);
                    rule__MPlatformSwPackage__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1988:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1988:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1989:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MPlatformSwPackage__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1989:115: ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1990:6: ( ( rule__MPlatformSwPackage__Group_3_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1996:6: ( ( rule__MPlatformSwPackage__Group_3_2__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1998:7: ( rule__MPlatformSwPackage__Group_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1999:7: ( rule__MPlatformSwPackage__Group_3_2__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1999:8: rule__MPlatformSwPackage__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__0_in_rule__MPlatformSwPackage__UnorderedGroup_3__Impl4041);
                    rule__MPlatformSwPackage__Group_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2005:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2005:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2006:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MPlatformSwPackage__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2006:115: ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2007:6: ( ( rule__MPlatformSwPackage__Group_3_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2013:6: ( ( rule__MPlatformSwPackage__Group_3_3__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2015:7: ( rule__MPlatformSwPackage__Group_3_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2016:7: ( rule__MPlatformSwPackage__Group_3_3__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2016:8: rule__MPlatformSwPackage__Group_3_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_3__0_in_rule__MPlatformSwPackage__UnorderedGroup_3__Impl4132);
                    rule__MPlatformSwPackage__Group_3_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__UnorderedGroup_3__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2031:1: rule__MPlatformSwPackage__UnorderedGroup_3__0 : rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )? ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2035:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2036:2: rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__Impl_in_rule__MPlatformSwPackage__UnorderedGroup_3__04191);
            rule__MPlatformSwPackage__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2037:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                alt11=1;
            }
            else if ( LA11_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:0:0: rule__MPlatformSwPackage__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__1_in_rule__MPlatformSwPackage__UnorderedGroup_3__04194);
                    rule__MPlatformSwPackage__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__MPlatformSwPackage__UnorderedGroup_3__0"


    // $ANTLR start "rule__MPlatformSwPackage__UnorderedGroup_3__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2044:1: rule__MPlatformSwPackage__UnorderedGroup_3__1 : rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )? ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2048:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2049:2: rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__Impl_in_rule__MPlatformSwPackage__UnorderedGroup_3__14219);
            rule__MPlatformSwPackage__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2050:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                alt12=1;
            }
            else if ( LA12_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:0:0: rule__MPlatformSwPackage__UnorderedGroup_3__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__2_in_rule__MPlatformSwPackage__UnorderedGroup_3__14222);
                    rule__MPlatformSwPackage__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__MPlatformSwPackage__UnorderedGroup_3__1"


    // $ANTLR start "rule__MPlatformSwPackage__UnorderedGroup_3__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2057:1: rule__MPlatformSwPackage__UnorderedGroup_3__2 : rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )? ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2061:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2062:2: rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__Impl_in_rule__MPlatformSwPackage__UnorderedGroup_3__24247);
            rule__MPlatformSwPackage__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2063:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:0:0: rule__MPlatformSwPackage__UnorderedGroup_3__3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__3_in_rule__MPlatformSwPackage__UnorderedGroup_3__24250);
                    rule__MPlatformSwPackage__UnorderedGroup_3__3();

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
    // $ANTLR end "rule__MPlatformSwPackage__UnorderedGroup_3__2"


    // $ANTLR start "rule__MPlatformSwPackage__UnorderedGroup_3__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2070:1: rule__MPlatformSwPackage__UnorderedGroup_3__3 : rule__MPlatformSwPackage__UnorderedGroup_3__Impl ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2074:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2075:2: rule__MPlatformSwPackage__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__Impl_in_rule__MPlatformSwPackage__UnorderedGroup_3__34275);
            rule__MPlatformSwPackage__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__MPlatformSwPackage__UnorderedGroup_3__3"


    // $ANTLR start "rule__MMESPPSWPPackageFile__PackageAssignment_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2090:1: rule__MMESPPSWPPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPPSWPPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2094:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2095:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2095:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2096:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2097:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2098:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MMESPPSWPPackageFile__PackageAssignment_14315);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__PackageAssignment_1"


    // $ANTLR start "rule__MMESPPSWPPackageFile__ImportsAssignment_3_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2109:1: rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPPSWPPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2113:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2114:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2114:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2115:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2116:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2117:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MMESPPSWPPackageFile__ImportsAssignment_3_14354);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__ImportsAssignment_3_1"


    // $ANTLR start "rule__MMESPPSWPPackageFile__ElementAssignment_4"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2128:1: rule__MMESPPSWPPackageFile__ElementAssignment_4 : ( ruleMMESPPSWPPackageElement ) ;
    public final void rule__MMESPPSWPPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2132:1: ( ( ruleMMESPPSWPPackageElement ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2133:1: ( ruleMMESPPSWPPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2133:1: ( ruleMMESPPSWPPackageElement )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2134:1: ruleMMESPPSWPPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getElementMMESPPSWPPackageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPPSWPPackageElement_in_rule__MMESPPSWPPackageFile__ElementAssignment_44389);
            ruleMMESPPSWPPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileAccess().getElementMMESPPSWPPackageElementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__MMESPPSWPPackageFile__ElementAssignment_4"


    // $ANTLR start "rule__MPlatformSwPackage__NameAssignment_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2143:1: rule__MPlatformSwPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MPlatformSwPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2147:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2148:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2148:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2149:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MPlatformSwPackage__NameAssignment_14420); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__NameAssignment_1"


    // $ANTLR start "rule__MPlatformSwPackage__VersionAssignment_3_0_2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2158:1: rule__MPlatformSwPackage__VersionAssignment_3_0_2 : ( ruleVersion ) ;
    public final void rule__MPlatformSwPackage__VersionAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2162:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2163:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2163:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2164:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__MPlatformSwPackage__VersionAssignment_3_0_24451);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__VersionAssignment_3_0_2"


    // $ANTLR start "rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2173:1: rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2177:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2178:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2178:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2179:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_2_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2180:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2181:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformVersionedQualifiedNameParserRuleCall_3_1_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_24486);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformVersionedQualifiedNameParserRuleCall_3_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_2_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2"


    // $ANTLR start "rule__MPlatformSwPackage__CtoolsAssignment_3_2_2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2192:1: rule__MPlatformSwPackage__CtoolsAssignment_3_2_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__CtoolsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2196:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2197:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2197:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2198:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_2_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2199:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2200:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__CtoolsAssignment_3_2_24525);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_2_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__CtoolsAssignment_3_2_2"


    // $ANTLR start "rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2211:1: rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2215:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2216:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2216:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2217:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2218:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2219:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_14564);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_1_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1"


    // $ANTLR start "rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2230:1: rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2234:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2235:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2235:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2236:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2237:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2238:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_24603);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2"


    // $ANTLR start "rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2249:1: rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2253:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2254:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2254:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2255:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2256:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2257:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_14642);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0()); 
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
    // $ANTLR end "rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1"

    // $ANTLR start synpred10_InternalPSWP
    public final void synpred10_InternalPSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1954:4: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1954:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1954:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1955:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1955:115: ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1956:6: ( ( rule__MPlatformSwPackage__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0);
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1962:6: ( ( rule__MPlatformSwPackage__Group_3_0__0 ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1964:7: ( rule__MPlatformSwPackage__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_0()); 
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1965:7: ( rule__MPlatformSwPackage__Group_3_0__0 )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1965:8: rule__MPlatformSwPackage__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_0__0_in_synpred10_InternalPSWP3859);
        rule__MPlatformSwPackage__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalPSWP

    // $ANTLR start synpred11_InternalPSWP
    public final void synpred11_InternalPSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1971:4: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1971:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1971:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1972:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1972:115: ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1973:6: ( ( rule__MPlatformSwPackage__Group_3_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1);
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1979:6: ( ( rule__MPlatformSwPackage__Group_3_1__0 ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1981:7: ( rule__MPlatformSwPackage__Group_3_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_1()); 
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1982:7: ( rule__MPlatformSwPackage__Group_3_1__0 )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1982:8: rule__MPlatformSwPackage__Group_3_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_1__0_in_synpred11_InternalPSWP3950);
        rule__MPlatformSwPackage__Group_3_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalPSWP

    // $ANTLR start synpred12_InternalPSWP
    public final void synpred12_InternalPSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1988:4: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1988:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1988:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1989:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1989:115: ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1990:6: ( ( rule__MPlatformSwPackage__Group_3_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2);
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1996:6: ( ( rule__MPlatformSwPackage__Group_3_2__0 ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1998:7: ( rule__MPlatformSwPackage__Group_3_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2()); 
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1999:7: ( rule__MPlatformSwPackage__Group_3_2__0 )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:1999:8: rule__MPlatformSwPackage__Group_3_2__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__Group_3_2__0_in_synpred12_InternalPSWP4041);
        rule__MPlatformSwPackage__Group_3_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalPSWP

    // $ANTLR start synpred13_InternalPSWP
    public final void synpred13_InternalPSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2037:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2037:2: rule__MPlatformSwPackage__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__1_in_synpred13_InternalPSWP4194);
        rule__MPlatformSwPackage__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalPSWP

    // $ANTLR start synpred14_InternalPSWP
    public final void synpred14_InternalPSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2050:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2050:2: rule__MPlatformSwPackage__UnorderedGroup_3__2
        {
        pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__2_in_synpred14_InternalPSWP4222);
        rule__MPlatformSwPackage__UnorderedGroup_3__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalPSWP

    // $ANTLR start synpred15_InternalPSWP
    public final void synpred15_InternalPSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2063:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )
        // ../es.uah.aut.srg.micobs.mesp.editor.pswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalPSWP.g:2063:2: rule__MPlatformSwPackage__UnorderedGroup_3__3
        {
        pushFollow(FollowSets000.FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__3_in_synpred15_InternalPSWP4250);
        rule__MPlatformSwPackage__UnorderedGroup_3__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalPSWP

    // Delegated rules

    public final boolean synpred15_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalPSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalPSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalPSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalPSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalPSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalPSWP_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleMMESPPSWPPackageFile_in_entryRuleMMESPPSWPPackageFile67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPPSWPPackageFile74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__0_in_ruleMMESPPSWPPackageFile100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPPSWPPackageElement_in_entryRuleMMESPPSWPPackageElement127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPPSWPPackageElement134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMPlatformSwPackage_in_ruleMMESPPSWPPackageElement160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__0_in_ruleVersionedQualifiedName339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMPlatformSwPackage_in_entryRuleMPlatformSwPackage368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMPlatformSwPackage375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__0_in_ruleMPlatformSwPackage401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_0437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__0__Impl_in_rule__MMESPPSWPPackageFile__Group__0535 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__1_in_rule__MMESPPSWPPackageFile__Group__0538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MMESPPSWPPackageFile__Group__0__Impl566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__1__Impl_in_rule__MMESPPSWPPackageFile__Group__1597 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__2_in_rule__MMESPPSWPPackageFile__Group__1600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__PackageAssignment_1_in_rule__MMESPPSWPPackageFile__Group__1__Impl627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__2__Impl_in_rule__MMESPPSWPPackageFile__Group__2657 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__3_in_rule__MMESPPSWPPackageFile__Group__2660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MMESPPSWPPackageFile__Group__2__Impl688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__3__Impl_in_rule__MMESPPSWPPackageFile__Group__3719 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__4_in_rule__MMESPPSWPPackageFile__Group__3722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group_3__0_in_rule__MMESPPSWPPackageFile__Group__3__Impl749 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group__4__Impl_in_rule__MMESPPSWPPackageFile__Group__4780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__ElementAssignment_4_in_rule__MMESPPSWPPackageFile__Group__4__Impl807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group_3__0__Impl_in_rule__MMESPPSWPPackageFile__Group_3__0847 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group_3__1_in_rule__MMESPPSWPPackageFile__Group_3__0850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MMESPPSWPPackageFile__Group_3__0__Impl878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group_3__1__Impl_in_rule__MMESPPSWPPackageFile__Group_3__1909 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group_3__2_in_rule__MMESPPSWPPackageFile__Group_3__1912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__ImportsAssignment_3_1_in_rule__MMESPPSWPPackageFile__Group_3__1__Impl939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPPSWPPackageFile__Group_3__2__Impl_in_rule__MMESPPSWPPackageFile__Group_3__2969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MMESPPSWPPackageFile__Group_3__2__Impl997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01034 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1120 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01155 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__01277 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__01280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Alternatives_0_in_rule__Version__Group__0__Impl1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__11337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl1364 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0__Impl_in_rule__Version__Group_0_1__01399 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__1_in_rule__Version__Group_0_1__01402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_0_1__0__Impl1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__1__Impl_in_rule__Version__Group_0_1__11461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_0_1__1__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__01521 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__01524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Version__Group_1__0__Impl1552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__11583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Alternatives_1_1_in_rule__Version__Group_1__1__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__01644 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__01647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__0__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__11706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_1_1_1__1__Impl1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__0__Impl_in_rule__VersionedQualifiedName__Group__01766 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__1_in_rule__VersionedQualifiedName__Group__01769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__VersionedQualifiedName__Group__0__Impl1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__1__Impl_in_rule__VersionedQualifiedName__Group__11825 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__2_in_rule__VersionedQualifiedName__Group__11828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__VersionedQualifiedName__Group__1__Impl1856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__2__Impl_in_rule__VersionedQualifiedName__Group__21887 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__3_in_rule__VersionedQualifiedName__Group__21890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__VersionedQualifiedName__Group__2__Impl1917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__3__Impl_in_rule__VersionedQualifiedName__Group__31946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__VersionedQualifiedName__Group__3__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__0__Impl_in_rule__MPlatformSwPackage__Group__02016 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__1_in_rule__MPlatformSwPackage__Group__02019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MPlatformSwPackage__Group__0__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__1__Impl_in_rule__MPlatformSwPackage__Group__12078 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__2_in_rule__MPlatformSwPackage__Group__12081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__NameAssignment_1_in_rule__MPlatformSwPackage__Group__1__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__2__Impl_in_rule__MPlatformSwPackage__Group__22138 = new BitSet(new long[]{0x0000000002D00000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__3_in_rule__MPlatformSwPackage__Group__22141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MPlatformSwPackage__Group__2__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__3__Impl_in_rule__MPlatformSwPackage__Group__32200 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__4_in_rule__MPlatformSwPackage__Group__32203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3_in_rule__MPlatformSwPackage__Group__3__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__4__Impl_in_rule__MPlatformSwPackage__Group__42260 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__5_in_rule__MPlatformSwPackage__Group__42263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MPlatformSwPackage__Group__4__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group__5__Impl_in_rule__MPlatformSwPackage__Group__52322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MPlatformSwPackage__Group__5__Impl2350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_0__0__Impl_in_rule__MPlatformSwPackage__Group_3_0__02393 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_0__1_in_rule__MPlatformSwPackage__Group_3_0__02396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MPlatformSwPackage__Group_3_0__0__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_0__1__Impl_in_rule__MPlatformSwPackage__Group_3_0__12455 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_0__2_in_rule__MPlatformSwPackage__Group_3_0__12458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MPlatformSwPackage__Group_3_0__1__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_0__2__Impl_in_rule__MPlatformSwPackage__Group_3_0__22517 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_0__3_in_rule__MPlatformSwPackage__Group_3_0__22520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__VersionAssignment_3_0_2_in_rule__MPlatformSwPackage__Group_3_0__2__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_0__3__Impl_in_rule__MPlatformSwPackage__Group_3_0__32577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MPlatformSwPackage__Group_3_0__3__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_1__0__Impl_in_rule__MPlatformSwPackage__Group_3_1__02644 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_1__1_in_rule__MPlatformSwPackage__Group_3_1__02647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MPlatformSwPackage__Group_3_1__0__Impl2675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_1__1__Impl_in_rule__MPlatformSwPackage__Group_3_1__12706 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_1__2_in_rule__MPlatformSwPackage__Group_3_1__12709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MPlatformSwPackage__Group_3_1__1__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_1__2__Impl_in_rule__MPlatformSwPackage__Group_3_1__22768 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_1__3_in_rule__MPlatformSwPackage__Group_3_1__22771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_2_in_rule__MPlatformSwPackage__Group_3_1__2__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_1__3__Impl_in_rule__MPlatformSwPackage__Group_3_1__32828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MPlatformSwPackage__Group_3_1__3__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__0__Impl_in_rule__MPlatformSwPackage__Group_3_2__02895 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__1_in_rule__MPlatformSwPackage__Group_3_2__02898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MPlatformSwPackage__Group_3_2__0__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__1__Impl_in_rule__MPlatformSwPackage__Group_3_2__12957 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__2_in_rule__MPlatformSwPackage__Group_3_2__12960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MPlatformSwPackage__Group_3_2__1__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__2__Impl_in_rule__MPlatformSwPackage__Group_3_2__23019 = new BitSet(new long[]{0x0000000001001000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__3_in_rule__MPlatformSwPackage__Group_3_2__23022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__CtoolsAssignment_3_2_2_in_rule__MPlatformSwPackage__Group_3_2__2__Impl3049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__3__Impl_in_rule__MPlatformSwPackage__Group_3_2__33079 = new BitSet(new long[]{0x0000000001001000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__4_in_rule__MPlatformSwPackage__Group_3_2__33082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2_3__0_in_rule__MPlatformSwPackage__Group_3_2__3__Impl3109 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__4__Impl_in_rule__MPlatformSwPackage__Group_3_2__43140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MPlatformSwPackage__Group_3_2__4__Impl3168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2_3__0__Impl_in_rule__MPlatformSwPackage__Group_3_2_3__03209 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2_3__1_in_rule__MPlatformSwPackage__Group_3_2_3__03212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MPlatformSwPackage__Group_3_2_3__0__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2_3__1__Impl_in_rule__MPlatformSwPackage__Group_3_2_3__13271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_1_in_rule__MPlatformSwPackage__Group_3_2_3__1__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__0__Impl_in_rule__MPlatformSwPackage__Group_3_3__03332 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__1_in_rule__MPlatformSwPackage__Group_3_3__03335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MPlatformSwPackage__Group_3_3__0__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__1__Impl_in_rule__MPlatformSwPackage__Group_3_3__13394 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__2_in_rule__MPlatformSwPackage__Group_3_3__13397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MPlatformSwPackage__Group_3_3__1__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__2__Impl_in_rule__MPlatformSwPackage__Group_3_3__23456 = new BitSet(new long[]{0x0000000001001000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__3_in_rule__MPlatformSwPackage__Group_3_3__23459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2_in_rule__MPlatformSwPackage__Group_3_3__2__Impl3486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__3__Impl_in_rule__MPlatformSwPackage__Group_3_3__33516 = new BitSet(new long[]{0x0000000001001000L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__4_in_rule__MPlatformSwPackage__Group_3_3__33519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3_3__0_in_rule__MPlatformSwPackage__Group_3_3__3__Impl3546 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__4__Impl_in_rule__MPlatformSwPackage__Group_3_3__43577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MPlatformSwPackage__Group_3_3__4__Impl3605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3_3__0__Impl_in_rule__MPlatformSwPackage__Group_3_3_3__03646 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3_3__1_in_rule__MPlatformSwPackage__Group_3_3_3__03649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MPlatformSwPackage__Group_3_3_3__0__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3_3__1__Impl_in_rule__MPlatformSwPackage__Group_3_3_3__13708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1_in_rule__MPlatformSwPackage__Group_3_3_3__1__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__0_in_rule__MPlatformSwPackage__UnorderedGroup_33770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_0__0_in_rule__MPlatformSwPackage__UnorderedGroup_3__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_1__0_in_rule__MPlatformSwPackage__UnorderedGroup_3__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__0_in_rule__MPlatformSwPackage__UnorderedGroup_3__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_3__0_in_rule__MPlatformSwPackage__UnorderedGroup_3__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__Impl_in_rule__MPlatformSwPackage__UnorderedGroup_3__04191 = new BitSet(new long[]{0x0000000002D00002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__1_in_rule__MPlatformSwPackage__UnorderedGroup_3__04194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__Impl_in_rule__MPlatformSwPackage__UnorderedGroup_3__14219 = new BitSet(new long[]{0x0000000002D00002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__2_in_rule__MPlatformSwPackage__UnorderedGroup_3__14222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__Impl_in_rule__MPlatformSwPackage__UnorderedGroup_3__24247 = new BitSet(new long[]{0x0000000002D00002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__3_in_rule__MPlatformSwPackage__UnorderedGroup_3__24250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__Impl_in_rule__MPlatformSwPackage__UnorderedGroup_3__34275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MMESPPSWPPackageFile__PackageAssignment_14315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MMESPPSWPPackageFile__ImportsAssignment_3_14354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPPSWPPackageElement_in_rule__MMESPPSWPPackageFile__ElementAssignment_44389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MPlatformSwPackage__NameAssignment_14420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__MPlatformSwPackage__VersionAssignment_3_0_24451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_24486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__CtoolsAssignment_3_2_24525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__CtoolsAssignment_3_2_3_14564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_24603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_14642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_0__0_in_synpred10_InternalPSWP3859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_1__0_in_synpred11_InternalPSWP3950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__Group_3_2__0_in_synpred12_InternalPSWP4041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__1_in_synpred13_InternalPSWP4194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__2_in_synpred14_InternalPSWP4222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MPlatformSwPackage__UnorderedGroup_3__3_in_synpred15_InternalPSWP4250 = new BitSet(new long[]{0x0000000000000002L});
    }


}