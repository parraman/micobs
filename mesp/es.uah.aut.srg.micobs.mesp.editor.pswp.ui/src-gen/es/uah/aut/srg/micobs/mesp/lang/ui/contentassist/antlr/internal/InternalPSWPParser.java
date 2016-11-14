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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'('", "')'", "'pswpackage'", "'{'", "'}'", "'version'", "':='", "'supported'", "'platform'", "'construction'", "'tools'", "','", "'osswpackages'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPSWPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPSWPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPSWPParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPSWP.g"; }


     
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
    // InternalPSWP.g:61:1: entryRuleMMESPPSWPPackageFile : ruleMMESPPSWPPackageFile EOF ;
    public final void entryRuleMMESPPSWPPackageFile() throws RecognitionException {
        try {
            // InternalPSWP.g:62:1: ( ruleMMESPPSWPPackageFile EOF )
            // InternalPSWP.g:63:1: ruleMMESPPSWPPackageFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMMESPPSWPPackageFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageFileRule()); 
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
    // $ANTLR end "entryRuleMMESPPSWPPackageFile"


    // $ANTLR start "ruleMMESPPSWPPackageFile"
    // InternalPSWP.g:70:1: ruleMMESPPSWPPackageFile : ( ( rule__MMESPPSWPPackageFile__Group__0 ) ) ;
    public final void ruleMMESPPSWPPackageFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:74:2: ( ( ( rule__MMESPPSWPPackageFile__Group__0 ) ) )
            // InternalPSWP.g:75:1: ( ( rule__MMESPPSWPPackageFile__Group__0 ) )
            {
            // InternalPSWP.g:75:1: ( ( rule__MMESPPSWPPackageFile__Group__0 ) )
            // InternalPSWP.g:76:1: ( rule__MMESPPSWPPackageFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup()); 
            }
            // InternalPSWP.g:77:1: ( rule__MMESPPSWPPackageFile__Group__0 )
            // InternalPSWP.g:77:2: rule__MMESPPSWPPackageFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:89:1: entryRuleMMESPPSWPPackageElement : ruleMMESPPSWPPackageElement EOF ;
    public final void entryRuleMMESPPSWPPackageElement() throws RecognitionException {
        try {
            // InternalPSWP.g:90:1: ( ruleMMESPPSWPPackageElement EOF )
            // InternalPSWP.g:91:1: ruleMMESPPSWPPackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMMESPPSWPPackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMMESPPSWPPackageElementRule()); 
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
    // $ANTLR end "entryRuleMMESPPSWPPackageElement"


    // $ANTLR start "ruleMMESPPSWPPackageElement"
    // InternalPSWP.g:98:1: ruleMMESPPSWPPackageElement : ( ruleMPlatformSwPackage ) ;
    public final void ruleMMESPPSWPPackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:102:2: ( ( ruleMPlatformSwPackage ) )
            // InternalPSWP.g:103:1: ( ruleMPlatformSwPackage )
            {
            // InternalPSWP.g:103:1: ( ruleMPlatformSwPackage )
            // InternalPSWP.g:104:1: ruleMPlatformSwPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageElementAccess().getMPlatformSwPackageParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalPSWP.g:118:1: ( ruleQualifiedName EOF )
            // InternalPSWP.g:119:1: ruleQualifiedName EOF
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
    // InternalPSWP.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalPSWP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalPSWP.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalPSWP.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalPSWP.g:133:1: ( rule__QualifiedName__Group__0 )
            // InternalPSWP.g:133:2: rule__QualifiedName__Group__0
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
    // InternalPSWP.g:145:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalPSWP.g:146:1: ( ruleVersion EOF )
            // InternalPSWP.g:147:1: ruleVersion EOF
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
    // InternalPSWP.g:154:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:158:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalPSWP.g:159:1: ( ( rule__Version__Group__0 ) )
            {
            // InternalPSWP.g:159:1: ( ( rule__Version__Group__0 ) )
            // InternalPSWP.g:160:1: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalPSWP.g:161:1: ( rule__Version__Group__0 )
            // InternalPSWP.g:161:2: rule__Version__Group__0
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
    // InternalPSWP.g:173:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalPSWP.g:174:1: ( ruleVersionedQualifiedName EOF )
            // InternalPSWP.g:175:1: ruleVersionedQualifiedName EOF
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
    // InternalPSWP.g:182:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:186:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalPSWP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalPSWP.g:187:1: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalPSWP.g:188:1: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalPSWP.g:189:1: ( rule__VersionedQualifiedName__Group__0 )
            // InternalPSWP.g:189:2: rule__VersionedQualifiedName__Group__0
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


    // $ANTLR start "entryRuleMPlatformSwPackage"
    // InternalPSWP.g:203:1: entryRuleMPlatformSwPackage : ruleMPlatformSwPackage EOF ;
    public final void entryRuleMPlatformSwPackage() throws RecognitionException {
        try {
            // InternalPSWP.g:204:1: ( ruleMPlatformSwPackage EOF )
            // InternalPSWP.g:205:1: ruleMPlatformSwPackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMPlatformSwPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageRule()); 
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
    // $ANTLR end "entryRuleMPlatformSwPackage"


    // $ANTLR start "ruleMPlatformSwPackage"
    // InternalPSWP.g:212:1: ruleMPlatformSwPackage : ( ( rule__MPlatformSwPackage__Group__0 ) ) ;
    public final void ruleMPlatformSwPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:216:2: ( ( ( rule__MPlatformSwPackage__Group__0 ) ) )
            // InternalPSWP.g:217:1: ( ( rule__MPlatformSwPackage__Group__0 ) )
            {
            // InternalPSWP.g:217:1: ( ( rule__MPlatformSwPackage__Group__0 ) )
            // InternalPSWP.g:218:1: ( rule__MPlatformSwPackage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getGroup()); 
            }
            // InternalPSWP.g:219:1: ( rule__MPlatformSwPackage__Group__0 )
            // InternalPSWP.g:219:2: rule__MPlatformSwPackage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:231:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:235:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
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
                    // InternalPSWP.g:236:1: ( RULE_INT )
                    {
                    // InternalPSWP.g:236:1: ( RULE_INT )
                    // InternalPSWP.g:237:1: RULE_INT
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
                    // InternalPSWP.g:242:6: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalPSWP.g:242:6: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalPSWP.g:243:1: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalPSWP.g:244:1: ( rule__Version__Group_0_1__0 )
                    // InternalPSWP.g:244:2: rule__Version__Group_0_1__0
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
    // InternalPSWP.g:253:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:257:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
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
                    // InternalPSWP.g:258:1: ( RULE_INT )
                    {
                    // InternalPSWP.g:258:1: ( RULE_INT )
                    // InternalPSWP.g:259:1: RULE_INT
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
                    // InternalPSWP.g:264:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalPSWP.g:264:6: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalPSWP.g:265:1: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalPSWP.g:266:1: ( rule__Version__Group_1_1_1__0 )
                    // InternalPSWP.g:266:2: rule__Version__Group_1_1_1__0
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


    // $ANTLR start "rule__MMESPPSWPPackageFile__Group__0"
    // InternalPSWP.g:277:1: rule__MMESPPSWPPackageFile__Group__0 : rule__MMESPPSWPPackageFile__Group__0__Impl rule__MMESPPSWPPackageFile__Group__1 ;
    public final void rule__MMESPPSWPPackageFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:281:1: ( rule__MMESPPSWPPackageFile__Group__0__Impl rule__MMESPPSWPPackageFile__Group__1 )
            // InternalPSWP.g:282:2: rule__MMESPPSWPPackageFile__Group__0__Impl rule__MMESPPSWPPackageFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MMESPPSWPPackageFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:289:1: rule__MMESPPSWPPackageFile__Group__0__Impl : ( 'package' ) ;
    public final void rule__MMESPPSWPPackageFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:293:1: ( ( 'package' ) )
            // InternalPSWP.g:294:1: ( 'package' )
            {
            // InternalPSWP.g:294:1: ( 'package' )
            // InternalPSWP.g:295:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageKeyword_0()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:308:1: rule__MMESPPSWPPackageFile__Group__1 : rule__MMESPPSWPPackageFile__Group__1__Impl rule__MMESPPSWPPackageFile__Group__2 ;
    public final void rule__MMESPPSWPPackageFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:312:1: ( rule__MMESPPSWPPackageFile__Group__1__Impl rule__MMESPPSWPPackageFile__Group__2 )
            // InternalPSWP.g:313:2: rule__MMESPPSWPPackageFile__Group__1__Impl rule__MMESPPSWPPackageFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MMESPPSWPPackageFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:320:1: rule__MMESPPSWPPackageFile__Group__1__Impl : ( ( rule__MMESPPSWPPackageFile__PackageAssignment_1 ) ) ;
    public final void rule__MMESPPSWPPackageFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:324:1: ( ( ( rule__MMESPPSWPPackageFile__PackageAssignment_1 ) ) )
            // InternalPSWP.g:325:1: ( ( rule__MMESPPSWPPackageFile__PackageAssignment_1 ) )
            {
            // InternalPSWP.g:325:1: ( ( rule__MMESPPSWPPackageFile__PackageAssignment_1 ) )
            // InternalPSWP.g:326:1: ( rule__MMESPPSWPPackageFile__PackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageAssignment_1()); 
            }
            // InternalPSWP.g:327:1: ( rule__MMESPPSWPPackageFile__PackageAssignment_1 )
            // InternalPSWP.g:327:2: rule__MMESPPSWPPackageFile__PackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:337:1: rule__MMESPPSWPPackageFile__Group__2 : rule__MMESPPSWPPackageFile__Group__2__Impl rule__MMESPPSWPPackageFile__Group__3 ;
    public final void rule__MMESPPSWPPackageFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:341:1: ( rule__MMESPPSWPPackageFile__Group__2__Impl rule__MMESPPSWPPackageFile__Group__3 )
            // InternalPSWP.g:342:2: rule__MMESPPSWPPackageFile__Group__2__Impl rule__MMESPPSWPPackageFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MMESPPSWPPackageFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:349:1: rule__MMESPPSWPPackageFile__Group__2__Impl : ( ';' ) ;
    public final void rule__MMESPPSWPPackageFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:353:1: ( ( ';' ) )
            // InternalPSWP.g:354:1: ( ';' )
            {
            // InternalPSWP.g:354:1: ( ';' )
            // InternalPSWP.g:355:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:368:1: rule__MMESPPSWPPackageFile__Group__3 : rule__MMESPPSWPPackageFile__Group__3__Impl rule__MMESPPSWPPackageFile__Group__4 ;
    public final void rule__MMESPPSWPPackageFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:372:1: ( rule__MMESPPSWPPackageFile__Group__3__Impl rule__MMESPPSWPPackageFile__Group__4 )
            // InternalPSWP.g:373:2: rule__MMESPPSWPPackageFile__Group__3__Impl rule__MMESPPSWPPackageFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MMESPPSWPPackageFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:380:1: rule__MMESPPSWPPackageFile__Group__3__Impl : ( ( rule__MMESPPSWPPackageFile__Group_3__0 )* ) ;
    public final void rule__MMESPPSWPPackageFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:384:1: ( ( ( rule__MMESPPSWPPackageFile__Group_3__0 )* ) )
            // InternalPSWP.g:385:1: ( ( rule__MMESPPSWPPackageFile__Group_3__0 )* )
            {
            // InternalPSWP.g:385:1: ( ( rule__MMESPPSWPPackageFile__Group_3__0 )* )
            // InternalPSWP.g:386:1: ( rule__MMESPPSWPPackageFile__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup_3()); 
            }
            // InternalPSWP.g:387:1: ( rule__MMESPPSWPPackageFile__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPSWP.g:387:2: rule__MMESPPSWPPackageFile__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalPSWP.g:397:1: rule__MMESPPSWPPackageFile__Group__4 : rule__MMESPPSWPPackageFile__Group__4__Impl ;
    public final void rule__MMESPPSWPPackageFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:401:1: ( rule__MMESPPSWPPackageFile__Group__4__Impl )
            // InternalPSWP.g:402:2: rule__MMESPPSWPPackageFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:408:1: rule__MMESPPSWPPackageFile__Group__4__Impl : ( ( rule__MMESPPSWPPackageFile__ElementAssignment_4 ) ) ;
    public final void rule__MMESPPSWPPackageFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:412:1: ( ( ( rule__MMESPPSWPPackageFile__ElementAssignment_4 ) ) )
            // InternalPSWP.g:413:1: ( ( rule__MMESPPSWPPackageFile__ElementAssignment_4 ) )
            {
            // InternalPSWP.g:413:1: ( ( rule__MMESPPSWPPackageFile__ElementAssignment_4 ) )
            // InternalPSWP.g:414:1: ( rule__MMESPPSWPPackageFile__ElementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getElementAssignment_4()); 
            }
            // InternalPSWP.g:415:1: ( rule__MMESPPSWPPackageFile__ElementAssignment_4 )
            // InternalPSWP.g:415:2: rule__MMESPPSWPPackageFile__ElementAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:435:1: rule__MMESPPSWPPackageFile__Group_3__0 : rule__MMESPPSWPPackageFile__Group_3__0__Impl rule__MMESPPSWPPackageFile__Group_3__1 ;
    public final void rule__MMESPPSWPPackageFile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:439:1: ( rule__MMESPPSWPPackageFile__Group_3__0__Impl rule__MMESPPSWPPackageFile__Group_3__1 )
            // InternalPSWP.g:440:2: rule__MMESPPSWPPackageFile__Group_3__0__Impl rule__MMESPPSWPPackageFile__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MMESPPSWPPackageFile__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:447:1: rule__MMESPPSWPPackageFile__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__MMESPPSWPPackageFile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:451:1: ( ( 'import' ) )
            // InternalPSWP.g:452:1: ( 'import' )
            {
            // InternalPSWP.g:452:1: ( 'import' )
            // InternalPSWP.g:453:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportKeyword_3_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:466:1: rule__MMESPPSWPPackageFile__Group_3__1 : rule__MMESPPSWPPackageFile__Group_3__1__Impl rule__MMESPPSWPPackageFile__Group_3__2 ;
    public final void rule__MMESPPSWPPackageFile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:470:1: ( rule__MMESPPSWPPackageFile__Group_3__1__Impl rule__MMESPPSWPPackageFile__Group_3__2 )
            // InternalPSWP.g:471:2: rule__MMESPPSWPPackageFile__Group_3__1__Impl rule__MMESPPSWPPackageFile__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MMESPPSWPPackageFile__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:478:1: rule__MMESPPSWPPackageFile__Group_3__1__Impl : ( ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 ) ) ;
    public final void rule__MMESPPSWPPackageFile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:482:1: ( ( ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 ) ) )
            // InternalPSWP.g:483:1: ( ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 ) )
            {
            // InternalPSWP.g:483:1: ( ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 ) )
            // InternalPSWP.g:484:1: ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsAssignment_3_1()); 
            }
            // InternalPSWP.g:485:1: ( rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 )
            // InternalPSWP.g:485:2: rule__MMESPPSWPPackageFile__ImportsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:495:1: rule__MMESPPSWPPackageFile__Group_3__2 : rule__MMESPPSWPPackageFile__Group_3__2__Impl ;
    public final void rule__MMESPPSWPPackageFile__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:499:1: ( rule__MMESPPSWPPackageFile__Group_3__2__Impl )
            // InternalPSWP.g:500:2: rule__MMESPPSWPPackageFile__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:506:1: rule__MMESPPSWPPackageFile__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MMESPPSWPPackageFile__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:510:1: ( ( ';' ) )
            // InternalPSWP.g:511:1: ( ';' )
            {
            // InternalPSWP.g:511:1: ( ';' )
            // InternalPSWP.g:512:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:531:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:535:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalPSWP.g:536:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalPSWP.g:543:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:547:1: ( ( RULE_ID ) )
            // InternalPSWP.g:548:1: ( RULE_ID )
            {
            // InternalPSWP.g:548:1: ( RULE_ID )
            // InternalPSWP.g:549:1: RULE_ID
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
    // InternalPSWP.g:560:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:564:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalPSWP.g:565:2: rule__QualifiedName__Group__1__Impl
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
    // InternalPSWP.g:571:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:575:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalPSWP.g:576:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalPSWP.g:576:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalPSWP.g:577:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalPSWP.g:578:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPSWP.g:578:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalPSWP.g:592:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:596:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalPSWP.g:597:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalPSWP.g:604:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:608:1: ( ( '.' ) )
            // InternalPSWP.g:609:1: ( '.' )
            {
            // InternalPSWP.g:609:1: ( '.' )
            // InternalPSWP.g:610:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:623:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:627:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalPSWP.g:628:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalPSWP.g:634:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:638:1: ( ( RULE_ID ) )
            // InternalPSWP.g:639:1: ( RULE_ID )
            {
            // InternalPSWP.g:639:1: ( RULE_ID )
            // InternalPSWP.g:640:1: RULE_ID
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
    // InternalPSWP.g:655:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:659:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalPSWP.g:660:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // InternalPSWP.g:667:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:671:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalPSWP.g:672:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalPSWP.g:672:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalPSWP.g:673:1: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalPSWP.g:674:1: ( rule__Version__Alternatives_0 )
            // InternalPSWP.g:674:2: rule__Version__Alternatives_0
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
    // InternalPSWP.g:684:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:688:1: ( rule__Version__Group__1__Impl )
            // InternalPSWP.g:689:2: rule__Version__Group__1__Impl
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
    // InternalPSWP.g:695:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:699:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalPSWP.g:700:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalPSWP.g:700:1: ( ( rule__Version__Group_1__0 )* )
            // InternalPSWP.g:701:1: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalPSWP.g:702:1: ( rule__Version__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPSWP.g:702:2: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalPSWP.g:716:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:720:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalPSWP.g:721:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // InternalPSWP.g:728:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:732:1: ( ( ( RULE_INT )? ) )
            // InternalPSWP.g:733:1: ( ( RULE_INT )? )
            {
            // InternalPSWP.g:733:1: ( ( RULE_INT )? )
            // InternalPSWP.g:734:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalPSWP.g:735:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPSWP.g:735:3: RULE_INT
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
    // InternalPSWP.g:745:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:749:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalPSWP.g:750:2: rule__Version__Group_0_1__1__Impl
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
    // InternalPSWP.g:756:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:760:1: ( ( RULE_ID ) )
            // InternalPSWP.g:761:1: ( RULE_ID )
            {
            // InternalPSWP.g:761:1: ( RULE_ID )
            // InternalPSWP.g:762:1: RULE_ID
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
    // InternalPSWP.g:777:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:781:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalPSWP.g:782:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // InternalPSWP.g:789:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:793:1: ( ( '.' ) )
            // InternalPSWP.g:794:1: ( '.' )
            {
            // InternalPSWP.g:794:1: ( '.' )
            // InternalPSWP.g:795:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:808:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:812:1: ( rule__Version__Group_1__1__Impl )
            // InternalPSWP.g:813:2: rule__Version__Group_1__1__Impl
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
    // InternalPSWP.g:819:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:823:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalPSWP.g:824:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalPSWP.g:824:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalPSWP.g:825:1: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalPSWP.g:826:1: ( rule__Version__Alternatives_1_1 )
            // InternalPSWP.g:826:2: rule__Version__Alternatives_1_1
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
    // InternalPSWP.g:840:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:844:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalPSWP.g:845:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // InternalPSWP.g:852:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:856:1: ( ( ( RULE_INT )? ) )
            // InternalPSWP.g:857:1: ( ( RULE_INT )? )
            {
            // InternalPSWP.g:857:1: ( ( RULE_INT )? )
            // InternalPSWP.g:858:1: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalPSWP.g:859:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPSWP.g:859:3: RULE_INT
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
    // InternalPSWP.g:869:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:873:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalPSWP.g:874:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalPSWP.g:880:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:884:1: ( ( RULE_ID ) )
            // InternalPSWP.g:885:1: ( RULE_ID )
            {
            // InternalPSWP.g:885:1: ( RULE_ID )
            // InternalPSWP.g:886:1: RULE_ID
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
    // InternalPSWP.g:901:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:905:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalPSWP.g:906:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
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
    // InternalPSWP.g:913:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:917:1: ( ( ruleQualifiedName ) )
            // InternalPSWP.g:918:1: ( ruleQualifiedName )
            {
            // InternalPSWP.g:918:1: ( ruleQualifiedName )
            // InternalPSWP.g:919:1: ruleQualifiedName
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
    // InternalPSWP.g:930:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:934:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalPSWP.g:935:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // InternalPSWP.g:942:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:946:1: ( ( '(' ) )
            // InternalPSWP.g:947:1: ( '(' )
            {
            // InternalPSWP.g:947:1: ( '(' )
            // InternalPSWP.g:948:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:961:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:965:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalPSWP.g:966:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
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
    // InternalPSWP.g:973:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:977:1: ( ( ruleVersion ) )
            // InternalPSWP.g:978:1: ( ruleVersion )
            {
            // InternalPSWP.g:978:1: ( ruleVersion )
            // InternalPSWP.g:979:1: ruleVersion
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
    // InternalPSWP.g:990:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:994:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalPSWP.g:995:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalPSWP.g:1001:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1005:1: ( ( ')' ) )
            // InternalPSWP.g:1006:1: ( ')' )
            {
            // InternalPSWP.g:1006:1: ( ')' )
            // InternalPSWP.g:1007:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1031:1: rule__MPlatformSwPackage__Group__0 : rule__MPlatformSwPackage__Group__0__Impl rule__MPlatformSwPackage__Group__1 ;
    public final void rule__MPlatformSwPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1035:1: ( rule__MPlatformSwPackage__Group__0__Impl rule__MPlatformSwPackage__Group__1 )
            // InternalPSWP.g:1036:2: rule__MPlatformSwPackage__Group__0__Impl rule__MPlatformSwPackage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MPlatformSwPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1043:1: rule__MPlatformSwPackage__Group__0__Impl : ( 'pswpackage' ) ;
    public final void rule__MPlatformSwPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1047:1: ( ( 'pswpackage' ) )
            // InternalPSWP.g:1048:1: ( 'pswpackage' )
            {
            // InternalPSWP.g:1048:1: ( 'pswpackage' )
            // InternalPSWP.g:1049:1: 'pswpackage'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getPswpackageKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1062:1: rule__MPlatformSwPackage__Group__1 : rule__MPlatformSwPackage__Group__1__Impl rule__MPlatformSwPackage__Group__2 ;
    public final void rule__MPlatformSwPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1066:1: ( rule__MPlatformSwPackage__Group__1__Impl rule__MPlatformSwPackage__Group__2 )
            // InternalPSWP.g:1067:2: rule__MPlatformSwPackage__Group__1__Impl rule__MPlatformSwPackage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__MPlatformSwPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1074:1: rule__MPlatformSwPackage__Group__1__Impl : ( ( rule__MPlatformSwPackage__NameAssignment_1 ) ) ;
    public final void rule__MPlatformSwPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1078:1: ( ( ( rule__MPlatformSwPackage__NameAssignment_1 ) ) )
            // InternalPSWP.g:1079:1: ( ( rule__MPlatformSwPackage__NameAssignment_1 ) )
            {
            // InternalPSWP.g:1079:1: ( ( rule__MPlatformSwPackage__NameAssignment_1 ) )
            // InternalPSWP.g:1080:1: ( rule__MPlatformSwPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getNameAssignment_1()); 
            }
            // InternalPSWP.g:1081:1: ( rule__MPlatformSwPackage__NameAssignment_1 )
            // InternalPSWP.g:1081:2: rule__MPlatformSwPackage__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1091:1: rule__MPlatformSwPackage__Group__2 : rule__MPlatformSwPackage__Group__2__Impl rule__MPlatformSwPackage__Group__3 ;
    public final void rule__MPlatformSwPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1095:1: ( rule__MPlatformSwPackage__Group__2__Impl rule__MPlatformSwPackage__Group__3 )
            // InternalPSWP.g:1096:2: rule__MPlatformSwPackage__Group__2__Impl rule__MPlatformSwPackage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__MPlatformSwPackage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1103:1: rule__MPlatformSwPackage__Group__2__Impl : ( '{' ) ;
    public final void rule__MPlatformSwPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1107:1: ( ( '{' ) )
            // InternalPSWP.g:1108:1: ( '{' )
            {
            // InternalPSWP.g:1108:1: ( '{' )
            // InternalPSWP.g:1109:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1122:1: rule__MPlatformSwPackage__Group__3 : rule__MPlatformSwPackage__Group__3__Impl rule__MPlatformSwPackage__Group__4 ;
    public final void rule__MPlatformSwPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1126:1: ( rule__MPlatformSwPackage__Group__3__Impl rule__MPlatformSwPackage__Group__4 )
            // InternalPSWP.g:1127:2: rule__MPlatformSwPackage__Group__3__Impl rule__MPlatformSwPackage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__MPlatformSwPackage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1134:1: rule__MPlatformSwPackage__Group__3__Impl : ( ( rule__MPlatformSwPackage__UnorderedGroup_3 ) ) ;
    public final void rule__MPlatformSwPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1138:1: ( ( ( rule__MPlatformSwPackage__UnorderedGroup_3 ) ) )
            // InternalPSWP.g:1139:1: ( ( rule__MPlatformSwPackage__UnorderedGroup_3 ) )
            {
            // InternalPSWP.g:1139:1: ( ( rule__MPlatformSwPackage__UnorderedGroup_3 ) )
            // InternalPSWP.g:1140:1: ( rule__MPlatformSwPackage__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()); 
            }
            // InternalPSWP.g:1141:1: ( rule__MPlatformSwPackage__UnorderedGroup_3 )
            // InternalPSWP.g:1141:2: rule__MPlatformSwPackage__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1151:1: rule__MPlatformSwPackage__Group__4 : rule__MPlatformSwPackage__Group__4__Impl rule__MPlatformSwPackage__Group__5 ;
    public final void rule__MPlatformSwPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1155:1: ( rule__MPlatformSwPackage__Group__4__Impl rule__MPlatformSwPackage__Group__5 )
            // InternalPSWP.g:1156:2: rule__MPlatformSwPackage__Group__4__Impl rule__MPlatformSwPackage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MPlatformSwPackage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1163:1: rule__MPlatformSwPackage__Group__4__Impl : ( '}' ) ;
    public final void rule__MPlatformSwPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1167:1: ( ( '}' ) )
            // InternalPSWP.g:1168:1: ( '}' )
            {
            // InternalPSWP.g:1168:1: ( '}' )
            // InternalPSWP.g:1169:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1182:1: rule__MPlatformSwPackage__Group__5 : rule__MPlatformSwPackage__Group__5__Impl ;
    public final void rule__MPlatformSwPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1186:1: ( rule__MPlatformSwPackage__Group__5__Impl )
            // InternalPSWP.g:1187:2: rule__MPlatformSwPackage__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1193:1: rule__MPlatformSwPackage__Group__5__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1197:1: ( ( ';' ) )
            // InternalPSWP.g:1198:1: ( ';' )
            {
            // InternalPSWP.g:1198:1: ( ';' )
            // InternalPSWP.g:1199:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_5()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1224:1: rule__MPlatformSwPackage__Group_3_0__0 : rule__MPlatformSwPackage__Group_3_0__0__Impl rule__MPlatformSwPackage__Group_3_0__1 ;
    public final void rule__MPlatformSwPackage__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1228:1: ( rule__MPlatformSwPackage__Group_3_0__0__Impl rule__MPlatformSwPackage__Group_3_0__1 )
            // InternalPSWP.g:1229:2: rule__MPlatformSwPackage__Group_3_0__0__Impl rule__MPlatformSwPackage__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__MPlatformSwPackage__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1236:1: rule__MPlatformSwPackage__Group_3_0__0__Impl : ( 'version' ) ;
    public final void rule__MPlatformSwPackage__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1240:1: ( ( 'version' ) )
            // InternalPSWP.g:1241:1: ( 'version' )
            {
            // InternalPSWP.g:1241:1: ( 'version' )
            // InternalPSWP.g:1242:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getVersionKeyword_3_0_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1255:1: rule__MPlatformSwPackage__Group_3_0__1 : rule__MPlatformSwPackage__Group_3_0__1__Impl rule__MPlatformSwPackage__Group_3_0__2 ;
    public final void rule__MPlatformSwPackage__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1259:1: ( rule__MPlatformSwPackage__Group_3_0__1__Impl rule__MPlatformSwPackage__Group_3_0__2 )
            // InternalPSWP.g:1260:2: rule__MPlatformSwPackage__Group_3_0__1__Impl rule__MPlatformSwPackage__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__MPlatformSwPackage__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1267:1: rule__MPlatformSwPackage__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__MPlatformSwPackage__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1271:1: ( ( ':=' ) )
            // InternalPSWP.g:1272:1: ( ':=' )
            {
            // InternalPSWP.g:1272:1: ( ':=' )
            // InternalPSWP.g:1273:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1286:1: rule__MPlatformSwPackage__Group_3_0__2 : rule__MPlatformSwPackage__Group_3_0__2__Impl rule__MPlatformSwPackage__Group_3_0__3 ;
    public final void rule__MPlatformSwPackage__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1290:1: ( rule__MPlatformSwPackage__Group_3_0__2__Impl rule__MPlatformSwPackage__Group_3_0__3 )
            // InternalPSWP.g:1291:2: rule__MPlatformSwPackage__Group_3_0__2__Impl rule__MPlatformSwPackage__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MPlatformSwPackage__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1298:1: rule__MPlatformSwPackage__Group_3_0__2__Impl : ( ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1302:1: ( ( ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 ) ) )
            // InternalPSWP.g:1303:1: ( ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 ) )
            {
            // InternalPSWP.g:1303:1: ( ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 ) )
            // InternalPSWP.g:1304:1: ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getVersionAssignment_3_0_2()); 
            }
            // InternalPSWP.g:1305:1: ( rule__MPlatformSwPackage__VersionAssignment_3_0_2 )
            // InternalPSWP.g:1305:2: rule__MPlatformSwPackage__VersionAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1315:1: rule__MPlatformSwPackage__Group_3_0__3 : rule__MPlatformSwPackage__Group_3_0__3__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1319:1: ( rule__MPlatformSwPackage__Group_3_0__3__Impl )
            // InternalPSWP.g:1320:2: rule__MPlatformSwPackage__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1326:1: rule__MPlatformSwPackage__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1330:1: ( ( ';' ) )
            // InternalPSWP.g:1331:1: ( ';' )
            {
            // InternalPSWP.g:1331:1: ( ';' )
            // InternalPSWP.g:1332:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1353:1: rule__MPlatformSwPackage__Group_3_1__0 : rule__MPlatformSwPackage__Group_3_1__0__Impl rule__MPlatformSwPackage__Group_3_1__1 ;
    public final void rule__MPlatformSwPackage__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1357:1: ( rule__MPlatformSwPackage__Group_3_1__0__Impl rule__MPlatformSwPackage__Group_3_1__1 )
            // InternalPSWP.g:1358:2: rule__MPlatformSwPackage__Group_3_1__0__Impl rule__MPlatformSwPackage__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__MPlatformSwPackage__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1365:1: rule__MPlatformSwPackage__Group_3_1__0__Impl : ( 'supported' ) ;
    public final void rule__MPlatformSwPackage__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1369:1: ( ( 'supported' ) )
            // InternalPSWP.g:1370:1: ( 'supported' )
            {
            // InternalPSWP.g:1370:1: ( 'supported' )
            // InternalPSWP.g:1371:1: 'supported'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSupportedKeyword_3_1_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getSupportedKeyword_3_1_0()); 
            }

            }


            }

        }
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
    // InternalPSWP.g:1384:1: rule__MPlatformSwPackage__Group_3_1__1 : rule__MPlatformSwPackage__Group_3_1__1__Impl rule__MPlatformSwPackage__Group_3_1__2 ;
    public final void rule__MPlatformSwPackage__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1388:1: ( rule__MPlatformSwPackage__Group_3_1__1__Impl rule__MPlatformSwPackage__Group_3_1__2 )
            // InternalPSWP.g:1389:2: rule__MPlatformSwPackage__Group_3_1__1__Impl rule__MPlatformSwPackage__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__MPlatformSwPackage__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1396:1: rule__MPlatformSwPackage__Group_3_1__1__Impl : ( 'platform' ) ;
    public final void rule__MPlatformSwPackage__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1400:1: ( ( 'platform' ) )
            // InternalPSWP.g:1401:1: ( 'platform' )
            {
            // InternalPSWP.g:1401:1: ( 'platform' )
            // InternalPSWP.g:1402:1: 'platform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getPlatformKeyword_3_1_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getPlatformKeyword_3_1_1()); 
            }

            }


            }

        }
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
    // InternalPSWP.g:1415:1: rule__MPlatformSwPackage__Group_3_1__2 : rule__MPlatformSwPackage__Group_3_1__2__Impl rule__MPlatformSwPackage__Group_3_1__3 ;
    public final void rule__MPlatformSwPackage__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1419:1: ( rule__MPlatformSwPackage__Group_3_1__2__Impl rule__MPlatformSwPackage__Group_3_1__3 )
            // InternalPSWP.g:1420:2: rule__MPlatformSwPackage__Group_3_1__2__Impl rule__MPlatformSwPackage__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MPlatformSwPackage__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1427:1: rule__MPlatformSwPackage__Group_3_1__2__Impl : ( ':=' ) ;
    public final void rule__MPlatformSwPackage__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1431:1: ( ( ':=' ) )
            // InternalPSWP.g:1432:1: ( ':=' )
            {
            // InternalPSWP.g:1432:1: ( ':=' )
            // InternalPSWP.g:1433:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_1_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_1_2()); 
            }

            }


            }

        }
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
    // InternalPSWP.g:1446:1: rule__MPlatformSwPackage__Group_3_1__3 : rule__MPlatformSwPackage__Group_3_1__3__Impl rule__MPlatformSwPackage__Group_3_1__4 ;
    public final void rule__MPlatformSwPackage__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1450:1: ( rule__MPlatformSwPackage__Group_3_1__3__Impl rule__MPlatformSwPackage__Group_3_1__4 )
            // InternalPSWP.g:1451:2: rule__MPlatformSwPackage__Group_3_1__3__Impl rule__MPlatformSwPackage__Group_3_1__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__MPlatformSwPackage__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MPlatformSwPackage__Group_3_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPSWP.g:1458:1: rule__MPlatformSwPackage__Group_3_1__3__Impl : ( ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1462:1: ( ( ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3 ) ) )
            // InternalPSWP.g:1463:1: ( ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3 ) )
            {
            // InternalPSWP.g:1463:1: ( ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3 ) )
            // InternalPSWP.g:1464:1: ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementAssignment_3_1_3()); 
            }
            // InternalPSWP.g:1465:1: ( rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3 )
            // InternalPSWP.g:1465:2: rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementAssignment_3_1_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__4"
    // InternalPSWP.g:1475:1: rule__MPlatformSwPackage__Group_3_1__4 : rule__MPlatformSwPackage__Group_3_1__4__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1479:1: ( rule__MPlatformSwPackage__Group_3_1__4__Impl )
            // InternalPSWP.g:1480:2: rule__MPlatformSwPackage__Group_3_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MPlatformSwPackage__Group_3_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__4"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_1__4__Impl"
    // InternalPSWP.g:1486:1: rule__MPlatformSwPackage__Group_3_1__4__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1490:1: ( ( ';' ) )
            // InternalPSWP.g:1491:1: ( ';' )
            {
            // InternalPSWP.g:1491:1: ( ';' )
            // InternalPSWP.g:1492:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_1_4()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_1__4__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__0"
    // InternalPSWP.g:1515:1: rule__MPlatformSwPackage__Group_3_2__0 : rule__MPlatformSwPackage__Group_3_2__0__Impl rule__MPlatformSwPackage__Group_3_2__1 ;
    public final void rule__MPlatformSwPackage__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1519:1: ( rule__MPlatformSwPackage__Group_3_2__0__Impl rule__MPlatformSwPackage__Group_3_2__1 )
            // InternalPSWP.g:1520:2: rule__MPlatformSwPackage__Group_3_2__0__Impl rule__MPlatformSwPackage__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MPlatformSwPackage__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1527:1: rule__MPlatformSwPackage__Group_3_2__0__Impl : ( 'construction' ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1531:1: ( ( 'construction' ) )
            // InternalPSWP.g:1532:1: ( 'construction' )
            {
            // InternalPSWP.g:1532:1: ( 'construction' )
            // InternalPSWP.g:1533:1: 'construction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getConstructionKeyword_3_2_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getConstructionKeyword_3_2_0()); 
            }

            }


            }

        }
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
    // InternalPSWP.g:1546:1: rule__MPlatformSwPackage__Group_3_2__1 : rule__MPlatformSwPackage__Group_3_2__1__Impl rule__MPlatformSwPackage__Group_3_2__2 ;
    public final void rule__MPlatformSwPackage__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1550:1: ( rule__MPlatformSwPackage__Group_3_2__1__Impl rule__MPlatformSwPackage__Group_3_2__2 )
            // InternalPSWP.g:1551:2: rule__MPlatformSwPackage__Group_3_2__1__Impl rule__MPlatformSwPackage__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__MPlatformSwPackage__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1558:1: rule__MPlatformSwPackage__Group_3_2__1__Impl : ( 'tools' ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1562:1: ( ( 'tools' ) )
            // InternalPSWP.g:1563:1: ( 'tools' )
            {
            // InternalPSWP.g:1563:1: ( 'tools' )
            // InternalPSWP.g:1564:1: 'tools'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getToolsKeyword_3_2_1()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getToolsKeyword_3_2_1()); 
            }

            }


            }

        }
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
    // InternalPSWP.g:1577:1: rule__MPlatformSwPackage__Group_3_2__2 : rule__MPlatformSwPackage__Group_3_2__2__Impl rule__MPlatformSwPackage__Group_3_2__3 ;
    public final void rule__MPlatformSwPackage__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1581:1: ( rule__MPlatformSwPackage__Group_3_2__2__Impl rule__MPlatformSwPackage__Group_3_2__3 )
            // InternalPSWP.g:1582:2: rule__MPlatformSwPackage__Group_3_2__2__Impl rule__MPlatformSwPackage__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MPlatformSwPackage__Group_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1589:1: rule__MPlatformSwPackage__Group_3_2__2__Impl : ( ':=' ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1593:1: ( ( ':=' ) )
            // InternalPSWP.g:1594:1: ( ':=' )
            {
            // InternalPSWP.g:1594:1: ( ':=' )
            // InternalPSWP.g:1595:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_2_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_2_2()); 
            }

            }


            }

        }
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
    // InternalPSWP.g:1608:1: rule__MPlatformSwPackage__Group_3_2__3 : rule__MPlatformSwPackage__Group_3_2__3__Impl rule__MPlatformSwPackage__Group_3_2__4 ;
    public final void rule__MPlatformSwPackage__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1612:1: ( rule__MPlatformSwPackage__Group_3_2__3__Impl rule__MPlatformSwPackage__Group_3_2__4 )
            // InternalPSWP.g:1613:2: rule__MPlatformSwPackage__Group_3_2__3__Impl rule__MPlatformSwPackage__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__MPlatformSwPackage__Group_3_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1620:1: rule__MPlatformSwPackage__Group_3_2__3__Impl : ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1624:1: ( ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3 ) ) )
            // InternalPSWP.g:1625:1: ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3 ) )
            {
            // InternalPSWP.g:1625:1: ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3 ) )
            // InternalPSWP.g:1626:1: ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_3()); 
            }
            // InternalPSWP.g:1627:1: ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_3 )
            // InternalPSWP.g:1627:2: rule__MPlatformSwPackage__CtoolsAssignment_3_2_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MPlatformSwPackage__CtoolsAssignment_3_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_3()); 
            }

            }


            }

        }
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
    // InternalPSWP.g:1637:1: rule__MPlatformSwPackage__Group_3_2__4 : rule__MPlatformSwPackage__Group_3_2__4__Impl rule__MPlatformSwPackage__Group_3_2__5 ;
    public final void rule__MPlatformSwPackage__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1641:1: ( rule__MPlatformSwPackage__Group_3_2__4__Impl rule__MPlatformSwPackage__Group_3_2__5 )
            // InternalPSWP.g:1642:2: rule__MPlatformSwPackage__Group_3_2__4__Impl rule__MPlatformSwPackage__Group_3_2__5
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__MPlatformSwPackage__Group_3_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MPlatformSwPackage__Group_3_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPSWP.g:1649:1: rule__MPlatformSwPackage__Group_3_2__4__Impl : ( ( rule__MPlatformSwPackage__Group_3_2_4__0 )* ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1653:1: ( ( ( rule__MPlatformSwPackage__Group_3_2_4__0 )* ) )
            // InternalPSWP.g:1654:1: ( ( rule__MPlatformSwPackage__Group_3_2_4__0 )* )
            {
            // InternalPSWP.g:1654:1: ( ( rule__MPlatformSwPackage__Group_3_2_4__0 )* )
            // InternalPSWP.g:1655:1: ( rule__MPlatformSwPackage__Group_3_2_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2_4()); 
            }
            // InternalPSWP.g:1656:1: ( rule__MPlatformSwPackage__Group_3_2_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPSWP.g:1656:2: rule__MPlatformSwPackage__Group_3_2_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__MPlatformSwPackage__Group_3_2_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__5"
    // InternalPSWP.g:1666:1: rule__MPlatformSwPackage__Group_3_2__5 : rule__MPlatformSwPackage__Group_3_2__5__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1670:1: ( rule__MPlatformSwPackage__Group_3_2__5__Impl )
            // InternalPSWP.g:1671:2: rule__MPlatformSwPackage__Group_3_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MPlatformSwPackage__Group_3_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__5"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2__5__Impl"
    // InternalPSWP.g:1677:1: rule__MPlatformSwPackage__Group_3_2__5__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group_3_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1681:1: ( ( ';' ) )
            // InternalPSWP.g:1682:1: ( ';' )
            {
            // InternalPSWP.g:1682:1: ( ';' )
            // InternalPSWP.g:1683:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_2_5()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2__5__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2_4__0"
    // InternalPSWP.g:1708:1: rule__MPlatformSwPackage__Group_3_2_4__0 : rule__MPlatformSwPackage__Group_3_2_4__0__Impl rule__MPlatformSwPackage__Group_3_2_4__1 ;
    public final void rule__MPlatformSwPackage__Group_3_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1712:1: ( rule__MPlatformSwPackage__Group_3_2_4__0__Impl rule__MPlatformSwPackage__Group_3_2_4__1 )
            // InternalPSWP.g:1713:2: rule__MPlatformSwPackage__Group_3_2_4__0__Impl rule__MPlatformSwPackage__Group_3_2_4__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MPlatformSwPackage__Group_3_2_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MPlatformSwPackage__Group_3_2_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2_4__0"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2_4__0__Impl"
    // InternalPSWP.g:1720:1: rule__MPlatformSwPackage__Group_3_2_4__0__Impl : ( ',' ) ;
    public final void rule__MPlatformSwPackage__Group_3_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1724:1: ( ( ',' ) )
            // InternalPSWP.g:1725:1: ( ',' )
            {
            // InternalPSWP.g:1725:1: ( ',' )
            // InternalPSWP.g:1726:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_2_4_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2_4__0__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2_4__1"
    // InternalPSWP.g:1739:1: rule__MPlatformSwPackage__Group_3_2_4__1 : rule__MPlatformSwPackage__Group_3_2_4__1__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1743:1: ( rule__MPlatformSwPackage__Group_3_2_4__1__Impl )
            // InternalPSWP.g:1744:2: rule__MPlatformSwPackage__Group_3_2_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MPlatformSwPackage__Group_3_2_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2_4__1"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_2_4__1__Impl"
    // InternalPSWP.g:1750:1: rule__MPlatformSwPackage__Group_3_2_4__1__Impl : ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1754:1: ( ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1 ) ) )
            // InternalPSWP.g:1755:1: ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1 ) )
            {
            // InternalPSWP.g:1755:1: ( ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1 ) )
            // InternalPSWP.g:1756:1: ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_4_1()); 
            }
            // InternalPSWP.g:1757:1: ( rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1 )
            // InternalPSWP.g:1757:2: rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__Group_3_2_4__1__Impl"


    // $ANTLR start "rule__MPlatformSwPackage__Group_3_3__0"
    // InternalPSWP.g:1771:1: rule__MPlatformSwPackage__Group_3_3__0 : rule__MPlatformSwPackage__Group_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3__1 ;
    public final void rule__MPlatformSwPackage__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1775:1: ( rule__MPlatformSwPackage__Group_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3__1 )
            // InternalPSWP.g:1776:2: rule__MPlatformSwPackage__Group_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__MPlatformSwPackage__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1783:1: rule__MPlatformSwPackage__Group_3_3__0__Impl : ( 'osswpackages' ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1787:1: ( ( 'osswpackages' ) )
            // InternalPSWP.g:1788:1: ( 'osswpackages' )
            {
            // InternalPSWP.g:1788:1: ( 'osswpackages' )
            // InternalPSWP.g:1789:1: 'osswpackages'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsswpackagesKeyword_3_3_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1802:1: rule__MPlatformSwPackage__Group_3_3__1 : rule__MPlatformSwPackage__Group_3_3__1__Impl rule__MPlatformSwPackage__Group_3_3__2 ;
    public final void rule__MPlatformSwPackage__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1806:1: ( rule__MPlatformSwPackage__Group_3_3__1__Impl rule__MPlatformSwPackage__Group_3_3__2 )
            // InternalPSWP.g:1807:2: rule__MPlatformSwPackage__Group_3_3__1__Impl rule__MPlatformSwPackage__Group_3_3__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MPlatformSwPackage__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1814:1: rule__MPlatformSwPackage__Group_3_3__1__Impl : ( ':=' ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1818:1: ( ( ':=' ) )
            // InternalPSWP.g:1819:1: ( ':=' )
            {
            // InternalPSWP.g:1819:1: ( ':=' )
            // InternalPSWP.g:1820:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_3_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1833:1: rule__MPlatformSwPackage__Group_3_3__2 : rule__MPlatformSwPackage__Group_3_3__2__Impl rule__MPlatformSwPackage__Group_3_3__3 ;
    public final void rule__MPlatformSwPackage__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1837:1: ( rule__MPlatformSwPackage__Group_3_3__2__Impl rule__MPlatformSwPackage__Group_3_3__3 )
            // InternalPSWP.g:1838:2: rule__MPlatformSwPackage__Group_3_3__2__Impl rule__MPlatformSwPackage__Group_3_3__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__MPlatformSwPackage__Group_3_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1845:1: rule__MPlatformSwPackage__Group_3_3__2__Impl : ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1849:1: ( ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 ) ) )
            // InternalPSWP.g:1850:1: ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 ) )
            {
            // InternalPSWP.g:1850:1: ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 ) )
            // InternalPSWP.g:1851:1: ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_2()); 
            }
            // InternalPSWP.g:1852:1: ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 )
            // InternalPSWP.g:1852:2: rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1862:1: rule__MPlatformSwPackage__Group_3_3__3 : rule__MPlatformSwPackage__Group_3_3__3__Impl rule__MPlatformSwPackage__Group_3_3__4 ;
    public final void rule__MPlatformSwPackage__Group_3_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1866:1: ( rule__MPlatformSwPackage__Group_3_3__3__Impl rule__MPlatformSwPackage__Group_3_3__4 )
            // InternalPSWP.g:1867:2: rule__MPlatformSwPackage__Group_3_3__3__Impl rule__MPlatformSwPackage__Group_3_3__4
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__MPlatformSwPackage__Group_3_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1874:1: rule__MPlatformSwPackage__Group_3_3__3__Impl : ( ( rule__MPlatformSwPackage__Group_3_3_3__0 )* ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1878:1: ( ( ( rule__MPlatformSwPackage__Group_3_3_3__0 )* ) )
            // InternalPSWP.g:1879:1: ( ( rule__MPlatformSwPackage__Group_3_3_3__0 )* )
            {
            // InternalPSWP.g:1879:1: ( ( rule__MPlatformSwPackage__Group_3_3_3__0 )* )
            // InternalPSWP.g:1880:1: ( rule__MPlatformSwPackage__Group_3_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3_3()); 
            }
            // InternalPSWP.g:1881:1: ( rule__MPlatformSwPackage__Group_3_3_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPSWP.g:1881:2: rule__MPlatformSwPackage__Group_3_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalPSWP.g:1891:1: rule__MPlatformSwPackage__Group_3_3__4 : rule__MPlatformSwPackage__Group_3_3__4__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1895:1: ( rule__MPlatformSwPackage__Group_3_3__4__Impl )
            // InternalPSWP.g:1896:2: rule__MPlatformSwPackage__Group_3_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1902:1: rule__MPlatformSwPackage__Group_3_3__4__Impl : ( ';' ) ;
    public final void rule__MPlatformSwPackage__Group_3_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1906:1: ( ( ';' ) )
            // InternalPSWP.g:1907:1: ( ';' )
            {
            // InternalPSWP.g:1907:1: ( ';' )
            // InternalPSWP.g:1908:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_3_4()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1931:1: rule__MPlatformSwPackage__Group_3_3_3__0 : rule__MPlatformSwPackage__Group_3_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3_3__1 ;
    public final void rule__MPlatformSwPackage__Group_3_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1935:1: ( rule__MPlatformSwPackage__Group_3_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3_3__1 )
            // InternalPSWP.g:1936:2: rule__MPlatformSwPackage__Group_3_3_3__0__Impl rule__MPlatformSwPackage__Group_3_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MPlatformSwPackage__Group_3_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1943:1: rule__MPlatformSwPackage__Group_3_3_3__0__Impl : ( ',' ) ;
    public final void rule__MPlatformSwPackage__Group_3_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1947:1: ( ( ',' ) )
            // InternalPSWP.g:1948:1: ( ',' )
            {
            // InternalPSWP.g:1948:1: ( ',' )
            // InternalPSWP.g:1949:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_3_3_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:1962:1: rule__MPlatformSwPackage__Group_3_3_3__1 : rule__MPlatformSwPackage__Group_3_3_3__1__Impl ;
    public final void rule__MPlatformSwPackage__Group_3_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1966:1: ( rule__MPlatformSwPackage__Group_3_3_3__1__Impl )
            // InternalPSWP.g:1967:2: rule__MPlatformSwPackage__Group_3_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1973:1: rule__MPlatformSwPackage__Group_3_3_3__1__Impl : ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 ) ) ;
    public final void rule__MPlatformSwPackage__Group_3_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:1977:1: ( ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 ) ) )
            // InternalPSWP.g:1978:1: ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 ) )
            {
            // InternalPSWP.g:1978:1: ( ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 ) )
            // InternalPSWP.g:1979:1: ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_3_1()); 
            }
            // InternalPSWP.g:1980:1: ( rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 )
            // InternalPSWP.g:1980:2: rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:1995:1: rule__MPlatformSwPackage__UnorderedGroup_3 : rule__MPlatformSwPackage__UnorderedGroup_3__0 {...}?;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
            
        try {
            // InternalPSWP.g:2000:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__0 {...}?)
            // InternalPSWP.g:2001:2: rule__MPlatformSwPackage__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2012:1: rule__MPlatformSwPackage__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalPSWP.g:2017:1: ( ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) ) ) )
            // InternalPSWP.g:2018:3: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) ) )
            {
            // InternalPSWP.g:2018:3: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                alt10=2;
            }
            else if ( LA10_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                alt10=3;
            }
            else if ( LA10_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
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
                    // InternalPSWP.g:2020:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) )
                    {
                    // InternalPSWP.g:2020:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) )
                    // InternalPSWP.g:2021:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MPlatformSwPackage__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalPSWP.g:2021:115: ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) )
                    // InternalPSWP.g:2022:6: ( ( rule__MPlatformSwPackage__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalPSWP.g:2028:6: ( ( rule__MPlatformSwPackage__Group_3_0__0 ) )
                    // InternalPSWP.g:2030:7: ( rule__MPlatformSwPackage__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_0()); 
                    }
                    // InternalPSWP.g:2031:7: ( rule__MPlatformSwPackage__Group_3_0__0 )
                    // InternalPSWP.g:2031:8: rule__MPlatformSwPackage__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalPSWP.g:2037:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) )
                    {
                    // InternalPSWP.g:2037:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) )
                    // InternalPSWP.g:2038:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MPlatformSwPackage__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalPSWP.g:2038:115: ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) )
                    // InternalPSWP.g:2039:6: ( ( rule__MPlatformSwPackage__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalPSWP.g:2045:6: ( ( rule__MPlatformSwPackage__Group_3_1__0 ) )
                    // InternalPSWP.g:2047:7: ( rule__MPlatformSwPackage__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_1()); 
                    }
                    // InternalPSWP.g:2048:7: ( rule__MPlatformSwPackage__Group_3_1__0 )
                    // InternalPSWP.g:2048:8: rule__MPlatformSwPackage__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalPSWP.g:2054:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) )
                    {
                    // InternalPSWP.g:2054:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) )
                    // InternalPSWP.g:2055:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MPlatformSwPackage__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalPSWP.g:2055:115: ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) )
                    // InternalPSWP.g:2056:6: ( ( rule__MPlatformSwPackage__Group_3_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // InternalPSWP.g:2062:6: ( ( rule__MPlatformSwPackage__Group_3_2__0 ) )
                    // InternalPSWP.g:2064:7: ( rule__MPlatformSwPackage__Group_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2()); 
                    }
                    // InternalPSWP.g:2065:7: ( rule__MPlatformSwPackage__Group_3_2__0 )
                    // InternalPSWP.g:2065:8: rule__MPlatformSwPackage__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalPSWP.g:2071:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) )
                    {
                    // InternalPSWP.g:2071:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) ) )
                    // InternalPSWP.g:2072:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__MPlatformSwPackage__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalPSWP.g:2072:115: ( ( ( rule__MPlatformSwPackage__Group_3_3__0 ) ) )
                    // InternalPSWP.g:2073:6: ( ( rule__MPlatformSwPackage__Group_3_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // InternalPSWP.g:2079:6: ( ( rule__MPlatformSwPackage__Group_3_3__0 ) )
                    // InternalPSWP.g:2081:7: ( rule__MPlatformSwPackage__Group_3_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3()); 
                    }
                    // InternalPSWP.g:2082:7: ( rule__MPlatformSwPackage__Group_3_3__0 )
                    // InternalPSWP.g:2082:8: rule__MPlatformSwPackage__Group_3_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2097:1: rule__MPlatformSwPackage__UnorderedGroup_3__0 : rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )? ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2101:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )? )
            // InternalPSWP.g:2102:2: rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__MPlatformSwPackage__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalPSWP.g:2103:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                alt11=1;
            }
            else if ( LA11_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPSWP.g:0:0: rule__MPlatformSwPackage__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2110:1: rule__MPlatformSwPackage__UnorderedGroup_3__1 : rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )? ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2114:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )? )
            // InternalPSWP.g:2115:2: rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__MPlatformSwPackage__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalPSWP.g:2116:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                alt12=1;
            }
            else if ( LA12_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPSWP.g:0:0: rule__MPlatformSwPackage__UnorderedGroup_3__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2123:1: rule__MPlatformSwPackage__UnorderedGroup_3__2 : rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )? ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2127:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )? )
            // InternalPSWP.g:2128:2: rule__MPlatformSwPackage__UnorderedGroup_3__Impl ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__MPlatformSwPackage__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalPSWP.g:2129:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPSWP.g:0:0: rule__MPlatformSwPackage__UnorderedGroup_3__3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2136:1: rule__MPlatformSwPackage__UnorderedGroup_3__3 : rule__MPlatformSwPackage__UnorderedGroup_3__Impl ;
    public final void rule__MPlatformSwPackage__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2140:1: ( rule__MPlatformSwPackage__UnorderedGroup_3__Impl )
            // InternalPSWP.g:2141:2: rule__MPlatformSwPackage__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2156:1: rule__MMESPPSWPPackageFile__PackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPPSWPPackageFile__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2160:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPSWP.g:2161:1: ( ( ruleQualifiedName ) )
            {
            // InternalPSWP.g:2161:1: ( ( ruleQualifiedName ) )
            // InternalPSWP.g:2162:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
            }
            // InternalPSWP.g:2163:1: ( ruleQualifiedName )
            // InternalPSWP.g:2164:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2175:1: rule__MMESPPSWPPackageFile__ImportsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MMESPPSWPPackageFile__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2179:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPSWP.g:2180:1: ( ( ruleQualifiedName ) )
            {
            // InternalPSWP.g:2180:1: ( ( ruleQualifiedName ) )
            // InternalPSWP.g:2181:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
            }
            // InternalPSWP.g:2182:1: ( ruleQualifiedName )
            // InternalPSWP.g:2183:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2194:1: rule__MMESPPSWPPackageFile__ElementAssignment_4 : ( ruleMMESPPSWPPackageElement ) ;
    public final void rule__MMESPPSWPPackageFile__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2198:1: ( ( ruleMMESPPSWPPackageElement ) )
            // InternalPSWP.g:2199:1: ( ruleMMESPPSWPPackageElement )
            {
            // InternalPSWP.g:2199:1: ( ruleMMESPPSWPPackageElement )
            // InternalPSWP.g:2200:1: ruleMMESPPSWPPackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMMESPPSWPPackageFileAccess().getElementMMESPPSWPPackageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2209:1: rule__MPlatformSwPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MPlatformSwPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2213:1: ( ( RULE_ID ) )
            // InternalPSWP.g:2214:1: ( RULE_ID )
            {
            // InternalPSWP.g:2214:1: ( RULE_ID )
            // InternalPSWP.g:2215:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPSWP.g:2224:1: rule__MPlatformSwPackage__VersionAssignment_3_0_2 : ( ruleVersion ) ;
    public final void rule__MPlatformSwPackage__VersionAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2228:1: ( ( ruleVersion ) )
            // InternalPSWP.g:2229:1: ( ruleVersion )
            {
            // InternalPSWP.g:2229:1: ( ruleVersion )
            // InternalPSWP.g:2230:1: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3"
    // InternalPSWP.g:2239:1: rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2243:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalPSWP.g:2244:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalPSWP.g:2244:1: ( ( ruleVersionedQualifiedName ) )
            // InternalPSWP.g:2245:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_3_0()); 
            }
            // InternalPSWP.g:2246:1: ( ruleVersionedQualifiedName )
            // InternalPSWP.g:2247:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3"


    // $ANTLR start "rule__MPlatformSwPackage__CtoolsAssignment_3_2_3"
    // InternalPSWP.g:2258:1: rule__MPlatformSwPackage__CtoolsAssignment_3_2_3 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__CtoolsAssignment_3_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2262:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalPSWP.g:2263:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalPSWP.g:2263:1: ( ( ruleVersionedQualifiedName ) )
            // InternalPSWP.g:2264:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_0()); 
            }
            // InternalPSWP.g:2265:1: ( ruleVersionedQualifiedName )
            // InternalPSWP.g:2266:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__CtoolsAssignment_3_2_3"


    // $ANTLR start "rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1"
    // InternalPSWP.g:2277:1: rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2281:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalPSWP.g:2282:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalPSWP.g:2282:1: ( ( ruleVersionedQualifiedName ) )
            // InternalPSWP.g:2283:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_4_1_0()); 
            }
            // InternalPSWP.g:2284:1: ( ruleVersionedQualifiedName )
            // InternalPSWP.g:2285:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_4_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1"


    // $ANTLR start "rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2"
    // InternalPSWP.g:2296:1: rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2300:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalPSWP.g:2301:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalPSWP.g:2301:1: ( ( ruleVersionedQualifiedName ) )
            // InternalPSWP.g:2302:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0()); 
            }
            // InternalPSWP.g:2303:1: ( ruleVersionedQualifiedName )
            // InternalPSWP.g:2304:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_2_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalPSWP.g:2315:1: rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPSWP.g:2319:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalPSWP.g:2320:1: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalPSWP.g:2320:1: ( ( ruleVersionedQualifiedName ) )
            // InternalPSWP.g:2321:1: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0()); 
            }
            // InternalPSWP.g:2322:1: ( ruleVersionedQualifiedName )
            // InternalPSWP.g:2323:1: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
        // InternalPSWP.g:2020:4: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) ) )
        // InternalPSWP.g:2020:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) )
        {
        // InternalPSWP.g:2020:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) ) )
        // InternalPSWP.g:2021:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalPSWP.g:2021:115: ( ( ( rule__MPlatformSwPackage__Group_3_0__0 ) ) )
        // InternalPSWP.g:2022:6: ( ( rule__MPlatformSwPackage__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0);
        // InternalPSWP.g:2028:6: ( ( rule__MPlatformSwPackage__Group_3_0__0 ) )
        // InternalPSWP.g:2030:7: ( rule__MPlatformSwPackage__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_0()); 
        }
        // InternalPSWP.g:2031:7: ( rule__MPlatformSwPackage__Group_3_0__0 )
        // InternalPSWP.g:2031:8: rule__MPlatformSwPackage__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
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
        // InternalPSWP.g:2037:4: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) ) )
        // InternalPSWP.g:2037:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) )
        {
        // InternalPSWP.g:2037:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) ) )
        // InternalPSWP.g:2038:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalPSWP.g:2038:115: ( ( ( rule__MPlatformSwPackage__Group_3_1__0 ) ) )
        // InternalPSWP.g:2039:6: ( ( rule__MPlatformSwPackage__Group_3_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1);
        // InternalPSWP.g:2045:6: ( ( rule__MPlatformSwPackage__Group_3_1__0 ) )
        // InternalPSWP.g:2047:7: ( rule__MPlatformSwPackage__Group_3_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_1()); 
        }
        // InternalPSWP.g:2048:7: ( rule__MPlatformSwPackage__Group_3_1__0 )
        // InternalPSWP.g:2048:8: rule__MPlatformSwPackage__Group_3_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
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
        // InternalPSWP.g:2054:4: ( ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) ) )
        // InternalPSWP.g:2054:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) )
        {
        // InternalPSWP.g:2054:4: ({...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) ) )
        // InternalPSWP.g:2055:5: {...}? => ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalPSWP", "getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2)");
        }
        // InternalPSWP.g:2055:115: ( ( ( rule__MPlatformSwPackage__Group_3_2__0 ) ) )
        // InternalPSWP.g:2056:6: ( ( rule__MPlatformSwPackage__Group_3_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2);
        // InternalPSWP.g:2062:6: ( ( rule__MPlatformSwPackage__Group_3_2__0 ) )
        // InternalPSWP.g:2064:7: ( rule__MPlatformSwPackage__Group_3_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2()); 
        }
        // InternalPSWP.g:2065:7: ( rule__MPlatformSwPackage__Group_3_2__0 )
        // InternalPSWP.g:2065:8: rule__MPlatformSwPackage__Group_3_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
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
        // InternalPSWP.g:2103:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__1 )
        // InternalPSWP.g:2103:2: rule__MPlatformSwPackage__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MPlatformSwPackage__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalPSWP

    // $ANTLR start synpred14_InternalPSWP
    public final void synpred14_InternalPSWP_fragment() throws RecognitionException {   
        // InternalPSWP.g:2116:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__2 )
        // InternalPSWP.g:2116:2: rule__MPlatformSwPackage__UnorderedGroup_3__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MPlatformSwPackage__UnorderedGroup_3__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalPSWP

    // $ANTLR start synpred15_InternalPSWP
    public final void synpred15_InternalPSWP_fragment() throws RecognitionException {   
        // InternalPSWP.g:2129:2: ( rule__MPlatformSwPackage__UnorderedGroup_3__3 )
        // InternalPSWP.g:2129:2: rule__MPlatformSwPackage__UnorderedGroup_3__3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MPlatformSwPackage__UnorderedGroup_3__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalPSWP

    // Delegated rules

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
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000009500000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004001000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000009500002L});
    }


}