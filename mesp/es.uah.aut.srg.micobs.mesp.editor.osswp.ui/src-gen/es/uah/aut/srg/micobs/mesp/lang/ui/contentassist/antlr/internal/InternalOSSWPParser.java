/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
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
import es.uah.aut.srg.micobs.mesp.lang.services.OSSWPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalOSSWPParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'osswpackage'", "'{'", "'}'", "'extends'", "','", "'version'", "':='", "'os'", "'construction tools'", "'provided osswis'"
    };
    public static final int RULE_ID=5;
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


        public InternalOSSWPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOSSWPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOSSWPParser.tokenNames; }
    public String getGrammarFileName() { return "../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g"; }


     
     	private OSSWPGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OSSWPGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMMESPOSSWPPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:61:1: entryRuleMMESPOSSWPPackageFile : ruleMMESPOSSWPPackageFile EOF ;
    public final void entryRuleMMESPOSSWPPackageFile() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:62:1: ( ruleMMESPOSSWPPackageFile EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:63:1: ruleMMESPOSSWPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPOSSWPPackageFile_in_entryRuleMMESPOSSWPPackageFile67);
            ruleMMESPOSSWPPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPOSSWPPackageFile74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMESPOSSWPPackageFile"


    // $ANTLR start "ruleMMESPOSSWPPackageFile"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:70:1: ruleMMESPOSSWPPackageFile : ( ( rule__MMESPOSSWPPackageFile__Group__0 ) ) ;
    public final void ruleMMESPOSSWPPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:74:2: ( ( ( rule__MMESPOSSWPPackageFile__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:75:1: ( ( rule__MMESPOSSWPPackageFile__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:75:1: ( ( rule__MMESPOSSWPPackageFile__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:76:1: ( rule__MMESPOSSWPPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:77:1: ( rule__MMESPOSSWPPackageFile__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:77:2: rule__MMESPOSSWPPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__0_in_ruleMMESPOSSWPPackageFile100);
            rule__MMESPOSSWPPackageFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMMESPOSSWPPackageFile"


    // $ANTLR start "entryRuleMMESPOSSWPPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:89:1: entryRuleMMESPOSSWPPackageElement : ruleMMESPOSSWPPackageElement EOF ;
    public final void entryRuleMMESPOSSWPPackageElement() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:90:1: ( ruleMMESPOSSWPPackageElement EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:91:1: ruleMMESPOSSWPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPOSSWPPackageElement_in_entryRuleMMESPOSSWPPackageElement127);
            ruleMMESPOSSWPPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMMESPOSSWPPackageElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMESPOSSWPPackageElement"


    // $ANTLR start "ruleMMESPOSSWPPackageElement"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:98:1: ruleMMESPOSSWPPackageElement : ( ruleMOSSwPackage ) ;
    public final void ruleMMESPOSSWPPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:102:2: ( ( ruleMOSSwPackage ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:103:1: ( ruleMOSSwPackage )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:103:1: ( ruleMOSSwPackage )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:104:1: ruleMOSSwPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageElementAccess().getMOSSwPackageParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMOSSwPackage_in_ruleMMESPOSSWPPackageElement160);
            ruleMOSSwPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageElementAccess().getMOSSwPackageParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMMESPOSSWPPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:118:1: ( ruleQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:119:1: ruleQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:133:1: ( rule__QualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:133:2: rule__QualifiedName__Group__0
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:145:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:146:1: ( ruleVersion EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:147:1: ruleVersion EOF
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:154:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:158:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:159:1: ( ( rule__Version__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:159:1: ( ( rule__Version__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:160:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:161:1: ( rule__Version__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:161:2: rule__Version__Group__0
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:173:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:174:1: ( ruleVersionedQualifiedName EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:175:1: ruleVersionedQualifiedName EOF
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:182:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:186:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:188:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:189:1: ( rule__VersionedQualifiedName__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:189:2: rule__VersionedQualifiedName__Group__0
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


    // $ANTLR start "entryRuleMOSSwPackage"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:201:1: entryRuleMOSSwPackage : ruleMOSSwPackage EOF ;
    public final void entryRuleMOSSwPackage() throws RecognitionException {
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:202:1: ( ruleMOSSwPackage EOF )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:203:1: ruleMOSSwPackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMOSSwPackage_in_entryRuleMOSSwPackage366);
            ruleMOSSwPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMOSSwPackage373); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMOSSwPackage"


    // $ANTLR start "ruleMOSSwPackage"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:210:1: ruleMOSSwPackage : ( ( rule__MOSSwPackage__Group__0 ) ) ;
    public final void ruleMOSSwPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:214:2: ( ( ( rule__MOSSwPackage__Group__0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:215:1: ( ( rule__MOSSwPackage__Group__0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:215:1: ( ( rule__MOSSwPackage__Group__0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:216:1: ( rule__MOSSwPackage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:217:1: ( rule__MOSSwPackage__Group__0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:217:2: rule__MOSSwPackage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__0_in_ruleMOSSwPackage399);
            rule__MOSSwPackage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMOSSwPackage"


    // $ANTLR start "rule__Version__Alternatives_0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:229:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:233:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==12||LA1_1==14||LA1_1==16) ) {
                    alt1=1;
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:234:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:234:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:235:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Alternatives_0435); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:240:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:240:6: ( ( rule__Version__Group_0_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:241:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:242:1: ( rule__Version__Group_0_1__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:242:2: rule__Version__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0452);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:251:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:255:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
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
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:256:1: ( RULE_INT )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:256:1: ( RULE_INT )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:257:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1485); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:262:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:262:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:263:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:264:1: ( rule__Version__Group_1_1_1__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:264:2: rule__Version__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1502);
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


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:275:1: rule__MMESPOSSWPPackageFile__Group__0 : rule__MMESPOSSWPPackageFile__Group__0__Impl rule__MMESPOSSWPPackageFile__Group__1 ;
    public final void rule__MMESPOSSWPPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:279:1: ( rule__MMESPOSSWPPackageFile__Group__0__Impl rule__MMESPOSSWPPackageFile__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:280:2: rule__MMESPOSSWPPackageFile__Group__0__Impl rule__MMESPOSSWPPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__0__Impl_in_rule__MMESPOSSWPPackageFile__Group__0533);
            rule__MMESPOSSWPPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__1_in_rule__MMESPOSSWPPackageFile__Group__0536);
            rule__MMESPOSSWPPackageFile__Group__1();

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
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__0"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:287:1: rule__MMESPOSSWPPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:291:1: ( ( 'package' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:292:1: ( 'package' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:292:1: ( 'package' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:293:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageKeyword_0()); 
            }
            match(input,11,FollowSets000.FOLLOW_11_in_rule__MMESPOSSWPPackageFile__Group__0__Impl564); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__0__Impl"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:306:1: rule__MMESPOSSWPPackageFile__Group__1 : rule__MMESPOSSWPPackageFile__Group__1__Impl rule__MMESPOSSWPPackageFile__Group__2 ;
    public final void rule__MMESPOSSWPPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:310:1: ( rule__MMESPOSSWPPackageFile__Group__1__Impl rule__MMESPOSSWPPackageFile__Group__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:311:2: rule__MMESPOSSWPPackageFile__Group__1__Impl rule__MMESPOSSWPPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__1__Impl_in_rule__MMESPOSSWPPackageFile__Group__1595);
            rule__MMESPOSSWPPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__2_in_rule__MMESPOSSWPPackageFile__Group__1598);
            rule__MMESPOSSWPPackageFile__Group__2();

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
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__1"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:318:1: rule__MMESPOSSWPPackageFile__Group__1__Impl : ( ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:322:1: ( ( ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:323:1: ( ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:323:1: ( ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:324:1: ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:325:1: ( rule__MMESPOSSWPPackageFile__PackageAssignment_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:325:2: rule__MMESPOSSWPPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__PackageAssignment_1_in_rule__MMESPOSSWPPackageFile__Group__1__Impl625);
            rule__MMESPOSSWPPackageFile__PackageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__1__Impl"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:335:1: rule__MMESPOSSWPPackageFile__Group__2 : rule__MMESPOSSWPPackageFile__Group__2__Impl rule__MMESPOSSWPPackageFile__Group__3 ;
    public final void rule__MMESPOSSWPPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:339:1: ( rule__MMESPOSSWPPackageFile__Group__2__Impl rule__MMESPOSSWPPackageFile__Group__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:340:2: rule__MMESPOSSWPPackageFile__Group__2__Impl rule__MMESPOSSWPPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__2__Impl_in_rule__MMESPOSSWPPackageFile__Group__2655);
            rule__MMESPOSSWPPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__3_in_rule__MMESPOSSWPPackageFile__Group__2658);
            rule__MMESPOSSWPPackageFile__Group__3();

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
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__2"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:347:1: rule__MMESPOSSWPPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:351:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:352:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:352:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:353:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MMESPOSSWPPackageFile__Group__2__Impl686); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__2__Impl"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:366:1: rule__MMESPOSSWPPackageFile__Group__3 : rule__MMESPOSSWPPackageFile__Group__3__Impl rule__MMESPOSSWPPackageFile__Group__4 ;
    public final void rule__MMESPOSSWPPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:370:1: ( rule__MMESPOSSWPPackageFile__Group__3__Impl rule__MMESPOSSWPPackageFile__Group__4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:371:2: rule__MMESPOSSWPPackageFile__Group__3__Impl rule__MMESPOSSWPPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__3__Impl_in_rule__MMESPOSSWPPackageFile__Group__3717);
            rule__MMESPOSSWPPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__4_in_rule__MMESPOSSWPPackageFile__Group__3720);
            rule__MMESPOSSWPPackageFile__Group__4();

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
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__3"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:378:1: rule__MMESPOSSWPPackageFile__Group__3__Impl : ( ( rule__MMESPOSSWPPackageFile__Group_3__0 )* ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:382:1: ( ( ( rule__MMESPOSSWPPackageFile__Group_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:383:1: ( ( rule__MMESPOSSWPPackageFile__Group_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:383:1: ( ( rule__MMESPOSSWPPackageFile__Group_3__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:384:1: ( rule__MMESPOSSWPPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup_3()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:385:1: ( rule__MMESPOSSWPPackageFile__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:385:2: rule__MMESPOSSWPPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__0_in_rule__MMESPOSSWPPackageFile__Group__3__Impl747);
            	    rule__MMESPOSSWPPackageFile__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__3__Impl"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__4"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:395:1: rule__MMESPOSSWPPackageFile__Group__4 : rule__MMESPOSSWPPackageFile__Group__4__Impl ;
    public final void rule__MMESPOSSWPPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:399:1: ( rule__MMESPOSSWPPackageFile__Group__4__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:400:2: rule__MMESPOSSWPPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group__4__Impl_in_rule__MMESPOSSWPPackageFile__Group__4778);
            rule__MMESPOSSWPPackageFile__Group__4__Impl();

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
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__4"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:406:1: rule__MMESPOSSWPPackageFile__Group__4__Impl : ( ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__MMESPOSSWPPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:410:1: ( ( ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:411:1: ( ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:411:1: ( ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:412:1: ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementAssignment_4()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:413:1: ( rule__MMESPOSSWPPackageFile__ElementAssignment_4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:413:2: rule__MMESPOSSWPPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__ElementAssignment_4_in_rule__MMESPOSSWPPackageFile__Group__4__Impl805);
            rule__MMESPOSSWPPackageFile__ElementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group__4__Impl"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group_3__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:433:1: rule__MMESPOSSWPPackageFile__Group_3__0 : rule__MMESPOSSWPPackageFile__Group_3__0__Impl rule__MMESPOSSWPPackageFile__Group_3__1 ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:437:1: ( rule__MMESPOSSWPPackageFile__Group_3__0__Impl rule__MMESPOSSWPPackageFile__Group_3__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:438:2: rule__MMESPOSSWPPackageFile__Group_3__0__Impl rule__MMESPOSSWPPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__0__Impl_in_rule__MMESPOSSWPPackageFile__Group_3__0845);
            rule__MMESPOSSWPPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__1_in_rule__MMESPOSSWPPackageFile__Group_3__0848);
            rule__MMESPOSSWPPackageFile__Group_3__1();

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
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group_3__0"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:445:1: rule__MMESPOSSWPPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:449:1: ( ( 'import' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:450:1: ( 'import' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:450:1: ( 'import' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:451:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportKeyword_3_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MMESPOSSWPPackageFile__Group_3__0__Impl876); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group_3__0__Impl"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group_3__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:464:1: rule__MMESPOSSWPPackageFile__Group_3__1 : rule__MMESPOSSWPPackageFile__Group_3__1__Impl rule__MMESPOSSWPPackageFile__Group_3__2 ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:468:1: ( rule__MMESPOSSWPPackageFile__Group_3__1__Impl rule__MMESPOSSWPPackageFile__Group_3__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:469:2: rule__MMESPOSSWPPackageFile__Group_3__1__Impl rule__MMESPOSSWPPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__1__Impl_in_rule__MMESPOSSWPPackageFile__Group_3__1907);
            rule__MMESPOSSWPPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__2_in_rule__MMESPOSSWPPackageFile__Group_3__1910);
            rule__MMESPOSSWPPackageFile__Group_3__2();

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
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group_3__1"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:476:1: rule__MMESPOSSWPPackageFile__Group_3__1__Impl : ( ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:480:1: ( ( ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:481:1: ( ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:481:1: ( ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:482:1: ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsAssignment_3_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:483:1: ( rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:483:2: rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1_in_rule__MMESPOSSWPPackageFile__Group_3__1__Impl937);
            rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group_3__1__Impl"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group_3__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:493:1: rule__MMESPOSSWPPackageFile__Group_3__2 : rule__MMESPOSSWPPackageFile__Group_3__2__Impl ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:497:1: ( rule__MMESPOSSWPPackageFile__Group_3__2__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:498:2: rule__MMESPOSSWPPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__2__Impl_in_rule__MMESPOSSWPPackageFile__Group_3__2967);
            rule__MMESPOSSWPPackageFile__Group_3__2__Impl();

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
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group_3__2"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__Group_3__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:504:1: rule__MMESPOSSWPPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MMESPOSSWPPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:508:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:509:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:509:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:510:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MMESPOSSWPPackageFile__Group_3__2__Impl995); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:529:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:533:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:534:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01032);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01035);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:541:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:545:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:546:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:546:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:547:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1062); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:558:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:562:1: ( rule__QualifiedName__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:563:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11091);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:569:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:573:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:574:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:574:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:575:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:576:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:576:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1118);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:590:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:594:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:595:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01153);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01156);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:602:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:606:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:607:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:607:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:608:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1184); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:621:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:625:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:626:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11215);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:632:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:636:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:637:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:637:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:638:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1242); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:653:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:657:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:658:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__01275);
            rule__Version__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1_in_rule__Version__Group__01278);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:665:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:669:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:670:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:670:1: ( ( rule__Version__Alternatives_0 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:671:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:672:1: ( rule__Version__Alternatives_0 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:672:2: rule__Version__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Alternatives_0_in_rule__Version__Group__0__Impl1305);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:682:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:686:1: ( rule__Version__Group__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:687:2: rule__Version__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__11335);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:693:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:697:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:698:1: ( ( rule__Version__Group_1__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:698:1: ( ( rule__Version__Group_1__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:699:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:700:1: ( rule__Version__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:700:2: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl1362);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:714:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:718:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:719:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__0__Impl_in_rule__Version__Group_0_1__01397);
            rule__Version__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__1_in_rule__Version__Group_0_1__01400);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:726:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:730:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:731:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:731:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:732:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:733:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:733:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Group_0_1__0__Impl1428); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:743:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:747:1: ( rule__Version__Group_0_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:748:2: rule__Version__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_0_1__1__Impl_in_rule__Version__Group_0_1__11459);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:754:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:758:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:759:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:759:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:760:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Version__Group_0_1__1__Impl1486); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:775:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:779:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:780:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__01519);
            rule__Version__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__01522);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:787:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:791:1: ( ( '.' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:792:1: ( '.' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:792:1: ( '.' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:793:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Version__Group_1__0__Impl1550); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:806:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:810:1: ( rule__Version__Group_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:811:2: rule__Version__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__11581);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:817:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:821:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:822:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:822:1: ( ( rule__Version__Alternatives_1_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:823:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:824:1: ( rule__Version__Alternatives_1_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:824:2: rule__Version__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Alternatives_1_1_in_rule__Version__Group_1__1__Impl1608);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:838:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:842:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:843:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__01642);
            rule__Version__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__01645);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:850:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:854:1: ( ( ( RULE_INT )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:855:1: ( ( RULE_INT )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:855:1: ( ( RULE_INT )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:856:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:857:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:857:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__0__Impl1673); if (state.failed) return ;

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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:867:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:871:1: ( rule__Version__Group_1_1_1__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:872:2: rule__Version__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__11704);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:878:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:882:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:883:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:883:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:884:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Version__Group_1_1_1__1__Impl1731); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:899:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:903:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:904:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__0__Impl_in_rule__VersionedQualifiedName__Group__01764);
            rule__VersionedQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__1_in_rule__VersionedQualifiedName__Group__01767);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:911:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:915:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:916:1: ( ruleQualifiedName )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:916:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:917:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__VersionedQualifiedName__Group__0__Impl1794);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:928:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:932:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:933:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__1__Impl_in_rule__VersionedQualifiedName__Group__11823);
            rule__VersionedQualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__2_in_rule__VersionedQualifiedName__Group__11826);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:940:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:944:1: ( ( '(' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:945:1: ( '(' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:945:1: ( '(' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:946:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__VersionedQualifiedName__Group__1__Impl1854); if (state.failed) return ;
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:959:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:963:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:964:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__2__Impl_in_rule__VersionedQualifiedName__Group__21885);
            rule__VersionedQualifiedName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__3_in_rule__VersionedQualifiedName__Group__21888);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:971:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:975:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:976:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:976:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:977:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__VersionedQualifiedName__Group__2__Impl1915);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:988:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:992:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:993:2: rule__VersionedQualifiedName__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersionedQualifiedName__Group__3__Impl_in_rule__VersionedQualifiedName__Group__31944);
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
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:999:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1003:1: ( ( ')' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1004:1: ( ')' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1004:1: ( ')' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1005:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__VersionedQualifiedName__Group__3__Impl1972); if (state.failed) return ;
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


    // $ANTLR start "rule__MOSSwPackage__Group__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1026:1: rule__MOSSwPackage__Group__0 : rule__MOSSwPackage__Group__0__Impl rule__MOSSwPackage__Group__1 ;
    public final void rule__MOSSwPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1030:1: ( rule__MOSSwPackage__Group__0__Impl rule__MOSSwPackage__Group__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1031:2: rule__MOSSwPackage__Group__0__Impl rule__MOSSwPackage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__0__Impl_in_rule__MOSSwPackage__Group__02011);
            rule__MOSSwPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__1_in_rule__MOSSwPackage__Group__02014);
            rule__MOSSwPackage__Group__1();

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
    // $ANTLR end "rule__MOSSwPackage__Group__0"


    // $ANTLR start "rule__MOSSwPackage__Group__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1038:1: rule__MOSSwPackage__Group__0__Impl : ( 'osswpackage' ) ;
    public final void rule__MOSSwPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1042:1: ( ( 'osswpackage' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1043:1: ( 'osswpackage' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1043:1: ( 'osswpackage' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1044:1: 'osswpackage'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getOsswpackageKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MOSSwPackage__Group__0__Impl2042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getOsswpackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1057:1: rule__MOSSwPackage__Group__1 : rule__MOSSwPackage__Group__1__Impl rule__MOSSwPackage__Group__2 ;
    public final void rule__MOSSwPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1061:1: ( rule__MOSSwPackage__Group__1__Impl rule__MOSSwPackage__Group__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1062:2: rule__MOSSwPackage__Group__1__Impl rule__MOSSwPackage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__1__Impl_in_rule__MOSSwPackage__Group__12073);
            rule__MOSSwPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__2_in_rule__MOSSwPackage__Group__12076);
            rule__MOSSwPackage__Group__2();

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
    // $ANTLR end "rule__MOSSwPackage__Group__1"


    // $ANTLR start "rule__MOSSwPackage__Group__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1069:1: rule__MOSSwPackage__Group__1__Impl : ( ( rule__MOSSwPackage__NameAssignment_1 ) ) ;
    public final void rule__MOSSwPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1073:1: ( ( ( rule__MOSSwPackage__NameAssignment_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1074:1: ( ( rule__MOSSwPackage__NameAssignment_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1074:1: ( ( rule__MOSSwPackage__NameAssignment_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1075:1: ( rule__MOSSwPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getNameAssignment_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1076:1: ( rule__MOSSwPackage__NameAssignment_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1076:2: rule__MOSSwPackage__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__NameAssignment_1_in_rule__MOSSwPackage__Group__1__Impl2103);
            rule__MOSSwPackage__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1086:1: rule__MOSSwPackage__Group__2 : rule__MOSSwPackage__Group__2__Impl rule__MOSSwPackage__Group__3 ;
    public final void rule__MOSSwPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1090:1: ( rule__MOSSwPackage__Group__2__Impl rule__MOSSwPackage__Group__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1091:2: rule__MOSSwPackage__Group__2__Impl rule__MOSSwPackage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__2__Impl_in_rule__MOSSwPackage__Group__22133);
            rule__MOSSwPackage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__3_in_rule__MOSSwPackage__Group__22136);
            rule__MOSSwPackage__Group__3();

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
    // $ANTLR end "rule__MOSSwPackage__Group__2"


    // $ANTLR start "rule__MOSSwPackage__Group__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1098:1: rule__MOSSwPackage__Group__2__Impl : ( ( rule__MOSSwPackage__Group_2__0 )? ) ;
    public final void rule__MOSSwPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1102:1: ( ( ( rule__MOSSwPackage__Group_2__0 )? ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1103:1: ( ( rule__MOSSwPackage__Group_2__0 )? )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1103:1: ( ( rule__MOSSwPackage__Group_2__0 )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1104:1: ( rule__MOSSwPackage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1105:1: ( rule__MOSSwPackage__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1105:2: rule__MOSSwPackage__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2__0_in_rule__MOSSwPackage__Group__2__Impl2163);
                    rule__MOSSwPackage__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group__2__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1115:1: rule__MOSSwPackage__Group__3 : rule__MOSSwPackage__Group__3__Impl rule__MOSSwPackage__Group__4 ;
    public final void rule__MOSSwPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1119:1: ( rule__MOSSwPackage__Group__3__Impl rule__MOSSwPackage__Group__4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1120:2: rule__MOSSwPackage__Group__3__Impl rule__MOSSwPackage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__3__Impl_in_rule__MOSSwPackage__Group__32194);
            rule__MOSSwPackage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__4_in_rule__MOSSwPackage__Group__32197);
            rule__MOSSwPackage__Group__4();

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
    // $ANTLR end "rule__MOSSwPackage__Group__3"


    // $ANTLR start "rule__MOSSwPackage__Group__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1127:1: rule__MOSSwPackage__Group__3__Impl : ( '{' ) ;
    public final void rule__MOSSwPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1131:1: ( ( '{' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1132:1: ( '{' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1132:1: ( '{' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1133:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MOSSwPackage__Group__3__Impl2225); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group__3__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group__4"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1146:1: rule__MOSSwPackage__Group__4 : rule__MOSSwPackage__Group__4__Impl rule__MOSSwPackage__Group__5 ;
    public final void rule__MOSSwPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1150:1: ( rule__MOSSwPackage__Group__4__Impl rule__MOSSwPackage__Group__5 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1151:2: rule__MOSSwPackage__Group__4__Impl rule__MOSSwPackage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__4__Impl_in_rule__MOSSwPackage__Group__42256);
            rule__MOSSwPackage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__5_in_rule__MOSSwPackage__Group__42259);
            rule__MOSSwPackage__Group__5();

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
    // $ANTLR end "rule__MOSSwPackage__Group__4"


    // $ANTLR start "rule__MOSSwPackage__Group__4__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1158:1: rule__MOSSwPackage__Group__4__Impl : ( ( rule__MOSSwPackage__UnorderedGroup_4 ) ) ;
    public final void rule__MOSSwPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1162:1: ( ( ( rule__MOSSwPackage__UnorderedGroup_4 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1163:1: ( ( rule__MOSSwPackage__UnorderedGroup_4 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1163:1: ( ( rule__MOSSwPackage__UnorderedGroup_4 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1164:1: ( rule__MOSSwPackage__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1165:1: ( rule__MOSSwPackage__UnorderedGroup_4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1165:2: rule__MOSSwPackage__UnorderedGroup_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4_in_rule__MOSSwPackage__Group__4__Impl2286);
            rule__MOSSwPackage__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group__4__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group__5"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1175:1: rule__MOSSwPackage__Group__5 : rule__MOSSwPackage__Group__5__Impl rule__MOSSwPackage__Group__6 ;
    public final void rule__MOSSwPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1179:1: ( rule__MOSSwPackage__Group__5__Impl rule__MOSSwPackage__Group__6 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1180:2: rule__MOSSwPackage__Group__5__Impl rule__MOSSwPackage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__5__Impl_in_rule__MOSSwPackage__Group__52316);
            rule__MOSSwPackage__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__6_in_rule__MOSSwPackage__Group__52319);
            rule__MOSSwPackage__Group__6();

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
    // $ANTLR end "rule__MOSSwPackage__Group__5"


    // $ANTLR start "rule__MOSSwPackage__Group__5__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1187:1: rule__MOSSwPackage__Group__5__Impl : ( '}' ) ;
    public final void rule__MOSSwPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1191:1: ( ( '}' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1192:1: ( '}' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1192:1: ( '}' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1193:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MOSSwPackage__Group__5__Impl2347); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group__5__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group__6"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1206:1: rule__MOSSwPackage__Group__6 : rule__MOSSwPackage__Group__6__Impl ;
    public final void rule__MOSSwPackage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1210:1: ( rule__MOSSwPackage__Group__6__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1211:2: rule__MOSSwPackage__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group__6__Impl_in_rule__MOSSwPackage__Group__62378);
            rule__MOSSwPackage__Group__6__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__Group__6"


    // $ANTLR start "rule__MOSSwPackage__Group__6__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1217:1: rule__MOSSwPackage__Group__6__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1221:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1222:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1222:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1223:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_6()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MOSSwPackage__Group__6__Impl2406); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group__6__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_2__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1250:1: rule__MOSSwPackage__Group_2__0 : rule__MOSSwPackage__Group_2__0__Impl rule__MOSSwPackage__Group_2__1 ;
    public final void rule__MOSSwPackage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1254:1: ( rule__MOSSwPackage__Group_2__0__Impl rule__MOSSwPackage__Group_2__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1255:2: rule__MOSSwPackage__Group_2__0__Impl rule__MOSSwPackage__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2__0__Impl_in_rule__MOSSwPackage__Group_2__02451);
            rule__MOSSwPackage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2__1_in_rule__MOSSwPackage__Group_2__02454);
            rule__MOSSwPackage__Group_2__1();

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
    // $ANTLR end "rule__MOSSwPackage__Group_2__0"


    // $ANTLR start "rule__MOSSwPackage__Group_2__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1262:1: rule__MOSSwPackage__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__MOSSwPackage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1266:1: ( ( 'extends' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1267:1: ( 'extends' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1267:1: ( 'extends' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1268:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsKeyword_2_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MOSSwPackage__Group_2__0__Impl2482); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_2__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_2__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1281:1: rule__MOSSwPackage__Group_2__1 : rule__MOSSwPackage__Group_2__1__Impl rule__MOSSwPackage__Group_2__2 ;
    public final void rule__MOSSwPackage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1285:1: ( rule__MOSSwPackage__Group_2__1__Impl rule__MOSSwPackage__Group_2__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1286:2: rule__MOSSwPackage__Group_2__1__Impl rule__MOSSwPackage__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2__1__Impl_in_rule__MOSSwPackage__Group_2__12513);
            rule__MOSSwPackage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2__2_in_rule__MOSSwPackage__Group_2__12516);
            rule__MOSSwPackage__Group_2__2();

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
    // $ANTLR end "rule__MOSSwPackage__Group_2__1"


    // $ANTLR start "rule__MOSSwPackage__Group_2__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1293:1: rule__MOSSwPackage__Group_2__1__Impl : ( ( rule__MOSSwPackage__ExtendsAssignment_2_1 ) ) ;
    public final void rule__MOSSwPackage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1297:1: ( ( ( rule__MOSSwPackage__ExtendsAssignment_2_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1298:1: ( ( rule__MOSSwPackage__ExtendsAssignment_2_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1298:1: ( ( rule__MOSSwPackage__ExtendsAssignment_2_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1299:1: ( rule__MOSSwPackage__ExtendsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1300:1: ( rule__MOSSwPackage__ExtendsAssignment_2_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1300:2: rule__MOSSwPackage__ExtendsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__ExtendsAssignment_2_1_in_rule__MOSSwPackage__Group_2__1__Impl2543);
            rule__MOSSwPackage__ExtendsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_2__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_2__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1310:1: rule__MOSSwPackage__Group_2__2 : rule__MOSSwPackage__Group_2__2__Impl ;
    public final void rule__MOSSwPackage__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1314:1: ( rule__MOSSwPackage__Group_2__2__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1315:2: rule__MOSSwPackage__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2__2__Impl_in_rule__MOSSwPackage__Group_2__22573);
            rule__MOSSwPackage__Group_2__2__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__Group_2__2"


    // $ANTLR start "rule__MOSSwPackage__Group_2__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1321:1: rule__MOSSwPackage__Group_2__2__Impl : ( ( rule__MOSSwPackage__Group_2_2__0 )* ) ;
    public final void rule__MOSSwPackage__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1325:1: ( ( ( rule__MOSSwPackage__Group_2_2__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1326:1: ( ( rule__MOSSwPackage__Group_2_2__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1326:1: ( ( rule__MOSSwPackage__Group_2_2__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1327:1: ( rule__MOSSwPackage__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup_2_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1328:1: ( rule__MOSSwPackage__Group_2_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1328:2: rule__MOSSwPackage__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2_2__0_in_rule__MOSSwPackage__Group_2__2__Impl2600);
            	    rule__MOSSwPackage__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_2__2__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_2_2__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1344:1: rule__MOSSwPackage__Group_2_2__0 : rule__MOSSwPackage__Group_2_2__0__Impl rule__MOSSwPackage__Group_2_2__1 ;
    public final void rule__MOSSwPackage__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1348:1: ( rule__MOSSwPackage__Group_2_2__0__Impl rule__MOSSwPackage__Group_2_2__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1349:2: rule__MOSSwPackage__Group_2_2__0__Impl rule__MOSSwPackage__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2_2__0__Impl_in_rule__MOSSwPackage__Group_2_2__02637);
            rule__MOSSwPackage__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2_2__1_in_rule__MOSSwPackage__Group_2_2__02640);
            rule__MOSSwPackage__Group_2_2__1();

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
    // $ANTLR end "rule__MOSSwPackage__Group_2_2__0"


    // $ANTLR start "rule__MOSSwPackage__Group_2_2__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1356:1: rule__MOSSwPackage__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MOSSwPackage__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1360:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1361:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1361:1: ( ',' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1362:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MOSSwPackage__Group_2_2__0__Impl2668); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_2_2__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_2_2__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1375:1: rule__MOSSwPackage__Group_2_2__1 : rule__MOSSwPackage__Group_2_2__1__Impl ;
    public final void rule__MOSSwPackage__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1379:1: ( rule__MOSSwPackage__Group_2_2__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1380:2: rule__MOSSwPackage__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_2_2__1__Impl_in_rule__MOSSwPackage__Group_2_2__12699);
            rule__MOSSwPackage__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__Group_2_2__1"


    // $ANTLR start "rule__MOSSwPackage__Group_2_2__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1386:1: rule__MOSSwPackage__Group_2_2__1__Impl : ( ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 ) ) ;
    public final void rule__MOSSwPackage__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1390:1: ( ( ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1391:1: ( ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1391:1: ( ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1392:1: ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_2_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1393:1: ( rule__MOSSwPackage__ExtendsAssignment_2_2_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1393:2: rule__MOSSwPackage__ExtendsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__ExtendsAssignment_2_2_1_in_rule__MOSSwPackage__Group_2_2__1__Impl2726);
            rule__MOSSwPackage__ExtendsAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_2_2__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_0__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1407:1: rule__MOSSwPackage__Group_4_0__0 : rule__MOSSwPackage__Group_4_0__0__Impl rule__MOSSwPackage__Group_4_0__1 ;
    public final void rule__MOSSwPackage__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1411:1: ( rule__MOSSwPackage__Group_4_0__0__Impl rule__MOSSwPackage__Group_4_0__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1412:2: rule__MOSSwPackage__Group_4_0__0__Impl rule__MOSSwPackage__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_0__0__Impl_in_rule__MOSSwPackage__Group_4_0__02760);
            rule__MOSSwPackage__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_0__1_in_rule__MOSSwPackage__Group_4_0__02763);
            rule__MOSSwPackage__Group_4_0__1();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_0__0"


    // $ANTLR start "rule__MOSSwPackage__Group_4_0__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1419:1: rule__MOSSwPackage__Group_4_0__0__Impl : ( 'version' ) ;
    public final void rule__MOSSwPackage__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1423:1: ( ( 'version' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1424:1: ( 'version' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1424:1: ( 'version' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1425:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getVersionKeyword_4_0_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MOSSwPackage__Group_4_0__0__Impl2791); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getVersionKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_0__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_0__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1438:1: rule__MOSSwPackage__Group_4_0__1 : rule__MOSSwPackage__Group_4_0__1__Impl rule__MOSSwPackage__Group_4_0__2 ;
    public final void rule__MOSSwPackage__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1442:1: ( rule__MOSSwPackage__Group_4_0__1__Impl rule__MOSSwPackage__Group_4_0__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1443:2: rule__MOSSwPackage__Group_4_0__1__Impl rule__MOSSwPackage__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_0__1__Impl_in_rule__MOSSwPackage__Group_4_0__12822);
            rule__MOSSwPackage__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_0__2_in_rule__MOSSwPackage__Group_4_0__12825);
            rule__MOSSwPackage__Group_4_0__2();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_0__1"


    // $ANTLR start "rule__MOSSwPackage__Group_4_0__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1450:1: rule__MOSSwPackage__Group_4_0__1__Impl : ( ':=' ) ;
    public final void rule__MOSSwPackage__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1454:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1455:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1455:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1456:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_0_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MOSSwPackage__Group_4_0__1__Impl2853); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_0__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_0__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1469:1: rule__MOSSwPackage__Group_4_0__2 : rule__MOSSwPackage__Group_4_0__2__Impl rule__MOSSwPackage__Group_4_0__3 ;
    public final void rule__MOSSwPackage__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1473:1: ( rule__MOSSwPackage__Group_4_0__2__Impl rule__MOSSwPackage__Group_4_0__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1474:2: rule__MOSSwPackage__Group_4_0__2__Impl rule__MOSSwPackage__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_0__2__Impl_in_rule__MOSSwPackage__Group_4_0__22884);
            rule__MOSSwPackage__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_0__3_in_rule__MOSSwPackage__Group_4_0__22887);
            rule__MOSSwPackage__Group_4_0__3();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_0__2"


    // $ANTLR start "rule__MOSSwPackage__Group_4_0__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1481:1: rule__MOSSwPackage__Group_4_0__2__Impl : ( ( rule__MOSSwPackage__VersionAssignment_4_0_2 ) ) ;
    public final void rule__MOSSwPackage__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1485:1: ( ( ( rule__MOSSwPackage__VersionAssignment_4_0_2 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1486:1: ( ( rule__MOSSwPackage__VersionAssignment_4_0_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1486:1: ( ( rule__MOSSwPackage__VersionAssignment_4_0_2 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1487:1: ( rule__MOSSwPackage__VersionAssignment_4_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getVersionAssignment_4_0_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1488:1: ( rule__MOSSwPackage__VersionAssignment_4_0_2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1488:2: rule__MOSSwPackage__VersionAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__VersionAssignment_4_0_2_in_rule__MOSSwPackage__Group_4_0__2__Impl2914);
            rule__MOSSwPackage__VersionAssignment_4_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getVersionAssignment_4_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_0__2__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_0__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1498:1: rule__MOSSwPackage__Group_4_0__3 : rule__MOSSwPackage__Group_4_0__3__Impl ;
    public final void rule__MOSSwPackage__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1502:1: ( rule__MOSSwPackage__Group_4_0__3__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1503:2: rule__MOSSwPackage__Group_4_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_0__3__Impl_in_rule__MOSSwPackage__Group_4_0__32944);
            rule__MOSSwPackage__Group_4_0__3__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_0__3"


    // $ANTLR start "rule__MOSSwPackage__Group_4_0__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1509:1: rule__MOSSwPackage__Group_4_0__3__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1513:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1514:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1514:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1515:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_0_3()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MOSSwPackage__Group_4_0__3__Impl2972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_0__3__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_1__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1536:1: rule__MOSSwPackage__Group_4_1__0 : rule__MOSSwPackage__Group_4_1__0__Impl rule__MOSSwPackage__Group_4_1__1 ;
    public final void rule__MOSSwPackage__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1540:1: ( rule__MOSSwPackage__Group_4_1__0__Impl rule__MOSSwPackage__Group_4_1__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1541:2: rule__MOSSwPackage__Group_4_1__0__Impl rule__MOSSwPackage__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_1__0__Impl_in_rule__MOSSwPackage__Group_4_1__03011);
            rule__MOSSwPackage__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_1__1_in_rule__MOSSwPackage__Group_4_1__03014);
            rule__MOSSwPackage__Group_4_1__1();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_1__0"


    // $ANTLR start "rule__MOSSwPackage__Group_4_1__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1548:1: rule__MOSSwPackage__Group_4_1__0__Impl : ( 'os' ) ;
    public final void rule__MOSSwPackage__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1552:1: ( ( 'os' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1553:1: ( 'os' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1553:1: ( 'os' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1554:1: 'os'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getOsKeyword_4_1_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MOSSwPackage__Group_4_1__0__Impl3042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getOsKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_1__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_1__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1567:1: rule__MOSSwPackage__Group_4_1__1 : rule__MOSSwPackage__Group_4_1__1__Impl rule__MOSSwPackage__Group_4_1__2 ;
    public final void rule__MOSSwPackage__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1571:1: ( rule__MOSSwPackage__Group_4_1__1__Impl rule__MOSSwPackage__Group_4_1__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1572:2: rule__MOSSwPackage__Group_4_1__1__Impl rule__MOSSwPackage__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_1__1__Impl_in_rule__MOSSwPackage__Group_4_1__13073);
            rule__MOSSwPackage__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_1__2_in_rule__MOSSwPackage__Group_4_1__13076);
            rule__MOSSwPackage__Group_4_1__2();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_1__1"


    // $ANTLR start "rule__MOSSwPackage__Group_4_1__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1579:1: rule__MOSSwPackage__Group_4_1__1__Impl : ( ':=' ) ;
    public final void rule__MOSSwPackage__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1583:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1584:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1584:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1585:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_1_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MOSSwPackage__Group_4_1__1__Impl3104); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_1__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_1__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1598:1: rule__MOSSwPackage__Group_4_1__2 : rule__MOSSwPackage__Group_4_1__2__Impl rule__MOSSwPackage__Group_4_1__3 ;
    public final void rule__MOSSwPackage__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1602:1: ( rule__MOSSwPackage__Group_4_1__2__Impl rule__MOSSwPackage__Group_4_1__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1603:2: rule__MOSSwPackage__Group_4_1__2__Impl rule__MOSSwPackage__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_1__2__Impl_in_rule__MOSSwPackage__Group_4_1__23135);
            rule__MOSSwPackage__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_1__3_in_rule__MOSSwPackage__Group_4_1__23138);
            rule__MOSSwPackage__Group_4_1__3();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_1__2"


    // $ANTLR start "rule__MOSSwPackage__Group_4_1__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1610:1: rule__MOSSwPackage__Group_4_1__2__Impl : ( ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 ) ) ;
    public final void rule__MOSSwPackage__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1614:1: ( ( ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1615:1: ( ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1615:1: ( ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1616:1: ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getReferencedElementAssignment_4_1_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1617:1: ( rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1617:2: rule__MOSSwPackage__ReferencedElementAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__ReferencedElementAssignment_4_1_2_in_rule__MOSSwPackage__Group_4_1__2__Impl3165);
            rule__MOSSwPackage__ReferencedElementAssignment_4_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getReferencedElementAssignment_4_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_1__2__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_1__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1627:1: rule__MOSSwPackage__Group_4_1__3 : rule__MOSSwPackage__Group_4_1__3__Impl ;
    public final void rule__MOSSwPackage__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1631:1: ( rule__MOSSwPackage__Group_4_1__3__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1632:2: rule__MOSSwPackage__Group_4_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_1__3__Impl_in_rule__MOSSwPackage__Group_4_1__33195);
            rule__MOSSwPackage__Group_4_1__3__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_1__3"


    // $ANTLR start "rule__MOSSwPackage__Group_4_1__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1638:1: rule__MOSSwPackage__Group_4_1__3__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1642:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1643:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1643:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1644:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_1_3()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MOSSwPackage__Group_4_1__3__Impl3223); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_1__3__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1665:1: rule__MOSSwPackage__Group_4_2__0 : rule__MOSSwPackage__Group_4_2__0__Impl rule__MOSSwPackage__Group_4_2__1 ;
    public final void rule__MOSSwPackage__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1669:1: ( rule__MOSSwPackage__Group_4_2__0__Impl rule__MOSSwPackage__Group_4_2__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1670:2: rule__MOSSwPackage__Group_4_2__0__Impl rule__MOSSwPackage__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__0__Impl_in_rule__MOSSwPackage__Group_4_2__03262);
            rule__MOSSwPackage__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__1_in_rule__MOSSwPackage__Group_4_2__03265);
            rule__MOSSwPackage__Group_4_2__1();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__0"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1677:1: rule__MOSSwPackage__Group_4_2__0__Impl : ( 'construction tools' ) ;
    public final void rule__MOSSwPackage__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1681:1: ( ( 'construction tools' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1682:1: ( 'construction tools' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1682:1: ( 'construction tools' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1683:1: 'construction tools'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getConstructionToolsKeyword_4_2_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MOSSwPackage__Group_4_2__0__Impl3293); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getConstructionToolsKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1696:1: rule__MOSSwPackage__Group_4_2__1 : rule__MOSSwPackage__Group_4_2__1__Impl rule__MOSSwPackage__Group_4_2__2 ;
    public final void rule__MOSSwPackage__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1700:1: ( rule__MOSSwPackage__Group_4_2__1__Impl rule__MOSSwPackage__Group_4_2__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1701:2: rule__MOSSwPackage__Group_4_2__1__Impl rule__MOSSwPackage__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__1__Impl_in_rule__MOSSwPackage__Group_4_2__13324);
            rule__MOSSwPackage__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__2_in_rule__MOSSwPackage__Group_4_2__13327);
            rule__MOSSwPackage__Group_4_2__2();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__1"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1708:1: rule__MOSSwPackage__Group_4_2__1__Impl : ( ':=' ) ;
    public final void rule__MOSSwPackage__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1712:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1713:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1713:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1714:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_2_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MOSSwPackage__Group_4_2__1__Impl3355); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1727:1: rule__MOSSwPackage__Group_4_2__2 : rule__MOSSwPackage__Group_4_2__2__Impl rule__MOSSwPackage__Group_4_2__3 ;
    public final void rule__MOSSwPackage__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1731:1: ( rule__MOSSwPackage__Group_4_2__2__Impl rule__MOSSwPackage__Group_4_2__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1732:2: rule__MOSSwPackage__Group_4_2__2__Impl rule__MOSSwPackage__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__2__Impl_in_rule__MOSSwPackage__Group_4_2__23386);
            rule__MOSSwPackage__Group_4_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__3_in_rule__MOSSwPackage__Group_4_2__23389);
            rule__MOSSwPackage__Group_4_2__3();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__2"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1739:1: rule__MOSSwPackage__Group_4_2__2__Impl : ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_2 ) ) ;
    public final void rule__MOSSwPackage__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1743:1: ( ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_2 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1744:1: ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1744:1: ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_2 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1745:1: ( rule__MOSSwPackage__CtoolsAssignment_4_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1746:1: ( rule__MOSSwPackage__CtoolsAssignment_4_2_2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1746:2: rule__MOSSwPackage__CtoolsAssignment_4_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__CtoolsAssignment_4_2_2_in_rule__MOSSwPackage__Group_4_2__2__Impl3416);
            rule__MOSSwPackage__CtoolsAssignment_4_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__2__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1756:1: rule__MOSSwPackage__Group_4_2__3 : rule__MOSSwPackage__Group_4_2__3__Impl rule__MOSSwPackage__Group_4_2__4 ;
    public final void rule__MOSSwPackage__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1760:1: ( rule__MOSSwPackage__Group_4_2__3__Impl rule__MOSSwPackage__Group_4_2__4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1761:2: rule__MOSSwPackage__Group_4_2__3__Impl rule__MOSSwPackage__Group_4_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__3__Impl_in_rule__MOSSwPackage__Group_4_2__33446);
            rule__MOSSwPackage__Group_4_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__4_in_rule__MOSSwPackage__Group_4_2__33449);
            rule__MOSSwPackage__Group_4_2__4();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__3"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1768:1: rule__MOSSwPackage__Group_4_2__3__Impl : ( ( rule__MOSSwPackage__Group_4_2_3__0 )* ) ;
    public final void rule__MOSSwPackage__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1772:1: ( ( ( rule__MOSSwPackage__Group_4_2_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1773:1: ( ( rule__MOSSwPackage__Group_4_2_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1773:1: ( ( rule__MOSSwPackage__Group_4_2_3__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1774:1: ( rule__MOSSwPackage__Group_4_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup_4_2_3()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1775:1: ( rule__MOSSwPackage__Group_4_2_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1775:2: rule__MOSSwPackage__Group_4_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2_3__0_in_rule__MOSSwPackage__Group_4_2__3__Impl3476);
            	    rule__MOSSwPackage__Group_4_2_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getGroup_4_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__3__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__4"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1785:1: rule__MOSSwPackage__Group_4_2__4 : rule__MOSSwPackage__Group_4_2__4__Impl ;
    public final void rule__MOSSwPackage__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1789:1: ( rule__MOSSwPackage__Group_4_2__4__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1790:2: rule__MOSSwPackage__Group_4_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__4__Impl_in_rule__MOSSwPackage__Group_4_2__43507);
            rule__MOSSwPackage__Group_4_2__4__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__4"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2__4__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1796:1: rule__MOSSwPackage__Group_4_2__4__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1800:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1801:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1801:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1802:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_2_4()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MOSSwPackage__Group_4_2__4__Impl3535); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2__4__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2_3__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1825:1: rule__MOSSwPackage__Group_4_2_3__0 : rule__MOSSwPackage__Group_4_2_3__0__Impl rule__MOSSwPackage__Group_4_2_3__1 ;
    public final void rule__MOSSwPackage__Group_4_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1829:1: ( rule__MOSSwPackage__Group_4_2_3__0__Impl rule__MOSSwPackage__Group_4_2_3__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1830:2: rule__MOSSwPackage__Group_4_2_3__0__Impl rule__MOSSwPackage__Group_4_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2_3__0__Impl_in_rule__MOSSwPackage__Group_4_2_3__03576);
            rule__MOSSwPackage__Group_4_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2_3__1_in_rule__MOSSwPackage__Group_4_2_3__03579);
            rule__MOSSwPackage__Group_4_2_3__1();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_2_3__0"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1837:1: rule__MOSSwPackage__Group_4_2_3__0__Impl : ( ',' ) ;
    public final void rule__MOSSwPackage__Group_4_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1841:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1842:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1842:1: ( ',' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1843:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_2_3_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MOSSwPackage__Group_4_2_3__0__Impl3607); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2_3__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2_3__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1856:1: rule__MOSSwPackage__Group_4_2_3__1 : rule__MOSSwPackage__Group_4_2_3__1__Impl ;
    public final void rule__MOSSwPackage__Group_4_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1860:1: ( rule__MOSSwPackage__Group_4_2_3__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1861:2: rule__MOSSwPackage__Group_4_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2_3__1__Impl_in_rule__MOSSwPackage__Group_4_2_3__13638);
            rule__MOSSwPackage__Group_4_2_3__1__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_2_3__1"


    // $ANTLR start "rule__MOSSwPackage__Group_4_2_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1867:1: rule__MOSSwPackage__Group_4_2_3__1__Impl : ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_3_1 ) ) ;
    public final void rule__MOSSwPackage__Group_4_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1871:1: ( ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1872:1: ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1872:1: ( ( rule__MOSSwPackage__CtoolsAssignment_4_2_3_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1873:1: ( rule__MOSSwPackage__CtoolsAssignment_4_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_3_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1874:1: ( rule__MOSSwPackage__CtoolsAssignment_4_2_3_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1874:2: rule__MOSSwPackage__CtoolsAssignment_4_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__CtoolsAssignment_4_2_3_1_in_rule__MOSSwPackage__Group_4_2_3__1__Impl3665);
            rule__MOSSwPackage__CtoolsAssignment_4_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_2_3__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1888:1: rule__MOSSwPackage__Group_4_3__0 : rule__MOSSwPackage__Group_4_3__0__Impl rule__MOSSwPackage__Group_4_3__1 ;
    public final void rule__MOSSwPackage__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1892:1: ( rule__MOSSwPackage__Group_4_3__0__Impl rule__MOSSwPackage__Group_4_3__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1893:2: rule__MOSSwPackage__Group_4_3__0__Impl rule__MOSSwPackage__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__0__Impl_in_rule__MOSSwPackage__Group_4_3__03699);
            rule__MOSSwPackage__Group_4_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__1_in_rule__MOSSwPackage__Group_4_3__03702);
            rule__MOSSwPackage__Group_4_3__1();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__0"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1900:1: rule__MOSSwPackage__Group_4_3__0__Impl : ( 'provided osswis' ) ;
    public final void rule__MOSSwPackage__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1904:1: ( ( 'provided osswis' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1905:1: ( 'provided osswis' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1905:1: ( 'provided osswis' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1906:1: 'provided osswis'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOsswisKeyword_4_3_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MOSSwPackage__Group_4_3__0__Impl3730); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOsswisKeyword_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1919:1: rule__MOSSwPackage__Group_4_3__1 : rule__MOSSwPackage__Group_4_3__1__Impl rule__MOSSwPackage__Group_4_3__2 ;
    public final void rule__MOSSwPackage__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1923:1: ( rule__MOSSwPackage__Group_4_3__1__Impl rule__MOSSwPackage__Group_4_3__2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1924:2: rule__MOSSwPackage__Group_4_3__1__Impl rule__MOSSwPackage__Group_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__1__Impl_in_rule__MOSSwPackage__Group_4_3__13761);
            rule__MOSSwPackage__Group_4_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__2_in_rule__MOSSwPackage__Group_4_3__13764);
            rule__MOSSwPackage__Group_4_3__2();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__1"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1931:1: rule__MOSSwPackage__Group_4_3__1__Impl : ( ':=' ) ;
    public final void rule__MOSSwPackage__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1935:1: ( ( ':=' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1936:1: ( ':=' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1936:1: ( ':=' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1937:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_3_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MOSSwPackage__Group_4_3__1__Impl3792); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1950:1: rule__MOSSwPackage__Group_4_3__2 : rule__MOSSwPackage__Group_4_3__2__Impl rule__MOSSwPackage__Group_4_3__3 ;
    public final void rule__MOSSwPackage__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1954:1: ( rule__MOSSwPackage__Group_4_3__2__Impl rule__MOSSwPackage__Group_4_3__3 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1955:2: rule__MOSSwPackage__Group_4_3__2__Impl rule__MOSSwPackage__Group_4_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__2__Impl_in_rule__MOSSwPackage__Group_4_3__23823);
            rule__MOSSwPackage__Group_4_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__3_in_rule__MOSSwPackage__Group_4_3__23826);
            rule__MOSSwPackage__Group_4_3__3();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__2"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__2__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1962:1: rule__MOSSwPackage__Group_4_3__2__Impl : ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2 ) ) ;
    public final void rule__MOSSwPackage__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1966:1: ( ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1967:1: ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1967:1: ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1968:1: ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_2()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1969:1: ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1969:2: rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2_in_rule__MOSSwPackage__Group_4_3__2__Impl3853);
            rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__2__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1979:1: rule__MOSSwPackage__Group_4_3__3 : rule__MOSSwPackage__Group_4_3__3__Impl rule__MOSSwPackage__Group_4_3__4 ;
    public final void rule__MOSSwPackage__Group_4_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1983:1: ( rule__MOSSwPackage__Group_4_3__3__Impl rule__MOSSwPackage__Group_4_3__4 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1984:2: rule__MOSSwPackage__Group_4_3__3__Impl rule__MOSSwPackage__Group_4_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__3__Impl_in_rule__MOSSwPackage__Group_4_3__33883);
            rule__MOSSwPackage__Group_4_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__4_in_rule__MOSSwPackage__Group_4_3__33886);
            rule__MOSSwPackage__Group_4_3__4();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__3"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__3__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1991:1: rule__MOSSwPackage__Group_4_3__3__Impl : ( ( rule__MOSSwPackage__Group_4_3_3__0 )* ) ;
    public final void rule__MOSSwPackage__Group_4_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1995:1: ( ( ( rule__MOSSwPackage__Group_4_3_3__0 )* ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1996:1: ( ( rule__MOSSwPackage__Group_4_3_3__0 )* )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1996:1: ( ( rule__MOSSwPackage__Group_4_3_3__0 )* )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1997:1: ( rule__MOSSwPackage__Group_4_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getGroup_4_3_3()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1998:1: ( rule__MOSSwPackage__Group_4_3_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:1998:2: rule__MOSSwPackage__Group_4_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3_3__0_in_rule__MOSSwPackage__Group_4_3__3__Impl3913);
            	    rule__MOSSwPackage__Group_4_3_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getGroup_4_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__3__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__4"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2008:1: rule__MOSSwPackage__Group_4_3__4 : rule__MOSSwPackage__Group_4_3__4__Impl ;
    public final void rule__MOSSwPackage__Group_4_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2012:1: ( rule__MOSSwPackage__Group_4_3__4__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2013:2: rule__MOSSwPackage__Group_4_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__4__Impl_in_rule__MOSSwPackage__Group_4_3__43944);
            rule__MOSSwPackage__Group_4_3__4__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__4"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3__4__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2019:1: rule__MOSSwPackage__Group_4_3__4__Impl : ( ';' ) ;
    public final void rule__MOSSwPackage__Group_4_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2023:1: ( ( ';' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2024:1: ( ';' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2024:1: ( ';' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2025:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_3_4()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MOSSwPackage__Group_4_3__4__Impl3972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3__4__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3_3__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2048:1: rule__MOSSwPackage__Group_4_3_3__0 : rule__MOSSwPackage__Group_4_3_3__0__Impl rule__MOSSwPackage__Group_4_3_3__1 ;
    public final void rule__MOSSwPackage__Group_4_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2052:1: ( rule__MOSSwPackage__Group_4_3_3__0__Impl rule__MOSSwPackage__Group_4_3_3__1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2053:2: rule__MOSSwPackage__Group_4_3_3__0__Impl rule__MOSSwPackage__Group_4_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3_3__0__Impl_in_rule__MOSSwPackage__Group_4_3_3__04013);
            rule__MOSSwPackage__Group_4_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3_3__1_in_rule__MOSSwPackage__Group_4_3_3__04016);
            rule__MOSSwPackage__Group_4_3_3__1();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_3_3__0"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3_3__0__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2060:1: rule__MOSSwPackage__Group_4_3_3__0__Impl : ( ',' ) ;
    public final void rule__MOSSwPackage__Group_4_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2064:1: ( ( ',' ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2065:1: ( ',' )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2065:1: ( ',' )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2066:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_3_3_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MOSSwPackage__Group_4_3_3__0__Impl4044); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3_3__0__Impl"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3_3__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2079:1: rule__MOSSwPackage__Group_4_3_3__1 : rule__MOSSwPackage__Group_4_3_3__1__Impl ;
    public final void rule__MOSSwPackage__Group_4_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2083:1: ( rule__MOSSwPackage__Group_4_3_3__1__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2084:2: rule__MOSSwPackage__Group_4_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3_3__1__Impl_in_rule__MOSSwPackage__Group_4_3_3__14075);
            rule__MOSSwPackage__Group_4_3_3__1__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__Group_4_3_3__1"


    // $ANTLR start "rule__MOSSwPackage__Group_4_3_3__1__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2090:1: rule__MOSSwPackage__Group_4_3_3__1__Impl : ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1 ) ) ;
    public final void rule__MOSSwPackage__Group_4_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2094:1: ( ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1 ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2095:1: ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1 ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2095:1: ( ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1 ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2096:1: ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_3_1()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2097:1: ( rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1 )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2097:2: rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1_in_rule__MOSSwPackage__Group_4_3_3__1__Impl4102);
            rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__Group_4_3_3__1__Impl"


    // $ANTLR start "rule__MOSSwPackage__UnorderedGroup_4"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2112:1: rule__MOSSwPackage__UnorderedGroup_4 : rule__MOSSwPackage__UnorderedGroup_4__0 {...}?;
    public final void rule__MOSSwPackage__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2117:1: ( rule__MOSSwPackage__UnorderedGroup_4__0 {...}?)
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2118:2: rule__MOSSwPackage__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__0_in_rule__MOSSwPackage__UnorderedGroup_44137);
            rule__MOSSwPackage__UnorderedGroup_4__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__MOSSwPackage__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__UnorderedGroup_4"


    // $ANTLR start "rule__MOSSwPackage__UnorderedGroup_4__Impl"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2129:1: rule__MOSSwPackage__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) ) ) ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2134:1: ( ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2135:3: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2135:3: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) ) )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( LA12_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                alt12=2;
            }
            else if ( LA12_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                alt12=3;
            }
            else if ( LA12_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                alt12=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2137:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2137:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2138:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwPackage__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2138:109: ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2139:6: ( ( rule__MOSSwPackage__Group_4_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2145:6: ( ( rule__MOSSwPackage__Group_4_0__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2147:7: ( rule__MOSSwPackage__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwPackageAccess().getGroup_4_0()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2148:7: ( rule__MOSSwPackage__Group_4_0__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2148:8: rule__MOSSwPackage__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_0__0_in_rule__MOSSwPackage__UnorderedGroup_4__Impl4226);
                    rule__MOSSwPackage__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMOSSwPackageAccess().getGroup_4_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2154:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2154:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2155:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwPackage__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2155:109: ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2156:6: ( ( rule__MOSSwPackage__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2162:6: ( ( rule__MOSSwPackage__Group_4_1__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2164:7: ( rule__MOSSwPackage__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwPackageAccess().getGroup_4_1()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2165:7: ( rule__MOSSwPackage__Group_4_1__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2165:8: rule__MOSSwPackage__Group_4_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_1__0_in_rule__MOSSwPackage__UnorderedGroup_4__Impl4317);
                    rule__MOSSwPackage__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMOSSwPackageAccess().getGroup_4_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2171:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2171:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2172:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwPackage__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2172:109: ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2173:6: ( ( rule__MOSSwPackage__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2179:6: ( ( rule__MOSSwPackage__Group_4_2__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2181:7: ( rule__MOSSwPackage__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwPackageAccess().getGroup_4_2()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2182:7: ( rule__MOSSwPackage__Group_4_2__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2182:8: rule__MOSSwPackage__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__0_in_rule__MOSSwPackage__UnorderedGroup_4__Impl4408);
                    rule__MOSSwPackage__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMOSSwPackageAccess().getGroup_4_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2188:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) )
                    {
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2188:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2189:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwPackage__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2189:109: ( ( ( rule__MOSSwPackage__Group_4_3__0 ) ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2190:6: ( ( rule__MOSSwPackage__Group_4_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3);
                    selected = true;
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2196:6: ( ( rule__MOSSwPackage__Group_4_3__0 ) )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2198:7: ( rule__MOSSwPackage__Group_4_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwPackageAccess().getGroup_4_3()); 
                    }
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2199:7: ( rule__MOSSwPackage__Group_4_3__0 )
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2199:8: rule__MOSSwPackage__Group_4_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_3__0_in_rule__MOSSwPackage__UnorderedGroup_4__Impl4499);
                    rule__MOSSwPackage__Group_4_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMOSSwPackageAccess().getGroup_4_3()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__MOSSwPackage__UnorderedGroup_4__0"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2214:1: rule__MOSSwPackage__UnorderedGroup_4__0 : rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__1 )? ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2218:1: ( rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__1 )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2219:2: rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__Impl_in_rule__MOSSwPackage__UnorderedGroup_4__04558);
            rule__MOSSwPackage__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2220:2: ( rule__MOSSwPackage__UnorderedGroup_4__1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:0:0: rule__MOSSwPackage__UnorderedGroup_4__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__1_in_rule__MOSSwPackage__UnorderedGroup_4__04561);
                    rule__MOSSwPackage__UnorderedGroup_4__1();

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
    // $ANTLR end "rule__MOSSwPackage__UnorderedGroup_4__0"


    // $ANTLR start "rule__MOSSwPackage__UnorderedGroup_4__1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2227:1: rule__MOSSwPackage__UnorderedGroup_4__1 : rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__2 )? ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2231:1: ( rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__2 )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2232:2: rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__Impl_in_rule__MOSSwPackage__UnorderedGroup_4__14586);
            rule__MOSSwPackage__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2233:2: ( rule__MOSSwPackage__UnorderedGroup_4__2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:0:0: rule__MOSSwPackage__UnorderedGroup_4__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__2_in_rule__MOSSwPackage__UnorderedGroup_4__14589);
                    rule__MOSSwPackage__UnorderedGroup_4__2();

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
    // $ANTLR end "rule__MOSSwPackage__UnorderedGroup_4__1"


    // $ANTLR start "rule__MOSSwPackage__UnorderedGroup_4__2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2240:1: rule__MOSSwPackage__UnorderedGroup_4__2 : rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__3 )? ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2244:1: ( rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__3 )? )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2245:2: rule__MOSSwPackage__UnorderedGroup_4__Impl ( rule__MOSSwPackage__UnorderedGroup_4__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__Impl_in_rule__MOSSwPackage__UnorderedGroup_4__24614);
            rule__MOSSwPackage__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2246:2: ( rule__MOSSwPackage__UnorderedGroup_4__3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:0:0: rule__MOSSwPackage__UnorderedGroup_4__3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__3_in_rule__MOSSwPackage__UnorderedGroup_4__24617);
                    rule__MOSSwPackage__UnorderedGroup_4__3();

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
    // $ANTLR end "rule__MOSSwPackage__UnorderedGroup_4__2"


    // $ANTLR start "rule__MOSSwPackage__UnorderedGroup_4__3"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2253:1: rule__MOSSwPackage__UnorderedGroup_4__3 : rule__MOSSwPackage__UnorderedGroup_4__Impl ;
    public final void rule__MOSSwPackage__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2257:1: ( rule__MOSSwPackage__UnorderedGroup_4__Impl )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2258:2: rule__MOSSwPackage__UnorderedGroup_4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__Impl_in_rule__MOSSwPackage__UnorderedGroup_4__34642);
            rule__MOSSwPackage__UnorderedGroup_4__Impl();

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
    // $ANTLR end "rule__MOSSwPackage__UnorderedGroup_4__3"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__PackageAssignment_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2273:1: rule__MMESPOSSWPPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPOSSWPPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2277:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2278:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2278:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2279:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2280:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2281:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MMESPOSSWPPackageFile__PackageAssignment_14682);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__PackageAssignment_1"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2292:1: rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2296:1: ( ( ( ruleQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2297:1: ( ( ruleQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2297:1: ( ( ruleQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2298:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2299:1: ( ruleQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2300:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MMESPOSSWPPackageFile__ImportsAssignment_3_14721);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1"


    // $ANTLR start "rule__MMESPOSSWPPackageFile__ElementAssignment_4"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2311:1: rule__MMESPOSSWPPackageFile__ElementAssignment_4 : ( ruleMMESPOSSWPPackageElement ) ;
    public final void rule__MMESPOSSWPPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2315:1: ( ( ruleMMESPOSSWPPackageElement ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2316:1: ( ruleMMESPOSSWPPackageElement )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2316:1: ( ruleMMESPOSSWPPackageElement )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2317:1: ruleMMESPOSSWPPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementMMESPOSSWPPackageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMMESPOSSWPPackageElement_in_rule__MMESPOSSWPPackageFile__ElementAssignment_44756);
            ruleMMESPOSSWPPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementMMESPOSSWPPackageElementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWPPackageFile__ElementAssignment_4"


    // $ANTLR start "rule__MOSSwPackage__NameAssignment_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2326:1: rule__MOSSwPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MOSSwPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2330:1: ( ( RULE_ID ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2331:1: ( RULE_ID )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2331:1: ( RULE_ID )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2332:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MOSSwPackage__NameAssignment_14787); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__NameAssignment_1"


    // $ANTLR start "rule__MOSSwPackage__ExtendsAssignment_2_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2341:1: rule__MOSSwPackage__ExtendsAssignment_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2345:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2346:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2346:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2347:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2348:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2349:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ExtendsAssignment_2_14822);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__ExtendsAssignment_2_1"


    // $ANTLR start "rule__MOSSwPackage__ExtendsAssignment_2_2_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2360:1: rule__MOSSwPackage__ExtendsAssignment_2_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ExtendsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2364:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2365:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2365:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2366:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_2_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2367:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2368:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ExtendsAssignment_2_2_14861);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__ExtendsAssignment_2_2_1"


    // $ANTLR start "rule__MOSSwPackage__VersionAssignment_4_0_2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2379:1: rule__MOSSwPackage__VersionAssignment_4_0_2 : ( ruleVersion ) ;
    public final void rule__MOSSwPackage__VersionAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2383:1: ( ( ruleVersion ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2384:1: ( ruleVersion )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2384:1: ( ruleVersion )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2385:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__MOSSwPackage__VersionAssignment_4_0_24896);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__VersionAssignment_4_0_2"


    // $ANTLR start "rule__MOSSwPackage__ReferencedElementAssignment_4_1_2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2394:1: rule__MOSSwPackage__ReferencedElementAssignment_4_1_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ReferencedElementAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2398:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2399:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2399:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2400:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemCrossReference_4_1_2_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2401:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2402:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ReferencedElementAssignment_4_1_24931);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemCrossReference_4_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__ReferencedElementAssignment_4_1_2"


    // $ANTLR start "rule__MOSSwPackage__CtoolsAssignment_4_2_2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2413:1: rule__MOSSwPackage__CtoolsAssignment_4_2_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__CtoolsAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2417:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2418:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2418:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2419:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_2_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2420:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2421:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__CtoolsAssignment_4_2_24970);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__CtoolsAssignment_4_2_2"


    // $ANTLR start "rule__MOSSwPackage__CtoolsAssignment_4_2_3_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2432:1: rule__MOSSwPackage__CtoolsAssignment_4_2_3_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__CtoolsAssignment_4_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2436:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2437:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2437:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2438:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2439:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2440:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__CtoolsAssignment_4_2_3_15009);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__CtoolsAssignment_4_2_3_1"


    // $ANTLR start "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2451:1: rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2455:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2456:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2456:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2457:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_2_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2458:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2459:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_25048);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2"


    // $ANTLR start "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1"
    // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2470:1: rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2474:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2475:1: ( ( ruleVersionedQualifiedName ) )
            {
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2475:1: ( ( ruleVersionedQualifiedName ) )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2476:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_1_0()); 
            }
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2477:1: ( ruleVersionedQualifiedName )
            // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2478:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_15087);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1"

    // $ANTLR start synpred12_InternalOSSWP
    public final void synpred12_InternalOSSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2137:4: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2137:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2137:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2138:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2138:109: ( ( ( rule__MOSSwPackage__Group_4_0__0 ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2139:6: ( ( rule__MOSSwPackage__Group_4_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2145:6: ( ( rule__MOSSwPackage__Group_4_0__0 ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2147:7: ( rule__MOSSwPackage__Group_4_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMOSSwPackageAccess().getGroup_4_0()); 
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2148:7: ( rule__MOSSwPackage__Group_4_0__0 )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2148:8: rule__MOSSwPackage__Group_4_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_0__0_in_synpred12_InternalOSSWP4226);
        rule__MOSSwPackage__Group_4_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalOSSWP

    // $ANTLR start synpred13_InternalOSSWP
    public final void synpred13_InternalOSSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2154:4: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2154:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2154:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2155:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2155:109: ( ( ( rule__MOSSwPackage__Group_4_1__0 ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2156:6: ( ( rule__MOSSwPackage__Group_4_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2162:6: ( ( rule__MOSSwPackage__Group_4_1__0 ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2164:7: ( rule__MOSSwPackage__Group_4_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMOSSwPackageAccess().getGroup_4_1()); 
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2165:7: ( rule__MOSSwPackage__Group_4_1__0 )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2165:8: rule__MOSSwPackage__Group_4_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_1__0_in_synpred13_InternalOSSWP4317);
        rule__MOSSwPackage__Group_4_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalOSSWP

    // $ANTLR start synpred14_InternalOSSWP
    public final void synpred14_InternalOSSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2171:4: ( ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2171:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) )
        {
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2171:4: ({...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2172:5: {...}? => ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred14_InternalOSSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2)");
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2172:109: ( ( ( rule__MOSSwPackage__Group_4_2__0 ) ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2173:6: ( ( rule__MOSSwPackage__Group_4_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2);
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2179:6: ( ( rule__MOSSwPackage__Group_4_2__0 ) )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2181:7: ( rule__MOSSwPackage__Group_4_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMOSSwPackageAccess().getGroup_4_2()); 
        }
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2182:7: ( rule__MOSSwPackage__Group_4_2__0 )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2182:8: rule__MOSSwPackage__Group_4_2__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__Group_4_2__0_in_synpred14_InternalOSSWP4408);
        rule__MOSSwPackage__Group_4_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalOSSWP

    // $ANTLR start synpred15_InternalOSSWP
    public final void synpred15_InternalOSSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2220:2: ( rule__MOSSwPackage__UnorderedGroup_4__1 )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2220:2: rule__MOSSwPackage__UnorderedGroup_4__1
        {
        pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__1_in_synpred15_InternalOSSWP4561);
        rule__MOSSwPackage__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalOSSWP

    // $ANTLR start synpred16_InternalOSSWP
    public final void synpred16_InternalOSSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2233:2: ( rule__MOSSwPackage__UnorderedGroup_4__2 )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2233:2: rule__MOSSwPackage__UnorderedGroup_4__2
        {
        pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__2_in_synpred16_InternalOSSWP4589);
        rule__MOSSwPackage__UnorderedGroup_4__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalOSSWP

    // $ANTLR start synpred17_InternalOSSWP
    public final void synpred17_InternalOSSWP_fragment() throws RecognitionException {   
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2246:2: ( rule__MOSSwPackage__UnorderedGroup_4__3 )
        // ../es.uah.aut.srg.micobs.mesp.editor.osswp.ui/src-gen/es/uah/aut/srg/micobs/mesp/lang/ui/contentassist/antlr/internal/InternalOSSWP.g:2246:2: rule__MOSSwPackage__UnorderedGroup_4__3
        {
        pushFollow(FollowSets000.FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__3_in_synpred17_InternalOSSWP4617);
        rule__MOSSwPackage__UnorderedGroup_4__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalOSSWP

    // Delegated rules

    public final boolean synpred16_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalOSSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalOSSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalOSSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalOSSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalOSSWP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalOSSWP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalOSSWP_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleMMESPOSSWPPackageFile_in_entryRuleMMESPOSSWPPackageFile67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPOSSWPPackageFile74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__0_in_ruleMMESPOSSWPPackageFile100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPOSSWPPackageElement_in_entryRuleMMESPOSSWPPackageElement127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMMESPOSSWPPackageElement134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMOSSwPackage_in_ruleMMESPOSSWPPackageElement160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_entryRuleVersionedQualifiedName306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersionedQualifiedName313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__0_in_ruleVersionedQualifiedName339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMOSSwPackage_in_entryRuleMOSSwPackage366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMOSSwPackage373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__0_in_ruleMOSSwPackage399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_0435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0_in_rule__Version__Alternatives_0452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0_in_rule__Version__Alternatives_1_1502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__0__Impl_in_rule__MMESPOSSWPPackageFile__Group__0533 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__1_in_rule__MMESPOSSWPPackageFile__Group__0536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MMESPOSSWPPackageFile__Group__0__Impl564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__1__Impl_in_rule__MMESPOSSWPPackageFile__Group__1595 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__2_in_rule__MMESPOSSWPPackageFile__Group__1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__PackageAssignment_1_in_rule__MMESPOSSWPPackageFile__Group__1__Impl625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__2__Impl_in_rule__MMESPOSSWPPackageFile__Group__2655 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__3_in_rule__MMESPOSSWPPackageFile__Group__2658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MMESPOSSWPPackageFile__Group__2__Impl686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__3__Impl_in_rule__MMESPOSSWPPackageFile__Group__3717 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__4_in_rule__MMESPOSSWPPackageFile__Group__3720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__0_in_rule__MMESPOSSWPPackageFile__Group__3__Impl747 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group__4__Impl_in_rule__MMESPOSSWPPackageFile__Group__4778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__ElementAssignment_4_in_rule__MMESPOSSWPPackageFile__Group__4__Impl805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__0__Impl_in_rule__MMESPOSSWPPackageFile__Group_3__0845 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__1_in_rule__MMESPOSSWPPackageFile__Group_3__0848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MMESPOSSWPPackageFile__Group_3__0__Impl876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__1__Impl_in_rule__MMESPOSSWPPackageFile__Group_3__1907 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__2_in_rule__MMESPOSSWPPackageFile__Group_3__1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1_in_rule__MMESPOSSWPPackageFile__Group_3__1__Impl937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MMESPOSSWPPackageFile__Group_3__2__Impl_in_rule__MMESPOSSWPPackageFile__Group_3__2967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MMESPOSSWPPackageFile__Group_3__2__Impl995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01032 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1118 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01153 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__01275 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__01278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Alternatives_0_in_rule__Version__Group__0__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__11335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl1362 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__0__Impl_in_rule__Version__Group_0_1__01397 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__1_in_rule__Version__Group_0_1__01400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_0_1__0__Impl1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_0_1__1__Impl_in_rule__Version__Group_0_1__11459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_0_1__1__Impl1486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__01519 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__01522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Version__Group_1__0__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__11581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Alternatives_1_1_in_rule__Version__Group_1__1__Impl1608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__0__Impl_in_rule__Version__Group_1_1_1__01642 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1_in_rule__Version__Group_1_1_1__01645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_1_1_1__0__Impl1673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group_1_1_1__1__Impl_in_rule__Version__Group_1_1_1__11704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_1_1_1__1__Impl1731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__0__Impl_in_rule__VersionedQualifiedName__Group__01764 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__1_in_rule__VersionedQualifiedName__Group__01767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__VersionedQualifiedName__Group__0__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__1__Impl_in_rule__VersionedQualifiedName__Group__11823 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__2_in_rule__VersionedQualifiedName__Group__11826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__VersionedQualifiedName__Group__1__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__2__Impl_in_rule__VersionedQualifiedName__Group__21885 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__3_in_rule__VersionedQualifiedName__Group__21888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__VersionedQualifiedName__Group__2__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersionedQualifiedName__Group__3__Impl_in_rule__VersionedQualifiedName__Group__31944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__VersionedQualifiedName__Group__3__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__0__Impl_in_rule__MOSSwPackage__Group__02011 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__1_in_rule__MOSSwPackage__Group__02014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MOSSwPackage__Group__0__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__1__Impl_in_rule__MOSSwPackage__Group__12073 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__2_in_rule__MOSSwPackage__Group__12076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__NameAssignment_1_in_rule__MOSSwPackage__Group__1__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__2__Impl_in_rule__MOSSwPackage__Group__22133 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__3_in_rule__MOSSwPackage__Group__22136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2__0_in_rule__MOSSwPackage__Group__2__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__3__Impl_in_rule__MOSSwPackage__Group__32194 = new BitSet(new long[]{0x0000000007400000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__4_in_rule__MOSSwPackage__Group__32197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MOSSwPackage__Group__3__Impl2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__4__Impl_in_rule__MOSSwPackage__Group__42256 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__5_in_rule__MOSSwPackage__Group__42259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4_in_rule__MOSSwPackage__Group__4__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__5__Impl_in_rule__MOSSwPackage__Group__52316 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__6_in_rule__MOSSwPackage__Group__52319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MOSSwPackage__Group__5__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group__6__Impl_in_rule__MOSSwPackage__Group__62378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MOSSwPackage__Group__6__Impl2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2__0__Impl_in_rule__MOSSwPackage__Group_2__02451 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2__1_in_rule__MOSSwPackage__Group_2__02454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MOSSwPackage__Group_2__0__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2__1__Impl_in_rule__MOSSwPackage__Group_2__12513 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2__2_in_rule__MOSSwPackage__Group_2__12516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__ExtendsAssignment_2_1_in_rule__MOSSwPackage__Group_2__1__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2__2__Impl_in_rule__MOSSwPackage__Group_2__22573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2_2__0_in_rule__MOSSwPackage__Group_2__2__Impl2600 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2_2__0__Impl_in_rule__MOSSwPackage__Group_2_2__02637 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2_2__1_in_rule__MOSSwPackage__Group_2_2__02640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MOSSwPackage__Group_2_2__0__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_2_2__1__Impl_in_rule__MOSSwPackage__Group_2_2__12699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__ExtendsAssignment_2_2_1_in_rule__MOSSwPackage__Group_2_2__1__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_0__0__Impl_in_rule__MOSSwPackage__Group_4_0__02760 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_0__1_in_rule__MOSSwPackage__Group_4_0__02763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MOSSwPackage__Group_4_0__0__Impl2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_0__1__Impl_in_rule__MOSSwPackage__Group_4_0__12822 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_0__2_in_rule__MOSSwPackage__Group_4_0__12825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MOSSwPackage__Group_4_0__1__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_0__2__Impl_in_rule__MOSSwPackage__Group_4_0__22884 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_0__3_in_rule__MOSSwPackage__Group_4_0__22887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__VersionAssignment_4_0_2_in_rule__MOSSwPackage__Group_4_0__2__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_0__3__Impl_in_rule__MOSSwPackage__Group_4_0__32944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MOSSwPackage__Group_4_0__3__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_1__0__Impl_in_rule__MOSSwPackage__Group_4_1__03011 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_1__1_in_rule__MOSSwPackage__Group_4_1__03014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MOSSwPackage__Group_4_1__0__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_1__1__Impl_in_rule__MOSSwPackage__Group_4_1__13073 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_1__2_in_rule__MOSSwPackage__Group_4_1__13076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MOSSwPackage__Group_4_1__1__Impl3104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_1__2__Impl_in_rule__MOSSwPackage__Group_4_1__23135 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_1__3_in_rule__MOSSwPackage__Group_4_1__23138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__ReferencedElementAssignment_4_1_2_in_rule__MOSSwPackage__Group_4_1__2__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_1__3__Impl_in_rule__MOSSwPackage__Group_4_1__33195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MOSSwPackage__Group_4_1__3__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__0__Impl_in_rule__MOSSwPackage__Group_4_2__03262 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__1_in_rule__MOSSwPackage__Group_4_2__03265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MOSSwPackage__Group_4_2__0__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__1__Impl_in_rule__MOSSwPackage__Group_4_2__13324 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__2_in_rule__MOSSwPackage__Group_4_2__13327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MOSSwPackage__Group_4_2__1__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__2__Impl_in_rule__MOSSwPackage__Group_4_2__23386 = new BitSet(new long[]{0x0000000000201000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__3_in_rule__MOSSwPackage__Group_4_2__23389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__CtoolsAssignment_4_2_2_in_rule__MOSSwPackage__Group_4_2__2__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__3__Impl_in_rule__MOSSwPackage__Group_4_2__33446 = new BitSet(new long[]{0x0000000000201000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__4_in_rule__MOSSwPackage__Group_4_2__33449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2_3__0_in_rule__MOSSwPackage__Group_4_2__3__Impl3476 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__4__Impl_in_rule__MOSSwPackage__Group_4_2__43507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MOSSwPackage__Group_4_2__4__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2_3__0__Impl_in_rule__MOSSwPackage__Group_4_2_3__03576 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2_3__1_in_rule__MOSSwPackage__Group_4_2_3__03579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MOSSwPackage__Group_4_2_3__0__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2_3__1__Impl_in_rule__MOSSwPackage__Group_4_2_3__13638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__CtoolsAssignment_4_2_3_1_in_rule__MOSSwPackage__Group_4_2_3__1__Impl3665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__0__Impl_in_rule__MOSSwPackage__Group_4_3__03699 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__1_in_rule__MOSSwPackage__Group_4_3__03702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MOSSwPackage__Group_4_3__0__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__1__Impl_in_rule__MOSSwPackage__Group_4_3__13761 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__2_in_rule__MOSSwPackage__Group_4_3__13764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MOSSwPackage__Group_4_3__1__Impl3792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__2__Impl_in_rule__MOSSwPackage__Group_4_3__23823 = new BitSet(new long[]{0x0000000000201000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__3_in_rule__MOSSwPackage__Group_4_3__23826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_2_in_rule__MOSSwPackage__Group_4_3__2__Impl3853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__3__Impl_in_rule__MOSSwPackage__Group_4_3__33883 = new BitSet(new long[]{0x0000000000201000L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__4_in_rule__MOSSwPackage__Group_4_3__33886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3_3__0_in_rule__MOSSwPackage__Group_4_3__3__Impl3913 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__4__Impl_in_rule__MOSSwPackage__Group_4_3__43944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MOSSwPackage__Group_4_3__4__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3_3__0__Impl_in_rule__MOSSwPackage__Group_4_3_3__04013 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3_3__1_in_rule__MOSSwPackage__Group_4_3_3__04016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MOSSwPackage__Group_4_3_3__0__Impl4044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3_3__1__Impl_in_rule__MOSSwPackage__Group_4_3_3__14075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_1_in_rule__MOSSwPackage__Group_4_3_3__1__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__0_in_rule__MOSSwPackage__UnorderedGroup_44137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_0__0_in_rule__MOSSwPackage__UnorderedGroup_4__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_1__0_in_rule__MOSSwPackage__UnorderedGroup_4__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__0_in_rule__MOSSwPackage__UnorderedGroup_4__Impl4408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_3__0_in_rule__MOSSwPackage__UnorderedGroup_4__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__Impl_in_rule__MOSSwPackage__UnorderedGroup_4__04558 = new BitSet(new long[]{0x0000000007400002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__1_in_rule__MOSSwPackage__UnorderedGroup_4__04561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__Impl_in_rule__MOSSwPackage__UnorderedGroup_4__14586 = new BitSet(new long[]{0x0000000007400002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__2_in_rule__MOSSwPackage__UnorderedGroup_4__14589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__Impl_in_rule__MOSSwPackage__UnorderedGroup_4__24614 = new BitSet(new long[]{0x0000000007400002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__3_in_rule__MOSSwPackage__UnorderedGroup_4__24617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__Impl_in_rule__MOSSwPackage__UnorderedGroup_4__34642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MMESPOSSWPPackageFile__PackageAssignment_14682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MMESPOSSWPPackageFile__ImportsAssignment_3_14721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMMESPOSSWPPackageElement_in_rule__MMESPOSSWPPackageFile__ElementAssignment_44756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MOSSwPackage__NameAssignment_14787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ExtendsAssignment_2_14822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ExtendsAssignment_2_2_14861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__MOSSwPackage__VersionAssignment_4_0_24896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ReferencedElementAssignment_4_1_24931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__CtoolsAssignment_4_2_24970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__CtoolsAssignment_4_2_3_15009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_25048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersionedQualifiedName_in_rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3_15087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_0__0_in_synpred12_InternalOSSWP4226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_1__0_in_synpred13_InternalOSSWP4317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__Group_4_2__0_in_synpred14_InternalOSSWP4408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__1_in_synpred15_InternalOSSWP4561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__2_in_synpred16_InternalOSSWP4589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MOSSwPackage__UnorderedGroup_4__3_in_synpred17_InternalOSSWP4617 = new BitSet(new long[]{0x0000000000000002L});
    }


}