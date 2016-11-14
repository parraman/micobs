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
import es.uah.aut.srg.micobs.mesp.lang.services.SWIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSWIParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'swinterface'", "'{'", "'}'", "'extends'", "','", "'version'", "':='", "'language'", "'configuration'", "'parameters'", "'provided'", "'resources'", "'requires'", "'required'", "'osapi'", "'quantifiable'", "'resource'", "'step'", "'to'", "'instantiable'", "'integer'", "'range'", "'enum'", "'real'", "'='", "'boolean'", "'string'", "'e'", "']'", "'['", "'const'", "'raw'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_HEXADECIMAL=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
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


        public InternalSWIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSWIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSWIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSWI.g"; }


     
     	private SWIGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SWIGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMMESPSWIPackageFile"
    // InternalSWI.g:61:1: entryRuleMMESPSWIPackageFile : ruleMMESPSWIPackageFile EOF ;
    public final void entryRuleMMESPSWIPackageFile() throws RecognitionException {
        try {
            // InternalSWI.g:62:1: ( ruleMMESPSWIPackageFile EOF )
            // InternalSWI.g:63:1: ruleMMESPSWIPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMMESPSWIPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMESPSWIPackageFile"


    // $ANTLR start "ruleMMESPSWIPackageFile"
    // InternalSWI.g:70:1: ruleMMESPSWIPackageFile : ( ( rule__MMESPSWIPackageFile__Group__0 ) ) ;
    public final void ruleMMESPSWIPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:74:2: ( ( ( rule__MMESPSWIPackageFile__Group__0 ) ) )
            // InternalSWI.g:75:1: ( ( rule__MMESPSWIPackageFile__Group__0 ) )
            {
            // InternalSWI.g:75:1: ( ( rule__MMESPSWIPackageFile__Group__0 ) )
            // InternalSWI.g:76:1: ( rule__MMESPSWIPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getGroup()); 
            }
            // InternalSWI.g:77:1: ( rule__MMESPSWIPackageFile__Group__0 )
            // InternalSWI.g:77:2: rule__MMESPSWIPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMMESPSWIPackageFile"


    // $ANTLR start "entryRuleMMESPSWIPackageElement"
    // InternalSWI.g:89:1: entryRuleMMESPSWIPackageElement : ruleMMESPSWIPackageElement EOF ;
    public final void entryRuleMMESPSWIPackageElement() throws RecognitionException {
        try {
            // InternalSWI.g:90:1: ( ruleMMESPSWIPackageElement EOF )
            // InternalSWI.g:91:1: ruleMMESPSWIPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMMESPSWIPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMMESPSWIPackageElement"


    // $ANTLR start "ruleMMESPSWIPackageElement"
    // InternalSWI.g:98:1: ruleMMESPSWIPackageElement : ( ruleMSwInterface ) ;
    public final void ruleMMESPSWIPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:102:2: ( ( ruleMSwInterface ) )
            // InternalSWI.g:103:1: ( ruleMSwInterface )
            {
            // InternalSWI.g:103:1: ( ruleMSwInterface )
            // InternalSWI.g:104:1: ruleMSwInterface
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageElementAccess().getMSwInterfaceParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMSwInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageElementAccess().getMSwInterfaceParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMMESPSWIPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSWI.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSWI.g:118:1: ( ruleQualifiedName EOF )
            // InternalSWI.g:119:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalSWI.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSWI.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSWI.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSWI.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalSWI.g:133:1: ( rule__QualifiedName__Group__0 )
            // InternalSWI.g:133:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:145:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalSWI.g:146:1: ( ruleVersion EOF )
            // InternalSWI.g:147:1: ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalSWI.g:154:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:158:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalSWI.g:159:1: ( ( rule__Version__Group__0 ) )
            {
            // InternalSWI.g:159:1: ( ( rule__Version__Group__0 ) )
            // InternalSWI.g:160:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalSWI.g:161:1: ( rule__Version__Group__0 )
            // InternalSWI.g:161:2: rule__Version__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:173:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalSWI.g:174:1: ( ruleVersionedQualifiedName EOF )
            // InternalSWI.g:175:1: ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalSWI.g:182:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:186:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalSWI.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalSWI.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalSWI.g:188:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalSWI.g:189:1: ( rule__VersionedQualifiedName__Group__0 )
            // InternalSWI.g:189:2: rule__VersionedQualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:201:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // InternalSWI.g:202:1: ( ruleVersionedQualifiedReferenceName EOF )
            // InternalSWI.g:203:1: ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalSWI.g:210:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:214:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // InternalSWI.g:215:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // InternalSWI.g:215:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // InternalSWI.g:216:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }
            // InternalSWI.g:217:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // InternalSWI.g:217:2: rule__VersionedQualifiedReferenceName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleMSwInterface"
    // InternalSWI.g:229:1: entryRuleMSwInterface : ruleMSwInterface EOF ;
    public final void entryRuleMSwInterface() throws RecognitionException {
        try {
            // InternalSWI.g:230:1: ( ruleMSwInterface EOF )
            // InternalSWI.g:231:1: ruleMSwInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMSwInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMSwInterface"


    // $ANTLR start "ruleMSwInterface"
    // InternalSWI.g:238:1: ruleMSwInterface : ( ( rule__MSwInterface__Group__0 ) ) ;
    public final void ruleMSwInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:242:2: ( ( ( rule__MSwInterface__Group__0 ) ) )
            // InternalSWI.g:243:1: ( ( rule__MSwInterface__Group__0 ) )
            {
            // InternalSWI.g:243:1: ( ( rule__MSwInterface__Group__0 ) )
            // InternalSWI.g:244:1: ( rule__MSwInterface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getGroup()); 
            }
            // InternalSWI.g:245:1: ( rule__MSwInterface__Group__0 )
            // InternalSWI.g:245:2: rule__MSwInterface__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMSwInterface"


    // $ANTLR start "entryRuleMProvidedResource"
    // InternalSWI.g:257:1: entryRuleMProvidedResource : ruleMProvidedResource EOF ;
    public final void entryRuleMProvidedResource() throws RecognitionException {
        try {
            // InternalSWI.g:258:1: ( ruleMProvidedResource EOF )
            // InternalSWI.g:259:1: ruleMProvidedResource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMProvidedResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedResourceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMProvidedResource"


    // $ANTLR start "ruleMProvidedResource"
    // InternalSWI.g:266:1: ruleMProvidedResource : ( ( rule__MProvidedResource__Alternatives ) ) ;
    public final void ruleMProvidedResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:270:2: ( ( ( rule__MProvidedResource__Alternatives ) ) )
            // InternalSWI.g:271:1: ( ( rule__MProvidedResource__Alternatives ) )
            {
            // InternalSWI.g:271:1: ( ( rule__MProvidedResource__Alternatives ) )
            // InternalSWI.g:272:1: ( rule__MProvidedResource__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedResourceAccess().getAlternatives()); 
            }
            // InternalSWI.g:273:1: ( rule__MProvidedResource__Alternatives )
            // InternalSWI.g:273:2: rule__MProvidedResource__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MProvidedResource__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedResourceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMProvidedResource"


    // $ANTLR start "entryRuleMQuantifiableResource"
    // InternalSWI.g:285:1: entryRuleMQuantifiableResource : ruleMQuantifiableResource EOF ;
    public final void entryRuleMQuantifiableResource() throws RecognitionException {
        try {
            // InternalSWI.g:286:1: ( ruleMQuantifiableResource EOF )
            // InternalSWI.g:287:1: ruleMQuantifiableResource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMQuantifiableResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMQuantifiableResource"


    // $ANTLR start "ruleMQuantifiableResource"
    // InternalSWI.g:294:1: ruleMQuantifiableResource : ( ( rule__MQuantifiableResource__Group__0 ) ) ;
    public final void ruleMQuantifiableResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:298:2: ( ( ( rule__MQuantifiableResource__Group__0 ) ) )
            // InternalSWI.g:299:1: ( ( rule__MQuantifiableResource__Group__0 ) )
            {
            // InternalSWI.g:299:1: ( ( rule__MQuantifiableResource__Group__0 ) )
            // InternalSWI.g:300:1: ( rule__MQuantifiableResource__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getGroup()); 
            }
            // InternalSWI.g:301:1: ( rule__MQuantifiableResource__Group__0 )
            // InternalSWI.g:301:2: rule__MQuantifiableResource__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMQuantifiableResource"


    // $ANTLR start "entryRuleMInstantiableResource"
    // InternalSWI.g:313:1: entryRuleMInstantiableResource : ruleMInstantiableResource EOF ;
    public final void entryRuleMInstantiableResource() throws RecognitionException {
        try {
            // InternalSWI.g:314:1: ( ruleMInstantiableResource EOF )
            // InternalSWI.g:315:1: ruleMInstantiableResource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMInstantiableResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMInstantiableResource"


    // $ANTLR start "ruleMInstantiableResource"
    // InternalSWI.g:322:1: ruleMInstantiableResource : ( ( rule__MInstantiableResource__Group__0 ) ) ;
    public final void ruleMInstantiableResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:326:2: ( ( ( rule__MInstantiableResource__Group__0 ) ) )
            // InternalSWI.g:327:1: ( ( rule__MInstantiableResource__Group__0 ) )
            {
            // InternalSWI.g:327:1: ( ( rule__MInstantiableResource__Group__0 ) )
            // InternalSWI.g:328:1: ( rule__MInstantiableResource__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getGroup()); 
            }
            // InternalSWI.g:329:1: ( rule__MInstantiableResource__Group__0 )
            // InternalSWI.g:329:2: rule__MInstantiableResource__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MInstantiableResource__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMInstantiableResource"


    // $ANTLR start "entryRuleMParameter"
    // InternalSWI.g:341:1: entryRuleMParameter : ruleMParameter EOF ;
    public final void entryRuleMParameter() throws RecognitionException {
        try {
            // InternalSWI.g:342:1: ( ruleMParameter EOF )
            // InternalSWI.g:343:1: ruleMParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameter"


    // $ANTLR start "ruleMParameter"
    // InternalSWI.g:350:1: ruleMParameter : ( ( rule__MParameter__Alternatives ) ) ;
    public final void ruleMParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:354:2: ( ( ( rule__MParameter__Alternatives ) ) )
            // InternalSWI.g:355:1: ( ( rule__MParameter__Alternatives ) )
            {
            // InternalSWI.g:355:1: ( ( rule__MParameter__Alternatives ) )
            // InternalSWI.g:356:1: ( rule__MParameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterAccess().getAlternatives()); 
            }
            // InternalSWI.g:357:1: ( rule__MParameter__Alternatives )
            // InternalSWI.g:357:2: rule__MParameter__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameter"


    // $ANTLR start "entryRuleMIntegerParameterSingleExpression"
    // InternalSWI.g:369:1: entryRuleMIntegerParameterSingleExpression : ruleMIntegerParameterSingleExpression EOF ;
    public final void entryRuleMIntegerParameterSingleExpression() throws RecognitionException {
        try {
            // InternalSWI.g:370:1: ( ruleMIntegerParameterSingleExpression EOF )
            // InternalSWI.g:371:1: ruleMIntegerParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMIntegerParameterSingleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMIntegerParameterSingleExpression"


    // $ANTLR start "ruleMIntegerParameterSingleExpression"
    // InternalSWI.g:378:1: ruleMIntegerParameterSingleExpression : ( ( rule__MIntegerParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMIntegerParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:382:2: ( ( ( rule__MIntegerParameterSingleExpression__Group__0 ) ) )
            // InternalSWI.g:383:1: ( ( rule__MIntegerParameterSingleExpression__Group__0 ) )
            {
            // InternalSWI.g:383:1: ( ( rule__MIntegerParameterSingleExpression__Group__0 ) )
            // InternalSWI.g:384:1: ( rule__MIntegerParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalSWI.g:385:1: ( rule__MIntegerParameterSingleExpression__Group__0 )
            // InternalSWI.g:385:2: rule__MIntegerParameterSingleExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMIntegerParameterSingleExpression"


    // $ANTLR start "entryRuleMEnumParameterDefinition"
    // InternalSWI.g:397:1: entryRuleMEnumParameterDefinition : ruleMEnumParameterDefinition EOF ;
    public final void entryRuleMEnumParameterDefinition() throws RecognitionException {
        try {
            // InternalSWI.g:398:1: ( ruleMEnumParameterDefinition EOF )
            // InternalSWI.g:399:1: ruleMEnumParameterDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMEnumParameterDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMEnumParameterDefinition"


    // $ANTLR start "ruleMEnumParameterDefinition"
    // InternalSWI.g:406:1: ruleMEnumParameterDefinition : ( ( rule__MEnumParameterDefinition__Group__0 ) ) ;
    public final void ruleMEnumParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:410:2: ( ( ( rule__MEnumParameterDefinition__Group__0 ) ) )
            // InternalSWI.g:411:1: ( ( rule__MEnumParameterDefinition__Group__0 ) )
            {
            // InternalSWI.g:411:1: ( ( rule__MEnumParameterDefinition__Group__0 ) )
            // InternalSWI.g:412:1: ( rule__MEnumParameterDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getGroup()); 
            }
            // InternalSWI.g:413:1: ( rule__MEnumParameterDefinition__Group__0 )
            // InternalSWI.g:413:2: rule__MEnumParameterDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEnumParameterDefinition"


    // $ANTLR start "entryRuleMEnumParameterSingleExpression"
    // InternalSWI.g:425:1: entryRuleMEnumParameterSingleExpression : ruleMEnumParameterSingleExpression EOF ;
    public final void entryRuleMEnumParameterSingleExpression() throws RecognitionException {
        try {
            // InternalSWI.g:426:1: ( ruleMEnumParameterSingleExpression EOF )
            // InternalSWI.g:427:1: ruleMEnumParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMEnumParameterSingleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMEnumParameterSingleExpression"


    // $ANTLR start "ruleMEnumParameterSingleExpression"
    // InternalSWI.g:434:1: ruleMEnumParameterSingleExpression : ( ( rule__MEnumParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMEnumParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:438:2: ( ( ( rule__MEnumParameterSingleExpression__Group__0 ) ) )
            // InternalSWI.g:439:1: ( ( rule__MEnumParameterSingleExpression__Group__0 ) )
            {
            // InternalSWI.g:439:1: ( ( rule__MEnumParameterSingleExpression__Group__0 ) )
            // InternalSWI.g:440:1: ( rule__MEnumParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalSWI.g:441:1: ( rule__MEnumParameterSingleExpression__Group__0 )
            // InternalSWI.g:441:2: rule__MEnumParameterSingleExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEnumParameterSingleExpression"


    // $ANTLR start "entryRuleMRealParameterSingleExpression"
    // InternalSWI.g:453:1: entryRuleMRealParameterSingleExpression : ruleMRealParameterSingleExpression EOF ;
    public final void entryRuleMRealParameterSingleExpression() throws RecognitionException {
        try {
            // InternalSWI.g:454:1: ( ruleMRealParameterSingleExpression EOF )
            // InternalSWI.g:455:1: ruleMRealParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMRealParameterSingleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMRealParameterSingleExpression"


    // $ANTLR start "ruleMRealParameterSingleExpression"
    // InternalSWI.g:462:1: ruleMRealParameterSingleExpression : ( ( rule__MRealParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMRealParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:466:2: ( ( ( rule__MRealParameterSingleExpression__Group__0 ) ) )
            // InternalSWI.g:467:1: ( ( rule__MRealParameterSingleExpression__Group__0 ) )
            {
            // InternalSWI.g:467:1: ( ( rule__MRealParameterSingleExpression__Group__0 ) )
            // InternalSWI.g:468:1: ( rule__MRealParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalSWI.g:469:1: ( rule__MRealParameterSingleExpression__Group__0 )
            // InternalSWI.g:469:2: rule__MRealParameterSingleExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMRealParameterSingleExpression"


    // $ANTLR start "entryRuleMEnumParameterLiteralRule"
    // InternalSWI.g:481:1: entryRuleMEnumParameterLiteralRule : ruleMEnumParameterLiteralRule EOF ;
    public final void entryRuleMEnumParameterLiteralRule() throws RecognitionException {
        try {
            // InternalSWI.g:482:1: ( ruleMEnumParameterLiteralRule EOF )
            // InternalSWI.g:483:1: ruleMEnumParameterLiteralRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMEnumParameterLiteralRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterLiteralRuleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMEnumParameterLiteralRule"


    // $ANTLR start "ruleMEnumParameterLiteralRule"
    // InternalSWI.g:490:1: ruleMEnumParameterLiteralRule : ( ( rule__MEnumParameterLiteralRule__Alternatives ) ) ;
    public final void ruleMEnumParameterLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:494:2: ( ( ( rule__MEnumParameterLiteralRule__Alternatives ) ) )
            // InternalSWI.g:495:1: ( ( rule__MEnumParameterLiteralRule__Alternatives ) )
            {
            // InternalSWI.g:495:1: ( ( rule__MEnumParameterLiteralRule__Alternatives ) )
            // InternalSWI.g:496:1: ( rule__MEnumParameterLiteralRule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives()); 
            }
            // InternalSWI.g:497:1: ( rule__MEnumParameterLiteralRule__Alternatives )
            // InternalSWI.g:497:2: rule__MEnumParameterLiteralRule__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterLiteralRule__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEnumParameterLiteralRule"


    // $ANTLR start "entryRuleMEnumParameterLiteral"
    // InternalSWI.g:509:1: entryRuleMEnumParameterLiteral : ruleMEnumParameterLiteral EOF ;
    public final void entryRuleMEnumParameterLiteral() throws RecognitionException {
        try {
            // InternalSWI.g:510:1: ( ruleMEnumParameterLiteral EOF )
            // InternalSWI.g:511:1: ruleMEnumParameterLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMEnumParameterLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMEnumParameterLiteral"


    // $ANTLR start "ruleMEnumParameterLiteral"
    // InternalSWI.g:518:1: ruleMEnumParameterLiteral : ( ( rule__MEnumParameterLiteral__Group__0 ) ) ;
    public final void ruleMEnumParameterLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:522:2: ( ( ( rule__MEnumParameterLiteral__Group__0 ) ) )
            // InternalSWI.g:523:1: ( ( rule__MEnumParameterLiteral__Group__0 ) )
            {
            // InternalSWI.g:523:1: ( ( rule__MEnumParameterLiteral__Group__0 ) )
            // InternalSWI.g:524:1: ( rule__MEnumParameterLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralAccess().getGroup()); 
            }
            // InternalSWI.g:525:1: ( rule__MEnumParameterLiteral__Group__0 )
            // InternalSWI.g:525:2: rule__MEnumParameterLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEnumParameterLiteral"


    // $ANTLR start "entryRuleMEnumParamIntegerLiteral"
    // InternalSWI.g:537:1: entryRuleMEnumParamIntegerLiteral : ruleMEnumParamIntegerLiteral EOF ;
    public final void entryRuleMEnumParamIntegerLiteral() throws RecognitionException {
        try {
            // InternalSWI.g:538:1: ( ruleMEnumParamIntegerLiteral EOF )
            // InternalSWI.g:539:1: ruleMEnumParamIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMEnumParamIntegerLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamIntegerLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMEnumParamIntegerLiteral"


    // $ANTLR start "ruleMEnumParamIntegerLiteral"
    // InternalSWI.g:546:1: ruleMEnumParamIntegerLiteral : ( ( rule__MEnumParamIntegerLiteral__Group__0 ) ) ;
    public final void ruleMEnumParamIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:550:2: ( ( ( rule__MEnumParamIntegerLiteral__Group__0 ) ) )
            // InternalSWI.g:551:1: ( ( rule__MEnumParamIntegerLiteral__Group__0 ) )
            {
            // InternalSWI.g:551:1: ( ( rule__MEnumParamIntegerLiteral__Group__0 ) )
            // InternalSWI.g:552:1: ( rule__MEnumParamIntegerLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup()); 
            }
            // InternalSWI.g:553:1: ( rule__MEnumParamIntegerLiteral__Group__0 )
            // InternalSWI.g:553:2: rule__MEnumParamIntegerLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamIntegerLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEnumParamIntegerLiteral"


    // $ANTLR start "entryRuleMEnumParamRealLiteral"
    // InternalSWI.g:565:1: entryRuleMEnumParamRealLiteral : ruleMEnumParamRealLiteral EOF ;
    public final void entryRuleMEnumParamRealLiteral() throws RecognitionException {
        try {
            // InternalSWI.g:566:1: ( ruleMEnumParamRealLiteral EOF )
            // InternalSWI.g:567:1: ruleMEnumParamRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMEnumParamRealLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamRealLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMEnumParamRealLiteral"


    // $ANTLR start "ruleMEnumParamRealLiteral"
    // InternalSWI.g:574:1: ruleMEnumParamRealLiteral : ( ( rule__MEnumParamRealLiteral__Group__0 ) ) ;
    public final void ruleMEnumParamRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:578:2: ( ( ( rule__MEnumParamRealLiteral__Group__0 ) ) )
            // InternalSWI.g:579:1: ( ( rule__MEnumParamRealLiteral__Group__0 ) )
            {
            // InternalSWI.g:579:1: ( ( rule__MEnumParamRealLiteral__Group__0 ) )
            // InternalSWI.g:580:1: ( rule__MEnumParamRealLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getGroup()); 
            }
            // InternalSWI.g:581:1: ( rule__MEnumParamRealLiteral__Group__0 )
            // InternalSWI.g:581:2: rule__MEnumParamRealLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamRealLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamRealLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEnumParamRealLiteral"


    // $ANTLR start "entryRuleMEnumParamStringLiteral"
    // InternalSWI.g:593:1: entryRuleMEnumParamStringLiteral : ruleMEnumParamStringLiteral EOF ;
    public final void entryRuleMEnumParamStringLiteral() throws RecognitionException {
        try {
            // InternalSWI.g:594:1: ( ruleMEnumParamStringLiteral EOF )
            // InternalSWI.g:595:1: ruleMEnumParamStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMEnumParamStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMEnumParamStringLiteral"


    // $ANTLR start "ruleMEnumParamStringLiteral"
    // InternalSWI.g:602:1: ruleMEnumParamStringLiteral : ( ( rule__MEnumParamStringLiteral__Group__0 ) ) ;
    public final void ruleMEnumParamStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:606:2: ( ( ( rule__MEnumParamStringLiteral__Group__0 ) ) )
            // InternalSWI.g:607:1: ( ( rule__MEnumParamStringLiteral__Group__0 ) )
            {
            // InternalSWI.g:607:1: ( ( rule__MEnumParamStringLiteral__Group__0 ) )
            // InternalSWI.g:608:1: ( rule__MEnumParamStringLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getGroup()); 
            }
            // InternalSWI.g:609:1: ( rule__MEnumParamStringLiteral__Group__0 )
            // InternalSWI.g:609:2: rule__MEnumParamStringLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamStringLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEnumParamStringLiteral"


    // $ANTLR start "entryRuleMBooleanParameterSingleExpression"
    // InternalSWI.g:621:1: entryRuleMBooleanParameterSingleExpression : ruleMBooleanParameterSingleExpression EOF ;
    public final void entryRuleMBooleanParameterSingleExpression() throws RecognitionException {
        try {
            // InternalSWI.g:622:1: ( ruleMBooleanParameterSingleExpression EOF )
            // InternalSWI.g:623:1: ruleMBooleanParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMBooleanParameterSingleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMBooleanParameterSingleExpression"


    // $ANTLR start "ruleMBooleanParameterSingleExpression"
    // InternalSWI.g:630:1: ruleMBooleanParameterSingleExpression : ( ( rule__MBooleanParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMBooleanParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:634:2: ( ( ( rule__MBooleanParameterSingleExpression__Group__0 ) ) )
            // InternalSWI.g:635:1: ( ( rule__MBooleanParameterSingleExpression__Group__0 ) )
            {
            // InternalSWI.g:635:1: ( ( rule__MBooleanParameterSingleExpression__Group__0 ) )
            // InternalSWI.g:636:1: ( rule__MBooleanParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalSWI.g:637:1: ( rule__MBooleanParameterSingleExpression__Group__0 )
            // InternalSWI.g:637:2: rule__MBooleanParameterSingleExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMBooleanParameterSingleExpression"


    // $ANTLR start "entryRuleMStringParameterSingleExpression"
    // InternalSWI.g:649:1: entryRuleMStringParameterSingleExpression : ruleMStringParameterSingleExpression EOF ;
    public final void entryRuleMStringParameterSingleExpression() throws RecognitionException {
        try {
            // InternalSWI.g:650:1: ( ruleMStringParameterSingleExpression EOF )
            // InternalSWI.g:651:1: ruleMStringParameterSingleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMStringParameterSingleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMStringParameterSingleExpression"


    // $ANTLR start "ruleMStringParameterSingleExpression"
    // InternalSWI.g:658:1: ruleMStringParameterSingleExpression : ( ( rule__MStringParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMStringParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:662:2: ( ( ( rule__MStringParameterSingleExpression__Group__0 ) ) )
            // InternalSWI.g:663:1: ( ( rule__MStringParameterSingleExpression__Group__0 ) )
            {
            // InternalSWI.g:663:1: ( ( rule__MStringParameterSingleExpression__Group__0 ) )
            // InternalSWI.g:664:1: ( rule__MStringParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalSWI.g:665:1: ( rule__MStringParameterSingleExpression__Group__0 )
            // InternalSWI.g:665:2: rule__MStringParameterSingleExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMStringParameterSingleExpression"


    // $ANTLR start "entryRuleEBoolean"
    // InternalSWI.g:677:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalSWI.g:678:1: ( ruleEBoolean EOF )
            // InternalSWI.g:679:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSWI.g:686:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:690:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalSWI.g:691:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalSWI.g:691:1: ( ( rule__EBoolean__Alternatives ) )
            // InternalSWI.g:692:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalSWI.g:693:1: ( rule__EBoolean__Alternatives )
            // InternalSWI.g:693:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleINTEGER"
    // InternalSWI.g:705:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalSWI.g:706:1: ( ruleINTEGER EOF )
            // InternalSWI.g:707:1: ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalSWI.g:714:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:718:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalSWI.g:719:1: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalSWI.g:719:1: ( ( rule__INTEGER__Alternatives ) )
            // InternalSWI.g:720:1: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalSWI.g:721:1: ( rule__INTEGER__Alternatives )
            // InternalSWI.g:721:2: rule__INTEGER__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTEGER__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "entryRuleREAL"
    // InternalSWI.g:733:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
        try {
            // InternalSWI.g:734:1: ( ruleREAL EOF )
            // InternalSWI.g:735:1: ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleREAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalSWI.g:742:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:746:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalSWI.g:747:1: ( ( rule__REAL__Group__0 ) )
            {
            // InternalSWI.g:747:1: ( ( rule__REAL__Group__0 ) )
            // InternalSWI.g:748:1: ( rule__REAL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup()); 
            }
            // InternalSWI.g:749:1: ( rule__REAL__Group__0 )
            // InternalSWI.g:749:2: rule__REAL__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleMParameterValue"
    // InternalSWI.g:761:1: entryRuleMParameterValue : ruleMParameterValue EOF ;
    public final void entryRuleMParameterValue() throws RecognitionException {
        try {
            // InternalSWI.g:762:1: ( ruleMParameterValue EOF )
            // InternalSWI.g:763:1: ruleMParameterValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValue"


    // $ANTLR start "ruleMParameterValue"
    // InternalSWI.g:770:1: ruleMParameterValue : ( ( rule__MParameterValue__Alternatives ) ) ;
    public final void ruleMParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:774:2: ( ( ( rule__MParameterValue__Alternatives ) ) )
            // InternalSWI.g:775:1: ( ( rule__MParameterValue__Alternatives ) )
            {
            // InternalSWI.g:775:1: ( ( rule__MParameterValue__Alternatives ) )
            // InternalSWI.g:776:1: ( rule__MParameterValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueAccess().getAlternatives()); 
            }
            // InternalSWI.g:777:1: ( rule__MParameterValue__Alternatives )
            // InternalSWI.g:777:2: rule__MParameterValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValue"


    // $ANTLR start "entryRuleMParameterValueLiteral"
    // InternalSWI.g:789:1: entryRuleMParameterValueLiteral : ruleMParameterValueLiteral EOF ;
    public final void entryRuleMParameterValueLiteral() throws RecognitionException {
        try {
            // InternalSWI.g:790:1: ( ruleMParameterValueLiteral EOF )
            // InternalSWI.g:791:1: ruleMParameterValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValueLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValueLiteral"


    // $ANTLR start "ruleMParameterValueLiteral"
    // InternalSWI.g:798:1: ruleMParameterValueLiteral : ( ( rule__MParameterValueLiteral__Alternatives ) ) ;
    public final void ruleMParameterValueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:802:2: ( ( ( rule__MParameterValueLiteral__Alternatives ) ) )
            // InternalSWI.g:803:1: ( ( rule__MParameterValueLiteral__Alternatives ) )
            {
            // InternalSWI.g:803:1: ( ( rule__MParameterValueLiteral__Alternatives ) )
            // InternalSWI.g:804:1: ( rule__MParameterValueLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueLiteralAccess().getAlternatives()); 
            }
            // InternalSWI.g:805:1: ( rule__MParameterValueLiteral__Alternatives )
            // InternalSWI.g:805:2: rule__MParameterValueLiteral__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueLiteral"


    // $ANTLR start "entryRuleMParameterValueBooleanLiteral"
    // InternalSWI.g:817:1: entryRuleMParameterValueBooleanLiteral : ruleMParameterValueBooleanLiteral EOF ;
    public final void entryRuleMParameterValueBooleanLiteral() throws RecognitionException {
        try {
            // InternalSWI.g:818:1: ( ruleMParameterValueBooleanLiteral EOF )
            // InternalSWI.g:819:1: ruleMParameterValueBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValueBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueBooleanLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValueBooleanLiteral"


    // $ANTLR start "ruleMParameterValueBooleanLiteral"
    // InternalSWI.g:826:1: ruleMParameterValueBooleanLiteral : ( ( rule__MParameterValueBooleanLiteral__Group__0 ) ) ;
    public final void ruleMParameterValueBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:830:2: ( ( ( rule__MParameterValueBooleanLiteral__Group__0 ) ) )
            // InternalSWI.g:831:1: ( ( rule__MParameterValueBooleanLiteral__Group__0 ) )
            {
            // InternalSWI.g:831:1: ( ( rule__MParameterValueBooleanLiteral__Group__0 ) )
            // InternalSWI.g:832:1: ( rule__MParameterValueBooleanLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueBooleanLiteralAccess().getGroup()); 
            }
            // InternalSWI.g:833:1: ( rule__MParameterValueBooleanLiteral__Group__0 )
            // InternalSWI.g:833:2: rule__MParameterValueBooleanLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueBooleanLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueBooleanLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueBooleanLiteral"


    // $ANTLR start "entryRuleMParameterValueStringLiteral"
    // InternalSWI.g:845:1: entryRuleMParameterValueStringLiteral : ruleMParameterValueStringLiteral EOF ;
    public final void entryRuleMParameterValueStringLiteral() throws RecognitionException {
        try {
            // InternalSWI.g:846:1: ( ruleMParameterValueStringLiteral EOF )
            // InternalSWI.g:847:1: ruleMParameterValueStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValueStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueStringLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValueStringLiteral"


    // $ANTLR start "ruleMParameterValueStringLiteral"
    // InternalSWI.g:854:1: ruleMParameterValueStringLiteral : ( ( rule__MParameterValueStringLiteral__Group__0 ) ) ;
    public final void ruleMParameterValueStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:858:2: ( ( ( rule__MParameterValueStringLiteral__Group__0 ) ) )
            // InternalSWI.g:859:1: ( ( rule__MParameterValueStringLiteral__Group__0 ) )
            {
            // InternalSWI.g:859:1: ( ( rule__MParameterValueStringLiteral__Group__0 ) )
            // InternalSWI.g:860:1: ( rule__MParameterValueStringLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getGroup()); 
            }
            // InternalSWI.g:861:1: ( rule__MParameterValueStringLiteral__Group__0 )
            // InternalSWI.g:861:2: rule__MParameterValueStringLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueStringLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueStringLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueStringLiteral"


    // $ANTLR start "entryRuleMParameterValueIntegerLiteral"
    // InternalSWI.g:873:1: entryRuleMParameterValueIntegerLiteral : ruleMParameterValueIntegerLiteral EOF ;
    public final void entryRuleMParameterValueIntegerLiteral() throws RecognitionException {
        try {
            // InternalSWI.g:874:1: ( ruleMParameterValueIntegerLiteral EOF )
            // InternalSWI.g:875:1: ruleMParameterValueIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueIntegerLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValueIntegerLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueIntegerLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValueIntegerLiteral"


    // $ANTLR start "ruleMParameterValueIntegerLiteral"
    // InternalSWI.g:882:1: ruleMParameterValueIntegerLiteral : ( ( rule__MParameterValueIntegerLiteral__Group__0 ) ) ;
    public final void ruleMParameterValueIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:886:2: ( ( ( rule__MParameterValueIntegerLiteral__Group__0 ) ) )
            // InternalSWI.g:887:1: ( ( rule__MParameterValueIntegerLiteral__Group__0 ) )
            {
            // InternalSWI.g:887:1: ( ( rule__MParameterValueIntegerLiteral__Group__0 ) )
            // InternalSWI.g:888:1: ( rule__MParameterValueIntegerLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueIntegerLiteralAccess().getGroup()); 
            }
            // InternalSWI.g:889:1: ( rule__MParameterValueIntegerLiteral__Group__0 )
            // InternalSWI.g:889:2: rule__MParameterValueIntegerLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueIntegerLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueIntegerLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueIntegerLiteral"


    // $ANTLR start "entryRuleMParameterValueRealLiteral"
    // InternalSWI.g:901:1: entryRuleMParameterValueRealLiteral : ruleMParameterValueRealLiteral EOF ;
    public final void entryRuleMParameterValueRealLiteral() throws RecognitionException {
        try {
            // InternalSWI.g:902:1: ( ruleMParameterValueRealLiteral EOF )
            // InternalSWI.g:903:1: ruleMParameterValueRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRealLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValueRealLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRealLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValueRealLiteral"


    // $ANTLR start "ruleMParameterValueRealLiteral"
    // InternalSWI.g:910:1: ruleMParameterValueRealLiteral : ( ( rule__MParameterValueRealLiteral__Group__0 ) ) ;
    public final void ruleMParameterValueRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:914:2: ( ( ( rule__MParameterValueRealLiteral__Group__0 ) ) )
            // InternalSWI.g:915:1: ( ( rule__MParameterValueRealLiteral__Group__0 ) )
            {
            // InternalSWI.g:915:1: ( ( rule__MParameterValueRealLiteral__Group__0 ) )
            // InternalSWI.g:916:1: ( rule__MParameterValueRealLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRealLiteralAccess().getGroup()); 
            }
            // InternalSWI.g:917:1: ( rule__MParameterValueRealLiteral__Group__0 )
            // InternalSWI.g:917:2: rule__MParameterValueRealLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueRealLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRealLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueRealLiteral"


    // $ANTLR start "entryRuleMParameterValueRefObject"
    // InternalSWI.g:929:1: entryRuleMParameterValueRefObject : ruleMParameterValueRefObject EOF ;
    public final void entryRuleMParameterValueRefObject() throws RecognitionException {
        try {
            // InternalSWI.g:930:1: ( ruleMParameterValueRefObject EOF )
            // InternalSWI.g:931:1: ruleMParameterValueRefObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValueRefObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRefObjectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValueRefObject"


    // $ANTLR start "ruleMParameterValueRefObject"
    // InternalSWI.g:938:1: ruleMParameterValueRefObject : ( ( rule__MParameterValueRefObject__Group__0 ) ) ;
    public final void ruleMParameterValueRefObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:942:2: ( ( ( rule__MParameterValueRefObject__Group__0 ) ) )
            // InternalSWI.g:943:1: ( ( rule__MParameterValueRefObject__Group__0 ) )
            {
            // InternalSWI.g:943:1: ( ( rule__MParameterValueRefObject__Group__0 ) )
            // InternalSWI.g:944:1: ( rule__MParameterValueRefObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectAccess().getGroup()); 
            }
            // InternalSWI.g:945:1: ( rule__MParameterValueRefObject__Group__0 )
            // InternalSWI.g:945:2: rule__MParameterValueRefObject__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueRefObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRefObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueRefObject"


    // $ANTLR start "entryRuleMParameterValuePAR"
    // InternalSWI.g:957:1: entryRuleMParameterValuePAR : ruleMParameterValuePAR EOF ;
    public final void entryRuleMParameterValuePAR() throws RecognitionException {
        try {
            // InternalSWI.g:958:1: ( ruleMParameterValuePAR EOF )
            // InternalSWI.g:959:1: ruleMParameterValuePAR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValuePARRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValuePAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValuePARRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValuePAR"


    // $ANTLR start "ruleMParameterValuePAR"
    // InternalSWI.g:966:1: ruleMParameterValuePAR : ( ( rule__MParameterValuePAR__Group__0 ) ) ;
    public final void ruleMParameterValuePAR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:970:2: ( ( ( rule__MParameterValuePAR__Group__0 ) ) )
            // InternalSWI.g:971:1: ( ( rule__MParameterValuePAR__Group__0 ) )
            {
            // InternalSWI.g:971:1: ( ( rule__MParameterValuePAR__Group__0 ) )
            // InternalSWI.g:972:1: ( rule__MParameterValuePAR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValuePARAccess().getGroup()); 
            }
            // InternalSWI.g:973:1: ( rule__MParameterValuePAR__Group__0 )
            // InternalSWI.g:973:2: rule__MParameterValuePAR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValuePAR__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValuePARAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValuePAR"


    // $ANTLR start "entryRuleMParameterValueExpression"
    // InternalSWI.g:985:1: entryRuleMParameterValueExpression : ruleMParameterValueExpression EOF ;
    public final void entryRuleMParameterValueExpression() throws RecognitionException {
        try {
            // InternalSWI.g:986:1: ( ruleMParameterValueExpression EOF )
            // InternalSWI.g:987:1: ruleMParameterValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValueExpression"


    // $ANTLR start "ruleMParameterValueExpression"
    // InternalSWI.g:994:1: ruleMParameterValueExpression : ( ( rule__MParameterValueExpression__Group__0 ) ) ;
    public final void ruleMParameterValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:998:2: ( ( ( rule__MParameterValueExpression__Group__0 ) ) )
            // InternalSWI.g:999:1: ( ( rule__MParameterValueExpression__Group__0 ) )
            {
            // InternalSWI.g:999:1: ( ( rule__MParameterValueExpression__Group__0 ) )
            // InternalSWI.g:1000:1: ( rule__MParameterValueExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getGroup()); 
            }
            // InternalSWI.g:1001:1: ( rule__MParameterValueExpression__Group__0 )
            // InternalSWI.g:1001:2: rule__MParameterValueExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueExpression"


    // $ANTLR start "entryRuleMParameterValueTERM"
    // InternalSWI.g:1013:1: entryRuleMParameterValueTERM : ruleMParameterValueTERM EOF ;
    public final void entryRuleMParameterValueTERM() throws RecognitionException {
        try {
            // InternalSWI.g:1014:1: ( ruleMParameterValueTERM EOF )
            // InternalSWI.g:1015:1: ruleMParameterValueTERM EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterValueTERM();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterValueTERM"


    // $ANTLR start "ruleMParameterValueTERM"
    // InternalSWI.g:1022:1: ruleMParameterValueTERM : ( ( rule__MParameterValueTERM__Group__0 ) ) ;
    public final void ruleMParameterValueTERM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1026:2: ( ( ( rule__MParameterValueTERM__Group__0 ) ) )
            // InternalSWI.g:1027:1: ( ( rule__MParameterValueTERM__Group__0 ) )
            {
            // InternalSWI.g:1027:1: ( ( rule__MParameterValueTERM__Group__0 ) )
            // InternalSWI.g:1028:1: ( rule__MParameterValueTERM__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getGroup()); 
            }
            // InternalSWI.g:1029:1: ( rule__MParameterValueTERM__Group__0 )
            // InternalSWI.g:1029:2: rule__MParameterValueTERM__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERM__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueTERM"


    // $ANTLR start "entryRuleMParameterRange"
    // InternalSWI.g:1041:1: entryRuleMParameterRange : ruleMParameterRange EOF ;
    public final void entryRuleMParameterRange() throws RecognitionException {
        try {
            // InternalSWI.g:1042:1: ( ruleMParameterRange EOF )
            // InternalSWI.g:1043:1: ruleMParameterRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterRangeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterRange"


    // $ANTLR start "ruleMParameterRange"
    // InternalSWI.g:1050:1: ruleMParameterRange : ( ( rule__MParameterRange__Alternatives ) ) ;
    public final void ruleMParameterRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1054:2: ( ( ( rule__MParameterRange__Alternatives ) ) )
            // InternalSWI.g:1055:1: ( ( rule__MParameterRange__Alternatives ) )
            {
            // InternalSWI.g:1055:1: ( ( rule__MParameterRange__Alternatives ) )
            // InternalSWI.g:1056:1: ( rule__MParameterRange__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterRangeAccess().getAlternatives()); 
            }
            // InternalSWI.g:1057:1: ( rule__MParameterRange__Alternatives )
            // InternalSWI.g:1057:2: rule__MParameterRange__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterRange__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterRangeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterRange"


    // $ANTLR start "entryRuleMParameterOCR"
    // InternalSWI.g:1069:1: entryRuleMParameterOCR : ruleMParameterOCR EOF ;
    public final void entryRuleMParameterOCR() throws RecognitionException {
        try {
            // InternalSWI.g:1070:1: ( ruleMParameterOCR EOF )
            // InternalSWI.g:1071:1: ruleMParameterOCR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterOCR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterOCR"


    // $ANTLR start "ruleMParameterOCR"
    // InternalSWI.g:1078:1: ruleMParameterOCR : ( ( rule__MParameterOCR__Group__0 ) ) ;
    public final void ruleMParameterOCR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1082:2: ( ( ( rule__MParameterOCR__Group__0 ) ) )
            // InternalSWI.g:1083:1: ( ( rule__MParameterOCR__Group__0 ) )
            {
            // InternalSWI.g:1083:1: ( ( rule__MParameterOCR__Group__0 ) )
            // InternalSWI.g:1084:1: ( rule__MParameterOCR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getGroup()); 
            }
            // InternalSWI.g:1085:1: ( rule__MParameterOCR__Group__0 )
            // InternalSWI.g:1085:2: rule__MParameterOCR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOCR__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterOCR"


    // $ANTLR start "entryRuleMParameterOOR"
    // InternalSWI.g:1097:1: entryRuleMParameterOOR : ruleMParameterOOR EOF ;
    public final void entryRuleMParameterOOR() throws RecognitionException {
        try {
            // InternalSWI.g:1098:1: ( ruleMParameterOOR EOF )
            // InternalSWI.g:1099:1: ruleMParameterOOR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterOOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterOOR"


    // $ANTLR start "ruleMParameterOOR"
    // InternalSWI.g:1106:1: ruleMParameterOOR : ( ( rule__MParameterOOR__Group__0 ) ) ;
    public final void ruleMParameterOOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1110:2: ( ( ( rule__MParameterOOR__Group__0 ) ) )
            // InternalSWI.g:1111:1: ( ( rule__MParameterOOR__Group__0 ) )
            {
            // InternalSWI.g:1111:1: ( ( rule__MParameterOOR__Group__0 ) )
            // InternalSWI.g:1112:1: ( rule__MParameterOOR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getGroup()); 
            }
            // InternalSWI.g:1113:1: ( rule__MParameterOOR__Group__0 )
            // InternalSWI.g:1113:2: rule__MParameterOOR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOOR__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterOOR"


    // $ANTLR start "entryRuleMParameterCOR"
    // InternalSWI.g:1125:1: entryRuleMParameterCOR : ruleMParameterCOR EOF ;
    public final void entryRuleMParameterCOR() throws RecognitionException {
        try {
            // InternalSWI.g:1126:1: ( ruleMParameterCOR EOF )
            // InternalSWI.g:1127:1: ruleMParameterCOR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterCOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterCOR"


    // $ANTLR start "ruleMParameterCOR"
    // InternalSWI.g:1134:1: ruleMParameterCOR : ( ( rule__MParameterCOR__Group__0 ) ) ;
    public final void ruleMParameterCOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1138:2: ( ( ( rule__MParameterCOR__Group__0 ) ) )
            // InternalSWI.g:1139:1: ( ( rule__MParameterCOR__Group__0 ) )
            {
            // InternalSWI.g:1139:1: ( ( rule__MParameterCOR__Group__0 ) )
            // InternalSWI.g:1140:1: ( rule__MParameterCOR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getGroup()); 
            }
            // InternalSWI.g:1141:1: ( rule__MParameterCOR__Group__0 )
            // InternalSWI.g:1141:2: rule__MParameterCOR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCOR__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterCOR"


    // $ANTLR start "entryRuleMParameterCCR"
    // InternalSWI.g:1153:1: entryRuleMParameterCCR : ruleMParameterCCR EOF ;
    public final void entryRuleMParameterCCR() throws RecognitionException {
        try {
            // InternalSWI.g:1154:1: ( ruleMParameterCCR EOF )
            // InternalSWI.g:1155:1: ruleMParameterCCR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMParameterCCR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMParameterCCR"


    // $ANTLR start "ruleMParameterCCR"
    // InternalSWI.g:1162:1: ruleMParameterCCR : ( ( rule__MParameterCCR__Group__0 ) ) ;
    public final void ruleMParameterCCR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1166:2: ( ( ( rule__MParameterCCR__Group__0 ) ) )
            // InternalSWI.g:1167:1: ( ( rule__MParameterCCR__Group__0 ) )
            {
            // InternalSWI.g:1167:1: ( ( rule__MParameterCCR__Group__0 ) )
            // InternalSWI.g:1168:1: ( rule__MParameterCCR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getGroup()); 
            }
            // InternalSWI.g:1169:1: ( rule__MParameterCCR__Group__0 )
            // InternalSWI.g:1169:2: rule__MParameterCCR__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCCR__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterCCR"


    // $ANTLR start "ruleMParameterValueExpressionOperators"
    // InternalSWI.g:1182:1: ruleMParameterValueExpressionOperators : ( ( rule__MParameterValueExpressionOperators__Alternatives ) ) ;
    public final void ruleMParameterValueExpressionOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1186:1: ( ( ( rule__MParameterValueExpressionOperators__Alternatives ) ) )
            // InternalSWI.g:1187:1: ( ( rule__MParameterValueExpressionOperators__Alternatives ) )
            {
            // InternalSWI.g:1187:1: ( ( rule__MParameterValueExpressionOperators__Alternatives ) )
            // InternalSWI.g:1188:1: ( rule__MParameterValueExpressionOperators__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives()); 
            }
            // InternalSWI.g:1189:1: ( rule__MParameterValueExpressionOperators__Alternatives )
            // InternalSWI.g:1189:2: rule__MParameterValueExpressionOperators__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpressionOperators__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueExpressionOperators"


    // $ANTLR start "ruleMParameterValueTERMOperators"
    // InternalSWI.g:1201:1: ruleMParameterValueTERMOperators : ( ( rule__MParameterValueTERMOperators__Alternatives ) ) ;
    public final void ruleMParameterValueTERMOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1205:1: ( ( ( rule__MParameterValueTERMOperators__Alternatives ) ) )
            // InternalSWI.g:1206:1: ( ( rule__MParameterValueTERMOperators__Alternatives ) )
            {
            // InternalSWI.g:1206:1: ( ( rule__MParameterValueTERMOperators__Alternatives ) )
            // InternalSWI.g:1207:1: ( rule__MParameterValueTERMOperators__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives()); 
            }
            // InternalSWI.g:1208:1: ( rule__MParameterValueTERMOperators__Alternatives )
            // InternalSWI.g:1208:2: rule__MParameterValueTERMOperators__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERMOperators__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMParameterValueTERMOperators"


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalSWI.g:1219:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1223:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==19||LA1_1==21||LA1_1==23) ) {
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
                    // InternalSWI.g:1224:1: ( RULE_INT )
                    {
                    // InternalSWI.g:1224:1: ( RULE_INT )
                    // InternalSWI.g:1225:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1230:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalSWI.g:1230:6: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalSWI.g:1231:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalSWI.g:1232:1: ( rule__Version__Group_0_1__0 )
                    // InternalSWI.g:1232:2: rule__Version__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1241:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1245:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==19||LA2_1==21||LA2_1==23) ) {
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
                    // InternalSWI.g:1246:1: ( RULE_INT )
                    {
                    // InternalSWI.g:1246:1: ( RULE_INT )
                    // InternalSWI.g:1247:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1252:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalSWI.g:1252:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalSWI.g:1253:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalSWI.g:1254:1: ( rule__Version__Group_1_1_1__0 )
                    // InternalSWI.g:1254:2: rule__Version__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__MProvidedResource__Alternatives"
    // InternalSWI.g:1263:1: rule__MProvidedResource__Alternatives : ( ( ruleMQuantifiableResource ) | ( ruleMInstantiableResource ) );
    public final void rule__MProvidedResource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1267:1: ( ( ruleMQuantifiableResource ) | ( ruleMInstantiableResource ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==44) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSWI.g:1268:1: ( ruleMQuantifiableResource )
                    {
                    // InternalSWI.g:1268:1: ( ruleMQuantifiableResource )
                    // InternalSWI.g:1269:1: ruleMQuantifiableResource
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMProvidedResourceAccess().getMQuantifiableResourceParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMQuantifiableResource();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMProvidedResourceAccess().getMQuantifiableResourceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1274:6: ( ruleMInstantiableResource )
                    {
                    // InternalSWI.g:1274:6: ( ruleMInstantiableResource )
                    // InternalSWI.g:1275:1: ruleMInstantiableResource
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMProvidedResourceAccess().getMInstantiableResourceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMInstantiableResource();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMProvidedResourceAccess().getMInstantiableResourceParserRuleCall_1()); 
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
    // $ANTLR end "rule__MProvidedResource__Alternatives"


    // $ANTLR start "rule__MParameter__Alternatives"
    // InternalSWI.g:1285:1: rule__MParameter__Alternatives : ( ( ruleMIntegerParameterSingleExpression ) | ( ruleMEnumParameterSingleExpression ) | ( ruleMBooleanParameterSingleExpression ) | ( ruleMRealParameterSingleExpression ) | ( ruleMStringParameterSingleExpression ) | ( ruleMEnumParameterDefinition ) );
    public final void rule__MParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1289:1: ( ( ruleMIntegerParameterSingleExpression ) | ( ruleMEnumParameterSingleExpression ) | ( ruleMBooleanParameterSingleExpression ) | ( ruleMRealParameterSingleExpression ) | ( ruleMStringParameterSingleExpression ) | ( ruleMEnumParameterDefinition ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSWI.g:1290:1: ( ruleMIntegerParameterSingleExpression )
                    {
                    // InternalSWI.g:1290:1: ( ruleMIntegerParameterSingleExpression )
                    // InternalSWI.g:1291:1: ruleMIntegerParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMIntegerParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1296:6: ( ruleMEnumParameterSingleExpression )
                    {
                    // InternalSWI.g:1296:6: ( ruleMEnumParameterSingleExpression )
                    // InternalSWI.g:1297:1: ruleMEnumParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMEnumParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSWI.g:1302:6: ( ruleMBooleanParameterSingleExpression )
                    {
                    // InternalSWI.g:1302:6: ( ruleMBooleanParameterSingleExpression )
                    // InternalSWI.g:1303:1: ruleMBooleanParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMBooleanParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSWI.g:1308:6: ( ruleMRealParameterSingleExpression )
                    {
                    // InternalSWI.g:1308:6: ( ruleMRealParameterSingleExpression )
                    // InternalSWI.g:1309:1: ruleMRealParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterAccess().getMRealParameterSingleExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMRealParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterAccess().getMRealParameterSingleExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSWI.g:1314:6: ( ruleMStringParameterSingleExpression )
                    {
                    // InternalSWI.g:1314:6: ( ruleMStringParameterSingleExpression )
                    // InternalSWI.g:1315:1: ruleMStringParameterSingleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterAccess().getMStringParameterSingleExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMStringParameterSingleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterAccess().getMStringParameterSingleExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSWI.g:1320:6: ( ruleMEnumParameterDefinition )
                    {
                    // InternalSWI.g:1320:6: ( ruleMEnumParameterDefinition )
                    // InternalSWI.g:1321:1: ruleMEnumParameterDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterAccess().getMEnumParameterDefinitionParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMEnumParameterDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterAccess().getMEnumParameterDefinitionParserRuleCall_5()); 
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
    // $ANTLR end "rule__MParameter__Alternatives"


    // $ANTLR start "rule__MEnumParameterLiteralRule__Alternatives"
    // InternalSWI.g:1331:1: rule__MEnumParameterLiteralRule__Alternatives : ( ( ruleMEnumParameterLiteral ) | ( ruleMEnumParamIntegerLiteral ) | ( ruleMEnumParamRealLiteral ) | ( ruleMEnumParamStringLiteral ) );
    public final void rule__MEnumParameterLiteralRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1335:1: ( ( ruleMEnumParameterLiteral ) | ( ruleMEnumParamIntegerLiteral ) | ( ruleMEnumParamRealLiteral ) | ( ruleMEnumParamStringLiteral ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==49) ) {
                    switch ( input.LA(3) ) {
                    case RULE_STRING:
                    case 56:
                        {
                        alt5=4;
                        }
                        break;
                    case 15:
                        {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5==RULE_INT) ) {
                            int LA5_6 = input.LA(5);

                            if ( (LA5_6==21) ) {
                                alt5=3;
                            }
                            else if ( (LA5_6==EOF||LA5_6==27||LA5_6==29) ) {
                                alt5=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        int LA5_6 = input.LA(4);

                        if ( (LA5_6==21) ) {
                            alt5=3;
                        }
                        else if ( (LA5_6==EOF||LA5_6==27||LA5_6==29) ) {
                            alt5=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HEXADECIMAL:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }

                }
                else if ( (LA5_1==EOF||LA5_1==27||LA5_1==29) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSWI.g:1336:1: ( ruleMEnumParameterLiteral )
                    {
                    // InternalSWI.g:1336:1: ( ruleMEnumParameterLiteral )
                    // InternalSWI.g:1337:1: ruleMEnumParameterLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParameterLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMEnumParameterLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParameterLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1342:6: ( ruleMEnumParamIntegerLiteral )
                    {
                    // InternalSWI.g:1342:6: ( ruleMEnumParamIntegerLiteral )
                    // InternalSWI.g:1343:1: ruleMEnumParamIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamIntegerLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMEnumParamIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamIntegerLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSWI.g:1348:6: ( ruleMEnumParamRealLiteral )
                    {
                    // InternalSWI.g:1348:6: ( ruleMEnumParamRealLiteral )
                    // InternalSWI.g:1349:1: ruleMEnumParamRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamRealLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMEnumParamRealLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamRealLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSWI.g:1354:6: ( ruleMEnumParamStringLiteral )
                    {
                    // InternalSWI.g:1354:6: ( ruleMEnumParamStringLiteral )
                    // InternalSWI.g:1355:1: ruleMEnumParamStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMEnumParamStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralParserRuleCall_3()); 
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
    // $ANTLR end "rule__MEnumParameterLiteralRule__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalSWI.g:1365:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1369:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSWI.g:1370:1: ( 'true' )
                    {
                    // InternalSWI.g:1370:1: ( 'true' )
                    // InternalSWI.g:1371:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1378:6: ( 'false' )
                    {
                    // InternalSWI.g:1378:6: ( 'false' )
                    // InternalSWI.g:1379:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__INTEGER__Alternatives"
    // InternalSWI.g:1391:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1395:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_HEXADECIMAL) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSWI.g:1396:1: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalSWI.g:1396:1: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalSWI.g:1397:1: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalSWI.g:1398:1: ( rule__INTEGER__Group_0__0 )
                    // InternalSWI.g:1398:2: rule__INTEGER__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__INTEGER__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1402:6: ( RULE_HEXADECIMAL )
                    {
                    // InternalSWI.g:1402:6: ( RULE_HEXADECIMAL )
                    // InternalSWI.g:1403:1: RULE_HEXADECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); 
                    }
                    match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__INTEGER__Alternatives"


    // $ANTLR start "rule__MParameterValue__Alternatives"
    // InternalSWI.g:1413:1: rule__MParameterValue__Alternatives : ( ( ruleMParameterValueLiteral ) | ( ruleMParameterValueRefObject ) | ( ruleMParameterValuePAR ) );
    public final void rule__MParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1417:1: ( ( ruleMParameterValueLiteral ) | ( ruleMParameterValueRefObject ) | ( ruleMParameterValuePAR ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_HEXADECIMAL:
            case RULE_STRING:
            case 12:
            case 13:
            case 15:
            case 56:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSWI.g:1418:1: ( ruleMParameterValueLiteral )
                    {
                    // InternalSWI.g:1418:1: ( ruleMParameterValueLiteral )
                    // InternalSWI.g:1419:1: ruleMParameterValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterValueLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1424:6: ( ruleMParameterValueRefObject )
                    {
                    // InternalSWI.g:1424:6: ( ruleMParameterValueRefObject )
                    // InternalSWI.g:1425:1: ruleMParameterValueRefObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterValueRefObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSWI.g:1430:6: ( ruleMParameterValuePAR )
                    {
                    // InternalSWI.g:1430:6: ( ruleMParameterValuePAR )
                    // InternalSWI.g:1431:1: ruleMParameterValuePAR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterValuePAR();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2()); 
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
    // $ANTLR end "rule__MParameterValue__Alternatives"


    // $ANTLR start "rule__MParameterValueLiteral__Alternatives"
    // InternalSWI.g:1441:1: rule__MParameterValueLiteral__Alternatives : ( ( ruleMParameterValueBooleanLiteral ) | ( ruleMParameterValueStringLiteral ) | ( ruleMParameterValueIntegerLiteral ) | ( ruleMParameterValueRealLiteral ) );
    public final void rule__MParameterValueLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1445:1: ( ( ruleMParameterValueBooleanLiteral ) | ( ruleMParameterValueStringLiteral ) | ( ruleMParameterValueIntegerLiteral ) | ( ruleMParameterValueRealLiteral ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
            case 56:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==RULE_INT) ) {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==EOF||(LA9_4>=14 && LA9_4<=17)||LA9_4==19||LA9_4==23||LA9_4==29||LA9_4==43||LA9_4==46||LA9_4==53) ) {
                        alt9=3;
                    }
                    else if ( (LA9_4==21) ) {
                        alt9=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==EOF||(LA9_4>=14 && LA9_4<=17)||LA9_4==19||LA9_4==23||LA9_4==29||LA9_4==43||LA9_4==46||LA9_4==53) ) {
                    alt9=3;
                }
                else if ( (LA9_4==21) ) {
                    alt9=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEXADECIMAL:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSWI.g:1446:1: ( ruleMParameterValueBooleanLiteral )
                    {
                    // InternalSWI.g:1446:1: ( ruleMParameterValueBooleanLiteral )
                    // InternalSWI.g:1447:1: ruleMParameterValueBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterValueBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1452:6: ( ruleMParameterValueStringLiteral )
                    {
                    // InternalSWI.g:1452:6: ( ruleMParameterValueStringLiteral )
                    // InternalSWI.g:1453:1: ruleMParameterValueStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterValueStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSWI.g:1458:6: ( ruleMParameterValueIntegerLiteral )
                    {
                    // InternalSWI.g:1458:6: ( ruleMParameterValueIntegerLiteral )
                    // InternalSWI.g:1459:1: ruleMParameterValueIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterValueIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSWI.g:1464:6: ( ruleMParameterValueRealLiteral )
                    {
                    // InternalSWI.g:1464:6: ( ruleMParameterValueRealLiteral )
                    // InternalSWI.g:1465:1: ruleMParameterValueRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterValueRealLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3()); 
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
    // $ANTLR end "rule__MParameterValueLiteral__Alternatives"


    // $ANTLR start "rule__MParameterRange__Alternatives"
    // InternalSWI.g:1475:1: rule__MParameterRange__Alternatives : ( ( ruleMParameterOCR ) | ( ruleMParameterOOR ) | ( ruleMParameterCOR ) | ( ruleMParameterCCR ) );
    public final void rule__MParameterRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1479:1: ( ( ruleMParameterOCR ) | ( ruleMParameterOOR ) | ( ruleMParameterCOR ) | ( ruleMParameterCCR ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred19_InternalSWI()) ) {
                    alt10=1;
                }
                else if ( (synpred20_InternalSWI()) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==54) ) {
                int LA10_2 = input.LA(2);

                if ( (synpred21_InternalSWI()) ) {
                    alt10=3;
                }
                else if ( (true) ) {
                    alt10=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSWI.g:1480:1: ( ruleMParameterOCR )
                    {
                    // InternalSWI.g:1480:1: ( ruleMParameterOCR )
                    // InternalSWI.g:1481:1: ruleMParameterOCR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterOCR();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1486:6: ( ruleMParameterOOR )
                    {
                    // InternalSWI.g:1486:6: ( ruleMParameterOOR )
                    // InternalSWI.g:1487:1: ruleMParameterOOR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterOOR();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSWI.g:1492:6: ( ruleMParameterCOR )
                    {
                    // InternalSWI.g:1492:6: ( ruleMParameterCOR )
                    // InternalSWI.g:1493:1: ruleMParameterCOR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterCOR();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSWI.g:1498:6: ( ruleMParameterCCR )
                    {
                    // InternalSWI.g:1498:6: ( ruleMParameterCCR )
                    // InternalSWI.g:1499:1: ruleMParameterCCR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterRangeAccess().getMParameterCCRParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMParameterCCR();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterRangeAccess().getMParameterCCRParserRuleCall_3()); 
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
    // $ANTLR end "rule__MParameterRange__Alternatives"


    // $ANTLR start "rule__MParameterValueExpressionOperators__Alternatives"
    // InternalSWI.g:1509:1: rule__MParameterValueExpressionOperators__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__MParameterValueExpressionOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1513:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSWI.g:1514:1: ( ( '+' ) )
                    {
                    // InternalSWI.g:1514:1: ( ( '+' ) )
                    // InternalSWI.g:1515:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                    }
                    // InternalSWI.g:1516:1: ( '+' )
                    // InternalSWI.g:1516:3: '+'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1521:6: ( ( '-' ) )
                    {
                    // InternalSWI.g:1521:6: ( ( '-' ) )
                    // InternalSWI.g:1522:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueExpressionOperatorsAccess().getMinusEnumLiteralDeclaration_1()); 
                    }
                    // InternalSWI.g:1523:1: ( '-' )
                    // InternalSWI.g:1523:3: '-'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueExpressionOperatorsAccess().getMinusEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__MParameterValueExpressionOperators__Alternatives"


    // $ANTLR start "rule__MParameterValueTERMOperators__Alternatives"
    // InternalSWI.g:1533:1: rule__MParameterValueTERMOperators__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MParameterValueTERMOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1537:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            else if ( (LA12_0==17) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSWI.g:1538:1: ( ( '*' ) )
                    {
                    // InternalSWI.g:1538:1: ( ( '*' ) )
                    // InternalSWI.g:1539:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                    }
                    // InternalSWI.g:1540:1: ( '*' )
                    // InternalSWI.g:1540:3: '*'
                    {
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:1545:6: ( ( '/' ) )
                    {
                    // InternalSWI.g:1545:6: ( ( '/' ) )
                    // InternalSWI.g:1546:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueTERMOperatorsAccess().getDivEnumLiteralDeclaration_1()); 
                    }
                    // InternalSWI.g:1547:1: ( '/' )
                    // InternalSWI.g:1547:3: '/'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMParameterValueTERMOperatorsAccess().getDivEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__MParameterValueTERMOperators__Alternatives"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__0"
    // InternalSWI.g:1559:1: rule__MMESPSWIPackageFile__Group__0 : rule__MMESPSWIPackageFile__Group__0__Impl rule__MMESPSWIPackageFile__Group__1 ;
    public final void rule__MMESPSWIPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1563:1: ( rule__MMESPSWIPackageFile__Group__0__Impl rule__MMESPSWIPackageFile__Group__1 )
            // InternalSWI.g:1564:2: rule__MMESPSWIPackageFile__Group__0__Impl rule__MMESPSWIPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MMESPSWIPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__0"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__0__Impl"
    // InternalSWI.g:1571:1: rule__MMESPSWIPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__MMESPSWIPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1575:1: ( ( 'package' ) )
            // InternalSWI.g:1576:1: ( 'package' )
            {
            // InternalSWI.g:1576:1: ( 'package' )
            // InternalSWI.g:1577:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getPackageKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__0__Impl"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__1"
    // InternalSWI.g:1590:1: rule__MMESPSWIPackageFile__Group__1 : rule__MMESPSWIPackageFile__Group__1__Impl rule__MMESPSWIPackageFile__Group__2 ;
    public final void rule__MMESPSWIPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1594:1: ( rule__MMESPSWIPackageFile__Group__1__Impl rule__MMESPSWIPackageFile__Group__2 )
            // InternalSWI.g:1595:2: rule__MMESPSWIPackageFile__Group__1__Impl rule__MMESPSWIPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MMESPSWIPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__1"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__1__Impl"
    // InternalSWI.g:1602:1: rule__MMESPSWIPackageFile__Group__1__Impl : ( ( rule__MMESPSWIPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__MMESPSWIPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1606:1: ( ( ( rule__MMESPSWIPackageFile__PackageAssignment_1 ) ) )
            // InternalSWI.g:1607:1: ( ( rule__MMESPSWIPackageFile__PackageAssignment_1 ) )
            {
            // InternalSWI.g:1607:1: ( ( rule__MMESPSWIPackageFile__PackageAssignment_1 ) )
            // InternalSWI.g:1608:1: ( rule__MMESPSWIPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getPackageAssignment_1()); 
            }
            // InternalSWI.g:1609:1: ( rule__MMESPSWIPackageFile__PackageAssignment_1 )
            // InternalSWI.g:1609:2: rule__MMESPSWIPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__PackageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getPackageAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__1__Impl"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__2"
    // InternalSWI.g:1619:1: rule__MMESPSWIPackageFile__Group__2 : rule__MMESPSWIPackageFile__Group__2__Impl rule__MMESPSWIPackageFile__Group__3 ;
    public final void rule__MMESPSWIPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1623:1: ( rule__MMESPSWIPackageFile__Group__2__Impl rule__MMESPSWIPackageFile__Group__3 )
            // InternalSWI.g:1624:2: rule__MMESPSWIPackageFile__Group__2__Impl rule__MMESPSWIPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MMESPSWIPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__2"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__2__Impl"
    // InternalSWI.g:1631:1: rule__MMESPSWIPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__MMESPSWIPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1635:1: ( ( ';' ) )
            // InternalSWI.g:1636:1: ( ';' )
            {
            // InternalSWI.g:1636:1: ( ';' )
            // InternalSWI.g:1637:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getSemicolonKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__2__Impl"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__3"
    // InternalSWI.g:1650:1: rule__MMESPSWIPackageFile__Group__3 : rule__MMESPSWIPackageFile__Group__3__Impl rule__MMESPSWIPackageFile__Group__4 ;
    public final void rule__MMESPSWIPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1654:1: ( rule__MMESPSWIPackageFile__Group__3__Impl rule__MMESPSWIPackageFile__Group__4 )
            // InternalSWI.g:1655:2: rule__MMESPSWIPackageFile__Group__3__Impl rule__MMESPSWIPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MMESPSWIPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__3"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__3__Impl"
    // InternalSWI.g:1662:1: rule__MMESPSWIPackageFile__Group__3__Impl : ( ( rule__MMESPSWIPackageFile__Group_3__0 )* ) ;
    public final void rule__MMESPSWIPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1666:1: ( ( ( rule__MMESPSWIPackageFile__Group_3__0 )* ) )
            // InternalSWI.g:1667:1: ( ( rule__MMESPSWIPackageFile__Group_3__0 )* )
            {
            // InternalSWI.g:1667:1: ( ( rule__MMESPSWIPackageFile__Group_3__0 )* )
            // InternalSWI.g:1668:1: ( rule__MMESPSWIPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getGroup_3()); 
            }
            // InternalSWI.g:1669:1: ( rule__MMESPSWIPackageFile__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSWI.g:1669:2: rule__MMESPSWIPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__MMESPSWIPackageFile__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__3__Impl"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__4"
    // InternalSWI.g:1679:1: rule__MMESPSWIPackageFile__Group__4 : rule__MMESPSWIPackageFile__Group__4__Impl ;
    public final void rule__MMESPSWIPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1683:1: ( rule__MMESPSWIPackageFile__Group__4__Impl )
            // InternalSWI.g:1684:2: rule__MMESPSWIPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__4"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group__4__Impl"
    // InternalSWI.g:1690:1: rule__MMESPSWIPackageFile__Group__4__Impl : ( ( rule__MMESPSWIPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__MMESPSWIPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1694:1: ( ( ( rule__MMESPSWIPackageFile__ElementAssignment_4 ) ) )
            // InternalSWI.g:1695:1: ( ( rule__MMESPSWIPackageFile__ElementAssignment_4 ) )
            {
            // InternalSWI.g:1695:1: ( ( rule__MMESPSWIPackageFile__ElementAssignment_4 ) )
            // InternalSWI.g:1696:1: ( rule__MMESPSWIPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getElementAssignment_4()); 
            }
            // InternalSWI.g:1697:1: ( rule__MMESPSWIPackageFile__ElementAssignment_4 )
            // InternalSWI.g:1697:2: rule__MMESPSWIPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__ElementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getElementAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group__4__Impl"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group_3__0"
    // InternalSWI.g:1717:1: rule__MMESPSWIPackageFile__Group_3__0 : rule__MMESPSWIPackageFile__Group_3__0__Impl rule__MMESPSWIPackageFile__Group_3__1 ;
    public final void rule__MMESPSWIPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1721:1: ( rule__MMESPSWIPackageFile__Group_3__0__Impl rule__MMESPSWIPackageFile__Group_3__1 )
            // InternalSWI.g:1722:2: rule__MMESPSWIPackageFile__Group_3__0__Impl rule__MMESPSWIPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MMESPSWIPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group_3__0"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group_3__0__Impl"
    // InternalSWI.g:1729:1: rule__MMESPSWIPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__MMESPSWIPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1733:1: ( ( 'import' ) )
            // InternalSWI.g:1734:1: ( 'import' )
            {
            // InternalSWI.g:1734:1: ( 'import' )
            // InternalSWI.g:1735:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getImportKeyword_3_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getImportKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group_3__0__Impl"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group_3__1"
    // InternalSWI.g:1748:1: rule__MMESPSWIPackageFile__Group_3__1 : rule__MMESPSWIPackageFile__Group_3__1__Impl rule__MMESPSWIPackageFile__Group_3__2 ;
    public final void rule__MMESPSWIPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1752:1: ( rule__MMESPSWIPackageFile__Group_3__1__Impl rule__MMESPSWIPackageFile__Group_3__2 )
            // InternalSWI.g:1753:2: rule__MMESPSWIPackageFile__Group_3__1__Impl rule__MMESPSWIPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MMESPSWIPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group_3__1"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group_3__1__Impl"
    // InternalSWI.g:1760:1: rule__MMESPSWIPackageFile__Group_3__1__Impl : ( ( rule__MMESPSWIPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__MMESPSWIPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1764:1: ( ( ( rule__MMESPSWIPackageFile__ImportsAssignment_3_1 ) ) )
            // InternalSWI.g:1765:1: ( ( rule__MMESPSWIPackageFile__ImportsAssignment_3_1 ) )
            {
            // InternalSWI.g:1765:1: ( ( rule__MMESPSWIPackageFile__ImportsAssignment_3_1 ) )
            // InternalSWI.g:1766:1: ( rule__MMESPSWIPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getImportsAssignment_3_1()); 
            }
            // InternalSWI.g:1767:1: ( rule__MMESPSWIPackageFile__ImportsAssignment_3_1 )
            // InternalSWI.g:1767:2: rule__MMESPSWIPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__ImportsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getImportsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group_3__1__Impl"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group_3__2"
    // InternalSWI.g:1777:1: rule__MMESPSWIPackageFile__Group_3__2 : rule__MMESPSWIPackageFile__Group_3__2__Impl ;
    public final void rule__MMESPSWIPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1781:1: ( rule__MMESPSWIPackageFile__Group_3__2__Impl )
            // InternalSWI.g:1782:2: rule__MMESPSWIPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPSWIPackageFile__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group_3__2"


    // $ANTLR start "rule__MMESPSWIPackageFile__Group_3__2__Impl"
    // InternalSWI.g:1788:1: rule__MMESPSWIPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MMESPSWIPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1792:1: ( ( ';' ) )
            // InternalSWI.g:1793:1: ( ';' )
            {
            // InternalSWI.g:1793:1: ( ';' )
            // InternalSWI.g:1794:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getSemicolonKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSWI.g:1813:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1817:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSWI.g:1818:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1825:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1829:1: ( ( RULE_ID ) )
            // InternalSWI.g:1830:1: ( RULE_ID )
            {
            // InternalSWI.g:1830:1: ( RULE_ID )
            // InternalSWI.g:1831:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:1842:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1846:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSWI.g:1847:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1853:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1857:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSWI.g:1858:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSWI.g:1858:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSWI.g:1859:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalSWI.g:1860:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSWI.g:1860:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSWI.g:1874:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1878:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSWI.g:1879:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1886:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1890:1: ( ( '.' ) )
            // InternalSWI.g:1891:1: ( '.' )
            {
            // InternalSWI.g:1891:1: ( '.' )
            // InternalSWI.g:1892:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:1905:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1909:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSWI.g:1910:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1916:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1920:1: ( ( RULE_ID ) )
            // InternalSWI.g:1921:1: ( RULE_ID )
            {
            // InternalSWI.g:1921:1: ( RULE_ID )
            // InternalSWI.g:1922:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:1937:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1941:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalSWI.g:1942:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Version__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1949:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1953:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalSWI.g:1954:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalSWI.g:1954:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalSWI.g:1955:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalSWI.g:1956:1: ( rule__Version__Alternatives_0 )
            // InternalSWI.g:1956:2: rule__Version__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1966:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1970:1: ( rule__Version__Group__1__Impl )
            // InternalSWI.g:1971:2: rule__Version__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:1977:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:1981:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalSWI.g:1982:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalSWI.g:1982:1: ( ( rule__Version__Group_1__0 )* )
            // InternalSWI.g:1983:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalSWI.g:1984:1: ( rule__Version__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSWI.g:1984:2: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSWI.g:1998:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2002:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalSWI.g:2003:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Version__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2010:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2014:1: ( ( ( RULE_INT )? ) )
            // InternalSWI.g:2015:1: ( ( RULE_INT )? )
            {
            // InternalSWI.g:2015:1: ( ( RULE_INT )? )
            // InternalSWI.g:2016:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalSWI.g:2017:1: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSWI.g:2017:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalSWI.g:2027:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2031:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalSWI.g:2032:2: rule__Version__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2038:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2042:1: ( ( RULE_ID ) )
            // InternalSWI.g:2043:1: ( RULE_ID )
            {
            // InternalSWI.g:2043:1: ( RULE_ID )
            // InternalSWI.g:2044:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:2059:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2063:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalSWI.g:2064:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Version__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2071:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2075:1: ( ( '.' ) )
            // InternalSWI.g:2076:1: ( '.' )
            {
            // InternalSWI.g:2076:1: ( '.' )
            // InternalSWI.g:2077:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:2090:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2094:1: ( rule__Version__Group_1__1__Impl )
            // InternalSWI.g:2095:2: rule__Version__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2101:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2105:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalSWI.g:2106:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalSWI.g:2106:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalSWI.g:2107:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalSWI.g:2108:1: ( rule__Version__Alternatives_1_1 )
            // InternalSWI.g:2108:2: rule__Version__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2122:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2126:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalSWI.g:2127:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Version__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2134:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2138:1: ( ( ( RULE_INT )? ) )
            // InternalSWI.g:2139:1: ( ( RULE_INT )? )
            {
            // InternalSWI.g:2139:1: ( ( RULE_INT )? )
            // InternalSWI.g:2140:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalSWI.g:2141:1: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSWI.g:2141:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalSWI.g:2151:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2155:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalSWI.g:2156:2: rule__Version__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2162:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2166:1: ( ( RULE_ID ) )
            // InternalSWI.g:2167:1: ( RULE_ID )
            {
            // InternalSWI.g:2167:1: ( RULE_ID )
            // InternalSWI.g:2168:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:2183:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2187:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalSWI.g:2188:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__VersionedQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2195:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2199:1: ( ( ruleQualifiedName ) )
            // InternalSWI.g:2200:1: ( ruleQualifiedName )
            {
            // InternalSWI.g:2200:1: ( ruleQualifiedName )
            // InternalSWI.g:2201:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2212:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2216:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalSWI.g:2217:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__VersionedQualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2224:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2228:1: ( ( '(' ) )
            // InternalSWI.g:2229:1: ( '(' )
            {
            // InternalSWI.g:2229:1: ( '(' )
            // InternalSWI.g:2230:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:2243:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2247:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalSWI.g:2248:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__VersionedQualifiedName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2255:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2259:1: ( ( ruleVersion ) )
            // InternalSWI.g:2260:1: ( ruleVersion )
            {
            // InternalSWI.g:2260:1: ( ruleVersion )
            // InternalSWI.g:2261:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2272:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2276:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalSWI.g:2277:2: rule__VersionedQualifiedName__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2283:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2287:1: ( ( ')' ) )
            // InternalSWI.g:2288:1: ( ')' )
            {
            // InternalSWI.g:2288:1: ( ')' )
            // InternalSWI.g:2289:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:2310:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2314:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // InternalSWI.g:2315:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__VersionedQualifiedReferenceName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2322:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2326:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // InternalSWI.g:2327:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // InternalSWI.g:2327:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // InternalSWI.g:2328:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }
            // InternalSWI.g:2329:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1>=21 && LA18_1<=22)) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalSWI.g:2329:2: rule__VersionedQualifiedReferenceName__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2339:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2343:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // InternalSWI.g:2344:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__VersionedQualifiedReferenceName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2351:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2355:1: ( ( RULE_ID ) )
            // InternalSWI.g:2356:1: ( RULE_ID )
            {
            // InternalSWI.g:2356:1: ( RULE_ID )
            // InternalSWI.g:2357:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:2368:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2372:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // InternalSWI.g:2373:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2379:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2383:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // InternalSWI.g:2384:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // InternalSWI.g:2384:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // InternalSWI.g:2385:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }
            // InternalSWI.g:2386:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSWI.g:2386:2: rule__VersionedQualifiedReferenceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__VersionedQualifiedReferenceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalSWI.g:2402:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2406:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // InternalSWI.g:2407:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__VersionedQualifiedReferenceName__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2414:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2418:1: ( ( ruleVersionedQualifiedName ) )
            // InternalSWI.g:2419:1: ( ruleVersionedQualifiedName )
            {
            // InternalSWI.g:2419:1: ( ruleVersionedQualifiedName )
            // InternalSWI.g:2420:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2431:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2435:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // InternalSWI.g:2436:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2442:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2446:1: ( ( '::' ) )
            // InternalSWI.g:2447:1: ( '::' )
            {
            // InternalSWI.g:2447:1: ( '::' )
            // InternalSWI.g:2448:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:2465:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2469:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // InternalSWI.g:2470:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__VersionedQualifiedReferenceName__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2477:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2481:1: ( ( '::' ) )
            // InternalSWI.g:2482:1: ( '::' )
            {
            // InternalSWI.g:2482:1: ( '::' )
            // InternalSWI.g:2483:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalSWI.g:2496:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2500:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // InternalSWI.g:2501:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSWI.g:2507:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2511:1: ( ( RULE_ID ) )
            // InternalSWI.g:2512:1: ( RULE_ID )
            {
            // InternalSWI.g:2512:1: ( RULE_ID )
            // InternalSWI.g:2513:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__MSwInterface__Group__0"
    // InternalSWI.g:2528:1: rule__MSwInterface__Group__0 : rule__MSwInterface__Group__0__Impl rule__MSwInterface__Group__1 ;
    public final void rule__MSwInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2532:1: ( rule__MSwInterface__Group__0__Impl rule__MSwInterface__Group__1 )
            // InternalSWI.g:2533:2: rule__MSwInterface__Group__0__Impl rule__MSwInterface__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MSwInterface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__0"


    // $ANTLR start "rule__MSwInterface__Group__0__Impl"
    // InternalSWI.g:2540:1: rule__MSwInterface__Group__0__Impl : ( 'swinterface' ) ;
    public final void rule__MSwInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2544:1: ( ( 'swinterface' ) )
            // InternalSWI.g:2545:1: ( 'swinterface' )
            {
            // InternalSWI.g:2545:1: ( 'swinterface' )
            // InternalSWI.g:2546:1: 'swinterface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getSwinterfaceKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getSwinterfaceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group__1"
    // InternalSWI.g:2559:1: rule__MSwInterface__Group__1 : rule__MSwInterface__Group__1__Impl rule__MSwInterface__Group__2 ;
    public final void rule__MSwInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2563:1: ( rule__MSwInterface__Group__1__Impl rule__MSwInterface__Group__2 )
            // InternalSWI.g:2564:2: rule__MSwInterface__Group__1__Impl rule__MSwInterface__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__MSwInterface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__1"


    // $ANTLR start "rule__MSwInterface__Group__1__Impl"
    // InternalSWI.g:2571:1: rule__MSwInterface__Group__1__Impl : ( ( rule__MSwInterface__NameAssignment_1 ) ) ;
    public final void rule__MSwInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2575:1: ( ( ( rule__MSwInterface__NameAssignment_1 ) ) )
            // InternalSWI.g:2576:1: ( ( rule__MSwInterface__NameAssignment_1 ) )
            {
            // InternalSWI.g:2576:1: ( ( rule__MSwInterface__NameAssignment_1 ) )
            // InternalSWI.g:2577:1: ( rule__MSwInterface__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getNameAssignment_1()); 
            }
            // InternalSWI.g:2578:1: ( rule__MSwInterface__NameAssignment_1 )
            // InternalSWI.g:2578:2: rule__MSwInterface__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group__2"
    // InternalSWI.g:2588:1: rule__MSwInterface__Group__2 : rule__MSwInterface__Group__2__Impl rule__MSwInterface__Group__3 ;
    public final void rule__MSwInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2592:1: ( rule__MSwInterface__Group__2__Impl rule__MSwInterface__Group__3 )
            // InternalSWI.g:2593:2: rule__MSwInterface__Group__2__Impl rule__MSwInterface__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__MSwInterface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__2"


    // $ANTLR start "rule__MSwInterface__Group__2__Impl"
    // InternalSWI.g:2600:1: rule__MSwInterface__Group__2__Impl : ( ( rule__MSwInterface__Group_2__0 )? ) ;
    public final void rule__MSwInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2604:1: ( ( ( rule__MSwInterface__Group_2__0 )? ) )
            // InternalSWI.g:2605:1: ( ( rule__MSwInterface__Group_2__0 )? )
            {
            // InternalSWI.g:2605:1: ( ( rule__MSwInterface__Group_2__0 )? )
            // InternalSWI.g:2606:1: ( rule__MSwInterface__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getGroup_2()); 
            }
            // InternalSWI.g:2607:1: ( rule__MSwInterface__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSWI.g:2607:2: rule__MSwInterface__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__2__Impl"


    // $ANTLR start "rule__MSwInterface__Group__3"
    // InternalSWI.g:2617:1: rule__MSwInterface__Group__3 : rule__MSwInterface__Group__3__Impl rule__MSwInterface__Group__4 ;
    public final void rule__MSwInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2621:1: ( rule__MSwInterface__Group__3__Impl rule__MSwInterface__Group__4 )
            // InternalSWI.g:2622:2: rule__MSwInterface__Group__3__Impl rule__MSwInterface__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__MSwInterface__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__3"


    // $ANTLR start "rule__MSwInterface__Group__3__Impl"
    // InternalSWI.g:2629:1: rule__MSwInterface__Group__3__Impl : ( '{' ) ;
    public final void rule__MSwInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2633:1: ( ( '{' ) )
            // InternalSWI.g:2634:1: ( '{' )
            {
            // InternalSWI.g:2634:1: ( '{' )
            // InternalSWI.g:2635:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__3__Impl"


    // $ANTLR start "rule__MSwInterface__Group__4"
    // InternalSWI.g:2648:1: rule__MSwInterface__Group__4 : rule__MSwInterface__Group__4__Impl rule__MSwInterface__Group__5 ;
    public final void rule__MSwInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2652:1: ( rule__MSwInterface__Group__4__Impl rule__MSwInterface__Group__5 )
            // InternalSWI.g:2653:2: rule__MSwInterface__Group__4__Impl rule__MSwInterface__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__MSwInterface__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__4"


    // $ANTLR start "rule__MSwInterface__Group__4__Impl"
    // InternalSWI.g:2660:1: rule__MSwInterface__Group__4__Impl : ( ( rule__MSwInterface__UnorderedGroup_4 ) ) ;
    public final void rule__MSwInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2664:1: ( ( ( rule__MSwInterface__UnorderedGroup_4 ) ) )
            // InternalSWI.g:2665:1: ( ( rule__MSwInterface__UnorderedGroup_4 ) )
            {
            // InternalSWI.g:2665:1: ( ( rule__MSwInterface__UnorderedGroup_4 ) )
            // InternalSWI.g:2666:1: ( rule__MSwInterface__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4()); 
            }
            // InternalSWI.g:2667:1: ( rule__MSwInterface__UnorderedGroup_4 )
            // InternalSWI.g:2667:2: rule__MSwInterface__UnorderedGroup_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__4__Impl"


    // $ANTLR start "rule__MSwInterface__Group__5"
    // InternalSWI.g:2677:1: rule__MSwInterface__Group__5 : rule__MSwInterface__Group__5__Impl rule__MSwInterface__Group__6 ;
    public final void rule__MSwInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2681:1: ( rule__MSwInterface__Group__5__Impl rule__MSwInterface__Group__6 )
            // InternalSWI.g:2682:2: rule__MSwInterface__Group__5__Impl rule__MSwInterface__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MSwInterface__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__5"


    // $ANTLR start "rule__MSwInterface__Group__5__Impl"
    // InternalSWI.g:2689:1: rule__MSwInterface__Group__5__Impl : ( '}' ) ;
    public final void rule__MSwInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2693:1: ( ( '}' ) )
            // InternalSWI.g:2694:1: ( '}' )
            {
            // InternalSWI.g:2694:1: ( '}' )
            // InternalSWI.g:2695:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__5__Impl"


    // $ANTLR start "rule__MSwInterface__Group__6"
    // InternalSWI.g:2708:1: rule__MSwInterface__Group__6 : rule__MSwInterface__Group__6__Impl ;
    public final void rule__MSwInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2712:1: ( rule__MSwInterface__Group__6__Impl )
            // InternalSWI.g:2713:2: rule__MSwInterface__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__6"


    // $ANTLR start "rule__MSwInterface__Group__6__Impl"
    // InternalSWI.g:2719:1: rule__MSwInterface__Group__6__Impl : ( ';' ) ;
    public final void rule__MSwInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2723:1: ( ( ';' ) )
            // InternalSWI.g:2724:1: ( ';' )
            {
            // InternalSWI.g:2724:1: ( ';' )
            // InternalSWI.g:2725:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_6()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group__6__Impl"


    // $ANTLR start "rule__MSwInterface__Group_2__0"
    // InternalSWI.g:2752:1: rule__MSwInterface__Group_2__0 : rule__MSwInterface__Group_2__0__Impl rule__MSwInterface__Group_2__1 ;
    public final void rule__MSwInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2756:1: ( rule__MSwInterface__Group_2__0__Impl rule__MSwInterface__Group_2__1 )
            // InternalSWI.g:2757:2: rule__MSwInterface__Group_2__0__Impl rule__MSwInterface__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MSwInterface__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2__0"


    // $ANTLR start "rule__MSwInterface__Group_2__0__Impl"
    // InternalSWI.g:2764:1: rule__MSwInterface__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__MSwInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2768:1: ( ( 'extends' ) )
            // InternalSWI.g:2769:1: ( 'extends' )
            {
            // InternalSWI.g:2769:1: ( 'extends' )
            // InternalSWI.g:2770:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getExtendsKeyword_2_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group_2__1"
    // InternalSWI.g:2783:1: rule__MSwInterface__Group_2__1 : rule__MSwInterface__Group_2__1__Impl rule__MSwInterface__Group_2__2 ;
    public final void rule__MSwInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2787:1: ( rule__MSwInterface__Group_2__1__Impl rule__MSwInterface__Group_2__2 )
            // InternalSWI.g:2788:2: rule__MSwInterface__Group_2__1__Impl rule__MSwInterface__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MSwInterface__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2__1"


    // $ANTLR start "rule__MSwInterface__Group_2__1__Impl"
    // InternalSWI.g:2795:1: rule__MSwInterface__Group_2__1__Impl : ( ( rule__MSwInterface__ExtendsAssignment_2_1 ) ) ;
    public final void rule__MSwInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2799:1: ( ( ( rule__MSwInterface__ExtendsAssignment_2_1 ) ) )
            // InternalSWI.g:2800:1: ( ( rule__MSwInterface__ExtendsAssignment_2_1 ) )
            {
            // InternalSWI.g:2800:1: ( ( rule__MSwInterface__ExtendsAssignment_2_1 ) )
            // InternalSWI.g:2801:1: ( rule__MSwInterface__ExtendsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getExtendsAssignment_2_1()); 
            }
            // InternalSWI.g:2802:1: ( rule__MSwInterface__ExtendsAssignment_2_1 )
            // InternalSWI.g:2802:2: rule__MSwInterface__ExtendsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__ExtendsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getExtendsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group_2__2"
    // InternalSWI.g:2812:1: rule__MSwInterface__Group_2__2 : rule__MSwInterface__Group_2__2__Impl ;
    public final void rule__MSwInterface__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2816:1: ( rule__MSwInterface__Group_2__2__Impl )
            // InternalSWI.g:2817:2: rule__MSwInterface__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2__2"


    // $ANTLR start "rule__MSwInterface__Group_2__2__Impl"
    // InternalSWI.g:2823:1: rule__MSwInterface__Group_2__2__Impl : ( ( rule__MSwInterface__Group_2_2__0 )* ) ;
    public final void rule__MSwInterface__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2827:1: ( ( ( rule__MSwInterface__Group_2_2__0 )* ) )
            // InternalSWI.g:2828:1: ( ( rule__MSwInterface__Group_2_2__0 )* )
            {
            // InternalSWI.g:2828:1: ( ( rule__MSwInterface__Group_2_2__0 )* )
            // InternalSWI.g:2829:1: ( rule__MSwInterface__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getGroup_2_2()); 
            }
            // InternalSWI.g:2830:1: ( rule__MSwInterface__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSWI.g:2830:2: rule__MSwInterface__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__MSwInterface__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2__2__Impl"


    // $ANTLR start "rule__MSwInterface__Group_2_2__0"
    // InternalSWI.g:2846:1: rule__MSwInterface__Group_2_2__0 : rule__MSwInterface__Group_2_2__0__Impl rule__MSwInterface__Group_2_2__1 ;
    public final void rule__MSwInterface__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2850:1: ( rule__MSwInterface__Group_2_2__0__Impl rule__MSwInterface__Group_2_2__1 )
            // InternalSWI.g:2851:2: rule__MSwInterface__Group_2_2__0__Impl rule__MSwInterface__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MSwInterface__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2_2__0"


    // $ANTLR start "rule__MSwInterface__Group_2_2__0__Impl"
    // InternalSWI.g:2858:1: rule__MSwInterface__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MSwInterface__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2862:1: ( ( ',' ) )
            // InternalSWI.g:2863:1: ( ',' )
            {
            // InternalSWI.g:2863:1: ( ',' )
            // InternalSWI.g:2864:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2_2__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group_2_2__1"
    // InternalSWI.g:2877:1: rule__MSwInterface__Group_2_2__1 : rule__MSwInterface__Group_2_2__1__Impl ;
    public final void rule__MSwInterface__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2881:1: ( rule__MSwInterface__Group_2_2__1__Impl )
            // InternalSWI.g:2882:2: rule__MSwInterface__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2_2__1"


    // $ANTLR start "rule__MSwInterface__Group_2_2__1__Impl"
    // InternalSWI.g:2888:1: rule__MSwInterface__Group_2_2__1__Impl : ( ( rule__MSwInterface__ExtendsAssignment_2_2_1 ) ) ;
    public final void rule__MSwInterface__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2892:1: ( ( ( rule__MSwInterface__ExtendsAssignment_2_2_1 ) ) )
            // InternalSWI.g:2893:1: ( ( rule__MSwInterface__ExtendsAssignment_2_2_1 ) )
            {
            // InternalSWI.g:2893:1: ( ( rule__MSwInterface__ExtendsAssignment_2_2_1 ) )
            // InternalSWI.g:2894:1: ( rule__MSwInterface__ExtendsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getExtendsAssignment_2_2_1()); 
            }
            // InternalSWI.g:2895:1: ( rule__MSwInterface__ExtendsAssignment_2_2_1 )
            // InternalSWI.g:2895:2: rule__MSwInterface__ExtendsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__ExtendsAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getExtendsAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_2_2__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_0__0"
    // InternalSWI.g:2909:1: rule__MSwInterface__Group_4_0__0 : rule__MSwInterface__Group_4_0__0__Impl rule__MSwInterface__Group_4_0__1 ;
    public final void rule__MSwInterface__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2913:1: ( rule__MSwInterface__Group_4_0__0__Impl rule__MSwInterface__Group_4_0__1 )
            // InternalSWI.g:2914:2: rule__MSwInterface__Group_4_0__0__Impl rule__MSwInterface__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MSwInterface__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_0__0"


    // $ANTLR start "rule__MSwInterface__Group_4_0__0__Impl"
    // InternalSWI.g:2921:1: rule__MSwInterface__Group_4_0__0__Impl : ( 'version' ) ;
    public final void rule__MSwInterface__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2925:1: ( ( 'version' ) )
            // InternalSWI.g:2926:1: ( 'version' )
            {
            // InternalSWI.g:2926:1: ( 'version' )
            // InternalSWI.g:2927:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getVersionKeyword_4_0_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getVersionKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_0__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_0__1"
    // InternalSWI.g:2940:1: rule__MSwInterface__Group_4_0__1 : rule__MSwInterface__Group_4_0__1__Impl rule__MSwInterface__Group_4_0__2 ;
    public final void rule__MSwInterface__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2944:1: ( rule__MSwInterface__Group_4_0__1__Impl rule__MSwInterface__Group_4_0__2 )
            // InternalSWI.g:2945:2: rule__MSwInterface__Group_4_0__1__Impl rule__MSwInterface__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__MSwInterface__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_0__1"


    // $ANTLR start "rule__MSwInterface__Group_4_0__1__Impl"
    // InternalSWI.g:2952:1: rule__MSwInterface__Group_4_0__1__Impl : ( ':=' ) ;
    public final void rule__MSwInterface__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2956:1: ( ( ':=' ) )
            // InternalSWI.g:2957:1: ( ':=' )
            {
            // InternalSWI.g:2957:1: ( ':=' )
            // InternalSWI.g:2958:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_0_1()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_0__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_0__2"
    // InternalSWI.g:2971:1: rule__MSwInterface__Group_4_0__2 : rule__MSwInterface__Group_4_0__2__Impl rule__MSwInterface__Group_4_0__3 ;
    public final void rule__MSwInterface__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2975:1: ( rule__MSwInterface__Group_4_0__2__Impl rule__MSwInterface__Group_4_0__3 )
            // InternalSWI.g:2976:2: rule__MSwInterface__Group_4_0__2__Impl rule__MSwInterface__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MSwInterface__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_0__2"


    // $ANTLR start "rule__MSwInterface__Group_4_0__2__Impl"
    // InternalSWI.g:2983:1: rule__MSwInterface__Group_4_0__2__Impl : ( ( rule__MSwInterface__VersionAssignment_4_0_2 ) ) ;
    public final void rule__MSwInterface__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:2987:1: ( ( ( rule__MSwInterface__VersionAssignment_4_0_2 ) ) )
            // InternalSWI.g:2988:1: ( ( rule__MSwInterface__VersionAssignment_4_0_2 ) )
            {
            // InternalSWI.g:2988:1: ( ( rule__MSwInterface__VersionAssignment_4_0_2 ) )
            // InternalSWI.g:2989:1: ( rule__MSwInterface__VersionAssignment_4_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getVersionAssignment_4_0_2()); 
            }
            // InternalSWI.g:2990:1: ( rule__MSwInterface__VersionAssignment_4_0_2 )
            // InternalSWI.g:2990:2: rule__MSwInterface__VersionAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__VersionAssignment_4_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getVersionAssignment_4_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_0__2__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_0__3"
    // InternalSWI.g:3000:1: rule__MSwInterface__Group_4_0__3 : rule__MSwInterface__Group_4_0__3__Impl ;
    public final void rule__MSwInterface__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3004:1: ( rule__MSwInterface__Group_4_0__3__Impl )
            // InternalSWI.g:3005:2: rule__MSwInterface__Group_4_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_0__3"


    // $ANTLR start "rule__MSwInterface__Group_4_0__3__Impl"
    // InternalSWI.g:3011:1: rule__MSwInterface__Group_4_0__3__Impl : ( ';' ) ;
    public final void rule__MSwInterface__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3015:1: ( ( ';' ) )
            // InternalSWI.g:3016:1: ( ';' )
            {
            // InternalSWI.g:3016:1: ( ';' )
            // InternalSWI.g:3017:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_0_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_0__3__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_1__0"
    // InternalSWI.g:3038:1: rule__MSwInterface__Group_4_1__0 : rule__MSwInterface__Group_4_1__0__Impl rule__MSwInterface__Group_4_1__1 ;
    public final void rule__MSwInterface__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3042:1: ( rule__MSwInterface__Group_4_1__0__Impl rule__MSwInterface__Group_4_1__1 )
            // InternalSWI.g:3043:2: rule__MSwInterface__Group_4_1__0__Impl rule__MSwInterface__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MSwInterface__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_1__0"


    // $ANTLR start "rule__MSwInterface__Group_4_1__0__Impl"
    // InternalSWI.g:3050:1: rule__MSwInterface__Group_4_1__0__Impl : ( 'language' ) ;
    public final void rule__MSwInterface__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3054:1: ( ( 'language' ) )
            // InternalSWI.g:3055:1: ( 'language' )
            {
            // InternalSWI.g:3055:1: ( 'language' )
            // InternalSWI.g:3056:1: 'language'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getLanguageKeyword_4_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getLanguageKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_1__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_1__1"
    // InternalSWI.g:3069:1: rule__MSwInterface__Group_4_1__1 : rule__MSwInterface__Group_4_1__1__Impl rule__MSwInterface__Group_4_1__2 ;
    public final void rule__MSwInterface__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3073:1: ( rule__MSwInterface__Group_4_1__1__Impl rule__MSwInterface__Group_4_1__2 )
            // InternalSWI.g:3074:2: rule__MSwInterface__Group_4_1__1__Impl rule__MSwInterface__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MSwInterface__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_1__1"


    // $ANTLR start "rule__MSwInterface__Group_4_1__1__Impl"
    // InternalSWI.g:3081:1: rule__MSwInterface__Group_4_1__1__Impl : ( ':=' ) ;
    public final void rule__MSwInterface__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3085:1: ( ( ':=' ) )
            // InternalSWI.g:3086:1: ( ':=' )
            {
            // InternalSWI.g:3086:1: ( ':=' )
            // InternalSWI.g:3087:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_1_1()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_1__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_1__2"
    // InternalSWI.g:3100:1: rule__MSwInterface__Group_4_1__2 : rule__MSwInterface__Group_4_1__2__Impl rule__MSwInterface__Group_4_1__3 ;
    public final void rule__MSwInterface__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3104:1: ( rule__MSwInterface__Group_4_1__2__Impl rule__MSwInterface__Group_4_1__3 )
            // InternalSWI.g:3105:2: rule__MSwInterface__Group_4_1__2__Impl rule__MSwInterface__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MSwInterface__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_1__2"


    // $ANTLR start "rule__MSwInterface__Group_4_1__2__Impl"
    // InternalSWI.g:3112:1: rule__MSwInterface__Group_4_1__2__Impl : ( ( rule__MSwInterface__LanguageAssignment_4_1_2 ) ) ;
    public final void rule__MSwInterface__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3116:1: ( ( ( rule__MSwInterface__LanguageAssignment_4_1_2 ) ) )
            // InternalSWI.g:3117:1: ( ( rule__MSwInterface__LanguageAssignment_4_1_2 ) )
            {
            // InternalSWI.g:3117:1: ( ( rule__MSwInterface__LanguageAssignment_4_1_2 ) )
            // InternalSWI.g:3118:1: ( rule__MSwInterface__LanguageAssignment_4_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getLanguageAssignment_4_1_2()); 
            }
            // InternalSWI.g:3119:1: ( rule__MSwInterface__LanguageAssignment_4_1_2 )
            // InternalSWI.g:3119:2: rule__MSwInterface__LanguageAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__LanguageAssignment_4_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getLanguageAssignment_4_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_1__2__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_1__3"
    // InternalSWI.g:3129:1: rule__MSwInterface__Group_4_1__3 : rule__MSwInterface__Group_4_1__3__Impl ;
    public final void rule__MSwInterface__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3133:1: ( rule__MSwInterface__Group_4_1__3__Impl )
            // InternalSWI.g:3134:2: rule__MSwInterface__Group_4_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_1__3"


    // $ANTLR start "rule__MSwInterface__Group_4_1__3__Impl"
    // InternalSWI.g:3140:1: rule__MSwInterface__Group_4_1__3__Impl : ( ';' ) ;
    public final void rule__MSwInterface__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3144:1: ( ( ';' ) )
            // InternalSWI.g:3145:1: ( ';' )
            {
            // InternalSWI.g:3145:1: ( ';' )
            // InternalSWI.g:3146:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_1_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_1__3__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_2__0"
    // InternalSWI.g:3167:1: rule__MSwInterface__Group_4_2__0 : rule__MSwInterface__Group_4_2__0__Impl rule__MSwInterface__Group_4_2__1 ;
    public final void rule__MSwInterface__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3171:1: ( rule__MSwInterface__Group_4_2__0__Impl rule__MSwInterface__Group_4_2__1 )
            // InternalSWI.g:3172:2: rule__MSwInterface__Group_4_2__0__Impl rule__MSwInterface__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__MSwInterface__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__0"


    // $ANTLR start "rule__MSwInterface__Group_4_2__0__Impl"
    // InternalSWI.g:3179:1: rule__MSwInterface__Group_4_2__0__Impl : ( 'configuration' ) ;
    public final void rule__MSwInterface__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3183:1: ( ( 'configuration' ) )
            // InternalSWI.g:3184:1: ( 'configuration' )
            {
            // InternalSWI.g:3184:1: ( 'configuration' )
            // InternalSWI.g:3185:1: 'configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getConfigurationKeyword_4_2_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getConfigurationKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_2__1"
    // InternalSWI.g:3198:1: rule__MSwInterface__Group_4_2__1 : rule__MSwInterface__Group_4_2__1__Impl rule__MSwInterface__Group_4_2__2 ;
    public final void rule__MSwInterface__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3202:1: ( rule__MSwInterface__Group_4_2__1__Impl rule__MSwInterface__Group_4_2__2 )
            // InternalSWI.g:3203:2: rule__MSwInterface__Group_4_2__1__Impl rule__MSwInterface__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__MSwInterface__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__1"


    // $ANTLR start "rule__MSwInterface__Group_4_2__1__Impl"
    // InternalSWI.g:3210:1: rule__MSwInterface__Group_4_2__1__Impl : ( 'parameters' ) ;
    public final void rule__MSwInterface__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3214:1: ( ( 'parameters' ) )
            // InternalSWI.g:3215:1: ( 'parameters' )
            {
            // InternalSWI.g:3215:1: ( 'parameters' )
            // InternalSWI.g:3216:1: 'parameters'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getParametersKeyword_4_2_1()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getParametersKeyword_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_2__2"
    // InternalSWI.g:3229:1: rule__MSwInterface__Group_4_2__2 : rule__MSwInterface__Group_4_2__2__Impl rule__MSwInterface__Group_4_2__3 ;
    public final void rule__MSwInterface__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3233:1: ( rule__MSwInterface__Group_4_2__2__Impl rule__MSwInterface__Group_4_2__3 )
            // InternalSWI.g:3234:2: rule__MSwInterface__Group_4_2__2__Impl rule__MSwInterface__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__MSwInterface__Group_4_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__2"


    // $ANTLR start "rule__MSwInterface__Group_4_2__2__Impl"
    // InternalSWI.g:3241:1: rule__MSwInterface__Group_4_2__2__Impl : ( '{' ) ;
    public final void rule__MSwInterface__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3245:1: ( ( '{' ) )
            // InternalSWI.g:3246:1: ( '{' )
            {
            // InternalSWI.g:3246:1: ( '{' )
            // InternalSWI.g:3247:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getLeftCurlyBracketKeyword_4_2_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getLeftCurlyBracketKeyword_4_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__2__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_2__3"
    // InternalSWI.g:3260:1: rule__MSwInterface__Group_4_2__3 : rule__MSwInterface__Group_4_2__3__Impl rule__MSwInterface__Group_4_2__4 ;
    public final void rule__MSwInterface__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3264:1: ( rule__MSwInterface__Group_4_2__3__Impl rule__MSwInterface__Group_4_2__4 )
            // InternalSWI.g:3265:2: rule__MSwInterface__Group_4_2__3__Impl rule__MSwInterface__Group_4_2__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__MSwInterface__Group_4_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__3"


    // $ANTLR start "rule__MSwInterface__Group_4_2__3__Impl"
    // InternalSWI.g:3272:1: rule__MSwInterface__Group_4_2__3__Impl : ( ( ( rule__MSwInterface__ParametersAssignment_4_2_3 ) ) ( ( rule__MSwInterface__ParametersAssignment_4_2_3 )* ) ) ;
    public final void rule__MSwInterface__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3276:1: ( ( ( ( rule__MSwInterface__ParametersAssignment_4_2_3 ) ) ( ( rule__MSwInterface__ParametersAssignment_4_2_3 )* ) ) )
            // InternalSWI.g:3277:1: ( ( ( rule__MSwInterface__ParametersAssignment_4_2_3 ) ) ( ( rule__MSwInterface__ParametersAssignment_4_2_3 )* ) )
            {
            // InternalSWI.g:3277:1: ( ( ( rule__MSwInterface__ParametersAssignment_4_2_3 ) ) ( ( rule__MSwInterface__ParametersAssignment_4_2_3 )* ) )
            // InternalSWI.g:3278:1: ( ( rule__MSwInterface__ParametersAssignment_4_2_3 ) ) ( ( rule__MSwInterface__ParametersAssignment_4_2_3 )* )
            {
            // InternalSWI.g:3278:1: ( ( rule__MSwInterface__ParametersAssignment_4_2_3 ) )
            // InternalSWI.g:3279:1: ( rule__MSwInterface__ParametersAssignment_4_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getParametersAssignment_4_2_3()); 
            }
            // InternalSWI.g:3280:1: ( rule__MSwInterface__ParametersAssignment_4_2_3 )
            // InternalSWI.g:3280:2: rule__MSwInterface__ParametersAssignment_4_2_3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__MSwInterface__ParametersAssignment_4_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getParametersAssignment_4_2_3()); 
            }

            }

            // InternalSWI.g:3283:1: ( ( rule__MSwInterface__ParametersAssignment_4_2_3 )* )
            // InternalSWI.g:3284:1: ( rule__MSwInterface__ParametersAssignment_4_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getParametersAssignment_4_2_3()); 
            }
            // InternalSWI.g:3285:1: ( rule__MSwInterface__ParametersAssignment_4_2_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45||(LA22_0>=47 && LA22_0<=48)||(LA22_0>=50 && LA22_0<=51)||LA22_0==55) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSWI.g:3285:2: rule__MSwInterface__ParametersAssignment_4_2_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__MSwInterface__ParametersAssignment_4_2_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getParametersAssignment_4_2_3()); 
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
    // $ANTLR end "rule__MSwInterface__Group_4_2__3__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_2__4"
    // InternalSWI.g:3296:1: rule__MSwInterface__Group_4_2__4 : rule__MSwInterface__Group_4_2__4__Impl rule__MSwInterface__Group_4_2__5 ;
    public final void rule__MSwInterface__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3300:1: ( rule__MSwInterface__Group_4_2__4__Impl rule__MSwInterface__Group_4_2__5 )
            // InternalSWI.g:3301:2: rule__MSwInterface__Group_4_2__4__Impl rule__MSwInterface__Group_4_2__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MSwInterface__Group_4_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__4"


    // $ANTLR start "rule__MSwInterface__Group_4_2__4__Impl"
    // InternalSWI.g:3308:1: rule__MSwInterface__Group_4_2__4__Impl : ( '}' ) ;
    public final void rule__MSwInterface__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3312:1: ( ( '}' ) )
            // InternalSWI.g:3313:1: ( '}' )
            {
            // InternalSWI.g:3313:1: ( '}' )
            // InternalSWI.g:3314:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRightCurlyBracketKeyword_4_2_4()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRightCurlyBracketKeyword_4_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__4__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_2__5"
    // InternalSWI.g:3327:1: rule__MSwInterface__Group_4_2__5 : rule__MSwInterface__Group_4_2__5__Impl ;
    public final void rule__MSwInterface__Group_4_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3331:1: ( rule__MSwInterface__Group_4_2__5__Impl )
            // InternalSWI.g:3332:2: rule__MSwInterface__Group_4_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__5"


    // $ANTLR start "rule__MSwInterface__Group_4_2__5__Impl"
    // InternalSWI.g:3338:1: rule__MSwInterface__Group_4_2__5__Impl : ( ';' ) ;
    public final void rule__MSwInterface__Group_4_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3342:1: ( ( ';' ) )
            // InternalSWI.g:3343:1: ( ';' )
            {
            // InternalSWI.g:3343:1: ( ';' )
            // InternalSWI.g:3344:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_2_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_2__5__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_3__0"
    // InternalSWI.g:3369:1: rule__MSwInterface__Group_4_3__0 : rule__MSwInterface__Group_4_3__0__Impl rule__MSwInterface__Group_4_3__1 ;
    public final void rule__MSwInterface__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3373:1: ( rule__MSwInterface__Group_4_3__0__Impl rule__MSwInterface__Group_4_3__1 )
            // InternalSWI.g:3374:2: rule__MSwInterface__Group_4_3__0__Impl rule__MSwInterface__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__MSwInterface__Group_4_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__0"


    // $ANTLR start "rule__MSwInterface__Group_4_3__0__Impl"
    // InternalSWI.g:3381:1: rule__MSwInterface__Group_4_3__0__Impl : ( 'provided' ) ;
    public final void rule__MSwInterface__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3385:1: ( ( 'provided' ) )
            // InternalSWI.g:3386:1: ( 'provided' )
            {
            // InternalSWI.g:3386:1: ( 'provided' )
            // InternalSWI.g:3387:1: 'provided'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getProvidedKeyword_4_3_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getProvidedKeyword_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_3__1"
    // InternalSWI.g:3400:1: rule__MSwInterface__Group_4_3__1 : rule__MSwInterface__Group_4_3__1__Impl rule__MSwInterface__Group_4_3__2 ;
    public final void rule__MSwInterface__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3404:1: ( rule__MSwInterface__Group_4_3__1__Impl rule__MSwInterface__Group_4_3__2 )
            // InternalSWI.g:3405:2: rule__MSwInterface__Group_4_3__1__Impl rule__MSwInterface__Group_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__MSwInterface__Group_4_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__1"


    // $ANTLR start "rule__MSwInterface__Group_4_3__1__Impl"
    // InternalSWI.g:3412:1: rule__MSwInterface__Group_4_3__1__Impl : ( 'resources' ) ;
    public final void rule__MSwInterface__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3416:1: ( ( 'resources' ) )
            // InternalSWI.g:3417:1: ( 'resources' )
            {
            // InternalSWI.g:3417:1: ( 'resources' )
            // InternalSWI.g:3418:1: 'resources'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getResourcesKeyword_4_3_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getResourcesKeyword_4_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_3__2"
    // InternalSWI.g:3431:1: rule__MSwInterface__Group_4_3__2 : rule__MSwInterface__Group_4_3__2__Impl rule__MSwInterface__Group_4_3__3 ;
    public final void rule__MSwInterface__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3435:1: ( rule__MSwInterface__Group_4_3__2__Impl rule__MSwInterface__Group_4_3__3 )
            // InternalSWI.g:3436:2: rule__MSwInterface__Group_4_3__2__Impl rule__MSwInterface__Group_4_3__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__MSwInterface__Group_4_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__2"


    // $ANTLR start "rule__MSwInterface__Group_4_3__2__Impl"
    // InternalSWI.g:3443:1: rule__MSwInterface__Group_4_3__2__Impl : ( '{' ) ;
    public final void rule__MSwInterface__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3447:1: ( ( '{' ) )
            // InternalSWI.g:3448:1: ( '{' )
            {
            // InternalSWI.g:3448:1: ( '{' )
            // InternalSWI.g:3449:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getLeftCurlyBracketKeyword_4_3_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getLeftCurlyBracketKeyword_4_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__2__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_3__3"
    // InternalSWI.g:3462:1: rule__MSwInterface__Group_4_3__3 : rule__MSwInterface__Group_4_3__3__Impl rule__MSwInterface__Group_4_3__4 ;
    public final void rule__MSwInterface__Group_4_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3466:1: ( rule__MSwInterface__Group_4_3__3__Impl rule__MSwInterface__Group_4_3__4 )
            // InternalSWI.g:3467:2: rule__MSwInterface__Group_4_3__3__Impl rule__MSwInterface__Group_4_3__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__MSwInterface__Group_4_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__3"


    // $ANTLR start "rule__MSwInterface__Group_4_3__3__Impl"
    // InternalSWI.g:3474:1: rule__MSwInterface__Group_4_3__3__Impl : ( ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 ) ) ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )* ) ) ;
    public final void rule__MSwInterface__Group_4_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3478:1: ( ( ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 ) ) ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )* ) ) )
            // InternalSWI.g:3479:1: ( ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 ) ) ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )* ) )
            {
            // InternalSWI.g:3479:1: ( ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 ) ) ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )* ) )
            // InternalSWI.g:3480:1: ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 ) ) ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )* )
            {
            // InternalSWI.g:3480:1: ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 ) )
            // InternalSWI.g:3481:1: ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getProvidedResourcesAssignment_4_3_3()); 
            }
            // InternalSWI.g:3482:1: ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )
            // InternalSWI.g:3482:2: rule__MSwInterface__ProvidedResourcesAssignment_4_3_3
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__MSwInterface__ProvidedResourcesAssignment_4_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getProvidedResourcesAssignment_4_3_3()); 
            }

            }

            // InternalSWI.g:3485:1: ( ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )* )
            // InternalSWI.g:3486:1: ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getProvidedResourcesAssignment_4_3_3()); 
            }
            // InternalSWI.g:3487:1: ( rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40||LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSWI.g:3487:2: rule__MSwInterface__ProvidedResourcesAssignment_4_3_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__MSwInterface__ProvidedResourcesAssignment_4_3_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getProvidedResourcesAssignment_4_3_3()); 
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
    // $ANTLR end "rule__MSwInterface__Group_4_3__3__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_3__4"
    // InternalSWI.g:3498:1: rule__MSwInterface__Group_4_3__4 : rule__MSwInterface__Group_4_3__4__Impl rule__MSwInterface__Group_4_3__5 ;
    public final void rule__MSwInterface__Group_4_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3502:1: ( rule__MSwInterface__Group_4_3__4__Impl rule__MSwInterface__Group_4_3__5 )
            // InternalSWI.g:3503:2: rule__MSwInterface__Group_4_3__4__Impl rule__MSwInterface__Group_4_3__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MSwInterface__Group_4_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_3__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__4"


    // $ANTLR start "rule__MSwInterface__Group_4_3__4__Impl"
    // InternalSWI.g:3510:1: rule__MSwInterface__Group_4_3__4__Impl : ( '}' ) ;
    public final void rule__MSwInterface__Group_4_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3514:1: ( ( '}' ) )
            // InternalSWI.g:3515:1: ( '}' )
            {
            // InternalSWI.g:3515:1: ( '}' )
            // InternalSWI.g:3516:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRightCurlyBracketKeyword_4_3_4()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRightCurlyBracketKeyword_4_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__4__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_3__5"
    // InternalSWI.g:3529:1: rule__MSwInterface__Group_4_3__5 : rule__MSwInterface__Group_4_3__5__Impl ;
    public final void rule__MSwInterface__Group_4_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3533:1: ( rule__MSwInterface__Group_4_3__5__Impl )
            // InternalSWI.g:3534:2: rule__MSwInterface__Group_4_3__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__5"


    // $ANTLR start "rule__MSwInterface__Group_4_3__5__Impl"
    // InternalSWI.g:3540:1: rule__MSwInterface__Group_4_3__5__Impl : ( ';' ) ;
    public final void rule__MSwInterface__Group_4_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3544:1: ( ( ';' ) )
            // InternalSWI.g:3545:1: ( ';' )
            {
            // InternalSWI.g:3545:1: ( ';' )
            // InternalSWI.g:3546:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_3_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_3_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_3__5__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_4__0"
    // InternalSWI.g:3571:1: rule__MSwInterface__Group_4_4__0 : rule__MSwInterface__Group_4_4__0__Impl rule__MSwInterface__Group_4_4__1 ;
    public final void rule__MSwInterface__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3575:1: ( rule__MSwInterface__Group_4_4__0__Impl rule__MSwInterface__Group_4_4__1 )
            // InternalSWI.g:3576:2: rule__MSwInterface__Group_4_4__0__Impl rule__MSwInterface__Group_4_4__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MSwInterface__Group_4_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__0"


    // $ANTLR start "rule__MSwInterface__Group_4_4__0__Impl"
    // InternalSWI.g:3583:1: rule__MSwInterface__Group_4_4__0__Impl : ( 'requires' ) ;
    public final void rule__MSwInterface__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3587:1: ( ( 'requires' ) )
            // InternalSWI.g:3588:1: ( 'requires' )
            {
            // InternalSWI.g:3588:1: ( 'requires' )
            // InternalSWI.g:3589:1: 'requires'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiresKeyword_4_4_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiresKeyword_4_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_4__1"
    // InternalSWI.g:3602:1: rule__MSwInterface__Group_4_4__1 : rule__MSwInterface__Group_4_4__1__Impl rule__MSwInterface__Group_4_4__2 ;
    public final void rule__MSwInterface__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3606:1: ( rule__MSwInterface__Group_4_4__1__Impl rule__MSwInterface__Group_4_4__2 )
            // InternalSWI.g:3607:2: rule__MSwInterface__Group_4_4__1__Impl rule__MSwInterface__Group_4_4__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MSwInterface__Group_4_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__1"


    // $ANTLR start "rule__MSwInterface__Group_4_4__1__Impl"
    // InternalSWI.g:3614:1: rule__MSwInterface__Group_4_4__1__Impl : ( ':=' ) ;
    public final void rule__MSwInterface__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3618:1: ( ( ':=' ) )
            // InternalSWI.g:3619:1: ( ':=' )
            {
            // InternalSWI.g:3619:1: ( ':=' )
            // InternalSWI.g:3620:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_4_1()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_4__2"
    // InternalSWI.g:3633:1: rule__MSwInterface__Group_4_4__2 : rule__MSwInterface__Group_4_4__2__Impl rule__MSwInterface__Group_4_4__3 ;
    public final void rule__MSwInterface__Group_4_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3637:1: ( rule__MSwInterface__Group_4_4__2__Impl rule__MSwInterface__Group_4_4__3 )
            // InternalSWI.g:3638:2: rule__MSwInterface__Group_4_4__2__Impl rule__MSwInterface__Group_4_4__3
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__MSwInterface__Group_4_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__2"


    // $ANTLR start "rule__MSwInterface__Group_4_4__2__Impl"
    // InternalSWI.g:3645:1: rule__MSwInterface__Group_4_4__2__Impl : ( ( rule__MSwInterface__RequiresAssignment_4_4_2 ) ) ;
    public final void rule__MSwInterface__Group_4_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3649:1: ( ( ( rule__MSwInterface__RequiresAssignment_4_4_2 ) ) )
            // InternalSWI.g:3650:1: ( ( rule__MSwInterface__RequiresAssignment_4_4_2 ) )
            {
            // InternalSWI.g:3650:1: ( ( rule__MSwInterface__RequiresAssignment_4_4_2 ) )
            // InternalSWI.g:3651:1: ( rule__MSwInterface__RequiresAssignment_4_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiresAssignment_4_4_2()); 
            }
            // InternalSWI.g:3652:1: ( rule__MSwInterface__RequiresAssignment_4_4_2 )
            // InternalSWI.g:3652:2: rule__MSwInterface__RequiresAssignment_4_4_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__RequiresAssignment_4_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiresAssignment_4_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__2__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_4__3"
    // InternalSWI.g:3662:1: rule__MSwInterface__Group_4_4__3 : rule__MSwInterface__Group_4_4__3__Impl rule__MSwInterface__Group_4_4__4 ;
    public final void rule__MSwInterface__Group_4_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3666:1: ( rule__MSwInterface__Group_4_4__3__Impl rule__MSwInterface__Group_4_4__4 )
            // InternalSWI.g:3667:2: rule__MSwInterface__Group_4_4__3__Impl rule__MSwInterface__Group_4_4__4
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__MSwInterface__Group_4_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__3"


    // $ANTLR start "rule__MSwInterface__Group_4_4__3__Impl"
    // InternalSWI.g:3674:1: rule__MSwInterface__Group_4_4__3__Impl : ( ( rule__MSwInterface__Group_4_4_3__0 )* ) ;
    public final void rule__MSwInterface__Group_4_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3678:1: ( ( ( rule__MSwInterface__Group_4_4_3__0 )* ) )
            // InternalSWI.g:3679:1: ( ( rule__MSwInterface__Group_4_4_3__0 )* )
            {
            // InternalSWI.g:3679:1: ( ( rule__MSwInterface__Group_4_4_3__0 )* )
            // InternalSWI.g:3680:1: ( rule__MSwInterface__Group_4_4_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getGroup_4_4_3()); 
            }
            // InternalSWI.g:3681:1: ( rule__MSwInterface__Group_4_4_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSWI.g:3681:2: rule__MSwInterface__Group_4_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__MSwInterface__Group_4_4_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getGroup_4_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__3__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_4__4"
    // InternalSWI.g:3691:1: rule__MSwInterface__Group_4_4__4 : rule__MSwInterface__Group_4_4__4__Impl ;
    public final void rule__MSwInterface__Group_4_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3695:1: ( rule__MSwInterface__Group_4_4__4__Impl )
            // InternalSWI.g:3696:2: rule__MSwInterface__Group_4_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__4"


    // $ANTLR start "rule__MSwInterface__Group_4_4__4__Impl"
    // InternalSWI.g:3702:1: rule__MSwInterface__Group_4_4__4__Impl : ( ';' ) ;
    public final void rule__MSwInterface__Group_4_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3706:1: ( ( ';' ) )
            // InternalSWI.g:3707:1: ( ';' )
            {
            // InternalSWI.g:3707:1: ( ';' )
            // InternalSWI.g:3708:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_4_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4__4__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_4_3__0"
    // InternalSWI.g:3731:1: rule__MSwInterface__Group_4_4_3__0 : rule__MSwInterface__Group_4_4_3__0__Impl rule__MSwInterface__Group_4_4_3__1 ;
    public final void rule__MSwInterface__Group_4_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3735:1: ( rule__MSwInterface__Group_4_4_3__0__Impl rule__MSwInterface__Group_4_4_3__1 )
            // InternalSWI.g:3736:2: rule__MSwInterface__Group_4_4_3__0__Impl rule__MSwInterface__Group_4_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MSwInterface__Group_4_4_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_4_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4_3__0"


    // $ANTLR start "rule__MSwInterface__Group_4_4_3__0__Impl"
    // InternalSWI.g:3743:1: rule__MSwInterface__Group_4_4_3__0__Impl : ( ',' ) ;
    public final void rule__MSwInterface__Group_4_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3747:1: ( ( ',' ) )
            // InternalSWI.g:3748:1: ( ',' )
            {
            // InternalSWI.g:3748:1: ( ',' )
            // InternalSWI.g:3749:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getCommaKeyword_4_4_3_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getCommaKeyword_4_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4_3__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_4_3__1"
    // InternalSWI.g:3762:1: rule__MSwInterface__Group_4_4_3__1 : rule__MSwInterface__Group_4_4_3__1__Impl ;
    public final void rule__MSwInterface__Group_4_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3766:1: ( rule__MSwInterface__Group_4_4_3__1__Impl )
            // InternalSWI.g:3767:2: rule__MSwInterface__Group_4_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_4_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4_3__1"


    // $ANTLR start "rule__MSwInterface__Group_4_4_3__1__Impl"
    // InternalSWI.g:3773:1: rule__MSwInterface__Group_4_4_3__1__Impl : ( ( rule__MSwInterface__RequiresAssignment_4_4_3_1 ) ) ;
    public final void rule__MSwInterface__Group_4_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3777:1: ( ( ( rule__MSwInterface__RequiresAssignment_4_4_3_1 ) ) )
            // InternalSWI.g:3778:1: ( ( rule__MSwInterface__RequiresAssignment_4_4_3_1 ) )
            {
            // InternalSWI.g:3778:1: ( ( rule__MSwInterface__RequiresAssignment_4_4_3_1 ) )
            // InternalSWI.g:3779:1: ( rule__MSwInterface__RequiresAssignment_4_4_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiresAssignment_4_4_3_1()); 
            }
            // InternalSWI.g:3780:1: ( rule__MSwInterface__RequiresAssignment_4_4_3_1 )
            // InternalSWI.g:3780:2: rule__MSwInterface__RequiresAssignment_4_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__RequiresAssignment_4_4_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiresAssignment_4_4_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_4_3__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_5__0"
    // InternalSWI.g:3794:1: rule__MSwInterface__Group_4_5__0 : rule__MSwInterface__Group_4_5__0__Impl rule__MSwInterface__Group_4_5__1 ;
    public final void rule__MSwInterface__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3798:1: ( rule__MSwInterface__Group_4_5__0__Impl rule__MSwInterface__Group_4_5__1 )
            // InternalSWI.g:3799:2: rule__MSwInterface__Group_4_5__0__Impl rule__MSwInterface__Group_4_5__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__MSwInterface__Group_4_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__0"


    // $ANTLR start "rule__MSwInterface__Group_4_5__0__Impl"
    // InternalSWI.g:3806:1: rule__MSwInterface__Group_4_5__0__Impl : ( 'required' ) ;
    public final void rule__MSwInterface__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3810:1: ( ( 'required' ) )
            // InternalSWI.g:3811:1: ( 'required' )
            {
            // InternalSWI.g:3811:1: ( 'required' )
            // InternalSWI.g:3812:1: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiredKeyword_4_5_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiredKeyword_4_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__0__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_5__1"
    // InternalSWI.g:3825:1: rule__MSwInterface__Group_4_5__1 : rule__MSwInterface__Group_4_5__1__Impl rule__MSwInterface__Group_4_5__2 ;
    public final void rule__MSwInterface__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3829:1: ( rule__MSwInterface__Group_4_5__1__Impl rule__MSwInterface__Group_4_5__2 )
            // InternalSWI.g:3830:2: rule__MSwInterface__Group_4_5__1__Impl rule__MSwInterface__Group_4_5__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MSwInterface__Group_4_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__1"


    // $ANTLR start "rule__MSwInterface__Group_4_5__1__Impl"
    // InternalSWI.g:3837:1: rule__MSwInterface__Group_4_5__1__Impl : ( 'osapi' ) ;
    public final void rule__MSwInterface__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3841:1: ( ( 'osapi' ) )
            // InternalSWI.g:3842:1: ( 'osapi' )
            {
            // InternalSWI.g:3842:1: ( 'osapi' )
            // InternalSWI.g:3843:1: 'osapi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getOsapiKeyword_4_5_1()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getOsapiKeyword_4_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__1__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_5__2"
    // InternalSWI.g:3856:1: rule__MSwInterface__Group_4_5__2 : rule__MSwInterface__Group_4_5__2__Impl rule__MSwInterface__Group_4_5__3 ;
    public final void rule__MSwInterface__Group_4_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3860:1: ( rule__MSwInterface__Group_4_5__2__Impl rule__MSwInterface__Group_4_5__3 )
            // InternalSWI.g:3861:2: rule__MSwInterface__Group_4_5__2__Impl rule__MSwInterface__Group_4_5__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MSwInterface__Group_4_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__2"


    // $ANTLR start "rule__MSwInterface__Group_4_5__2__Impl"
    // InternalSWI.g:3868:1: rule__MSwInterface__Group_4_5__2__Impl : ( ':=' ) ;
    public final void rule__MSwInterface__Group_4_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3872:1: ( ( ':=' ) )
            // InternalSWI.g:3873:1: ( ':=' )
            {
            // InternalSWI.g:3873:1: ( ':=' )
            // InternalSWI.g:3874:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_5_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getColonEqualsSignKeyword_4_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__2__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_5__3"
    // InternalSWI.g:3887:1: rule__MSwInterface__Group_4_5__3 : rule__MSwInterface__Group_4_5__3__Impl rule__MSwInterface__Group_4_5__4 ;
    public final void rule__MSwInterface__Group_4_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3891:1: ( rule__MSwInterface__Group_4_5__3__Impl rule__MSwInterface__Group_4_5__4 )
            // InternalSWI.g:3892:2: rule__MSwInterface__Group_4_5__3__Impl rule__MSwInterface__Group_4_5__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MSwInterface__Group_4_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_5__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__3"


    // $ANTLR start "rule__MSwInterface__Group_4_5__3__Impl"
    // InternalSWI.g:3899:1: rule__MSwInterface__Group_4_5__3__Impl : ( ( rule__MSwInterface__RequiredOSAPIAssignment_4_5_3 ) ) ;
    public final void rule__MSwInterface__Group_4_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3903:1: ( ( ( rule__MSwInterface__RequiredOSAPIAssignment_4_5_3 ) ) )
            // InternalSWI.g:3904:1: ( ( rule__MSwInterface__RequiredOSAPIAssignment_4_5_3 ) )
            {
            // InternalSWI.g:3904:1: ( ( rule__MSwInterface__RequiredOSAPIAssignment_4_5_3 ) )
            // InternalSWI.g:3905:1: ( rule__MSwInterface__RequiredOSAPIAssignment_4_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiredOSAPIAssignment_4_5_3()); 
            }
            // InternalSWI.g:3906:1: ( rule__MSwInterface__RequiredOSAPIAssignment_4_5_3 )
            // InternalSWI.g:3906:2: rule__MSwInterface__RequiredOSAPIAssignment_4_5_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__RequiredOSAPIAssignment_4_5_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiredOSAPIAssignment_4_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__3__Impl"


    // $ANTLR start "rule__MSwInterface__Group_4_5__4"
    // InternalSWI.g:3916:1: rule__MSwInterface__Group_4_5__4 : rule__MSwInterface__Group_4_5__4__Impl ;
    public final void rule__MSwInterface__Group_4_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3920:1: ( rule__MSwInterface__Group_4_5__4__Impl )
            // InternalSWI.g:3921:2: rule__MSwInterface__Group_4_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__Group_4_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__4"


    // $ANTLR start "rule__MSwInterface__Group_4_5__4__Impl"
    // InternalSWI.g:3927:1: rule__MSwInterface__Group_4_5__4__Impl : ( ';' ) ;
    public final void rule__MSwInterface__Group_4_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3931:1: ( ( ';' ) )
            // InternalSWI.g:3932:1: ( ';' )
            {
            // InternalSWI.g:3932:1: ( ';' )
            // InternalSWI.g:3933:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_5_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getSemicolonKeyword_4_5_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__Group_4_5__4__Impl"


    // $ANTLR start "rule__MQuantifiableResource__Group__0"
    // InternalSWI.g:3956:1: rule__MQuantifiableResource__Group__0 : rule__MQuantifiableResource__Group__0__Impl rule__MQuantifiableResource__Group__1 ;
    public final void rule__MQuantifiableResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3960:1: ( rule__MQuantifiableResource__Group__0__Impl rule__MQuantifiableResource__Group__1 )
            // InternalSWI.g:3961:2: rule__MQuantifiableResource__Group__0__Impl rule__MQuantifiableResource__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__MQuantifiableResource__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__0"


    // $ANTLR start "rule__MQuantifiableResource__Group__0__Impl"
    // InternalSWI.g:3968:1: rule__MQuantifiableResource__Group__0__Impl : ( 'quantifiable' ) ;
    public final void rule__MQuantifiableResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3972:1: ( ( 'quantifiable' ) )
            // InternalSWI.g:3973:1: ( 'quantifiable' )
            {
            // InternalSWI.g:3973:1: ( 'quantifiable' )
            // InternalSWI.g:3974:1: 'quantifiable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getQuantifiableKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getQuantifiableKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__0__Impl"


    // $ANTLR start "rule__MQuantifiableResource__Group__1"
    // InternalSWI.g:3987:1: rule__MQuantifiableResource__Group__1 : rule__MQuantifiableResource__Group__1__Impl rule__MQuantifiableResource__Group__2 ;
    public final void rule__MQuantifiableResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:3991:1: ( rule__MQuantifiableResource__Group__1__Impl rule__MQuantifiableResource__Group__2 )
            // InternalSWI.g:3992:2: rule__MQuantifiableResource__Group__1__Impl rule__MQuantifiableResource__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MQuantifiableResource__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__1"


    // $ANTLR start "rule__MQuantifiableResource__Group__1__Impl"
    // InternalSWI.g:3999:1: rule__MQuantifiableResource__Group__1__Impl : ( 'resource' ) ;
    public final void rule__MQuantifiableResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4003:1: ( ( 'resource' ) )
            // InternalSWI.g:4004:1: ( 'resource' )
            {
            // InternalSWI.g:4004:1: ( 'resource' )
            // InternalSWI.g:4005:1: 'resource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getResourceKeyword_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getResourceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__1__Impl"


    // $ANTLR start "rule__MQuantifiableResource__Group__2"
    // InternalSWI.g:4018:1: rule__MQuantifiableResource__Group__2 : rule__MQuantifiableResource__Group__2__Impl rule__MQuantifiableResource__Group__3 ;
    public final void rule__MQuantifiableResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4022:1: ( rule__MQuantifiableResource__Group__2__Impl rule__MQuantifiableResource__Group__3 )
            // InternalSWI.g:4023:2: rule__MQuantifiableResource__Group__2__Impl rule__MQuantifiableResource__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__MQuantifiableResource__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__2"


    // $ANTLR start "rule__MQuantifiableResource__Group__2__Impl"
    // InternalSWI.g:4030:1: rule__MQuantifiableResource__Group__2__Impl : ( ( rule__MQuantifiableResource__NameAssignment_2 ) ) ;
    public final void rule__MQuantifiableResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4034:1: ( ( ( rule__MQuantifiableResource__NameAssignment_2 ) ) )
            // InternalSWI.g:4035:1: ( ( rule__MQuantifiableResource__NameAssignment_2 ) )
            {
            // InternalSWI.g:4035:1: ( ( rule__MQuantifiableResource__NameAssignment_2 ) )
            // InternalSWI.g:4036:1: ( rule__MQuantifiableResource__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getNameAssignment_2()); 
            }
            // InternalSWI.g:4037:1: ( rule__MQuantifiableResource__NameAssignment_2 )
            // InternalSWI.g:4037:2: rule__MQuantifiableResource__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__2__Impl"


    // $ANTLR start "rule__MQuantifiableResource__Group__3"
    // InternalSWI.g:4047:1: rule__MQuantifiableResource__Group__3 : rule__MQuantifiableResource__Group__3__Impl rule__MQuantifiableResource__Group__4 ;
    public final void rule__MQuantifiableResource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4051:1: ( rule__MQuantifiableResource__Group__3__Impl rule__MQuantifiableResource__Group__4 )
            // InternalSWI.g:4052:2: rule__MQuantifiableResource__Group__3__Impl rule__MQuantifiableResource__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MQuantifiableResource__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__3"


    // $ANTLR start "rule__MQuantifiableResource__Group__3__Impl"
    // InternalSWI.g:4059:1: rule__MQuantifiableResource__Group__3__Impl : ( 'step' ) ;
    public final void rule__MQuantifiableResource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4063:1: ( ( 'step' ) )
            // InternalSWI.g:4064:1: ( 'step' )
            {
            // InternalSWI.g:4064:1: ( 'step' )
            // InternalSWI.g:4065:1: 'step'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getStepKeyword_3()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getStepKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__3__Impl"


    // $ANTLR start "rule__MQuantifiableResource__Group__4"
    // InternalSWI.g:4078:1: rule__MQuantifiableResource__Group__4 : rule__MQuantifiableResource__Group__4__Impl rule__MQuantifiableResource__Group__5 ;
    public final void rule__MQuantifiableResource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4082:1: ( rule__MQuantifiableResource__Group__4__Impl rule__MQuantifiableResource__Group__5 )
            // InternalSWI.g:4083:2: rule__MQuantifiableResource__Group__4__Impl rule__MQuantifiableResource__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__MQuantifiableResource__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__4"


    // $ANTLR start "rule__MQuantifiableResource__Group__4__Impl"
    // InternalSWI.g:4090:1: rule__MQuantifiableResource__Group__4__Impl : ( ( rule__MQuantifiableResource__LowerBoundAssignment_4 ) ) ;
    public final void rule__MQuantifiableResource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4094:1: ( ( ( rule__MQuantifiableResource__LowerBoundAssignment_4 ) ) )
            // InternalSWI.g:4095:1: ( ( rule__MQuantifiableResource__LowerBoundAssignment_4 ) )
            {
            // InternalSWI.g:4095:1: ( ( rule__MQuantifiableResource__LowerBoundAssignment_4 ) )
            // InternalSWI.g:4096:1: ( rule__MQuantifiableResource__LowerBoundAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundAssignment_4()); 
            }
            // InternalSWI.g:4097:1: ( rule__MQuantifiableResource__LowerBoundAssignment_4 )
            // InternalSWI.g:4097:2: rule__MQuantifiableResource__LowerBoundAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__LowerBoundAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__4__Impl"


    // $ANTLR start "rule__MQuantifiableResource__Group__5"
    // InternalSWI.g:4107:1: rule__MQuantifiableResource__Group__5 : rule__MQuantifiableResource__Group__5__Impl rule__MQuantifiableResource__Group__6 ;
    public final void rule__MQuantifiableResource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4111:1: ( rule__MQuantifiableResource__Group__5__Impl rule__MQuantifiableResource__Group__6 )
            // InternalSWI.g:4112:2: rule__MQuantifiableResource__Group__5__Impl rule__MQuantifiableResource__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MQuantifiableResource__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__5"


    // $ANTLR start "rule__MQuantifiableResource__Group__5__Impl"
    // InternalSWI.g:4119:1: rule__MQuantifiableResource__Group__5__Impl : ( 'to' ) ;
    public final void rule__MQuantifiableResource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4123:1: ( ( 'to' ) )
            // InternalSWI.g:4124:1: ( 'to' )
            {
            // InternalSWI.g:4124:1: ( 'to' )
            // InternalSWI.g:4125:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getToKeyword_5()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getToKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__5__Impl"


    // $ANTLR start "rule__MQuantifiableResource__Group__6"
    // InternalSWI.g:4138:1: rule__MQuantifiableResource__Group__6 : rule__MQuantifiableResource__Group__6__Impl rule__MQuantifiableResource__Group__7 ;
    public final void rule__MQuantifiableResource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4142:1: ( rule__MQuantifiableResource__Group__6__Impl rule__MQuantifiableResource__Group__7 )
            // InternalSWI.g:4143:2: rule__MQuantifiableResource__Group__6__Impl rule__MQuantifiableResource__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MQuantifiableResource__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__6"


    // $ANTLR start "rule__MQuantifiableResource__Group__6__Impl"
    // InternalSWI.g:4150:1: rule__MQuantifiableResource__Group__6__Impl : ( ( rule__MQuantifiableResource__UpperBoundAssignment_6 ) ) ;
    public final void rule__MQuantifiableResource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4154:1: ( ( ( rule__MQuantifiableResource__UpperBoundAssignment_6 ) ) )
            // InternalSWI.g:4155:1: ( ( rule__MQuantifiableResource__UpperBoundAssignment_6 ) )
            {
            // InternalSWI.g:4155:1: ( ( rule__MQuantifiableResource__UpperBoundAssignment_6 ) )
            // InternalSWI.g:4156:1: ( rule__MQuantifiableResource__UpperBoundAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundAssignment_6()); 
            }
            // InternalSWI.g:4157:1: ( rule__MQuantifiableResource__UpperBoundAssignment_6 )
            // InternalSWI.g:4157:2: rule__MQuantifiableResource__UpperBoundAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__UpperBoundAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__6__Impl"


    // $ANTLR start "rule__MQuantifiableResource__Group__7"
    // InternalSWI.g:4167:1: rule__MQuantifiableResource__Group__7 : rule__MQuantifiableResource__Group__7__Impl ;
    public final void rule__MQuantifiableResource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4171:1: ( rule__MQuantifiableResource__Group__7__Impl )
            // InternalSWI.g:4172:2: rule__MQuantifiableResource__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MQuantifiableResource__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__7"


    // $ANTLR start "rule__MQuantifiableResource__Group__7__Impl"
    // InternalSWI.g:4178:1: rule__MQuantifiableResource__Group__7__Impl : ( ';' ) ;
    public final void rule__MQuantifiableResource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4182:1: ( ( ';' ) )
            // InternalSWI.g:4183:1: ( ';' )
            {
            // InternalSWI.g:4183:1: ( ';' )
            // InternalSWI.g:4184:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getSemicolonKeyword_7()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__Group__7__Impl"


    // $ANTLR start "rule__MInstantiableResource__Group__0"
    // InternalSWI.g:4213:1: rule__MInstantiableResource__Group__0 : rule__MInstantiableResource__Group__0__Impl rule__MInstantiableResource__Group__1 ;
    public final void rule__MInstantiableResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4217:1: ( rule__MInstantiableResource__Group__0__Impl rule__MInstantiableResource__Group__1 )
            // InternalSWI.g:4218:2: rule__MInstantiableResource__Group__0__Impl rule__MInstantiableResource__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__MInstantiableResource__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MInstantiableResource__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__0"


    // $ANTLR start "rule__MInstantiableResource__Group__0__Impl"
    // InternalSWI.g:4225:1: rule__MInstantiableResource__Group__0__Impl : ( 'instantiable' ) ;
    public final void rule__MInstantiableResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4229:1: ( ( 'instantiable' ) )
            // InternalSWI.g:4230:1: ( 'instantiable' )
            {
            // InternalSWI.g:4230:1: ( 'instantiable' )
            // InternalSWI.g:4231:1: 'instantiable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getInstantiableKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getInstantiableKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__0__Impl"


    // $ANTLR start "rule__MInstantiableResource__Group__1"
    // InternalSWI.g:4244:1: rule__MInstantiableResource__Group__1 : rule__MInstantiableResource__Group__1__Impl rule__MInstantiableResource__Group__2 ;
    public final void rule__MInstantiableResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4248:1: ( rule__MInstantiableResource__Group__1__Impl rule__MInstantiableResource__Group__2 )
            // InternalSWI.g:4249:2: rule__MInstantiableResource__Group__1__Impl rule__MInstantiableResource__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MInstantiableResource__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MInstantiableResource__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__1"


    // $ANTLR start "rule__MInstantiableResource__Group__1__Impl"
    // InternalSWI.g:4256:1: rule__MInstantiableResource__Group__1__Impl : ( 'resource' ) ;
    public final void rule__MInstantiableResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4260:1: ( ( 'resource' ) )
            // InternalSWI.g:4261:1: ( 'resource' )
            {
            // InternalSWI.g:4261:1: ( 'resource' )
            // InternalSWI.g:4262:1: 'resource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getResourceKeyword_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getResourceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__1__Impl"


    // $ANTLR start "rule__MInstantiableResource__Group__2"
    // InternalSWI.g:4275:1: rule__MInstantiableResource__Group__2 : rule__MInstantiableResource__Group__2__Impl rule__MInstantiableResource__Group__3 ;
    public final void rule__MInstantiableResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4279:1: ( rule__MInstantiableResource__Group__2__Impl rule__MInstantiableResource__Group__3 )
            // InternalSWI.g:4280:2: rule__MInstantiableResource__Group__2__Impl rule__MInstantiableResource__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__MInstantiableResource__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MInstantiableResource__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__2"


    // $ANTLR start "rule__MInstantiableResource__Group__2__Impl"
    // InternalSWI.g:4287:1: rule__MInstantiableResource__Group__2__Impl : ( ( rule__MInstantiableResource__NameAssignment_2 ) ) ;
    public final void rule__MInstantiableResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4291:1: ( ( ( rule__MInstantiableResource__NameAssignment_2 ) ) )
            // InternalSWI.g:4292:1: ( ( rule__MInstantiableResource__NameAssignment_2 ) )
            {
            // InternalSWI.g:4292:1: ( ( rule__MInstantiableResource__NameAssignment_2 ) )
            // InternalSWI.g:4293:1: ( rule__MInstantiableResource__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getNameAssignment_2()); 
            }
            // InternalSWI.g:4294:1: ( rule__MInstantiableResource__NameAssignment_2 )
            // InternalSWI.g:4294:2: rule__MInstantiableResource__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MInstantiableResource__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__2__Impl"


    // $ANTLR start "rule__MInstantiableResource__Group__3"
    // InternalSWI.g:4304:1: rule__MInstantiableResource__Group__3 : rule__MInstantiableResource__Group__3__Impl rule__MInstantiableResource__Group__4 ;
    public final void rule__MInstantiableResource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4308:1: ( rule__MInstantiableResource__Group__3__Impl rule__MInstantiableResource__Group__4 )
            // InternalSWI.g:4309:2: rule__MInstantiableResource__Group__3__Impl rule__MInstantiableResource__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__MInstantiableResource__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MInstantiableResource__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__3"


    // $ANTLR start "rule__MInstantiableResource__Group__3__Impl"
    // InternalSWI.g:4316:1: rule__MInstantiableResource__Group__3__Impl : ( '{' ) ;
    public final void rule__MInstantiableResource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4320:1: ( ( '{' ) )
            // InternalSWI.g:4321:1: ( '{' )
            {
            // InternalSWI.g:4321:1: ( '{' )
            // InternalSWI.g:4322:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__3__Impl"


    // $ANTLR start "rule__MInstantiableResource__Group__4"
    // InternalSWI.g:4335:1: rule__MInstantiableResource__Group__4 : rule__MInstantiableResource__Group__4__Impl rule__MInstantiableResource__Group__5 ;
    public final void rule__MInstantiableResource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4339:1: ( rule__MInstantiableResource__Group__4__Impl rule__MInstantiableResource__Group__5 )
            // InternalSWI.g:4340:2: rule__MInstantiableResource__Group__4__Impl rule__MInstantiableResource__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__MInstantiableResource__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MInstantiableResource__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__4"


    // $ANTLR start "rule__MInstantiableResource__Group__4__Impl"
    // InternalSWI.g:4347:1: rule__MInstantiableResource__Group__4__Impl : ( ( rule__MInstantiableResource__ParametersAssignment_4 )* ) ;
    public final void rule__MInstantiableResource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4351:1: ( ( ( rule__MInstantiableResource__ParametersAssignment_4 )* ) )
            // InternalSWI.g:4352:1: ( ( rule__MInstantiableResource__ParametersAssignment_4 )* )
            {
            // InternalSWI.g:4352:1: ( ( rule__MInstantiableResource__ParametersAssignment_4 )* )
            // InternalSWI.g:4353:1: ( rule__MInstantiableResource__ParametersAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getParametersAssignment_4()); 
            }
            // InternalSWI.g:4354:1: ( rule__MInstantiableResource__ParametersAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==45||(LA25_0>=47 && LA25_0<=48)||(LA25_0>=50 && LA25_0<=51)||LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSWI.g:4354:2: rule__MInstantiableResource__ParametersAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__MInstantiableResource__ParametersAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getParametersAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__4__Impl"


    // $ANTLR start "rule__MInstantiableResource__Group__5"
    // InternalSWI.g:4364:1: rule__MInstantiableResource__Group__5 : rule__MInstantiableResource__Group__5__Impl rule__MInstantiableResource__Group__6 ;
    public final void rule__MInstantiableResource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4368:1: ( rule__MInstantiableResource__Group__5__Impl rule__MInstantiableResource__Group__6 )
            // InternalSWI.g:4369:2: rule__MInstantiableResource__Group__5__Impl rule__MInstantiableResource__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MInstantiableResource__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MInstantiableResource__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__5"


    // $ANTLR start "rule__MInstantiableResource__Group__5__Impl"
    // InternalSWI.g:4376:1: rule__MInstantiableResource__Group__5__Impl : ( '}' ) ;
    public final void rule__MInstantiableResource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4380:1: ( ( '}' ) )
            // InternalSWI.g:4381:1: ( '}' )
            {
            // InternalSWI.g:4381:1: ( '}' )
            // InternalSWI.g:4382:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__5__Impl"


    // $ANTLR start "rule__MInstantiableResource__Group__6"
    // InternalSWI.g:4395:1: rule__MInstantiableResource__Group__6 : rule__MInstantiableResource__Group__6__Impl ;
    public final void rule__MInstantiableResource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4399:1: ( rule__MInstantiableResource__Group__6__Impl )
            // InternalSWI.g:4400:2: rule__MInstantiableResource__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MInstantiableResource__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__6"


    // $ANTLR start "rule__MInstantiableResource__Group__6__Impl"
    // InternalSWI.g:4406:1: rule__MInstantiableResource__Group__6__Impl : ( ';' ) ;
    public final void rule__MInstantiableResource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4410:1: ( ( ';' ) )
            // InternalSWI.g:4411:1: ( ';' )
            {
            // InternalSWI.g:4411:1: ( ';' )
            // InternalSWI.g:4412:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getSemicolonKeyword_6()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__Group__6__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__0"
    // InternalSWI.g:4439:1: rule__MIntegerParameterSingleExpression__Group__0 : rule__MIntegerParameterSingleExpression__Group__0__Impl rule__MIntegerParameterSingleExpression__Group__1 ;
    public final void rule__MIntegerParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4443:1: ( rule__MIntegerParameterSingleExpression__Group__0__Impl rule__MIntegerParameterSingleExpression__Group__1 )
            // InternalSWI.g:4444:2: rule__MIntegerParameterSingleExpression__Group__0__Impl rule__MIntegerParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__MIntegerParameterSingleExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__0"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__0__Impl"
    // InternalSWI.g:4451:1: rule__MIntegerParameterSingleExpression__Group__0__Impl : ( ( rule__MIntegerParameterSingleExpression__ConstantAssignment_0 )? ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4455:1: ( ( ( rule__MIntegerParameterSingleExpression__ConstantAssignment_0 )? ) )
            // InternalSWI.g:4456:1: ( ( rule__MIntegerParameterSingleExpression__ConstantAssignment_0 )? )
            {
            // InternalSWI.g:4456:1: ( ( rule__MIntegerParameterSingleExpression__ConstantAssignment_0 )? )
            // InternalSWI.g:4457:1: ( rule__MIntegerParameterSingleExpression__ConstantAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }
            // InternalSWI.g:4458:1: ( rule__MIntegerParameterSingleExpression__ConstantAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSWI.g:4458:2: rule__MIntegerParameterSingleExpression__ConstantAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MIntegerParameterSingleExpression__ConstantAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__0__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__1"
    // InternalSWI.g:4468:1: rule__MIntegerParameterSingleExpression__Group__1 : rule__MIntegerParameterSingleExpression__Group__1__Impl rule__MIntegerParameterSingleExpression__Group__2 ;
    public final void rule__MIntegerParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4472:1: ( rule__MIntegerParameterSingleExpression__Group__1__Impl rule__MIntegerParameterSingleExpression__Group__2 )
            // InternalSWI.g:4473:2: rule__MIntegerParameterSingleExpression__Group__1__Impl rule__MIntegerParameterSingleExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MIntegerParameterSingleExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__1"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__1__Impl"
    // InternalSWI.g:4480:1: rule__MIntegerParameterSingleExpression__Group__1__Impl : ( 'integer' ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4484:1: ( ( 'integer' ) )
            // InternalSWI.g:4485:1: ( 'integer' )
            {
            // InternalSWI.g:4485:1: ( 'integer' )
            // InternalSWI.g:4486:1: 'integer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__1__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__2"
    // InternalSWI.g:4499:1: rule__MIntegerParameterSingleExpression__Group__2 : rule__MIntegerParameterSingleExpression__Group__2__Impl rule__MIntegerParameterSingleExpression__Group__3 ;
    public final void rule__MIntegerParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4503:1: ( rule__MIntegerParameterSingleExpression__Group__2__Impl rule__MIntegerParameterSingleExpression__Group__3 )
            // InternalSWI.g:4504:2: rule__MIntegerParameterSingleExpression__Group__2__Impl rule__MIntegerParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MIntegerParameterSingleExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__2"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__2__Impl"
    // InternalSWI.g:4511:1: rule__MIntegerParameterSingleExpression__Group__2__Impl : ( ( rule__MIntegerParameterSingleExpression__NameAssignment_2 ) ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4515:1: ( ( ( rule__MIntegerParameterSingleExpression__NameAssignment_2 ) ) )
            // InternalSWI.g:4516:1: ( ( rule__MIntegerParameterSingleExpression__NameAssignment_2 ) )
            {
            // InternalSWI.g:4516:1: ( ( rule__MIntegerParameterSingleExpression__NameAssignment_2 ) )
            // InternalSWI.g:4517:1: ( rule__MIntegerParameterSingleExpression__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_2()); 
            }
            // InternalSWI.g:4518:1: ( rule__MIntegerParameterSingleExpression__NameAssignment_2 )
            // InternalSWI.g:4518:2: rule__MIntegerParameterSingleExpression__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__2__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__3"
    // InternalSWI.g:4528:1: rule__MIntegerParameterSingleExpression__Group__3 : rule__MIntegerParameterSingleExpression__Group__3__Impl rule__MIntegerParameterSingleExpression__Group__4 ;
    public final void rule__MIntegerParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4532:1: ( rule__MIntegerParameterSingleExpression__Group__3__Impl rule__MIntegerParameterSingleExpression__Group__4 )
            // InternalSWI.g:4533:2: rule__MIntegerParameterSingleExpression__Group__3__Impl rule__MIntegerParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MIntegerParameterSingleExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__3"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__3__Impl"
    // InternalSWI.g:4540:1: rule__MIntegerParameterSingleExpression__Group__3__Impl : ( ':=' ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4544:1: ( ( ':=' ) )
            // InternalSWI.g:4545:1: ( ':=' )
            {
            // InternalSWI.g:4545:1: ( ':=' )
            // InternalSWI.g:4546:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__3__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__4"
    // InternalSWI.g:4559:1: rule__MIntegerParameterSingleExpression__Group__4 : rule__MIntegerParameterSingleExpression__Group__4__Impl rule__MIntegerParameterSingleExpression__Group__5 ;
    public final void rule__MIntegerParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4563:1: ( rule__MIntegerParameterSingleExpression__Group__4__Impl rule__MIntegerParameterSingleExpression__Group__5 )
            // InternalSWI.g:4564:2: rule__MIntegerParameterSingleExpression__Group__4__Impl rule__MIntegerParameterSingleExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__MIntegerParameterSingleExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__4"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__4__Impl"
    // InternalSWI.g:4571:1: rule__MIntegerParameterSingleExpression__Group__4__Impl : ( ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4 ) ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4575:1: ( ( ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4 ) ) )
            // InternalSWI.g:4576:1: ( ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4 ) )
            {
            // InternalSWI.g:4576:1: ( ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4 ) )
            // InternalSWI.g:4577:1: ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }
            // InternalSWI.g:4578:1: ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4 )
            // InternalSWI.g:4578:2: rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__4__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__5"
    // InternalSWI.g:4588:1: rule__MIntegerParameterSingleExpression__Group__5 : rule__MIntegerParameterSingleExpression__Group__5__Impl rule__MIntegerParameterSingleExpression__Group__6 ;
    public final void rule__MIntegerParameterSingleExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4592:1: ( rule__MIntegerParameterSingleExpression__Group__5__Impl rule__MIntegerParameterSingleExpression__Group__6 )
            // InternalSWI.g:4593:2: rule__MIntegerParameterSingleExpression__Group__5__Impl rule__MIntegerParameterSingleExpression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__MIntegerParameterSingleExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__5"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__5__Impl"
    // InternalSWI.g:4600:1: rule__MIntegerParameterSingleExpression__Group__5__Impl : ( ( rule__MIntegerParameterSingleExpression__Group_5__0 )? ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4604:1: ( ( ( rule__MIntegerParameterSingleExpression__Group_5__0 )? ) )
            // InternalSWI.g:4605:1: ( ( rule__MIntegerParameterSingleExpression__Group_5__0 )? )
            {
            // InternalSWI.g:4605:1: ( ( rule__MIntegerParameterSingleExpression__Group_5__0 )? )
            // InternalSWI.g:4606:1: ( rule__MIntegerParameterSingleExpression__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5()); 
            }
            // InternalSWI.g:4607:1: ( rule__MIntegerParameterSingleExpression__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSWI.g:4607:2: rule__MIntegerParameterSingleExpression__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MIntegerParameterSingleExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__5__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__6"
    // InternalSWI.g:4617:1: rule__MIntegerParameterSingleExpression__Group__6 : rule__MIntegerParameterSingleExpression__Group__6__Impl ;
    public final void rule__MIntegerParameterSingleExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4621:1: ( rule__MIntegerParameterSingleExpression__Group__6__Impl )
            // InternalSWI.g:4622:2: rule__MIntegerParameterSingleExpression__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__6"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group__6__Impl"
    // InternalSWI.g:4628:1: rule__MIntegerParameterSingleExpression__Group__6__Impl : ( ';' ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4632:1: ( ( ';' ) )
            // InternalSWI.g:4633:1: ( ';' )
            {
            // InternalSWI.g:4633:1: ( ';' )
            // InternalSWI.g:4634:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_6()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group__6__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group_5__0"
    // InternalSWI.g:4661:1: rule__MIntegerParameterSingleExpression__Group_5__0 : rule__MIntegerParameterSingleExpression__Group_5__0__Impl rule__MIntegerParameterSingleExpression__Group_5__1 ;
    public final void rule__MIntegerParameterSingleExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4665:1: ( rule__MIntegerParameterSingleExpression__Group_5__0__Impl rule__MIntegerParameterSingleExpression__Group_5__1 )
            // InternalSWI.g:4666:2: rule__MIntegerParameterSingleExpression__Group_5__0__Impl rule__MIntegerParameterSingleExpression__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__MIntegerParameterSingleExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group_5__0"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group_5__0__Impl"
    // InternalSWI.g:4673:1: rule__MIntegerParameterSingleExpression__Group_5__0__Impl : ( 'range' ) ;
    public final void rule__MIntegerParameterSingleExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4677:1: ( ( 'range' ) )
            // InternalSWI.g:4678:1: ( 'range' )
            {
            // InternalSWI.g:4678:1: ( 'range' )
            // InternalSWI.g:4679:1: 'range'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group_5__0__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group_5__1"
    // InternalSWI.g:4692:1: rule__MIntegerParameterSingleExpression__Group_5__1 : rule__MIntegerParameterSingleExpression__Group_5__1__Impl ;
    public final void rule__MIntegerParameterSingleExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4696:1: ( rule__MIntegerParameterSingleExpression__Group_5__1__Impl )
            // InternalSWI.g:4697:2: rule__MIntegerParameterSingleExpression__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group_5__1"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group_5__1__Impl"
    // InternalSWI.g:4703:1: rule__MIntegerParameterSingleExpression__Group_5__1__Impl : ( ( rule__MIntegerParameterSingleExpression__RangeAssignment_5_1 ) ) ;
    public final void rule__MIntegerParameterSingleExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4707:1: ( ( ( rule__MIntegerParameterSingleExpression__RangeAssignment_5_1 ) ) )
            // InternalSWI.g:4708:1: ( ( rule__MIntegerParameterSingleExpression__RangeAssignment_5_1 ) )
            {
            // InternalSWI.g:4708:1: ( ( rule__MIntegerParameterSingleExpression__RangeAssignment_5_1 ) )
            // InternalSWI.g:4709:1: ( rule__MIntegerParameterSingleExpression__RangeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_5_1()); 
            }
            // InternalSWI.g:4710:1: ( rule__MIntegerParameterSingleExpression__RangeAssignment_5_1 )
            // InternalSWI.g:4710:2: rule__MIntegerParameterSingleExpression__RangeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__RangeAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group_5__1__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__0"
    // InternalSWI.g:4724:1: rule__MEnumParameterDefinition__Group__0 : rule__MEnumParameterDefinition__Group__0__Impl rule__MEnumParameterDefinition__Group__1 ;
    public final void rule__MEnumParameterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4728:1: ( rule__MEnumParameterDefinition__Group__0__Impl rule__MEnumParameterDefinition__Group__1 )
            // InternalSWI.g:4729:2: rule__MEnumParameterDefinition__Group__0__Impl rule__MEnumParameterDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__MEnumParameterDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__0"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__0__Impl"
    // InternalSWI.g:4736:1: rule__MEnumParameterDefinition__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParameterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4740:1: ( ( () ) )
            // InternalSWI.g:4741:1: ( () )
            {
            // InternalSWI.g:4741:1: ( () )
            // InternalSWI.g:4742:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0()); 
            }
            // InternalSWI.g:4743:1: ()
            // InternalSWI.g:4745:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__0__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__1"
    // InternalSWI.g:4755:1: rule__MEnumParameterDefinition__Group__1 : rule__MEnumParameterDefinition__Group__1__Impl rule__MEnumParameterDefinition__Group__2 ;
    public final void rule__MEnumParameterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4759:1: ( rule__MEnumParameterDefinition__Group__1__Impl rule__MEnumParameterDefinition__Group__2 )
            // InternalSWI.g:4760:2: rule__MEnumParameterDefinition__Group__1__Impl rule__MEnumParameterDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MEnumParameterDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__1"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__1__Impl"
    // InternalSWI.g:4767:1: rule__MEnumParameterDefinition__Group__1__Impl : ( 'enum' ) ;
    public final void rule__MEnumParameterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4771:1: ( ( 'enum' ) )
            // InternalSWI.g:4772:1: ( 'enum' )
            {
            // InternalSWI.g:4772:1: ( 'enum' )
            // InternalSWI.g:4773:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__1__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__2"
    // InternalSWI.g:4786:1: rule__MEnumParameterDefinition__Group__2 : rule__MEnumParameterDefinition__Group__2__Impl rule__MEnumParameterDefinition__Group__3 ;
    public final void rule__MEnumParameterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4790:1: ( rule__MEnumParameterDefinition__Group__2__Impl rule__MEnumParameterDefinition__Group__3 )
            // InternalSWI.g:4791:2: rule__MEnumParameterDefinition__Group__2__Impl rule__MEnumParameterDefinition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__MEnumParameterDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__2"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__2__Impl"
    // InternalSWI.g:4798:1: rule__MEnumParameterDefinition__Group__2__Impl : ( ( rule__MEnumParameterDefinition__NameAssignment_2 ) ) ;
    public final void rule__MEnumParameterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4802:1: ( ( ( rule__MEnumParameterDefinition__NameAssignment_2 ) ) )
            // InternalSWI.g:4803:1: ( ( rule__MEnumParameterDefinition__NameAssignment_2 ) )
            {
            // InternalSWI.g:4803:1: ( ( rule__MEnumParameterDefinition__NameAssignment_2 ) )
            // InternalSWI.g:4804:1: ( rule__MEnumParameterDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalSWI.g:4805:1: ( rule__MEnumParameterDefinition__NameAssignment_2 )
            // InternalSWI.g:4805:2: rule__MEnumParameterDefinition__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__2__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__3"
    // InternalSWI.g:4815:1: rule__MEnumParameterDefinition__Group__3 : rule__MEnumParameterDefinition__Group__3__Impl rule__MEnumParameterDefinition__Group__4 ;
    public final void rule__MEnumParameterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4819:1: ( rule__MEnumParameterDefinition__Group__3__Impl rule__MEnumParameterDefinition__Group__4 )
            // InternalSWI.g:4820:2: rule__MEnumParameterDefinition__Group__3__Impl rule__MEnumParameterDefinition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MEnumParameterDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__3"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__3__Impl"
    // InternalSWI.g:4827:1: rule__MEnumParameterDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__MEnumParameterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4831:1: ( ( '{' ) )
            // InternalSWI.g:4832:1: ( '{' )
            {
            // InternalSWI.g:4832:1: ( '{' )
            // InternalSWI.g:4833:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__3__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__4"
    // InternalSWI.g:4846:1: rule__MEnumParameterDefinition__Group__4 : rule__MEnumParameterDefinition__Group__4__Impl rule__MEnumParameterDefinition__Group__5 ;
    public final void rule__MEnumParameterDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4850:1: ( rule__MEnumParameterDefinition__Group__4__Impl rule__MEnumParameterDefinition__Group__5 )
            // InternalSWI.g:4851:2: rule__MEnumParameterDefinition__Group__4__Impl rule__MEnumParameterDefinition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__MEnumParameterDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__4"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__4__Impl"
    // InternalSWI.g:4858:1: rule__MEnumParameterDefinition__Group__4__Impl : ( ( rule__MEnumParameterDefinition__LiteralsAssignment_4 ) ) ;
    public final void rule__MEnumParameterDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4862:1: ( ( ( rule__MEnumParameterDefinition__LiteralsAssignment_4 ) ) )
            // InternalSWI.g:4863:1: ( ( rule__MEnumParameterDefinition__LiteralsAssignment_4 ) )
            {
            // InternalSWI.g:4863:1: ( ( rule__MEnumParameterDefinition__LiteralsAssignment_4 ) )
            // InternalSWI.g:4864:1: ( rule__MEnumParameterDefinition__LiteralsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4()); 
            }
            // InternalSWI.g:4865:1: ( rule__MEnumParameterDefinition__LiteralsAssignment_4 )
            // InternalSWI.g:4865:2: rule__MEnumParameterDefinition__LiteralsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__LiteralsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__4__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__5"
    // InternalSWI.g:4875:1: rule__MEnumParameterDefinition__Group__5 : rule__MEnumParameterDefinition__Group__5__Impl rule__MEnumParameterDefinition__Group__6 ;
    public final void rule__MEnumParameterDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4879:1: ( rule__MEnumParameterDefinition__Group__5__Impl rule__MEnumParameterDefinition__Group__6 )
            // InternalSWI.g:4880:2: rule__MEnumParameterDefinition__Group__5__Impl rule__MEnumParameterDefinition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__MEnumParameterDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__5"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__5__Impl"
    // InternalSWI.g:4887:1: rule__MEnumParameterDefinition__Group__5__Impl : ( ( rule__MEnumParameterDefinition__Group_5__0 )* ) ;
    public final void rule__MEnumParameterDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4891:1: ( ( ( rule__MEnumParameterDefinition__Group_5__0 )* ) )
            // InternalSWI.g:4892:1: ( ( rule__MEnumParameterDefinition__Group_5__0 )* )
            {
            // InternalSWI.g:4892:1: ( ( rule__MEnumParameterDefinition__Group_5__0 )* )
            // InternalSWI.g:4893:1: ( rule__MEnumParameterDefinition__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5()); 
            }
            // InternalSWI.g:4894:1: ( rule__MEnumParameterDefinition__Group_5__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSWI.g:4894:2: rule__MEnumParameterDefinition__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__MEnumParameterDefinition__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__5__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__6"
    // InternalSWI.g:4904:1: rule__MEnumParameterDefinition__Group__6 : rule__MEnumParameterDefinition__Group__6__Impl rule__MEnumParameterDefinition__Group__7 ;
    public final void rule__MEnumParameterDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4908:1: ( rule__MEnumParameterDefinition__Group__6__Impl rule__MEnumParameterDefinition__Group__7 )
            // InternalSWI.g:4909:2: rule__MEnumParameterDefinition__Group__6__Impl rule__MEnumParameterDefinition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MEnumParameterDefinition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__6"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__6__Impl"
    // InternalSWI.g:4916:1: rule__MEnumParameterDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__MEnumParameterDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4920:1: ( ( '}' ) )
            // InternalSWI.g:4921:1: ( '}' )
            {
            // InternalSWI.g:4921:1: ( '}' )
            // InternalSWI.g:4922:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__6__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__7"
    // InternalSWI.g:4935:1: rule__MEnumParameterDefinition__Group__7 : rule__MEnumParameterDefinition__Group__7__Impl ;
    public final void rule__MEnumParameterDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4939:1: ( rule__MEnumParameterDefinition__Group__7__Impl )
            // InternalSWI.g:4940:2: rule__MEnumParameterDefinition__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__7"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__7__Impl"
    // InternalSWI.g:4946:1: rule__MEnumParameterDefinition__Group__7__Impl : ( ';' ) ;
    public final void rule__MEnumParameterDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4950:1: ( ( ';' ) )
            // InternalSWI.g:4951:1: ( ';' )
            {
            // InternalSWI.g:4951:1: ( ';' )
            // InternalSWI.g:4952:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_7()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group__7__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group_5__0"
    // InternalSWI.g:4981:1: rule__MEnumParameterDefinition__Group_5__0 : rule__MEnumParameterDefinition__Group_5__0__Impl rule__MEnumParameterDefinition__Group_5__1 ;
    public final void rule__MEnumParameterDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4985:1: ( rule__MEnumParameterDefinition__Group_5__0__Impl rule__MEnumParameterDefinition__Group_5__1 )
            // InternalSWI.g:4986:2: rule__MEnumParameterDefinition__Group_5__0__Impl rule__MEnumParameterDefinition__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MEnumParameterDefinition__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group_5__0"


    // $ANTLR start "rule__MEnumParameterDefinition__Group_5__0__Impl"
    // InternalSWI.g:4993:1: rule__MEnumParameterDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__MEnumParameterDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:4997:1: ( ( ',' ) )
            // InternalSWI.g:4998:1: ( ',' )
            {
            // InternalSWI.g:4998:1: ( ',' )
            // InternalSWI.g:4999:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group_5__1"
    // InternalSWI.g:5012:1: rule__MEnumParameterDefinition__Group_5__1 : rule__MEnumParameterDefinition__Group_5__1__Impl ;
    public final void rule__MEnumParameterDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5016:1: ( rule__MEnumParameterDefinition__Group_5__1__Impl )
            // InternalSWI.g:5017:2: rule__MEnumParameterDefinition__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group_5__1"


    // $ANTLR start "rule__MEnumParameterDefinition__Group_5__1__Impl"
    // InternalSWI.g:5023:1: rule__MEnumParameterDefinition__Group_5__1__Impl : ( ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 ) ) ;
    public final void rule__MEnumParameterDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5027:1: ( ( ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 ) ) )
            // InternalSWI.g:5028:1: ( ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 ) )
            {
            // InternalSWI.g:5028:1: ( ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 ) )
            // InternalSWI.g:5029:1: ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_5_1()); 
            }
            // InternalSWI.g:5030:1: ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 )
            // InternalSWI.g:5030:2: rule__MEnumParameterDefinition__LiteralsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterDefinition__LiteralsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__0"
    // InternalSWI.g:5044:1: rule__MEnumParameterSingleExpression__Group__0 : rule__MEnumParameterSingleExpression__Group__0__Impl rule__MEnumParameterSingleExpression__Group__1 ;
    public final void rule__MEnumParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5048:1: ( rule__MEnumParameterSingleExpression__Group__0__Impl rule__MEnumParameterSingleExpression__Group__1 )
            // InternalSWI.g:5049:2: rule__MEnumParameterSingleExpression__Group__0__Impl rule__MEnumParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__MEnumParameterSingleExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__0"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__0__Impl"
    // InternalSWI.g:5056:1: rule__MEnumParameterSingleExpression__Group__0__Impl : ( ( rule__MEnumParameterSingleExpression__ConstantAssignment_0 )? ) ;
    public final void rule__MEnumParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5060:1: ( ( ( rule__MEnumParameterSingleExpression__ConstantAssignment_0 )? ) )
            // InternalSWI.g:5061:1: ( ( rule__MEnumParameterSingleExpression__ConstantAssignment_0 )? )
            {
            // InternalSWI.g:5061:1: ( ( rule__MEnumParameterSingleExpression__ConstantAssignment_0 )? )
            // InternalSWI.g:5062:1: ( rule__MEnumParameterSingleExpression__ConstantAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }
            // InternalSWI.g:5063:1: ( rule__MEnumParameterSingleExpression__ConstantAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSWI.g:5063:2: rule__MEnumParameterSingleExpression__ConstantAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MEnumParameterSingleExpression__ConstantAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__0__Impl"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__1"
    // InternalSWI.g:5073:1: rule__MEnumParameterSingleExpression__Group__1 : rule__MEnumParameterSingleExpression__Group__1__Impl rule__MEnumParameterSingleExpression__Group__2 ;
    public final void rule__MEnumParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5077:1: ( rule__MEnumParameterSingleExpression__Group__1__Impl rule__MEnumParameterSingleExpression__Group__2 )
            // InternalSWI.g:5078:2: rule__MEnumParameterSingleExpression__Group__1__Impl rule__MEnumParameterSingleExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MEnumParameterSingleExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__1"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__1__Impl"
    // InternalSWI.g:5085:1: rule__MEnumParameterSingleExpression__Group__1__Impl : ( 'enum' ) ;
    public final void rule__MEnumParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5089:1: ( ( 'enum' ) )
            // InternalSWI.g:5090:1: ( 'enum' )
            {
            // InternalSWI.g:5090:1: ( 'enum' )
            // InternalSWI.g:5091:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__1__Impl"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__2"
    // InternalSWI.g:5104:1: rule__MEnumParameterSingleExpression__Group__2 : rule__MEnumParameterSingleExpression__Group__2__Impl rule__MEnumParameterSingleExpression__Group__3 ;
    public final void rule__MEnumParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5108:1: ( rule__MEnumParameterSingleExpression__Group__2__Impl rule__MEnumParameterSingleExpression__Group__3 )
            // InternalSWI.g:5109:2: rule__MEnumParameterSingleExpression__Group__2__Impl rule__MEnumParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MEnumParameterSingleExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__2"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__2__Impl"
    // InternalSWI.g:5116:1: rule__MEnumParameterSingleExpression__Group__2__Impl : ( ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2 ) ) ;
    public final void rule__MEnumParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5120:1: ( ( ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2 ) ) )
            // InternalSWI.g:5121:1: ( ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2 ) )
            {
            // InternalSWI.g:5121:1: ( ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2 ) )
            // InternalSWI.g:5122:1: ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_2()); 
            }
            // InternalSWI.g:5123:1: ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2 )
            // InternalSWI.g:5123:2: rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__2__Impl"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__3"
    // InternalSWI.g:5133:1: rule__MEnumParameterSingleExpression__Group__3 : rule__MEnumParameterSingleExpression__Group__3__Impl rule__MEnumParameterSingleExpression__Group__4 ;
    public final void rule__MEnumParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5137:1: ( rule__MEnumParameterSingleExpression__Group__3__Impl rule__MEnumParameterSingleExpression__Group__4 )
            // InternalSWI.g:5138:2: rule__MEnumParameterSingleExpression__Group__3__Impl rule__MEnumParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MEnumParameterSingleExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__3"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__3__Impl"
    // InternalSWI.g:5145:1: rule__MEnumParameterSingleExpression__Group__3__Impl : ( ( rule__MEnumParameterSingleExpression__NameAssignment_3 ) ) ;
    public final void rule__MEnumParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5149:1: ( ( ( rule__MEnumParameterSingleExpression__NameAssignment_3 ) ) )
            // InternalSWI.g:5150:1: ( ( rule__MEnumParameterSingleExpression__NameAssignment_3 ) )
            {
            // InternalSWI.g:5150:1: ( ( rule__MEnumParameterSingleExpression__NameAssignment_3 ) )
            // InternalSWI.g:5151:1: ( rule__MEnumParameterSingleExpression__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_3()); 
            }
            // InternalSWI.g:5152:1: ( rule__MEnumParameterSingleExpression__NameAssignment_3 )
            // InternalSWI.g:5152:2: rule__MEnumParameterSingleExpression__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__3__Impl"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__4"
    // InternalSWI.g:5162:1: rule__MEnumParameterSingleExpression__Group__4 : rule__MEnumParameterSingleExpression__Group__4__Impl rule__MEnumParameterSingleExpression__Group__5 ;
    public final void rule__MEnumParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5166:1: ( rule__MEnumParameterSingleExpression__Group__4__Impl rule__MEnumParameterSingleExpression__Group__5 )
            // InternalSWI.g:5167:2: rule__MEnumParameterSingleExpression__Group__4__Impl rule__MEnumParameterSingleExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MEnumParameterSingleExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__4"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__4__Impl"
    // InternalSWI.g:5174:1: rule__MEnumParameterSingleExpression__Group__4__Impl : ( ':=' ) ;
    public final void rule__MEnumParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5178:1: ( ( ':=' ) )
            // InternalSWI.g:5179:1: ( ':=' )
            {
            // InternalSWI.g:5179:1: ( ':=' )
            // InternalSWI.g:5180:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__4__Impl"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__5"
    // InternalSWI.g:5193:1: rule__MEnumParameterSingleExpression__Group__5 : rule__MEnumParameterSingleExpression__Group__5__Impl rule__MEnumParameterSingleExpression__Group__6 ;
    public final void rule__MEnumParameterSingleExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5197:1: ( rule__MEnumParameterSingleExpression__Group__5__Impl rule__MEnumParameterSingleExpression__Group__6 )
            // InternalSWI.g:5198:2: rule__MEnumParameterSingleExpression__Group__5__Impl rule__MEnumParameterSingleExpression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MEnumParameterSingleExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__5"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__5__Impl"
    // InternalSWI.g:5205:1: rule__MEnumParameterSingleExpression__Group__5__Impl : ( ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_5 ) ) ;
    public final void rule__MEnumParameterSingleExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5209:1: ( ( ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_5 ) ) )
            // InternalSWI.g:5210:1: ( ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_5 ) )
            {
            // InternalSWI.g:5210:1: ( ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_5 ) )
            // InternalSWI.g:5211:1: ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_5()); 
            }
            // InternalSWI.g:5212:1: ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_5 )
            // InternalSWI.g:5212:2: rule__MEnumParameterSingleExpression__DefaultValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__DefaultValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__5__Impl"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__6"
    // InternalSWI.g:5222:1: rule__MEnumParameterSingleExpression__Group__6 : rule__MEnumParameterSingleExpression__Group__6__Impl ;
    public final void rule__MEnumParameterSingleExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5226:1: ( rule__MEnumParameterSingleExpression__Group__6__Impl )
            // InternalSWI.g:5227:2: rule__MEnumParameterSingleExpression__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__6"


    // $ANTLR start "rule__MEnumParameterSingleExpression__Group__6__Impl"
    // InternalSWI.g:5233:1: rule__MEnumParameterSingleExpression__Group__6__Impl : ( ';' ) ;
    public final void rule__MEnumParameterSingleExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5237:1: ( ( ';' ) )
            // InternalSWI.g:5238:1: ( ';' )
            {
            // InternalSWI.g:5238:1: ( ';' )
            // InternalSWI.g:5239:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_6()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__Group__6__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__0"
    // InternalSWI.g:5266:1: rule__MRealParameterSingleExpression__Group__0 : rule__MRealParameterSingleExpression__Group__0__Impl rule__MRealParameterSingleExpression__Group__1 ;
    public final void rule__MRealParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5270:1: ( rule__MRealParameterSingleExpression__Group__0__Impl rule__MRealParameterSingleExpression__Group__1 )
            // InternalSWI.g:5271:2: rule__MRealParameterSingleExpression__Group__0__Impl rule__MRealParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__MRealParameterSingleExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__0"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__0__Impl"
    // InternalSWI.g:5278:1: rule__MRealParameterSingleExpression__Group__0__Impl : ( ( rule__MRealParameterSingleExpression__ConstantAssignment_0 )? ) ;
    public final void rule__MRealParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5282:1: ( ( ( rule__MRealParameterSingleExpression__ConstantAssignment_0 )? ) )
            // InternalSWI.g:5283:1: ( ( rule__MRealParameterSingleExpression__ConstantAssignment_0 )? )
            {
            // InternalSWI.g:5283:1: ( ( rule__MRealParameterSingleExpression__ConstantAssignment_0 )? )
            // InternalSWI.g:5284:1: ( rule__MRealParameterSingleExpression__ConstantAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }
            // InternalSWI.g:5285:1: ( rule__MRealParameterSingleExpression__ConstantAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSWI.g:5285:2: rule__MRealParameterSingleExpression__ConstantAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MRealParameterSingleExpression__ConstantAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__0__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__1"
    // InternalSWI.g:5295:1: rule__MRealParameterSingleExpression__Group__1 : rule__MRealParameterSingleExpression__Group__1__Impl rule__MRealParameterSingleExpression__Group__2 ;
    public final void rule__MRealParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5299:1: ( rule__MRealParameterSingleExpression__Group__1__Impl rule__MRealParameterSingleExpression__Group__2 )
            // InternalSWI.g:5300:2: rule__MRealParameterSingleExpression__Group__1__Impl rule__MRealParameterSingleExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MRealParameterSingleExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__1"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__1__Impl"
    // InternalSWI.g:5307:1: rule__MRealParameterSingleExpression__Group__1__Impl : ( 'real' ) ;
    public final void rule__MRealParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5311:1: ( ( 'real' ) )
            // InternalSWI.g:5312:1: ( 'real' )
            {
            // InternalSWI.g:5312:1: ( 'real' )
            // InternalSWI.g:5313:1: 'real'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__1__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__2"
    // InternalSWI.g:5326:1: rule__MRealParameterSingleExpression__Group__2 : rule__MRealParameterSingleExpression__Group__2__Impl rule__MRealParameterSingleExpression__Group__3 ;
    public final void rule__MRealParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5330:1: ( rule__MRealParameterSingleExpression__Group__2__Impl rule__MRealParameterSingleExpression__Group__3 )
            // InternalSWI.g:5331:2: rule__MRealParameterSingleExpression__Group__2__Impl rule__MRealParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MRealParameterSingleExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__2"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__2__Impl"
    // InternalSWI.g:5338:1: rule__MRealParameterSingleExpression__Group__2__Impl : ( ( rule__MRealParameterSingleExpression__NameAssignment_2 ) ) ;
    public final void rule__MRealParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5342:1: ( ( ( rule__MRealParameterSingleExpression__NameAssignment_2 ) ) )
            // InternalSWI.g:5343:1: ( ( rule__MRealParameterSingleExpression__NameAssignment_2 ) )
            {
            // InternalSWI.g:5343:1: ( ( rule__MRealParameterSingleExpression__NameAssignment_2 ) )
            // InternalSWI.g:5344:1: ( rule__MRealParameterSingleExpression__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_2()); 
            }
            // InternalSWI.g:5345:1: ( rule__MRealParameterSingleExpression__NameAssignment_2 )
            // InternalSWI.g:5345:2: rule__MRealParameterSingleExpression__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__2__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__3"
    // InternalSWI.g:5355:1: rule__MRealParameterSingleExpression__Group__3 : rule__MRealParameterSingleExpression__Group__3__Impl rule__MRealParameterSingleExpression__Group__4 ;
    public final void rule__MRealParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5359:1: ( rule__MRealParameterSingleExpression__Group__3__Impl rule__MRealParameterSingleExpression__Group__4 )
            // InternalSWI.g:5360:2: rule__MRealParameterSingleExpression__Group__3__Impl rule__MRealParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MRealParameterSingleExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__3"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__3__Impl"
    // InternalSWI.g:5367:1: rule__MRealParameterSingleExpression__Group__3__Impl : ( ':=' ) ;
    public final void rule__MRealParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5371:1: ( ( ':=' ) )
            // InternalSWI.g:5372:1: ( ':=' )
            {
            // InternalSWI.g:5372:1: ( ':=' )
            // InternalSWI.g:5373:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__3__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__4"
    // InternalSWI.g:5386:1: rule__MRealParameterSingleExpression__Group__4 : rule__MRealParameterSingleExpression__Group__4__Impl rule__MRealParameterSingleExpression__Group__5 ;
    public final void rule__MRealParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5390:1: ( rule__MRealParameterSingleExpression__Group__4__Impl rule__MRealParameterSingleExpression__Group__5 )
            // InternalSWI.g:5391:2: rule__MRealParameterSingleExpression__Group__4__Impl rule__MRealParameterSingleExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__MRealParameterSingleExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__4"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__4__Impl"
    // InternalSWI.g:5398:1: rule__MRealParameterSingleExpression__Group__4__Impl : ( ( rule__MRealParameterSingleExpression__DefaultValueAssignment_4 ) ) ;
    public final void rule__MRealParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5402:1: ( ( ( rule__MRealParameterSingleExpression__DefaultValueAssignment_4 ) ) )
            // InternalSWI.g:5403:1: ( ( rule__MRealParameterSingleExpression__DefaultValueAssignment_4 ) )
            {
            // InternalSWI.g:5403:1: ( ( rule__MRealParameterSingleExpression__DefaultValueAssignment_4 ) )
            // InternalSWI.g:5404:1: ( rule__MRealParameterSingleExpression__DefaultValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }
            // InternalSWI.g:5405:1: ( rule__MRealParameterSingleExpression__DefaultValueAssignment_4 )
            // InternalSWI.g:5405:2: rule__MRealParameterSingleExpression__DefaultValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__DefaultValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__4__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__5"
    // InternalSWI.g:5415:1: rule__MRealParameterSingleExpression__Group__5 : rule__MRealParameterSingleExpression__Group__5__Impl rule__MRealParameterSingleExpression__Group__6 ;
    public final void rule__MRealParameterSingleExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5419:1: ( rule__MRealParameterSingleExpression__Group__5__Impl rule__MRealParameterSingleExpression__Group__6 )
            // InternalSWI.g:5420:2: rule__MRealParameterSingleExpression__Group__5__Impl rule__MRealParameterSingleExpression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__MRealParameterSingleExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__5"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__5__Impl"
    // InternalSWI.g:5427:1: rule__MRealParameterSingleExpression__Group__5__Impl : ( ( rule__MRealParameterSingleExpression__Group_5__0 )? ) ;
    public final void rule__MRealParameterSingleExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5431:1: ( ( ( rule__MRealParameterSingleExpression__Group_5__0 )? ) )
            // InternalSWI.g:5432:1: ( ( rule__MRealParameterSingleExpression__Group_5__0 )? )
            {
            // InternalSWI.g:5432:1: ( ( rule__MRealParameterSingleExpression__Group_5__0 )? )
            // InternalSWI.g:5433:1: ( rule__MRealParameterSingleExpression__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5()); 
            }
            // InternalSWI.g:5434:1: ( rule__MRealParameterSingleExpression__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSWI.g:5434:2: rule__MRealParameterSingleExpression__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MRealParameterSingleExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__5__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__6"
    // InternalSWI.g:5444:1: rule__MRealParameterSingleExpression__Group__6 : rule__MRealParameterSingleExpression__Group__6__Impl ;
    public final void rule__MRealParameterSingleExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5448:1: ( rule__MRealParameterSingleExpression__Group__6__Impl )
            // InternalSWI.g:5449:2: rule__MRealParameterSingleExpression__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__6"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__6__Impl"
    // InternalSWI.g:5455:1: rule__MRealParameterSingleExpression__Group__6__Impl : ( ';' ) ;
    public final void rule__MRealParameterSingleExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5459:1: ( ( ';' ) )
            // InternalSWI.g:5460:1: ( ';' )
            {
            // InternalSWI.g:5460:1: ( ';' )
            // InternalSWI.g:5461:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_6()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group__6__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group_5__0"
    // InternalSWI.g:5488:1: rule__MRealParameterSingleExpression__Group_5__0 : rule__MRealParameterSingleExpression__Group_5__0__Impl rule__MRealParameterSingleExpression__Group_5__1 ;
    public final void rule__MRealParameterSingleExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5492:1: ( rule__MRealParameterSingleExpression__Group_5__0__Impl rule__MRealParameterSingleExpression__Group_5__1 )
            // InternalSWI.g:5493:2: rule__MRealParameterSingleExpression__Group_5__0__Impl rule__MRealParameterSingleExpression__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__MRealParameterSingleExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group_5__0"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group_5__0__Impl"
    // InternalSWI.g:5500:1: rule__MRealParameterSingleExpression__Group_5__0__Impl : ( 'range' ) ;
    public final void rule__MRealParameterSingleExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5504:1: ( ( 'range' ) )
            // InternalSWI.g:5505:1: ( 'range' )
            {
            // InternalSWI.g:5505:1: ( 'range' )
            // InternalSWI.g:5506:1: 'range'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group_5__0__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group_5__1"
    // InternalSWI.g:5519:1: rule__MRealParameterSingleExpression__Group_5__1 : rule__MRealParameterSingleExpression__Group_5__1__Impl ;
    public final void rule__MRealParameterSingleExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5523:1: ( rule__MRealParameterSingleExpression__Group_5__1__Impl )
            // InternalSWI.g:5524:2: rule__MRealParameterSingleExpression__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group_5__1"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group_5__1__Impl"
    // InternalSWI.g:5530:1: rule__MRealParameterSingleExpression__Group_5__1__Impl : ( ( rule__MRealParameterSingleExpression__RangeAssignment_5_1 ) ) ;
    public final void rule__MRealParameterSingleExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5534:1: ( ( ( rule__MRealParameterSingleExpression__RangeAssignment_5_1 ) ) )
            // InternalSWI.g:5535:1: ( ( rule__MRealParameterSingleExpression__RangeAssignment_5_1 ) )
            {
            // InternalSWI.g:5535:1: ( ( rule__MRealParameterSingleExpression__RangeAssignment_5_1 ) )
            // InternalSWI.g:5536:1: ( rule__MRealParameterSingleExpression__RangeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_5_1()); 
            }
            // InternalSWI.g:5537:1: ( rule__MRealParameterSingleExpression__RangeAssignment_5_1 )
            // InternalSWI.g:5537:2: rule__MRealParameterSingleExpression__RangeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__RangeAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group_5__1__Impl"


    // $ANTLR start "rule__MEnumParameterLiteral__Group__0"
    // InternalSWI.g:5551:1: rule__MEnumParameterLiteral__Group__0 : rule__MEnumParameterLiteral__Group__0__Impl rule__MEnumParameterLiteral__Group__1 ;
    public final void rule__MEnumParameterLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5555:1: ( rule__MEnumParameterLiteral__Group__0__Impl rule__MEnumParameterLiteral__Group__1 )
            // InternalSWI.g:5556:2: rule__MEnumParameterLiteral__Group__0__Impl rule__MEnumParameterLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MEnumParameterLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterLiteral__Group__0"


    // $ANTLR start "rule__MEnumParameterLiteral__Group__0__Impl"
    // InternalSWI.g:5563:1: rule__MEnumParameterLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParameterLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5567:1: ( ( () ) )
            // InternalSWI.g:5568:1: ( () )
            {
            // InternalSWI.g:5568:1: ( () )
            // InternalSWI.g:5569:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0()); 
            }
            // InternalSWI.g:5570:1: ()
            // InternalSWI.g:5572:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterLiteral__Group__0__Impl"


    // $ANTLR start "rule__MEnumParameterLiteral__Group__1"
    // InternalSWI.g:5582:1: rule__MEnumParameterLiteral__Group__1 : rule__MEnumParameterLiteral__Group__1__Impl ;
    public final void rule__MEnumParameterLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5586:1: ( rule__MEnumParameterLiteral__Group__1__Impl )
            // InternalSWI.g:5587:2: rule__MEnumParameterLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterLiteral__Group__1"


    // $ANTLR start "rule__MEnumParameterLiteral__Group__1__Impl"
    // InternalSWI.g:5593:1: rule__MEnumParameterLiteral__Group__1__Impl : ( ( rule__MEnumParameterLiteral__NameAssignment_1 ) ) ;
    public final void rule__MEnumParameterLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5597:1: ( ( ( rule__MEnumParameterLiteral__NameAssignment_1 ) ) )
            // InternalSWI.g:5598:1: ( ( rule__MEnumParameterLiteral__NameAssignment_1 ) )
            {
            // InternalSWI.g:5598:1: ( ( rule__MEnumParameterLiteral__NameAssignment_1 ) )
            // InternalSWI.g:5599:1: ( rule__MEnumParameterLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralAccess().getNameAssignment_1()); 
            }
            // InternalSWI.g:5600:1: ( rule__MEnumParameterLiteral__NameAssignment_1 )
            // InternalSWI.g:5600:2: rule__MEnumParameterLiteral__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterLiteral__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterLiteralAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterLiteral__Group__1__Impl"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__Group__0"
    // InternalSWI.g:5614:1: rule__MEnumParamIntegerLiteral__Group__0 : rule__MEnumParamIntegerLiteral__Group__0__Impl rule__MEnumParamIntegerLiteral__Group__1 ;
    public final void rule__MEnumParamIntegerLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5618:1: ( rule__MEnumParamIntegerLiteral__Group__0__Impl rule__MEnumParamIntegerLiteral__Group__1 )
            // InternalSWI.g:5619:2: rule__MEnumParamIntegerLiteral__Group__0__Impl rule__MEnumParamIntegerLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MEnumParamIntegerLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamIntegerLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__Group__0"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__Group__0__Impl"
    // InternalSWI.g:5626:1: rule__MEnumParamIntegerLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParamIntegerLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5630:1: ( ( () ) )
            // InternalSWI.g:5631:1: ( () )
            {
            // InternalSWI.g:5631:1: ( () )
            // InternalSWI.g:5632:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0()); 
            }
            // InternalSWI.g:5633:1: ()
            // InternalSWI.g:5635:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__Group__0__Impl"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__Group__1"
    // InternalSWI.g:5645:1: rule__MEnumParamIntegerLiteral__Group__1 : rule__MEnumParamIntegerLiteral__Group__1__Impl rule__MEnumParamIntegerLiteral__Group__2 ;
    public final void rule__MEnumParamIntegerLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5649:1: ( rule__MEnumParamIntegerLiteral__Group__1__Impl rule__MEnumParamIntegerLiteral__Group__2 )
            // InternalSWI.g:5650:2: rule__MEnumParamIntegerLiteral__Group__1__Impl rule__MEnumParamIntegerLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__MEnumParamIntegerLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamIntegerLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__Group__1"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__Group__1__Impl"
    // InternalSWI.g:5657:1: rule__MEnumParamIntegerLiteral__Group__1__Impl : ( ( rule__MEnumParamIntegerLiteral__NameAssignment_1 ) ) ;
    public final void rule__MEnumParamIntegerLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5661:1: ( ( ( rule__MEnumParamIntegerLiteral__NameAssignment_1 ) ) )
            // InternalSWI.g:5662:1: ( ( rule__MEnumParamIntegerLiteral__NameAssignment_1 ) )
            {
            // InternalSWI.g:5662:1: ( ( rule__MEnumParamIntegerLiteral__NameAssignment_1 ) )
            // InternalSWI.g:5663:1: ( rule__MEnumParamIntegerLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameAssignment_1()); 
            }
            // InternalSWI.g:5664:1: ( rule__MEnumParamIntegerLiteral__NameAssignment_1 )
            // InternalSWI.g:5664:2: rule__MEnumParamIntegerLiteral__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamIntegerLiteral__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__Group__1__Impl"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__Group__2"
    // InternalSWI.g:5674:1: rule__MEnumParamIntegerLiteral__Group__2 : rule__MEnumParamIntegerLiteral__Group__2__Impl rule__MEnumParamIntegerLiteral__Group__3 ;
    public final void rule__MEnumParamIntegerLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5678:1: ( rule__MEnumParamIntegerLiteral__Group__2__Impl rule__MEnumParamIntegerLiteral__Group__3 )
            // InternalSWI.g:5679:2: rule__MEnumParamIntegerLiteral__Group__2__Impl rule__MEnumParamIntegerLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__MEnumParamIntegerLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamIntegerLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__Group__2"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__Group__2__Impl"
    // InternalSWI.g:5686:1: rule__MEnumParamIntegerLiteral__Group__2__Impl : ( '=' ) ;
    public final void rule__MEnumParamIntegerLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5690:1: ( ( '=' ) )
            // InternalSWI.g:5691:1: ( '=' )
            {
            // InternalSWI.g:5691:1: ( '=' )
            // InternalSWI.g:5692:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__Group__2__Impl"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__Group__3"
    // InternalSWI.g:5705:1: rule__MEnumParamIntegerLiteral__Group__3 : rule__MEnumParamIntegerLiteral__Group__3__Impl ;
    public final void rule__MEnumParamIntegerLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5709:1: ( rule__MEnumParamIntegerLiteral__Group__3__Impl )
            // InternalSWI.g:5710:2: rule__MEnumParamIntegerLiteral__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamIntegerLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__Group__3"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__Group__3__Impl"
    // InternalSWI.g:5716:1: rule__MEnumParamIntegerLiteral__Group__3__Impl : ( ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 ) ) ;
    public final void rule__MEnumParamIntegerLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5720:1: ( ( ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 ) ) )
            // InternalSWI.g:5721:1: ( ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 ) )
            {
            // InternalSWI.g:5721:1: ( ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 ) )
            // InternalSWI.g:5722:1: ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueAssignment_3()); 
            }
            // InternalSWI.g:5723:1: ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 )
            // InternalSWI.g:5723:2: rule__MEnumParamIntegerLiteral__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamIntegerLiteral__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__Group__3__Impl"


    // $ANTLR start "rule__MEnumParamRealLiteral__Group__0"
    // InternalSWI.g:5741:1: rule__MEnumParamRealLiteral__Group__0 : rule__MEnumParamRealLiteral__Group__0__Impl rule__MEnumParamRealLiteral__Group__1 ;
    public final void rule__MEnumParamRealLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5745:1: ( rule__MEnumParamRealLiteral__Group__0__Impl rule__MEnumParamRealLiteral__Group__1 )
            // InternalSWI.g:5746:2: rule__MEnumParamRealLiteral__Group__0__Impl rule__MEnumParamRealLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MEnumParamRealLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamRealLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__Group__0"


    // $ANTLR start "rule__MEnumParamRealLiteral__Group__0__Impl"
    // InternalSWI.g:5753:1: rule__MEnumParamRealLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParamRealLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5757:1: ( ( () ) )
            // InternalSWI.g:5758:1: ( () )
            {
            // InternalSWI.g:5758:1: ( () )
            // InternalSWI.g:5759:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0()); 
            }
            // InternalSWI.g:5760:1: ()
            // InternalSWI.g:5762:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__Group__0__Impl"


    // $ANTLR start "rule__MEnumParamRealLiteral__Group__1"
    // InternalSWI.g:5772:1: rule__MEnumParamRealLiteral__Group__1 : rule__MEnumParamRealLiteral__Group__1__Impl rule__MEnumParamRealLiteral__Group__2 ;
    public final void rule__MEnumParamRealLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5776:1: ( rule__MEnumParamRealLiteral__Group__1__Impl rule__MEnumParamRealLiteral__Group__2 )
            // InternalSWI.g:5777:2: rule__MEnumParamRealLiteral__Group__1__Impl rule__MEnumParamRealLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__MEnumParamRealLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamRealLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__Group__1"


    // $ANTLR start "rule__MEnumParamRealLiteral__Group__1__Impl"
    // InternalSWI.g:5784:1: rule__MEnumParamRealLiteral__Group__1__Impl : ( ( rule__MEnumParamRealLiteral__NameAssignment_1 ) ) ;
    public final void rule__MEnumParamRealLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5788:1: ( ( ( rule__MEnumParamRealLiteral__NameAssignment_1 ) ) )
            // InternalSWI.g:5789:1: ( ( rule__MEnumParamRealLiteral__NameAssignment_1 ) )
            {
            // InternalSWI.g:5789:1: ( ( rule__MEnumParamRealLiteral__NameAssignment_1 ) )
            // InternalSWI.g:5790:1: ( rule__MEnumParamRealLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getNameAssignment_1()); 
            }
            // InternalSWI.g:5791:1: ( rule__MEnumParamRealLiteral__NameAssignment_1 )
            // InternalSWI.g:5791:2: rule__MEnumParamRealLiteral__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamRealLiteral__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamRealLiteralAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__Group__1__Impl"


    // $ANTLR start "rule__MEnumParamRealLiteral__Group__2"
    // InternalSWI.g:5801:1: rule__MEnumParamRealLiteral__Group__2 : rule__MEnumParamRealLiteral__Group__2__Impl rule__MEnumParamRealLiteral__Group__3 ;
    public final void rule__MEnumParamRealLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5805:1: ( rule__MEnumParamRealLiteral__Group__2__Impl rule__MEnumParamRealLiteral__Group__3 )
            // InternalSWI.g:5806:2: rule__MEnumParamRealLiteral__Group__2__Impl rule__MEnumParamRealLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__MEnumParamRealLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamRealLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__Group__2"


    // $ANTLR start "rule__MEnumParamRealLiteral__Group__2__Impl"
    // InternalSWI.g:5813:1: rule__MEnumParamRealLiteral__Group__2__Impl : ( '=' ) ;
    public final void rule__MEnumParamRealLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5817:1: ( ( '=' ) )
            // InternalSWI.g:5818:1: ( '=' )
            {
            // InternalSWI.g:5818:1: ( '=' )
            // InternalSWI.g:5819:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__Group__2__Impl"


    // $ANTLR start "rule__MEnumParamRealLiteral__Group__3"
    // InternalSWI.g:5832:1: rule__MEnumParamRealLiteral__Group__3 : rule__MEnumParamRealLiteral__Group__3__Impl ;
    public final void rule__MEnumParamRealLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5836:1: ( rule__MEnumParamRealLiteral__Group__3__Impl )
            // InternalSWI.g:5837:2: rule__MEnumParamRealLiteral__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamRealLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__Group__3"


    // $ANTLR start "rule__MEnumParamRealLiteral__Group__3__Impl"
    // InternalSWI.g:5843:1: rule__MEnumParamRealLiteral__Group__3__Impl : ( ( rule__MEnumParamRealLiteral__ValueAssignment_3 ) ) ;
    public final void rule__MEnumParamRealLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5847:1: ( ( ( rule__MEnumParamRealLiteral__ValueAssignment_3 ) ) )
            // InternalSWI.g:5848:1: ( ( rule__MEnumParamRealLiteral__ValueAssignment_3 ) )
            {
            // InternalSWI.g:5848:1: ( ( rule__MEnumParamRealLiteral__ValueAssignment_3 ) )
            // InternalSWI.g:5849:1: ( rule__MEnumParamRealLiteral__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getValueAssignment_3()); 
            }
            // InternalSWI.g:5850:1: ( rule__MEnumParamRealLiteral__ValueAssignment_3 )
            // InternalSWI.g:5850:2: rule__MEnumParamRealLiteral__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamRealLiteral__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamRealLiteralAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__Group__3__Impl"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__0"
    // InternalSWI.g:5868:1: rule__MEnumParamStringLiteral__Group__0 : rule__MEnumParamStringLiteral__Group__0__Impl rule__MEnumParamStringLiteral__Group__1 ;
    public final void rule__MEnumParamStringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5872:1: ( rule__MEnumParamStringLiteral__Group__0__Impl rule__MEnumParamStringLiteral__Group__1 )
            // InternalSWI.g:5873:2: rule__MEnumParamStringLiteral__Group__0__Impl rule__MEnumParamStringLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MEnumParamStringLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamStringLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__0"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__0__Impl"
    // InternalSWI.g:5880:1: rule__MEnumParamStringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParamStringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5884:1: ( ( () ) )
            // InternalSWI.g:5885:1: ( () )
            {
            // InternalSWI.g:5885:1: ( () )
            // InternalSWI.g:5886:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0()); 
            }
            // InternalSWI.g:5887:1: ()
            // InternalSWI.g:5889:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__0__Impl"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__1"
    // InternalSWI.g:5899:1: rule__MEnumParamStringLiteral__Group__1 : rule__MEnumParamStringLiteral__Group__1__Impl rule__MEnumParamStringLiteral__Group__2 ;
    public final void rule__MEnumParamStringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5903:1: ( rule__MEnumParamStringLiteral__Group__1__Impl rule__MEnumParamStringLiteral__Group__2 )
            // InternalSWI.g:5904:2: rule__MEnumParamStringLiteral__Group__1__Impl rule__MEnumParamStringLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__MEnumParamStringLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamStringLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__1"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__1__Impl"
    // InternalSWI.g:5911:1: rule__MEnumParamStringLiteral__Group__1__Impl : ( ( rule__MEnumParamStringLiteral__NameAssignment_1 ) ) ;
    public final void rule__MEnumParamStringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5915:1: ( ( ( rule__MEnumParamStringLiteral__NameAssignment_1 ) ) )
            // InternalSWI.g:5916:1: ( ( rule__MEnumParamStringLiteral__NameAssignment_1 ) )
            {
            // InternalSWI.g:5916:1: ( ( rule__MEnumParamStringLiteral__NameAssignment_1 ) )
            // InternalSWI.g:5917:1: ( rule__MEnumParamStringLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getNameAssignment_1()); 
            }
            // InternalSWI.g:5918:1: ( rule__MEnumParamStringLiteral__NameAssignment_1 )
            // InternalSWI.g:5918:2: rule__MEnumParamStringLiteral__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamStringLiteral__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__1__Impl"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__2"
    // InternalSWI.g:5928:1: rule__MEnumParamStringLiteral__Group__2 : rule__MEnumParamStringLiteral__Group__2__Impl rule__MEnumParamStringLiteral__Group__3 ;
    public final void rule__MEnumParamStringLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5932:1: ( rule__MEnumParamStringLiteral__Group__2__Impl rule__MEnumParamStringLiteral__Group__3 )
            // InternalSWI.g:5933:2: rule__MEnumParamStringLiteral__Group__2__Impl rule__MEnumParamStringLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__MEnumParamStringLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamStringLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__2"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__2__Impl"
    // InternalSWI.g:5940:1: rule__MEnumParamStringLiteral__Group__2__Impl : ( '=' ) ;
    public final void rule__MEnumParamStringLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5944:1: ( ( '=' ) )
            // InternalSWI.g:5945:1: ( '=' )
            {
            // InternalSWI.g:5945:1: ( '=' )
            // InternalSWI.g:5946:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__2__Impl"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__3"
    // InternalSWI.g:5959:1: rule__MEnumParamStringLiteral__Group__3 : rule__MEnumParamStringLiteral__Group__3__Impl rule__MEnumParamStringLiteral__Group__4 ;
    public final void rule__MEnumParamStringLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5963:1: ( rule__MEnumParamStringLiteral__Group__3__Impl rule__MEnumParamStringLiteral__Group__4 )
            // InternalSWI.g:5964:2: rule__MEnumParamStringLiteral__Group__3__Impl rule__MEnumParamStringLiteral__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__MEnumParamStringLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamStringLiteral__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__3"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__3__Impl"
    // InternalSWI.g:5971:1: rule__MEnumParamStringLiteral__Group__3__Impl : ( ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )? ) ;
    public final void rule__MEnumParamStringLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5975:1: ( ( ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )? ) )
            // InternalSWI.g:5976:1: ( ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )? )
            {
            // InternalSWI.g:5976:1: ( ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )? )
            // InternalSWI.g:5977:1: ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawAssignment_3()); 
            }
            // InternalSWI.g:5978:1: ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==56) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSWI.g:5978:2: rule__MEnumParamStringLiteral__IsRawAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MEnumParamStringLiteral__IsRawAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__3__Impl"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__4"
    // InternalSWI.g:5988:1: rule__MEnumParamStringLiteral__Group__4 : rule__MEnumParamStringLiteral__Group__4__Impl ;
    public final void rule__MEnumParamStringLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:5992:1: ( rule__MEnumParamStringLiteral__Group__4__Impl )
            // InternalSWI.g:5993:2: rule__MEnumParamStringLiteral__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamStringLiteral__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__4"


    // $ANTLR start "rule__MEnumParamStringLiteral__Group__4__Impl"
    // InternalSWI.g:5999:1: rule__MEnumParamStringLiteral__Group__4__Impl : ( ( rule__MEnumParamStringLiteral__ValueAssignment_4 ) ) ;
    public final void rule__MEnumParamStringLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6003:1: ( ( ( rule__MEnumParamStringLiteral__ValueAssignment_4 ) ) )
            // InternalSWI.g:6004:1: ( ( rule__MEnumParamStringLiteral__ValueAssignment_4 ) )
            {
            // InternalSWI.g:6004:1: ( ( rule__MEnumParamStringLiteral__ValueAssignment_4 ) )
            // InternalSWI.g:6005:1: ( rule__MEnumParamStringLiteral__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getValueAssignment_4()); 
            }
            // InternalSWI.g:6006:1: ( rule__MEnumParamStringLiteral__ValueAssignment_4 )
            // InternalSWI.g:6006:2: rule__MEnumParamStringLiteral__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParamStringLiteral__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__Group__4__Impl"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__0"
    // InternalSWI.g:6026:1: rule__MBooleanParameterSingleExpression__Group__0 : rule__MBooleanParameterSingleExpression__Group__0__Impl rule__MBooleanParameterSingleExpression__Group__1 ;
    public final void rule__MBooleanParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6030:1: ( rule__MBooleanParameterSingleExpression__Group__0__Impl rule__MBooleanParameterSingleExpression__Group__1 )
            // InternalSWI.g:6031:2: rule__MBooleanParameterSingleExpression__Group__0__Impl rule__MBooleanParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__MBooleanParameterSingleExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__0"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__0__Impl"
    // InternalSWI.g:6038:1: rule__MBooleanParameterSingleExpression__Group__0__Impl : ( ( rule__MBooleanParameterSingleExpression__ConstantAssignment_0 )? ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6042:1: ( ( ( rule__MBooleanParameterSingleExpression__ConstantAssignment_0 )? ) )
            // InternalSWI.g:6043:1: ( ( rule__MBooleanParameterSingleExpression__ConstantAssignment_0 )? )
            {
            // InternalSWI.g:6043:1: ( ( rule__MBooleanParameterSingleExpression__ConstantAssignment_0 )? )
            // InternalSWI.g:6044:1: ( rule__MBooleanParameterSingleExpression__ConstantAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }
            // InternalSWI.g:6045:1: ( rule__MBooleanParameterSingleExpression__ConstantAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==55) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSWI.g:6045:2: rule__MBooleanParameterSingleExpression__ConstantAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MBooleanParameterSingleExpression__ConstantAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__0__Impl"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__1"
    // InternalSWI.g:6055:1: rule__MBooleanParameterSingleExpression__Group__1 : rule__MBooleanParameterSingleExpression__Group__1__Impl rule__MBooleanParameterSingleExpression__Group__2 ;
    public final void rule__MBooleanParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6059:1: ( rule__MBooleanParameterSingleExpression__Group__1__Impl rule__MBooleanParameterSingleExpression__Group__2 )
            // InternalSWI.g:6060:2: rule__MBooleanParameterSingleExpression__Group__1__Impl rule__MBooleanParameterSingleExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MBooleanParameterSingleExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__1"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__1__Impl"
    // InternalSWI.g:6067:1: rule__MBooleanParameterSingleExpression__Group__1__Impl : ( 'boolean' ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6071:1: ( ( 'boolean' ) )
            // InternalSWI.g:6072:1: ( 'boolean' )
            {
            // InternalSWI.g:6072:1: ( 'boolean' )
            // InternalSWI.g:6073:1: 'boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__1__Impl"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__2"
    // InternalSWI.g:6086:1: rule__MBooleanParameterSingleExpression__Group__2 : rule__MBooleanParameterSingleExpression__Group__2__Impl rule__MBooleanParameterSingleExpression__Group__3 ;
    public final void rule__MBooleanParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6090:1: ( rule__MBooleanParameterSingleExpression__Group__2__Impl rule__MBooleanParameterSingleExpression__Group__3 )
            // InternalSWI.g:6091:2: rule__MBooleanParameterSingleExpression__Group__2__Impl rule__MBooleanParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MBooleanParameterSingleExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__2"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__2__Impl"
    // InternalSWI.g:6098:1: rule__MBooleanParameterSingleExpression__Group__2__Impl : ( ( rule__MBooleanParameterSingleExpression__NameAssignment_2 ) ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6102:1: ( ( ( rule__MBooleanParameterSingleExpression__NameAssignment_2 ) ) )
            // InternalSWI.g:6103:1: ( ( rule__MBooleanParameterSingleExpression__NameAssignment_2 ) )
            {
            // InternalSWI.g:6103:1: ( ( rule__MBooleanParameterSingleExpression__NameAssignment_2 ) )
            // InternalSWI.g:6104:1: ( rule__MBooleanParameterSingleExpression__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_2()); 
            }
            // InternalSWI.g:6105:1: ( rule__MBooleanParameterSingleExpression__NameAssignment_2 )
            // InternalSWI.g:6105:2: rule__MBooleanParameterSingleExpression__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__2__Impl"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__3"
    // InternalSWI.g:6115:1: rule__MBooleanParameterSingleExpression__Group__3 : rule__MBooleanParameterSingleExpression__Group__3__Impl rule__MBooleanParameterSingleExpression__Group__4 ;
    public final void rule__MBooleanParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6119:1: ( rule__MBooleanParameterSingleExpression__Group__3__Impl rule__MBooleanParameterSingleExpression__Group__4 )
            // InternalSWI.g:6120:2: rule__MBooleanParameterSingleExpression__Group__3__Impl rule__MBooleanParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MBooleanParameterSingleExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__3"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__3__Impl"
    // InternalSWI.g:6127:1: rule__MBooleanParameterSingleExpression__Group__3__Impl : ( ':=' ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6131:1: ( ( ':=' ) )
            // InternalSWI.g:6132:1: ( ':=' )
            {
            // InternalSWI.g:6132:1: ( ':=' )
            // InternalSWI.g:6133:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__3__Impl"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__4"
    // InternalSWI.g:6146:1: rule__MBooleanParameterSingleExpression__Group__4 : rule__MBooleanParameterSingleExpression__Group__4__Impl rule__MBooleanParameterSingleExpression__Group__5 ;
    public final void rule__MBooleanParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6150:1: ( rule__MBooleanParameterSingleExpression__Group__4__Impl rule__MBooleanParameterSingleExpression__Group__5 )
            // InternalSWI.g:6151:2: rule__MBooleanParameterSingleExpression__Group__4__Impl rule__MBooleanParameterSingleExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MBooleanParameterSingleExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__4"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__4__Impl"
    // InternalSWI.g:6158:1: rule__MBooleanParameterSingleExpression__Group__4__Impl : ( ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4 ) ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6162:1: ( ( ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4 ) ) )
            // InternalSWI.g:6163:1: ( ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4 ) )
            {
            // InternalSWI.g:6163:1: ( ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4 ) )
            // InternalSWI.g:6164:1: ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }
            // InternalSWI.g:6165:1: ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4 )
            // InternalSWI.g:6165:2: rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__4__Impl"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__5"
    // InternalSWI.g:6175:1: rule__MBooleanParameterSingleExpression__Group__5 : rule__MBooleanParameterSingleExpression__Group__5__Impl ;
    public final void rule__MBooleanParameterSingleExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6179:1: ( rule__MBooleanParameterSingleExpression__Group__5__Impl )
            // InternalSWI.g:6180:2: rule__MBooleanParameterSingleExpression__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__5"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__Group__5__Impl"
    // InternalSWI.g:6186:1: rule__MBooleanParameterSingleExpression__Group__5__Impl : ( ';' ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6190:1: ( ( ';' ) )
            // InternalSWI.g:6191:1: ( ';' )
            {
            // InternalSWI.g:6191:1: ( ';' )
            // InternalSWI.g:6192:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__Group__5__Impl"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__0"
    // InternalSWI.g:6217:1: rule__MStringParameterSingleExpression__Group__0 : rule__MStringParameterSingleExpression__Group__0__Impl rule__MStringParameterSingleExpression__Group__1 ;
    public final void rule__MStringParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6221:1: ( rule__MStringParameterSingleExpression__Group__0__Impl rule__MStringParameterSingleExpression__Group__1 )
            // InternalSWI.g:6222:2: rule__MStringParameterSingleExpression__Group__0__Impl rule__MStringParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__MStringParameterSingleExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__0"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__0__Impl"
    // InternalSWI.g:6229:1: rule__MStringParameterSingleExpression__Group__0__Impl : ( ( rule__MStringParameterSingleExpression__ConstantAssignment_0 )? ) ;
    public final void rule__MStringParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6233:1: ( ( ( rule__MStringParameterSingleExpression__ConstantAssignment_0 )? ) )
            // InternalSWI.g:6234:1: ( ( rule__MStringParameterSingleExpression__ConstantAssignment_0 )? )
            {
            // InternalSWI.g:6234:1: ( ( rule__MStringParameterSingleExpression__ConstantAssignment_0 )? )
            // InternalSWI.g:6235:1: ( rule__MStringParameterSingleExpression__ConstantAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }
            // InternalSWI.g:6236:1: ( rule__MStringParameterSingleExpression__ConstantAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSWI.g:6236:2: rule__MStringParameterSingleExpression__ConstantAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MStringParameterSingleExpression__ConstantAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__0__Impl"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__1"
    // InternalSWI.g:6246:1: rule__MStringParameterSingleExpression__Group__1 : rule__MStringParameterSingleExpression__Group__1__Impl rule__MStringParameterSingleExpression__Group__2 ;
    public final void rule__MStringParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6250:1: ( rule__MStringParameterSingleExpression__Group__1__Impl rule__MStringParameterSingleExpression__Group__2 )
            // InternalSWI.g:6251:2: rule__MStringParameterSingleExpression__Group__1__Impl rule__MStringParameterSingleExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MStringParameterSingleExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__1"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__1__Impl"
    // InternalSWI.g:6258:1: rule__MStringParameterSingleExpression__Group__1__Impl : ( 'string' ) ;
    public final void rule__MStringParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6262:1: ( ( 'string' ) )
            // InternalSWI.g:6263:1: ( 'string' )
            {
            // InternalSWI.g:6263:1: ( 'string' )
            // InternalSWI.g:6264:1: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__1__Impl"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__2"
    // InternalSWI.g:6277:1: rule__MStringParameterSingleExpression__Group__2 : rule__MStringParameterSingleExpression__Group__2__Impl rule__MStringParameterSingleExpression__Group__3 ;
    public final void rule__MStringParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6281:1: ( rule__MStringParameterSingleExpression__Group__2__Impl rule__MStringParameterSingleExpression__Group__3 )
            // InternalSWI.g:6282:2: rule__MStringParameterSingleExpression__Group__2__Impl rule__MStringParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MStringParameterSingleExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__2"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__2__Impl"
    // InternalSWI.g:6289:1: rule__MStringParameterSingleExpression__Group__2__Impl : ( ( rule__MStringParameterSingleExpression__NameAssignment_2 ) ) ;
    public final void rule__MStringParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6293:1: ( ( ( rule__MStringParameterSingleExpression__NameAssignment_2 ) ) )
            // InternalSWI.g:6294:1: ( ( rule__MStringParameterSingleExpression__NameAssignment_2 ) )
            {
            // InternalSWI.g:6294:1: ( ( rule__MStringParameterSingleExpression__NameAssignment_2 ) )
            // InternalSWI.g:6295:1: ( rule__MStringParameterSingleExpression__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_2()); 
            }
            // InternalSWI.g:6296:1: ( rule__MStringParameterSingleExpression__NameAssignment_2 )
            // InternalSWI.g:6296:2: rule__MStringParameterSingleExpression__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__2__Impl"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__3"
    // InternalSWI.g:6306:1: rule__MStringParameterSingleExpression__Group__3 : rule__MStringParameterSingleExpression__Group__3__Impl rule__MStringParameterSingleExpression__Group__4 ;
    public final void rule__MStringParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6310:1: ( rule__MStringParameterSingleExpression__Group__3__Impl rule__MStringParameterSingleExpression__Group__4 )
            // InternalSWI.g:6311:2: rule__MStringParameterSingleExpression__Group__3__Impl rule__MStringParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MStringParameterSingleExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__3"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__3__Impl"
    // InternalSWI.g:6318:1: rule__MStringParameterSingleExpression__Group__3__Impl : ( ':=' ) ;
    public final void rule__MStringParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6322:1: ( ( ':=' ) )
            // InternalSWI.g:6323:1: ( ':=' )
            {
            // InternalSWI.g:6323:1: ( ':=' )
            // InternalSWI.g:6324:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__3__Impl"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__4"
    // InternalSWI.g:6337:1: rule__MStringParameterSingleExpression__Group__4 : rule__MStringParameterSingleExpression__Group__4__Impl rule__MStringParameterSingleExpression__Group__5 ;
    public final void rule__MStringParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6341:1: ( rule__MStringParameterSingleExpression__Group__4__Impl rule__MStringParameterSingleExpression__Group__5 )
            // InternalSWI.g:6342:2: rule__MStringParameterSingleExpression__Group__4__Impl rule__MStringParameterSingleExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MStringParameterSingleExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__4"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__4__Impl"
    // InternalSWI.g:6349:1: rule__MStringParameterSingleExpression__Group__4__Impl : ( ( rule__MStringParameterSingleExpression__DefaultValueAssignment_4 ) ) ;
    public final void rule__MStringParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6353:1: ( ( ( rule__MStringParameterSingleExpression__DefaultValueAssignment_4 ) ) )
            // InternalSWI.g:6354:1: ( ( rule__MStringParameterSingleExpression__DefaultValueAssignment_4 ) )
            {
            // InternalSWI.g:6354:1: ( ( rule__MStringParameterSingleExpression__DefaultValueAssignment_4 ) )
            // InternalSWI.g:6355:1: ( rule__MStringParameterSingleExpression__DefaultValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }
            // InternalSWI.g:6356:1: ( rule__MStringParameterSingleExpression__DefaultValueAssignment_4 )
            // InternalSWI.g:6356:2: rule__MStringParameterSingleExpression__DefaultValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__DefaultValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__4__Impl"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__5"
    // InternalSWI.g:6366:1: rule__MStringParameterSingleExpression__Group__5 : rule__MStringParameterSingleExpression__Group__5__Impl ;
    public final void rule__MStringParameterSingleExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6370:1: ( rule__MStringParameterSingleExpression__Group__5__Impl )
            // InternalSWI.g:6371:2: rule__MStringParameterSingleExpression__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__5"


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__5__Impl"
    // InternalSWI.g:6377:1: rule__MStringParameterSingleExpression__Group__5__Impl : ( ';' ) ;
    public final void rule__MStringParameterSingleExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6381:1: ( ( ';' ) )
            // InternalSWI.g:6382:1: ( ';' )
            {
            // InternalSWI.g:6382:1: ( ';' )
            // InternalSWI.g:6383:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__Group__5__Impl"


    // $ANTLR start "rule__INTEGER__Group_0__0"
    // InternalSWI.g:6408:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6412:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalSWI.g:6413:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__INTEGER__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTEGER__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__0"


    // $ANTLR start "rule__INTEGER__Group_0__0__Impl"
    // InternalSWI.g:6420:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6424:1: ( ( ( '-' )? ) )
            // InternalSWI.g:6425:1: ( ( '-' )? )
            {
            // InternalSWI.g:6425:1: ( ( '-' )? )
            // InternalSWI.g:6426:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalSWI.g:6427:1: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==15) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSWI.g:6428:2: '-'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__0__Impl"


    // $ANTLR start "rule__INTEGER__Group_0__1"
    // InternalSWI.g:6439:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6443:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalSWI.g:6444:2: rule__INTEGER__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTEGER__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__1"


    // $ANTLR start "rule__INTEGER__Group_0__1__Impl"
    // InternalSWI.g:6450:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6454:1: ( ( RULE_INT ) )
            // InternalSWI.g:6455:1: ( RULE_INT )
            {
            // InternalSWI.g:6455:1: ( RULE_INT )
            // InternalSWI.g:6456:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__1__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalSWI.g:6471:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6475:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalSWI.g:6476:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__REAL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalSWI.g:6483:1: rule__REAL__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6487:1: ( ( ( '-' )? ) )
            // InternalSWI.g:6488:1: ( ( '-' )? )
            {
            // InternalSWI.g:6488:1: ( ( '-' )? )
            // InternalSWI.g:6489:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalSWI.g:6490:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==15) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSWI.g:6491:2: '-'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalSWI.g:6502:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6506:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalSWI.g:6507:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__REAL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalSWI.g:6514:1: rule__REAL__Group__1__Impl : ( ( rule__REAL__Group_1__0 ) ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6518:1: ( ( ( rule__REAL__Group_1__0 ) ) )
            // InternalSWI.g:6519:1: ( ( rule__REAL__Group_1__0 ) )
            {
            // InternalSWI.g:6519:1: ( ( rule__REAL__Group_1__0 ) )
            // InternalSWI.g:6520:1: ( rule__REAL__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup_1()); 
            }
            // InternalSWI.g:6521:1: ( rule__REAL__Group_1__0 )
            // InternalSWI.g:6521:2: rule__REAL__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalSWI.g:6531:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6535:1: ( rule__REAL__Group__2__Impl )
            // InternalSWI.g:6536:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalSWI.g:6542:1: rule__REAL__Group__2__Impl : ( ( rule__REAL__Group_2__0 )? ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6546:1: ( ( ( rule__REAL__Group_2__0 )? ) )
            // InternalSWI.g:6547:1: ( ( rule__REAL__Group_2__0 )? )
            {
            // InternalSWI.g:6547:1: ( ( rule__REAL__Group_2__0 )? )
            // InternalSWI.g:6548:1: ( rule__REAL__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup_2()); 
            }
            // InternalSWI.g:6549:1: ( rule__REAL__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSWI.g:6549:2: rule__REAL__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__REAL__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__REAL__Group_1__0"
    // InternalSWI.g:6565:1: rule__REAL__Group_1__0 : rule__REAL__Group_1__0__Impl rule__REAL__Group_1__1 ;
    public final void rule__REAL__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6569:1: ( rule__REAL__Group_1__0__Impl rule__REAL__Group_1__1 )
            // InternalSWI.g:6570:2: rule__REAL__Group_1__0__Impl rule__REAL__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__REAL__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_1__0"


    // $ANTLR start "rule__REAL__Group_1__0__Impl"
    // InternalSWI.g:6577:1: rule__REAL__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6581:1: ( ( RULE_INT ) )
            // InternalSWI.g:6582:1: ( RULE_INT )
            {
            // InternalSWI.g:6582:1: ( RULE_INT )
            // InternalSWI.g:6583:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_1__0__Impl"


    // $ANTLR start "rule__REAL__Group_1__1"
    // InternalSWI.g:6594:1: rule__REAL__Group_1__1 : rule__REAL__Group_1__1__Impl rule__REAL__Group_1__2 ;
    public final void rule__REAL__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6598:1: ( rule__REAL__Group_1__1__Impl rule__REAL__Group_1__2 )
            // InternalSWI.g:6599:2: rule__REAL__Group_1__1__Impl rule__REAL__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__REAL__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_1__1"


    // $ANTLR start "rule__REAL__Group_1__1__Impl"
    // InternalSWI.g:6606:1: rule__REAL__Group_1__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6610:1: ( ( '.' ) )
            // InternalSWI.g:6611:1: ( '.' )
            {
            // InternalSWI.g:6611:1: ( '.' )
            // InternalSWI.g:6612:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_1__1__Impl"


    // $ANTLR start "rule__REAL__Group_1__2"
    // InternalSWI.g:6625:1: rule__REAL__Group_1__2 : rule__REAL__Group_1__2__Impl ;
    public final void rule__REAL__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6629:1: ( rule__REAL__Group_1__2__Impl )
            // InternalSWI.g:6630:2: rule__REAL__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_1__2"


    // $ANTLR start "rule__REAL__Group_1__2__Impl"
    // InternalSWI.g:6636:1: rule__REAL__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6640:1: ( ( RULE_INT ) )
            // InternalSWI.g:6641:1: ( RULE_INT )
            {
            // InternalSWI.g:6641:1: ( RULE_INT )
            // InternalSWI.g:6642:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_1__2__Impl"


    // $ANTLR start "rule__REAL__Group_2__0"
    // InternalSWI.g:6659:1: rule__REAL__Group_2__0 : rule__REAL__Group_2__0__Impl rule__REAL__Group_2__1 ;
    public final void rule__REAL__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6663:1: ( rule__REAL__Group_2__0__Impl rule__REAL__Group_2__1 )
            // InternalSWI.g:6664:2: rule__REAL__Group_2__0__Impl rule__REAL__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__REAL__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_2__0"


    // $ANTLR start "rule__REAL__Group_2__0__Impl"
    // InternalSWI.g:6671:1: rule__REAL__Group_2__0__Impl : ( 'e' ) ;
    public final void rule__REAL__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6675:1: ( ( 'e' ) )
            // InternalSWI.g:6676:1: ( 'e' )
            {
            // InternalSWI.g:6676:1: ( 'e' )
            // InternalSWI.g:6677:1: 'e'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getEKeyword_2_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getEKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_2__0__Impl"


    // $ANTLR start "rule__REAL__Group_2__1"
    // InternalSWI.g:6690:1: rule__REAL__Group_2__1 : rule__REAL__Group_2__1__Impl rule__REAL__Group_2__2 ;
    public final void rule__REAL__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6694:1: ( rule__REAL__Group_2__1__Impl rule__REAL__Group_2__2 )
            // InternalSWI.g:6695:2: rule__REAL__Group_2__1__Impl rule__REAL__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__REAL__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_2__1"


    // $ANTLR start "rule__REAL__Group_2__1__Impl"
    // InternalSWI.g:6702:1: rule__REAL__Group_2__1__Impl : ( ( '-' )? ) ;
    public final void rule__REAL__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6706:1: ( ( ( '-' )? ) )
            // InternalSWI.g:6707:1: ( ( '-' )? )
            {
            // InternalSWI.g:6707:1: ( ( '-' )? )
            // InternalSWI.g:6708:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); 
            }
            // InternalSWI.g:6709:1: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSWI.g:6710:2: '-'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_2__1__Impl"


    // $ANTLR start "rule__REAL__Group_2__2"
    // InternalSWI.g:6721:1: rule__REAL__Group_2__2 : rule__REAL__Group_2__2__Impl ;
    public final void rule__REAL__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6725:1: ( rule__REAL__Group_2__2__Impl )
            // InternalSWI.g:6726:2: rule__REAL__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__REAL__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_2__2"


    // $ANTLR start "rule__REAL__Group_2__2__Impl"
    // InternalSWI.g:6732:1: rule__REAL__Group_2__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6736:1: ( ( RULE_INT ) )
            // InternalSWI.g:6737:1: ( RULE_INT )
            {
            // InternalSWI.g:6737:1: ( RULE_INT )
            // InternalSWI.g:6738:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group_2__2__Impl"


    // $ANTLR start "rule__MParameterValueBooleanLiteral__Group__0"
    // InternalSWI.g:6755:1: rule__MParameterValueBooleanLiteral__Group__0 : rule__MParameterValueBooleanLiteral__Group__0__Impl rule__MParameterValueBooleanLiteral__Group__1 ;
    public final void rule__MParameterValueBooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6759:1: ( rule__MParameterValueBooleanLiteral__Group__0__Impl rule__MParameterValueBooleanLiteral__Group__1 )
            // InternalSWI.g:6760:2: rule__MParameterValueBooleanLiteral__Group__0__Impl rule__MParameterValueBooleanLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__MParameterValueBooleanLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueBooleanLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueBooleanLiteral__Group__0"


    // $ANTLR start "rule__MParameterValueBooleanLiteral__Group__0__Impl"
    // InternalSWI.g:6767:1: rule__MParameterValueBooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueBooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6771:1: ( ( () ) )
            // InternalSWI.g:6772:1: ( () )
            {
            // InternalSWI.g:6772:1: ( () )
            // InternalSWI.g:6773:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0()); 
            }
            // InternalSWI.g:6774:1: ()
            // InternalSWI.g:6776:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueBooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__MParameterValueBooleanLiteral__Group__1"
    // InternalSWI.g:6786:1: rule__MParameterValueBooleanLiteral__Group__1 : rule__MParameterValueBooleanLiteral__Group__1__Impl ;
    public final void rule__MParameterValueBooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6790:1: ( rule__MParameterValueBooleanLiteral__Group__1__Impl )
            // InternalSWI.g:6791:2: rule__MParameterValueBooleanLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueBooleanLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueBooleanLiteral__Group__1"


    // $ANTLR start "rule__MParameterValueBooleanLiteral__Group__1__Impl"
    // InternalSWI.g:6797:1: rule__MParameterValueBooleanLiteral__Group__1__Impl : ( ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MParameterValueBooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6801:1: ( ( ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 ) ) )
            // InternalSWI.g:6802:1: ( ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 ) )
            {
            // InternalSWI.g:6802:1: ( ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 ) )
            // InternalSWI.g:6803:1: ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueAssignment_1()); 
            }
            // InternalSWI.g:6804:1: ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 )
            // InternalSWI.g:6804:2: rule__MParameterValueBooleanLiteral__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueBooleanLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueBooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__MParameterValueStringLiteral__Group__0"
    // InternalSWI.g:6818:1: rule__MParameterValueStringLiteral__Group__0 : rule__MParameterValueStringLiteral__Group__0__Impl rule__MParameterValueStringLiteral__Group__1 ;
    public final void rule__MParameterValueStringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6822:1: ( rule__MParameterValueStringLiteral__Group__0__Impl rule__MParameterValueStringLiteral__Group__1 )
            // InternalSWI.g:6823:2: rule__MParameterValueStringLiteral__Group__0__Impl rule__MParameterValueStringLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__MParameterValueStringLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueStringLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueStringLiteral__Group__0"


    // $ANTLR start "rule__MParameterValueStringLiteral__Group__0__Impl"
    // InternalSWI.g:6830:1: rule__MParameterValueStringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueStringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6834:1: ( ( () ) )
            // InternalSWI.g:6835:1: ( () )
            {
            // InternalSWI.g:6835:1: ( () )
            // InternalSWI.g:6836:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0()); 
            }
            // InternalSWI.g:6837:1: ()
            // InternalSWI.g:6839:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueStringLiteral__Group__0__Impl"


    // $ANTLR start "rule__MParameterValueStringLiteral__Group__1"
    // InternalSWI.g:6849:1: rule__MParameterValueStringLiteral__Group__1 : rule__MParameterValueStringLiteral__Group__1__Impl rule__MParameterValueStringLiteral__Group__2 ;
    public final void rule__MParameterValueStringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6853:1: ( rule__MParameterValueStringLiteral__Group__1__Impl rule__MParameterValueStringLiteral__Group__2 )
            // InternalSWI.g:6854:2: rule__MParameterValueStringLiteral__Group__1__Impl rule__MParameterValueStringLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__MParameterValueStringLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueStringLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueStringLiteral__Group__1"


    // $ANTLR start "rule__MParameterValueStringLiteral__Group__1__Impl"
    // InternalSWI.g:6861:1: rule__MParameterValueStringLiteral__Group__1__Impl : ( ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )? ) ;
    public final void rule__MParameterValueStringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6865:1: ( ( ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )? ) )
            // InternalSWI.g:6866:1: ( ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )? )
            {
            // InternalSWI.g:6866:1: ( ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )? )
            // InternalSWI.g:6867:1: ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawAssignment_1()); 
            }
            // InternalSWI.g:6868:1: ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSWI.g:6868:2: rule__MParameterValueStringLiteral__IsRawAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MParameterValueStringLiteral__IsRawAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueStringLiteral__Group__1__Impl"


    // $ANTLR start "rule__MParameterValueStringLiteral__Group__2"
    // InternalSWI.g:6878:1: rule__MParameterValueStringLiteral__Group__2 : rule__MParameterValueStringLiteral__Group__2__Impl ;
    public final void rule__MParameterValueStringLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6882:1: ( rule__MParameterValueStringLiteral__Group__2__Impl )
            // InternalSWI.g:6883:2: rule__MParameterValueStringLiteral__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueStringLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueStringLiteral__Group__2"


    // $ANTLR start "rule__MParameterValueStringLiteral__Group__2__Impl"
    // InternalSWI.g:6889:1: rule__MParameterValueStringLiteral__Group__2__Impl : ( ( rule__MParameterValueStringLiteral__ValueAssignment_2 ) ) ;
    public final void rule__MParameterValueStringLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6893:1: ( ( ( rule__MParameterValueStringLiteral__ValueAssignment_2 ) ) )
            // InternalSWI.g:6894:1: ( ( rule__MParameterValueStringLiteral__ValueAssignment_2 ) )
            {
            // InternalSWI.g:6894:1: ( ( rule__MParameterValueStringLiteral__ValueAssignment_2 ) )
            // InternalSWI.g:6895:1: ( rule__MParameterValueStringLiteral__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_2()); 
            }
            // InternalSWI.g:6896:1: ( rule__MParameterValueStringLiteral__ValueAssignment_2 )
            // InternalSWI.g:6896:2: rule__MParameterValueStringLiteral__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueStringLiteral__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueStringLiteral__Group__2__Impl"


    // $ANTLR start "rule__MParameterValueIntegerLiteral__Group__0"
    // InternalSWI.g:6912:1: rule__MParameterValueIntegerLiteral__Group__0 : rule__MParameterValueIntegerLiteral__Group__0__Impl rule__MParameterValueIntegerLiteral__Group__1 ;
    public final void rule__MParameterValueIntegerLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6916:1: ( rule__MParameterValueIntegerLiteral__Group__0__Impl rule__MParameterValueIntegerLiteral__Group__1 )
            // InternalSWI.g:6917:2: rule__MParameterValueIntegerLiteral__Group__0__Impl rule__MParameterValueIntegerLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__MParameterValueIntegerLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueIntegerLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueIntegerLiteral__Group__0"


    // $ANTLR start "rule__MParameterValueIntegerLiteral__Group__0__Impl"
    // InternalSWI.g:6924:1: rule__MParameterValueIntegerLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueIntegerLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6928:1: ( ( () ) )
            // InternalSWI.g:6929:1: ( () )
            {
            // InternalSWI.g:6929:1: ( () )
            // InternalSWI.g:6930:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0()); 
            }
            // InternalSWI.g:6931:1: ()
            // InternalSWI.g:6933:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueIntegerLiteral__Group__0__Impl"


    // $ANTLR start "rule__MParameterValueIntegerLiteral__Group__1"
    // InternalSWI.g:6943:1: rule__MParameterValueIntegerLiteral__Group__1 : rule__MParameterValueIntegerLiteral__Group__1__Impl ;
    public final void rule__MParameterValueIntegerLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6947:1: ( rule__MParameterValueIntegerLiteral__Group__1__Impl )
            // InternalSWI.g:6948:2: rule__MParameterValueIntegerLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueIntegerLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueIntegerLiteral__Group__1"


    // $ANTLR start "rule__MParameterValueIntegerLiteral__Group__1__Impl"
    // InternalSWI.g:6954:1: rule__MParameterValueIntegerLiteral__Group__1__Impl : ( ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MParameterValueIntegerLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6958:1: ( ( ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 ) ) )
            // InternalSWI.g:6959:1: ( ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 ) )
            {
            // InternalSWI.g:6959:1: ( ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 ) )
            // InternalSWI.g:6960:1: ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueAssignment_1()); 
            }
            // InternalSWI.g:6961:1: ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 )
            // InternalSWI.g:6961:2: rule__MParameterValueIntegerLiteral__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueIntegerLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueIntegerLiteral__Group__1__Impl"


    // $ANTLR start "rule__MParameterValueRealLiteral__Group__0"
    // InternalSWI.g:6975:1: rule__MParameterValueRealLiteral__Group__0 : rule__MParameterValueRealLiteral__Group__0__Impl rule__MParameterValueRealLiteral__Group__1 ;
    public final void rule__MParameterValueRealLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6979:1: ( rule__MParameterValueRealLiteral__Group__0__Impl rule__MParameterValueRealLiteral__Group__1 )
            // InternalSWI.g:6980:2: rule__MParameterValueRealLiteral__Group__0__Impl rule__MParameterValueRealLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__MParameterValueRealLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueRealLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRealLiteral__Group__0"


    // $ANTLR start "rule__MParameterValueRealLiteral__Group__0__Impl"
    // InternalSWI.g:6987:1: rule__MParameterValueRealLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueRealLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:6991:1: ( ( () ) )
            // InternalSWI.g:6992:1: ( () )
            {
            // InternalSWI.g:6992:1: ( () )
            // InternalSWI.g:6993:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0()); 
            }
            // InternalSWI.g:6994:1: ()
            // InternalSWI.g:6996:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRealLiteral__Group__0__Impl"


    // $ANTLR start "rule__MParameterValueRealLiteral__Group__1"
    // InternalSWI.g:7006:1: rule__MParameterValueRealLiteral__Group__1 : rule__MParameterValueRealLiteral__Group__1__Impl ;
    public final void rule__MParameterValueRealLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7010:1: ( rule__MParameterValueRealLiteral__Group__1__Impl )
            // InternalSWI.g:7011:2: rule__MParameterValueRealLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueRealLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRealLiteral__Group__1"


    // $ANTLR start "rule__MParameterValueRealLiteral__Group__1__Impl"
    // InternalSWI.g:7017:1: rule__MParameterValueRealLiteral__Group__1__Impl : ( ( rule__MParameterValueRealLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MParameterValueRealLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7021:1: ( ( ( rule__MParameterValueRealLiteral__ValueAssignment_1 ) ) )
            // InternalSWI.g:7022:1: ( ( rule__MParameterValueRealLiteral__ValueAssignment_1 ) )
            {
            // InternalSWI.g:7022:1: ( ( rule__MParameterValueRealLiteral__ValueAssignment_1 ) )
            // InternalSWI.g:7023:1: ( rule__MParameterValueRealLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRealLiteralAccess().getValueAssignment_1()); 
            }
            // InternalSWI.g:7024:1: ( rule__MParameterValueRealLiteral__ValueAssignment_1 )
            // InternalSWI.g:7024:2: rule__MParameterValueRealLiteral__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueRealLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRealLiteralAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRealLiteral__Group__1__Impl"


    // $ANTLR start "rule__MParameterValueRefObject__Group__0"
    // InternalSWI.g:7038:1: rule__MParameterValueRefObject__Group__0 : rule__MParameterValueRefObject__Group__0__Impl rule__MParameterValueRefObject__Group__1 ;
    public final void rule__MParameterValueRefObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7042:1: ( rule__MParameterValueRefObject__Group__0__Impl rule__MParameterValueRefObject__Group__1 )
            // InternalSWI.g:7043:2: rule__MParameterValueRefObject__Group__0__Impl rule__MParameterValueRefObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MParameterValueRefObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueRefObject__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRefObject__Group__0"


    // $ANTLR start "rule__MParameterValueRefObject__Group__0__Impl"
    // InternalSWI.g:7050:1: rule__MParameterValueRefObject__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueRefObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7054:1: ( ( () ) )
            // InternalSWI.g:7055:1: ( () )
            {
            // InternalSWI.g:7055:1: ( () )
            // InternalSWI.g:7056:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0()); 
            }
            // InternalSWI.g:7057:1: ()
            // InternalSWI.g:7059:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRefObject__Group__0__Impl"


    // $ANTLR start "rule__MParameterValueRefObject__Group__1"
    // InternalSWI.g:7069:1: rule__MParameterValueRefObject__Group__1 : rule__MParameterValueRefObject__Group__1__Impl ;
    public final void rule__MParameterValueRefObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7073:1: ( rule__MParameterValueRefObject__Group__1__Impl )
            // InternalSWI.g:7074:2: rule__MParameterValueRefObject__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueRefObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRefObject__Group__1"


    // $ANTLR start "rule__MParameterValueRefObject__Group__1__Impl"
    // InternalSWI.g:7080:1: rule__MParameterValueRefObject__Group__1__Impl : ( ( rule__MParameterValueRefObject__ObjectAssignment_1 ) ) ;
    public final void rule__MParameterValueRefObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7084:1: ( ( ( rule__MParameterValueRefObject__ObjectAssignment_1 ) ) )
            // InternalSWI.g:7085:1: ( ( rule__MParameterValueRefObject__ObjectAssignment_1 ) )
            {
            // InternalSWI.g:7085:1: ( ( rule__MParameterValueRefObject__ObjectAssignment_1 ) )
            // InternalSWI.g:7086:1: ( rule__MParameterValueRefObject__ObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectAccess().getObjectAssignment_1()); 
            }
            // InternalSWI.g:7087:1: ( rule__MParameterValueRefObject__ObjectAssignment_1 )
            // InternalSWI.g:7087:2: rule__MParameterValueRefObject__ObjectAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueRefObject__ObjectAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRefObjectAccess().getObjectAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRefObject__Group__1__Impl"


    // $ANTLR start "rule__MParameterValuePAR__Group__0"
    // InternalSWI.g:7101:1: rule__MParameterValuePAR__Group__0 : rule__MParameterValuePAR__Group__0__Impl rule__MParameterValuePAR__Group__1 ;
    public final void rule__MParameterValuePAR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7105:1: ( rule__MParameterValuePAR__Group__0__Impl rule__MParameterValuePAR__Group__1 )
            // InternalSWI.g:7106:2: rule__MParameterValuePAR__Group__0__Impl rule__MParameterValuePAR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterValuePAR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValuePAR__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValuePAR__Group__0"


    // $ANTLR start "rule__MParameterValuePAR__Group__0__Impl"
    // InternalSWI.g:7113:1: rule__MParameterValuePAR__Group__0__Impl : ( '(' ) ;
    public final void rule__MParameterValuePAR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7117:1: ( ( '(' ) )
            // InternalSWI.g:7118:1: ( '(' )
            {
            // InternalSWI.g:7118:1: ( '(' )
            // InternalSWI.g:7119:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValuePAR__Group__0__Impl"


    // $ANTLR start "rule__MParameterValuePAR__Group__1"
    // InternalSWI.g:7132:1: rule__MParameterValuePAR__Group__1 : rule__MParameterValuePAR__Group__1__Impl rule__MParameterValuePAR__Group__2 ;
    public final void rule__MParameterValuePAR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7136:1: ( rule__MParameterValuePAR__Group__1__Impl rule__MParameterValuePAR__Group__2 )
            // InternalSWI.g:7137:2: rule__MParameterValuePAR__Group__1__Impl rule__MParameterValuePAR__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__MParameterValuePAR__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValuePAR__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValuePAR__Group__1"


    // $ANTLR start "rule__MParameterValuePAR__Group__1__Impl"
    // InternalSWI.g:7144:1: rule__MParameterValuePAR__Group__1__Impl : ( ( rule__MParameterValuePAR__ValueAssignment_1 ) ) ;
    public final void rule__MParameterValuePAR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7148:1: ( ( ( rule__MParameterValuePAR__ValueAssignment_1 ) ) )
            // InternalSWI.g:7149:1: ( ( rule__MParameterValuePAR__ValueAssignment_1 ) )
            {
            // InternalSWI.g:7149:1: ( ( rule__MParameterValuePAR__ValueAssignment_1 ) )
            // InternalSWI.g:7150:1: ( rule__MParameterValuePAR__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValuePARAccess().getValueAssignment_1()); 
            }
            // InternalSWI.g:7151:1: ( rule__MParameterValuePAR__ValueAssignment_1 )
            // InternalSWI.g:7151:2: rule__MParameterValuePAR__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValuePAR__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValuePARAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValuePAR__Group__1__Impl"


    // $ANTLR start "rule__MParameterValuePAR__Group__2"
    // InternalSWI.g:7161:1: rule__MParameterValuePAR__Group__2 : rule__MParameterValuePAR__Group__2__Impl ;
    public final void rule__MParameterValuePAR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7165:1: ( rule__MParameterValuePAR__Group__2__Impl )
            // InternalSWI.g:7166:2: rule__MParameterValuePAR__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValuePAR__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValuePAR__Group__2"


    // $ANTLR start "rule__MParameterValuePAR__Group__2__Impl"
    // InternalSWI.g:7172:1: rule__MParameterValuePAR__Group__2__Impl : ( ')' ) ;
    public final void rule__MParameterValuePAR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7176:1: ( ( ')' ) )
            // InternalSWI.g:7177:1: ( ')' )
            {
            // InternalSWI.g:7177:1: ( ')' )
            // InternalSWI.g:7178:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValuePARAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValuePARAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValuePAR__Group__2__Impl"


    // $ANTLR start "rule__MParameterValueExpression__Group__0"
    // InternalSWI.g:7197:1: rule__MParameterValueExpression__Group__0 : rule__MParameterValueExpression__Group__0__Impl rule__MParameterValueExpression__Group__1 ;
    public final void rule__MParameterValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7201:1: ( rule__MParameterValueExpression__Group__0__Impl rule__MParameterValueExpression__Group__1 )
            // InternalSWI.g:7202:2: rule__MParameterValueExpression__Group__0__Impl rule__MParameterValueExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterValueExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group__0"


    // $ANTLR start "rule__MParameterValueExpression__Group__0__Impl"
    // InternalSWI.g:7209:1: rule__MParameterValueExpression__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7213:1: ( ( () ) )
            // InternalSWI.g:7214:1: ( () )
            {
            // InternalSWI.g:7214:1: ( () )
            // InternalSWI.g:7215:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0()); 
            }
            // InternalSWI.g:7216:1: ()
            // InternalSWI.g:7218:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group__0__Impl"


    // $ANTLR start "rule__MParameterValueExpression__Group__1"
    // InternalSWI.g:7228:1: rule__MParameterValueExpression__Group__1 : rule__MParameterValueExpression__Group__1__Impl rule__MParameterValueExpression__Group__2 ;
    public final void rule__MParameterValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7232:1: ( rule__MParameterValueExpression__Group__1__Impl rule__MParameterValueExpression__Group__2 )
            // InternalSWI.g:7233:2: rule__MParameterValueExpression__Group__1__Impl rule__MParameterValueExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__MParameterValueExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group__1"


    // $ANTLR start "rule__MParameterValueExpression__Group__1__Impl"
    // InternalSWI.g:7240:1: rule__MParameterValueExpression__Group__1__Impl : ( ( rule__MParameterValueExpression__LeftAssignment_1 ) ) ;
    public final void rule__MParameterValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7244:1: ( ( ( rule__MParameterValueExpression__LeftAssignment_1 ) ) )
            // InternalSWI.g:7245:1: ( ( rule__MParameterValueExpression__LeftAssignment_1 ) )
            {
            // InternalSWI.g:7245:1: ( ( rule__MParameterValueExpression__LeftAssignment_1 ) )
            // InternalSWI.g:7246:1: ( rule__MParameterValueExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalSWI.g:7247:1: ( rule__MParameterValueExpression__LeftAssignment_1 )
            // InternalSWI.g:7247:2: rule__MParameterValueExpression__LeftAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group__1__Impl"


    // $ANTLR start "rule__MParameterValueExpression__Group__2"
    // InternalSWI.g:7257:1: rule__MParameterValueExpression__Group__2 : rule__MParameterValueExpression__Group__2__Impl ;
    public final void rule__MParameterValueExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7261:1: ( rule__MParameterValueExpression__Group__2__Impl )
            // InternalSWI.g:7262:2: rule__MParameterValueExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group__2"


    // $ANTLR start "rule__MParameterValueExpression__Group__2__Impl"
    // InternalSWI.g:7268:1: rule__MParameterValueExpression__Group__2__Impl : ( ( rule__MParameterValueExpression__Group_2__0 )? ) ;
    public final void rule__MParameterValueExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7272:1: ( ( ( rule__MParameterValueExpression__Group_2__0 )? ) )
            // InternalSWI.g:7273:1: ( ( rule__MParameterValueExpression__Group_2__0 )? )
            {
            // InternalSWI.g:7273:1: ( ( rule__MParameterValueExpression__Group_2__0 )? )
            // InternalSWI.g:7274:1: ( rule__MParameterValueExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getGroup_2()); 
            }
            // InternalSWI.g:7275:1: ( rule__MParameterValueExpression__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=14 && LA40_0<=15)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSWI.g:7275:2: rule__MParameterValueExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MParameterValueExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group__2__Impl"


    // $ANTLR start "rule__MParameterValueExpression__Group_2__0"
    // InternalSWI.g:7291:1: rule__MParameterValueExpression__Group_2__0 : rule__MParameterValueExpression__Group_2__0__Impl rule__MParameterValueExpression__Group_2__1 ;
    public final void rule__MParameterValueExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7295:1: ( rule__MParameterValueExpression__Group_2__0__Impl rule__MParameterValueExpression__Group_2__1 )
            // InternalSWI.g:7296:2: rule__MParameterValueExpression__Group_2__0__Impl rule__MParameterValueExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterValueExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group_2__0"


    // $ANTLR start "rule__MParameterValueExpression__Group_2__0__Impl"
    // InternalSWI.g:7303:1: rule__MParameterValueExpression__Group_2__0__Impl : ( ( rule__MParameterValueExpression__OperationAssignment_2_0 ) ) ;
    public final void rule__MParameterValueExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7307:1: ( ( ( rule__MParameterValueExpression__OperationAssignment_2_0 ) ) )
            // InternalSWI.g:7308:1: ( ( rule__MParameterValueExpression__OperationAssignment_2_0 ) )
            {
            // InternalSWI.g:7308:1: ( ( rule__MParameterValueExpression__OperationAssignment_2_0 ) )
            // InternalSWI.g:7309:1: ( rule__MParameterValueExpression__OperationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getOperationAssignment_2_0()); 
            }
            // InternalSWI.g:7310:1: ( rule__MParameterValueExpression__OperationAssignment_2_0 )
            // InternalSWI.g:7310:2: rule__MParameterValueExpression__OperationAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpression__OperationAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionAccess().getOperationAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group_2__0__Impl"


    // $ANTLR start "rule__MParameterValueExpression__Group_2__1"
    // InternalSWI.g:7320:1: rule__MParameterValueExpression__Group_2__1 : rule__MParameterValueExpression__Group_2__1__Impl ;
    public final void rule__MParameterValueExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7324:1: ( rule__MParameterValueExpression__Group_2__1__Impl )
            // InternalSWI.g:7325:2: rule__MParameterValueExpression__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group_2__1"


    // $ANTLR start "rule__MParameterValueExpression__Group_2__1__Impl"
    // InternalSWI.g:7331:1: rule__MParameterValueExpression__Group_2__1__Impl : ( ( rule__MParameterValueExpression__RightAssignment_2_1 ) ) ;
    public final void rule__MParameterValueExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7335:1: ( ( ( rule__MParameterValueExpression__RightAssignment_2_1 ) ) )
            // InternalSWI.g:7336:1: ( ( rule__MParameterValueExpression__RightAssignment_2_1 ) )
            {
            // InternalSWI.g:7336:1: ( ( rule__MParameterValueExpression__RightAssignment_2_1 ) )
            // InternalSWI.g:7337:1: ( rule__MParameterValueExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getRightAssignment_2_1()); 
            }
            // InternalSWI.g:7338:1: ( rule__MParameterValueExpression__RightAssignment_2_1 )
            // InternalSWI.g:7338:2: rule__MParameterValueExpression__RightAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueExpression__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionAccess().getRightAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__Group_2__1__Impl"


    // $ANTLR start "rule__MParameterValueTERM__Group__0"
    // InternalSWI.g:7352:1: rule__MParameterValueTERM__Group__0 : rule__MParameterValueTERM__Group__0__Impl rule__MParameterValueTERM__Group__1 ;
    public final void rule__MParameterValueTERM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7356:1: ( rule__MParameterValueTERM__Group__0__Impl rule__MParameterValueTERM__Group__1 )
            // InternalSWI.g:7357:2: rule__MParameterValueTERM__Group__0__Impl rule__MParameterValueTERM__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterValueTERM__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERM__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group__0"


    // $ANTLR start "rule__MParameterValueTERM__Group__0__Impl"
    // InternalSWI.g:7364:1: rule__MParameterValueTERM__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueTERM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7368:1: ( ( () ) )
            // InternalSWI.g:7369:1: ( () )
            {
            // InternalSWI.g:7369:1: ( () )
            // InternalSWI.g:7370:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0()); 
            }
            // InternalSWI.g:7371:1: ()
            // InternalSWI.g:7373:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group__0__Impl"


    // $ANTLR start "rule__MParameterValueTERM__Group__1"
    // InternalSWI.g:7383:1: rule__MParameterValueTERM__Group__1 : rule__MParameterValueTERM__Group__1__Impl rule__MParameterValueTERM__Group__2 ;
    public final void rule__MParameterValueTERM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7387:1: ( rule__MParameterValueTERM__Group__1__Impl rule__MParameterValueTERM__Group__2 )
            // InternalSWI.g:7388:2: rule__MParameterValueTERM__Group__1__Impl rule__MParameterValueTERM__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__MParameterValueTERM__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERM__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group__1"


    // $ANTLR start "rule__MParameterValueTERM__Group__1__Impl"
    // InternalSWI.g:7395:1: rule__MParameterValueTERM__Group__1__Impl : ( ( rule__MParameterValueTERM__LeftAssignment_1 ) ) ;
    public final void rule__MParameterValueTERM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7399:1: ( ( ( rule__MParameterValueTERM__LeftAssignment_1 ) ) )
            // InternalSWI.g:7400:1: ( ( rule__MParameterValueTERM__LeftAssignment_1 ) )
            {
            // InternalSWI.g:7400:1: ( ( rule__MParameterValueTERM__LeftAssignment_1 ) )
            // InternalSWI.g:7401:1: ( rule__MParameterValueTERM__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getLeftAssignment_1()); 
            }
            // InternalSWI.g:7402:1: ( rule__MParameterValueTERM__LeftAssignment_1 )
            // InternalSWI.g:7402:2: rule__MParameterValueTERM__LeftAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERM__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group__1__Impl"


    // $ANTLR start "rule__MParameterValueTERM__Group__2"
    // InternalSWI.g:7412:1: rule__MParameterValueTERM__Group__2 : rule__MParameterValueTERM__Group__2__Impl ;
    public final void rule__MParameterValueTERM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7416:1: ( rule__MParameterValueTERM__Group__2__Impl )
            // InternalSWI.g:7417:2: rule__MParameterValueTERM__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERM__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group__2"


    // $ANTLR start "rule__MParameterValueTERM__Group__2__Impl"
    // InternalSWI.g:7423:1: rule__MParameterValueTERM__Group__2__Impl : ( ( rule__MParameterValueTERM__Group_2__0 )? ) ;
    public final void rule__MParameterValueTERM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7427:1: ( ( ( rule__MParameterValueTERM__Group_2__0 )? ) )
            // InternalSWI.g:7428:1: ( ( rule__MParameterValueTERM__Group_2__0 )? )
            {
            // InternalSWI.g:7428:1: ( ( rule__MParameterValueTERM__Group_2__0 )? )
            // InternalSWI.g:7429:1: ( rule__MParameterValueTERM__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getGroup_2()); 
            }
            // InternalSWI.g:7430:1: ( rule__MParameterValueTERM__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=16 && LA41_0<=17)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSWI.g:7430:2: rule__MParameterValueTERM__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MParameterValueTERM__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group__2__Impl"


    // $ANTLR start "rule__MParameterValueTERM__Group_2__0"
    // InternalSWI.g:7446:1: rule__MParameterValueTERM__Group_2__0 : rule__MParameterValueTERM__Group_2__0__Impl rule__MParameterValueTERM__Group_2__1 ;
    public final void rule__MParameterValueTERM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7450:1: ( rule__MParameterValueTERM__Group_2__0__Impl rule__MParameterValueTERM__Group_2__1 )
            // InternalSWI.g:7451:2: rule__MParameterValueTERM__Group_2__0__Impl rule__MParameterValueTERM__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterValueTERM__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERM__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group_2__0"


    // $ANTLR start "rule__MParameterValueTERM__Group_2__0__Impl"
    // InternalSWI.g:7458:1: rule__MParameterValueTERM__Group_2__0__Impl : ( ( rule__MParameterValueTERM__OperationAssignment_2_0 ) ) ;
    public final void rule__MParameterValueTERM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7462:1: ( ( ( rule__MParameterValueTERM__OperationAssignment_2_0 ) ) )
            // InternalSWI.g:7463:1: ( ( rule__MParameterValueTERM__OperationAssignment_2_0 ) )
            {
            // InternalSWI.g:7463:1: ( ( rule__MParameterValueTERM__OperationAssignment_2_0 ) )
            // InternalSWI.g:7464:1: ( rule__MParameterValueTERM__OperationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getOperationAssignment_2_0()); 
            }
            // InternalSWI.g:7465:1: ( rule__MParameterValueTERM__OperationAssignment_2_0 )
            // InternalSWI.g:7465:2: rule__MParameterValueTERM__OperationAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERM__OperationAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMAccess().getOperationAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group_2__0__Impl"


    // $ANTLR start "rule__MParameterValueTERM__Group_2__1"
    // InternalSWI.g:7475:1: rule__MParameterValueTERM__Group_2__1 : rule__MParameterValueTERM__Group_2__1__Impl ;
    public final void rule__MParameterValueTERM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7479:1: ( rule__MParameterValueTERM__Group_2__1__Impl )
            // InternalSWI.g:7480:2: rule__MParameterValueTERM__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERM__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group_2__1"


    // $ANTLR start "rule__MParameterValueTERM__Group_2__1__Impl"
    // InternalSWI.g:7486:1: rule__MParameterValueTERM__Group_2__1__Impl : ( ( rule__MParameterValueTERM__RightAssignment_2_1 ) ) ;
    public final void rule__MParameterValueTERM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7490:1: ( ( ( rule__MParameterValueTERM__RightAssignment_2_1 ) ) )
            // InternalSWI.g:7491:1: ( ( rule__MParameterValueTERM__RightAssignment_2_1 ) )
            {
            // InternalSWI.g:7491:1: ( ( rule__MParameterValueTERM__RightAssignment_2_1 ) )
            // InternalSWI.g:7492:1: ( rule__MParameterValueTERM__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getRightAssignment_2_1()); 
            }
            // InternalSWI.g:7493:1: ( rule__MParameterValueTERM__RightAssignment_2_1 )
            // InternalSWI.g:7493:2: rule__MParameterValueTERM__RightAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterValueTERM__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMAccess().getRightAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__Group_2__1__Impl"


    // $ANTLR start "rule__MParameterOCR__Group__0"
    // InternalSWI.g:7507:1: rule__MParameterOCR__Group__0 : rule__MParameterOCR__Group__0__Impl rule__MParameterOCR__Group__1 ;
    public final void rule__MParameterOCR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7511:1: ( rule__MParameterOCR__Group__0__Impl rule__MParameterOCR__Group__1 )
            // InternalSWI.g:7512:2: rule__MParameterOCR__Group__0__Impl rule__MParameterOCR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__MParameterOCR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOCR__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__0"


    // $ANTLR start "rule__MParameterOCR__Group__0__Impl"
    // InternalSWI.g:7519:1: rule__MParameterOCR__Group__0__Impl : ( () ) ;
    public final void rule__MParameterOCR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7523:1: ( ( () ) )
            // InternalSWI.g:7524:1: ( () )
            {
            // InternalSWI.g:7524:1: ( () )
            // InternalSWI.g:7525:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0()); 
            }
            // InternalSWI.g:7526:1: ()
            // InternalSWI.g:7528:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__0__Impl"


    // $ANTLR start "rule__MParameterOCR__Group__1"
    // InternalSWI.g:7538:1: rule__MParameterOCR__Group__1 : rule__MParameterOCR__Group__1__Impl rule__MParameterOCR__Group__2 ;
    public final void rule__MParameterOCR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7542:1: ( rule__MParameterOCR__Group__1__Impl rule__MParameterOCR__Group__2 )
            // InternalSWI.g:7543:2: rule__MParameterOCR__Group__1__Impl rule__MParameterOCR__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterOCR__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOCR__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__1"


    // $ANTLR start "rule__MParameterOCR__Group__1__Impl"
    // InternalSWI.g:7550:1: rule__MParameterOCR__Group__1__Impl : ( '(' ) ;
    public final void rule__MParameterOCR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7554:1: ( ( '(' ) )
            // InternalSWI.g:7555:1: ( '(' )
            {
            // InternalSWI.g:7555:1: ( '(' )
            // InternalSWI.g:7556:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__1__Impl"


    // $ANTLR start "rule__MParameterOCR__Group__2"
    // InternalSWI.g:7569:1: rule__MParameterOCR__Group__2 : rule__MParameterOCR__Group__2__Impl rule__MParameterOCR__Group__3 ;
    public final void rule__MParameterOCR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7573:1: ( rule__MParameterOCR__Group__2__Impl rule__MParameterOCR__Group__3 )
            // InternalSWI.g:7574:2: rule__MParameterOCR__Group__2__Impl rule__MParameterOCR__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MParameterOCR__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOCR__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__2"


    // $ANTLR start "rule__MParameterOCR__Group__2__Impl"
    // InternalSWI.g:7581:1: rule__MParameterOCR__Group__2__Impl : ( ( rule__MParameterOCR__LowerValueAssignment_2 ) ) ;
    public final void rule__MParameterOCR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7585:1: ( ( ( rule__MParameterOCR__LowerValueAssignment_2 ) ) )
            // InternalSWI.g:7586:1: ( ( rule__MParameterOCR__LowerValueAssignment_2 ) )
            {
            // InternalSWI.g:7586:1: ( ( rule__MParameterOCR__LowerValueAssignment_2 ) )
            // InternalSWI.g:7587:1: ( rule__MParameterOCR__LowerValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getLowerValueAssignment_2()); 
            }
            // InternalSWI.g:7588:1: ( rule__MParameterOCR__LowerValueAssignment_2 )
            // InternalSWI.g:7588:2: rule__MParameterOCR__LowerValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOCR__LowerValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRAccess().getLowerValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__2__Impl"


    // $ANTLR start "rule__MParameterOCR__Group__3"
    // InternalSWI.g:7598:1: rule__MParameterOCR__Group__3 : rule__MParameterOCR__Group__3__Impl rule__MParameterOCR__Group__4 ;
    public final void rule__MParameterOCR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7602:1: ( rule__MParameterOCR__Group__3__Impl rule__MParameterOCR__Group__4 )
            // InternalSWI.g:7603:2: rule__MParameterOCR__Group__3__Impl rule__MParameterOCR__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterOCR__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOCR__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__3"


    // $ANTLR start "rule__MParameterOCR__Group__3__Impl"
    // InternalSWI.g:7610:1: rule__MParameterOCR__Group__3__Impl : ( ',' ) ;
    public final void rule__MParameterOCR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7614:1: ( ( ',' ) )
            // InternalSWI.g:7615:1: ( ',' )
            {
            // InternalSWI.g:7615:1: ( ',' )
            // InternalSWI.g:7616:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getCommaKeyword_3()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__3__Impl"


    // $ANTLR start "rule__MParameterOCR__Group__4"
    // InternalSWI.g:7629:1: rule__MParameterOCR__Group__4 : rule__MParameterOCR__Group__4__Impl rule__MParameterOCR__Group__5 ;
    public final void rule__MParameterOCR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7633:1: ( rule__MParameterOCR__Group__4__Impl rule__MParameterOCR__Group__5 )
            // InternalSWI.g:7634:2: rule__MParameterOCR__Group__4__Impl rule__MParameterOCR__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__MParameterOCR__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOCR__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__4"


    // $ANTLR start "rule__MParameterOCR__Group__4__Impl"
    // InternalSWI.g:7641:1: rule__MParameterOCR__Group__4__Impl : ( ( rule__MParameterOCR__UpperValueAssignment_4 ) ) ;
    public final void rule__MParameterOCR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7645:1: ( ( ( rule__MParameterOCR__UpperValueAssignment_4 ) ) )
            // InternalSWI.g:7646:1: ( ( rule__MParameterOCR__UpperValueAssignment_4 ) )
            {
            // InternalSWI.g:7646:1: ( ( rule__MParameterOCR__UpperValueAssignment_4 ) )
            // InternalSWI.g:7647:1: ( rule__MParameterOCR__UpperValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getUpperValueAssignment_4()); 
            }
            // InternalSWI.g:7648:1: ( rule__MParameterOCR__UpperValueAssignment_4 )
            // InternalSWI.g:7648:2: rule__MParameterOCR__UpperValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOCR__UpperValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRAccess().getUpperValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__4__Impl"


    // $ANTLR start "rule__MParameterOCR__Group__5"
    // InternalSWI.g:7658:1: rule__MParameterOCR__Group__5 : rule__MParameterOCR__Group__5__Impl ;
    public final void rule__MParameterOCR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7662:1: ( rule__MParameterOCR__Group__5__Impl )
            // InternalSWI.g:7663:2: rule__MParameterOCR__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOCR__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__5"


    // $ANTLR start "rule__MParameterOCR__Group__5__Impl"
    // InternalSWI.g:7669:1: rule__MParameterOCR__Group__5__Impl : ( ']' ) ;
    public final void rule__MParameterOCR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7673:1: ( ( ']' ) )
            // InternalSWI.g:7674:1: ( ']' )
            {
            // InternalSWI.g:7674:1: ( ']' )
            // InternalSWI.g:7675:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRAccess().getRightSquareBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__Group__5__Impl"


    // $ANTLR start "rule__MParameterOOR__Group__0"
    // InternalSWI.g:7700:1: rule__MParameterOOR__Group__0 : rule__MParameterOOR__Group__0__Impl rule__MParameterOOR__Group__1 ;
    public final void rule__MParameterOOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7704:1: ( rule__MParameterOOR__Group__0__Impl rule__MParameterOOR__Group__1 )
            // InternalSWI.g:7705:2: rule__MParameterOOR__Group__0__Impl rule__MParameterOOR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__MParameterOOR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOOR__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__0"


    // $ANTLR start "rule__MParameterOOR__Group__0__Impl"
    // InternalSWI.g:7712:1: rule__MParameterOOR__Group__0__Impl : ( () ) ;
    public final void rule__MParameterOOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7716:1: ( ( () ) )
            // InternalSWI.g:7717:1: ( () )
            {
            // InternalSWI.g:7717:1: ( () )
            // InternalSWI.g:7718:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getMParameterOORAction_0()); 
            }
            // InternalSWI.g:7719:1: ()
            // InternalSWI.g:7721:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORAccess().getMParameterOORAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__0__Impl"


    // $ANTLR start "rule__MParameterOOR__Group__1"
    // InternalSWI.g:7731:1: rule__MParameterOOR__Group__1 : rule__MParameterOOR__Group__1__Impl rule__MParameterOOR__Group__2 ;
    public final void rule__MParameterOOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7735:1: ( rule__MParameterOOR__Group__1__Impl rule__MParameterOOR__Group__2 )
            // InternalSWI.g:7736:2: rule__MParameterOOR__Group__1__Impl rule__MParameterOOR__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterOOR__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOOR__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__1"


    // $ANTLR start "rule__MParameterOOR__Group__1__Impl"
    // InternalSWI.g:7743:1: rule__MParameterOOR__Group__1__Impl : ( '(' ) ;
    public final void rule__MParameterOOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7747:1: ( ( '(' ) )
            // InternalSWI.g:7748:1: ( '(' )
            {
            // InternalSWI.g:7748:1: ( '(' )
            // InternalSWI.g:7749:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__1__Impl"


    // $ANTLR start "rule__MParameterOOR__Group__2"
    // InternalSWI.g:7762:1: rule__MParameterOOR__Group__2 : rule__MParameterOOR__Group__2__Impl rule__MParameterOOR__Group__3 ;
    public final void rule__MParameterOOR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7766:1: ( rule__MParameterOOR__Group__2__Impl rule__MParameterOOR__Group__3 )
            // InternalSWI.g:7767:2: rule__MParameterOOR__Group__2__Impl rule__MParameterOOR__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MParameterOOR__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOOR__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__2"


    // $ANTLR start "rule__MParameterOOR__Group__2__Impl"
    // InternalSWI.g:7774:1: rule__MParameterOOR__Group__2__Impl : ( ( rule__MParameterOOR__LowerValueAssignment_2 ) ) ;
    public final void rule__MParameterOOR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7778:1: ( ( ( rule__MParameterOOR__LowerValueAssignment_2 ) ) )
            // InternalSWI.g:7779:1: ( ( rule__MParameterOOR__LowerValueAssignment_2 ) )
            {
            // InternalSWI.g:7779:1: ( ( rule__MParameterOOR__LowerValueAssignment_2 ) )
            // InternalSWI.g:7780:1: ( rule__MParameterOOR__LowerValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getLowerValueAssignment_2()); 
            }
            // InternalSWI.g:7781:1: ( rule__MParameterOOR__LowerValueAssignment_2 )
            // InternalSWI.g:7781:2: rule__MParameterOOR__LowerValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOOR__LowerValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORAccess().getLowerValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__2__Impl"


    // $ANTLR start "rule__MParameterOOR__Group__3"
    // InternalSWI.g:7791:1: rule__MParameterOOR__Group__3 : rule__MParameterOOR__Group__3__Impl rule__MParameterOOR__Group__4 ;
    public final void rule__MParameterOOR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7795:1: ( rule__MParameterOOR__Group__3__Impl rule__MParameterOOR__Group__4 )
            // InternalSWI.g:7796:2: rule__MParameterOOR__Group__3__Impl rule__MParameterOOR__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterOOR__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOOR__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__3"


    // $ANTLR start "rule__MParameterOOR__Group__3__Impl"
    // InternalSWI.g:7803:1: rule__MParameterOOR__Group__3__Impl : ( ',' ) ;
    public final void rule__MParameterOOR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7807:1: ( ( ',' ) )
            // InternalSWI.g:7808:1: ( ',' )
            {
            // InternalSWI.g:7808:1: ( ',' )
            // InternalSWI.g:7809:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getCommaKeyword_3()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__3__Impl"


    // $ANTLR start "rule__MParameterOOR__Group__4"
    // InternalSWI.g:7822:1: rule__MParameterOOR__Group__4 : rule__MParameterOOR__Group__4__Impl rule__MParameterOOR__Group__5 ;
    public final void rule__MParameterOOR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7826:1: ( rule__MParameterOOR__Group__4__Impl rule__MParameterOOR__Group__5 )
            // InternalSWI.g:7827:2: rule__MParameterOOR__Group__4__Impl rule__MParameterOOR__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__MParameterOOR__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOOR__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__4"


    // $ANTLR start "rule__MParameterOOR__Group__4__Impl"
    // InternalSWI.g:7834:1: rule__MParameterOOR__Group__4__Impl : ( ( rule__MParameterOOR__UpperValueAssignment_4 ) ) ;
    public final void rule__MParameterOOR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7838:1: ( ( ( rule__MParameterOOR__UpperValueAssignment_4 ) ) )
            // InternalSWI.g:7839:1: ( ( rule__MParameterOOR__UpperValueAssignment_4 ) )
            {
            // InternalSWI.g:7839:1: ( ( rule__MParameterOOR__UpperValueAssignment_4 ) )
            // InternalSWI.g:7840:1: ( rule__MParameterOOR__UpperValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getUpperValueAssignment_4()); 
            }
            // InternalSWI.g:7841:1: ( rule__MParameterOOR__UpperValueAssignment_4 )
            // InternalSWI.g:7841:2: rule__MParameterOOR__UpperValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOOR__UpperValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORAccess().getUpperValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__4__Impl"


    // $ANTLR start "rule__MParameterOOR__Group__5"
    // InternalSWI.g:7851:1: rule__MParameterOOR__Group__5 : rule__MParameterOOR__Group__5__Impl ;
    public final void rule__MParameterOOR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7855:1: ( rule__MParameterOOR__Group__5__Impl )
            // InternalSWI.g:7856:2: rule__MParameterOOR__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterOOR__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__5"


    // $ANTLR start "rule__MParameterOOR__Group__5__Impl"
    // InternalSWI.g:7862:1: rule__MParameterOOR__Group__5__Impl : ( ')' ) ;
    public final void rule__MParameterOOR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7866:1: ( ( ')' ) )
            // InternalSWI.g:7867:1: ( ')' )
            {
            // InternalSWI.g:7867:1: ( ')' )
            // InternalSWI.g:7868:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__Group__5__Impl"


    // $ANTLR start "rule__MParameterCOR__Group__0"
    // InternalSWI.g:7893:1: rule__MParameterCOR__Group__0 : rule__MParameterCOR__Group__0__Impl rule__MParameterCOR__Group__1 ;
    public final void rule__MParameterCOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7897:1: ( rule__MParameterCOR__Group__0__Impl rule__MParameterCOR__Group__1 )
            // InternalSWI.g:7898:2: rule__MParameterCOR__Group__0__Impl rule__MParameterCOR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_53);
            rule__MParameterCOR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCOR__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__0"


    // $ANTLR start "rule__MParameterCOR__Group__0__Impl"
    // InternalSWI.g:7905:1: rule__MParameterCOR__Group__0__Impl : ( () ) ;
    public final void rule__MParameterCOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7909:1: ( ( () ) )
            // InternalSWI.g:7910:1: ( () )
            {
            // InternalSWI.g:7910:1: ( () )
            // InternalSWI.g:7911:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getMParameterCORAction_0()); 
            }
            // InternalSWI.g:7912:1: ()
            // InternalSWI.g:7914:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORAccess().getMParameterCORAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__0__Impl"


    // $ANTLR start "rule__MParameterCOR__Group__1"
    // InternalSWI.g:7924:1: rule__MParameterCOR__Group__1 : rule__MParameterCOR__Group__1__Impl rule__MParameterCOR__Group__2 ;
    public final void rule__MParameterCOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7928:1: ( rule__MParameterCOR__Group__1__Impl rule__MParameterCOR__Group__2 )
            // InternalSWI.g:7929:2: rule__MParameterCOR__Group__1__Impl rule__MParameterCOR__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterCOR__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCOR__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__1"


    // $ANTLR start "rule__MParameterCOR__Group__1__Impl"
    // InternalSWI.g:7936:1: rule__MParameterCOR__Group__1__Impl : ( '[' ) ;
    public final void rule__MParameterCOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7940:1: ( ( '[' ) )
            // InternalSWI.g:7941:1: ( '[' )
            {
            // InternalSWI.g:7941:1: ( '[' )
            // InternalSWI.g:7942:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__1__Impl"


    // $ANTLR start "rule__MParameterCOR__Group__2"
    // InternalSWI.g:7955:1: rule__MParameterCOR__Group__2 : rule__MParameterCOR__Group__2__Impl rule__MParameterCOR__Group__3 ;
    public final void rule__MParameterCOR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7959:1: ( rule__MParameterCOR__Group__2__Impl rule__MParameterCOR__Group__3 )
            // InternalSWI.g:7960:2: rule__MParameterCOR__Group__2__Impl rule__MParameterCOR__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MParameterCOR__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCOR__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__2"


    // $ANTLR start "rule__MParameterCOR__Group__2__Impl"
    // InternalSWI.g:7967:1: rule__MParameterCOR__Group__2__Impl : ( ( rule__MParameterCOR__LowerValueAssignment_2 ) ) ;
    public final void rule__MParameterCOR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7971:1: ( ( ( rule__MParameterCOR__LowerValueAssignment_2 ) ) )
            // InternalSWI.g:7972:1: ( ( rule__MParameterCOR__LowerValueAssignment_2 ) )
            {
            // InternalSWI.g:7972:1: ( ( rule__MParameterCOR__LowerValueAssignment_2 ) )
            // InternalSWI.g:7973:1: ( rule__MParameterCOR__LowerValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getLowerValueAssignment_2()); 
            }
            // InternalSWI.g:7974:1: ( rule__MParameterCOR__LowerValueAssignment_2 )
            // InternalSWI.g:7974:2: rule__MParameterCOR__LowerValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCOR__LowerValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORAccess().getLowerValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__2__Impl"


    // $ANTLR start "rule__MParameterCOR__Group__3"
    // InternalSWI.g:7984:1: rule__MParameterCOR__Group__3 : rule__MParameterCOR__Group__3__Impl rule__MParameterCOR__Group__4 ;
    public final void rule__MParameterCOR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:7988:1: ( rule__MParameterCOR__Group__3__Impl rule__MParameterCOR__Group__4 )
            // InternalSWI.g:7989:2: rule__MParameterCOR__Group__3__Impl rule__MParameterCOR__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterCOR__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCOR__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__3"


    // $ANTLR start "rule__MParameterCOR__Group__3__Impl"
    // InternalSWI.g:7996:1: rule__MParameterCOR__Group__3__Impl : ( ',' ) ;
    public final void rule__MParameterCOR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8000:1: ( ( ',' ) )
            // InternalSWI.g:8001:1: ( ',' )
            {
            // InternalSWI.g:8001:1: ( ',' )
            // InternalSWI.g:8002:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getCommaKeyword_3()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__3__Impl"


    // $ANTLR start "rule__MParameterCOR__Group__4"
    // InternalSWI.g:8015:1: rule__MParameterCOR__Group__4 : rule__MParameterCOR__Group__4__Impl rule__MParameterCOR__Group__5 ;
    public final void rule__MParameterCOR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8019:1: ( rule__MParameterCOR__Group__4__Impl rule__MParameterCOR__Group__5 )
            // InternalSWI.g:8020:2: rule__MParameterCOR__Group__4__Impl rule__MParameterCOR__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__MParameterCOR__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCOR__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__4"


    // $ANTLR start "rule__MParameterCOR__Group__4__Impl"
    // InternalSWI.g:8027:1: rule__MParameterCOR__Group__4__Impl : ( ( rule__MParameterCOR__UpperValueAssignment_4 ) ) ;
    public final void rule__MParameterCOR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8031:1: ( ( ( rule__MParameterCOR__UpperValueAssignment_4 ) ) )
            // InternalSWI.g:8032:1: ( ( rule__MParameterCOR__UpperValueAssignment_4 ) )
            {
            // InternalSWI.g:8032:1: ( ( rule__MParameterCOR__UpperValueAssignment_4 ) )
            // InternalSWI.g:8033:1: ( rule__MParameterCOR__UpperValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getUpperValueAssignment_4()); 
            }
            // InternalSWI.g:8034:1: ( rule__MParameterCOR__UpperValueAssignment_4 )
            // InternalSWI.g:8034:2: rule__MParameterCOR__UpperValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCOR__UpperValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORAccess().getUpperValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__4__Impl"


    // $ANTLR start "rule__MParameterCOR__Group__5"
    // InternalSWI.g:8044:1: rule__MParameterCOR__Group__5 : rule__MParameterCOR__Group__5__Impl ;
    public final void rule__MParameterCOR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8048:1: ( rule__MParameterCOR__Group__5__Impl )
            // InternalSWI.g:8049:2: rule__MParameterCOR__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCOR__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__5"


    // $ANTLR start "rule__MParameterCOR__Group__5__Impl"
    // InternalSWI.g:8055:1: rule__MParameterCOR__Group__5__Impl : ( ')' ) ;
    public final void rule__MParameterCOR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8059:1: ( ( ')' ) )
            // InternalSWI.g:8060:1: ( ')' )
            {
            // InternalSWI.g:8060:1: ( ')' )
            // InternalSWI.g:8061:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__Group__5__Impl"


    // $ANTLR start "rule__MParameterCCR__Group__0"
    // InternalSWI.g:8086:1: rule__MParameterCCR__Group__0 : rule__MParameterCCR__Group__0__Impl rule__MParameterCCR__Group__1 ;
    public final void rule__MParameterCCR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8090:1: ( rule__MParameterCCR__Group__0__Impl rule__MParameterCCR__Group__1 )
            // InternalSWI.g:8091:2: rule__MParameterCCR__Group__0__Impl rule__MParameterCCR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__MParameterCCR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCCR__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__0"


    // $ANTLR start "rule__MParameterCCR__Group__0__Impl"
    // InternalSWI.g:8098:1: rule__MParameterCCR__Group__0__Impl : ( () ) ;
    public final void rule__MParameterCCR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8102:1: ( ( () ) )
            // InternalSWI.g:8103:1: ( () )
            {
            // InternalSWI.g:8103:1: ( () )
            // InternalSWI.g:8104:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0()); 
            }
            // InternalSWI.g:8105:1: ()
            // InternalSWI.g:8107:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__0__Impl"


    // $ANTLR start "rule__MParameterCCR__Group__1"
    // InternalSWI.g:8117:1: rule__MParameterCCR__Group__1 : rule__MParameterCCR__Group__1__Impl rule__MParameterCCR__Group__2 ;
    public final void rule__MParameterCCR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8121:1: ( rule__MParameterCCR__Group__1__Impl rule__MParameterCCR__Group__2 )
            // InternalSWI.g:8122:2: rule__MParameterCCR__Group__1__Impl rule__MParameterCCR__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterCCR__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCCR__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__1"


    // $ANTLR start "rule__MParameterCCR__Group__1__Impl"
    // InternalSWI.g:8129:1: rule__MParameterCCR__Group__1__Impl : ( '[' ) ;
    public final void rule__MParameterCCR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8133:1: ( ( '[' ) )
            // InternalSWI.g:8134:1: ( '[' )
            {
            // InternalSWI.g:8134:1: ( '[' )
            // InternalSWI.g:8135:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__1__Impl"


    // $ANTLR start "rule__MParameterCCR__Group__2"
    // InternalSWI.g:8148:1: rule__MParameterCCR__Group__2 : rule__MParameterCCR__Group__2__Impl rule__MParameterCCR__Group__3 ;
    public final void rule__MParameterCCR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8152:1: ( rule__MParameterCCR__Group__2__Impl rule__MParameterCCR__Group__3 )
            // InternalSWI.g:8153:2: rule__MParameterCCR__Group__2__Impl rule__MParameterCCR__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MParameterCCR__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCCR__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__2"


    // $ANTLR start "rule__MParameterCCR__Group__2__Impl"
    // InternalSWI.g:8160:1: rule__MParameterCCR__Group__2__Impl : ( ( rule__MParameterCCR__LowerValueAssignment_2 ) ) ;
    public final void rule__MParameterCCR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8164:1: ( ( ( rule__MParameterCCR__LowerValueAssignment_2 ) ) )
            // InternalSWI.g:8165:1: ( ( rule__MParameterCCR__LowerValueAssignment_2 ) )
            {
            // InternalSWI.g:8165:1: ( ( rule__MParameterCCR__LowerValueAssignment_2 ) )
            // InternalSWI.g:8166:1: ( rule__MParameterCCR__LowerValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getLowerValueAssignment_2()); 
            }
            // InternalSWI.g:8167:1: ( rule__MParameterCCR__LowerValueAssignment_2 )
            // InternalSWI.g:8167:2: rule__MParameterCCR__LowerValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCCR__LowerValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRAccess().getLowerValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__2__Impl"


    // $ANTLR start "rule__MParameterCCR__Group__3"
    // InternalSWI.g:8177:1: rule__MParameterCCR__Group__3 : rule__MParameterCCR__Group__3__Impl rule__MParameterCCR__Group__4 ;
    public final void rule__MParameterCCR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8181:1: ( rule__MParameterCCR__Group__3__Impl rule__MParameterCCR__Group__4 )
            // InternalSWI.g:8182:2: rule__MParameterCCR__Group__3__Impl rule__MParameterCCR__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MParameterCCR__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCCR__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__3"


    // $ANTLR start "rule__MParameterCCR__Group__3__Impl"
    // InternalSWI.g:8189:1: rule__MParameterCCR__Group__3__Impl : ( ',' ) ;
    public final void rule__MParameterCCR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8193:1: ( ( ',' ) )
            // InternalSWI.g:8194:1: ( ',' )
            {
            // InternalSWI.g:8194:1: ( ',' )
            // InternalSWI.g:8195:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getCommaKeyword_3()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__3__Impl"


    // $ANTLR start "rule__MParameterCCR__Group__4"
    // InternalSWI.g:8208:1: rule__MParameterCCR__Group__4 : rule__MParameterCCR__Group__4__Impl rule__MParameterCCR__Group__5 ;
    public final void rule__MParameterCCR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8212:1: ( rule__MParameterCCR__Group__4__Impl rule__MParameterCCR__Group__5 )
            // InternalSWI.g:8213:2: rule__MParameterCCR__Group__4__Impl rule__MParameterCCR__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__MParameterCCR__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCCR__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__4"


    // $ANTLR start "rule__MParameterCCR__Group__4__Impl"
    // InternalSWI.g:8220:1: rule__MParameterCCR__Group__4__Impl : ( ( rule__MParameterCCR__UpperValueAssignment_4 ) ) ;
    public final void rule__MParameterCCR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8224:1: ( ( ( rule__MParameterCCR__UpperValueAssignment_4 ) ) )
            // InternalSWI.g:8225:1: ( ( rule__MParameterCCR__UpperValueAssignment_4 ) )
            {
            // InternalSWI.g:8225:1: ( ( rule__MParameterCCR__UpperValueAssignment_4 ) )
            // InternalSWI.g:8226:1: ( rule__MParameterCCR__UpperValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getUpperValueAssignment_4()); 
            }
            // InternalSWI.g:8227:1: ( rule__MParameterCCR__UpperValueAssignment_4 )
            // InternalSWI.g:8227:2: rule__MParameterCCR__UpperValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCCR__UpperValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRAccess().getUpperValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__4__Impl"


    // $ANTLR start "rule__MParameterCCR__Group__5"
    // InternalSWI.g:8237:1: rule__MParameterCCR__Group__5 : rule__MParameterCCR__Group__5__Impl ;
    public final void rule__MParameterCCR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8241:1: ( rule__MParameterCCR__Group__5__Impl )
            // InternalSWI.g:8242:2: rule__MParameterCCR__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MParameterCCR__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__5"


    // $ANTLR start "rule__MParameterCCR__Group__5__Impl"
    // InternalSWI.g:8248:1: rule__MParameterCCR__Group__5__Impl : ( ']' ) ;
    public final void rule__MParameterCCR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8252:1: ( ( ']' ) )
            // InternalSWI.g:8253:1: ( ']' )
            {
            // InternalSWI.g:8253:1: ( ']' )
            // InternalSWI.g:8254:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__Group__5__Impl"


    // $ANTLR start "rule__MSwInterface__UnorderedGroup_4"
    // InternalSWI.g:8280:1: rule__MSwInterface__UnorderedGroup_4 : rule__MSwInterface__UnorderedGroup_4__0 {...}?;
    public final void rule__MSwInterface__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());
            
        try {
            // InternalSWI.g:8285:1: ( rule__MSwInterface__UnorderedGroup_4__0 {...}?)
            // InternalSWI.g:8286:2: rule__MSwInterface__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__UnorderedGroup_4__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__MSwInterface__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__UnorderedGroup_4"


    // $ANTLR start "rule__MSwInterface__UnorderedGroup_4__Impl"
    // InternalSWI.g:8297:1: rule__MSwInterface__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_5__0 ) ) ) ) ) ;
    public final void rule__MSwInterface__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalSWI.g:8302:1: ( ( ({...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_5__0 ) ) ) ) ) )
            // InternalSWI.g:8303:3: ( ({...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_5__0 ) ) ) ) )
            {
            // InternalSWI.g:8303:3: ( ({...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__MSwInterface__Group_4_5__0 ) ) ) ) )
            int alt42=6;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                alt42=2;
            }
            else if ( LA42_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                alt42=3;
            }
            else if ( LA42_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
                alt42=4;
            }
            else if ( LA42_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
                alt42=5;
            }
            else if ( LA42_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
                alt42=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalSWI.g:8305:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) ) )
                    {
                    // InternalSWI.g:8305:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) ) )
                    // InternalSWI.g:8306:5: {...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MSwInterface__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalSWI.g:8306:109: ( ( ( rule__MSwInterface__Group_4_0__0 ) ) )
                    // InternalSWI.g:8307:6: ( ( rule__MSwInterface__Group_4_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalSWI.g:8313:6: ( ( rule__MSwInterface__Group_4_0__0 ) )
                    // InternalSWI.g:8315:7: ( rule__MSwInterface__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMSwInterfaceAccess().getGroup_4_0()); 
                    }
                    // InternalSWI.g:8316:7: ( rule__MSwInterface__Group_4_0__0 )
                    // InternalSWI.g:8316:8: rule__MSwInterface__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMSwInterfaceAccess().getGroup_4_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSWI.g:8322:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) ) )
                    {
                    // InternalSWI.g:8322:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) ) )
                    // InternalSWI.g:8323:5: {...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MSwInterface__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalSWI.g:8323:109: ( ( ( rule__MSwInterface__Group_4_1__0 ) ) )
                    // InternalSWI.g:8324:6: ( ( rule__MSwInterface__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalSWI.g:8330:6: ( ( rule__MSwInterface__Group_4_1__0 ) )
                    // InternalSWI.g:8332:7: ( rule__MSwInterface__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMSwInterfaceAccess().getGroup_4_1()); 
                    }
                    // InternalSWI.g:8333:7: ( rule__MSwInterface__Group_4_1__0 )
                    // InternalSWI.g:8333:8: rule__MSwInterface__Group_4_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMSwInterfaceAccess().getGroup_4_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSWI.g:8339:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) ) )
                    {
                    // InternalSWI.g:8339:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) ) )
                    // InternalSWI.g:8340:5: {...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MSwInterface__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalSWI.g:8340:109: ( ( ( rule__MSwInterface__Group_4_2__0 ) ) )
                    // InternalSWI.g:8341:6: ( ( rule__MSwInterface__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalSWI.g:8347:6: ( ( rule__MSwInterface__Group_4_2__0 ) )
                    // InternalSWI.g:8349:7: ( rule__MSwInterface__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMSwInterfaceAccess().getGroup_4_2()); 
                    }
                    // InternalSWI.g:8350:7: ( rule__MSwInterface__Group_4_2__0 )
                    // InternalSWI.g:8350:8: rule__MSwInterface__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMSwInterfaceAccess().getGroup_4_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSWI.g:8356:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) ) )
                    {
                    // InternalSWI.g:8356:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) ) )
                    // InternalSWI.g:8357:5: {...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MSwInterface__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3)");
                    }
                    // InternalSWI.g:8357:109: ( ( ( rule__MSwInterface__Group_4_3__0 ) ) )
                    // InternalSWI.g:8358:6: ( ( rule__MSwInterface__Group_4_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3);
                    selected = true;
                    // InternalSWI.g:8364:6: ( ( rule__MSwInterface__Group_4_3__0 ) )
                    // InternalSWI.g:8366:7: ( rule__MSwInterface__Group_4_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMSwInterfaceAccess().getGroup_4_3()); 
                    }
                    // InternalSWI.g:8367:7: ( rule__MSwInterface__Group_4_3__0 )
                    // InternalSWI.g:8367:8: rule__MSwInterface__Group_4_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__Group_4_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMSwInterfaceAccess().getGroup_4_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSWI.g:8373:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) ) )
                    {
                    // InternalSWI.g:8373:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) ) )
                    // InternalSWI.g:8374:5: {...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MSwInterface__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4)");
                    }
                    // InternalSWI.g:8374:109: ( ( ( rule__MSwInterface__Group_4_4__0 ) ) )
                    // InternalSWI.g:8375:6: ( ( rule__MSwInterface__Group_4_4__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4);
                    selected = true;
                    // InternalSWI.g:8381:6: ( ( rule__MSwInterface__Group_4_4__0 ) )
                    // InternalSWI.g:8383:7: ( rule__MSwInterface__Group_4_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMSwInterfaceAccess().getGroup_4_4()); 
                    }
                    // InternalSWI.g:8384:7: ( rule__MSwInterface__Group_4_4__0 )
                    // InternalSWI.g:8384:8: rule__MSwInterface__Group_4_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__Group_4_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMSwInterfaceAccess().getGroup_4_4()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSWI.g:8390:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_5__0 ) ) ) )
                    {
                    // InternalSWI.g:8390:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_5__0 ) ) ) )
                    // InternalSWI.g:8391:5: {...}? => ( ( ( rule__MSwInterface__Group_4_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MSwInterface__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5)");
                    }
                    // InternalSWI.g:8391:109: ( ( ( rule__MSwInterface__Group_4_5__0 ) ) )
                    // InternalSWI.g:8392:6: ( ( rule__MSwInterface__Group_4_5__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5);
                    selected = true;
                    // InternalSWI.g:8398:6: ( ( rule__MSwInterface__Group_4_5__0 ) )
                    // InternalSWI.g:8400:7: ( rule__MSwInterface__Group_4_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMSwInterfaceAccess().getGroup_4_5()); 
                    }
                    // InternalSWI.g:8401:7: ( rule__MSwInterface__Group_4_5__0 )
                    // InternalSWI.g:8401:8: rule__MSwInterface__Group_4_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__Group_4_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMSwInterfaceAccess().getGroup_4_5()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__MSwInterface__UnorderedGroup_4__0"
    // InternalSWI.g:8416:1: rule__MSwInterface__UnorderedGroup_4__0 : rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__1 )? ;
    public final void rule__MSwInterface__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8420:1: ( rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__1 )? )
            // InternalSWI.g:8421:2: rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_54);
            rule__MSwInterface__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalSWI.g:8422:2: ( rule__MSwInterface__UnorderedGroup_4__1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                alt43=1;
            }
            else if ( LA43_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
                alt43=1;
            }
            else if ( LA43_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
                alt43=1;
            }
            else if ( LA43_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSWI.g:0:0: rule__MSwInterface__UnorderedGroup_4__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__UnorderedGroup_4__1();

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
    // $ANTLR end "rule__MSwInterface__UnorderedGroup_4__0"


    // $ANTLR start "rule__MSwInterface__UnorderedGroup_4__1"
    // InternalSWI.g:8429:1: rule__MSwInterface__UnorderedGroup_4__1 : rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__2 )? ;
    public final void rule__MSwInterface__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8433:1: ( rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__2 )? )
            // InternalSWI.g:8434:2: rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_54);
            rule__MSwInterface__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalSWI.g:8435:2: ( rule__MSwInterface__UnorderedGroup_4__2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                alt44=1;
            }
            else if ( LA44_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                alt44=1;
            }
            else if ( LA44_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
                alt44=1;
            }
            else if ( LA44_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
                alt44=1;
            }
            else if ( LA44_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSWI.g:0:0: rule__MSwInterface__UnorderedGroup_4__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__UnorderedGroup_4__2();

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
    // $ANTLR end "rule__MSwInterface__UnorderedGroup_4__1"


    // $ANTLR start "rule__MSwInterface__UnorderedGroup_4__2"
    // InternalSWI.g:8442:1: rule__MSwInterface__UnorderedGroup_4__2 : rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__3 )? ;
    public final void rule__MSwInterface__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8446:1: ( rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__3 )? )
            // InternalSWI.g:8447:2: rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_54);
            rule__MSwInterface__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalSWI.g:8448:2: ( rule__MSwInterface__UnorderedGroup_4__3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                alt45=1;
            }
            else if ( LA45_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                alt45=1;
            }
            else if ( LA45_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
                alt45=1;
            }
            else if ( LA45_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
                alt45=1;
            }
            else if ( LA45_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSWI.g:0:0: rule__MSwInterface__UnorderedGroup_4__3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__UnorderedGroup_4__3();

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
    // $ANTLR end "rule__MSwInterface__UnorderedGroup_4__2"


    // $ANTLR start "rule__MSwInterface__UnorderedGroup_4__3"
    // InternalSWI.g:8455:1: rule__MSwInterface__UnorderedGroup_4__3 : rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__4 )? ;
    public final void rule__MSwInterface__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8459:1: ( rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__4 )? )
            // InternalSWI.g:8460:2: rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__4 )?
            {
            pushFollow(FollowSets000.FOLLOW_54);
            rule__MSwInterface__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalSWI.g:8461:2: ( rule__MSwInterface__UnorderedGroup_4__4 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                alt46=1;
            }
            else if ( LA46_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
                alt46=1;
            }
            else if ( LA46_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
                alt46=1;
            }
            else if ( LA46_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSWI.g:0:0: rule__MSwInterface__UnorderedGroup_4__4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__UnorderedGroup_4__4();

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
    // $ANTLR end "rule__MSwInterface__UnorderedGroup_4__3"


    // $ANTLR start "rule__MSwInterface__UnorderedGroup_4__4"
    // InternalSWI.g:8468:1: rule__MSwInterface__UnorderedGroup_4__4 : rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__5 )? ;
    public final void rule__MSwInterface__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8472:1: ( rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__5 )? )
            // InternalSWI.g:8473:2: rule__MSwInterface__UnorderedGroup_4__Impl ( rule__MSwInterface__UnorderedGroup_4__5 )?
            {
            pushFollow(FollowSets000.FOLLOW_54);
            rule__MSwInterface__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalSWI.g:8474:2: ( rule__MSwInterface__UnorderedGroup_4__5 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                alt47=1;
            }
            else if ( LA47_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                alt47=1;
            }
            else if ( LA47_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
                alt47=1;
            }
            else if ( LA47_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
                alt47=1;
            }
            else if ( LA47_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 5) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSWI.g:0:0: rule__MSwInterface__UnorderedGroup_4__5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MSwInterface__UnorderedGroup_4__5();

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
    // $ANTLR end "rule__MSwInterface__UnorderedGroup_4__4"


    // $ANTLR start "rule__MSwInterface__UnorderedGroup_4__5"
    // InternalSWI.g:8481:1: rule__MSwInterface__UnorderedGroup_4__5 : rule__MSwInterface__UnorderedGroup_4__Impl ;
    public final void rule__MSwInterface__UnorderedGroup_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8485:1: ( rule__MSwInterface__UnorderedGroup_4__Impl )
            // InternalSWI.g:8486:2: rule__MSwInterface__UnorderedGroup_4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MSwInterface__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__UnorderedGroup_4__5"


    // $ANTLR start "rule__MMESPSWIPackageFile__PackageAssignment_1"
    // InternalSWI.g:8505:1: rule__MMESPSWIPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPSWIPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8509:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSWI.g:8510:1: ( ( ruleQualifiedName ) )
            {
            // InternalSWI.g:8510:1: ( ( ruleQualifiedName ) )
            // InternalSWI.g:8511:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
            }
            // InternalSWI.g:8512:1: ( ruleQualifiedName )
            // InternalSWI.g:8513:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__PackageAssignment_1"


    // $ANTLR start "rule__MMESPSWIPackageFile__ImportsAssignment_3_1"
    // InternalSWI.g:8524:1: rule__MMESPSWIPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPSWIPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8528:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSWI.g:8529:1: ( ( ruleQualifiedName ) )
            {
            // InternalSWI.g:8529:1: ( ( ruleQualifiedName ) )
            // InternalSWI.g:8530:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }
            // InternalSWI.g:8531:1: ( ruleQualifiedName )
            // InternalSWI.g:8532:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__ImportsAssignment_3_1"


    // $ANTLR start "rule__MMESPSWIPackageFile__ElementAssignment_4"
    // InternalSWI.g:8543:1: rule__MMESPSWIPackageFile__ElementAssignment_4 : ( ruleMMESPSWIPackageElement ) ;
    public final void rule__MMESPSWIPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8547:1: ( ( ruleMMESPSWIPackageElement ) )
            // InternalSWI.g:8548:1: ( ruleMMESPSWIPackageElement )
            {
            // InternalSWI.g:8548:1: ( ruleMMESPSWIPackageElement )
            // InternalSWI.g:8549:1: ruleMMESPSWIPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPSWIPackageFileAccess().getElementMMESPSWIPackageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMMESPSWIPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPSWIPackageFileAccess().getElementMMESPSWIPackageElementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPSWIPackageFile__ElementAssignment_4"


    // $ANTLR start "rule__MSwInterface__NameAssignment_1"
    // InternalSWI.g:8558:1: rule__MSwInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MSwInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8562:1: ( ( RULE_ID ) )
            // InternalSWI.g:8563:1: ( RULE_ID )
            {
            // InternalSWI.g:8563:1: ( RULE_ID )
            // InternalSWI.g:8564:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__NameAssignment_1"


    // $ANTLR start "rule__MSwInterface__ExtendsAssignment_2_1"
    // InternalSWI.g:8573:1: rule__MSwInterface__ExtendsAssignment_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MSwInterface__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8577:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalSWI.g:8578:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalSWI.g:8578:1: ( ( ruleVersionedQualifiedName ) )
            // InternalSWI.g:8579:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceCrossReference_2_1_0()); 
            }
            // InternalSWI.g:8580:1: ( ruleVersionedQualifiedName )
            // InternalSWI.g:8581:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceVersionedQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceVersionedQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__ExtendsAssignment_2_1"


    // $ANTLR start "rule__MSwInterface__ExtendsAssignment_2_2_1"
    // InternalSWI.g:8592:1: rule__MSwInterface__ExtendsAssignment_2_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MSwInterface__ExtendsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8596:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalSWI.g:8597:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalSWI.g:8597:1: ( ( ruleVersionedQualifiedName ) )
            // InternalSWI.g:8598:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceCrossReference_2_2_1_0()); 
            }
            // InternalSWI.g:8599:1: ( ruleVersionedQualifiedName )
            // InternalSWI.g:8600:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getExtendsMSwInterfaceCrossReference_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__ExtendsAssignment_2_2_1"


    // $ANTLR start "rule__MSwInterface__VersionAssignment_4_0_2"
    // InternalSWI.g:8611:1: rule__MSwInterface__VersionAssignment_4_0_2 : ( ruleVersion ) ;
    public final void rule__MSwInterface__VersionAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8615:1: ( ( ruleVersion ) )
            // InternalSWI.g:8616:1: ( ruleVersion )
            {
            // InternalSWI.g:8616:1: ( ruleVersion )
            // InternalSWI.g:8617:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__VersionAssignment_4_0_2"


    // $ANTLR start "rule__MSwInterface__LanguageAssignment_4_1_2"
    // InternalSWI.g:8626:1: rule__MSwInterface__LanguageAssignment_4_1_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MSwInterface__LanguageAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8630:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalSWI.g:8631:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalSWI.g:8631:1: ( ( ruleVersionedQualifiedName ) )
            // InternalSWI.g:8632:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getLanguageMLanguageCrossReference_4_1_2_0()); 
            }
            // InternalSWI.g:8633:1: ( ruleVersionedQualifiedName )
            // InternalSWI.g:8634:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getLanguageMLanguageCrossReference_4_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__LanguageAssignment_4_1_2"


    // $ANTLR start "rule__MSwInterface__ParametersAssignment_4_2_3"
    // InternalSWI.g:8645:1: rule__MSwInterface__ParametersAssignment_4_2_3 : ( ruleMParameter ) ;
    public final void rule__MSwInterface__ParametersAssignment_4_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8649:1: ( ( ruleMParameter ) )
            // InternalSWI.g:8650:1: ( ruleMParameter )
            {
            // InternalSWI.g:8650:1: ( ruleMParameter )
            // InternalSWI.g:8651:1: ruleMParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getParametersMParameterParserRuleCall_4_2_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getParametersMParameterParserRuleCall_4_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__ParametersAssignment_4_2_3"


    // $ANTLR start "rule__MSwInterface__ProvidedResourcesAssignment_4_3_3"
    // InternalSWI.g:8660:1: rule__MSwInterface__ProvidedResourcesAssignment_4_3_3 : ( ruleMProvidedResource ) ;
    public final void rule__MSwInterface__ProvidedResourcesAssignment_4_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8664:1: ( ( ruleMProvidedResource ) )
            // InternalSWI.g:8665:1: ( ruleMProvidedResource )
            {
            // InternalSWI.g:8665:1: ( ruleMProvidedResource )
            // InternalSWI.g:8666:1: ruleMProvidedResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_3_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMProvidedResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__ProvidedResourcesAssignment_4_3_3"


    // $ANTLR start "rule__MSwInterface__RequiresAssignment_4_4_2"
    // InternalSWI.g:8675:1: rule__MSwInterface__RequiresAssignment_4_4_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MSwInterface__RequiresAssignment_4_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8679:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalSWI.g:8680:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalSWI.g:8680:1: ( ( ruleVersionedQualifiedName ) )
            // InternalSWI.g:8681:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceCrossReference_4_4_2_0()); 
            }
            // InternalSWI.g:8682:1: ( ruleVersionedQualifiedName )
            // InternalSWI.g:8683:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceVersionedQualifiedNameParserRuleCall_4_4_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceVersionedQualifiedNameParserRuleCall_4_4_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceCrossReference_4_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__RequiresAssignment_4_4_2"


    // $ANTLR start "rule__MSwInterface__RequiresAssignment_4_4_3_1"
    // InternalSWI.g:8694:1: rule__MSwInterface__RequiresAssignment_4_4_3_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MSwInterface__RequiresAssignment_4_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8698:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalSWI.g:8699:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalSWI.g:8699:1: ( ( ruleVersionedQualifiedName ) )
            // InternalSWI.g:8700:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceCrossReference_4_4_3_1_0()); 
            }
            // InternalSWI.g:8701:1: ( ruleVersionedQualifiedName )
            // InternalSWI.g:8702:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceVersionedQualifiedNameParserRuleCall_4_4_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceVersionedQualifiedNameParserRuleCall_4_4_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiresMSwInterfaceCrossReference_4_4_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__RequiresAssignment_4_4_3_1"


    // $ANTLR start "rule__MSwInterface__RequiredOSAPIAssignment_4_5_3"
    // InternalSWI.g:8713:1: rule__MSwInterface__RequiredOSAPIAssignment_4_5_3 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MSwInterface__RequiredOSAPIAssignment_4_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8717:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalSWI.g:8718:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalSWI.g:8718:1: ( ( ruleVersionedQualifiedName ) )
            // InternalSWI.g:8719:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiredOSAPIMOperatingSystemAPICrossReference_4_5_3_0()); 
            }
            // InternalSWI.g:8720:1: ( ruleVersionedQualifiedName )
            // InternalSWI.g:8721:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMSwInterfaceAccess().getRequiredOSAPIMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_5_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiredOSAPIMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_5_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMSwInterfaceAccess().getRequiredOSAPIMOperatingSystemAPICrossReference_4_5_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MSwInterface__RequiredOSAPIAssignment_4_5_3"


    // $ANTLR start "rule__MQuantifiableResource__NameAssignment_2"
    // InternalSWI.g:8732:1: rule__MQuantifiableResource__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MQuantifiableResource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8736:1: ( ( RULE_ID ) )
            // InternalSWI.g:8737:1: ( RULE_ID )
            {
            // InternalSWI.g:8737:1: ( RULE_ID )
            // InternalSWI.g:8738:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__NameAssignment_2"


    // $ANTLR start "rule__MQuantifiableResource__LowerBoundAssignment_4"
    // InternalSWI.g:8747:1: rule__MQuantifiableResource__LowerBoundAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MQuantifiableResource__LowerBoundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8751:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:8752:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:8752:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:8753:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__LowerBoundAssignment_4"


    // $ANTLR start "rule__MQuantifiableResource__UpperBoundAssignment_6"
    // InternalSWI.g:8762:1: rule__MQuantifiableResource__UpperBoundAssignment_6 : ( ruleMParameterValueExpression ) ;
    public final void rule__MQuantifiableResource__UpperBoundAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8766:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:8767:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:8767:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:8768:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MQuantifiableResource__UpperBoundAssignment_6"


    // $ANTLR start "rule__MInstantiableResource__NameAssignment_2"
    // InternalSWI.g:8777:1: rule__MInstantiableResource__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MInstantiableResource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8781:1: ( ( RULE_ID ) )
            // InternalSWI.g:8782:1: ( RULE_ID )
            {
            // InternalSWI.g:8782:1: ( RULE_ID )
            // InternalSWI.g:8783:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__NameAssignment_2"


    // $ANTLR start "rule__MInstantiableResource__ParametersAssignment_4"
    // InternalSWI.g:8792:1: rule__MInstantiableResource__ParametersAssignment_4 : ( ruleMParameter ) ;
    public final void rule__MInstantiableResource__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8796:1: ( ( ruleMParameter ) )
            // InternalSWI.g:8797:1: ( ruleMParameter )
            {
            // InternalSWI.g:8797:1: ( ruleMParameter )
            // InternalSWI.g:8798:1: ruleMParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getParametersMParameterParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMInstantiableResourceAccess().getParametersMParameterParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MInstantiableResource__ParametersAssignment_4"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__ConstantAssignment_0"
    // InternalSWI.g:8807:1: rule__MIntegerParameterSingleExpression__ConstantAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__MIntegerParameterSingleExpression__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8811:1: ( ( ( 'const' ) ) )
            // InternalSWI.g:8812:1: ( ( 'const' ) )
            {
            // InternalSWI.g:8812:1: ( ( 'const' ) )
            // InternalSWI.g:8813:1: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            // InternalSWI.g:8814:1: ( 'const' )
            // InternalSWI.g:8815:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__ConstantAssignment_0"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__NameAssignment_2"
    // InternalSWI.g:8830:1: rule__MIntegerParameterSingleExpression__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MIntegerParameterSingleExpression__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8834:1: ( ( RULE_ID ) )
            // InternalSWI.g:8835:1: ( RULE_ID )
            {
            // InternalSWI.g:8835:1: ( RULE_ID )
            // InternalSWI.g:8836:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__NameAssignment_2"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4"
    // InternalSWI.g:8845:1: rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8849:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:8850:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:8850:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:8851:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__RangeAssignment_5_1"
    // InternalSWI.g:8860:1: rule__MIntegerParameterSingleExpression__RangeAssignment_5_1 : ( ruleMParameterRange ) ;
    public final void rule__MIntegerParameterSingleExpression__RangeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8864:1: ( ( ruleMParameterRange ) )
            // InternalSWI.g:8865:1: ( ruleMParameterRange )
            {
            // InternalSWI.g:8865:1: ( ruleMParameterRange )
            // InternalSWI.g:8866:1: ruleMParameterRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__RangeAssignment_5_1"


    // $ANTLR start "rule__MEnumParameterDefinition__NameAssignment_2"
    // InternalSWI.g:8875:1: rule__MEnumParameterDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MEnumParameterDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8879:1: ( ( RULE_ID ) )
            // InternalSWI.g:8880:1: ( RULE_ID )
            {
            // InternalSWI.g:8880:1: ( RULE_ID )
            // InternalSWI.g:8881:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__NameAssignment_2"


    // $ANTLR start "rule__MEnumParameterDefinition__LiteralsAssignment_4"
    // InternalSWI.g:8890:1: rule__MEnumParameterDefinition__LiteralsAssignment_4 : ( ruleMEnumParameterLiteralRule ) ;
    public final void rule__MEnumParameterDefinition__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8894:1: ( ( ruleMEnumParameterLiteralRule ) )
            // InternalSWI.g:8895:1: ( ruleMEnumParameterLiteralRule )
            {
            // InternalSWI.g:8895:1: ( ruleMEnumParameterLiteralRule )
            // InternalSWI.g:8896:1: ruleMEnumParameterLiteralRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMEnumParameterLiteralRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__LiteralsAssignment_4"


    // $ANTLR start "rule__MEnumParameterDefinition__LiteralsAssignment_5_1"
    // InternalSWI.g:8905:1: rule__MEnumParameterDefinition__LiteralsAssignment_5_1 : ( ruleMEnumParameterLiteralRule ) ;
    public final void rule__MEnumParameterDefinition__LiteralsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8909:1: ( ( ruleMEnumParameterLiteralRule ) )
            // InternalSWI.g:8910:1: ( ruleMEnumParameterLiteralRule )
            {
            // InternalSWI.g:8910:1: ( ruleMEnumParameterLiteralRule )
            // InternalSWI.g:8911:1: ruleMEnumParameterLiteralRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMEnumParameterLiteralRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterDefinition__LiteralsAssignment_5_1"


    // $ANTLR start "rule__MEnumParameterSingleExpression__ConstantAssignment_0"
    // InternalSWI.g:8920:1: rule__MEnumParameterSingleExpression__ConstantAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__MEnumParameterSingleExpression__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8924:1: ( ( ( 'const' ) ) )
            // InternalSWI.g:8925:1: ( ( 'const' ) )
            {
            // InternalSWI.g:8925:1: ( ( 'const' ) )
            // InternalSWI.g:8926:1: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            // InternalSWI.g:8927:1: ( 'const' )
            // InternalSWI.g:8928:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__ConstantAssignment_0"


    // $ANTLR start "rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2"
    // InternalSWI.g:8943:1: rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8947:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalSWI.g:8948:1: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalSWI.g:8948:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalSWI.g:8949:1: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); 
            }
            // InternalSWI.g:8950:1: ( ruleVersionedQualifiedReferenceName )
            // InternalSWI.g:8951:1: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2"


    // $ANTLR start "rule__MEnumParameterSingleExpression__NameAssignment_3"
    // InternalSWI.g:8962:1: rule__MEnumParameterSingleExpression__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__MEnumParameterSingleExpression__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8966:1: ( ( RULE_ID ) )
            // InternalSWI.g:8967:1: ( RULE_ID )
            {
            // InternalSWI.g:8967:1: ( RULE_ID )
            // InternalSWI.g:8968:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__NameAssignment_3"


    // $ANTLR start "rule__MEnumParameterSingleExpression__DefaultValueAssignment_5"
    // InternalSWI.g:8977:1: rule__MEnumParameterSingleExpression__DefaultValueAssignment_5 : ( ruleMParameterValueExpression ) ;
    public final void rule__MEnumParameterSingleExpression__DefaultValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8981:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:8982:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:8982:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:8983:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__DefaultValueAssignment_5"


    // $ANTLR start "rule__MRealParameterSingleExpression__ConstantAssignment_0"
    // InternalSWI.g:8992:1: rule__MRealParameterSingleExpression__ConstantAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__MRealParameterSingleExpression__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:8996:1: ( ( ( 'const' ) ) )
            // InternalSWI.g:8997:1: ( ( 'const' ) )
            {
            // InternalSWI.g:8997:1: ( ( 'const' ) )
            // InternalSWI.g:8998:1: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            // InternalSWI.g:8999:1: ( 'const' )
            // InternalSWI.g:9000:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__ConstantAssignment_0"


    // $ANTLR start "rule__MRealParameterSingleExpression__NameAssignment_2"
    // InternalSWI.g:9015:1: rule__MRealParameterSingleExpression__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MRealParameterSingleExpression__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9019:1: ( ( RULE_ID ) )
            // InternalSWI.g:9020:1: ( RULE_ID )
            {
            // InternalSWI.g:9020:1: ( RULE_ID )
            // InternalSWI.g:9021:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__NameAssignment_2"


    // $ANTLR start "rule__MRealParameterSingleExpression__DefaultValueAssignment_4"
    // InternalSWI.g:9030:1: rule__MRealParameterSingleExpression__DefaultValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MRealParameterSingleExpression__DefaultValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9034:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9035:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9035:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9036:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__DefaultValueAssignment_4"


    // $ANTLR start "rule__MRealParameterSingleExpression__RangeAssignment_5_1"
    // InternalSWI.g:9045:1: rule__MRealParameterSingleExpression__RangeAssignment_5_1 : ( ruleMParameterRange ) ;
    public final void rule__MRealParameterSingleExpression__RangeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9049:1: ( ( ruleMParameterRange ) )
            // InternalSWI.g:9050:1: ( ruleMParameterRange )
            {
            // InternalSWI.g:9050:1: ( ruleMParameterRange )
            // InternalSWI.g:9051:1: ruleMParameterRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__RangeAssignment_5_1"


    // $ANTLR start "rule__MEnumParameterLiteral__NameAssignment_1"
    // InternalSWI.g:9060:1: rule__MEnumParameterLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MEnumParameterLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9064:1: ( ( RULE_ID ) )
            // InternalSWI.g:9065:1: ( RULE_ID )
            {
            // InternalSWI.g:9065:1: ( RULE_ID )
            // InternalSWI.g:9066:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterLiteral__NameAssignment_1"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__NameAssignment_1"
    // InternalSWI.g:9075:1: rule__MEnumParamIntegerLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MEnumParamIntegerLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9079:1: ( ( RULE_ID ) )
            // InternalSWI.g:9080:1: ( RULE_ID )
            {
            // InternalSWI.g:9080:1: ( RULE_ID )
            // InternalSWI.g:9081:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__NameAssignment_1"


    // $ANTLR start "rule__MEnumParamIntegerLiteral__ValueAssignment_3"
    // InternalSWI.g:9090:1: rule__MEnumParamIntegerLiteral__ValueAssignment_3 : ( ruleINTEGER ) ;
    public final void rule__MEnumParamIntegerLiteral__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9094:1: ( ( ruleINTEGER ) )
            // InternalSWI.g:9095:1: ( ruleINTEGER )
            {
            // InternalSWI.g:9095:1: ( ruleINTEGER )
            // InternalSWI.g:9096:1: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamIntegerLiteral__ValueAssignment_3"


    // $ANTLR start "rule__MEnumParamRealLiteral__NameAssignment_1"
    // InternalSWI.g:9105:1: rule__MEnumParamRealLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MEnumParamRealLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9109:1: ( ( RULE_ID ) )
            // InternalSWI.g:9110:1: ( RULE_ID )
            {
            // InternalSWI.g:9110:1: ( RULE_ID )
            // InternalSWI.g:9111:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__NameAssignment_1"


    // $ANTLR start "rule__MEnumParamRealLiteral__ValueAssignment_3"
    // InternalSWI.g:9120:1: rule__MEnumParamRealLiteral__ValueAssignment_3 : ( ruleREAL ) ;
    public final void rule__MEnumParamRealLiteral__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9124:1: ( ( ruleREAL ) )
            // InternalSWI.g:9125:1: ( ruleREAL )
            {
            // InternalSWI.g:9125:1: ( ruleREAL )
            // InternalSWI.g:9126:1: ruleREAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleREAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamRealLiteral__ValueAssignment_3"


    // $ANTLR start "rule__MEnumParamStringLiteral__NameAssignment_1"
    // InternalSWI.g:9135:1: rule__MEnumParamStringLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MEnumParamStringLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9139:1: ( ( RULE_ID ) )
            // InternalSWI.g:9140:1: ( RULE_ID )
            {
            // InternalSWI.g:9140:1: ( RULE_ID )
            // InternalSWI.g:9141:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__NameAssignment_1"


    // $ANTLR start "rule__MEnumParamStringLiteral__IsRawAssignment_3"
    // InternalSWI.g:9150:1: rule__MEnumParamStringLiteral__IsRawAssignment_3 : ( ( 'raw' ) ) ;
    public final void rule__MEnumParamStringLiteral__IsRawAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9154:1: ( ( ( 'raw' ) ) )
            // InternalSWI.g:9155:1: ( ( 'raw' ) )
            {
            // InternalSWI.g:9155:1: ( ( 'raw' ) )
            // InternalSWI.g:9156:1: ( 'raw' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); 
            }
            // InternalSWI.g:9157:1: ( 'raw' )
            // InternalSWI.g:9158:1: 'raw'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__IsRawAssignment_3"


    // $ANTLR start "rule__MEnumParamStringLiteral__ValueAssignment_4"
    // InternalSWI.g:9173:1: rule__MEnumParamStringLiteral__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__MEnumParamStringLiteral__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9177:1: ( ( RULE_STRING ) )
            // InternalSWI.g:9178:1: ( RULE_STRING )
            {
            // InternalSWI.g:9178:1: ( RULE_STRING )
            // InternalSWI.g:9179:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParamStringLiteral__ValueAssignment_4"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__ConstantAssignment_0"
    // InternalSWI.g:9188:1: rule__MBooleanParameterSingleExpression__ConstantAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__MBooleanParameterSingleExpression__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9192:1: ( ( ( 'const' ) ) )
            // InternalSWI.g:9193:1: ( ( 'const' ) )
            {
            // InternalSWI.g:9193:1: ( ( 'const' ) )
            // InternalSWI.g:9194:1: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            // InternalSWI.g:9195:1: ( 'const' )
            // InternalSWI.g:9196:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__ConstantAssignment_0"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__NameAssignment_2"
    // InternalSWI.g:9211:1: rule__MBooleanParameterSingleExpression__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MBooleanParameterSingleExpression__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9215:1: ( ( RULE_ID ) )
            // InternalSWI.g:9216:1: ( RULE_ID )
            {
            // InternalSWI.g:9216:1: ( RULE_ID )
            // InternalSWI.g:9217:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__NameAssignment_2"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4"
    // InternalSWI.g:9226:1: rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9230:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9231:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9231:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9232:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4"


    // $ANTLR start "rule__MStringParameterSingleExpression__ConstantAssignment_0"
    // InternalSWI.g:9241:1: rule__MStringParameterSingleExpression__ConstantAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__MStringParameterSingleExpression__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9245:1: ( ( ( 'const' ) ) )
            // InternalSWI.g:9246:1: ( ( 'const' ) )
            {
            // InternalSWI.g:9246:1: ( ( 'const' ) )
            // InternalSWI.g:9247:1: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            // InternalSWI.g:9248:1: ( 'const' )
            // InternalSWI.g:9249:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__ConstantAssignment_0"


    // $ANTLR start "rule__MStringParameterSingleExpression__NameAssignment_2"
    // InternalSWI.g:9264:1: rule__MStringParameterSingleExpression__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MStringParameterSingleExpression__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9268:1: ( ( RULE_ID ) )
            // InternalSWI.g:9269:1: ( RULE_ID )
            {
            // InternalSWI.g:9269:1: ( RULE_ID )
            // InternalSWI.g:9270:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__NameAssignment_2"


    // $ANTLR start "rule__MStringParameterSingleExpression__DefaultValueAssignment_4"
    // InternalSWI.g:9279:1: rule__MStringParameterSingleExpression__DefaultValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MStringParameterSingleExpression__DefaultValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9283:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9284:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9284:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9285:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__DefaultValueAssignment_4"


    // $ANTLR start "rule__MParameterValueBooleanLiteral__ValueAssignment_1"
    // InternalSWI.g:9294:1: rule__MParameterValueBooleanLiteral__ValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__MParameterValueBooleanLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9298:1: ( ( ruleEBoolean ) )
            // InternalSWI.g:9299:1: ( ruleEBoolean )
            {
            // InternalSWI.g:9299:1: ( ruleEBoolean )
            // InternalSWI.g:9300:1: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueBooleanLiteral__ValueAssignment_1"


    // $ANTLR start "rule__MParameterValueStringLiteral__IsRawAssignment_1"
    // InternalSWI.g:9309:1: rule__MParameterValueStringLiteral__IsRawAssignment_1 : ( ( 'raw' ) ) ;
    public final void rule__MParameterValueStringLiteral__IsRawAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9313:1: ( ( ( 'raw' ) ) )
            // InternalSWI.g:9314:1: ( ( 'raw' ) )
            {
            // InternalSWI.g:9314:1: ( ( 'raw' ) )
            // InternalSWI.g:9315:1: ( 'raw' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); 
            }
            // InternalSWI.g:9316:1: ( 'raw' )
            // InternalSWI.g:9317:1: 'raw'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueStringLiteral__IsRawAssignment_1"


    // $ANTLR start "rule__MParameterValueStringLiteral__ValueAssignment_2"
    // InternalSWI.g:9332:1: rule__MParameterValueStringLiteral__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MParameterValueStringLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9336:1: ( ( RULE_STRING ) )
            // InternalSWI.g:9337:1: ( RULE_STRING )
            {
            // InternalSWI.g:9337:1: ( RULE_STRING )
            // InternalSWI.g:9338:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueStringLiteral__ValueAssignment_2"


    // $ANTLR start "rule__MParameterValueIntegerLiteral__ValueAssignment_1"
    // InternalSWI.g:9347:1: rule__MParameterValueIntegerLiteral__ValueAssignment_1 : ( ruleINTEGER ) ;
    public final void rule__MParameterValueIntegerLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9351:1: ( ( ruleINTEGER ) )
            // InternalSWI.g:9352:1: ( ruleINTEGER )
            {
            // InternalSWI.g:9352:1: ( ruleINTEGER )
            // InternalSWI.g:9353:1: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueIntegerLiteral__ValueAssignment_1"


    // $ANTLR start "rule__MParameterValueRealLiteral__ValueAssignment_1"
    // InternalSWI.g:9362:1: rule__MParameterValueRealLiteral__ValueAssignment_1 : ( ruleREAL ) ;
    public final void rule__MParameterValueRealLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9366:1: ( ( ruleREAL ) )
            // InternalSWI.g:9367:1: ( ruleREAL )
            {
            // InternalSWI.g:9367:1: ( ruleREAL )
            // InternalSWI.g:9368:1: ruleREAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleREAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRealLiteral__ValueAssignment_1"


    // $ANTLR start "rule__MParameterValueRefObject__ObjectAssignment_1"
    // InternalSWI.g:9377:1: rule__MParameterValueRefObject__ObjectAssignment_1 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__MParameterValueRefObject__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9381:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalSWI.g:9382:1: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalSWI.g:9382:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalSWI.g:9383:1: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0()); 
            }
            // InternalSWI.g:9384:1: ( ruleVersionedQualifiedReferenceName )
            // InternalSWI.g:9385:1: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueRefObject__ObjectAssignment_1"


    // $ANTLR start "rule__MParameterValuePAR__ValueAssignment_1"
    // InternalSWI.g:9396:1: rule__MParameterValuePAR__ValueAssignment_1 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterValuePAR__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9400:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9401:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9401:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9402:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValuePAR__ValueAssignment_1"


    // $ANTLR start "rule__MParameterValueExpression__LeftAssignment_1"
    // InternalSWI.g:9411:1: rule__MParameterValueExpression__LeftAssignment_1 : ( ruleMParameterValueTERM ) ;
    public final void rule__MParameterValueExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9415:1: ( ( ruleMParameterValueTERM ) )
            // InternalSWI.g:9416:1: ( ruleMParameterValueTERM )
            {
            // InternalSWI.g:9416:1: ( ruleMParameterValueTERM )
            // InternalSWI.g:9417:1: ruleMParameterValueTERM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueTERM();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__LeftAssignment_1"


    // $ANTLR start "rule__MParameterValueExpression__OperationAssignment_2_0"
    // InternalSWI.g:9426:1: rule__MParameterValueExpression__OperationAssignment_2_0 : ( ruleMParameterValueExpressionOperators ) ;
    public final void rule__MParameterValueExpression__OperationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9430:1: ( ( ruleMParameterValueExpressionOperators ) )
            // InternalSWI.g:9431:1: ( ruleMParameterValueExpressionOperators )
            {
            // InternalSWI.g:9431:1: ( ruleMParameterValueExpressionOperators )
            // InternalSWI.g:9432:1: ruleMParameterValueExpressionOperators
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpressionOperators();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__OperationAssignment_2_0"


    // $ANTLR start "rule__MParameterValueExpression__RightAssignment_2_1"
    // InternalSWI.g:9441:1: rule__MParameterValueExpression__RightAssignment_2_1 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterValueExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9445:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9446:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9446:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9447:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueExpression__RightAssignment_2_1"


    // $ANTLR start "rule__MParameterValueTERM__LeftAssignment_1"
    // InternalSWI.g:9456:1: rule__MParameterValueTERM__LeftAssignment_1 : ( ruleMParameterValue ) ;
    public final void rule__MParameterValueTERM__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9460:1: ( ( ruleMParameterValue ) )
            // InternalSWI.g:9461:1: ( ruleMParameterValue )
            {
            // InternalSWI.g:9461:1: ( ruleMParameterValue )
            // InternalSWI.g:9462:1: ruleMParameterValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__LeftAssignment_1"


    // $ANTLR start "rule__MParameterValueTERM__OperationAssignment_2_0"
    // InternalSWI.g:9471:1: rule__MParameterValueTERM__OperationAssignment_2_0 : ( ruleMParameterValueTERMOperators ) ;
    public final void rule__MParameterValueTERM__OperationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9475:1: ( ( ruleMParameterValueTERMOperators ) )
            // InternalSWI.g:9476:1: ( ruleMParameterValueTERMOperators )
            {
            // InternalSWI.g:9476:1: ( ruleMParameterValueTERMOperators )
            // InternalSWI.g:9477:1: ruleMParameterValueTERMOperators
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueTERMOperators();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__OperationAssignment_2_0"


    // $ANTLR start "rule__MParameterValueTERM__RightAssignment_2_1"
    // InternalSWI.g:9486:1: rule__MParameterValueTERM__RightAssignment_2_1 : ( ruleMParameterValueTERM ) ;
    public final void rule__MParameterValueTERM__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9490:1: ( ( ruleMParameterValueTERM ) )
            // InternalSWI.g:9491:1: ( ruleMParameterValueTERM )
            {
            // InternalSWI.g:9491:1: ( ruleMParameterValueTERM )
            // InternalSWI.g:9492:1: ruleMParameterValueTERM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueTERM();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterValueTERM__RightAssignment_2_1"


    // $ANTLR start "rule__MParameterOCR__LowerValueAssignment_2"
    // InternalSWI.g:9501:1: rule__MParameterOCR__LowerValueAssignment_2 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterOCR__LowerValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9505:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9506:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9506:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9507:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__LowerValueAssignment_2"


    // $ANTLR start "rule__MParameterOCR__UpperValueAssignment_4"
    // InternalSWI.g:9516:1: rule__MParameterOCR__UpperValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterOCR__UpperValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9520:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9521:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9521:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9522:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOCR__UpperValueAssignment_4"


    // $ANTLR start "rule__MParameterOOR__LowerValueAssignment_2"
    // InternalSWI.g:9531:1: rule__MParameterOOR__LowerValueAssignment_2 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterOOR__LowerValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9535:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9536:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9536:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9537:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__LowerValueAssignment_2"


    // $ANTLR start "rule__MParameterOOR__UpperValueAssignment_4"
    // InternalSWI.g:9546:1: rule__MParameterOOR__UpperValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterOOR__UpperValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9550:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9551:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9551:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9552:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterOORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterOOR__UpperValueAssignment_4"


    // $ANTLR start "rule__MParameterCOR__LowerValueAssignment_2"
    // InternalSWI.g:9561:1: rule__MParameterCOR__LowerValueAssignment_2 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterCOR__LowerValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9565:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9566:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9566:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9567:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__LowerValueAssignment_2"


    // $ANTLR start "rule__MParameterCOR__UpperValueAssignment_4"
    // InternalSWI.g:9576:1: rule__MParameterCOR__UpperValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterCOR__UpperValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9580:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9581:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9581:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9582:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCOR__UpperValueAssignment_4"


    // $ANTLR start "rule__MParameterCCR__LowerValueAssignment_2"
    // InternalSWI.g:9591:1: rule__MParameterCCR__LowerValueAssignment_2 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterCCR__LowerValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9595:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9596:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9596:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9597:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__LowerValueAssignment_2"


    // $ANTLR start "rule__MParameterCCR__UpperValueAssignment_4"
    // InternalSWI.g:9606:1: rule__MParameterCCR__UpperValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterCCR__UpperValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSWI.g:9610:1: ( ( ruleMParameterValueExpression ) )
            // InternalSWI.g:9611:1: ( ruleMParameterValueExpression )
            {
            // InternalSWI.g:9611:1: ( ruleMParameterValueExpression )
            // InternalSWI.g:9612:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MParameterCCR__UpperValueAssignment_4"

    // $ANTLR start synpred19_InternalSWI
    public final void synpred19_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:1480:1: ( ( ruleMParameterOCR ) )
        // InternalSWI.g:1480:1: ( ruleMParameterOCR )
        {
        // InternalSWI.g:1480:1: ( ruleMParameterOCR )
        // InternalSWI.g:1481:1: ruleMParameterOCR
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleMParameterOCR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSWI

    // $ANTLR start synpred20_InternalSWI
    public final void synpred20_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:1486:6: ( ( ruleMParameterOOR ) )
        // InternalSWI.g:1486:6: ( ruleMParameterOOR )
        {
        // InternalSWI.g:1486:6: ( ruleMParameterOOR )
        // InternalSWI.g:1487:1: ruleMParameterOOR
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleMParameterOOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalSWI

    // $ANTLR start synpred21_InternalSWI
    public final void synpred21_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:1492:6: ( ( ruleMParameterCOR ) )
        // InternalSWI.g:1492:6: ( ruleMParameterCOR )
        {
        // InternalSWI.g:1492:6: ( ruleMParameterCOR )
        // InternalSWI.g:1493:1: ruleMParameterCOR
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleMParameterCOR();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSWI

    // $ANTLR start synpred53_InternalSWI
    public final void synpred53_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8305:4: ( ({...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) ) ) )
        // InternalSWI.g:8305:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) ) )
        {
        // InternalSWI.g:8305:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) ) )
        // InternalSWI.g:8306:5: {...}? => ( ( ( rule__MSwInterface__Group_4_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred53_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalSWI.g:8306:109: ( ( ( rule__MSwInterface__Group_4_0__0 ) ) )
        // InternalSWI.g:8307:6: ( ( rule__MSwInterface__Group_4_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 0);
        // InternalSWI.g:8313:6: ( ( rule__MSwInterface__Group_4_0__0 ) )
        // InternalSWI.g:8315:7: ( rule__MSwInterface__Group_4_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMSwInterfaceAccess().getGroup_4_0()); 
        }
        // InternalSWI.g:8316:7: ( rule__MSwInterface__Group_4_0__0 )
        // InternalSWI.g:8316:8: rule__MSwInterface__Group_4_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__Group_4_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred53_InternalSWI

    // $ANTLR start synpred54_InternalSWI
    public final void synpred54_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8322:4: ( ({...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) ) ) )
        // InternalSWI.g:8322:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) ) )
        {
        // InternalSWI.g:8322:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) ) )
        // InternalSWI.g:8323:5: {...}? => ( ( ( rule__MSwInterface__Group_4_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred54_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalSWI.g:8323:109: ( ( ( rule__MSwInterface__Group_4_1__0 ) ) )
        // InternalSWI.g:8324:6: ( ( rule__MSwInterface__Group_4_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 1);
        // InternalSWI.g:8330:6: ( ( rule__MSwInterface__Group_4_1__0 ) )
        // InternalSWI.g:8332:7: ( rule__MSwInterface__Group_4_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMSwInterfaceAccess().getGroup_4_1()); 
        }
        // InternalSWI.g:8333:7: ( rule__MSwInterface__Group_4_1__0 )
        // InternalSWI.g:8333:8: rule__MSwInterface__Group_4_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__Group_4_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred54_InternalSWI

    // $ANTLR start synpred55_InternalSWI
    public final void synpred55_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8339:4: ( ({...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) ) ) )
        // InternalSWI.g:8339:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) ) )
        {
        // InternalSWI.g:8339:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) ) )
        // InternalSWI.g:8340:5: {...}? => ( ( ( rule__MSwInterface__Group_4_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred55_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2)");
        }
        // InternalSWI.g:8340:109: ( ( ( rule__MSwInterface__Group_4_2__0 ) ) )
        // InternalSWI.g:8341:6: ( ( rule__MSwInterface__Group_4_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 2);
        // InternalSWI.g:8347:6: ( ( rule__MSwInterface__Group_4_2__0 ) )
        // InternalSWI.g:8349:7: ( rule__MSwInterface__Group_4_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMSwInterfaceAccess().getGroup_4_2()); 
        }
        // InternalSWI.g:8350:7: ( rule__MSwInterface__Group_4_2__0 )
        // InternalSWI.g:8350:8: rule__MSwInterface__Group_4_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__Group_4_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred55_InternalSWI

    // $ANTLR start synpred56_InternalSWI
    public final void synpred56_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8356:4: ( ({...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) ) ) )
        // InternalSWI.g:8356:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) ) )
        {
        // InternalSWI.g:8356:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) ) )
        // InternalSWI.g:8357:5: {...}? => ( ( ( rule__MSwInterface__Group_4_3__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred56_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3)");
        }
        // InternalSWI.g:8357:109: ( ( ( rule__MSwInterface__Group_4_3__0 ) ) )
        // InternalSWI.g:8358:6: ( ( rule__MSwInterface__Group_4_3__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 3);
        // InternalSWI.g:8364:6: ( ( rule__MSwInterface__Group_4_3__0 ) )
        // InternalSWI.g:8366:7: ( rule__MSwInterface__Group_4_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMSwInterfaceAccess().getGroup_4_3()); 
        }
        // InternalSWI.g:8367:7: ( rule__MSwInterface__Group_4_3__0 )
        // InternalSWI.g:8367:8: rule__MSwInterface__Group_4_3__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__Group_4_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred56_InternalSWI

    // $ANTLR start synpred57_InternalSWI
    public final void synpred57_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8373:4: ( ({...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) ) ) )
        // InternalSWI.g:8373:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) ) )
        {
        // InternalSWI.g:8373:4: ({...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) ) )
        // InternalSWI.g:8374:5: {...}? => ( ( ( rule__MSwInterface__Group_4_4__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred57_InternalSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4)");
        }
        // InternalSWI.g:8374:109: ( ( ( rule__MSwInterface__Group_4_4__0 ) ) )
        // InternalSWI.g:8375:6: ( ( rule__MSwInterface__Group_4_4__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMSwInterfaceAccess().getUnorderedGroup_4(), 4);
        // InternalSWI.g:8381:6: ( ( rule__MSwInterface__Group_4_4__0 ) )
        // InternalSWI.g:8383:7: ( rule__MSwInterface__Group_4_4__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMSwInterfaceAccess().getGroup_4_4()); 
        }
        // InternalSWI.g:8384:7: ( rule__MSwInterface__Group_4_4__0 )
        // InternalSWI.g:8384:8: rule__MSwInterface__Group_4_4__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__Group_4_4__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred57_InternalSWI

    // $ANTLR start synpred58_InternalSWI
    public final void synpred58_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8422:2: ( rule__MSwInterface__UnorderedGroup_4__1 )
        // InternalSWI.g:8422:2: rule__MSwInterface__UnorderedGroup_4__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalSWI

    // $ANTLR start synpred59_InternalSWI
    public final void synpred59_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8435:2: ( rule__MSwInterface__UnorderedGroup_4__2 )
        // InternalSWI.g:8435:2: rule__MSwInterface__UnorderedGroup_4__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__UnorderedGroup_4__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalSWI

    // $ANTLR start synpred60_InternalSWI
    public final void synpred60_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8448:2: ( rule__MSwInterface__UnorderedGroup_4__3 )
        // InternalSWI.g:8448:2: rule__MSwInterface__UnorderedGroup_4__3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__UnorderedGroup_4__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalSWI

    // $ANTLR start synpred61_InternalSWI
    public final void synpred61_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8461:2: ( rule__MSwInterface__UnorderedGroup_4__4 )
        // InternalSWI.g:8461:2: rule__MSwInterface__UnorderedGroup_4__4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__UnorderedGroup_4__4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalSWI

    // $ANTLR start synpred62_InternalSWI
    public final void synpred62_InternalSWI_fragment() throws RecognitionException {   
        // InternalSWI.g:8474:2: ( rule__MSwInterface__UnorderedGroup_4__5 )
        // InternalSWI.g:8474:2: rule__MSwInterface__UnorderedGroup_4__5
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MSwInterface__UnorderedGroup_4__5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalSWI

    // Delegated rules

    public final boolean synpred60_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\55\1\uffff\1\6\4\uffff\1\6\1\uffff";
    static final String dfa_3s = "\1\67\1\63\1\uffff\1\6\4\uffff\1\32\1\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\uffff\1\3\1\4\1\5\1\2\1\uffff\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\3\1\5\1\uffff\1\4\1\6\3\uffff\1\1",
            "\1\2\1\uffff\1\7\1\5\1\uffff\1\4\1\6",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "\1\7\16\uffff\2\7\1\uffff\1\7\1\uffff\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1285:1: rule__MParameter__Alternatives : ( ( ruleMIntegerParameterSingleExpression ) | ( ruleMEnumParameterSingleExpression ) | ( ruleMBooleanParameterSingleExpression ) | ( ruleMRealParameterSingleExpression ) | ( ruleMStringParameterSingleExpression ) | ( ruleMEnumParameterDefinition ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000006B40000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x008DA00000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x008DA00000000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000110000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000110000000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020080000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x010000000040B0F0L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x008DA00008000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080200000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000080000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000400000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080800000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0081000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x010000000000B0B0L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000080L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0084000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0088000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000006B40000002L});
    }


}