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
import es.uah.aut.srg.micobs.mesp.lang.services.OSSWIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalOSSWIParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'::'", "'osswinterface'", "'{'", "'}'", "'extends'", "','", "'version'", "':='", "'osapi'", "'provided'", "'resources'", "'quantifiable'", "'resource'", "'step'", "'to'", "'instantiable'", "'integer'", "'range'", "'enum'", "'real'", "'='", "'boolean'", "'string'", "'e'", "']'", "'['", "'raw'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalOSSWIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOSSWIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOSSWIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOSSWI.g"; }


     
     	private OSSWIGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OSSWIGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMMESPOSSWIPackageFile"
    // InternalOSSWI.g:61:1: entryRuleMMESPOSSWIPackageFile : ruleMMESPOSSWIPackageFile EOF ;
    public final void entryRuleMMESPOSSWIPackageFile() throws RecognitionException {
        try {
            // InternalOSSWI.g:62:1: ( ruleMMESPOSSWIPackageFile EOF )
            // InternalOSSWI.g:63:1: ruleMMESPOSSWIPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMMESPOSSWIPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileRule()); 
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
    // $ANTLR end "entryRuleMMESPOSSWIPackageFile"


    // $ANTLR start "ruleMMESPOSSWIPackageFile"
    // InternalOSSWI.g:70:1: ruleMMESPOSSWIPackageFile : ( ( rule__MMESPOSSWIPackageFile__Group__0 ) ) ;
    public final void ruleMMESPOSSWIPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:74:2: ( ( ( rule__MMESPOSSWIPackageFile__Group__0 ) ) )
            // InternalOSSWI.g:75:1: ( ( rule__MMESPOSSWIPackageFile__Group__0 ) )
            {
            // InternalOSSWI.g:75:1: ( ( rule__MMESPOSSWIPackageFile__Group__0 ) )
            // InternalOSSWI.g:76:1: ( rule__MMESPOSSWIPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getGroup()); 
            }
            // InternalOSSWI.g:77:1: ( rule__MMESPOSSWIPackageFile__Group__0 )
            // InternalOSSWI.g:77:2: rule__MMESPOSSWIPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMMESPOSSWIPackageFile"


    // $ANTLR start "entryRuleMMESPOSSWIPackageElement"
    // InternalOSSWI.g:89:1: entryRuleMMESPOSSWIPackageElement : ruleMMESPOSSWIPackageElement EOF ;
    public final void entryRuleMMESPOSSWIPackageElement() throws RecognitionException {
        try {
            // InternalOSSWI.g:90:1: ( ruleMMESPOSSWIPackageElement EOF )
            // InternalOSSWI.g:91:1: ruleMMESPOSSWIPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMMESPOSSWIPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageElementRule()); 
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
    // $ANTLR end "entryRuleMMESPOSSWIPackageElement"


    // $ANTLR start "ruleMMESPOSSWIPackageElement"
    // InternalOSSWI.g:98:1: ruleMMESPOSSWIPackageElement : ( ruleMOSSwInterface ) ;
    public final void ruleMMESPOSSWIPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:102:2: ( ( ruleMOSSwInterface ) )
            // InternalOSSWI.g:103:1: ( ruleMOSSwInterface )
            {
            // InternalOSSWI.g:103:1: ( ruleMOSSwInterface )
            // InternalOSSWI.g:104:1: ruleMOSSwInterface
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageElementAccess().getMOSSwInterfaceParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMOSSwInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageElementAccess().getMOSSwInterfaceParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMMESPOSSWIPackageElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalOSSWI.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalOSSWI.g:118:1: ( ruleQualifiedName EOF )
            // InternalOSSWI.g:119:1: ruleQualifiedName EOF
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
    // InternalOSSWI.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalOSSWI.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalOSSWI.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalOSSWI.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalOSSWI.g:133:1: ( rule__QualifiedName__Group__0 )
            // InternalOSSWI.g:133:2: rule__QualifiedName__Group__0
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
    // InternalOSSWI.g:145:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalOSSWI.g:146:1: ( ruleVersion EOF )
            // InternalOSSWI.g:147:1: ruleVersion EOF
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
    // InternalOSSWI.g:154:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:158:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalOSSWI.g:159:1: ( ( rule__Version__Group__0 ) )
            {
            // InternalOSSWI.g:159:1: ( ( rule__Version__Group__0 ) )
            // InternalOSSWI.g:160:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalOSSWI.g:161:1: ( rule__Version__Group__0 )
            // InternalOSSWI.g:161:2: rule__Version__Group__0
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
    // InternalOSSWI.g:173:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalOSSWI.g:174:1: ( ruleVersionedQualifiedName EOF )
            // InternalOSSWI.g:175:1: ruleVersionedQualifiedName EOF
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
    // InternalOSSWI.g:182:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:186:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalOSSWI.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalOSSWI.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalOSSWI.g:188:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalOSSWI.g:189:1: ( rule__VersionedQualifiedName__Group__0 )
            // InternalOSSWI.g:189:2: rule__VersionedQualifiedName__Group__0
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
    // InternalOSSWI.g:201:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // InternalOSSWI.g:202:1: ( ruleVersionedQualifiedReferenceName EOF )
            // InternalOSSWI.g:203:1: ruleVersionedQualifiedReferenceName EOF
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
    // InternalOSSWI.g:210:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:214:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // InternalOSSWI.g:215:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // InternalOSSWI.g:215:1: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // InternalOSSWI.g:216:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }
            // InternalOSSWI.g:217:1: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // InternalOSSWI.g:217:2: rule__VersionedQualifiedReferenceName__Group__0
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


    // $ANTLR start "entryRuleMOSSwInterface"
    // InternalOSSWI.g:229:1: entryRuleMOSSwInterface : ruleMOSSwInterface EOF ;
    public final void entryRuleMOSSwInterface() throws RecognitionException {
        try {
            // InternalOSSWI.g:230:1: ( ruleMOSSwInterface EOF )
            // InternalOSSWI.g:231:1: ruleMOSSwInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMOSSwInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceRule()); 
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
    // $ANTLR end "entryRuleMOSSwInterface"


    // $ANTLR start "ruleMOSSwInterface"
    // InternalOSSWI.g:238:1: ruleMOSSwInterface : ( ( rule__MOSSwInterface__Group__0 ) ) ;
    public final void ruleMOSSwInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:242:2: ( ( ( rule__MOSSwInterface__Group__0 ) ) )
            // InternalOSSWI.g:243:1: ( ( rule__MOSSwInterface__Group__0 ) )
            {
            // InternalOSSWI.g:243:1: ( ( rule__MOSSwInterface__Group__0 ) )
            // InternalOSSWI.g:244:1: ( rule__MOSSwInterface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getGroup()); 
            }
            // InternalOSSWI.g:245:1: ( rule__MOSSwInterface__Group__0 )
            // InternalOSSWI.g:245:2: rule__MOSSwInterface__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMOSSwInterface"


    // $ANTLR start "entryRuleMProvidedResource"
    // InternalOSSWI.g:257:1: entryRuleMProvidedResource : ruleMProvidedResource EOF ;
    public final void entryRuleMProvidedResource() throws RecognitionException {
        try {
            // InternalOSSWI.g:258:1: ( ruleMProvidedResource EOF )
            // InternalOSSWI.g:259:1: ruleMProvidedResource EOF
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
    // InternalOSSWI.g:266:1: ruleMProvidedResource : ( ( rule__MProvidedResource__Alternatives ) ) ;
    public final void ruleMProvidedResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:270:2: ( ( ( rule__MProvidedResource__Alternatives ) ) )
            // InternalOSSWI.g:271:1: ( ( rule__MProvidedResource__Alternatives ) )
            {
            // InternalOSSWI.g:271:1: ( ( rule__MProvidedResource__Alternatives ) )
            // InternalOSSWI.g:272:1: ( rule__MProvidedResource__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedResourceAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:273:1: ( rule__MProvidedResource__Alternatives )
            // InternalOSSWI.g:273:2: rule__MProvidedResource__Alternatives
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
    // InternalOSSWI.g:285:1: entryRuleMQuantifiableResource : ruleMQuantifiableResource EOF ;
    public final void entryRuleMQuantifiableResource() throws RecognitionException {
        try {
            // InternalOSSWI.g:286:1: ( ruleMQuantifiableResource EOF )
            // InternalOSSWI.g:287:1: ruleMQuantifiableResource EOF
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
    // InternalOSSWI.g:294:1: ruleMQuantifiableResource : ( ( rule__MQuantifiableResource__Group__0 ) ) ;
    public final void ruleMQuantifiableResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:298:2: ( ( ( rule__MQuantifiableResource__Group__0 ) ) )
            // InternalOSSWI.g:299:1: ( ( rule__MQuantifiableResource__Group__0 ) )
            {
            // InternalOSSWI.g:299:1: ( ( rule__MQuantifiableResource__Group__0 ) )
            // InternalOSSWI.g:300:1: ( rule__MQuantifiableResource__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getGroup()); 
            }
            // InternalOSSWI.g:301:1: ( rule__MQuantifiableResource__Group__0 )
            // InternalOSSWI.g:301:2: rule__MQuantifiableResource__Group__0
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
    // InternalOSSWI.g:313:1: entryRuleMInstantiableResource : ruleMInstantiableResource EOF ;
    public final void entryRuleMInstantiableResource() throws RecognitionException {
        try {
            // InternalOSSWI.g:314:1: ( ruleMInstantiableResource EOF )
            // InternalOSSWI.g:315:1: ruleMInstantiableResource EOF
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
    // InternalOSSWI.g:322:1: ruleMInstantiableResource : ( ( rule__MInstantiableResource__Group__0 ) ) ;
    public final void ruleMInstantiableResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:326:2: ( ( ( rule__MInstantiableResource__Group__0 ) ) )
            // InternalOSSWI.g:327:1: ( ( rule__MInstantiableResource__Group__0 ) )
            {
            // InternalOSSWI.g:327:1: ( ( rule__MInstantiableResource__Group__0 ) )
            // InternalOSSWI.g:328:1: ( rule__MInstantiableResource__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getGroup()); 
            }
            // InternalOSSWI.g:329:1: ( rule__MInstantiableResource__Group__0 )
            // InternalOSSWI.g:329:2: rule__MInstantiableResource__Group__0
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
    // InternalOSSWI.g:341:1: entryRuleMParameter : ruleMParameter EOF ;
    public final void entryRuleMParameter() throws RecognitionException {
        try {
            // InternalOSSWI.g:342:1: ( ruleMParameter EOF )
            // InternalOSSWI.g:343:1: ruleMParameter EOF
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
    // InternalOSSWI.g:350:1: ruleMParameter : ( ( rule__MParameter__Alternatives ) ) ;
    public final void ruleMParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:354:2: ( ( ( rule__MParameter__Alternatives ) ) )
            // InternalOSSWI.g:355:1: ( ( rule__MParameter__Alternatives ) )
            {
            // InternalOSSWI.g:355:1: ( ( rule__MParameter__Alternatives ) )
            // InternalOSSWI.g:356:1: ( rule__MParameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:357:1: ( rule__MParameter__Alternatives )
            // InternalOSSWI.g:357:2: rule__MParameter__Alternatives
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
    // InternalOSSWI.g:369:1: entryRuleMIntegerParameterSingleExpression : ruleMIntegerParameterSingleExpression EOF ;
    public final void entryRuleMIntegerParameterSingleExpression() throws RecognitionException {
        try {
            // InternalOSSWI.g:370:1: ( ruleMIntegerParameterSingleExpression EOF )
            // InternalOSSWI.g:371:1: ruleMIntegerParameterSingleExpression EOF
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
    // InternalOSSWI.g:378:1: ruleMIntegerParameterSingleExpression : ( ( rule__MIntegerParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMIntegerParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:382:2: ( ( ( rule__MIntegerParameterSingleExpression__Group__0 ) ) )
            // InternalOSSWI.g:383:1: ( ( rule__MIntegerParameterSingleExpression__Group__0 ) )
            {
            // InternalOSSWI.g:383:1: ( ( rule__MIntegerParameterSingleExpression__Group__0 ) )
            // InternalOSSWI.g:384:1: ( rule__MIntegerParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalOSSWI.g:385:1: ( rule__MIntegerParameterSingleExpression__Group__0 )
            // InternalOSSWI.g:385:2: rule__MIntegerParameterSingleExpression__Group__0
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
    // InternalOSSWI.g:397:1: entryRuleMEnumParameterDefinition : ruleMEnumParameterDefinition EOF ;
    public final void entryRuleMEnumParameterDefinition() throws RecognitionException {
        try {
            // InternalOSSWI.g:398:1: ( ruleMEnumParameterDefinition EOF )
            // InternalOSSWI.g:399:1: ruleMEnumParameterDefinition EOF
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
    // InternalOSSWI.g:406:1: ruleMEnumParameterDefinition : ( ( rule__MEnumParameterDefinition__Group__0 ) ) ;
    public final void ruleMEnumParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:410:2: ( ( ( rule__MEnumParameterDefinition__Group__0 ) ) )
            // InternalOSSWI.g:411:1: ( ( rule__MEnumParameterDefinition__Group__0 ) )
            {
            // InternalOSSWI.g:411:1: ( ( rule__MEnumParameterDefinition__Group__0 ) )
            // InternalOSSWI.g:412:1: ( rule__MEnumParameterDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getGroup()); 
            }
            // InternalOSSWI.g:413:1: ( rule__MEnumParameterDefinition__Group__0 )
            // InternalOSSWI.g:413:2: rule__MEnumParameterDefinition__Group__0
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
    // InternalOSSWI.g:425:1: entryRuleMEnumParameterSingleExpression : ruleMEnumParameterSingleExpression EOF ;
    public final void entryRuleMEnumParameterSingleExpression() throws RecognitionException {
        try {
            // InternalOSSWI.g:426:1: ( ruleMEnumParameterSingleExpression EOF )
            // InternalOSSWI.g:427:1: ruleMEnumParameterSingleExpression EOF
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
    // InternalOSSWI.g:434:1: ruleMEnumParameterSingleExpression : ( ( rule__MEnumParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMEnumParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:438:2: ( ( ( rule__MEnumParameterSingleExpression__Group__0 ) ) )
            // InternalOSSWI.g:439:1: ( ( rule__MEnumParameterSingleExpression__Group__0 ) )
            {
            // InternalOSSWI.g:439:1: ( ( rule__MEnumParameterSingleExpression__Group__0 ) )
            // InternalOSSWI.g:440:1: ( rule__MEnumParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalOSSWI.g:441:1: ( rule__MEnumParameterSingleExpression__Group__0 )
            // InternalOSSWI.g:441:2: rule__MEnumParameterSingleExpression__Group__0
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
    // InternalOSSWI.g:453:1: entryRuleMRealParameterSingleExpression : ruleMRealParameterSingleExpression EOF ;
    public final void entryRuleMRealParameterSingleExpression() throws RecognitionException {
        try {
            // InternalOSSWI.g:454:1: ( ruleMRealParameterSingleExpression EOF )
            // InternalOSSWI.g:455:1: ruleMRealParameterSingleExpression EOF
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
    // InternalOSSWI.g:462:1: ruleMRealParameterSingleExpression : ( ( rule__MRealParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMRealParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:466:2: ( ( ( rule__MRealParameterSingleExpression__Group__0 ) ) )
            // InternalOSSWI.g:467:1: ( ( rule__MRealParameterSingleExpression__Group__0 ) )
            {
            // InternalOSSWI.g:467:1: ( ( rule__MRealParameterSingleExpression__Group__0 ) )
            // InternalOSSWI.g:468:1: ( rule__MRealParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalOSSWI.g:469:1: ( rule__MRealParameterSingleExpression__Group__0 )
            // InternalOSSWI.g:469:2: rule__MRealParameterSingleExpression__Group__0
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
    // InternalOSSWI.g:481:1: entryRuleMEnumParameterLiteralRule : ruleMEnumParameterLiteralRule EOF ;
    public final void entryRuleMEnumParameterLiteralRule() throws RecognitionException {
        try {
            // InternalOSSWI.g:482:1: ( ruleMEnumParameterLiteralRule EOF )
            // InternalOSSWI.g:483:1: ruleMEnumParameterLiteralRule EOF
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
    // InternalOSSWI.g:490:1: ruleMEnumParameterLiteralRule : ( ( rule__MEnumParameterLiteralRule__Alternatives ) ) ;
    public final void ruleMEnumParameterLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:494:2: ( ( ( rule__MEnumParameterLiteralRule__Alternatives ) ) )
            // InternalOSSWI.g:495:1: ( ( rule__MEnumParameterLiteralRule__Alternatives ) )
            {
            // InternalOSSWI.g:495:1: ( ( rule__MEnumParameterLiteralRule__Alternatives ) )
            // InternalOSSWI.g:496:1: ( rule__MEnumParameterLiteralRule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:497:1: ( rule__MEnumParameterLiteralRule__Alternatives )
            // InternalOSSWI.g:497:2: rule__MEnumParameterLiteralRule__Alternatives
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
    // InternalOSSWI.g:509:1: entryRuleMEnumParameterLiteral : ruleMEnumParameterLiteral EOF ;
    public final void entryRuleMEnumParameterLiteral() throws RecognitionException {
        try {
            // InternalOSSWI.g:510:1: ( ruleMEnumParameterLiteral EOF )
            // InternalOSSWI.g:511:1: ruleMEnumParameterLiteral EOF
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
    // InternalOSSWI.g:518:1: ruleMEnumParameterLiteral : ( ( rule__MEnumParameterLiteral__Group__0 ) ) ;
    public final void ruleMEnumParameterLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:522:2: ( ( ( rule__MEnumParameterLiteral__Group__0 ) ) )
            // InternalOSSWI.g:523:1: ( ( rule__MEnumParameterLiteral__Group__0 ) )
            {
            // InternalOSSWI.g:523:1: ( ( rule__MEnumParameterLiteral__Group__0 ) )
            // InternalOSSWI.g:524:1: ( rule__MEnumParameterLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralAccess().getGroup()); 
            }
            // InternalOSSWI.g:525:1: ( rule__MEnumParameterLiteral__Group__0 )
            // InternalOSSWI.g:525:2: rule__MEnumParameterLiteral__Group__0
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
    // InternalOSSWI.g:537:1: entryRuleMEnumParamIntegerLiteral : ruleMEnumParamIntegerLiteral EOF ;
    public final void entryRuleMEnumParamIntegerLiteral() throws RecognitionException {
        try {
            // InternalOSSWI.g:538:1: ( ruleMEnumParamIntegerLiteral EOF )
            // InternalOSSWI.g:539:1: ruleMEnumParamIntegerLiteral EOF
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
    // InternalOSSWI.g:546:1: ruleMEnumParamIntegerLiteral : ( ( rule__MEnumParamIntegerLiteral__Group__0 ) ) ;
    public final void ruleMEnumParamIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:550:2: ( ( ( rule__MEnumParamIntegerLiteral__Group__0 ) ) )
            // InternalOSSWI.g:551:1: ( ( rule__MEnumParamIntegerLiteral__Group__0 ) )
            {
            // InternalOSSWI.g:551:1: ( ( rule__MEnumParamIntegerLiteral__Group__0 ) )
            // InternalOSSWI.g:552:1: ( rule__MEnumParamIntegerLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup()); 
            }
            // InternalOSSWI.g:553:1: ( rule__MEnumParamIntegerLiteral__Group__0 )
            // InternalOSSWI.g:553:2: rule__MEnumParamIntegerLiteral__Group__0
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
    // InternalOSSWI.g:565:1: entryRuleMEnumParamRealLiteral : ruleMEnumParamRealLiteral EOF ;
    public final void entryRuleMEnumParamRealLiteral() throws RecognitionException {
        try {
            // InternalOSSWI.g:566:1: ( ruleMEnumParamRealLiteral EOF )
            // InternalOSSWI.g:567:1: ruleMEnumParamRealLiteral EOF
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
    // InternalOSSWI.g:574:1: ruleMEnumParamRealLiteral : ( ( rule__MEnumParamRealLiteral__Group__0 ) ) ;
    public final void ruleMEnumParamRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:578:2: ( ( ( rule__MEnumParamRealLiteral__Group__0 ) ) )
            // InternalOSSWI.g:579:1: ( ( rule__MEnumParamRealLiteral__Group__0 ) )
            {
            // InternalOSSWI.g:579:1: ( ( rule__MEnumParamRealLiteral__Group__0 ) )
            // InternalOSSWI.g:580:1: ( rule__MEnumParamRealLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getGroup()); 
            }
            // InternalOSSWI.g:581:1: ( rule__MEnumParamRealLiteral__Group__0 )
            // InternalOSSWI.g:581:2: rule__MEnumParamRealLiteral__Group__0
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
    // InternalOSSWI.g:593:1: entryRuleMEnumParamStringLiteral : ruleMEnumParamStringLiteral EOF ;
    public final void entryRuleMEnumParamStringLiteral() throws RecognitionException {
        try {
            // InternalOSSWI.g:594:1: ( ruleMEnumParamStringLiteral EOF )
            // InternalOSSWI.g:595:1: ruleMEnumParamStringLiteral EOF
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
    // InternalOSSWI.g:602:1: ruleMEnumParamStringLiteral : ( ( rule__MEnumParamStringLiteral__Group__0 ) ) ;
    public final void ruleMEnumParamStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:606:2: ( ( ( rule__MEnumParamStringLiteral__Group__0 ) ) )
            // InternalOSSWI.g:607:1: ( ( rule__MEnumParamStringLiteral__Group__0 ) )
            {
            // InternalOSSWI.g:607:1: ( ( rule__MEnumParamStringLiteral__Group__0 ) )
            // InternalOSSWI.g:608:1: ( rule__MEnumParamStringLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getGroup()); 
            }
            // InternalOSSWI.g:609:1: ( rule__MEnumParamStringLiteral__Group__0 )
            // InternalOSSWI.g:609:2: rule__MEnumParamStringLiteral__Group__0
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
    // InternalOSSWI.g:621:1: entryRuleMBooleanParameterSingleExpression : ruleMBooleanParameterSingleExpression EOF ;
    public final void entryRuleMBooleanParameterSingleExpression() throws RecognitionException {
        try {
            // InternalOSSWI.g:622:1: ( ruleMBooleanParameterSingleExpression EOF )
            // InternalOSSWI.g:623:1: ruleMBooleanParameterSingleExpression EOF
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
    // InternalOSSWI.g:630:1: ruleMBooleanParameterSingleExpression : ( ( rule__MBooleanParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMBooleanParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:634:2: ( ( ( rule__MBooleanParameterSingleExpression__Group__0 ) ) )
            // InternalOSSWI.g:635:1: ( ( rule__MBooleanParameterSingleExpression__Group__0 ) )
            {
            // InternalOSSWI.g:635:1: ( ( rule__MBooleanParameterSingleExpression__Group__0 ) )
            // InternalOSSWI.g:636:1: ( rule__MBooleanParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalOSSWI.g:637:1: ( rule__MBooleanParameterSingleExpression__Group__0 )
            // InternalOSSWI.g:637:2: rule__MBooleanParameterSingleExpression__Group__0
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
    // InternalOSSWI.g:649:1: entryRuleMStringParameterSingleExpression : ruleMStringParameterSingleExpression EOF ;
    public final void entryRuleMStringParameterSingleExpression() throws RecognitionException {
        try {
            // InternalOSSWI.g:650:1: ( ruleMStringParameterSingleExpression EOF )
            // InternalOSSWI.g:651:1: ruleMStringParameterSingleExpression EOF
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
    // InternalOSSWI.g:658:1: ruleMStringParameterSingleExpression : ( ( rule__MStringParameterSingleExpression__Group__0 ) ) ;
    public final void ruleMStringParameterSingleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:662:2: ( ( ( rule__MStringParameterSingleExpression__Group__0 ) ) )
            // InternalOSSWI.g:663:1: ( ( rule__MStringParameterSingleExpression__Group__0 ) )
            {
            // InternalOSSWI.g:663:1: ( ( rule__MStringParameterSingleExpression__Group__0 ) )
            // InternalOSSWI.g:664:1: ( rule__MStringParameterSingleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup()); 
            }
            // InternalOSSWI.g:665:1: ( rule__MStringParameterSingleExpression__Group__0 )
            // InternalOSSWI.g:665:2: rule__MStringParameterSingleExpression__Group__0
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
    // InternalOSSWI.g:677:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalOSSWI.g:678:1: ( ruleEBoolean EOF )
            // InternalOSSWI.g:679:1: ruleEBoolean EOF
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
    // InternalOSSWI.g:686:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:690:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalOSSWI.g:691:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalOSSWI.g:691:1: ( ( rule__EBoolean__Alternatives ) )
            // InternalOSSWI.g:692:1: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:693:1: ( rule__EBoolean__Alternatives )
            // InternalOSSWI.g:693:2: rule__EBoolean__Alternatives
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
    // InternalOSSWI.g:705:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalOSSWI.g:706:1: ( ruleINTEGER EOF )
            // InternalOSSWI.g:707:1: ruleINTEGER EOF
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
    // InternalOSSWI.g:714:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:718:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalOSSWI.g:719:1: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalOSSWI.g:719:1: ( ( rule__INTEGER__Alternatives ) )
            // InternalOSSWI.g:720:1: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:721:1: ( rule__INTEGER__Alternatives )
            // InternalOSSWI.g:721:2: rule__INTEGER__Alternatives
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
    // InternalOSSWI.g:733:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
        try {
            // InternalOSSWI.g:734:1: ( ruleREAL EOF )
            // InternalOSSWI.g:735:1: ruleREAL EOF
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
    // InternalOSSWI.g:742:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:746:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalOSSWI.g:747:1: ( ( rule__REAL__Group__0 ) )
            {
            // InternalOSSWI.g:747:1: ( ( rule__REAL__Group__0 ) )
            // InternalOSSWI.g:748:1: ( rule__REAL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup()); 
            }
            // InternalOSSWI.g:749:1: ( rule__REAL__Group__0 )
            // InternalOSSWI.g:749:2: rule__REAL__Group__0
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
    // InternalOSSWI.g:761:1: entryRuleMParameterValue : ruleMParameterValue EOF ;
    public final void entryRuleMParameterValue() throws RecognitionException {
        try {
            // InternalOSSWI.g:762:1: ( ruleMParameterValue EOF )
            // InternalOSSWI.g:763:1: ruleMParameterValue EOF
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
    // InternalOSSWI.g:770:1: ruleMParameterValue : ( ( rule__MParameterValue__Alternatives ) ) ;
    public final void ruleMParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:774:2: ( ( ( rule__MParameterValue__Alternatives ) ) )
            // InternalOSSWI.g:775:1: ( ( rule__MParameterValue__Alternatives ) )
            {
            // InternalOSSWI.g:775:1: ( ( rule__MParameterValue__Alternatives ) )
            // InternalOSSWI.g:776:1: ( rule__MParameterValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:777:1: ( rule__MParameterValue__Alternatives )
            // InternalOSSWI.g:777:2: rule__MParameterValue__Alternatives
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
    // InternalOSSWI.g:789:1: entryRuleMParameterValueLiteral : ruleMParameterValueLiteral EOF ;
    public final void entryRuleMParameterValueLiteral() throws RecognitionException {
        try {
            // InternalOSSWI.g:790:1: ( ruleMParameterValueLiteral EOF )
            // InternalOSSWI.g:791:1: ruleMParameterValueLiteral EOF
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
    // InternalOSSWI.g:798:1: ruleMParameterValueLiteral : ( ( rule__MParameterValueLiteral__Alternatives ) ) ;
    public final void ruleMParameterValueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:802:2: ( ( ( rule__MParameterValueLiteral__Alternatives ) ) )
            // InternalOSSWI.g:803:1: ( ( rule__MParameterValueLiteral__Alternatives ) )
            {
            // InternalOSSWI.g:803:1: ( ( rule__MParameterValueLiteral__Alternatives ) )
            // InternalOSSWI.g:804:1: ( rule__MParameterValueLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueLiteralAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:805:1: ( rule__MParameterValueLiteral__Alternatives )
            // InternalOSSWI.g:805:2: rule__MParameterValueLiteral__Alternatives
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
    // InternalOSSWI.g:817:1: entryRuleMParameterValueBooleanLiteral : ruleMParameterValueBooleanLiteral EOF ;
    public final void entryRuleMParameterValueBooleanLiteral() throws RecognitionException {
        try {
            // InternalOSSWI.g:818:1: ( ruleMParameterValueBooleanLiteral EOF )
            // InternalOSSWI.g:819:1: ruleMParameterValueBooleanLiteral EOF
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
    // InternalOSSWI.g:826:1: ruleMParameterValueBooleanLiteral : ( ( rule__MParameterValueBooleanLiteral__Group__0 ) ) ;
    public final void ruleMParameterValueBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:830:2: ( ( ( rule__MParameterValueBooleanLiteral__Group__0 ) ) )
            // InternalOSSWI.g:831:1: ( ( rule__MParameterValueBooleanLiteral__Group__0 ) )
            {
            // InternalOSSWI.g:831:1: ( ( rule__MParameterValueBooleanLiteral__Group__0 ) )
            // InternalOSSWI.g:832:1: ( rule__MParameterValueBooleanLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueBooleanLiteralAccess().getGroup()); 
            }
            // InternalOSSWI.g:833:1: ( rule__MParameterValueBooleanLiteral__Group__0 )
            // InternalOSSWI.g:833:2: rule__MParameterValueBooleanLiteral__Group__0
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
    // InternalOSSWI.g:845:1: entryRuleMParameterValueStringLiteral : ruleMParameterValueStringLiteral EOF ;
    public final void entryRuleMParameterValueStringLiteral() throws RecognitionException {
        try {
            // InternalOSSWI.g:846:1: ( ruleMParameterValueStringLiteral EOF )
            // InternalOSSWI.g:847:1: ruleMParameterValueStringLiteral EOF
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
    // InternalOSSWI.g:854:1: ruleMParameterValueStringLiteral : ( ( rule__MParameterValueStringLiteral__Group__0 ) ) ;
    public final void ruleMParameterValueStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:858:2: ( ( ( rule__MParameterValueStringLiteral__Group__0 ) ) )
            // InternalOSSWI.g:859:1: ( ( rule__MParameterValueStringLiteral__Group__0 ) )
            {
            // InternalOSSWI.g:859:1: ( ( rule__MParameterValueStringLiteral__Group__0 ) )
            // InternalOSSWI.g:860:1: ( rule__MParameterValueStringLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getGroup()); 
            }
            // InternalOSSWI.g:861:1: ( rule__MParameterValueStringLiteral__Group__0 )
            // InternalOSSWI.g:861:2: rule__MParameterValueStringLiteral__Group__0
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
    // InternalOSSWI.g:873:1: entryRuleMParameterValueIntegerLiteral : ruleMParameterValueIntegerLiteral EOF ;
    public final void entryRuleMParameterValueIntegerLiteral() throws RecognitionException {
        try {
            // InternalOSSWI.g:874:1: ( ruleMParameterValueIntegerLiteral EOF )
            // InternalOSSWI.g:875:1: ruleMParameterValueIntegerLiteral EOF
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
    // InternalOSSWI.g:882:1: ruleMParameterValueIntegerLiteral : ( ( rule__MParameterValueIntegerLiteral__Group__0 ) ) ;
    public final void ruleMParameterValueIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:886:2: ( ( ( rule__MParameterValueIntegerLiteral__Group__0 ) ) )
            // InternalOSSWI.g:887:1: ( ( rule__MParameterValueIntegerLiteral__Group__0 ) )
            {
            // InternalOSSWI.g:887:1: ( ( rule__MParameterValueIntegerLiteral__Group__0 ) )
            // InternalOSSWI.g:888:1: ( rule__MParameterValueIntegerLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueIntegerLiteralAccess().getGroup()); 
            }
            // InternalOSSWI.g:889:1: ( rule__MParameterValueIntegerLiteral__Group__0 )
            // InternalOSSWI.g:889:2: rule__MParameterValueIntegerLiteral__Group__0
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
    // InternalOSSWI.g:901:1: entryRuleMParameterValueRealLiteral : ruleMParameterValueRealLiteral EOF ;
    public final void entryRuleMParameterValueRealLiteral() throws RecognitionException {
        try {
            // InternalOSSWI.g:902:1: ( ruleMParameterValueRealLiteral EOF )
            // InternalOSSWI.g:903:1: ruleMParameterValueRealLiteral EOF
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
    // InternalOSSWI.g:910:1: ruleMParameterValueRealLiteral : ( ( rule__MParameterValueRealLiteral__Group__0 ) ) ;
    public final void ruleMParameterValueRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:914:2: ( ( ( rule__MParameterValueRealLiteral__Group__0 ) ) )
            // InternalOSSWI.g:915:1: ( ( rule__MParameterValueRealLiteral__Group__0 ) )
            {
            // InternalOSSWI.g:915:1: ( ( rule__MParameterValueRealLiteral__Group__0 ) )
            // InternalOSSWI.g:916:1: ( rule__MParameterValueRealLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRealLiteralAccess().getGroup()); 
            }
            // InternalOSSWI.g:917:1: ( rule__MParameterValueRealLiteral__Group__0 )
            // InternalOSSWI.g:917:2: rule__MParameterValueRealLiteral__Group__0
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
    // InternalOSSWI.g:929:1: entryRuleMParameterValueRefObject : ruleMParameterValueRefObject EOF ;
    public final void entryRuleMParameterValueRefObject() throws RecognitionException {
        try {
            // InternalOSSWI.g:930:1: ( ruleMParameterValueRefObject EOF )
            // InternalOSSWI.g:931:1: ruleMParameterValueRefObject EOF
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
    // InternalOSSWI.g:938:1: ruleMParameterValueRefObject : ( ( rule__MParameterValueRefObject__Group__0 ) ) ;
    public final void ruleMParameterValueRefObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:942:2: ( ( ( rule__MParameterValueRefObject__Group__0 ) ) )
            // InternalOSSWI.g:943:1: ( ( rule__MParameterValueRefObject__Group__0 ) )
            {
            // InternalOSSWI.g:943:1: ( ( rule__MParameterValueRefObject__Group__0 ) )
            // InternalOSSWI.g:944:1: ( rule__MParameterValueRefObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectAccess().getGroup()); 
            }
            // InternalOSSWI.g:945:1: ( rule__MParameterValueRefObject__Group__0 )
            // InternalOSSWI.g:945:2: rule__MParameterValueRefObject__Group__0
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
    // InternalOSSWI.g:957:1: entryRuleMParameterValuePAR : ruleMParameterValuePAR EOF ;
    public final void entryRuleMParameterValuePAR() throws RecognitionException {
        try {
            // InternalOSSWI.g:958:1: ( ruleMParameterValuePAR EOF )
            // InternalOSSWI.g:959:1: ruleMParameterValuePAR EOF
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
    // InternalOSSWI.g:966:1: ruleMParameterValuePAR : ( ( rule__MParameterValuePAR__Group__0 ) ) ;
    public final void ruleMParameterValuePAR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:970:2: ( ( ( rule__MParameterValuePAR__Group__0 ) ) )
            // InternalOSSWI.g:971:1: ( ( rule__MParameterValuePAR__Group__0 ) )
            {
            // InternalOSSWI.g:971:1: ( ( rule__MParameterValuePAR__Group__0 ) )
            // InternalOSSWI.g:972:1: ( rule__MParameterValuePAR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValuePARAccess().getGroup()); 
            }
            // InternalOSSWI.g:973:1: ( rule__MParameterValuePAR__Group__0 )
            // InternalOSSWI.g:973:2: rule__MParameterValuePAR__Group__0
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
    // InternalOSSWI.g:985:1: entryRuleMParameterValueExpression : ruleMParameterValueExpression EOF ;
    public final void entryRuleMParameterValueExpression() throws RecognitionException {
        try {
            // InternalOSSWI.g:986:1: ( ruleMParameterValueExpression EOF )
            // InternalOSSWI.g:987:1: ruleMParameterValueExpression EOF
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
    // InternalOSSWI.g:994:1: ruleMParameterValueExpression : ( ( rule__MParameterValueExpression__Group__0 ) ) ;
    public final void ruleMParameterValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:998:2: ( ( ( rule__MParameterValueExpression__Group__0 ) ) )
            // InternalOSSWI.g:999:1: ( ( rule__MParameterValueExpression__Group__0 ) )
            {
            // InternalOSSWI.g:999:1: ( ( rule__MParameterValueExpression__Group__0 ) )
            // InternalOSSWI.g:1000:1: ( rule__MParameterValueExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getGroup()); 
            }
            // InternalOSSWI.g:1001:1: ( rule__MParameterValueExpression__Group__0 )
            // InternalOSSWI.g:1001:2: rule__MParameterValueExpression__Group__0
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
    // InternalOSSWI.g:1013:1: entryRuleMParameterValueTERM : ruleMParameterValueTERM EOF ;
    public final void entryRuleMParameterValueTERM() throws RecognitionException {
        try {
            // InternalOSSWI.g:1014:1: ( ruleMParameterValueTERM EOF )
            // InternalOSSWI.g:1015:1: ruleMParameterValueTERM EOF
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
    // InternalOSSWI.g:1022:1: ruleMParameterValueTERM : ( ( rule__MParameterValueTERM__Group__0 ) ) ;
    public final void ruleMParameterValueTERM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1026:2: ( ( ( rule__MParameterValueTERM__Group__0 ) ) )
            // InternalOSSWI.g:1027:1: ( ( rule__MParameterValueTERM__Group__0 ) )
            {
            // InternalOSSWI.g:1027:1: ( ( rule__MParameterValueTERM__Group__0 ) )
            // InternalOSSWI.g:1028:1: ( rule__MParameterValueTERM__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getGroup()); 
            }
            // InternalOSSWI.g:1029:1: ( rule__MParameterValueTERM__Group__0 )
            // InternalOSSWI.g:1029:2: rule__MParameterValueTERM__Group__0
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
    // InternalOSSWI.g:1041:1: entryRuleMParameterRange : ruleMParameterRange EOF ;
    public final void entryRuleMParameterRange() throws RecognitionException {
        try {
            // InternalOSSWI.g:1042:1: ( ruleMParameterRange EOF )
            // InternalOSSWI.g:1043:1: ruleMParameterRange EOF
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
    // InternalOSSWI.g:1050:1: ruleMParameterRange : ( ( rule__MParameterRange__Alternatives ) ) ;
    public final void ruleMParameterRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1054:2: ( ( ( rule__MParameterRange__Alternatives ) ) )
            // InternalOSSWI.g:1055:1: ( ( rule__MParameterRange__Alternatives ) )
            {
            // InternalOSSWI.g:1055:1: ( ( rule__MParameterRange__Alternatives ) )
            // InternalOSSWI.g:1056:1: ( rule__MParameterRange__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterRangeAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:1057:1: ( rule__MParameterRange__Alternatives )
            // InternalOSSWI.g:1057:2: rule__MParameterRange__Alternatives
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
    // InternalOSSWI.g:1069:1: entryRuleMParameterOCR : ruleMParameterOCR EOF ;
    public final void entryRuleMParameterOCR() throws RecognitionException {
        try {
            // InternalOSSWI.g:1070:1: ( ruleMParameterOCR EOF )
            // InternalOSSWI.g:1071:1: ruleMParameterOCR EOF
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
    // InternalOSSWI.g:1078:1: ruleMParameterOCR : ( ( rule__MParameterOCR__Group__0 ) ) ;
    public final void ruleMParameterOCR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1082:2: ( ( ( rule__MParameterOCR__Group__0 ) ) )
            // InternalOSSWI.g:1083:1: ( ( rule__MParameterOCR__Group__0 ) )
            {
            // InternalOSSWI.g:1083:1: ( ( rule__MParameterOCR__Group__0 ) )
            // InternalOSSWI.g:1084:1: ( rule__MParameterOCR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getGroup()); 
            }
            // InternalOSSWI.g:1085:1: ( rule__MParameterOCR__Group__0 )
            // InternalOSSWI.g:1085:2: rule__MParameterOCR__Group__0
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
    // InternalOSSWI.g:1097:1: entryRuleMParameterOOR : ruleMParameterOOR EOF ;
    public final void entryRuleMParameterOOR() throws RecognitionException {
        try {
            // InternalOSSWI.g:1098:1: ( ruleMParameterOOR EOF )
            // InternalOSSWI.g:1099:1: ruleMParameterOOR EOF
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
    // InternalOSSWI.g:1106:1: ruleMParameterOOR : ( ( rule__MParameterOOR__Group__0 ) ) ;
    public final void ruleMParameterOOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1110:2: ( ( ( rule__MParameterOOR__Group__0 ) ) )
            // InternalOSSWI.g:1111:1: ( ( rule__MParameterOOR__Group__0 ) )
            {
            // InternalOSSWI.g:1111:1: ( ( rule__MParameterOOR__Group__0 ) )
            // InternalOSSWI.g:1112:1: ( rule__MParameterOOR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getGroup()); 
            }
            // InternalOSSWI.g:1113:1: ( rule__MParameterOOR__Group__0 )
            // InternalOSSWI.g:1113:2: rule__MParameterOOR__Group__0
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
    // InternalOSSWI.g:1125:1: entryRuleMParameterCOR : ruleMParameterCOR EOF ;
    public final void entryRuleMParameterCOR() throws RecognitionException {
        try {
            // InternalOSSWI.g:1126:1: ( ruleMParameterCOR EOF )
            // InternalOSSWI.g:1127:1: ruleMParameterCOR EOF
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
    // InternalOSSWI.g:1134:1: ruleMParameterCOR : ( ( rule__MParameterCOR__Group__0 ) ) ;
    public final void ruleMParameterCOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1138:2: ( ( ( rule__MParameterCOR__Group__0 ) ) )
            // InternalOSSWI.g:1139:1: ( ( rule__MParameterCOR__Group__0 ) )
            {
            // InternalOSSWI.g:1139:1: ( ( rule__MParameterCOR__Group__0 ) )
            // InternalOSSWI.g:1140:1: ( rule__MParameterCOR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getGroup()); 
            }
            // InternalOSSWI.g:1141:1: ( rule__MParameterCOR__Group__0 )
            // InternalOSSWI.g:1141:2: rule__MParameterCOR__Group__0
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
    // InternalOSSWI.g:1153:1: entryRuleMParameterCCR : ruleMParameterCCR EOF ;
    public final void entryRuleMParameterCCR() throws RecognitionException {
        try {
            // InternalOSSWI.g:1154:1: ( ruleMParameterCCR EOF )
            // InternalOSSWI.g:1155:1: ruleMParameterCCR EOF
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
    // InternalOSSWI.g:1162:1: ruleMParameterCCR : ( ( rule__MParameterCCR__Group__0 ) ) ;
    public final void ruleMParameterCCR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1166:2: ( ( ( rule__MParameterCCR__Group__0 ) ) )
            // InternalOSSWI.g:1167:1: ( ( rule__MParameterCCR__Group__0 ) )
            {
            // InternalOSSWI.g:1167:1: ( ( rule__MParameterCCR__Group__0 ) )
            // InternalOSSWI.g:1168:1: ( rule__MParameterCCR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getGroup()); 
            }
            // InternalOSSWI.g:1169:1: ( rule__MParameterCCR__Group__0 )
            // InternalOSSWI.g:1169:2: rule__MParameterCCR__Group__0
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
    // InternalOSSWI.g:1182:1: ruleMParameterValueExpressionOperators : ( ( rule__MParameterValueExpressionOperators__Alternatives ) ) ;
    public final void ruleMParameterValueExpressionOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1186:1: ( ( ( rule__MParameterValueExpressionOperators__Alternatives ) ) )
            // InternalOSSWI.g:1187:1: ( ( rule__MParameterValueExpressionOperators__Alternatives ) )
            {
            // InternalOSSWI.g:1187:1: ( ( rule__MParameterValueExpressionOperators__Alternatives ) )
            // InternalOSSWI.g:1188:1: ( rule__MParameterValueExpressionOperators__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:1189:1: ( rule__MParameterValueExpressionOperators__Alternatives )
            // InternalOSSWI.g:1189:2: rule__MParameterValueExpressionOperators__Alternatives
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
    // InternalOSSWI.g:1201:1: ruleMParameterValueTERMOperators : ( ( rule__MParameterValueTERMOperators__Alternatives ) ) ;
    public final void ruleMParameterValueTERMOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1205:1: ( ( ( rule__MParameterValueTERMOperators__Alternatives ) ) )
            // InternalOSSWI.g:1206:1: ( ( rule__MParameterValueTERMOperators__Alternatives ) )
            {
            // InternalOSSWI.g:1206:1: ( ( rule__MParameterValueTERMOperators__Alternatives ) )
            // InternalOSSWI.g:1207:1: ( rule__MParameterValueTERMOperators__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives()); 
            }
            // InternalOSSWI.g:1208:1: ( rule__MParameterValueTERMOperators__Alternatives )
            // InternalOSSWI.g:1208:2: rule__MParameterValueTERMOperators__Alternatives
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
    // InternalOSSWI.g:1219:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1223:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
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
                    // InternalOSSWI.g:1224:1: ( RULE_INT )
                    {
                    // InternalOSSWI.g:1224:1: ( RULE_INT )
                    // InternalOSSWI.g:1225:1: RULE_INT
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
                    // InternalOSSWI.g:1230:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalOSSWI.g:1230:6: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalOSSWI.g:1231:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalOSSWI.g:1232:1: ( rule__Version__Group_0_1__0 )
                    // InternalOSSWI.g:1232:2: rule__Version__Group_0_1__0
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
    // InternalOSSWI.g:1241:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1245:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==19||LA2_1==21||LA2_1==23) ) {
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
                    // InternalOSSWI.g:1246:1: ( RULE_INT )
                    {
                    // InternalOSSWI.g:1246:1: ( RULE_INT )
                    // InternalOSSWI.g:1247:1: RULE_INT
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
                    // InternalOSSWI.g:1252:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalOSSWI.g:1252:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalOSSWI.g:1253:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalOSSWI.g:1254:1: ( rule__Version__Group_1_1_1__0 )
                    // InternalOSSWI.g:1254:2: rule__Version__Group_1_1_1__0
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
    // InternalOSSWI.g:1263:1: rule__MProvidedResource__Alternatives : ( ( ruleMQuantifiableResource ) | ( ruleMInstantiableResource ) );
    public final void rule__MProvidedResource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1267:1: ( ( ruleMQuantifiableResource ) | ( ruleMInstantiableResource ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==39) ) {
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
                    // InternalOSSWI.g:1268:1: ( ruleMQuantifiableResource )
                    {
                    // InternalOSSWI.g:1268:1: ( ruleMQuantifiableResource )
                    // InternalOSSWI.g:1269:1: ruleMQuantifiableResource
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
                    // InternalOSSWI.g:1274:6: ( ruleMInstantiableResource )
                    {
                    // InternalOSSWI.g:1274:6: ( ruleMInstantiableResource )
                    // InternalOSSWI.g:1275:1: ruleMInstantiableResource
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
    // InternalOSSWI.g:1285:1: rule__MParameter__Alternatives : ( ( ruleMIntegerParameterSingleExpression ) | ( ruleMEnumParameterSingleExpression ) | ( ruleMBooleanParameterSingleExpression ) | ( ruleMRealParameterSingleExpression ) | ( ruleMStringParameterSingleExpression ) | ( ruleMEnumParameterDefinition ) );
    public final void rule__MParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1289:1: ( ( ruleMIntegerParameterSingleExpression ) | ( ruleMEnumParameterSingleExpression ) | ( ruleMBooleanParameterSingleExpression ) | ( ruleMRealParameterSingleExpression ) | ( ruleMStringParameterSingleExpression ) | ( ruleMEnumParameterDefinition ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt4=1;
                }
                break;
            case 42:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_ID) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==26) ) {
                        alt4=6;
                    }
                    else if ( (LA4_6==RULE_ID||(LA4_6>=21 && LA4_6<=22)||LA4_6==24) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt4=3;
                }
                break;
            case 43:
                {
                alt4=4;
                }
                break;
            case 46:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOSSWI.g:1290:1: ( ruleMIntegerParameterSingleExpression )
                    {
                    // InternalOSSWI.g:1290:1: ( ruleMIntegerParameterSingleExpression )
                    // InternalOSSWI.g:1291:1: ruleMIntegerParameterSingleExpression
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
                    // InternalOSSWI.g:1296:6: ( ruleMEnumParameterSingleExpression )
                    {
                    // InternalOSSWI.g:1296:6: ( ruleMEnumParameterSingleExpression )
                    // InternalOSSWI.g:1297:1: ruleMEnumParameterSingleExpression
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
                    // InternalOSSWI.g:1302:6: ( ruleMBooleanParameterSingleExpression )
                    {
                    // InternalOSSWI.g:1302:6: ( ruleMBooleanParameterSingleExpression )
                    // InternalOSSWI.g:1303:1: ruleMBooleanParameterSingleExpression
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
                    // InternalOSSWI.g:1308:6: ( ruleMRealParameterSingleExpression )
                    {
                    // InternalOSSWI.g:1308:6: ( ruleMRealParameterSingleExpression )
                    // InternalOSSWI.g:1309:1: ruleMRealParameterSingleExpression
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
                    // InternalOSSWI.g:1314:6: ( ruleMStringParameterSingleExpression )
                    {
                    // InternalOSSWI.g:1314:6: ( ruleMStringParameterSingleExpression )
                    // InternalOSSWI.g:1315:1: ruleMStringParameterSingleExpression
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
                    // InternalOSSWI.g:1320:6: ( ruleMEnumParameterDefinition )
                    {
                    // InternalOSSWI.g:1320:6: ( ruleMEnumParameterDefinition )
                    // InternalOSSWI.g:1321:1: ruleMEnumParameterDefinition
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
    // InternalOSSWI.g:1331:1: rule__MEnumParameterLiteralRule__Alternatives : ( ( ruleMEnumParameterLiteral ) | ( ruleMEnumParamIntegerLiteral ) | ( ruleMEnumParamRealLiteral ) | ( ruleMEnumParamStringLiteral ) );
    public final void rule__MEnumParameterLiteralRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1335:1: ( ( ruleMEnumParameterLiteral ) | ( ruleMEnumParamIntegerLiteral ) | ( ruleMEnumParamRealLiteral ) | ( ruleMEnumParamStringLiteral ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==44) ) {
                    switch ( input.LA(3) ) {
                    case RULE_STRING:
                    case 50:
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
                    // InternalOSSWI.g:1336:1: ( ruleMEnumParameterLiteral )
                    {
                    // InternalOSSWI.g:1336:1: ( ruleMEnumParameterLiteral )
                    // InternalOSSWI.g:1337:1: ruleMEnumParameterLiteral
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
                    // InternalOSSWI.g:1342:6: ( ruleMEnumParamIntegerLiteral )
                    {
                    // InternalOSSWI.g:1342:6: ( ruleMEnumParamIntegerLiteral )
                    // InternalOSSWI.g:1343:1: ruleMEnumParamIntegerLiteral
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
                    // InternalOSSWI.g:1348:6: ( ruleMEnumParamRealLiteral )
                    {
                    // InternalOSSWI.g:1348:6: ( ruleMEnumParamRealLiteral )
                    // InternalOSSWI.g:1349:1: ruleMEnumParamRealLiteral
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
                    // InternalOSSWI.g:1354:6: ( ruleMEnumParamStringLiteral )
                    {
                    // InternalOSSWI.g:1354:6: ( ruleMEnumParamStringLiteral )
                    // InternalOSSWI.g:1355:1: ruleMEnumParamStringLiteral
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
    // InternalOSSWI.g:1365:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1369:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalOSSWI.g:1370:1: ( 'true' )
                    {
                    // InternalOSSWI.g:1370:1: ( 'true' )
                    // InternalOSSWI.g:1371:1: 'true'
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
                    // InternalOSSWI.g:1378:6: ( 'false' )
                    {
                    // InternalOSSWI.g:1378:6: ( 'false' )
                    // InternalOSSWI.g:1379:1: 'false'
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
    // InternalOSSWI.g:1391:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1395:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
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
                    // InternalOSSWI.g:1396:1: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalOSSWI.g:1396:1: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalOSSWI.g:1397:1: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalOSSWI.g:1398:1: ( rule__INTEGER__Group_0__0 )
                    // InternalOSSWI.g:1398:2: rule__INTEGER__Group_0__0
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
                    // InternalOSSWI.g:1402:6: ( RULE_HEXADECIMAL )
                    {
                    // InternalOSSWI.g:1402:6: ( RULE_HEXADECIMAL )
                    // InternalOSSWI.g:1403:1: RULE_HEXADECIMAL
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
    // InternalOSSWI.g:1413:1: rule__MParameterValue__Alternatives : ( ( ruleMParameterValueLiteral ) | ( ruleMParameterValueRefObject ) | ( ruleMParameterValuePAR ) );
    public final void rule__MParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1417:1: ( ( ruleMParameterValueLiteral ) | ( ruleMParameterValueRefObject ) | ( ruleMParameterValuePAR ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_HEXADECIMAL:
            case RULE_STRING:
            case 12:
            case 13:
            case 15:
            case 50:
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
                    // InternalOSSWI.g:1418:1: ( ruleMParameterValueLiteral )
                    {
                    // InternalOSSWI.g:1418:1: ( ruleMParameterValueLiteral )
                    // InternalOSSWI.g:1419:1: ruleMParameterValueLiteral
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
                    // InternalOSSWI.g:1424:6: ( ruleMParameterValueRefObject )
                    {
                    // InternalOSSWI.g:1424:6: ( ruleMParameterValueRefObject )
                    // InternalOSSWI.g:1425:1: ruleMParameterValueRefObject
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
                    // InternalOSSWI.g:1430:6: ( ruleMParameterValuePAR )
                    {
                    // InternalOSSWI.g:1430:6: ( ruleMParameterValuePAR )
                    // InternalOSSWI.g:1431:1: ruleMParameterValuePAR
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
    // InternalOSSWI.g:1441:1: rule__MParameterValueLiteral__Alternatives : ( ( ruleMParameterValueBooleanLiteral ) | ( ruleMParameterValueStringLiteral ) | ( ruleMParameterValueIntegerLiteral ) | ( ruleMParameterValueRealLiteral ) );
    public final void rule__MParameterValueLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1445:1: ( ( ruleMParameterValueBooleanLiteral ) | ( ruleMParameterValueStringLiteral ) | ( ruleMParameterValueIntegerLiteral ) | ( ruleMParameterValueRealLiteral ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
            case 50:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==RULE_INT) ) {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==21) ) {
                        alt9=4;
                    }
                    else if ( (LA9_4==EOF||(LA9_4>=14 && LA9_4<=17)||LA9_4==19||LA9_4==23||LA9_4==29||LA9_4==38||LA9_4==41||LA9_4==48) ) {
                        alt9=3;
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

                if ( (LA9_4==21) ) {
                    alt9=4;
                }
                else if ( (LA9_4==EOF||(LA9_4>=14 && LA9_4<=17)||LA9_4==19||LA9_4==23||LA9_4==29||LA9_4==38||LA9_4==41||LA9_4==48) ) {
                    alt9=3;
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
                    // InternalOSSWI.g:1446:1: ( ruleMParameterValueBooleanLiteral )
                    {
                    // InternalOSSWI.g:1446:1: ( ruleMParameterValueBooleanLiteral )
                    // InternalOSSWI.g:1447:1: ruleMParameterValueBooleanLiteral
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
                    // InternalOSSWI.g:1452:6: ( ruleMParameterValueStringLiteral )
                    {
                    // InternalOSSWI.g:1452:6: ( ruleMParameterValueStringLiteral )
                    // InternalOSSWI.g:1453:1: ruleMParameterValueStringLiteral
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
                    // InternalOSSWI.g:1458:6: ( ruleMParameterValueIntegerLiteral )
                    {
                    // InternalOSSWI.g:1458:6: ( ruleMParameterValueIntegerLiteral )
                    // InternalOSSWI.g:1459:1: ruleMParameterValueIntegerLiteral
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
                    // InternalOSSWI.g:1464:6: ( ruleMParameterValueRealLiteral )
                    {
                    // InternalOSSWI.g:1464:6: ( ruleMParameterValueRealLiteral )
                    // InternalOSSWI.g:1465:1: ruleMParameterValueRealLiteral
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
    // InternalOSSWI.g:1475:1: rule__MParameterRange__Alternatives : ( ( ruleMParameterOCR ) | ( ruleMParameterOOR ) | ( ruleMParameterCOR ) | ( ruleMParameterCCR ) );
    public final void rule__MParameterRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1479:1: ( ( ruleMParameterOCR ) | ( ruleMParameterOOR ) | ( ruleMParameterCOR ) | ( ruleMParameterCCR ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred19_InternalOSSWI()) ) {
                    alt10=1;
                }
                else if ( (synpred20_InternalOSSWI()) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==49) ) {
                int LA10_2 = input.LA(2);

                if ( (synpred21_InternalOSSWI()) ) {
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
                    // InternalOSSWI.g:1480:1: ( ruleMParameterOCR )
                    {
                    // InternalOSSWI.g:1480:1: ( ruleMParameterOCR )
                    // InternalOSSWI.g:1481:1: ruleMParameterOCR
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
                    // InternalOSSWI.g:1486:6: ( ruleMParameterOOR )
                    {
                    // InternalOSSWI.g:1486:6: ( ruleMParameterOOR )
                    // InternalOSSWI.g:1487:1: ruleMParameterOOR
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
                    // InternalOSSWI.g:1492:6: ( ruleMParameterCOR )
                    {
                    // InternalOSSWI.g:1492:6: ( ruleMParameterCOR )
                    // InternalOSSWI.g:1493:1: ruleMParameterCOR
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
                    // InternalOSSWI.g:1498:6: ( ruleMParameterCCR )
                    {
                    // InternalOSSWI.g:1498:6: ( ruleMParameterCCR )
                    // InternalOSSWI.g:1499:1: ruleMParameterCCR
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
    // InternalOSSWI.g:1509:1: rule__MParameterValueExpressionOperators__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__MParameterValueExpressionOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1513:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // InternalOSSWI.g:1514:1: ( ( '+' ) )
                    {
                    // InternalOSSWI.g:1514:1: ( ( '+' ) )
                    // InternalOSSWI.g:1515:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
                    }
                    // InternalOSSWI.g:1516:1: ( '+' )
                    // InternalOSSWI.g:1516:3: '+'
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
                    // InternalOSSWI.g:1521:6: ( ( '-' ) )
                    {
                    // InternalOSSWI.g:1521:6: ( ( '-' ) )
                    // InternalOSSWI.g:1522:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueExpressionOperatorsAccess().getMinusEnumLiteralDeclaration_1()); 
                    }
                    // InternalOSSWI.g:1523:1: ( '-' )
                    // InternalOSSWI.g:1523:3: '-'
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
    // InternalOSSWI.g:1533:1: rule__MParameterValueTERMOperators__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MParameterValueTERMOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1537:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
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
                    // InternalOSSWI.g:1538:1: ( ( '*' ) )
                    {
                    // InternalOSSWI.g:1538:1: ( ( '*' ) )
                    // InternalOSSWI.g:1539:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
                    }
                    // InternalOSSWI.g:1540:1: ( '*' )
                    // InternalOSSWI.g:1540:3: '*'
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
                    // InternalOSSWI.g:1545:6: ( ( '/' ) )
                    {
                    // InternalOSSWI.g:1545:6: ( ( '/' ) )
                    // InternalOSSWI.g:1546:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMParameterValueTERMOperatorsAccess().getDivEnumLiteralDeclaration_1()); 
                    }
                    // InternalOSSWI.g:1547:1: ( '/' )
                    // InternalOSSWI.g:1547:3: '/'
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


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__0"
    // InternalOSSWI.g:1559:1: rule__MMESPOSSWIPackageFile__Group__0 : rule__MMESPOSSWIPackageFile__Group__0__Impl rule__MMESPOSSWIPackageFile__Group__1 ;
    public final void rule__MMESPOSSWIPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1563:1: ( rule__MMESPOSSWIPackageFile__Group__0__Impl rule__MMESPOSSWIPackageFile__Group__1 )
            // InternalOSSWI.g:1564:2: rule__MMESPOSSWIPackageFile__Group__0__Impl rule__MMESPOSSWIPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MMESPOSSWIPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__0"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__0__Impl"
    // InternalOSSWI.g:1571:1: rule__MMESPOSSWIPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__MMESPOSSWIPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1575:1: ( ( 'package' ) )
            // InternalOSSWI.g:1576:1: ( 'package' )
            {
            // InternalOSSWI.g:1576:1: ( 'package' )
            // InternalOSSWI.g:1577:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__0__Impl"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__1"
    // InternalOSSWI.g:1590:1: rule__MMESPOSSWIPackageFile__Group__1 : rule__MMESPOSSWIPackageFile__Group__1__Impl rule__MMESPOSSWIPackageFile__Group__2 ;
    public final void rule__MMESPOSSWIPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1594:1: ( rule__MMESPOSSWIPackageFile__Group__1__Impl rule__MMESPOSSWIPackageFile__Group__2 )
            // InternalOSSWI.g:1595:2: rule__MMESPOSSWIPackageFile__Group__1__Impl rule__MMESPOSSWIPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MMESPOSSWIPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__1"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__1__Impl"
    // InternalOSSWI.g:1602:1: rule__MMESPOSSWIPackageFile__Group__1__Impl : ( ( rule__MMESPOSSWIPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__MMESPOSSWIPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1606:1: ( ( ( rule__MMESPOSSWIPackageFile__PackageAssignment_1 ) ) )
            // InternalOSSWI.g:1607:1: ( ( rule__MMESPOSSWIPackageFile__PackageAssignment_1 ) )
            {
            // InternalOSSWI.g:1607:1: ( ( rule__MMESPOSSWIPackageFile__PackageAssignment_1 ) )
            // InternalOSSWI.g:1608:1: ( rule__MMESPOSSWIPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageAssignment_1()); 
            }
            // InternalOSSWI.g:1609:1: ( rule__MMESPOSSWIPackageFile__PackageAssignment_1 )
            // InternalOSSWI.g:1609:2: rule__MMESPOSSWIPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__PackageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__1__Impl"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__2"
    // InternalOSSWI.g:1619:1: rule__MMESPOSSWIPackageFile__Group__2 : rule__MMESPOSSWIPackageFile__Group__2__Impl rule__MMESPOSSWIPackageFile__Group__3 ;
    public final void rule__MMESPOSSWIPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1623:1: ( rule__MMESPOSSWIPackageFile__Group__2__Impl rule__MMESPOSSWIPackageFile__Group__3 )
            // InternalOSSWI.g:1624:2: rule__MMESPOSSWIPackageFile__Group__2__Impl rule__MMESPOSSWIPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MMESPOSSWIPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__2"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__2__Impl"
    // InternalOSSWI.g:1631:1: rule__MMESPOSSWIPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__MMESPOSSWIPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1635:1: ( ( ';' ) )
            // InternalOSSWI.g:1636:1: ( ';' )
            {
            // InternalOSSWI.g:1636:1: ( ';' )
            // InternalOSSWI.g:1637:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__2__Impl"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__3"
    // InternalOSSWI.g:1650:1: rule__MMESPOSSWIPackageFile__Group__3 : rule__MMESPOSSWIPackageFile__Group__3__Impl rule__MMESPOSSWIPackageFile__Group__4 ;
    public final void rule__MMESPOSSWIPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1654:1: ( rule__MMESPOSSWIPackageFile__Group__3__Impl rule__MMESPOSSWIPackageFile__Group__4 )
            // InternalOSSWI.g:1655:2: rule__MMESPOSSWIPackageFile__Group__3__Impl rule__MMESPOSSWIPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MMESPOSSWIPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__3"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__3__Impl"
    // InternalOSSWI.g:1662:1: rule__MMESPOSSWIPackageFile__Group__3__Impl : ( ( rule__MMESPOSSWIPackageFile__Group_3__0 )* ) ;
    public final void rule__MMESPOSSWIPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1666:1: ( ( ( rule__MMESPOSSWIPackageFile__Group_3__0 )* ) )
            // InternalOSSWI.g:1667:1: ( ( rule__MMESPOSSWIPackageFile__Group_3__0 )* )
            {
            // InternalOSSWI.g:1667:1: ( ( rule__MMESPOSSWIPackageFile__Group_3__0 )* )
            // InternalOSSWI.g:1668:1: ( rule__MMESPOSSWIPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getGroup_3()); 
            }
            // InternalOSSWI.g:1669:1: ( rule__MMESPOSSWIPackageFile__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOSSWI.g:1669:2: rule__MMESPOSSWIPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__MMESPOSSWIPackageFile__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__3__Impl"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__4"
    // InternalOSSWI.g:1679:1: rule__MMESPOSSWIPackageFile__Group__4 : rule__MMESPOSSWIPackageFile__Group__4__Impl ;
    public final void rule__MMESPOSSWIPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1683:1: ( rule__MMESPOSSWIPackageFile__Group__4__Impl )
            // InternalOSSWI.g:1684:2: rule__MMESPOSSWIPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__4"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group__4__Impl"
    // InternalOSSWI.g:1690:1: rule__MMESPOSSWIPackageFile__Group__4__Impl : ( ( rule__MMESPOSSWIPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__MMESPOSSWIPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1694:1: ( ( ( rule__MMESPOSSWIPackageFile__ElementAssignment_4 ) ) )
            // InternalOSSWI.g:1695:1: ( ( rule__MMESPOSSWIPackageFile__ElementAssignment_4 ) )
            {
            // InternalOSSWI.g:1695:1: ( ( rule__MMESPOSSWIPackageFile__ElementAssignment_4 ) )
            // InternalOSSWI.g:1696:1: ( rule__MMESPOSSWIPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementAssignment_4()); 
            }
            // InternalOSSWI.g:1697:1: ( rule__MMESPOSSWIPackageFile__ElementAssignment_4 )
            // InternalOSSWI.g:1697:2: rule__MMESPOSSWIPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__ElementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group__4__Impl"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group_3__0"
    // InternalOSSWI.g:1717:1: rule__MMESPOSSWIPackageFile__Group_3__0 : rule__MMESPOSSWIPackageFile__Group_3__0__Impl rule__MMESPOSSWIPackageFile__Group_3__1 ;
    public final void rule__MMESPOSSWIPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1721:1: ( rule__MMESPOSSWIPackageFile__Group_3__0__Impl rule__MMESPOSSWIPackageFile__Group_3__1 )
            // InternalOSSWI.g:1722:2: rule__MMESPOSSWIPackageFile__Group_3__0__Impl rule__MMESPOSSWIPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MMESPOSSWIPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group_3__0"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group_3__0__Impl"
    // InternalOSSWI.g:1729:1: rule__MMESPOSSWIPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__MMESPOSSWIPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1733:1: ( ( 'import' ) )
            // InternalOSSWI.g:1734:1: ( 'import' )
            {
            // InternalOSSWI.g:1734:1: ( 'import' )
            // InternalOSSWI.g:1735:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportKeyword_3_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group_3__0__Impl"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group_3__1"
    // InternalOSSWI.g:1748:1: rule__MMESPOSSWIPackageFile__Group_3__1 : rule__MMESPOSSWIPackageFile__Group_3__1__Impl rule__MMESPOSSWIPackageFile__Group_3__2 ;
    public final void rule__MMESPOSSWIPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1752:1: ( rule__MMESPOSSWIPackageFile__Group_3__1__Impl rule__MMESPOSSWIPackageFile__Group_3__2 )
            // InternalOSSWI.g:1753:2: rule__MMESPOSSWIPackageFile__Group_3__1__Impl rule__MMESPOSSWIPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MMESPOSSWIPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group_3__1"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group_3__1__Impl"
    // InternalOSSWI.g:1760:1: rule__MMESPOSSWIPackageFile__Group_3__1__Impl : ( ( rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__MMESPOSSWIPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1764:1: ( ( ( rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1 ) ) )
            // InternalOSSWI.g:1765:1: ( ( rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1 ) )
            {
            // InternalOSSWI.g:1765:1: ( ( rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1 ) )
            // InternalOSSWI.g:1766:1: ( rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsAssignment_3_1()); 
            }
            // InternalOSSWI.g:1767:1: ( rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1 )
            // InternalOSSWI.g:1767:2: rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group_3__1__Impl"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group_3__2"
    // InternalOSSWI.g:1777:1: rule__MMESPOSSWIPackageFile__Group_3__2 : rule__MMESPOSSWIPackageFile__Group_3__2__Impl ;
    public final void rule__MMESPOSSWIPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1781:1: ( rule__MMESPOSSWIPackageFile__Group_3__2__Impl )
            // InternalOSSWI.g:1782:2: rule__MMESPOSSWIPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MMESPOSSWIPackageFile__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group_3__2"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__Group_3__2__Impl"
    // InternalOSSWI.g:1788:1: rule__MMESPOSSWIPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MMESPOSSWIPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1792:1: ( ( ';' ) )
            // InternalOSSWI.g:1793:1: ( ';' )
            {
            // InternalOSSWI.g:1793:1: ( ';' )
            // InternalOSSWI.g:1794:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalOSSWI.g:1813:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1817:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalOSSWI.g:1818:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalOSSWI.g:1825:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1829:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:1830:1: ( RULE_ID )
            {
            // InternalOSSWI.g:1830:1: ( RULE_ID )
            // InternalOSSWI.g:1831:1: RULE_ID
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
    // InternalOSSWI.g:1842:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1846:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalOSSWI.g:1847:2: rule__QualifiedName__Group__1__Impl
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
    // InternalOSSWI.g:1853:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1857:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalOSSWI.g:1858:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalOSSWI.g:1858:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalOSSWI.g:1859:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalOSSWI.g:1860:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOSSWI.g:1860:2: rule__QualifiedName__Group_1__0
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
    // InternalOSSWI.g:1874:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1878:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalOSSWI.g:1879:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalOSSWI.g:1886:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1890:1: ( ( '.' ) )
            // InternalOSSWI.g:1891:1: ( '.' )
            {
            // InternalOSSWI.g:1891:1: ( '.' )
            // InternalOSSWI.g:1892:1: '.'
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
    // InternalOSSWI.g:1905:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1909:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalOSSWI.g:1910:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalOSSWI.g:1916:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1920:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:1921:1: ( RULE_ID )
            {
            // InternalOSSWI.g:1921:1: ( RULE_ID )
            // InternalOSSWI.g:1922:1: RULE_ID
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
    // InternalOSSWI.g:1937:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1941:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalOSSWI.g:1942:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // InternalOSSWI.g:1949:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1953:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalOSSWI.g:1954:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalOSSWI.g:1954:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalOSSWI.g:1955:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalOSSWI.g:1956:1: ( rule__Version__Alternatives_0 )
            // InternalOSSWI.g:1956:2: rule__Version__Alternatives_0
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
    // InternalOSSWI.g:1966:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1970:1: ( rule__Version__Group__1__Impl )
            // InternalOSSWI.g:1971:2: rule__Version__Group__1__Impl
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
    // InternalOSSWI.g:1977:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:1981:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalOSSWI.g:1982:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalOSSWI.g:1982:1: ( ( rule__Version__Group_1__0 )* )
            // InternalOSSWI.g:1983:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalOSSWI.g:1984:1: ( rule__Version__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOSSWI.g:1984:2: rule__Version__Group_1__0
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
    // InternalOSSWI.g:1998:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2002:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalOSSWI.g:2003:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // InternalOSSWI.g:2010:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2014:1: ( ( ( RULE_INT )? ) )
            // InternalOSSWI.g:2015:1: ( ( RULE_INT )? )
            {
            // InternalOSSWI.g:2015:1: ( ( RULE_INT )? )
            // InternalOSSWI.g:2016:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalOSSWI.g:2017:1: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOSSWI.g:2017:3: RULE_INT
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
    // InternalOSSWI.g:2027:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2031:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalOSSWI.g:2032:2: rule__Version__Group_0_1__1__Impl
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
    // InternalOSSWI.g:2038:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2042:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:2043:1: ( RULE_ID )
            {
            // InternalOSSWI.g:2043:1: ( RULE_ID )
            // InternalOSSWI.g:2044:1: RULE_ID
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
    // InternalOSSWI.g:2059:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2063:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalOSSWI.g:2064:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // InternalOSSWI.g:2071:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2075:1: ( ( '.' ) )
            // InternalOSSWI.g:2076:1: ( '.' )
            {
            // InternalOSSWI.g:2076:1: ( '.' )
            // InternalOSSWI.g:2077:1: '.'
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
    // InternalOSSWI.g:2090:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2094:1: ( rule__Version__Group_1__1__Impl )
            // InternalOSSWI.g:2095:2: rule__Version__Group_1__1__Impl
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
    // InternalOSSWI.g:2101:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2105:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalOSSWI.g:2106:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalOSSWI.g:2106:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalOSSWI.g:2107:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalOSSWI.g:2108:1: ( rule__Version__Alternatives_1_1 )
            // InternalOSSWI.g:2108:2: rule__Version__Alternatives_1_1
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
    // InternalOSSWI.g:2122:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2126:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalOSSWI.g:2127:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // InternalOSSWI.g:2134:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2138:1: ( ( ( RULE_INT )? ) )
            // InternalOSSWI.g:2139:1: ( ( RULE_INT )? )
            {
            // InternalOSSWI.g:2139:1: ( ( RULE_INT )? )
            // InternalOSSWI.g:2140:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalOSSWI.g:2141:1: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOSSWI.g:2141:3: RULE_INT
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
    // InternalOSSWI.g:2151:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2155:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalOSSWI.g:2156:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalOSSWI.g:2162:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2166:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:2167:1: ( RULE_ID )
            {
            // InternalOSSWI.g:2167:1: ( RULE_ID )
            // InternalOSSWI.g:2168:1: RULE_ID
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
    // InternalOSSWI.g:2183:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2187:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalOSSWI.g:2188:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
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
    // InternalOSSWI.g:2195:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2199:1: ( ( ruleQualifiedName ) )
            // InternalOSSWI.g:2200:1: ( ruleQualifiedName )
            {
            // InternalOSSWI.g:2200:1: ( ruleQualifiedName )
            // InternalOSSWI.g:2201:1: ruleQualifiedName
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
    // InternalOSSWI.g:2212:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2216:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalOSSWI.g:2217:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // InternalOSSWI.g:2224:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2228:1: ( ( '(' ) )
            // InternalOSSWI.g:2229:1: ( '(' )
            {
            // InternalOSSWI.g:2229:1: ( '(' )
            // InternalOSSWI.g:2230:1: '('
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
    // InternalOSSWI.g:2243:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2247:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalOSSWI.g:2248:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
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
    // InternalOSSWI.g:2255:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2259:1: ( ( ruleVersion ) )
            // InternalOSSWI.g:2260:1: ( ruleVersion )
            {
            // InternalOSSWI.g:2260:1: ( ruleVersion )
            // InternalOSSWI.g:2261:1: ruleVersion
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
    // InternalOSSWI.g:2272:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2276:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalOSSWI.g:2277:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalOSSWI.g:2283:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2287:1: ( ( ')' ) )
            // InternalOSSWI.g:2288:1: ( ')' )
            {
            // InternalOSSWI.g:2288:1: ( ')' )
            // InternalOSSWI.g:2289:1: ')'
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
    // InternalOSSWI.g:2310:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2314:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // InternalOSSWI.g:2315:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
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
    // InternalOSSWI.g:2322:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2326:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // InternalOSSWI.g:2327:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // InternalOSSWI.g:2327:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // InternalOSSWI.g:2328:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }
            // InternalOSSWI.g:2329:1: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
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
                    // InternalOSSWI.g:2329:2: rule__VersionedQualifiedReferenceName__Group_0__0
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
    // InternalOSSWI.g:2339:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2343:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // InternalOSSWI.g:2344:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
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
    // InternalOSSWI.g:2351:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2355:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:2356:1: ( RULE_ID )
            {
            // InternalOSSWI.g:2356:1: ( RULE_ID )
            // InternalOSSWI.g:2357:1: RULE_ID
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
    // InternalOSSWI.g:2368:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2372:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // InternalOSSWI.g:2373:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
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
    // InternalOSSWI.g:2379:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2383:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // InternalOSSWI.g:2384:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // InternalOSSWI.g:2384:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // InternalOSSWI.g:2385:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }
            // InternalOSSWI.g:2386:1: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOSSWI.g:2386:2: rule__VersionedQualifiedReferenceName__Group_2__0
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
    // InternalOSSWI.g:2402:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2406:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // InternalOSSWI.g:2407:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
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
    // InternalOSSWI.g:2414:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2418:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWI.g:2419:1: ( ruleVersionedQualifiedName )
            {
            // InternalOSSWI.g:2419:1: ( ruleVersionedQualifiedName )
            // InternalOSSWI.g:2420:1: ruleVersionedQualifiedName
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
    // InternalOSSWI.g:2431:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2435:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // InternalOSSWI.g:2436:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
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
    // InternalOSSWI.g:2442:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2446:1: ( ( '::' ) )
            // InternalOSSWI.g:2447:1: ( '::' )
            {
            // InternalOSSWI.g:2447:1: ( '::' )
            // InternalOSSWI.g:2448:1: '::'
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
    // InternalOSSWI.g:2465:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2469:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // InternalOSSWI.g:2470:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
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
    // InternalOSSWI.g:2477:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2481:1: ( ( '::' ) )
            // InternalOSSWI.g:2482:1: ( '::' )
            {
            // InternalOSSWI.g:2482:1: ( '::' )
            // InternalOSSWI.g:2483:1: '::'
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
    // InternalOSSWI.g:2496:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2500:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // InternalOSSWI.g:2501:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
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
    // InternalOSSWI.g:2507:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2511:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:2512:1: ( RULE_ID )
            {
            // InternalOSSWI.g:2512:1: ( RULE_ID )
            // InternalOSSWI.g:2513:1: RULE_ID
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


    // $ANTLR start "rule__MOSSwInterface__Group__0"
    // InternalOSSWI.g:2528:1: rule__MOSSwInterface__Group__0 : rule__MOSSwInterface__Group__0__Impl rule__MOSSwInterface__Group__1 ;
    public final void rule__MOSSwInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2532:1: ( rule__MOSSwInterface__Group__0__Impl rule__MOSSwInterface__Group__1 )
            // InternalOSSWI.g:2533:2: rule__MOSSwInterface__Group__0__Impl rule__MOSSwInterface__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwInterface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__0"


    // $ANTLR start "rule__MOSSwInterface__Group__0__Impl"
    // InternalOSSWI.g:2540:1: rule__MOSSwInterface__Group__0__Impl : ( 'osswinterface' ) ;
    public final void rule__MOSSwInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2544:1: ( ( 'osswinterface' ) )
            // InternalOSSWI.g:2545:1: ( 'osswinterface' )
            {
            // InternalOSSWI.g:2545:1: ( 'osswinterface' )
            // InternalOSSWI.g:2546:1: 'osswinterface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getOsswinterfaceKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getOsswinterfaceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__0__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group__1"
    // InternalOSSWI.g:2559:1: rule__MOSSwInterface__Group__1 : rule__MOSSwInterface__Group__1__Impl rule__MOSSwInterface__Group__2 ;
    public final void rule__MOSSwInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2563:1: ( rule__MOSSwInterface__Group__1__Impl rule__MOSSwInterface__Group__2 )
            // InternalOSSWI.g:2564:2: rule__MOSSwInterface__Group__1__Impl rule__MOSSwInterface__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__MOSSwInterface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__1"


    // $ANTLR start "rule__MOSSwInterface__Group__1__Impl"
    // InternalOSSWI.g:2571:1: rule__MOSSwInterface__Group__1__Impl : ( ( rule__MOSSwInterface__NameAssignment_1 ) ) ;
    public final void rule__MOSSwInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2575:1: ( ( ( rule__MOSSwInterface__NameAssignment_1 ) ) )
            // InternalOSSWI.g:2576:1: ( ( rule__MOSSwInterface__NameAssignment_1 ) )
            {
            // InternalOSSWI.g:2576:1: ( ( rule__MOSSwInterface__NameAssignment_1 ) )
            // InternalOSSWI.g:2577:1: ( rule__MOSSwInterface__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getNameAssignment_1()); 
            }
            // InternalOSSWI.g:2578:1: ( rule__MOSSwInterface__NameAssignment_1 )
            // InternalOSSWI.g:2578:2: rule__MOSSwInterface__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__1__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group__2"
    // InternalOSSWI.g:2588:1: rule__MOSSwInterface__Group__2 : rule__MOSSwInterface__Group__2__Impl rule__MOSSwInterface__Group__3 ;
    public final void rule__MOSSwInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2592:1: ( rule__MOSSwInterface__Group__2__Impl rule__MOSSwInterface__Group__3 )
            // InternalOSSWI.g:2593:2: rule__MOSSwInterface__Group__2__Impl rule__MOSSwInterface__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__MOSSwInterface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__2"


    // $ANTLR start "rule__MOSSwInterface__Group__2__Impl"
    // InternalOSSWI.g:2600:1: rule__MOSSwInterface__Group__2__Impl : ( ( rule__MOSSwInterface__Group_2__0 )? ) ;
    public final void rule__MOSSwInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2604:1: ( ( ( rule__MOSSwInterface__Group_2__0 )? ) )
            // InternalOSSWI.g:2605:1: ( ( rule__MOSSwInterface__Group_2__0 )? )
            {
            // InternalOSSWI.g:2605:1: ( ( rule__MOSSwInterface__Group_2__0 )? )
            // InternalOSSWI.g:2606:1: ( rule__MOSSwInterface__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getGroup_2()); 
            }
            // InternalOSSWI.g:2607:1: ( rule__MOSSwInterface__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOSSWI.g:2607:2: rule__MOSSwInterface__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MOSSwInterface__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__2__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group__3"
    // InternalOSSWI.g:2617:1: rule__MOSSwInterface__Group__3 : rule__MOSSwInterface__Group__3__Impl rule__MOSSwInterface__Group__4 ;
    public final void rule__MOSSwInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2621:1: ( rule__MOSSwInterface__Group__3__Impl rule__MOSSwInterface__Group__4 )
            // InternalOSSWI.g:2622:2: rule__MOSSwInterface__Group__3__Impl rule__MOSSwInterface__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__MOSSwInterface__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__3"


    // $ANTLR start "rule__MOSSwInterface__Group__3__Impl"
    // InternalOSSWI.g:2629:1: rule__MOSSwInterface__Group__3__Impl : ( '{' ) ;
    public final void rule__MOSSwInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2633:1: ( ( '{' ) )
            // InternalOSSWI.g:2634:1: ( '{' )
            {
            // InternalOSSWI.g:2634:1: ( '{' )
            // InternalOSSWI.g:2635:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__3__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group__4"
    // InternalOSSWI.g:2648:1: rule__MOSSwInterface__Group__4 : rule__MOSSwInterface__Group__4__Impl rule__MOSSwInterface__Group__5 ;
    public final void rule__MOSSwInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2652:1: ( rule__MOSSwInterface__Group__4__Impl rule__MOSSwInterface__Group__5 )
            // InternalOSSWI.g:2653:2: rule__MOSSwInterface__Group__4__Impl rule__MOSSwInterface__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__MOSSwInterface__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__4"


    // $ANTLR start "rule__MOSSwInterface__Group__4__Impl"
    // InternalOSSWI.g:2660:1: rule__MOSSwInterface__Group__4__Impl : ( ( rule__MOSSwInterface__UnorderedGroup_4 ) ) ;
    public final void rule__MOSSwInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2664:1: ( ( ( rule__MOSSwInterface__UnorderedGroup_4 ) ) )
            // InternalOSSWI.g:2665:1: ( ( rule__MOSSwInterface__UnorderedGroup_4 ) )
            {
            // InternalOSSWI.g:2665:1: ( ( rule__MOSSwInterface__UnorderedGroup_4 ) )
            // InternalOSSWI.g:2666:1: ( rule__MOSSwInterface__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4()); 
            }
            // InternalOSSWI.g:2667:1: ( rule__MOSSwInterface__UnorderedGroup_4 )
            // InternalOSSWI.g:2667:2: rule__MOSSwInterface__UnorderedGroup_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__4__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group__5"
    // InternalOSSWI.g:2677:1: rule__MOSSwInterface__Group__5 : rule__MOSSwInterface__Group__5__Impl rule__MOSSwInterface__Group__6 ;
    public final void rule__MOSSwInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2681:1: ( rule__MOSSwInterface__Group__5__Impl rule__MOSSwInterface__Group__6 )
            // InternalOSSWI.g:2682:2: rule__MOSSwInterface__Group__5__Impl rule__MOSSwInterface__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MOSSwInterface__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__5"


    // $ANTLR start "rule__MOSSwInterface__Group__5__Impl"
    // InternalOSSWI.g:2689:1: rule__MOSSwInterface__Group__5__Impl : ( '}' ) ;
    public final void rule__MOSSwInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2693:1: ( ( '}' ) )
            // InternalOSSWI.g:2694:1: ( '}' )
            {
            // InternalOSSWI.g:2694:1: ( '}' )
            // InternalOSSWI.g:2695:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__5__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group__6"
    // InternalOSSWI.g:2708:1: rule__MOSSwInterface__Group__6 : rule__MOSSwInterface__Group__6__Impl ;
    public final void rule__MOSSwInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2712:1: ( rule__MOSSwInterface__Group__6__Impl )
            // InternalOSSWI.g:2713:2: rule__MOSSwInterface__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__6"


    // $ANTLR start "rule__MOSSwInterface__Group__6__Impl"
    // InternalOSSWI.g:2719:1: rule__MOSSwInterface__Group__6__Impl : ( ';' ) ;
    public final void rule__MOSSwInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2723:1: ( ( ';' ) )
            // InternalOSSWI.g:2724:1: ( ';' )
            {
            // InternalOSSWI.g:2724:1: ( ';' )
            // InternalOSSWI.g:2725:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_6()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group__6__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_2__0"
    // InternalOSSWI.g:2752:1: rule__MOSSwInterface__Group_2__0 : rule__MOSSwInterface__Group_2__0__Impl rule__MOSSwInterface__Group_2__1 ;
    public final void rule__MOSSwInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2756:1: ( rule__MOSSwInterface__Group_2__0__Impl rule__MOSSwInterface__Group_2__1 )
            // InternalOSSWI.g:2757:2: rule__MOSSwInterface__Group_2__0__Impl rule__MOSSwInterface__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwInterface__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2__0"


    // $ANTLR start "rule__MOSSwInterface__Group_2__0__Impl"
    // InternalOSSWI.g:2764:1: rule__MOSSwInterface__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__MOSSwInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2768:1: ( ( 'extends' ) )
            // InternalOSSWI.g:2769:1: ( 'extends' )
            {
            // InternalOSSWI.g:2769:1: ( 'extends' )
            // InternalOSSWI.g:2770:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getExtendsKeyword_2_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2__0__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_2__1"
    // InternalOSSWI.g:2783:1: rule__MOSSwInterface__Group_2__1 : rule__MOSSwInterface__Group_2__1__Impl rule__MOSSwInterface__Group_2__2 ;
    public final void rule__MOSSwInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2787:1: ( rule__MOSSwInterface__Group_2__1__Impl rule__MOSSwInterface__Group_2__2 )
            // InternalOSSWI.g:2788:2: rule__MOSSwInterface__Group_2__1__Impl rule__MOSSwInterface__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MOSSwInterface__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2__1"


    // $ANTLR start "rule__MOSSwInterface__Group_2__1__Impl"
    // InternalOSSWI.g:2795:1: rule__MOSSwInterface__Group_2__1__Impl : ( ( rule__MOSSwInterface__ExtendsAssignment_2_1 ) ) ;
    public final void rule__MOSSwInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2799:1: ( ( ( rule__MOSSwInterface__ExtendsAssignment_2_1 ) ) )
            // InternalOSSWI.g:2800:1: ( ( rule__MOSSwInterface__ExtendsAssignment_2_1 ) )
            {
            // InternalOSSWI.g:2800:1: ( ( rule__MOSSwInterface__ExtendsAssignment_2_1 ) )
            // InternalOSSWI.g:2801:1: ( rule__MOSSwInterface__ExtendsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getExtendsAssignment_2_1()); 
            }
            // InternalOSSWI.g:2802:1: ( rule__MOSSwInterface__ExtendsAssignment_2_1 )
            // InternalOSSWI.g:2802:2: rule__MOSSwInterface__ExtendsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__ExtendsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getExtendsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2__1__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_2__2"
    // InternalOSSWI.g:2812:1: rule__MOSSwInterface__Group_2__2 : rule__MOSSwInterface__Group_2__2__Impl ;
    public final void rule__MOSSwInterface__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2816:1: ( rule__MOSSwInterface__Group_2__2__Impl )
            // InternalOSSWI.g:2817:2: rule__MOSSwInterface__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2__2"


    // $ANTLR start "rule__MOSSwInterface__Group_2__2__Impl"
    // InternalOSSWI.g:2823:1: rule__MOSSwInterface__Group_2__2__Impl : ( ( rule__MOSSwInterface__Group_2_2__0 )* ) ;
    public final void rule__MOSSwInterface__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2827:1: ( ( ( rule__MOSSwInterface__Group_2_2__0 )* ) )
            // InternalOSSWI.g:2828:1: ( ( rule__MOSSwInterface__Group_2_2__0 )* )
            {
            // InternalOSSWI.g:2828:1: ( ( rule__MOSSwInterface__Group_2_2__0 )* )
            // InternalOSSWI.g:2829:1: ( rule__MOSSwInterface__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getGroup_2_2()); 
            }
            // InternalOSSWI.g:2830:1: ( rule__MOSSwInterface__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOSSWI.g:2830:2: rule__MOSSwInterface__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__MOSSwInterface__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2__2__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_2_2__0"
    // InternalOSSWI.g:2846:1: rule__MOSSwInterface__Group_2_2__0 : rule__MOSSwInterface__Group_2_2__0__Impl rule__MOSSwInterface__Group_2_2__1 ;
    public final void rule__MOSSwInterface__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2850:1: ( rule__MOSSwInterface__Group_2_2__0__Impl rule__MOSSwInterface__Group_2_2__1 )
            // InternalOSSWI.g:2851:2: rule__MOSSwInterface__Group_2_2__0__Impl rule__MOSSwInterface__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwInterface__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2_2__0"


    // $ANTLR start "rule__MOSSwInterface__Group_2_2__0__Impl"
    // InternalOSSWI.g:2858:1: rule__MOSSwInterface__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MOSSwInterface__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2862:1: ( ( ',' ) )
            // InternalOSSWI.g:2863:1: ( ',' )
            {
            // InternalOSSWI.g:2863:1: ( ',' )
            // InternalOSSWI.g:2864:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2_2__0__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_2_2__1"
    // InternalOSSWI.g:2877:1: rule__MOSSwInterface__Group_2_2__1 : rule__MOSSwInterface__Group_2_2__1__Impl ;
    public final void rule__MOSSwInterface__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2881:1: ( rule__MOSSwInterface__Group_2_2__1__Impl )
            // InternalOSSWI.g:2882:2: rule__MOSSwInterface__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2_2__1"


    // $ANTLR start "rule__MOSSwInterface__Group_2_2__1__Impl"
    // InternalOSSWI.g:2888:1: rule__MOSSwInterface__Group_2_2__1__Impl : ( ( rule__MOSSwInterface__ExtendsAssignment_2_2_1 ) ) ;
    public final void rule__MOSSwInterface__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2892:1: ( ( ( rule__MOSSwInterface__ExtendsAssignment_2_2_1 ) ) )
            // InternalOSSWI.g:2893:1: ( ( rule__MOSSwInterface__ExtendsAssignment_2_2_1 ) )
            {
            // InternalOSSWI.g:2893:1: ( ( rule__MOSSwInterface__ExtendsAssignment_2_2_1 ) )
            // InternalOSSWI.g:2894:1: ( rule__MOSSwInterface__ExtendsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getExtendsAssignment_2_2_1()); 
            }
            // InternalOSSWI.g:2895:1: ( rule__MOSSwInterface__ExtendsAssignment_2_2_1 )
            // InternalOSSWI.g:2895:2: rule__MOSSwInterface__ExtendsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__ExtendsAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getExtendsAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_2_2__1__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_0__0"
    // InternalOSSWI.g:2909:1: rule__MOSSwInterface__Group_4_0__0 : rule__MOSSwInterface__Group_4_0__0__Impl rule__MOSSwInterface__Group_4_0__1 ;
    public final void rule__MOSSwInterface__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2913:1: ( rule__MOSSwInterface__Group_4_0__0__Impl rule__MOSSwInterface__Group_4_0__1 )
            // InternalOSSWI.g:2914:2: rule__MOSSwInterface__Group_4_0__0__Impl rule__MOSSwInterface__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MOSSwInterface__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_0__0"


    // $ANTLR start "rule__MOSSwInterface__Group_4_0__0__Impl"
    // InternalOSSWI.g:2921:1: rule__MOSSwInterface__Group_4_0__0__Impl : ( 'version' ) ;
    public final void rule__MOSSwInterface__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2925:1: ( ( 'version' ) )
            // InternalOSSWI.g:2926:1: ( 'version' )
            {
            // InternalOSSWI.g:2926:1: ( 'version' )
            // InternalOSSWI.g:2927:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getVersionKeyword_4_0_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getVersionKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_0__0__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_0__1"
    // InternalOSSWI.g:2940:1: rule__MOSSwInterface__Group_4_0__1 : rule__MOSSwInterface__Group_4_0__1__Impl rule__MOSSwInterface__Group_4_0__2 ;
    public final void rule__MOSSwInterface__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2944:1: ( rule__MOSSwInterface__Group_4_0__1__Impl rule__MOSSwInterface__Group_4_0__2 )
            // InternalOSSWI.g:2945:2: rule__MOSSwInterface__Group_4_0__1__Impl rule__MOSSwInterface__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__MOSSwInterface__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_0__1"


    // $ANTLR start "rule__MOSSwInterface__Group_4_0__1__Impl"
    // InternalOSSWI.g:2952:1: rule__MOSSwInterface__Group_4_0__1__Impl : ( ':=' ) ;
    public final void rule__MOSSwInterface__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2956:1: ( ( ':=' ) )
            // InternalOSSWI.g:2957:1: ( ':=' )
            {
            // InternalOSSWI.g:2957:1: ( ':=' )
            // InternalOSSWI.g:2958:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_0_1()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_0__1__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_0__2"
    // InternalOSSWI.g:2971:1: rule__MOSSwInterface__Group_4_0__2 : rule__MOSSwInterface__Group_4_0__2__Impl rule__MOSSwInterface__Group_4_0__3 ;
    public final void rule__MOSSwInterface__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2975:1: ( rule__MOSSwInterface__Group_4_0__2__Impl rule__MOSSwInterface__Group_4_0__3 )
            // InternalOSSWI.g:2976:2: rule__MOSSwInterface__Group_4_0__2__Impl rule__MOSSwInterface__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MOSSwInterface__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_0__2"


    // $ANTLR start "rule__MOSSwInterface__Group_4_0__2__Impl"
    // InternalOSSWI.g:2983:1: rule__MOSSwInterface__Group_4_0__2__Impl : ( ( rule__MOSSwInterface__VersionAssignment_4_0_2 ) ) ;
    public final void rule__MOSSwInterface__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:2987:1: ( ( ( rule__MOSSwInterface__VersionAssignment_4_0_2 ) ) )
            // InternalOSSWI.g:2988:1: ( ( rule__MOSSwInterface__VersionAssignment_4_0_2 ) )
            {
            // InternalOSSWI.g:2988:1: ( ( rule__MOSSwInterface__VersionAssignment_4_0_2 ) )
            // InternalOSSWI.g:2989:1: ( rule__MOSSwInterface__VersionAssignment_4_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getVersionAssignment_4_0_2()); 
            }
            // InternalOSSWI.g:2990:1: ( rule__MOSSwInterface__VersionAssignment_4_0_2 )
            // InternalOSSWI.g:2990:2: rule__MOSSwInterface__VersionAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__VersionAssignment_4_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getVersionAssignment_4_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_0__2__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_0__3"
    // InternalOSSWI.g:3000:1: rule__MOSSwInterface__Group_4_0__3 : rule__MOSSwInterface__Group_4_0__3__Impl ;
    public final void rule__MOSSwInterface__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3004:1: ( rule__MOSSwInterface__Group_4_0__3__Impl )
            // InternalOSSWI.g:3005:2: rule__MOSSwInterface__Group_4_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_0__3"


    // $ANTLR start "rule__MOSSwInterface__Group_4_0__3__Impl"
    // InternalOSSWI.g:3011:1: rule__MOSSwInterface__Group_4_0__3__Impl : ( ';' ) ;
    public final void rule__MOSSwInterface__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3015:1: ( ( ';' ) )
            // InternalOSSWI.g:3016:1: ( ';' )
            {
            // InternalOSSWI.g:3016:1: ( ';' )
            // InternalOSSWI.g:3017:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_0_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_0__3__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_1__0"
    // InternalOSSWI.g:3038:1: rule__MOSSwInterface__Group_4_1__0 : rule__MOSSwInterface__Group_4_1__0__Impl rule__MOSSwInterface__Group_4_1__1 ;
    public final void rule__MOSSwInterface__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3042:1: ( rule__MOSSwInterface__Group_4_1__0__Impl rule__MOSSwInterface__Group_4_1__1 )
            // InternalOSSWI.g:3043:2: rule__MOSSwInterface__Group_4_1__0__Impl rule__MOSSwInterface__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MOSSwInterface__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_1__0"


    // $ANTLR start "rule__MOSSwInterface__Group_4_1__0__Impl"
    // InternalOSSWI.g:3050:1: rule__MOSSwInterface__Group_4_1__0__Impl : ( 'osapi' ) ;
    public final void rule__MOSSwInterface__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3054:1: ( ( 'osapi' ) )
            // InternalOSSWI.g:3055:1: ( 'osapi' )
            {
            // InternalOSSWI.g:3055:1: ( 'osapi' )
            // InternalOSSWI.g:3056:1: 'osapi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getOsapiKeyword_4_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getOsapiKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_1__0__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_1__1"
    // InternalOSSWI.g:3069:1: rule__MOSSwInterface__Group_4_1__1 : rule__MOSSwInterface__Group_4_1__1__Impl rule__MOSSwInterface__Group_4_1__2 ;
    public final void rule__MOSSwInterface__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3073:1: ( rule__MOSSwInterface__Group_4_1__1__Impl rule__MOSSwInterface__Group_4_1__2 )
            // InternalOSSWI.g:3074:2: rule__MOSSwInterface__Group_4_1__1__Impl rule__MOSSwInterface__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MOSSwInterface__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_1__1"


    // $ANTLR start "rule__MOSSwInterface__Group_4_1__1__Impl"
    // InternalOSSWI.g:3081:1: rule__MOSSwInterface__Group_4_1__1__Impl : ( ':=' ) ;
    public final void rule__MOSSwInterface__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3085:1: ( ( ':=' ) )
            // InternalOSSWI.g:3086:1: ( ':=' )
            {
            // InternalOSSWI.g:3086:1: ( ':=' )
            // InternalOSSWI.g:3087:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_1_1()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_1__1__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_1__2"
    // InternalOSSWI.g:3100:1: rule__MOSSwInterface__Group_4_1__2 : rule__MOSSwInterface__Group_4_1__2__Impl rule__MOSSwInterface__Group_4_1__3 ;
    public final void rule__MOSSwInterface__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3104:1: ( rule__MOSSwInterface__Group_4_1__2__Impl rule__MOSSwInterface__Group_4_1__3 )
            // InternalOSSWI.g:3105:2: rule__MOSSwInterface__Group_4_1__2__Impl rule__MOSSwInterface__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MOSSwInterface__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_1__2"


    // $ANTLR start "rule__MOSSwInterface__Group_4_1__2__Impl"
    // InternalOSSWI.g:3112:1: rule__MOSSwInterface__Group_4_1__2__Impl : ( ( rule__MOSSwInterface__ReferencedElementAssignment_4_1_2 ) ) ;
    public final void rule__MOSSwInterface__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3116:1: ( ( ( rule__MOSSwInterface__ReferencedElementAssignment_4_1_2 ) ) )
            // InternalOSSWI.g:3117:1: ( ( rule__MOSSwInterface__ReferencedElementAssignment_4_1_2 ) )
            {
            // InternalOSSWI.g:3117:1: ( ( rule__MOSSwInterface__ReferencedElementAssignment_4_1_2 ) )
            // InternalOSSWI.g:3118:1: ( rule__MOSSwInterface__ReferencedElementAssignment_4_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementAssignment_4_1_2()); 
            }
            // InternalOSSWI.g:3119:1: ( rule__MOSSwInterface__ReferencedElementAssignment_4_1_2 )
            // InternalOSSWI.g:3119:2: rule__MOSSwInterface__ReferencedElementAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__ReferencedElementAssignment_4_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementAssignment_4_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_1__2__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_1__3"
    // InternalOSSWI.g:3129:1: rule__MOSSwInterface__Group_4_1__3 : rule__MOSSwInterface__Group_4_1__3__Impl ;
    public final void rule__MOSSwInterface__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3133:1: ( rule__MOSSwInterface__Group_4_1__3__Impl )
            // InternalOSSWI.g:3134:2: rule__MOSSwInterface__Group_4_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_1__3"


    // $ANTLR start "rule__MOSSwInterface__Group_4_1__3__Impl"
    // InternalOSSWI.g:3140:1: rule__MOSSwInterface__Group_4_1__3__Impl : ( ';' ) ;
    public final void rule__MOSSwInterface__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3144:1: ( ( ';' ) )
            // InternalOSSWI.g:3145:1: ( ';' )
            {
            // InternalOSSWI.g:3145:1: ( ';' )
            // InternalOSSWI.g:3146:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_1_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_1__3__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__0"
    // InternalOSSWI.g:3167:1: rule__MOSSwInterface__Group_4_2__0 : rule__MOSSwInterface__Group_4_2__0__Impl rule__MOSSwInterface__Group_4_2__1 ;
    public final void rule__MOSSwInterface__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3171:1: ( rule__MOSSwInterface__Group_4_2__0__Impl rule__MOSSwInterface__Group_4_2__1 )
            // InternalOSSWI.g:3172:2: rule__MOSSwInterface__Group_4_2__0__Impl rule__MOSSwInterface__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__MOSSwInterface__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__0"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__0__Impl"
    // InternalOSSWI.g:3179:1: rule__MOSSwInterface__Group_4_2__0__Impl : ( 'provided' ) ;
    public final void rule__MOSSwInterface__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3183:1: ( ( 'provided' ) )
            // InternalOSSWI.g:3184:1: ( 'provided' )
            {
            // InternalOSSWI.g:3184:1: ( 'provided' )
            // InternalOSSWI.g:3185:1: 'provided'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getProvidedKeyword_4_2_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getProvidedKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__0__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__1"
    // InternalOSSWI.g:3198:1: rule__MOSSwInterface__Group_4_2__1 : rule__MOSSwInterface__Group_4_2__1__Impl rule__MOSSwInterface__Group_4_2__2 ;
    public final void rule__MOSSwInterface__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3202:1: ( rule__MOSSwInterface__Group_4_2__1__Impl rule__MOSSwInterface__Group_4_2__2 )
            // InternalOSSWI.g:3203:2: rule__MOSSwInterface__Group_4_2__1__Impl rule__MOSSwInterface__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__MOSSwInterface__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__1"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__1__Impl"
    // InternalOSSWI.g:3210:1: rule__MOSSwInterface__Group_4_2__1__Impl : ( 'resources' ) ;
    public final void rule__MOSSwInterface__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3214:1: ( ( 'resources' ) )
            // InternalOSSWI.g:3215:1: ( 'resources' )
            {
            // InternalOSSWI.g:3215:1: ( 'resources' )
            // InternalOSSWI.g:3216:1: 'resources'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getResourcesKeyword_4_2_1()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getResourcesKeyword_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__1__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__2"
    // InternalOSSWI.g:3229:1: rule__MOSSwInterface__Group_4_2__2 : rule__MOSSwInterface__Group_4_2__2__Impl rule__MOSSwInterface__Group_4_2__3 ;
    public final void rule__MOSSwInterface__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3233:1: ( rule__MOSSwInterface__Group_4_2__2__Impl rule__MOSSwInterface__Group_4_2__3 )
            // InternalOSSWI.g:3234:2: rule__MOSSwInterface__Group_4_2__2__Impl rule__MOSSwInterface__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__MOSSwInterface__Group_4_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__2"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__2__Impl"
    // InternalOSSWI.g:3241:1: rule__MOSSwInterface__Group_4_2__2__Impl : ( '{' ) ;
    public final void rule__MOSSwInterface__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3245:1: ( ( '{' ) )
            // InternalOSSWI.g:3246:1: ( '{' )
            {
            // InternalOSSWI.g:3246:1: ( '{' )
            // InternalOSSWI.g:3247:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_4_2_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_4_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__2__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__3"
    // InternalOSSWI.g:3260:1: rule__MOSSwInterface__Group_4_2__3 : rule__MOSSwInterface__Group_4_2__3__Impl rule__MOSSwInterface__Group_4_2__4 ;
    public final void rule__MOSSwInterface__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3264:1: ( rule__MOSSwInterface__Group_4_2__3__Impl rule__MOSSwInterface__Group_4_2__4 )
            // InternalOSSWI.g:3265:2: rule__MOSSwInterface__Group_4_2__3__Impl rule__MOSSwInterface__Group_4_2__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__MOSSwInterface__Group_4_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__3"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__3__Impl"
    // InternalOSSWI.g:3272:1: rule__MOSSwInterface__Group_4_2__3__Impl : ( ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 ) ) ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )* ) ) ;
    public final void rule__MOSSwInterface__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3276:1: ( ( ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 ) ) ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )* ) ) )
            // InternalOSSWI.g:3277:1: ( ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 ) ) ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )* ) )
            {
            // InternalOSSWI.g:3277:1: ( ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 ) ) ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )* ) )
            // InternalOSSWI.g:3278:1: ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 ) ) ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )* )
            {
            // InternalOSSWI.g:3278:1: ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 ) )
            // InternalOSSWI.g:3279:1: ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesAssignment_4_2_3()); 
            }
            // InternalOSSWI.g:3280:1: ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )
            // InternalOSSWI.g:3280:2: rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesAssignment_4_2_3()); 
            }

            }

            // InternalOSSWI.g:3283:1: ( ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )* )
            // InternalOSSWI.g:3284:1: ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesAssignment_4_2_3()); 
            }
            // InternalOSSWI.g:3285:1: ( rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35||LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOSSWI.g:3285:2: rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesAssignment_4_2_3()); 
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
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__3__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__4"
    // InternalOSSWI.g:3296:1: rule__MOSSwInterface__Group_4_2__4 : rule__MOSSwInterface__Group_4_2__4__Impl rule__MOSSwInterface__Group_4_2__5 ;
    public final void rule__MOSSwInterface__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3300:1: ( rule__MOSSwInterface__Group_4_2__4__Impl rule__MOSSwInterface__Group_4_2__5 )
            // InternalOSSWI.g:3301:2: rule__MOSSwInterface__Group_4_2__4__Impl rule__MOSSwInterface__Group_4_2__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MOSSwInterface__Group_4_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__4"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__4__Impl"
    // InternalOSSWI.g:3308:1: rule__MOSSwInterface__Group_4_2__4__Impl : ( '}' ) ;
    public final void rule__MOSSwInterface__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3312:1: ( ( '}' ) )
            // InternalOSSWI.g:3313:1: ( '}' )
            {
            // InternalOSSWI.g:3313:1: ( '}' )
            // InternalOSSWI.g:3314:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_4_2_4()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_4_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__4__Impl"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__5"
    // InternalOSSWI.g:3327:1: rule__MOSSwInterface__Group_4_2__5 : rule__MOSSwInterface__Group_4_2__5__Impl ;
    public final void rule__MOSSwInterface__Group_4_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3331:1: ( rule__MOSSwInterface__Group_4_2__5__Impl )
            // InternalOSSWI.g:3332:2: rule__MOSSwInterface__Group_4_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__Group_4_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__5"


    // $ANTLR start "rule__MOSSwInterface__Group_4_2__5__Impl"
    // InternalOSSWI.g:3338:1: rule__MOSSwInterface__Group_4_2__5__Impl : ( ';' ) ;
    public final void rule__MOSSwInterface__Group_4_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3342:1: ( ( ';' ) )
            // InternalOSSWI.g:3343:1: ( ';' )
            {
            // InternalOSSWI.g:3343:1: ( ';' )
            // InternalOSSWI.g:3344:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_2_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__Group_4_2__5__Impl"


    // $ANTLR start "rule__MQuantifiableResource__Group__0"
    // InternalOSSWI.g:3369:1: rule__MQuantifiableResource__Group__0 : rule__MQuantifiableResource__Group__0__Impl rule__MQuantifiableResource__Group__1 ;
    public final void rule__MQuantifiableResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3373:1: ( rule__MQuantifiableResource__Group__0__Impl rule__MQuantifiableResource__Group__1 )
            // InternalOSSWI.g:3374:2: rule__MQuantifiableResource__Group__0__Impl rule__MQuantifiableResource__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalOSSWI.g:3381:1: rule__MQuantifiableResource__Group__0__Impl : ( 'quantifiable' ) ;
    public final void rule__MQuantifiableResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3385:1: ( ( 'quantifiable' ) )
            // InternalOSSWI.g:3386:1: ( 'quantifiable' )
            {
            // InternalOSSWI.g:3386:1: ( 'quantifiable' )
            // InternalOSSWI.g:3387:1: 'quantifiable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getQuantifiableKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:3400:1: rule__MQuantifiableResource__Group__1 : rule__MQuantifiableResource__Group__1__Impl rule__MQuantifiableResource__Group__2 ;
    public final void rule__MQuantifiableResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3404:1: ( rule__MQuantifiableResource__Group__1__Impl rule__MQuantifiableResource__Group__2 )
            // InternalOSSWI.g:3405:2: rule__MQuantifiableResource__Group__1__Impl rule__MQuantifiableResource__Group__2
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
    // InternalOSSWI.g:3412:1: rule__MQuantifiableResource__Group__1__Impl : ( 'resource' ) ;
    public final void rule__MQuantifiableResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3416:1: ( ( 'resource' ) )
            // InternalOSSWI.g:3417:1: ( 'resource' )
            {
            // InternalOSSWI.g:3417:1: ( 'resource' )
            // InternalOSSWI.g:3418:1: 'resource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getResourceKeyword_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:3431:1: rule__MQuantifiableResource__Group__2 : rule__MQuantifiableResource__Group__2__Impl rule__MQuantifiableResource__Group__3 ;
    public final void rule__MQuantifiableResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3435:1: ( rule__MQuantifiableResource__Group__2__Impl rule__MQuantifiableResource__Group__3 )
            // InternalOSSWI.g:3436:2: rule__MQuantifiableResource__Group__2__Impl rule__MQuantifiableResource__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalOSSWI.g:3443:1: rule__MQuantifiableResource__Group__2__Impl : ( ( rule__MQuantifiableResource__NameAssignment_2 ) ) ;
    public final void rule__MQuantifiableResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3447:1: ( ( ( rule__MQuantifiableResource__NameAssignment_2 ) ) )
            // InternalOSSWI.g:3448:1: ( ( rule__MQuantifiableResource__NameAssignment_2 ) )
            {
            // InternalOSSWI.g:3448:1: ( ( rule__MQuantifiableResource__NameAssignment_2 ) )
            // InternalOSSWI.g:3449:1: ( rule__MQuantifiableResource__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getNameAssignment_2()); 
            }
            // InternalOSSWI.g:3450:1: ( rule__MQuantifiableResource__NameAssignment_2 )
            // InternalOSSWI.g:3450:2: rule__MQuantifiableResource__NameAssignment_2
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
    // InternalOSSWI.g:3460:1: rule__MQuantifiableResource__Group__3 : rule__MQuantifiableResource__Group__3__Impl rule__MQuantifiableResource__Group__4 ;
    public final void rule__MQuantifiableResource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3464:1: ( rule__MQuantifiableResource__Group__3__Impl rule__MQuantifiableResource__Group__4 )
            // InternalOSSWI.g:3465:2: rule__MQuantifiableResource__Group__3__Impl rule__MQuantifiableResource__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:3472:1: rule__MQuantifiableResource__Group__3__Impl : ( 'step' ) ;
    public final void rule__MQuantifiableResource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3476:1: ( ( 'step' ) )
            // InternalOSSWI.g:3477:1: ( 'step' )
            {
            // InternalOSSWI.g:3477:1: ( 'step' )
            // InternalOSSWI.g:3478:1: 'step'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getStepKeyword_3()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:3491:1: rule__MQuantifiableResource__Group__4 : rule__MQuantifiableResource__Group__4__Impl rule__MQuantifiableResource__Group__5 ;
    public final void rule__MQuantifiableResource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3495:1: ( rule__MQuantifiableResource__Group__4__Impl rule__MQuantifiableResource__Group__5 )
            // InternalOSSWI.g:3496:2: rule__MQuantifiableResource__Group__4__Impl rule__MQuantifiableResource__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalOSSWI.g:3503:1: rule__MQuantifiableResource__Group__4__Impl : ( ( rule__MQuantifiableResource__LowerBoundAssignment_4 ) ) ;
    public final void rule__MQuantifiableResource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3507:1: ( ( ( rule__MQuantifiableResource__LowerBoundAssignment_4 ) ) )
            // InternalOSSWI.g:3508:1: ( ( rule__MQuantifiableResource__LowerBoundAssignment_4 ) )
            {
            // InternalOSSWI.g:3508:1: ( ( rule__MQuantifiableResource__LowerBoundAssignment_4 ) )
            // InternalOSSWI.g:3509:1: ( rule__MQuantifiableResource__LowerBoundAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundAssignment_4()); 
            }
            // InternalOSSWI.g:3510:1: ( rule__MQuantifiableResource__LowerBoundAssignment_4 )
            // InternalOSSWI.g:3510:2: rule__MQuantifiableResource__LowerBoundAssignment_4
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
    // InternalOSSWI.g:3520:1: rule__MQuantifiableResource__Group__5 : rule__MQuantifiableResource__Group__5__Impl rule__MQuantifiableResource__Group__6 ;
    public final void rule__MQuantifiableResource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3524:1: ( rule__MQuantifiableResource__Group__5__Impl rule__MQuantifiableResource__Group__6 )
            // InternalOSSWI.g:3525:2: rule__MQuantifiableResource__Group__5__Impl rule__MQuantifiableResource__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:3532:1: rule__MQuantifiableResource__Group__5__Impl : ( 'to' ) ;
    public final void rule__MQuantifiableResource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3536:1: ( ( 'to' ) )
            // InternalOSSWI.g:3537:1: ( 'to' )
            {
            // InternalOSSWI.g:3537:1: ( 'to' )
            // InternalOSSWI.g:3538:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getToKeyword_5()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:3551:1: rule__MQuantifiableResource__Group__6 : rule__MQuantifiableResource__Group__6__Impl rule__MQuantifiableResource__Group__7 ;
    public final void rule__MQuantifiableResource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3555:1: ( rule__MQuantifiableResource__Group__6__Impl rule__MQuantifiableResource__Group__7 )
            // InternalOSSWI.g:3556:2: rule__MQuantifiableResource__Group__6__Impl rule__MQuantifiableResource__Group__7
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
    // InternalOSSWI.g:3563:1: rule__MQuantifiableResource__Group__6__Impl : ( ( rule__MQuantifiableResource__UpperBoundAssignment_6 ) ) ;
    public final void rule__MQuantifiableResource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3567:1: ( ( ( rule__MQuantifiableResource__UpperBoundAssignment_6 ) ) )
            // InternalOSSWI.g:3568:1: ( ( rule__MQuantifiableResource__UpperBoundAssignment_6 ) )
            {
            // InternalOSSWI.g:3568:1: ( ( rule__MQuantifiableResource__UpperBoundAssignment_6 ) )
            // InternalOSSWI.g:3569:1: ( rule__MQuantifiableResource__UpperBoundAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundAssignment_6()); 
            }
            // InternalOSSWI.g:3570:1: ( rule__MQuantifiableResource__UpperBoundAssignment_6 )
            // InternalOSSWI.g:3570:2: rule__MQuantifiableResource__UpperBoundAssignment_6
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
    // InternalOSSWI.g:3580:1: rule__MQuantifiableResource__Group__7 : rule__MQuantifiableResource__Group__7__Impl ;
    public final void rule__MQuantifiableResource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3584:1: ( rule__MQuantifiableResource__Group__7__Impl )
            // InternalOSSWI.g:3585:2: rule__MQuantifiableResource__Group__7__Impl
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
    // InternalOSSWI.g:3591:1: rule__MQuantifiableResource__Group__7__Impl : ( ';' ) ;
    public final void rule__MQuantifiableResource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3595:1: ( ( ';' ) )
            // InternalOSSWI.g:3596:1: ( ';' )
            {
            // InternalOSSWI.g:3596:1: ( ';' )
            // InternalOSSWI.g:3597:1: ';'
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
    // InternalOSSWI.g:3626:1: rule__MInstantiableResource__Group__0 : rule__MInstantiableResource__Group__0__Impl rule__MInstantiableResource__Group__1 ;
    public final void rule__MInstantiableResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3630:1: ( rule__MInstantiableResource__Group__0__Impl rule__MInstantiableResource__Group__1 )
            // InternalOSSWI.g:3631:2: rule__MInstantiableResource__Group__0__Impl rule__MInstantiableResource__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalOSSWI.g:3638:1: rule__MInstantiableResource__Group__0__Impl : ( 'instantiable' ) ;
    public final void rule__MInstantiableResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3642:1: ( ( 'instantiable' ) )
            // InternalOSSWI.g:3643:1: ( 'instantiable' )
            {
            // InternalOSSWI.g:3643:1: ( 'instantiable' )
            // InternalOSSWI.g:3644:1: 'instantiable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getInstantiableKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:3657:1: rule__MInstantiableResource__Group__1 : rule__MInstantiableResource__Group__1__Impl rule__MInstantiableResource__Group__2 ;
    public final void rule__MInstantiableResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3661:1: ( rule__MInstantiableResource__Group__1__Impl rule__MInstantiableResource__Group__2 )
            // InternalOSSWI.g:3662:2: rule__MInstantiableResource__Group__1__Impl rule__MInstantiableResource__Group__2
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
    // InternalOSSWI.g:3669:1: rule__MInstantiableResource__Group__1__Impl : ( 'resource' ) ;
    public final void rule__MInstantiableResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3673:1: ( ( 'resource' ) )
            // InternalOSSWI.g:3674:1: ( 'resource' )
            {
            // InternalOSSWI.g:3674:1: ( 'resource' )
            // InternalOSSWI.g:3675:1: 'resource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getResourceKeyword_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:3688:1: rule__MInstantiableResource__Group__2 : rule__MInstantiableResource__Group__2__Impl rule__MInstantiableResource__Group__3 ;
    public final void rule__MInstantiableResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3692:1: ( rule__MInstantiableResource__Group__2__Impl rule__MInstantiableResource__Group__3 )
            // InternalOSSWI.g:3693:2: rule__MInstantiableResource__Group__2__Impl rule__MInstantiableResource__Group__3
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
    // InternalOSSWI.g:3700:1: rule__MInstantiableResource__Group__2__Impl : ( ( rule__MInstantiableResource__NameAssignment_2 ) ) ;
    public final void rule__MInstantiableResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3704:1: ( ( ( rule__MInstantiableResource__NameAssignment_2 ) ) )
            // InternalOSSWI.g:3705:1: ( ( rule__MInstantiableResource__NameAssignment_2 ) )
            {
            // InternalOSSWI.g:3705:1: ( ( rule__MInstantiableResource__NameAssignment_2 ) )
            // InternalOSSWI.g:3706:1: ( rule__MInstantiableResource__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getNameAssignment_2()); 
            }
            // InternalOSSWI.g:3707:1: ( rule__MInstantiableResource__NameAssignment_2 )
            // InternalOSSWI.g:3707:2: rule__MInstantiableResource__NameAssignment_2
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
    // InternalOSSWI.g:3717:1: rule__MInstantiableResource__Group__3 : rule__MInstantiableResource__Group__3__Impl rule__MInstantiableResource__Group__4 ;
    public final void rule__MInstantiableResource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3721:1: ( rule__MInstantiableResource__Group__3__Impl rule__MInstantiableResource__Group__4 )
            // InternalOSSWI.g:3722:2: rule__MInstantiableResource__Group__3__Impl rule__MInstantiableResource__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalOSSWI.g:3729:1: rule__MInstantiableResource__Group__3__Impl : ( '{' ) ;
    public final void rule__MInstantiableResource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3733:1: ( ( '{' ) )
            // InternalOSSWI.g:3734:1: ( '{' )
            {
            // InternalOSSWI.g:3734:1: ( '{' )
            // InternalOSSWI.g:3735:1: '{'
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
    // InternalOSSWI.g:3748:1: rule__MInstantiableResource__Group__4 : rule__MInstantiableResource__Group__4__Impl rule__MInstantiableResource__Group__5 ;
    public final void rule__MInstantiableResource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3752:1: ( rule__MInstantiableResource__Group__4__Impl rule__MInstantiableResource__Group__5 )
            // InternalOSSWI.g:3753:2: rule__MInstantiableResource__Group__4__Impl rule__MInstantiableResource__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalOSSWI.g:3760:1: rule__MInstantiableResource__Group__4__Impl : ( ( rule__MInstantiableResource__ParametersAssignment_4 )* ) ;
    public final void rule__MInstantiableResource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3764:1: ( ( ( rule__MInstantiableResource__ParametersAssignment_4 )* ) )
            // InternalOSSWI.g:3765:1: ( ( rule__MInstantiableResource__ParametersAssignment_4 )* )
            {
            // InternalOSSWI.g:3765:1: ( ( rule__MInstantiableResource__ParametersAssignment_4 )* )
            // InternalOSSWI.g:3766:1: ( rule__MInstantiableResource__ParametersAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMInstantiableResourceAccess().getParametersAssignment_4()); 
            }
            // InternalOSSWI.g:3767:1: ( rule__MInstantiableResource__ParametersAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40||(LA23_0>=42 && LA23_0<=43)||(LA23_0>=45 && LA23_0<=46)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOSSWI.g:3767:2: rule__MInstantiableResource__ParametersAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    rule__MInstantiableResource__ParametersAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalOSSWI.g:3777:1: rule__MInstantiableResource__Group__5 : rule__MInstantiableResource__Group__5__Impl rule__MInstantiableResource__Group__6 ;
    public final void rule__MInstantiableResource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3781:1: ( rule__MInstantiableResource__Group__5__Impl rule__MInstantiableResource__Group__6 )
            // InternalOSSWI.g:3782:2: rule__MInstantiableResource__Group__5__Impl rule__MInstantiableResource__Group__6
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
    // InternalOSSWI.g:3789:1: rule__MInstantiableResource__Group__5__Impl : ( '}' ) ;
    public final void rule__MInstantiableResource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3793:1: ( ( '}' ) )
            // InternalOSSWI.g:3794:1: ( '}' )
            {
            // InternalOSSWI.g:3794:1: ( '}' )
            // InternalOSSWI.g:3795:1: '}'
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
    // InternalOSSWI.g:3808:1: rule__MInstantiableResource__Group__6 : rule__MInstantiableResource__Group__6__Impl ;
    public final void rule__MInstantiableResource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3812:1: ( rule__MInstantiableResource__Group__6__Impl )
            // InternalOSSWI.g:3813:2: rule__MInstantiableResource__Group__6__Impl
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
    // InternalOSSWI.g:3819:1: rule__MInstantiableResource__Group__6__Impl : ( ';' ) ;
    public final void rule__MInstantiableResource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3823:1: ( ( ';' ) )
            // InternalOSSWI.g:3824:1: ( ';' )
            {
            // InternalOSSWI.g:3824:1: ( ';' )
            // InternalOSSWI.g:3825:1: ';'
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
    // InternalOSSWI.g:3852:1: rule__MIntegerParameterSingleExpression__Group__0 : rule__MIntegerParameterSingleExpression__Group__0__Impl rule__MIntegerParameterSingleExpression__Group__1 ;
    public final void rule__MIntegerParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3856:1: ( rule__MIntegerParameterSingleExpression__Group__0__Impl rule__MIntegerParameterSingleExpression__Group__1 )
            // InternalOSSWI.g:3857:2: rule__MIntegerParameterSingleExpression__Group__0__Impl rule__MIntegerParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalOSSWI.g:3864:1: rule__MIntegerParameterSingleExpression__Group__0__Impl : ( 'integer' ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3868:1: ( ( 'integer' ) )
            // InternalOSSWI.g:3869:1: ( 'integer' )
            {
            // InternalOSSWI.g:3869:1: ( 'integer' )
            // InternalOSSWI.g:3870:1: 'integer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_0()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:3883:1: rule__MIntegerParameterSingleExpression__Group__1 : rule__MIntegerParameterSingleExpression__Group__1__Impl rule__MIntegerParameterSingleExpression__Group__2 ;
    public final void rule__MIntegerParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3887:1: ( rule__MIntegerParameterSingleExpression__Group__1__Impl rule__MIntegerParameterSingleExpression__Group__2 )
            // InternalOSSWI.g:3888:2: rule__MIntegerParameterSingleExpression__Group__1__Impl rule__MIntegerParameterSingleExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalOSSWI.g:3895:1: rule__MIntegerParameterSingleExpression__Group__1__Impl : ( ( rule__MIntegerParameterSingleExpression__NameAssignment_1 ) ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3899:1: ( ( ( rule__MIntegerParameterSingleExpression__NameAssignment_1 ) ) )
            // InternalOSSWI.g:3900:1: ( ( rule__MIntegerParameterSingleExpression__NameAssignment_1 ) )
            {
            // InternalOSSWI.g:3900:1: ( ( rule__MIntegerParameterSingleExpression__NameAssignment_1 ) )
            // InternalOSSWI.g:3901:1: ( rule__MIntegerParameterSingleExpression__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_1()); 
            }
            // InternalOSSWI.g:3902:1: ( rule__MIntegerParameterSingleExpression__NameAssignment_1 )
            // InternalOSSWI.g:3902:2: rule__MIntegerParameterSingleExpression__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:3912:1: rule__MIntegerParameterSingleExpression__Group__2 : rule__MIntegerParameterSingleExpression__Group__2__Impl rule__MIntegerParameterSingleExpression__Group__3 ;
    public final void rule__MIntegerParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3916:1: ( rule__MIntegerParameterSingleExpression__Group__2__Impl rule__MIntegerParameterSingleExpression__Group__3 )
            // InternalOSSWI.g:3917:2: rule__MIntegerParameterSingleExpression__Group__2__Impl rule__MIntegerParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:3924:1: rule__MIntegerParameterSingleExpression__Group__2__Impl : ( ':=' ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3928:1: ( ( ':=' ) )
            // InternalOSSWI.g:3929:1: ( ':=' )
            {
            // InternalOSSWI.g:3929:1: ( ':=' )
            // InternalOSSWI.g:3930:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:3943:1: rule__MIntegerParameterSingleExpression__Group__3 : rule__MIntegerParameterSingleExpression__Group__3__Impl rule__MIntegerParameterSingleExpression__Group__4 ;
    public final void rule__MIntegerParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3947:1: ( rule__MIntegerParameterSingleExpression__Group__3__Impl rule__MIntegerParameterSingleExpression__Group__4 )
            // InternalOSSWI.g:3948:2: rule__MIntegerParameterSingleExpression__Group__3__Impl rule__MIntegerParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalOSSWI.g:3955:1: rule__MIntegerParameterSingleExpression__Group__3__Impl : ( ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3 ) ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3959:1: ( ( ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3 ) ) )
            // InternalOSSWI.g:3960:1: ( ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3 ) )
            {
            // InternalOSSWI.g:3960:1: ( ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3 ) )
            // InternalOSSWI.g:3961:1: ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_3()); 
            }
            // InternalOSSWI.g:3962:1: ( rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3 )
            // InternalOSSWI.g:3962:2: rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_3()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:3972:1: rule__MIntegerParameterSingleExpression__Group__4 : rule__MIntegerParameterSingleExpression__Group__4__Impl rule__MIntegerParameterSingleExpression__Group__5 ;
    public final void rule__MIntegerParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3976:1: ( rule__MIntegerParameterSingleExpression__Group__4__Impl rule__MIntegerParameterSingleExpression__Group__5 )
            // InternalOSSWI.g:3977:2: rule__MIntegerParameterSingleExpression__Group__4__Impl rule__MIntegerParameterSingleExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalOSSWI.g:3984:1: rule__MIntegerParameterSingleExpression__Group__4__Impl : ( ( rule__MIntegerParameterSingleExpression__Group_4__0 )? ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:3988:1: ( ( ( rule__MIntegerParameterSingleExpression__Group_4__0 )? ) )
            // InternalOSSWI.g:3989:1: ( ( rule__MIntegerParameterSingleExpression__Group_4__0 )? )
            {
            // InternalOSSWI.g:3989:1: ( ( rule__MIntegerParameterSingleExpression__Group_4__0 )? )
            // InternalOSSWI.g:3990:1: ( rule__MIntegerParameterSingleExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_4()); 
            }
            // InternalOSSWI.g:3991:1: ( rule__MIntegerParameterSingleExpression__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOSSWI.g:3991:2: rule__MIntegerParameterSingleExpression__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MIntegerParameterSingleExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_4()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4001:1: rule__MIntegerParameterSingleExpression__Group__5 : rule__MIntegerParameterSingleExpression__Group__5__Impl ;
    public final void rule__MIntegerParameterSingleExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4005:1: ( rule__MIntegerParameterSingleExpression__Group__5__Impl )
            // InternalOSSWI.g:4006:2: rule__MIntegerParameterSingleExpression__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOSSWI.g:4012:1: rule__MIntegerParameterSingleExpression__Group__5__Impl : ( ';' ) ;
    public final void rule__MIntegerParameterSingleExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4016:1: ( ( ';' ) )
            // InternalOSSWI.g:4017:1: ( ';' )
            {
            // InternalOSSWI.g:4017:1: ( ';' )
            // InternalOSSWI.g:4018:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group_4__0"
    // InternalOSSWI.g:4043:1: rule__MIntegerParameterSingleExpression__Group_4__0 : rule__MIntegerParameterSingleExpression__Group_4__0__Impl rule__MIntegerParameterSingleExpression__Group_4__1 ;
    public final void rule__MIntegerParameterSingleExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4047:1: ( rule__MIntegerParameterSingleExpression__Group_4__0__Impl rule__MIntegerParameterSingleExpression__Group_4__1 )
            // InternalOSSWI.g:4048:2: rule__MIntegerParameterSingleExpression__Group_4__0__Impl rule__MIntegerParameterSingleExpression__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MIntegerParameterSingleExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group_4__0"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group_4__0__Impl"
    // InternalOSSWI.g:4055:1: rule__MIntegerParameterSingleExpression__Group_4__0__Impl : ( 'range' ) ;
    public final void rule__MIntegerParameterSingleExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4059:1: ( ( 'range' ) )
            // InternalOSSWI.g:4060:1: ( 'range' )
            {
            // InternalOSSWI.g:4060:1: ( 'range' )
            // InternalOSSWI.g:4061:1: 'range'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_4_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group_4__0__Impl"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group_4__1"
    // InternalOSSWI.g:4074:1: rule__MIntegerParameterSingleExpression__Group_4__1 : rule__MIntegerParameterSingleExpression__Group_4__1__Impl ;
    public final void rule__MIntegerParameterSingleExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4078:1: ( rule__MIntegerParameterSingleExpression__Group_4__1__Impl )
            // InternalOSSWI.g:4079:2: rule__MIntegerParameterSingleExpression__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group_4__1"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__Group_4__1__Impl"
    // InternalOSSWI.g:4085:1: rule__MIntegerParameterSingleExpression__Group_4__1__Impl : ( ( rule__MIntegerParameterSingleExpression__RangeAssignment_4_1 ) ) ;
    public final void rule__MIntegerParameterSingleExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4089:1: ( ( ( rule__MIntegerParameterSingleExpression__RangeAssignment_4_1 ) ) )
            // InternalOSSWI.g:4090:1: ( ( rule__MIntegerParameterSingleExpression__RangeAssignment_4_1 ) )
            {
            // InternalOSSWI.g:4090:1: ( ( rule__MIntegerParameterSingleExpression__RangeAssignment_4_1 ) )
            // InternalOSSWI.g:4091:1: ( rule__MIntegerParameterSingleExpression__RangeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_4_1()); 
            }
            // InternalOSSWI.g:4092:1: ( rule__MIntegerParameterSingleExpression__RangeAssignment_4_1 )
            // InternalOSSWI.g:4092:2: rule__MIntegerParameterSingleExpression__RangeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MIntegerParameterSingleExpression__RangeAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__Group_4__1__Impl"


    // $ANTLR start "rule__MEnumParameterDefinition__Group__0"
    // InternalOSSWI.g:4106:1: rule__MEnumParameterDefinition__Group__0 : rule__MEnumParameterDefinition__Group__0__Impl rule__MEnumParameterDefinition__Group__1 ;
    public final void rule__MEnumParameterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4110:1: ( rule__MEnumParameterDefinition__Group__0__Impl rule__MEnumParameterDefinition__Group__1 )
            // InternalOSSWI.g:4111:2: rule__MEnumParameterDefinition__Group__0__Impl rule__MEnumParameterDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalOSSWI.g:4118:1: rule__MEnumParameterDefinition__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParameterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4122:1: ( ( () ) )
            // InternalOSSWI.g:4123:1: ( () )
            {
            // InternalOSSWI.g:4123:1: ( () )
            // InternalOSSWI.g:4124:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0()); 
            }
            // InternalOSSWI.g:4125:1: ()
            // InternalOSSWI.g:4127:1: 
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
    // InternalOSSWI.g:4137:1: rule__MEnumParameterDefinition__Group__1 : rule__MEnumParameterDefinition__Group__1__Impl rule__MEnumParameterDefinition__Group__2 ;
    public final void rule__MEnumParameterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4141:1: ( rule__MEnumParameterDefinition__Group__1__Impl rule__MEnumParameterDefinition__Group__2 )
            // InternalOSSWI.g:4142:2: rule__MEnumParameterDefinition__Group__1__Impl rule__MEnumParameterDefinition__Group__2
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
    // InternalOSSWI.g:4149:1: rule__MEnumParameterDefinition__Group__1__Impl : ( 'enum' ) ;
    public final void rule__MEnumParameterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4153:1: ( ( 'enum' ) )
            // InternalOSSWI.g:4154:1: ( 'enum' )
            {
            // InternalOSSWI.g:4154:1: ( 'enum' )
            // InternalOSSWI.g:4155:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:4168:1: rule__MEnumParameterDefinition__Group__2 : rule__MEnumParameterDefinition__Group__2__Impl rule__MEnumParameterDefinition__Group__3 ;
    public final void rule__MEnumParameterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4172:1: ( rule__MEnumParameterDefinition__Group__2__Impl rule__MEnumParameterDefinition__Group__3 )
            // InternalOSSWI.g:4173:2: rule__MEnumParameterDefinition__Group__2__Impl rule__MEnumParameterDefinition__Group__3
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
    // InternalOSSWI.g:4180:1: rule__MEnumParameterDefinition__Group__2__Impl : ( ( rule__MEnumParameterDefinition__NameAssignment_2 ) ) ;
    public final void rule__MEnumParameterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4184:1: ( ( ( rule__MEnumParameterDefinition__NameAssignment_2 ) ) )
            // InternalOSSWI.g:4185:1: ( ( rule__MEnumParameterDefinition__NameAssignment_2 ) )
            {
            // InternalOSSWI.g:4185:1: ( ( rule__MEnumParameterDefinition__NameAssignment_2 ) )
            // InternalOSSWI.g:4186:1: ( rule__MEnumParameterDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalOSSWI.g:4187:1: ( rule__MEnumParameterDefinition__NameAssignment_2 )
            // InternalOSSWI.g:4187:2: rule__MEnumParameterDefinition__NameAssignment_2
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
    // InternalOSSWI.g:4197:1: rule__MEnumParameterDefinition__Group__3 : rule__MEnumParameterDefinition__Group__3__Impl rule__MEnumParameterDefinition__Group__4 ;
    public final void rule__MEnumParameterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4201:1: ( rule__MEnumParameterDefinition__Group__3__Impl rule__MEnumParameterDefinition__Group__4 )
            // InternalOSSWI.g:4202:2: rule__MEnumParameterDefinition__Group__3__Impl rule__MEnumParameterDefinition__Group__4
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
    // InternalOSSWI.g:4209:1: rule__MEnumParameterDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__MEnumParameterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4213:1: ( ( '{' ) )
            // InternalOSSWI.g:4214:1: ( '{' )
            {
            // InternalOSSWI.g:4214:1: ( '{' )
            // InternalOSSWI.g:4215:1: '{'
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
    // InternalOSSWI.g:4228:1: rule__MEnumParameterDefinition__Group__4 : rule__MEnumParameterDefinition__Group__4__Impl rule__MEnumParameterDefinition__Group__5 ;
    public final void rule__MEnumParameterDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4232:1: ( rule__MEnumParameterDefinition__Group__4__Impl rule__MEnumParameterDefinition__Group__5 )
            // InternalOSSWI.g:4233:2: rule__MEnumParameterDefinition__Group__4__Impl rule__MEnumParameterDefinition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalOSSWI.g:4240:1: rule__MEnumParameterDefinition__Group__4__Impl : ( ( rule__MEnumParameterDefinition__LiteralsAssignment_4 ) ) ;
    public final void rule__MEnumParameterDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4244:1: ( ( ( rule__MEnumParameterDefinition__LiteralsAssignment_4 ) ) )
            // InternalOSSWI.g:4245:1: ( ( rule__MEnumParameterDefinition__LiteralsAssignment_4 ) )
            {
            // InternalOSSWI.g:4245:1: ( ( rule__MEnumParameterDefinition__LiteralsAssignment_4 ) )
            // InternalOSSWI.g:4246:1: ( rule__MEnumParameterDefinition__LiteralsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4()); 
            }
            // InternalOSSWI.g:4247:1: ( rule__MEnumParameterDefinition__LiteralsAssignment_4 )
            // InternalOSSWI.g:4247:2: rule__MEnumParameterDefinition__LiteralsAssignment_4
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
    // InternalOSSWI.g:4257:1: rule__MEnumParameterDefinition__Group__5 : rule__MEnumParameterDefinition__Group__5__Impl rule__MEnumParameterDefinition__Group__6 ;
    public final void rule__MEnumParameterDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4261:1: ( rule__MEnumParameterDefinition__Group__5__Impl rule__MEnumParameterDefinition__Group__6 )
            // InternalOSSWI.g:4262:2: rule__MEnumParameterDefinition__Group__5__Impl rule__MEnumParameterDefinition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalOSSWI.g:4269:1: rule__MEnumParameterDefinition__Group__5__Impl : ( ( rule__MEnumParameterDefinition__Group_5__0 )* ) ;
    public final void rule__MEnumParameterDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4273:1: ( ( ( rule__MEnumParameterDefinition__Group_5__0 )* ) )
            // InternalOSSWI.g:4274:1: ( ( rule__MEnumParameterDefinition__Group_5__0 )* )
            {
            // InternalOSSWI.g:4274:1: ( ( rule__MEnumParameterDefinition__Group_5__0 )* )
            // InternalOSSWI.g:4275:1: ( rule__MEnumParameterDefinition__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5()); 
            }
            // InternalOSSWI.g:4276:1: ( rule__MEnumParameterDefinition__Group_5__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOSSWI.g:4276:2: rule__MEnumParameterDefinition__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__MEnumParameterDefinition__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalOSSWI.g:4286:1: rule__MEnumParameterDefinition__Group__6 : rule__MEnumParameterDefinition__Group__6__Impl rule__MEnumParameterDefinition__Group__7 ;
    public final void rule__MEnumParameterDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4290:1: ( rule__MEnumParameterDefinition__Group__6__Impl rule__MEnumParameterDefinition__Group__7 )
            // InternalOSSWI.g:4291:2: rule__MEnumParameterDefinition__Group__6__Impl rule__MEnumParameterDefinition__Group__7
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
    // InternalOSSWI.g:4298:1: rule__MEnumParameterDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__MEnumParameterDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4302:1: ( ( '}' ) )
            // InternalOSSWI.g:4303:1: ( '}' )
            {
            // InternalOSSWI.g:4303:1: ( '}' )
            // InternalOSSWI.g:4304:1: '}'
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
    // InternalOSSWI.g:4317:1: rule__MEnumParameterDefinition__Group__7 : rule__MEnumParameterDefinition__Group__7__Impl ;
    public final void rule__MEnumParameterDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4321:1: ( rule__MEnumParameterDefinition__Group__7__Impl )
            // InternalOSSWI.g:4322:2: rule__MEnumParameterDefinition__Group__7__Impl
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
    // InternalOSSWI.g:4328:1: rule__MEnumParameterDefinition__Group__7__Impl : ( ';' ) ;
    public final void rule__MEnumParameterDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4332:1: ( ( ';' ) )
            // InternalOSSWI.g:4333:1: ( ';' )
            {
            // InternalOSSWI.g:4333:1: ( ';' )
            // InternalOSSWI.g:4334:1: ';'
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
    // InternalOSSWI.g:4363:1: rule__MEnumParameterDefinition__Group_5__0 : rule__MEnumParameterDefinition__Group_5__0__Impl rule__MEnumParameterDefinition__Group_5__1 ;
    public final void rule__MEnumParameterDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4367:1: ( rule__MEnumParameterDefinition__Group_5__0__Impl rule__MEnumParameterDefinition__Group_5__1 )
            // InternalOSSWI.g:4368:2: rule__MEnumParameterDefinition__Group_5__0__Impl rule__MEnumParameterDefinition__Group_5__1
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
    // InternalOSSWI.g:4375:1: rule__MEnumParameterDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__MEnumParameterDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4379:1: ( ( ',' ) )
            // InternalOSSWI.g:4380:1: ( ',' )
            {
            // InternalOSSWI.g:4380:1: ( ',' )
            // InternalOSSWI.g:4381:1: ','
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
    // InternalOSSWI.g:4394:1: rule__MEnumParameterDefinition__Group_5__1 : rule__MEnumParameterDefinition__Group_5__1__Impl ;
    public final void rule__MEnumParameterDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4398:1: ( rule__MEnumParameterDefinition__Group_5__1__Impl )
            // InternalOSSWI.g:4399:2: rule__MEnumParameterDefinition__Group_5__1__Impl
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
    // InternalOSSWI.g:4405:1: rule__MEnumParameterDefinition__Group_5__1__Impl : ( ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 ) ) ;
    public final void rule__MEnumParameterDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4409:1: ( ( ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 ) ) )
            // InternalOSSWI.g:4410:1: ( ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 ) )
            {
            // InternalOSSWI.g:4410:1: ( ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 ) )
            // InternalOSSWI.g:4411:1: ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_5_1()); 
            }
            // InternalOSSWI.g:4412:1: ( rule__MEnumParameterDefinition__LiteralsAssignment_5_1 )
            // InternalOSSWI.g:4412:2: rule__MEnumParameterDefinition__LiteralsAssignment_5_1
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
    // InternalOSSWI.g:4426:1: rule__MEnumParameterSingleExpression__Group__0 : rule__MEnumParameterSingleExpression__Group__0__Impl rule__MEnumParameterSingleExpression__Group__1 ;
    public final void rule__MEnumParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4430:1: ( rule__MEnumParameterSingleExpression__Group__0__Impl rule__MEnumParameterSingleExpression__Group__1 )
            // InternalOSSWI.g:4431:2: rule__MEnumParameterSingleExpression__Group__0__Impl rule__MEnumParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalOSSWI.g:4438:1: rule__MEnumParameterSingleExpression__Group__0__Impl : ( 'enum' ) ;
    public final void rule__MEnumParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4442:1: ( ( 'enum' ) )
            // InternalOSSWI.g:4443:1: ( 'enum' )
            {
            // InternalOSSWI.g:4443:1: ( 'enum' )
            // InternalOSSWI.g:4444:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_0()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4457:1: rule__MEnumParameterSingleExpression__Group__1 : rule__MEnumParameterSingleExpression__Group__1__Impl rule__MEnumParameterSingleExpression__Group__2 ;
    public final void rule__MEnumParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4461:1: ( rule__MEnumParameterSingleExpression__Group__1__Impl rule__MEnumParameterSingleExpression__Group__2 )
            // InternalOSSWI.g:4462:2: rule__MEnumParameterSingleExpression__Group__1__Impl rule__MEnumParameterSingleExpression__Group__2
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
    // InternalOSSWI.g:4469:1: rule__MEnumParameterSingleExpression__Group__1__Impl : ( ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1 ) ) ;
    public final void rule__MEnumParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4473:1: ( ( ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1 ) ) )
            // InternalOSSWI.g:4474:1: ( ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1 ) )
            {
            // InternalOSSWI.g:4474:1: ( ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1 ) )
            // InternalOSSWI.g:4475:1: ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_1()); 
            }
            // InternalOSSWI.g:4476:1: ( rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1 )
            // InternalOSSWI.g:4476:2: rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_1()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4486:1: rule__MEnumParameterSingleExpression__Group__2 : rule__MEnumParameterSingleExpression__Group__2__Impl rule__MEnumParameterSingleExpression__Group__3 ;
    public final void rule__MEnumParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4490:1: ( rule__MEnumParameterSingleExpression__Group__2__Impl rule__MEnumParameterSingleExpression__Group__3 )
            // InternalOSSWI.g:4491:2: rule__MEnumParameterSingleExpression__Group__2__Impl rule__MEnumParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalOSSWI.g:4498:1: rule__MEnumParameterSingleExpression__Group__2__Impl : ( ( rule__MEnumParameterSingleExpression__NameAssignment_2 ) ) ;
    public final void rule__MEnumParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4502:1: ( ( ( rule__MEnumParameterSingleExpression__NameAssignment_2 ) ) )
            // InternalOSSWI.g:4503:1: ( ( rule__MEnumParameterSingleExpression__NameAssignment_2 ) )
            {
            // InternalOSSWI.g:4503:1: ( ( rule__MEnumParameterSingleExpression__NameAssignment_2 ) )
            // InternalOSSWI.g:4504:1: ( rule__MEnumParameterSingleExpression__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_2()); 
            }
            // InternalOSSWI.g:4505:1: ( rule__MEnumParameterSingleExpression__NameAssignment_2 )
            // InternalOSSWI.g:4505:2: rule__MEnumParameterSingleExpression__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4515:1: rule__MEnumParameterSingleExpression__Group__3 : rule__MEnumParameterSingleExpression__Group__3__Impl rule__MEnumParameterSingleExpression__Group__4 ;
    public final void rule__MEnumParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4519:1: ( rule__MEnumParameterSingleExpression__Group__3__Impl rule__MEnumParameterSingleExpression__Group__4 )
            // InternalOSSWI.g:4520:2: rule__MEnumParameterSingleExpression__Group__3__Impl rule__MEnumParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:4527:1: rule__MEnumParameterSingleExpression__Group__3__Impl : ( ':=' ) ;
    public final void rule__MEnumParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4531:1: ( ( ':=' ) )
            // InternalOSSWI.g:4532:1: ( ':=' )
            {
            // InternalOSSWI.g:4532:1: ( ':=' )
            // InternalOSSWI.g:4533:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4546:1: rule__MEnumParameterSingleExpression__Group__4 : rule__MEnumParameterSingleExpression__Group__4__Impl rule__MEnumParameterSingleExpression__Group__5 ;
    public final void rule__MEnumParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4550:1: ( rule__MEnumParameterSingleExpression__Group__4__Impl rule__MEnumParameterSingleExpression__Group__5 )
            // InternalOSSWI.g:4551:2: rule__MEnumParameterSingleExpression__Group__4__Impl rule__MEnumParameterSingleExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalOSSWI.g:4558:1: rule__MEnumParameterSingleExpression__Group__4__Impl : ( ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_4 ) ) ;
    public final void rule__MEnumParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4562:1: ( ( ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_4 ) ) )
            // InternalOSSWI.g:4563:1: ( ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_4 ) )
            {
            // InternalOSSWI.g:4563:1: ( ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_4 ) )
            // InternalOSSWI.g:4564:1: ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }
            // InternalOSSWI.g:4565:1: ( rule__MEnumParameterSingleExpression__DefaultValueAssignment_4 )
            // InternalOSSWI.g:4565:2: rule__MEnumParameterSingleExpression__DefaultValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__DefaultValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_4()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4575:1: rule__MEnumParameterSingleExpression__Group__5 : rule__MEnumParameterSingleExpression__Group__5__Impl ;
    public final void rule__MEnumParameterSingleExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4579:1: ( rule__MEnumParameterSingleExpression__Group__5__Impl )
            // InternalOSSWI.g:4580:2: rule__MEnumParameterSingleExpression__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MEnumParameterSingleExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOSSWI.g:4586:1: rule__MEnumParameterSingleExpression__Group__5__Impl : ( ';' ) ;
    public final void rule__MEnumParameterSingleExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4590:1: ( ( ';' ) )
            // InternalOSSWI.g:4591:1: ( ';' )
            {
            // InternalOSSWI.g:4591:1: ( ';' )
            // InternalOSSWI.g:4592:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MRealParameterSingleExpression__Group__0"
    // InternalOSSWI.g:4617:1: rule__MRealParameterSingleExpression__Group__0 : rule__MRealParameterSingleExpression__Group__0__Impl rule__MRealParameterSingleExpression__Group__1 ;
    public final void rule__MRealParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4621:1: ( rule__MRealParameterSingleExpression__Group__0__Impl rule__MRealParameterSingleExpression__Group__1 )
            // InternalOSSWI.g:4622:2: rule__MRealParameterSingleExpression__Group__0__Impl rule__MRealParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalOSSWI.g:4629:1: rule__MRealParameterSingleExpression__Group__0__Impl : ( 'real' ) ;
    public final void rule__MRealParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4633:1: ( ( 'real' ) )
            // InternalOSSWI.g:4634:1: ( 'real' )
            {
            // InternalOSSWI.g:4634:1: ( 'real' )
            // InternalOSSWI.g:4635:1: 'real'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_0()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4648:1: rule__MRealParameterSingleExpression__Group__1 : rule__MRealParameterSingleExpression__Group__1__Impl rule__MRealParameterSingleExpression__Group__2 ;
    public final void rule__MRealParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4652:1: ( rule__MRealParameterSingleExpression__Group__1__Impl rule__MRealParameterSingleExpression__Group__2 )
            // InternalOSSWI.g:4653:2: rule__MRealParameterSingleExpression__Group__1__Impl rule__MRealParameterSingleExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalOSSWI.g:4660:1: rule__MRealParameterSingleExpression__Group__1__Impl : ( ( rule__MRealParameterSingleExpression__NameAssignment_1 ) ) ;
    public final void rule__MRealParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4664:1: ( ( ( rule__MRealParameterSingleExpression__NameAssignment_1 ) ) )
            // InternalOSSWI.g:4665:1: ( ( rule__MRealParameterSingleExpression__NameAssignment_1 ) )
            {
            // InternalOSSWI.g:4665:1: ( ( rule__MRealParameterSingleExpression__NameAssignment_1 ) )
            // InternalOSSWI.g:4666:1: ( rule__MRealParameterSingleExpression__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_1()); 
            }
            // InternalOSSWI.g:4667:1: ( rule__MRealParameterSingleExpression__NameAssignment_1 )
            // InternalOSSWI.g:4667:2: rule__MRealParameterSingleExpression__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4677:1: rule__MRealParameterSingleExpression__Group__2 : rule__MRealParameterSingleExpression__Group__2__Impl rule__MRealParameterSingleExpression__Group__3 ;
    public final void rule__MRealParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4681:1: ( rule__MRealParameterSingleExpression__Group__2__Impl rule__MRealParameterSingleExpression__Group__3 )
            // InternalOSSWI.g:4682:2: rule__MRealParameterSingleExpression__Group__2__Impl rule__MRealParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:4689:1: rule__MRealParameterSingleExpression__Group__2__Impl : ( ':=' ) ;
    public final void rule__MRealParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4693:1: ( ( ':=' ) )
            // InternalOSSWI.g:4694:1: ( ':=' )
            {
            // InternalOSSWI.g:4694:1: ( ':=' )
            // InternalOSSWI.g:4695:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4708:1: rule__MRealParameterSingleExpression__Group__3 : rule__MRealParameterSingleExpression__Group__3__Impl rule__MRealParameterSingleExpression__Group__4 ;
    public final void rule__MRealParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4712:1: ( rule__MRealParameterSingleExpression__Group__3__Impl rule__MRealParameterSingleExpression__Group__4 )
            // InternalOSSWI.g:4713:2: rule__MRealParameterSingleExpression__Group__3__Impl rule__MRealParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalOSSWI.g:4720:1: rule__MRealParameterSingleExpression__Group__3__Impl : ( ( rule__MRealParameterSingleExpression__DefaultValueAssignment_3 ) ) ;
    public final void rule__MRealParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4724:1: ( ( ( rule__MRealParameterSingleExpression__DefaultValueAssignment_3 ) ) )
            // InternalOSSWI.g:4725:1: ( ( rule__MRealParameterSingleExpression__DefaultValueAssignment_3 ) )
            {
            // InternalOSSWI.g:4725:1: ( ( rule__MRealParameterSingleExpression__DefaultValueAssignment_3 ) )
            // InternalOSSWI.g:4726:1: ( rule__MRealParameterSingleExpression__DefaultValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_3()); 
            }
            // InternalOSSWI.g:4727:1: ( rule__MRealParameterSingleExpression__DefaultValueAssignment_3 )
            // InternalOSSWI.g:4727:2: rule__MRealParameterSingleExpression__DefaultValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__DefaultValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_3()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4737:1: rule__MRealParameterSingleExpression__Group__4 : rule__MRealParameterSingleExpression__Group__4__Impl rule__MRealParameterSingleExpression__Group__5 ;
    public final void rule__MRealParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4741:1: ( rule__MRealParameterSingleExpression__Group__4__Impl rule__MRealParameterSingleExpression__Group__5 )
            // InternalOSSWI.g:4742:2: rule__MRealParameterSingleExpression__Group__4__Impl rule__MRealParameterSingleExpression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalOSSWI.g:4749:1: rule__MRealParameterSingleExpression__Group__4__Impl : ( ( rule__MRealParameterSingleExpression__Group_4__0 )? ) ;
    public final void rule__MRealParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4753:1: ( ( ( rule__MRealParameterSingleExpression__Group_4__0 )? ) )
            // InternalOSSWI.g:4754:1: ( ( rule__MRealParameterSingleExpression__Group_4__0 )? )
            {
            // InternalOSSWI.g:4754:1: ( ( rule__MRealParameterSingleExpression__Group_4__0 )? )
            // InternalOSSWI.g:4755:1: ( rule__MRealParameterSingleExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_4()); 
            }
            // InternalOSSWI.g:4756:1: ( rule__MRealParameterSingleExpression__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOSSWI.g:4756:2: rule__MRealParameterSingleExpression__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MRealParameterSingleExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_4()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:4766:1: rule__MRealParameterSingleExpression__Group__5 : rule__MRealParameterSingleExpression__Group__5__Impl ;
    public final void rule__MRealParameterSingleExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4770:1: ( rule__MRealParameterSingleExpression__Group__5__Impl )
            // InternalOSSWI.g:4771:2: rule__MRealParameterSingleExpression__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOSSWI.g:4777:1: rule__MRealParameterSingleExpression__Group__5__Impl : ( ';' ) ;
    public final void rule__MRealParameterSingleExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4781:1: ( ( ';' ) )
            // InternalOSSWI.g:4782:1: ( ';' )
            {
            // InternalOSSWI.g:4782:1: ( ';' )
            // InternalOSSWI.g:4783:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MRealParameterSingleExpression__Group_4__0"
    // InternalOSSWI.g:4808:1: rule__MRealParameterSingleExpression__Group_4__0 : rule__MRealParameterSingleExpression__Group_4__0__Impl rule__MRealParameterSingleExpression__Group_4__1 ;
    public final void rule__MRealParameterSingleExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4812:1: ( rule__MRealParameterSingleExpression__Group_4__0__Impl rule__MRealParameterSingleExpression__Group_4__1 )
            // InternalOSSWI.g:4813:2: rule__MRealParameterSingleExpression__Group_4__0__Impl rule__MRealParameterSingleExpression__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__MRealParameterSingleExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group_4__0"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group_4__0__Impl"
    // InternalOSSWI.g:4820:1: rule__MRealParameterSingleExpression__Group_4__0__Impl : ( 'range' ) ;
    public final void rule__MRealParameterSingleExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4824:1: ( ( 'range' ) )
            // InternalOSSWI.g:4825:1: ( 'range' )
            {
            // InternalOSSWI.g:4825:1: ( 'range' )
            // InternalOSSWI.g:4826:1: 'range'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_4_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group_4__0__Impl"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group_4__1"
    // InternalOSSWI.g:4839:1: rule__MRealParameterSingleExpression__Group_4__1 : rule__MRealParameterSingleExpression__Group_4__1__Impl ;
    public final void rule__MRealParameterSingleExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4843:1: ( rule__MRealParameterSingleExpression__Group_4__1__Impl )
            // InternalOSSWI.g:4844:2: rule__MRealParameterSingleExpression__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group_4__1"


    // $ANTLR start "rule__MRealParameterSingleExpression__Group_4__1__Impl"
    // InternalOSSWI.g:4850:1: rule__MRealParameterSingleExpression__Group_4__1__Impl : ( ( rule__MRealParameterSingleExpression__RangeAssignment_4_1 ) ) ;
    public final void rule__MRealParameterSingleExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4854:1: ( ( ( rule__MRealParameterSingleExpression__RangeAssignment_4_1 ) ) )
            // InternalOSSWI.g:4855:1: ( ( rule__MRealParameterSingleExpression__RangeAssignment_4_1 ) )
            {
            // InternalOSSWI.g:4855:1: ( ( rule__MRealParameterSingleExpression__RangeAssignment_4_1 ) )
            // InternalOSSWI.g:4856:1: ( rule__MRealParameterSingleExpression__RangeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_4_1()); 
            }
            // InternalOSSWI.g:4857:1: ( rule__MRealParameterSingleExpression__RangeAssignment_4_1 )
            // InternalOSSWI.g:4857:2: rule__MRealParameterSingleExpression__RangeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MRealParameterSingleExpression__RangeAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__Group_4__1__Impl"


    // $ANTLR start "rule__MEnumParameterLiteral__Group__0"
    // InternalOSSWI.g:4871:1: rule__MEnumParameterLiteral__Group__0 : rule__MEnumParameterLiteral__Group__0__Impl rule__MEnumParameterLiteral__Group__1 ;
    public final void rule__MEnumParameterLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4875:1: ( rule__MEnumParameterLiteral__Group__0__Impl rule__MEnumParameterLiteral__Group__1 )
            // InternalOSSWI.g:4876:2: rule__MEnumParameterLiteral__Group__0__Impl rule__MEnumParameterLiteral__Group__1
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
    // InternalOSSWI.g:4883:1: rule__MEnumParameterLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParameterLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4887:1: ( ( () ) )
            // InternalOSSWI.g:4888:1: ( () )
            {
            // InternalOSSWI.g:4888:1: ( () )
            // InternalOSSWI.g:4889:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0()); 
            }
            // InternalOSSWI.g:4890:1: ()
            // InternalOSSWI.g:4892:1: 
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
    // InternalOSSWI.g:4902:1: rule__MEnumParameterLiteral__Group__1 : rule__MEnumParameterLiteral__Group__1__Impl ;
    public final void rule__MEnumParameterLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4906:1: ( rule__MEnumParameterLiteral__Group__1__Impl )
            // InternalOSSWI.g:4907:2: rule__MEnumParameterLiteral__Group__1__Impl
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
    // InternalOSSWI.g:4913:1: rule__MEnumParameterLiteral__Group__1__Impl : ( ( rule__MEnumParameterLiteral__NameAssignment_1 ) ) ;
    public final void rule__MEnumParameterLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4917:1: ( ( ( rule__MEnumParameterLiteral__NameAssignment_1 ) ) )
            // InternalOSSWI.g:4918:1: ( ( rule__MEnumParameterLiteral__NameAssignment_1 ) )
            {
            // InternalOSSWI.g:4918:1: ( ( rule__MEnumParameterLiteral__NameAssignment_1 ) )
            // InternalOSSWI.g:4919:1: ( rule__MEnumParameterLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterLiteralAccess().getNameAssignment_1()); 
            }
            // InternalOSSWI.g:4920:1: ( rule__MEnumParameterLiteral__NameAssignment_1 )
            // InternalOSSWI.g:4920:2: rule__MEnumParameterLiteral__NameAssignment_1
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
    // InternalOSSWI.g:4934:1: rule__MEnumParamIntegerLiteral__Group__0 : rule__MEnumParamIntegerLiteral__Group__0__Impl rule__MEnumParamIntegerLiteral__Group__1 ;
    public final void rule__MEnumParamIntegerLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4938:1: ( rule__MEnumParamIntegerLiteral__Group__0__Impl rule__MEnumParamIntegerLiteral__Group__1 )
            // InternalOSSWI.g:4939:2: rule__MEnumParamIntegerLiteral__Group__0__Impl rule__MEnumParamIntegerLiteral__Group__1
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
    // InternalOSSWI.g:4946:1: rule__MEnumParamIntegerLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParamIntegerLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4950:1: ( ( () ) )
            // InternalOSSWI.g:4951:1: ( () )
            {
            // InternalOSSWI.g:4951:1: ( () )
            // InternalOSSWI.g:4952:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0()); 
            }
            // InternalOSSWI.g:4953:1: ()
            // InternalOSSWI.g:4955:1: 
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
    // InternalOSSWI.g:4965:1: rule__MEnumParamIntegerLiteral__Group__1 : rule__MEnumParamIntegerLiteral__Group__1__Impl rule__MEnumParamIntegerLiteral__Group__2 ;
    public final void rule__MEnumParamIntegerLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4969:1: ( rule__MEnumParamIntegerLiteral__Group__1__Impl rule__MEnumParamIntegerLiteral__Group__2 )
            // InternalOSSWI.g:4970:2: rule__MEnumParamIntegerLiteral__Group__1__Impl rule__MEnumParamIntegerLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalOSSWI.g:4977:1: rule__MEnumParamIntegerLiteral__Group__1__Impl : ( ( rule__MEnumParamIntegerLiteral__NameAssignment_1 ) ) ;
    public final void rule__MEnumParamIntegerLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4981:1: ( ( ( rule__MEnumParamIntegerLiteral__NameAssignment_1 ) ) )
            // InternalOSSWI.g:4982:1: ( ( rule__MEnumParamIntegerLiteral__NameAssignment_1 ) )
            {
            // InternalOSSWI.g:4982:1: ( ( rule__MEnumParamIntegerLiteral__NameAssignment_1 ) )
            // InternalOSSWI.g:4983:1: ( rule__MEnumParamIntegerLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameAssignment_1()); 
            }
            // InternalOSSWI.g:4984:1: ( rule__MEnumParamIntegerLiteral__NameAssignment_1 )
            // InternalOSSWI.g:4984:2: rule__MEnumParamIntegerLiteral__NameAssignment_1
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
    // InternalOSSWI.g:4994:1: rule__MEnumParamIntegerLiteral__Group__2 : rule__MEnumParamIntegerLiteral__Group__2__Impl rule__MEnumParamIntegerLiteral__Group__3 ;
    public final void rule__MEnumParamIntegerLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:4998:1: ( rule__MEnumParamIntegerLiteral__Group__2__Impl rule__MEnumParamIntegerLiteral__Group__3 )
            // InternalOSSWI.g:4999:2: rule__MEnumParamIntegerLiteral__Group__2__Impl rule__MEnumParamIntegerLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalOSSWI.g:5006:1: rule__MEnumParamIntegerLiteral__Group__2__Impl : ( '=' ) ;
    public final void rule__MEnumParamIntegerLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5010:1: ( ( '=' ) )
            // InternalOSSWI.g:5011:1: ( '=' )
            {
            // InternalOSSWI.g:5011:1: ( '=' )
            // InternalOSSWI.g:5012:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:5025:1: rule__MEnumParamIntegerLiteral__Group__3 : rule__MEnumParamIntegerLiteral__Group__3__Impl ;
    public final void rule__MEnumParamIntegerLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5029:1: ( rule__MEnumParamIntegerLiteral__Group__3__Impl )
            // InternalOSSWI.g:5030:2: rule__MEnumParamIntegerLiteral__Group__3__Impl
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
    // InternalOSSWI.g:5036:1: rule__MEnumParamIntegerLiteral__Group__3__Impl : ( ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 ) ) ;
    public final void rule__MEnumParamIntegerLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5040:1: ( ( ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 ) ) )
            // InternalOSSWI.g:5041:1: ( ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 ) )
            {
            // InternalOSSWI.g:5041:1: ( ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 ) )
            // InternalOSSWI.g:5042:1: ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueAssignment_3()); 
            }
            // InternalOSSWI.g:5043:1: ( rule__MEnumParamIntegerLiteral__ValueAssignment_3 )
            // InternalOSSWI.g:5043:2: rule__MEnumParamIntegerLiteral__ValueAssignment_3
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
    // InternalOSSWI.g:5061:1: rule__MEnumParamRealLiteral__Group__0 : rule__MEnumParamRealLiteral__Group__0__Impl rule__MEnumParamRealLiteral__Group__1 ;
    public final void rule__MEnumParamRealLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5065:1: ( rule__MEnumParamRealLiteral__Group__0__Impl rule__MEnumParamRealLiteral__Group__1 )
            // InternalOSSWI.g:5066:2: rule__MEnumParamRealLiteral__Group__0__Impl rule__MEnumParamRealLiteral__Group__1
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
    // InternalOSSWI.g:5073:1: rule__MEnumParamRealLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParamRealLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5077:1: ( ( () ) )
            // InternalOSSWI.g:5078:1: ( () )
            {
            // InternalOSSWI.g:5078:1: ( () )
            // InternalOSSWI.g:5079:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0()); 
            }
            // InternalOSSWI.g:5080:1: ()
            // InternalOSSWI.g:5082:1: 
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
    // InternalOSSWI.g:5092:1: rule__MEnumParamRealLiteral__Group__1 : rule__MEnumParamRealLiteral__Group__1__Impl rule__MEnumParamRealLiteral__Group__2 ;
    public final void rule__MEnumParamRealLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5096:1: ( rule__MEnumParamRealLiteral__Group__1__Impl rule__MEnumParamRealLiteral__Group__2 )
            // InternalOSSWI.g:5097:2: rule__MEnumParamRealLiteral__Group__1__Impl rule__MEnumParamRealLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalOSSWI.g:5104:1: rule__MEnumParamRealLiteral__Group__1__Impl : ( ( rule__MEnumParamRealLiteral__NameAssignment_1 ) ) ;
    public final void rule__MEnumParamRealLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5108:1: ( ( ( rule__MEnumParamRealLiteral__NameAssignment_1 ) ) )
            // InternalOSSWI.g:5109:1: ( ( rule__MEnumParamRealLiteral__NameAssignment_1 ) )
            {
            // InternalOSSWI.g:5109:1: ( ( rule__MEnumParamRealLiteral__NameAssignment_1 ) )
            // InternalOSSWI.g:5110:1: ( rule__MEnumParamRealLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getNameAssignment_1()); 
            }
            // InternalOSSWI.g:5111:1: ( rule__MEnumParamRealLiteral__NameAssignment_1 )
            // InternalOSSWI.g:5111:2: rule__MEnumParamRealLiteral__NameAssignment_1
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
    // InternalOSSWI.g:5121:1: rule__MEnumParamRealLiteral__Group__2 : rule__MEnumParamRealLiteral__Group__2__Impl rule__MEnumParamRealLiteral__Group__3 ;
    public final void rule__MEnumParamRealLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5125:1: ( rule__MEnumParamRealLiteral__Group__2__Impl rule__MEnumParamRealLiteral__Group__3 )
            // InternalOSSWI.g:5126:2: rule__MEnumParamRealLiteral__Group__2__Impl rule__MEnumParamRealLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalOSSWI.g:5133:1: rule__MEnumParamRealLiteral__Group__2__Impl : ( '=' ) ;
    public final void rule__MEnumParamRealLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5137:1: ( ( '=' ) )
            // InternalOSSWI.g:5138:1: ( '=' )
            {
            // InternalOSSWI.g:5138:1: ( '=' )
            // InternalOSSWI.g:5139:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:5152:1: rule__MEnumParamRealLiteral__Group__3 : rule__MEnumParamRealLiteral__Group__3__Impl ;
    public final void rule__MEnumParamRealLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5156:1: ( rule__MEnumParamRealLiteral__Group__3__Impl )
            // InternalOSSWI.g:5157:2: rule__MEnumParamRealLiteral__Group__3__Impl
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
    // InternalOSSWI.g:5163:1: rule__MEnumParamRealLiteral__Group__3__Impl : ( ( rule__MEnumParamRealLiteral__ValueAssignment_3 ) ) ;
    public final void rule__MEnumParamRealLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5167:1: ( ( ( rule__MEnumParamRealLiteral__ValueAssignment_3 ) ) )
            // InternalOSSWI.g:5168:1: ( ( rule__MEnumParamRealLiteral__ValueAssignment_3 ) )
            {
            // InternalOSSWI.g:5168:1: ( ( rule__MEnumParamRealLiteral__ValueAssignment_3 ) )
            // InternalOSSWI.g:5169:1: ( rule__MEnumParamRealLiteral__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamRealLiteralAccess().getValueAssignment_3()); 
            }
            // InternalOSSWI.g:5170:1: ( rule__MEnumParamRealLiteral__ValueAssignment_3 )
            // InternalOSSWI.g:5170:2: rule__MEnumParamRealLiteral__ValueAssignment_3
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
    // InternalOSSWI.g:5188:1: rule__MEnumParamStringLiteral__Group__0 : rule__MEnumParamStringLiteral__Group__0__Impl rule__MEnumParamStringLiteral__Group__1 ;
    public final void rule__MEnumParamStringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5192:1: ( rule__MEnumParamStringLiteral__Group__0__Impl rule__MEnumParamStringLiteral__Group__1 )
            // InternalOSSWI.g:5193:2: rule__MEnumParamStringLiteral__Group__0__Impl rule__MEnumParamStringLiteral__Group__1
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
    // InternalOSSWI.g:5200:1: rule__MEnumParamStringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MEnumParamStringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5204:1: ( ( () ) )
            // InternalOSSWI.g:5205:1: ( () )
            {
            // InternalOSSWI.g:5205:1: ( () )
            // InternalOSSWI.g:5206:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0()); 
            }
            // InternalOSSWI.g:5207:1: ()
            // InternalOSSWI.g:5209:1: 
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
    // InternalOSSWI.g:5219:1: rule__MEnumParamStringLiteral__Group__1 : rule__MEnumParamStringLiteral__Group__1__Impl rule__MEnumParamStringLiteral__Group__2 ;
    public final void rule__MEnumParamStringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5223:1: ( rule__MEnumParamStringLiteral__Group__1__Impl rule__MEnumParamStringLiteral__Group__2 )
            // InternalOSSWI.g:5224:2: rule__MEnumParamStringLiteral__Group__1__Impl rule__MEnumParamStringLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalOSSWI.g:5231:1: rule__MEnumParamStringLiteral__Group__1__Impl : ( ( rule__MEnumParamStringLiteral__NameAssignment_1 ) ) ;
    public final void rule__MEnumParamStringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5235:1: ( ( ( rule__MEnumParamStringLiteral__NameAssignment_1 ) ) )
            // InternalOSSWI.g:5236:1: ( ( rule__MEnumParamStringLiteral__NameAssignment_1 ) )
            {
            // InternalOSSWI.g:5236:1: ( ( rule__MEnumParamStringLiteral__NameAssignment_1 ) )
            // InternalOSSWI.g:5237:1: ( rule__MEnumParamStringLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getNameAssignment_1()); 
            }
            // InternalOSSWI.g:5238:1: ( rule__MEnumParamStringLiteral__NameAssignment_1 )
            // InternalOSSWI.g:5238:2: rule__MEnumParamStringLiteral__NameAssignment_1
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
    // InternalOSSWI.g:5248:1: rule__MEnumParamStringLiteral__Group__2 : rule__MEnumParamStringLiteral__Group__2__Impl rule__MEnumParamStringLiteral__Group__3 ;
    public final void rule__MEnumParamStringLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5252:1: ( rule__MEnumParamStringLiteral__Group__2__Impl rule__MEnumParamStringLiteral__Group__3 )
            // InternalOSSWI.g:5253:2: rule__MEnumParamStringLiteral__Group__2__Impl rule__MEnumParamStringLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_37);
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
    // InternalOSSWI.g:5260:1: rule__MEnumParamStringLiteral__Group__2__Impl : ( '=' ) ;
    public final void rule__MEnumParamStringLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5264:1: ( ( '=' ) )
            // InternalOSSWI.g:5265:1: ( '=' )
            {
            // InternalOSSWI.g:5265:1: ( '=' )
            // InternalOSSWI.g:5266:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:5279:1: rule__MEnumParamStringLiteral__Group__3 : rule__MEnumParamStringLiteral__Group__3__Impl rule__MEnumParamStringLiteral__Group__4 ;
    public final void rule__MEnumParamStringLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5283:1: ( rule__MEnumParamStringLiteral__Group__3__Impl rule__MEnumParamStringLiteral__Group__4 )
            // InternalOSSWI.g:5284:2: rule__MEnumParamStringLiteral__Group__3__Impl rule__MEnumParamStringLiteral__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_37);
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
    // InternalOSSWI.g:5291:1: rule__MEnumParamStringLiteral__Group__3__Impl : ( ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )? ) ;
    public final void rule__MEnumParamStringLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5295:1: ( ( ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )? ) )
            // InternalOSSWI.g:5296:1: ( ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )? )
            {
            // InternalOSSWI.g:5296:1: ( ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )? )
            // InternalOSSWI.g:5297:1: ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawAssignment_3()); 
            }
            // InternalOSSWI.g:5298:1: ( rule__MEnumParamStringLiteral__IsRawAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOSSWI.g:5298:2: rule__MEnumParamStringLiteral__IsRawAssignment_3
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
    // InternalOSSWI.g:5308:1: rule__MEnumParamStringLiteral__Group__4 : rule__MEnumParamStringLiteral__Group__4__Impl ;
    public final void rule__MEnumParamStringLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5312:1: ( rule__MEnumParamStringLiteral__Group__4__Impl )
            // InternalOSSWI.g:5313:2: rule__MEnumParamStringLiteral__Group__4__Impl
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
    // InternalOSSWI.g:5319:1: rule__MEnumParamStringLiteral__Group__4__Impl : ( ( rule__MEnumParamStringLiteral__ValueAssignment_4 ) ) ;
    public final void rule__MEnumParamStringLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5323:1: ( ( ( rule__MEnumParamStringLiteral__ValueAssignment_4 ) ) )
            // InternalOSSWI.g:5324:1: ( ( rule__MEnumParamStringLiteral__ValueAssignment_4 ) )
            {
            // InternalOSSWI.g:5324:1: ( ( rule__MEnumParamStringLiteral__ValueAssignment_4 ) )
            // InternalOSSWI.g:5325:1: ( rule__MEnumParamStringLiteral__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getValueAssignment_4()); 
            }
            // InternalOSSWI.g:5326:1: ( rule__MEnumParamStringLiteral__ValueAssignment_4 )
            // InternalOSSWI.g:5326:2: rule__MEnumParamStringLiteral__ValueAssignment_4
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
    // InternalOSSWI.g:5346:1: rule__MBooleanParameterSingleExpression__Group__0 : rule__MBooleanParameterSingleExpression__Group__0__Impl rule__MBooleanParameterSingleExpression__Group__1 ;
    public final void rule__MBooleanParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5350:1: ( rule__MBooleanParameterSingleExpression__Group__0__Impl rule__MBooleanParameterSingleExpression__Group__1 )
            // InternalOSSWI.g:5351:2: rule__MBooleanParameterSingleExpression__Group__0__Impl rule__MBooleanParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalOSSWI.g:5358:1: rule__MBooleanParameterSingleExpression__Group__0__Impl : ( 'boolean' ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5362:1: ( ( 'boolean' ) )
            // InternalOSSWI.g:5363:1: ( 'boolean' )
            {
            // InternalOSSWI.g:5363:1: ( 'boolean' )
            // InternalOSSWI.g:5364:1: 'boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_0()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:5377:1: rule__MBooleanParameterSingleExpression__Group__1 : rule__MBooleanParameterSingleExpression__Group__1__Impl rule__MBooleanParameterSingleExpression__Group__2 ;
    public final void rule__MBooleanParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5381:1: ( rule__MBooleanParameterSingleExpression__Group__1__Impl rule__MBooleanParameterSingleExpression__Group__2 )
            // InternalOSSWI.g:5382:2: rule__MBooleanParameterSingleExpression__Group__1__Impl rule__MBooleanParameterSingleExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalOSSWI.g:5389:1: rule__MBooleanParameterSingleExpression__Group__1__Impl : ( ( rule__MBooleanParameterSingleExpression__NameAssignment_1 ) ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5393:1: ( ( ( rule__MBooleanParameterSingleExpression__NameAssignment_1 ) ) )
            // InternalOSSWI.g:5394:1: ( ( rule__MBooleanParameterSingleExpression__NameAssignment_1 ) )
            {
            // InternalOSSWI.g:5394:1: ( ( rule__MBooleanParameterSingleExpression__NameAssignment_1 ) )
            // InternalOSSWI.g:5395:1: ( rule__MBooleanParameterSingleExpression__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_1()); 
            }
            // InternalOSSWI.g:5396:1: ( rule__MBooleanParameterSingleExpression__NameAssignment_1 )
            // InternalOSSWI.g:5396:2: rule__MBooleanParameterSingleExpression__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:5406:1: rule__MBooleanParameterSingleExpression__Group__2 : rule__MBooleanParameterSingleExpression__Group__2__Impl rule__MBooleanParameterSingleExpression__Group__3 ;
    public final void rule__MBooleanParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5410:1: ( rule__MBooleanParameterSingleExpression__Group__2__Impl rule__MBooleanParameterSingleExpression__Group__3 )
            // InternalOSSWI.g:5411:2: rule__MBooleanParameterSingleExpression__Group__2__Impl rule__MBooleanParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:5418:1: rule__MBooleanParameterSingleExpression__Group__2__Impl : ( ':=' ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5422:1: ( ( ':=' ) )
            // InternalOSSWI.g:5423:1: ( ':=' )
            {
            // InternalOSSWI.g:5423:1: ( ':=' )
            // InternalOSSWI.g:5424:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:5437:1: rule__MBooleanParameterSingleExpression__Group__3 : rule__MBooleanParameterSingleExpression__Group__3__Impl rule__MBooleanParameterSingleExpression__Group__4 ;
    public final void rule__MBooleanParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5441:1: ( rule__MBooleanParameterSingleExpression__Group__3__Impl rule__MBooleanParameterSingleExpression__Group__4 )
            // InternalOSSWI.g:5442:2: rule__MBooleanParameterSingleExpression__Group__3__Impl rule__MBooleanParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalOSSWI.g:5449:1: rule__MBooleanParameterSingleExpression__Group__3__Impl : ( ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3 ) ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5453:1: ( ( ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3 ) ) )
            // InternalOSSWI.g:5454:1: ( ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3 ) )
            {
            // InternalOSSWI.g:5454:1: ( ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3 ) )
            // InternalOSSWI.g:5455:1: ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_3()); 
            }
            // InternalOSSWI.g:5456:1: ( rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3 )
            // InternalOSSWI.g:5456:2: rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_3()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:5466:1: rule__MBooleanParameterSingleExpression__Group__4 : rule__MBooleanParameterSingleExpression__Group__4__Impl ;
    public final void rule__MBooleanParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5470:1: ( rule__MBooleanParameterSingleExpression__Group__4__Impl )
            // InternalOSSWI.g:5471:2: rule__MBooleanParameterSingleExpression__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MBooleanParameterSingleExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOSSWI.g:5477:1: rule__MBooleanParameterSingleExpression__Group__4__Impl : ( ';' ) ;
    public final void rule__MBooleanParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5481:1: ( ( ';' ) )
            // InternalOSSWI.g:5482:1: ( ';' )
            {
            // InternalOSSWI.g:5482:1: ( ';' )
            // InternalOSSWI.g:5483:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MStringParameterSingleExpression__Group__0"
    // InternalOSSWI.g:5506:1: rule__MStringParameterSingleExpression__Group__0 : rule__MStringParameterSingleExpression__Group__0__Impl rule__MStringParameterSingleExpression__Group__1 ;
    public final void rule__MStringParameterSingleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5510:1: ( rule__MStringParameterSingleExpression__Group__0__Impl rule__MStringParameterSingleExpression__Group__1 )
            // InternalOSSWI.g:5511:2: rule__MStringParameterSingleExpression__Group__0__Impl rule__MStringParameterSingleExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalOSSWI.g:5518:1: rule__MStringParameterSingleExpression__Group__0__Impl : ( 'string' ) ;
    public final void rule__MStringParameterSingleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5522:1: ( ( 'string' ) )
            // InternalOSSWI.g:5523:1: ( 'string' )
            {
            // InternalOSSWI.g:5523:1: ( 'string' )
            // InternalOSSWI.g:5524:1: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_0()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:5537:1: rule__MStringParameterSingleExpression__Group__1 : rule__MStringParameterSingleExpression__Group__1__Impl rule__MStringParameterSingleExpression__Group__2 ;
    public final void rule__MStringParameterSingleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5541:1: ( rule__MStringParameterSingleExpression__Group__1__Impl rule__MStringParameterSingleExpression__Group__2 )
            // InternalOSSWI.g:5542:2: rule__MStringParameterSingleExpression__Group__1__Impl rule__MStringParameterSingleExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalOSSWI.g:5549:1: rule__MStringParameterSingleExpression__Group__1__Impl : ( ( rule__MStringParameterSingleExpression__NameAssignment_1 ) ) ;
    public final void rule__MStringParameterSingleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5553:1: ( ( ( rule__MStringParameterSingleExpression__NameAssignment_1 ) ) )
            // InternalOSSWI.g:5554:1: ( ( rule__MStringParameterSingleExpression__NameAssignment_1 ) )
            {
            // InternalOSSWI.g:5554:1: ( ( rule__MStringParameterSingleExpression__NameAssignment_1 ) )
            // InternalOSSWI.g:5555:1: ( rule__MStringParameterSingleExpression__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_1()); 
            }
            // InternalOSSWI.g:5556:1: ( rule__MStringParameterSingleExpression__NameAssignment_1 )
            // InternalOSSWI.g:5556:2: rule__MStringParameterSingleExpression__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:5566:1: rule__MStringParameterSingleExpression__Group__2 : rule__MStringParameterSingleExpression__Group__2__Impl rule__MStringParameterSingleExpression__Group__3 ;
    public final void rule__MStringParameterSingleExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5570:1: ( rule__MStringParameterSingleExpression__Group__2__Impl rule__MStringParameterSingleExpression__Group__3 )
            // InternalOSSWI.g:5571:2: rule__MStringParameterSingleExpression__Group__2__Impl rule__MStringParameterSingleExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:5578:1: rule__MStringParameterSingleExpression__Group__2__Impl : ( ':=' ) ;
    public final void rule__MStringParameterSingleExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5582:1: ( ( ':=' ) )
            // InternalOSSWI.g:5583:1: ( ':=' )
            {
            // InternalOSSWI.g:5583:1: ( ':=' )
            // InternalOSSWI.g:5584:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:5597:1: rule__MStringParameterSingleExpression__Group__3 : rule__MStringParameterSingleExpression__Group__3__Impl rule__MStringParameterSingleExpression__Group__4 ;
    public final void rule__MStringParameterSingleExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5601:1: ( rule__MStringParameterSingleExpression__Group__3__Impl rule__MStringParameterSingleExpression__Group__4 )
            // InternalOSSWI.g:5602:2: rule__MStringParameterSingleExpression__Group__3__Impl rule__MStringParameterSingleExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalOSSWI.g:5609:1: rule__MStringParameterSingleExpression__Group__3__Impl : ( ( rule__MStringParameterSingleExpression__DefaultValueAssignment_3 ) ) ;
    public final void rule__MStringParameterSingleExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5613:1: ( ( ( rule__MStringParameterSingleExpression__DefaultValueAssignment_3 ) ) )
            // InternalOSSWI.g:5614:1: ( ( rule__MStringParameterSingleExpression__DefaultValueAssignment_3 ) )
            {
            // InternalOSSWI.g:5614:1: ( ( rule__MStringParameterSingleExpression__DefaultValueAssignment_3 ) )
            // InternalOSSWI.g:5615:1: ( rule__MStringParameterSingleExpression__DefaultValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_3()); 
            }
            // InternalOSSWI.g:5616:1: ( rule__MStringParameterSingleExpression__DefaultValueAssignment_3 )
            // InternalOSSWI.g:5616:2: rule__MStringParameterSingleExpression__DefaultValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__DefaultValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_3()); 
            }

            }


            }

        }
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
    // InternalOSSWI.g:5626:1: rule__MStringParameterSingleExpression__Group__4 : rule__MStringParameterSingleExpression__Group__4__Impl ;
    public final void rule__MStringParameterSingleExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5630:1: ( rule__MStringParameterSingleExpression__Group__4__Impl )
            // InternalOSSWI.g:5631:2: rule__MStringParameterSingleExpression__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MStringParameterSingleExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOSSWI.g:5637:1: rule__MStringParameterSingleExpression__Group__4__Impl : ( ';' ) ;
    public final void rule__MStringParameterSingleExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5641:1: ( ( ';' ) )
            // InternalOSSWI.g:5642:1: ( ';' )
            {
            // InternalOSSWI.g:5642:1: ( ';' )
            // InternalOSSWI.g:5643:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__INTEGER__Group_0__0"
    // InternalOSSWI.g:5666:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5670:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalOSSWI.g:5671:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
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
    // InternalOSSWI.g:5678:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5682:1: ( ( ( '-' )? ) )
            // InternalOSSWI.g:5683:1: ( ( '-' )? )
            {
            // InternalOSSWI.g:5683:1: ( ( '-' )? )
            // InternalOSSWI.g:5684:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalOSSWI.g:5685:1: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOSSWI.g:5686:2: '-'
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
    // InternalOSSWI.g:5697:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5701:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalOSSWI.g:5702:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalOSSWI.g:5708:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5712:1: ( ( RULE_INT ) )
            // InternalOSSWI.g:5713:1: ( RULE_INT )
            {
            // InternalOSSWI.g:5713:1: ( RULE_INT )
            // InternalOSSWI.g:5714:1: RULE_INT
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
    // InternalOSSWI.g:5729:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5733:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalOSSWI.g:5734:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalOSSWI.g:5741:1: rule__REAL__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5745:1: ( ( ( '-' )? ) )
            // InternalOSSWI.g:5746:1: ( ( '-' )? )
            {
            // InternalOSSWI.g:5746:1: ( ( '-' )? )
            // InternalOSSWI.g:5747:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalOSSWI.g:5748:1: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==15) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOSSWI.g:5749:2: '-'
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
    // InternalOSSWI.g:5760:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5764:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalOSSWI.g:5765:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
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
    // InternalOSSWI.g:5772:1: rule__REAL__Group__1__Impl : ( ( rule__REAL__Group_1__0 ) ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5776:1: ( ( ( rule__REAL__Group_1__0 ) ) )
            // InternalOSSWI.g:5777:1: ( ( rule__REAL__Group_1__0 ) )
            {
            // InternalOSSWI.g:5777:1: ( ( rule__REAL__Group_1__0 ) )
            // InternalOSSWI.g:5778:1: ( rule__REAL__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup_1()); 
            }
            // InternalOSSWI.g:5779:1: ( rule__REAL__Group_1__0 )
            // InternalOSSWI.g:5779:2: rule__REAL__Group_1__0
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
    // InternalOSSWI.g:5789:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5793:1: ( rule__REAL__Group__2__Impl )
            // InternalOSSWI.g:5794:2: rule__REAL__Group__2__Impl
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
    // InternalOSSWI.g:5800:1: rule__REAL__Group__2__Impl : ( ( rule__REAL__Group_2__0 )? ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5804:1: ( ( ( rule__REAL__Group_2__0 )? ) )
            // InternalOSSWI.g:5805:1: ( ( rule__REAL__Group_2__0 )? )
            {
            // InternalOSSWI.g:5805:1: ( ( rule__REAL__Group_2__0 )? )
            // InternalOSSWI.g:5806:1: ( rule__REAL__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup_2()); 
            }
            // InternalOSSWI.g:5807:1: ( rule__REAL__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOSSWI.g:5807:2: rule__REAL__Group_2__0
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
    // InternalOSSWI.g:5823:1: rule__REAL__Group_1__0 : rule__REAL__Group_1__0__Impl rule__REAL__Group_1__1 ;
    public final void rule__REAL__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5827:1: ( rule__REAL__Group_1__0__Impl rule__REAL__Group_1__1 )
            // InternalOSSWI.g:5828:2: rule__REAL__Group_1__0__Impl rule__REAL__Group_1__1
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
    // InternalOSSWI.g:5835:1: rule__REAL__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5839:1: ( ( RULE_INT ) )
            // InternalOSSWI.g:5840:1: ( RULE_INT )
            {
            // InternalOSSWI.g:5840:1: ( RULE_INT )
            // InternalOSSWI.g:5841:1: RULE_INT
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
    // InternalOSSWI.g:5852:1: rule__REAL__Group_1__1 : rule__REAL__Group_1__1__Impl rule__REAL__Group_1__2 ;
    public final void rule__REAL__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5856:1: ( rule__REAL__Group_1__1__Impl rule__REAL__Group_1__2 )
            // InternalOSSWI.g:5857:2: rule__REAL__Group_1__1__Impl rule__REAL__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalOSSWI.g:5864:1: rule__REAL__Group_1__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5868:1: ( ( '.' ) )
            // InternalOSSWI.g:5869:1: ( '.' )
            {
            // InternalOSSWI.g:5869:1: ( '.' )
            // InternalOSSWI.g:5870:1: '.'
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
    // InternalOSSWI.g:5883:1: rule__REAL__Group_1__2 : rule__REAL__Group_1__2__Impl ;
    public final void rule__REAL__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5887:1: ( rule__REAL__Group_1__2__Impl )
            // InternalOSSWI.g:5888:2: rule__REAL__Group_1__2__Impl
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
    // InternalOSSWI.g:5894:1: rule__REAL__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5898:1: ( ( RULE_INT ) )
            // InternalOSSWI.g:5899:1: ( RULE_INT )
            {
            // InternalOSSWI.g:5899:1: ( RULE_INT )
            // InternalOSSWI.g:5900:1: RULE_INT
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
    // InternalOSSWI.g:5917:1: rule__REAL__Group_2__0 : rule__REAL__Group_2__0__Impl rule__REAL__Group_2__1 ;
    public final void rule__REAL__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5921:1: ( rule__REAL__Group_2__0__Impl rule__REAL__Group_2__1 )
            // InternalOSSWI.g:5922:2: rule__REAL__Group_2__0__Impl rule__REAL__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
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
    // InternalOSSWI.g:5929:1: rule__REAL__Group_2__0__Impl : ( 'e' ) ;
    public final void rule__REAL__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5933:1: ( ( 'e' ) )
            // InternalOSSWI.g:5934:1: ( 'e' )
            {
            // InternalOSSWI.g:5934:1: ( 'e' )
            // InternalOSSWI.g:5935:1: 'e'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getEKeyword_2_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:5948:1: rule__REAL__Group_2__1 : rule__REAL__Group_2__1__Impl rule__REAL__Group_2__2 ;
    public final void rule__REAL__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5952:1: ( rule__REAL__Group_2__1__Impl rule__REAL__Group_2__2 )
            // InternalOSSWI.g:5953:2: rule__REAL__Group_2__1__Impl rule__REAL__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_38);
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
    // InternalOSSWI.g:5960:1: rule__REAL__Group_2__1__Impl : ( ( '-' )? ) ;
    public final void rule__REAL__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5964:1: ( ( ( '-' )? ) )
            // InternalOSSWI.g:5965:1: ( ( '-' )? )
            {
            // InternalOSSWI.g:5965:1: ( ( '-' )? )
            // InternalOSSWI.g:5966:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); 
            }
            // InternalOSSWI.g:5967:1: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOSSWI.g:5968:2: '-'
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
    // InternalOSSWI.g:5979:1: rule__REAL__Group_2__2 : rule__REAL__Group_2__2__Impl ;
    public final void rule__REAL__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5983:1: ( rule__REAL__Group_2__2__Impl )
            // InternalOSSWI.g:5984:2: rule__REAL__Group_2__2__Impl
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
    // InternalOSSWI.g:5990:1: rule__REAL__Group_2__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:5994:1: ( ( RULE_INT ) )
            // InternalOSSWI.g:5995:1: ( RULE_INT )
            {
            // InternalOSSWI.g:5995:1: ( RULE_INT )
            // InternalOSSWI.g:5996:1: RULE_INT
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
    // InternalOSSWI.g:6013:1: rule__MParameterValueBooleanLiteral__Group__0 : rule__MParameterValueBooleanLiteral__Group__0__Impl rule__MParameterValueBooleanLiteral__Group__1 ;
    public final void rule__MParameterValueBooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6017:1: ( rule__MParameterValueBooleanLiteral__Group__0__Impl rule__MParameterValueBooleanLiteral__Group__1 )
            // InternalOSSWI.g:6018:2: rule__MParameterValueBooleanLiteral__Group__0__Impl rule__MParameterValueBooleanLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalOSSWI.g:6025:1: rule__MParameterValueBooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueBooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6029:1: ( ( () ) )
            // InternalOSSWI.g:6030:1: ( () )
            {
            // InternalOSSWI.g:6030:1: ( () )
            // InternalOSSWI.g:6031:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0()); 
            }
            // InternalOSSWI.g:6032:1: ()
            // InternalOSSWI.g:6034:1: 
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
    // InternalOSSWI.g:6044:1: rule__MParameterValueBooleanLiteral__Group__1 : rule__MParameterValueBooleanLiteral__Group__1__Impl ;
    public final void rule__MParameterValueBooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6048:1: ( rule__MParameterValueBooleanLiteral__Group__1__Impl )
            // InternalOSSWI.g:6049:2: rule__MParameterValueBooleanLiteral__Group__1__Impl
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
    // InternalOSSWI.g:6055:1: rule__MParameterValueBooleanLiteral__Group__1__Impl : ( ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MParameterValueBooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6059:1: ( ( ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 ) ) )
            // InternalOSSWI.g:6060:1: ( ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 ) )
            {
            // InternalOSSWI.g:6060:1: ( ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 ) )
            // InternalOSSWI.g:6061:1: ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueAssignment_1()); 
            }
            // InternalOSSWI.g:6062:1: ( rule__MParameterValueBooleanLiteral__ValueAssignment_1 )
            // InternalOSSWI.g:6062:2: rule__MParameterValueBooleanLiteral__ValueAssignment_1
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
    // InternalOSSWI.g:6076:1: rule__MParameterValueStringLiteral__Group__0 : rule__MParameterValueStringLiteral__Group__0__Impl rule__MParameterValueStringLiteral__Group__1 ;
    public final void rule__MParameterValueStringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6080:1: ( rule__MParameterValueStringLiteral__Group__0__Impl rule__MParameterValueStringLiteral__Group__1 )
            // InternalOSSWI.g:6081:2: rule__MParameterValueStringLiteral__Group__0__Impl rule__MParameterValueStringLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
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
    // InternalOSSWI.g:6088:1: rule__MParameterValueStringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueStringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6092:1: ( ( () ) )
            // InternalOSSWI.g:6093:1: ( () )
            {
            // InternalOSSWI.g:6093:1: ( () )
            // InternalOSSWI.g:6094:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0()); 
            }
            // InternalOSSWI.g:6095:1: ()
            // InternalOSSWI.g:6097:1: 
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
    // InternalOSSWI.g:6107:1: rule__MParameterValueStringLiteral__Group__1 : rule__MParameterValueStringLiteral__Group__1__Impl rule__MParameterValueStringLiteral__Group__2 ;
    public final void rule__MParameterValueStringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6111:1: ( rule__MParameterValueStringLiteral__Group__1__Impl rule__MParameterValueStringLiteral__Group__2 )
            // InternalOSSWI.g:6112:2: rule__MParameterValueStringLiteral__Group__1__Impl rule__MParameterValueStringLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_37);
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
    // InternalOSSWI.g:6119:1: rule__MParameterValueStringLiteral__Group__1__Impl : ( ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )? ) ;
    public final void rule__MParameterValueStringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6123:1: ( ( ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )? ) )
            // InternalOSSWI.g:6124:1: ( ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )? )
            {
            // InternalOSSWI.g:6124:1: ( ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )? )
            // InternalOSSWI.g:6125:1: ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawAssignment_1()); 
            }
            // InternalOSSWI.g:6126:1: ( rule__MParameterValueStringLiteral__IsRawAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOSSWI.g:6126:2: rule__MParameterValueStringLiteral__IsRawAssignment_1
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
    // InternalOSSWI.g:6136:1: rule__MParameterValueStringLiteral__Group__2 : rule__MParameterValueStringLiteral__Group__2__Impl ;
    public final void rule__MParameterValueStringLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6140:1: ( rule__MParameterValueStringLiteral__Group__2__Impl )
            // InternalOSSWI.g:6141:2: rule__MParameterValueStringLiteral__Group__2__Impl
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
    // InternalOSSWI.g:6147:1: rule__MParameterValueStringLiteral__Group__2__Impl : ( ( rule__MParameterValueStringLiteral__ValueAssignment_2 ) ) ;
    public final void rule__MParameterValueStringLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6151:1: ( ( ( rule__MParameterValueStringLiteral__ValueAssignment_2 ) ) )
            // InternalOSSWI.g:6152:1: ( ( rule__MParameterValueStringLiteral__ValueAssignment_2 ) )
            {
            // InternalOSSWI.g:6152:1: ( ( rule__MParameterValueStringLiteral__ValueAssignment_2 ) )
            // InternalOSSWI.g:6153:1: ( rule__MParameterValueStringLiteral__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_2()); 
            }
            // InternalOSSWI.g:6154:1: ( rule__MParameterValueStringLiteral__ValueAssignment_2 )
            // InternalOSSWI.g:6154:2: rule__MParameterValueStringLiteral__ValueAssignment_2
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
    // InternalOSSWI.g:6170:1: rule__MParameterValueIntegerLiteral__Group__0 : rule__MParameterValueIntegerLiteral__Group__0__Impl rule__MParameterValueIntegerLiteral__Group__1 ;
    public final void rule__MParameterValueIntegerLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6174:1: ( rule__MParameterValueIntegerLiteral__Group__0__Impl rule__MParameterValueIntegerLiteral__Group__1 )
            // InternalOSSWI.g:6175:2: rule__MParameterValueIntegerLiteral__Group__0__Impl rule__MParameterValueIntegerLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalOSSWI.g:6182:1: rule__MParameterValueIntegerLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueIntegerLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6186:1: ( ( () ) )
            // InternalOSSWI.g:6187:1: ( () )
            {
            // InternalOSSWI.g:6187:1: ( () )
            // InternalOSSWI.g:6188:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0()); 
            }
            // InternalOSSWI.g:6189:1: ()
            // InternalOSSWI.g:6191:1: 
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
    // InternalOSSWI.g:6201:1: rule__MParameterValueIntegerLiteral__Group__1 : rule__MParameterValueIntegerLiteral__Group__1__Impl ;
    public final void rule__MParameterValueIntegerLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6205:1: ( rule__MParameterValueIntegerLiteral__Group__1__Impl )
            // InternalOSSWI.g:6206:2: rule__MParameterValueIntegerLiteral__Group__1__Impl
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
    // InternalOSSWI.g:6212:1: rule__MParameterValueIntegerLiteral__Group__1__Impl : ( ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MParameterValueIntegerLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6216:1: ( ( ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 ) ) )
            // InternalOSSWI.g:6217:1: ( ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 ) )
            {
            // InternalOSSWI.g:6217:1: ( ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 ) )
            // InternalOSSWI.g:6218:1: ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueAssignment_1()); 
            }
            // InternalOSSWI.g:6219:1: ( rule__MParameterValueIntegerLiteral__ValueAssignment_1 )
            // InternalOSSWI.g:6219:2: rule__MParameterValueIntegerLiteral__ValueAssignment_1
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
    // InternalOSSWI.g:6233:1: rule__MParameterValueRealLiteral__Group__0 : rule__MParameterValueRealLiteral__Group__0__Impl rule__MParameterValueRealLiteral__Group__1 ;
    public final void rule__MParameterValueRealLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6237:1: ( rule__MParameterValueRealLiteral__Group__0__Impl rule__MParameterValueRealLiteral__Group__1 )
            // InternalOSSWI.g:6238:2: rule__MParameterValueRealLiteral__Group__0__Impl rule__MParameterValueRealLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalOSSWI.g:6245:1: rule__MParameterValueRealLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueRealLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6249:1: ( ( () ) )
            // InternalOSSWI.g:6250:1: ( () )
            {
            // InternalOSSWI.g:6250:1: ( () )
            // InternalOSSWI.g:6251:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0()); 
            }
            // InternalOSSWI.g:6252:1: ()
            // InternalOSSWI.g:6254:1: 
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
    // InternalOSSWI.g:6264:1: rule__MParameterValueRealLiteral__Group__1 : rule__MParameterValueRealLiteral__Group__1__Impl ;
    public final void rule__MParameterValueRealLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6268:1: ( rule__MParameterValueRealLiteral__Group__1__Impl )
            // InternalOSSWI.g:6269:2: rule__MParameterValueRealLiteral__Group__1__Impl
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
    // InternalOSSWI.g:6275:1: rule__MParameterValueRealLiteral__Group__1__Impl : ( ( rule__MParameterValueRealLiteral__ValueAssignment_1 ) ) ;
    public final void rule__MParameterValueRealLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6279:1: ( ( ( rule__MParameterValueRealLiteral__ValueAssignment_1 ) ) )
            // InternalOSSWI.g:6280:1: ( ( rule__MParameterValueRealLiteral__ValueAssignment_1 ) )
            {
            // InternalOSSWI.g:6280:1: ( ( rule__MParameterValueRealLiteral__ValueAssignment_1 ) )
            // InternalOSSWI.g:6281:1: ( rule__MParameterValueRealLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRealLiteralAccess().getValueAssignment_1()); 
            }
            // InternalOSSWI.g:6282:1: ( rule__MParameterValueRealLiteral__ValueAssignment_1 )
            // InternalOSSWI.g:6282:2: rule__MParameterValueRealLiteral__ValueAssignment_1
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
    // InternalOSSWI.g:6296:1: rule__MParameterValueRefObject__Group__0 : rule__MParameterValueRefObject__Group__0__Impl rule__MParameterValueRefObject__Group__1 ;
    public final void rule__MParameterValueRefObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6300:1: ( rule__MParameterValueRefObject__Group__0__Impl rule__MParameterValueRefObject__Group__1 )
            // InternalOSSWI.g:6301:2: rule__MParameterValueRefObject__Group__0__Impl rule__MParameterValueRefObject__Group__1
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
    // InternalOSSWI.g:6308:1: rule__MParameterValueRefObject__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueRefObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6312:1: ( ( () ) )
            // InternalOSSWI.g:6313:1: ( () )
            {
            // InternalOSSWI.g:6313:1: ( () )
            // InternalOSSWI.g:6314:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0()); 
            }
            // InternalOSSWI.g:6315:1: ()
            // InternalOSSWI.g:6317:1: 
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
    // InternalOSSWI.g:6327:1: rule__MParameterValueRefObject__Group__1 : rule__MParameterValueRefObject__Group__1__Impl ;
    public final void rule__MParameterValueRefObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6331:1: ( rule__MParameterValueRefObject__Group__1__Impl )
            // InternalOSSWI.g:6332:2: rule__MParameterValueRefObject__Group__1__Impl
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
    // InternalOSSWI.g:6338:1: rule__MParameterValueRefObject__Group__1__Impl : ( ( rule__MParameterValueRefObject__ObjectAssignment_1 ) ) ;
    public final void rule__MParameterValueRefObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6342:1: ( ( ( rule__MParameterValueRefObject__ObjectAssignment_1 ) ) )
            // InternalOSSWI.g:6343:1: ( ( rule__MParameterValueRefObject__ObjectAssignment_1 ) )
            {
            // InternalOSSWI.g:6343:1: ( ( rule__MParameterValueRefObject__ObjectAssignment_1 ) )
            // InternalOSSWI.g:6344:1: ( rule__MParameterValueRefObject__ObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectAccess().getObjectAssignment_1()); 
            }
            // InternalOSSWI.g:6345:1: ( rule__MParameterValueRefObject__ObjectAssignment_1 )
            // InternalOSSWI.g:6345:2: rule__MParameterValueRefObject__ObjectAssignment_1
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
    // InternalOSSWI.g:6359:1: rule__MParameterValuePAR__Group__0 : rule__MParameterValuePAR__Group__0__Impl rule__MParameterValuePAR__Group__1 ;
    public final void rule__MParameterValuePAR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6363:1: ( rule__MParameterValuePAR__Group__0__Impl rule__MParameterValuePAR__Group__1 )
            // InternalOSSWI.g:6364:2: rule__MParameterValuePAR__Group__0__Impl rule__MParameterValuePAR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:6371:1: rule__MParameterValuePAR__Group__0__Impl : ( '(' ) ;
    public final void rule__MParameterValuePAR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6375:1: ( ( '(' ) )
            // InternalOSSWI.g:6376:1: ( '(' )
            {
            // InternalOSSWI.g:6376:1: ( '(' )
            // InternalOSSWI.g:6377:1: '('
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
    // InternalOSSWI.g:6390:1: rule__MParameterValuePAR__Group__1 : rule__MParameterValuePAR__Group__1__Impl rule__MParameterValuePAR__Group__2 ;
    public final void rule__MParameterValuePAR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6394:1: ( rule__MParameterValuePAR__Group__1__Impl rule__MParameterValuePAR__Group__2 )
            // InternalOSSWI.g:6395:2: rule__MParameterValuePAR__Group__1__Impl rule__MParameterValuePAR__Group__2
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
    // InternalOSSWI.g:6402:1: rule__MParameterValuePAR__Group__1__Impl : ( ( rule__MParameterValuePAR__ValueAssignment_1 ) ) ;
    public final void rule__MParameterValuePAR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6406:1: ( ( ( rule__MParameterValuePAR__ValueAssignment_1 ) ) )
            // InternalOSSWI.g:6407:1: ( ( rule__MParameterValuePAR__ValueAssignment_1 ) )
            {
            // InternalOSSWI.g:6407:1: ( ( rule__MParameterValuePAR__ValueAssignment_1 ) )
            // InternalOSSWI.g:6408:1: ( rule__MParameterValuePAR__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValuePARAccess().getValueAssignment_1()); 
            }
            // InternalOSSWI.g:6409:1: ( rule__MParameterValuePAR__ValueAssignment_1 )
            // InternalOSSWI.g:6409:2: rule__MParameterValuePAR__ValueAssignment_1
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
    // InternalOSSWI.g:6419:1: rule__MParameterValuePAR__Group__2 : rule__MParameterValuePAR__Group__2__Impl ;
    public final void rule__MParameterValuePAR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6423:1: ( rule__MParameterValuePAR__Group__2__Impl )
            // InternalOSSWI.g:6424:2: rule__MParameterValuePAR__Group__2__Impl
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
    // InternalOSSWI.g:6430:1: rule__MParameterValuePAR__Group__2__Impl : ( ')' ) ;
    public final void rule__MParameterValuePAR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6434:1: ( ( ')' ) )
            // InternalOSSWI.g:6435:1: ( ')' )
            {
            // InternalOSSWI.g:6435:1: ( ')' )
            // InternalOSSWI.g:6436:1: ')'
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
    // InternalOSSWI.g:6455:1: rule__MParameterValueExpression__Group__0 : rule__MParameterValueExpression__Group__0__Impl rule__MParameterValueExpression__Group__1 ;
    public final void rule__MParameterValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6459:1: ( rule__MParameterValueExpression__Group__0__Impl rule__MParameterValueExpression__Group__1 )
            // InternalOSSWI.g:6460:2: rule__MParameterValueExpression__Group__0__Impl rule__MParameterValueExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:6467:1: rule__MParameterValueExpression__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6471:1: ( ( () ) )
            // InternalOSSWI.g:6472:1: ( () )
            {
            // InternalOSSWI.g:6472:1: ( () )
            // InternalOSSWI.g:6473:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0()); 
            }
            // InternalOSSWI.g:6474:1: ()
            // InternalOSSWI.g:6476:1: 
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
    // InternalOSSWI.g:6486:1: rule__MParameterValueExpression__Group__1 : rule__MParameterValueExpression__Group__1__Impl rule__MParameterValueExpression__Group__2 ;
    public final void rule__MParameterValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6490:1: ( rule__MParameterValueExpression__Group__1__Impl rule__MParameterValueExpression__Group__2 )
            // InternalOSSWI.g:6491:2: rule__MParameterValueExpression__Group__1__Impl rule__MParameterValueExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalOSSWI.g:6498:1: rule__MParameterValueExpression__Group__1__Impl : ( ( rule__MParameterValueExpression__LeftAssignment_1 ) ) ;
    public final void rule__MParameterValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6502:1: ( ( ( rule__MParameterValueExpression__LeftAssignment_1 ) ) )
            // InternalOSSWI.g:6503:1: ( ( rule__MParameterValueExpression__LeftAssignment_1 ) )
            {
            // InternalOSSWI.g:6503:1: ( ( rule__MParameterValueExpression__LeftAssignment_1 ) )
            // InternalOSSWI.g:6504:1: ( rule__MParameterValueExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalOSSWI.g:6505:1: ( rule__MParameterValueExpression__LeftAssignment_1 )
            // InternalOSSWI.g:6505:2: rule__MParameterValueExpression__LeftAssignment_1
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
    // InternalOSSWI.g:6515:1: rule__MParameterValueExpression__Group__2 : rule__MParameterValueExpression__Group__2__Impl ;
    public final void rule__MParameterValueExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6519:1: ( rule__MParameterValueExpression__Group__2__Impl )
            // InternalOSSWI.g:6520:2: rule__MParameterValueExpression__Group__2__Impl
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
    // InternalOSSWI.g:6526:1: rule__MParameterValueExpression__Group__2__Impl : ( ( rule__MParameterValueExpression__Group_2__0 )? ) ;
    public final void rule__MParameterValueExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6530:1: ( ( ( rule__MParameterValueExpression__Group_2__0 )? ) )
            // InternalOSSWI.g:6531:1: ( ( rule__MParameterValueExpression__Group_2__0 )? )
            {
            // InternalOSSWI.g:6531:1: ( ( rule__MParameterValueExpression__Group_2__0 )? )
            // InternalOSSWI.g:6532:1: ( rule__MParameterValueExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getGroup_2()); 
            }
            // InternalOSSWI.g:6533:1: ( rule__MParameterValueExpression__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=14 && LA33_0<=15)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOSSWI.g:6533:2: rule__MParameterValueExpression__Group_2__0
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
    // InternalOSSWI.g:6549:1: rule__MParameterValueExpression__Group_2__0 : rule__MParameterValueExpression__Group_2__0__Impl rule__MParameterValueExpression__Group_2__1 ;
    public final void rule__MParameterValueExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6553:1: ( rule__MParameterValueExpression__Group_2__0__Impl rule__MParameterValueExpression__Group_2__1 )
            // InternalOSSWI.g:6554:2: rule__MParameterValueExpression__Group_2__0__Impl rule__MParameterValueExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:6561:1: rule__MParameterValueExpression__Group_2__0__Impl : ( ( rule__MParameterValueExpression__OperationAssignment_2_0 ) ) ;
    public final void rule__MParameterValueExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6565:1: ( ( ( rule__MParameterValueExpression__OperationAssignment_2_0 ) ) )
            // InternalOSSWI.g:6566:1: ( ( rule__MParameterValueExpression__OperationAssignment_2_0 ) )
            {
            // InternalOSSWI.g:6566:1: ( ( rule__MParameterValueExpression__OperationAssignment_2_0 ) )
            // InternalOSSWI.g:6567:1: ( rule__MParameterValueExpression__OperationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getOperationAssignment_2_0()); 
            }
            // InternalOSSWI.g:6568:1: ( rule__MParameterValueExpression__OperationAssignment_2_0 )
            // InternalOSSWI.g:6568:2: rule__MParameterValueExpression__OperationAssignment_2_0
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
    // InternalOSSWI.g:6578:1: rule__MParameterValueExpression__Group_2__1 : rule__MParameterValueExpression__Group_2__1__Impl ;
    public final void rule__MParameterValueExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6582:1: ( rule__MParameterValueExpression__Group_2__1__Impl )
            // InternalOSSWI.g:6583:2: rule__MParameterValueExpression__Group_2__1__Impl
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
    // InternalOSSWI.g:6589:1: rule__MParameterValueExpression__Group_2__1__Impl : ( ( rule__MParameterValueExpression__RightAssignment_2_1 ) ) ;
    public final void rule__MParameterValueExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6593:1: ( ( ( rule__MParameterValueExpression__RightAssignment_2_1 ) ) )
            // InternalOSSWI.g:6594:1: ( ( rule__MParameterValueExpression__RightAssignment_2_1 ) )
            {
            // InternalOSSWI.g:6594:1: ( ( rule__MParameterValueExpression__RightAssignment_2_1 ) )
            // InternalOSSWI.g:6595:1: ( rule__MParameterValueExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueExpressionAccess().getRightAssignment_2_1()); 
            }
            // InternalOSSWI.g:6596:1: ( rule__MParameterValueExpression__RightAssignment_2_1 )
            // InternalOSSWI.g:6596:2: rule__MParameterValueExpression__RightAssignment_2_1
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
    // InternalOSSWI.g:6610:1: rule__MParameterValueTERM__Group__0 : rule__MParameterValueTERM__Group__0__Impl rule__MParameterValueTERM__Group__1 ;
    public final void rule__MParameterValueTERM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6614:1: ( rule__MParameterValueTERM__Group__0__Impl rule__MParameterValueTERM__Group__1 )
            // InternalOSSWI.g:6615:2: rule__MParameterValueTERM__Group__0__Impl rule__MParameterValueTERM__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:6622:1: rule__MParameterValueTERM__Group__0__Impl : ( () ) ;
    public final void rule__MParameterValueTERM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6626:1: ( ( () ) )
            // InternalOSSWI.g:6627:1: ( () )
            {
            // InternalOSSWI.g:6627:1: ( () )
            // InternalOSSWI.g:6628:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0()); 
            }
            // InternalOSSWI.g:6629:1: ()
            // InternalOSSWI.g:6631:1: 
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
    // InternalOSSWI.g:6641:1: rule__MParameterValueTERM__Group__1 : rule__MParameterValueTERM__Group__1__Impl rule__MParameterValueTERM__Group__2 ;
    public final void rule__MParameterValueTERM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6645:1: ( rule__MParameterValueTERM__Group__1__Impl rule__MParameterValueTERM__Group__2 )
            // InternalOSSWI.g:6646:2: rule__MParameterValueTERM__Group__1__Impl rule__MParameterValueTERM__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalOSSWI.g:6653:1: rule__MParameterValueTERM__Group__1__Impl : ( ( rule__MParameterValueTERM__LeftAssignment_1 ) ) ;
    public final void rule__MParameterValueTERM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6657:1: ( ( ( rule__MParameterValueTERM__LeftAssignment_1 ) ) )
            // InternalOSSWI.g:6658:1: ( ( rule__MParameterValueTERM__LeftAssignment_1 ) )
            {
            // InternalOSSWI.g:6658:1: ( ( rule__MParameterValueTERM__LeftAssignment_1 ) )
            // InternalOSSWI.g:6659:1: ( rule__MParameterValueTERM__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getLeftAssignment_1()); 
            }
            // InternalOSSWI.g:6660:1: ( rule__MParameterValueTERM__LeftAssignment_1 )
            // InternalOSSWI.g:6660:2: rule__MParameterValueTERM__LeftAssignment_1
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
    // InternalOSSWI.g:6670:1: rule__MParameterValueTERM__Group__2 : rule__MParameterValueTERM__Group__2__Impl ;
    public final void rule__MParameterValueTERM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6674:1: ( rule__MParameterValueTERM__Group__2__Impl )
            // InternalOSSWI.g:6675:2: rule__MParameterValueTERM__Group__2__Impl
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
    // InternalOSSWI.g:6681:1: rule__MParameterValueTERM__Group__2__Impl : ( ( rule__MParameterValueTERM__Group_2__0 )? ) ;
    public final void rule__MParameterValueTERM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6685:1: ( ( ( rule__MParameterValueTERM__Group_2__0 )? ) )
            // InternalOSSWI.g:6686:1: ( ( rule__MParameterValueTERM__Group_2__0 )? )
            {
            // InternalOSSWI.g:6686:1: ( ( rule__MParameterValueTERM__Group_2__0 )? )
            // InternalOSSWI.g:6687:1: ( rule__MParameterValueTERM__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getGroup_2()); 
            }
            // InternalOSSWI.g:6688:1: ( rule__MParameterValueTERM__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=16 && LA34_0<=17)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOSSWI.g:6688:2: rule__MParameterValueTERM__Group_2__0
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
    // InternalOSSWI.g:6704:1: rule__MParameterValueTERM__Group_2__0 : rule__MParameterValueTERM__Group_2__0__Impl rule__MParameterValueTERM__Group_2__1 ;
    public final void rule__MParameterValueTERM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6708:1: ( rule__MParameterValueTERM__Group_2__0__Impl rule__MParameterValueTERM__Group_2__1 )
            // InternalOSSWI.g:6709:2: rule__MParameterValueTERM__Group_2__0__Impl rule__MParameterValueTERM__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:6716:1: rule__MParameterValueTERM__Group_2__0__Impl : ( ( rule__MParameterValueTERM__OperationAssignment_2_0 ) ) ;
    public final void rule__MParameterValueTERM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6720:1: ( ( ( rule__MParameterValueTERM__OperationAssignment_2_0 ) ) )
            // InternalOSSWI.g:6721:1: ( ( rule__MParameterValueTERM__OperationAssignment_2_0 ) )
            {
            // InternalOSSWI.g:6721:1: ( ( rule__MParameterValueTERM__OperationAssignment_2_0 ) )
            // InternalOSSWI.g:6722:1: ( rule__MParameterValueTERM__OperationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getOperationAssignment_2_0()); 
            }
            // InternalOSSWI.g:6723:1: ( rule__MParameterValueTERM__OperationAssignment_2_0 )
            // InternalOSSWI.g:6723:2: rule__MParameterValueTERM__OperationAssignment_2_0
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
    // InternalOSSWI.g:6733:1: rule__MParameterValueTERM__Group_2__1 : rule__MParameterValueTERM__Group_2__1__Impl ;
    public final void rule__MParameterValueTERM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6737:1: ( rule__MParameterValueTERM__Group_2__1__Impl )
            // InternalOSSWI.g:6738:2: rule__MParameterValueTERM__Group_2__1__Impl
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
    // InternalOSSWI.g:6744:1: rule__MParameterValueTERM__Group_2__1__Impl : ( ( rule__MParameterValueTERM__RightAssignment_2_1 ) ) ;
    public final void rule__MParameterValueTERM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6748:1: ( ( ( rule__MParameterValueTERM__RightAssignment_2_1 ) ) )
            // InternalOSSWI.g:6749:1: ( ( rule__MParameterValueTERM__RightAssignment_2_1 ) )
            {
            // InternalOSSWI.g:6749:1: ( ( rule__MParameterValueTERM__RightAssignment_2_1 ) )
            // InternalOSSWI.g:6750:1: ( rule__MParameterValueTERM__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueTERMAccess().getRightAssignment_2_1()); 
            }
            // InternalOSSWI.g:6751:1: ( rule__MParameterValueTERM__RightAssignment_2_1 )
            // InternalOSSWI.g:6751:2: rule__MParameterValueTERM__RightAssignment_2_1
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
    // InternalOSSWI.g:6765:1: rule__MParameterOCR__Group__0 : rule__MParameterOCR__Group__0__Impl rule__MParameterOCR__Group__1 ;
    public final void rule__MParameterOCR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6769:1: ( rule__MParameterOCR__Group__0__Impl rule__MParameterOCR__Group__1 )
            // InternalOSSWI.g:6770:2: rule__MParameterOCR__Group__0__Impl rule__MParameterOCR__Group__1
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
    // InternalOSSWI.g:6777:1: rule__MParameterOCR__Group__0__Impl : ( () ) ;
    public final void rule__MParameterOCR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6781:1: ( ( () ) )
            // InternalOSSWI.g:6782:1: ( () )
            {
            // InternalOSSWI.g:6782:1: ( () )
            // InternalOSSWI.g:6783:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0()); 
            }
            // InternalOSSWI.g:6784:1: ()
            // InternalOSSWI.g:6786:1: 
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
    // InternalOSSWI.g:6796:1: rule__MParameterOCR__Group__1 : rule__MParameterOCR__Group__1__Impl rule__MParameterOCR__Group__2 ;
    public final void rule__MParameterOCR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6800:1: ( rule__MParameterOCR__Group__1__Impl rule__MParameterOCR__Group__2 )
            // InternalOSSWI.g:6801:2: rule__MParameterOCR__Group__1__Impl rule__MParameterOCR__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:6808:1: rule__MParameterOCR__Group__1__Impl : ( '(' ) ;
    public final void rule__MParameterOCR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6812:1: ( ( '(' ) )
            // InternalOSSWI.g:6813:1: ( '(' )
            {
            // InternalOSSWI.g:6813:1: ( '(' )
            // InternalOSSWI.g:6814:1: '('
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
    // InternalOSSWI.g:6827:1: rule__MParameterOCR__Group__2 : rule__MParameterOCR__Group__2__Impl rule__MParameterOCR__Group__3 ;
    public final void rule__MParameterOCR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6831:1: ( rule__MParameterOCR__Group__2__Impl rule__MParameterOCR__Group__3 )
            // InternalOSSWI.g:6832:2: rule__MParameterOCR__Group__2__Impl rule__MParameterOCR__Group__3
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
    // InternalOSSWI.g:6839:1: rule__MParameterOCR__Group__2__Impl : ( ( rule__MParameterOCR__LowerValueAssignment_2 ) ) ;
    public final void rule__MParameterOCR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6843:1: ( ( ( rule__MParameterOCR__LowerValueAssignment_2 ) ) )
            // InternalOSSWI.g:6844:1: ( ( rule__MParameterOCR__LowerValueAssignment_2 ) )
            {
            // InternalOSSWI.g:6844:1: ( ( rule__MParameterOCR__LowerValueAssignment_2 ) )
            // InternalOSSWI.g:6845:1: ( rule__MParameterOCR__LowerValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getLowerValueAssignment_2()); 
            }
            // InternalOSSWI.g:6846:1: ( rule__MParameterOCR__LowerValueAssignment_2 )
            // InternalOSSWI.g:6846:2: rule__MParameterOCR__LowerValueAssignment_2
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
    // InternalOSSWI.g:6856:1: rule__MParameterOCR__Group__3 : rule__MParameterOCR__Group__3__Impl rule__MParameterOCR__Group__4 ;
    public final void rule__MParameterOCR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6860:1: ( rule__MParameterOCR__Group__3__Impl rule__MParameterOCR__Group__4 )
            // InternalOSSWI.g:6861:2: rule__MParameterOCR__Group__3__Impl rule__MParameterOCR__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:6868:1: rule__MParameterOCR__Group__3__Impl : ( ',' ) ;
    public final void rule__MParameterOCR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6872:1: ( ( ',' ) )
            // InternalOSSWI.g:6873:1: ( ',' )
            {
            // InternalOSSWI.g:6873:1: ( ',' )
            // InternalOSSWI.g:6874:1: ','
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
    // InternalOSSWI.g:6887:1: rule__MParameterOCR__Group__4 : rule__MParameterOCR__Group__4__Impl rule__MParameterOCR__Group__5 ;
    public final void rule__MParameterOCR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6891:1: ( rule__MParameterOCR__Group__4__Impl rule__MParameterOCR__Group__5 )
            // InternalOSSWI.g:6892:2: rule__MParameterOCR__Group__4__Impl rule__MParameterOCR__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalOSSWI.g:6899:1: rule__MParameterOCR__Group__4__Impl : ( ( rule__MParameterOCR__UpperValueAssignment_4 ) ) ;
    public final void rule__MParameterOCR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6903:1: ( ( ( rule__MParameterOCR__UpperValueAssignment_4 ) ) )
            // InternalOSSWI.g:6904:1: ( ( rule__MParameterOCR__UpperValueAssignment_4 ) )
            {
            // InternalOSSWI.g:6904:1: ( ( rule__MParameterOCR__UpperValueAssignment_4 ) )
            // InternalOSSWI.g:6905:1: ( rule__MParameterOCR__UpperValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getUpperValueAssignment_4()); 
            }
            // InternalOSSWI.g:6906:1: ( rule__MParameterOCR__UpperValueAssignment_4 )
            // InternalOSSWI.g:6906:2: rule__MParameterOCR__UpperValueAssignment_4
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
    // InternalOSSWI.g:6916:1: rule__MParameterOCR__Group__5 : rule__MParameterOCR__Group__5__Impl ;
    public final void rule__MParameterOCR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6920:1: ( rule__MParameterOCR__Group__5__Impl )
            // InternalOSSWI.g:6921:2: rule__MParameterOCR__Group__5__Impl
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
    // InternalOSSWI.g:6927:1: rule__MParameterOCR__Group__5__Impl : ( ']' ) ;
    public final void rule__MParameterOCR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6931:1: ( ( ']' ) )
            // InternalOSSWI.g:6932:1: ( ']' )
            {
            // InternalOSSWI.g:6932:1: ( ']' )
            // InternalOSSWI.g:6933:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOCRAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:6958:1: rule__MParameterOOR__Group__0 : rule__MParameterOOR__Group__0__Impl rule__MParameterOOR__Group__1 ;
    public final void rule__MParameterOOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6962:1: ( rule__MParameterOOR__Group__0__Impl rule__MParameterOOR__Group__1 )
            // InternalOSSWI.g:6963:2: rule__MParameterOOR__Group__0__Impl rule__MParameterOOR__Group__1
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
    // InternalOSSWI.g:6970:1: rule__MParameterOOR__Group__0__Impl : ( () ) ;
    public final void rule__MParameterOOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6974:1: ( ( () ) )
            // InternalOSSWI.g:6975:1: ( () )
            {
            // InternalOSSWI.g:6975:1: ( () )
            // InternalOSSWI.g:6976:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getMParameterOORAction_0()); 
            }
            // InternalOSSWI.g:6977:1: ()
            // InternalOSSWI.g:6979:1: 
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
    // InternalOSSWI.g:6989:1: rule__MParameterOOR__Group__1 : rule__MParameterOOR__Group__1__Impl rule__MParameterOOR__Group__2 ;
    public final void rule__MParameterOOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:6993:1: ( rule__MParameterOOR__Group__1__Impl rule__MParameterOOR__Group__2 )
            // InternalOSSWI.g:6994:2: rule__MParameterOOR__Group__1__Impl rule__MParameterOOR__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:7001:1: rule__MParameterOOR__Group__1__Impl : ( '(' ) ;
    public final void rule__MParameterOOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7005:1: ( ( '(' ) )
            // InternalOSSWI.g:7006:1: ( '(' )
            {
            // InternalOSSWI.g:7006:1: ( '(' )
            // InternalOSSWI.g:7007:1: '('
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
    // InternalOSSWI.g:7020:1: rule__MParameterOOR__Group__2 : rule__MParameterOOR__Group__2__Impl rule__MParameterOOR__Group__3 ;
    public final void rule__MParameterOOR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7024:1: ( rule__MParameterOOR__Group__2__Impl rule__MParameterOOR__Group__3 )
            // InternalOSSWI.g:7025:2: rule__MParameterOOR__Group__2__Impl rule__MParameterOOR__Group__3
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
    // InternalOSSWI.g:7032:1: rule__MParameterOOR__Group__2__Impl : ( ( rule__MParameterOOR__LowerValueAssignment_2 ) ) ;
    public final void rule__MParameterOOR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7036:1: ( ( ( rule__MParameterOOR__LowerValueAssignment_2 ) ) )
            // InternalOSSWI.g:7037:1: ( ( rule__MParameterOOR__LowerValueAssignment_2 ) )
            {
            // InternalOSSWI.g:7037:1: ( ( rule__MParameterOOR__LowerValueAssignment_2 ) )
            // InternalOSSWI.g:7038:1: ( rule__MParameterOOR__LowerValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getLowerValueAssignment_2()); 
            }
            // InternalOSSWI.g:7039:1: ( rule__MParameterOOR__LowerValueAssignment_2 )
            // InternalOSSWI.g:7039:2: rule__MParameterOOR__LowerValueAssignment_2
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
    // InternalOSSWI.g:7049:1: rule__MParameterOOR__Group__3 : rule__MParameterOOR__Group__3__Impl rule__MParameterOOR__Group__4 ;
    public final void rule__MParameterOOR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7053:1: ( rule__MParameterOOR__Group__3__Impl rule__MParameterOOR__Group__4 )
            // InternalOSSWI.g:7054:2: rule__MParameterOOR__Group__3__Impl rule__MParameterOOR__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:7061:1: rule__MParameterOOR__Group__3__Impl : ( ',' ) ;
    public final void rule__MParameterOOR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7065:1: ( ( ',' ) )
            // InternalOSSWI.g:7066:1: ( ',' )
            {
            // InternalOSSWI.g:7066:1: ( ',' )
            // InternalOSSWI.g:7067:1: ','
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
    // InternalOSSWI.g:7080:1: rule__MParameterOOR__Group__4 : rule__MParameterOOR__Group__4__Impl rule__MParameterOOR__Group__5 ;
    public final void rule__MParameterOOR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7084:1: ( rule__MParameterOOR__Group__4__Impl rule__MParameterOOR__Group__5 )
            // InternalOSSWI.g:7085:2: rule__MParameterOOR__Group__4__Impl rule__MParameterOOR__Group__5
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
    // InternalOSSWI.g:7092:1: rule__MParameterOOR__Group__4__Impl : ( ( rule__MParameterOOR__UpperValueAssignment_4 ) ) ;
    public final void rule__MParameterOOR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7096:1: ( ( ( rule__MParameterOOR__UpperValueAssignment_4 ) ) )
            // InternalOSSWI.g:7097:1: ( ( rule__MParameterOOR__UpperValueAssignment_4 ) )
            {
            // InternalOSSWI.g:7097:1: ( ( rule__MParameterOOR__UpperValueAssignment_4 ) )
            // InternalOSSWI.g:7098:1: ( rule__MParameterOOR__UpperValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterOORAccess().getUpperValueAssignment_4()); 
            }
            // InternalOSSWI.g:7099:1: ( rule__MParameterOOR__UpperValueAssignment_4 )
            // InternalOSSWI.g:7099:2: rule__MParameterOOR__UpperValueAssignment_4
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
    // InternalOSSWI.g:7109:1: rule__MParameterOOR__Group__5 : rule__MParameterOOR__Group__5__Impl ;
    public final void rule__MParameterOOR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7113:1: ( rule__MParameterOOR__Group__5__Impl )
            // InternalOSSWI.g:7114:2: rule__MParameterOOR__Group__5__Impl
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
    // InternalOSSWI.g:7120:1: rule__MParameterOOR__Group__5__Impl : ( ')' ) ;
    public final void rule__MParameterOOR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7124:1: ( ( ')' ) )
            // InternalOSSWI.g:7125:1: ( ')' )
            {
            // InternalOSSWI.g:7125:1: ( ')' )
            // InternalOSSWI.g:7126:1: ')'
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
    // InternalOSSWI.g:7151:1: rule__MParameterCOR__Group__0 : rule__MParameterCOR__Group__0__Impl rule__MParameterCOR__Group__1 ;
    public final void rule__MParameterCOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7155:1: ( rule__MParameterCOR__Group__0__Impl rule__MParameterCOR__Group__1 )
            // InternalOSSWI.g:7156:2: rule__MParameterCOR__Group__0__Impl rule__MParameterCOR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalOSSWI.g:7163:1: rule__MParameterCOR__Group__0__Impl : ( () ) ;
    public final void rule__MParameterCOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7167:1: ( ( () ) )
            // InternalOSSWI.g:7168:1: ( () )
            {
            // InternalOSSWI.g:7168:1: ( () )
            // InternalOSSWI.g:7169:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getMParameterCORAction_0()); 
            }
            // InternalOSSWI.g:7170:1: ()
            // InternalOSSWI.g:7172:1: 
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
    // InternalOSSWI.g:7182:1: rule__MParameterCOR__Group__1 : rule__MParameterCOR__Group__1__Impl rule__MParameterCOR__Group__2 ;
    public final void rule__MParameterCOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7186:1: ( rule__MParameterCOR__Group__1__Impl rule__MParameterCOR__Group__2 )
            // InternalOSSWI.g:7187:2: rule__MParameterCOR__Group__1__Impl rule__MParameterCOR__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:7194:1: rule__MParameterCOR__Group__1__Impl : ( '[' ) ;
    public final void rule__MParameterCOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7198:1: ( ( '[' ) )
            // InternalOSSWI.g:7199:1: ( '[' )
            {
            // InternalOSSWI.g:7199:1: ( '[' )
            // InternalOSSWI.g:7200:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:7213:1: rule__MParameterCOR__Group__2 : rule__MParameterCOR__Group__2__Impl rule__MParameterCOR__Group__3 ;
    public final void rule__MParameterCOR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7217:1: ( rule__MParameterCOR__Group__2__Impl rule__MParameterCOR__Group__3 )
            // InternalOSSWI.g:7218:2: rule__MParameterCOR__Group__2__Impl rule__MParameterCOR__Group__3
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
    // InternalOSSWI.g:7225:1: rule__MParameterCOR__Group__2__Impl : ( ( rule__MParameterCOR__LowerValueAssignment_2 ) ) ;
    public final void rule__MParameterCOR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7229:1: ( ( ( rule__MParameterCOR__LowerValueAssignment_2 ) ) )
            // InternalOSSWI.g:7230:1: ( ( rule__MParameterCOR__LowerValueAssignment_2 ) )
            {
            // InternalOSSWI.g:7230:1: ( ( rule__MParameterCOR__LowerValueAssignment_2 ) )
            // InternalOSSWI.g:7231:1: ( rule__MParameterCOR__LowerValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getLowerValueAssignment_2()); 
            }
            // InternalOSSWI.g:7232:1: ( rule__MParameterCOR__LowerValueAssignment_2 )
            // InternalOSSWI.g:7232:2: rule__MParameterCOR__LowerValueAssignment_2
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
    // InternalOSSWI.g:7242:1: rule__MParameterCOR__Group__3 : rule__MParameterCOR__Group__3__Impl rule__MParameterCOR__Group__4 ;
    public final void rule__MParameterCOR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7246:1: ( rule__MParameterCOR__Group__3__Impl rule__MParameterCOR__Group__4 )
            // InternalOSSWI.g:7247:2: rule__MParameterCOR__Group__3__Impl rule__MParameterCOR__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:7254:1: rule__MParameterCOR__Group__3__Impl : ( ',' ) ;
    public final void rule__MParameterCOR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7258:1: ( ( ',' ) )
            // InternalOSSWI.g:7259:1: ( ',' )
            {
            // InternalOSSWI.g:7259:1: ( ',' )
            // InternalOSSWI.g:7260:1: ','
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
    // InternalOSSWI.g:7273:1: rule__MParameterCOR__Group__4 : rule__MParameterCOR__Group__4__Impl rule__MParameterCOR__Group__5 ;
    public final void rule__MParameterCOR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7277:1: ( rule__MParameterCOR__Group__4__Impl rule__MParameterCOR__Group__5 )
            // InternalOSSWI.g:7278:2: rule__MParameterCOR__Group__4__Impl rule__MParameterCOR__Group__5
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
    // InternalOSSWI.g:7285:1: rule__MParameterCOR__Group__4__Impl : ( ( rule__MParameterCOR__UpperValueAssignment_4 ) ) ;
    public final void rule__MParameterCOR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7289:1: ( ( ( rule__MParameterCOR__UpperValueAssignment_4 ) ) )
            // InternalOSSWI.g:7290:1: ( ( rule__MParameterCOR__UpperValueAssignment_4 ) )
            {
            // InternalOSSWI.g:7290:1: ( ( rule__MParameterCOR__UpperValueAssignment_4 ) )
            // InternalOSSWI.g:7291:1: ( rule__MParameterCOR__UpperValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCORAccess().getUpperValueAssignment_4()); 
            }
            // InternalOSSWI.g:7292:1: ( rule__MParameterCOR__UpperValueAssignment_4 )
            // InternalOSSWI.g:7292:2: rule__MParameterCOR__UpperValueAssignment_4
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
    // InternalOSSWI.g:7302:1: rule__MParameterCOR__Group__5 : rule__MParameterCOR__Group__5__Impl ;
    public final void rule__MParameterCOR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7306:1: ( rule__MParameterCOR__Group__5__Impl )
            // InternalOSSWI.g:7307:2: rule__MParameterCOR__Group__5__Impl
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
    // InternalOSSWI.g:7313:1: rule__MParameterCOR__Group__5__Impl : ( ')' ) ;
    public final void rule__MParameterCOR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7317:1: ( ( ')' ) )
            // InternalOSSWI.g:7318:1: ( ')' )
            {
            // InternalOSSWI.g:7318:1: ( ')' )
            // InternalOSSWI.g:7319:1: ')'
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
    // InternalOSSWI.g:7344:1: rule__MParameterCCR__Group__0 : rule__MParameterCCR__Group__0__Impl rule__MParameterCCR__Group__1 ;
    public final void rule__MParameterCCR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7348:1: ( rule__MParameterCCR__Group__0__Impl rule__MParameterCCR__Group__1 )
            // InternalOSSWI.g:7349:2: rule__MParameterCCR__Group__0__Impl rule__MParameterCCR__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalOSSWI.g:7356:1: rule__MParameterCCR__Group__0__Impl : ( () ) ;
    public final void rule__MParameterCCR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7360:1: ( ( () ) )
            // InternalOSSWI.g:7361:1: ( () )
            {
            // InternalOSSWI.g:7361:1: ( () )
            // InternalOSSWI.g:7362:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0()); 
            }
            // InternalOSSWI.g:7363:1: ()
            // InternalOSSWI.g:7365:1: 
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
    // InternalOSSWI.g:7375:1: rule__MParameterCCR__Group__1 : rule__MParameterCCR__Group__1__Impl rule__MParameterCCR__Group__2 ;
    public final void rule__MParameterCCR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7379:1: ( rule__MParameterCCR__Group__1__Impl rule__MParameterCCR__Group__2 )
            // InternalOSSWI.g:7380:2: rule__MParameterCCR__Group__1__Impl rule__MParameterCCR__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:7387:1: rule__MParameterCCR__Group__1__Impl : ( '[' ) ;
    public final void rule__MParameterCCR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7391:1: ( ( '[' ) )
            // InternalOSSWI.g:7392:1: ( '[' )
            {
            // InternalOSSWI.g:7392:1: ( '[' )
            // InternalOSSWI.g:7393:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:7406:1: rule__MParameterCCR__Group__2 : rule__MParameterCCR__Group__2__Impl rule__MParameterCCR__Group__3 ;
    public final void rule__MParameterCCR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7410:1: ( rule__MParameterCCR__Group__2__Impl rule__MParameterCCR__Group__3 )
            // InternalOSSWI.g:7411:2: rule__MParameterCCR__Group__2__Impl rule__MParameterCCR__Group__3
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
    // InternalOSSWI.g:7418:1: rule__MParameterCCR__Group__2__Impl : ( ( rule__MParameterCCR__LowerValueAssignment_2 ) ) ;
    public final void rule__MParameterCCR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7422:1: ( ( ( rule__MParameterCCR__LowerValueAssignment_2 ) ) )
            // InternalOSSWI.g:7423:1: ( ( rule__MParameterCCR__LowerValueAssignment_2 ) )
            {
            // InternalOSSWI.g:7423:1: ( ( rule__MParameterCCR__LowerValueAssignment_2 ) )
            // InternalOSSWI.g:7424:1: ( rule__MParameterCCR__LowerValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getLowerValueAssignment_2()); 
            }
            // InternalOSSWI.g:7425:1: ( rule__MParameterCCR__LowerValueAssignment_2 )
            // InternalOSSWI.g:7425:2: rule__MParameterCCR__LowerValueAssignment_2
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
    // InternalOSSWI.g:7435:1: rule__MParameterCCR__Group__3 : rule__MParameterCCR__Group__3__Impl rule__MParameterCCR__Group__4 ;
    public final void rule__MParameterCCR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7439:1: ( rule__MParameterCCR__Group__3__Impl rule__MParameterCCR__Group__4 )
            // InternalOSSWI.g:7440:2: rule__MParameterCCR__Group__3__Impl rule__MParameterCCR__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalOSSWI.g:7447:1: rule__MParameterCCR__Group__3__Impl : ( ',' ) ;
    public final void rule__MParameterCCR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7451:1: ( ( ',' ) )
            // InternalOSSWI.g:7452:1: ( ',' )
            {
            // InternalOSSWI.g:7452:1: ( ',' )
            // InternalOSSWI.g:7453:1: ','
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
    // InternalOSSWI.g:7466:1: rule__MParameterCCR__Group__4 : rule__MParameterCCR__Group__4__Impl rule__MParameterCCR__Group__5 ;
    public final void rule__MParameterCCR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7470:1: ( rule__MParameterCCR__Group__4__Impl rule__MParameterCCR__Group__5 )
            // InternalOSSWI.g:7471:2: rule__MParameterCCR__Group__4__Impl rule__MParameterCCR__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalOSSWI.g:7478:1: rule__MParameterCCR__Group__4__Impl : ( ( rule__MParameterCCR__UpperValueAssignment_4 ) ) ;
    public final void rule__MParameterCCR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7482:1: ( ( ( rule__MParameterCCR__UpperValueAssignment_4 ) ) )
            // InternalOSSWI.g:7483:1: ( ( rule__MParameterCCR__UpperValueAssignment_4 ) )
            {
            // InternalOSSWI.g:7483:1: ( ( rule__MParameterCCR__UpperValueAssignment_4 ) )
            // InternalOSSWI.g:7484:1: ( rule__MParameterCCR__UpperValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getUpperValueAssignment_4()); 
            }
            // InternalOSSWI.g:7485:1: ( rule__MParameterCCR__UpperValueAssignment_4 )
            // InternalOSSWI.g:7485:2: rule__MParameterCCR__UpperValueAssignment_4
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
    // InternalOSSWI.g:7495:1: rule__MParameterCCR__Group__5 : rule__MParameterCCR__Group__5__Impl ;
    public final void rule__MParameterCCR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7499:1: ( rule__MParameterCCR__Group__5__Impl )
            // InternalOSSWI.g:7500:2: rule__MParameterCCR__Group__5__Impl
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
    // InternalOSSWI.g:7506:1: rule__MParameterCCR__Group__5__Impl : ( ']' ) ;
    public final void rule__MParameterCCR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7510:1: ( ( ']' ) )
            // InternalOSSWI.g:7511:1: ( ']' )
            {
            // InternalOSSWI.g:7511:1: ( ']' )
            // InternalOSSWI.g:7512:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__MOSSwInterface__UnorderedGroup_4"
    // InternalOSSWI.g:7538:1: rule__MOSSwInterface__UnorderedGroup_4 : rule__MOSSwInterface__UnorderedGroup_4__0 {...}?;
    public final void rule__MOSSwInterface__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());
            
        try {
            // InternalOSSWI.g:7543:1: ( rule__MOSSwInterface__UnorderedGroup_4__0 {...}?)
            // InternalOSSWI.g:7544:2: rule__MOSSwInterface__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__UnorderedGroup_4__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__MOSSwInterface__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__UnorderedGroup_4"


    // $ANTLR start "rule__MOSSwInterface__UnorderedGroup_4__Impl"
    // InternalOSSWI.g:7555:1: rule__MOSSwInterface__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwInterface__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__MOSSwInterface__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalOSSWI.g:7560:1: ( ( ({...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwInterface__Group_4_2__0 ) ) ) ) ) )
            // InternalOSSWI.g:7561:3: ( ({...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwInterface__Group_4_2__0 ) ) ) ) )
            {
            // InternalOSSWI.g:7561:3: ( ({...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MOSSwInterface__Group_4_2__0 ) ) ) ) )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                alt35=2;
            }
            else if ( LA35_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                alt35=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalOSSWI.g:7563:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) ) )
                    {
                    // InternalOSSWI.g:7563:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) ) )
                    // InternalOSSWI.g:7564:5: {...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwInterface__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalOSSWI.g:7564:111: ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) )
                    // InternalOSSWI.g:7565:6: ( ( rule__MOSSwInterface__Group_4_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalOSSWI.g:7571:6: ( ( rule__MOSSwInterface__Group_4_0__0 ) )
                    // InternalOSSWI.g:7573:7: ( rule__MOSSwInterface__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_0()); 
                    }
                    // InternalOSSWI.g:7574:7: ( rule__MOSSwInterface__Group_4_0__0 )
                    // InternalOSSWI.g:7574:8: rule__MOSSwInterface__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MOSSwInterface__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOSSWI.g:7580:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) ) )
                    {
                    // InternalOSSWI.g:7580:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) ) )
                    // InternalOSSWI.g:7581:5: {...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwInterface__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalOSSWI.g:7581:111: ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) )
                    // InternalOSSWI.g:7582:6: ( ( rule__MOSSwInterface__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalOSSWI.g:7588:6: ( ( rule__MOSSwInterface__Group_4_1__0 ) )
                    // InternalOSSWI.g:7590:7: ( rule__MOSSwInterface__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_1()); 
                    }
                    // InternalOSSWI.g:7591:7: ( rule__MOSSwInterface__Group_4_1__0 )
                    // InternalOSSWI.g:7591:8: rule__MOSSwInterface__Group_4_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MOSSwInterface__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOSSWI.g:7597:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_2__0 ) ) ) )
                    {
                    // InternalOSSWI.g:7597:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_2__0 ) ) ) )
                    // InternalOSSWI.g:7598:5: {...}? => ( ( ( rule__MOSSwInterface__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MOSSwInterface__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalOSSWI.g:7598:111: ( ( ( rule__MOSSwInterface__Group_4_2__0 ) ) )
                    // InternalOSSWI.g:7599:6: ( ( rule__MOSSwInterface__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalOSSWI.g:7605:6: ( ( rule__MOSSwInterface__Group_4_2__0 ) )
                    // InternalOSSWI.g:7607:7: ( rule__MOSSwInterface__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_2()); 
                    }
                    // InternalOSSWI.g:7608:7: ( rule__MOSSwInterface__Group_4_2__0 )
                    // InternalOSSWI.g:7608:8: rule__MOSSwInterface__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MOSSwInterface__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_2()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__MOSSwInterface__UnorderedGroup_4__0"
    // InternalOSSWI.g:7623:1: rule__MOSSwInterface__UnorderedGroup_4__0 : rule__MOSSwInterface__UnorderedGroup_4__Impl ( rule__MOSSwInterface__UnorderedGroup_4__1 )? ;
    public final void rule__MOSSwInterface__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7627:1: ( rule__MOSSwInterface__UnorderedGroup_4__Impl ( rule__MOSSwInterface__UnorderedGroup_4__1 )? )
            // InternalOSSWI.g:7628:2: rule__MOSSwInterface__UnorderedGroup_4__Impl ( rule__MOSSwInterface__UnorderedGroup_4__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__MOSSwInterface__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalOSSWI.g:7629:2: ( rule__MOSSwInterface__UnorderedGroup_4__1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                alt36=1;
            }
            else if ( LA36_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOSSWI.g:0:0: rule__MOSSwInterface__UnorderedGroup_4__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MOSSwInterface__UnorderedGroup_4__1();

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
    // $ANTLR end "rule__MOSSwInterface__UnorderedGroup_4__0"


    // $ANTLR start "rule__MOSSwInterface__UnorderedGroup_4__1"
    // InternalOSSWI.g:7636:1: rule__MOSSwInterface__UnorderedGroup_4__1 : rule__MOSSwInterface__UnorderedGroup_4__Impl ( rule__MOSSwInterface__UnorderedGroup_4__2 )? ;
    public final void rule__MOSSwInterface__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7640:1: ( rule__MOSSwInterface__UnorderedGroup_4__Impl ( rule__MOSSwInterface__UnorderedGroup_4__2 )? )
            // InternalOSSWI.g:7641:2: rule__MOSSwInterface__UnorderedGroup_4__Impl ( rule__MOSSwInterface__UnorderedGroup_4__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__MOSSwInterface__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalOSSWI.g:7642:2: ( rule__MOSSwInterface__UnorderedGroup_4__2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
                alt37=1;
            }
            else if ( LA37_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOSSWI.g:0:0: rule__MOSSwInterface__UnorderedGroup_4__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MOSSwInterface__UnorderedGroup_4__2();

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
    // $ANTLR end "rule__MOSSwInterface__UnorderedGroup_4__1"


    // $ANTLR start "rule__MOSSwInterface__UnorderedGroup_4__2"
    // InternalOSSWI.g:7649:1: rule__MOSSwInterface__UnorderedGroup_4__2 : rule__MOSSwInterface__UnorderedGroup_4__Impl ;
    public final void rule__MOSSwInterface__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7653:1: ( rule__MOSSwInterface__UnorderedGroup_4__Impl )
            // InternalOSSWI.g:7654:2: rule__MOSSwInterface__UnorderedGroup_4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MOSSwInterface__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__UnorderedGroup_4__2"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__PackageAssignment_1"
    // InternalOSSWI.g:7667:1: rule__MMESPOSSWIPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPOSSWIPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7671:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOSSWI.g:7672:1: ( ( ruleQualifiedName ) )
            {
            // InternalOSSWI.g:7672:1: ( ( ruleQualifiedName ) )
            // InternalOSSWI.g:7673:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
            }
            // InternalOSSWI.g:7674:1: ( ruleQualifiedName )
            // InternalOSSWI.g:7675:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__PackageAssignment_1"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1"
    // InternalOSSWI.g:7686:1: rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7690:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOSSWI.g:7691:1: ( ( ruleQualifiedName ) )
            {
            // InternalOSSWI.g:7691:1: ( ( ruleQualifiedName ) )
            // InternalOSSWI.g:7692:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }
            // InternalOSSWI.g:7693:1: ( ruleQualifiedName )
            // InternalOSSWI.g:7694:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1"


    // $ANTLR start "rule__MMESPOSSWIPackageFile__ElementAssignment_4"
    // InternalOSSWI.g:7705:1: rule__MMESPOSSWIPackageFile__ElementAssignment_4 : ( ruleMMESPOSSWIPackageElement ) ;
    public final void rule__MMESPOSSWIPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7709:1: ( ( ruleMMESPOSSWIPackageElement ) )
            // InternalOSSWI.g:7710:1: ( ruleMMESPOSSWIPackageElement )
            {
            // InternalOSSWI.g:7710:1: ( ruleMMESPOSSWIPackageElement )
            // InternalOSSWI.g:7711:1: ruleMMESPOSSWIPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementMMESPOSSWIPackageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMMESPOSSWIPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementMMESPOSSWIPackageElementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMESPOSSWIPackageFile__ElementAssignment_4"


    // $ANTLR start "rule__MOSSwInterface__NameAssignment_1"
    // InternalOSSWI.g:7720:1: rule__MOSSwInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MOSSwInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7724:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:7725:1: ( RULE_ID )
            {
            // InternalOSSWI.g:7725:1: ( RULE_ID )
            // InternalOSSWI.g:7726:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__NameAssignment_1"


    // $ANTLR start "rule__MOSSwInterface__ExtendsAssignment_2_1"
    // InternalOSSWI.g:7735:1: rule__MOSSwInterface__ExtendsAssignment_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwInterface__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7739:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWI.g:7740:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWI.g:7740:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWI.g:7741:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_1_0()); 
            }
            // InternalOSSWI.g:7742:1: ( ruleVersionedQualifiedName )
            // InternalOSSWI.g:7743:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__ExtendsAssignment_2_1"


    // $ANTLR start "rule__MOSSwInterface__ExtendsAssignment_2_2_1"
    // InternalOSSWI.g:7754:1: rule__MOSSwInterface__ExtendsAssignment_2_2_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwInterface__ExtendsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7758:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWI.g:7759:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWI.g:7759:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWI.g:7760:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_2_1_0()); 
            }
            // InternalOSSWI.g:7761:1: ( ruleVersionedQualifiedName )
            // InternalOSSWI.g:7762:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__ExtendsAssignment_2_2_1"


    // $ANTLR start "rule__MOSSwInterface__VersionAssignment_4_0_2"
    // InternalOSSWI.g:7773:1: rule__MOSSwInterface__VersionAssignment_4_0_2 : ( ruleVersion ) ;
    public final void rule__MOSSwInterface__VersionAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7777:1: ( ( ruleVersion ) )
            // InternalOSSWI.g:7778:1: ( ruleVersion )
            {
            // InternalOSSWI.g:7778:1: ( ruleVersion )
            // InternalOSSWI.g:7779:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__VersionAssignment_4_0_2"


    // $ANTLR start "rule__MOSSwInterface__ReferencedElementAssignment_4_1_2"
    // InternalOSSWI.g:7788:1: rule__MOSSwInterface__ReferencedElementAssignment_4_1_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MOSSwInterface__ReferencedElementAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7792:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalOSSWI.g:7793:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalOSSWI.g:7793:1: ( ( ruleVersionedQualifiedName ) )
            // InternalOSSWI.g:7794:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementMOperatingSystemAPICrossReference_4_1_2_0()); 
            }
            // InternalOSSWI.g:7795:1: ( ruleVersionedQualifiedName )
            // InternalOSSWI.g:7796:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementMOperatingSystemAPICrossReference_4_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__ReferencedElementAssignment_4_1_2"


    // $ANTLR start "rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3"
    // InternalOSSWI.g:7807:1: rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3 : ( ruleMProvidedResource ) ;
    public final void rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7811:1: ( ( ruleMProvidedResource ) )
            // InternalOSSWI.g:7812:1: ( ruleMProvidedResource )
            {
            // InternalOSSWI.g:7812:1: ( ruleMProvidedResource )
            // InternalOSSWI.g:7813:1: ruleMProvidedResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMProvidedResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3"


    // $ANTLR start "rule__MQuantifiableResource__NameAssignment_2"
    // InternalOSSWI.g:7822:1: rule__MQuantifiableResource__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MQuantifiableResource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7826:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:7827:1: ( RULE_ID )
            {
            // InternalOSSWI.g:7827:1: ( RULE_ID )
            // InternalOSSWI.g:7828:1: RULE_ID
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
    // InternalOSSWI.g:7837:1: rule__MQuantifiableResource__LowerBoundAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MQuantifiableResource__LowerBoundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7841:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:7842:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:7842:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:7843:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:7852:1: rule__MQuantifiableResource__UpperBoundAssignment_6 : ( ruleMParameterValueExpression ) ;
    public final void rule__MQuantifiableResource__UpperBoundAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7856:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:7857:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:7857:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:7858:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:7867:1: rule__MInstantiableResource__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MInstantiableResource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7871:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:7872:1: ( RULE_ID )
            {
            // InternalOSSWI.g:7872:1: ( RULE_ID )
            // InternalOSSWI.g:7873:1: RULE_ID
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
    // InternalOSSWI.g:7882:1: rule__MInstantiableResource__ParametersAssignment_4 : ( ruleMParameter ) ;
    public final void rule__MInstantiableResource__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7886:1: ( ( ruleMParameter ) )
            // InternalOSSWI.g:7887:1: ( ruleMParameter )
            {
            // InternalOSSWI.g:7887:1: ( ruleMParameter )
            // InternalOSSWI.g:7888:1: ruleMParameter
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


    // $ANTLR start "rule__MIntegerParameterSingleExpression__NameAssignment_1"
    // InternalOSSWI.g:7897:1: rule__MIntegerParameterSingleExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MIntegerParameterSingleExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7901:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:7902:1: ( RULE_ID )
            {
            // InternalOSSWI.g:7902:1: ( RULE_ID )
            // InternalOSSWI.g:7903:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__NameAssignment_1"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3"
    // InternalOSSWI.g:7912:1: rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3 : ( ruleMParameterValueExpression ) ;
    public final void rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7916:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:7917:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:7917:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:7918:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3"


    // $ANTLR start "rule__MIntegerParameterSingleExpression__RangeAssignment_4_1"
    // InternalOSSWI.g:7927:1: rule__MIntegerParameterSingleExpression__RangeAssignment_4_1 : ( ruleMParameterRange ) ;
    public final void rule__MIntegerParameterSingleExpression__RangeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7931:1: ( ( ruleMParameterRange ) )
            // InternalOSSWI.g:7932:1: ( ruleMParameterRange )
            {
            // InternalOSSWI.g:7932:1: ( ruleMParameterRange )
            // InternalOSSWI.g:7933:1: ruleMParameterRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIntegerParameterSingleExpression__RangeAssignment_4_1"


    // $ANTLR start "rule__MEnumParameterDefinition__NameAssignment_2"
    // InternalOSSWI.g:7942:1: rule__MEnumParameterDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MEnumParameterDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7946:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:7947:1: ( RULE_ID )
            {
            // InternalOSSWI.g:7947:1: ( RULE_ID )
            // InternalOSSWI.g:7948:1: RULE_ID
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
    // InternalOSSWI.g:7957:1: rule__MEnumParameterDefinition__LiteralsAssignment_4 : ( ruleMEnumParameterLiteralRule ) ;
    public final void rule__MEnumParameterDefinition__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7961:1: ( ( ruleMEnumParameterLiteralRule ) )
            // InternalOSSWI.g:7962:1: ( ruleMEnumParameterLiteralRule )
            {
            // InternalOSSWI.g:7962:1: ( ruleMEnumParameterLiteralRule )
            // InternalOSSWI.g:7963:1: ruleMEnumParameterLiteralRule
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
    // InternalOSSWI.g:7972:1: rule__MEnumParameterDefinition__LiteralsAssignment_5_1 : ( ruleMEnumParameterLiteralRule ) ;
    public final void rule__MEnumParameterDefinition__LiteralsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7976:1: ( ( ruleMEnumParameterLiteralRule ) )
            // InternalOSSWI.g:7977:1: ( ruleMEnumParameterLiteralRule )
            {
            // InternalOSSWI.g:7977:1: ( ruleMEnumParameterLiteralRule )
            // InternalOSSWI.g:7978:1: ruleMEnumParameterLiteralRule
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


    // $ANTLR start "rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1"
    // InternalOSSWI.g:7987:1: rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:7991:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalOSSWI.g:7992:1: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalOSSWI.g:7992:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalOSSWI.g:7993:1: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_1_0()); 
            }
            // InternalOSSWI.g:7994:1: ( ruleVersionedQualifiedReferenceName )
            // InternalOSSWI.g:7995:1: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1"


    // $ANTLR start "rule__MEnumParameterSingleExpression__NameAssignment_2"
    // InternalOSSWI.g:8006:1: rule__MEnumParameterSingleExpression__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MEnumParameterSingleExpression__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8010:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:8011:1: ( RULE_ID )
            {
            // InternalOSSWI.g:8011:1: ( RULE_ID )
            // InternalOSSWI.g:8012:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__NameAssignment_2"


    // $ANTLR start "rule__MEnumParameterSingleExpression__DefaultValueAssignment_4"
    // InternalOSSWI.g:8021:1: rule__MEnumParameterSingleExpression__DefaultValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MEnumParameterSingleExpression__DefaultValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8025:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8026:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8026:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8027:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEnumParameterSingleExpression__DefaultValueAssignment_4"


    // $ANTLR start "rule__MRealParameterSingleExpression__NameAssignment_1"
    // InternalOSSWI.g:8036:1: rule__MRealParameterSingleExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MRealParameterSingleExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8040:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:8041:1: ( RULE_ID )
            {
            // InternalOSSWI.g:8041:1: ( RULE_ID )
            // InternalOSSWI.g:8042:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__NameAssignment_1"


    // $ANTLR start "rule__MRealParameterSingleExpression__DefaultValueAssignment_3"
    // InternalOSSWI.g:8051:1: rule__MRealParameterSingleExpression__DefaultValueAssignment_3 : ( ruleMParameterValueExpression ) ;
    public final void rule__MRealParameterSingleExpression__DefaultValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8055:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8056:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8056:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8057:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__DefaultValueAssignment_3"


    // $ANTLR start "rule__MRealParameterSingleExpression__RangeAssignment_4_1"
    // InternalOSSWI.g:8066:1: rule__MRealParameterSingleExpression__RangeAssignment_4_1 : ( ruleMParameterRange ) ;
    public final void rule__MRealParameterSingleExpression__RangeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8070:1: ( ( ruleMParameterRange ) )
            // InternalOSSWI.g:8071:1: ( ruleMParameterRange )
            {
            // InternalOSSWI.g:8071:1: ( ruleMParameterRange )
            // InternalOSSWI.g:8072:1: ruleMParameterRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRealParameterSingleExpression__RangeAssignment_4_1"


    // $ANTLR start "rule__MEnumParameterLiteral__NameAssignment_1"
    // InternalOSSWI.g:8081:1: rule__MEnumParameterLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MEnumParameterLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8085:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:8086:1: ( RULE_ID )
            {
            // InternalOSSWI.g:8086:1: ( RULE_ID )
            // InternalOSSWI.g:8087:1: RULE_ID
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
    // InternalOSSWI.g:8096:1: rule__MEnumParamIntegerLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MEnumParamIntegerLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8100:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:8101:1: ( RULE_ID )
            {
            // InternalOSSWI.g:8101:1: ( RULE_ID )
            // InternalOSSWI.g:8102:1: RULE_ID
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
    // InternalOSSWI.g:8111:1: rule__MEnumParamIntegerLiteral__ValueAssignment_3 : ( ruleINTEGER ) ;
    public final void rule__MEnumParamIntegerLiteral__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8115:1: ( ( ruleINTEGER ) )
            // InternalOSSWI.g:8116:1: ( ruleINTEGER )
            {
            // InternalOSSWI.g:8116:1: ( ruleINTEGER )
            // InternalOSSWI.g:8117:1: ruleINTEGER
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
    // InternalOSSWI.g:8126:1: rule__MEnumParamRealLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MEnumParamRealLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8130:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:8131:1: ( RULE_ID )
            {
            // InternalOSSWI.g:8131:1: ( RULE_ID )
            // InternalOSSWI.g:8132:1: RULE_ID
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
    // InternalOSSWI.g:8141:1: rule__MEnumParamRealLiteral__ValueAssignment_3 : ( ruleREAL ) ;
    public final void rule__MEnumParamRealLiteral__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8145:1: ( ( ruleREAL ) )
            // InternalOSSWI.g:8146:1: ( ruleREAL )
            {
            // InternalOSSWI.g:8146:1: ( ruleREAL )
            // InternalOSSWI.g:8147:1: ruleREAL
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
    // InternalOSSWI.g:8156:1: rule__MEnumParamStringLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MEnumParamStringLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8160:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:8161:1: ( RULE_ID )
            {
            // InternalOSSWI.g:8161:1: ( RULE_ID )
            // InternalOSSWI.g:8162:1: RULE_ID
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
    // InternalOSSWI.g:8171:1: rule__MEnumParamStringLiteral__IsRawAssignment_3 : ( ( 'raw' ) ) ;
    public final void rule__MEnumParamStringLiteral__IsRawAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8175:1: ( ( ( 'raw' ) ) )
            // InternalOSSWI.g:8176:1: ( ( 'raw' ) )
            {
            // InternalOSSWI.g:8176:1: ( ( 'raw' ) )
            // InternalOSSWI.g:8177:1: ( 'raw' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); 
            }
            // InternalOSSWI.g:8178:1: ( 'raw' )
            // InternalOSSWI.g:8179:1: 'raw'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:8194:1: rule__MEnumParamStringLiteral__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__MEnumParamStringLiteral__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8198:1: ( ( RULE_STRING ) )
            // InternalOSSWI.g:8199:1: ( RULE_STRING )
            {
            // InternalOSSWI.g:8199:1: ( RULE_STRING )
            // InternalOSSWI.g:8200:1: RULE_STRING
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


    // $ANTLR start "rule__MBooleanParameterSingleExpression__NameAssignment_1"
    // InternalOSSWI.g:8209:1: rule__MBooleanParameterSingleExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MBooleanParameterSingleExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8213:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:8214:1: ( RULE_ID )
            {
            // InternalOSSWI.g:8214:1: ( RULE_ID )
            // InternalOSSWI.g:8215:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__NameAssignment_1"


    // $ANTLR start "rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3"
    // InternalOSSWI.g:8224:1: rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3 : ( ruleMParameterValueExpression ) ;
    public final void rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8228:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8229:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8229:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8230:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3"


    // $ANTLR start "rule__MStringParameterSingleExpression__NameAssignment_1"
    // InternalOSSWI.g:8239:1: rule__MStringParameterSingleExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MStringParameterSingleExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8243:1: ( ( RULE_ID ) )
            // InternalOSSWI.g:8244:1: ( RULE_ID )
            {
            // InternalOSSWI.g:8244:1: ( RULE_ID )
            // InternalOSSWI.g:8245:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__NameAssignment_1"


    // $ANTLR start "rule__MStringParameterSingleExpression__DefaultValueAssignment_3"
    // InternalOSSWI.g:8254:1: rule__MStringParameterSingleExpression__DefaultValueAssignment_3 : ( ruleMParameterValueExpression ) ;
    public final void rule__MStringParameterSingleExpression__DefaultValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8258:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8259:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8259:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8260:1: ruleMParameterValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMParameterValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MStringParameterSingleExpression__DefaultValueAssignment_3"


    // $ANTLR start "rule__MParameterValueBooleanLiteral__ValueAssignment_1"
    // InternalOSSWI.g:8269:1: rule__MParameterValueBooleanLiteral__ValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__MParameterValueBooleanLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8273:1: ( ( ruleEBoolean ) )
            // InternalOSSWI.g:8274:1: ( ruleEBoolean )
            {
            // InternalOSSWI.g:8274:1: ( ruleEBoolean )
            // InternalOSSWI.g:8275:1: ruleEBoolean
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
    // InternalOSSWI.g:8284:1: rule__MParameterValueStringLiteral__IsRawAssignment_1 : ( ( 'raw' ) ) ;
    public final void rule__MParameterValueStringLiteral__IsRawAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8288:1: ( ( ( 'raw' ) ) )
            // InternalOSSWI.g:8289:1: ( ( 'raw' ) )
            {
            // InternalOSSWI.g:8289:1: ( ( 'raw' ) )
            // InternalOSSWI.g:8290:1: ( 'raw' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); 
            }
            // InternalOSSWI.g:8291:1: ( 'raw' )
            // InternalOSSWI.g:8292:1: 'raw'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalOSSWI.g:8307:1: rule__MParameterValueStringLiteral__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MParameterValueStringLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8311:1: ( ( RULE_STRING ) )
            // InternalOSSWI.g:8312:1: ( RULE_STRING )
            {
            // InternalOSSWI.g:8312:1: ( RULE_STRING )
            // InternalOSSWI.g:8313:1: RULE_STRING
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
    // InternalOSSWI.g:8322:1: rule__MParameterValueIntegerLiteral__ValueAssignment_1 : ( ruleINTEGER ) ;
    public final void rule__MParameterValueIntegerLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8326:1: ( ( ruleINTEGER ) )
            // InternalOSSWI.g:8327:1: ( ruleINTEGER )
            {
            // InternalOSSWI.g:8327:1: ( ruleINTEGER )
            // InternalOSSWI.g:8328:1: ruleINTEGER
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
    // InternalOSSWI.g:8337:1: rule__MParameterValueRealLiteral__ValueAssignment_1 : ( ruleREAL ) ;
    public final void rule__MParameterValueRealLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8341:1: ( ( ruleREAL ) )
            // InternalOSSWI.g:8342:1: ( ruleREAL )
            {
            // InternalOSSWI.g:8342:1: ( ruleREAL )
            // InternalOSSWI.g:8343:1: ruleREAL
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
    // InternalOSSWI.g:8352:1: rule__MParameterValueRefObject__ObjectAssignment_1 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__MParameterValueRefObject__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8356:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalOSSWI.g:8357:1: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalOSSWI.g:8357:1: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalOSSWI.g:8358:1: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0()); 
            }
            // InternalOSSWI.g:8359:1: ( ruleVersionedQualifiedReferenceName )
            // InternalOSSWI.g:8360:1: ruleVersionedQualifiedReferenceName
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
    // InternalOSSWI.g:8371:1: rule__MParameterValuePAR__ValueAssignment_1 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterValuePAR__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8375:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8376:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8376:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8377:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:8386:1: rule__MParameterValueExpression__LeftAssignment_1 : ( ruleMParameterValueTERM ) ;
    public final void rule__MParameterValueExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8390:1: ( ( ruleMParameterValueTERM ) )
            // InternalOSSWI.g:8391:1: ( ruleMParameterValueTERM )
            {
            // InternalOSSWI.g:8391:1: ( ruleMParameterValueTERM )
            // InternalOSSWI.g:8392:1: ruleMParameterValueTERM
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
    // InternalOSSWI.g:8401:1: rule__MParameterValueExpression__OperationAssignment_2_0 : ( ruleMParameterValueExpressionOperators ) ;
    public final void rule__MParameterValueExpression__OperationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8405:1: ( ( ruleMParameterValueExpressionOperators ) )
            // InternalOSSWI.g:8406:1: ( ruleMParameterValueExpressionOperators )
            {
            // InternalOSSWI.g:8406:1: ( ruleMParameterValueExpressionOperators )
            // InternalOSSWI.g:8407:1: ruleMParameterValueExpressionOperators
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
    // InternalOSSWI.g:8416:1: rule__MParameterValueExpression__RightAssignment_2_1 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterValueExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8420:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8421:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8421:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8422:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:8431:1: rule__MParameterValueTERM__LeftAssignment_1 : ( ruleMParameterValue ) ;
    public final void rule__MParameterValueTERM__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8435:1: ( ( ruleMParameterValue ) )
            // InternalOSSWI.g:8436:1: ( ruleMParameterValue )
            {
            // InternalOSSWI.g:8436:1: ( ruleMParameterValue )
            // InternalOSSWI.g:8437:1: ruleMParameterValue
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
    // InternalOSSWI.g:8446:1: rule__MParameterValueTERM__OperationAssignment_2_0 : ( ruleMParameterValueTERMOperators ) ;
    public final void rule__MParameterValueTERM__OperationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8450:1: ( ( ruleMParameterValueTERMOperators ) )
            // InternalOSSWI.g:8451:1: ( ruleMParameterValueTERMOperators )
            {
            // InternalOSSWI.g:8451:1: ( ruleMParameterValueTERMOperators )
            // InternalOSSWI.g:8452:1: ruleMParameterValueTERMOperators
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
    // InternalOSSWI.g:8461:1: rule__MParameterValueTERM__RightAssignment_2_1 : ( ruleMParameterValueTERM ) ;
    public final void rule__MParameterValueTERM__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8465:1: ( ( ruleMParameterValueTERM ) )
            // InternalOSSWI.g:8466:1: ( ruleMParameterValueTERM )
            {
            // InternalOSSWI.g:8466:1: ( ruleMParameterValueTERM )
            // InternalOSSWI.g:8467:1: ruleMParameterValueTERM
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
    // InternalOSSWI.g:8476:1: rule__MParameterOCR__LowerValueAssignment_2 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterOCR__LowerValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8480:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8481:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8481:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8482:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:8491:1: rule__MParameterOCR__UpperValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterOCR__UpperValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8495:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8496:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8496:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8497:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:8506:1: rule__MParameterOOR__LowerValueAssignment_2 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterOOR__LowerValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8510:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8511:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8511:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8512:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:8521:1: rule__MParameterOOR__UpperValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterOOR__UpperValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8525:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8526:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8526:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8527:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:8536:1: rule__MParameterCOR__LowerValueAssignment_2 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterCOR__LowerValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8540:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8541:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8541:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8542:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:8551:1: rule__MParameterCOR__UpperValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterCOR__UpperValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8555:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8556:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8556:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8557:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:8566:1: rule__MParameterCCR__LowerValueAssignment_2 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterCCR__LowerValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8570:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8571:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8571:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8572:1: ruleMParameterValueExpression
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
    // InternalOSSWI.g:8581:1: rule__MParameterCCR__UpperValueAssignment_4 : ( ruleMParameterValueExpression ) ;
    public final void rule__MParameterCCR__UpperValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOSSWI.g:8585:1: ( ( ruleMParameterValueExpression ) )
            // InternalOSSWI.g:8586:1: ( ruleMParameterValueExpression )
            {
            // InternalOSSWI.g:8586:1: ( ruleMParameterValueExpression )
            // InternalOSSWI.g:8587:1: ruleMParameterValueExpression
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

    // $ANTLR start synpred19_InternalOSSWI
    public final void synpred19_InternalOSSWI_fragment() throws RecognitionException {   
        // InternalOSSWI.g:1480:1: ( ( ruleMParameterOCR ) )
        // InternalOSSWI.g:1480:1: ( ruleMParameterOCR )
        {
        // InternalOSSWI.g:1480:1: ( ruleMParameterOCR )
        // InternalOSSWI.g:1481:1: ruleMParameterOCR
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
    // $ANTLR end synpred19_InternalOSSWI

    // $ANTLR start synpred20_InternalOSSWI
    public final void synpred20_InternalOSSWI_fragment() throws RecognitionException {   
        // InternalOSSWI.g:1486:6: ( ( ruleMParameterOOR ) )
        // InternalOSSWI.g:1486:6: ( ruleMParameterOOR )
        {
        // InternalOSSWI.g:1486:6: ( ruleMParameterOOR )
        // InternalOSSWI.g:1487:1: ruleMParameterOOR
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
    // $ANTLR end synpred20_InternalOSSWI

    // $ANTLR start synpred21_InternalOSSWI
    public final void synpred21_InternalOSSWI_fragment() throws RecognitionException {   
        // InternalOSSWI.g:1492:6: ( ( ruleMParameterCOR ) )
        // InternalOSSWI.g:1492:6: ( ruleMParameterCOR )
        {
        // InternalOSSWI.g:1492:6: ( ruleMParameterCOR )
        // InternalOSSWI.g:1493:1: ruleMParameterCOR
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
    // $ANTLR end synpred21_InternalOSSWI

    // $ANTLR start synpred46_InternalOSSWI
    public final void synpred46_InternalOSSWI_fragment() throws RecognitionException {   
        // InternalOSSWI.g:7563:4: ( ({...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) ) ) )
        // InternalOSSWI.g:7563:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) ) )
        {
        // InternalOSSWI.g:7563:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) ) )
        // InternalOSSWI.g:7564:5: {...}? => ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred46_InternalOSSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalOSSWI.g:7564:111: ( ( ( rule__MOSSwInterface__Group_4_0__0 ) ) )
        // InternalOSSWI.g:7565:6: ( ( rule__MOSSwInterface__Group_4_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0);
        // InternalOSSWI.g:7571:6: ( ( rule__MOSSwInterface__Group_4_0__0 ) )
        // InternalOSSWI.g:7573:7: ( rule__MOSSwInterface__Group_4_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_0()); 
        }
        // InternalOSSWI.g:7574:7: ( rule__MOSSwInterface__Group_4_0__0 )
        // InternalOSSWI.g:7574:8: rule__MOSSwInterface__Group_4_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MOSSwInterface__Group_4_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred46_InternalOSSWI

    // $ANTLR start synpred47_InternalOSSWI
    public final void synpred47_InternalOSSWI_fragment() throws RecognitionException {   
        // InternalOSSWI.g:7580:4: ( ({...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) ) ) )
        // InternalOSSWI.g:7580:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) ) )
        {
        // InternalOSSWI.g:7580:4: ({...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) ) )
        // InternalOSSWI.g:7581:5: {...}? => ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred47_InternalOSSWI", "getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalOSSWI.g:7581:111: ( ( ( rule__MOSSwInterface__Group_4_1__0 ) ) )
        // InternalOSSWI.g:7582:6: ( ( rule__MOSSwInterface__Group_4_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1);
        // InternalOSSWI.g:7588:6: ( ( rule__MOSSwInterface__Group_4_1__0 ) )
        // InternalOSSWI.g:7590:7: ( rule__MOSSwInterface__Group_4_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_1()); 
        }
        // InternalOSSWI.g:7591:7: ( rule__MOSSwInterface__Group_4_1__0 )
        // InternalOSSWI.g:7591:8: rule__MOSSwInterface__Group_4_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MOSSwInterface__Group_4_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred47_InternalOSSWI

    // $ANTLR start synpred48_InternalOSSWI
    public final void synpred48_InternalOSSWI_fragment() throws RecognitionException {   
        // InternalOSSWI.g:7629:2: ( rule__MOSSwInterface__UnorderedGroup_4__1 )
        // InternalOSSWI.g:7629:2: rule__MOSSwInterface__UnorderedGroup_4__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MOSSwInterface__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalOSSWI

    // $ANTLR start synpred49_InternalOSSWI
    public final void synpred49_InternalOSSWI_fragment() throws RecognitionException {   
        // InternalOSSWI.g:7642:2: ( rule__MOSSwInterface__UnorderedGroup_4__2 )
        // InternalOSSWI.g:7642:2: rule__MOSSwInterface__UnorderedGroup_4__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MOSSwInterface__UnorderedGroup_4__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalOSSWI

    // Delegated rules

    public final boolean synpred46_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalOSSWI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalOSSWI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalOSSWI_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000340000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008800000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000400000040B0F0L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00006D0008000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00006D0000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000400000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00006D0000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000400000000B0B0L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000080L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000340000002L});
    }


}